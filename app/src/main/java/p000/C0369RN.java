package p000;

import android.widget.ExpandableListView.OnGroupExpandListener;
import com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp;

/* renamed from: RN */
class C0369RN implements OnGroupExpandListener {

    /* renamed from: a */
    public int f1080a = -1;

    /* renamed from: b */
    public final /* synthetic */ Report3_balance_month_exp f1081b;

    public C0369RN(Report3_balance_month_exp report3_balance_month_exp) {
        this.f1081b = report3_balance_month_exp;
    }

    public void onGroupExpand(int i) {
        if (i != this.f1080a) {
            this.f1081b.f2624i.collapseGroup(this.f1080a);
        }
        this.f1080a = i;
    }
}
