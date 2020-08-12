package p000;

import android.widget.ExpandableListView.OnGroupExpandListener;

/* renamed from: SS */
class C0396SS implements OnGroupExpandListener {

    /* renamed from: a */
    public int f1161a = -1;

    /* renamed from: b */
    public final /* synthetic */ C0576_S f1162b;

    public C0396SS(C0576_S _s) {
        this.f1162b = _s;
    }

    public void onGroupExpand(int i) {
        if (i != this.f1161a) {
            this.f1162b.f1755l.collapseGroup(this.f1161a);
        }
        this.f1161a = i;
    }
}
