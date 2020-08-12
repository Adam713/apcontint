package p000;

/* renamed from: Caa */
public abstract class Caa extends Haa implements Cloneable {
    /* renamed from: d */
    public final boolean mo120d() {
        return false;
    }

    /* renamed from: f */
    public final Caa mo121f() {
        try {
            return (Caa) clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
