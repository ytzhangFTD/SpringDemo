package com.ytzhang.test.htmlClean;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.htmlcleaner.CleanerProperties;
import org.htmlcleaner.DomSerializer;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.HtmlSerializer;
import org.htmlcleaner.JDomSerializer;
import org.htmlcleaner.SimpleHtmlSerializer;
import org.htmlcleaner.TagNode;

/**
 * <pre>
 *  类Test的实现描述：TODO 类实现描述
 *  wb-zhangyitong  2017/6/8 18:32
 * </pre>
 */
public class Test {
    public static void main(String[] args) throws IOException {
        //HtmlCleaner cleaner = new HtmlCleaner();
        //CleanerProperties props = cleaner.getProperties();
        //String htmlContent="<div>helllo world!<br>hello World2!</div>";
        //TagNode node = cleaner.clean(htmlContent);
        //ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
        //new SimpleHtmlSerializer(props).writeToStream(node,byteArrayOutputStream,"UTF-8");
        //InputStream inputStream=new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    }
}
