package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: pQ */
class C0993pQ implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0523YQ f3578a;

    public C0993pQ(C0523YQ yq) {
        this.f3578a = yq;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f3578a.f1501Ba.setText(adapterView.getItemAtPosition(i).toString());
        this.f3578a.mo1528J();
        this.f3578a.f1503Ca.requestFocus();
    }
}
