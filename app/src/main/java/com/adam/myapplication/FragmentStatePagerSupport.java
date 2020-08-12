package com.adam.myapplication;


import android.app.Dialog;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.itextpdf.tool.xml.html.HTML.Attribute;
import java.util.ArrayList;
import java.util.List;

public class FragmentStatePagerSupport extends AppCompatActivity implements C0579c, C0244e, C0970c {

    /* renamed from: a */
    public static C0302OM f2415a = null;

    /* renamed from: b */
    public static String f2416b = null;

    /* renamed from: c */
    public static String f2417c = null;

    /* renamed from: d */
    public static String f2418d = null;

    /* renamed from: e */
    public static String f2419e = null;

    /* renamed from: f */
    public static String f2420f = null;

    /* renamed from: g */
    public static String f2421g = null;

    /* renamed from: h */
    public static String f2422h = null;

    /* renamed from: i */
    public static boolean f2423i = false;

    /* renamed from: j */
    public static int f2424j = 0;

    /* renamed from: k */
    public static boolean f2425k = false;

    /* renamed from: l */
    public static String f2426l = "";

    /* renamed from: A */
    public LinearLayout f2427A = null;

    /* renamed from: B */
    public ImageButton f2428B = null;

    /* renamed from: C */
    public Toolbar f2429C = null;

    /* renamed from: D */
    public int f2430D = 0;

    /* renamed from: E */
    public OnPageChangeListener f2431E = new C0752eM(this);

    /* renamed from: F */
    public int f2432F = 0;

    /* renamed from: G */
    public int f2433G = 0;

    /* renamed from: m */
    public C0554ZT f2434m;

    /* renamed from: n */
    public ViewPager f2435n;

    /* renamed from: o */
    public SQLiteDatabase f2436o;

    /* renamed from: p */
    public C0195JU f2437p;

    /* renamed from: q */
    public List<C0232LL> f2438q = new ArrayList();

    /* renamed from: r */
    public ArrayList<C0082EH> f2439r = new ArrayList<>();

    /* renamed from: s */
    public ArrayList<C0260MM> f2440s = new ArrayList<>();

    /* renamed from: t */
    public int[] f2441t = {2131230923, 1, 2131230855};

    /* renamed from: u */
    public AutoCompleteTextView f2442u = null;

    /* renamed from: v */
    public EditText f2443v = null;

    /* renamed from: w */
    public EditText f2444w = null;

    /* renamed from: x */
    public TextView f2445x = null;

    /* renamed from: y */
    public TextView f2446y = null;

    /* renamed from: z */
    public Button f2447z = null;

    /* renamed from: a */
    public ArrayList<C0082EH> mo3768a(Cursor cursor) {
        Log.d("trace_S_Loader_g_cus=", FragmentStatePagerSupport_Main.m2279h());
        ArrayList<C0082EH> arrayList = new ArrayList<>();
        C0780fR fRVar = new C0780fR();
        arrayList.clear();
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            C0082EH eh = new C0082EH(cursor.getString(fRVar.mo4360a(cursor, Attribute.f2026ID)), cursor.getString(fRVar.mo4360a(cursor, "_id")), cursor.getString(fRVar.mo4360a(cursor, "phone")), cursor.getDouble(fRVar.mo4360a(cursor, "amount")), this.f2441t[cursor.getInt(fRVar.mo4360a(cursor, "_in"))], 0, cursor.getString(fRVar.mo4360a(cursor, "g_name")), cursor.getString(fRVar.mo4360a(cursor, "curr_name")), cursor.getString(fRVar.mo4360a(cursor, "cnt")));
            arrayList.add(eh);
            cursor.moveToNext();
        }
        cursor.close();
        Log.d("trace_E_Loader_g_cus=", FragmentStatePagerSupport_Main.m2279h());
        return arrayList;
    }

    /* renamed from: a */
    public final void mo3769a() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    /* renamed from: a */
    public void mo3770a(int i) {
        f2424j = i;
        f2425k = true;
        StringBuilder sb = new StringBuilder();
        sb.append(f2424j);
        sb.append("");
        Log.d("myOnPageSelectedLogic=", sb.toString());
        new Handler().post(new C0732dM(this));
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport] */
    public void onButtonClicked(View view) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2430D);
        String str2 = ":";
        sb.append(str2);
        sb.append(2131296577);
        sb.append(str2);
        sb.append(view.getId());
        Log.d("onItemClicked=", sb.toString());
        int i = this.f2430D;
        if ((i == 1 || i == 2 || i == 3) && view.getId() == 2131296503) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < this.f2440s.size(); i2++) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(((C0260MM) this.f2440s.get(i2)).mo890c());
                if (C0195JU.f451k) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("(");
                    sb3.append(((C0260MM) this.f2440s.get(i2)).mo888a());
                    sb3.append(")");
                    str = sb3.toString();
                } else {
                    str = "";
                }
                sb2.append(str);
                arrayList.add(sb2.toString());
            }
            ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367049, arrayList);
            Dialog dialog = new Dialog(this);
            LinearLayout linearLayout = new LinearLayout(this);
            ListView listView = new ListView(this);
            listView.setAdapter(arrayAdapter);
            listView.setOnItemClickListener(new C0775fM(this, dialog));
            linearLayout.setFocusable(true);
            linearLayout.addView(listView, -1, -1);
            dialog.setContentView(linearLayout);
            dialog.show();
        }
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport, android.support.v4.app.FragmentActivity, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|(1:7)|8|9|10|(8:12|13|(1:15)(1:16)|17|(2:18|(2:20|(1:25)(2:71|24))(2:70|26))|27|(4:29|(1:31)(1:33)|32|34)|35)(2:36|(3:38|39|(2:41|42)(3:43|(1:45)(2:47|(1:49)(2:50|(1:52)))|46)))|53|(2:57|(1:(1:75)(2:59|(2:74|61)(1:62))))(0)|63|(1:78)(2:67|79)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x002a */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043 A[SYNTHETIC, Splitter:B:12:0x0043] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01df A[Catch:{ Exception -> 0x0337 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x02cb A[Catch:{ Exception -> 0x0337 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x032b A[EDGE_INSN: B:75:0x032b->B:63:0x032b ?: BREAK
    EDGE_INSN: B:75:0x032b->B:63:0x032b ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            java.lang.String r0 = "show_move_tr"
            java.lang.String r1 = "screen_no"
            java.lang.String r2 = "CUS_NAME"
            com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport.super.onCreate(r9)
            r9 = 2131492974(0x7f0c006e, float:1.8609415E38)
            r8.setContentView(r9)
            r9 = 0
            f2424j = r9
            r8.mo3769a()     // Catch:{ Exception -> 0x0337 }
            r3 = 1
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r8)     // Catch:{ Exception -> 0x002a }
            java.lang.Class<android.view.ViewConfiguration> r5 = android.view.ViewConfiguration.class
            java.lang.String r6 = "sHasPermanentMenuKey"
            java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch:{ Exception -> 0x002a }
            if (r5 == 0) goto L_0x002a
            r5.setAccessible(r3)     // Catch:{ Exception -> 0x002a }
            r5.setBoolean(r4, r9)     // Catch:{ Exception -> 0x002a }
        L_0x002a:
            JU r4 = new JU     // Catch:{ Exception -> 0x0337 }
            android.database.sqlite.SQLiteDatabase r5 = r8.f2436o     // Catch:{ Exception -> 0x0337 }
            r4.<init>(r5, r8)     // Catch:{ Exception -> 0x0337 }
            r8.f2437p = r4     // Catch:{ Exception -> 0x0337 }
            android.content.Intent r4 = r8.getIntent()     // Catch:{ Exception -> 0x0337 }
            android.content.Intent r5 = r8.getIntent()     // Catch:{ Exception -> 0x0337 }
            java.lang.String r5 = r5.getStringExtra(r2)     // Catch:{ Exception -> 0x0337 }
            java.lang.String r6 = ":"
            if (r5 == 0) goto L_0x01df
            android.content.Intent r1 = r8.getIntent()     // Catch:{ Exception -> 0x0337 }
            java.lang.String r5 = "CUS_ID"
            java.lang.String r1 = r1.getStringExtra(r5)     // Catch:{ Exception -> 0x0337 }
            f2416b = r1     // Catch:{ Exception -> 0x0337 }
            android.content.Intent r1 = r8.getIntent()     // Catch:{ Exception -> 0x0337 }
            java.lang.String r1 = r1.getStringExtra(r2)     // Catch:{ Exception -> 0x0337 }
            f2422h = r1     // Catch:{ Exception -> 0x0337 }
            java.lang.String r1 = "cus_name1="
            java.lang.String r5 = f2422h     // Catch:{ Exception -> 0x0337 }
            android.util.Log.d(r1, r5)     // Catch:{ Exception -> 0x0337 }
            android.content.Intent r1 = r8.getIntent()     // Catch:{ Exception -> 0x0337 }
            java.lang.String r5 = "CUS_BAL"
            java.lang.String r1 = r1.getStringExtra(r5)     // Catch:{ Exception -> 0x0337 }
            f2420f = r1     // Catch:{ Exception -> 0x0337 }
            android.content.Intent r1 = r8.getIntent()     // Catch:{ Exception -> 0x0337 }
            java.lang.String r5 = "CUS_GSM"
            java.lang.String r1 = r1.getStringExtra(r5)     // Catch:{ Exception -> 0x0337 }
            f2421g = r1     // Catch:{ Exception -> 0x0337 }
            android.content.Intent r1 = r8.getIntent()     // Catch:{ Exception -> 0x0337 }
            java.lang.String r5 = "g_id"
            java.lang.String r1 = r1.getStringExtra(r5)     // Catch:{ Exception -> 0x0337 }
            f2417c = r1     // Catch:{ Exception -> 0x0337 }
            android.content.Intent r1 = r8.getIntent()     // Catch:{ Exception -> 0x0337 }
            java.lang.String r5 = "CURR_NAME"
            java.lang.String r1 = r1.getStringExtra(r5)     // Catch:{ Exception -> 0x0337 }
            f2418d = r1     // Catch:{ Exception -> 0x0337 }
            android.content.Intent r1 = r8.getIntent()     // Catch:{ Exception -> 0x0337 }
            java.lang.String r1 = r1.getStringExtra(r0)     // Catch:{ Exception -> 0x0337 }
            if (r1 == 0) goto L_0x00a3
            android.content.Intent r1 = r8.getIntent()     // Catch:{ Exception -> 0x0337 }
            java.lang.String r0 = r1.getStringExtra(r0)     // Catch:{ Exception -> 0x0337 }
            goto L_0x00a5
        L_0x00a3:
            java.lang.String r0 = "0"
        L_0x00a5:
            f2419e = r0     // Catch:{ Exception -> 0x0337 }
            android.os.Bundle r0 = r4.getExtras()     // Catch:{ Exception -> 0x0337 }
            java.lang.String r1 = "dataCus"
            java.io.Serializable r0 = r0.getSerializable(r1)     // Catch:{ Exception -> 0x0337 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x0337 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x0337 }
            int r4 = r0.size()     // Catch:{ Exception -> 0x0337 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x0337 }
            r8.f2439r = r1     // Catch:{ Exception -> 0x0337 }
            java.util.ArrayList<EH> r1 = r8.f2439r     // Catch:{ Exception -> 0x0337 }
            r1.addAll(r0)     // Catch:{ Exception -> 0x0337 }
            r0 = 0
        L_0x00c4:
            java.util.ArrayList<EH> r1 = r8.f2439r     // Catch:{ Exception -> 0x0337 }
            int r1 = r1.size()     // Catch:{ Exception -> 0x0337 }
            if (r0 >= r1) goto L_0x017e
            java.lang.String r1 = "clicked_name="
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0337 }
            r4.<init>()     // Catch:{ Exception -> 0x0337 }
            java.lang.String r5 = f2422h     // Catch:{ Exception -> 0x0337 }
            r4.append(r5)     // Catch:{ Exception -> 0x0337 }
            r4.append(r6)     // Catch:{ Exception -> 0x0337 }
            java.util.ArrayList<EH> r5 = r8.f2439r     // Catch:{ Exception -> 0x0337 }
            java.lang.Object r5 = r5.get(r0)     // Catch:{ Exception -> 0x0337 }
            EH r5 = (p000.C0082EH) r5     // Catch:{ Exception -> 0x0337 }
            java.lang.String r5 = r5.mo192g()     // Catch:{ Exception -> 0x0337 }
            r4.append(r5)     // Catch:{ Exception -> 0x0337 }
            r4.append(r6)     // Catch:{ Exception -> 0x0337 }
            java.util.ArrayList<EH> r5 = r8.f2439r     // Catch:{ Exception -> 0x0337 }
            java.lang.Object r5 = r5.get(r0)     // Catch:{ Exception -> 0x0337 }
            EH r5 = (p000.C0082EH) r5     // Catch:{ Exception -> 0x0337 }
            java.lang.String r5 = r5.mo183b()     // Catch:{ Exception -> 0x0337 }
            r4.append(r5)     // Catch:{ Exception -> 0x0337 }
            java.lang.String r5 = "#"
            r4.append(r5)     // Catch:{ Exception -> 0x0337 }
            java.lang.String r5 = f2417c     // Catch:{ Exception -> 0x0337 }
            r4.append(r5)     // Catch:{ Exception -> 0x0337 }
            r4.append(r6)     // Catch:{ Exception -> 0x0337 }
            java.lang.String r5 = f2418d     // Catch:{ Exception -> 0x0337 }
            r4.append(r5)     // Catch:{ Exception -> 0x0337 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0337 }
            android.util.Log.d(r1, r4)     // Catch:{ Exception -> 0x0337 }
            java.lang.String r1 = f2422h     // Catch:{ Exception -> 0x0337 }
            java.util.ArrayList<EH> r4 = r8.f2439r     // Catch:{ Exception -> 0x0337 }
            java.lang.Object r4 = r4.get(r0)     // Catch:{ Exception -> 0x0337 }
            EH r4 = (p000.C0082EH) r4     // Catch:{ Exception -> 0x0337 }
            java.lang.String r4 = r4.mo192g()     // Catch:{ Exception -> 0x0337 }
            boolean r1 = r1.equals(r4)     // Catch:{ Exception -> 0x0337 }
            if (r1 == 0) goto L_0x017a
            java.lang.String r1 = f2418d     // Catch:{ Exception -> 0x0337 }
            java.util.ArrayList<EH> r4 = r8.f2439r     // Catch:{ Exception -> 0x0337 }
            java.lang.Object r4 = r4.get(r0)     // Catch:{ Exception -> 0x0337 }
            EH r4 = (p000.C0082EH) r4     // Catch:{ Exception -> 0x0337 }
            java.lang.String r4 = r4.mo183b()     // Catch:{ Exception -> 0x0337 }
            boolean r1 = r1.equals(r4)     // Catch:{ Exception -> 0x0337 }
            if (r1 == 0) goto L_0x017a
            java.lang.String r1 = "clicked_name=_"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0337 }
            r4.<init>()     // Catch:{ Exception -> 0x0337 }
            r4.append(r0)     // Catch:{ Exception -> 0x0337 }
            r4.append(r6)     // Catch:{ Exception -> 0x0337 }
            java.lang.String r5 = f2422h     // Catch:{ Exception -> 0x0337 }
            r4.append(r5)     // Catch:{ Exception -> 0x0337 }
            r4.append(r6)     // Catch:{ Exception -> 0x0337 }
            java.util.ArrayList<EH> r5 = r8.f2439r     // Catch:{ Exception -> 0x0337 }
            java.lang.Object r0 = r5.get(r0)     // Catch:{ Exception -> 0x0337 }
            EH r0 = (p000.C0082EH) r0     // Catch:{ Exception -> 0x0337 }
            java.lang.String r0 = r0.mo192g()     // Catch:{ Exception -> 0x0337 }
            r4.append(r0)     // Catch:{ Exception -> 0x0337 }
            r4.append(r6)     // Catch:{ Exception -> 0x0337 }
            java.lang.String r0 = f2417c     // Catch:{ Exception -> 0x0337 }
            r4.append(r0)     // Catch:{ Exception -> 0x0337 }
            r4.append(r6)     // Catch:{ Exception -> 0x0337 }
            java.lang.String r0 = f2418d     // Catch:{ Exception -> 0x0337 }
            r4.append(r0)     // Catch:{ Exception -> 0x0337 }
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x0337 }
            android.util.Log.d(r1, r0)     // Catch:{ Exception -> 0x0337 }
            r0 = 1
            goto L_0x017f
        L_0x017a:
            int r0 = r0 + 1
            goto L_0x00c4
        L_0x017e:
            r0 = 0
        L_0x017f:
            java.lang.String r1 = "clicked_name=#"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0337 }
            r4.<init>()     // Catch:{ Exception -> 0x0337 }
            java.lang.String r5 = f2422h     // Catch:{ Exception -> 0x0337 }
            r4.append(r5)     // Catch:{ Exception -> 0x0337 }
            r4.append(r6)     // Catch:{ Exception -> 0x0337 }
            r4.append(r0)     // Catch:{ Exception -> 0x0337 }
            r4.append(r6)     // Catch:{ Exception -> 0x0337 }
            java.lang.String r5 = f2417c     // Catch:{ Exception -> 0x0337 }
            r4.append(r5)     // Catch:{ Exception -> 0x0337 }
            r4.append(r6)     // Catch:{ Exception -> 0x0337 }
            java.lang.String r5 = f2418d     // Catch:{ Exception -> 0x0337 }
            r4.append(r5)     // Catch:{ Exception -> 0x0337 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0337 }
            android.util.Log.d(r1, r4)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x01ce
            JU r0 = r8.f2437p     // Catch:{ Exception -> 0x0337 }
            java.lang.String r1 = "prefOthers_currency"
            boolean r0 = r0.mo524a(r1, r9)     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x01c1
            JU r0 = r8.f2437p     // Catch:{ Exception -> 0x0337 }
            java.lang.String r1 = f2417c     // Catch:{ Exception -> 0x0337 }
            android.database.Cursor r0 = r0.mo624v(r1)     // Catch:{ Exception -> 0x0337 }
        L_0x01bc:
            java.util.ArrayList r0 = r8.mo3768a(r0)     // Catch:{ Exception -> 0x0337 }
            goto L_0x01cc
        L_0x01c1:
            JU r0 = r8.f2437p     // Catch:{ Exception -> 0x0337 }
            java.lang.String r1 = f2417c     // Catch:{ Exception -> 0x0337 }
            java.lang.String r4 = f2418d     // Catch:{ Exception -> 0x0337 }
            android.database.Cursor r0 = r0.mo594l(r1, r4)     // Catch:{ Exception -> 0x0337 }
            goto L_0x01bc
        L_0x01cc:
            r8.f2439r = r0     // Catch:{ Exception -> 0x0337 }
        L_0x01ce:
            ZT r0 = new ZT     // Catch:{ Exception -> 0x0337 }
            android.support.v4.app.FragmentManager r1 = r8.getSupportFragmentManager()     // Catch:{ Exception -> 0x0337 }
            java.util.ArrayList<EH> r4 = r8.f2439r     // Catch:{ Exception -> 0x0337 }
            r0.<init>(r1, r4, r9, r8)     // Catch:{ Exception -> 0x0337 }
            r8.f2434m = r0     // Catch:{ Exception -> 0x0337 }
            r8.f2430D = r9     // Catch:{ Exception -> 0x0337 }
            goto L_0x0296
        L_0x01df:
            android.content.Intent r0 = r8.getIntent()     // Catch:{ Exception -> 0x0337 }
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x0296
            android.content.Intent r0 = r8.getIntent()     // Catch:{ Exception -> 0x0337 }
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ Exception -> 0x0337 }
            java.lang.String r5 = "1"
            boolean r0 = r0.equals(r5)     // Catch:{ Exception -> 0x0337 }
            java.lang.String r5 = "dataGroups"
            if (r0 == 0) goto L_0x0218
            android.os.Bundle r0 = r4.getExtras()     // Catch:{ Exception -> 0x0337 }
            java.io.Serializable r0 = r0.getSerializable(r5)     // Catch:{ Exception -> 0x0337 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ Exception -> 0x0337 }
            r8.f2440s = r0     // Catch:{ Exception -> 0x0337 }
            ZT r0 = new ZT     // Catch:{ Exception -> 0x0337 }
            android.support.v4.app.FragmentManager r1 = r8.getSupportFragmentManager()     // Catch:{ Exception -> 0x0337 }
            java.util.ArrayList<MM> r4 = r8.f2440s     // Catch:{ Exception -> 0x0337 }
            r0.<init>(r1, r4, r3, r8)     // Catch:{ Exception -> 0x0337 }
            r8.f2434m = r0     // Catch:{ Exception -> 0x0337 }
            r8.f2430D = r3     // Catch:{ Exception -> 0x0337 }
            goto L_0x0296
        L_0x0218:
            android.content.Intent r0 = r8.getIntent()     // Catch:{ Exception -> 0x0337 }
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ Exception -> 0x0337 }
            java.lang.String r7 = "3"
            boolean r0 = r0.equals(r7)     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x0245
            android.os.Bundle r0 = r4.getExtras()     // Catch:{ Exception -> 0x0337 }
            java.io.Serializable r0 = r0.getSerializable(r5)     // Catch:{ Exception -> 0x0337 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ Exception -> 0x0337 }
            r8.f2440s = r0     // Catch:{ Exception -> 0x0337 }
            ZT r0 = new ZT     // Catch:{ Exception -> 0x0337 }
            android.support.v4.app.FragmentManager r1 = r8.getSupportFragmentManager()     // Catch:{ Exception -> 0x0337 }
            java.util.ArrayList<MM> r4 = r8.f2440s     // Catch:{ Exception -> 0x0337 }
            r5 = 3
            r0.<init>(r1, r4, r5, r8)     // Catch:{ Exception -> 0x0337 }
            r8.f2434m = r0     // Catch:{ Exception -> 0x0337 }
        L_0x0242:
            r8.f2430D = r5     // Catch:{ Exception -> 0x0337 }
            goto L_0x0296
        L_0x0245:
            android.content.Intent r0 = r8.getIntent()     // Catch:{ Exception -> 0x0337 }
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ Exception -> 0x0337 }
            java.lang.String r7 = "2"
            boolean r0 = r0.equals(r7)     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x0270
            android.os.Bundle r0 = r4.getExtras()     // Catch:{ Exception -> 0x0337 }
            java.io.Serializable r0 = r0.getSerializable(r5)     // Catch:{ Exception -> 0x0337 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ Exception -> 0x0337 }
            r8.f2440s = r0     // Catch:{ Exception -> 0x0337 }
            ZT r0 = new ZT     // Catch:{ Exception -> 0x0337 }
            android.support.v4.app.FragmentManager r1 = r8.getSupportFragmentManager()     // Catch:{ Exception -> 0x0337 }
            java.util.ArrayList<MM> r4 = r8.f2440s     // Catch:{ Exception -> 0x0337 }
            r5 = 2
            r0.<init>(r1, r4, r5, r8)     // Catch:{ Exception -> 0x0337 }
            r8.f2434m = r0     // Catch:{ Exception -> 0x0337 }
            goto L_0x0242
        L_0x0270:
            android.content.Intent r0 = r8.getIntent()     // Catch:{ Exception -> 0x0337 }
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ Exception -> 0x0337 }
            java.lang.String r1 = "5"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x0296
            r4.getExtras()     // Catch:{ Exception -> 0x0337 }
            java.util.ArrayList<MM> r0 = p000.C0195JU.f455o     // Catch:{ Exception -> 0x0337 }
            r8.f2440s = r0     // Catch:{ Exception -> 0x0337 }
            ZT r0 = new ZT     // Catch:{ Exception -> 0x0337 }
            android.support.v4.app.FragmentManager r1 = r8.getSupportFragmentManager()     // Catch:{ Exception -> 0x0337 }
            java.util.ArrayList<MM> r4 = r8.f2440s     // Catch:{ Exception -> 0x0337 }
            r5 = 5
            r0.<init>(r1, r4, r5, r8)     // Catch:{ Exception -> 0x0337 }
            r8.f2434m = r0     // Catch:{ Exception -> 0x0337 }
            goto L_0x0242
        L_0x0296:
            r0 = 2131296563(0x7f090133, float:1.8211046E38)
            android.view.View r0 = r8.findViewById(r0)     // Catch:{ Exception -> 0x0337 }
            android.support.v4.view.ViewPager r0 = (android.support.v4.view.ViewPager) r0     // Catch:{ Exception -> 0x0337 }
            r8.f2435n = r0     // Catch:{ Exception -> 0x0337 }
            android.support.v4.view.ViewPager r0 = r8.f2435n     // Catch:{ Exception -> 0x0337 }
            ZT r1 = r8.f2434m     // Catch:{ Exception -> 0x0337 }
            r0.setAdapter(r1)     // Catch:{ Exception -> 0x0337 }
            android.support.v4.view.ViewPager r0 = r8.f2435n     // Catch:{ Exception -> 0x0337 }
            android.support.v4.view.ViewPager$OnPageChangeListener r1 = r8.f2431E     // Catch:{ Exception -> 0x0337 }
            r0.addOnPageChangeListener(r1)     // Catch:{ Exception -> 0x0337 }
            android.support.v4.view.ViewPager r0 = r8.f2435n     // Catch:{ Exception -> 0x0337 }
            r0.setOffscreenPageLimit(r3)     // Catch:{ Exception -> 0x0337 }
            android.content.Intent r0 = r8.getIntent()     // Catch:{ Exception -> 0x0337 }
            java.lang.String r0 = r0.getStringExtra(r2)     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x032b
            int r0 = r8.f2430D     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x032b
            java.util.ArrayList<EH> r0 = r8.f2439r     // Catch:{ Exception -> 0x0337 }
            int r0 = r0.size()     // Catch:{ Exception -> 0x0337 }
            r1 = 0
        L_0x02c9:
            if (r1 >= r0) goto L_0x032b
            java.util.ArrayList<EH> r4 = r8.f2439r     // Catch:{ Exception -> 0x0337 }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ Exception -> 0x0337 }
            EH r4 = (p000.C0082EH) r4     // Catch:{ Exception -> 0x0337 }
            java.lang.String r4 = r4.mo192g()     // Catch:{ Exception -> 0x0337 }
            android.content.Intent r5 = r8.getIntent()     // Catch:{ Exception -> 0x0337 }
            java.lang.String r5 = r5.getStringExtra(r2)     // Catch:{ Exception -> 0x0337 }
            boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x0337 }
            if (r4 == 0) goto L_0x0328
            java.lang.String r0 = "cus_name2="
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0337 }
            r4.<init>()     // Catch:{ Exception -> 0x0337 }
            java.util.ArrayList<EH> r5 = r8.f2439r     // Catch:{ Exception -> 0x0337 }
            java.lang.Object r5 = r5.get(r1)     // Catch:{ Exception -> 0x0337 }
            EH r5 = (p000.C0082EH) r5     // Catch:{ Exception -> 0x0337 }
            java.lang.String r5 = r5.mo192g()     // Catch:{ Exception -> 0x0337 }
            r4.append(r5)     // Catch:{ Exception -> 0x0337 }
            r4.append(r6)     // Catch:{ Exception -> 0x0337 }
            java.lang.String r5 = f2422h     // Catch:{ Exception -> 0x0337 }
            r4.append(r5)     // Catch:{ Exception -> 0x0337 }
            r4.append(r6)     // Catch:{ Exception -> 0x0337 }
            android.content.Intent r5 = r8.getIntent()     // Catch:{ Exception -> 0x0337 }
            java.lang.String r5 = r5.getStringExtra(r2)     // Catch:{ Exception -> 0x0337 }
            r4.append(r5)     // Catch:{ Exception -> 0x0337 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0337 }
            android.util.Log.d(r0, r4)     // Catch:{ Exception -> 0x0337 }
            android.content.Intent r0 = r8.getIntent()     // Catch:{ Exception -> 0x0337 }
            java.lang.String r0 = r0.getStringExtra(r2)     // Catch:{ Exception -> 0x0337 }
            f2426l = r0     // Catch:{ Exception -> 0x0337 }
            r8.mo3770a(r1)     // Catch:{ Exception -> 0x0337 }
            f2423i = r3     // Catch:{ Exception -> 0x0337 }
            goto L_0x032b
        L_0x0328:
            int r1 = r1 + 1
            goto L_0x02c9
        L_0x032b:
            int r0 = f2424j     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x033b
            boolean r0 = f2423i     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x033b
            r8.mo3770a(r9)     // Catch:{ Exception -> 0x0337 }
            goto L_0x033b
        L_0x0337:
            r9 = move-exception
            r9.printStackTrace()
        L_0x033b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        FragmentStatePagerSupport.super.onDestroy();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport, android.app.Activity] */
    public void onRestart() {
        FragmentStatePagerSupport.super.onRestart();
        if (!FragmentStatePagerSupport_Main.f2451d) {
        }
    }

    public void onResume() {
        FragmentStatePagerSupport.super.onResume();
    }
}
