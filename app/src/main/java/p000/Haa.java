package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: Haa */
public abstract class Haa {

    /* renamed from: a */
    public static final Haa[] f368a = new Haa[0];

    /* renamed from: b */
    public byte f369b = 0;

    /* renamed from: a */
    public static int m337a(Haa[] haaArr) {
        int i = 0;
        for (Haa c : haaArr) {
            i += c.mo80c();
        }
        return i;
    }

    /* renamed from: a */
    public static int m338a(Haa[] haaArr, byte[] bArr, int i) {
        fda fda = new fda(bArr, i);
        List list = null;
        for (Haa haa : haaArr) {
            haa.mo79a((jda) fda);
            if (haa instanceof C0591_Z) {
                if (list == null) {
                    list = new ArrayList(5);
                }
                list.add(haa);
            }
        }
        if (list != null) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((C0591_Z) list.get(i2)).mo1817b(fda);
            }
        }
        return fda.mo4400a() - i;
    }

    /* renamed from: a */
    public static Haa m339a(byte b, hda hda) {
        switch (b) {
            case 0:
                return new Xaa(b);
            case 1:
                return new C1239jaa(hda);
            case 2:
                return new Taa(hda);
            case 3:
                return C0403SZ.f1174c;
            case 4:
                return Saa.f1175c;
            case 5:
                return C1281xaa.f4129c;
            case 6:
                return C1230gaa.f3034c;
            case 7:
                return Gaa.f305c;
            case 8:
                return C1218caa.f1964c;
            case 9:
                return C1266saa.f3763c;
            case 10:
                return C1263raa.f3713c;
            case 11:
                return C1233haa.f3087c;
            case 12:
                return C1251naa.f3481c;
            case 13:
                return C1254oaa.f3564c;
            case 14:
                return Aaa.f42c;
            case 15:
                return C1260qaa.f3642c;
            case 16:
                return Waa.f1409c;
            case 17:
                return Iaa.f409c;
            case 18:
                return Vaa.f1363c;
            case 19:
                return Uaa.f1302c;
            case 20:
                return Faa.f266c;
            case 21:
                return Eaa.f237c;
            case 22:
                return C1278waa.f4057c;
            case 23:
                return new Raa(hda);
            case 25:
                return new C1212aaa(hda);
            case 28:
                return C1236iaa.m2842b(hda);
            case 29:
                return C1215baa.m1861b(hda);
            case 30:
                return new C1257paa(hda);
            case 31:
                return new Baa(hda);
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected base token id (");
                sb.append(b);
                sb.append(")");
                throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: a */
    public static Haa m340a(hda hda) {
        byte readByte = hda.readByte();
        if (readByte < 32) {
            return m339a(readByte, hda);
        }
        Haa b = m344b(readByte, hda);
        if (readByte >= 96) {
            b.mo357a(64);
        } else if (readByte >= 64) {
            b.mo357a(32);
        } else {
            b.mo357a(0);
        }
        return b;
    }

    /* renamed from: a */
    public static Haa[] m341a(int i, hda hda) {
        ArrayList arrayList = new ArrayList((i / 2) + 4);
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            Haa a = m340a(hda);
            if (a instanceof C0592a) {
                z = true;
            }
            i2 += a.mo80c();
            arrayList.add(a);
        }
        if (i2 != i) {
            throw new RuntimeException("Ptg array size mismatch");
        } else if (!z) {
            return m342a((List<Haa>) arrayList);
        } else {
            Haa[] a2 = m342a((List<Haa>) arrayList);
            for (int i3 = 0; i3 < a2.length; i3++) {
                if (a2[i3] instanceof C0592a) {
                    a2[i3] = ((C0592a) a2[i3]).mo1820b(hda);
                }
            }
            return a2;
        }
    }

    /* renamed from: a */
    public static Haa[] m342a(List<Haa> list) {
        if (list.isEmpty()) {
            return f368a;
        }
        Haa[] haaArr = new Haa[list.size()];
        list.toArray(haaArr);
        return haaArr;
    }

    /* renamed from: b */
    public static int m343b(Haa[] haaArr) {
        int i = 0;
        for (Haa haa : haaArr) {
            i = haa instanceof C0591_Z ? i + 8 : i + haa.mo80c();
        }
        return i;
    }

    /* renamed from: b */
    public static Haa m344b(byte b, hda hda) {
        byte b2 = (b & 31) | 32;
        switch (b2) {
            case 32:
                return new C0592a(hda);
            case 33:
                return C1245laa.m3005b(hda);
            case C0776fN.AppCompatTheme_alertDialogCenterButtons /*34*/:
                return C1248maa.m3106b(hda);
            case C0776fN.AppCompatTheme_alertDialogStyle /*35*/:
                return new C1284yaa(hda);
            case 36:
                return new Naa(hda);
            case C0776fN.AppCompatTheme_autoCompleteTextViewStyle /*37*/:
                return new C0539YZ(hda);
            case C0776fN.AppCompatTheme_borderlessButtonStyle /*38*/:
                return new C1269taa(hda);
            case C0776fN.AppCompatTheme_buttonBarButtonStyle /*39*/:
                return new C1272uaa(hda);
            default:
                switch (b2) {
                    case C0776fN.AppCompatTheme_buttonBarNeutralButtonStyle /*41*/:
                        return new C1275vaa(hda);
                    case C0776fN.AppCompatTheme_buttonBarPositiveButtonStyle /*42*/:
                        return new Laa(hda);
                    case C0776fN.AppCompatTheme_buttonBarStyle /*43*/:
                        return new C0470VZ(hda);
                    case C0776fN.AppCompatTheme_buttonStyle /*44*/:
                        return new Maa(hda);
                    case C0776fN.AppCompatTheme_buttonStyleSmall /*45*/:
                        return new C0512XZ(hda);
                    default:
                        switch (b2) {
                            case C0776fN.AppCompatTheme_colorSwitchThumbNormal /*57*/:
                                return new C1287zaa(hda);
                            case C0776fN.AppCompatTheme_controlBackground /*58*/:
                                return new Kaa(hda);
                            case C0776fN.AppCompatTheme_dialogCornerRadius /*59*/:
                                return new C0450UZ(hda);
                            case C0776fN.AppCompatTheme_dialogPreferredPadding /*60*/:
                                return new C1227faa(hda);
                            case C0776fN.AppCompatTheme_dialogTheme /*61*/:
                                return new C1224eaa(hda);
                            default:
                                StringBuilder sb = new StringBuilder();
                                sb.append(" Unknown Ptg in Formula: 0x");
                                sb.append(Integer.toHexString(b));
                                sb.append(" (");
                                sb.append(b);
                                sb.append(")");
                                throw new UnsupportedOperationException(sb.toString());
                        }
                }
        }
    }

    /* renamed from: a */
    public final byte mo356a() {
        return this.f369b;
    }

    /* renamed from: a */
    public final void mo357a(byte b) {
        if (!mo120d()) {
            this.f369b = b;
            return;
        }
        throw new RuntimeException("setClass should not be called on a base token");
    }

    /* renamed from: a */
    public abstract void mo79a(jda jda);

    /* renamed from: b */
    public final char mo358b() {
        if (mo120d()) {
            return '.';
        }
        byte b = this.f369b;
        if (b == 0) {
            return 'R';
        }
        if (b == 32) {
            return 'V';
        }
        if (b == 64) {
            return 'A';
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown operand class (");
        sb.append(this.f369b);
        sb.append(")");
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: c */
    public abstract int mo80c();

    /* renamed from: d */
    public abstract boolean mo120d();

    /* renamed from: e */
    public abstract String mo81e();

    public String toString() {
        return getClass().toString();
    }
}
