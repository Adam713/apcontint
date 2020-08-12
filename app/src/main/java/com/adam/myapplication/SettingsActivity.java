package com.adam.myapplication;


import android.annotation.TargetApi;
import android.app.Activity;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.PreferenceActivity.Header;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import android.preference.SwitchPreference;
import android.provider.MediaStore.Images.Media;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AlertDialog.Builder;
import android.text.format.DateFormat;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import p000.C0600aM;
import p000.C0816hO;

public class SettingsActivity extends AppCompatPreferenceActivity implements C0600aM.C0601a {

    /* renamed from: b */
    public static OnPreferenceChangeListener f2658b = new C0816hO();

    /* renamed from: c */
    public static boolean f2659c = false;

    /* renamed from: d */
    public SQLiteDatabase f2660d;

    /* renamed from: e */
    public C0195JU f2661e;

    @TargetApi(11)
    public static class AdsPreferenceFragment extends PreferenceFragment {
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            addPreferencesFromResource(2131951618);
            setHasOptionsMenu(true);
            FragmentStatePagerSupport_Main.f2451d = true;
        }

        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
            if (onCreateView != null) {
                ListView listView = (ListView) onCreateView.findViewById(16908298);
            }
            return onCreateView;
        }

        public boolean onOptionsItemSelected(MenuItem menuItem) {
            if (menuItem.getItemId() != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            startActivity(new Intent(getActivity(), SettingsActivity.class));
            return true;
        }
    }

    @TargetApi(11)
    public static class BackupPreferenceFragment extends PreferenceFragment implements OnSharedPreferenceChangeListener {

        /* renamed from: a */
        public C0195JU f2662a;

        /* renamed from: b */
        public SQLiteDatabase f2663b;

        /* renamed from: a */
        public void mo4075a() {
            C0195JU.f444d = "1";
            C0600aM a = C0600aM.m1755a(C0603c.DirectorySelector, 2131755359, 2131755358, 2131755361, 17301585, 17301565, 17301582);
            a.setTargetFragment(this, 0);
            a.show(getFragmentManager(), "Test");
        }

        /* renamed from: b */
        public void mo4076b() {
            Calendar.getInstance();
            String str = "0";
            TimePickerDialog timePickerDialog = new TimePickerDialog(getActivity(), new C0943nO(this), Integer.parseInt(this.f2662a.mo609q("prefBackup_time_h", str)), Integer.parseInt(this.f2662a.mo609q("prefBackup_time_m", str)), true);
            timePickerDialog.setTitle(getActivity().getString(2131755288));
            timePickerDialog.show();
        }

        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            addPreferencesFromResource(2131951619);
            setHasOptionsMenu(true);
            this.f2662a = new C0195JU(this.f2663b, getActivity());
            String str = "prefBackup_path";
            findPreference(str).setSummary(this.f2662a.mo609q(str, C0195JU.f441a));
            String str2 = "prefBackup_time_h";
            Preference findPreference = findPreference(str2);
            StringBuilder sb = new StringBuilder();
            String str3 = "0";
            Object[] objArr = {Integer.valueOf(Integer.parseInt(this.f2662a.mo609q(str2, str3)))};
            String str4 = "%02d";
            sb.append(String.format(str4, objArr));
            sb.append(":");
            sb.append(String.format(str4, new Object[]{Integer.valueOf(Integer.parseInt(this.f2662a.mo609q("prefBackup_time_m", str3)))}));
            findPreference.setSummary(sb.toString());
            SettingsActivity.m2469b(findPreference("PREF_ACCOUNT_NAME"));
        }

        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
            if (onCreateView != null) {
                ListView listView = (ListView) onCreateView.findViewById(16908298);
            }
            return onCreateView;
        }

        public boolean onOptionsItemSelected(MenuItem menuItem) {
            if (menuItem.getItemId() != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            startActivity(new Intent(getActivity(), SettingsActivity.class));
            return true;
        }

        public void onPause() {
            super.onPause();
            getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
        }

        public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
            super.onPreferenceTreeClick(preferenceScreen, preference);
            if (preference != null && preference.getKey().equals("prefBackup_path")) {
                mo4075a();
            } else if (preference != null && preference.getKey().equals("prefBackup_time_h")) {
                mo4076b();
            } else if (preference != null && preference.getKey().equals("prefAutoBackup")) {
                this.f2662a.mo573f((Context) getActivity());
            } else if (preference != null && preference.getKey().equals("PREF_ACCOUNT_NAME")) {
                Intent intent = new Intent(getActivity(), Google_drive_list.class);
                intent.putExtra("change_email_flag", "1");
                startActivity(intent);
            }
            return false;
        }

        public void onResume() {
            super.onResume();
            getPreferenceScreen().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
        }

        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            String str2 = "prefBackup_path";
            if (str.equalsIgnoreCase(str2)) {
                findPreference(str).setSummary(this.f2662a.mo609q(str2, C0195JU.f441a));
            }
        }
    }

    @TargetApi(11)
    public static class DataSyncPreferenceFragment extends PreferenceFragment {
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            addPreferencesFromResource(2131951621);
            setHasOptionsMenu(true);
            SettingsActivity.m2469b(findPreference("prefBlankLines"));
            SettingsActivity.m2469b(findPreference("pref_print_remarks"));
            SettingsActivity.m2469b(findPreference("pref_credit"));
            SettingsActivity.m2469b(findPreference("pref_debit"));
        }

        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
            if (onCreateView != null) {
                ListView listView = (ListView) onCreateView.findViewById(16908298);
            }
            return onCreateView;
        }

        public boolean onOptionsItemSelected(MenuItem menuItem) {
            if (menuItem.getItemId() != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            startActivity(new Intent(getActivity(), SettingsActivity.class));
            return true;
        }
    }

    @TargetApi(11)
    public static class GeneralPreferenceFragment extends PreferenceFragment {

        /* renamed from: a */
        public static int f2664a = 1;

        /* renamed from: b */
        public C0195JU f2665b;

        /* renamed from: c */
        public SQLiteDatabase f2666c;

        /* renamed from: d */
        public Intent f2667d;

        /* renamed from: e */
        public String f2668e;

        /* renamed from: f */
        public OnClickListener f2669f = new C0962oO(this);

        /* renamed from: a */
        public void mo4087a(String str, boolean z) {
            try {
                Editor edit = PreferenceManager.getDefaultSharedPreferences(getActivity()).edit();
                edit.putBoolean(str, z);
                edit.commit();
            } catch (Exception unused) {
            }
        }

        public void onActivityResult(int i, int i2, Intent intent) {
            super.onActivityResult(i, i2, intent);
            try {
                if (i == f2664a && i2 == -1 && intent != null) {
                    String[] strArr = {"_data"};
                    Cursor query = getActivity().getContentResolver().query(intent.getData(), strArr, null, null, null);
                    query.moveToFirst();
                    String string = query.getString(query.getColumnIndex(strArr[0]));
                    query.close();
                    Bitmap a = C0195JU.m414a(string, 100, 100);
                    ((ImageView) getActivity().findViewById(2131296538)).setImageBitmap(a);
                    this.f2668e = C0195JU.m417a(a);
                    this.f2665b.mo631x("ImageDecode", this.f2668e);
                    mo4087a("prefPrintUser", true);
                }
            } catch (Exception unused) {
                Toast.makeText(getActivity(), "Please try again:", 1).show();
            }
        }

        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            addPreferencesFromResource(2131951622);
            setHasOptionsMenu(true);
            this.f2665b = new C0195JU(this.f2666c, getActivity());
            SettingsActivity.m2469b(findPreference("prefUsername"));
            SettingsActivity.m2469b(findPreference("prefAddress"));
            SettingsActivity.m2469b(findPreference("prefPhone"));
            SettingsActivity.m2469b(findPreference("prefSMS_header"));
            SettingsActivity.m2469b(findPreference("prefUsername_en"));
            SettingsActivity.m2469b(findPreference("prefAddress_en"));
        }

        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View inflate = layoutInflater.inflate(2131492985, viewGroup, false);
            ImageView imageView = (ImageView) inflate.findViewById(2131296538);
            String str = "0";
            this.f2668e = this.f2665b.mo609q("ImageDecode", str);
            if (this.f2668e.equals(str)) {
                imageView.setImageResource(2131623937);
            } else {
                imageView.setImageBitmap(C0195JU.m424c(this.f2668e));
            }
            imageView.setOnClickListener(this.f2669f);
            if (inflate != null) {
                ListView listView = (ListView) inflate.findViewById(16908298);
            }
            return inflate;
        }

        public boolean onOptionsItemSelected(MenuItem menuItem) {
            Intent intent;
            int itemId = menuItem.getItemId();
            if (itemId == 16908332) {
                intent = new Intent(getActivity(), SettingsActivity.class);
            } else if (itemId != 2131296543) {
                return super.onOptionsItemSelected(menuItem);
            } else {
                intent = new Intent(getActivity(), Customer_Det_List_edit.class);
            }
            startActivity(intent);
            return true;
        }

        public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
            super.onPreferenceTreeClick(preferenceScreen, preference);
            if (preference != null && preference.getKey().equals("prefLogo")) {
                this.f2667d = new Intent("android.intent.action.PICK", Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(this.f2667d, f2664a);
            } else if ((preference != null && preference.getKey().equals("prefUsername")) || ((preference != null && preference.getKey().equals("prefAddress")) || (preference != null && preference.getKey().equals("prefPhone")))) {
                mo4087a("prefPrintUser", true);
            }
            return false;
        }
    }

    @TargetApi(11)
    public static class IPPreferenceFragment extends PreferenceFragment {

        /* renamed from: a */
        public SQLiteDatabase f2670a;

        /* renamed from: b */
        public C0195JU f2671b;

        /* renamed from: c */
        public C0486WU f2672c;

        /* renamed from: a */
        public void mo4093a() {
            try {
                Builder builder = new Builder(getActivity());
                View inflate = getActivity().getLayoutInflater().inflate(2131492963, null);
                builder.setView(inflate);
                TextView textView = (TextView) inflate.findViewById(2131296511);
                TextView textView2 = (TextView) inflate.findViewById(2131296510);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setText(2131755236);
                StringBuilder sb = new StringBuilder();
                sb.append("http://");
                sb.append(this.f2671b.mo463J());
                sb.append(":7777");
                textView2.setText(sb.toString());
                builder.setNegativeButton(getString(2131755391), new C0991pO(this));
                AlertDialog create = builder.create();
                create.getWindow().setSoftInputMode(4);
                create.setCancelable(false);
                create.show();
            } catch (Exception e) {
                Log.d("adv_search_error=", e.getMessage());
            }
        }

        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setHasOptionsMenu(true);
            this.f2671b = new C0195JU(this.f2670a, getActivity());
            this.f2672c = new C0486WU(7777, getResources().getAssets(), getActivity(), this.f2671b);
            C0195JU ju = this.f2671b;
            ju.mo586i(ju.mo595l(), C0195JU.f441a, "index.html");
            this.f2672c.mo1414a();
            mo4093a();
        }

        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
            if (onCreateView != null) {
                ListView listView = (ListView) onCreateView.findViewById(16908298);
            }
            return onCreateView;
        }

        public boolean onOptionsItemSelected(MenuItem menuItem) {
            if (menuItem.getItemId() != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            startActivity(new Intent(getActivity(), SettingsActivity.class));
            return true;
        }

        public void onPause() {
            this.f2672c.mo1418b();
            super.onPause();
        }

        public void onResume() {
            super.onResume();
            this.f2672c = new C0486WU(7777, getResources().getAssets(), getActivity(), this.f2671b);
            this.f2672c.mo1414a();
        }
    }

    @TargetApi(11)
    public static class OthersPreferenceFragment extends PreferenceFragment {

        /* renamed from: a */
        public SQLiteDatabase f2673a;

        /* renamed from: b */
        public C0195JU f2674b;

        /* renamed from: c */
        public ListView f2675c;

        /* renamed from: a */
        public void mo4099a() {
            this.f2674b.mo550c();
            new DateFormat();
            String charSequence = DateFormat.format("yyyyMMddkkmmss", new Date()).toString();
            Activity activity = getActivity();
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence);
            sb.append("-yearly.db");
            if (C0268MU.m851b(activity, "market.db", sb.toString(), "com.valdio.valdioveliu.recyclerview")) {
                this.f2674b = new C0195JU(this.f2673a, getActivity());
                Calendar instance = Calendar.getInstance();
                new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
                int i = instance.get(1);
                int i2 = i - 1;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i2);
                sb2.append("-12-31");
                String sb3 = sb2.toString();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(i);
                sb4.append("-01-01");
                mo4100a(sb3, sb4.toString());
            }
        }

        /* renamed from: a */
        public final void mo4100a(String str, String str2) {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity());
            StringBuilder sb = new StringBuilder();
            sb.append(getActivity().getString(2131755425));
            String str3 = " ";
            sb.append(str3);
            sb.append(str);
            android.app.AlertDialog.Builder title = builder.setTitle(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getActivity().getString(2131755426));
            sb2.append(str3);
            sb2.append(str2);
            title.setMessage(sb2.toString()).setCancelable(true).setPositiveButton(getActivity().getString(2131755137), new C1072tO(this, str, str2)).setNegativeButton(getActivity().getString(2131755136), new C1052sO(this)).show();
        }

        public void onCreate(Bundle bundle) {
            String str = "";
            String str2 = "api_url=";
            String str3 = "pref_bulk_sms";
            super.onCreate(bundle);
            boolean z = SettingsActivity.f2659c;
            addPreferencesFromResource(2131951627);
            setHasOptionsMenu(true);
            this.f2674b = new C0195JU(this.f2673a, getActivity());
            FragmentStatePagerSupport_Main.f2451d = true;
            StringBuilder sb = new StringBuilder();
            sb.append(SettingsActivity.f2659c);
            sb.append(":oncreate");
            Log.d("oncreateview=", sb.toString());
            try {
                SettingsActivity.m2469b(findPreference(str3));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(this.f2674b.mo567e(this.f2674b.mo609q(str3, str), "700990810", "tttt"));
                Log.d(str2, sb2.toString());
            } catch (Exception e) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(":");
                sb3.append(e.getMessage());
                Log.d(str2, sb3.toString());
            }
            SwitchPreference switchPreference = (SwitchPreference) findPreference("prefOthers_currency");
            ListPreference listPreference = (ListPreference) findPreference("prefLanguage");
            if (switchPreference != null) {
                switchPreference.setOnPreferenceChangeListener(new C1010qO(this));
            }
            if (listPreference != null) {
                listPreference.setOnPreferenceChangeListener(new C1032rO(this));
            }
        }

        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
            StringBuilder sb = new StringBuilder();
            sb.append(SettingsActivity.f2659c);
            sb.append("");
            Log.d("oncreateview=", sb.toString());
            if (onCreateView != null) {
                this.f2675c = (ListView) onCreateView.findViewById(16908298);
            }
            return onCreateView;
        }

        public boolean onOptionsItemSelected(MenuItem menuItem) {
            if (menuItem.getItemId() != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            startActivity(new Intent(getActivity(), SettingsActivity.class));
            return true;
        }

        public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
            super.onPreferenceTreeClick(preferenceScreen, preference);
            if (preference != null && preference.getKey().equals("prefCloseBalance")) {
                mo4099a();
            }
            return false;
        }

        public void onResume() {
            super.onResume();
        }
    }

    @TargetApi(11)
    public static class SecurityPreferenceFragment extends PreferenceFragment {
        /* renamed from: a */
        public String mo4106a(String str, String str2) {
            try {
                return PreferenceManager.getDefaultSharedPreferences(getActivity()).getString(str, str2);
            } catch (Exception unused) {
                return str2;
            }
        }

        /* renamed from: a */
        public void mo4107a(int i, String str) {
            try {
                android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity());
                View inflate = getActivity().getLayoutInflater().inflate(2131493004, (ViewGroup) getActivity().findViewById(2131296595));
                builder.setView(inflate);
                EditText editText = (EditText) inflate.findViewById(2131296258);
                EditText editText2 = (EditText) inflate.findViewById(2131296259);
                TextView textView = (TextView) inflate.findViewById(2131296266);
                TextView textView2 = (TextView) inflate.findViewById(2131296264);
                TextView textView3 = (TextView) inflate.findViewById(2131296265);
                if (i == 0) {
                    editText.setVisibility(8);
                    textView2.setVisibility(8);
                } else if (i == 2) {
                    editText2.setVisibility(8);
                    textView3.setVisibility(8);
                }
                C1112vO vOVar = new C1112vO(this, editText, editText2, str, i, textView);
                editText2.addTextChangedListener(vOVar);
                builder.setPositiveButton(getString(2131755359), new C1133wO(this));
                android.app.AlertDialog create = builder.create();
                create.setTitle(getString(2131755107));
                create.setCancelable(false);
                create.getWindow().setSoftInputMode(4);
                create.show();
                builder.setNegativeButton(getString(2131755358), new C1159xO(this, create));
                Button button = create.getButton(-1);
                C1178yO yOVar = new C1178yO(this, editText, editText2, str, i, create);
                button.setOnClickListener(yOVar);
            } catch (Exception unused) {
            }
        }

        /* renamed from: a */
        public void mo4108a(String str, boolean z) {
            try {
                Editor edit = PreferenceManager.getDefaultSharedPreferences(getActivity()).edit();
                edit.putBoolean(str, z);
                edit.commit();
            } catch (Exception unused) {
            }
        }

        /* renamed from: b */
        public void mo4109b(String str, String str2) {
            try {
                Editor edit = PreferenceManager.getDefaultSharedPreferences(getActivity()).edit();
                edit.putString(str, str2);
                edit.commit();
            } catch (Exception unused) {
            }
        }

        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            addPreferencesFromResource(2131951628);
            setHasOptionsMenu(true);
            SwitchPreference switchPreference = (SwitchPreference) findPreference("prefLogin");
            if (switchPreference != null) {
                switchPreference.setOnPreferenceChangeListener(new C1092uO(this));
            }
        }

        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
            if (onCreateView != null) {
                ListView listView = (ListView) onCreateView.findViewById(16908298);
            }
            return onCreateView;
        }

        public boolean onOptionsItemSelected(MenuItem menuItem) {
            if (menuItem.getItemId() != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            startActivity(new Intent(getActivity(), SettingsActivity.class));
            return true;
        }

        public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
            super.onPreferenceTreeClick(preferenceScreen, preference);
            if (preference != null) {
                String str = "prefPassword";
                if (preference.getKey().equals(str)) {
                    String str2 = "";
                    String a = mo4106a(str, str2);
                    if (a.equals(str2)) {
                        mo4107a(0, a);
                    } else {
                        mo4107a(1, a);
                    }
                }
            }
            return false;
        }
    }

    @TargetApi(11)
    /* renamed from: com.valdio.valdioveliu.recyclerview.SettingsActivity$a */
    public static class C0719a extends PreferenceFragment {
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            addPreferencesFromResource(2131951626);
            setHasOptionsMenu(true);
            SettingsActivity.m2469b(findPreference("notifications_new_message_ringtone"));
        }

        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
            if (onCreateView != null) {
                ListView listView = (ListView) onCreateView.findViewById(16908298);
            }
            return onCreateView;
        }

        public boolean onOptionsItemSelected(MenuItem menuItem) {
            if (menuItem.getItemId() != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            startActivity(new Intent(getActivity(), SettingsActivity.class));
            return true;
        }
    }

    /* renamed from: a */
    public static void m2467a(File file, File file2) {
        if (file.isDirectory()) {
            if (!file2.exists()) {
                file2.mkdir();
            }
            String[] list = file.list();
            for (int i = 0; i < file.listFiles().length; i++) {
                m2467a(new File(file, list[i]), new File(file2, list[i]));
            }
            return;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        byte[] bArr = new byte[1024];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read > 0) {
                fileOutputStream.write(bArr, 0, read);
            } else {
                fileInputStream.close();
                fileOutputStream.close();
                return;
            }
        }
    }

    /* renamed from: a */
    public static boolean m2468a(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 4;
    }

    /* renamed from: b */
    public static void m2469b(Preference preference) {
        Object obj;
        OnPreferenceChangeListener onPreferenceChangeListener;
        preference.setOnPreferenceChangeListener(f2658b);
        if (preference instanceof SwitchPreference) {
            onPreferenceChangeListener = f2658b;
            obj = Boolean.valueOf(PreferenceManager.getDefaultSharedPreferences(preference.getContext()).getBoolean(preference.getKey(), false));
        } else {
            onPreferenceChangeListener = f2658b;
            obj = PreferenceManager.getDefaultSharedPreferences(preference.getContext()).getString(preference.getKey(), "");
        }
        onPreferenceChangeListener.onPreferenceChange(preference, obj);
    }

    /* renamed from: a */
    public void mo4060a(int i, String str) {
        try {
            if (this.f2661e.mo602o(C0195JU.f445e, C0195JU.f446f) != 0) {
                Toast.makeText(this, getString(2131755071), 0).show();
                return;
            }
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
            View inflate = getLayoutInflater().inflate(2131492961, null);
            builder.setView(inflate);
            EditText editText = (EditText) inflate.findViewById(2131296489);
            EditText editText2 = (EditText) inflate.findViewById(2131296490);
            editText.setText(C0195JU.f445e);
            editText2.setText(str);
            builder.setPositiveButton(getString(2131755359), new C0837iO(this));
            android.app.AlertDialog create = builder.create();
            create.getWindow().setSoftInputMode(4);
            create.show();
            create.getButton(-1).setOnClickListener(new C0857jO(this, editText2, create));
            builder.setNegativeButton(getString(2131755358), new C0877kO(this, create));
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo4061a(String str, android.app.AlertDialog alertDialog) {
        String str2 = "OK";
        String str3 = "layout_inflater";
        if (C0195JU.f445e != null) {
            try {
                if (C0195JU.f446f.substring(0, 14).equals(str.substring(0, 14))) {
                    this.f2661e.mo562d("delete from valid ");
                    C0195JU ju = this.f2661e;
                    StringBuilder sb = new StringBuilder();
                    sb.append("insert into valid(imei,imei_code) values('");
                    sb.append(C0195JU.f445e);
                    sb.append("','");
                    sb.append(C0195JU.f446f);
                    sb.append("');");
                    ju.mo562d(sb.toString());
                    Toast.makeText(this, "Import Successful!", 0).show();
                    alertDialog.dismiss();
                    return;
                }
                android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
                View inflate = ((LayoutInflater) getSystemService(str3)).inflate(2131492908, null);
                TextView textView = (TextView) inflate.findViewById(2131296653);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setText(2131755140);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                builder.setView(inflate);
                builder.setTitle(getString(2131755138));
                builder.setCancelable(false).setPositiveButton(str2, new C0902lO(this));
                builder.create().show();
            } catch (Exception unused) {
                android.app.AlertDialog.Builder builder2 = new android.app.AlertDialog.Builder(this);
                View inflate2 = ((LayoutInflater) getSystemService(str3)).inflate(2131492908, null);
                TextView textView2 = (TextView) inflate2.findViewById(2131296653);
                textView2.setMovementMethod(LinkMovementMethod.getInstance());
                textView2.setText(2131755140);
                textView2.setMovementMethod(LinkMovementMethod.getInstance());
                builder2.setView(inflate2);
                builder2.setTitle(getString(2131755138));
                builder2.setCancelable(false).setPositiveButton(str2, new C0921mO(this));
                builder2.create().show();
            }
        }
    }

    /* renamed from: a */
    public void mo1838a(String str, String str2) {
        String str3 = "/Pictures/";
        if (mo1839b(str, str2)) {
            String str4 = "prefBackup_path";
            this.f2661e.mo631x(str4, str);
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(C0195JU.f441a);
                sb.append(str3);
                File file = new File(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f2661e.mo609q(str4, C0195JU.f441a));
                sb2.append(str3);
                m2467a(file, new File(sb2.toString()));
            } catch (Exception e) {
                Log.d("Copy_err", e.getMessage());
                Toast.makeText(this, e.getMessage(), 1).show();
            }
            C0195JU.f441a = this.f2661e.mo609q(str4, C0195JU.f441a);
        }
    }

    /* renamed from: b */
    public boolean mo1839b(String str, String str2) {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.isDirectory() && file.canWrite();
    }

    /* renamed from: c */
    public String mo4062c(String str, String str2) {
        try {
            return PreferenceManager.getDefaultSharedPreferences(this).getString(str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    /* renamed from: c */
    public final void mo4063c() {
        ActionBar b = mo3332b();
        if (b != null) {
            b.setDisplayHomeAsUpEnabled(true);
        }
    }

    public boolean isValidFragment(String str) {
        return PreferenceFragment.class.getName().equals(str) || GeneralPreferenceFragment.class.getName().equals(str) || DataSyncPreferenceFragment.class.getName().equals(str) || SecurityPreferenceFragment.class.getName().equals(str) || BackupPreferenceFragment.class.getName().equals(str) || AdsPreferenceFragment.class.getName().equals(str) || IPPreferenceFragment.class.getName().equals(str) || OthersPreferenceFragment.class.getName().equals(str) || C0719a.class.getName().equals(str);
    }

    @TargetApi(11)
    public void onBuildHeaders(List<Header> list) {
        this.f2661e = new C0195JU(this.f2660d, this);
        loadHeadersFromResource((this.f2661e.mo524a("black_list", false) || this.f2661e.mo602o(C0195JU.f445e, C0195JU.f446f) <= 0) ? 2131951624 : 2131951625, list);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.d("Oncreate_Settings=", "Start..");
        mo4063c();
        this.f2661e = new C0195JU(this.f2660d, this);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131558416, menu);
        return true;
    }

    public boolean onIsMultiPane() {
        return m2468a((Context) this);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            finish();
            return true;
        } else if (itemId != 2131296301) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            String str = "";
            String c = mo4062c("prefCode", str);
            if (c.equals(str)) {
                mo4060a(0, c);
            } else {
                mo4060a(1, c);
            }
            return true;
        }
    }

    public void onPause() {
        super.onPause();
    }

    public void onRestart() {
        super.onRestart();
        StringBuilder sb = new StringBuilder();
        sb.append(f2659c);
        sb.append("");
        Log.d("onrestart=", sb.toString());
        if (FragmentStatePagerSupport_Main.f2453f) {
            recreate();
            finish();
        }
    }

    public void onResume() {
        super.onResume();
    }
}
