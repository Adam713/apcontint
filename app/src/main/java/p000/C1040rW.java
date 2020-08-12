package p000;

import com.itextpdf.text.pdf.qrcode.Encoder;
import com.itextpdf.text.xml.xmp.XmpWriter;
import com.itextpdf.xmp.impl.Base64;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* renamed from: rW */
public class C1040rW extends C1018qW {

    /* renamed from: i */
    public static boolean f3696i = false;

    /* renamed from: j */
    public static List f3697j;

    /* renamed from: k */
    public static final int[] f3698k = {0, 2, 3, 20, 5, 64, 30, 31, 71, 11};

    /* renamed from: a */
    public static int m3390a(OutputStream outputStream, long j, Object obj, int i) {
        int i2;
        int i3 = (int) j;
        if (i3 != 0) {
            if (i3 == 5) {
                i2 = C0930mW.m3081a(outputStream, ((Double) obj).doubleValue());
            } else if (i3 == 11) {
                return C0930mW.m3086b(outputStream, ((Boolean) obj).booleanValue() ? 1 : 0);
            } else {
                if (i3 == 20) {
                    C0930mW.m3083a(outputStream, ((Long) obj).longValue());
                    return 8;
                } else if (i3 == 64) {
                    long a = C0999pW.m3300a((Date) obj);
                    return C0930mW.m3086b(outputStream, ((long) ((int) (a & 4294967295L))) & 4294967295L) + 0 + C0930mW.m3086b(outputStream, ((long) ((int) ((a >> 32) & 4294967295L))) & 4294967295L);
                } else if (i3 == 71) {
                    byte[] bArr = (byte[]) obj;
                    outputStream.write(bArr);
                    return bArr.length;
                } else if (i3 == 2) {
                    C0930mW.m3085a(outputStream, ((Integer) obj).shortValue());
                    return 2;
                } else if (i3 != 3) {
                    if (i3 == 30) {
                        byte[] bytes = i == -1 ? ((String) obj).getBytes() : ((String) obj).getBytes(m3392a(i));
                        int b = C0930mW.m3086b(outputStream, (long) (bytes.length + 1));
                        byte[] bArr2 = new byte[(bytes.length + 1)];
                        System.arraycopy(bytes, 0, bArr2, 0, bytes.length);
                        bArr2[bArr2.length - 1] = 0;
                        outputStream.write(bArr2);
                        return b + bArr2.length;
                    } else if (i3 == 31) {
                        String str = (String) obj;
                        int b2 = C0930mW.m3086b(outputStream, (long) (str.length() + 1)) + 0;
                        char[] a2 = C0999pW.m3307a(str);
                        int i4 = b2;
                        for (int i5 = 0; i5 < a2.length; i5++) {
                            byte b3 = (byte) ((a2[i5] & 65280) >> 8);
                            outputStream.write((byte) (a2[i5] & 255));
                            outputStream.write(b3);
                            i4 += 2;
                        }
                        outputStream.write(0);
                        outputStream.write(0);
                        return i4 + 2;
                    } else if (obj instanceof byte[]) {
                        byte[] bArr3 = (byte[]) obj;
                        outputStream.write(bArr3);
                        int length = bArr3.length;
                        m3393a((C0975oW) new C1080tW(j, obj));
                        return length;
                    } else {
                        throw new C1080tW(j, obj);
                    }
                } else if (obj instanceof Integer) {
                    i2 = C0930mW.m3082a(outputStream, ((Integer) obj).intValue());
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Could not cast an object to ");
                    sb.append(Integer.class.toString());
                    sb.append(": ");
                    sb.append(obj.getClass().toString());
                    sb.append(", ");
                    sb.append(obj.toString());
                    throw new ClassCastException(sb.toString());
                }
            }
            return i2 + 0;
        }
        C0930mW.m3086b(outputStream, 0);
        return 4;
    }

    /* renamed from: a */
    public static Object m3391a(byte[] bArr, int i, int i2, long j, int i3) {
        Object obj;
        int i4;
        int i5 = i2 - 4;
        int i6 = (int) ((i3 == 1200 && j == 30) ? 31 : j);
        if (i6 == 0) {
            return null;
        }
        if (i6 == 5) {
            obj = new Double(dda.m2594a(bArr, i));
        } else if (i6 == 11) {
            return dda.m2604e(bArr, i) != 0 ? Boolean.TRUE : Boolean.FALSE;
        } else {
            if (i6 == 20) {
                return Long.valueOf(dda.m2602c(bArr, i));
            }
            if (i6 != 64) {
                int i7 = 0;
                if (i6 != 71) {
                    if (i6 == 2) {
                        i4 = dda.m2603d(bArr, i);
                    } else if (i6 == 3) {
                        i4 = dda.m2601b(bArr, i);
                    } else if (i6 == 30) {
                        int i8 = i + 4;
                        long j2 = (long) i8;
                        long e = dda.m2604e(bArr, i) + j2;
                        do {
                            e--;
                            if (bArr[(int) e] != 0) {
                                break;
                            }
                        } while (j2 <= e);
                        int i9 = (int) ((e - j2) + 1);
                        return i3 != -1 ? new String(bArr, i8, i9, m3392a(i3)) : new String(bArr, i8, i9);
                    } else if (i6 != 31) {
                        byte[] bArr2 = new byte[i5];
                        while (i7 < i5) {
                            bArr2[i7] = bArr[i + i7];
                            i7++;
                        }
                        throw new C0845iW(j, bArr2);
                    } else {
                        int i10 = i + 4;
                        long j3 = (long) i10;
                        long e2 = ((dda.m2604e(bArr, i) + j3) - 1) - j3;
                        StringBuffer stringBuffer = new StringBuffer((int) e2);
                        while (((long) i7) <= e2) {
                            int i11 = (i7 * 2) + i10;
                            stringBuffer.append((char) ((bArr[i11] & Base64.INVALID) | (bArr[i11 + 1] << 8)));
                            i7++;
                        }
                        while (stringBuffer.length() > 0 && stringBuffer.charAt(stringBuffer.length() - 1) == 0) {
                            stringBuffer.setLength(stringBuffer.length() - 1);
                        }
                        return stringBuffer.toString();
                    }
                    return Integer.valueOf(i4);
                }
                if (i5 < 0) {
                    i5 = dda.m2601b(bArr, i);
                    i += 4;
                }
                byte[] bArr3 = new byte[i5];
                System.arraycopy(bArr, i, bArr3, 0, bArr3.length);
                obj = bArr3;
            } else {
                return C0999pW.m3301a((int) dda.m2604e(bArr, i + 4), (int) dda.m2604e(bArr, i));
            }
        }
        return obj;
    }

    /* renamed from: a */
    public static String m3392a(int i) {
        if (i <= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Codepage number may not be ");
            sb.append(i);
            throw new UnsupportedEncodingException(sb.toString());
        } else if (i == 1200) {
            return XmpWriter.UTF16;
        } else {
            if (i == 1201) {
                return XmpWriter.UTF16BE;
            }
            if (i == 10081) {
                return "MacTurkish";
            }
            if (i == 10082) {
                return "MacCroatian";
            }
            String str = "EUC-KR";
            String str2 = "SJIS";
            switch (i) {
                case C0776fN.AppCompatTheme_autoCompleteTextViewStyle /*37*/:
                    return "cp037";
                case 932:
                    return str2;
                case 936:
                    return "GBK";
                case 949:
                    return "ms949";
                case 1361:
                    return "johab";
                case 10010:
                    return "MacRomania";
                case 10017:
                    return "MacUkraine";
                case 10021:
                    return "MacThai";
                case 10029:
                    return "MacCentralEurope";
                case 10079:
                    return "MacIceland";
                case 20127:
                    break;
                case 20866:
                    return "KOI8-R";
                case 50225:
                    return "ISO-2022-KR";
                case 51932:
                    return "EUC-JP";
                case 51949:
                    return str;
                case 52936:
                    return "GB2312";
                case 54936:
                    return "GB18030";
                default:
                    switch (i) {
                        case 1250:
                            return "windows-1250";
                        case 1251:
                            return "windows-1251";
                        case 1252:
                            return "windows-1252";
                        case 1253:
                            return "windows-1253";
                        case 1254:
                            return "windows-1254";
                        case 1255:
                            return "windows-1255";
                        case 1256:
                            return "windows-1256";
                        case 1257:
                            return "windows-1257";
                        case 1258:
                            return "windows-1258";
                        default:
                            switch (i) {
                                case 10000:
                                    return "MacRoman";
                                case 10001:
                                    return str2;
                                case 10002:
                                    return "Big5";
                                case 10003:
                                    return str;
                                case 10004:
                                    return "MacArabic";
                                case 10005:
                                    return "MacHebrew";
                                case 10006:
                                    return "MacGreek";
                                case 10007:
                                    return "MacCyrillic";
                                case 10008:
                                    return "EUC_CN";
                                default:
                                    switch (i) {
                                        case 28591:
                                            return Encoder.DEFAULT_BYTE_MODE_ENCODING;
                                        case 28592:
                                            return "ISO-8859-2";
                                        case 28593:
                                            return "ISO-8859-3";
                                        case 28594:
                                            return "ISO-8859-4";
                                        case 28595:
                                            return "ISO-8859-5";
                                        case 28596:
                                            return "ISO-8859-6";
                                        case 28597:
                                            return "ISO-8859-7";
                                        case 28598:
                                            return "ISO-8859-8";
                                        case 28599:
                                            return "ISO-8859-9";
                                        default:
                                            switch (i) {
                                                case 50220:
                                                case 50221:
                                                case 50222:
                                                    return "ISO-2022-JP";
                                                default:
                                                    switch (i) {
                                                        case 65000:
                                                            break;
                                                        case 65001:
                                                            return XmpWriter.UTF8;
                                                        default:
                                                            StringBuilder sb2 = new StringBuilder();
                                                            sb2.append("cp");
                                                            sb2.append(i);
                                                            return sb2.toString();
                                                    }
                                            }
                                    }
                            }
                    }
            }
            return "US-ASCII";
        }
    }

    /* renamed from: a */
    public static void m3393a(C0975oW oWVar) {
        if (m3394a()) {
            if (f3697j == null) {
                f3697j = new LinkedList();
            }
            Long valueOf = Long.valueOf(oWVar.mo5101b());
            if (!f3697j.contains(valueOf)) {
                System.err.println(oWVar.getMessage());
                f3697j.add(valueOf);
            }
        }
    }

    /* renamed from: a */
    public static boolean m3394a() {
        return f3696i;
    }
}
