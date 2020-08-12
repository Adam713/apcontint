package p000;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: aM */
public class C0600aM extends DialogFragment implements OnItemClickListener, OnItemLongClickListener {

    /* renamed from: a */
    public final String f1811a = "◀";

    /* renamed from: b */
    public C0601a f1812b;

    /* renamed from: c */
    public ArrayList<File> f1813c;

    /* renamed from: d */
    public TextView f1814d;

    /* renamed from: e */
    public TextView f1815e;

    /* renamed from: f */
    public ListView f1816f;

    /* renamed from: g */
    public File f1817g;

    /* renamed from: h */
    public File f1818h;

    /* renamed from: i */
    public int f1819i;

    /* renamed from: j */
    public int f1820j;

    /* renamed from: k */
    public int f1821k;

    /* renamed from: l */
    public int f1822l;

    /* renamed from: m */
    public int f1823m;

    /* renamed from: n */
    public int f1824n;

    /* renamed from: o */
    public C0603c f1825o;

    /* renamed from: p */
    public FilenameFilter f1826p;

    /* renamed from: aM$a */
    public interface C0601a {
        /* renamed from: a */
        void mo1838a(String str, String str2);

        /* renamed from: b */
        boolean mo1839b(String str, String str2);
    }

    /* renamed from: aM$b */
    private class C0602b extends ArrayAdapter<File> {
        public C0602b(Context context, List<File> list) {
            super(context, 17367043, list);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            int d = C0600aM.this.f1824n;
            TextView textView = (TextView) super.getView(i, view, viewGroup);
            if (C0600aM.this.f1813c.get(i) != null) {
                String name = ((File) C0600aM.this.f1813c.get(i)).getName();
                textView.setText(name);
                if (((File) C0600aM.this.f1813c.get(i)).isDirectory()) {
                    d = C0600aM.this.f1823m;
                }
                if (name.equals("◀")) {
                    d = -1;
                }
                if (d > 0) {
                    textView.setCompoundDrawablesWithIntrinsicBounds(C0600aM.this.getActivity().getResources().getDrawable(d), null, null, null);
                }
            }
            return textView;
        }
    }

    /* renamed from: aM$c */
    public enum C0603c {
        DirectorySelector,
        FileSelector
    }

    /* renamed from: a */
    public static C0600aM m1755a(C0603c cVar, int i, int i2, int i3, int i4, int i5, int i6) {
        C0600aM aMVar = new C0600aM();
        Bundle bundle = new Bundle();
        bundle.putInt("mode", cVar.ordinal());
        bundle.putInt("captionOK", i);
        bundle.putInt("captionCancel", i2);
        bundle.putInt("popupTitle", i3);
        bundle.putInt("iconPopup", i4);
        bundle.putInt("iconDirectory", i5);
        bundle.putInt("iconFile", i6);
        aMVar.setArguments(bundle);
        return aMVar;
    }

    /* renamed from: a */
    public static FilenameFilter m1756a(ArrayList<String> arrayList) {
        return new C0456VL(arrayList);
    }

    /* renamed from: a */
    public final ArrayList<File> mo1830a(File file) {
        File[] fileArr;
        ArrayList<File> arrayList = new ArrayList<>();
        FilenameFilter filenameFilter = this.f1826p;
        if (filenameFilter != null) {
            fileArr = file.listFiles(filenameFilter);
            if (fileArr != null) {
                Arrays.sort(fileArr, new C0545ZL(this));
            }
        } else {
            fileArr = file.listFiles();
            if (fileArr != null) {
                Arrays.sort(fileArr, new C0569_L(this));
            }
        }
        if (file.getParent() != null) {
            arrayList.add(new File("◀"));
        }
        if (fileArr != null) {
            for (File file2 : fileArr) {
                boolean z = true;
                if (!(this.f1825o != C0603c.DirectorySelector || file2.isDirectory()) || file2.isHidden()) {
                    z = false;
                }
                if (z) {
                    arrayList.add(file2);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo1831a(int i) {
        if (i >= 0 || i < this.f1813c.size()) {
            File file = (File) this.f1813c.get(i);
            String name = file.getName();
            String str = "◀";
            if (file.isDirectory() || name.equals(str)) {
                if (name.equals(str)) {
                    file = this.f1817g.getParentFile();
                }
                this.f1817g = file;
                this.f1813c = mo1830a(this.f1817g);
                this.f1816f.setAdapter(new C0602b(getActivity(), this.f1813c));
                this.f1818h = null;
                String absolutePath = this.f1817g.getAbsolutePath();
                if (this.f1817g.getParent() != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(absolutePath);
                    sb.append("/");
                    absolutePath = sb.toString();
                }
                this.f1814d.setText(absolutePath);
                if (this.f1825o == C0603c.FileSelector) {
                    this.f1815e.setText(null);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1832a(FilenameFilter filenameFilter) {
        this.f1826p = filenameFilter;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof C0601a) {
            this.f1812b = (C0601a) activity;
            this.f1813c = new ArrayList<>();
            this.f1819i = getArguments().getInt("captionOK");
            this.f1820j = getArguments().getInt("captionCancel");
            this.f1821k = getArguments().getInt("popupTitle");
            this.f1822l = getArguments().getInt("iconPopup");
            this.f1824n = getArguments().getInt("iconFile");
            this.f1823m = getArguments().getInt("iconDirectory");
            this.f1825o = C0603c.values()[getArguments().getInt("mode")];
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Activity must implement fragment's callbacks.:");
        sb.append(activity.toString());
        throw new IllegalStateException(sb.toString());
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Builder builder = new Builder(getActivity());
        View inflate = getActivity().getLayoutInflater().inflate(2131492967, null);
        this.f1814d = (TextView) inflate.findViewById(2131296621);
        this.f1815e = (TextView) inflate.findViewById(2131296620);
        this.f1816f = (ListView) inflate.findViewById(2131296409);
        this.f1817g = C0195JU.f444d.equals("0") ? new File(C0195JU.f441a) : Environment.getExternalStorageDirectory();
        this.f1813c = mo1830a(this.f1817g);
        this.f1816f.setAdapter(new C0602b(getActivity(), this.f1813c));
        this.f1816f.setOnItemClickListener(this);
        this.f1816f.setOnItemLongClickListener(this);
        TextView textView = this.f1814d;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1817g.getAbsolutePath());
        sb.append("/");
        textView.setText(sb.toString());
        if (this.f1825o == C0603c.FileSelector) {
            this.f1815e.setGravity(3);
            this.f1815e.setPadding(2, 0, 6, 0);
        }
        builder.setView(inflate);
        builder.setIcon(this.f1822l);
        builder.setTitle(this.f1821k);
        builder.setPositiveButton(this.f1819i, new C0477WL(this));
        builder.setNegativeButton(this.f1820j, new C0497XL(this));
        return builder.create();
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f1818h = null;
        String absolutePath = this.f1817g.getAbsolutePath();
        if (this.f1817g.getParent() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(absolutePath);
            sb.append("/");
            absolutePath = sb.toString();
        }
        this.f1814d.setText(absolutePath);
        if (i >= 0 || i < this.f1813c.size()) {
            this.f1818h = (File) this.f1813c.get(i);
            String name = this.f1818h.getName();
            if (!this.f1818h.isDirectory() && !name.equals("◀") && this.f1825o == C0603c.FileSelector) {
                this.f1815e.setText(this.f1818h.getName());
            }
            mo1831a(i);
        }
    }

    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (i >= 0 || i < this.f1813c.size()) {
            File file = (File) this.f1813c.get(i);
            String name = file.getName();
            String str = "◀";
            if (file.isDirectory() || name.equals(str)) {
                if (name.equals(str)) {
                    file = this.f1817g.getParentFile();
                }
                this.f1817g = file;
                this.f1813c = mo1830a(this.f1817g);
                this.f1816f.setAdapter(new C0602b(getActivity(), this.f1813c));
                this.f1818h = null;
                String absolutePath = this.f1817g.getAbsolutePath();
                if (this.f1817g.getParent() != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(absolutePath);
                    sb.append("/");
                    absolutePath = sb.toString();
                }
                this.f1814d.setText(absolutePath);
                if (this.f1825o == C0603c.FileSelector) {
                    this.f1815e.setText(null);
                }
            }
        }
        return false;
    }

    public void onStart() {
        super.onStart();
        AlertDialog alertDialog = (AlertDialog) getDialog();
        if (alertDialog != null) {
            alertDialog.getButton(-1).setOnClickListener(new C0518YL(this));
        }
    }
}
