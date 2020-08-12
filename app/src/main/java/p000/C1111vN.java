package p000;

import android.support.v7.widget.SearchView.OnQueryTextListener;
import android.text.TextUtils;
import com.valdio.valdioveliu.recyclerview.Report2_customer_late_exp;

/* renamed from: vN */
class C1111vN implements OnQueryTextListener {

    /* renamed from: a */
    public final /* synthetic */ Report2_customer_late_exp f3869a;

    public C1111vN(Report2_customer_late_exp report2_customer_late_exp) {
        this.f3869a = report2_customer_late_exp;
    }

    public boolean onQueryTextChange(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f3869a.mo3929a(1);
        }
        this.f3869a.setSupportProgressBarIndeterminateVisibility(true);
        this.f3869a.mo3937c(str);
        this.f3869a.setSupportProgressBarIndeterminateVisibility(false);
        return false;
    }

    public boolean onQueryTextSubmit(String str) {
        this.f3869a.mo3929a(2);
        this.f3869a.mo3934b();
        return false;
    }
}
