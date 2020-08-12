package p000;

import android.widget.ExpandableListView.OnGroupExpandListener;

/* renamed from: xT */
class C1164xT implements OnGroupExpandListener {

    /* renamed from: a */
    public int f4102a = -1;

    /* renamed from: b */
    public final /* synthetic */ C0216KT f4103b;

    public C1164xT(C0216KT kt) {
        this.f4103b = kt;
    }

    public void onGroupExpand(int i) {
        if (i != this.f4102a) {
            this.f4103b.f566l.collapseGroup(this.f4102a);
        }
        this.f4102a = i;
    }
}
