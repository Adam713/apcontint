package p000;

/* renamed from: TZ */
public abstract class C0424TZ extends C0560ZZ {
    public C0424TZ(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4) {
        super(i, i2, i3, i4, z, z2, z3, z4);
    }

    public C0424TZ(hda hda) {
        mo1687b(hda);
    }

    /* renamed from: a */
    public final void mo79a(jda jda) {
        jda.writeByte(mo1236p() + mo356a());
        mo1688b(jda);
    }

    /* renamed from: c */
    public final int mo80c() {
        return 9;
    }

    /* renamed from: e */
    public final String mo81e() {
        return mo1694g();
    }

    /* renamed from: p */
    public abstract byte mo1236p();

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getClass().getName());
        stringBuffer.append(" [");
        stringBuffer.append(mo1694g());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
