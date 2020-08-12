package p000;

/* renamed from: wX */
public final class C1148wX extends C0060CX {
    public C1148wX(String str) {
        super(str);
    }

    public Object clone() {
        return new C1148wX(mo110h());
    }

    /* renamed from: e */
    public short mo34e() {
        return 21;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[FOOTER]\n");
        stringBuffer.append("    .footer = ");
        stringBuffer.append(mo110h());
        stringBuffer.append("\n");
        stringBuffer.append("[/FOOTER]\n");
        return stringBuffer.toString();
    }
}
