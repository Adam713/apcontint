package p000;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Looper;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings.System;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/* renamed from: CH */
public final class C0039CH {

    /* renamed from: a */
    public static final StringBuilder f82a = new StringBuilder();

    @TargetApi(11)
    /* renamed from: CH$a */
    private static class C0040a {
        /* renamed from: a */
        public static int m108a(ActivityManager activityManager) {
            return activityManager.getLargeMemoryClass();
        }
    }

    @TargetApi(12)
    /* renamed from: CH$b */
    private static class C0041b {
        /* renamed from: a */
        public static int m109a(Bitmap bitmap) {
            return bitmap.getByteCount();
        }
    }

    /* renamed from: CH$c */
    private static class C0042c {
        /* renamed from: a */
        public static C0593aH m110a(Context context) {
            return new C0850jH(context);
        }
    }

    /* renamed from: CH$d */
    private static class C0043d extends Thread {
        public C0043d(Runnable runnable) {
            super(runnable);
        }

        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    /* renamed from: CH$e */
    static class C0044e implements ThreadFactory {
        public Thread newThread(Runnable runnable) {
            return new C0043d(runnable);
        }
    }

    /* renamed from: a */
    public static int m84a(Context context) {
        ActivityManager activityManager = (ActivityManager) m89a(context, "activity");
        boolean z = (context.getApplicationInfo().flags & 1048576) != 0;
        int memoryClass = activityManager.getMemoryClass();
        if (z && VERSION.SDK_INT >= 11) {
            memoryClass = C0040a.m108a(activityManager);
        }
        return (memoryClass * 1048576) / 7;
    }

    /* renamed from: a */
    public static int m85a(Resources resources, C1024rH rHVar) {
        int i;
        if (rHVar.f3650f == 0) {
            Uri uri = rHVar.f3649e;
            if (uri != null) {
                String authority = uri.getAuthority();
                if (authority != null) {
                    List pathSegments = rHVar.f3649e.getPathSegments();
                    if (pathSegments == null || pathSegments.isEmpty()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("No path segments: ");
                        sb.append(rHVar.f3649e);
                        throw new FileNotFoundException(sb.toString());
                    }
                    if (pathSegments.size() == 1) {
                        try {
                            i = Integer.parseInt((String) pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Last path segment is not a resource ID: ");
                            sb2.append(rHVar.f3649e);
                            throw new FileNotFoundException(sb2.toString());
                        }
                    } else if (pathSegments.size() == 2) {
                        i = resources.getIdentifier((String) pathSegments.get(1), (String) pathSegments.get(0), authority);
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("More than two path segments: ");
                        sb3.append(rHVar.f3649e);
                        throw new FileNotFoundException(sb3.toString());
                    }
                    return i;
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("No package provided: ");
                sb4.append(rHVar.f3649e);
                throw new FileNotFoundException(sb4.toString());
            }
        }
        return rHVar.f3650f;
    }

    /* renamed from: a */
    public static int m86a(Bitmap bitmap) {
        int a = VERSION.SDK_INT >= 12 ? C0041b.m109a(bitmap) : bitmap.getRowBytes() * bitmap.getHeight();
        if (a >= 0) {
            return a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Negative size: ");
        sb.append(bitmap);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public static long m87a(File file) {
        long j;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j = (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 50;
        } catch (IllegalArgumentException unused) {
            j = 5242880;
        }
        return Math.max(Math.min(j, 52428800), 5242880);
    }

    /* renamed from: a */
    public static Resources m88a(Context context, C1024rH rHVar) {
        if (rHVar.f3650f == 0) {
            Uri uri = rHVar.f3649e;
            if (uri != null) {
                String authority = uri.getAuthority();
                if (authority != null) {
                    try {
                        return context.getPackageManager().getResourcesForApplication(authority);
                    } catch (NameNotFoundException unused) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unable to obtain resources for package: ");
                        sb.append(rHVar.f3649e);
                        throw new FileNotFoundException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("No package provided: ");
                    sb2.append(rHVar.f3649e);
                    throw new FileNotFoundException(sb2.toString());
                }
            }
        }
        return context.getResources();
    }

    /* renamed from: a */
    public static <T> T m89a(Context context, String str) {
        return context.getSystemService(str);
    }

    /* renamed from: a */
    public static <T> T m90a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static String m91a(C0382SG sg) {
        return m92a(sg, "");
    }

    /* renamed from: a */
    public static String m92a(C0382SG sg, String str) {
        StringBuilder sb = new StringBuilder(str);
        C0202KG c = sg.mo1160c();
        if (c != null) {
            sb.append(c.f501b.mo5049d());
        }
        List d = sg.mo1161d();
        if (d != null) {
            int size = d.size();
            for (int i = 0; i < size; i++) {
                if (i > 0 || c != null) {
                    sb.append(", ");
                }
                sb.append(((C0202KG) d.get(i)).f501b.mo5049d());
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m93a(C1024rH rHVar) {
        String a = m94a(rHVar, f82a);
        f82a.setLength(0);
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0091  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static String m94a(p000.C1024rH r4, StringBuilder r5) {
        /*
            java.lang.String r0 = r4.f3651g
            r1 = 50
            if (r0 == 0) goto L_0x0014
            int r0 = r0.length()
            int r0 = r0 + r1
            r5.ensureCapacity(r0)
            java.lang.String r0 = r4.f3651g
        L_0x0010:
            r5.append(r0)
            goto L_0x002d
        L_0x0014:
            android.net.Uri r0 = r4.f3649e
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = r0.toString()
            int r2 = r0.length()
            int r2 = r2 + r1
            r5.ensureCapacity(r2)
            goto L_0x0010
        L_0x0025:
            r5.ensureCapacity(r1)
            int r0 = r4.f3650f
            r5.append(r0)
        L_0x002d:
            r0 = 10
            r5.append(r0)
            float r1 = r4.f3658n
            r2 = 0
            r3 = 120(0x78, float:1.68E-43)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x005e
            java.lang.String r1 = "rotation:"
            r5.append(r1)
            float r1 = r4.f3658n
            r5.append(r1)
            boolean r1 = r4.f3661q
            if (r1 == 0) goto L_0x005b
            r1 = 64
            r5.append(r1)
            float r1 = r4.f3659o
            r5.append(r1)
            r5.append(r3)
            float r1 = r4.f3660p
            r5.append(r1)
        L_0x005b:
            r5.append(r0)
        L_0x005e:
            boolean r1 = r4.mo5048c()
            if (r1 == 0) goto L_0x0079
            java.lang.String r1 = "resize:"
            r5.append(r1)
            int r1 = r4.f3653i
            r5.append(r1)
            r5.append(r3)
            int r1 = r4.f3654j
            r5.append(r1)
            r5.append(r0)
        L_0x0079:
            boolean r1 = r4.f3655k
            if (r1 == 0) goto L_0x0086
            java.lang.String r1 = "centerCrop"
        L_0x007f:
            r5.append(r1)
            r5.append(r0)
            goto L_0x008d
        L_0x0086:
            boolean r1 = r4.f3656l
            if (r1 == 0) goto L_0x008d
            java.lang.String r1 = "centerInside"
            goto L_0x007f
        L_0x008d:
            java.util.List<yH> r1 = r4.f3652h
            if (r1 == 0) goto L_0x00ad
            r2 = 0
            int r1 = r1.size()
        L_0x0096:
            if (r2 >= r1) goto L_0x00ad
            java.util.List<yH> r3 = r4.f3652h
            java.lang.Object r3 = r3.get(r2)
            yH r3 = (p000.C1171yH) r3
            java.lang.String r3 = r3.key()
            r5.append(r3)
            r5.append(r0)
            int r2 = r2 + 1
            goto L_0x0096
        L_0x00ad:
            java.lang.String r4 = r5.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0039CH.m94a(rH, java.lang.StringBuilder):java.lang.String");
    }

    /* renamed from: a */
    public static void m95a() {
        if (!m102b()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    /* renamed from: a */
    public static void m96a(Looper looper) {
        C0020BH bh = new C0020BH(looper);
        bh.sendMessageDelayed(bh.obtainMessage(), 1000);
    }

    /* renamed from: a */
    public static void m97a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m98a(String str, String str2, String str3) {
        m99a(str, str2, str3, "");
    }

    /* renamed from: a */
    public static void m99a(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", objArr));
    }

    /* renamed from: a */
    public static boolean m100a(String str) {
        boolean z = false;
        if (str == null) {
            return false;
        }
        String[] split = str.split(" ", 2);
        if ("CACHE".equals(split[0])) {
            return true;
        }
        if (split.length == 1) {
            return false;
        }
        try {
            if ("CONDITIONAL_CACHE".equals(split[0]) && Integer.parseInt(split[1]) == 304) {
                z = true;
            }
        } catch (NumberFormatException unused) {
        }
        return z;
    }

    /* renamed from: b */
    public static File m101b(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: b */
    public static boolean m102b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: b */
    public static boolean m103b(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* renamed from: b */
    public static boolean m104b(InputStream inputStream) {
        byte[] bArr = new byte[12];
        if (inputStream.read(bArr, 0, 12) != 12) {
            return false;
        }
        String str = "US-ASCII";
        if (!"RIFF".equals(new String(bArr, 0, 4, str))) {
            return false;
        }
        return "WEBP".equals(new String(bArr, 8, 4, str));
    }

    /* renamed from: c */
    public static C0593aH m105c(Context context) {
        try {
            Class.forName("com.squareup.okhttp.OkHttpClient");
            return C0042c.m110a(context);
        } catch (ClassNotFoundException unused) {
            return new C0000AH(context);
        }
    }

    /* renamed from: c */
    public static byte[] m106c(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: d */
    public static boolean m107d(Context context) {
        try {
            return System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (NullPointerException unused) {
            return false;
        }
    }
}
