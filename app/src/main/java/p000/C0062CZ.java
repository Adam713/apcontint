package p000;

/* renamed from: CZ */
public final class C0062CZ extends C0080DY {

    /* renamed from: a */
    public short f107a;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f107a);
    }

    public Object clone() {
        C0062CZ cz = new C0062CZ();
        cz.f107a = this.f107a;
        return cz;
    }

    /* renamed from: e */
    public short mo34e() {
        return 4165;
    }

    /* renamed from: g */
    public int mo36g() {
        return 2;
    }

    /* renamed from: h */
    public short mo119h() {
        return this.f107a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[SeriesToChartGroup]\n");
        stringBuffer.append("    .chartGroupIndex      = ");
        stringBuffer.append("0x");
        stringBuffer.append(Yca.m1593a(mo119h()));
        stringBuffer.append(" (");
        stringBuffer.append(mo119h());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("[/SeriesToChartGroup]\n");
        return stringBuffer.toString();
    }
}
