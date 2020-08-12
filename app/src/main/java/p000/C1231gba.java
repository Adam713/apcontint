package p000;

/* renamed from: gba reason: case insensitive filesystem */
public final class C1231gba extends C0080DY {

    /* renamed from: a */
    public final C0808a[] f3035a;

    /* renamed from: gba$a */
    private static final class C0808a {
        /* renamed from: a */
        public void mo4442a(StringBuffer stringBuffer) {
            throw null;
        }

        /* renamed from: a */
        public void mo4443a(jda jda) {
            throw null;
        }
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        C0808a[] aVarArr = this.f3035a;
        if (aVarArr.length > 0) {
            aVarArr[0].mo4443a(jda);
            throw null;
        }
    }

    /* renamed from: e */
    public short mo34e() {
        return 182;
    }

    /* renamed from: g */
    public int mo36g() {
        return this.f3035a.length * 6;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[SXPI]\n");
        if (this.f3035a.length <= 0) {
            stringBuffer.append("[/SXPI]\n");
            return stringBuffer.toString();
        }
        stringBuffer.append("    item[");
        stringBuffer.append(0);
        stringBuffer.append("]=");
        this.f3035a[0].mo4442a(stringBuffer);
        throw null;
    }
}
