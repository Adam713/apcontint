package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;

/* renamed from: eL */
class C0751eL implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ Customer_Det_List_edit2 f2903a;

    public C0751eL(Customer_Det_List_edit2 customer_Det_List_edit2) {
        this.f2903a = customer_Det_List_edit2;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        try {
            this.f2903a.f2377i = Integer.parseInt(((TextView) view.findViewById(2131296680)).getText().toString());
            this.f2903a.f2358X = ((TextView) view.findViewById(2131296679)).getText().toString();
            TextView textView = (TextView) view.findViewById(2131296675);
            this.f2903a.f2359Y = textView.getText().toString();
            String str = "";
            this.f2903a.f2364ba = textView.getTag() != null ? textView.getTag().toString() : str;
            TextView textView2 = (TextView) view.findViewById(2131296682);
            this.f2903a.f2360Z = textView2.getText().toString();
            Customer_Det_List_edit2 customer_Det_List_edit2 = this.f2903a;
            if (textView2.getTag() != null) {
                str = textView2.getTag().toString();
            }
            customer_Det_List_edit2.f2362aa = str;
            this.f2903a.f2366ca = Integer.parseInt(((ImageView) view.findViewById(2131296495)).getTag().toString());
            this.f2903a.mo3686S();
        } catch (Exception unused) {
        }
    }
}
