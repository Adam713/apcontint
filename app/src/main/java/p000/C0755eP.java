package p000;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.widget.DatePicker;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: eP */
class C0755eP extends DialogFragment implements OnDateSetListener {

    /* renamed from: a */
    public final /* synthetic */ C1134wP f2914a;

    public C0755eP(C1134wP wPVar) {
        this.f2914a = wPVar;
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Calendar instance = Calendar.getInstance();
        DatePickerDialog datePickerDialog = new DatePickerDialog(getActivity(), this, instance.get(1), instance.get(2), instance.get(5));
        return datePickerDialog;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        String str = "dd-MM-yyyy";
        String str2 = "-";
        String str3 = "%02d";
        this.f2914a.f3939F = i;
        this.f2914a.f3940G = i2;
        this.f2914a.f3941H = i3;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format(str3, new Object[]{Integer.valueOf(this.f2914a.f3941H)}));
            sb.append(str2);
            sb.append(String.format(str3, new Object[]{Integer.valueOf(this.f2914a.f3940G + 1)}));
            sb.append(str2);
            sb.append(this.f2914a.f3939F);
            String sb2 = sb.toString();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.ENGLISH);
            this.f2914a.f3966da.setText(new SimpleDateFormat(str, Locale.ENGLISH).format(Long.valueOf(simpleDateFormat.parse(sb2).getTime())));
        } catch (Exception unused) {
        }
    }
}
