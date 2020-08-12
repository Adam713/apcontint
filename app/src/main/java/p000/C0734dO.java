package p000;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import android.widget.TextView;
import com.valdio.valdioveliu.recyclerview.Report3_customer_date;

/* renamed from: dO */
class C0734dO implements OnDateSetListener {

    /* renamed from: a */
    public final /* synthetic */ Report3_customer_date f2860a;

    public C0734dO(Report3_customer_date report3_customer_date) {
        this.f2860a = report3_customer_date;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        this.f2860a.f2645d = i;
        this.f2860a.f2646e = i2;
        this.f2860a.f2647f = i3;
        TextView textView = this.f2860a.f2650i;
        StringBuilder sb = new StringBuilder();
        String str = "%02d";
        sb.append(String.format(str, new Object[]{Integer.valueOf(this.f2860a.f2647f)}));
        String str2 = "-";
        sb.append(str2);
        sb.append(String.format(str, new Object[]{Integer.valueOf(this.f2860a.f2646e + 1)}));
        sb.append(str2);
        sb.append(this.f2860a.f2645d);
        textView.setText(sb);
        this.f2860a.mo4048a();
    }
}
