package p000;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.ContactsContract.Contacts;
import java.io.InputStream;

/* renamed from: WG */
public class C0471WG extends C1064tH {

    /* renamed from: a */
    public static final UriMatcher f1366a = new UriMatcher(-1);

    /* renamed from: b */
    public final Context f1367b;

    @TargetApi(14)
    /* renamed from: WG$a */
    private static class C0472a {
        /* renamed from: a */
        public static InputStream m1353a(ContentResolver contentResolver, Uri uri) {
            return Contacts.openContactPhotoInputStream(contentResolver, uri, true);
        }
    }

    static {
        String str = "com.android.contacts";
        f1366a.addURI(str, "contacts/lookup/*/#", 1);
        f1366a.addURI(str, "contacts/lookup/*", 1);
        f1366a.addURI(str, "contacts/#/photo", 2);
        f1366a.addURI(str, "contacts/#", 3);
        f1366a.addURI(str, "display_photo/#", 4);
    }

    public C0471WG(Context context) {
        this.f1367b = context;
    }

    /* renamed from: a */
    public C1065a mo759a(C1024rH rHVar, int i) {
        InputStream c = mo1397c(rHVar);
        if (c != null) {
            return new C1065a(c, C0893d.DISK);
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo760a(C1024rH rHVar) {
        Uri uri = rHVar.f3649e;
        return "content".equals(uri.getScheme()) && Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f1366a.match(rHVar.f3649e) != -1;
    }

    /* renamed from: c */
    public final InputStream mo1397c(C1024rH rHVar) {
        ContentResolver contentResolver = this.f1367b.getContentResolver();
        Uri uri = rHVar.f3649e;
        int match = f1366a.match(uri);
        if (match != 1) {
            if (match != 2) {
                if (match != 3) {
                    if (match != 4) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid uri: ");
                        sb.append(uri);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            }
            return contentResolver.openInputStream(uri);
        }
        uri = Contacts.lookupContact(contentResolver, uri);
        if (uri == null) {
            return null;
        }
        return VERSION.SDK_INT < 14 ? Contacts.openContactPhotoInputStream(contentResolver, uri) : C0472a.m1353a(contentResolver, uri);
    }
}
