package p000;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: UL */
public class C0431UL extends DialogFragment implements OnItemClickListener {

    /* renamed from: a */
    public final String f1219a = "◀";

    /* renamed from: b */
    public C0432a f1220b;

    /* renamed from: c */
    public ArrayList<File> f1221c;

    /* renamed from: d */
    public String f1222d;

    /* renamed from: e */
    public TextView f1223e;

    /* renamed from: f */
    public EditText f1224f;

    /* renamed from: g */
    public TextView f1225g;

    /* renamed from: h */
    public ListView f1226h;

    /* renamed from: i */
    public File f1227i;

    /* renamed from: j */
    public int f1228j;

    /* renamed from: k */
    public int f1229k;

    /* renamed from: l */
    public int f1230l;

    /* renamed from: m */
    public int f1231m;

    /* renamed from: n */
    public int f1232n;

    /* renamed from: UL$a */
    public interface C0432a {
        /* renamed from: c */
        void mo1270c(String str, String str2);

        /* renamed from: d */
        boolean mo1271d(String str, String str2);
    }

    /* renamed from: UL$b */
    private class C0433b extends ArrayAdapter<File> {
        public C0433b(Context context, List<File> list) {
            super(context, 17367043, list);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            TextView textView = (TextView) super.getView(i, view, viewGroup);
            if (C0431UL.this.f1221c.get(i) != null) {
                textView.setText(((File) C0431UL.this.f1221c.get(i)).getName());
            }
            return textView;
        }
    }

    /* renamed from: a */
    public static C0431UL m1215a(String str, int i, int i2, int i3, int i4, int i5) {
        C0431UL ul = new C0431UL();
        Bundle bundle = new Bundle();
        bundle.putString("extensionList", str);
        bundle.putInt("captionOK", i);
        bundle.putInt("captionCancel", i2);
        bundle.putInt("popupTitle", i3);
        bundle.putInt("editHint", i4);
        bundle.putInt("popupIcon", i5);
        ul.setArguments(bundle);
        return ul;
    }

    /* renamed from: a */
    public static boolean m1216a(String str) {
        return !m1219b(str).matches(".*\\W{1,}.*");
    }

    /* renamed from: a */
    public static boolean m1217a(String str, String str2) {
        return new File(str, str2).exists();
    }

    /* renamed from: b */
    public static String m1219b(String str) {
        return str.contains(".") ? str.split("\\.(?=[^\\.]+$)")[0] : str;
    }

    /* renamed from: a */
    public final ArrayList<File> mo1264a(File file) {
        ArrayList<File> arrayList = new ArrayList<>();
        File[] listFiles = file.listFiles();
        if (file.getParent() != null) {
            arrayList.add(new File("◀"));
        }
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory() && !file2.isHidden()) {
                    arrayList.add(file2);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo1265a() {
        ((InputMethodManager) getActivity().getSystemService("input_method")).toggleSoftInput(2, 0);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof C0432a) {
            this.f1220b = (C0432a) activity;
            this.f1221c = new ArrayList<>();
            this.f1222d = getArguments().getString("extensionList");
            this.f1228j = getArguments().getInt("captionOK");
            this.f1229k = getArguments().getInt("captionCancel");
            this.f1230l = getArguments().getInt("popupTitle");
            this.f1231m = getArguments().getInt("editHint");
            this.f1232n = getArguments().getInt("popupIcon");
            return;
        }
        throw new IllegalStateException("Activity must implement fragment's callbacks.");
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Builder builder = new Builder(getActivity());
        View inflate = getActivity().getLayoutInflater().inflate(2131492966, null);
        this.f1223e = (TextView) inflate.findViewById(2131296621);
        this.f1224f = (EditText) inflate.findViewById(2131296620);
        this.f1224f.requestFocus();
        try {
            mo1265a();
        } catch (Exception unused) {
        }
        this.f1225g = (TextView) inflate.findViewById(2131296401);
        this.f1226h = (ListView) inflate.findViewById(2131296409);
        this.f1227i = new File(C0195JU.f441a);
        this.f1221c = mo1264a(this.f1227i);
        this.f1226h.setAdapter(new C0433b(getActivity(), this.f1221c));
        this.f1226h.setOnItemClickListener(this);
        TextView textView = this.f1223e;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1227i.getAbsolutePath());
        sb.append("/");
        textView.setText(sb.toString());
        String str = this.f1222d;
        if (str != null) {
            this.f1225g.setText(str);
            this.f1225g.setPadding(2, 0, 6, 0);
        }
        builder.setView(inflate);
        builder.setIcon(this.f1232n);
        builder.setTitle(this.f1230l);
        builder.setPositiveButton(this.f1228j, new C0367RL(this));
        builder.setNegativeButton(this.f1229k, new C0387SL(this));
        return builder.create();
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (i >= 0 || i < this.f1221c.size()) {
            File file = (File) this.f1221c.get(i);
            if (file.getName().equals("◀")) {
                file = this.f1227i.getParentFile();
            }
            this.f1227i = file;
            this.f1221c = mo1264a(this.f1227i);
            this.f1226h.setAdapter(new C0433b(getActivity(), this.f1221c));
            String absolutePath = this.f1227i.getAbsolutePath();
            if (this.f1227i.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(absolutePath);
                sb.append("/");
                absolutePath = sb.toString();
            }
            this.f1223e.setText(absolutePath);
        }
    }

    public void onStart() {
        super.onStart();
        AlertDialog alertDialog = (AlertDialog) getDialog();
        if (alertDialog != null) {
            alertDialog.getButton(-1).setOnClickListener(new C0409TL(this));
        }
    }
}
