package p000;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: UI */
class C0428UI implements OnDateSetListener {

    /* renamed from: a */
    public final /* synthetic */ Customer_Det_List f1210a;

    public C0428UI(Customer_Det_List customer_Det_List) {
        this.f1210a = customer_Det_List;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        String str = "yyyy-MM-dd";
        String str2 = "%02d";
        String str3 = "-";
        this.f1210a.f2174C = i;
        this.f1210a.f2175D = i2;
        this.f1210a.f2176E = i3;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f1210a.f2174C);
            sb.append(str3);
            sb.append(String.format(str2, new Object[]{Integer.valueOf(this.f1210a.f2175D + 1)}));
            sb.append(str3);
            sb.append(String.format(str2, new Object[]{Integer.valueOf(this.f1210a.f2176E)}));
            String sb2 = sb.toString();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.ENGLISH);
            this.f1210a.f2189R.setText(new SimpleDateFormat(str, Locale.ENGLISH).format(Long.valueOf(simpleDateFormat.parse(sb2).getTime())));
            this.f1210a.f2187P = this.f1210a.f2189R.getText().toString();
        } catch (Exception unused) {
        }
    }
}
