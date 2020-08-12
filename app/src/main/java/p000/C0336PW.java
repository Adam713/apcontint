package p000;

/* renamed from: PW */
public final class C0336PW extends C0080DY {

    /* renamed from: a */
    public int f972a;

    /* renamed from: b */
    public int f973b;

    /* renamed from: c */
    public int f974c;

    /* renamed from: d */
    public Object[] f975d;

    public C0336PW() {
        throw new RuntimeException("incomplete code");
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeByte(this.f972a);
        jda.writeByte(this.f973b);
        jda.writeShort(this.f974c);
        C0162HZ.m334a(jda, this.f975d);
    }

    /* renamed from: e */
    public short mo34e() {
        return 90;
    }

    /* renamed from: g */
    public int mo36g() {
        return C0162HZ.m331a(this.f975d) + 4;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(C0336PW.class.getName());
        stringBuffer.append(" [CRN");
        stringBuffer.append(" rowIx=");
        stringBuffer.append(this.f974c);
        stringBuffer.append(" firstColIx=");
        stringBuffer.append(this.f973b);
        stringBuffer.append(" lastColIx=");
        stringBuffer.append(this.f972a);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
