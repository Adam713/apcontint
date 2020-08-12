package com.adam.myapplication;


import android.app.AlertDialog.Builder;
import android.app.DialogFragment;
import android.app.SearchManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
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

public class CustomerList2 extends AppCompatActivity implements OnItemClickListener, C0601a, C0143a {

    /* renamed from: a */
    public SQLiteDatabase f2114a;

    /* renamed from: b */
    public C0195JU f2115b;

    /* renamed from: c */
    public EditText f2116c = null;

    /* renamed from: d */
    public EditText f2117d = null;

    /* renamed from: e */
    public Button f2118e = null;

    /* renamed from: f */
    public int f2119f = 0;

    /* renamed from: g */
    public ListView f2120g = null;

    /* renamed from: h */
    public C0434UM f2121h;

    /* renamed from: i */
    public List<C0082EH> f2122i = new ArrayList();

    /* renamed from: j */
    public SparseBooleanArray f2123j;

    /* renamed from: k */
    public ActionBar f2124k = null;

    /* renamed from: l */
    public Toolbar f2125l = null;

    /* renamed from: m */
    public TextView f2126m = null;

    /* renamed from: n */
    public ArrayAdapter<String> f2127n;

    /* renamed from: o */
    public int[] f2128o = {2131230923, 1, 2131230855};

    /* renamed from: p */
    public String[] f2129p = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    /* renamed from: q */
    public ShareActionProvider f2130q;

    /* renamed from: a */
    public void mo3415a() {
        Log.d("getSelectedIds_CNT=", String.valueOf(this.f2123j.size()));
        for (int size = this.f2123j.size() - 1; size >= 0; size--) {
            if (this.f2123j.valueAt(size)) {
                C0082EH item = this.f2121h.getItem(this.f2123j.keyAt(size));
                this.f2121h.remove(item);
                this.f2115b.mo515a(item.mo191f());
            }
        }
        mo3416a(1);
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.CustomerList2, android.app.Activity] */
    /* renamed from: a */
    public void mo3416a(int i) {
        String str = "1";
        String str2 = "first_run";
        String str3 = "\t";
        if (i == 0) {
            mo3417a(this.f2115b.mo447B());
            this.f2126m.setText(getString(2131755191));
            try {
                NumberFormat instance = NumberFormat.getInstance(Locale.ENGLISH);
                ArrayList x = this.f2115b.mo630x();
                TextView textView = this.f2126m;
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
        } else if (i == 1) {
            mo3417a(this.f2115b.mo447B());
            this.f2126m.setText(getString(2131755191));
            NumberFormat instance2 = NumberFormat.getInstance(Locale.ENGLISH);
            ArrayList x2 = this.f2115b.mo630x();
            if (x2.size() > 1) {
                TextView textView2 = this.f2126m;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(getString(2131755192));
                sb2.append(instance2.format((long) Integer.parseInt((String) x2.get(0))));
                sb2.append(str3);
                sb2.append(getString(2131755190));
                sb2.append(instance2.format((long) Integer.parseInt((String) x2.get(1))));
                sb2.append(str3);
                textView2.setText(sb2.toString());
            }
        }
    }

    /* renamed from: a */
    public void mo327a(DialogFragment dialogFragment) {
        if (this.f2119f != 0) {
            EditText editText = (EditText) dialogFragment.getDialog().findViewById(2131296387);
            EditText editText2 = (EditText) dialogFragment.getDialog().findViewById(2131296389);
            C0195JU ju = this.f2115b;
            StringBuilder sb = new StringBuilder();
            sb.append("update customers set name='");
            sb.append(editText.getText().toString());
            sb.append("',gsm='");
            sb.append(editText2.getText().toString());
            sb.append("' where id='");
            sb.append(this.f2119f);
            sb.append("'");
            ju.mo562d(sb.toString());
        }
        this.f2119f = 0;
        mo3416a(1);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.CustomerList2] */
    /* renamed from: a */
    public void mo3417a(Cursor cursor) {
        cursor.getCount();
        this.f2122i.clear();
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            C0082EH eh = new C0082EH(cursor.getString(cursor.getColumnIndex(Attribute.f2026ID)), cursor.getString(cursor.getColumnIndex("_id")), cursor.getString(cursor.getColumnIndex("phone")), cursor.getDouble(cursor.getColumnIndex("amount")), this.f2128o[cursor.getInt(cursor.getColumnIndex("_in"))], 0);
            eh.mo190e(cursor.getString(cursor.getColumnIndex("cnt")));
            this.f2122i.add(eh);
            cursor.moveToNext();
        }
        cursor.close();
        this.f2121h = new C0434UM(this, 2131492936, this.f2122i);
        this.f2121h.f1242i.clear();
        this.f2120g.setAdapter(this.f2121h);
    }

    /* renamed from: a */
    public void mo3418a(String str) {
        this.f2121h.getFilter().filter(str);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.CustomerList2] */
    /* renamed from: a */
    public void mo1838a(String str, String str2) {
        if (str != null && str2 != null) {
            if (C0268MU.m850b(this, "market.db", str, str2, "com.valdio.valdioveliu.recyclerview") == 0) {
                new Handler().postDelayed(new C1046sI(this), 5000);
            }
            mo3416a(1);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.valdio.valdioveliu.recyclerview.CustomerList2, android.app.Activity] */
    public void add_btn(View view) {
        if (this.f2121h.mo1273a() <= 0) {
            TextView textView = (TextView) ((LinearLayout) ((View) view.getParent()).getParent()).findViewById(2131296394);
            Intent intent = new Intent(view.getContext(), Customer_Det_List_edit.class);
            intent.putExtra("CUS_NAME", textView.getText().toString());
            startActivity(intent);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.CustomerList2, android.app.Activity] */
    public void amount_add_btn(View view) {
        startActivity(new Intent(view.getContext(), Customer_Det_List_edit.class));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.valdio.valdioveliu.recyclerview.CustomerList2, android.app.Activity] */
    /* renamed from: b */
    public void mo3421b() {
        int size = this.f2123j.size() - 1;
        if (this.f2123j.valueAt(size)) {
            C0082EH item = this.f2121h.getItem(this.f2123j.keyAt(size));
            C0142HH a = C0142HH.m298a(item.mo191f(), item.mo192g(), item.mo189e());
            this.f2119f = Integer.parseInt(item.mo191f());
            a.show(getFragmentManager(), "CUSTOMER");
        }
    }

    /* renamed from: b */
    public void mo3422b(Cursor cursor) {
        this.f2129p = new String[cursor.getCount()];
        if (cursor.moveToFirst()) {
            int i = 0;
            do {
                this.f2129p[i] = cursor.getString(cursor.getColumnIndex("_id"));
                i++;
            } while (cursor.moveToNext());
        }
        cursor.close();
    }

    /* renamed from: b */
    public boolean mo1839b(String str, String str2) {
        return new File(str, str2).exists();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.valdio.valdioveliu.recyclerview.CustomerList2, android.app.Activity] */
    /* renamed from: c */
    public void mo3423c() {
        try {
            C0195JU.f445e = ((TelephonyManager) getSystemService("phone")).getDeviceId().substring(0, 14);
            C0195JU.f446f = C0753eN.m2610a(C0195JU.f445e);
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.CustomerList2, android.app.Activity] */
    public void help_btn(View view) {
        Builder builder = new Builder(this);
        WebView webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/help.html");
        webView.setWebViewClient(new C0956oI(this));
        builder.setView(webView);
        builder.setNegativeButton(getString(2131755134), new C0985pI(this));
        builder.show();
    }

    public void onBackPressed() {
        Process.killProcess(Process.myPid());
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.CustomerList2, android.support.v7.app.AppCompatActivity] */
    public void onCreate(Bundle bundle) {
        CustomerList2.super.onCreate(bundle);
        setContentView(2131492898);
        this.f2125l = findViewById(2131296669);
        setSupportActionBar(this.f2125l);
        findViewById(2131296453).setOnClickListener(new C0831iI(this));
        this.f2115b = new C0195JU(this.f2114a, this);
        this.f2126m = (TextView) findViewById(2131296466);
        this.f2120g = (ListView) findViewById(2131296532);
        this.f2120g.setEmptyView((TextView) findViewById(2131296440));
        AsyncTask.execute(new C0851jI(this));
        try {
            mo3417a(this.f2115b.mo447B());
            mo3416a(0);
        } catch (Exception unused) {
        }
        this.f2120g.setOnItemClickListener(new C0871kI(this));
        mo3422b(this.f2115b.mo453D());
        this.f2127n = new ArrayAdapter<>(this, 17367050, this.f2129p);
        this.f2120g.setChoiceMode(3);
        this.f2120g.setMultiChoiceModeListener(new C0937nI(this));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.valdio.valdioveliu.recyclerview.CustomerList2, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131558408, menu);
        SearchView actionView = MenuItemCompat.getActionView(menu.findItem(2131296605));
        actionView.setSearchableInfo(((SearchManager) getSystemService("search")).getSearchableInfo(getComponentName()));
        actionView.setQueryHint(getString(2131755371));
        actionView.setOnQueryTextListener(new C1004qI(this));
        this.f2130q = MenuItemCompat.getActionProvider(menu.findItem(2131296298));
        this.f2130q.setShareIntent(this.f2115b.mo454E(getString(2131755378)));
        return true;
    }

    public void onDestroy() {
        CustomerList2.super.onDestroy();
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.CustomerList2, android.app.Activity] */
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131296605) {
            return true;
        }
        if (itemId == 2131296588) {
            startActivity(new Intent(this, Report2_customer_late_exp.class));
            return true;
        } else if (itemId == 2131296589) {
            startActivity(new Intent(this, Customer_Det_List_All.class));
            return true;
        } else if (itemId == 2131296587) {
            startActivity(new Intent(this, Report3_balance_month.class));
            return true;
        } else if (itemId == 2131296268) {
            startActivity(new Intent(this, CustomerList_edit.class));
            return true;
        } else if (itemId == 2131296269) {
            startActivity(new Intent(this, Customer_Det_List_edit.class));
            return true;
        } else if (itemId == 2131296297) {
            Process.killProcess(Process.myPid());
            System.exit(0);
            getParent().finish();
            return true;
        } else if (itemId == 2131296287) {
            C0600aM a = C0600aM.m1755a(C0603c.FileSelector, 2131755359, 2131755358, 2131755360, 17301585, 17301565, 17301582);
            ArrayList arrayList = new ArrayList();
            arrayList.add(".db");
            a.mo1832a(C0600aM.m1756a(arrayList));
            a.show(getFragmentManager(), "Test");
            return true;
        } else if (itemId == 2131296284) {
            new DateFormat();
            String charSequence = DateFormat.format("yyyyMMddkkmmss", new Date()).toString();
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence);
            String str = "-market.db";
            sb.append(str);
            C0268MU.m848a(this, "market.db", sb.toString(), "com.valdio.valdioveliu.recyclerview");
            C0195JU ju = this.f2115b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(charSequence);
            sb2.append(str);
            ju.mo480S(sb2.toString());
            return true;
        } else if (itemId == 2131296280) {
            Builder builder = new Builder(this);
            View inflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(2131492908, null);
            TextView textView = (TextView) inflate.findViewById(2131296653);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setText(2131755139);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            builder.setView(inflate);
            builder.setTitle(getString(2131755138));
            builder.setCancelable(false).setPositiveButton("OK", new C1026rI(this));
            builder.create().show();
            return true;
        } else if (itemId == 2131296296) {
            startActivity(new Intent(this, help.class));
            return true;
        } else if (itemId == 2131296298) {
            return true;
        } else {
            return CustomerList2.super.onOptionsItemSelected(menuItem);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.valdio.valdioveliu.recyclerview.CustomerList2, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    public void onRestart() {
        CustomerList2.super.onRestart();
        setSupportActionBar(this.f2125l);
        mo3416a(1);
    }

    public void onResume() {
        CustomerList2.super.onResume();
    }

    public void onStart() {
        CustomerList2.super.onStart();
    }

    public void onStop() {
        CustomerList2.super.onStop();
    }

    public void save_btn(View view) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.CustomerList2, android.app.Activity] */
    public void search_btn(View view) {
        mo3416a(2);
        try {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        } catch (Exception unused) {
        }
    }
}
