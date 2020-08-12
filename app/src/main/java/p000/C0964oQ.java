package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: oQ */
class C0964oQ implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0523YQ f3509a;

    public C0964oQ(C0523YQ yq) {
        this.f3509a = yq;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        try {
            this.f3509a.f1571h = Integer.parseInt(((TextView) view.findViewById(2131296680)).getText().toString());
            this.f3509a.f1574i = ((TextView) view.findViewById(2131296679)).getText().toString();
            TextView textView = (TextView) view.findViewById(2131296675);
            this.f3509a.f1577j = textView.getText().toString();
            String str = "";
            this.f3509a.f1589n = textView.getTag() != null ? textView.getTag().toString() : str;
            TextView textView2 = (TextView) view.findViewById(2131296682);
            this.f3509a.f1580k = textView2.getText().toString();
            C0523YQ yq = this.f3509a;
            if (textView2.getTag() != null) {
                str = textView2.getTag().toString();
            }
            yq.f1583l = str;
            this.f3509a.f1586m = Integer.parseInt(((ImageView) view.findViewById(2131296495)).getTag().toString());
            this.f3509a.mo1535Q();
        } catch (Exception unused) {
        }
    }
}
