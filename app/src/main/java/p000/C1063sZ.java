package p000;

/* renamed from: sZ */
public final class C1063sZ extends C0080DY {

    /* renamed from: a */
    public int f3759a;

    /* renamed from: b */
    public int f3760b;

    /* renamed from: c */
    public int f3761c;

    /* renamed from: d */
    public int f3762d;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeInt(this.f3759a);
        jda.writeInt(this.f3760b);
        jda.writeInt(this.f3761c);
        jda.writeInt(this.f3762d);
    }

    public Object clone() {
        C1063sZ sZVar = new C1063sZ();
        sZVar.f3759a = this.f3759a;
        sZVar.f3760b = this.f3760b;
        sZVar.f3761c = this.f3761c;
        sZVar.f3762d = this.f3762d;
        return sZVar;
    }

    /* renamed from: e */
    public short mo34e() {
        return 4098;
    }

    /* renamed from: g */
    public int mo36g() {
        return 16;
    }

    /* renamed from: h */
    public int mo5103h() {
        return this.f3762d;
    }

    /* renamed from: i */
    public int mo5104i() {
        return this.f3761c;
    }

    /* renamed from: j */
    public int mo5105j() {
        return this.f3759a;
    }

    /* renamed from: k */
    public int mo5106k() {
        return this.f3760b;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[CHART]\n");
        stringBuffer.append("    .x     = ");
        stringBuffer.append(mo5105j());
        stringBuffer.append(10);
        stringBuffer.append("    .y     = ");
        stringBuffer.append(mo5106k());
        stringBuffer.append(10);
        stringBuffer.append("    .width = ");
        stringBuffer.append(mo5104i());
        stringBuffer.append(10);
        stringBuffer.append("    .height= ");
        stringBuffer.append(mo5103h());
        stringBuffer.append(10);
        stringBuffer.append("[/CHART]\n");
        return stringBuffer.toString();
    }
}
