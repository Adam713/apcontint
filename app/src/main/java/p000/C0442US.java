package p000;

import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnGroupClickListener;

/* renamed from: US */
class C0442US implements OnGroupClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0576_S f1261a;

    public C0442US(C0576_S _s) {
        this.f1261a = _s;
    }

    public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
        ((C0208KL) this.f1261a.f1756m.f1438b.get(i)).mo670a(this.f1261a.mo1751b(((C0208KL) this.f1261a.f1756m.f1438b.get(i)).mo675f()));
        this.f1261a.f1756m.notifyDataSetChanged();
        return false;
    }
}
