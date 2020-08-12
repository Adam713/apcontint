package p000;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: jQ */
class C0859jQ implements OnDateSetListener {

    /* renamed from: a */
    public final /* synthetic */ C0523YQ f3161a;

    public C0859jQ(C0523YQ yq) {
        this.f3161a = yq;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        Object[] objArr = {Integer.valueOf(i3)};
        String str = "%02d";
        sb.append(String.format(str, objArr));
        String str2 = "-";
        sb.append(str2);
        sb.append(String.format(str, new Object[]{Integer.valueOf(i2 + 1)}));
        sb.append(str2);
        sb.append(i);
        String sb2 = sb.toString();
        String str3 = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str3, Locale.ENGLISH);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str3, Locale.ENGLISH);
        try {
            this.f3161a.f1507Ea.setText(simpleDateFormat2.format(Long.valueOf(simpleDateFormat.parse(sb2).getTime())));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
