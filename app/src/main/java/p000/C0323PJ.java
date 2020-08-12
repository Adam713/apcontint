package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit;

/* renamed from: PJ */
class C0323PJ implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ Customer_Det_List_edit f929a;

    public C0323PJ(Customer_Det_List_edit customer_Det_List_edit) {
        this.f929a = customer_Det_List_edit;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        try {
            this.f929a.f2299i = Integer.parseInt(((TextView) view.findViewById(2131296680)).getText().toString());
            this.f929a.f2280X = ((TextView) view.findViewById(2131296679)).getText().toString();
            TextView textView = (TextView) view.findViewById(2131296675);
            this.f929a.f2281Y = textView.getText().toString();
            String str = "";
            this.f929a.f2286ba = textView.getTag() != null ? textView.getTag().toString() : str;
            TextView textView2 = (TextView) view.findViewById(2131296682);
            this.f929a.f2282Z = textView2.getText().toString();
            Customer_Det_List_edit customer_Det_List_edit = this.f929a;
            if (textView2.getTag() != null) {
                str = textView2.getTag().toString();
            }
            customer_Det_List_edit.f2284aa = str;
            this.f929a.f2288ca = Integer.parseInt(((ImageView) view.findViewById(2131296495)).getTag().toString());
            this.f929a.mo3591J();
        } catch (Exception unused) {
        }
    }
}
