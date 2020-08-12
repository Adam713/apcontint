package p000;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.valdio.valdioveliu.recyclerview.frag.Calculator;

/* renamed from: ZQ */
class C0551ZQ implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Calculator f1660a;

    public C0551ZQ(Calculator calculator) {
        this.f1660a = calculator;
    }

    public void onClick(View view) {
        Button button = (Button) view;
        if (this.f1660a.f2686e) {
            this.f1660a.f2684c.setText(button.getText());
            this.f1660a.f2686e = false;
        } else {
            this.f1660a.f2684c.append(button.getText());
        }
        this.f1660a.f2685d = true;
    }
}
