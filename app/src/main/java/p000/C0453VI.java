package p000;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: VI */
class C0453VI implements OnDateSetListener {

    /* renamed from: a */
    public final /* synthetic */ Customer_Det_List f1307a;

    public C0453VI(Customer_Det_List customer_Det_List) {
        this.f1307a = customer_Det_List;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        String str = "yyyy-MM-dd";
        String str2 = "%02d";
        String str3 = "-";
        this.f1307a.f2174C = i;
        this.f1307a.f2175D = i2;
        this.f1307a.f2176E = i3;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f1307a.f2174C);
            sb.append(str3);
            sb.append(String.format(str2, new Object[]{Integer.valueOf(this.f1307a.f2175D + 1)}));
            sb.append(str3);
            sb.append(String.format(str2, new Object[]{Integer.valueOf(this.f1307a.f2176E)}));
            String sb2 = sb.toString();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.ENGLISH);
            this.f1307a.f2190S.setText(new SimpleDateFormat(str, Locale.ENGLISH).format(Long.valueOf(simpleDateFormat.parse(sb2).getTime())));
            this.f1307a.f2188Q = this.f1307a.f2190S.getText().toString();
        } catch (Exception unused) {
        }
    }
}
