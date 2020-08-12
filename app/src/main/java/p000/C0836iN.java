package p000;

import android.support.v7.widget.SearchView.OnQueryTextListener;
import android.text.TextUtils;
import com.valdio.valdioveliu.recyclerview.Report2_customer_late;

/* renamed from: iN */
class C0836iN implements OnQueryTextListener {

    /* renamed from: a */
    public final /* synthetic */ Report2_customer_late f3097a;

    public C0836iN(Report2_customer_late report2_customer_late) {
        this.f3097a = report2_customer_late;
    }

    public boolean onQueryTextChange(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f3097a.mo3897a(1);
        }
        this.f3097a.setSupportProgressBarIndeterminateVisibility(true);
        this.f3097a.mo3899a(str);
        this.f3097a.setSupportProgressBarIndeterminateVisibility(false);
        return false;
    }

    public boolean onQueryTextSubmit(String str) {
        this.f3097a.mo3897a(2);
        return false;
    }
}
