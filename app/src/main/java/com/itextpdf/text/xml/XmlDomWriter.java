package com.itextpdf.text.xml;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import org.w3c.dom.Attr;
import org.w3c.dom.NamedNodeMap;

public class XmlDomWriter {
    public boolean fCanonical;
    public PrintWriter fOut;
    public boolean fXML11;

    public XmlDomWriter() {
    }

    public XmlDomWriter(boolean z) {
        this.fCanonical = z;
    }

    public void normalizeAndPrint(char c, boolean z) {
        PrintWriter printWriter;
        String str;
        if (c == 10) {
            if (this.fCanonical) {
                printWriter = this.fOut;
                str = "&#xA;";
            }
            if (this.fXML11) {
            }
            this.fOut.print(c);
            return;
        } else if (c == 13) {
            printWriter = this.fOut;
            str = "&#xD;";
        } else if (c != '\"') {
            if (c == '&') {
                printWriter = this.fOut;
                str = "&amp;";
            } else if (c != '<') {
                if (c == '>') {
                    printWriter = this.fOut;
                    str = "&gt;";
                }
                if ((this.fXML11 || ((c < 1 || c > 31 || c == 9 || c == 10) && ((c < 127 || c > 159) && c != 8232))) && (!z || !(c == 9 || c == 10))) {
                    this.fOut.print(c);
                    return;
                }
                this.fOut.print("&#x");
                this.fOut.print(Integer.toHexString(c).toUpperCase());
                printWriter = this.fOut;
                str = ";";
            } else {
                printWriter = this.fOut;
                str = "&lt;";
            }
        } else if (z) {
            printWriter = this.fOut;
            str = "&quot;";
        } else {
            printWriter = this.fOut;
            str = "\"";
        }
        printWriter.print(str);
    }

    public void normalizeAndPrint(String str, boolean z) {
        int length = str != null ? str.length() : 0;
        for (int i = 0; i < length; i++) {
            normalizeAndPrint(str.charAt(i), z);
        }
    }

    public void setCanonical(boolean z) {
        this.fCanonical = z;
    }

    public void setOutput(OutputStream outputStream, String str) {
        if (str == null) {
            str = "UTF8";
        }
        this.fOut = new PrintWriter(new OutputStreamWriter(outputStream, str));
    }

    public void setOutput(Writer writer) {
        this.fOut = writer instanceof PrintWriter ? (PrintWriter) writer : new PrintWriter(writer);
    }

    public Attr[] sortAttributes(NamedNodeMap namedNodeMap) {
        int i = 0;
        int length = namedNodeMap != null ? namedNodeMap.getLength() : 0;
        Attr[] attrArr = new Attr[length];
        for (int i2 = 0; i2 < length; i2++) {
            attrArr[i2] = (Attr) namedNodeMap.item(i2);
        }
        while (i < length - 1) {
            int i3 = i + 1;
            String nodeName = attrArr[i].getNodeName();
            int i4 = i;
            for (int i5 = i3; i5 < length; i5++) {
                String nodeName2 = attrArr[i5].getNodeName();
                if (nodeName2.compareTo(nodeName) < 0) {
                    i4 = i5;
                    nodeName = nodeName2;
                }
            }
            if (i4 != i) {
                Attr attr = attrArr[i];
                attrArr[i] = attrArr[i4];
                attrArr[i4] = attr;
            }
            i = i3;
        }
        return attrArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ef, code lost:
        r1.print(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0137, code lost:
        normalizeAndPrint(r10.getNodeValue(), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x013e, code lost:
        r9.fOut.flush();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x019f, code lost:
        if (r0 != 1) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01a1, code lost:
        r9.fOut.print("</");
        r9.fOut.print(r10.getNodeName());
        r9.fOut.print('>');
        r9.fOut.flush();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01bb, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void write(org.w3c.dom.Node r10) {
        /*
            r9 = this;
            if (r10 != 0) goto L_0x0003
            return
        L_0x0003:
            short r0 = r10.getNodeType()
            r1 = 32
            r2 = 62
            r3 = 1
            r4 = 0
            switch(r0) {
                case 1: goto L_0x0144;
                case 2: goto L_0x0010;
                case 3: goto L_0x0137;
                case 4: goto L_0x011d;
                case 5: goto L_0x00f3;
                case 6: goto L_0x0010;
                case 7: goto L_0x00c5;
                case 8: goto L_0x00a4;
                case 9: goto L_0x0076;
                case 10: goto L_0x0012;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x019f
        L_0x0012:
            r1 = r10
            org.w3c.dom.DocumentType r1 = (org.w3c.dom.DocumentType) r1
            java.io.PrintWriter r4 = r9.fOut
            java.lang.String r5 = "<!DOCTYPE "
            r4.print(r5)
            java.io.PrintWriter r4 = r9.fOut
            java.lang.String r5 = r1.getName()
            r4.print(r5)
            java.lang.String r4 = r1.getPublicId()
            java.lang.String r5 = r1.getSystemId()
            r6 = 39
            if (r4 == 0) goto L_0x004f
            java.io.PrintWriter r7 = r9.fOut
            java.lang.String r8 = " PUBLIC '"
            r7.print(r8)
            java.io.PrintWriter r7 = r9.fOut
            r7.print(r4)
            java.io.PrintWriter r4 = r9.fOut
            java.lang.String r7 = "' '"
        L_0x0041:
            r4.print(r7)
            java.io.PrintWriter r4 = r9.fOut
            r4.print(r5)
            java.io.PrintWriter r4 = r9.fOut
            r4.print(r6)
            goto L_0x0056
        L_0x004f:
            if (r5 == 0) goto L_0x0056
            java.io.PrintWriter r4 = r9.fOut
            java.lang.String r7 = " SYSTEM '"
            goto L_0x0041
        L_0x0056:
            java.lang.String r1 = r1.getInternalSubset()
            if (r1 == 0) goto L_0x006f
            java.io.PrintWriter r4 = r9.fOut
            java.lang.String r5 = " ["
            r4.println(r5)
            java.io.PrintWriter r4 = r9.fOut
            r4.print(r1)
            java.io.PrintWriter r1 = r9.fOut
            r4 = 93
            r1.print(r4)
        L_0x006f:
            java.io.PrintWriter r1 = r9.fOut
            r1.println(r2)
            goto L_0x019f
        L_0x0076:
            r1 = r10
            org.w3c.dom.Document r1 = (org.w3c.dom.Document) r1
            r9.fXML11 = r4
            boolean r4 = r9.fCanonical
            if (r4 != 0) goto L_0x009b
            boolean r4 = r9.fXML11
            if (r4 == 0) goto L_0x0088
            java.io.PrintWriter r4 = r9.fOut
            java.lang.String r5 = "<?xml version=\"1.1\" encoding=\"UTF-8\"?>"
            goto L_0x008c
        L_0x0088:
            java.io.PrintWriter r4 = r9.fOut
            java.lang.String r5 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
        L_0x008c:
            r4.println(r5)
            java.io.PrintWriter r4 = r9.fOut
            r4.flush()
            org.w3c.dom.DocumentType r4 = r1.getDoctype()
            r9.write(r4)
        L_0x009b:
            org.w3c.dom.Element r1 = r1.getDocumentElement()
            r9.write(r1)
            goto L_0x019f
        L_0x00a4:
            boolean r1 = r9.fCanonical
            if (r1 != 0) goto L_0x019f
            java.io.PrintWriter r1 = r9.fOut
            java.lang.String r4 = "<!--"
            r1.print(r4)
            java.lang.String r1 = r10.getNodeValue()
            if (r1 == 0) goto L_0x00c0
            int r4 = r1.length()
            if (r4 <= 0) goto L_0x00c0
            java.io.PrintWriter r4 = r9.fOut
            r4.print(r1)
        L_0x00c0:
            java.io.PrintWriter r1 = r9.fOut
            java.lang.String r4 = "-->"
            goto L_0x00ef
        L_0x00c5:
            java.io.PrintWriter r4 = r9.fOut
            java.lang.String r5 = "<?"
            r4.print(r5)
            java.io.PrintWriter r4 = r9.fOut
            java.lang.String r5 = r10.getNodeName()
            r4.print(r5)
            java.lang.String r4 = r10.getNodeValue()
            if (r4 == 0) goto L_0x00eb
            int r5 = r4.length()
            if (r5 <= 0) goto L_0x00eb
            java.io.PrintWriter r5 = r9.fOut
            r5.print(r1)
            java.io.PrintWriter r1 = r9.fOut
            r1.print(r4)
        L_0x00eb:
            java.io.PrintWriter r1 = r9.fOut
            java.lang.String r4 = "?>"
        L_0x00ef:
            r1.print(r4)
            goto L_0x013e
        L_0x00f3:
            boolean r1 = r9.fCanonical
            if (r1 == 0) goto L_0x0105
            org.w3c.dom.Node r1 = r10.getFirstChild()
        L_0x00fb:
            if (r1 == 0) goto L_0x019f
            r9.write(r1)
            org.w3c.dom.Node r1 = r1.getNextSibling()
            goto L_0x00fb
        L_0x0105:
            java.io.PrintWriter r1 = r9.fOut
            r4 = 38
            r1.print(r4)
            java.io.PrintWriter r1 = r9.fOut
            java.lang.String r4 = r10.getNodeName()
            r1.print(r4)
            java.io.PrintWriter r1 = r9.fOut
            r4 = 59
            r1.print(r4)
            goto L_0x013e
        L_0x011d:
            boolean r1 = r9.fCanonical
            if (r1 == 0) goto L_0x0122
            goto L_0x0137
        L_0x0122:
            java.io.PrintWriter r1 = r9.fOut
            java.lang.String r4 = "<![CDATA["
            r1.print(r4)
            java.io.PrintWriter r1 = r9.fOut
            java.lang.String r4 = r10.getNodeValue()
            r1.print(r4)
            java.io.PrintWriter r1 = r9.fOut
            java.lang.String r4 = "]]>"
            goto L_0x00ef
        L_0x0137:
            java.lang.String r1 = r10.getNodeValue()
            r9.normalizeAndPrint(r1, r4)
        L_0x013e:
            java.io.PrintWriter r1 = r9.fOut
            r1.flush()
            goto L_0x019f
        L_0x0144:
            java.io.PrintWriter r5 = r9.fOut
            r6 = 60
            r5.print(r6)
            java.io.PrintWriter r5 = r9.fOut
            java.lang.String r6 = r10.getNodeName()
            r5.print(r6)
            org.w3c.dom.NamedNodeMap r5 = r10.getAttributes()
            org.w3c.dom.Attr[] r5 = r9.sortAttributes(r5)
        L_0x015c:
            int r6 = r5.length
            if (r4 >= r6) goto L_0x0187
            r6 = r5[r4]
            java.io.PrintWriter r7 = r9.fOut
            r7.print(r1)
            java.io.PrintWriter r7 = r9.fOut
            java.lang.String r8 = r6.getNodeName()
            r7.print(r8)
            java.io.PrintWriter r7 = r9.fOut
            java.lang.String r8 = "=\""
            r7.print(r8)
            java.lang.String r6 = r6.getNodeValue()
            r9.normalizeAndPrint(r6, r3)
            java.io.PrintWriter r6 = r9.fOut
            r7 = 34
            r6.print(r7)
            int r4 = r4 + 1
            goto L_0x015c
        L_0x0187:
            java.io.PrintWriter r1 = r9.fOut
            r1.print(r2)
            java.io.PrintWriter r1 = r9.fOut
            r1.flush()
            org.w3c.dom.Node r1 = r10.getFirstChild()
        L_0x0195:
            if (r1 == 0) goto L_0x019f
            r9.write(r1)
            org.w3c.dom.Node r1 = r1.getNextSibling()
            goto L_0x0195
        L_0x019f:
            if (r0 != r3) goto L_0x01bb
            java.io.PrintWriter r0 = r9.fOut
            java.lang.String r1 = "</"
            r0.print(r1)
            java.io.PrintWriter r0 = r9.fOut
            java.lang.String r10 = r10.getNodeName()
            r0.print(r10)
            java.io.PrintWriter r10 = r9.fOut
            r10.print(r2)
            java.io.PrintWriter r10 = r9.fOut
            r10.flush()
        L_0x01bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.itextpdf.text.xml.XmlDomWriter.write(org.w3c.dom.Node):void");
    }
}
