package com.adam.myapplication;


import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.SearchManager;
import android.app.backup.BackupManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.preference.PreferenceManager;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
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
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.itextpdf.tool.xml.html.HTML.Attribute;
import java.io.File;
import java.io.Serializable;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class CustomerList extends AppCompatActivity implements OnItemClickListener, C0601a, C0432a {

    /* renamed from: a */
    public static int f2078a;

    /* renamed from: A */
    public int[] f2079A = {2131230923, 1, 2131230855};

    /* renamed from: B */
    public String[] f2080B = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    /* renamed from: C */
    public int f2081C = 0;

    /* renamed from: D */
    public EditText f2082D;

    /* renamed from: E */
    public boolean f2083E;

    /* renamed from: F */
    public String f2084F = "";

    /* renamed from: G */
    public Bundle f2085G;

    /* renamed from: H */
    public Bundle f2086H;

    /* renamed from: I */
    public ShareActionProvider f2087I;

    /* renamed from: b */
    public SQLiteDatabase f2088b;

    /* renamed from: c */
    public C0195JU f2089c;

    /* renamed from: d */
    public EditText f2090d = null;

    /* renamed from: e */
    public EditText f2091e = null;

    /* renamed from: f */
    public Button f2092f = null;

    /* renamed from: g */
    public int f2093g = 0;

    /* renamed from: h */
    public ListView f2094h = null;

    /* renamed from: i */
    public C0388SM f2095i;

    /* renamed from: j */
    public List<C0082EH> f2096j = new ArrayList();

    /* renamed from: k */
    public ArrayList<C0260MM> f2097k = new ArrayList<>();

    /* renamed from: l */
    public SparseBooleanArray f2098l;

    /* renamed from: m */
    public ActionBar f2099m = null;

    /* renamed from: n */
    public Toolbar f2100n = null;

    /* renamed from: o */
    public TextView f2101o = null;

    /* renamed from: p */
    public ArrayAdapter<String> f2102p;

    /* renamed from: q */
    public String[] f2103q;

    /* renamed from: r */
    public TypedArray f2104r;

    /* renamed from: s */
    public CharSequence f2105s;

    /* renamed from: t */
    public CharSequence f2106t;

    /* renamed from: u */
    public DrawerLayout f2107u;

    /* renamed from: v */
    public ListView f2108v;

    /* renamed from: w */
    public ActionBarDrawerToggle f2109w;

    /* renamed from: x */
    public List<C0796gO> f2110x;

    /* renamed from: y */
    public C0063DH f2111y;

    /* renamed from: z */
    public AdView f2112z;

    /* renamed from: com.valdio.valdioveliu.recyclerview.CustomerList$a */
    class C0679a implements OnItemClickListener {
        public C0679a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            CustomerList.this.mo3384d(i);
        }
    }

    /* renamed from: a */
    public double mo3369a(List<C0082EH> list) {
        double d = 0.0d;
        for (int size = list.size() - 1; size >= 0; size--) {
            int i = ((C0082EH) list.get(size)).mo193h() == this.f2079A[0] ? -1 : ((C0082EH) list.get(size)).mo193h() == this.f2079A[2] ? 1 : 0;
            double parseDouble = Double.parseDouble(((C0082EH) list.get(size)).mo180a().replaceAll(",", ""));
            double d2 = (double) i;
            Double.isNaN(d2);
            d += parseDouble * d2;
        }
        return d;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.CustomerList, android.app.Activity] */
    /* renamed from: a */
    public void mo3370a() {
        String str = "android.permission.READ_CONTACTS";
        if (!(ContextCompat.checkSelfPermission(this, str) == 0)) {
            ActivityCompat.requestPermissions(this, new String[]{str}, C0776fN.AppCompatTheme_windowActionModeOverlay);
        }
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.CustomerList] */
    /* renamed from: a */
    public void mo3371a(Cursor cursor) {
        cursor.getCount();
        this.f2096j.clear();
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            C0082EH eh = new C0082EH(cursor.getString(cursor.getColumnIndex(Attribute.f2026ID)), cursor.getString(cursor.getColumnIndex("_id")), cursor.getString(cursor.getColumnIndex("phone")), cursor.getDouble(cursor.getColumnIndex("amount")), this.f2079A[cursor.getInt(cursor.getColumnIndex("_in"))], 0, cursor.getString(cursor.getColumnIndex("g_name")));
            eh.mo190e(cursor.getString(cursor.getColumnIndex("cnt")));
            this.f2096j.add(eh);
            cursor.moveToNext();
        }
        cursor.close();
        this.f2095i = new C0388SM(this, 2131492935, this.f2096j);
        this.f2095i.f1138i.clear();
        this.f2094h.setAdapter(this.f2095i);
        this.f2085G = new Bundle();
        this.f2085G.putSerializable("dataCus", (Serializable) this.f2096j);
        mo3379b(this.f2089c.mo635z());
    }

    /* renamed from: a */
    public void mo3372a(String str) {
        this.f2095i.getFilter().filter(str);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.CustomerList] */
    /* renamed from: a */
    public void mo1838a(String str, String str2) {
        if (str != null && str2 != null) {
            if (C0268MU.m850b(this, "market.db", str, str2, "com.valdio.valdioveliu.recyclerview") == 0) {
                new Handler().postDelayed(new C0565_H(this), 5000);
            }
            mo3381c(1);
        }
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.CustomerList, android.app.Activity] */
    /* renamed from: a */
    public void mo3373a(String str, String str2, String str3, String str4) {
        try {
            Builder builder = new Builder(this);
            View inflate = getLayoutInflater().inflate(2131492955, null);
            builder.setView(inflate);
            EditText editText = (EditText) inflate.findViewById(2131296387);
            EditText editText2 = (EditText) inflate.findViewById(2131296389);
            ImageView imageView = (ImageView) inflate.findViewById(2131296498);
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) inflate.findViewById(2131296384);
            editText.setText(str2);
            editText2.setText(str3);
            autoCompleteTextView.setText(str4);
            ArrayAdapter arrayAdapter = new ArrayAdapter(getBaseContext(), 17367049, this.f2089c.mo457G());
            autoCompleteTextView.setThreshold(1);
            autoCompleteTextView.setAdapter(arrayAdapter);
            autoCompleteTextView.setOnItemClickListener(new C0255MH(this, autoCompleteTextView));
            autoCompleteTextView.setOnTouchListener(new C0275NH(this, autoCompleteTextView));
            this.f2082D = editText2;
            editText2.requestFocus();
            imageView.setOnClickListener(new C0297OH(this));
            builder.setPositiveButton(getString(2131755359), new C0321PH(this));
            builder.setNegativeButton(getString(2131755358), new C0341QH(this));
            AlertDialog create = builder.create();
            create.getWindow().setSoftInputMode(4);
            create.show();
            Button button = create.getButton(-1);
            C0363RH rh = new C0363RH(this, editText2, autoCompleteTextView, str, editText, create);
            button.setOnClickListener(rh);
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.CustomerList, android.app.Activity] */
    /* renamed from: a */
    public boolean mo3374a(String str, String str2, Context context) {
        C0405TH th = new C0405TH(this);
        Builder builder = new Builder(context);
        builder.setTitle(str);
        builder.setMessage(str2);
        builder.setPositiveButton(getString(2131755137), new C0427UH(this, th));
        builder.setNegativeButton(getString(2131755136), new C0452VH(this, th));
        builder.show();
        try {
            Looper.loop();
        } catch (RuntimeException unused) {
        }
        return this.f2083E;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.valdio.valdioveliu.recyclerview.CustomerList, android.app.Activity] */
    public void add_btn(View view) {
        if (this.f2095i.mo1179a() <= 0) {
            TextView textView = (TextView) ((LinearLayout) ((View) view.getParent()).getParent()).findViewById(2131296394);
            Intent intent = new Intent(view.getContext(), Customer_Det_List_edit.class);
            intent.putExtra("CUS_NAME", textView.getText().toString());
            startActivity(intent);
            f2078a = this.f2094h.getFirstVisiblePosition();
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.CustomerList, android.app.Activity] */
    public void amount_add_btn(View view) {
        startActivity(new Intent(view.getContext(), Customer_Det_List_edit.class));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.CustomerList, android.app.Activity] */
    /* renamed from: b */
    public void mo3377b() {
        String str = "android.permission.WRITE_EXTERNAL_STORAGE";
        if (!(ContextCompat.checkSelfPermission(this, str) == 0)) {
            ActivityCompat.requestPermissions(this, new String[]{str}, C0776fN.AppCompatTheme_windowActionBarOverlay);
        }
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [com.valdio.valdioveliu.recyclerview.CustomerList, android.app.Activity] */
    /* renamed from: b */
    public void mo3378b(int i) {
        String str = "1";
        String str2 = "first_run";
        NumberFormat instance = NumberFormat.getInstance(Locale.ENGLISH);
        String str3 = "\t";
        if (i == 1) {
            this.f2101o.setText(getString(2131755188));
            try {
                ArrayList x = this.f2089c.mo630x();
                TextView textView = this.f2101o;
                StringBuilder sb = new StringBuilder();
                sb.append(getString(2131755192));
                sb.append(instance.format(Double.parseDouble((String) x.get(0))));
                sb.append(str3);
                sb.append(getString(2131755190));
                sb.append(instance.format(Double.parseDouble((String) x.get(1))));
                sb.append(str3);
                textView.setText(sb.toString());
                if (x.size() > 1 && Double.parseDouble((String) x.get(0)) == 0.0d && Double.parseDouble((String) x.get(1)) == 0.0d) {
                    SharedPreferences sharedPreferences = getSharedPreferences(str2, 1);
                    if (!sharedPreferences.getString(str2, "0").equals(str)) {
                        sharedPreferences.edit().putString(str2, str).commit();
                        mo3392k();
                    }
                }
            } catch (Exception unused) {
            }
        } else if (i == 2) {
            double a = mo3369a(this.f2095i.f1133d);
            TextView textView2 = this.f2101o;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getString(2131755189));
            sb2.append(instance.format(a));
            textView2.setText(sb2.toString());
        } else if (i == 3) {
            this.f2101o.setText(getString(2131755191));
            ArrayList x2 = this.f2089c.mo630x();
            if (x2.size() > 1) {
                TextView textView3 = this.f2101o;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(getString(2131755192));
                sb3.append(instance.format(Double.parseDouble((String) x2.get(0))));
                sb3.append(str3);
                sb3.append(getString(2131755190));
                sb3.append(instance.format(Double.parseDouble((String) x2.get(1))));
                sb3.append(str3);
                textView3.setText(sb3.toString());
            }
        }
    }

    /* renamed from: b */
    public void mo3379b(Cursor cursor) {
        cursor.getCount();
        this.f2097k.clear();
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            this.f2097k.add(new C0260MM(cursor.getString(cursor.getColumnIndex("_id")), cursor.getString(cursor.getColumnIndex("g_name"))));
            cursor.moveToNext();
        }
        cursor.close();
        this.f2086H = new Bundle();
        this.f2086H.putSerializable("dataGroups", this.f2097k);
    }

    /* renamed from: b */
    public boolean mo1839b(String str, String str2) {
        return str2 != null && new File(str, str2).exists();
    }

    /* renamed from: c */
    public void mo3380c() {
        for (int size = this.f2098l.size() - 1; size >= 0; size--) {
            if (this.f2098l.valueAt(size)) {
                C0082EH item = this.f2095i.getItem(this.f2098l.keyAt(size));
                this.f2095i.remove(item);
                this.f2089c.mo515a(item.mo191f());
            }
        }
        mo3381c(1);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.CustomerList, android.app.Activity] */
    /* renamed from: c */
    public void mo3381c(int i) {
        if (i == 0) {
            mo3371a(this.f2089c.mo447B());
            this.f2101o.setText(getString(2131755191));
            mo3378b(1);
        } else if (i == 1) {
            mo3371a(this.f2089c.mo447B());
            mo3378b(3);
        }
    }

    /* renamed from: c */
    public void mo3382c(Cursor cursor) {
        this.f2080B = new String[cursor.getCount()];
        if (cursor.moveToFirst()) {
            int i = 0;
            do {
                this.f2080B[i] = cursor.getString(cursor.getColumnIndex("_id"));
                i++;
            } while (cursor.moveToNext());
        }
        cursor.close();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.CustomerList] */
    /* renamed from: c */
    public void mo1270c(String str, String str2) {
        if (str != null && str2 != null) {
            mo3377b();
            new DateFormat();
            DateFormat.format("yyyyMMddkkmmss", new Date()).toString();
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(".db");
            C0268MU.m849a(this, str, "market.db", sb.toString(), "com.valdio.valdioveliu.recyclerview");
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.valdio.valdioveliu.recyclerview.CustomerList, android.app.Activity] */
    /* renamed from: d */
    public void mo3383d() {
        try {
            C0195JU.f445e = ((TelephonyManager) getSystemService("phone")).getDeviceId().substring(0, 14);
            C0195JU.f446f = C0753eN.m2610a(C0195JU.f445e);
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [android.content.Context, android.support.v4.app.FragmentActivity, com.valdio.valdioveliu.recyclerview.CustomerList, android.app.Activity] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0196, code lost:
        r11.show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x01ad, code lost:
        r11.putExtra(r6, r0);
        r11.putExtras(r10.f2086H);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x01cf, code lost:
        startActivity(r11);
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3384d(int r11) {
        /*
            r10 = this;
            r0 = 0
            java.lang.String r1 = "com.valdio.valdioveliu.recyclerview"
            java.lang.String r2 = "market.db"
            java.lang.String r3 = "yyyyMMddkkmmss"
            r4 = 1
            java.lang.String r5 = "-market.db"
            java.lang.String r6 = "screen_no"
            switch(r11) {
                case -1: goto L_0x01d2;
                case 0: goto L_0x01c8;
                case 1: goto L_0x01b6;
                case 2: goto L_0x01a4;
                case 3: goto L_0x019a;
                case 4: goto L_0x0127;
                case 5: goto L_0x00cc;
                case 6: goto L_0x008b;
                case 7: goto L_0x007c;
                case 8: goto L_0x0029;
                case 9: goto L_0x0024;
                case 10: goto L_0x0011;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x01d9
        L_0x0011:
            int r11 = android.os.Process.myPid()
            android.os.Process.killProcess(r11)
            java.lang.System.exit(r0)
            android.app.Activity r11 = r10.getParent()
            r11.finish()
            goto L_0x01d2
        L_0x0024:
            r10.mo3392k()
            goto L_0x01d9
        L_0x0029:
            android.app.AlertDialog$Builder r11 = new android.app.AlertDialog$Builder
            r11.<init>(r10)
            java.lang.String r1 = "layout_inflater"
            java.lang.Object r1 = r10.getSystemService(r1)
            android.view.LayoutInflater r1 = (android.view.LayoutInflater) r1
            r2 = 2131492908(0x7f0c002c, float:1.8609281E38)
            r3 = 0
            android.view.View r1 = r1.inflate(r2, r3)
            r2 = 2131296653(0x7f09018d, float:1.8211229E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.text.method.MovementMethod r3 = android.text.method.LinkMovementMethod.getInstance()
            r2.setMovementMethod(r3)
            r3 = 2131755139(0x7f100083, float:1.9141149E38)
            r2.setText(r3)
            android.text.method.MovementMethod r3 = android.text.method.LinkMovementMethod.getInstance()
            r2.setMovementMethod(r3)
            r11.setView(r1)
            r1 = 2131755138(0x7f100082, float:1.9141147E38)
            java.lang.String r1 = r10.getString(r1)
            r11.setTitle(r1)
            android.app.AlertDialog$Builder r0 = r11.setCancelable(r0)
            LH r1 = new LH
            r1.<init>(r10)
            java.lang.String r2 = "OK"
            r0.setPositiveButton(r2, r1)
            android.app.AlertDialog r11 = r11.create()
            goto L_0x0196
        L_0x007c:
            r10.mo3377b()
            android.content.Intent r11 = new android.content.Intent
            java.lang.Class<com.valdio.valdioveliu.recyclerview.SettingsActivity> r0 = com.valdio.valdioveliu.recyclerview.SettingsActivity.class
            r11.<init>(r10, r0)
            r10.startActivityForResult(r11, r4)
            goto L_0x01d2
        L_0x008b:
            r10.mo3370a()
            r10.mo3377b()
            android.app.AlertDialog$Builder r11 = new android.app.AlertDialog$Builder     // Catch:{ Exception -> 0x01d2 }
            r11.<init>(r10)     // Catch:{ Exception -> 0x01d2 }
            r0 = 2131755169(0x7f1000a1, float:1.914121E38)
            java.lang.String r0 = r10.getString(r0)     // Catch:{ Exception -> 0x01d2 }
            r11.setMessage(r0)     // Catch:{ Exception -> 0x01d2 }
            android.app.AlertDialog$Builder r0 = r11.setCancelable(r4)     // Catch:{ Exception -> 0x01d2 }
            r1 = 2131755137(0x7f100081, float:1.9141145E38)
            java.lang.String r1 = r10.getString(r1)     // Catch:{ Exception -> 0x01d2 }
            KH r2 = new KH     // Catch:{ Exception -> 0x01d2 }
            r2.<init>(r10)     // Catch:{ Exception -> 0x01d2 }
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)     // Catch:{ Exception -> 0x01d2 }
            r1 = 2131755136(0x7f100080, float:1.9141143E38)
            java.lang.String r1 = r10.getString(r1)     // Catch:{ Exception -> 0x01d2 }
            JH r2 = new JH     // Catch:{ Exception -> 0x01d2 }
            r2.<init>(r10)     // Catch:{ Exception -> 0x01d2 }
            r0.setNegativeButton(r1, r2)     // Catch:{ Exception -> 0x01d2 }
            android.app.AlertDialog r11 = r11.create()     // Catch:{ Exception -> 0x01d2 }
            r11.show()     // Catch:{ Exception -> 0x01d2 }
            goto L_0x01d2
        L_0x00cc:
            r10.mo3377b()
            android.text.format.DateFormat r11 = new android.text.format.DateFormat
            r11.<init>()
            java.util.Date r11 = new java.util.Date
            r11.<init>()
            java.lang.CharSequence r11 = android.text.format.DateFormat.format(r3, r11)
            java.lang.String r11 = r11.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r0.append(r5)
            java.lang.String r11 = r0.toString()
            p000.C0268MU.m848a(r10, r2, r11, r1)
            aM$c r3 = p000.C0600aM.C0603c.FileSelector
            r4 = 2131755359(0x7f10015f, float:1.9141595E38)
            r5 = 2131755358(0x7f10015e, float:1.9141593E38)
            r6 = 2131755360(0x7f100160, float:1.9141597E38)
            r7 = 17301585(0x1080051, float:2.4979482E-38)
            r8 = 17301565(0x108003d, float:2.4979426E-38)
            r9 = 17301582(0x108004e, float:2.4979474E-38)
            aM r11 = p000.C0600aM.m1755a(r3, r4, r5, r6, r7, r8, r9)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = ".db"
            r0.add(r1)
            java.io.FilenameFilter r0 = p000.C0600aM.m1756a(r0)
            r11.mo1832a(r0)
            android.app.FragmentManager r0 = r10.getFragmentManager()
            java.lang.String r1 = "Test"
            r11.show(r0, r1)
            goto L_0x01d2
        L_0x0127:
            r10.mo3377b()
            android.text.format.DateFormat r11 = new android.text.format.DateFormat
            r11.<init>()
            java.util.Date r11 = new java.util.Date
            r11.<init>()
            java.lang.CharSequence r11 = android.text.format.DateFormat.format(r3, r11)
            java.lang.String r11 = r11.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            p000.C0268MU.m848a(r10, r2, r0, r1)
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r10)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.setTitle(r1)
            r1 = 2131755096(0x7f100058, float:1.9141062E38)
            java.lang.String r1 = r10.getString(r1)
            r0.setMessage(r1)
            android.app.AlertDialog$Builder r1 = r0.setCancelable(r4)
            r2 = 2131755377(0x7f100171, float:1.9141632E38)
            java.lang.String r2 = r10.getString(r2)
            IH r3 = new IH
            r3.<init>(r10, r11)
            android.app.AlertDialog$Builder r11 = r1.setPositiveButton(r2, r3)
            r1 = 2131755108(0x7f100064, float:1.9141086E38)
            java.lang.String r1 = r10.getString(r1)
            hI r2 = new hI
            r2.<init>(r10)
            r11.setNegativeButton(r1, r2)
            android.app.AlertDialog r11 = r0.create()
        L_0x0196:
            r11.show()
            goto L_0x01d2
        L_0x019a:
            android.content.Intent r11 = new android.content.Intent
            java.lang.Class<com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport> r0 = com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport.class
            r11.<init>(r10, r0)
            java.lang.String r0 = "3"
            goto L_0x01ad
        L_0x01a4:
            android.content.Intent r11 = new android.content.Intent
            java.lang.Class<com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport> r0 = com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport.class
            r11.<init>(r10, r0)
            java.lang.String r0 = "2"
        L_0x01ad:
            r11.putExtra(r6, r0)
            android.os.Bundle r0 = r10.f2086H
            r11.putExtras(r0)
            goto L_0x01cf
        L_0x01b6:
            java.util.ArrayList<MM> r11 = r10.f2097k
            int r11 = r11.size()
            if (r11 == 0) goto L_0x01d9
            android.content.Intent r11 = new android.content.Intent
            java.lang.Class<com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport> r0 = com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport.class
            r11.<init>(r10, r0)
            java.lang.String r0 = "1"
            goto L_0x01ad
        L_0x01c8:
            android.content.Intent r11 = new android.content.Intent
            java.lang.Class<com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit> r0 = com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit.class
            r11.<init>(r10, r0)
        L_0x01cf:
            r10.startActivity(r11)
        L_0x01d2:
            android.support.v4.widget.DrawerLayout r11 = r10.f2107u
            android.widget.ListView r0 = r10.f2108v
            r11.closeDrawer(r0)
        L_0x01d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.CustomerList.mo3384d(int):void");
    }

    /* renamed from: d */
    public boolean mo1271d(String str, String str2) {
        boolean z = (str == null || str.length() == 0 || str2 == null || str2.length() == 0) ? false : true;
        if (z) {
            String b = C0431UL.m1219b(str2);
            if (b == null || b.length() == 0) {
                z = false;
            }
        }
        if (z && !C0431UL.m1216a(str2)) {
            z = false;
        }
        if (!z || !C0431UL.m1217a(str, str2)) {
            return z;
        }
        return false;
    }

    /* renamed from: e */
    public void mo3385e() {
        int size = this.f2098l.size() - 1;
        if (this.f2098l.valueAt(size)) {
            C0082EH item = this.f2095i.getItem(this.f2098l.keyAt(size));
            this.f2093g = Integer.parseInt(item.mo191f());
            mo3373a(item.mo191f(), item.mo192g(), item.mo189e(), item.mo187d());
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.CustomerList] */
    /* renamed from: f */
    public void mo3386f() {
        if (ContextCompat.checkSelfPermission(this, "android.permission.READ_PHONE_STATE") != 0) {
            mo3390i();
        } else {
            mo3383d();
        }
    }

    /* renamed from: g */
    public void mo3387g() {
        try {
            this.f2112z = findViewById(2131296305);
            if (this.f2089c.mo524a("black_list", false) || !this.f2089c.mo524a("prefAds", false)) {
                this.f2112z.loadAd(new AdRequest.Builder().build());
                return;
            }
            this.f2112z.setVisibility(8);
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.CustomerList, android.app.Activity] */
    /* renamed from: h */
    public void mo3388h() {
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
            C0195JU.f448h = defaultSharedPreferences.getBoolean("prefLogin", false);
            C0195JU.f450j = defaultSharedPreferences.getString("prefPassword", "");
            if (C0195JU.f448h && C0195JU.f449i.equals("0")) {
                startActivity(new Intent(this, LoginActivity.class));
                finish();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.CustomerList, android.app.Activity] */
    public void help_btn(View view) {
        Builder builder = new Builder(this);
        WebView webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/help.html");
        webView.setWebViewClient(new C0473WH(this));
        builder.setView(webView);
        builder.setNegativeButton(getString(2131755134), new C0493XH(this));
        builder.show();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.valdio.valdioveliu.recyclerview.CustomerList, android.app.Activity] */
    /* renamed from: i */
    public final void mo3390i() {
        String str = "android.permission.READ_PHONE_STATE";
        if (ActivityCompat.shouldShowRequestPermissionRationale(this, str)) {
            ActivityCompat.requestPermissions(this, new String[]{str}, 0);
            return;
        }
        ActivityCompat.requestPermissions(this, new String[]{str}, 0);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.CustomerList] */
    /* renamed from: j */
    public void mo3391j() {
        new BackupManager(this).dataChanged();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.CustomerList, android.app.Activity] */
    /* renamed from: k */
    public void mo3392k() {
        Builder builder = new Builder(this);
        WebView webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/help.html");
        webView.setWebViewClient(new C0771fI(this));
        builder.setView(webView);
        builder.setNegativeButton(getString(2131755134), new C0790gI(this));
        builder.show();
        this.f2107u.closeDrawer(this.f2108v);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.valdio.valdioveliu.recyclerview.CustomerList, android.app.Activity] */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            String str = "data1";
            String str2 = "display_name";
            Cursor query = getContentResolver().query(intent.getData(), new String[]{str, str2}, null, null, null);
            query.moveToFirst();
            String string = query.getString(query.getColumnIndex(str));
            String string2 = query.getString(query.getColumnIndex(str2));
            this.f2082D.setText(string);
            query.close();
            StringBuilder sb = new StringBuilder();
            sb.append("ZZZ number : ");
            sb.append(string);
            sb.append(" , name : ");
            sb.append(string2);
            Log.d("Phone=", sb.toString());
        }
    }

    public void onBackPressed() {
        if (!this.f2107u.isDrawerOpen(this.f2108v)) {
            Process.killProcess(Process.myPid());
        } else {
            this.f2107u.closeDrawer(this.f2108v);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        CustomerList.super.onConfigurationChanged(configuration);
        this.f2109w.onConfigurationChanged(configuration);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.CustomerList, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    public void onCreate(Bundle bundle) {
        CustomerList.super.onCreate(bundle);
        setContentView(2131492901);
        this.f2089c = new C0195JU(this.f2088b, this);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2089c.mo583i());
        sb.append("");
        Log.d("DB_Ver=", sb.toString());
        try {
            this.f2089c.mo551c((Context) this);
            mo3388h();
            mo3387g();
            mo3391j();
        } catch (Exception unused) {
        }
        this.f2100n = findViewById(2131296669);
        setSupportActionBar(this.f2100n);
        this.f2101o = (TextView) findViewById(2131296466);
        this.f2094h = (ListView) findViewById(2131296532);
        this.f2094h.setEmptyView((TextView) findViewById(2131296440));
        AsyncTask.execute(new C0383SH(this));
        int i = 0;
        try {
            mo3381c(0);
        } catch (Exception unused2) {
        }
        CharSequence title = getTitle();
        this.f2105s = title;
        this.f2106t = title;
        this.f2103q = getResources().getStringArray(2130903057);
        this.f2104r = getResources().obtainTypedArray(2130903044);
        this.f2107u = findViewById(2131296411);
        this.f2108v = (ListView) findViewById(2131296627);
        this.f2110x = new ArrayList();
        while (true) {
            String[] strArr = this.f2103q;
            if (i >= strArr.length) {
                break;
            }
            this.f2110x.add(new C0796gO(strArr[i], this.f2104r.getResourceId(i, -1)));
            i++;
        }
        this.f2104r.recycle();
        this.f2111y = new C0063DH(getApplicationContext(), this.f2110x);
        this.f2108v.setAdapter(this.f2111y);
        this.f2108v.setOnItemClickListener(new C0679a());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        C0596aI aIVar = new C0596aI(this, this, this.f2107u, this.f2100n, 2131755090, 2131755090);
        this.f2109w = aIVar;
        this.f2107u.setDrawerListener(this.f2109w);
        if (bundle == null) {
            mo3384d(-1);
        }
        this.f2094h.setOnItemClickListener(new C0620bI(this));
        mo3382c(this.f2089c.mo453D());
        this.f2102p = new ArrayAdapter<>(this, 17367050, this.f2080B);
        this.f2094h.setChoiceMode(3);
        this.f2094h.setMultiChoiceModeListener(new C0748eI(this));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.valdio.valdioveliu.recyclerview.CustomerList, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131558412, menu);
        MenuItem findItem = menu.findItem(2131296605);
        SearchView actionView = MenuItemCompat.getActionView(findItem);
        actionView.setSearchableInfo(((SearchManager) getSystemService("search")).getSearchableInfo(getComponentName()));
        actionView.setQueryHint(getString(2131755371));
        actionView.setOnQueryTextListener(new C0514YH(this));
        MenuItemCompat.setOnActionExpandListener(findItem, new C0541ZH(this));
        this.f2087I = MenuItemCompat.getActionProvider(menu.findItem(2131296298));
        this.f2087I.setShareIntent(this.f2089c.mo454E(getString(2131755378)));
        return CustomerList.super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        this.f2112z.destroy();
        CustomerList.super.onDestroy();
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 82) {
            return CustomerList.super.onKeyDown(i, keyEvent);
        }
        if (!this.f2107u.isDrawerOpen(this.f2108v)) {
            this.f2107u.openDrawer(this.f2108v);
        } else if (this.f2107u.isDrawerOpen(this.f2108v)) {
            this.f2107u.closeDrawer(this.f2108v);
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.valdio.valdioveliu.recyclerview.CustomerList, android.app.Activity] */
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.f2109w.onOptionsItemSelected(menuItem)) {
            return true;
        }
        return CustomerList.super.onOptionsItemSelected(menuItem);
    }

    public void onPause() {
        this.f2112z.pause();
        CustomerList.super.onPause();
    }

    public void onPostCreate(Bundle bundle) {
        CustomerList.super.onPostCreate(bundle);
        this.f2109w.syncState();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.CustomerList, android.app.Activity] */
    public boolean onPrepareOptionsMenu(Menu menu) {
        this.f2107u.isDrawerOpen(this.f2108v);
        return CustomerList.super.onPrepareOptionsMenu(menu);
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (i == 0) {
            if (iArr.length == 1 && iArr[0] == 0) {
                mo3383d();
            }
        } else if (i == 112 && iArr.length == 1) {
            int i2 = iArr[0];
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.valdio.valdioveliu.recyclerview.CustomerList, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    public void onRestart() {
        CustomerList.super.onRestart();
        setSupportActionBar(this.f2100n);
        mo3381c(1);
        try {
            int i = 0;
            View childAt = this.f2094h.getChildAt(0);
            if (childAt != null) {
                i = childAt.getTop();
            }
            this.f2094h.setSelectionFromTop(f2078a, i);
        } catch (Exception unused) {
        }
    }

    public void onResume() {
        CustomerList.super.onResume();
        AdView adView = this.f2112z;
        if (adView != null) {
            adView.resume();
        }
    }

    public void onStart() {
        CustomerList.super.onStart();
    }

    public void onStop() {
        CustomerList.super.onStop();
    }

    public void phone_pick_btn(View view) {
        startActivityForResult(new Intent("android.intent.action.PICK", Phone.CONTENT_URI), 1);
    }

    public void save_btn(View view) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.CustomerList, android.app.Activity] */
    public void search_btn(View view) {
        mo3381c(2);
        try {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        } catch (Exception unused) {
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f2106t = charSequence;
        getSupportActionBar().setTitle(this.f2106t);
    }
}
