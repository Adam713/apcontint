package p000;

import android.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;
import com.valdio.valdioveliu.recyclerview.SettingsActivity;

/* renamed from: jO */
class C0857jO implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f3157a;

    /* renamed from: b */
    public final /* synthetic */ AlertDialog f3158b;

    /* renamed from: c */
    public final /* synthetic */ SettingsActivity f3159c;

    public C0857jO(SettingsActivity settingsActivity, EditText editText, AlertDialog alertDialog) {
        this.f3159c = settingsActivity;
        this.f3157a = editText;
        this.f3158b = alertDialog;
    }

    public void onClick(View view) {
        try {
            if (this.f3159c.f2661e.mo602o(C0195JU.f445e, C0195JU.f446f) == 0) {
                this.f3159c.mo4061a(this.f3157a.getText().toString(), this.f3158b);
                return;
            }
            Toast.makeText(this.f3159c.getApplicationContext(), "Already Activated!", 0).show();
            this.f3158b.dismiss();
        } catch (Exception e) {
            Toast.makeText(this.f3159c.getApplicationContext(), e.getMessage(), 1).show();
        }
    }
}
