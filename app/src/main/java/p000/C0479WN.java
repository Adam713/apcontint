package p000;

import android.support.v7.widget.SearchView.OnQueryTextListener;
import android.text.TextUtils;
import com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp;

/* renamed from: WN */
class C0479WN implements OnQueryTextListener {

    /* renamed from: a */
    public final /* synthetic */ Report3_balance_month_exp f1374a;

    public C0479WN(Report3_balance_month_exp report3_balance_month_exp) {
        this.f1374a = report3_balance_month_exp;
    }

    public boolean onQueryTextChange(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f1374a.mo4000a(1);
        }
        this.f1374a.setSupportProgressBarIndeterminateVisibility(true);
        this.f1374a.mo4010c(str);
        this.f1374a.setSupportProgressBarIndeterminateVisibility(false);
        return false;
    }

    public boolean onQueryTextSubmit(String str) {
        this.f1374a.mo4000a(2);
        this.f1374a.mo4009c();
        return false;
    }
}
