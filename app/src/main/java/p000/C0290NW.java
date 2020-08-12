package p000;

import com.itextpdf.tool.xml.css.parser.CssSelectorParser;
import com.itextpdf.xmp.options.PropertyOptions;
import com.itextpdf.xmp.options.SerializeOptions;

/* renamed from: NW */
public final class C0290NW extends C0080DY {

    /* renamed from: A */
    public static final Tca f783A = m897a((int) PropertyOptions.DELETE_EXISTING);

    /* renamed from: B */
    public static final Tca f784B = m897a((int) PropertyOptions.SEPARATE_NODE);

    /* renamed from: C */
    public static final Tca f785C = m897a(Integer.MIN_VALUE);

    /* renamed from: a */
    public static final Tca f786a = m897a(4194303);

    /* renamed from: b */
    public static final Tca f787b = m897a(1);

    /* renamed from: c */
    public static final Tca f788c = m897a(2);

    /* renamed from: d */
    public static final Tca f789d = m897a(4);

    /* renamed from: e */
    public static final Tca f790e = m897a(8);

    /* renamed from: f */
    public static final Tca f791f = m897a(16);

    /* renamed from: g */
    public static final Tca f792g = m897a(32);

    /* renamed from: h */
    public static final Tca f793h = m897a(64);

    /* renamed from: i */
    public static final Tca f794i = m897a(128);

    /* renamed from: j */
    public static final Tca f795j = m897a(256);

    /* renamed from: k */
    public static final Tca f796k = m897a(512);

    /* renamed from: l */
    public static final Tca f797l = m897a(1024);

    /* renamed from: m */
    public static final Tca f798m = m897a(2048);

    /* renamed from: n */
    public static final Tca f799n = m897a(4096);

    /* renamed from: o */
    public static final Tca f800o = m897a((int) SerializeOptions.SORT);

    /* renamed from: p */
    public static final Tca f801p = m897a(16384);

    /* renamed from: q */
    public static final Tca f802q = m897a(32768);

    /* renamed from: r */
    public static final Tca f803r = m897a((int) CssSelectorParser.f2021a);

    /* renamed from: s */
    public static final Tca f804s = m897a(131072);

    /* renamed from: t */
    public static final Tca f805t = m897a(262144);

    /* renamed from: u */
    public static final Tca f806u = m897a(3670016);

    /* renamed from: v */
    public static final Tca f807v = m897a(62914560);

    /* renamed from: w */
    public static final Tca f808w = m897a(2080374784);

    /* renamed from: x */
    public static final Tca f809x = m897a(67108864);

    /* renamed from: y */
    public static final Tca f810y = m897a(134217728);

    /* renamed from: z */
    public static final Tca f811z = m897a(268435456);

    /* renamed from: D */
    public byte f812D;

    /* renamed from: E */
    public byte f813E;

    /* renamed from: F */
    public int f814F;

    /* renamed from: G */
    public short f815G;

    /* renamed from: H */
    public C0913lZ f816H;

    /* renamed from: I */
    public C0888kZ f817I;

    /* renamed from: J */
    public C0934mZ f818J;

    /* renamed from: K */
    public C1256oca f819K;

    /* renamed from: L */
    public C1256oca f820L;

    public C0290NW(byte b, byte b2) {
        this.f812D = b;
        this.f813E = b2;
        this.f814F = f786a.mo1248a(this.f814F, -1);
        this.f814F = f808w.mo1248a(this.f814F, 0);
        this.f814F = f807v.mo1247a(this.f814F);
        this.f815G = -32766;
        this.f816H = null;
        this.f817I = null;
        this.f818J = null;
        this.f819K = C1256oca.m3285a(Haa.f368a);
        this.f820L = C1256oca.m3285a(Haa.f368a);
    }

    /* renamed from: a */
    public static int m896a(C1256oca oca) {
        return oca.mo4978c();
    }

    /* renamed from: a */
    public static Tca m897a(int i) {
        return Uca.m1284a(i);
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        int a = m896a(this.f819K);
        int a2 = m896a(this.f820L);
        jda.writeByte(this.f812D);
        jda.writeByte(this.f813E);
        jda.writeShort(a);
        jda.writeShort(a2);
        jda.writeInt(this.f814F);
        jda.writeShort(this.f815G);
        if (mo939i()) {
            jda.write(this.f816H.mo4652e());
        }
        if (mo938h()) {
            this.f817I.mo4580a(jda);
        }
        if (mo940j()) {
            this.f818J.mo4777a(jda);
        }
        this.f819K.mo4979c(jda);
        this.f820L.mo4979c(jda);
    }

    /* renamed from: a */
    public final boolean mo937a(Tca tca) {
        return tca.mo1258d(this.f814F);
    }

    public Object clone() {
        C0290NW nw = new C0290NW(this.f812D, this.f813E);
        nw.f814F = this.f814F;
        nw.f815G = this.f815G;
        if (mo939i()) {
            nw.f816H = (C0913lZ) this.f816H.clone();
        }
        if (mo938h()) {
            nw.f817I = (C0888kZ) this.f817I.clone();
        }
        if (mo940j()) {
            nw.f818J = (C0934mZ) this.f818J.clone();
        }
        C1256oca oca = this.f819K;
        oca.mo4974a();
        nw.f819K = oca;
        C1256oca oca2 = this.f819K;
        oca2.mo4974a();
        nw.f820L = oca2;
        return nw;
    }

    /* renamed from: e */
    public short mo34e() {
        return 433;
    }

    /* renamed from: g */
    public int mo36g() {
        int i = 0;
        int length = (mo939i() ? this.f816H.mo4652e().length : 0) + 12 + (mo938h() ? 8 : 0);
        if (mo940j()) {
            i = 4;
        }
        return length + i + m896a(this.f819K) + m896a(this.f820L);
    }

    /* renamed from: h */
    public boolean mo938h() {
        return mo937a(f811z);
    }

    /* renamed from: i */
    public boolean mo939i() {
        return mo937a(f809x);
    }

    /* renamed from: j */
    public boolean mo940j() {
        return mo937a(f783A);
    }

    /* renamed from: k */
    public int mo941k() {
        return this.f814F;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[CFRULE]\n");
        StringBuilder sb = new StringBuilder();
        sb.append("    .condition_type   =");
        sb.append(this.f812D);
        stringBuffer.append(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("    OPTION FLAGS=0x");
        sb2.append(Integer.toHexString(mo941k()));
        stringBuffer.append(sb2.toString());
        return stringBuffer.toString();
    }
}
