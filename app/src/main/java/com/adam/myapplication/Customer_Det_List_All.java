package com.adam.myapplication;


import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.itextpdf.tool.xml.css.CSS.Value;
import com.itextpdf.tool.xml.html.HTML.Attribute;
import java.lang.reflect.Field;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Customer_Det_List_All extends AppCompatActivity implements OnClickListener {

    /* renamed from: A */
    public int[] f2217A = {2131230923, 1, 2131230855};

    /* renamed from: B */
    public Toolbar f2218B = null;

    /* renamed from: C */
    public int f2219C;

    /* renamed from: D */
    public int f2220D;

    /* renamed from: E */
    public int f2221E;

    /* renamed from: F */
    public AdView f2222F;

    /* renamed from: G */
    public OnDateSetListener f2223G = new C1173yJ(this);

    /* renamed from: H */
    public OnDateSetListener f2224H = new C1195zJ(this);

    /* renamed from: I */
    public int f2225I = 0;

    /* renamed from: J */
    public String f2226J;

    /* renamed from: K */
    public String f2227K;

    /* renamed from: L */
    public TextView f2228L;

    /* renamed from: M */
    public TextView f2229M;

    /* renamed from: N */
    public ProgressDialog f2230N;

    /* renamed from: a */
    public SQLiteDatabase f2231a;

    /* renamed from: b */
    public C0195JU f2232b;

    /* renamed from: c */
    public String f2233c;

    /* renamed from: d */
    public String f2234d;

    /* renamed from: e */
    public String f2235e;

    /* renamed from: f */
    public String f2236f;

    /* renamed from: g */
    public double f2237g = 0.0d;

    /* renamed from: h */
    public int f2238h = 0;

    /* renamed from: i */
    public int f2239i = 0;

    /* renamed from: j */
    public AutoCompleteTextView f2240j = null;

    /* renamed from: k */
    public EditText f2241k = null;

    /* renamed from: l */
    public EditText f2242l = null;

    /* renamed from: m */
    public TextView f2243m = null;

    /* renamed from: n */
    public ImageView f2244n = null;

    /* renamed from: o */
    public TextView f2245o = null;

    /* renamed from: p */
    public TextView f2246p = null;

    /* renamed from: q */
    public TextView f2247q = null;

    /* renamed from: r */
    public TextView f2248r = null;

    /* renamed from: s */
    public TextView f2249s = null;

    /* renamed from: t */
    public Button f2250t = null;

    /* renamed from: u */
    public ListView f2251u = null;

    /* renamed from: v */
    public C0346QM f2252v;

    /* renamed from: w */
    public List<C0259ML> f2253w = new ArrayList();

    /* renamed from: x */
    public SparseBooleanArray f2254x;

    /* renamed from: y */
    public ImageButton f2255y = null;

    /* renamed from: z */
    public String[] f2256z = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    /* renamed from: com.valdio.valdioveliu.recyclerview.Customer_Det_List_All$a */
    private static class C0687a implements Comparator<C0259ML> {
        public C0687a() {
        }

        public /* synthetic */ C0687a(C1027rJ rJVar) {
            this();
        }

        /* renamed from: a */
        public int compare(C0259ML ml, C0259ML ml2) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
            try {
                return simpleDateFormat.parse(ml.mo883b()).compareTo(simpleDateFormat.parse(ml2.mo883b()));
            } catch (ParseException unused) {
                return ml2.mo883b().compareTo(ml.mo883b());
            }
        }
    }

    /* renamed from: com.valdio.valdioveliu.recyclerview.Customer_Det_List_All$b */
    private static class C0688b implements Comparator<C0259ML> {
        public C0688b() {
        }

        public /* synthetic */ C0688b(C1027rJ rJVar) {
            this();
        }

        /* renamed from: a */
        public int compare(C0259ML ml, C0259ML ml2) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
            try {
                return simpleDateFormat.parse(ml2.mo883b()).compareTo(simpleDateFormat.parse(ml.mo883b()));
            } catch (ParseException unused) {
                return ml2.mo883b().compareTo(ml.mo883b());
            }
        }
    }

    /* renamed from: com.valdio.valdioveliu.recyclerview.Customer_Det_List_All$c */
    private static class C0689c implements Comparator<C0259ML> {
        public C0689c() {
        }

        public /* synthetic */ C0689c(C1027rJ rJVar) {
            this();
        }

        /* renamed from: a */
        public int compare(C0259ML ml, C0259ML ml2) {
            String str = "";
            String str2 = ",";
            return ml.mo885d().replaceAll(str2, str).compareTo(ml2.mo885d().replaceAll(str2, str));
        }
    }

    /* renamed from: com.valdio.valdioveliu.recyclerview.Customer_Det_List_All$d */
    private static class C0690d implements Comparator<C0259ML> {
        public C0690d() {
        }

        public /* synthetic */ C0690d(C1027rJ rJVar) {
            this();
        }

        /* renamed from: a */
        public int compare(C0259ML ml, C0259ML ml2) {
            return ml2.mo885d().compareTo(ml.mo885d());
        }
    }

    /* renamed from: com.valdio.valdioveliu.recyclerview.Customer_Det_List_All$e */
    private static class C0691e implements Comparator<C0259ML> {
        public C0691e() {
        }

        public /* synthetic */ C0691e(C1027rJ rJVar) {
            this();
        }

        /* renamed from: a */
        public int compare(C0259ML ml, C0259ML ml2) {
            String str = "";
            String str2 = ",";
            return Double.valueOf(ml.mo882a().replaceAll(str2, str)).compareTo(Double.valueOf(ml2.mo882a().replaceAll(str2, str)));
        }
    }

    /* renamed from: com.valdio.valdioveliu.recyclerview.Customer_Det_List_All$f */
    private static class C0692f implements Comparator<C0259ML> {
        public C0692f() {
        }

        public /* synthetic */ C0692f(C1027rJ rJVar) {
            this();
        }

        /* renamed from: a */
        public int compare(C0259ML ml, C0259ML ml2) {
            String str = "";
            String str2 = ",";
            return Double.valueOf(ml2.mo882a().replaceAll(str2, str)).compareTo(Double.valueOf(ml.mo882a().replaceAll(str2, str)));
        }
    }

    public Customer_Det_List_All() {
        String str = Value.PERCENTAGE;
        this.f2226J = str;
        this.f2227K = str;
        this.f2228L = null;
        this.f2229M = null;
        this.f2230N = null;
    }

    private void sort_date_click(View view) {
        int i;
        if (this.f2239i == 0) {
            mo3551h(this.f2253w);
            this.f2252v.notifyDataSetChanged();
            i = 1;
        } else {
            mo3538b(this.f2253w);
            this.f2252v.notifyDataSetChanged();
            i = 0;
        }
        this.f2239i = i;
    }

    /* renamed from: a */
    public double mo3531a(List<C0259ML> list) {
        double d = 0.0d;
        for (int size = list.size() - 1; size >= 0; size--) {
            int i = ((C0259ML) list.get(size)).mo887f() == this.f2217A[0] ? -1 : ((C0259ML) list.get(size)).mo887f() == this.f2217A[2] ? 1 : 0;
            double parseDouble = Double.parseDouble(((C0259ML) list.get(size)).mo882a().replaceAll(",", ""));
            double d2 = (double) i;
            Double.isNaN(d2);
            d += parseDouble * d2;
        }
        return d;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_All, android.content.Context, android.app.Activity] */
    /* renamed from: a */
    public void mo3532a() {
        try {
            this.f2225I = 0;
            Builder builder = new Builder(this);
            View inflate = getLayoutInflater().inflate(2131492918, null);
            builder.setView(inflate);
            this.f2228L = (TextView) inflate.findViewById(2131296451);
            this.f2229M = (TextView) inflate.findViewById(2131296647);
            this.f2228L.setOnClickListener(new C0003AJ(this));
            this.f2229M.setOnClickListener(new C0022BJ(this));
            builder.setPositiveButton(getString(2131755109), new C0046CJ(this));
            builder.setNegativeButton(getString(2131755106), new C0065DJ(this));
            AlertDialog create = builder.create();
            create.getWindow().setSoftInputMode(4);
            create.show();
            create.getButton(-1).setOnClickListener(new C0084EJ(this, create));
        } catch (Exception e) {
            Log.d("adv_search_error=", e.getMessage());
        }
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_All, android.app.Activity] */
    /* renamed from: a */
    public void mo3533a(int i) {
        ImageView imageView;
        int i2;
        ImageView imageView2;
        int i3;
        NumberFormat instance = NumberFormat.getInstance(Locale.ENGLISH);
        if (this.f2225I == 1) {
            double a = mo3531a(this.f2252v.f1003d);
            TextView textView = this.f2243m;
            StringBuilder sb = new StringBuilder();
            sb.append(getString(2131755189));
            sb.append(instance.format(a));
            textView.setText(sb.toString());
            if (a >= 0.0d) {
                imageView = this.f2244n;
                i2 = this.f2217A[2];
            } else {
                imageView = this.f2244n;
                i2 = this.f2217A[0];
            }
        } else if (i == 1) {
            this.f2243m.setText(getString(2131755188));
            try {
                ArrayList y = this.f2232b.mo633y();
                if (y.size() > 0) {
                    TextView textView2 = this.f2243m;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(getString(2131755187));
                    sb2.append(instance.format(Double.parseDouble((String) y.get(0))));
                    textView2.setText(sb2.toString());
                    if (Integer.parseInt((String) y.get(0)) >= 0) {
                        imageView2 = this.f2244n;
                        i3 = this.f2217A[2];
                    } else {
                        imageView2 = this.f2244n;
                        i3 = this.f2217A[0];
                    }
                    imageView2.setImageResource(i3);
                    return;
                }
                return;
            } catch (Exception unused) {
                return;
            }
        } else if (i == 2) {
            double a2 = mo3531a(this.f2252v.f1003d);
            TextView textView3 = this.f2243m;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(getString(2131755189));
            sb3.append(instance.format(a2));
            textView3.setText(sb3.toString());
            if (a2 >= 0.0d) {
                imageView = this.f2244n;
                i2 = this.f2217A[2];
            } else {
                imageView = this.f2244n;
                i2 = this.f2217A[0];
            }
        } else {
            return;
        }
        imageView.setImageResource(i2);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_All, android.content.Context] */
    /* renamed from: a */
    public final void mo3534a(String str) {
        new Builder(this).setTitle("Permission Request").setMessage(str).setCancelable(false).setPositiveButton(17039379, new C1128wJ(this)).show();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_All, android.app.Activity] */
    public void amount_add_btn(View view) {
        startActivity(new Intent(view.getContext(), Customer_Det_List_edit.class));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_All, android.content.Context, android.app.Activity] */
    /* renamed from: b */
    public void mo3536b() {
        String str = "android.permission.WRITE_EXTERNAL_STORAGE";
        if (!(ContextCompat.checkSelfPermission(this, str) == 0)) {
            ActivityCompat.requestPermissions(this, new String[]{str}, C0776fN.AppCompatTheme_windowActionBarOverlay);
        }
    }

    /* renamed from: b */
    public void mo3537b(String str) {
        this.f2252v.getFilter().filter(str);
    }

    /* renamed from: b */
    public final void mo3538b(List<C0259ML> list) {
        Collections.sort(this.f2253w, new C0688b(null));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_All, android.content.Context, android.app.Activity] */
    public void btn_cus_remove(View view) {
        Builder builder = new Builder(this);
        builder.setMessage(getString(2131755166));
        TextView textView = (TextView) ((RelativeLayout) ((View) view.getParent()).getParent()).findViewById(2131296680);
        Log.d("tr_id:=", textView.getText().toString());
        this.f2238h = Integer.parseInt(textView.getText().toString());
        builder.setPositiveButton("Yes", new C0897lJ(this));
        builder.setNegativeButton("No", new C0916mJ(this));
        builder.create().show();
    }

    /* renamed from: c */
    public void mo3540c() {
        for (int size = this.f2254x.size() - 1; size >= 0; size--) {
            if (this.f2254x.valueAt(size)) {
                C0259ML item = this.f2252v.getItem(this.f2254x.keyAt(size));
                this.f2252v.remove(item);
                C0195JU ju = this.f2232b;
                StringBuilder sb = new StringBuilder();
                sb.append("delete from transactions where id=");
                sb.append(item.mo884c());
                ju.mo562d(sb.toString());
            }
        }
        mo3546f();
    }

    /* renamed from: c */
    public final void mo3541c(List<C0259ML> list) {
        Collections.sort(this.f2253w, new C0690d(null));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_All, android.content.Context, android.app.Activity] */
    /* renamed from: d */
    public void mo3542d() {
        int size = this.f2254x.size() - 1;
        if (this.f2254x.valueAt(size)) {
            C0259ML item = this.f2252v.getItem(this.f2254x.keyAt(size));
            Intent intent = new Intent(this, Customer_Det_List_edit.class);
            intent.putExtra("CUS_NAME", item.mo885d());
            intent.putExtra("TR_ID", item.mo884c());
            intent.putExtra("TR_DATE", item.mo883b());
            intent.putExtra("TR_AMOUNT", item.mo882a());
            intent.putExtra("TR_REMARKS", item.mo886e());
            intent.putExtra("TR_TYPE", item.mo887f());
            startActivity(intent);
        }
    }

    /* renamed from: d */
    public final void mo3543d(List<C0259ML> list) {
        Collections.sort(list, Collections.reverseOrder(new C1005qJ(this)));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_All, android.content.Context] */
    /* renamed from: e */
    public void mo3544e() {
        this.f2252v = new C0346QM(this, 2131492931, this.f2253w);
        this.f2252v.f1008i.clear();
        this.f2237g = 0.0d;
        mo3538b(this.f2253w);
        this.f2252v.notifyDataSetChanged();
        this.f2251u.setAdapter(this.f2252v);
    }

    /* renamed from: e */
    public final void mo3545e(List<C0259ML> list) {
        Collections.sort(list, Collections.reverseOrder(new C0957oJ(this)));
    }

    /* renamed from: f */
    public void mo3546f() {
        Cursor cursor;
        if (this.f2225I == 0) {
            cursor = this.f2232b.mo620u();
        } else {
            boolean isEmpty = this.f2226J.isEmpty();
            String str = Value.PERCENTAGE;
            this.f2226J = isEmpty ? str : this.f2226J;
            if (!this.f2227K.isEmpty()) {
                str = this.f2227K;
            }
            this.f2227K = str;
            cursor = this.f2232b.mo564e(this.f2226J, this.f2227K);
        }
        cursor.getCount();
        this.f2237g = 0.0d;
        this.f2253w.clear();
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            List<C0259ML> list = this.f2253w;
            C0259ML ml = new C0259ML(cursor.getString(cursor.getColumnIndex("_id")), cursor.getString(cursor.getColumnIndex("date_")), cursor.getString(cursor.getColumnIndex("amount")), cursor.getString(cursor.getColumnIndex("remarks")), this.f2217A[cursor.getInt(cursor.getColumnIndex("_in"))], cursor.getString(cursor.getColumnIndex(Attribute.NAME)));
            list.add(ml);
            cursor.moveToNext();
        }
        cursor.close();
        this.f2237g = 0.0d;
        mo3544e();
        if (this.f2225I == 1) {
            mo3551h(this.f2253w);
            this.f2252v.notifyDataSetChanged();
            this.f2239i = 1;
        }
        mo3533a(1);
    }

    /* renamed from: f */
    public final void mo3547f(List<C0259ML> list) {
        Collections.sort(this.f2253w, new C0692f(null));
    }

    /* renamed from: g */
    public void mo3548g() {
        try {
            this.f2222F = findViewById(2131296305);
            if (this.f2232b.mo524a("black_list", false) || !this.f2232b.mo524a("prefAds", false)) {
                this.f2222F.loadAd(new AdRequest.Builder().build());
                return;
            }
            this.f2222F.setVisibility(8);
        } catch (Exception e) {
            Log.d("ads_error:", e.getMessage());
        }
    }

    /* renamed from: g */
    public final void mo3549g(List<C0259ML> list) {
        Collections.sort(this.f2253w, new C0691e(null));
    }

    /* renamed from: h */
    public final void mo3550h() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    /* renamed from: h */
    public final void mo3551h(List<C0259ML> list) {
        Collections.sort(this.f2253w, new C0687a(null));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_All, android.content.Context, android.app.Activity] */
    public void help_btn(View view) {
        Builder builder = new Builder(this);
        WebView webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/help.html");
        webView.setWebViewClient(new C0852jJ(this));
        builder.setView(webView);
        builder.setNegativeButton(getString(2131755134), new C0872kJ(this));
        builder.show();
    }

    /* renamed from: i */
    public final void mo3553i(List<C0259ML> list) {
        Collections.sort(this.f2253w, new C0689c(null));
    }

    /* renamed from: j */
    public final void mo3554j(List<C0259ML> list) {
        Collections.sort(list, Collections.reverseOrder(new C0986pJ(this)));
    }

    /* renamed from: k */
    public final void mo3555k(List<C0259ML> list) {
        Collections.sort(list, Collections.reverseOrder(new C0938nJ(this)));
    }

    public void no_result_btn(View view) {
        this.f2225I = 0;
        mo3546f();
    }

    public void onClick(View view) {
        this.f2230N = new ProgressDialog(view.getContext());
        this.f2230N.setCancelable(true);
        this.f2230N.setMessage("Processing...");
        this.f2230N.setProgressStyle(0);
        this.f2230N.setMax(10);
        this.f2230N.show();
        this.f2253w = this.f2252v.f1003d;
        switch (view.getId()) {
            case 2131296495:
                sort_tr_type_click(view);
                break;
            case 2131296675:
                sort_amount_click(view);
                break;
            case 2131296679:
                sort_date_click(view);
                break;
            case 2131296681:
                sort_net_bal_click(view);
                break;
            case 2131296682:
                sort_remarks_click(view);
                break;
        }
        new Handler().postDelayed(new C0832iJ(this), 400);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_All, android.content.Context, android.view.View$OnClickListener, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    public void onCreate(Bundle bundle) {
        Customer_Det_List_All.super.onCreate(bundle);
        supportRequestWindowFeature(5);
        setContentView(2131492895);
        mo3550h();
        this.f2232b = new C0195JU(this.f2231a, this);
        mo3548g();
        findViewById(2131296453).setOnClickListener(new C1027rJ(this));
        this.f2251u = (ListView) findViewById(2131296529);
        this.f2251u.setEmptyView((TextView) findViewById(2131296440));
        this.f2251u.setChoiceMode(2);
        String str = "CUS_NAME";
        if (getIntent().getStringExtra(str) != null) {
            this.f2233c = getIntent().getStringExtra("CUS_ID");
            this.f2236f = getIntent().getStringExtra(str);
            this.f2234d = getIntent().getStringExtra("CUS_BAL");
            this.f2235e = getIntent().getStringExtra("CUS_GSM");
        }
        setTitle(getString(2131755061));
        this.f2243m = (TextView) findViewById(2131296466);
        this.f2244n = (ImageView) findViewById(2131296495);
        this.f2245o = (TextView) findViewById(2131296679);
        this.f2246p = (TextView) findViewById(2131296675);
        this.f2247q = (TextView) findViewById(2131296682);
        this.f2249s = (TextView) findViewById(2131296681);
        this.f2245o.setOnClickListener(this);
        this.f2246p.setOnClickListener(this);
        this.f2247q.setOnClickListener(this);
        this.f2249s.setOnClickListener(this);
        this.f2244n.setOnClickListener(this);
        this.f2245o.setTextColor(-1);
        this.f2246p.setTextColor(-1);
        this.f2247q.setTextColor(-1);
        this.f2249s.setTextColor(-1);
        Calendar instance = Calendar.getInstance();
        new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        this.f2219C = instance.get(1);
        this.f2220D = instance.get(2);
        this.f2221E = instance.get(5);
        try {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(this);
            Field declaredField = ViewConfiguration.class.getDeclaredField("sHasPermanentMenuKey");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                declaredField.setBoolean(viewConfiguration, false);
            }
        } catch (Exception unused) {
        }
        mo3546f();
        this.f2251u.setChoiceMode(3);
        this.f2251u.setMultiChoiceModeListener(new C1154xJ(this));
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [android.content.Context] */
    /* JADX WARNING: type inference failed for: r1v0, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog onCreateDialog(int r13) {
        /*
            r12 = this;
            if (r13 == 0) goto L_0x0017
            r0 = 4
            if (r13 == r0) goto L_0x0007
            r13 = 0
            return r13
        L_0x0007:
            android.app.DatePickerDialog r13 = new android.app.DatePickerDialog
            android.app.DatePickerDialog$OnDateSetListener r2 = r12.f2224H
            int r3 = r12.f2219C
            int r4 = r12.f2220D
            int r5 = r12.f2221E
            r0 = r13
            r1 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            return r13
        L_0x0017:
            android.app.DatePickerDialog r13 = new android.app.DatePickerDialog
            android.app.DatePickerDialog$OnDateSetListener r8 = r12.f2223G
            int r9 = r12.f2219C
            int r10 = r12.f2220D
            int r11 = r12.f2221E
            r6 = r13
            r7 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.Customer_Det_List_All.onCreateDialog(int):android.app.Dialog");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_All, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131558414, menu);
        MenuItem findItem = menu.findItem(2131296605);
        SearchView actionView = MenuItemCompat.getActionView(findItem);
        actionView.setSearchableInfo(((SearchManager) getSystemService("search")).getSearchableInfo(getComponentName()));
        actionView.setQueryHint(getString(2131755371));
        actionView.setOnQueryTextListener(new C1087uJ(this));
        MenuItemCompat.setOnActionExpandListener(findItem, new C1107vJ(this));
        return true;
    }

    public void onDestroy() {
        this.f2222F.destroy();
        Customer_Det_List_All.super.onDestroy();
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_All, android.app.Activity] */
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131296577) {
            mo3536b();
            try {
                String string = getString(2131755061);
                this.f2232b.mo537b(this.f2251u, this.f2232b.mo465K(string), mo3531a(this.f2252v.f1003d), "");
                C0195JU ju = this.f2232b;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f2232b.mo465K(string));
                sb.append(".pdf");
                ju.mo462I(sb.toString());
            } catch (Exception unused) {
            }
            return true;
        } else if (itemId == 2131296309) {
            mo3532a();
            return true;
        } else if (itemId != 16908332) {
            return Customer_Det_List_All.super.onOptionsItemSelected(menuItem);
        } else {
            finish();
            return true;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_All, android.app.Activity] */
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (i != 112) {
            return;
        }
        if (iArr.length != 1 || iArr[0] != 0) {
            mo3534a(getString(2131755273));
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_All, android.app.Activity] */
    public void onRestart() {
        Customer_Det_List_All.super.onRestart();
        mo3546f();
    }

    public void onResume() {
        Customer_Det_List_All.super.onResume();
    }

    public void sort_amount_click(View view) {
        int i;
        if (this.f2239i == 0) {
            mo3549g(this.f2253w);
            this.f2252v.notifyDataSetChanged();
            i = 1;
        } else {
            mo3547f(this.f2253w);
            this.f2252v.notifyDataSetChanged();
            i = 0;
        }
        this.f2239i = i;
    }

    public void sort_net_bal_click(View view) {
        int i;
        if (this.f2239i == 0) {
            mo3553i(this.f2253w);
            this.f2252v.notifyDataSetChanged();
            i = 1;
        } else {
            mo3541c(this.f2253w);
            this.f2252v.notifyDataSetChanged();
            i = 0;
        }
        this.f2239i = i;
    }

    public void sort_remarks_click(View view) {
        int i;
        if (this.f2239i == 0) {
            mo3554j(this.f2253w);
            this.f2252v.notifyDataSetChanged();
            i = 1;
        } else {
            mo3543d(this.f2253w);
            this.f2252v.notifyDataSetChanged();
            i = 0;
        }
        this.f2239i = i;
    }

    public void sort_tr_type_click(View view) {
        int i;
        if (this.f2239i == 0) {
            mo3555k(this.f2253w);
            this.f2252v.notifyDataSetChanged();
            i = 1;
        } else {
            mo3545e(this.f2253w);
            this.f2252v.notifyDataSetChanged();
            i = 0;
        }
        this.f2239i = i;
    }
}