package p000;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;
import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport;

/* renamed from: XR */
class C0504XR implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0925mS f1449a;

    public C0504XR(C0925mS mSVar) {
        this.f1449a = mSVar;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        try {
            String charSequence = ((TextView) view.findViewById(2131296385)).getText().toString();
            String charSequence2 = ((TextView) view.findViewById(2131296317)).getText().toString();
            String charSequence3 = ((TextView) view.findViewById(2131296389)).getText().toString();
            TextView textView = (TextView) view.findViewById(2131296394);
            String obj = textView.getTag() != null ? textView.getTag().toString() : "";
            String charSequence4 = textView.getText().toString();
            Intent intent = new Intent(view.getContext(), FragmentStatePagerSupport.class);
            intent.putExtra("CUS_ID", charSequence);
            intent.putExtra("CUS_BAL", charSequence2);
            intent.putExtra("CUS_GSM", charSequence3);
            intent.putExtra("CUS_NAME", charSequence4);
            this.f1449a.f3378i = this.f1449a.f3372c.mo615s(charSequence);
            intent.putExtra("g_id", this.f1449a.f3378i);
            intent.putExtra("CURR_NAME", obj);
            intent.putExtras(this.f1449a.f3365V);
            C0925mS.f3343a = this.f1449a.f3381l.getFirstVisiblePosition();
            this.f1449a.startActivity(intent);
        } catch (Exception unused) {
        }
    }
}
