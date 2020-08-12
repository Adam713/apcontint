package p000;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.valdio.valdioveliu.recyclerview.SettingsActivity;

/* renamed from: kO */
class C0877kO implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AlertDialog f3205a;

    /* renamed from: b */
    public final /* synthetic */ SettingsActivity f3206b;

    public C0877kO(SettingsActivity settingsActivity, AlertDialog alertDialog) {
        this.f3206b = settingsActivity;
        this.f3205a = alertDialog;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f3205a.dismiss();
    }
}
