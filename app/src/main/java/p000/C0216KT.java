package p000;

import android.annotation.SuppressLint;
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
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AlertDialog.Builder;
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
import com.itextpdf.tool.xml.css.CSS.Value;
import com.itextpdf.tool.xml.html.HTML.Attribute;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit;
import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

@SuppressLint({"ValidFragment"})
/* renamed from: KT */
public class C0216KT extends Fragment implements OnClickListener, LoaderCallbacks<ArrayList<C0777fO>> {

    /* renamed from: A */
    public TextView f539A = null;

    /* renamed from: B */
    public AdView f540B;

    /* renamed from: C */
    public OnChildClickListener f541C = new C0056CT(this);

    /* renamed from: D */
    public OnGroupClickListener f542D = new C0075DT(this);

    /* renamed from: E */
    public int f543E;

    /* renamed from: F */
    public int f544F;

    /* renamed from: G */
    public int f545G;

    /* renamed from: H */
    public int f546H = 0;

    /* renamed from: I */
    public String f547I;

    /* renamed from: J */
    public String f548J;

    /* renamed from: K */
    public TextView f549K;

    /* renamed from: L */
    public TextView f550L;

    /* renamed from: M */
    public int f551M;

    /* renamed from: N */
    public ArrayList<String> f552N;

    /* renamed from: O */
    public LoaderCallbacks<List<String>> f553O;

    /* renamed from: P */
    public OnClickListener f554P;

    /* renamed from: a */
    public SQLiteDatabase f555a;

    /* renamed from: b */
    public C0195JU f556b;

    /* renamed from: c */
    public String f557c;

    /* renamed from: d */
    public String f558d;

    /* renamed from: e */
    public String f559e;

    /* renamed from: f */
    public double f560f = 0.0d;

    /* renamed from: g */
    public int f561g = 0;

    /* renamed from: h */
    public AutoCompleteTextView f562h = null;

    /* renamed from: i */
    public EditText f563i = null;

    /* renamed from: j */
    public EditText f564j = null;

    /* renamed from: k */
    public Button f565k = null;

    /* renamed from: l */
    public ExpandableListView f566l;

    /* renamed from: m */
    public C0604aN f567m;

    /* renamed from: n */
    public ArrayList<C0777fO> f568n = new ArrayList<>();

    /* renamed from: o */
    public LinkedHashMap<String, C0777fO> f569o = new LinkedHashMap<>();

    /* renamed from: p */
    public ImageView f570p = null;

    /* renamed from: q */
    public ImageView f571q = null;

    /* renamed from: r */
    public ImageView f572r = null;

    /* renamed from: s */
    public TextView f573s = null;

    /* renamed from: t */
    public ImageButton f574t = null;

    /* renamed from: u */
    public String[] f575u = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    /* renamed from: v */
    public int[] f576v = {2131230923, 1, 2131230855};

    /* renamed from: w */
    public TextView f577w = null;

    /* renamed from: x */
    public TextView f578x = null;

    /* renamed from: y */
    public TextView f579y = null;

    /* renamed from: z */
    public TextView f580z = null;

    /* renamed from: KT$a */
    private static class C0217a implements Comparator<C0777fO> {
        public C0217a() {
        }

        public /* synthetic */ C0217a(C1164xT xTVar) {
            this();
        }

        /* renamed from: a */
        public int compare(C0777fO fOVar, C0777fO fOVar2) {
            return Double.valueOf(fOVar.mo4357g()).compareTo(Double.valueOf(fOVar2.mo4357g()));
        }
    }

    /* renamed from: KT$b */
    private static class C0218b implements Comparator<C0777fO> {
        public C0218b() {
        }

        public /* synthetic */ C0218b(C1164xT xTVar) {
            this();
        }

        /* renamed from: a */
        public int compare(C0777fO fOVar, C0777fO fOVar2) {
            return Double.valueOf(fOVar2.mo4357g()).compareTo(Double.valueOf(fOVar.mo4357g()));
        }
    }

    /* renamed from: KT$c */
    private static class C0219c implements Comparator<C0777fO> {
        public C0219c() {
        }

        public /* synthetic */ C0219c(C1164xT xTVar) {
            this();
        }

        /* renamed from: a */
        public int compare(C0777fO fOVar, C0777fO fOVar2) {
            String str = "";
            String str2 = ",";
            return Double.valueOf(fOVar.mo4350a().replaceAll(str2, str)).compareTo(Double.valueOf(fOVar2.mo4350a().replaceAll(str2, str)));
        }
    }

    /* renamed from: KT$d */
    private static class C0220d implements Comparator<C0777fO> {
        public C0220d() {
        }

        public /* synthetic */ C0220d(C1164xT xTVar) {
            this();
        }

        /* renamed from: a */
        public int compare(C0777fO fOVar, C0777fO fOVar2) {
            String str = "";
            String str2 = ",";
            return Double.valueOf(fOVar2.mo4350a().replaceAll(str2, str)).compareTo(Double.valueOf(fOVar.mo4350a().replaceAll(str2, str)));
        }
    }

    public C0216KT() {
        String str = Value.PERCENTAGE;
        this.f547I = str;
        this.f548J = str;
        this.f549K = null;
        this.f550L = null;
        this.f551M = 0;
        this.f552N = new ArrayList<>();
        this.f553O = new C1117vT(this);
        this.f554P = new C0032BT(this);
    }

    public C0216KT(C0260MM mm, int i, int i2, String str) {
        String str2 = Value.PERCENTAGE;
        this.f547I = str2;
        this.f548J = str2;
        this.f549K = null;
        this.f550L = null;
        this.f551M = 0;
        this.f552N = new ArrayList<>();
        this.f553O = new C1117vT(this);
        this.f554P = new C0032BT(this);
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
    public double mo685a(List<C0777fO> list) {
        double d = 0.0d;
        for (int size = list.size() - 1; size >= 0; size--) {
            d += Double.parseDouble(((C0777fO) list.get(size)).mo4357g().replaceAll(",", ""));
        }
        return d;
    }

    /* renamed from: a */
    public void mo686a() {
        try {
            this.f546H = 0;
            Builder builder = new Builder(getActivity());
            View inflate = getActivity().getLayoutInflater().inflate(2131492918, null);
            builder.setView(inflate);
            this.f549K = (TextView) inflate.findViewById(2131296451);
            this.f550L = (TextView) inflate.findViewById(2131296647);
            this.f549K.setOnClickListener(new C0155HT(this));
            this.f550L.setOnClickListener(new C0175IT(this));
            builder.setPositiveButton(getActivity().getString(2131755109), new C0194JT(this));
            builder.setNegativeButton(getActivity().getString(2131755106), new C0996pT(this));
            AlertDialog create = builder.create();
            create.getWindow().setSoftInputMode(4);
            create.show();
            create.getButton(-1).setOnClickListener(new C1015qT(this, create));
        } catch (Exception e) {
            Log.d("adv_search_error=", e.getMessage());
        }
    }

    /* renamed from: a */
    public void mo687a(int i) {
        TextView textView;
        StringBuilder sb;
        String sb2;
        StringBuilder sb3;
        TextView textView2;
        StringBuilder sb4;
        NumberFormat instance = NumberFormat.getInstance(Locale.ENGLISH);
        if (this.f546H == 1) {
            double a = mo685a((List<C0777fO>) this.f567m.f1832b);
            textView = this.f573s;
            StringBuilder sb5 = new StringBuilder();
            sb5.append(getString(2131755189));
            sb5.append(instance.format(a));
            sb2 = sb5.toString();
        } else {
            String str = "";
            String str2 = "\t";
            String str3 = ": ";
            if (i == 1) {
                this.f573s.setText(getString(2131755188));
                try {
                    ArrayList q = this.f556b.mo610q(this.f559e);
                    if (q.size() > 0) {
                        if (Double.parseDouble((String) q.get(0)) >= 0.0d) {
                            textView2 = this.f573s;
                            sb4 = new StringBuilder();
                            sb4.append(this.f556b.mo455E());
                            sb4.append(str3);
                            sb4.append(instance.format(Double.parseDouble((String) q.get(0))));
                            if (C0195JU.f451k) {
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append(str2);
                                sb6.append(this.f559e);
                                str = sb6.toString();
                            }
                            sb4.append(str);
                        } else {
                            textView2 = this.f573s;
                            sb4 = new StringBuilder();
                            sb4.append(this.f556b.mo597m());
                            sb4.append(str3);
                            sb4.append(instance.format(Math.abs(Double.parseDouble((String) q.get(0)))));
                            if (C0195JU.f451k) {
                                StringBuilder sb7 = new StringBuilder();
                                sb7.append(str2);
                                sb7.append(this.f559e);
                                str = sb7.toString();
                            }
                            sb4.append(str);
                        }
                        textView2.setText(sb4.toString());
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            } else if (i == 2) {
                double a2 = mo685a((List<C0777fO>) this.f567m.f1832b);
                if (a2 >= 0.0d) {
                    textView = this.f573s;
                    sb = new StringBuilder();
                    sb.append(this.f556b.mo455E());
                    sb.append(str3);
                    sb.append(instance.format(a2));
                    if (C0195JU.f451k) {
                        sb3 = new StringBuilder();
                    }
                    sb.append(str);
                    sb2 = sb.toString();
                } else {
                    textView = this.f573s;
                    sb = new StringBuilder();
                    sb.append(this.f556b.mo597m());
                    sb.append(str3);
                    sb.append(instance.format(Math.abs(a2)));
                    if (C0195JU.f451k) {
                        sb3 = new StringBuilder();
                    }
                    sb.append(str);
                    sb2 = sb.toString();
                }
                sb3.append(str2);
                sb3.append(this.f559e);
                str = sb3.toString();
                sb.append(str);
                sb2 = sb.toString();
            } else {
                return;
            }
        }
        textView.setText(sb2);
    }

    /* renamed from: a */
    public void mo688a(Cursor cursor) {
        cursor.getCount();
        this.f568n.clear();
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            String str = Attribute.f2026ID;
            C0777fO fOVar = new C0777fO(cursor.getString(cursor.getColumnIndex(str)), cursor.getString(cursor.getColumnIndex("_id")), "", cursor.getString(cursor.getColumnIndex("cr_amount")), cursor.getString(cursor.getColumnIndex("db_amount")), cursor.getString(cursor.getColumnIndex("net_balance")), !C0195JU.f451k ? "" : cursor.getString(cursor.getColumnIndex("curr_name")));
            fOVar.mo4351a(mo692b(cursor.getString(cursor.getColumnIndex(str))));
            this.f568n.add(fOVar);
            cursor.moveToNext();
        }
        cursor.close();
        this.f567m = new C0604aN(getActivity(), this.f568n);
        this.f566l.setAdapter(this.f567m);
    }

    /* renamed from: a */
    public void onLoadFinished(Loader<ArrayList<C0777fO>> loader, ArrayList<C0777fO> arrayList) {
        String str = "trace_E_Loader1_mon=";
        String str2 = ":";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(FragmentStatePagerSupport_Main.m2279h());
            sb.append(str2);
            sb.append(this.f559e);
            sb.append(str2);
            sb.append(this.f557c);
            Log.d(str, sb.toString());
            this.f568n = arrayList;
            this.f566l.setEmptyView(this.f539A);
            this.f567m = new C0604aN(getActivity(), this.f568n);
            this.f566l.setAdapter(this.f567m);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(FragmentStatePagerSupport_Main.m2279h());
            sb2.append(str2);
            sb2.append(this.f559e);
            sb2.append(str2);
            sb2.append(this.f557c);
            Log.d(str, sb2.toString());
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo690a(String str) {
        new android.app.AlertDialog.Builder(getActivity()).setTitle("Permission Request").setMessage(str).setCancelable(false).setPositiveButton(17039379, new C0133GT(this)).show();
    }

    public void amount_add_btn(View view) {
        startActivity(new Intent(view.getContext(), Customer_Det_List_edit.class));
    }

    /* renamed from: b */
    public ArrayList<C0754eO> mo692b(String str) {
        Cursor cursor;
        ArrayList<C0754eO> arrayList = new ArrayList<>();
        if (this.f546H == 0) {
            cursor = !C0195JU.f451k ? this.f556b.mo473P(str) : this.f556b.mo625v(str, this.f559e);
        } else {
            boolean isEmpty = this.f547I.isEmpty();
            String str2 = Value.PERCENTAGE;
            this.f547I = isEmpty ? str2 : this.f547I;
            if (!this.f548J.isEmpty()) {
                str2 = this.f548J;
            }
            this.f548J = str2;
            cursor = !C0195JU.f451k ? this.f556b.mo575g(str, this.f547I, this.f548J) : this.f556b.mo556d(str, this.f547I, this.f548J, this.f559e);
        }
        C0780fR fRVar = new C0780fR();
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            String str3 = "net_balance";
            C0754eO eOVar = new C0754eO(cursor.getString(fRVar.mo4360a(cursor, Attribute.f2026ID)), cursor.getString(fRVar.mo4360a(cursor, "_id")), cursor.getString(fRVar.mo4360a(cursor, "gsm")), cursor.getString(fRVar.mo4360a(cursor, "cr_amount")), cursor.getString(fRVar.mo4360a(cursor, "db_amount")), cursor.getString(fRVar.mo4360a(cursor, str3)).equals("-0") ? "0" : cursor.getString(fRVar.mo4360a(cursor, str3)));
            arrayList.add(eOVar);
            cursor.moveToNext();
        }
        fRVar.mo4361a();
        cursor.close();
        return arrayList;
    }

    /* renamed from: b */
    public void mo693b() {
        String str = "android.permission.WRITE_EXTERNAL_STORAGE";
        if (!(ContextCompat.checkSelfPermission(getActivity(), str) == 0)) {
            ActivityCompat.requestPermissions(getActivity(), new String[]{str}, C0776fN.AppCompatTheme_windowActionBarOverlay);
        }
    }

    /* renamed from: b */
    public final void mo694b(List<C0777fO> list) {
        Collections.sort(this.f568n, new C0219c(null));
    }

    /* renamed from: c */
    public final void mo695c() {
        int groupCount = this.f567m.getGroupCount();
        for (int i = 0; i < groupCount; i++) {
            this.f566l.collapseGroup(i);
        }
    }

    /* renamed from: c */
    public void mo696c(String str) {
        try {
            this.f567m.getFilter().filter(str);
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public final void mo697c(List<C0777fO> list) {
        Collections.sort(this.f568n, new C0217a(null));
    }

    /* renamed from: d */
    public final void mo698d() {
        int i = Calendar.getInstance().get(14);
        LoaderManager supportLoaderManager = getActivity().getSupportLoaderManager();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f557c);
        sb.append(1);
        supportLoaderManager.initLoader(Integer.parseInt(sb.toString()) * i * 1000000, null, this.f553O).forceLoad();
        LoaderManager supportLoaderManager2 = getActivity().getSupportLoaderManager();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f557c);
        sb2.append(1);
        supportLoaderManager2.initLoader(Integer.parseInt(sb2.toString()) * i, null, this).forceLoad();
    }

    /* renamed from: d */
    public final void mo699d(List<C0777fO> list) {
        Collections.sort(list, Collections.reverseOrder(new C1057sT(this)));
    }

    /* renamed from: e */
    public void mo700e() {
        Cursor f;
        if (this.f546H == 0) {
            f = !C0195JU.f451k ? this.f556b.mo488X() : this.f556b.mo469M(this.f559e);
        } else {
            boolean isEmpty = this.f547I.isEmpty();
            String str = Value.PERCENTAGE;
            this.f547I = isEmpty ? str : this.f547I;
            if (!this.f548J.isEmpty()) {
                str = this.f548J;
            }
            this.f548J = str;
            f = !C0195JU.f451k ? this.f556b.mo614s(this.f547I, this.f548J) : this.f556b.mo571f(this.f547I, this.f548J, this.f559e);
        }
        mo688a(f);
        mo687a(1);
    }

    /* renamed from: e */
    public final void mo701e(List<C0777fO> list) {
        Collections.sort(list, Collections.reverseOrder(new C1097uT(this)));
    }

    /* renamed from: f */
    public void mo702f() {
        try {
            if (this.f556b.mo524a("black_list", false) || !this.f556b.mo524a("prefAds", false)) {
                this.f540B.loadAd(new AdRequest.Builder().build());
                return;
            }
            this.f540B.setVisibility(8);
        } catch (Exception e) {
            Log.d("ads_error:", e.getMessage());
        }
    }

    /* renamed from: f */
    public final void mo703f(List<C0777fO> list) {
        Collections.sort(this.f568n, new C0220d(null));
    }

    /* renamed from: g */
    public final void mo704g(List<C0777fO> list) {
        Collections.sort(this.f568n, new C0218b(null));
    }

    /* renamed from: h */
    public final void mo705h(List<C0777fO> list) {
        Collections.sort(list, Collections.reverseOrder(new C1037rT(this)));
    }

    public void help_btn(View view) {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity());
        WebView webView = new WebView(getActivity());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/help.html");
        webView.setWebViewClient(new C1144wT(this));
        builder.setView(webView);
        builder.setNegativeButton(getString(2131755134), new C0013AT(this));
        builder.show();
    }

    /* renamed from: i */
    public final void mo707i(List<C0777fO> list) {
        Collections.sort(list, Collections.reverseOrder(new C1077tT(this)));
    }

    public void onClick(View view) {
        mo695c();
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
        C0216KT.super.onCreate(bundle);
        try {
            this.f556b = new C0195JU(this.f555a, getActivity());
            String str = "";
            this.f557c = getArguments() != null ? getArguments().getString("cus_id") : str;
            this.f558d = getArguments() != null ? getArguments().getString("cus_name") : str;
            if (getArguments() != null) {
                str = getArguments().getString("curr_name");
            }
            this.f559e = str;
            Calendar instance = Calendar.getInstance();
            new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
            this.f543E = instance.get(1);
            this.f544F = instance.get(2);
            this.f545G = instance.get(5);
        } catch (Exception unused) {
        }
    }

    public Loader<ArrayList<C0777fO>> onCreateLoader(int i, Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        sb.append(FragmentStatePagerSupport_Main.m2279h());
        String str = ":";
        sb.append(str);
        sb.append(this.f559e);
        sb.append(str);
        sb.append(this.f557c);
        Log.d("trace_S_Loader1_g=", sb.toString());
        C0612aU aUVar = new C0612aU(getActivity(), this.f557c, this.f559e, this.f556b, 1);
        return aUVar;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (menu != null) {
            menu.clear();
        }
        menuInflater.inflate(2131558411, menu);
        MenuItem findItem = menu.findItem(2131296605);
        SearchView actionView = MenuItemCompat.getActionView(findItem);
        actionView.setSearchableInfo(((SearchManager) getActivity().getSystemService("search")).getSearchableInfo(getActivity().getComponentName()));
        actionView.setQueryHint(getString(2131755371));
        actionView.setOnQueryTextListener(new C0094ET(this));
        MenuItemCompat.setOnActionExpandListener(findItem, new C0113FT(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(2131493017, viewGroup, false);
        this.f556b = new C0195JU(this.f555a, getActivity());
        setHasOptionsMenu(true);
        this.f573s = (TextView) inflate.findViewById(2131296466);
        this.f577w = (TextView) inflate.findViewById(2131296394);
        this.f578x = (TextView) inflate.findViewById(2131296378);
        this.f579y = (TextView) inflate.findViewById(2131296398);
        this.f578x.setText(this.f556b.mo455E());
        this.f579y.setText(this.f556b.mo597m());
        this.f580z = (TextView) inflate.findViewById(2131296555);
        this.f571q = (ImageView) inflate.findViewById(2131296497);
        this.f572r = (ImageView) inflate.findViewById(2131296503);
        this.f571q.setOnClickListener(this.f554P);
        this.f572r.setOnClickListener(this.f554P);
        this.f566l = (ExpandableListView) inflate.findViewById(2131296534);
        this.f539A = (TextView) inflate.findViewById(2131296440);
        this.f566l.setGroupIndicator(null);
        this.f566l.setOnChildClickListener(this.f541C);
        this.f566l.setOnGroupClickListener(this.f542D);
        this.f566l.setOnGroupExpandListener(new C1164xT(this));
        try {
            mo698d();
            this.f540B = inflate.findViewById(2131296305);
            mo702f();
        } catch (Exception unused) {
        }
        return inflate;
    }

    public void onLoaderReset(Loader<ArrayList<C0777fO>> loader) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        int itemId = menuItem.getItemId();
        if (itemId == 2131296577) {
            mo693b();
            StringBuilder sb = new StringBuilder();
            sb.append(getActivity().getString(2131755056));
            if (!C0195JU.f451k) {
                str = "";
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("-");
                sb2.append(this.f559e);
                str = sb2.toString();
            }
            sb.append(str);
            String sb3 = sb.toString();
            mo695c();
            C0195JU ju = this.f556b;
            ju.mo554c(this.f566l, ju.mo465K(sb3), mo685a((List<C0777fO>) this.f567m.f1832b), this.f559e);
            C0195JU ju2 = this.f556b;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.f556b.mo465K(sb3));
            sb4.append(".pdf");
            ju2.mo462I(sb4.toString());
            return true;
        } else if (itemId == 2131296309) {
            mo686a();
            return true;
        } else if (itemId != 16908332) {
            return C0216KT.super.onOptionsItemSelected(menuItem);
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
            mo690a(getString(2131755273));
        }
    }

    public void setUserVisibleHint(boolean z) {
        C0216KT.super.setUserVisibleHint(z);
    }

    public void sort_amount_click(View view) {
        int i;
        if (this.f551M == 0) {
            mo694b((List<C0777fO>) this.f568n);
            this.f567m.notifyDataSetChanged();
            i = 1;
        } else {
            mo703f((List<C0777fO>) this.f568n);
            this.f567m.notifyDataSetChanged();
            i = 0;
        }
        this.f551M = i;
    }

    public void sort_name_click(View view) {
        int i;
        if (this.f551M == 0) {
            mo705h((List<C0777fO>) this.f568n);
            this.f567m.notifyDataSetChanged();
            i = 1;
        } else {
            mo699d((List<C0777fO>) this.f568n);
            this.f567m.notifyDataSetChanged();
            i = 0;
        }
        this.f551M = i;
    }

    public void sort_tr_days_click(View view) {
        int i;
        if (this.f551M == 0) {
            mo704g((List<C0777fO>) this.f568n);
            this.f567m.notifyDataSetChanged();
            i = 1;
        } else {
            mo697c((List<C0777fO>) this.f568n);
            this.f567m.notifyDataSetChanged();
            i = 0;
        }
        this.f551M = i;
    }

    public void sort_tr_type_click(View view) {
        int i;
        if (this.f551M == 0) {
            mo707i((List<C0777fO>) this.f568n);
            this.f567m.notifyDataSetChanged();
            i = 1;
        } else {
            mo701e((List<C0777fO>) this.f568n);
            this.f567m.notifyDataSetChanged();
            i = 0;
        }
        this.f551M = i;
    }
}
