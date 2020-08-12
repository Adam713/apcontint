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
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.itextpdf.tool.xml.html.HTML.Attribute;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Report2_customer_late extends AppCompatActivity {

    /* renamed from: a */
    public SQLiteDatabase f2546a;

    /* renamed from: b */
    public C0195JU f2547b;

    /* renamed from: c */
    public int f2548c = 0;

    /* renamed from: d */
    public int f2549d = 0;

    /* renamed from: e */
    public AutoCompleteTextView f2550e = null;

    /* renamed from: f */
    public EditText f2551f = null;

    /* renamed from: g */
    public EditText f2552g = null;

    /* renamed from: h */
    public Button f2553h = null;

    /* renamed from: i */
    public ListView f2554i = null;

    /* renamed from: j */
    public C0388SM f2555j;

    /* renamed from: k */
    public List<C0082EH> f2556k = new ArrayList();

    /* renamed from: l */
    public ImageView f2557l = null;

    /* renamed from: m */
    public TextView f2558m = null;

    /* renamed from: n */
    public ImageButton f2559n = null;

    /* renamed from: o */
    public String[] f2560o = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    /* renamed from: p */
    public int[] f2561p = {2131230923, 1, 2131230855};

    /* renamed from: q */
    public int f2562q = 0;

    /* renamed from: com.valdio.valdioveliu.recyclerview.Report2_customer_late$a */
    private static class C0703a implements Comparator<C0082EH> {
        public C0703a() {
        }

        public /* synthetic */ C0703a(C0836iN iNVar) {
            this();
        }

        /* renamed from: a */
        public int compare(C0082EH eh, C0082EH eh2) {
            return Integer.valueOf(eh.mo185c()).compareTo(Integer.valueOf(eh2.mo185c()));
        }
    }

    /* renamed from: com.valdio.valdioveliu.recyclerview.Report2_customer_late$b */
    private static class C0704b implements Comparator<C0082EH> {
        public C0704b() {
        }

        public /* synthetic */ C0704b(C0836iN iNVar) {
            this();
        }

        /* renamed from: a */
        public int compare(C0082EH eh, C0082EH eh2) {
            return Integer.valueOf(eh2.mo185c()).compareTo(Integer.valueOf(eh.mo185c()));
        }
    }

    /* renamed from: com.valdio.valdioveliu.recyclerview.Report2_customer_late$c */
    private static class C0705c implements Comparator<C0082EH> {
        public C0705c() {
        }

        public /* synthetic */ C0705c(C0836iN iNVar) {
            this();
        }

        /* renamed from: a */
        public int compare(C0082EH eh, C0082EH eh2) {
            String str = "";
            String str2 = ",";
            return Integer.valueOf(eh.mo180a().replaceAll(str2, str)).compareTo(Integer.valueOf(eh2.mo180a().replaceAll(str2, str)));
        }
    }

    /* renamed from: com.valdio.valdioveliu.recyclerview.Report2_customer_late$d */
    private static class C0706d implements Comparator<C0082EH> {
        public C0706d() {
        }

        public /* synthetic */ C0706d(C0836iN iNVar) {
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
    public int mo3895a(List<C0082EH> list) {
        int i = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            int i2 = ((C0082EH) list.get(size)).mo193h() == this.f2561p[0] ? -1 : ((C0082EH) list.get(size)).mo193h() == this.f2561p[2] ? 1 : 0;
            i += Integer.parseInt(((C0082EH) list.get(size)).mo180a().replaceAll(",", "")) * i2;
        }
        return i;
    }

    /* renamed from: a */
    public void mo3896a() {
        mo3898a(this.f2547b.mo487W());
        mo3897a(1);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.valdio.valdioveliu.recyclerview.Report2_customer_late, android.app.Activity] */
    /* renamed from: a */
    public void mo3897a(int i) {
        ImageView imageView;
        int i2;
        ImageView imageView2;
        int i3;
        NumberFormat instance = NumberFormat.getInstance(Locale.ENGLISH);
        if (i == 1) {
            this.f2558m.setText(getString(2131755188));
            try {
                ArrayList y = this.f2547b.mo633y();
                if (y.size() > 0) {
                    TextView textView = this.f2558m;
                    StringBuilder sb = new StringBuilder();
                    sb.append(getString(2131755187));
                    sb.append(instance.format((long) Integer.parseInt((String) y.get(0))));
                    textView.setText(sb.toString());
                    if (Integer.parseInt((String) y.get(0)) >= 0) {
                        imageView2 = this.f2557l;
                        i3 = this.f2561p[2];
                    } else {
                        imageView2 = this.f2557l;
                        i3 = this.f2561p[0];
                    }
                    imageView2.setImageResource(i3);
                }
            } catch (Exception unused) {
            }
        } else if (i == 2) {
            int a = mo3895a(this.f2555j.f1133d);
            TextView textView2 = this.f2558m;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getString(2131755189));
            sb2.append(instance.format((long) a));
            textView2.setText(sb2.toString());
            if (a >= 0) {
                imageView = this.f2557l;
                i2 = this.f2561p[2];
            } else {
                imageView = this.f2557l;
                i2 = this.f2561p[0];
            }
            imageView.setImageResource(i2);
        }
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Report2_customer_late] */
    /* renamed from: a */
    public void mo3898a(Cursor cursor) {
        cursor.getCount();
        this.f2556k.clear();
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            List<C0082EH> list = this.f2556k;
            C0082EH eh = new C0082EH(cursor.getString(cursor.getColumnIndex(Attribute.f2026ID)), cursor.getString(cursor.getColumnIndex("_id")), cursor.getString(cursor.getColumnIndex("phone")), cursor.getDouble(cursor.getColumnIndex("amount")), this.f2561p[cursor.getInt(cursor.getColumnIndex("_in"))], cursor.getInt(cursor.getColumnIndex("days_late")));
            list.add(eh);
            cursor.moveToNext();
        }
        cursor.close();
        this.f2555j = new C0388SM(this, 2131493006, this.f2556k);
        this.f2555j.f1138i.clear();
        this.f2554i.setAdapter(this.f2555j);
    }

    /* renamed from: a */
    public void mo3899a(String str) {
        this.f2555j.getFilter().filter(str);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.Report2_customer_late, android.app.Activity] */
    public void amount_add_btn(View view) {
        startActivity(new Intent(view.getContext(), Customer_Det_List_edit.class));
    }

    /* renamed from: b */
    public final void mo3901b(List<C0082EH> list) {
        Collections.sort(this.f2556k, new C0705c(null));
    }

    /* renamed from: c */
    public final void mo3902c(List<C0082EH> list) {
        Collections.sort(this.f2556k, new C0703a(null));
    }

    /* renamed from: d */
    public final void mo3903d(List<C0082EH> list) {
        Collections.sort(list, Collections.reverseOrder(new C0901lN(this)));
    }

    /* renamed from: e */
    public final void mo3904e(List<C0082EH> list) {
        Collections.sort(list, Collections.reverseOrder(new C0942nN(this)));
    }

    /* renamed from: f */
    public final void mo3905f(List<C0082EH> list) {
        Collections.sort(this.f2556k, new C0706d(null));
    }

    /* renamed from: g */
    public final void mo3906g(List<C0082EH> list) {
        Collections.sort(this.f2556k, new C0704b(null));
    }

    /* renamed from: h */
    public final void mo3907h(List<C0082EH> list) {
        Collections.sort(list, Collections.reverseOrder(new C0876kN(this)));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Report2_customer_late, android.app.Activity] */
    public void help_btn(View view) {
        Builder builder = new Builder(this);
        WebView webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/help.html");
        webView.setWebViewClient(new C0961oN(this));
        builder.setView(webView);
        builder.setNegativeButton(getString(2131755134), new C0815hN(this));
        builder.show();
    }

    /* renamed from: i */
    public final void mo3909i(List<C0082EH> list) {
        Collections.sort(list, Collections.reverseOrder(new C0920mN(this)));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Report2_customer_late, android.app.Activity] */
    public void onBackPressed() {
        Intent intent = new Intent(this, CustomerList.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Report2_customer_late, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    public void onCreate(Bundle bundle) {
        Report2_customer_late.super.onCreate(bundle);
        setContentView(2131493012);
        setTitle(getString(2131755060));
        this.f2558m = (TextView) findViewById(2131296466);
        this.f2557l = (ImageView) findViewById(2131296495);
        this.f2554i = (ListView) findViewById(2131296534);
        this.f2554i.setEmptyView((TextView) findViewById(2131296440));
        this.f2547b = new C0195JU(this.f2546a, this);
        mo3896a();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.valdio.valdioveliu.recyclerview.Report2_customer_late, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131558410, menu);
        MenuItem findItem = menu.findItem(2131296605);
        SearchView actionView = MenuItemCompat.getActionView(findItem);
        actionView.setSearchableInfo(((SearchManager) getSystemService("search")).getSearchableInfo(getComponentName()));
        actionView.setQueryHint(getString(2131755371));
        actionView.setOnQueryTextListener(new C0836iN(this));
        MenuItemCompat.setOnActionExpandListener(findItem, new C0856jN(this));
        return true;
    }

    public void onDestroy() {
        Report2_customer_late.super.onDestroy();
    }

    public void onResume() {
        Report2_customer_late.super.onResume();
    }

    public void sort_amount_click(View view) {
        int i;
        if (this.f2562q == 0) {
            mo3901b(this.f2556k);
            this.f2555j.notifyDataSetChanged();
            i = 1;
        } else {
            mo3905f(this.f2556k);
            this.f2555j.notifyDataSetChanged();
            i = 0;
        }
        this.f2562q = i;
    }

    public void sort_name_click(View view) {
        int i;
        if (this.f2562q == 0) {
            mo3907h(this.f2556k);
            this.f2555j.notifyDataSetChanged();
            i = 1;
        } else {
            mo3903d(this.f2556k);
            this.f2555j.notifyDataSetChanged();
            i = 0;
        }
        this.f2562q = i;
    }

    public void sort_tr_days_click(View view) {
        int i;
        if (this.f2562q == 0) {
            mo3906g(this.f2556k);
            this.f2555j.notifyDataSetChanged();
            i = 1;
        } else {
            mo3902c(this.f2556k);
            this.f2555j.notifyDataSetChanged();
            i = 0;
        }
        this.f2562q = i;
    }

    public void sort_tr_type_click(View view) {
        int i;
        if (this.f2562q == 0) {
            mo3909i(this.f2556k);
            this.f2555j.notifyDataSetChanged();
            i = 1;
        } else {
            mo3904e(this.f2556k);
            this.f2555j.notifyDataSetChanged();
            i = 0;
        }
        this.f2562q = i;
    }
}
