package p000;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: qK */
class C1006qK implements OnDateSetListener {

    /* renamed from: a */
    public final /* synthetic */ Customer_Det_List_edit f3602a;

    public C1006qK(Customer_Det_List_edit customer_Det_List_edit) {
        this.f3602a = customer_Det_List_edit;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        String str = "dd-MM-yyyy";
        String str2 = "-";
        String str3 = "%02d";
        this.f3602a.f2303k = i;
        this.f3602a.f2305l = i2;
        this.f3602a.f2307m = i3;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format(str3, new Object[]{Integer.valueOf(this.f3602a.f2307m)}));
            sb.append(str2);
            sb.append(String.format(str3, new Object[]{Integer.valueOf(this.f3602a.f2305l + 1)}));
            sb.append(str2);
            sb.append(this.f3602a.f2303k);
            String sb2 = sb.toString();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.ENGLISH);
            this.f3602a.f2315q.setText(new SimpleDateFormat(str, Locale.ENGLISH).format(Long.valueOf(simpleDateFormat.parse(sb2).getTime())));
        } catch (Exception unused) {
        }
    }
}
