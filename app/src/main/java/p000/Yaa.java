package p000;

/* renamed from: Yaa */
public abstract class Yaa extends Daa {
    /* renamed from: a */
    public void mo79a(jda jda) {
        jda.writeByte(mo54g());
    }

    /* renamed from: c */
    public final int mo80c() {
        return 1;
    }

    /* renamed from: d */
    public final boolean mo120d() {
        return true;
    }

    /* renamed from: e */
    public final String mo81e() {
        throw new RuntimeException("toFormulaString(String[] operands) should be used for subclasses of OperationPtgs");
    }

    /* renamed from: g */
    public abstract byte mo54g();
}
