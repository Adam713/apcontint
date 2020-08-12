package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: VU */
public class C0465VU {

    /* renamed from: a */
    public static int f1322a = 1;

    /* renamed from: b */
    public static int f1323b = 2;

    /* renamed from: c */
    public static int f1324c;

    /* renamed from: a */
    public static int m1286a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            if (activeNetworkInfo.getType() == 1) {
                return f1322a;
            }
            if (activeNetworkInfo.getType() == 0) {
                return f1323b;
            }
        }
        return f1324c;
    }

    /* renamed from: b */
    public static int m1287b(Context context) {
        int a = m1286a(context);
        if (a == f1322a) {
            return 1;
        }
        if (a == f1323b) {
            return 2;
        }
        int i = f1324c;
        return 0;
    }
}
