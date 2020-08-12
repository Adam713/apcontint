package p000;

/* renamed from: wZ */
public final class C1150wZ extends C0080DY {

    /* renamed from: a */
    public static final Tca f4052a = Uca.m1284a(1);

    /* renamed from: b */
    public short f4053b;

    /* renamed from: c */
    public short f4054c;

    /* renamed from: d */
    public short f4055d;

    /* renamed from: e */
    public short f4056e;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f4053b);
        jda.writeShort(this.f4054c);
        jda.writeShort(this.f4055d);
        jda.writeShort(this.f4056e);
    }

    public Object clone() {
        C1150wZ wZVar = new C1150wZ();
        wZVar.f4053b = this.f4053b;
        wZVar.f4054c = this.f4054c;
        wZVar.f4055d = this.f4055d;
        wZVar.f4056e = this.f4056e;
        return wZVar;
    }

    /* renamed from: e */
    public short mo34e() {
        return 4102;
    }

    /* renamed from: g */
    public int mo36g() {
        return 8;
    }

    /* renamed from: h */
    public short mo5388h() {
        return this.f4056e;
    }

    /* renamed from: i */
    public short mo5389i() {
        return this.f4053b;
    }

    /* renamed from: j */
    public short mo5390j() {
        return this.f4054c;
    }

    /* renamed from: k */
    public short mo5391k() {
        return this.f4055d;
    }

    /* renamed from: l */
    public boolean mo5392l() {
        return f4052a.mo1258d(this.f4056e);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[DATAFORMAT]\n");
        stringBuffer.append("    .pointNumber          = ");
        String str = "0x";
        stringBuffer.append(str);
        stringBuffer.append(Yca.m1593a(mo5389i()));
        String str2 = " (";
        stringBuffer.append(str2);
        stringBuffer.append(mo5389i());
        String str3 = " )";
        stringBuffer.append(str3);
        String str4 = "line.separator";
        stringBuffer.append(System.getProperty(str4));
        stringBuffer.append("    .seriesIndex          = ");
        stringBuffer.append(str);
        stringBuffer.append(Yca.m1593a(mo5390j()));
        stringBuffer.append(str2);
        stringBuffer.append(mo5390j());
        stringBuffer.append(str3);
        stringBuffer.append(System.getProperty(str4));
        stringBuffer.append("    .seriesNumber         = ");
        stringBuffer.append(str);
        stringBuffer.append(Yca.m1593a(mo5391k()));
        stringBuffer.append(str2);
        stringBuffer.append(mo5391k());
        stringBuffer.append(str3);
        stringBuffer.append(System.getProperty(str4));
        stringBuffer.append("    .formatFlags          = ");
        stringBuffer.append(str);
        stringBuffer.append(Yca.m1593a(mo5388h()));
        stringBuffer.append(str2);
        stringBuffer.append(mo5388h());
        stringBuffer.append(str3);
        stringBuffer.append(System.getProperty(str4));
        stringBuffer.append("         .useExcel4Colors          = ");
        stringBuffer.append(mo5392l());
        stringBuffer.append(10);
        stringBuffer.append("[/DATAFORMAT]\n");
        return stringBuffer.toString();
    }
}
