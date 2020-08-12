package p000;

/* renamed from: vZ */
public class C1123vZ extends C0080DY {

    /* renamed from: a */
    public C1124a[] f3901a;

    /* renamed from: vZ$a */
    private static final class C1124a {
        /* renamed from: a */
        public int mo5252a() {
            throw null;
        }

        /* renamed from: a */
        public void mo5253a(jda jda) {
            throw null;
        }
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f3901a.length);
        C1124a[] aVarArr = this.f3901a;
        if (aVarArr.length > 0) {
            aVarArr[0].mo5253a(jda);
            throw null;
        }
    }

    /* renamed from: e */
    public short mo34e() {
        return 4176;
    }

    /* renamed from: g */
    public int mo36g() {
        return (this.f3901a.length * 4) + 2;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[CHARTTITLEFORMAT]\n");
        stringBuffer.append("    .format_runs       = ");
        stringBuffer.append(this.f3901a.length);
        stringBuffer.append("\n");
        C1124a[] aVarArr = this.f3901a;
        if (aVarArr.length <= 0) {
            stringBuffer.append("[/CHARTTITLEFORMAT]\n");
            return stringBuffer.toString();
        }
        C1124a aVar = aVarArr[0];
        stringBuffer.append("       .char_offset= ");
        aVar.mo5252a();
        throw null;
    }
}
