package p000;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.Calendar;

/* renamed from: FS */
class C0112FS implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0239LS f252a;

    public C0112FS(C0239LS ls) {
        this.f252a = ls;
    }

    public void onClick(View view) {
        StringBuilder sb = new StringBuilder();
        sb.append(view.getId());
        sb.append(":");
        sb.append(2131296451);
        Log.d("Date Picker=", sb.toString());
        try {
            C1181yR yRVar = new C1181yR();
            Calendar.getInstance();
            Bundle bundle = new Bundle();
            bundle.putInt("year", this.f252a.f627E);
            bundle.putInt("month", this.f252a.f628F);
            bundle.putInt("day", this.f252a.f629G);
            yRVar.setArguments(bundle);
            yRVar.mo5468a(this.f252a.f634L);
            yRVar.show(this.f252a.getActivity().getSupportFragmentManager(), "Date Picker");
        } catch (Exception e) {
            Log.d("Date error=", e.getMessage());
        }
    }
}
