package com.itextpdf.text.xml.xmp;

import com.itextpdf.text.xml.XMLUtil;
import java.util.Enumeration;
import java.util.Properties;

@Deprecated
public abstract class XmpSchema extends Properties {
    public static final long serialVersionUID = -176374295948945272L;
    public String xmlns;

    public XmpSchema(String str) {
        this.xmlns = str;
    }

    public static String escape(String str) {
        return XMLUtil.escapeXML(str, false);
    }

    public Object addProperty(String str, String str2) {
        return setProperty(str, str2);
    }

    public String getXmlns() {
        return this.xmlns;
    }

    public void process(StringBuffer stringBuffer, Object obj) {
        stringBuffer.append('<');
        stringBuffer.append(obj);
        stringBuffer.append('>');
        stringBuffer.append(get(obj));
        stringBuffer.append("</");
        stringBuffer.append(obj);
        stringBuffer.append('>');
    }

    public Object setProperty(String str, LangAlt langAlt) {
        return super.setProperty(str, langAlt.toString());
    }

    public Object setProperty(String str, XmpArray xmpArray) {
        return super.setProperty(str, xmpArray.toString());
    }

    public Object setProperty(String str, String str2) {
        return super.setProperty(str, XMLUtil.escapeXML(str2, false));
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Enumeration propertyNames = propertyNames();
        while (propertyNames.hasMoreElements()) {
            process(stringBuffer, propertyNames.nextElement());
        }
        return stringBuffer.toString();
    }
}
