package p000;

import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnGroupClickListener;
import com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp;

/* renamed from: VN */
class C0458VN implements OnGroupClickListener {

    /* renamed from: a */
    public final /* synthetic */ Report3_balance_month_exp f1312a;

    public C0458VN(Report3_balance_month_exp report3_balance_month_exp) {
        this.f1312a = report3_balance_month_exp;
    }

    public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
        ((C0777fO) this.f1312a.f2625j.f1832b.get(i)).mo4351a(this.f1312a.mo4006b(((C0777fO) this.f1312a.f2625j.f1832b.get(i)).mo4355e()));
        this.f1312a.f2625j.notifyDataSetChanged();
        return false;
    }
}
