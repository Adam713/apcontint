package p000;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.Calendar;

/* renamed from: nQ */
class C0945nQ implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0523YQ f3425a;

    public C0945nQ(C0523YQ yq) {
        this.f3425a = yq;
    }

    public void onClick(View view) {
        try {
            C1181yR yRVar = new C1181yR();
            Calendar.getInstance();
            Bundle bundle = new Bundle();
            bundle.putInt("year", this.f3425a.f1532R);
            bundle.putInt("month", this.f3425a.f1534S);
            bundle.putInt("day", this.f3425a.f1536T);
            yRVar.setArguments(bundle);
            yRVar.mo5468a(this.f3425a.f1550_a);
            yRVar.show(this.f3425a.getActivity().getSupportFragmentManager(), "Date Picker");
        } catch (Exception e) {
            Log.d("Date_error=", e.getMessage());
        }
    }
}
