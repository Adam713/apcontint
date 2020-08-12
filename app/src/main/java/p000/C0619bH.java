package p000;

import android.content.Context;
import android.media.ExifInterface;
import android.net.Uri;

/* renamed from: bH */
public class C0619bH extends C0492XG {
    public C0619bH(Context context) {
        super(context);
    }

    /* renamed from: a */
    public static int m1815a(Uri uri) {
        int attributeInt = new ExifInterface(uri.getPath()).getAttributeInt("Orientation", 1);
        if (attributeInt == 3) {
            return 180;
        }
        if (attributeInt != 6) {
            return attributeInt != 8 ? 0 : 270;
        }
        return 90;
    }

    /* renamed from: a */
    public C1065a mo759a(C1024rH rHVar, int i) {
        return new C1065a(null, mo1437c(rHVar), C0893d.DISK, m1815a(rHVar.f3649e));
    }

    /* renamed from: a */
    public boolean mo760a(C1024rH rHVar) {
        return "file".equals(rHVar.f3649e.getScheme());
    }
}
