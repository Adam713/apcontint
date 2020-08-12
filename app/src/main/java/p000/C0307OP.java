package p000;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.Calendar;

/* renamed from: OP */
class C0307OP implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0523YQ f882a;

    public C0307OP(C0523YQ yq) {
        this.f882a = yq;
    }

    public void onClick(View view) {
        try {
            C1181yR yRVar = new C1181yR();
            Calendar.getInstance();
            Bundle bundle = new Bundle();
            bundle.putInt("year", this.f882a.f1532R);
            bundle.putInt("month", this.f882a.f1534S);
            bundle.putInt("day", this.f882a.f1536T);
            yRVar.setArguments(bundle);
            yRVar.mo5468a(this.f882a.f1555bb);
            yRVar.show(this.f882a.getActivity().getSupportFragmentManager(), "Date Picker");
        } catch (Exception unused) {
        }
    }
}
