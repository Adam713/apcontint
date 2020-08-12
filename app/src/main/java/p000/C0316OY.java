package p000;

/* renamed from: OY */
public final class C0316OY extends C0080DY {

    /* renamed from: a */
    public int f905a;

    /* renamed from: b */
    public byte[] f906b;

    public C0316OY(C1020qY qYVar) {
        this.f905a = qYVar.mo5034c();
        this.f906b = qYVar.mo5039h();
    }

    /* renamed from: a */
    public static String m966a(int i) {
        String str = "SHAPEPROPSSTREAM";
        switch (i) {
            case C0776fN.AppCompatTheme_colorControlActivated /*51*/:
                return "PRINTSIZE";
            case C0776fN.AppCompatTheme_listPreferredItemHeightSmall /*77*/:
                return "PLS";
            case C0776fN.AppCompatTheme_panelBackground /*80*/:
                return "DCON";
            case 127:
                return "IMDATA";
            case 129:
                return "SHEETPR";
            case 144:
                return "SORT";
            case 148:
                return "LHRECORD";
            case 153:
                return "STANDARDWIDTH";
            case 160:
                return "SCL";
            case 174:
                return "SCENMAN";
            case 178:
                return "SXVI";
            case 180:
                return "SXIVD";
            case 181:
                return "SXLI";
            case 211:
                return "OBPROJ";
            case 220:
                return "PARAMQRY";
            case 222:
                return "OLESIZE";
            case 233:
                return "BITMAP";
            case 239:
                return "PHONETICPR";
            case 241:
                return "SXEX";
            case 351:
                return "LABELRANGES";
            case 425:
                return "USERBVIEW";
            case 429:
                return "QSI";
            case 442:
                return "CODENAME";
            case 448:
                return "EXCEL9FILE";
            case 2048:
                return "QUICKTIP";
            case 2050:
                return "QSISXTAG";
            case 2051:
                return "DBQUERYEXT";
            case 2053:
                return "TXTQUERY";
            case 2064:
                return "SXVIEWEX9";
            case 2066:
                return "CONTINUEFRT";
            case 2146:
                return "SHEETEXT";
            case 2147:
                return "BOOKEXT";
            case 2148:
                return "SXADDL";
            case 2151:
                return "SHEETPROTECTION";
            case 2155:
                return "DATALABEXTCONTENTS";
            case 2156:
                return "CELLWATCH";
            case 2164:
                return "DROPDOWNOBJIDS";
            case 2166:
                return "DCONN";
            case 2171:
                return "CFEX";
            case 2172:
                return "XFCRC";
            case 2173:
                return "XFEXT";
            case 2175:
                return "CONTINUEFRT12";
            case 2187:
                return "PLV";
            case 2188:
                return "COMPAT12";
            case 2189:
                return "DXF";
            case 2194:
                return "STYLEEXT";
            case 2198:
                return "THEME";
            case 2199:
                return "GUIDTYPELIB";
            case 2202:
                return "MTRSETTINGS";
            case 2203:
                return "COMPRESSPICTURES";
            case 2204:
                return "HEADERFOOTER";
            case 2209:
                return str;
            case 2211:
                return "FORCEFULLCALCULATION";
            case 2212:
                return str;
            case 2213:
                return "TEXTPROPSSTREAM";
            case 2214:
                return "RICHTEXTSTREAM";
            case 2248:
                return "PLV{Mac Excel}";
            default:
                if (!m967b(i)) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("UNKNOWN-");
                sb.append(Integer.toHexString(i).toUpperCase());
                return sb.toString();
        }
    }

    /* renamed from: b */
    public static boolean m967b(int i) {
        if (!(i == 51 || i == 52 || i == 2205 || i == 2206 || i == 4102 || i == 4103 || i == 4170 || i == 4171)) {
            switch (i) {
                case 445:
                case 450:
                case 2215:
                case 4097:
                case 4116:
                case 4125:
                case 4126:
                case 4127:
                case 4128:
                case 4129:
                case 4130:
                case 4154:
                case 4161:
                case 4174:
                case 4175:
                case 4177:
                case 4188:
                case 4189:
                case 4191:
                case 4192:
                case 4194:
                case 4195:
                case 4196:
                case 4197:
                case 4198:
                    break;
                default:
                    switch (i) {
                        case 4105:
                        case 4106:
                        case 4107:
                        case 4108:
                            break;
                        default:
                            switch (i) {
                                case 4119:
                                case 4120:
                                case 4121:
                                case 4122:
                                case 4123:
                                    break;
                                default:
                                    switch (i) {
                                        case 4132:
                                        case 4133:
                                        case 4134:
                                        case 4135:
                                            break;
                                        default:
                                            switch (i) {
                                                case 4146:
                                                case 4147:
                                                case 4148:
                                                case 4149:
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 4163:
                                                        case 4164:
                                                        case 4165:
                                                        case 4166:
                                                            break;
                                                        default:
                                                            return false;
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }
        return true;
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.write(this.f906b);
    }

    public Object clone() {
        return this;
    }

    /* renamed from: e */
    public short mo34e() {
        return (short) this.f905a;
    }

    /* renamed from: g */
    public int mo36g() {
        return this.f906b.length;
    }

    public String toString() {
        String a = m966a(this.f905a);
        if (a == null) {
            a = "UNKNOWNRECORD";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        stringBuffer.append(a);
        stringBuffer.append("] (0x");
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(this.f905a).toUpperCase());
        sb.append(")\n");
        stringBuffer.append(sb.toString());
        if (this.f906b.length > 0) {
            stringBuffer.append("  rawData=");
            stringBuffer.append(Yca.m1594a(this.f906b));
            stringBuffer.append("\n");
        }
        stringBuffer.append("[/");
        stringBuffer.append(a);
        stringBuffer.append("]\n");
        return stringBuffer.toString();
    }
}
