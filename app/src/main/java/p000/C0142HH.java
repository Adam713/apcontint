package p000;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

/* renamed from: HH */
public class C0142HH extends DialogFragment {

    /* renamed from: a */
    public C0143a f310a;

    /* renamed from: b */
    public EditText f311b = null;

    /* renamed from: c */
    public EditText f312c = null;

    /* renamed from: d */
    public ImageView f313d = null;

    /* renamed from: e */
    public String f314e = "0";

    /* renamed from: f */
    public String f315f = null;

    /* renamed from: g */
    public String f316g = null;

    /* renamed from: HH$a */
    public interface C0143a {
        /* renamed from: a */
        void mo327a(DialogFragment dialogFragment);
    }

    /* renamed from: a */
    public static C0142HH m298a(String str, String str2, String str3) {
        C0142HH hh = new C0142HH();
        Bundle bundle = new Bundle();
        bundle.putString("cus_id", str);
        bundle.putString("cus_name", str2);
        bundle.putString("cus_phone", str3);
        hh.setArguments(bundle);
        return hh;
    }

    public void call_btn(View view) {
        startActivityForResult(new Intent("android.intent.action.PICK", Phone.CONTENT_URI), 1);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            getActivity();
            if (i2 == -1) {
                String str = "data1";
                String str2 = "display_name";
                Cursor query = getActivity().getContentResolver().query(intent.getData(), new String[]{str, str2}, null, null, null);
                query.moveToFirst();
                String string = query.getString(query.getColumnIndex(str));
                String string2 = query.getString(query.getColumnIndex(str2));
                this.f312c.setText(string);
                query.close();
                StringBuilder sb = new StringBuilder();
                sb.append("ZZZ number : ");
                sb.append(string);
                sb.append(" , name : ");
                sb.append(string2);
                Log.d("Phone=", sb.toString());
            }
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f310a = (C0143a) activity;
            this.f314e = getArguments().getString("cus_id");
            this.f315f = getArguments().getString("cus_name");
            this.f316g = getArguments().getString("cus_phone");
            Log.d("CUS_ID_ONATTACHED=", this.f314e);
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(activity.toString());
            sb.append(" must implement NoticeDialogListener");
            throw new ClassCastException(sb.toString());
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Builder builder = new Builder(new ContextThemeWrapper(getActivity(), 2131820745));
        View inflate = getActivity().getLayoutInflater().inflate(2131492954, null);
        builder.setView(inflate);
        this.f311b = (EditText) inflate.findViewById(2131296387);
        this.f312c = (EditText) inflate.findViewById(2131296389);
        this.f313d = (ImageView) inflate.findViewById(2131296498);
        this.f311b.setText(this.f315f);
        if (!this.f316g.equals("0")) {
            this.f312c.setText(this.f316g);
        }
        this.f313d.setOnClickListener(new C0101FH(this));
        builder.setTitle(getString(2131755158));
        builder.setPositiveButton(2131755108, new C0121GH(this));
        return builder.create();
    }
}
