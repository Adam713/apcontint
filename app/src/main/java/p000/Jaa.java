package p000;

/* renamed from: Jaa */
public abstract class Jaa extends Oaa {
    public Jaa(int i, int i2, boolean z, boolean z2) {
        mo1005b(i);
        mo1003a(i2);
        mo1008b(z);
        mo1004a(z2);
    }

    public Jaa(hda hda) {
        mo1006b(hda);
    }

    /* renamed from: a */
    public void mo79a(jda jda) {
        jda.writeByte(mo644l() + mo356a());
        mo1007b(jda);
    }

    /* renamed from: c */
    public final int mo80c() {
        return 5;
    }

    /* renamed from: e */
    public final String mo81e() {
        return mo1009g();
    }

    /* renamed from: l */
    public abstract byte mo644l();

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getClass().getName());
        stringBuffer.append(" [");
        stringBuffer.append(mo1009g());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
