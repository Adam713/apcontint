package com.itextpdf.text.xml;

import com.itextpdf.text.xml.simpleparser.SimpleXMLDocHandler;
import com.itextpdf.text.xml.simpleparser.SimpleXMLParser;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

public class XmlToTxt implements SimpleXMLDocHandler {
    public StringBuffer buf = new StringBuffer();

    public static String parse(InputStream inputStream) {
        XmlToTxt xmlToTxt = new XmlToTxt();
        SimpleXMLParser.parse(xmlToTxt, null, new InputStreamReader(inputStream), true);
        return xmlToTxt.toString();
    }

    public void endDocument() {
    }

    public void endElement(String str) {
    }

    public void startDocument() {
    }

    public void startElement(String str, Map<String, String> map) {
    }

    public void text(String str) {
        this.buf.append(str);
    }

    public String toString() {
        return this.buf.toString();
    }
}
