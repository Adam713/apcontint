package p000;

import android.widget.ExpandableListView.OnGroupExpandListener;

/* renamed from: fT */
class C0782fT implements OnGroupExpandListener {

    /* renamed from: a */
    public int f2966a = -1;

    /* renamed from: b */
    public final /* synthetic */ C0967oT f2967b;

    public C0782fT(C0967oT oTVar) {
        this.f2967b = oTVar;
    }

    public void onGroupExpand(int i) {
        if (i != this.f2966a) {
            this.f2967b.f3533l.collapseGroup(this.f2966a);
        }
        this.f2966a = i;
    }
}
