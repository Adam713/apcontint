package com.adam.myapplication;


import android.app.AlertDialog.Builder;
import android.app.DialogFragment;
import android.app.SearchManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.ShareActionProvider;
import android.support.v7.widget.Toolbar;
import android.telephony.TelephonyManager;
import android.text.format.DateFormat;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.itextpdf.tool.xml.html.HTML.Attribute;
import java.io.File;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class CustomerList_tmp extends AppCompatActivity implements OnItemClickListener, C0601a, C0143a {

    /* renamed from: a */
    public SQLiteDatabase f2145a;

    /* renamed from: b */
    public C0195JU f2146b;

    /* renamed from: c */
    public EditText f2147c = null;

    /* renamed from: d */
    public EditText f2148d = null;

    /* renamed from: e */
    public Button f2149e = null;

    /* renamed from: f */
    public int f2150f = 0;

    /* renamed from: g */
    public ListView f2151g = null;

    /* renamed from: h */
    public C0388SM f2152h;

    /* renamed from: i */
    public List<C0082EH> f2153i = new ArrayList();

    /* renamed from: j */
    public SparseBooleanArray f2154j;

    /* renamed from: k */
    public ActionBar f2155k = null;

    /* renamed from: l */
    public Toolbar f2156l = null;

    /* renamed from: m */
    public TextView f2157m = null;

    /* renamed from: n */
    public ArrayAdapter<String> f2158n;

    /* renamed from: o */
    public String[] f2159o;

    /* renamed from: p */
    public TypedArray f2160p;

    /* renamed from: q */
    public CharSequence f2161q;

    /* renamed from: r */
    public CharSequence f2162r;

    /* renamed from: s */
    public DrawerLayout f2163s;

    /* renamed from: t */
    public ListView f2164t;

    /* renamed from: u */
    public ActionBarDrawerToggle f2165u;

    /* renamed from: v */
    public List<C0796gO> f2166v;

    /* renamed from: w */
    public C0063DH f2167w;

    /* renamed from: x */
    public int[] f2168x = {2131230923, 1, 2131230855};

    /* renamed from: y */
    public String[] f2169y = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    /* renamed from: z */
    public ShareActionProvider f2170z;

    /* renamed from: com.valdio.valdioveliu.recyclerview.CustomerList_tmp$a */
    class C0680a implements OnItemClickListener {
        public C0680a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            CustomerList_tmp.this.mo3460c(i);
        }
    }

    /* renamed from: a */
    public int mo3449a(List<C0082EH> list) {
        int i = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            int i2 = ((C0082EH) list.get(size)).mo193h() == this.f2168x[0] ? -1 : ((C0082EH) list.get(size)).mo193h() == this.f2168x[2] ? 1 : 0;
            i += Integer.parseInt(((C0082EH) list.get(size)).mo180a().replaceAll(",", "")) * i2;
        }
        return i;
    }

    /* renamed from: a */
    public void mo3450a() {
        Log.d("getSelectedIds_CNT=", String.valueOf(this.f2154j.size()));
        for (int size = this.f2154j.size() - 1; size >= 0; size--) {
            if (this.f2154j.valueAt(size)) {
                C0082EH item = this.f2152h.getItem(this.f2154j.keyAt(size));
                this.f2152h.remove(item);
                this.f2146b.mo515a(item.mo191f());
            }
        }
        mo3457b(1);
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.CustomerList_tmp, android.app.Activity] */
    /* renamed from: a */
    public void mo3451a(int i) {
        String str = "1";
        String str2 = "first_run";
        NumberFormat instance = NumberFormat.getInstance(Locale.ENGLISH);
        String str3 = "\t";
        if (i == 1) {
            this.f2157m.setText(getString(2131755188));
            try {
                ArrayList x = this.f2146b.mo630x();
                TextView textView = this.f2157m;
                StringBuilder sb = new StringBuilder();
                sb.append(getString(2131755192));
                sb.append(instance.format((long) Integer.parseInt((String) x.get(0))));
                sb.append(str3);
                sb.append(getString(2131755190));
                sb.append(instance.format((long) Integer.parseInt((String) x.get(1))));
                sb.append(str3);
                textView.setText(sb.toString());
                if (x.size() > 1 && Integer.parseInt((String) x.get(0)) == 0 && Integer.parseInt((String) x.get(1)) == 0) {
                    SharedPreferences sharedPreferences = getSharedPreferences(str2, 1);
                    if (!sharedPreferences.getString(str2, "0").equals(str)) {
                        sharedPreferences.edit().putString(str2, str).commit();
                        startActivity(new Intent(this, help.class));
                    }
                }
            } catch (Exception unused) {
            }
        } else if (i == 2) {
            int a = mo3449a(this.f2152h.f1133d);
            TextView textView2 = this.f2157m;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getString(2131755189));
            sb2.append(instance.format((long) a));
            textView2.setText(sb2.toString());
        } else if (i == 3) {
            this.f2157m.setText(getString(2131755191));
            ArrayList x2 = this.f2146b.mo630x();
            if (x2.size() > 1) {
                TextView textView3 = this.f2157m;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(getString(2131755192));
                sb3.append(instance.format((long) Integer.parseInt((String) x2.get(0))));
                sb3.append(str3);
                sb3.append(getString(2131755190));
                sb3.append(instance.format((long) Integer.parseInt((String) x2.get(1))));
                sb3.append(str3);
                textView3.setText(sb3.toString());
            }
        }
    }

    /* renamed from: a */
    public void mo327a(DialogFragment dialogFragment) {
        if (this.f2150f != 0) {
            EditText editText = (EditText) dialogFragment.getDialog().findViewById(2131296387);
            EditText editText2 = (EditText) dialogFragment.getDialog().findViewById(2131296389);
            C0195JU ju = this.f2146b;
            StringBuilder sb = new StringBuilder();
            sb.append("update customers set name='");
            sb.append(editText.getText().toString());
            sb.append("',gsm='");
            sb.append(editText2.getText().toString());
            sb.append("' where id='");
            sb.append(this.f2150f);
            sb.append("'");
            ju.mo562d(sb.toString());
        }
        this.f2150f = 0;
        mo3457b(1);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.CustomerList_tmp] */
    /* renamed from: a */
    public void mo3452a(Cursor cursor) {
        cursor.getCount();
        this.f2153i.clear();
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            C0082EH eh = new C0082EH(cursor.getString(cursor.getColumnIndex(Attribute.f2026ID)), cursor.getString(cursor.getColumnIndex("_id")), cursor.getString(cursor.getColumnIndex("phone")), cursor.getDouble(cursor.getColumnIndex("amount")), this.f2168x[cursor.getInt(cursor.getColumnIndex("_in"))], 0);
            eh.mo190e(cursor.getString(cursor.getColumnIndex("cnt")));
            this.f2153i.add(eh);
            cursor.moveToNext();
        }
        cursor.close();
        this.f2152h = new C0388SM(this, 2131492935, this.f2153i);
        this.f2152h.f1138i.clear();
        this.f2151g.setAdapter(this.f2152h);
    }

    /* renamed from: a */
    public void mo3453a(String str) {
        this.f2152h.getFilter().filter(str);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.CustomerList_tmp] */
    /* renamed from: a */
    public void mo1838a(String str, String str2) {
        if (str != null && str2 != null) {
            if (C0268MU.m850b(this, "market.db", str, str2, "com.valdio.valdioveliu.recyclerview") == 0) {
                new Handler().postDelayed(new C1172yI(this), 5000);
            }
            mo3457b(1);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.valdio.valdioveliu.recyclerview.CustomerList_tmp, android.app.Activity] */
    public void add_btn(View view) {
        if (this.f2152h.mo1179a() <= 0) {
            TextView textView = (TextView) ((LinearLayout) ((View) view.getParent()).getParent()).findViewById(2131296394);
            Intent intent = new Intent(view.getContext(), Customer_Det_List_edit.class);
            intent.putExtra("CUS_NAME", textView.getText().toString());
            startActivity(intent);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.CustomerList_tmp, android.app.Activity] */
    public void amount_add_btn(View view) {
        startActivity(new Intent(view.getContext(), Customer_Det_List_edit.class));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.valdio.valdioveliu.recyclerview.CustomerList_tmp, android.app.Activity] */
    /* renamed from: b */
    public void mo3456b() {
        int size = this.f2154j.size() - 1;
        if (this.f2154j.valueAt(size)) {
            C0082EH item = this.f2152h.getItem(this.f2154j.keyAt(size));
            C0142HH a = C0142HH.m298a(item.mo191f(), item.mo192g(), item.mo189e());
            this.f2150f = Integer.parseInt(item.mo191f());
            a.show(getFragmentManager(), "CUSTOMER");
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.CustomerList_tmp, android.app.Activity] */
    /* renamed from: b */
    public void mo3457b(int i) {
        if (i == 0) {
            mo3452a(this.f2146b.mo447B());
            this.f2157m.setText(getString(2131755191));
            mo3451a(1);
        } else if (i == 1) {
            mo3452a(this.f2146b.mo447B());
            mo3451a(3);
        }
    }

    /* renamed from: b */
    public void mo3458b(Cursor cursor) {
        this.f2169y = new String[cursor.getCount()];
        if (cursor.moveToFirst()) {
            int i = 0;
            do {
                this.f2169y[i] = cursor.getString(cursor.getColumnIndex("_id"));
                i++;
            } while (cursor.moveToNext());
        }
        cursor.close();
    }

    /* renamed from: b */
    public boolean mo1839b(String str, String str2) {
        return new File(str, str2).exists();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.valdio.valdioveliu.recyclerview.CustomerList_tmp, android.app.Activity] */
    /* renamed from: c */
    public void mo3459c() {
        try {
            C0195JU.f445e = ((TelephonyManager) getSystemService("phone")).getDeviceId().substring(0, 14);
            C0195JU.f446f = C0753eN.m2610a(C0195JU.f445e);
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.CustomerList_tmp, android.app.Activity] */
    /* renamed from: c */
    public final void mo3460c(int i) {
        Intent intent;
        switch (i) {
            case -1:
                break;
            case 0:
                intent = new Intent(this, Customer_Det_List_edit.class);
                break;
            case 1:
                intent = new Intent(this, Report2_customer_late_exp.class);
                break;
            case 2:
                intent = new Intent(this, Customer_Det_List_All.class);
                break;
            case 3:
                intent = new Intent(this, Report3_balance_month.class);
                break;
            case 4:
                new DateFormat();
                String charSequence = DateFormat.format("yyyyMMddkkmmss", new Date()).toString();
                StringBuilder sb = new StringBuilder();
                sb.append(charSequence);
                String str = "-market.db";
                sb.append(str);
                C0268MU.m848a(this, "market.db", sb.toString(), "com.valdio.valdioveliu.recyclerview");
                C0195JU ju = this.f2146b;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(charSequence);
                sb2.append(str);
                ju.mo480S(sb2.toString());
                break;
            case 5:
                C0600aM a = C0600aM.m1755a(C0603c.FileSelector, 2131755359, 2131755358, 2131755360, 17301585, 17301565, 17301582);
                ArrayList arrayList = new ArrayList();
                arrayList.add(".db");
                a.mo1832a(C0600aM.m1756a(arrayList));
                a.show(getFragmentManager(), "Test");
                break;
            case 6:
                Builder builder = new Builder(this);
                View inflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(2131492908, null);
                TextView textView = (TextView) inflate.findViewById(2131296653);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setText(2131755139);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                builder.setView(inflate);
                builder.setTitle(getString(2131755138));
                builder.setCancelable(false).setPositiveButton("OK", new C0102FI(this));
                builder.create().show();
                break;
            case 7:
                intent = new Intent(this, help.class);
                break;
            case 8:
                Process.killProcess(Process.myPid());
                System.exit(0);
                getParent().finish();
                break;
            default:
                return;
        }
        startActivity(intent);
        this.f2163s.closeDrawer(this.f2164t);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.CustomerList_tmp, android.app.Activity] */
    public void help_btn(View view) {
        Builder builder = new Builder(this);
        WebView webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/help.html");
        webView.setWebViewClient(new C0122GI(this));
        builder.setView(webView);
        builder.setNegativeButton(getString(2131755134), new C0144HI(this));
        builder.show();
    }

    public void onBackPressed() {
        if (!this.f2163s.isDrawerOpen(this.f2164t)) {
            Process.killProcess(Process.myPid());
        } else {
            this.f2163s.closeDrawer(this.f2164t);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        CustomerList_tmp.super.onConfigurationChanged(configuration);
        this.f2165u.onConfigurationChanged(configuration);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.CustomerList_tmp, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    public void onCreate(Bundle bundle) {
        CustomerList_tmp.super.onCreate(bundle);
        setContentView(2131492901);
        this.f2156l = findViewById(2131296669);
        setSupportActionBar(this.f2156l);
        this.f2146b = new C0195JU(this.f2145a, this);
        this.f2157m = (TextView) findViewById(2131296466);
        this.f2151g = (ListView) findViewById(2131296532);
        this.f2151g.setEmptyView((TextView) findViewById(2131296440));
        AsyncTask.execute(new C1194zI(this));
        int i = 0;
        try {
            mo3452a(this.f2146b.mo447B());
            mo3457b(0);
        } catch (Exception unused) {
        }
        CharSequence title = getTitle();
        this.f2161q = title;
        this.f2162r = title;
        this.f2159o = getResources().getStringArray(2130903057);
        this.f2160p = getResources().obtainTypedArray(2130903044);
        this.f2163s = findViewById(2131296411);
        this.f2164t = (ListView) findViewById(2131296627);
        this.f2166v = new ArrayList();
        while (true) {
            String[] strArr = this.f2159o;
            if (i >= strArr.length) {
                break;
            }
            this.f2166v.add(new C0796gO(strArr[i], this.f2160p.getResourceId(i, -1)));
            i++;
        }
        this.f2160p.recycle();
        this.f2167w = new C0063DH(getApplicationContext(), this.f2166v);
        this.f2164t.setAdapter(this.f2167w);
        this.f2164t.setOnItemClickListener(new C0680a());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        C0002AI ai = new C0002AI(this, this, this.f2163s, this.f2156l, 2131755090, 2131755090);
        this.f2165u = ai;
        this.f2163s.setDrawerListener(this.f2165u);
        if (bundle == null) {
            mo3460c(-1);
        }
        this.f2151g.setOnItemClickListener(new C0021BI(this));
        mo3458b(this.f2146b.mo453D());
        this.f2158n = new ArrayAdapter<>(this, 17367050, this.f2169y);
        this.f2151g.setChoiceMode(3);
        this.f2151g.setMultiChoiceModeListener(new C0083EI(this));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.valdio.valdioveliu.recyclerview.CustomerList_tmp, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131558412, menu);
        MenuItem findItem = menu.findItem(2131296605);
        SearchView actionView = MenuItemCompat.getActionView(findItem);
        actionView.setSearchableInfo(((SearchManager) getSystemService("search")).getSearchableInfo(getComponentName()));
        actionView.setQueryHint(getString(2131755371));
        actionView.setOnQueryTextListener(new C0164II(this));
        MenuItemCompat.setOnActionExpandListener(findItem, new C0183JI(this));
        this.f2170z = MenuItemCompat.getActionProvider(menu.findItem(2131296298));
        this.f2170z.setShareIntent(this.f2146b.mo454E(getString(2131755378)));
        return CustomerList_tmp.super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        CustomerList_tmp.super.onDestroy();
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.valdio.valdioveliu.recyclerview.CustomerList_tmp, android.app.Activity] */
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.f2165u.onOptionsItemSelected(menuItem)) {
            return true;
        }
        return CustomerList_tmp.super.onOptionsItemSelected(menuItem);
    }

    public void onPostCreate(Bundle bundle) {
        CustomerList_tmp.super.onPostCreate(bundle);
        this.f2165u.syncState();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.CustomerList_tmp, android.app.Activity] */
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(2131296298).setVisible(!this.f2163s.isDrawerOpen(this.f2164t));
        return CustomerList_tmp.super.onPrepareOptionsMenu(menu);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.valdio.valdioveliu.recyclerview.CustomerList_tmp, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    public void onRestart() {
        CustomerList_tmp.super.onRestart();
        setSupportActionBar(this.f2156l);
        mo3457b(1);
    }

    public void onResume() {
        CustomerList_tmp.super.onResume();
    }

    public void onStart() {
        CustomerList_tmp.super.onStart();
    }

    public void onStop() {
        CustomerList_tmp.super.onStop();
    }

    public void save_btn(View view) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.CustomerList_tmp, android.app.Activity] */
    public void search_btn(View view) {
        mo3457b(2);
        try {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        } catch (Exception unused) {
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f2162r = charSequence;
        getSupportActionBar().setTitle(this.f2162r);
    }
}
