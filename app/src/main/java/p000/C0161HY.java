package p000;

/* renamed from: HY */
public final class C0161HY extends C0080DY {

    /* renamed from: a */
    public short f363a;

    /* renamed from: b */
    public String f364b = null;

    /* renamed from: c */
    public String[] f365c = null;

    /* renamed from: d */
    public boolean f366d;

    public C0161HY(boolean z, short s) {
        this.f363a = s;
        this.f366d = z;
    }

    /* renamed from: a */
    public static String m321a(String str) {
        return str.substring(1);
    }

    /* renamed from: b */
    public static C0161HY m322b(short s) {
        return new C0161HY(false, s);
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f363a);
        if (mo354j()) {
            qda.m3371a(jda, this.f364b);
            int i = 0;
            while (true) {
                String[] strArr = this.f365c;
                if (i < strArr.length) {
                    qda.m3371a(jda, strArr[i]);
                    i++;
                } else {
                    return;
                }
            }
        } else {
            jda.writeShort(this.f366d ? 14849 : 1025);
        }
    }

    /* renamed from: e */
    public short mo34e() {
        return 430;
    }

    /* renamed from: g */
    public int mo36g() {
        if (!mo354j()) {
            return 4;
        }
        int a = qda.m3367a(this.f364b) + 2;
        int i = 0;
        while (true) {
            String[] strArr = this.f365c;
            if (i >= strArr.length) {
                return a;
            }
            a += qda.m3367a(strArr[i]);
            i++;
        }
    }

    /* renamed from: h */
    public String[] mo352h() {
        return (String[]) this.f365c.clone();
    }

    /* renamed from: i */
    public String mo353i() {
        String str = this.f364b;
        char charAt = str.charAt(0);
        return charAt != 0 ? charAt != 1 ? charAt != 2 ? str : str.substring(1) : m321a(str) : str.substring(1);
    }

    /* renamed from: j */
    public boolean mo354j() {
        return this.f365c != null;
    }

    /* renamed from: k */
    public boolean mo355k() {
        return this.f365c == null && !this.f366d;
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(C0161HY.class.getName());
        stringBuffer.append(" [SUPBOOK ");
        if (mo354j()) {
            stringBuffer.append("External References");
            stringBuffer.append(" nSheets=");
            stringBuffer.append(this.f363a);
            stringBuffer.append(" url=");
            str = this.f364b;
        } else if (this.f366d) {
            str = "Add-In Functions";
        } else {
            stringBuffer.append("Internal References ");
            stringBuffer.append(" nSheets= ");
            stringBuffer.append(this.f363a);
            stringBuffer.append("]");
            return stringBuffer.toString();
        }
        stringBuffer.append(str);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
