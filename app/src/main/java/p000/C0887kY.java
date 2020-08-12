package p000;

/* renamed from: kY */
public final class C0887kY extends C0400SW {

    /* renamed from: d */
    public int f3220d;

    /* renamed from: a */
    public void mo382a(StringBuilder sb) {
        sb.append("  .value= ");
        sb.append(mo4578j());
    }

    /* renamed from: b */
    public void mo384b(jda jda) {
        jda.writeInt(this.f3220d);
    }

    public Object clone() {
        C0887kY kYVar = new C0887kY();
        mo1205a((C0400SW) kYVar);
        kYVar.f3220d = this.f3220d;
        return kYVar;
    }

    /* renamed from: e */
    public short mo34e() {
        return 638;
    }

    /* renamed from: h */
    public String mo385h() {
        return "RK";
    }

    /* renamed from: i */
    public int mo386i() {
        return 4;
    }

    /* renamed from: j */
    public double mo4578j() {
        return Aba.m48a(this.f3220d);
    }
}
