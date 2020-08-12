package p000;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_All;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: yJ */
class C1173yJ implements OnDateSetListener {

    /* renamed from: a */
    public final /* synthetic */ Customer_Det_List_All f4135a;

    public C1173yJ(Customer_Det_List_All customer_Det_List_All) {
        this.f4135a = customer_Det_List_All;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        String str = "yyyy-MM-dd";
        String str2 = "%02d";
        String str3 = "-";
        this.f4135a.f2219C = i;
        this.f4135a.f2220D = i2;
        this.f4135a.f2221E = i3;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f4135a.f2219C);
            sb.append(str3);
            sb.append(String.format(str2, new Object[]{Integer.valueOf(this.f4135a.f2220D + 1)}));
            sb.append(str3);
            sb.append(String.format(str2, new Object[]{Integer.valueOf(this.f4135a.f2221E)}));
            String sb2 = sb.toString();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.ENGLISH);
            this.f4135a.f2228L.setText(new SimpleDateFormat(str, Locale.ENGLISH).format(Long.valueOf(simpleDateFormat.parse(sb2).getTime())));
            this.f4135a.f2226J = this.f4135a.f2228L.getText().toString();
        } catch (Exception unused) {
        }
    }
}
