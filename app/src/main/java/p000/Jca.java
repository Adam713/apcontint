package p000;

/* renamed from: Jca */
public class Jca extends Kca {
    public Jca(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
    }

    /* renamed from: a */
    public static int m647a(int i) {
        return i * 8;
    }

    /* renamed from: a */
    public void mo647a(jda jda) {
        jda.writeShort(mo754b());
        jda.writeShort(mo756d());
        jda.writeShort(mo751a());
        jda.writeShort(mo755c());
    }

    /* renamed from: f */
    public Jca mo648f() {
        return new Jca(mo754b(), mo756d(), mo751a(), mo755c());
    }

    /* renamed from: g */
    public String mo649g() {
        StringBuffer stringBuffer = new StringBuffer();
        Mca mca = new Mca(mo754b(), mo751a());
        Mca mca2 = new Mca(mo756d(), mo755c());
        stringBuffer.append(mca.mo910a());
        if (!mca.equals(mca2)) {
            stringBuffer.append(':');
            stringBuffer.append(mca2.mo910a());
        }
        return stringBuffer.toString();
    }
}
