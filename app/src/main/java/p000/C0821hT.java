package p000;

import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnGroupClickListener;

/* renamed from: hT */
class C0821hT implements OnGroupClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0967oT f3054a;

    public C0821hT(C0967oT oTVar) {
        this.f3054a = oTVar;
    }

    public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
        ((C0208KL) this.f3054a.f3534m.f1651b.get(i)).mo670a(this.f3054a.mo4923b(((C0208KL) this.f3054a.f3534m.f1651b.get(i)).mo675f()));
        this.f3054a.f3534m.notifyDataSetChanged();
        return false;
    }
}
