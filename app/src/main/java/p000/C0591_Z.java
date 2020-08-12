package p000;

/* renamed from: _Z */
public final class C0591_Z extends Haa {

    /* renamed from: c */
    public final int f1789c;

    /* renamed from: d */
    public final int f1790d;

    /* renamed from: e */
    public final int f1791e;

    /* renamed from: f */
    public final int f1792f;

    /* renamed from: g */
    public final int f1793g;

    /* renamed from: h */
    public final Object[] f1794h;

    /* renamed from: _Z$a */
    static final class C0592a extends Haa {

        /* renamed from: c */
        public final int f1795c;

        /* renamed from: d */
        public final int f1796d;

        /* renamed from: e */
        public final int f1797e;

        public C0592a(hda hda) {
            this.f1795c = hda.readInt();
            this.f1796d = hda.mo401a();
            this.f1797e = hda.mo404b();
        }

        /* renamed from: f */
        public static RuntimeException m1739f() {
            throw new IllegalStateException("This object is a partially initialised tArray, and cannot be used as a Ptg");
        }

        /* renamed from: a */
        public void mo79a(jda jda) {
            m1739f();
            throw null;
        }

        /* renamed from: b */
        public C0591_Z mo1820b(hda hda) {
            int b = hda.mo404b() + 1;
            short readShort = (short) (hda.readShort() + 1);
            C0591_Z _z = new C0591_Z(this.f1795c, this.f1796d, this.f1797e, b, readShort, C0162HZ.m335a(hda, readShort * b));
            _z.mo357a(mo356a());
            return _z;
        }

        /* renamed from: c */
        public int mo80c() {
            return 8;
        }

        /* renamed from: d */
        public boolean mo120d() {
            return false;
        }

        /* renamed from: e */
        public String mo81e() {
            m1739f();
            throw null;
        }
    }

    public C0591_Z(int i, int i2, int i3, int i4, int i5, Object[] objArr) {
        this.f1789c = i;
        this.f1790d = i2;
        this.f1791e = i3;
        this.f1792f = i4;
        this.f1793g = i5;
        this.f1794h = objArr;
    }

    /* renamed from: a */
    public static String m1730a(Object obj) {
        if (obj == null) {
            throw new RuntimeException("Array item cannot be null");
        } else if (obj instanceof String) {
            StringBuilder sb = new StringBuilder();
            String str = "\"";
            sb.append(str);
            sb.append((String) obj);
            sb.append(str);
            return sb.toString();
        } else if (obj instanceof Double) {
            return Qca.m1073a(((Double) obj).doubleValue());
        } else {
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue() ? "TRUE" : "FALSE";
            } else if (obj instanceof C0181IZ) {
                return ((C0181IZ) obj).mo399b();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unexpected constant class (");
                sb2.append(obj.getClass().getName());
                sb2.append(")");
                throw new IllegalArgumentException(sb2.toString());
            }
        }
    }

    /* renamed from: a */
    public int mo1816a(int i, int i2) {
        String str = ")";
        String str2 = ") is outside the allowed range (0..";
        if (i >= 0) {
            int i3 = this.f1792f;
            if (i < i3) {
                if (i2 >= 0 && i2 < this.f1793g) {
                    return (i2 * i3) + i;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Specified rowIx (");
                sb.append(i2);
                sb.append(str2);
                sb.append(this.f1793g - 1);
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Specified colIx (");
        sb2.append(i);
        sb2.append(str2);
        sb2.append(this.f1792f - 1);
        sb2.append(str);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: a */
    public void mo79a(jda jda) {
        jda.writeByte(mo356a() + 32);
        jda.writeInt(this.f1789c);
        jda.writeShort(this.f1790d);
        jda.writeByte(this.f1791e);
    }

    /* renamed from: b */
    public int mo1817b(jda jda) {
        jda.writeByte(this.f1792f - 1);
        jda.writeShort(this.f1793g - 1);
        C0162HZ.m334a(jda, this.f1794h);
        return C0162HZ.m331a(this.f1794h) + 3;
    }

    /* renamed from: c */
    public int mo80c() {
        return C0162HZ.m331a(this.f1794h) + 11;
    }

    /* renamed from: d */
    public boolean mo120d() {
        return false;
    }

    /* renamed from: e */
    public String mo81e() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{");
        for (int i = 0; i < mo1819g(); i++) {
            if (i > 0) {
                stringBuffer.append(";");
            }
            for (int i2 = 0; i2 < mo1818f(); i2++) {
                if (i2 > 0) {
                    stringBuffer.append(",");
                }
                stringBuffer.append(m1730a(this.f1794h[mo1816a(i2, i)]));
            }
        }
        stringBuffer.append("}");
        return stringBuffer.toString();
    }

    /* renamed from: f */
    public int mo1818f() {
        return this.f1792f;
    }

    /* renamed from: g */
    public int mo1819g() {
        return this.f1793g;
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer("[ArrayPtg]\n");
        stringBuffer.append("nRows = ");
        stringBuffer.append(mo1819g());
        String str2 = "\n";
        stringBuffer.append(str2);
        stringBuffer.append("nCols = ");
        stringBuffer.append(mo1818f());
        stringBuffer.append(str2);
        if (this.f1794h == null) {
            str = "  #values#uninitialised#\n";
        } else {
            stringBuffer.append("  ");
            str = mo81e();
        }
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
