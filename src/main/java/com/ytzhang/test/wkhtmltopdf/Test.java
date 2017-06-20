package com.ytzhang.test.wkhtmltopdf;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.io.IOUtils;

import com.itextpdf.tool.xml.XMLWorkerFontProvider;

/**
 * Administrator 2017/4/22
 */
public class Test {
	//wkhtmltopdf在系统中的路径
	private static final String toPdfTool = "c:\\wkhtmltopdf.exe";
	private  class myFont extends XMLWorkerFontProvider{

	}

	public static void main(String[] args) {
//    	tahoma,arial,'Hiragino Sans GB','宋体',sans-serif
		String htmlContent = "<div align=\"center\" style=\"font:24px '宋体';color:#000;line-height:30px;margin-top:10px;\">\n"
				+ "    <strong>zyt-离阳法院</strong><br />\n"
				+ "    <strong>支付令</strong>\n"
				+ "</div>\n"
				+ "<p style=\"font-size:16px;margin:10px 0 0;text-align:right;\">2017-4-22-zyt-1</p>\n"
				+ "<div style=\"font:12px/1.5 tahoma,arial,'Hiragino Sans GB','宋体',sans-serif;margin:20px 0 0 10px;line-height:30px;word-wrap:break-word;word-break:break-all;white-space:normal;\">\n"
				+ "    <p style=\"text-indent:2em;\">申请人：毋晓杰，公民身份号码：511623199311060115，住1777777777777777777777777777，电子送达地址：邮箱jjj@163.com，手机号码：15088888888。</p>\n"
				+ "<p style=\"text-indent:2em;\">被申请人：测40027，男，1985年04月15日出生，汉，公民身份号码：412326198504156027，住杭州，电子送达地址：手机号码：13245678945。</p>\n"
				+ "\n"
				+ "    <p style=\"text-indent:2em;margin:0;\">申请人毋晓杰于2017年04月22日向本院申请支付令，述称：2017-04-22，申请人毋晓杰和被申请人测40027以数据电文方式签订了合同编号为1111111的电子商务合同。贷款用途为用途，逾期利息按照日利率0.50％计算。申请人毋晓杰向被申请人测40027发放贷款人民币合计280,054元。截止2015年12月12日，被申请人测40027尚欠贷款本金180,054元、逾期利息90,054元、手续费272,108元。经申请人毋晓杰催告，被申请人测40027未还款。为证明其主张的事实，毋晓杰向本院提供了催收记录.pdf、借呗合同.pdf、提前到期通知.pdf、账单.pdf、账务明细.pdf等证据予以佐证，请求被申请人测40027给付贷款本息合计人民币542,216元及后续利息。</p>\n"
				+ "    <p style=\"text-indent:2em;margin:0;\">本院经审查认为，申请人毋晓杰的申请符合《中华人民共和国诉讼法》第二百一十四条规定的条件，依照《中华人民共和国诉讼法》第二百一十六条的规定，特发出如下支付令：</p>\n"
				+ "    <p style=\"text-indent:2em;margin:0;\">测40027应当自收到本支付令之日起十五日内，支付毋晓杰贷款本息合计人民币542,216元（自2015年12月12日起的逾期利息以180,054元为基数按照日利率另行计算至实际清偿之日止）。本案申请费0.01元，由测40027承担。</p>\n"
				+ "    <p style=\"text-indent:2em;margin:0;\">测40027如有异议，应当自收到本支付令之日起十五日内向本院书面提出；逾期不提出书面异议，或提出的异议经本院审查不能成立的，本支付令即发生法律效力。</p>\n"
				+ "    <p style=\"text-align:right;margin:0;\"><span style=\"letter-spacing:10px;\">审判员</span>赵丹坪</p>\n"
				+ "    <p style=\"text-align:right;margin:0;\">2017年04月22日</p>\n"
				+ "    <p style=\"text-align:right;margin:0;\"><span style=\"letter-spacing:10px;\">书记员</span>黑和尚</p>\n"
				+ "</div>";



		String tempFilePath = "C:/Users/Administrator/Desktop/中文test.html";
		String filePath = "C:/Users/Administrator/Desktop/中文test.pdf";
		InputStream htmlInput = null;
		OutputStream htmlOut = null;
		try {
			htmlInput = new ByteArrayInputStream(htmlContent.getBytes("GBK"));
			htmlOut = new FileOutputStream(tempFilePath);
			IOUtils.copy(htmlInput, htmlOut);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			IOUtils.closeQuietly(htmlInput);
			IOUtils.closeQuietly(htmlOut);
		}
	}

	public static boolean convert(String srcPath, String destPath){
		File file = new File(destPath);
		File parent = file.getParentFile();
		//如果pdf保存路径不存在，则创建路径
		if(!parent.exists()){
			parent.mkdirs();
		}

		StringBuilder cmd = new StringBuilder();
		cmd.append(toPdfTool);
		cmd.append(" ");
		cmd.append(srcPath);
		cmd.append(" ");
		cmd.append(destPath);

		boolean result = true;
		try{
			Process proc = Runtime.getRuntime().exec(cmd.toString());
			HtmlToPdfInterceptor error = new HtmlToPdfInterceptor(proc.getErrorStream());
			HtmlToPdfInterceptor output = new HtmlToPdfInterceptor(proc.getInputStream());
			error.start();
			output.start();
			proc.waitFor();
		}catch(Exception e){
			result = false;
			e.printStackTrace();
		}

		return result;
	}
}
