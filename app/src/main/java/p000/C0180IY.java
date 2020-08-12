package p000;

/* renamed from: IY */
public final class C0180IY extends C0080DY {

    /* renamed from: a */
    public static final short[] f398a = new short[0];

    /* renamed from: b */
    public short[] f399b = f398a;

    /* renamed from: a */
    public void mo30a(jda jda) {
        short[] sArr = this.f399b;
        for (short writeShort : sArr) {
            jda.writeShort(writeShort);
        }
    }

    /* renamed from: a */
    public void mo397a(short[] sArr) {
        this.f399b = sArr;
    }

    /* renamed from: e */
    public short mo34e() {
        return 317;
    }

    /* renamed from: g */
    public int mo36g() {
        return this.f399b.length * 2;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[TABID]\n");
        stringBuffer.append("    .elements        = ");
        stringBuffer.append(this.f399b.length);
        String str = "\n";
        stringBuffer.append(str);
        for (int i = 0; i < this.f399b.length; i++) {
            stringBuffer.append("    .element_");
            stringBuffer.append(i);
            stringBuffer.append(" = ");
            stringBuffer.append(this.f399b[i]);
            stringBuffer.append(str);
        }
        stringBuffer.append("[/TABID]\n");
        return stringBuffer.toString();
    }
}
