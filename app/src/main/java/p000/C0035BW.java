package p000;

/* renamed from: BW */
public final class C0035BW extends C0061CY {

    /* renamed from: b */
    public int f58b;

    /* renamed from: c */
    public int f59c;

    /* renamed from: d */
    public C1256oca f60d;

    /* renamed from: b */
    public void mo71b(jda jda) {
        jda.writeShort(this.f58b);
        jda.writeInt(this.f59c);
        this.f60d.mo4975a(jda);
    }

    /* renamed from: e */
    public short mo34e() {
        return 545;
    }

    /* renamed from: h */
    public int mo72h() {
        return this.f60d.mo4976b() + 6;
    }

    /* renamed from: n */
    public Haa[] mo73n() {
        return this.f60d.mo4981e();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(C0035BW.class.getName());
        stringBuffer.append(" [ARRAY]\n");
        stringBuffer.append(" range=");
        stringBuffer.append(mo118m().toString());
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append(" options=");
        stringBuffer.append(Yca.m1602c(this.f58b));
        stringBuffer.append(str);
        stringBuffer.append(" notUsed=");
        stringBuffer.append(Yca.m1598b(this.f59c));
        stringBuffer.append(str);
        stringBuffer.append(" formula:");
        stringBuffer.append(str);
        Haa[] e = this.f60d.mo4981e();
        for (Haa haa : e) {
            stringBuffer.append(haa.toString());
            stringBuffer.append(haa.mo358b());
            stringBuffer.append(str);
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
