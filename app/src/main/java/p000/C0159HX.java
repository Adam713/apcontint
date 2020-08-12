package p000;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* renamed from: HX */
public final class C0159HX extends C0080DY {

    /* renamed from: a */
    public static final C0160a f342a = C0160a.m316a("79EAC9D0-BAF9-11CE-8C82-00AA004BA90B");

    /* renamed from: b */
    public static final C0160a f343b = C0160a.m316a("79EAC9E0-BAF9-11CE-8C82-00AA004BA90B");

    /* renamed from: c */
    public static final C0160a f344c = C0160a.m316a("00000303-0000-0000-C000-000000000046");

    /* renamed from: d */
    public static final byte[] f345d = Zca.m1647a("79 58 81 F4  3B 1D 7F 48   AF 2C 82 5D  C4 85 27 63   00 00 00 00  A5 AB 00 00");

    /* renamed from: e */
    public static final byte[] f346e = Zca.m1647a("FF FF AD DE  00 00 00 00   00 00 00 00  00 00 00 00   00 00 00 00  00 00 00 00");

    /* renamed from: f */
    public static final int f347f = f346e.length;

    /* renamed from: g */
    public Jca f348g;

    /* renamed from: h */
    public C0160a f349h;

    /* renamed from: i */
    public int f350i;

    /* renamed from: j */
    public int f351j;

    /* renamed from: k */
    public String f352k;

    /* renamed from: l */
    public String f353l;

    /* renamed from: m */
    public C0160a f354m;

    /* renamed from: n */
    public String f355n;

    /* renamed from: o */
    public String f356o;

    /* renamed from: p */
    public String f357p;

    /* renamed from: q */
    public byte[] f358q;

    /* renamed from: HX$a */
    static final class C0160a {

        /* renamed from: a */
        public final int f359a;

        /* renamed from: b */
        public final int f360b;

        /* renamed from: c */
        public final int f361c;

        /* renamed from: d */
        public final long f362d;

        public C0160a(int i, int i2, int i3, long j) {
            this.f359a = i;
            this.f360b = i2;
            this.f361c = i3;
            this.f362d = j;
        }

        /* renamed from: a */
        public static int m314a(char c) {
            if (c >= '0' && c <= '9') {
                return c - '0';
            }
            char c2 = 'A';
            if (c < 'A' || c > 'F') {
                c2 = 'a';
                if (c < 'a' || c > 'f') {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Bad hex char '");
                    sb.append(c);
                    sb.append("'");
                    throw new C1001pY(sb.toString());
                }
            }
            return (c - c2) + 10;
        }

        /* renamed from: a */
        public static long m315a(char[] cArr, int i) {
            long j = 0;
            for (int i2 = i + 14; i2 >= i; i2 -= 2) {
                j = (((j << 4) + ((long) m314a(cArr[i2 + 0]))) << 4) + ((long) m314a(cArr[i2 + 1]));
            }
            return j;
        }

        /* renamed from: a */
        public static C0160a m316a(String str) {
            char[] charArray = str.toCharArray();
            if (charArray.length == 36) {
                int b = (m317b(charArray, 0) << 16) + (m317b(charArray, 4) << 0);
                int b2 = m317b(charArray, 9);
                int b3 = m317b(charArray, 14);
                for (int i = 23; i > 19; i--) {
                    charArray[i] = charArray[i - 1];
                }
                C0160a aVar = new C0160a(b, b2, b3, m315a(charArray, 20));
                return aVar;
            }
            throw new C1001pY("supplied text is the wrong length for a GUID");
        }

        /* renamed from: b */
        public static int m317b(char[] cArr, int i) {
            int i2 = 0;
            for (int i3 = 0; i3 < 4; i3++) {
                i2 = (i2 << 4) + m314a(cArr[i + i3]);
            }
            return i2;
        }

        /* renamed from: a */
        public String mo347a() {
            StringBuilder sb = new StringBuilder(36);
            sb.append(Yca.m1598b(this.f359a), 2, 8);
            String str = "-";
            sb.append(str);
            sb.append(Yca.m1602c(this.f360b), 2, 4);
            sb.append(str);
            sb.append(Yca.m1602c(this.f361c), 2, 4);
            sb.append(str);
            char[] b = Yca.m1599b(mo349b());
            sb.append(b, 2, 4);
            sb.append(str);
            sb.append(b, 6, 12);
            return sb.toString();
        }

        /* renamed from: a */
        public void mo348a(jda jda) {
            jda.writeInt(this.f359a);
            jda.writeShort(this.f360b);
            jda.writeShort(this.f361c);
            jda.writeLong(this.f362d);
        }

        /* renamed from: b */
        public long mo349b() {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8);
            try {
                new DataOutputStream(byteArrayOutputStream).writeLong(this.f362d);
                return new eda(byteArrayOutputStream.toByteArray()).readLong();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public boolean equals(Object obj) {
            C0160a aVar = (C0160a) obj;
            return obj != null && (obj instanceof C0160a) && this.f359a == aVar.f359a && this.f360b == aVar.f360b && this.f361c == aVar.f361c && this.f362d == aVar.f362d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append(C0160a.class.getName());
            sb.append(" [");
            sb.append(mo347a());
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static String m305a(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(0);
        return indexOf < 0 ? str : str.substring(0, indexOf);
    }

    /* renamed from: a */
    public static void m306a(byte[] bArr, jda jda) {
        jda.write(bArr);
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        this.f348g.mo647a(jda);
        this.f349h.mo348a(jda);
        jda.writeInt(2);
        jda.writeInt(this.f351j);
        if ((this.f351j & 20) != 0) {
            jda.writeInt(this.f352k.length());
            qda.m3373b(this.f352k, jda);
        }
        if ((this.f351j & 128) != 0) {
            jda.writeInt(this.f353l.length());
            qda.m3373b(this.f353l, jda);
        }
        int i = this.f351j;
        if (!((i & 1) == 0 || (i & 256) == 0)) {
            jda.writeInt(this.f356o.length());
            qda.m3373b(this.f356o, jda);
        }
        int i2 = this.f351j;
        if ((i2 & 1) != 0 && (i2 & 256) == 0) {
            this.f354m.mo348a(jda);
            if (f343b.equals(this.f354m)) {
                if (this.f358q == null) {
                    jda.writeInt(this.f356o.length() * 2);
                } else {
                    jda.writeInt((this.f356o.length() * 2) + f347f);
                    qda.m3373b(this.f356o, jda);
                    m306a(this.f358q, jda);
                }
            } else if (f344c.equals(this.f354m)) {
                jda.writeShort(this.f350i);
                jda.writeInt(this.f355n.length());
                qda.m3370a(this.f355n, jda);
                m306a(this.f358q, jda);
                String str = this.f356o;
                if (str == null) {
                    jda.writeInt(0);
                } else {
                    int length = str.length() * 2;
                    jda.writeInt(length + 6);
                    jda.writeInt(length);
                    jda.writeShort(3);
                }
            }
            qda.m3373b(this.f356o, jda);
        }
        if ((this.f351j & 8) != 0) {
            jda.writeInt(this.f357p.length());
            qda.m3373b(this.f357p, jda);
        }
    }

    public Object clone() {
        C0159HX hx = new C0159HX();
        hx.f348g = this.f348g.mo648f();
        hx.f349h = this.f349h;
        hx.f351j = this.f351j;
        hx.f350i = this.f350i;
        hx.f352k = this.f352k;
        hx.f356o = this.f356o;
        hx.f354m = this.f354m;
        hx.f355n = this.f355n;
        hx.f353l = this.f353l;
        hx.f357p = this.f357p;
        hx.f358q = this.f358q;
        return hx;
    }

    /* renamed from: e */
    public short mo34e() {
        return 440;
    }

    /* renamed from: g */
    public int mo36g() {
        int length;
        int length2 = (this.f351j & 20) != 0 ? 36 + (this.f352k.length() * 2) : 32;
        if ((this.f351j & 128) != 0) {
            length2 = length2 + 4 + (this.f353l.length() * 2);
        }
        int i = this.f351j;
        if (!((i & 1) == 0 || (i & 256) == 0)) {
            length2 = length2 + 4 + (this.f356o.length() * 2);
        }
        int i2 = this.f351j;
        if ((i2 & 1) != 0 && (i2 & 256) == 0) {
            length2 += 16;
            if (f343b.equals(this.f354m)) {
                length2 = length2 + 4 + (this.f356o.length() * 2);
                if (this.f358q != null) {
                    length = f347f;
                }
            } else if (f344c.equals(this.f354m)) {
                length2 = length2 + 2 + 4 + this.f355n.length() + f347f + 4;
                String str = this.f356o;
                if (str != null) {
                    length2 += 6;
                    length = str.length() * 2;
                }
            }
            length2 += length;
        }
        return (this.f351j & 8) != 0 ? length2 + 4 + (this.f357p.length() * 2) : length2;
    }

    /* renamed from: h */
    public String mo343h() {
        if ((this.f351j & 1) == 0 || !f344c.equals(this.f354m)) {
            return m305a((this.f351j & 8) != 0 ? this.f357p : this.f356o);
        }
        String str = this.f356o;
        if (str == null) {
            str = this.f355n;
        }
        return m305a(str);
    }

    /* renamed from: i */
    public String mo344i() {
        return m305a(this.f352k);
    }

    /* renamed from: j */
    public String mo345j() {
        return m305a(this.f353l);
    }

    /* renamed from: k */
    public String mo346k() {
        return m305a(this.f357p);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[HYPERLINK RECORD]\n");
        stringBuffer.append("    .range   = ");
        stringBuffer.append(this.f348g.mo649g());
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("    .guid    = ");
        stringBuffer.append(this.f349h.mo347a());
        stringBuffer.append(str);
        stringBuffer.append("    .linkOpts= ");
        stringBuffer.append(Yca.m1598b(this.f351j));
        stringBuffer.append(str);
        stringBuffer.append("    .label   = ");
        stringBuffer.append(mo344i());
        stringBuffer.append(str);
        if ((this.f351j & 128) != 0) {
            stringBuffer.append("    .targetFrame= ");
            stringBuffer.append(mo345j());
            stringBuffer.append(str);
        }
        if (!((this.f351j & 1) == 0 || this.f354m == null)) {
            stringBuffer.append("    .moniker   = ");
            stringBuffer.append(this.f354m.mo347a());
            stringBuffer.append(str);
        }
        if ((this.f351j & 8) != 0) {
            stringBuffer.append("    .textMark= ");
            stringBuffer.append(mo346k());
            stringBuffer.append(str);
        }
        stringBuffer.append("    .address   = ");
        stringBuffer.append(mo343h());
        stringBuffer.append(str);
        stringBuffer.append("[/HYPERLINK RECORD]\n");
        return stringBuffer.toString();
    }
}
