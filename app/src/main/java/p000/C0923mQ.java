package p000;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import java.util.Calendar;

/* renamed from: mQ */
class C0923mQ implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0523YQ f3341a;

    public C0923mQ(C0523YQ yq) {
        this.f3341a = yq;
    }

    public void onClick(View view) {
        try {
            C1181yR yRVar = new C1181yR();
            Calendar.getInstance();
            Bundle bundle = new Bundle();
            bundle.putInt("year", this.f3341a.f1532R);
            bundle.putInt("month", this.f3341a.f1534S);
            bundle.putInt("day", this.f3341a.f1536T);
            yRVar.setArguments(bundle);
            yRVar.mo5468a(this.f3341a.f1550_a);
            yRVar.show(this.f3341a.getActivity().getSupportFragmentManager(), "Date Picker");
        } catch (Exception e) {
            Toast.makeText(this.f3341a.getActivity(), e.getMessage(), 1).show();
        }
    }
}
