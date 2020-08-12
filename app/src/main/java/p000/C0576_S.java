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
/* renamed from: _S */
public class C0576_S extends Fragment implements OnClickListener, LoaderCallbacks<ArrayList<C0208KL>> {

    /* renamed from: A */
    public AdView f1735A;

    /* renamed from: B */
    public OnChildClickListener f1736B = new C0416TS(this);

    /* renamed from: C */
    public OnGroupClickListener f1737C = new C0442US(this);

    /* renamed from: D */
    public C0579c f1738D;

    /* renamed from: E */
    public Activity f1739E;

    /* renamed from: F */
    public int f1740F = 0;

    /* renamed from: G */
    public ArrayList<String> f1741G = new ArrayList<>();

    /* renamed from: H */
    public LoaderCallbacks<List<String>> f1742H = new C0310OS(this);

    /* renamed from: I */
    public OnClickListener f1743I = new C0374RS(this);

    /* renamed from: a */
    public SQLiteDatabase f1744a;

    /* renamed from: b */
    public C0195JU f1745b;

    /* renamed from: c */
    public String f1746c;

    /* renamed from: d */
    public String f1747d;

    /* renamed from: e */
    public String f1748e;

    /* renamed from: f */
    public double f1749f = 0.0d;

    /* renamed from: g */
    public int f1750g = 0;

    /* renamed from: h */
    public AutoCompleteTextView f1751h = null;

    /* renamed from: i */
    public EditText f1752i = null;

    /* renamed from: j */
    public EditText f1753j = null;

    /* renamed from: k */
    public Button f1754k = null;

    /* renamed from: l */
    public ExpandableListView f1755l;

    /* renamed from: m */
    public C0498XM f1756m;

    /* renamed from: n */
    public ArrayList<C0208KL> f1757n = new ArrayList<>();

    /* renamed from: o */
    public LinkedHashMap<String, C0208KL> f1758o = new LinkedHashMap<>();

    /* renamed from: p */
    public ImageView f1759p = null;

    /* renamed from: q */
    public ImageView f1760q = null;

    /* renamed from: r */
    public ImageView f1761r = null;

    /* renamed from: s */
    public TextView f1762s = null;

    /* renamed from: t */
    public ImageButton f1763t = null;

    /* renamed from: u */
    public String[] f1764u = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    /* renamed from: v */
    public int[] f1765v = {2131230923, 1, 2131230855};

    /* renamed from: w */
    public TextView f1766w = null;

    /* renamed from: x */
    public TextView f1767x = null;

    /* renamed from: y */
    public TextView f1768y = null;

    /* renamed from: z */
    public TextView f1769z = null;

    /* renamed from: _S$a */
    private static class C0577a implements Comparator<C0208KL> {
        public C0577a() {
        }

        public /* synthetic */ C0577a(C0396SS ss) {
            this();
        }

        /* renamed from: a */
        public int compare(C0208KL kl, C0208KL kl2) {
            return Double.valueOf(kl.mo672c()).compareTo(Double.valueOf(kl2.mo672c()));
        }
    }

    /* renamed from: _S$b */
    private static class C0578b implements Comparator<C0208KL> {
        public C0578b() {
        }

        public /* synthetic */ C0578b(C0396SS ss) {
            this();
        }

        /* renamed from: a */
        public int compare(C0208KL kl, C0208KL kl2) {
            return Double.valueOf(kl2.mo672c()).compareTo(Double.valueOf(kl.mo672c()));
        }
    }

    /* renamed from: _S$c */
    public interface C0579c {
        void onButtonClicked(View view);
    }

    /* renamed from: _S$d */
    private static class C0580d implements Comparator<C0208KL> {
        public C0580d() {
        }

        public /* synthetic */ C0580d(C0396SS ss) {
            this();
        }

        /* renamed from: a */
        public int compare(C0208KL kl, C0208KL kl2) {
            String str = "";
            String str2 = ",";
            return Double.valueOf(kl.mo668a().replaceAll(str2, str)).compareTo(Double.valueOf(kl2.mo668a().replaceAll(str2, str)));
        }
    }

    /* renamed from: _S$e */
    private static class C0581e implements Comparator<C0208KL> {
        public C0581e() {
        }

        public /* synthetic */ C0581e(C0396SS ss) {
            this();
        }

        /* renamed from: a */
        public int compare(C0208KL kl, C0208KL kl2) {
            String str = "";
            String str2 = ",";
            return Double.valueOf(kl2.mo668a().replaceAll(str2, str)).compareTo(Double.valueOf(kl.mo668a().replaceAll(str2, str)));
        }
    }

    public C0576_S() {
    }

    public C0576_S(C0260MM mm, int i, int i2, String str) {
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
    public double mo1744a(ArrayList<C0208KL> arrayList) {
        double d = 0.0d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            int i = ((C0208KL) arrayList.get(size)).mo676g() == this.f1765v[0] ? -1 : ((C0208KL) arrayList.get(size)).mo676g() == this.f1765v[2] ? 1 : 0;
            double parseDouble = Double.parseDouble(((C0208KL) arrayList.get(size)).mo668a().replaceAll(",", ""));
            double d2 = (double) i;
            Double.isNaN(d2);
            d += parseDouble * d2;
        }
        return d;
    }

    /* renamed from: a */
    public void mo1745a() {
        String str = "android.permission.WRITE_EXTERNAL_STORAGE";
        if (!(ContextCompat.checkSelfPermission(getActivity(), str) == 0)) {
            ActivityCompat.requestPermissions(getActivity(), new String[]{str}, C0776fN.AppCompatTheme_windowActionBarOverlay);
        }
    }

    /* renamed from: a */
    public void mo1746a(int i) {
        StringBuilder sb;
        TextView textView;
        StringBuilder sb2;
        TextView textView2;
        StringBuilder sb3;
        NumberFormat instance = NumberFormat.getInstance(Locale.ENGLISH);
        String str = "";
        String str2 = "\t";
        if (i == 1) {
            this.f1762s.setText(getString(2131755188));
            try {
                ArrayList p = !C0195JU.f451k ? this.f1745b.mo606p(this.f1746c) : this.f1745b.mo585i(this.f1746c, this.f1748e);
                if (p.size() > 0) {
                    if (Double.parseDouble((String) p.get(0)) >= 0.0d) {
                        this.f1759p.setImageResource(this.f1765v[2]);
                        textView2 = this.f1762s;
                        sb3 = new StringBuilder();
                        sb3.append(this.f1745b.mo455E());
                        sb3.append(":- ");
                        sb3.append(instance.format(Double.parseDouble((String) p.get(0))));
                        if (C0195JU.f451k) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(str2);
                            sb4.append(this.f1748e);
                            str = sb4.toString();
                        }
                        sb3.append(str);
                    } else {
                        this.f1759p.setImageResource(this.f1765v[0]);
                        textView2 = this.f1762s;
                        sb3 = new StringBuilder();
                        sb3.append(this.f1745b.mo597m());
                        sb3.append(instance.format(Double.parseDouble((String) p.get(0))));
                        if (C0195JU.f451k) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(str2);
                            sb5.append(this.f1748e);
                            str = sb5.toString();
                        }
                        sb3.append(str);
                    }
                    textView2.setText(sb3.toString());
                }
            } catch (Exception unused) {
            }
        } else if (i == 2) {
            double a = mo1744a(this.f1756m.f1438b);
            String str3 = ": ";
            if (a >= 0.0d) {
                this.f1759p.setImageResource(this.f1765v[2]);
                textView = this.f1762s;
                sb = new StringBuilder();
                sb.append(this.f1745b.mo455E());
                sb.append(str3);
                sb.append(instance.format(Math.abs(a)));
                if (C0195JU.f451k) {
                    sb2 = new StringBuilder();
                }
                sb.append(str);
                textView.setText(sb.toString());
            }
            this.f1759p.setImageResource(this.f1765v[0]);
            textView = this.f1762s;
            sb = new StringBuilder();
            sb.append(this.f1745b.mo597m());
            sb.append(str3);
            sb.append(instance.format(Math.abs(a)));
            if (C0195JU.f451k) {
                sb2 = new StringBuilder();
            }
            sb.append(str);
            textView.setText(sb.toString());
            sb2.append(str2);
            sb2.append(this.f1748e);
            str = sb2.toString();
            sb.append(str);
            textView.setText(sb.toString());
        }
    }

    /* renamed from: a */
    public void onLoadFinished(Loader<ArrayList<C0208KL>> loader, ArrayList<C0208KL> arrayList) {
        String str = "trace_E_Loader1_hdr=";
        String str2 = ":";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(FragmentStatePagerSupport_Main.m2279h());
            sb.append(str2);
            sb.append(this.f1748e);
            sb.append(str2);
            sb.append(this.f1746c);
            Log.d(str, sb.toString());
            this.f1757n = arrayList;
            this.f1755l.setEmptyView(this.f1769z);
            this.f1756m = new C0498XM(getActivity(), this.f1757n);
            this.f1755l.setAdapter(this.f1756m);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(FragmentStatePagerSupport_Main.m2279h());
            sb2.append(str2);
            sb2.append(this.f1748e);
            sb2.append(str2);
            sb2.append(this.f1746c);
            Log.d(str, sb2.toString());
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo1748a(String str) {
        new Builder(getActivity()).setTitle("Permission Request").setMessage(str).setCancelable(false).setPositiveButton(17039379, new C0505XS(this)).show();
    }

    /* renamed from: a */
    public final void mo1749a(List<C0208KL> list) {
        Collections.sort(this.f1757n, new C0580d(null));
    }

    public void amount_add_btn(View view) {
        startActivity(new Intent(view.getContext(), Customer_Det_List_edit.class));
    }

    /* renamed from: b */
    public ArrayList<C0186JL> mo1751b(String str) {
        ArrayList<C0186JL> arrayList = new ArrayList<>();
        Cursor N = !C0195JU.f451k ? this.f1745b.mo471N(str) : this.f1745b.mo619t(str, this.f1748e);
        C0780fR fRVar = new C0780fR();
        N.moveToFirst();
        while (!N.isAfterLast()) {
            String str2 = "_in";
            C0186JL jl = new C0186JL(N.getString(fRVar.mo4360a(N, str2)), N.getString(fRVar.mo4360a(N, "_id")), N.getString(fRVar.mo4360a(N, "phone")), N.getDouble(fRVar.mo4360a(N, "amount")), this.f1765v[N.getInt(fRVar.mo4360a(N, str2))], N.getInt(fRVar.mo4360a(N, "days_late")));
            arrayList.add(jl);
            N.moveToNext();
        }
        fRVar.mo4361a();
        N.close();
        this.f1749f = 0.0d;
        for (int i = 0; i <= arrayList.size() - 1; i++) {
            this.f1749f += Double.parseDouble(((C0186JL) arrayList.get(i)).mo430a().replaceAll(",", ""));
            C0186JL jl2 = (C0186JL) arrayList.get(i);
            jl2.mo431a(this.f1749f);
            arrayList.set(i, jl2);
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo1752b() {
        int groupCount = this.f1756m.getGroupCount();
        for (int i = 0; i < groupCount; i++) {
            this.f1755l.collapseGroup(i);
        }
    }

    /* renamed from: b */
    public final void mo1753b(List<C0208KL> list) {
        Collections.sort(this.f1757n, new C0577a(null));
    }

    /* renamed from: c */
    public final void mo1754c() {
        int i = Calendar.getInstance().get(14);
        LoaderManager supportLoaderManager = getActivity().getSupportLoaderManager();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1746c);
        sb.append(1);
        supportLoaderManager.initLoader(Integer.parseInt(sb.toString()) * i * 1000000, null, this.f1742H).forceLoad();
        LoaderManager supportLoaderManager2 = getActivity().getSupportLoaderManager();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1746c);
        sb2.append(1);
        supportLoaderManager2.initLoader(Integer.parseInt(sb2.toString()) * i, null, this).forceLoad();
    }

    /* renamed from: c */
    public void mo1755c(String str) {
        try {
            this.f1756m.getFilter().filter(str);
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public final void mo1756c(List<C0208KL> list) {
        Collections.sort(list, Collections.reverseOrder(new C0553ZS(this)));
    }

    /* renamed from: d */
    public void mo1757d() {
        try {
            if (this.f1745b.mo524a("black_list", false) || !this.f1745b.mo524a("prefAds", false)) {
                this.f1735A.loadAd(new AdRequest.Builder().build());
                return;
            }
            this.f1735A.setVisibility(8);
        } catch (Exception e) {
            Log.d("ads_error:", e.getMessage());
        }
    }

    /* renamed from: d */
    public final void mo1758d(List<C0208KL> list) {
        Collections.sort(list, Collections.reverseOrder(new C0286NS(this)));
    }

    /* renamed from: e */
    public final void mo1759e(List<C0208KL> list) {
        Collections.sort(this.f1757n, new C0581e(null));
    }

    /* renamed from: f */
    public final void mo1760f(List<C0208KL> list) {
        Collections.sort(this.f1757n, new C0578b(null));
    }

    /* renamed from: g */
    public final void mo1761g(List<C0208KL> list) {
        Collections.sort(list, Collections.reverseOrder(new C0531YS(this)));
    }

    /* renamed from: h */
    public final void mo1762h(List<C0208KL> list) {
        Collections.sort(list, Collections.reverseOrder(new C0266MS(this)));
    }

    public void help_btn(View view) {
        Builder builder = new Builder(getActivity());
        WebView webView = new WebView(getActivity());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/help.html");
        webView.setWebViewClient(new C0332PS(this));
        builder.setView(webView);
        builder.setNegativeButton(getString(2131755134), new C0354QS(this));
        builder.show();
    }

    public void onAttach(Activity activity) {
        C0576_S.super.onAttach(activity);
        this.f1739E = activity;
        try {
            this.f1738D = (C0579c) activity;
        } catch (ClassCastException unused) {
        }
    }

    public void onClick(View view) {
        mo1752b();
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
        C0576_S.super.onCreate(bundle);
        try {
            this.f1745b = new C0195JU(this.f1744a, getActivity());
            String str = "";
            this.f1746c = getArguments() != null ? getArguments().getString("cus_id") : str;
            this.f1747d = getArguments() != null ? getArguments().getString("cus_name") : str;
            if (getArguments() != null) {
                str = getArguments().getString("curr_name");
            }
            this.f1748e = str;
        } catch (Exception unused) {
        }
    }

    public Loader<ArrayList<C0208KL>> onCreateLoader(int i, Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        sb.append(FragmentStatePagerSupport_Main.m2279h());
        String str = ":";
        sb.append(str);
        sb.append(this.f1748e);
        sb.append(str);
        sb.append(this.f1746c);
        Log.d("trace_S_Loader1_hdr=", sb.toString());
        C1162xR xRVar = new C1162xR(getActivity(), this.f1746c, this.f1748e, this.f1745b, 1);
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
        actionView.setOnQueryTextListener(new C0463VS(this));
        MenuItemCompat.setOnActionExpandListener(findItem, new C0484WS(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            View inflate = layoutInflater.inflate(2131493015, viewGroup, false);
            this.f1745b = new C0195JU(this.f1744a, getActivity());
            setHasOptionsMenu(true);
            this.f1762s = (TextView) inflate.findViewById(2131296466);
            this.f1759p = (ImageView) inflate.findViewById(2131296495);
            this.f1766w = (TextView) inflate.findViewById(2131296394);
            this.f1767x = (TextView) inflate.findViewById(2131296317);
            this.f1768y = (TextView) inflate.findViewById(2131296397);
            this.f1766w.setOnClickListener(this);
            this.f1767x.setOnClickListener(this);
            this.f1768y.setOnClickListener(this);
            this.f1759p.setOnClickListener(this);
            this.f1760q = (ImageView) inflate.findViewById(2131296497);
            this.f1761r = (ImageView) inflate.findViewById(2131296503);
            this.f1760q.setOnClickListener(this.f1743I);
            this.f1761r.setOnClickListener(this.f1743I);
            this.f1755l = (ExpandableListView) inflate.findViewById(2131296534);
            this.f1769z = (TextView) inflate.findViewById(2131296440);
            this.f1755l.setGroupIndicator(null);
            this.f1755l.setOnChildClickListener(this.f1736B);
            this.f1755l.setOnGroupClickListener(this.f1737C);
            this.f1755l.setOnGroupExpandListener(new C0396SS(this));
            try {
                mo1754c();
                this.f1735A = inflate.findViewById(2131296305);
                mo1757d();
            } catch (Exception unused) {
            }
            return inflate;
        } catch (Exception unused2) {
            return null;
        }
    }

    public void onDetach() {
        C0576_S.super.onDetach();
        this.f1739E = null;
    }

    public void onLoaderReset(Loader<ArrayList<C0208KL>> loader) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        int itemId = menuItem.getItemId();
        if (itemId == 2131296577) {
            mo1745a();
            StringBuilder sb = new StringBuilder();
            sb.append(getActivity().getString(2131755060));
            sb.append("#");
            sb.append(this.f1747d);
            if (!C0195JU.f451k) {
                str = "";
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("-");
                sb2.append(this.f1748e);
                str = sb2.toString();
            }
            sb.append(str);
            String sb3 = sb.toString();
            mo1752b();
            C0195JU ju = this.f1745b;
            ju.mo561d(this.f1755l, ju.mo465K(sb3), mo1744a(this.f1756m.f1438b), this.f1748e);
            C0195JU ju2 = this.f1745b;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.f1745b.mo465K(sb3));
            sb4.append(".pdf");
            ju2.mo462I(sb4.toString());
            return true;
        } else if (itemId != 16908332) {
            return C0576_S.super.onOptionsItemSelected(menuItem);
        } else {
            getActivity().finish();
            return true;
        }
    }

    public void onPause() {
        this.f1735A.pause();
        C0576_S.super.onPause();
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (i != 112) {
            return;
        }
        if (iArr.length != 1 || iArr[0] != 0) {
            mo1748a(getString(2131755273));
        }
    }

    public void onResume() {
        C0576_S.super.onResume();
        AdView adView = this.f1735A;
        if (adView != null) {
            adView.resume();
        }
    }

    public void setUserVisibleHint(boolean z) {
        C0576_S.super.setUserVisibleHint(z);
    }

    public void sort_amount_click(View view) {
        int i;
        if (this.f1740F == 0) {
            mo1749a((List<C0208KL>) this.f1757n);
            this.f1756m.notifyDataSetChanged();
            i = 1;
        } else {
            mo1759e((List<C0208KL>) this.f1757n);
            this.f1756m.notifyDataSetChanged();
            i = 0;
        }
        this.f1740F = i;
    }

    public void sort_name_click(View view) {
        int i;
        if (this.f1740F == 0) {
            mo1761g((List<C0208KL>) this.f1757n);
            this.f1756m.notifyDataSetChanged();
            i = 1;
        } else {
            mo1756c((List<C0208KL>) this.f1757n);
            this.f1756m.notifyDataSetChanged();
            i = 0;
        }
        this.f1740F = i;
    }

    public void sort_tr_days_click(View view) {
        int i;
        if (this.f1740F == 0) {
            mo1760f((List<C0208KL>) this.f1757n);
            this.f1756m.notifyDataSetChanged();
            i = 1;
        } else {
            mo1753b((List<C0208KL>) this.f1757n);
            this.f1756m.notifyDataSetChanged();
            i = 0;
        }
        this.f1740F = i;
    }

    public void sort_tr_type_click(View view) {
        int i;
        if (this.f1740F == 0) {
            mo1762h(this.f1757n);
            this.f1756m.notifyDataSetChanged();
            i = 1;
        } else {
            mo1758d((List<C0208KL>) this.f1757n);
            this.f1756m.notifyDataSetChanged();
            i = 0;
        }
        this.f1740F = i;
    }
}
