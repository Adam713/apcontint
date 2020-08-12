package p000;

import java.io.InputStream;
import java.rmi.UnexpectedException;

/* renamed from: hW */
public class C0824hW {
    /* renamed from: a */
    public static C0804gW m2757a(InputStream inputStream) {
        C0804gW gWVar = new C0804gW(inputStream);
        try {
            return gWVar.mo4431h() ? new C0910lW(gWVar) : gWVar.mo4430g() ? new C0466VV(gWVar) : gWVar;
        } catch (C0951nW e) {
            throw new UnexpectedException(e.toString());
        }
    }
}
