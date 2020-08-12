package p000;

/* renamed from: RV */
public abstract class C0377RV {
    /* renamed from: a */
    public abstract int mo1144a();

    /* renamed from: a */
    public abstract int mo1145a(int i, byte[] bArr, C0399SV sv);

    public Object clone() {
        StringBuilder sb = new StringBuilder();
        sb.append("The class ");
        sb.append(getClass().getName());
        sb.append(" needs to define a clone method");
        throw new RuntimeException(sb.toString());
    }
}
