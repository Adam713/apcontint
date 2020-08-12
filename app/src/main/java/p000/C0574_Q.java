package p000;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.valdio.valdioveliu.recyclerview.frag.Calculator;

/* renamed from: _Q */
class C0574_Q implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Calculator f1733a;

    public C0574_Q(Calculator calculator) {
        this.f1733a = calculator;
    }

    public void onClick(View view) {
        if (this.f1733a.f2685d && !this.f1733a.f2686e) {
            this.f1733a.f2684c.append(((Button) view).getText());
            this.f1733a.f2685d = false;
            this.f1733a.f2687f = false;
        }
    }
}
