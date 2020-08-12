package p000;

import android.content.Context;
import java.io.InputStream;

/* renamed from: XG */
public class C0492XG extends C1064tH {

    /* renamed from: a */
    public final Context f1429a;

    public C0492XG(Context context) {
        this.f1429a = context;
    }

    /* renamed from: a */
    public C1065a mo759a(C1024rH rHVar, int i) {
        return new C1065a(mo1437c(rHVar), C0893d.DISK);
    }

    /* renamed from: a */
    public boolean mo760a(C1024rH rHVar) {
        return "content".equals(rHVar.f3649e.getScheme());
    }

    /* renamed from: c */
    public InputStream mo1437c(C1024rH rHVar) {
        return this.f1429a.getContentResolver().openInputStream(rHVar.f3649e);
    }
}
