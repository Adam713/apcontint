package p000;

/* renamed from: lY */
public final class C0912lY extends C0080DY {

    /* renamed from: a */
    public final int f3303a;

    /* renamed from: b */
    public final int f3304b;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(449);
        jda.writeShort(this.f3303a);
        jda.writeInt(this.f3304b);
    }

    /* renamed from: e */
    public short mo34e() {
        return 449;
    }

    /* renamed from: g */
    public int mo36g() {
        return 8;
    }

    /* renamed from: h */
    public boolean mo4629h() {
        return true;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[RECALCID]\n");
        stringBuffer.append("    .reserved = ");
        stringBuffer.append(Yca.m1602c(this.f3303a));
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("    .engineId = ");
        stringBuffer.append(Yca.m1598b(this.f3304b));
        stringBuffer.append(str);
        stringBuffer.append("[/RECALCID]\n");
        return stringBuffer.toString();
    }
}
