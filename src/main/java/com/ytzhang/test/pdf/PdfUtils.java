package com.ytzhang.test.pdf;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.RectangleReadOnly;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerFontProvider;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.commons.lang3.StringUtils;
import org.htmlcleaner.CleanerProperties;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.SimpleHtmlSerializer;
import org.htmlcleaner.TagNode;
import sun.misc.BASE64Decoder;

/**
 * PDF生成工具类
 *
 * @author wb-zhangyitong
 * @version $Id: PdfUtils, v 0.1 2017/5/15 wb-zhangyitong Exp $
 */
public class PdfUtils {
    // pdf表格宽度，float[] 类型
    public static final String WIDTHS = "widths";
    // pdf页面大小，RectangleReadOnly 类型
    public static final String PAGESIZE = "pagesize";

    /**
     * 重写 字符设置方法，解决中文乱码问题
     *
     * @author wb-lailinjia 2016年11月9日 下午4:05:16
     */
    public static class MyFontsProvider extends XMLWorkerFontProvider {

        public MyFontsProvider() {
            super(null, null);
        }

        @Override
        public Font getFont(final String fontname, String encoding, float size, final int style) {
            BaseFont bf = null;
            try {
                bf = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
            } catch (Exception e) {
                //logger.error(String.format("字体获取失败！ FONT_NAME:%s", "STSong-Light"), e);
            }
            Font font = new Font(bf, size, style);
            return font;
        }
    }

    private PdfUtils() {
    }

    /**
     * 图片转PDF
     *
     * @param images
     * @return
     */
    public static InputStream image2Pdf(String[] images) {
        if (images == null || images.length == 0) {
            return null;
        }
        Document document = new Document();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PdfWriter pdfWriter = null;
        try {
            try {
                pdfWriter = PdfWriter.getInstance(document, byteArrayOutputStream);
            } catch (DocumentException e) {
                //logger.error("初始化PDF document时失败," + Arrays.asList(images), e);
            }
            pdfWriter.setStrictImageSequence(true);
            document.open();
            document.newPage();
            for (int i = 0; i < images.length; i++) {
                String image = images[i];
                try {
                    byte[] bytes = new BASE64Decoder().decodeBuffer(image);
                    Image jpg = Image.getInstance(bytes);
                    jpg.setAlignment(Image.ALIGN_CENTER);
                    float width = jpg.getWidth();
                    float height = jpg.getHeight();
                    Rectangle pageSize = document.getPageSize();
                    //页面宽度
                    float pageWidth = pageSize.getWidth();
                    //页面高度
                    float pageHeight = (pageSize.getHeight() - 100) / 2;
                    //图片原始比例
                    float imgV = height / width;
                    //图片高度与画布高度比例
                    float imgH = height / pageHeight;
                    //目标高度
                    float descHeight = 0;
                    float descWidth = 0;
                    if (height > pageHeight) {
                        descHeight = pageHeight;
                        descWidth = descHeight / imgV;
                        if (descWidth > pageWidth) {
                            descWidth = pageWidth;
                            descHeight = descWidth * imgV;
                        }
                    } else {
                        descHeight = height;
                        descWidth = height / imgV;
                        if (descWidth > pageWidth) {
                            descWidth = pageWidth;
                            descHeight = descWidth * imgV;
                        }
                    }
                    jpg.scaleAbsolute(descWidth, descHeight);
                    document.add(jpg);
                } catch (Exception e) {
                }
            }
        } finally {
            document.close();
        }

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        return byteArrayInputStream;
    }

    /**
     * 表格转PDF
     *
     * @param title
     * @param headers
     * @param paramsList
     * @return
     */
    public static InputStream table2Pdf(String title, String[] headers, List<String[]> paramsList) {
        if (headers == null || headers.length <= 0) {
            return null;
        }
        Document document = new Document();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            PdfWriter.getInstance(document, byteArrayOutputStream);
            BaseFont baseFontChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
            Font fontChinese = new Font(baseFontChinese, 11, Font.NORMAL);
            document.open();
            PdfPTable table = new PdfPTable(headers.length);
            if (StringUtils.isNotBlank(title)) {
                PdfPCell cell = new PdfPCell(new Phrase(title, fontChinese));
                cell.setColspan(headers.length);
                table.addCell(cell);
            }

            for (String header : headers) {
                table.addCell(new Phrase(header, fontChinese));
            }

            for (String[] params : paramsList) {
                for (String param : params) {
                    table.addCell(new Phrase(param, fontChinese));
                }
            }
            document.add(table);
        } catch (Exception e) {
            //logger.error("生成PDF表格失败," + Arrays.asList(headers), e);
            return null;
        } finally {
            document.close();
        }

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        return byteArrayInputStream;
    }
    public static InputStream table2Pdf(String title, String[] headers, List<String[]> paramsList, Map<String,Object> configMap)
        throws DocumentException, IOException {
        if (headers == null || headers.length <= 0) {
            return null;
        }
        float[] widths = null;
        Rectangle pageSize = null;
        if (MapUtils.isNotEmpty(configMap)) {
            if (configMap.get(WIDTHS) != null) {
                widths = (float[])configMap.get(WIDTHS);
            }
            if (configMap.get(PAGESIZE) != null) {
                RectangleReadOnly pagesize = (RectangleReadOnly)configMap.get(PAGESIZE);
                pageSize = new Rectangle(pagesize);
            }
        }

        Document document = new Document();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            if (pageSize!=null){
                document.setPageSize(pageSize);
            }
            PdfWriter.getInstance(document, byteArrayOutputStream);
            BaseFont baseFontChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
            Font fontChinese = new Font(baseFontChinese, 11, Font.NORMAL);
            document.open();
            PdfPTable table = new PdfPTable(headers.length);
            if (widths != null) {
                table.setWidths(widths);
            }
            if (StringUtils.isNotBlank(title)) {
                PdfPCell cell = new PdfPCell(new Phrase(title, fontChinese));
                cell.setColspan(headers.length);
                table.addCell(cell);
            }

            for (String header : headers) {
                table.addCell(new Phrase(header, fontChinese));
            }

            for (String[] params : paramsList) {
                for (String param : params) {
                    table.addCell(new Phrase(param, fontChinese));
                }
            }
            document.add(table);
        } finally {
            document.close();
        }

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        return byteArrayInputStream;
    }

    /**
     * html转pdf
     *
     * @param htmlContent
     * @return
     */
    public static InputStream html2Pdf(String htmlContent) {
        if (StringUtils.isBlank(htmlContent)) {
            return null;
        }
        ByteArrayOutputStream cleanHtml = cleanHtml(htmlContent);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Document document = new Document();
        try {
            InputStream htmlInput = new ByteArrayInputStream(cleanHtml.toByteArray());
            PdfWriter writer = PdfWriter.getInstance(document, byteArrayOutputStream);
            document.open();
            MyFontsProvider myFontsProvider = new MyFontsProvider();
            XMLWorkerHelper.getInstance().getDefaultCssResolver(true);
            XMLWorkerHelper.getInstance().parseXHtml(writer, document, htmlInput, null, Charset.forName("UTF-8"),
                myFontsProvider);
        } catch (Exception e) {
            //logger.error("生成PDF文档失败", e);
            return null;
        } finally {
            document.close();
        }

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        return byteArrayInputStream;
    }

    /**
     * 把传入的html格式整理成规范的格式
     * @param htmlContent
     * @return
     */
    private static ByteArrayOutputStream cleanHtml(String htmlContent){
        HtmlCleaner cleaner = new HtmlCleaner();
        CleanerProperties props = cleaner.getProperties();
        TagNode node = cleaner.clean(htmlContent);
        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
        try {
            new SimpleHtmlSerializer(props).writeToStream(node,byteArrayOutputStream,"UTF-8");
        } catch (IOException e) {
            //logger.error(String.format("cleanHtml 清理html格式时出错 htmlContent:%s", htmlContent), e);
        }
        return byteArrayOutputStream;
    }

    /**
     * 毫米转像素
     *
     * @param mm
     * @return
     */
    private static float mmTopx(float mm) {
        mm = (float) (mm * 3.33);
        return mm;
    }
}
