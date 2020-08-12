package p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.valdio.valdioveliu.recyclerview.CustomerList;

/* renamed from: OH */
class C0297OH implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ CustomerList f849a;

    public C0297OH(CustomerList customerList) {
        this.f849a = customerList;
    }

    public void onClick(View view) {
        this.f849a.phone_pick_btn(view);
    }
}
