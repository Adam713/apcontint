package p000;

/* renamed from: NX */
public final class C0291NX extends C0400SW {

    /* renamed from: d */
    public int f821d;

    /* renamed from: a */
    public void mo382a(StringBuilder sb) {
        sb.append("  .sstIndex = ");
        sb.append(Yca.m1602c((int) mo277a()));
    }

    /* renamed from: b */
    public void mo942b(int i) {
        this.f821d = i;
    }

    /* renamed from: b */
    public void mo384b(jda jda) {
        jda.writeInt(mo943j());
    }

    public Object clone() {
        C0291NX nx = new C0291NX();
        mo1205a((C0400SW) nx);
        nx.f821d = this.f821d;
        return nx;
    }

    /* renamed from: e */
    public short mo34e() {
        return 253;
    }

    /* renamed from: h */
    public String mo385h() {
        return "LABELSST";
    }

    /* renamed from: i */
    public int mo386i() {
        return 4;
    }

    /* renamed from: j */
    public int mo943j() {
        return this.f821d;
    }
}
