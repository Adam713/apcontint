package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: cP */
class C0646cP implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ C1134wP f1946a;

    public C0646cP(C1134wP wPVar) {
        this.f1946a = wPVar;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        try {
            TextView textView = (TextView) view.findViewById(2131296680);
            this.f1946a.f3969f = Integer.parseInt(textView.getText().toString());
            TextView textView2 = (TextView) view.findViewById(2131296679);
            this.f1946a.f3971g = textView2.getText().toString();
            TextView textView3 = (TextView) view.findViewById(2131296675);
            this.f1946a.f3973h = textView3.getText().toString();
            TextView textView4 = (TextView) view.findViewById(2131296682);
            this.f1946a.f3975i = textView4.getText().toString();
            ImageView imageView = (ImageView) view.findViewById(2131296495);
            this.f1946a.f3977j = Integer.parseInt(imageView.getTag().toString());
            this.f1946a.mo5293a(false);
        } catch (Exception unused) {
        }
    }
}
