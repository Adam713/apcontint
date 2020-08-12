package p000;

import android.app.Dialog;
import android.content.Context;
import android.content.OperationApplicationException;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;

/* renamed from: tU */
class C1078tU implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f3787a;

    /* renamed from: b */
    public final /* synthetic */ Context f3788b;

    /* renamed from: c */
    public final /* synthetic */ String f3789c;

    /* renamed from: d */
    public final /* synthetic */ Dialog f3790d;

    /* renamed from: e */
    public final /* synthetic */ C0195JU f3791e;

    public C1078tU(C0195JU ju, int i, Context context, String str, Dialog dialog) {
        this.f3791e = ju;
        this.f3787a = i;
        this.f3788b = context;
        this.f3789c = str;
        this.f3790d = dialog;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        StringBuilder sb;
        String str;
        String str2 = ":";
        String str3 = "contacts_err=";
        TextView textView = (TextView) view.findViewById(2131296664);
        int i2 = this.f3787a;
        if (i2 == 0) {
            try {
                this.f3791e.mo535b(this.f3788b, textView.getText().toString().trim(), textView.getText().toString().trim());
            } catch (RemoteException e) {
                sb = new StringBuilder();
                sb.append(textView.getText().toString().trim());
                sb.append(str2);
                str = e.getMessage();
            } catch (OperationApplicationException e2) {
                sb = new StringBuilder();
                sb.append(textView.getText().toString().trim());
                sb.append(str2);
                str = e2.getMessage();
            }
            this.f3791e.mo637z(textView.getText().toString().trim(), this.f3789c);
        } else if (i2 == 1) {
            this.f3791e.mo634y(textView.getText().toString().trim(), this.f3789c);
        }
        this.f3790d.dismiss();
        sb.append(str);
        Log.d(str3, sb.toString());
        this.f3791e.mo637z(textView.getText().toString().trim(), this.f3789c);
        this.f3790d.dismiss();
    }
}
