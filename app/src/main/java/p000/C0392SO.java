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

/* renamed from: SO */
class C0392SO extends DialogFragment implements OnDateSetListener {

    /* renamed from: a */
    public final /* synthetic */ C1134wP f1155a;

    public C0392SO(C1134wP wPVar) {
        this.f1155a = wPVar;
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Calendar instance = Calendar.getInstance();
        DatePickerDialog datePickerDialog = new DatePickerDialog(getActivity(), this, instance.get(1), instance.get(2), instance.get(5));
        return datePickerDialog;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        String str = "yyyy-MM-dd";
        String str2 = "%02d";
        String str3 = "-";
        this.f1155a.f3939F = i;
        this.f1155a.f3940G = i2;
        this.f1155a.f3941H = i3;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f1155a.f3939F);
            sb.append(str3);
            sb.append(String.format(str2, new Object[]{Integer.valueOf(this.f1155a.f3940G + 1)}));
            sb.append(str3);
            sb.append(String.format(str2, new Object[]{Integer.valueOf(this.f1155a.f3941H)}));
            String sb2 = sb.toString();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.ENGLISH);
            this.f1155a.f3958Y.setText(new SimpleDateFormat(str, Locale.ENGLISH).format(Long.valueOf(simpleDateFormat.parse(sb2).getTime())));
            this.f1155a.f3956W = this.f1155a.f3958Y.getText().toString();
        } catch (Exception unused) {
        }
    }
}
