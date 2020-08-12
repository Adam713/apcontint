package com.adam.myapplication;



import android.app.AlertDialog.Builder;
import android.app.SearchManager;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Report3_balance_month extends AppCompatActivity {

    /* renamed from: a */
    public SQLiteDatabase f2587a;

    /* renamed from: b */
    public C0195JU f2588b;

    /* renamed from: c */
    public int f2589c = 0;

    /* renamed from: d */
    public ImageView f2590d = null;

    /* renamed from: e */
    public TextView f2591e = null;

    /* renamed from: f */
    public int f2592f = 0;

    /* renamed from: g */
    public AutoCompleteTextView f2593g = null;

    /* renamed from: h */
    public EditText f2594h = null;

    /* renamed from: i */
    public EditText f2595i = null;

    /* renamed from: j */
    public Button f2596j = null;

    /* renamed from: k */
    public ListView f2597k = null;

    /* renamed from: l */
    public C0388SM f2598l;

    /* renamed from: m */
    public List<C0082EH> f2599m = new ArrayList();

    /* renamed from: n */
    public ImageButton f2600n = null;

    /* renamed from: o */
    public String[] f2601o = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    /* renamed from: p */
    public int[] f2602p = {2131230923, 1, 2131230855};

    /* renamed from: q */
    public int f2603q = 0;

    /* renamed from: com.valdio.valdioveliu.recyclerview.Report3_balance_month$a */
    private static class C0711a implements Comparator<C0082EH> {
        public C0711a() {
        }

        public /* synthetic */ C0711a(C0026BN bn) {
            this();
        }

        /* renamed from: a */
        public int compare(C0082EH eh, C0082EH eh2) {
            return Integer.valueOf(eh.mo185c()).compareTo(Integer.valueOf(eh2.mo185c()));
        }
    }

    /* renamed from: com.valdio.valdioveliu.recyclerview.Report3_balance_month$b */
    private static class C0712b implements Comparator<C0082EH> {
        public C0712b() {
        }

        public /* synthetic */ C0712b(C0026BN bn) {
            this();
        }

        /* renamed from: a */
        public int compare(C0082EH eh, C0082EH eh2) {
            return Integer.valueOf(eh2.mo185c()).compareTo(Integer.valueOf(eh.mo185c()));
        }
    }

    /* renamed from: com.valdio.valdioveliu.recyclerview.Report3_balance_month$c */
    private static class C0713c implements Comparator<C0082EH> {
        public C0713c() {
        }

        public /* synthetic */ C0713c(C0026BN bn) {
            this();
        }

        /* renamed from: a */
        public int compare(C0082EH eh, C0082EH eh2) {
            String str = "";
            String str2 = ",";
            return Integer.valueOf(eh.mo180a().replaceAll(str2, str)).compareTo(Integer.valueOf(eh2.mo180a().replaceAll(str2, str)));
        }
    }

    /* renamed from: com.valdio.valdioveliu.recyclerview.Report3_balance_month$d */
    private static class C0714d implements Comparator<C0082EH> {
        public C0714d() {
        }

        public /* synthetic */ C0714d(C0026BN bn) {
            this();
        }

        /* renamed from: a */
        public int compare(C0082EH eh, C0082EH eh2) {
            String str = "";
            String str2 = ",";
            return Integer.valueOf(eh2.mo180a().replaceAll(str2, str)).compareTo(Integer.valueOf(eh.mo180a().replaceAll(str2, str)));
        }
    }

    /* renamed from: a */
    public void mo3968a() {
        mo3969a(this.f2588b.mo490Y());
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Report3_balance_month, android.app.Activity] */
    /* renamed from: a */
    public void mo3969a(Cursor cursor) {
        cursor.getCount();
        this.f2599m.clear();
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            List<C0082EH> list = this.f2599m;
            String str = "_in";
            C0082EH eh = new C0082EH(cursor.getString(cursor.getColumnIndex(str)), cursor.getString(cursor.getColumnIndex("_id")), cursor.getString(cursor.getColumnIndex("phone")), cursor.getDouble(cursor.getColumnIndex("amount")), this.f2602p[cursor.getInt(cursor.getColumnIndex(str))], cursor.getInt(cursor.getColumnIndex("days_late")));
            list.add(eh);
            cursor.moveToNext();
        }
        cursor.close();
        this.f2589c = 0;
        for (int i = 0; i <= this.f2599m.size() - 1; i++) {
            this.f2589c += Integer.parseInt(((C0082EH) this.f2599m.get(i)).mo180a().replaceAll(",", "")) * (Integer.parseInt(((C0082EH) this.f2599m.get(i)).mo191f()) - 1);
            C0082EH eh2 = (C0082EH) this.f2599m.get(i);
            eh2.mo181a(this.f2589c);
            this.f2599m.set(i, eh2);
        }
        if (this.f2589c >= 0) {
            this.f2590d.setImageResource(this.f2602p[2]);
        } else {
            this.f2590d.setImageResource(this.f2602p[0]);
        }
        NumberFormat instance = NumberFormat.getInstance(Locale.ENGLISH);
        TextView textView = this.f2591e;
        StringBuilder sb = new StringBuilder();
        sb.append(getString(2131755187));
        sb.append(instance.format((long) this.f2589c));
        textView.setText(sb.toString());
        this.f2598l = new C0388SM(this, 2131493009, this.f2599m);
        this.f2598l.f1138i.clear();
        this.f2597k.setAdapter(this.f2598l);
    }

    /* renamed from: a */
    public void mo3970a(String str) {
        this.f2598l.getFilter().filter(str);
    }

    /* renamed from: a */
    public final void mo3971a(List<C0082EH> list) {
        Collections.sort(this.f2599m, new C0713c(null));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.Report3_balance_month, android.app.Activity] */
    public void amount_add_btn(View view) {
        startActivity(new Intent(view.getContext(), Customer_Det_List_edit.class));
    }

    /* renamed from: b */
    public final void mo3973b(List<C0082EH> list) {
        Collections.sort(this.f2599m, new C0711a(null));
    }

    /* renamed from: c */
    public final void mo3974c(List<C0082EH> list) {
        Collections.sort(list, Collections.reverseOrder(new C0069DN(this)));
    }

    /* renamed from: d */
    public final void mo3975d(List<C0082EH> list) {
        Collections.sort(list, Collections.reverseOrder(new C0107FN(this)));
    }

    /* renamed from: e */
    public final void mo3976e(List<C0082EH> list) {
        Collections.sort(this.f2599m, new C0714d(null));
    }

    /* renamed from: f */
    public final void mo3977f(List<C0082EH> list) {
        Collections.sort(this.f2599m, new C0712b(null));
    }

    /* renamed from: g */
    public final void mo3978g(List<C0082EH> list) {
        Collections.sort(list, Collections.reverseOrder(new C0050CN(this)));
    }

    /* renamed from: h */
    public final void mo3979h(List<C0082EH> list) {
        Collections.sort(list, Collections.reverseOrder(new C0088EN(this)));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Report3_balance_month, android.app.Activity] */
    public void help_btn(View view) {
        Builder builder = new Builder(this);
        WebView webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/help.html");
        webView.setWebViewClient(new C0127GN(this));
        builder.setView(webView);
        builder.setNegativeButton(getString(2131755134), new C0149HN(this));
        builder.show();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Report3_balance_month, android.app.Activity] */
    public void onBackPressed() {
        Intent intent = new Intent(this, CustomerList.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Report3_balance_month, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    public void onCreate(Bundle bundle) {
        Report3_balance_month.super.onCreate(bundle);
        setContentView(2131493013);
        setTitle(getString(2131755059));
        this.f2597k = (ListView) findViewById(2131296534);
        this.f2597k.setEmptyView((TextView) findViewById(2131296440));
        this.f2588b = new C0195JU(this.f2587a, this);
        this.f2590d = (ImageView) findViewById(2131296495);
        this.f2591e = (TextView) findViewById(2131296466);
        mo3968a();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.Report3_balance_month, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131558410, menu);
        SearchView actionView = MenuItemCompat.getActionView(menu.findItem(2131296605));
        actionView.setSearchableInfo(((SearchManager) getSystemService("search")).getSearchableInfo(getComponentName()));
        actionView.setQueryHint(getString(2131755371));
        actionView.setOnQueryTextListener(new C0026BN(this));
        return true;
    }

    public void onDestroy() {
        Report3_balance_month.super.onDestroy();
    }

    public void onResume() {
        Report3_balance_month.super.onResume();
    }

    public void sort_amount_click(View view) {
        int i;
        if (this.f2603q == 0) {
            mo3971a(this.f2599m);
            this.f2598l.notifyDataSetChanged();
            i = 1;
        } else {
            mo3976e(this.f2599m);
            this.f2598l.notifyDataSetChanged();
            i = 0;
        }
        this.f2603q = i;
    }

    public void sort_name_click(View view) {
        int i;
        if (this.f2603q == 0) {
            mo3978g(this.f2599m);
            this.f2598l.notifyDataSetChanged();
            i = 1;
        } else {
            mo3974c(this.f2599m);
            this.f2598l.notifyDataSetChanged();
            i = 0;
        }
        this.f2603q = i;
    }

    public void sort_tr_days_click(View view) {
        int i;
        if (this.f2603q == 0) {
            mo3977f(this.f2599m);
            this.f2598l.notifyDataSetChanged();
            i = 1;
        } else {
            mo3973b(this.f2599m);
            this.f2598l.notifyDataSetChanged();
            i = 0;
        }
        this.f2603q = i;
    }

    public void sort_tr_type_click(View view) {
        int i;
        if (this.f2603q == 0) {
            mo3979h(this.f2599m);
            this.f2598l.notifyDataSetChanged();
            i = 1;
        } else {
            mo3975d(this.f2599m);
            this.f2598l.notifyDataSetChanged();
            i = 0;
        }
        this.f2603q = i;
    }
}

