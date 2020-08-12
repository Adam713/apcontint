package p000;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import java.util.Calendar;

/* renamed from: wQ */
class C1141wQ implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0523YQ f4013a;

    public C1141wQ(C0523YQ yq) {
        this.f4013a = yq;
    }

    public void onClick(View view) {
        try {
            C1181yR yRVar = new C1181yR();
            Calendar.getInstance();
            Bundle bundle = new Bundle();
            bundle.putInt("year", this.f4013a.f1532R);
            bundle.putInt("month", this.f4013a.f1534S);
            bundle.putInt("day", this.f4013a.f1536T);
            yRVar.setArguments(bundle);
            yRVar.mo5468a(this.f4013a.f1550_a);
            yRVar.show(this.f4013a.getActivity().getSupportFragmentManager(), "Date Picker");
        } catch (Exception e) {
            Toast.makeText(this.f4013a.getActivity(), e.getMessage(), 1).show();
        }
    }
}
