package p000;

import android.content.Context;
import android.net.Uri;
import android.net.http.HttpResponseCache;
import android.os.Build.VERSION;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: AH */
public class C0000AH implements C0593aH {

    /* renamed from: a */
    public static volatile Object f0a;

    /* renamed from: b */
    public static final Object f1b = new Object();

    /* renamed from: c */
    public static final ThreadLocal<StringBuilder> f2c = new C1193zH();

    /* renamed from: d */
    public final Context f3d;

    /* renamed from: AH$a */
    private static class C0001a {
        /* renamed from: a */
        public static Object m3a(Context context) {
            File b = C0039CH.m101b(context);
            HttpResponseCache installed = HttpResponseCache.getInstalled();
            return installed == null ? HttpResponseCache.install(b, C0039CH.m87a(b)) : installed;
        }
    }

    public C0000AH(Context context) {
        this.f3d = context.getApplicationContext();
    }

    /* renamed from: a */
    public static void m0a(Context context) {
        if (f0a == null) {
            try {
                synchronized (f1b) {
                    if (f0a == null) {
                        f0a = C0001a.m3a(context);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public C0594a mo1a(Uri uri, int i) {
        String str;
        if (VERSION.SDK_INT >= 14) {
            m0a(this.f3d);
        }
        HttpURLConnection a = mo2a(uri);
        a.setUseCaches(true);
        if (i != 0) {
            if (C0809hH.m2751a(i)) {
                str = "only-if-cached,max-age=2147483647";
            } else {
                StringBuilder sb = (StringBuilder) f2c.get();
                sb.setLength(0);
                if (!C0809hH.m2752b(i)) {
                    sb.append("no-cache");
                }
                if (!C0809hH.m2753c(i)) {
                    if (sb.length() > 0) {
                        sb.append(',');
                    }
                    sb.append("no-store");
                }
                str = sb.toString();
            }
            a.setRequestProperty("Cache-Control", str);
        }
        int responseCode = a.getResponseCode();
        if (responseCode < 300) {
            long headerFieldInt = (long) a.getHeaderFieldInt("Content-Length", -1);
            return new C0594a(a.getInputStream(), C0039CH.m100a(a.getHeaderField("X-Android-Response-Source")), headerFieldInt);
        }
        a.disconnect();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(responseCode);
        sb2.append(" ");
        sb2.append(a.getResponseMessage());
        throw new C0595b(sb2.toString(), i, responseCode);
    }

    /* renamed from: a */
    public HttpURLConnection mo2a(Uri uri) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(20000);
        return httpURLConnection;
    }
}
