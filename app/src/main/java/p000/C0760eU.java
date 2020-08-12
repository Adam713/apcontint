package p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog.Builder;

/* renamed from: eU */
public class C0760eU {
    @TargetApi(16)
    /* renamed from: a */
    public static boolean m2615a(Context context) {
        if (VERSION.SDK_INT >= 23) {
            String str = "android.permission.READ_EXTERNAL_STORAGE";
            if (ContextCompat.checkSelfPermission(context, str) != 0) {
                Activity activity = (Activity) context;
                if (ActivityCompat.shouldShowRequestPermissionRationale(activity, str)) {
                    Builder builder = new Builder(context);
                    builder.setCancelable(true);
                    builder.setTitle("Permission necessary");
                    builder.setMessage("External storage permission is necessary");
                    builder.setPositiveButton(17039379, new C0740dU(context));
                    builder.create().show();
                } else {
                    ActivityCompat.requestPermissions(activity, new String[]{str}, 123);
                }
                return false;
            }
        }
        return true;
    }
}
