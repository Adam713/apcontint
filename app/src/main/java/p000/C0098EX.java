package p000;

/* renamed from: EX */
public final class C0098EX extends C0060CX {
    public C0098EX(String str) {
        super(str);
    }

    public Object clone() {
        return new C0098EX(mo110h());
    }

    /* renamed from: e */
    public short mo34e() {
        return 20;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[HEADER]\n");
        stringBuffer.append("    .header = ");
        stringBuffer.append(mo110h());
        stringBuffer.append("\n");
        stringBuffer.append("[/HEADER]\n");
        return stringBuffer.toString();
    }
}
