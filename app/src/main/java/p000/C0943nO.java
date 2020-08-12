package p000;

import android.app.TimePickerDialog.OnTimeSetListener;
import android.content.Context;
import android.os.Build.VERSION;
import android.preference.Preference;
import android.preference.SwitchPreference;
import android.widget.TimePicker;
import com.valdio.valdioveliu.recyclerview.SettingsActivity.BackupPreferenceFragment;

/* renamed from: nO */
class C0943nO implements OnTimeSetListener {

    /* renamed from: a */
    public final /* synthetic */ BackupPreferenceFragment f3423a;

    public C0943nO(BackupPreferenceFragment backupPreferenceFragment) {
        this.f3423a = backupPreferenceFragment;
    }

    public void onTimeSet(TimePicker timePicker, int i, int i2) {
        String str = "prefBackup_time_h";
        this.f3423a.f2662a.mo631x(str, String.valueOf(i));
        C0195JU ju = this.f3423a.f2662a;
        String valueOf = String.valueOf(i2);
        String str2 = "prefBackup_time_m";
        ju.mo631x(str2, valueOf);
        String str3 = "prefAutoBackup";
        this.f3423a.f2662a.mo543b(str3, true);
        Preference findPreference = this.f3423a.findPreference(str);
        StringBuilder sb = new StringBuilder();
        String str4 = "0";
        Object[] objArr = {Integer.valueOf(Integer.parseInt(this.f3423a.f2662a.mo609q(str, str4)))};
        String str5 = "%02d";
        sb.append(String.format(str5, objArr));
        sb.append(":");
        sb.append(String.format(str5, new Object[]{Integer.valueOf(Integer.parseInt(this.f3423a.f2662a.mo609q(str2, str4)))}));
        findPreference.setSummary(sb.toString());
        this.f3423a.f2662a.mo631x("db_data_changed", "1");
        this.f3423a.f2662a.mo631x("auto_drive_date_save", "");
        C0195JU.f460t = false;
        BackupPreferenceFragment backupPreferenceFragment = this.f3423a;
        backupPreferenceFragment.f2662a.mo573f((Context) backupPreferenceFragment.getActivity());
        if (VERSION.SDK_INT >= 14) {
            ((SwitchPreference) this.f3423a.findPreference(str3)).setChecked(true);
        }
    }
}
