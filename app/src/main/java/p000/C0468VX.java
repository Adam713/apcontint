package p000;

/* renamed from: VX */
public final class C0468VX extends C0080DY {

    /* renamed from: a */
    public short f1334a;

    /* renamed from: b */
    public byte f1335b;

    /* renamed from: c */
    public short f1336c;

    /* renamed from: d */
    public int f1337d;

    /* renamed from: e */
    public boolean f1338e;

    /* renamed from: f */
    public byte f1339f;

    /* renamed from: g */
    public String f1340g;

    /* renamed from: h */
    public C1256oca f1341h = C1256oca.m3285a(Haa.f368a);

    /* renamed from: i */
    public String f1342i;

    /* renamed from: j */
    public String f1343j;

    /* renamed from: k */
    public String f1344k;

    /* renamed from: l */
    public String f1345l;

    public C0468VX() {
        String str = "";
        this.f1340g = str;
        this.f1342i = str;
        this.f1343j = str;
        this.f1344k = str;
        this.f1345l = str;
    }

    /* renamed from: a */
    public static String m1300a(byte b) {
        switch (b) {
            case 1:
                return "Consolidate_Area";
            case 2:
                return "Auto_Open";
            case 3:
                return "Auto_Close";
            case 4:
                return "Database";
            case 5:
                return "Criteria";
            case 6:
                return "Print_Area";
            case 7:
                return "Print_Titles";
            case 8:
                return "Recorder";
            case 9:
                return "Data_Form";
            case 10:
                return "Auto_Activate";
            case 11:
                return "Auto_Deactivate";
            case 12:
                return "Sheet_Title";
            case 13:
                return "_FilterDatabase";
            default:
                return "Unknown";
        }
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        int length = this.f1342i.length();
        int length2 = this.f1343j.length();
        int length3 = this.f1344k.length();
        int length4 = this.f1345l.length();
        jda.writeShort(mo1367p());
        jda.writeByte(mo1363l());
        jda.writeByte(mo1366o());
        jda.writeShort(this.f1341h.mo4978c());
        jda.writeShort(this.f1336c);
        jda.writeShort(this.f1337d);
        jda.writeByte(length);
        jda.writeByte(length2);
        jda.writeByte(length3);
        jda.writeByte(length4);
        jda.writeByte(this.f1338e ? 1 : 0);
        if (mo1369r()) {
            jda.writeByte(this.f1339f);
        } else {
            String str = this.f1340g;
            if (this.f1338e) {
                qda.m3373b(str, jda);
            } else {
                qda.m3370a(str, jda);
            }
        }
        this.f1341h.mo4979c(jda);
        this.f1341h.mo4977b(jda);
        qda.m3370a(mo1360i(), jda);
        qda.m3370a(mo1361j(), jda);
        qda.m3370a(mo1362k(), jda);
        qda.m3370a(mo1368q(), jda);
    }

    /* renamed from: e */
    public short mo34e() {
        return 24;
    }

    /* renamed from: g */
    public int mo36g() {
        return mo1364m() + 13 + this.f1342i.length() + this.f1343j.length() + this.f1344k.length() + this.f1345l.length() + this.f1341h.mo4976b();
    }

    /* renamed from: h */
    public byte mo1359h() {
        return this.f1339f;
    }

    /* renamed from: i */
    public String mo1360i() {
        return this.f1342i;
    }

    /* renamed from: j */
    public String mo1361j() {
        return this.f1343j;
    }

    /* renamed from: k */
    public String mo1362k() {
        return this.f1344k;
    }

    /* renamed from: l */
    public byte mo1363l() {
        return this.f1335b;
    }

    /* renamed from: m */
    public final int mo1364m() {
        if (mo1369r()) {
            return 1;
        }
        int length = this.f1340g.length();
        if (this.f1338e) {
            length *= 2;
        }
        return length;
    }

    /* renamed from: n */
    public String mo1365n() {
        return mo1369r() ? m1300a(mo1359h()) : this.f1340g;
    }

    /* renamed from: o */
    public final int mo1366o() {
        if (mo1369r()) {
            return 1;
        }
        return this.f1340g.length();
    }

    /* renamed from: p */
    public short mo1367p() {
        return this.f1334a;
    }

    /* renamed from: q */
    public String mo1368q() {
        return this.f1345l;
    }

    /* renamed from: r */
    public boolean mo1369r() {
        return (this.f1334a & 32) != 0;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[NAME]\n");
        stringBuffer.append("    .option flags           = ");
        stringBuffer.append(Yca.m1602c((int) this.f1334a));
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("    .keyboard shortcut      = ");
        stringBuffer.append(Yca.m1596a((int) this.f1335b));
        stringBuffer.append(str);
        stringBuffer.append("    .length of the name     = ");
        stringBuffer.append(mo1366o());
        stringBuffer.append(str);
        stringBuffer.append("    .extSheetIx(1-based, 0=Global)= ");
        stringBuffer.append(this.f1336c);
        stringBuffer.append(str);
        stringBuffer.append("    .sheetTabIx             = ");
        stringBuffer.append(this.f1337d);
        stringBuffer.append(str);
        stringBuffer.append("    .Menu text length       = ");
        stringBuffer.append(this.f1342i.length());
        stringBuffer.append(str);
        stringBuffer.append("    .Description text length= ");
        stringBuffer.append(this.f1343j.length());
        stringBuffer.append(str);
        stringBuffer.append("    .Help topic text length = ");
        stringBuffer.append(this.f1344k.length());
        stringBuffer.append(str);
        stringBuffer.append("    .Status bar text length = ");
        stringBuffer.append(this.f1345l.length());
        stringBuffer.append(str);
        stringBuffer.append("    .NameIsMultibyte        = ");
        stringBuffer.append(this.f1338e);
        stringBuffer.append(str);
        stringBuffer.append("    .Name (Unicode text)    = ");
        stringBuffer.append(mo1365n());
        stringBuffer.append(str);
        Haa[] e = this.f1341h.mo4981e();
        stringBuffer.append("    .Formula (nTokens=");
        stringBuffer.append(e.length);
        stringBuffer.append("):");
        stringBuffer.append(str);
        for (Haa haa : e) {
            StringBuilder sb = new StringBuilder();
            sb.append("       ");
            sb.append(haa.toString());
            stringBuffer.append(sb.toString());
            stringBuffer.append(haa.mo358b());
            stringBuffer.append(str);
        }
        stringBuffer.append("    .Menu text       = ");
        stringBuffer.append(this.f1342i);
        stringBuffer.append(str);
        stringBuffer.append("    .Description text= ");
        stringBuffer.append(this.f1343j);
        stringBuffer.append(str);
        stringBuffer.append("    .Help topic text = ");
        stringBuffer.append(this.f1344k);
        stringBuffer.append(str);
        stringBuffer.append("    .Status bar text = ");
        stringBuffer.append(this.f1345l);
        stringBuffer.append(str);
        stringBuffer.append("[/NAME]\n");
        return stringBuffer.toString();
    }
}
