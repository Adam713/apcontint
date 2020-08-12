package p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.valdio.valdioveliu.recyclerview.frag.Calculator;

/* renamed from: eR */
class C0757eR implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Calculator f2917a;

    public C0757eR(Calculator calculator) {
        this.f2917a = calculator;
    }

    public void onClick(View view) {
        int length = this.f2917a.f2684c.getText().length();
        if (!this.f2917a.f2686e && length >= 1) {
            int i = length - 1;
            String str = ".";
            String str2 = "-";
            String str3 = "/";
            String str4 = "+";
            String str5 = "*";
            if (this.f2917a.f2684c.getText().toString().substring(i, length).equals(str) || this.f2917a.f2684c.getText().toString().substring(i, length).equals(str5) || this.f2917a.f2684c.getText().toString().substring(i, length).equals(str4) || this.f2917a.f2684c.getText().toString().substring(i, length).equals(str3) || this.f2917a.f2684c.getText().toString().substring(i, length).equals(str2)) {
                this.f2917a.f2687f = false;
                this.f2917a.f2685d = true;
            }
            this.f2917a.f2684c.setText(this.f2917a.f2684c.getText().toString().substring(0, i));
            int length2 = this.f2917a.f2684c.getText().length();
            if (length2 >= 1) {
                int i2 = length2 - 1;
                if (this.f2917a.f2684c.getText().toString().substring(i2, length2).equals(str)) {
                    this.f2917a.f2687f = true;
                } else if (this.f2917a.f2684c.getText().toString().substring(i2, length2).equals(str5) || this.f2917a.f2684c.getText().toString().substring(i2, length2).equals(str4) || this.f2917a.f2684c.getText().toString().substring(i2, length2).equals(str3) || this.f2917a.f2684c.getText().toString().substring(i2, length2).equals(str2)) {
                    this.f2917a.f2687f = false;
                } else {
                    return;
                }
                this.f2917a.f2685d = false;
            }
        }
    }
}
