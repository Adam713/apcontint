package p000;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.view.ContextThemeWrapper;
import android.widget.DatePicker;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: yT */
class C1183yT extends DialogFragment implements OnDateSetListener {

    /* renamed from: a */
    public final /* synthetic */ C0216KT f4156a;

    public C1183yT(C0216KT kt) {
        this.f4156a = kt;
    }

    /* renamed from: a */
    public final boolean mo5477a() {
        return Build.MANUFACTURER.equalsIgnoreCase("samsung") && mo5478a(21, 22);
    }

    /* renamed from: a */
    public final boolean mo5478a(int i, int i2) {
        int i3 = VERSION.SDK_INT;
        return i3 >= i && i3 <= i2;
    }

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        Activity activity = getActivity();
        if (mo5477a()) {
            activity = new ContextThemeWrapper(getActivity(), 16973939);
        }
        Activity activity2 = activity;
        Calendar instance = Calendar.getInstance();
        DatePickerDialog datePickerDialog = new DatePickerDialog(activity2, this, instance.get(1), instance.get(2), instance.get(5));
        return datePickerDialog;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        String str = "yyyy-MM-dd";
        String str2 = "%02d";
        String str3 = "-";
        this.f4156a.f543E = i;
        this.f4156a.f544F = i2;
        this.f4156a.f545G = i3;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f4156a.f543E);
            sb.append(str3);
            sb.append(String.format(str2, new Object[]{Integer.valueOf(this.f4156a.f544F + 1)}));
            sb.append(str3);
            sb.append(String.format(str2, new Object[]{Integer.valueOf(this.f4156a.f545G)}));
            String sb2 = sb.toString();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.ENGLISH);
            this.f4156a.f550L.setText(new SimpleDateFormat(str, Locale.ENGLISH).format(Long.valueOf(simpleDateFormat.parse(sb2).getTime())));
            this.f4156a.f548J = this.f4156a.f550L.getText().toString();
        } catch (Exception e) {
            Toast.makeText(getActivity(), e.getMessage(), 1).show();
        }
    }
}
