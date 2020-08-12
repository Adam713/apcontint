package p000;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: BL */
class C0024BL implements OnDateSetListener {

    /* renamed from: a */
    public final /* synthetic */ Customer_Det_List_edit2 f47a;

    public C0024BL(Customer_Det_List_edit2 customer_Det_List_edit2) {
        this.f47a = customer_Det_List_edit2;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        String str = "dd-MM-yyyy";
        String str2 = "-";
        String str3 = "%02d";
        this.f47a.f2381k = i;
        this.f47a.f2383l = i2;
        this.f47a.f2385m = i3;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format(str3, new Object[]{Integer.valueOf(this.f47a.f2385m)}));
            sb.append(str2);
            sb.append(String.format(str3, new Object[]{Integer.valueOf(this.f47a.f2383l + 1)}));
            sb.append(str2);
            sb.append(this.f47a.f2381k);
            String sb2 = sb.toString();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.ENGLISH);
            this.f47a.f2395r.setText(new SimpleDateFormat(str, Locale.ENGLISH).format(Long.valueOf(simpleDateFormat.parse(sb2).getTime())));
        } catch (Exception unused) {
        }
    }
}
