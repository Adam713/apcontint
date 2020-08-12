package p000;

import android.support.v7.widget.SearchView.OnQueryTextListener;
import com.valdio.valdioveliu.recyclerview.Report3_balance_month;

/* renamed from: BN */
class C0026BN implements OnQueryTextListener {

    /* renamed from: a */
    public final /* synthetic */ Report3_balance_month f49a;

    public C0026BN(Report3_balance_month report3_balance_month) {
        this.f49a = report3_balance_month;
    }

    public boolean onQueryTextChange(String str) {
        this.f49a.mo3970a(str);
        return false;
    }

    public boolean onQueryTextSubmit(String str) {
        return false;
    }
}
