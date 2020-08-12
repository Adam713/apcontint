package p000;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Build.VERSION;
import android.preference.Preference;
import android.preference.SwitchPreference;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;
import com.valdio.valdioveliu.recyclerview.SettingsActivity;
import com.valdio.valdioveliu.recyclerview.SettingsActivity.SecurityPreferenceFragment;

/* renamed from: yO */
class C1178yO implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f4142a;

    /* renamed from: b */
    public final /* synthetic */ EditText f4143b;

    /* renamed from: c */
    public final /* synthetic */ String f4144c;

    /* renamed from: d */
    public final /* synthetic */ int f4145d;

    /* renamed from: e */
    public final /* synthetic */ AlertDialog f4146e;

    /* renamed from: f */
    public final /* synthetic */ SecurityPreferenceFragment f4147f;

    public C1178yO(SecurityPreferenceFragment securityPreferenceFragment, EditText editText, EditText editText2, String str, int i, AlertDialog alertDialog) {
        this.f4147f = securityPreferenceFragment;
        this.f4142a = editText;
        this.f4143b = editText2;
        this.f4144c = str;
        this.f4145d = i;
        this.f4146e = alertDialog;
    }

    public void onClick(View view) {
        Preference findPreference;
        Toast makeText;
        String str = "prefLogin";
        try {
            String obj = this.f4142a.getText().toString();
            String obj2 = this.f4143b.getText().toString();
            if (!(obj.equals(this.f4144c) & (obj2.length() >= 4)) || !(this.f4145d == 1)) {
                if (!(obj2.length() >= 4) || !(this.f4145d == 0)) {
                    if (!obj.equals(this.f4144c) || !(this.f4145d == 2)) {
                        if ((obj2.length() < 4) && (this.f4145d != 2)) {
                            makeText = Toast.makeText(this.f4147f.getActivity(), this.f4147f.getString(2131755355), 0);
                        } else {
                            if ((!obj.equals(this.f4144c)) && (this.f4145d >= 1)) {
                                makeText = Toast.makeText(this.f4147f.getActivity(), this.f4147f.getString(2131755376), 0);
                            } else {
                                return;
                            }
                        }
                        makeText.show();
                        return;
                    }
                }
            }
            String str2 = "prefPassword";
            if (this.f4145d != 2) {
                Activity activity = this.f4147f.getActivity();
                StringBuilder sb = new StringBuilder();
                sb.append("Matching passwords=");
                sb.append(obj2);
                Toast.makeText(activity, sb.toString(), 0).show();
                this.f4147f.mo4109b(str2, obj2);
                findPreference = this.f4147f.findPreference(str2);
            } else {
                this.f4147f.mo4109b(str2, "");
                findPreference = this.f4147f.findPreference(str2);
            }
            SettingsActivity.m2469b(findPreference);
            if (this.f4145d == 0) {
                this.f4147f.mo4108a(str, true);
                SwitchPreference switchPreference = (SwitchPreference) this.f4147f.findPreference(str);
                if (VERSION.SDK_INT >= 14) {
                    switchPreference.setChecked(true);
                }
            }
            this.f4146e.dismiss();
        } catch (Exception e) {
            Toast.makeText(this.f4147f.getActivity(), e.getMessage(), 1).show();
        }
    }
}
