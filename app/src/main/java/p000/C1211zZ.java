package p000;

/* renamed from: zZ */
public final class C1211zZ extends C0080DY {

    /* renamed from: a */
    public static final Tca f4226a = Uca.m1284a(1);

    /* renamed from: b */
    public byte f4227b;

    /* renamed from: c */
    public byte f4228c;

    /* renamed from: d */
    public short f4229d;

    /* renamed from: e */
    public short f4230e;

    /* renamed from: f */
    public C1256oca f4231f;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeByte(this.f4227b);
        jda.writeByte(this.f4228c);
        jda.writeShort(this.f4229d);
        jda.writeShort(this.f4230e);
        this.f4231f.mo4975a(jda);
    }

    public Object clone() {
        C1211zZ zZVar = new C1211zZ();
        zZVar.f4227b = this.f4227b;
        zZVar.f4228c = this.f4228c;
        zZVar.f4229d = this.f4229d;
        zZVar.f4230e = this.f4230e;
        C1256oca oca = this.f4231f;
        oca.mo4974a();
        zZVar.f4231f = oca;
        return zZVar;
    }

    /* renamed from: e */
    public short mo34e() {
        return 4177;
    }

    /* renamed from: g */
    public int mo36g() {
        return this.f4231f.mo4976b() + 6;
    }

    /* renamed from: h */
    public short mo5586h() {
        return this.f4230e;
    }

    /* renamed from: i */
    public byte mo5587i() {
        return this.f4227b;
    }

    /* renamed from: j */
    public short mo5588j() {
        return this.f4229d;
    }

    /* renamed from: k */
    public byte mo5589k() {
        return this.f4228c;
    }

    /* renamed from: l */
    public boolean mo5590l() {
        return f4226a.mo1258d(this.f4229d);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[AI]\n");
        stringBuffer.append("    .linkType             = ");
        stringBuffer.append(Yca.m1596a((int) mo5587i()));
        stringBuffer.append(10);
        stringBuffer.append("    .referenceType        = ");
        stringBuffer.append(Yca.m1596a((int) mo5589k()));
        stringBuffer.append(10);
        stringBuffer.append("    .options              = ");
        stringBuffer.append(Yca.m1602c((int) mo5588j()));
        stringBuffer.append(10);
        stringBuffer.append("    .customNumberFormat   = ");
        stringBuffer.append(mo5590l());
        stringBuffer.append(10);
        stringBuffer.append("    .indexNumberFmtRecord = ");
        stringBuffer.append(Yca.m1602c((int) mo5586h()));
        stringBuffer.append(10);
        stringBuffer.append("    .formulaOfLink        = ");
        stringBuffer.append(10);
        Haa[] e = this.f4231f.mo4981e();
        for (Haa haa : e) {
            stringBuffer.append(haa.toString());
            stringBuffer.append(haa.mo358b());
            stringBuffer.append(10);
        }
        stringBuffer.append("[/AI]\n");
        return stringBuffer.toString();
    }
}
