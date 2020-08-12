package p000;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.valdio.valdioveliu.recyclerview.frag.Calculator;

/* renamed from: aR */
class C0609aR implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Calculator f1841a;

    public C0609aR(Calculator calculator) {
        this.f1841a = calculator;
    }

    public void onClick(View view) {
        TextView textView;
        String str;
        if (!this.f1841a.f2686e && !this.f1841a.f2687f) {
            if (this.f1841a.f2685d) {
                textView = this.f1841a.f2684c;
                str = ".";
            } else {
                textView = this.f1841a.f2684c;
                str = "0.";
            }
            textView.append(str);
            this.f1841a.f2685d = false;
            this.f1841a.f2687f = true;
        }
    }
}
