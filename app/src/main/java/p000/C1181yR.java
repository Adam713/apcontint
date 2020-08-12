package p000;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.view.ContextThemeWrapper;
import java.util.Calendar;

/* renamed from: yR */
public class C1181yR extends DialogFragment {

    /* renamed from: a */
    public OnDateSetListener f4151a;

    /* renamed from: b */
    public int f4152b;

    /* renamed from: c */
    public int f4153c;

    /* renamed from: d */
    public int f4154d;

    /* renamed from: a */
    public void mo5468a(OnDateSetListener onDateSetListener) {
        this.f4151a = onDateSetListener;
    }

    /* renamed from: a */
    public final boolean mo5469a() {
        return Build.MANUFACTURER.equalsIgnoreCase("samsung") && mo5470a(21, 22);
    }

    /* renamed from: a */
    public final boolean mo5470a(int i, int i2) {
        int i3 = VERSION.SDK_INT;
        return i3 >= i && i3 <= i2;
    }

    public Dialog onCreateDialog(Bundle bundle) {
        FragmentActivity activity = getActivity();
        if (mo5469a()) {
            activity = new ContextThemeWrapper(getActivity(), 16973939);
        }
        FragmentActivity fragmentActivity = activity;
        Calendar instance = Calendar.getInstance();
        DatePickerDialog datePickerDialog = new DatePickerDialog(fragmentActivity, this.f4151a, instance.get(1), instance.get(2), instance.get(5));
        return datePickerDialog;
    }

    public void setArguments(Bundle bundle) {
        C1181yR.super.setArguments(bundle);
        this.f4152b = bundle.getInt("year");
        this.f4153c = bundle.getInt("month");
        this.f4154d = bundle.getInt("day");
    }
}
