package p000;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.provider.MediaStore.Images;
import android.provider.MediaStore.Video.Thumbnails;

/* renamed from: fH */
public class C0769fH extends C0492XG {

    /* renamed from: b */
    public static final String[] f2938b = {"orientation"};

    /* renamed from: fH$a */
    enum C0770a {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);
        

        /* renamed from: e */
        public final int f2943e;

        /* renamed from: f */
        public final int f2944f;

        /* renamed from: g */
        public final int f2945g;

        /* access modifiers changed from: public */
        C0770a(int i, int i2, int i3) {
            this.f2943e = i;
            this.f2944f = i2;
            this.f2945g = i3;
        }
    }

    public C0769fH(Context context) {
        super(context);
    }

    /* renamed from: a */
    public static int m2644a(ContentResolver contentResolver, Uri uri) {
        Cursor cursor = null;
        try {
            Cursor query = contentResolver.query(uri, f2938b, null, null, null);
            if (query != null) {
                if (query.moveToFirst()) {
                    int i = query.getInt(0);
                    if (query != null) {
                        query.close();
                    }
                    return i;
                }
            }
            if (query != null) {
                query.close();
            }
            return 0;
        } catch (RuntimeException unused) {
            if (cursor != null) {
                cursor.close();
            }
            return 0;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static C0770a m2645a(int i, int i2) {
        C0770a aVar = C0770a.MICRO;
        if (i <= aVar.f2944f && i2 <= aVar.f2945g) {
            return aVar;
        }
        C0770a aVar2 = C0770a.MINI;
        return (i > aVar2.f2944f || i2 > aVar2.f2945g) ? C0770a.FULL : aVar2;
    }

    /* renamed from: a */
    public C1065a mo759a(C1024rH rHVar, int i) {
        Bitmap bitmap;
        C1024rH rHVar2 = rHVar;
        ContentResolver contentResolver = this.f1429a.getContentResolver();
        int a = m2644a(contentResolver, rHVar2.f3649e);
        String type = contentResolver.getType(rHVar2.f3649e);
        boolean z = type != null && type.startsWith("video/");
        if (rHVar.mo5048c()) {
            C0770a a2 = m2645a(rHVar2.f3653i, rHVar2.f3654j);
            if (!z && a2 == C0770a.FULL) {
                return new C1065a(null, mo1437c(rHVar), C0893d.DISK, a);
            }
            long parseId = ContentUris.parseId(rHVar2.f3649e);
            Options b = C1064tH.m3456b(rHVar);
            b.inJustDecodeBounds = true;
            Options options = b;
            C1064tH.m3453a(rHVar2.f3653i, rHVar2.f3654j, a2.f2944f, a2.f2945g, b, rHVar);
            if (z) {
                bitmap = Thumbnails.getThumbnail(contentResolver, parseId, a2 == C0770a.FULL ? 1 : a2.f2943e, options);
            } else {
                bitmap = Images.Thumbnails.getThumbnail(contentResolver, parseId, a2.f2943e, options);
            }
            if (bitmap != null) {
                return new C1065a(bitmap, null, C0893d.DISK, a);
            }
        }
        return new C1065a(null, mo1437c(rHVar), C0893d.DISK, a);
    }

    /* renamed from: a */
    public boolean mo760a(C1024rH rHVar) {
        Uri uri = rHVar.f3649e;
        if ("content".equals(uri.getScheme())) {
            if ("media".equals(uri.getAuthority())) {
                return true;
            }
        }
        return false;
    }
}
