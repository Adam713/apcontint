package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;

/* renamed from: uH */
public class C1085uH extends C1064tH {

    /* renamed from: a */
    public final Context f3817a;

    public C1085uH(Context context) {
        this.f3817a = context;
    }

    /* renamed from: a */
    public static Bitmap m3503a(Resources resources, int i, C1024rH rHVar) {
        Options b = C1064tH.m3456b(rHVar);
        if (C1064tH.m3455a(b)) {
            BitmapFactory.decodeResource(resources, i, b);
            C1064tH.m3454a(rHVar.f3653i, rHVar.f3654j, b, rHVar);
        }
        return BitmapFactory.decodeResource(resources, i, b);
    }

    /* renamed from: a */
    public C1065a mo759a(C1024rH rHVar, int i) {
        Resources a = C0039CH.m88a(this.f3817a, rHVar);
        return new C1065a(m3503a(a, C0039CH.m85a(a, rHVar), rHVar), C0893d.DISK);
    }

    /* renamed from: a */
    public boolean mo760a(C1024rH rHVar) {
        if (rHVar.f3650f != 0) {
            return true;
        }
        return "android.resource".equals(rHVar.f3649e.getScheme());
    }
}
