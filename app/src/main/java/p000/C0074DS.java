package p000;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: DS */
class C0074DS implements OnDateSetListener {

    /* renamed from: a */
    public final /* synthetic */ C0239LS f173a;

    public C0074DS(C0239LS ls) {
        this.f173a = ls;
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
            this.f173a.f639Q.setText(simpleDateFormat2.format(Long.valueOf(simpleDateFormat.parse(sb2).getTime())));
            this.f173a.f637O = this.f173a.f639Q.getText().toString();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
