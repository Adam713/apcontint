package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: qQ */
class C1012qQ implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0523YQ f3608a;

    public C1012qQ(C0523YQ yq) {
        this.f3608a = yq;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f3608a.f1503Ca.setText(adapterView.getItemAtPosition(i).toString());
        this.f3608a.mo1528J();
        this.f3608a.f1505Da.requestFocus();
    }
}
