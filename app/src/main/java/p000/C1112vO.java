package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.valdio.valdioveliu.recyclerview.SettingsActivity.SecurityPreferenceFragment;

/* renamed from: vO */
class C1112vO implements TextWatcher {

    /* renamed from: a */
    public final /* synthetic */ EditText f3870a;

    /* renamed from: b */
    public final /* synthetic */ EditText f3871b;

    /* renamed from: c */
    public final /* synthetic */ String f3872c;

    /* renamed from: d */
    public final /* synthetic */ int f3873d;

    /* renamed from: e */
    public final /* synthetic */ TextView f3874e;

    /* renamed from: f */
    public final /* synthetic */ SecurityPreferenceFragment f3875f;

    public C1112vO(SecurityPreferenceFragment securityPreferenceFragment, EditText editText, EditText editText2, String str, int i, TextView textView) {
        this.f3875f = securityPreferenceFragment;
        this.f3870a = editText;
        this.f3871b = editText2;
        this.f3872c = str;
        this.f3873d = i;
        this.f3874e = textView;
    }

    public void afterTextChanged(Editable editable) {
        TextView textView;
        int i;
        String obj = this.f3870a.getText().toString();
        this.f3871b.getText().toString();
        if (!obj.equals(this.f3872c) && this.f3873d >= 1) {
            textView = this.f3874e;
            i = 2131755376;
        } else if (this.f3873d >= 1) {
            textView = this.f3874e;
            i = 2131755375;
        } else {
            this.f3874e.setText("");
            return;
        }
        textView.setText(i);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
