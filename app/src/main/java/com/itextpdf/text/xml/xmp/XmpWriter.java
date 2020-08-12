package com.itextpdf.text.xml.xmp;

import com.itextpdf.text.Version;
import com.itextpdf.text.pdf.PdfDate;
import com.itextpdf.text.pdf.PdfDictionary;
import com.itextpdf.text.pdf.PdfName;
import com.itextpdf.text.pdf.PdfString;
import com.itextpdf.xmp.XMPConst;
import com.itextpdf.xmp.XMPException;
import com.itextpdf.xmp.XMPMeta;
import com.itextpdf.xmp.XMPMetaFactory;
import com.itextpdf.xmp.XMPUtils;
import com.itextpdf.xmp.options.PropertyOptions;
import com.itextpdf.xmp.options.SerializeOptions;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import java.util.Map.Entry;

public class XmpWriter {
    public static final String UTF16 = "UTF-16";
    public static final String UTF16BE = "UTF-16BE";
    public static final String UTF16LE = "UTF-16LE";
    public static final String UTF8 = "UTF-8";
    public OutputStream outputStream;
    public SerializeOptions serializeOptions;
    public XMPMeta xmpMeta;

    public XmpWriter(OutputStream outputStream2) {
        this(outputStream2, UTF8, 2000);
    }

    public XmpWriter(OutputStream outputStream2, PdfDictionary pdfDictionary) {
        this(outputStream2);
        if (pdfDictionary != null) {
            for (PdfName pdfName : pdfDictionary.getKeys()) {
                PdfString pdfString = pdfDictionary.get(pdfName);
                if (pdfString != null && pdfString.isString()) {
                    try {
                        addDocInfoProperty(pdfName, pdfString.toUnicodeString());
                    } catch (XMPException e) {
                        throw new IOException(e.getMessage());
                    }
                }
            }
        }
    }

    public XmpWriter(OutputStream outputStream2, String str, int i) {
        this.outputStream = outputStream2;
        this.serializeOptions = new SerializeOptions();
        if (UTF16BE.equals(str) || UTF16.equals(str)) {
            this.serializeOptions.setEncodeUTF16BE(true);
        } else if (UTF16LE.equals(str)) {
            this.serializeOptions.setEncodeUTF16LE(true);
        }
        this.serializeOptions.setPadding(i);
        this.xmpMeta = XMPMetaFactory.create();
        this.xmpMeta.setObjectName(XMPConst.TAG_XMPMETA);
        this.xmpMeta.setObjectName("");
        try {
            this.xmpMeta.setProperty("http://purl.org/dc/elements/1.1/", DublinCoreProperties.FORMAT, "application/pdf");
            this.xmpMeta.setProperty("http://ns.adobe.com/pdf/1.3/", PdfProperties.PRODUCER, Version.getInstance().getVersion());
        } catch (XMPException unused) {
        }
    }

    public XmpWriter(OutputStream outputStream2, Map<String, String> map) {
        this(outputStream2);
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (str2 != null) {
                    try {
                        addDocInfoProperty(str, str2);
                    } catch (XMPException e) {
                        throw new IOException(e.getMessage());
                    }
                }
            }
        }
    }

    public void addDocInfoProperty(Object obj, String str) {
        XMPMeta xMPMeta;
        String str2;
        String[] split;
        XMPMeta xMPMeta2;
        String str3;
        String str4;
        if (obj instanceof String) {
            obj = new PdfName((String) obj);
        }
        if (PdfName.TITLE.equals(obj)) {
            xMPMeta2 = this.xmpMeta;
            str3 = "http://purl.org/dc/elements/1.1/";
            str4 = "title";
        } else if (PdfName.AUTHOR.equals(obj)) {
            this.xmpMeta.appendArrayItem("http://purl.org/dc/elements/1.1/", DublinCoreProperties.CREATOR, new PropertyOptions(1024), str, null);
            return;
        } else if (PdfName.SUBJECT.equals(obj)) {
            xMPMeta2 = this.xmpMeta;
            str3 = "http://purl.org/dc/elements/1.1/";
            str4 = DublinCoreProperties.DESCRIPTION;
        } else {
            String str5 = "http://ns.adobe.com/pdf/1.3/";
            if (PdfName.KEYWORDS.equals(obj)) {
                for (String str6 : str.split(",|;")) {
                    if (str6.trim().length() > 0) {
                        this.xmpMeta.appendArrayItem("http://purl.org/dc/elements/1.1/", DublinCoreProperties.SUBJECT, new PropertyOptions(512), str6.trim(), null);
                    }
                }
                xMPMeta = this.xmpMeta;
                str2 = PdfProperties.KEYWORDS;
            } else if (PdfName.PRODUCER.equals(obj)) {
                xMPMeta = this.xmpMeta;
                str2 = PdfProperties.PRODUCER;
            } else {
                str5 = "http://ns.adobe.com/xap/1.0/";
                if (PdfName.CREATOR.equals(obj)) {
                    xMPMeta = this.xmpMeta;
                    str2 = XmpBasicProperties.CREATORTOOL;
                } else if (PdfName.CREATIONDATE.equals(obj)) {
                    xMPMeta = this.xmpMeta;
                    str = PdfDate.getW3CDate(str);
                    str2 = XmpBasicProperties.CREATEDATE;
                } else if (PdfName.MODDATE.equals(obj)) {
                    xMPMeta = this.xmpMeta;
                    str = PdfDate.getW3CDate(str);
                    str2 = XmpBasicProperties.MODIFYDATE;
                } else {
                    return;
                }
            }
            xMPMeta.setProperty(str5, str2, str);
            return;
        }
        xMPMeta2.setLocalizedText(str3, str4, "x-default", "x-default", str);
    }

    @Deprecated
    public void addRdfDescription(XmpSchema xmpSchema) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"><rdf:Description rdf:about=\"");
            sb.append(this.xmpMeta.getObjectName());
            sb.append("\" ");
            sb.append(xmpSchema.getXmlns());
            sb.append(">");
            sb.append(xmpSchema.toString());
            sb.append("</rdf:Description></rdf:RDF>\n");
            XMPUtils.appendProperties(XMPMetaFactory.parseFromString(sb.toString()), this.xmpMeta, true, true);
        } catch (XMPException e) {
            throw new IOException(e.getMessage());
        }
    }

    @Deprecated
    public void addRdfDescription(String str, String str2) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"><rdf:Description rdf:about=\"");
            sb.append(this.xmpMeta.getObjectName());
            sb.append("\" ");
            sb.append(str);
            sb.append(">");
            sb.append(str2);
            sb.append("</rdf:Description></rdf:RDF>\n");
            XMPUtils.appendProperties(XMPMetaFactory.parseFromString(sb.toString()), this.xmpMeta, true, true);
        } catch (XMPException e) {
            throw new IOException(e.getMessage());
        }
    }

    public void appendAlternateArrayItem(String str, String str2, String str3) {
        this.xmpMeta.appendArrayItem(str, str2, new PropertyOptions(2048), str3, null);
    }

    public void appendArrayItem(String str, String str2, String str3) {
        this.xmpMeta.appendArrayItem(str, str2, new PropertyOptions(512), str3, null);
    }

    public void appendOrderedArrayItem(String str, String str2, String str3) {
        this.xmpMeta.appendArrayItem(str, str2, new PropertyOptions(1024), str3, null);
    }

    public void close() {
        OutputStream outputStream2 = this.outputStream;
        if (outputStream2 != null) {
            try {
                XMPMetaFactory.serialize(this.xmpMeta, outputStream2, this.serializeOptions);
                this.outputStream = null;
            } catch (XMPException e) {
                throw new IOException(e.getMessage());
            }
        }
    }

    public XMPMeta getXmpMeta() {
        return this.xmpMeta;
    }

    public void serialize(OutputStream outputStream2) {
        XMPMetaFactory.serialize(this.xmpMeta, outputStream2, this.serializeOptions);
    }

    public void setAbout(String str) {
        this.xmpMeta.setObjectName(str);
    }

    public void setProperty(String str, String str2, Object obj) {
        this.xmpMeta.setProperty(str, str2, obj);
    }

    public void setReadOnly() {
        this.serializeOptions.setReadOnlyPacket(true);
    }
}
