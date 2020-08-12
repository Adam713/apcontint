package p000;

/* renamed from: DW */
public final class C0078DW extends C0080DY {

    /* renamed from: a */
    public int f176a;

    /* renamed from: b */
    public int f177b;

    /* renamed from: c */
    public int f178c;

    /* renamed from: d */
    public int f179d;

    /* renamed from: e */
    public int f180e;

    /* renamed from: f */
    public int f181f;

    /* renamed from: a */
    public void mo149a(int i) {
        this.f178c = i;
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(mo161n());
        jda.writeShort(mo159l());
        jda.writeShort(mo155h());
        jda.writeShort(mo156i());
        jda.writeInt(mo157j());
        jda.writeInt(mo158k());
    }

    /* renamed from: b */
    public void mo150b(int i) {
        this.f179d = i;
    }

    /* renamed from: c */
    public void mo151c(int i) {
        this.f180e = i;
    }

    public Object clone() {
        C0078DW dw = new C0078DW();
        dw.f176a = this.f176a;
        dw.f177b = this.f177b;
        dw.f178c = this.f178c;
        dw.f179d = this.f179d;
        dw.f180e = this.f180e;
        dw.f181f = this.f181f;
        return dw;
    }

    /* renamed from: d */
    public void mo152d(int i) {
        this.f181f = i;
    }

    /* renamed from: e */
    public short mo34e() {
        return 2057;
    }

    /* renamed from: e */
    public void mo153e(int i) {
        this.f177b = i;
    }

    /* renamed from: f */
    public void mo154f(int i) {
        this.f176a = i;
    }

    /* renamed from: g */
    public int mo36g() {
        return 16;
    }

    /* renamed from: h */
    public int mo155h() {
        return this.f178c;
    }

    /* renamed from: i */
    public int mo156i() {
        return this.f179d;
    }

    /* renamed from: j */
    public int mo157j() {
        return this.f180e;
    }

    /* renamed from: k */
    public int mo158k() {
        return this.f181f;
    }

    /* renamed from: l */
    public int mo159l() {
        return this.f177b;
    }

    /* renamed from: m */
    public final String mo160m() {
        int i = this.f177b;
        return i != 5 ? i != 6 ? i != 16 ? i != 32 ? i != 64 ? i != 256 ? "#error unknown type#" : "workspace file" : "excel 4 macro" : "chart" : "worksheet" : "vb module" : "workbook";
    }

    /* renamed from: n */
    public int mo161n() {
        return this.f176a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[BOF RECORD]\n");
        stringBuffer.append("    .version  = ");
        stringBuffer.append(Yca.m1602c(mo161n()));
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("    .type     = ");
        stringBuffer.append(Yca.m1602c(mo159l()));
        stringBuffer.append(" (");
        stringBuffer.append(mo160m());
        stringBuffer.append(")");
        stringBuffer.append(str);
        stringBuffer.append("    .build    = ");
        stringBuffer.append(Yca.m1602c(mo155h()));
        stringBuffer.append(str);
        stringBuffer.append("    .buildyear= ");
        stringBuffer.append(mo156i());
        stringBuffer.append(str);
        stringBuffer.append("    .history  = ");
        stringBuffer.append(Yca.m1598b(mo157j()));
        stringBuffer.append(str);
        stringBuffer.append("    .reqver   = ");
        stringBuffer.append(Yca.m1598b(mo158k()));
        stringBuffer.append(str);
        stringBuffer.append("[/BOF RECORD]\n");
        return stringBuffer.toString();
    }
}
