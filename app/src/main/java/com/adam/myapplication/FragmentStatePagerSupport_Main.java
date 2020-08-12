package com.adam.myapplication;


import android.annotation.TargetApi;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.backup.BackupManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.Loader;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.adam.myapplication.online.DeviceBootReceiver;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.NodeList;

public class FragmentStatePagerSupport_Main extends AppCompatActivity implements C0601a, C0432a, LoaderCallbacks<ArrayList<C0260MM>>, C0926a {

    /* renamed from: a */
    public static int f2448a;

    /* renamed from: b */
    public static int f2449b;

    /* renamed from: c */
    public static final String[] f2450c = {"android.permission.READ_PHONE_STATE", "android.permission.READ_CONTACTS", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.GET_ACCOUNTS"};

    /* renamed from: d */
    public static boolean f2451d = false;

    /* renamed from: e */
    public static String f2452e = "0";

    /* renamed from: f */
    public static boolean f2453f = false;

    /* renamed from: A */
    public CharSequence f2454A;

    /* renamed from: B */
    public CharSequence f2455B;

    /* renamed from: C */
    public DrawerLayout f2456C;

    /* renamed from: D */
    public ListView f2457D;

    /* renamed from: E */
    public ActionBarDrawerToggle f2458E;

    /* renamed from: F */
    public List<C0796gO> f2459F;

    /* renamed from: G */
    public C0063DH f2460G;

    /* renamed from: H */
    public int f2461H = 0;

    /* renamed from: I */
    public OnPageChangeListener f2462I = new C0855jM(this);

    /* renamed from: J */
    public Bundle f2463J;

    /* renamed from: K */
    public Bundle f2464K;

    /* renamed from: L */
    public int f2465L = 0;

    /* renamed from: g */
    public C0554ZT f2466g;

    /* renamed from: h */
    public ViewPager f2467h;

    /* renamed from: i */
    public SQLiteDatabase f2468i;

    /* renamed from: j */
    public C0195JU f2469j;

    /* renamed from: k */
    public List<C0232LL> f2470k = new ArrayList();

    /* renamed from: l */
    public List<C0082EH> f2471l = new ArrayList();

    /* renamed from: m */
    public ArrayList<C0260MM> f2472m = new ArrayList<>();

    /* renamed from: n */
    public ArrayList<C0260MM> f2473n = new ArrayList<>();

    /* renamed from: o */
    public int[] f2474o = {2131230923, 1, 2131230855};

    /* renamed from: p */
    public AutoCompleteTextView f2475p = null;

    /* renamed from: q */
    public EditText f2476q = null;

    /* renamed from: r */
    public EditText f2477r = null;

    /* renamed from: s */
    public TextView f2478s = null;

    /* renamed from: t */
    public TextView f2479t = null;

    /* renamed from: u */
    public Button f2480u = null;

    /* renamed from: v */
    public LinearLayout f2481v = null;

    /* renamed from: w */
    public ImageButton f2482w = null;

    /* renamed from: x */
    public Toolbar f2483x = null;

    /* renamed from: y */
    public String[] f2484y;

    /* renamed from: z */
    public TypedArray f2485z;

    /* renamed from: com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main$a */
    class C0697a implements OnItemClickListener {
        public C0697a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            FragmentStatePagerSupport_Main.this.mo3780b(i);
        }
    }

    /* renamed from: com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main$b */
    private class C0698b extends AsyncTask<Void, Void, Integer> {

        /* renamed from: a */
        public int f2487a = 0;

        public C0698b(int i) {
            this.f2487a = i;
        }

        /* JADX WARNING: type inference failed for: r1v9, types: [com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main, android.content.Context] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v9, types: [com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main, android.content.Context]
          assigns: [com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main]
          uses: [android.content.Context]
          mth insns count: 66
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Integer doInBackground(java.lang.Void... r5) {
            /*
                r4 = this;
                java.lang.String r5 = "0"
                java.lang.String r0 = "bk_drive_flag"
                int r1 = r4.f2487a     // Catch:{ Exception -> 0x00a3 }
                r2 = 1
                if (r1 != 0) goto L_0x0010
                com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main r5 = com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.this     // Catch:{ Exception -> 0x00a3 }
                r5.mo3811q()     // Catch:{ Exception -> 0x00a3 }
                goto L_0x009e
            L_0x0010:
                int r1 = r4.f2487a     // Catch:{ Exception -> 0x00a3 }
                if (r1 != r2) goto L_0x0029
                boolean r5 = p000.C0195JU.f451k     // Catch:{ Exception -> 0x00a3 }
                if (r5 != r2) goto L_0x009e
                com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main r5 = com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.this     // Catch:{ Exception -> 0x00a3 }
                com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main r0 = com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.this     // Catch:{ Exception -> 0x00a3 }
                JU r0 = r0.f2469j     // Catch:{ Exception -> 0x00a3 }
                android.database.Cursor r0 = r0.mo618t()     // Catch:{ Exception -> 0x00a3 }
                r5.mo3777a(r0)     // Catch:{ Exception -> 0x00a3 }
                goto L_0x009e
            L_0x0029:
                int r1 = r4.f2487a     // Catch:{ Exception -> 0x00a3 }
                r3 = 2
                if (r1 != r3) goto L_0x0034
                com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main r5 = com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.this     // Catch:{ Exception -> 0x00a3 }
                r5.mo3786i()     // Catch:{ Exception -> 0x00a3 }
                goto L_0x009e
            L_0x0034:
                int r1 = r4.f2487a     // Catch:{ Exception -> 0x00a3 }
                r3 = 3
                if (r1 != r3) goto L_0x0081
                com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main r1 = com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.this     // Catch:{ Exception -> 0x00a3 }
                JU r1 = r1.f2469j     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r1 = r1.mo609q(r0, r5)     // Catch:{ Exception -> 0x00a3 }
                com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.f2452e = r1     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r1 = com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.f2452e     // Catch:{ Exception -> 0x00a3 }
                boolean r5 = r1.equals(r5)     // Catch:{ Exception -> 0x00a3 }
                if (r5 != 0) goto L_0x0057
                java.lang.String r5 = com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.f2452e     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r1 = "2"
                boolean r5 = r5.equals(r1)     // Catch:{ Exception -> 0x00a3 }
                if (r5 == 0) goto L_0x009e
            L_0x0057:
                com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main r5 = com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.this     // Catch:{ Exception -> 0x00a3 }
                JU r5 = r5.f2469j     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r1 = "prefAutoBackup"
                boolean r5 = r5.mo524a(r1, r2)     // Catch:{ Exception -> 0x00a3 }
                if (r5 != r2) goto L_0x009e
                UU r5 = new UU     // Catch:{ Exception -> 0x00a3 }
                com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main r1 = com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.this     // Catch:{ Exception -> 0x00a3 }
                com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main r3 = com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.this     // Catch:{ Exception -> 0x00a3 }
                JU r3 = r3.f2469j     // Catch:{ Exception -> 0x00a3 }
                r5.<init>(r1, r3)     // Catch:{ Exception -> 0x00a3 }
                r5.mo1297b()     // Catch:{ Exception -> 0x00a3 }
                com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main r5 = com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.this     // Catch:{ Exception -> 0x00a3 }
                JU r5 = r5.f2469j     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r1 = com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.f2452e     // Catch:{ Exception -> 0x00a3 }
                r5.mo631x(r0, r1)     // Catch:{ Exception -> 0x00a3 }
                goto L_0x009e
            L_0x0081:
                int r5 = r4.f2487a     // Catch:{ Exception -> 0x00a3 }
                r0 = 4
                if (r5 != r0) goto L_0x0090
                com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main r5 = com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.this     // Catch:{ Exception -> 0x00a3 }
                JU r5 = r5.f2469j     // Catch:{ Exception -> 0x00a3 }
                r5.mo592k()     // Catch:{ Exception -> 0x00a3 }
                goto L_0x009e
            L_0x0090:
                int r5 = r4.f2487a     // Catch:{ Exception -> 0x00a3 }
                r0 = 5
                if (r5 != r0) goto L_0x009e
                com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main r5 = com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.this     // Catch:{ Exception -> 0x00a3 }
                JU r5 = r5.f2469j     // Catch:{ Exception -> 0x00a3 }
                r5.mo479S()     // Catch:{ Exception -> 0x00a3 }
            L_0x009e:
                java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x00a3 }
                return r5
            L_0x00a3:
                r5 = 0
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.C0698b.doInBackground(java.lang.Void[]):java.lang.Integer");
        }

        /* renamed from: a */
        public void onPostExecute(Integer num) {
            StringBuilder sb = new StringBuilder();
            sb.append(FragmentStatePagerSupport_Main.m2279h());
            sb.append(":");
            sb.append(this.f2487a);
            Log.d("trace_S_POST=", sb.toString());
            int i = this.f2487a;
        }

        public void onPreExecute() {
            StringBuilder sb = new StringBuilder();
            sb.append(FragmentStatePagerSupport_Main.m2279h());
            sb.append(":");
            sb.append(this.f2487a);
            Log.d("trace_S_PRE=", sb.toString());
        }
    }

    @TargetApi(11)
    /* renamed from: a */
    public static <T> void m2275a(AsyncTask<T, ?, ?> asyncTask, T... tArr) {
        if (VERSION.SDK_INT >= 11) {
            asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, tArr);
        } else {
            asyncTask.execute(tArr);
        }
    }

    /* renamed from: h */
    public static String m2279h() {
        return new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main, android.content.Context, android.app.Activity] */
    /* renamed from: a */
    public void mo3775a() {
        String str = "android.permission.READ_CONTACTS";
        if (!(ContextCompat.checkSelfPermission(this, str) == 0)) {
            ActivityCompat.requestPermissions(this, new String[]{str}, C0776fN.AppCompatTheme_windowActionModeOverlay);
        }
    }

    /* renamed from: a */
    public void mo3776a(int i) {
        f2449b = i;
        Log.d("trace_S_open_page=", m2279h());
        this.f2467h.setCurrentItem(f2449b);
        new Handler().post(new C0835iM(this));
    }

    /* renamed from: a */
    public void mo3777a(Cursor cursor) {
        cursor.getCount();
        this.f2473n.clear();
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            this.f2473n.add(new C0260MM(cursor.getString(cursor.getColumnIndex("_id")), cursor.getString(cursor.getColumnIndex("g_name")), cursor.getString(cursor.getColumnIndex("curr_name"))));
            cursor.moveToNext();
        }
        cursor.close();
        this.f2464K = new Bundle();
        this.f2464K.putSerializable("dataCurrs", this.f2473n);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main, android.content.Context, android.support.v4.app.FragmentActivity, android.support.v7.app.AppCompatActivity] */
    /* renamed from: a */
    public void onLoadFinished(Loader<ArrayList<C0260MM>> loader, ArrayList<C0260MM> arrayList) {
        Log.d("trace_E_Loader_groups=", m2279h());
        this.f2472m = arrayList;
        this.f2463J = new Bundle();
        this.f2463J.putSerializable("dataGroups", this.f2472m);
        try {
            this.f2466g = new C0554ZT(getSupportFragmentManager(), this.f2472m, 4, (Context) this);
            this.f2461H = 4;
            this.f2467h = findViewById(2131296563);
            this.f2467h.setAdapter(this.f2466g);
            this.f2467h.addOnPageChangeListener(this.f2462I);
            this.f2467h.setOffscreenPageLimit(1);
            if (f2449b == 0 && this.f2472m.size() > 0) {
                mo3776a(0);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main, android.content.Context] */
    /* renamed from: a */
    public void mo1838a(String str, String str2) {
        if (str != null && str2 != null) {
            this.f2469j.mo631x("upgrade_db", "0");
            this.f2469j.mo550c();
            if (C0268MU.m850b(this, "market.db", str, str2, "com.valdio.valdioveliu.recyclerview") == 0) {
                new Handler().postDelayed(new C1070tM(this), 5000);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main, android.content.Context, android.app.Activity] */
    /* renamed from: b */
    public void mo3779b() {
        String str = "android.permission.WRITE_EXTERNAL_STORAGE";
        if (!(ContextCompat.checkSelfPermission(this, str) == 0)) {
            ActivityCompat.requestPermissions(this, new String[]{str}, C0776fN.AppCompatTheme_windowActionBarOverlay);
        }
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main, android.content.Context, android.support.v4.app.FragmentActivity, android.app.Activity] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0239, code lost:
        r12.show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0269, code lost:
        r12.putExtra(r7, r0);
        r12.putExtras(r11.f2463J);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x028b, code lost:
        startActivity(r12);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3780b(int r12) {
        /*
            r11 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "0"
            java.lang.String r2 = "com.valdio.valdioveliu.recyclerview"
            java.lang.String r3 = "market.db"
            java.lang.String r4 = "yyyyMMddkkmmss"
            java.lang.String r5 = "-market.db"
            r6 = 1
            java.lang.String r7 = "screen_no"
            switch(r12) {
                case -1: goto L_0x028e;
                case 0: goto L_0x0284;
                case 1: goto L_0x0272;
                case 2: goto L_0x0260;
                case 3: goto L_0x0256;
                case 4: goto L_0x023d;
                case 5: goto L_0x01a7;
                case 6: goto L_0x014c;
                case 7: goto L_0x00bd;
                case 8: goto L_0x00ae;
                case 9: goto L_0x003b;
                case 10: goto L_0x0036;
                case 11: goto L_0x0028;
                case 12: goto L_0x0014;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0295
        L_0x0014:
            int r12 = android.os.Process.myPid()
            android.os.Process.killProcess(r12)
            r12 = 0
            java.lang.System.exit(r12)
            android.app.Activity r12 = r11.getParent()
            r12.finish()
            goto L_0x028e
        L_0x0028:
            JU r12 = r11.f2469j
            r0 = 2131755378(0x7f100172, float:1.9141634E38)
            java.lang.String r0 = r11.getString(r0)
            r12.mo486V(r0)
            goto L_0x028e
        L_0x0036:
            r11.mo3810p()
            goto L_0x028e
        L_0x003b:
            android.app.AlertDialog$Builder r12 = new android.app.AlertDialog$Builder
            r12.<init>(r11)
            java.lang.String r0 = "layout_inflater"
            java.lang.Object r0 = r11.getSystemService(r0)
            android.view.LayoutInflater r0 = (android.view.LayoutInflater) r0
            r1 = 2131492908(0x7f0c002c, float:1.8609281E38)
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            r1 = 2131296653(0x7f09018d, float:1.8211229E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.text.method.MovementMethod r2 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r2)
            r2 = 2131755139(0x7f100083, float:1.9141149E38)
            r1.setText(r2)
            android.text.method.MovementMethod r2 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r2)
            r12.setView(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 2131755138(0x7f100082, float:1.9141147E38)
            java.lang.String r1 = r11.getString(r1)
            r0.append(r1)
            java.lang.String r1 = "(Ver."
            r0.append(r1)
            JU r1 = r11.f2469j
            java.lang.String r1 = r1.mo566e(r11)
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12.setTitle(r0)
            r0 = 2131755424(0x7f1001a0, float:1.9141727E38)
            java.lang.String r0 = r11.getString(r0)
            sM r1 = new sM
            r1.<init>(r11)
            r12.setPositiveButton(r0, r1)
            android.app.AlertDialog r12 = r12.create()
            goto L_0x0239
        L_0x00ae:
            r11.mo3779b()
            android.content.Intent r12 = new android.content.Intent
            java.lang.Class<com.valdio.valdioveliu.recyclerview.SettingsActivity> r0 = com.valdio.valdioveliu.recyclerview.SettingsActivity.class
            r12.<init>(r11, r0)
            r11.startActivityForResult(r12, r6)
            goto L_0x028e
        L_0x00bd:
            r11.mo3775a()
            r11.mo3779b()
            java.util.Calendar r12 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x028e }
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x028e }
            java.lang.String r3 = "dd-MM-yyyy"
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x028e }
            r2.<init>(r3, r4)     // Catch:{ Exception -> 0x028e }
            java.util.Date r12 = r12.getTime()     // Catch:{ Exception -> 0x028e }
            java.lang.String r12 = r2.format(r12)     // Catch:{ Exception -> 0x028e }
            JU r2 = r11.f2469j     // Catch:{ Exception -> 0x028e }
            java.lang.String r3 = "auto_drive_date_save"
            java.lang.String r2 = r2.mo609q(r3, r0)     // Catch:{ Exception -> 0x028e }
            boolean r12 = r2.equals(r12)     // Catch:{ Exception -> 0x028e }
            if (r12 == 0) goto L_0x0111
            JU r12 = r11.f2469j     // Catch:{ Exception -> 0x028e }
            java.lang.String r2 = "db_data_changed"
            java.lang.String r12 = r12.mo609q(r2, r1)     // Catch:{ Exception -> 0x028e }
            boolean r12 = r12.equals(r1)     // Catch:{ Exception -> 0x028e }
            if (r12 == 0) goto L_0x0111
            android.content.Intent r12 = new android.content.Intent     // Catch:{ Exception -> 0x028e }
            java.lang.Class<com.valdio.valdioveliu.recyclerview.Google_drive_list> r2 = com.valdio.valdioveliu.recyclerview.Google_drive_list.class
            r12.<init>(r11, r2)     // Catch:{ Exception -> 0x028e }
            java.lang.String r2 = "bk_flag"
            r12.putExtra(r2, r1)     // Catch:{ Exception -> 0x028e }
            java.lang.String r1 = "auto_filename"
            r12.putExtra(r1, r0)     // Catch:{ Exception -> 0x028e }
            r11.startActivityForResult(r12, r6)     // Catch:{ Exception -> 0x028e }
            android.support.v4.widget.DrawerLayout r12 = r11.f2456C     // Catch:{ Exception -> 0x028e }
            android.widget.ListView r0 = r11.f2457D     // Catch:{ Exception -> 0x028e }
            r12.closeDrawer(r0)     // Catch:{ Exception -> 0x028e }
            goto L_0x0295
        L_0x0111:
            android.app.AlertDialog$Builder r12 = new android.app.AlertDialog$Builder     // Catch:{ Exception -> 0x028e }
            r12.<init>(r11)     // Catch:{ Exception -> 0x028e }
            r0 = 2131755169(0x7f1000a1, float:1.914121E38)
            java.lang.String r0 = r11.getString(r0)     // Catch:{ Exception -> 0x028e }
            r12.setMessage(r0)     // Catch:{ Exception -> 0x028e }
            android.app.AlertDialog$Builder r0 = r12.setCancelable(r6)     // Catch:{ Exception -> 0x028e }
            r1 = 2131755137(0x7f100081, float:1.9141145E38)
            java.lang.String r1 = r11.getString(r1)     // Catch:{ Exception -> 0x028e }
            rM r2 = new rM     // Catch:{ Exception -> 0x028e }
            r2.<init>(r11)     // Catch:{ Exception -> 0x028e }
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)     // Catch:{ Exception -> 0x028e }
            r1 = 2131755136(0x7f100080, float:1.9141143E38)
            java.lang.String r1 = r11.getString(r1)     // Catch:{ Exception -> 0x028e }
            qM r2 = new qM     // Catch:{ Exception -> 0x028e }
            r2.<init>(r11)     // Catch:{ Exception -> 0x028e }
            r0.setNegativeButton(r1, r2)     // Catch:{ Exception -> 0x028e }
            android.app.AlertDialog r12 = r12.create()     // Catch:{ Exception -> 0x028e }
            r12.show()     // Catch:{ Exception -> 0x028e }
            goto L_0x028e
        L_0x014c:
            r11.mo3779b()
            android.text.format.DateFormat r12 = new android.text.format.DateFormat
            r12.<init>()
            java.util.Date r12 = new java.util.Date
            r12.<init>()
            java.lang.CharSequence r12 = android.text.format.DateFormat.format(r4, r12)
            java.lang.String r12 = r12.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r5)
            java.lang.String r12 = r0.toString()
            p000.C0268MU.m848a(r11, r3, r12, r2)
            aM$c r4 = p000.C0600aM.C0603c.FileSelector
            r5 = 2131755359(0x7f10015f, float:1.9141595E38)
            r6 = 2131755358(0x7f10015e, float:1.9141593E38)
            r7 = 2131755360(0x7f100160, float:1.9141597E38)
            r8 = 17301585(0x1080051, float:2.4979482E-38)
            r9 = 17301565(0x108003d, float:2.4979426E-38)
            r10 = 17301582(0x108004e, float:2.4979474E-38)
            aM r12 = p000.C0600aM.m1755a(r4, r5, r6, r7, r8, r9, r10)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = ".db"
            r0.add(r1)
            java.io.FilenameFilter r0 = p000.C0600aM.m1756a(r0)
            r12.mo1832a(r0)
            android.app.FragmentManager r0 = r11.getFragmentManager()
            java.lang.String r1 = "Test"
            r12.show(r0, r1)
            goto L_0x028e
        L_0x01a7:
            r11.mo3779b()
            android.text.format.DateFormat r12 = new android.text.format.DateFormat
            r12.<init>()
            java.util.Date r12 = new java.util.Date
            r12.<init>()
            java.lang.CharSequence r12 = android.text.format.DateFormat.format(r4, r12)
            java.lang.String r12 = r12.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            p000.C0268MU.m848a(r11, r3, r0, r2)
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r11)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.setTitle(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 2131755096(0x7f100058, float:1.9141062E38)
            java.lang.String r2 = r11.getString(r2)
            r1.append(r2)
            java.lang.String r2 = "\n\n"
            r1.append(r2)
            java.lang.String r3 = p000.C0195JU.f441a
            r1.append(r3)
            r1.append(r2)
            r2 = 2131755097(0x7f100059, float:1.9141064E38)
            java.lang.String r2 = r11.getString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setMessage(r1)
            android.app.AlertDialog$Builder r1 = r0.setCancelable(r6)
            r2 = 2131755377(0x7f100171, float:1.9141632E38)
            java.lang.String r2 = r11.getString(r2)
            pM r3 = new pM
            r3.<init>(r11, r12)
            android.app.AlertDialog$Builder r12 = r1.setPositiveButton(r2, r3)
            r1 = 2131755108(0x7f100064, float:1.9141086E38)
            java.lang.String r1 = r11.getString(r1)
            oM r2 = new oM
            r2.<init>(r11)
            r12.setNegativeButton(r1, r2)
            android.app.AlertDialog r12 = r0.create()
        L_0x0239:
            r12.show()
            goto L_0x028e
        L_0x023d:
            boolean r12 = p000.C0195JU.f451k
            if (r12 != 0) goto L_0x0249
            android.content.Intent r12 = new android.content.Intent
            java.lang.Class<com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp> r0 = com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp.class
            r12.<init>(r11, r0)
            goto L_0x028b
        L_0x0249:
            android.content.Intent r12 = new android.content.Intent
            java.lang.Class<com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport> r0 = com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport.class
            r12.<init>(r11, r0)
            java.lang.String r0 = "5"
            r12.putExtra(r7, r0)
            goto L_0x028b
        L_0x0256:
            android.content.Intent r12 = new android.content.Intent
            java.lang.Class<com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport> r0 = com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport.class
            r12.<init>(r11, r0)
            java.lang.String r0 = "3"
            goto L_0x0269
        L_0x0260:
            android.content.Intent r12 = new android.content.Intent
            java.lang.Class<com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport> r0 = com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport.class
            r12.<init>(r11, r0)
            java.lang.String r0 = "2"
        L_0x0269:
            r12.putExtra(r7, r0)
            android.os.Bundle r0 = r11.f2463J
            r12.putExtras(r0)
            goto L_0x028b
        L_0x0272:
            java.util.ArrayList<MM> r12 = r11.f2472m
            int r12 = r12.size()
            if (r12 == 0) goto L_0x0295
            android.content.Intent r12 = new android.content.Intent
            java.lang.Class<com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport> r0 = com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport.class
            r12.<init>(r11, r0)
            java.lang.String r0 = "1"
            goto L_0x0269
        L_0x0284:
            android.content.Intent r12 = new android.content.Intent
            java.lang.Class<com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit> r0 = com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit.class
            r12.<init>(r11, r0)
        L_0x028b:
            r11.startActivity(r12)
        L_0x028e:
            android.support.v4.widget.DrawerLayout r12 = r11.f2456C
            android.widget.ListView r0 = r11.f2457D
            r12.closeDrawer(r0)
        L_0x0295:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.mo3780b(int):void");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main, android.content.Context] */
    /* renamed from: b */
    public boolean mo1839b(String str, String str2) {
        if (str2 != null) {
            return new File(str, str2).exists();
        }
        Toast.makeText(this, 2131755084, 1).show();
        return false;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0012 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3781c() {
        /*
            r3 = this;
            r3.mo3785g()     // Catch:{ Exception -> 0x0027 }
            r3.mo3812r()     // Catch:{ Exception -> 0x0027 }
            r3.mo3813s()     // Catch:{ Exception -> 0x0027 }
            r3.mo3790m()     // Catch:{ Exception -> 0x0027 }
            r3.mo3792o()     // Catch:{ Exception -> 0x0027 }
            r3.mo3789l()     // Catch:{ Exception -> 0x0012 }
        L_0x0012:
            r3.mo3787j()     // Catch:{ Exception -> 0x0022 }
            com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main$b r0 = new com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main$b     // Catch:{ Exception -> 0x0022 }
            r1 = 2
            r0.<init>(r1)     // Catch:{ Exception -> 0x0022 }
            r1 = 0
            java.lang.Void[] r1 = new java.lang.Void[r1]     // Catch:{ Exception -> 0x0022 }
            m2275a(r0, (T[]) r1)     // Catch:{ Exception -> 0x0022 }
            goto L_0x0045
        L_0x0022:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ Exception -> 0x0027 }
            goto L_0x0045
        L_0x0027:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r2 = ""
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "bk_jobs_error"
            android.util.Log.d(r2, r1)
            r0.printStackTrace()
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.mo3781c():void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main, android.content.Context] */
    /* renamed from: c */
    public void mo1270c(String str, String str2) {
        if (str != null && str2 != null) {
            mo3779b();
            new DateFormat();
            DateFormat.format("yyyyMMddkkmmss", new Date()).toString();
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(".db");
            C0268MU.m849a(this, str, "market.db", sb.toString(), "com.valdio.valdioveliu.recyclerview");
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main, android.content.Context, android.app.Activity] */
    /* renamed from: d */
    public void mo3782d() {
        String[] strArr;
        ArrayList arrayList = new ArrayList();
        for (String str : f2450c) {
            if (ContextCompat.checkSelfPermission(this, str) != 0) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            ActivityCompat.requestPermissions(this, (String[]) arrayList.toArray(new String[arrayList.size()]), 1);
            return;
        }
        int[] iArr = new int[f2450c.length];
        Arrays.fill(iArr, 0);
        onRequestPermissionsResult(1, f2450c, iArr);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main, android.content.Context] */
    /* renamed from: d */
    public boolean mo1271d(String str, String str2) {
        boolean z = true;
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            Toast.makeText(this, 2131755088, 1).show();
            z = false;
        }
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
    public final void mo3783e() {
        int i = Calendar.getInstance().get(14);
        f2448a = i;
        try {
            getSupportLoaderManager().destroyLoader(f2448a);
        } catch (Exception unused) {
        }
        getSupportLoaderManager().initLoader(i, null, this).forceLoad();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main, android.content.Context, android.app.Activity] */
    /* renamed from: f */
    public void mo3784f() {
        Builder builder = new Builder(this);
        builder.setMessage(getString(2131755169));
        builder.setCancelable(true).setPositiveButton(getString(2131755137), new C0814hM(this)).setNegativeButton(getString(2131755136), new C0794gM(this)).setNeutralButton(getString(2131755135), new C0006AM(this));
        builder.create().show();
    }

    /* renamed from: g */
    public void mo3785g() {
        String str = "first_run";
        String str2 = "1";
        if (!this.f2469j.mo609q(str, "0").equals(str2)) {
            this.f2469j.mo631x(str, str2);
            mo3810p();
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main, android.content.Context] */
    /* renamed from: i */
    public void mo3786i() {
        if (ContextCompat.checkSelfPermission(this, "android.permission.READ_PHONE_STATE") != 0) {
            C0195JU.f445e = "PERMISSION_DEN";
            mo3788k();
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main, android.content.Context, android.app.Activity] */
    /* renamed from: j */
    public void mo3787j() {
        try {
            C0195JU.f448h = this.f2469j.mo524a("prefLogin", false);
            C0195JU.f450j = this.f2469j.mo609q("prefPassword", "");
            if (C0195JU.f448h && C0195JU.f449i.equals("0")) {
                startActivity(new Intent(this, LoginActivity.class));
                finish();
            }
        } catch (Exception e) {
            Log.d("Login_error=", e.getMessage());
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main, android.app.Activity] */
    /* renamed from: k */
    public final void mo3788k() {
        String str = "android.permission.READ_PHONE_STATE";
        if (ActivityCompat.shouldShowRequestPermissionRationale(this, str)) {
            ActivityCompat.requestPermissions(this, new String[]{str}, 0);
            return;
        }
        ActivityCompat.requestPermissions(this, new String[]{str}, 0);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main, android.content.Context] */
    /* renamed from: l */
    public void mo3789l() {
        String str = "backup_date";
        try {
            String format = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).format(Calendar.getInstance().getTime());
            if (!this.f2469j.mo609q(str, "").equals(format)) {
                new BackupManager(this).dataChanged();
                this.f2469j.mo631x(str, format);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main, android.content.Context, android.app.Activity] */
    /* renamed from: m */
    public final void mo3790m() {
        this.f2469j.mo573f((Context) this);
        String str = "alarm_device_boot";
        String str2 = "1";
        if (!this.f2469j.mo609q(str, "0").equals(str2)) {
            getPackageManager().setComponentEnabledSetting(new ComponentName(this, DeviceBootReceiver.class), 1, 1);
            this.f2469j.mo631x(str, str2);
        }
    }

    /* renamed from: n */
    public final void mo3791n() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main, android.content.Context, android.app.Activity] */
    /* renamed from: o */
    public void mo3792o() {
        String str = "bk_filename";
        try {
            if (getIntent().getStringExtra(str) != null) {
                String stringExtra = getIntent().getStringExtra(str);
                mo3779b();
                this.f2469j.mo525aa();
                Builder builder = new Builder(this);
                builder.setTitle(stringExtra);
                StringBuilder sb = new StringBuilder();
                sb.append(getString(2131755096));
                sb.append("\n");
                sb.append(C0195JU.f441a);
                builder.setMessage(sb.toString());
                builder.setCancelable(true).setPositiveButton(getString(2131755377), new C1157xM(this, stringExtra)).setNegativeButton(getString(2131755108), new C1131wM(this));
                builder.create().show();
            }
        } catch (Exception unused) {
        }
    }

    public void onBackPressed() {
        Log.d("Oncreate:", "onBackPressed");
        FragmentStatePagerSupport_Main.super.onBackPressed();
        if (!this.f2456C.isDrawerOpen(this.f2457D)) {
            Process.killProcess(Process.myPid());
        } else {
            this.f2456C.closeDrawer(this.f2457D);
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main, android.content.Context] */
    public void onButtonClicked(MenuItem menuItem) {
        String str;
        String str2 = "";
        try {
            if (this.f2461H != 4) {
                return;
            }
            if (menuItem.getItemId() == 2131296526) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.f2472m.size(); i++) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(((C0260MM) this.f2472m.get(i)).mo890c());
                    if (C0195JU.f451k) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("(");
                        sb2.append(((C0260MM) this.f2472m.get(i)).mo888a());
                        sb2.append(")");
                        str = sb2.toString();
                    } else {
                        str = str2;
                    }
                    sb.append(str);
                    arrayList.add(sb.toString());
                }
                ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367049, arrayList);
                Dialog dialog = new Dialog(this);
                LinearLayout linearLayout = new LinearLayout(this);
                ListView listView = new ListView(this);
                listView.setAdapter(arrayAdapter);
                listView.setOnItemClickListener(new C0875kM(this, dialog));
                linearLayout.setFocusable(true);
                linearLayout.addView(listView, -1, -1);
                dialog.setContentView(linearLayout);
                dialog.setTitle(menuItem.getTitle().toString());
                dialog.show();
            }
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(e.getMessage());
            sb3.append(str2);
            Log.d("click_error=", sb3.toString());
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        FragmentStatePagerSupport_Main.super.onConfigurationChanged(configuration);
        this.f2458E.onConfigurationChanged(configuration);
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main, android.content.Context, android.support.v4.app.FragmentActivity, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|4|(1:6)|7|8|9|10|11|12|13|14|(1:18)|22|(2:25|23)|38|26|(1:28)|29|30|31|32|(2:34|42)(1:41)) */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x006a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x006d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x016c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00f5 A[Catch:{ Exception -> 0x0186 }, LOOP:0: B:23:0x00ef->B:25:0x00f5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x015a A[Catch:{ Exception -> 0x0186 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x017a A[Catch:{ Exception -> 0x01a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.super.onCreate(r13)     // Catch:{ Exception -> 0x0186 }
            r0 = 2131492902(0x7f0c0026, float:1.860927E38)
            r12.setContentView(r0)     // Catch:{ Exception -> 0x0186 }
            java.lang.String r0 = "trace_start_action_bar="
            java.lang.String r1 = m2279h()     // Catch:{ Exception -> 0x0186 }
            android.util.Log.d(r0, r1)     // Catch:{ Exception -> 0x0186 }
            r12.mo3791n()     // Catch:{ Exception -> 0x0186 }
            r0 = 0
            f2451d = r0     // Catch:{ Exception -> 0x0186 }
            r1 = 1
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r12)     // Catch:{ Exception -> 0x002d }
            java.lang.Class<android.view.ViewConfiguration> r3 = android.view.ViewConfiguration.class
            java.lang.String r4 = "sHasPermanentMenuKey"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch:{ Exception -> 0x002d }
            if (r3 == 0) goto L_0x002d
            r3.setAccessible(r1)     // Catch:{ Exception -> 0x002d }
            r3.setBoolean(r2, r0)     // Catch:{ Exception -> 0x002d }
        L_0x002d:
            JU r2 = new JU     // Catch:{ Exception -> 0x0186 }
            android.database.sqlite.SQLiteDatabase r3 = r12.f2468i     // Catch:{ Exception -> 0x0186 }
            r2.<init>(r3, r12)     // Catch:{ Exception -> 0x0186 }
            r12.f2469j = r2     // Catch:{ Exception -> 0x0186 }
            java.lang.String r2 = "Oncreate:"
            java.lang.String r3 = "Main_Create"
            android.util.Log.d(r2, r3)     // Catch:{ Exception -> 0x0186 }
            java.lang.String r2 = "trace_start_oncreate="
            java.lang.String r3 = m2279h()     // Catch:{ Exception -> 0x0186 }
            android.util.Log.d(r2, r3)     // Catch:{ Exception -> 0x0186 }
            r2 = 2131296669(0x7f09019d, float:1.8211261E38)
            android.view.View r2 = r12.findViewById(r2)     // Catch:{ Exception -> 0x0186 }
            android.support.v7.widget.Toolbar r2 = (android.support.v7.widget.Toolbar) r2     // Catch:{ Exception -> 0x0186 }
            r12.f2483x = r2     // Catch:{ Exception -> 0x0186 }
            android.support.v7.widget.Toolbar r2 = r12.f2483x     // Catch:{ Exception -> 0x0186 }
            r12.setSupportActionBar(r2)     // Catch:{ Exception -> 0x0186 }
            JU r2 = r12.f2469j     // Catch:{ Exception -> 0x0186 }
            java.lang.String r3 = "prefOthers_currency"
            boolean r2 = r2.mo524a(r3, r0)     // Catch:{ Exception -> 0x0186 }
            p000.C0195JU.f451k = r2     // Catch:{ Exception -> 0x0186 }
            JU r2 = r12.f2469j     // Catch:{ Exception -> 0x006a }
            r2.mo544ba()     // Catch:{ Exception -> 0x006a }
            JU r2 = r12.f2469j     // Catch:{ Exception -> 0x006a }
            r2.mo568e()     // Catch:{ Exception -> 0x006a }
        L_0x006a:
            r12.mo3783e()     // Catch:{ Exception -> 0x006d }
        L_0x006d:
            ZT r2 = new ZT     // Catch:{ Exception -> 0x00ab }
            android.support.v4.app.FragmentManager r3 = r12.getSupportFragmentManager()     // Catch:{ Exception -> 0x00ab }
            java.util.ArrayList<MM> r4 = r12.f2472m     // Catch:{ Exception -> 0x00ab }
            r5 = 4
            r2.<init>(r3, r4, r5, r12)     // Catch:{ Exception -> 0x00ab }
            r12.f2466g = r2     // Catch:{ Exception -> 0x00ab }
            r12.f2461H = r5     // Catch:{ Exception -> 0x00ab }
            r2 = 2131296563(0x7f090133, float:1.8211046E38)
            android.view.View r2 = r12.findViewById(r2)     // Catch:{ Exception -> 0x00ab }
            android.support.v4.view.ViewPager r2 = (android.support.v4.view.ViewPager) r2     // Catch:{ Exception -> 0x00ab }
            r12.f2467h = r2     // Catch:{ Exception -> 0x00ab }
            android.support.v4.view.ViewPager r2 = r12.f2467h     // Catch:{ Exception -> 0x00ab }
            ZT r3 = r12.f2466g     // Catch:{ Exception -> 0x00ab }
            r2.setAdapter(r3)     // Catch:{ Exception -> 0x00ab }
            android.support.v4.view.ViewPager r2 = r12.f2467h     // Catch:{ Exception -> 0x00ab }
            android.support.v4.view.ViewPager$OnPageChangeListener r3 = r12.f2462I     // Catch:{ Exception -> 0x00ab }
            r2.addOnPageChangeListener(r3)     // Catch:{ Exception -> 0x00ab }
            android.support.v4.view.ViewPager r2 = r12.f2467h     // Catch:{ Exception -> 0x00ab }
            r2.setOffscreenPageLimit(r1)     // Catch:{ Exception -> 0x00ab }
            int r2 = f2449b     // Catch:{ Exception -> 0x00ab }
            if (r2 != 0) goto L_0x00af
            java.util.ArrayList<MM> r2 = r12.f2472m     // Catch:{ Exception -> 0x00ab }
            int r2 = r2.size()     // Catch:{ Exception -> 0x00ab }
            if (r2 <= 0) goto L_0x00af
            r12.mo3776a(r0)     // Catch:{ Exception -> 0x00ab }
            goto L_0x00af
        L_0x00ab:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ Exception -> 0x0186 }
        L_0x00af:
            java.lang.CharSequence r2 = r12.getTitle()     // Catch:{ Exception -> 0x0186 }
            r12.f2454A = r2     // Catch:{ Exception -> 0x0186 }
            r12.f2455B = r2     // Catch:{ Exception -> 0x0186 }
            android.content.res.Resources r2 = r12.getResources()     // Catch:{ Exception -> 0x0186 }
            r3 = 2130903057(0x7f030011, float:1.7412921E38)
            java.lang.String[] r2 = r2.getStringArray(r3)     // Catch:{ Exception -> 0x0186 }
            r12.f2484y = r2     // Catch:{ Exception -> 0x0186 }
            android.content.res.Resources r2 = r12.getResources()     // Catch:{ Exception -> 0x0186 }
            r3 = 2130903044(0x7f030004, float:1.7412895E38)
            android.content.res.TypedArray r2 = r2.obtainTypedArray(r3)     // Catch:{ Exception -> 0x0186 }
            r12.f2485z = r2     // Catch:{ Exception -> 0x0186 }
            r2 = 2131296411(0x7f09009b, float:1.8210738E38)
            android.view.View r2 = r12.findViewById(r2)     // Catch:{ Exception -> 0x0186 }
            android.support.v4.widget.DrawerLayout r2 = (android.support.v4.widget.DrawerLayout) r2     // Catch:{ Exception -> 0x0186 }
            r12.f2456C = r2     // Catch:{ Exception -> 0x0186 }
            r2 = 2131296627(0x7f090173, float:1.8211176E38)
            android.view.View r2 = r12.findViewById(r2)     // Catch:{ Exception -> 0x0186 }
            android.widget.ListView r2 = (android.widget.ListView) r2     // Catch:{ Exception -> 0x0186 }
            r12.f2457D = r2     // Catch:{ Exception -> 0x0186 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x0186 }
            r2.<init>()     // Catch:{ Exception -> 0x0186 }
            r12.f2459F = r2     // Catch:{ Exception -> 0x0186 }
            r2 = 0
        L_0x00ef:
            java.lang.String[] r3 = r12.f2484y     // Catch:{ Exception -> 0x0186 }
            int r3 = r3.length     // Catch:{ Exception -> 0x0186 }
            r4 = -1
            if (r2 >= r3) goto L_0x010c
            gO r3 = new gO     // Catch:{ Exception -> 0x0186 }
            java.lang.String[] r5 = r12.f2484y     // Catch:{ Exception -> 0x0186 }
            r5 = r5[r2]     // Catch:{ Exception -> 0x0186 }
            android.content.res.TypedArray r6 = r12.f2485z     // Catch:{ Exception -> 0x0186 }
            int r4 = r6.getResourceId(r2, r4)     // Catch:{ Exception -> 0x0186 }
            r3.<init>(r5, r4)     // Catch:{ Exception -> 0x0186 }
            java.util.List<gO> r4 = r12.f2459F     // Catch:{ Exception -> 0x0186 }
            r4.add(r3)     // Catch:{ Exception -> 0x0186 }
            int r2 = r2 + 1
            goto L_0x00ef
        L_0x010c:
            android.content.res.TypedArray r2 = r12.f2485z     // Catch:{ Exception -> 0x0186 }
            r2.recycle()     // Catch:{ Exception -> 0x0186 }
            DH r2 = new DH     // Catch:{ Exception -> 0x0186 }
            android.content.Context r3 = r12.getApplicationContext()     // Catch:{ Exception -> 0x0186 }
            java.util.List<gO> r5 = r12.f2459F     // Catch:{ Exception -> 0x0186 }
            r2.<init>(r3, r5)     // Catch:{ Exception -> 0x0186 }
            r12.f2460G = r2     // Catch:{ Exception -> 0x0186 }
            android.widget.ListView r2 = r12.f2457D     // Catch:{ Exception -> 0x0186 }
            DH r3 = r12.f2460G     // Catch:{ Exception -> 0x0186 }
            r2.setAdapter(r3)     // Catch:{ Exception -> 0x0186 }
            android.widget.ListView r2 = r12.f2457D     // Catch:{ Exception -> 0x0186 }
            com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main$a r3 = new com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main$a     // Catch:{ Exception -> 0x0186 }
            r3.<init>()     // Catch:{ Exception -> 0x0186 }
            r2.setOnItemClickListener(r3)     // Catch:{ Exception -> 0x0186 }
            android.support.v7.app.ActionBar r2 = r12.getSupportActionBar()     // Catch:{ Exception -> 0x0186 }
            r2.setDisplayHomeAsUpEnabled(r1)     // Catch:{ Exception -> 0x0186 }
            android.support.v7.app.ActionBar r2 = r12.getSupportActionBar()     // Catch:{ Exception -> 0x0186 }
            r2.setHomeButtonEnabled(r1)     // Catch:{ Exception -> 0x0186 }
            lM r2 = new lM     // Catch:{ Exception -> 0x0186 }
            android.support.v4.widget.DrawerLayout r8 = r12.f2456C     // Catch:{ Exception -> 0x0186 }
            android.support.v7.widget.Toolbar r9 = r12.f2483x     // Catch:{ Exception -> 0x0186 }
            r10 = 2131755090(0x7f100052, float:1.914105E38)
            r11 = 2131755090(0x7f100052, float:1.914105E38)
            r5 = r2
            r6 = r12
            r7 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0186 }
            r12.f2458E = r2     // Catch:{ Exception -> 0x0186 }
            android.support.v4.widget.DrawerLayout r2 = r12.f2456C     // Catch:{ Exception -> 0x0186 }
            android.support.v7.app.ActionBarDrawerToggle r3 = r12.f2458E     // Catch:{ Exception -> 0x0186 }
            r2.setDrawerListener(r3)     // Catch:{ Exception -> 0x0186 }
            if (r13 != 0) goto L_0x015d
            r12.mo3780b(r4)     // Catch:{ Exception -> 0x0186 }
        L_0x015d:
            android.os.Handler r13 = new android.os.Handler     // Catch:{ Exception -> 0x016c }
            r13.<init>()     // Catch:{ Exception -> 0x016c }
            vM r2 = new vM     // Catch:{ Exception -> 0x016c }
            r2.<init>(r12)     // Catch:{ Exception -> 0x016c }
            r3 = 10
            r13.postDelayed(r2, r3)     // Catch:{ Exception -> 0x016c }
        L_0x016c:
            JU r13 = r12.f2469j     // Catch:{ Exception -> 0x01a1 }
            java.lang.String r2 = "hello_serv"
            r13.mo543b(r2, r0)     // Catch:{ Exception -> 0x01a1 }
            r12.mo3782d()     // Catch:{ Exception -> 0x01a1 }
            boolean r13 = p000.C0195JU.f458r     // Catch:{ Exception -> 0x01a1 }
            if (r13 != 0) goto L_0x01a1
            p000.C0195JU.f458r = r1     // Catch:{ Exception -> 0x01a1 }
            com.google.firebase.messaging.FirebaseMessaging r13 = com.google.firebase.messaging.FirebaseMessaging.getInstance()     // Catch:{ Exception -> 0x01a1 }
            java.lang.String r0 = "daftar_free"
            r13.subscribeToTopic(r0)     // Catch:{ Exception -> 0x01a1 }
            goto L_0x01a1
        L_0x0186:
            r13 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r13 = r13.getMessage()
            r0.append(r13)
            java.lang.String r13 = ""
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            java.lang.String r0 = "main_oncreate="
            android.util.Log.d(r0, r13)
        L_0x01a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main, android.content.Context] */
    public Loader<ArrayList<C0260MM>> onCreateLoader(int i, Bundle bundle) {
        Log.d("trace_S_Loader_groups=", m2279h());
        return new C0532YT(this, this.f2469j);
    }

    public void onDestroy() {
        try {
            getSupportLoaderManager().destroyLoader(f2448a);
        } catch (Exception unused) {
        }
        FragmentStatePagerSupport_Main.super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 82) {
            return FragmentStatePagerSupport_Main.super.onKeyDown(i, keyEvent);
        }
        if (!this.f2456C.isDrawerOpen(this.f2457D)) {
            this.f2456C.openDrawer(this.f2457D);
        } else if (this.f2456C.isDrawerOpen(this.f2457D)) {
            this.f2456C.closeDrawer(this.f2457D);
        }
        return true;
    }

    public void onLoaderReset(Loader<ArrayList<C0260MM>> loader) {
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main, android.app.Activity] */
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.f2458E.onOptionsItemSelected(menuItem)) {
            return true;
        }
        if (menuItem.getItemId() != 16908332) {
            return FragmentStatePagerSupport_Main.super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    public void onPostCreate(Bundle bundle) {
        FragmentStatePagerSupport_Main.super.onPostCreate(bundle);
        this.f2458E.syncState();
    }

    public void onPostResume() {
        FragmentStatePagerSupport_Main.super.onPostResume();
        Log.d("Oncreate:", "onPostResume");
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (i == 1) {
            for (int length = strArr.length - 1; length >= 0; length--) {
                if (iArr[length] != 0 && strArr[length].equals(f2450c[0])) {
                    C0195JU.f445e = "PERMISSION_DEN";
                } else if (iArr[length] == 0 && strArr[length].equals(f2450c[0])) {
                    new C0698b(5).execute(new Void[0]);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main, android.content.Context, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0048 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRestart() {
        /*
            r6 = this;
            com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.super.onRestart()
            java.lang.String r0 = "Oncreate:"
            java.lang.String r1 = "Main_onRestart"
            android.util.Log.d(r0, r1)
            boolean r1 = f2451d
            if (r1 != 0) goto L_0x0014
            JU r0 = r6.f2469j
            r0.mo568e()
            return
        L_0x0014:
            java.lang.String r1 = "Main_onRestart&Refresh"
            android.util.Log.d(r0, r1)
            r0 = 0
            f2451d = r0
            boolean r1 = f2453f
            java.lang.String r2 = "hello_serv"
            if (r1 == 0) goto L_0x002d
            f2453f = r0
            JU r1 = r6.f2469j
            r1.mo543b(r2, r0)
            r6.recreate()
            return
        L_0x002d:
            android.support.v7.widget.Toolbar r1 = r6.f2483x
            r6.setSupportActionBar(r1)
            JU r1 = new JU
            android.database.sqlite.SQLiteDatabase r3 = r6.f2468i
            r1.<init>(r3, r6)
            r6.f2469j = r1
            JU r1 = r6.f2469j
            java.lang.String r3 = "prefOthers_currency"
            boolean r1 = r1.mo524a(r3, r0)
            p000.C0195JU.f451k = r1
            r6.mo3783e()     // Catch:{ Exception -> 0x0048 }
        L_0x0048:
            android.os.Handler r1 = new android.os.Handler     // Catch:{ Exception -> 0x0058 }
            r1.<init>()     // Catch:{ Exception -> 0x0058 }
            uM r3 = new uM     // Catch:{ Exception -> 0x0058 }
            r3.<init>(r6)     // Catch:{ Exception -> 0x0058 }
            r4 = 10
            r1.postDelayed(r3, r4)     // Catch:{ Exception -> 0x0058 }
            goto L_0x0065
        L_0x0058:
            r1 = move-exception
            r1.printStackTrace()
            java.lang.String r1 = r1.getMessage()
            java.lang.String r3 = "bk_jobs1"
            android.util.Log.d(r3, r1)
        L_0x0065:
            JU r1 = r6.f2469j     // Catch:{ Exception -> 0x006a }
            r1.mo543b(r2, r0)     // Catch:{ Exception -> 0x006a }
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.onRestart():void");
    }

    public void onResume() {
        FragmentStatePagerSupport_Main.super.onResume();
        Log.d("Oncreate:", "onResume");
    }

    public void onStart() {
        FragmentStatePagerSupport_Main.super.onStart();
    }

    public void onStop() {
        FragmentStatePagerSupport_Main.super.onStop();
        Log.d("Oncreate:", "Main_onStop");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main, android.content.Context, android.app.Activity] */
    /* renamed from: p */
    public void mo3810p() {
        try {
            Builder builder = new Builder(this);
            WebView webView = new WebView(this);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("file:///android_asset/help.html");
            webView.setWebViewClient(new C0919mM(this));
            builder.setView(webView);
            builder.setNegativeButton(getString(2131755134), new C0941nM(this));
            builder.show();
        } catch (Exception unused) {
        }
    }

    /* renamed from: q */
    public void mo3811q() {
        String sb;
        Log.d("trace_S_Upgrade=", m2279h());
        String str = "trace_E_Upgrade=";
        if (this.f2469j.mo452D("select * from transactions where out<0 ") > 0) {
            Log.d(str, m2279h());
            this.f2469j.mo562d("update transactions set out=abs(out) where out<0");
        }
        if (this.f2469j.mo452D("select * from sqlite_master where type='index'  and name='tr_ind_curr_id'") == 1 && this.f2469j.mo452D("select * from sqlite_master where type='table' and name='transactions_bk4'") == 1 && this.f2469j.mo452D("select * from sqlite_master where type='view'  and name='cus_tr_curr_viewXXXX'") == 1) {
            sb = m2279h();
        } else {
            String str2 = "0";
            String str3 = "upgrade_app_ver_1_96";
            int parseInt = Integer.parseInt(this.f2469j.mo609q(str3, str2));
            String str4 = "upgrade_db";
            int parseInt2 = Integer.parseInt(this.f2469j.mo609q(str4, str2));
            String str5 = "dd-MM-yyyy H";
            String str6 = "";
            if (!this.f2469j.mo609q("upgrad_db_date", str6).equals(new SimpleDateFormat(str5, Locale.ENGLISH).format(Calendar.getInstance().getTime()))) {
                parseInt2 = 0;
            }
            if (parseInt2 <= 5 || parseInt <= 5) {
                try {
                    NodeList elementsByTagName = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(getResources().openRawResource(2131689472), null).getElementsByTagName("statement");
                    for (int i = 0; i < elementsByTagName.getLength(); i++) {
                        try {
                            this.f2469j.mo562d(elementsByTagName.item(i).getChildNodes().item(0).getNodeValue());
                        } catch (Exception unused) {
                        }
                    }
                    if (this.f2469j.mo452D("select * from sqlite_master where type='table'  and name='transactions_bk4'") == 0) {
                        this.f2469j.mo483U();
                    }
                } catch (Throwable unused2) {
                }
                new DateFormat();
                String charSequence = DateFormat.format("dd-MM-yyyy", new Date()).toString();
                String str7 = "auto_drive_date_save";
                if (this.f2469j.mo609q(str7, str6).equals(str6)) {
                    this.f2469j.mo631x(str7, charSequence);
                }
                String str8 = "auto_drive_date_request";
                if (this.f2469j.mo609q(str8, str6).equals(str6)) {
                    this.f2469j.mo631x(str8, charSequence);
                }
                int i2 = parseInt2 + 1;
                int i3 = parseInt + 1;
                this.f2469j.mo631x(str4, String.valueOf(i2));
                this.f2469j.mo631x(str3, String.valueOf(i3));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m2279h());
                String str9 = ":";
                sb2.append(str9);
                sb2.append(i2);
                sb2.append(str9);
                sb2.append(i3);
                sb = sb2.toString();
            } else {
                return;
            }
        }
        Log.d(str, sb);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main, android.content.Context, android.app.Activity] */
    /* renamed from: r */
    public void mo3812r() {
        String str = "hint_curr_check_date";
        if (C0195JU.f451k) {
            try {
                if (!this.f2469j.mo609q("hint_curr_check", "0").equals("1")) {
                    String format = new SimpleDateFormat("dd-MM-yyyy H", Locale.ENGLISH).format(Calendar.getInstance().getTime());
                    if (!this.f2469j.mo609q(str, "").equals(format)) {
                        if (this.f2469j.mo467L().getCount() == 0) {
                            this.f2469j.mo631x(str, format);
                            return;
                        }
                        this.f2469j.mo631x(str, format);
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        View inflate = getLayoutInflater().inflate(2131492959, null);
                        builder.setView(inflate);
                        ((CheckBox) inflate.findViewById(2131296479)).setOnCheckedChangeListener(new C1176yM(this));
                        builder.setCancelable(true);
                        builder.setNegativeButton(getString(2131755134), new C1198zM(this));
                        AlertDialog create = builder.create();
                        create.setTitle(getString(2131755227));
                        create.show();
                    }
                }
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append(":");
                sb.append(e.getMessage());
                Log.d("adv_search_error=", sb.toString());
            }
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main, android.content.Context, android.app.Activity] */
    /* renamed from: s */
    public void mo3813s() {
        String str = "drive_check_date";
        String str2 = "PREF_ACCOUNT_NAME";
        String str3 = "dd-MM-yyyy";
        String str4 = "0";
        try {
            Calendar instance = Calendar.getInstance();
            new SimpleDateFormat(str3, Locale.ENGLISH).format(instance.getTime());
            String format = new SimpleDateFormat(str3, Locale.ENGLISH).format(instance.getTime());
            if ((this.f2469j.mo609q(str2, str4).equals(str4) || this.f2469j.mo476Q()) && !this.f2469j.mo609q("first_run", str4).equals(str4)) {
                if (this.f2469j.mo524a("pref_drive_AutoNotify", true)) {
                    if (!this.f2469j.mo609q(str, "").equals(format) && this.f2469j.mo623v() >= 20) {
                        this.f2469j.mo631x(str, format);
                        if (this.f2469j.mo609q(str2, str4).equals(str4)) {
                            Intent intent = new Intent(this, Google_drive_list.class);
                            intent.putExtra("change_email_flag", "1");
                            startActivity(intent);
                        } else {
                            mo3784f();
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f2455B = charSequence;
        getSupportActionBar().setTitle(this.f2455B);
    }
}
