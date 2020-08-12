package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;

/* renamed from: LG */
public class C0227LG extends C1064tH {

    /* renamed from: a */
    public static final int f598a = 22;

    /* renamed from: b */
    public final AssetManager f599b;

    public C0227LG(Context context) {
        this.f599b = context.getAssets();
    }

    /* renamed from: c */
    public static String m737c(C1024rH rHVar) {
        return rHVar.f3649e.toString().substring(f598a);
    }

    /* renamed from: a */
    public C1065a mo759a(C1024rH rHVar, int i) {
        return new C1065a(this.f599b.open(m737c(rHVar)), C0893d.DISK);
    }

    /* renamed from: a */
    public boolean mo760a(C1024rH rHVar) {
        Uri uri = rHVar.f3649e;
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty()) {
            return false;
        }
        return "android_asset".equals(uri.getPathSegments().get(0));
    }
}
