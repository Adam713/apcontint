package p000;

import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnGroupClickListener;

/* renamed from: DT */
class C0075DT implements OnGroupClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0216KT f174a;

    public C0075DT(C0216KT kt) {
        this.f174a = kt;
    }

    public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
        ((C0777fO) this.f174a.f567m.f1832b.get(i)).mo4351a(this.f174a.mo692b(((C0777fO) this.f174a.f567m.f1832b.get(i)).mo4355e()));
        this.f174a.f567m.notifyDataSetChanged();
        return false;
    }
}
