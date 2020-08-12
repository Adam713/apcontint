package p000;

/* renamed from: kaa reason: case insensitive filesystem */
public final class C1242kaa {
    /* renamed from: a */
    public static String m2920a(C1265rca rca, int i, String str) {
        StringBuffer stringBuffer;
        C0935a b = rca.mo5011b(i);
        if (b != null) {
            String b2 = b.mo4802b();
            String a = b.mo4801a();
            stringBuffer = new StringBuffer(b2.length() + a.length() + str.length() + 4);
            Qaa.m1065a(stringBuffer, b2, a);
        } else {
            String a2 = rca.mo5008a(i);
            stringBuffer = new StringBuffer(a2.length() + str.length() + 4);
            if (a2.length() < 1) {
                stringBuffer.append("#REF");
            } else {
                Qaa.m1069b(stringBuffer, a2);
            }
        }
        stringBuffer.append('!');
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
