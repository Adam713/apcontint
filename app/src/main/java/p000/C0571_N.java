package p000;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: _N */
class C0571_N implements OnDateSetListener {

    /* renamed from: a */
    public final /* synthetic */ Report3_balance_month_exp f1730a;

    public C0571_N(Report3_balance_month_exp report3_balance_month_exp) {
        this.f1730a = report3_balance_month_exp;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        String str = "yyyy-MM-dd";
        String str2 = "%02d";
        String str3 = "-";
        this.f1730a.f2605B = i;
        this.f1730a.f2606C = i2;
        this.f1730a.f2607D = i3;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f1730a.f2605B);
            sb.append(str3);
            sb.append(String.format(str2, new Object[]{Integer.valueOf(this.f1730a.f2606C + 1)}));
            sb.append(str3);
            sb.append(String.format(str2, new Object[]{Integer.valueOf(this.f1730a.f2607D)}));
            String sb2 = sb.toString();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.ENGLISH);
            this.f1730a.f2612I.setText(new SimpleDateFormat(str, Locale.ENGLISH).format(Long.valueOf(simpleDateFormat.parse(sb2).getTime())));
            this.f1730a.f2610G = this.f1730a.f2612I.getText().toString();
        } catch (Exception unused) {
        }
    }
}
