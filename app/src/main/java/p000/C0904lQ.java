package p000;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: lQ */
class C0904lQ implements OnDateSetListener {

    /* renamed from: a */
    public final /* synthetic */ C0523YQ f3289a;

    public C0904lQ(C0523YQ yq) {
        this.f3289a = yq;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        String str = "-";
        sb.append(str);
        Object[] objArr = {Integer.valueOf(i2 + 1)};
        String str2 = "%02d";
        sb.append(String.format(str2, objArr));
        sb.append(str);
        sb.append(String.format(str2, new Object[]{Integer.valueOf(i3)}));
        String sb2 = sb.toString();
        String str3 = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str3, Locale.ENGLISH);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str3, Locale.ENGLISH);
        try {
            this.f3289a.f1499Aa.setText(simpleDateFormat2.format(Long.valueOf(simpleDateFormat.parse(sb2).getTime())));
            this.f3289a.f1613ya = this.f3289a.f1499Aa.getText().toString();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
