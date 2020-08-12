package com.adam.myapplication;



import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ShareActionProvider;
import android.text.format.DateFormat;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class help extends AppCompatActivity implements C0601a {

    /* renamed from: a */
    public SQLiteDatabase f2786a;

    /* renamed from: b */
    public C0195JU f2787b;

    /* renamed from: c */
    public int f2788c = 0;

    /* renamed from: d */
    public int f2789d = 0;

    /* renamed from: e */
    public AutoCompleteTextView f2790e = null;

    /* renamed from: f */
    public EditText f2791f = null;

    /* renamed from: g */
    public EditText f2792g = null;

    /* renamed from: h */
    public Button f2793h = null;

    /* renamed from: i */
    public ListView f2794i = null;

    /* renamed from: j */
    public List<C0082EH> f2795j = new ArrayList();

    /* renamed from: k */
    public ImageButton f2796k = null;

    /* renamed from: l */
    public String[] f2797l = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    /* renamed from: m */
    public int[] f2798m = {2131230923, 1, 2131230855};

    /* renamed from: n */
    public ShareActionProvider f2799n;

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.help, android.app.Activity] */
    /* renamed from: a */
    public void mo1838a(String str, String str2) {
        if (str != null && str2 != null) {
            if (C0268MU.m850b(this, "market.db", str, str2, "com.valdio.valdioveliu.recyclerview") == 0) {
                new Handler().postDelayed(new C0248LU(this), 5000);
            }
            startActivity(new Intent(this, CustomerList.class));
        }
    }

    /* renamed from: b */
    public boolean mo1839b(String str, String str2) {
        return new File(str, str2).exists();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.help, android.app.Activity] */
    public void onBackPressed() {
        Intent intent = new Intent(this, CustomerList.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.help, android.support.v7.app.AppCompatActivity] */
    public void onCreate(Bundle bundle) {
        help.super.onCreate(bundle);
        setContentView(2131492980);
        setSupportActionBar(findViewById(2131296669));
        getSupportActionBar().show();
        WebView webView = (WebView) findViewById(2131296304);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/help.html");
        this.f2787b = new C0195JU(this.f2786a, this);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.help, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131558408, menu);
        this.f2799n = MenuItemCompat.getActionProvider(menu.findItem(2131296298));
        this.f2799n.setShareIntent(this.f2787b.mo454E(getString(2131755378)));
        return true;
    }

    public void onDestroy() {
        help.super.onDestroy();
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.help, android.app.Activity] */
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131296605) {
            return true;
        }
        if (itemId == 2131296588) {
            startActivity(new Intent(this, Report2_customer_late.class));
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
            C0195JU ju = this.f2787b;
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
            builder.setCancelable(false).setPositiveButton("OK", new C0221KU(this));
            builder.create().show();
            return true;
        } else if (itemId == 2131296296) {
            startActivity(new Intent(this, help.class));
            return true;
        } else if (itemId == 2131296298) {
            return true;
        } else {
            return help.super.onOptionsItemSelected(menuItem);
        }
    }

    public void onResume() {
        help.super.onResume();
    }
}
