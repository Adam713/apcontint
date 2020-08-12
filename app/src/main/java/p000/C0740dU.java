package p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.v4.app.ActivityCompat;

/* renamed from: dU */
class C0740dU implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Context f2866a;

    public C0740dU(Context context) {
        this.f2866a = context;
    }

    @TargetApi(16)
    public void onClick(DialogInterface dialogInterface, int i) {
        ActivityCompat.requestPermissions((Activity) this.f2866a, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 123);
    }
}
