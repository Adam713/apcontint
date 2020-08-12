package p000;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.SearchManager;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.Loader;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.itextpdf.tool.xml.css.CSS.Property;
import com.itextpdf.tool.xml.html.HTML.Attribute;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit;
import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

@SuppressLint({"ValidFragment"})
/* renamed from: oT */
public class C0967oT extends Fragment implements OnClickListener, LoaderCallbacks<ArrayList<C0208KL>> {

    /* renamed from: A */
    public AdView f3513A;

    /* renamed from: B */
    public OnChildClickListener f3514B = new C0801gT(this);

    /* renamed from: C */
    public OnGroupClickListener f3515C = new C0821hT(this);

    /* renamed from: D */
    public C0970c f3516D;

    /* renamed from: E */
    public Activity f3517E;

    /* renamed from: F */
    public int f3518F = 0;

    /* renamed from: G */
    public ArrayList<String> f3519G = new ArrayList<>();

    /* renamed from: H */
    public LoaderCallbacks<List<String>> f3520H = new C0631bT(this);

    /* renamed from: I */
    public OnClickListener f3521I = new C0759eT(this);

    /* renamed from: a */
    public SQLiteDatabase f3522a;

    /* renamed from: b */
    public C0195JU f3523b;

    /* renamed from: c */
    public String f3524c;

    /* renamed from: d */
    public String f3525d;

    /* renamed from: e */
    public String f3526e;

    /* renamed from: f */
    public double f3527f = 0.0d;

    /* renamed from: g */
    public int f3528g = 0;

    /* renamed from: h */
    public AutoCompleteTextView f3529h = null;

    /* renamed from: i */
    public EditText f3530i = null;

    /* renamed from: j */
    public EditText f3531j = null;

    /* renamed from: k */
    public Button f3532k = null;

    /* renamed from: l */
    public ExpandableListView f3533l;

    /* renamed from: m */
    public C0546ZM f3534m;

    /* renamed from: n */
    public ArrayList<C0208KL> f3535n = new ArrayList<>();

    /* renamed from: o */
    public LinkedHashMap<String, C0208KL> f3536o = new LinkedHashMap<>();

    /* renamed from: p */
    public ImageView f3537p = null;

    /* renamed from: q */
    public ImageView f3538q = null;

    /* renamed from: r */
    public ImageView f3539r = null;

    /* renamed from: s */
    public TextView f3540s = null;

    /* renamed from: t */
    public ImageButton f3541t = null;

    /* renamed from: u */
    public String[] f3542u = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    /* renamed from: v */
    public int[] f3543v = {2131230923, 1, 2131230855};

    /* renamed from: w */
    public TextView f3544w = null;

    /* renamed from: x */
    public TextView f3545x = null;

    /* renamed from: y */
    public TextView f3546y = null;

    /* renamed from: z */
    public TextView f3547z = null;

    /* renamed from: oT$a */
    private static class C0968a implements Comparator<C0208KL> {
        public C0968a() {
        }

        public /* synthetic */ C0968a(C0782fT fTVar) {
            this();
        }

        /* renamed from: a */
        public int compare(C0208KL kl, C0208KL kl2) {
            return Double.valueOf(kl.mo672c()).compareTo(Double.valueOf(kl2.mo672c()));
        }
    }

    /* renamed from: oT$b */
    private static class C0969b implements Comparator<C0208KL> {
        public C0969b() {
        }

        public /* synthetic */ C0969b(C0782fT fTVar) {
            this();
        }

        /* renamed from: a */
        public int compare(C0208KL kl, C0208KL kl2) {
            return Double.valueOf(kl2.mo672c()).compareTo(Double.valueOf(kl.mo672c()));
        }
    }

    /* renamed from: oT$c */
    public interface C0970c {
        void onButtonClicked(View view);
    }

    /* renamed from: oT$d */
    private static class C0971d implements Comparator<C0208KL> {
        public C0971d() {
        }

        public /* synthetic */ C0971d(C0782fT fTVar) {
            this();
        }

        /* renamed from: a */
        public int compare(C0208KL kl, C0208KL kl2) {
            String str = "";
            String str2 = ",";
            return Double.valueOf(kl.mo668a().replaceAll(str2, str)).compareTo(Double.valueOf(kl2.mo668a().replaceAll(str2, str)));
        }
    }

    /* renamed from: oT$e */
    private static class C0972e implements Comparator<C0208KL> {
        public C0972e() {
        }

        public /* synthetic */ C0972e(C0782fT fTVar) {
            this();
        }

        /* renamed from: a */
        public int compare(C0208KL kl, C0208KL kl2) {
            String str = "";
            String str2 = ",";
            return Double.valueOf(kl2.mo668a().replaceAll(str2, str)).compareTo(Double.valueOf(kl.mo668a().replaceAll(str2, str)));
        }
    }

    public C0967oT() {
    }

    public C0967oT(C0260MM mm, int i, int i2, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("cus_id", mm.mo889b());
        bundle.putString("cus_name", mm.mo890c());
        bundle.putString("curr_name", mm.mo888a());
        bundle.putInt(Property.POSITION, i);
        bundle.putInt(Attribute.SIZE, i2);
        bundle.putString("searchString", str);
        setArguments(bundle);
    }

    /* renamed from: a */
    public double mo4917a(List<C0208KL> list) {
        double d = 0.0d;
        for (int size = list.size() - 1; size >= 0; size--) {
            int i = ((C0208KL) list.get(size)).mo676g() == this.f3543v[0] ? -1 : ((C0208KL) list.get(size)).mo676g() == this.f3543v[2] ? 1 : 0;
            double parseDouble = Double.parseDouble(((C0208KL) list.get(size)).mo668a().replaceAll(",", ""));
            double d2 = (double) i;
            Double.isNaN(d2);
            d += parseDouble * d2;
        }
        return d;
    }

    /* renamed from: a */
    public void mo4918a() {
        String str = "android.permission.WRITE_EXTERNAL_STORAGE";
        if (!(ContextCompat.checkSelfPermission(getActivity(), str) == 0)) {
            ActivityCompat.requestPermissions(getActivity(), new String[]{str}, C0776fN.AppCompatTheme_windowActionBarOverlay);
        }
    }

    /* renamed from: a */
    public void mo4919a(int i) {
        TextView textView;
        StringBuilder sb;
        StringBuilder sb2;
        TextView textView2;
        StringBuilder sb3;
        NumberFormat instance = NumberFormat.getInstance(Locale.ENGLISH);
        String str = "";
        String str2 = "\t";
        String str3 = ":-";
        if (i == 1) {
            this.f3540s.setText(getString(2131755188));
            try {
                ArrayList p = !C0195JU.f451k ? this.f3523b.mo606p(this.f3524c) : this.f3523b.mo585i(this.f3524c, this.f3526e);
                if (p.size() > 0) {
                    if (Double.parseDouble((String) p.get(0)) >= 0.0d) {
                        this.f3537p.setImageResource(this.f3543v[2]);
                        textView2 = this.f3540s;
                        sb3 = new StringBuilder();
                        sb3.append(this.f3523b.mo455E());
                        sb3.append(str3);
                        sb3.append(instance.format(Double.parseDouble((String) p.get(0))));
                        if (C0195JU.f451k) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(str2);
                            sb4.append(this.f3526e);
                            str = sb4.toString();
                        }
                        sb3.append(str);
                    } else {
                        this.f3537p.setImageResource(this.f3543v[0]);
                        textView2 = this.f3540s;
                        sb3 = new StringBuilder();
                        sb3.append(this.f3523b.mo597m());
                        sb3.append(str3);
                        sb3.append(instance.format(Double.parseDouble((String) p.get(0))));
                        if (C0195JU.f451k) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(str2);
                            sb5.append(this.f3526e);
                            str = sb5.toString();
                        }
                        sb3.append(str);
                    }
                    textView2.setText(sb3.toString());
                }
            } catch (Exception unused) {
            }
        } else if (i == 2) {
            double a = mo4917a((List<C0208KL>) this.f3534m.f1651b);
            if (a >= 0.0d) {
                this.f3537p.setImageResource(this.f3543v[2]);
                textView = this.f3540s;
                sb = new StringBuilder();
                sb.append(this.f3523b.mo455E());
                sb.append(str3);
                sb.append(instance.format(a));
                if (C0195JU.f451k) {
                    sb2 = new StringBuilder();
                }
                sb.append(str);
                textView.setText(sb.toString());
            }
            this.f3537p.setImageResource(this.f3543v[0]);
            textView = this.f3540s;
            sb = new StringBuilder();
            sb.append(this.f3523b.mo597m());
            sb.append(str3);
            sb.append(instance.format(a));
            if (C0195JU.f451k) {
                sb2 = new StringBuilder();
            }
            sb.append(str);
            textView.setText(sb.toString());
            sb2.append(str2);
            sb2.append(this.f3526e);
            str = sb2.toString();
            sb.append(str);
            textView.setText(sb.toString());
        }
    }

    /* renamed from: a */
    public void onLoadFinished(Loader<ArrayList<C0208KL>> loader, ArrayList<C0208KL> arrayList) {
        String str = "trace_E_Loader1_mon=";
        String str2 = ":";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(FragmentStatePagerSupport_Main.m2279h());
            sb.append(str2);
            sb.append(this.f3526e);
            sb.append(str2);
            sb.append(this.f3524c);
            Log.d(str, sb.toString());
            this.f3535n = arrayList;
            this.f3533l.setEmptyView(this.f3547z);
            this.f3534m = new C0546ZM(getActivity(), this.f3535n);
            this.f3533l.setAdapter(this.f3534m);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(FragmentStatePagerSupport_Main.m2279h());
            sb2.append(str2);
            sb2.append(this.f3526e);
            sb2.append(str2);
            sb2.append(this.f3524c);
            Log.d(str, sb2.toString());
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo4921a(String str) {
        new Builder(getActivity()).setTitle("Permission Request").setMessage(str).setCancelable(false).setPositiveButton(17039379, new C0882kT(this)).show();
    }

    public void amount_add_btn(View view) {
        startActivity(new Intent(view.getContext(), Customer_Det_List_edit.class));
    }

    /* renamed from: b */
    public ArrayList<C0186JL> mo4923b(String str) {
        ArrayList<C0186JL> arrayList = new ArrayList<>();
        Cursor w = !C0195JU.f451k ? this.f3523b.mo628w(str, this.f3524c) : this.f3523b.mo580h(str, this.f3524c, this.f3526e);
        w.moveToFirst();
        while (!w.isAfterLast()) {
            C0186JL jl = new C0186JL(w.getString(w.getColumnIndex(Attribute.f2026ID)), w.getString(w.getColumnIndex("_id")), w.getString(w.getColumnIndex("phone")), w.getDouble(w.getColumnIndex("amount")), this.f3543v[w.getInt(w.getColumnIndex("_in"))], w.getInt(w.getColumnIndex("days_late")));
            arrayList.add(jl);
            w.moveToNext();
        }
        w.close();
        for (int i = 0; i <= arrayList.size() - 1; i++) {
            this.f3527f += Double.parseDouble(((C0186JL) arrayList.get(i)).mo430a().replaceAll(",", ""));
            C0186JL jl2 = (C0186JL) arrayList.get(i);
            jl2.mo431a(this.f3527f);
            arrayList.set(i, jl2);
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo4924b() {
        int groupCount = this.f3534m.getGroupCount();
        for (int i = 0; i < groupCount; i++) {
            this.f3533l.collapseGroup(i);
        }
    }

    /* renamed from: b */
    public final void mo4925b(List<C0208KL> list) {
        Collections.sort(this.f3535n, new C0971d(null));
    }

    /* renamed from: c */
    public final void mo4926c() {
        int i = Calendar.getInstance().get(14);
        LoaderManager supportLoaderManager = getActivity().getSupportLoaderManager();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3524c);
        sb.append(1);
        supportLoaderManager.initLoader(Integer.parseInt(sb.toString()) * i * 1000000, null, this.f3520H).forceLoad();
        LoaderManager supportLoaderManager2 = getActivity().getSupportLoaderManager();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f3524c);
        sb2.append(1);
        supportLoaderManager2.initLoader(Integer.parseInt(sb2.toString()) * i, null, this).forceLoad();
    }

    /* renamed from: c */
    public void mo4927c(String str) {
        try {
            this.f3534m.getFilter().filter(str);
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public final void mo4928c(List<C0208KL> list) {
        Collections.sort(this.f3535n, new C0968a(null));
    }

    /* renamed from: d */
    public void mo4929d() {
        try {
            if (this.f3523b.mo524a("black_list", false) || !this.f3523b.mo524a("prefAds", false)) {
                this.f3513A.loadAd(new AdRequest.Builder().build());
                return;
            }
            this.f3513A.setVisibility(8);
        } catch (Exception e) {
            Log.d("ads_error:", e.getMessage());
        }
    }

    /* renamed from: d */
    public final void mo4930d(List<C0208KL> list) {
        Collections.sort(list, Collections.reverseOrder(new C0927mT(this)));
    }

    /* renamed from: e */
    public final void mo4931e(List<C0208KL> list) {
        Collections.sort(list, Collections.reverseOrder(new C0611aT(this)));
    }

    /* renamed from: f */
    public final void mo4932f(List<C0208KL> list) {
        Collections.sort(this.f3535n, new C0972e(null));
    }

    /* renamed from: g */
    public final void mo4933g(List<C0208KL> list) {
        Collections.sort(this.f3535n, new C0969b(null));
    }

    /* renamed from: h */
    public final void mo4934h(List<C0208KL> list) {
        Collections.sort(list, Collections.reverseOrder(new C0907lT(this)));
    }

    public void help_btn(View view) {
        Builder builder = new Builder(getActivity());
        WebView webView = new WebView(getActivity());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/help.html");
        webView.setWebViewClient(new C0650cT(this));
        builder.setView(webView);
        builder.setNegativeButton(getString(2131755134), new C0739dT(this));
        builder.show();
    }

    /* renamed from: i */
    public final void mo4936i(List<C0208KL> list) {
        Collections.sort(list, Collections.reverseOrder(new C0948nT(this)));
    }

    public void onAttach(Activity activity) {
        C0967oT.super.onAttach(activity);
        this.f3517E = activity;
        try {
            this.f3516D = (C0970c) activity;
        } catch (ClassCastException unused) {
        }
    }

    public void onClick(View view) {
        mo4924b();
        switch (view.getId()) {
            case 2131296317:
                sort_amount_click(view);
                return;
            case 2131296394:
                sort_name_click(view);
                return;
            case 2131296397:
                sort_tr_days_click(view);
                return;
            case 2131296495:
                sort_tr_type_click(view);
                return;
            default:
                return;
        }
    }

    public void onCreate(Bundle bundle) {
        C0967oT.super.onCreate(bundle);
        try {
            this.f3523b = new C0195JU(this.f3522a, getActivity());
            String str = "";
            this.f3524c = getArguments() != null ? getArguments().getString("cus_id") : str;
            this.f3525d = getArguments() != null ? getArguments().getString("cus_name") : str;
            if (getArguments() != null) {
                str = getArguments().getString("curr_name");
            }
            this.f3526e = str;
        } catch (Exception unused) {
        }
    }

    public Loader<ArrayList<C0208KL>> onCreateLoader(int i, Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        sb.append(FragmentStatePagerSupport_Main.m2279h());
        String str = ":";
        sb.append(str);
        sb.append(this.f3526e);
        sb.append(str);
        sb.append(this.f3524c);
        Log.d("trace_S_Loader1_mon=", sb.toString());
        C1162xR xRVar = new C1162xR(getActivity(), this.f3524c, this.f3526e, this.f3523b, 2);
        return xRVar;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (menu != null) {
            menu.clear();
        }
        menuInflater.inflate(2131558410, menu);
        MenuItem findItem = menu.findItem(2131296605);
        SearchView actionView = MenuItemCompat.getActionView(findItem);
        actionView.setSearchableInfo(((SearchManager) getActivity().getSystemService("search")).getSearchableInfo(getActivity().getComponentName()));
        actionView.setQueryHint(getString(2131755371));
        actionView.setOnQueryTextListener(new C0842iT(this));
        MenuItemCompat.setOnActionExpandListener(findItem, new C0862jT(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            View inflate = layoutInflater.inflate(2131493016, viewGroup, false);
            this.f3523b = new C0195JU(this.f3522a, getActivity());
            setHasOptionsMenu(true);
            this.f3540s = (TextView) inflate.findViewById(2131296466);
            this.f3537p = (ImageView) inflate.findViewById(2131296495);
            this.f3544w = (TextView) inflate.findViewById(2131296394);
            this.f3545x = (TextView) inflate.findViewById(2131296317);
            this.f3546y = (TextView) inflate.findViewById(2131296397);
            this.f3544w.setOnClickListener(this);
            this.f3545x.setOnClickListener(this);
            this.f3546y.setOnClickListener(this);
            this.f3537p.setOnClickListener(this);
            this.f3538q = (ImageView) inflate.findViewById(2131296497);
            this.f3539r = (ImageView) inflate.findViewById(2131296503);
            this.f3538q.setOnClickListener(this.f3521I);
            this.f3539r.setOnClickListener(this.f3521I);
            this.f3533l = (ExpandableListView) inflate.findViewById(2131296534);
            this.f3547z = (TextView) inflate.findViewById(2131296440);
            this.f3533l.setGroupIndicator(null);
            this.f3533l.setOnChildClickListener(this.f3514B);
            this.f3533l.setOnGroupClickListener(this.f3515C);
            this.f3533l.setOnGroupExpandListener(new C0782fT(this));
            try {
                mo4926c();
                this.f3513A = inflate.findViewById(2131296305);
                mo4929d();
            } catch (Exception unused) {
            }
            return inflate;
        } catch (Exception unused2) {
            return null;
        }
    }

    public void onDetach() {
        C0967oT.super.onDetach();
        this.f3517E = null;
    }

    public void onLoaderReset(Loader<ArrayList<C0208KL>> loader) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        int itemId = menuItem.getItemId();
        if (itemId == 2131296577) {
            mo4918a();
            StringBuilder sb = new StringBuilder();
            sb.append(getActivity().getString(2131755059));
            sb.append("#");
            sb.append(this.f3525d);
            if (!C0195JU.f451k) {
                str = "";
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("-");
                sb2.append(this.f3526e);
                str = sb2.toString();
            }
            sb.append(str);
            String sb3 = sb.toString();
            mo4924b();
            C0195JU ju = this.f3523b;
            ju.mo536b(this.f3533l, ju.mo465K(sb3), mo4917a((List<C0208KL>) this.f3534m.f1651b), this.f3526e);
            C0195JU ju2 = this.f3523b;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.f3523b.mo465K(sb3));
            sb4.append(".pdf");
            ju2.mo462I(sb4.toString());
            return true;
        } else if (itemId != 16908332) {
            return C0967oT.super.onOptionsItemSelected(menuItem);
        } else {
            getActivity().finish();
            return true;
        }
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (i != 112) {
            return;
        }
        if (iArr.length != 1 || iArr[0] != 0) {
            mo4921a(getString(2131755273));
        }
    }

    public void setUserVisibleHint(boolean z) {
        C0967oT.super.setUserVisibleHint(z);
    }

    public void sort_amount_click(View view) {
        int i;
        if (this.f3518F == 0) {
            mo4925b((List<C0208KL>) this.f3535n);
            this.f3534m.notifyDataSetChanged();
            i = 1;
        } else {
            mo4932f((List<C0208KL>) this.f3535n);
            this.f3534m.notifyDataSetChanged();
            i = 0;
        }
        this.f3518F = i;
    }

    public void sort_name_click(View view) {
        int i;
        if (this.f3518F == 0) {
            mo4934h(this.f3535n);
            this.f3534m.notifyDataSetChanged();
            i = 1;
        } else {
            mo4930d((List<C0208KL>) this.f3535n);
            this.f3534m.notifyDataSetChanged();
            i = 0;
        }
        this.f3518F = i;
    }

    public void sort_tr_days_click(View view) {
        int i;
        if (this.f3518F == 0) {
            mo4933g((List<C0208KL>) this.f3535n);
            this.f3534m.notifyDataSetChanged();
            i = 1;
        } else {
            mo4928c((List<C0208KL>) this.f3535n);
            this.f3534m.notifyDataSetChanged();
            i = 0;
        }
        this.f3518F = i;
    }

    public void sort_tr_type_click(View view) {
        int i;
        if (this.f3518F == 0) {
            mo4936i(this.f3535n);
            this.f3534m.notifyDataSetChanged();
            i = 1;
        } else {
            mo4931e((List<C0208KL>) this.f3535n);
            this.f3534m.notifyDataSetChanged();
            i = 0;
        }
        this.f3518F = i;
    }
}
