package p000;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import java.util.Calendar;

/* renamed from: KP */
class C0212KP implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0523YQ f534a;

    public C0212KP(C0523YQ yq) {
        this.f534a = yq;
    }

    public void onClick(View view) {
        try {
            C1181yR yRVar = new C1181yR();
            Calendar.getInstance();
            Bundle bundle = new Bundle();
            bundle.putInt("year", this.f534a.f1532R);
            bundle.putInt("month", this.f534a.f1534S);
            bundle.putInt("day", this.f534a.f1536T);
            yRVar.setArguments(bundle);
            yRVar.mo5468a(this.f534a.f1555bb);
            yRVar.show(this.f534a.getActivity().getSupportFragmentManager(), "Date Picker");
        } catch (Exception e) {
            Toast.makeText(this.f534a.getActivity(), e.getMessage(), 1).show();
        }
    }
}
