package p000;

/* renamed from: XX */
public final class C0510XX extends C0400SW {

    /* renamed from: d */
    public double f1457d;

    /* renamed from: a */
    public void mo1474a(double d) {
        this.f1457d = d;
    }

    /* renamed from: a */
    public void mo382a(StringBuilder sb) {
        sb.append("  .value= ");
        sb.append(Qca.m1073a(this.f1457d));
    }

    /* renamed from: b */
    public void mo384b(jda jda) {
        jda.writeDouble(mo1475j());
    }

    public Object clone() {
        C0510XX xx = new C0510XX();
        mo1205a((C0400SW) xx);
        xx.f1457d = this.f1457d;
        return xx;
    }

    /* renamed from: e */
    public short mo34e() {
        return 515;
    }

    /* renamed from: h */
    public String mo385h() {
        return "NUMBER";
    }

    /* renamed from: i */
    public int mo386i() {
        return 8;
    }

    /* renamed from: j */
    public double mo1475j() {
        return this.f1457d;
    }
}
