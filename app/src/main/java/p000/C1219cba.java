package p000;

import com.itextpdf.text.xml.xmp.XmpWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: cba reason: case insensitive filesystem */
public final class C1219cba {

    /* renamed from: a */
    public static final Pattern f1965a = Pattern.compile("\t");

    /* renamed from: b */
    public static final Pattern f1966b = Pattern.compile(" ");

    /* renamed from: c */
    public static final byte[] f1967c = new byte[0];

    /* renamed from: d */
    public static final String[] f1968d = {"LOG10", "ATAN2", "DAYS360", "SUMXMY2", "SUMX2MY2", "SUMX2PY2"};

    /* renamed from: e */
    public static final Set f1969e = new HashSet(Arrays.asList(f1968d));

    /* renamed from: a */
    public static C1222dba m1910a() {
        InputStream resourceAsStream = C1219cba.class.getResourceAsStream("functionMetadata.txt");
        if (resourceAsStream != null) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream, XmpWriter.UTF8));
                C1213aba aba = new C1213aba(400);
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            bufferedReader.close();
                            return aba.mo1879a();
                        } else if (readLine.length() >= 1) {
                            if (readLine.charAt(0) != '#') {
                                if (readLine.trim().length() >= 1) {
                                    m1911a(aba, readLine);
                                }
                            }
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            } catch (UnsupportedEncodingException e2) {
                throw new RuntimeException(e2);
            }
        } else {
            throw new RuntimeException("resource 'functionMetadata.txt' not found");
        }
    }

    /* renamed from: a */
    public static void m1911a(C1213aba aba, String str) {
        String[] split = f1965a.split(str, -2);
        if (split.length == 8) {
            int b = m1913b(split[0]);
            String str2 = split[1];
            int b2 = m1913b(split[2]);
            int b3 = m1913b(split[3]);
            byte e = m1916e(split[4]);
            byte[] d = m1915d(split[5]);
            boolean z = split[7].length() > 0;
            m1917f(str2);
            aba.mo1880a(b, str2, b2, b3, e, d, z);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bad line format '");
        sb.append(str);
        sb.append("' - expected 8 data fields");
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: a */
    public static boolean m1912a(String str) {
        return str.length() == 1 && str.charAt(0) == '-';
    }

    /* renamed from: b */
    public static int m1913b(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Value '");
            sb.append(str);
            sb.append("' could not be parsed as an integer");
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: c */
    public static byte m1914c(String str) {
        if (str.length() == 1) {
            char charAt = str.charAt(0);
            if (charAt == 'A') {
                return 64;
            }
            if (charAt == 'R') {
                return 0;
            }
            if (charAt == 'V') {
                return 32;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected operand type code '");
            sb.append(str);
            sb.append("' (");
            sb.append(str.charAt(0));
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Bad operand type code format '");
        sb2.append(str);
        sb2.append("' expected single char");
        throw new RuntimeException(sb2.toString());
    }

    /* renamed from: d */
    public static byte[] m1915d(String str) {
        if (str.length() < 1) {
            return f1967c;
        }
        if (m1912a(str)) {
            return f1967c;
        }
        String[] split = f1966b.split(str);
        int length = split.length;
        if ("...".equals(split[length - 1])) {
            length--;
        }
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = m1914c(split[i]);
        }
        return bArr;
    }

    /* renamed from: e */
    public static byte m1916e(String str) {
        if (str.length() == 0) {
            return 0;
        }
        return m1914c(str);
    }

    /* renamed from: f */
    public static void m1917f(String str) {
        int length = str.length() - 1;
        if (Character.isDigit(str.charAt(length))) {
            while (length >= 0 && Character.isDigit(str.charAt(length))) {
                length--;
            }
            if (!f1969e.contains(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid function name '");
                sb.append(str);
                sb.append("' (is footnote number incorrectly appended)");
                throw new RuntimeException(sb.toString());
            }
        }
    }
}
