package p000;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.Calendar;

/* renamed from: JP */
class C0190JP implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0523YQ f433a;

    public C0190JP(C0523YQ yq) {
        this.f433a = yq;
    }

    public void onClick(View view) {
        try {
            C1181yR yRVar = new C1181yR();
            Calendar.getInstance();
            Bundle bundle = new Bundle();
            bundle.putInt("year", this.f433a.f1532R);
            bundle.putInt("month", this.f433a.f1534S);
            bundle.putInt("day", this.f433a.f1536T);
            yRVar.setArguments(bundle);
            yRVar.mo5468a(this.f433a.f1552ab);
            yRVar.show(this.f433a.getActivity().getSupportFragmentManager(), "Date Picker");
        } catch (Exception unused) {
        }
    }
}
