package com.adam.myapplication;


import android.app.AlertDialog.Builder;
import android.app.SearchManager;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
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
import com.itextpdf.tool.xml.html.HTML.Attribute;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

public class Report2_customer_late_exp extends AppCompatActivity implements OnClickListener {

    /* renamed from: a */
    public SQLiteDatabase f2563a;

    /* renamed from: b */
    public C0195JU f2564b;

    /* renamed from: c */
    public double f2565c = 0.0d;

    /* renamed from: d */
    public int f2566d = 0;

    /* renamed from: e */
    public AutoCompleteTextView f2567e = null;

    /* renamed from: f */
    public EditText f2568f = null;

    /* renamed from: g */
    public EditText f2569g = null;

    /* renamed from: h */
    public Button f2570h = null;

    /* renamed from: i */
    public ExpandableListView f2571i;

    /* renamed from: j */
    public C0498XM f2572j;

    /* renamed from: k */
    public ArrayList<C0208KL> f2573k = new ArrayList<>();

    /* renamed from: l */
    public LinkedHashMap<String, C0208KL> f2574l = new LinkedHashMap<>();

    /* renamed from: m */
    public ImageView f2575m = null;

    /* renamed from: n */
    public TextView f2576n = null;

    /* renamed from: o */
    public ImageButton f2577o = null;

    /* renamed from: p */
    public String[] f2578p = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    /* renamed from: q */
    public int[] f2579q = {2131230923, 1, 2131230855};

    /* renamed from: r */
    public TextView f2580r = null;

    /* renamed from: s */
    public TextView f2581s = null;

    /* renamed from: t */
    public TextView f2582t = null;

    /* renamed from: u */
    public AdView f2583u;

    /* renamed from: v */
    public OnChildClickListener f2584v = new C1071tN(this);

    /* renamed from: w */
    public OnGroupClickListener f2585w = new C1091uN(this);

    /* renamed from: x */
    public int f2586x = 0;

    /* renamed from: com.valdio.valdioveliu.recyclerview.Report2_customer_late_exp$a */
    private static class C0707a implements Comparator<C0208KL> {
        public C0707a() {
        }

        public /* synthetic */ C0707a(C1051sN sNVar) {
            this();
        }

        /* renamed from: a */
        public int compare(C0208KL kl, C0208KL kl2) {
            return Double.valueOf(kl.mo672c()).compareTo(Double.valueOf(kl2.mo672c()));
        }
    }

    /* renamed from: com.valdio.valdioveliu.recyclerview.Report2_customer_late_exp$b */
    private static class C0708b implements Comparator<C0208KL> {
        public C0708b() {
        }

        public /* synthetic */ C0708b(C1051sN sNVar) {
            this();
        }

        /* renamed from: a */
        public int compare(C0208KL kl, C0208KL kl2) {
            return Double.valueOf(kl2.mo672c()).compareTo(Double.valueOf(kl.mo672c()));
        }
    }

    /* renamed from: com.valdio.valdioveliu.recyclerview.Report2_customer_late_exp$c */
    private static class C0709c implements Comparator<C0208KL> {
        public C0709c() {
        }

        public /* synthetic */ C0709c(C1051sN sNVar) {
            this();
        }

        /* renamed from: a */
        public int compare(C0208KL kl, C0208KL kl2) {
            String str = "";
            String str2 = ",";
            return Double.valueOf(kl.mo668a().replaceAll(str2, str)).compareTo(Double.valueOf(kl2.mo668a().replaceAll(str2, str)));
        }
    }

    /* renamed from: com.valdio.valdioveliu.recyclerview.Report2_customer_late_exp$d */
    private static class C0710d implements Comparator<C0208KL> {
        public C0710d() {
        }

        public /* synthetic */ C0710d(C1051sN sNVar) {
            this();
        }

        /* renamed from: a */
        public int compare(C0208KL kl, C0208KL kl2) {
            String str = "";
            String str2 = ",";
            return Double.valueOf(kl2.mo668a().replaceAll(str2, str)).compareTo(Double.valueOf(kl.mo668a().replaceAll(str2, str)));
        }
    }

    /* renamed from: a */
    public double mo3927a(List<C0208KL> list) {
        double d = 0.0d;
        for (int size = list.size() - 1; size >= 0; size--) {
            int i = ((C0208KL) list.get(size)).mo676g() == this.f2579q[0] ? -1 : ((C0208KL) list.get(size)).mo676g() == this.f2579q[2] ? 1 : 0;
            double parseDouble = Double.parseDouble(((C0208KL) list.get(size)).mo668a().replaceAll(",", ""));
            double d2 = (double) i;
            Double.isNaN(d2);
            d += parseDouble * d2;
        }
        return d;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Report2_customer_late_exp, android.app.Activity] */
    /* renamed from: a */
    public void mo3928a() {
        String str = "android.permission.WRITE_EXTERNAL_STORAGE";
        if (!(ContextCompat.checkSelfPermission(this, str) == 0)) {
            ActivityCompat.requestPermissions(this, new String[]{str}, C0776fN.AppCompatTheme_windowActionBarOverlay);
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.valdio.valdioveliu.recyclerview.Report2_customer_late_exp, android.app.Activity] */
    /* renamed from: a */
    public void mo3929a(int i) {
        ImageView imageView;
        int i2;
        ImageView imageView2;
        int i3;
        NumberFormat instance = NumberFormat.getInstance(Locale.ENGLISH);
        if (i == 1) {
            this.f2576n.setText(getString(2131755188));
            try {
                ArrayList y = this.f2564b.mo633y();
                if (y.size() > 0) {
                    TextView textView = this.f2576n;
                    StringBuilder sb = new StringBuilder();
                    sb.append(getString(2131755187));
                    sb.append(instance.format(Double.parseDouble((String) y.get(0))));
                    textView.setText(sb.toString());
                    if (Double.parseDouble((String) y.get(0)) >= 0.0d) {
                        imageView2 = this.f2575m;
                        i3 = this.f2579q[2];
                    } else {
                        imageView2 = this.f2575m;
                        i3 = this.f2579q[0];
                    }
                    imageView2.setImageResource(i3);
                }
            } catch (Exception unused) {
            }
        } else if (i == 2) {
            double a = mo3927a((List<C0208KL>) this.f2572j.f1438b);
            TextView textView2 = this.f2576n;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getString(2131755189));
            sb2.append(instance.format(a));
            textView2.setText(sb2.toString());
            if (a >= 0.0d) {
                imageView = this.f2575m;
                i2 = this.f2579q[2];
            } else {
                imageView = this.f2575m;
                i2 = this.f2579q[0];
            }
            imageView.setImageResource(i2);
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Report2_customer_late_exp] */
    /* renamed from: a */
    public void mo3930a(Cursor cursor) {
        cursor.getCount();
        this.f2573k.clear();
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            String str = "_id";
            C0208KL kl = new C0208KL(cursor.getString(cursor.getColumnIndex(Attribute.f2026ID)), cursor.getString(cursor.getColumnIndex(str)), cursor.getString(cursor.getColumnIndex("phone")), cursor.getString(cursor.getColumnIndex("amount")), this.f2579q[cursor.getInt(cursor.getColumnIndex("_in"))], cursor.getString(cursor.getColumnIndex("days_late")));
            kl.mo670a(mo3933b(cursor.getString(cursor.getColumnIndex(str))));
            this.f2573k.add(kl);
            cursor.moveToNext();
        }
        cursor.close();
        this.f2572j = new C0498XM(this, this.f2573k);
        this.f2571i.setAdapter(this.f2572j);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Report2_customer_late_exp] */
    /* renamed from: a */
    public final void mo3931a(String str) {
        new Builder(this).setTitle("Permission Request").setMessage(str).setCancelable(false).setPositiveButton(17039379, new C1158xN(this)).show();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.Report2_customer_late_exp, android.app.Activity] */
    public void amount_add_btn(View view) {
        startActivity(new Intent(view.getContext(), Customer_Det_List_edit.class));
    }

    /* renamed from: b */
    public ArrayList<C0186JL> mo3933b(String str) {
        ArrayList<C0186JL> arrayList = new ArrayList<>();
        Cursor N = this.f2564b.mo471N(str);
        N.moveToFirst();
        while (!N.isAfterLast()) {
            String str2 = "_in";
            C0186JL jl = new C0186JL(N.getString(N.getColumnIndex(str2)), N.getString(N.getColumnIndex("_id")), N.getString(N.getColumnIndex("phone")), N.getDouble(N.getColumnIndex("amount")), this.f2579q[N.getInt(N.getColumnIndex(str2))], N.getInt(N.getColumnIndex("days_late")));
            arrayList.add(jl);
            N.moveToNext();
        }
        N.close();
        this.f2565c = 0.0d;
        for (int i = 0; i <= arrayList.size() - 1; i++) {
            this.f2565c += Double.parseDouble(((C0186JL) arrayList.get(i)).mo430a().replaceAll(",", "")) * (Double.parseDouble(((C0186JL) arrayList.get(i)).mo432b()) - 1.0d);
            C0186JL jl2 = (C0186JL) arrayList.get(i);
            jl2.mo431a(this.f2565c);
            arrayList.set(i, jl2);
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo3934b() {
        int groupCount = this.f2572j.getGroupCount();
        for (int i = 0; i < groupCount; i++) {
            this.f2571i.collapseGroup(i);
        }
    }

    /* renamed from: b */
    public final void mo3935b(List<C0208KL> list) {
        Collections.sort(this.f2573k, new C0709c(null));
    }

    /* renamed from: c */
    public void mo3936c() {
        mo3930a(this.f2564b.mo487W());
        mo3929a(1);
    }

    /* renamed from: c */
    public void mo3937c(String str) {
        this.f2572j.getFilter().filter(str);
    }

    /* renamed from: c */
    public final void mo3938c(List<C0208KL> list) {
        Collections.sort(this.f2573k, new C0707a(null));
    }

    /* renamed from: d */
    public void mo3939d() {
        try {
            this.f2583u = findViewById(2131296305);
            if (this.f2564b.mo524a("black_list", false) || !this.f2564b.mo524a("prefAds", false)) {
                this.f2583u.loadAd(new AdRequest.Builder().build());
                return;
            }
            this.f2583u.setVisibility(8);
        } catch (Exception e) {
            Log.d("ads_error:", e.getMessage());
        }
    }

    /* renamed from: d */
    public final void mo3940d(List<C0208KL> list) {
        Collections.sort(list, Collections.reverseOrder(new C1199zN(this)));
    }

    /* renamed from: e */
    public final void mo3941e() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    /* renamed from: e */
    public final void mo3942e(List<C0208KL> list) {
        Collections.sort(list, Collections.reverseOrder(new C0990pN(this)));
    }

    /* renamed from: f */
    public final void mo3943f(List<C0208KL> list) {
        Collections.sort(this.f2573k, new C0710d(null));
    }

    /* renamed from: g */
    public final void mo3944g(List<C0208KL> list) {
        Collections.sort(this.f2573k, new C0708b(null));
    }

    /* renamed from: h */
    public final void mo3945h(List<C0208KL> list) {
        Collections.sort(list, Collections.reverseOrder(new C1177yN(this)));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Report2_customer_late_exp, android.app.Activity] */
    public void help_btn(View view) {
        Builder builder = new Builder(this);
        WebView webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/help.html");
        webView.setWebViewClient(new C1009qN(this));
        builder.setView(webView);
        builder.setNegativeButton(getString(2131755134), new C1031rN(this));
        builder.show();
    }

    /* renamed from: i */
    public final void mo3947i(List<C0208KL> list) {
        Collections.sort(list, Collections.reverseOrder(new C0007AN(this)));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Report2_customer_late_exp, android.app.Activity] */
    public void onBackPressed() {
        Intent intent = new Intent(this, CustomerList.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public void onClick(View view) {
        mo3934b();
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

    /* JADX WARNING: type inference failed for: r1v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Report2_customer_late_exp, android.view.View$OnClickListener, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    public void onCreate(Bundle bundle) {
        Report2_customer_late_exp.super.onCreate(bundle);
        setContentView(2131493015);
        mo3941e();
        setTitle(getString(2131755060));
        this.f2564b = new C0195JU(this.f2563a, this);
        mo3939d();
        this.f2576n = (TextView) findViewById(2131296466);
        this.f2575m = (ImageView) findViewById(2131296495);
        this.f2580r = (TextView) findViewById(2131296394);
        this.f2581s = (TextView) findViewById(2131296317);
        this.f2582t = (TextView) findViewById(2131296397);
        this.f2580r.setOnClickListener(this);
        this.f2581s.setOnClickListener(this);
        this.f2582t.setOnClickListener(this);
        this.f2575m.setOnClickListener(this);
        this.f2571i = (ExpandableListView) findViewById(2131296534);
        this.f2571i.setEmptyView((TextView) findViewById(2131296440));
        this.f2571i.setOnChildClickListener(this.f2584v);
        this.f2571i.setOnGroupClickListener(this.f2585w);
        this.f2571i.setOnGroupExpandListener(new C1051sN(this));
        mo3936c();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.valdio.valdioveliu.recyclerview.Report2_customer_late_exp, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131558410, menu);
        MenuItem findItem = menu.findItem(2131296605);
        SearchView actionView = MenuItemCompat.getActionView(findItem);
        actionView.setSearchableInfo(((SearchManager) getSystemService("search")).getSearchableInfo(getComponentName()));
        actionView.setQueryHint(getString(2131755371));
        actionView.setOnQueryTextListener(new C1111vN(this));
        MenuItemCompat.setOnActionExpandListener(findItem, new C1132wN(this));
        return true;
    }

    public void onDestroy() {
        this.f2583u.destroy();
        Report2_customer_late_exp.super.onDestroy();
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.valdio.valdioveliu.recyclerview.Report2_customer_late_exp, android.app.Activity] */
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131296577) {
            mo3928a();
            String string = getString(2131755060);
            mo3934b();
            C0195JU ju = this.f2564b;
            ju.mo506a(this.f2571i, ju.mo465K(string), mo3927a((List<C0208KL>) this.f2572j.f1438b), "");
            C0195JU ju2 = this.f2564b;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f2564b.mo465K(string));
            sb.append(".pdf");
            ju2.mo462I(sb.toString());
            return true;
        } else if (itemId != 16908332) {
            return Report2_customer_late_exp.super.onOptionsItemSelected(menuItem);
        } else {
            finish();
            return true;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.valdio.valdioveliu.recyclerview.Report2_customer_late_exp, android.app.Activity] */
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (i != 112) {
            return;
        }
        if (iArr.length != 1 || iArr[0] != 0) {
            mo3931a(getString(2131755273));
        }
    }

    public void onResume() {
        Report2_customer_late_exp.super.onResume();
    }

    public void sort_amount_click(View view) {
        int i;
        if (this.f2586x == 0) {
            mo3935b((List<C0208KL>) this.f2573k);
            this.f2572j.notifyDataSetChanged();
            i = 1;
        } else {
            mo3943f(this.f2573k);
            this.f2572j.notifyDataSetChanged();
            i = 0;
        }
        this.f2586x = i;
    }

    public void sort_name_click(View view) {
        int i;
        if (this.f2586x == 0) {
            mo3945h(this.f2573k);
            this.f2572j.notifyDataSetChanged();
            i = 1;
        } else {
            mo3940d(this.f2573k);
            this.f2572j.notifyDataSetChanged();
            i = 0;
        }
        this.f2586x = i;
    }

    public void sort_tr_days_click(View view) {
        int i;
        if (this.f2586x == 0) {
            mo3944g(this.f2573k);
            this.f2572j.notifyDataSetChanged();
            i = 1;
        } else {
            mo3938c((List<C0208KL>) this.f2573k);
            this.f2572j.notifyDataSetChanged();
            i = 0;
        }
        this.f2586x = i;
    }

    public void sort_tr_type_click(View view) {
        int i;
        if (this.f2586x == 0) {
            mo3947i(this.f2573k);
            this.f2572j.notifyDataSetChanged();
            i = 1;
        } else {
            mo3942e(this.f2573k);
            this.f2572j.notifyDataSetChanged();
            i = 0;
        }
        this.f2586x = i;
    }
}
