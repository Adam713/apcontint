package com.adam.myapplication;


import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.app.SearchManager;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.Loader;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.ContextThemeWrapper;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
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
import com.itextpdf.tool.xml.css.CSS.Value;
import com.itextpdf.tool.xml.html.HTML.Attribute;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

public class Report3_balance_month_exp extends AppCompatActivity implements OnClickListener, LoaderCallbacks<ArrayList<C0777fO>> {

    /* renamed from: A */
    public OnDateSetListener f2604A = new C0571_N(this);

    /* renamed from: B */
    public int f2605B;

    /* renamed from: C */
    public int f2606C;

    /* renamed from: D */
    public int f2607D;

    /* renamed from: E */
    public int f2608E = 0;

    /* renamed from: F */
    public String f2609F;

    /* renamed from: G */
    public String f2610G;

    /* renamed from: H */
    public TextView f2611H;

    /* renamed from: I */
    public TextView f2612I;

    /* renamed from: J */
    public int f2613J;

    /* renamed from: K */
    public ArrayList<String> f2614K;

    /* renamed from: L */
    public LoaderCallbacks<List<String>> f2615L;

    /* renamed from: a */
    public SQLiteDatabase f2616a;

    /* renamed from: b */
    public C0195JU f2617b;

    /* renamed from: c */
    public double f2618c = 0.0d;

    /* renamed from: d */
    public int f2619d = 0;

    /* renamed from: e */
    public AutoCompleteTextView f2620e = null;

    /* renamed from: f */
    public EditText f2621f = null;

    /* renamed from: g */
    public EditText f2622g = null;

    /* renamed from: h */
    public Button f2623h = null;

    /* renamed from: i */
    public ExpandableListView f2624i;

    /* renamed from: j */
    public C0604aN f2625j;

    /* renamed from: k */
    public ArrayList<C0777fO> f2626k = new ArrayList<>();

    /* renamed from: l */
    public LinkedHashMap<String, C0777fO> f2627l = new LinkedHashMap<>();

    /* renamed from: m */
    public ImageView f2628m = null;

    /* renamed from: n */
    public TextView f2629n = null;

    /* renamed from: o */
    public ImageButton f2630o = null;

    /* renamed from: p */
    public String[] f2631p = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    /* renamed from: q */
    public int[] f2632q = {2131230923, 1, 2131230855};

    /* renamed from: r */
    public TextView f2633r = null;

    /* renamed from: s */
    public TextView f2634s = null;

    /* renamed from: t */
    public TextView f2635t = null;

    /* renamed from: u */
    public TextView f2636u = null;

    /* renamed from: v */
    public TextView f2637v = null;

    /* renamed from: w */
    public AdView f2638w;

    /* renamed from: x */
    public OnChildClickListener f2639x = new C0437UN(this);

    /* renamed from: y */
    public OnGroupClickListener f2640y = new C0458VN(this);

    /* renamed from: z */
    public OnDateSetListener f2641z = new C0548ZN(this);

    /* renamed from: com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp$a */
    private static class C0715a implements Comparator<C0777fO> {
        public C0715a() {
        }

        public /* synthetic */ C0715a(C0369RN rn) {
            this();
        }

        /* renamed from: a */
        public int compare(C0777fO fOVar, C0777fO fOVar2) {
            return Double.valueOf(fOVar.mo4357g()).compareTo(Double.valueOf(fOVar2.mo4357g()));
        }
    }

    /* renamed from: com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp$b */
    private static class C0716b implements Comparator<C0777fO> {
        public C0716b() {
        }

        public /* synthetic */ C0716b(C0369RN rn) {
            this();
        }

        /* renamed from: a */
        public int compare(C0777fO fOVar, C0777fO fOVar2) {
            return Double.valueOf(fOVar2.mo4357g()).compareTo(Double.valueOf(fOVar.mo4357g()));
        }
    }

    /* renamed from: com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp$c */
    private static class C0717c implements Comparator<C0777fO> {
        public C0717c() {
        }

        public /* synthetic */ C0717c(C0369RN rn) {
            this();
        }

        /* renamed from: a */
        public int compare(C0777fO fOVar, C0777fO fOVar2) {
            String str = "";
            String str2 = ",";
            return Double.valueOf(fOVar.mo4350a().replaceAll(str2, str)).compareTo(Double.valueOf(fOVar2.mo4350a().replaceAll(str2, str)));
        }
    }

    /* renamed from: com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp$d */
    private static class C0718d implements Comparator<C0777fO> {
        public C0718d() {
        }

        public /* synthetic */ C0718d(C0369RN rn) {
            this();
        }

        /* renamed from: a */
        public int compare(C0777fO fOVar, C0777fO fOVar2) {
            String str = "";
            String str2 = ",";
            return Double.valueOf(fOVar2.mo4350a().replaceAll(str2, str)).compareTo(Double.valueOf(fOVar.mo4350a().replaceAll(str2, str)));
        }
    }

    public Report3_balance_month_exp() {
        String str = Value.PERCENTAGE;
        this.f2609F = str;
        this.f2610G = str;
        this.f2611H = null;
        this.f2612I = null;
        this.f2613J = 0;
        this.f2614K = new ArrayList<>();
        this.f2615L = new C0349QN(this);
    }

    /* renamed from: a */
    public double mo3998a(List<C0777fO> list) {
        double d = 0.0d;
        for (int size = list.size() - 1; size >= 0; size--) {
            d += Double.parseDouble(((C0777fO) list.get(size)).mo4357g().replaceAll(",", ""));
        }
        return d;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp, android.app.Activity] */
    /* renamed from: a */
    public void mo3999a() {
        try {
            this.f2608E = 0;
            Builder builder = new Builder(this);
            View inflate = getLayoutInflater().inflate(2131492918, null);
            builder.setView(inflate);
            this.f2611H = (TextView) inflate.findViewById(2131296451);
            this.f2612I = (TextView) inflate.findViewById(2131296647);
            this.f2611H.setOnClickListener(new C0606aO(this));
            this.f2612I.setOnClickListener(new C0169IN(this));
            builder.setPositiveButton(getString(2131755109), new C0188JN(this));
            builder.setNegativeButton(getString(2131755106), new C0210KN(this));
            AlertDialog create = builder.create();
            create.getWindow().setSoftInputMode(4);
            create.show();
            create.getButton(-1).setOnClickListener(new C0234LN(this, create));
        } catch (Exception e) {
            Log.d("adv_search_error=", e.getMessage());
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp, android.app.Activity] */
    /* renamed from: a */
    public void mo4000a(int i) {
        double a;
        TextView textView;
        StringBuilder sb;
        NumberFormat instance = NumberFormat.getInstance(Locale.ENGLISH);
        if (this.f2608E == 1) {
            a = mo3998a((List<C0777fO>) this.f2625j.f1832b);
            textView = this.f2629n;
            sb = new StringBuilder();
        } else if (i == 1) {
            this.f2629n.setText(getString(2131755188));
            try {
                ArrayList y = this.f2617b.mo633y();
                if (y.size() > 0) {
                    TextView textView2 = this.f2629n;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(getString(2131755187));
                    sb2.append(instance.format(Double.parseDouble((String) y.get(0))));
                    textView2.setText(sb2.toString());
                    return;
                }
                return;
            } catch (Exception unused) {
                return;
            }
        } else if (i == 2) {
            a = mo3998a((List<C0777fO>) this.f2625j.f1832b);
            textView = this.f2629n;
            sb = new StringBuilder();
        } else {
            return;
        }
        sb.append(getString(2131755189));
        sb.append(instance.format(a));
        textView.setText(sb.toString());
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp] */
    /* renamed from: a */
    public void mo4001a(Cursor cursor) {
        cursor.getCount();
        this.f2626k.clear();
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            String str = Attribute.f2026ID;
            C0777fO fOVar = new C0777fO(cursor.getString(cursor.getColumnIndex(str)), cursor.getString(cursor.getColumnIndex("_id")), "", cursor.getString(cursor.getColumnIndex("cr_amount")), cursor.getString(cursor.getColumnIndex("db_amount")), cursor.getString(cursor.getColumnIndex("net_balance")), !C0195JU.f451k ? "" : cursor.getString(cursor.getColumnIndex("curr_name")));
            boolean z = C0195JU.f451k;
            fOVar.mo4351a(mo4006b(cursor.getString(cursor.getColumnIndex(str))));
            this.f2626k.add(fOVar);
            cursor.moveToNext();
        }
        cursor.close();
        this.f2625j = new C0604aN(this, this.f2626k);
        this.f2624i.setAdapter(this.f2625j);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp] */
    /* renamed from: a */
    public void onLoadFinished(Loader<ArrayList<C0777fO>> loader, ArrayList<C0777fO> arrayList) {
        String str = "trace_E_Loader1_mon=";
        try {
            Log.d(str, FragmentStatePagerSupport_Main.m2279h());
            this.f2626k = arrayList;
            this.f2624i.setEmptyView(this.f2637v);
            this.f2625j = new C0604aN(this, this.f2626k);
            this.f2624i.setAdapter(this.f2625j);
            Log.d(str, FragmentStatePagerSupport_Main.m2279h());
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp] */
    /* renamed from: a */
    public final void mo4003a(String str) {
        new Builder(this).setTitle("Permission Request").setMessage(str).setCancelable(false).setPositiveButton(17039379, new C0520YN(this)).show();
    }

    /* renamed from: a */
    public final boolean mo4004a(int i, int i2) {
        int i3 = VERSION.SDK_INT;
        return i3 >= i && i3 <= i2;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp, android.app.Activity] */
    public void amount_add_btn(View view) {
        startActivity(new Intent(view.getContext(), Customer_Det_List_edit.class));
    }

    /* renamed from: b */
    public ArrayList<C0754eO> mo4006b(String str) {
        Cursor cursor;
        ArrayList<C0754eO> arrayList = new ArrayList<>();
        String str2 = "";
        if (this.f2608E == 0) {
            cursor = !C0195JU.f451k ? this.f2617b.mo473P(str) : this.f2617b.mo625v(str, str2);
        } else {
            boolean isEmpty = this.f2609F.isEmpty();
            String str3 = Value.PERCENTAGE;
            this.f2609F = isEmpty ? str3 : this.f2609F;
            if (!this.f2610G.isEmpty()) {
                str3 = this.f2610G;
            }
            this.f2610G = str3;
            cursor = !C0195JU.f451k ? this.f2617b.mo575g(str, this.f2609F, this.f2610G) : this.f2617b.mo556d(str, this.f2609F, this.f2610G, str2);
        }
        C0780fR fRVar = new C0780fR();
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            String str4 = "net_balance";
            C0754eO eOVar = new C0754eO(cursor.getString(fRVar.mo4360a(cursor, Attribute.f2026ID)), cursor.getString(fRVar.mo4360a(cursor, "_id")), cursor.getString(fRVar.mo4360a(cursor, "gsm")), cursor.getString(fRVar.mo4360a(cursor, "cr_amount")), cursor.getString(fRVar.mo4360a(cursor, "db_amount")), cursor.getString(fRVar.mo4360a(cursor, str4)).equals("-0") ? "0" : cursor.getString(fRVar.mo4360a(cursor, str4)));
            arrayList.add(eOVar);
            cursor.moveToNext();
        }
        fRVar.mo4361a();
        cursor.close();
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp, android.app.Activity] */
    /* renamed from: b */
    public void mo4007b() {
        String str = "android.permission.WRITE_EXTERNAL_STORAGE";
        if (!(ContextCompat.checkSelfPermission(this, str) == 0)) {
            ActivityCompat.requestPermissions(this, new String[]{str}, C0776fN.AppCompatTheme_windowActionBarOverlay);
        }
    }

    /* renamed from: b */
    public final void mo4008b(List<C0777fO> list) {
        Collections.sort(this.f2626k, new C0717c(null));
    }

    /* renamed from: c */
    public final void mo4009c() {
        int groupCount = this.f2625j.getGroupCount();
        for (int i = 0; i < groupCount; i++) {
            this.f2624i.collapseGroup(i);
        }
    }

    /* renamed from: c */
    public void mo4010c(String str) {
        this.f2625j.getFilter().filter(str);
    }

    /* renamed from: c */
    public final void mo4011c(List<C0777fO> list) {
        Collections.sort(this.f2626k, new C0715a(null));
    }

    /* renamed from: d */
    public final void mo4012d() {
        int i = Calendar.getInstance().get(14);
        getSupportLoaderManager().initLoader(1000000 * i, null, this.f2615L).forceLoad();
        getSupportLoaderManager().initLoader(i, null, this).forceLoad();
    }

    /* renamed from: d */
    public final void mo4013d(List<C0777fO> list) {
        Collections.sort(list, Collections.reverseOrder(new C0281NN(this)));
    }

    /* renamed from: e */
    public void mo4014e() {
        Cursor f;
        String str = "";
        if (this.f2608E == 0) {
            f = !C0195JU.f451k ? this.f2617b.mo488X() : this.f2617b.mo469M(str);
        } else {
            boolean isEmpty = this.f2609F.isEmpty();
            String str2 = Value.PERCENTAGE;
            this.f2609F = isEmpty ? str2 : this.f2609F;
            if (!this.f2610G.isEmpty()) {
                str2 = this.f2610G;
            }
            this.f2610G = str2;
            f = !C0195JU.f451k ? this.f2617b.mo614s(this.f2609F, this.f2610G) : this.f2617b.mo571f(this.f2609F, this.f2610G, str);
        }
        mo4001a(f);
        mo4000a(1);
    }

    /* renamed from: e */
    public final void mo4015e(List<C0777fO> list) {
        Collections.sort(list, Collections.reverseOrder(new C0327PN(this)));
    }

    /* renamed from: f */
    public final void mo4016f(List<C0777fO> list) {
        Collections.sort(this.f2626k, new C0718d(null));
    }

    /* renamed from: f */
    public final boolean mo4017f() {
        return Build.MANUFACTURER.equalsIgnoreCase("samsung") && mo4004a(21, 22);
    }

    /* renamed from: g */
    public void mo4018g() {
        try {
            this.f2638w = findViewById(2131296305);
            if (this.f2617b.mo524a("black_list", false) || !this.f2617b.mo524a("prefAds", false)) {
                this.f2638w.loadAd(new AdRequest.Builder().build());
                return;
            }
            this.f2638w.setVisibility(8);
        } catch (Exception e) {
            Log.d("ads_error:", e.getMessage());
        }
    }

    /* renamed from: g */
    public final void mo4019g(List<C0777fO> list) {
        Collections.sort(this.f2626k, new C0716b(null));
    }

    /* renamed from: h */
    public final void mo4020h() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    /* renamed from: h */
    public final void mo4021h(List<C0777fO> list) {
        Collections.sort(list, Collections.reverseOrder(new C0261MN(this)));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp, android.app.Activity] */
    public void help_btn(View view) {
        Builder builder = new Builder(this);
        WebView webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/help.html");
        webView.setWebViewClient(new C0391SN(this));
        builder.setView(webView);
        builder.setNegativeButton(getString(2131755134), new C0411TN(this));
        builder.show();
    }

    /* renamed from: i */
    public final void mo4023i(List<C0777fO> list) {
        Collections.sort(list, Collections.reverseOrder(new C0305ON(this)));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp, android.app.Activity] */
    public void onBackPressed() {
        Intent intent = new Intent(this, FragmentStatePagerSupport_Main.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public void onClick(View view) {
        mo4009c();
        switch (view.getId()) {
            case 2131296378:
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

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    public void onCreate(Bundle bundle) {
        Report3_balance_month_exp.super.onCreate(bundle);
        setContentView(2131493017);
        mo4020h();
        setTitle(getString(2131755056));
        this.f2617b = new C0195JU(this.f2616a, this);
        mo4018g();
        this.f2629n = (TextView) findViewById(2131296466);
        this.f2633r = (TextView) findViewById(2131296394);
        this.f2634s = (TextView) findViewById(2131296378);
        this.f2635t = (TextView) findViewById(2131296398);
        this.f2634s.setText(this.f2617b.mo455E());
        this.f2635t.setText(this.f2617b.mo597m());
        this.f2636u = (TextView) findViewById(2131296555);
        this.f2624i = (ExpandableListView) findViewById(2131296534);
        this.f2637v = (TextView) findViewById(2131296440);
        this.f2624i.setGroupIndicator(null);
        this.f2624i.setOnChildClickListener(this.f2639x);
        this.f2624i.setOnGroupClickListener(this.f2640y);
        this.f2624i.setOnGroupExpandListener(new C0369RN(this));
        try {
            mo4012d();
        } catch (Exception unused) {
        }
        Calendar instance = Calendar.getInstance();
        new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        this.f2605B = instance.get(1);
        this.f2606C = instance.get(2);
        this.f2607D = instance.get(5);
    }

    public Dialog onCreateDialog(int i) {
        if (i == 0) {
            DatePickerDialog datePickerDialog = new DatePickerDialog(mo4017f() ? new ContextThemeWrapper(this, 16973939) : this, this.f2641z, this.f2605B, this.f2606C, this.f2607D);
            return datePickerDialog;
        } else if (i != 4) {
            return null;
        } else {
            DatePickerDialog datePickerDialog2 = new DatePickerDialog(mo4017f() ? new ContextThemeWrapper(this, 16973939) : this, this.f2604A, this.f2605B, this.f2606C, this.f2607D);
            return datePickerDialog2;
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.support.v4.content.Loader<java.util.ArrayList<p000.C0777fO>> onCreateLoader(int r7, android.os.Bundle r8) {
        /*
            r6 = this;
            java.lang.String r7 = com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.m2279h()
            java.lang.String r8 = "trace_S_Loader1_g="
            android.util.Log.d(r8, r7)
            aU r7 = new aU
            JU r4 = r6.f2617b
            java.lang.String r2 = ""
            java.lang.String r3 = ""
            r5 = 1
            r0 = r7
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp.onCreateLoader(int, android.os.Bundle):android.support.v4.content.Loader");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131558411, menu);
        MenuItem findItem = menu.findItem(2131296605);
        SearchView actionView = MenuItemCompat.getActionView(findItem);
        actionView.setSearchableInfo(((SearchManager) getSystemService("search")).getSearchableInfo(getComponentName()));
        actionView.setQueryHint(getString(2131755371));
        actionView.setOnQueryTextListener(new C0479WN(this));
        MenuItemCompat.setOnActionExpandListener(findItem, new C0500XN(this));
        return true;
    }

    public void onDestroy() {
        this.f2638w.destroy();
        Report3_balance_month_exp.super.onDestroy();
    }

    public void onLoaderReset(Loader<ArrayList<C0777fO>> loader) {
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp, android.app.Activity] */
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131296577) {
            mo4007b();
            String string = getString(2131755056);
            mo4009c();
            C0195JU ju = this.f2617b;
            ju.mo554c(this.f2624i, ju.mo465K(string), mo3998a((List<C0777fO>) this.f2625j.f1832b), "");
            C0195JU ju2 = this.f2617b;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f2617b.mo465K(string));
            sb.append(".pdf");
            ju2.mo462I(sb.toString());
            return true;
        } else if (itemId == 2131296309) {
            mo3999a();
            return true;
        } else if (itemId != 16908332) {
            return Report3_balance_month_exp.super.onOptionsItemSelected(menuItem);
        } else {
            finish();
            return true;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp, android.app.Activity] */
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (i != 112) {
            return;
        }
        if (iArr.length != 1 || iArr[0] != 0) {
            mo4003a(getString(2131755273));
        }
    }

    public void onResume() {
        Report3_balance_month_exp.super.onResume();
    }

    public void sort_amount_click(View view) {
        int i;
        if (this.f2613J == 0) {
            mo4008b((List<C0777fO>) this.f2626k);
            this.f2625j.notifyDataSetChanged();
            i = 1;
        } else {
            mo4016f((List<C0777fO>) this.f2626k);
            this.f2625j.notifyDataSetChanged();
            i = 0;
        }
        this.f2613J = i;
    }

    public void sort_name_click(View view) {
        int i;
        if (this.f2613J == 0) {
            mo4021h(this.f2626k);
            this.f2625j.notifyDataSetChanged();
            i = 1;
        } else {
            mo4013d((List<C0777fO>) this.f2626k);
            this.f2625j.notifyDataSetChanged();
            i = 0;
        }
        this.f2613J = i;
    }

    public void sort_tr_days_click(View view) {
        int i;
        if (this.f2613J == 0) {
            mo4019g((List<C0777fO>) this.f2626k);
            this.f2625j.notifyDataSetChanged();
            i = 1;
        } else {
            mo4011c((List<C0777fO>) this.f2626k);
            this.f2625j.notifyDataSetChanged();
            i = 0;
        }
        this.f2613J = i;
    }

    public void sort_tr_type_click(View view) {
        int i;
        if (this.f2613J == 0) {
            mo4023i(this.f2626k);
            this.f2625j.notifyDataSetChanged();
            i = 1;
        } else {
            mo4015e((List<C0777fO>) this.f2626k);
            this.f2625j.notifyDataSetChanged();
            i = 0;
        }
        this.f2613J = i;
    }
}
