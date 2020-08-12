package p000;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.valdio.valdioveliu.recyclerview.SettingsActivity.SecurityPreferenceFragment;

/* renamed from: xO */
class C1159xO implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AlertDialog f4091a;

    /* renamed from: b */
    public final /* synthetic */ SecurityPreferenceFragment f4092b;

    public C1159xO(SecurityPreferenceFragment securityPreferenceFragment, AlertDialog alertDialog) {
        this.f4092b = securityPreferenceFragment;
        this.f4091a = alertDialog;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f4091a.dismiss();
    }
}
