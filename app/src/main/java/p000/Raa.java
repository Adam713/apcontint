package p000;

/* renamed from: Raa */
public final class Raa extends Paa {

    /* renamed from: c */
    public final boolean f1099c;

    /* renamed from: d */
    public final String f1100d;

    public Raa(hda hda) {
        int b = hda.mo404b();
        boolean z = true;
        if ((hda.readByte() & 1) == 0) {
            z = false;
        }
        this.f1099c = z;
        this.f1100d = this.f1099c ? qda.m3372b(hda, b) : qda.m3369a(hda, b);
    }

    /* renamed from: a */
    public void mo79a(jda jda) {
        jda.writeByte(mo356a() + 23);
        jda.writeByte(this.f1100d.length());
        jda.writeByte(this.f1099c ? 1 : 0);
        if (this.f1099c) {
            qda.m3373b(this.f1100d, jda);
        } else {
            qda.m3370a(this.f1100d, jda);
        }
    }

    /* renamed from: c */
    public int mo80c() {
        return (this.f1100d.length() * (this.f1099c ? 2 : 1)) + 3;
    }

    /* renamed from: e */
    public String mo81e() {
        String str = this.f1100d;
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length + 4);
        stringBuffer.append('\"');
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\"') {
                stringBuffer.append('\"');
            }
            stringBuffer.append(charAt);
        }
        stringBuffer.append('\"');
        return stringBuffer.toString();
    }
}
