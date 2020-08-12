package p000;

/* renamed from: DY */
public abstract class C0080DY extends C0933mY {
    /* renamed from: a */
    public final int mo162a(int i, byte[] bArr) {
        int g = mo36g();
        int i2 = g + 4;
        fda fda = new fda(bArr, i, i2);
        fda.writeShort(mo34e());
        fda.writeShort(g);
        mo30a(fda);
        if (fda.mo4400a() - i == i2) {
            return i2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Error in serialization of (");
        sb.append(getClass().getName());
        sb.append("): ");
        sb.append("Incorrect number of bytes written - expected ");
        sb.append(i2);
        sb.append(" but got ");
        sb.append(fda.mo4400a() - i);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public abstract void mo30a(jda jda);

    /* renamed from: c */
    public final int mo163c() {
        return mo36g() + 4;
    }

    /* renamed from: g */
    public abstract int mo36g();
}
