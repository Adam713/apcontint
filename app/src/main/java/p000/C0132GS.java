package p000;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.Calendar;

/* renamed from: GS */
class C0132GS implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0239LS f287a;

    public C0132GS(C0239LS ls) {
        this.f287a = ls;
    }

    public void onClick(View view) {
        try {
            C1181yR yRVar = new C1181yR();
            Calendar.getInstance();
            Bundle bundle = new Bundle();
            bundle.putInt("year", this.f287a.f627E);
            bundle.putInt("month", this.f287a.f628F);
            bundle.putInt("day", this.f287a.f629G);
            yRVar.setArguments(bundle);
            yRVar.mo5468a(this.f287a.f635M);
            yRVar.show(this.f287a.getActivity().getSupportFragmentManager(), "Date Picker");
        } catch (Exception unused) {
        }
    }
}
