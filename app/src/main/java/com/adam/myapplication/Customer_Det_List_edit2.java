package com.adam.myapplication;


import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.DocumentsContract;
import android.provider.MediaStore.Audio;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.design.widget.Snackbar.SnackbarLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.Loader;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.ContextThemeWrapper;
import android.support.v7.widget.SearchView;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;
import com.itextpdf.tool.xml.css.CSS.Value;
import com.itextpdf.tool.xml.html.HTML.Attribute;
import com.itextpdf.tool.xml.html.HTML.Tag;
import com.valdio.valdioveliu.recyclerview.frag.Calculator;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class Customer_Det_List_edit2 extends AppCompatActivity implements OnItemClickListener, C0625bN, LoaderCallbacks<List<C0232LL>> {

    /* renamed from: A */
    public RadioButton f2333A = null;

    /* renamed from: Aa */
    public String f2334Aa;

    /* renamed from: B */
    public RadioButton f2335B = null;

    /* renamed from: Ba */
    public boolean f2336Ba;

    /* renamed from: C */
    public ListView f2337C = null;

    /* renamed from: D */
    public LinearLayout f2338D = null;

    /* renamed from: E */
    public LinearLayout f2339E = null;

    /* renamed from: F */
    public LinearLayout f2340F = null;

    /* renamed from: G */
    public LinearLayout f2341G = null;

    /* renamed from: H */
    public LinearLayout f2342H = null;

    /* renamed from: I */
    public RadioGroup f2343I = null;

    /* renamed from: J */
    public ArrayList<HashMap<String, String>> f2344J = new ArrayList<>();

    /* renamed from: K */
    public C0302OM f2345K;

    /* renamed from: L */
    public List<C0232LL> f2346L = new ArrayList();

    /* renamed from: M */
    public SparseBooleanArray f2347M;

    /* renamed from: N */
    public ArrayAdapter<String> f2348N;

    /* renamed from: O */
    public ArrayAdapter<String> f2349O;

    /* renamed from: P */
    public ImageButton f2350P = null;

    /* renamed from: Q */
    public ImageView f2351Q = null;

    /* renamed from: R */
    public String f2352R;

    /* renamed from: S */
    public String f2353S;

    /* renamed from: T */
    public int f2354T;

    /* renamed from: U */
    public String[] f2355U;

    /* renamed from: V */
    public String[] f2356V;

    /* renamed from: W */
    public int[] f2357W;

    /* renamed from: X */
    public String f2358X;

    /* renamed from: Y */
    public String f2359Y;

    /* renamed from: Z */
    public String f2360Z;

    /* renamed from: a */
    public SQLiteDatabase f2361a;

    /* renamed from: aa */
    public String f2362aa;

    /* renamed from: b */
    public C0195JU f2363b;

    /* renamed from: ba */
    public String f2364ba;

    /* renamed from: c */
    public String f2365c;

    /* renamed from: ca */
    public int f2366ca;

    /* renamed from: d */
    public String f2367d = null;

    /* renamed from: da */
    public String f2368da;

    /* renamed from: e */
    public String f2369e = null;

    /* renamed from: ea */
    public String f2370ea;

    /* renamed from: f */
    public String f2371f = null;

    /* renamed from: fa */
    public EditText f2372fa;

    /* renamed from: g */
    public String f2373g = null;

    /* renamed from: ga */
    public int f2374ga;

    /* renamed from: h */
    public String f2375h = null;

    /* renamed from: ha */
    public int f2376ha;

    /* renamed from: i */
    public int f2377i;

    /* renamed from: ia */
    public int f2378ia;

    /* renamed from: j */
    public double f2379j = 0.0d;

    /* renamed from: ja */
    public int f2380ja;

    /* renamed from: k */
    public int f2381k;

    /* renamed from: ka */
    public String f2382ka;

    /* renamed from: l */
    public int f2383l;

    /* renamed from: la */
    public Uri f2384la;

    /* renamed from: m */
    public int f2385m;

    /* renamed from: ma */
    public boolean f2386ma;

    /* renamed from: n */
    public AutoCompleteTextView f2387n = null;

    /* renamed from: na */
    public boolean f2388na;

    /* renamed from: o */
    public AutoCompleteTextView f2389o = null;

    /* renamed from: oa */
    public String f2390oa;

    /* renamed from: p */
    public EditText f2391p = null;

    /* renamed from: pa */
    public boolean f2392pa;

    /* renamed from: q */
    public TextView f2393q = null;

    /* renamed from: qa */
    public C0651cU f2394qa;

    /* renamed from: r */
    public TextView f2395r = null;

    /* renamed from: ra */
    public ArrayList<String> f2396ra;

    /* renamed from: s */
    public AutoCompleteTextView f2397s = null;

    /* renamed from: sa */
    public boolean f2398sa;

    /* renamed from: t */
    public AutoCompleteTextView f2399t = null;

    /* renamed from: ta */
    public boolean f2400ta;

    /* renamed from: u */
    public Button f2401u = null;

    /* renamed from: ua */
    public OnDateSetListener f2402ua;

    /* renamed from: v */
    public Button f2403v = null;

    /* renamed from: va */
    public OnDateSetListener f2404va;

    /* renamed from: w */
    public Button f2405w = null;

    /* renamed from: wa */
    public ProgressDialog f2406wa;

    /* renamed from: x */
    public ImageView f2407x = null;

    /* renamed from: xa */
    public Handler f2408xa;

    /* renamed from: y */
    public ImageView f2409y = null;

    /* renamed from: ya */
    public String f2410ya;

    /* renamed from: z */
    public RadioGroup f2411z = null;

    /* renamed from: za */
    public int f2412za;

    /* renamed from: com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2$a */
    private static class C0695a implements Comparator<C0232LL> {
        public C0695a() {
        }

        public /* synthetic */ C0695a(C0207KK kk) {
            this();
        }

        /* renamed from: a */
        public int compare(C0232LL ll, C0232LL ll2) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
            try {
                return simpleDateFormat.parse(ll2.mo777h()).compareTo(simpleDateFormat.parse(ll.mo777h()));
            } catch (ParseException unused) {
                return ll2.mo777h().compareTo(ll.mo777h());
            }
        }
    }

    /* renamed from: com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2$b */
    private class C0696b extends AsyncTask<Void, Void, Double> {

        /* renamed from: a */
        public int f2413a = 0;

        public C0696b(int i) {
            this.f2413a = i;
        }

        /* renamed from: a */
        public final Double mo3762a() {
            Customer_Det_List_edit2 customer_Det_List_edit2 = Customer_Det_List_edit2.this;
            customer_Det_List_edit2.f2379j = 0.0d;
            for (int size = customer_Det_List_edit2.f2346L.size() - 1; size >= 0; size--) {
                Customer_Det_List_edit2 customer_Det_List_edit22 = Customer_Det_List_edit2.this;
                customer_Det_List_edit22.f2379j += Double.parseDouble(((C0232LL) customer_Det_List_edit22.f2346L.get(size)).mo775f().replaceAll(",", "")) * (Double.parseDouble(((C0232LL) Customer_Det_List_edit2.this.f2346L.get(size)).mo770c()) - 1.0d);
                C0232LL ll = (C0232LL) Customer_Det_List_edit2.this.f2346L.get(size);
                ll.mo769b(String.valueOf(Customer_Det_List_edit2.this.f2379j));
                Customer_Det_List_edit2.this.f2346L.set(size, ll);
            }
            return Double.valueOf(Customer_Det_List_edit2.this.f2379j);
        }

        /* renamed from: a */
        public Double doInBackground(Void... voidArr) {
            try {
                if (this.f2413a != 0) {
                    if (this.f2413a != 1) {
                        if (this.f2413a == 2) {
                            Customer_Det_List_edit2.this.mo3671D();
                            return Double.valueOf(0.0d);
                        } else if (this.f2413a == 3) {
                            Customer_Det_List_edit2.this.mo3668A();
                            return Double.valueOf(0.0d);
                        } else if (this.f2413a != 4) {
                            return Double.valueOf(0.0d);
                        } else {
                            Customer_Det_List_edit2.this.mo3674G();
                            return Double.valueOf(0.0d);
                        }
                    }
                }
                return mo3762a();
            } catch (Exception unused) {
                return Double.valueOf(0.0d);
            }
        }

        /* JADX WARNING: type inference failed for: r2v4, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v4, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2]
          assigns: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2]
          uses: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.content.Context]
          mth insns count: 24
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
        public void onPostExecute(java.lang.Double r2) {
            /*
                r1 = this;
                int r2 = r1.f2413a
                if (r2 != 0) goto L_0x000c
                com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r2 = com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2.this
                OM r2 = r2.f2345K
                r2.notifyDataSetChanged()
                goto L_0x0031
            L_0x000c:
                r0 = 1
                if (r2 != r0) goto L_0x0015
                com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r2 = com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2.this
                r2.mo3685R()
                goto L_0x0031
            L_0x0015:
                r0 = 2
                if (r2 != r0) goto L_0x0020
                com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r2 = com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2.this
                JU r0 = r2.f2363b
                r0.mo551c(r2)
                goto L_0x0031
            L_0x0020:
                r0 = 3
                if (r2 != r0) goto L_0x0029
                com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r2 = com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2.this
                r2.mo3669B()
                goto L_0x0031
            L_0x0029:
                r0 = 4
                if (r2 != r0) goto L_0x0031
                com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r2 = com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2.this
                r2.mo3676I()
            L_0x0031:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2.C0696b.onPostExecute(java.lang.Double):void");
        }

        public void onPreExecute() {
            Customer_Det_List_edit2.this.f2379j = 0.0d;
        }
    }

    public Customer_Det_List_edit2() {
        String str = "";
        this.f2352R = str;
        this.f2353S = str;
        this.f2354T = 0;
        String str2 = "January";
        String str3 = "February";
        String str4 = "March";
        String str5 = "April";
        String str6 = "May";
        String str7 = "June";
        this.f2355U = new String[]{str2, str3, str4, str5, str6, str7, "July", "August", "September", "October", "November", "December"};
        this.f2356V = new String[]{str2, str3, str4, str5, str6, str7, "July", "August", "September", "October", "November", "December"};
        this.f2357W = new int[]{2131230923, 1, 2131230855};
        this.f2358X = null;
        this.f2359Y = null;
        this.f2360Z = null;
        this.f2362aa = null;
        this.f2364ba = null;
        this.f2366ca = 0;
        this.f2368da = null;
        this.f2370ea = null;
        this.f2374ga = 3;
        this.f2376ha = 4;
        this.f2378ia = 0;
        this.f2380ja = 1;
        this.f2390oa = str;
        this.f2392pa = false;
        this.f2396ra = new ArrayList<>();
        this.f2400ta = false;
        this.f2402ua = new C0005AL(this);
        this.f2404va = new C0024BL(this);
        this.f2408xa = new C0067DL(this);
        this.f2410ya = str;
        this.f2412za = 0;
        this.f2334Aa = str;
        this.f2336Ba = false;
    }

    /* renamed from: a */
    public static String m2173a(Context context, String str, int i) {
        String str2 = "";
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        try {
            Object invoke = Class.forName(telephonyManager.getClass().getName()).getMethod(str, new Class[]{Integer.TYPE}).invoke(telephonyManager, new Object[]{Integer.valueOf(i)});
            return invoke != null ? invoke.toString() : str2;
        } catch (Exception unused) {
            return str2;
        }
    }

    /* renamed from: a */
    public static boolean m2175a(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    /* renamed from: b */
    public static boolean m2178b(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    /* renamed from: c */
    public static boolean m2183c(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    /* renamed from: A */
    public void mo3668A() {
        Cursor C = this.f2363b.mo451C(this.f2387n.getText().toString());
        this.f2356V = new String[C.getCount()];
        if (C.moveToFirst()) {
            int i = 0;
            do {
                this.f2356V[i] = C.getString(C.getColumnIndex("remarks"));
                i++;
            } while (C.moveToNext());
        }
        C.close();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2] */
    /* renamed from: B */
    public void mo3669B() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2356V.length);
        sb.append("");
        Log.d("item2=", sb.toString());
        this.f2349O = new ArrayAdapter<>(this, 17367050, this.f2356V);
        this.f2397s.setAdapter(this.f2349O);
    }

    /* renamed from: C */
    public final boolean mo3670C() {
        return Build.MANUFACTURER.equalsIgnoreCase("samsung") && mo3711b(21, 22);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2] */
    /* renamed from: D */
    public void mo3671D() {
        if (ContextCompat.checkSelfPermission(this, "android.permission.READ_PHONE_STATE") != 0) {
            mo3677J();
        } else {
            mo3751r();
        }
    }

    /* renamed from: E */
    public void mo3672E() {
        mo3710b(true);
        new Thread(new C0086EL(this)).start();
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2] */
    /* renamed from: F */
    public void mo3673F() {
        Drawable drawable;
        Drawable drawable2;
        AutoCompleteTextView autoCompleteTextView;
        if (this.f2363b.mo524a("f_name_lock", true)) {
            autoCompleteTextView = this.f2387n;
            drawable2 = autoCompleteTextView.getCompoundDrawables()[0];
            drawable = ContextCompat.getDrawable(this, 17301551);
        } else {
            autoCompleteTextView = this.f2387n;
            drawable2 = autoCompleteTextView.getCompoundDrawables()[0];
            drawable = ContextCompat.getDrawable(this, 17301535);
        }
        autoCompleteTextView.setCompoundDrawablesWithIntrinsicBounds(drawable2, null, drawable, null);
        if (this.f2363b.mo524a("t_name_lock", false)) {
            AutoCompleteTextView autoCompleteTextView2 = this.f2389o;
            autoCompleteTextView2.setCompoundDrawablesWithIntrinsicBounds(autoCompleteTextView2.getCompoundDrawables()[0], null, ContextCompat.getDrawable(this, 17301551), null);
            return;
        }
        AutoCompleteTextView autoCompleteTextView3 = this.f2389o;
        autoCompleteTextView3.setCompoundDrawablesWithIntrinsicBounds(autoCompleteTextView3.getCompoundDrawables()[0], null, ContextCompat.getDrawable(this, 17301535), null);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2] */
    /* renamed from: G */
    public void mo3674G() {
        this.f2348N = new ArrayAdapter<>(this, 17367050, this.f2363b.mo598m(this.f2387n.getText().toString(), this.f2389o.getText().toString()));
        this.f2396ra = this.f2363b.mo607p(this.f2387n.getText().toString(), this.f2389o.getText().toString());
        this.f2394qa = new C0651cU(this, 17367050, this.f2396ra);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3675H() {
        /*
            r11 = this;
            PU r9 = new PU
            r9.<init>()
            QU r10 = new QU
            JU r2 = r11.f2363b
            android.widget.AutoCompleteTextView r3 = r11.f2387n
            android.widget.AutoCompleteTextView r4 = r11.f2389o
            android.widget.AutoCompleteTextView r5 = r11.f2397s
            android.widget.LinearLayout r7 = r11.f2340F
            android.widget.Button r8 = r11.f2401u
            r1 = 2
            r0 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            NU r0 = p000.C0288NU.m892a()
            r0.mo934a(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2.mo3675H():void");
    }

    /* renamed from: I */
    public void mo3676I() {
        this.f2387n.setThreshold(1);
        this.f2389o.setThreshold(1);
        this.f2397s.setThreshold(1);
        this.f2387n.setAdapter(this.f2348N);
        this.f2389o.setAdapter(this.f2348N);
        mo3703a(this.f2396ra);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    /* renamed from: J */
    public final void mo3677J() {
        String str = "android.permission.READ_PHONE_STATE";
        if (ActivityCompat.shouldShowRequestPermissionRationale(this, str)) {
            ActivityCompat.requestPermissions(this, new String[]{str}, 0);
            return;
        }
        ActivityCompat.requestPermissions(this, new String[]{str}, 0);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.support.v7.app.AppCompatActivity] */
    /* renamed from: K */
    public final void mo3678K() {
        String[] stringArray = getResources().getStringArray(2130903056);
        Builder builder = new Builder(this);
        builder.setItems(stringArray, new C0496XK(this, stringArray));
        AlertDialog create = builder.create();
        ListView listView = create.getListView();
        listView.setDivider(new ColorDrawable(-7829368));
        listView.setDividerHeight(1);
        create.show();
    }

    /* renamed from: L */
    public final void mo3679L() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    /* renamed from: M */
    public void mo3680M() {
        StringBuilder sb = new StringBuilder();
        for (int size = this.f2347M.size() - 1; size >= 0; size--) {
            if (this.f2347M.valueAt(size)) {
                C0232LL item = this.f2345K.getItem(this.f2347M.keyAt(size));
                sb.append(getString(item.mo780k() == this.f2357W[0] ? 2131755142 : 2131755160));
                String str = " ";
                sb.append(str);
                sb.append(item.mo775f());
                sb.append(str);
                sb.append(item.mo779j());
                sb.append(str);
                sb.append(getString(2131755159));
                sb.append(str);
                sb.append(item.mo777h().substring(0, 5));
                sb.append("\n");
            }
        }
        this.f2363b.mo486V(sb.toString());
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.support.v7.app.AppCompatActivity] */
    /* renamed from: N */
    public void mo3681N() {
        Dialog dialog = new Dialog(this);
        LinearLayout linearLayout = new LinearLayout(this);
        String[] stringArray = getResources().getStringArray(2130903059);
        TypedArray obtainTypedArray = getResources().obtainTypedArray(2130903046);
        ListView listView = new ListView(this);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < stringArray.length; i++) {
            arrayList.add(new C0796gO(stringArray[i], obtainTypedArray.getResourceId(i, -1)));
        }
        obtainTypedArray.recycle();
        listView.setAdapter(new C0063DH(this, arrayList));
        listView.setOnItemClickListener(new C0386SK(this, dialog));
        linearLayout.setFocusable(true);
        listView.setBackgroundColor(Color.parseColor("#FFFFFF"));
        listView.setDividerHeight(0);
        linearLayout.addView(listView, -1, -1);
        dialog.requestWindowFeature(1);
        dialog.setContentView(linearLayout);
        dialog.show();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    /* renamed from: O */
    public final void mo3682O() {
        ((InputMethodManager) getSystemService("input_method")).toggleSoftInput(2, 0);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    /* renamed from: P */
    public void mo3683P() {
        if (this.f2363b.mo524a("prefAutoSMS", false)) {
            try {
                mo3722e();
                return;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.f2363b.mo524a("prefAutoNotify", true)) {
            Snackbar make = Snackbar.make(this.f2337C, "", -2);
            SnackbarLayout view = make.getView();
            TextView textView = (TextView) view.findViewById(2131296631);
            C0232LL w = mo3756w();
            StringBuilder sb = new StringBuilder();
            sb.append(getString(w.mo780k() == this.f2357W[0] ? 2131755356 : 2131755357));
            String str = " ";
            sb.append(str);
            sb.append(w.mo775f());
            sb.append(str);
            sb.append(w.mo779j());
            make.setText(sb.toString());
            make.setAction(getString(2131755224), new C0408TK(this, make));
            textView.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(this, 17301586), null, null, null);
            textView.setOnClickListener(new C0430UK(this));
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.gravity = 16;
            view.setLayoutParams(layoutParams);
            ViewCompat.setLayoutDirection(make.getView(), 1);
            make.show();
            new Handler().postDelayed(new C0476WK(this, make), (long) 5000);
        }
    }

    /* renamed from: Q */
    public void mo3684Q() {
        String str = "f_name_lock";
        String str2 = "";
        if (!this.f2363b.mo524a(str, true)) {
            this.f2387n.setText(str2);
            if (!this.f2387n.hasFocus()) {
                this.f2387n.requestFocus();
            }
        }
        String str3 = "t_name_lock";
        if (!this.f2363b.mo524a(str3, false)) {
            this.f2389o.setText(str2);
            if (!this.f2389o.hasFocus() && this.f2363b.mo524a(str, true)) {
                this.f2389o.requestFocus();
            }
        }
        if (this.f2363b.mo524a(str, true) && this.f2363b.mo524a(str3, true)) {
            this.f2391p.setText(str2);
            if (!this.f2391p.hasFocus()) {
                this.f2391p.selectAll();
                this.f2391p.requestFocus();
            }
        }
        if (this.f2363b.mo524a(str3, false) && this.f2389o.getText() != null && this.f2389o.getText().toString().length() > 0) {
            this.f2387n.setImeOptions(5);
            this.f2387n.setNextFocusDownId(2131296431);
            this.f2387n.setNextFocusForwardId(2131296431);
        }
        this.f2391p.setText(str2);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2] */
    /* renamed from: R */
    public final void mo3685R() {
        this.f2345K = new C0302OM(this, 2131492929, this.f2346L);
        this.f2345K.f868i.clear();
        mo3709b(this.f2346L);
        this.f2345K.notifyDataSetChanged();
        this.f2337C.setAdapter(this.f2345K);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    /* renamed from: S */
    public void mo3686S() {
        String str = "";
        try {
            Builder builder = new Builder(this);
            View inflate = getLayoutInflater().inflate(2131492934, null);
            builder.setView(inflate);
            TextView textView = (TextView) inflate.findViewById(2131296431);
            TextView textView2 = (TextView) inflate.findViewById(2131296433);
            TextView textView3 = (TextView) inflate.findViewById(2131296683);
            ImageView imageView = (ImageView) inflate.findViewById(2131296344);
            ImageView imageView2 = (ImageView) inflate.findViewById(2131296685);
            TextView textView4 = (TextView) inflate.findViewById(2131296435);
            this.f2368da = str;
            if (!this.f2363b.mo528b(this.f2377i).equals("0")) {
                this.f2360Z = this.f2363b.mo548c(this.f2377i);
                this.f2370ea = this.f2367d;
                this.f2368da = this.f2363b.mo565e(this.f2377i);
                if (this.f2368da.equals(this.f2367d)) {
                    this.f2370ea = this.f2363b.mo497a(this.f2377i);
                }
            }
            textView4.setText(this.f2360Z);
            textView2.setText(this.f2358X);
            textView.setText(this.f2359Y);
            textView3.setText(this.f2363b.mo557d(this.f2377i));
            if (C0195JU.f451k) {
                ((TableRow) inflate.findViewById(2131296678)).setVisibility(0);
                ((TextView) inflate.findViewById(2131296432)).setText(this.f2364ba);
            }
            imageView2.setImageResource(this.f2366ca);
            if (!this.f2362aa.equals(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append(C0195JU.f442b);
                sb.append(this.f2362aa);
                imageView.setImageBitmap(C0195JU.m414a(sb.toString(), 300, 300));
                imageView.setTag(this.f2362aa);
                imageView.getLayoutParams().width = 200;
                imageView.getLayoutParams().height = 200;
            } else {
                imageView.setVisibility(8);
            }
            builder.setCancelable(true);
            if (imageView.getTag() != null) {
                builder.setNeutralButton(getString(2131755422), new C0125GL(this, imageView));
            }
            builder.setPositiveButton(getString(2131755170), new C0147HL(this));
            builder.setNegativeButton(getString(2131755359), new C0167IL(this));
            AlertDialog create = builder.create();
            create.setTitle(this.f2387n.getText().toString());
            create.show();
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(":");
            sb2.append(e.getMessage());
            Log.d("adv_search_error=", sb2.toString());
        }
    }

    /* renamed from: a */
    public double mo3687a(List<C0232LL> list) {
        double d = 0.0d;
        for (int size = list.size() - 1; size >= 0; size--) {
            int i = ((C0232LL) list.get(size)).mo780k() == this.f2357W[0] ? -1 : ((C0232LL) list.get(size)).mo780k() == this.f2357W[2] ? 1 : 0;
            double parseDouble = Double.parseDouble(((C0232LL) list.get(size)).mo775f().replaceAll(",", ""));
            double d2 = (double) i;
            Double.isNaN(d2);
            d += parseDouble * d2;
        }
        return d;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2] */
    /* renamed from: a */
    public String mo3688a(Context context, Uri uri) {
        try {
            if (VERSION.SDK_INT >= 19 && DocumentsContract.isDocumentUri(context, uri)) {
                String str = ":";
                if (m2178b(uri)) {
                    String[] split = DocumentsContract.getDocumentId(uri).split(str);
                    if ("primary".equalsIgnoreCase(split[0])) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(Environment.getExternalStorageDirectory());
                        sb.append("/");
                        sb.append(split[1]);
                        return sb.toString();
                    }
                } else if (m2175a(uri)) {
                    return mo3689a(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), (String) null, (String[]) null);
                } else if (m2183c(uri)) {
                    String[] split2 = DocumentsContract.getDocumentId(uri).split(str);
                    String str2 = split2[0];
                    Uri uri2 = "image".equals(str2) ? Media.EXTERNAL_CONTENT_URI : Tag.VIDEO.equals(str2) ? Video.Media.EXTERNAL_CONTENT_URI : Tag.AUDIO.equals(str2) ? Audio.Media.EXTERNAL_CONTENT_URI : null;
                    return mo3689a(context, uri2, "_id=?", new String[]{split2[1]});
                }
            } else if ("content".equalsIgnoreCase(uri.getScheme())) {
                return mo3689a(context, uri, (String) null, (String[]) null);
            } else {
                if ("file".equalsIgnoreCase(uri.getScheme())) {
                    return uri.getPath();
                }
            }
            Toast.makeText(this, "File Not Identified", 1).show();
            return null;
        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(), 1).show();
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r10 != null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        if (r10 != null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo3689a(android.content.Context r10, android.net.Uri r11, java.lang.String r12, java.lang.String[] r13) {
        /*
            r9 = this;
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]
            java.lang.String r7 = "_data"
            r1 = 0
            r3[r1] = r7
            r8 = 0
            android.content.ContentResolver r1 = r10.getContentResolver()     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
            r6 = 0
            r2 = r11
            r4 = r12
            r5 = r13
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
            if (r10 == 0) goto L_0x002d
            boolean r11 = r10.moveToFirst()     // Catch:{ Exception -> 0x002b }
            if (r11 == 0) goto L_0x002d
            int r11 = r10.getColumnIndexOrThrow(r7)     // Catch:{ Exception -> 0x002b }
            java.lang.String r11 = r10.getString(r11)     // Catch:{ Exception -> 0x002b }
            if (r10 == 0) goto L_0x002a
            r10.close()
        L_0x002a:
            return r11
        L_0x002b:
            r11 = move-exception
            goto L_0x0038
        L_0x002d:
            if (r10 == 0) goto L_0x0046
        L_0x002f:
            r10.close()
            goto L_0x0046
        L_0x0033:
            r11 = move-exception
            r10 = r8
            goto L_0x0048
        L_0x0036:
            r11 = move-exception
            r10 = r8
        L_0x0038:
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x0047 }
            android.widget.Toast r11 = android.widget.Toast.makeText(r9, r11, r0)     // Catch:{ all -> 0x0047 }
            r11.show()     // Catch:{ all -> 0x0047 }
            if (r10 == 0) goto L_0x0046
            goto L_0x002f
        L_0x0046:
            return r8
        L_0x0047:
            r11 = move-exception
        L_0x0048:
            if (r10 == 0) goto L_0x004d
            r10.close()
        L_0x004d:
            goto L_0x004f
        L_0x004e:
            throw r11
        L_0x004f:
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2.mo3689a(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    /* renamed from: a */
    public void mo3690a() {
        C0195JU ju = this.f2363b;
        StringBuilder sb = new StringBuilder();
        sb.append("insert into customers (name,gsm) values('");
        sb.append(this.f2389o.getText());
        sb.append("','0')");
        ju.mo562d(sb.toString());
    }

    /* renamed from: a */
    public void mo3691a(int i, int i2) {
        try {
            new Handler().postDelayed(new C0048CL(this, i), (long) i2);
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2] */
    /* renamed from: a */
    public final void mo3692a(Intent intent) {
        try {
            File file = new File(C0195JU.f442b);
            if (!file.exists()) {
                file.mkdirs();
            }
            String str = C0195JU.f442b;
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            sb.append(".jpg");
            File file2 = new File(str, sb.toString());
            file2.createNewFile();
            mo3699a(VERSION.SDK_INT >= 24 ? new File(C0195JU.f461u) : new File(mo3688a((Context) this, this.f2384la)), file2);
            mo3721d(file2.getName());
        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(), 1).show();
        }
    }

    /* renamed from: a */
    public void mo3693a(Cursor cursor) {
        cursor.getCount();
        this.f2379j = 0.0d;
        this.f2346L.clear();
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            List<C0232LL> list = this.f2346L;
            String string = cursor.getString(cursor.getColumnIndex("_id"));
            String string2 = cursor.getString(cursor.getColumnIndex("date_"));
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(cursor.getDouble(cursor.getColumnIndex("amount")));
            String str = "_in";
            C0232LL ll = new C0232LL(string, string2, sb.toString(), cursor.getString(cursor.getColumnIndex("remarks")), this.f2357W[cursor.getInt(cursor.getColumnIndex(str))], String.valueOf(cursor.getInt(cursor.getColumnIndex(str))), cursor.getString(cursor.getColumnIndex("param1")), cursor.getString(cursor.getColumnIndex("curr_name")));
            list.add(ll);
            cursor.moveToNext();
        }
        cursor.close();
        new C0696b(1).execute(new Void[0]);
    }

    /* renamed from: a */
    public void mo3694a(Handler handler) {
        mo3702a("", this.f2387n.getText().toString(), "", this.f2369e, handler);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2] */
    /* renamed from: a */
    public void onLoadFinished(Loader<List<C0232LL>> loader, List<C0232LL> list) {
        this.f2346L = list;
        this.f2345K = new C0302OM(this, 2131492929, this.f2346L);
        this.f2345K.f868i.clear();
        this.f2337C.setAdapter(this.f2345K);
        mo3725h();
    }

    /* renamed from: a */
    public void mo3696a(View view, boolean z) {
        if (z) {
            mo3678K();
        } else {
            mo3752s();
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    /* renamed from: a */
    public void mo3697a(ArrayAdapter<String> arrayAdapter, AutoCompleteTextView autoCompleteTextView) {
        Dialog dialog = new Dialog(this);
        LinearLayout linearLayout = new LinearLayout(this);
        ListView listView = new ListView(this);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new C0004AK(this, autoCompleteTextView, dialog));
        linearLayout.setFocusable(true);
        listView.setBackgroundColor(Color.parseColor("#FFFFFF"));
        linearLayout.addView(listView, -1, -1);
        dialog.setContentView(linearLayout);
        dialog.setTitle(getString(2131755308));
        dialog.show();
    }

    /* renamed from: a */
    public final void mo3698a(ImageView imageView) {
        imageView.setTag(null);
        imageView.setImageResource(2131230821);
    }

    /* renamed from: a */
    public final void mo3699a(File file, File file2) {
        if (file.exists()) {
            FileChannel channel = new FileInputStream(file).getChannel();
            FileChannel channel2 = new FileOutputStream(file2).getChannel();
            if (!(channel2 == null || channel == null)) {
                channel2.transferFrom(channel, 0, channel.size());
            }
            if (channel != null) {
                channel.close();
            }
            if (channel2 != null) {
                channel2.close();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2] */
    /* renamed from: a */
    public final void mo3700a(String str) {
        new Builder(this).setTitle("Permission Request").setMessage(str).setCancelable(false).setPositiveButton(17039379, new C0105FL(this)).show();
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    /* renamed from: a */
    public void mo3701a(String str, String str2, String str3, String str4) {
        try {
            FragmentStatePagerSupport_Main.f2451d = true;
            Builder builder = new Builder(this);
            View inflate = getLayoutInflater().inflate(2131492955, null);
            builder.setView(inflate);
            EditText editText = (EditText) inflate.findViewById(2131296387);
            EditText editText2 = (EditText) inflate.findViewById(2131296389);
            ImageView imageView = (ImageView) inflate.findViewById(2131296498);
            ImageView imageView2 = (ImageView) inflate.findViewById(2131296499);
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) inflate.findViewById(2131296384);
            editText.setText(str2);
            editText2.setText(str3);
            autoCompleteTextView.setText(str4);
            ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367049, this.f2363b.mo457G());
            autoCompleteTextView.setThreshold(1);
            autoCompleteTextView.setAdapter(arrayAdapter);
            autoCompleteTextView.setOnItemClickListener(new C0023BK(this, autoCompleteTextView));
            autoCompleteTextView.setOnTouchListener(new C0047CK(this, autoCompleteTextView));
            this.f2372fa = editText2;
            editText2.requestFocus();
            imageView.setOnClickListener(new C0066DK(this));
            imageView2.setOnClickListener(new C0085EK(this, arrayAdapter, autoCompleteTextView));
            builder.setPositiveButton(getString(2131755359), new C0104FK(this));
            builder.setNegativeButton(getString(2131755358), new C0124GK(this));
            AlertDialog create = builder.create();
            create.getWindow().setSoftInputMode(4);
            create.show();
            Button button = create.getButton(-1);
            C0146HK hk = new C0146HK(this, editText2, autoCompleteTextView, editText, create);
            button.setOnClickListener(hk);
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    /* renamed from: a */
    public void mo3702a(String str, String str2, String str3, String str4, Handler handler) {
        try {
            FragmentStatePagerSupport_Main.f2451d = true;
            Builder builder = new Builder(this);
            View inflate = getLayoutInflater().inflate(2131492955, null);
            builder.setView(inflate);
            EditText editText = (EditText) inflate.findViewById(2131296387);
            EditText editText2 = (EditText) inflate.findViewById(2131296389);
            ImageView imageView = (ImageView) inflate.findViewById(2131296498);
            ImageView imageView2 = (ImageView) inflate.findViewById(2131296499);
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) inflate.findViewById(2131296384);
            String str5 = str2;
            editText.setText(str2);
            String str6 = str3;
            editText2.setText(str3);
            String str7 = str4;
            autoCompleteTextView.setText(str4);
            editText.setEnabled(false);
            ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367049, this.f2363b.mo457G());
            autoCompleteTextView.setThreshold(1);
            autoCompleteTextView.setAdapter(arrayAdapter);
            autoCompleteTextView.setOnItemClickListener(new C0166IK(this, autoCompleteTextView));
            autoCompleteTextView.setOnTouchListener(new C0185JK(this, autoCompleteTextView));
            this.f2372fa = editText2;
            editText2.requestFocus();
            imageView.setOnClickListener(new C0231LK(this));
            imageView2.setOnClickListener(new C0258MK(this, arrayAdapter, autoCompleteTextView));
            builder.setPositiveButton(getString(2131755359), new C0278NK(this));
            builder.setNegativeButton(getString(2131755358), new C0300OK(this));
            AlertDialog create = builder.create();
            create.getWindow().setSoftInputMode(4);
            create.show();
            Button button = create.getButton(-1);
            C0324PK pk = new C0324PK(this, autoCompleteTextView, create, str, editText, editText2, handler);
            button.setOnClickListener(pk);
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    /* renamed from: a */
    public void mo3703a(ArrayList<String> arrayList) {
        if (this.f2397s.getText().toString().length() > 0) {
            C0195JU ju = this.f2363b;
            String obj = this.f2387n.getText().toString();
            String obj2 = this.f2389o.getText().toString();
            StringBuilder sb = new StringBuilder();
            String str = Value.PERCENTAGE;
            sb.append(str);
            sb.append(this.f2397s.getText().toString());
            sb.append(str);
            arrayList = ju.mo559d(obj, obj2, sb.toString());
        }
        LayoutInflater layoutInflater = getLayoutInflater();
        int size = arrayList.size();
        if (this.f2340F.getChildCount() > 0) {
            this.f2340F.removeAllViews();
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (arrayList.get(i2) != null) {
                i++;
                if (i < 4) {
                    RelativeLayout relativeLayout = (RelativeLayout) layoutInflater.inflate(2131492907, null);
                    new LinearLayout.LayoutParams(-2, -2);
                    Button button = (Button) relativeLayout.findViewById(2131296352);
                    button.setText((CharSequence) arrayList.get(i2));
                    button.setOnClickListener(new C0813hL(this, (String) arrayList.get(i2)));
                    this.f2340F.addView(relativeLayout);
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2] */
    /* renamed from: a */
    public void mo3704a(boolean z) {
        Calendar.getInstance();
        new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        this.f2387n.setThreshold(1);
        this.f2389o.setThreshold(1);
        this.f2397s.setThreshold(1);
        mo3675H();
        if (z) {
            mo3673F();
        }
        this.f2409y.setOnClickListener(new C0918mL(this, z));
        this.f2387n.setOnItemClickListener(new C0940nL(this));
        this.f2389o.setOnItemClickListener(new C0988pL(this));
        this.f2387n.setOnTouchListener(new C1007qL(this));
        this.f2387n.addTextChangedListener(new C1029rL(this));
        this.f2389o.setOnTouchListener(new C1049sL(this));
        this.f2389o.addTextChangedListener(new C1069tL(this));
        this.f2397s.addTextChangedListener(new C1089uL(this));
        this.f2391p.setOnTouchListener(new C1109vL(this));
        this.f2391p.setCompoundDrawablesWithIntrinsicBounds(null, null, ContextCompat.getDrawable(this, 2131230906), null);
        this.f2342H.setVisibility(0);
        mo3755v();
        this.f2401u.setOnClickListener(new C1130wL(this));
        if (!z) {
            this.f2401u.setOnClickListener(new C1156xL(this));
            this.f2387n.setText(this.f2370ea);
            this.f2389o.setText(this.f2368da);
            this.f2397s.setText(this.f2360Z);
            this.f2393q.setText(this.f2358X);
            this.f2391p.setText(this.f2359Y);
            if (!this.f2362aa.equals("")) {
                StringBuilder sb = new StringBuilder();
                sb.append(C0195JU.f442b);
                sb.append(this.f2362aa);
                this.f2409y.setImageBitmap(C0195JU.m414a(sb.toString(), 100, 100));
                this.f2409y.setTag(this.f2362aa);
                this.f2409y.getLayoutParams().width = 100;
                this.f2409y.getLayoutParams().height = 70;
            }
            this.f2391p.requestFocus();
            this.f2391p.selectAll();
            mo3682O();
            mo3691a(4, 500);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    /* renamed from: a */
    public boolean mo3705a(String str, String str2, Context context) {
        C0623bL bLVar = new C0623bL(this);
        Builder builder = new Builder(context);
        builder.setTitle(str);
        builder.setMessage(str2);
        builder.setPositiveButton(getString(2131755137), new C0642cL(this, bLVar));
        builder.setNegativeButton(getString(2131755136), new C0731dL(this, bLVar));
        builder.show();
        try {
            Looper.loop();
        } catch (RuntimeException unused) {
        }
        return this.f2386ma;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    /* renamed from: b */
    public void mo3706b() {
        String str = "android.permission.SEND_SMS";
        if (!(ContextCompat.checkSelfPermission(this, str) == 0)) {
            ActivityCompat.requestPermissions(this, new String[]{str}, C0776fN.AppCompatTheme_windowFixedHeightMajor);
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2] */
    /* renamed from: b */
    public final void mo3707b(Intent intent) {
        if (intent != null) {
            try {
                File file = new File(C0195JU.f442b);
                if (!file.exists()) {
                    file.mkdirs();
                }
                String str = C0195JU.f442b;
                StringBuilder sb = new StringBuilder();
                sb.append(System.currentTimeMillis());
                sb.append(".jpg");
                File file2 = new File(str, sb.toString());
                file2.createNewFile();
                mo3699a(new File(this.f2363b.mo530b((Context) this, intent.getData())), file2);
                mo3721d(file2.getName());
            } catch (IOException | Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public void mo3708b(String str) {
        C0082EH t = this.f2363b.mo617t(str);
        if (!t.mo191f().equals("")) {
            this.f2365c = t.mo191f();
            this.f2367d = t.mo192g();
            this.f2375h = t.mo189e();
            this.f2373g = "0";
            this.f2369e = t.mo187d();
        }
    }

    /* renamed from: b */
    public final void mo3709b(List<C0232LL> list) {
        Collections.sort(this.f2346L, new C0695a(null));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    /* renamed from: b */
    public void mo3710b(boolean z) {
        if (z) {
            this.f2406wa = new ProgressDialog(this);
            this.f2406wa.setMessage(getString(2131755205));
            this.f2406wa.show();
            return;
        }
        this.f2406wa.hide();
    }

    /* renamed from: b */
    public final boolean mo3711b(int i, int i2) {
        int i3 = VERSION.SDK_INT;
        return i3 >= i && i3 <= i2;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    /* renamed from: b */
    public boolean mo3712b(String str, String str2, Context context) {
        C0544ZK zk = new C0544ZK(this);
        Builder builder = new Builder(context);
        builder.setTitle(str);
        builder.setMessage(str2);
        builder.setPositiveButton(getString(2131755137), new C0568_K(this, zk));
        builder.setNegativeButton(getString(2131755136), new C0599aL(this, zk));
        builder.show();
        try {
            Looper.loop();
        } catch (RuntimeException unused) {
        }
        return this.f2388na;
    }

    /* JADX WARNING: type inference failed for: r16v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r0v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity]
      assigns: [?[OBJECT, ARRAY]]
      uses: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity]
      mth insns count: 171
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void btn_cus_add(android.view.View r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = 1
            com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.f2451d = r1
            int r2 = r17.getId()
            r3 = 2131296347(0x7f09005b, float:1.8210608E38)
            if (r2 != r3) goto L_0x0010
            r2 = -1
            goto L_0x001c
        L_0x0010:
            int r2 = r17.getId()
            r3 = 2131296348(0x7f09005c, float:1.821061E38)
            if (r2 != r3) goto L_0x001b
            r2 = 1
            goto L_0x001c
        L_0x001b:
            r2 = 0
        L_0x001c:
            r16.mo3729l()
            boolean r3 = r16.mo3727j()
            if (r3 == 0) goto L_0x01ef
            if (r2 == 0) goto L_0x01cd
            android.widget.ImageView r3 = r0.f2409y     // Catch:{ Exception -> 0x01e0 }
            java.lang.Object r3 = r3.getTag()     // Catch:{ Exception -> 0x01e0 }
            java.lang.String r4 = "')"
            java.lang.String r5 = " )"
            java.lang.String r6 = "(select id from currency where name='"
            java.lang.String r7 = "0"
            java.lang.String r8 = "',"
            java.lang.String r9 = "',strftime('%Y-%m-%d','now'),'"
            java.lang.String r10 = ",'"
            java.lang.String r11 = "-"
            java.lang.String r12 = "'),"
            java.lang.String r13 = "','"
            java.lang.String r14 = ""
            java.lang.String r15 = ","
            if (r3 != 0) goto L_0x00d9
            JU r3 = r0.f2363b     // Catch:{ Exception -> 0x01e0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e0 }
            r1.<init>()     // Catch:{ Exception -> 0x01e0 }
            r17 = r7
            java.lang.String r7 = "insert into transactions (cus_id,out,[in],date_,remarks,now_,param2,curr_id) values((select b.id from customers as b where b.name='"
            r1.append(r7)     // Catch:{ Exception -> 0x01e0 }
            android.widget.AutoCompleteTextView r7 = r0.f2387n     // Catch:{ Exception -> 0x01e0 }
            android.text.Editable r7 = r7.getText()     // Catch:{ Exception -> 0x01e0 }
            r1.append(r7)     // Catch:{ Exception -> 0x01e0 }
            r1.append(r12)     // Catch:{ Exception -> 0x01e0 }
            android.widget.EditText r7 = r0.f2391p     // Catch:{ Exception -> 0x01e0 }
            android.text.Editable r7 = r7.getText()     // Catch:{ Exception -> 0x01e0 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x01e0 }
            java.lang.String r7 = r7.replaceAll(r15, r14)     // Catch:{ Exception -> 0x01e0 }
            java.lang.String r7 = r7.replaceAll(r11, r14)     // Catch:{ Exception -> 0x01e0 }
            r1.append(r7)     // Catch:{ Exception -> 0x01e0 }
            r1.append(r15)     // Catch:{ Exception -> 0x01e0 }
            r1.append(r2)     // Catch:{ Exception -> 0x01e0 }
            r1.append(r10)     // Catch:{ Exception -> 0x01e0 }
            android.widget.TextView r2 = r0.f2395r     // Catch:{ Exception -> 0x01e0 }
            java.lang.CharSequence r2 = r2.getText()     // Catch:{ Exception -> 0x01e0 }
            r1.append(r2)     // Catch:{ Exception -> 0x01e0 }
            r1.append(r13)     // Catch:{ Exception -> 0x01e0 }
            android.widget.AutoCompleteTextView r2 = r0.f2399t     // Catch:{ Exception -> 0x01e0 }
            android.text.Editable r2 = r2.getText()     // Catch:{ Exception -> 0x01e0 }
            r1.append(r2)     // Catch:{ Exception -> 0x01e0 }
            r1.append(r9)     // Catch:{ Exception -> 0x01e0 }
            JU r2 = r0.f2363b     // Catch:{ Exception -> 0x01e0 }
            java.lang.String r2 = r2.mo470M()     // Catch:{ Exception -> 0x01e0 }
            r1.append(r2)     // Catch:{ Exception -> 0x01e0 }
            r1.append(r8)     // Catch:{ Exception -> 0x01e0 }
            android.widget.RadioGroup r2 = r0.f2343I     // Catch:{ Exception -> 0x01e0 }
            java.lang.Object r2 = r2.getTag()     // Catch:{ Exception -> 0x01e0 }
            if (r2 != 0) goto L_0x00ae
            r7 = r17
            goto L_0x00ca
        L_0x00ae:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e0 }
            r2.<init>()     // Catch:{ Exception -> 0x01e0 }
            r2.append(r6)     // Catch:{ Exception -> 0x01e0 }
            android.widget.RadioGroup r6 = r0.f2343I     // Catch:{ Exception -> 0x01e0 }
            java.lang.Object r6 = r6.getTag()     // Catch:{ Exception -> 0x01e0 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x01e0 }
            r2.append(r6)     // Catch:{ Exception -> 0x01e0 }
            r2.append(r4)     // Catch:{ Exception -> 0x01e0 }
            java.lang.String r7 = r2.toString()     // Catch:{ Exception -> 0x01e0 }
        L_0x00ca:
            r1.append(r7)     // Catch:{ Exception -> 0x01e0 }
            r1.append(r5)     // Catch:{ Exception -> 0x01e0 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x01e0 }
            r3.mo562d(r1)     // Catch:{ Exception -> 0x01e0 }
            goto L_0x0179
        L_0x00d9:
            r17 = r7
            JU r1 = r0.f2363b     // Catch:{ Exception -> 0x01e0 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e0 }
            r3.<init>()     // Catch:{ Exception -> 0x01e0 }
            java.lang.String r7 = "insert into transactions (cus_id,out,[in],date_,remarks,now_,param1,param2,curr_id) values((select b.id from customers as b where b.name='"
            r3.append(r7)     // Catch:{ Exception -> 0x01e0 }
            android.widget.AutoCompleteTextView r7 = r0.f2387n     // Catch:{ Exception -> 0x01e0 }
            android.text.Editable r7 = r7.getText()     // Catch:{ Exception -> 0x01e0 }
            r3.append(r7)     // Catch:{ Exception -> 0x01e0 }
            r3.append(r12)     // Catch:{ Exception -> 0x01e0 }
            android.widget.EditText r7 = r0.f2391p     // Catch:{ Exception -> 0x01e0 }
            android.text.Editable r7 = r7.getText()     // Catch:{ Exception -> 0x01e0 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x01e0 }
            java.lang.String r7 = r7.replaceAll(r15, r14)     // Catch:{ Exception -> 0x01e0 }
            java.lang.String r7 = r7.replaceAll(r11, r14)     // Catch:{ Exception -> 0x01e0 }
            r3.append(r7)     // Catch:{ Exception -> 0x01e0 }
            r3.append(r15)     // Catch:{ Exception -> 0x01e0 }
            r3.append(r2)     // Catch:{ Exception -> 0x01e0 }
            r3.append(r10)     // Catch:{ Exception -> 0x01e0 }
            android.widget.TextView r2 = r0.f2395r     // Catch:{ Exception -> 0x01e0 }
            java.lang.CharSequence r2 = r2.getText()     // Catch:{ Exception -> 0x01e0 }
            r3.append(r2)     // Catch:{ Exception -> 0x01e0 }
            r3.append(r13)     // Catch:{ Exception -> 0x01e0 }
            android.widget.AutoCompleteTextView r2 = r0.f2399t     // Catch:{ Exception -> 0x01e0 }
            android.text.Editable r2 = r2.getText()     // Catch:{ Exception -> 0x01e0 }
            r3.append(r2)     // Catch:{ Exception -> 0x01e0 }
            r3.append(r9)     // Catch:{ Exception -> 0x01e0 }
            android.widget.ImageView r2 = r0.f2409y     // Catch:{ Exception -> 0x01e0 }
            java.lang.Object r2 = r2.getTag()     // Catch:{ Exception -> 0x01e0 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x01e0 }
            r3.append(r2)     // Catch:{ Exception -> 0x01e0 }
            r3.append(r13)     // Catch:{ Exception -> 0x01e0 }
            JU r2 = r0.f2363b     // Catch:{ Exception -> 0x01e0 }
            java.lang.String r2 = r2.mo470M()     // Catch:{ Exception -> 0x01e0 }
            r3.append(r2)     // Catch:{ Exception -> 0x01e0 }
            r3.append(r8)     // Catch:{ Exception -> 0x01e0 }
            android.widget.RadioGroup r2 = r0.f2343I     // Catch:{ Exception -> 0x01e0 }
            java.lang.Object r2 = r2.getTag()     // Catch:{ Exception -> 0x01e0 }
            if (r2 != 0) goto L_0x0150
            r7 = r17
            goto L_0x016c
        L_0x0150:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e0 }
            r2.<init>()     // Catch:{ Exception -> 0x01e0 }
            r2.append(r6)     // Catch:{ Exception -> 0x01e0 }
            android.widget.RadioGroup r6 = r0.f2343I     // Catch:{ Exception -> 0x01e0 }
            java.lang.Object r6 = r6.getTag()     // Catch:{ Exception -> 0x01e0 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x01e0 }
            r2.append(r6)     // Catch:{ Exception -> 0x01e0 }
            r2.append(r4)     // Catch:{ Exception -> 0x01e0 }
            java.lang.String r7 = r2.toString()     // Catch:{ Exception -> 0x01e0 }
        L_0x016c:
            r3.append(r7)     // Catch:{ Exception -> 0x01e0 }
            r3.append(r5)     // Catch:{ Exception -> 0x01e0 }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x01e0 }
            r1.mo562d(r2)     // Catch:{ Exception -> 0x01e0 }
        L_0x0179:
            android.widget.EditText r1 = r0.f2391p     // Catch:{ Exception -> 0x01e0 }
            r2 = 0
            r1.setText(r2)     // Catch:{ Exception -> 0x01e0 }
            java.util.Calendar r1 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x01e0 }
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x01e0 }
            java.lang.String r4 = "dd-MM-yyyy"
            java.util.Locale r5 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x01e0 }
            r3.<init>(r4, r5)     // Catch:{ Exception -> 0x01e0 }
            android.widget.TextView r4 = r0.f2395r     // Catch:{ Exception -> 0x01e0 }
            java.util.Date r5 = r1.getTime()     // Catch:{ Exception -> 0x01e0 }
            java.lang.String r3 = r3.format(r5)     // Catch:{ Exception -> 0x01e0 }
            r4.setText(r3)     // Catch:{ Exception -> 0x01e0 }
            r3 = 1
            int r4 = r1.get(r3)     // Catch:{ Exception -> 0x01e0 }
            r0.f2381k = r4     // Catch:{ Exception -> 0x01e0 }
            r3 = 2
            int r3 = r1.get(r3)     // Catch:{ Exception -> 0x01e0 }
            r0.f2383l = r3     // Catch:{ Exception -> 0x01e0 }
            r3 = 5
            int r1 = r1.get(r3)     // Catch:{ Exception -> 0x01e0 }
            r0.f2385m = r1     // Catch:{ Exception -> 0x01e0 }
            android.widget.AutoCompleteTextView r1 = r0.f2399t     // Catch:{ Exception -> 0x01e0 }
            r1.setText(r2)     // Catch:{ Exception -> 0x01e0 }
            android.widget.ImageView r1 = r0.f2409y     // Catch:{ Exception -> 0x01e0 }
            r0.mo3698a(r1)     // Catch:{ Exception -> 0x01e0 }
            int r1 = r0.f2354T     // Catch:{ Exception -> 0x01e0 }
            r2 = 1
            if (r1 != r2) goto L_0x01c3
            android.widget.EditText r1 = r0.f2391p     // Catch:{ Exception -> 0x01e0 }
            r1.requestFocus()     // Catch:{ Exception -> 0x01e0 }
            goto L_0x01cd
        L_0x01c3:
            android.widget.AutoCompleteTextView r1 = r0.f2387n     // Catch:{ Exception -> 0x01e0 }
            r1.selectAll()     // Catch:{ Exception -> 0x01e0 }
            android.widget.AutoCompleteTextView r1 = r0.f2387n     // Catch:{ Exception -> 0x01e0 }
            r1.requestFocus()     // Catch:{ Exception -> 0x01e0 }
        L_0x01cd:
            r16.mo3758y()     // Catch:{ Exception -> 0x01e0 }
            r1 = 1
            r0.mo3704a(r1)     // Catch:{ Exception -> 0x01e0 }
            java.util.List<LL> r1 = r0.f2346L     // Catch:{ Exception -> 0x01e0 }
            int r1 = r1.size()     // Catch:{ Exception -> 0x01e0 }
            if (r1 <= 0) goto L_0x01ef
            r16.mo3683P()     // Catch:{ Exception -> 0x01e0 }
            goto L_0x01ef
        L_0x01e0:
            android.content.Context r1 = r16.getApplicationContext()
            r2 = 2131755389(0x7f10017d, float:1.9141656E38)
            java.lang.String r2 = r0.getString(r2)
            r3 = 1
            android.widget.Toast.makeText(r1, r2, r3)
        L_0x01ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2.btn_cus_add(android.view.View):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    public void btn_cus_remove(View view) {
        FragmentStatePagerSupport_Main.f2451d = true;
        Builder builder = new Builder(this);
        builder.setMessage(getString(2131755166));
        this.f2377i = Integer.parseInt(((TextView) ((RelativeLayout) ((View) view.getParent()).getParent()).findViewById(2131296680)).getText().toString());
        builder.setPositiveButton(getString(2131755137), new C0344QK(this));
        builder.setNegativeButton(getString(2131755136), new C0366RK(this));
        builder.create().show();
    }

    /* JADX WARNING: type inference failed for: r16v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r0v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity]
      assigns: [?[OBJECT, ARRAY]]
      uses: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity]
      mth insns count: 162
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void btn_cus_save(android.view.View r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = 1
            com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.f2451d = r1
            android.widget.RadioButton r2 = r0.f2333A
            boolean r2 = r2.isChecked()
            if (r2 == 0) goto L_0x000f
            r2 = -1
            goto L_0x001a
        L_0x000f:
            android.widget.RadioButton r2 = r0.f2335B
            boolean r2 = r2.isChecked()
            if (r2 == 0) goto L_0x0019
            r2 = 1
            goto L_0x001a
        L_0x0019:
            r2 = 0
        L_0x001a:
            r16.mo3729l()
            boolean r4 = r16.mo3731n()
            if (r4 == 0) goto L_0x01dd
            android.widget.Button r4 = r0.f2401u     // Catch:{ Exception -> 0x01ce }
            java.lang.CharSequence r4 = r4.getText()     // Catch:{ Exception -> 0x01ce }
            r5 = 2131755108(0x7f100064, float:1.9141086E38)
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x01ce }
            boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x01ce }
            if (r4 == 0) goto L_0x01c6
            int r4 = r0.f2377i     // Catch:{ Exception -> 0x01ce }
            if (r4 == 0) goto L_0x01c6
            android.widget.ImageView r4 = r0.f2409y     // Catch:{ Exception -> 0x01ce }
            java.lang.Object r4 = r4.getTag()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r5 = "')"
            java.lang.String r6 = "'"
            java.lang.String r7 = " where id='"
            java.lang.String r8 = "(select id from currency where name='"
            java.lang.String r9 = "0"
            java.lang.String r10 = "',remarks='"
            java.lang.String r11 = "',date_='"
            java.lang.String r12 = "',[in]='"
            java.lang.String r13 = "-"
            java.lang.String r14 = ","
            java.lang.String r15 = "update transactions set out='"
            java.lang.String r3 = ""
            if (r4 != 0) goto L_0x00d8
            JU r4 = r0.f2363b     // Catch:{ Exception -> 0x01ce }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ce }
            r1.<init>()     // Catch:{ Exception -> 0x01ce }
            r1.append(r15)     // Catch:{ Exception -> 0x01ce }
            android.widget.EditText r15 = r0.f2391p     // Catch:{ Exception -> 0x01ce }
            android.text.Editable r15 = r15.getText()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r15 = r15.toString()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r14 = r15.replaceAll(r14, r3)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r3 = r14.replaceAll(r13, r3)     // Catch:{ Exception -> 0x01ce }
            r1.append(r3)     // Catch:{ Exception -> 0x01ce }
            r1.append(r12)     // Catch:{ Exception -> 0x01ce }
            r1.append(r2)     // Catch:{ Exception -> 0x01ce }
            r1.append(r11)     // Catch:{ Exception -> 0x01ce }
            android.widget.TextView r2 = r0.f2393q     // Catch:{ Exception -> 0x01ce }
            java.lang.CharSequence r2 = r2.getText()     // Catch:{ Exception -> 0x01ce }
            r1.append(r2)     // Catch:{ Exception -> 0x01ce }
            r1.append(r10)     // Catch:{ Exception -> 0x01ce }
            android.widget.AutoCompleteTextView r2 = r0.f2397s     // Catch:{ Exception -> 0x01ce }
            android.text.Editable r2 = r2.getText()     // Catch:{ Exception -> 0x01ce }
            r1.append(r2)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r2 = "',param1='',curr_id="
            r1.append(r2)     // Catch:{ Exception -> 0x01ce }
            android.widget.RadioGroup r2 = r0.f2343I     // Catch:{ Exception -> 0x01ce }
            java.lang.Object r2 = r2.getTag()     // Catch:{ Exception -> 0x01ce }
            if (r2 != 0) goto L_0x00a5
            goto L_0x00c1
        L_0x00a5:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ce }
            r2.<init>()     // Catch:{ Exception -> 0x01ce }
            r2.append(r8)     // Catch:{ Exception -> 0x01ce }
            android.widget.RadioGroup r3 = r0.f2343I     // Catch:{ Exception -> 0x01ce }
            java.lang.Object r3 = r3.getTag()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01ce }
            r2.append(r3)     // Catch:{ Exception -> 0x01ce }
            r2.append(r5)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r9 = r2.toString()     // Catch:{ Exception -> 0x01ce }
        L_0x00c1:
            r1.append(r9)     // Catch:{ Exception -> 0x01ce }
            r1.append(r7)     // Catch:{ Exception -> 0x01ce }
            int r2 = r0.f2377i     // Catch:{ Exception -> 0x01ce }
            r1.append(r2)     // Catch:{ Exception -> 0x01ce }
            r1.append(r6)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x01ce }
            r4.mo562d(r1)     // Catch:{ Exception -> 0x01ce }
            goto L_0x0166
        L_0x00d8:
            JU r1 = r0.f2363b     // Catch:{ Exception -> 0x01ce }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ce }
            r4.<init>()     // Catch:{ Exception -> 0x01ce }
            r4.append(r15)     // Catch:{ Exception -> 0x01ce }
            android.widget.EditText r15 = r0.f2391p     // Catch:{ Exception -> 0x01ce }
            android.text.Editable r15 = r15.getText()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r15 = r15.toString()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r14 = r15.replaceAll(r14, r3)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r3 = r14.replaceAll(r13, r3)     // Catch:{ Exception -> 0x01ce }
            r4.append(r3)     // Catch:{ Exception -> 0x01ce }
            r4.append(r12)     // Catch:{ Exception -> 0x01ce }
            r4.append(r2)     // Catch:{ Exception -> 0x01ce }
            r4.append(r11)     // Catch:{ Exception -> 0x01ce }
            android.widget.TextView r2 = r0.f2393q     // Catch:{ Exception -> 0x01ce }
            java.lang.CharSequence r2 = r2.getText()     // Catch:{ Exception -> 0x01ce }
            r4.append(r2)     // Catch:{ Exception -> 0x01ce }
            r4.append(r10)     // Catch:{ Exception -> 0x01ce }
            android.widget.AutoCompleteTextView r2 = r0.f2397s     // Catch:{ Exception -> 0x01ce }
            android.text.Editable r2 = r2.getText()     // Catch:{ Exception -> 0x01ce }
            r4.append(r2)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r2 = "',param1='"
            r4.append(r2)     // Catch:{ Exception -> 0x01ce }
            android.widget.ImageView r2 = r0.f2409y     // Catch:{ Exception -> 0x01ce }
            java.lang.Object r2 = r2.getTag()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x01ce }
            r4.append(r2)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r2 = "',curr_id="
            r4.append(r2)     // Catch:{ Exception -> 0x01ce }
            android.widget.RadioGroup r2 = r0.f2343I     // Catch:{ Exception -> 0x01ce }
            java.lang.Object r2 = r2.getTag()     // Catch:{ Exception -> 0x01ce }
            if (r2 != 0) goto L_0x0135
            goto L_0x0151
        L_0x0135:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ce }
            r2.<init>()     // Catch:{ Exception -> 0x01ce }
            r2.append(r8)     // Catch:{ Exception -> 0x01ce }
            android.widget.RadioGroup r3 = r0.f2343I     // Catch:{ Exception -> 0x01ce }
            java.lang.Object r3 = r3.getTag()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01ce }
            r2.append(r3)     // Catch:{ Exception -> 0x01ce }
            r2.append(r5)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r9 = r2.toString()     // Catch:{ Exception -> 0x01ce }
        L_0x0151:
            r4.append(r9)     // Catch:{ Exception -> 0x01ce }
            r4.append(r7)     // Catch:{ Exception -> 0x01ce }
            int r2 = r0.f2377i     // Catch:{ Exception -> 0x01ce }
            r4.append(r2)     // Catch:{ Exception -> 0x01ce }
            r4.append(r6)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x01ce }
            r1.mo562d(r2)     // Catch:{ Exception -> 0x01ce }
        L_0x0166:
            android.widget.EditText r1 = r0.f2391p     // Catch:{ Exception -> 0x01ce }
            r2 = 0
            r1.setText(r2)     // Catch:{ Exception -> 0x01ce }
            java.util.Calendar r1 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x01ce }
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x01ce }
            java.lang.String r4 = "dd-MM-yyyy"
            java.util.Locale r5 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x01ce }
            r3.<init>(r4, r5)     // Catch:{ Exception -> 0x01ce }
            android.widget.TextView r4 = r0.f2393q     // Catch:{ Exception -> 0x01ce }
            java.util.Date r5 = r1.getTime()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r5 = r3.format(r5)     // Catch:{ Exception -> 0x01ce }
            r4.setText(r5)     // Catch:{ Exception -> 0x01ce }
            android.widget.TextView r4 = r0.f2395r     // Catch:{ Exception -> 0x01ce }
            java.util.Date r5 = r1.getTime()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r3 = r3.format(r5)     // Catch:{ Exception -> 0x01ce }
            r4.setText(r3)     // Catch:{ Exception -> 0x01ce }
            r3 = 1
            int r4 = r1.get(r3)     // Catch:{ Exception -> 0x01ce }
            r0.f2381k = r4     // Catch:{ Exception -> 0x01ce }
            r3 = 2
            int r3 = r1.get(r3)     // Catch:{ Exception -> 0x01ce }
            r0.f2383l = r3     // Catch:{ Exception -> 0x01ce }
            r3 = 5
            int r1 = r1.get(r3)     // Catch:{ Exception -> 0x01ce }
            r0.f2385m = r1     // Catch:{ Exception -> 0x01ce }
            android.widget.AutoCompleteTextView r1 = r0.f2397s     // Catch:{ Exception -> 0x01ce }
            r1.setText(r2)     // Catch:{ Exception -> 0x01ce }
            android.widget.ImageView r1 = r0.f2409y     // Catch:{ Exception -> 0x01ce }
            r0.mo3698a(r1)     // Catch:{ Exception -> 0x01ce }
            android.widget.AutoCompleteTextView r1 = r0.f2399t     // Catch:{ Exception -> 0x01ce }
            r1.setText(r2)     // Catch:{ Exception -> 0x01ce }
            android.widget.Button r1 = r0.f2401u     // Catch:{ Exception -> 0x01ce }
            r2 = 2131755103(0x7f10005f, float:1.9141076E38)
            java.lang.String r2 = r0.getString(r2)     // Catch:{ Exception -> 0x01ce }
            r1.setText(r2)     // Catch:{ Exception -> 0x01ce }
            r1 = 0
            r0.f2377i = r1     // Catch:{ Exception -> 0x01ce }
        L_0x01c6:
            r16.mo3758y()     // Catch:{ Exception -> 0x01ce }
            r1 = 1
            r0.mo3704a(r1)     // Catch:{ Exception -> 0x01ce }
            goto L_0x01dd
        L_0x01ce:
            android.content.Context r1 = r16.getApplicationContext()
            r2 = 2131755389(0x7f10017d, float:1.9141656E38)
            java.lang.String r2 = r0.getString(r2)
            r3 = 1
            android.widget.Toast.makeText(r1, r2, r3)
        L_0x01dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2.btn_cus_save(android.view.View):void");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    /* renamed from: c */
    public void mo3716c() {
        String str = "android.permission.WRITE_EXTERNAL_STORAGE";
        if (!(ContextCompat.checkSelfPermission(this, str) == 0)) {
            ActivityCompat.requestPermissions(this, new String[]{str}, C0776fN.AppCompatTheme_windowActionBarOverlay);
        }
    }

    /* renamed from: c */
    public void mo3717c(String str) {
        C0302OM om = this.f2345K;
        if (om != null) {
            om.getFilter().filter(str);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    /* renamed from: c */
    public boolean mo3718c(String str, String str2, Context context) {
        C0834iL iLVar = new C0834iL(this);
        Builder builder = new Builder(context);
        builder.setTitle(str);
        builder.setMessage(str2);
        builder.setPositiveButton(getString(2131755137), new C0854jL(this, iLVar));
        builder.setNegativeButton(getString(2131755136), new C0874kL(this, iLVar));
        builder.show();
        try {
            Looper.loop();
        } catch (RuntimeException unused) {
        }
        return this.f2398sa;
    }

    public void calc_pick_btn(View view) {
        Intent intent = new Intent(view.getContext(), Calculator.class);
        intent.putExtra("tr_amount", this.f2391p.getText().toString());
        startActivityForResult(intent, 2);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    /* renamed from: d */
    public void mo3720d() {
        String str = "android.permission.WRITE_CONTACTS";
        if (!(ContextCompat.checkSelfPermission(this, str) == 0)) {
            ActivityCompat.requestPermissions(this, new String[]{str}, C0776fN.AppCompatTheme_windowActionModeOverlay);
        }
    }

    /* renamed from: d */
    public void mo3721d(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(C0195JU.f442b);
            sb.append(str);
            Bitmap a = C0195JU.m414a(sb.toString(), 300, 300);
            if (!this.f2392pa) {
                this.f2409y.getLayoutParams().width = (int) getResources().getDimension(2131165265);
                this.f2409y.getLayoutParams().height = (int) getResources().getDimension(2131165262);
                this.f2409y.setImageBitmap(a);
            } else {
                this.f2409y.getLayoutParams().width = (int) getResources().getDimension(2131165265);
                this.f2409y.getLayoutParams().height = (int) getResources().getDimension(2131165262);
                this.f2409y.setImageBitmap(a);
            }
            this.f2409y.setTag(str);
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public void mo3722e() {
        mo3706b();
        this.f2378ia = 3;
        String str = this.f2375h;
        if (str == null || str.length() < 3) {
            mo3701a(this.f2365c, this.f2367d, this.f2375h, this.f2369e);
            return;
        }
        C0232LL e = this.f2363b.mo563e(this.f2367d);
        C0195JU ju = this.f2363b;
        ju.mo516a(this.f2375h, ju.mo529b(e, this.f2367d, Double.parseDouble(e.f615k)));
        if (!e.mo774e().equals("") && e.mo776g().length() > 8) {
            this.f2363b.mo516a(e.mo776g(), this.f2363b.mo549c(e, e.mo774e(), Double.parseDouble(e.mo772d())));
        }
    }

    /* renamed from: f */
    public boolean mo3723f() {
        boolean z;
        C0195JU ju;
        String str;
        String sb;
        String str2;
        mo3730m();
        if (!mo3728k()) {
            return false;
        }
        try {
            String str3 = "')";
            String str4 = ")";
            String str5 = "(select id from currency where name='";
            String str6 = "0";
            String str7 = "',";
            String str8 = "',strftime('%Y-%m-%d','now'),'";
            String str9 = ",'";
            String str10 = "-";
            String str11 = "'),";
            String str12 = "'),(select b.id from customers as b where b.name='";
            String str13 = "','";
            String str14 = "";
            String str15 = ",";
            if (this.f2409y.getTag() == null) {
                ju = this.f2363b;
                StringBuilder sb2 = new StringBuilder();
                String str16 = str6;
                sb2.append("insert into transactions (cus_id,t_cus_id,out,[in],date_,remarks,now_,param2,curr_id) values((select b.id from customers as b where b.name='");
                sb2.append(this.f2387n.getText().toString());
                sb2.append(str12);
                sb2.append(this.f2389o.getText().toString());
                sb2.append(str11);
                sb2.append(this.f2391p.getText().toString().replaceAll(str15, str14).replaceAll(str10, str14));
                sb2.append(str15);
                sb2.append(1);
                sb2.append(str9);
                sb2.append(this.f2393q.getText());
                sb2.append(str13);
                sb2.append(this.f2397s.getText());
                sb2.append(str8);
                sb2.append(this.f2363b.mo470M());
                sb2.append(str7);
                if (this.f2343I.getTag() == null) {
                    str2 = str16;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str5);
                    sb3.append(this.f2343I.getTag().toString());
                    sb3.append(str3);
                    str2 = sb3.toString();
                }
                sb2.append(str2);
                sb2.append(str4);
                sb = sb2.toString();
            } else {
                String str17 = str6;
                ju = this.f2363b;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("insert into transactions (cus_id,t_cus_id,out,[in],date_,remarks,now_,param1,param2,curr_id) values((select b.id from customers as b where b.name='");
                sb4.append(this.f2387n.getText().toString());
                sb4.append(str12);
                sb4.append(this.f2389o.getText().toString());
                sb4.append(str11);
                sb4.append(this.f2391p.getText().toString().replaceAll(str15, str14).replaceAll(str10, str14));
                sb4.append(str15);
                sb4.append(1);
                sb4.append(str9);
                sb4.append(this.f2393q.getText());
                sb4.append(str13);
                sb4.append(this.f2397s.getText());
                sb4.append(str8);
                sb4.append(this.f2409y.getTag().toString());
                sb4.append(str13);
                sb4.append(this.f2363b.mo470M());
                sb4.append(str7);
                if (this.f2343I.getTag() == null) {
                    str = str17;
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(str5);
                    sb5.append(this.f2343I.getTag().toString());
                    sb5.append(str3);
                    str = sb5.toString();
                }
                sb4.append(str);
                sb4.append(str4);
                sb = sb4.toString();
            }
            ju.mo562d(sb);
            mo3708b(this.f2387n.getText().toString());
            mo3684Q();
            mo3675H();
            Calendar instance = Calendar.getInstance();
            new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
            this.f2381k = instance.get(1);
            this.f2383l = instance.get(2);
            this.f2385m = instance.get(5);
            mo3698a(this.f2409y);
            this.f2397s.setText(null);
            try {
                FragmentStatePagerSupport_Main.f2451d = true;
                if (this.f2346L.size() > 0) {
                    mo3683P();
                }
                return true;
            } catch (Exception unused) {
                z = true;
                return z;
            }
        } catch (Exception unused2) {
            z = false;
            return z;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity]
      assigns: [?[OBJECT, ARRAY]]
      uses: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity, android.content.Context]
      mth insns count: 169
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3724g() {
        /*
            r16 = this;
            r0 = r16
            int r1 = r0.f2366ca
            int[] r2 = r0.f2357W
            r3 = 0
            r4 = r2[r3]
            r5 = 2
            if (r1 != r4) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r2 = r2[r5]
        L_0x000f:
            r16.mo3730m()
            boolean r1 = r16.mo3728k()
            if (r1 == 0) goto L_0x01ee
            r1 = 1
            android.widget.Button r2 = r0.f2401u     // Catch:{ Exception -> 0x01e2 }
            java.lang.CharSequence r2 = r2.getText()     // Catch:{ Exception -> 0x01e2 }
            r4 = 2131755108(0x7f100064, float:1.9141086E38)
            java.lang.String r4 = r0.getString(r4)     // Catch:{ Exception -> 0x01e2 }
            boolean r2 = r2.equals(r4)     // Catch:{ Exception -> 0x01e2 }
            if (r2 == 0) goto L_0x01d4
            int r2 = r0.f2377i     // Catch:{ Exception -> 0x01e2 }
            if (r2 == 0) goto L_0x01d4
            android.widget.ImageView r2 = r0.f2409y     // Catch:{ Exception -> 0x01e2 }
            java.lang.Object r2 = r2.getTag()     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r4 = "'"
            java.lang.String r6 = " where id='"
            java.lang.String r7 = "(select id from currency where name='"
            java.lang.String r8 = "0"
            java.lang.String r9 = "') ,curr_id="
            java.lang.String r10 = "') ,cus_id=(select id from customers where name='"
            java.lang.String r11 = "',remarks='"
            java.lang.String r12 = "',date_='"
            java.lang.String r13 = "-"
            java.lang.String r14 = ","
            java.lang.String r15 = "update transactions set out='"
            java.lang.String r3 = ""
            if (r2 != 0) goto L_0x00ea
            JU r2 = r0.f2363b     // Catch:{ Exception -> 0x01e2 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e2 }
            r5.<init>()     // Catch:{ Exception -> 0x01e2 }
            r5.append(r15)     // Catch:{ Exception -> 0x01e2 }
            android.widget.EditText r15 = r0.f2391p     // Catch:{ Exception -> 0x01e2 }
            android.text.Editable r15 = r15.getText()     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r15 = r15.toString()     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r14 = r15.replaceAll(r14, r3)     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r3 = r14.replaceAll(r13, r3)     // Catch:{ Exception -> 0x01e2 }
            r5.append(r3)     // Catch:{ Exception -> 0x01e2 }
            r5.append(r12)     // Catch:{ Exception -> 0x01e2 }
            android.widget.TextView r3 = r0.f2393q     // Catch:{ Exception -> 0x01e2 }
            java.lang.CharSequence r3 = r3.getText()     // Catch:{ Exception -> 0x01e2 }
            r5.append(r3)     // Catch:{ Exception -> 0x01e2 }
            r5.append(r11)     // Catch:{ Exception -> 0x01e2 }
            android.widget.AutoCompleteTextView r3 = r0.f2397s     // Catch:{ Exception -> 0x01e2 }
            android.text.Editable r3 = r3.getText()     // Catch:{ Exception -> 0x01e2 }
            r5.append(r3)     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r3 = "',param1='',t_cus_id=(select id from customers where name='"
            r5.append(r3)     // Catch:{ Exception -> 0x01e2 }
            android.widget.AutoCompleteTextView r3 = r0.f2389o     // Catch:{ Exception -> 0x01e2 }
            android.text.Editable r3 = r3.getText()     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01e2 }
            r5.append(r3)     // Catch:{ Exception -> 0x01e2 }
            r5.append(r10)     // Catch:{ Exception -> 0x01e2 }
            android.widget.AutoCompleteTextView r3 = r0.f2387n     // Catch:{ Exception -> 0x01e2 }
            android.text.Editable r3 = r3.getText()     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01e2 }
            r5.append(r3)     // Catch:{ Exception -> 0x01e2 }
            r5.append(r9)     // Catch:{ Exception -> 0x01e2 }
            android.widget.RadioGroup r3 = r0.f2343I     // Catch:{ Exception -> 0x01e2 }
            java.lang.Object r3 = r3.getTag()     // Catch:{ Exception -> 0x01e2 }
            if (r3 != 0) goto L_0x00b5
            goto L_0x00d3
        L_0x00b5:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e2 }
            r3.<init>()     // Catch:{ Exception -> 0x01e2 }
            r3.append(r7)     // Catch:{ Exception -> 0x01e2 }
            android.widget.RadioGroup r7 = r0.f2343I     // Catch:{ Exception -> 0x01e2 }
            java.lang.Object r7 = r7.getTag()     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x01e2 }
            r3.append(r7)     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r7 = "')"
            r3.append(r7)     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r8 = r3.toString()     // Catch:{ Exception -> 0x01e2 }
        L_0x00d3:
            r5.append(r8)     // Catch:{ Exception -> 0x01e2 }
            r5.append(r6)     // Catch:{ Exception -> 0x01e2 }
            int r3 = r0.f2377i     // Catch:{ Exception -> 0x01e2 }
            r5.append(r3)     // Catch:{ Exception -> 0x01e2 }
            r5.append(r4)     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r3 = r5.toString()     // Catch:{ Exception -> 0x01e2 }
        L_0x00e5:
            r2.mo562d(r3)     // Catch:{ Exception -> 0x01e2 }
            goto L_0x0193
        L_0x00ea:
            JU r2 = r0.f2363b     // Catch:{ Exception -> 0x01e2 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e2 }
            r5.<init>()     // Catch:{ Exception -> 0x01e2 }
            r5.append(r15)     // Catch:{ Exception -> 0x01e2 }
            android.widget.EditText r15 = r0.f2391p     // Catch:{ Exception -> 0x01e2 }
            android.text.Editable r15 = r15.getText()     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r15 = r15.toString()     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r14 = r15.replaceAll(r14, r3)     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r3 = r14.replaceAll(r13, r3)     // Catch:{ Exception -> 0x01e2 }
            r5.append(r3)     // Catch:{ Exception -> 0x01e2 }
            r5.append(r12)     // Catch:{ Exception -> 0x01e2 }
            android.widget.TextView r3 = r0.f2393q     // Catch:{ Exception -> 0x01e2 }
            java.lang.CharSequence r3 = r3.getText()     // Catch:{ Exception -> 0x01e2 }
            r5.append(r3)     // Catch:{ Exception -> 0x01e2 }
            r5.append(r11)     // Catch:{ Exception -> 0x01e2 }
            android.widget.AutoCompleteTextView r3 = r0.f2397s     // Catch:{ Exception -> 0x01e2 }
            android.text.Editable r3 = r3.getText()     // Catch:{ Exception -> 0x01e2 }
            r5.append(r3)     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r3 = "',param1='"
            r5.append(r3)     // Catch:{ Exception -> 0x01e2 }
            android.widget.ImageView r3 = r0.f2409y     // Catch:{ Exception -> 0x01e2 }
            java.lang.Object r3 = r3.getTag()     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01e2 }
            r5.append(r3)     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r3 = "',t_cus_id=(select id from customers where name='"
            r5.append(r3)     // Catch:{ Exception -> 0x01e2 }
            android.widget.AutoCompleteTextView r3 = r0.f2389o     // Catch:{ Exception -> 0x01e2 }
            android.text.Editable r3 = r3.getText()     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01e2 }
            r5.append(r3)     // Catch:{ Exception -> 0x01e2 }
            r5.append(r10)     // Catch:{ Exception -> 0x01e2 }
            android.widget.AutoCompleteTextView r3 = r0.f2387n     // Catch:{ Exception -> 0x01e2 }
            android.text.Editable r3 = r3.getText()     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01e2 }
            r5.append(r3)     // Catch:{ Exception -> 0x01e2 }
            r5.append(r9)     // Catch:{ Exception -> 0x01e2 }
            android.widget.RadioGroup r3 = r0.f2343I     // Catch:{ Exception -> 0x01e2 }
            java.lang.Object r3 = r3.getTag()     // Catch:{ Exception -> 0x01e2 }
            if (r3 != 0) goto L_0x0161
            goto L_0x017f
        L_0x0161:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e2 }
            r3.<init>()     // Catch:{ Exception -> 0x01e2 }
            r3.append(r7)     // Catch:{ Exception -> 0x01e2 }
            android.widget.RadioGroup r7 = r0.f2343I     // Catch:{ Exception -> 0x01e2 }
            java.lang.Object r7 = r7.getTag()     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x01e2 }
            r3.append(r7)     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r7 = "')"
            r3.append(r7)     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r8 = r3.toString()     // Catch:{ Exception -> 0x01e2 }
        L_0x017f:
            r5.append(r8)     // Catch:{ Exception -> 0x01e2 }
            r5.append(r6)     // Catch:{ Exception -> 0x01e2 }
            int r3 = r0.f2377i     // Catch:{ Exception -> 0x01e2 }
            r5.append(r3)     // Catch:{ Exception -> 0x01e2 }
            r5.append(r4)     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r3 = r5.toString()     // Catch:{ Exception -> 0x01e2 }
            goto L_0x00e5
        L_0x0193:
            android.widget.AutoCompleteTextView r2 = r0.f2387n     // Catch:{ Exception -> 0x01e2 }
            android.text.Editable r2 = r2.getText()     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x01e2 }
            r0.mo3708b(r2)     // Catch:{ Exception -> 0x01e2 }
            r16.mo3684Q()     // Catch:{ Exception -> 0x01e2 }
            r16.mo3675H()     // Catch:{ Exception -> 0x01e2 }
            java.util.Calendar r2 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x01e2 }
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r4 = "dd-MM-yyyy"
            java.util.Locale r5 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x01e2 }
            r3.<init>(r4, r5)     // Catch:{ Exception -> 0x01e2 }
            int r3 = r2.get(r1)     // Catch:{ Exception -> 0x01e2 }
            r0.f2381k = r3     // Catch:{ Exception -> 0x01e2 }
            r3 = 2
            int r3 = r2.get(r3)     // Catch:{ Exception -> 0x01e2 }
            r0.f2383l = r3     // Catch:{ Exception -> 0x01e2 }
            r3 = 5
            int r2 = r2.get(r3)     // Catch:{ Exception -> 0x01e2 }
            r0.f2385m = r2     // Catch:{ Exception -> 0x01e2 }
            android.widget.AutoCompleteTextView r2 = r0.f2397s     // Catch:{ Exception -> 0x01e2 }
            r3 = 0
            r2.setText(r3)     // Catch:{ Exception -> 0x01e2 }
            android.widget.ImageView r2 = r0.f2409y     // Catch:{ Exception -> 0x01e2 }
            r0.mo3698a(r2)     // Catch:{ Exception -> 0x01e2 }
            r3 = 1
            goto L_0x01d5
        L_0x01d4:
            r3 = 0
        L_0x01d5:
            android.widget.Button r2 = r0.f2401u     // Catch:{ Exception -> 0x01e3 }
            lL r4 = new lL     // Catch:{ Exception -> 0x01e3 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x01e3 }
            r2.setOnClickListener(r4)     // Catch:{ Exception -> 0x01e3 }
            com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.f2451d = r1     // Catch:{ Exception -> 0x01e3 }
            goto L_0x01ef
        L_0x01e2:
            r3 = 0
        L_0x01e3:
            r2 = 2131755389(0x7f10017d, float:1.9141656E38)
            java.lang.String r2 = r0.getString(r2)
            android.widget.Toast.makeText(r0, r2, r1)
            goto L_0x01ef
        L_0x01ee:
            r3 = 0
        L_0x01ef:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2.mo3724g():boolean");
    }

    /* renamed from: h */
    public void mo3725h() {
        C0288NU.m892a().mo934a(new C0356QU(16, this.f2345K, this.f2346L, new C0334PU()));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.support.v4.app.FragmentActivity] */
    /* renamed from: i */
    public final void mo3726i() {
        mo3716c();
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        this.f2384la = this.f2363b.mo494a((Context) this, intent);
        intent.putExtra(Tag.OUTPUT, this.f2384la);
        startActivityForResult(intent, this.f2374ga);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    /* renamed from: j */
    public final boolean mo3727j() {
        Log.d("IMEI=", "AFTER VALIDATION");
        boolean a = C0008AO.m5a(this.f2391p);
        if (!C0008AO.m5a(this.f2399t)) {
            a = false;
        }
        if (!C0008AO.m5a(this.f2387n)) {
            a = false;
        }
        if (this.f2363b.mo519a()) {
            mo3732o();
            this.f2401u.setError(getString(2131755238));
            return false;
        }
        this.f2401u.setError(null);
        return a;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    /* renamed from: k */
    public final boolean mo3728k() {
        boolean a = C0008AO.m5a(this.f2387n);
        if (!C0008AO.m5a(this.f2389o)) {
            a = false;
        }
        if (!C0008AO.m5a(this.f2391p)) {
            a = false;
        }
        if (!C0008AO.m5a(this.f2397s)) {
            a = false;
        }
        if (this.f2363b.mo519a()) {
            mo3732o();
            this.f2401u.setError(getString(2131755238));
            return false;
        }
        this.f2401u.setError(null);
        return a;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    /* renamed from: l */
    public final void mo3729l() {
        if (this.f2363b.mo590k(this.f2387n.getText().toString()) == 0 && this.f2387n.getText().toString().length() >= 1 && this.f2401u.getText().toString().equals(getString(2131755103))) {
            String string = getString(2131755419);
            StringBuilder sb = new StringBuilder();
            sb.append(getString(2131755419));
            sb.append(this.f2387n.getText());
            mo3705a(string, sb.toString(), (Context) this);
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    /* renamed from: m */
    public final void mo3730m() {
        if (this.f2363b.mo590k(this.f2389o.getText().toString()) == 0 && this.f2389o.getText().toString().length() >= 1 && this.f2401u.getText().toString().equals(getString(2131755108))) {
            String string = getString(2131755419);
            StringBuilder sb = new StringBuilder();
            sb.append(getString(2131755419));
            sb.append(this.f2389o.getText().toString());
            mo3718c(string, sb.toString(), this);
        }
        if (this.f2363b.mo590k(this.f2387n.getText().toString()) == 0 && this.f2387n.getText().toString().length() >= 1 && this.f2401u.getText().toString().equals(getString(2131755108))) {
            String string2 = getString(2131755419);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getString(2131755419));
            sb2.append(this.f2387n.getText().toString());
            mo3705a(string2, sb2.toString(), (Context) this);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    /* renamed from: n */
    public final boolean mo3731n() {
        boolean a = C0008AO.m5a(this.f2391p);
        if (!C0008AO.m5a(this.f2397s)) {
            a = false;
        }
        if (!C0008AO.m5a(this.f2387n)) {
            a = false;
        }
        if (this.f2363b.mo519a()) {
            mo3732o();
            this.f2401u.setError(getString(2131755238));
            return false;
        }
        this.f2401u.setError(null);
        return a;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2] */
    /* renamed from: o */
    public void mo3732o() {
        String str = "";
        try {
            if (this.f2363b.mo524a("black_list", false)) {
                this.f2363b.mo631x("black_date", str);
                this.f2363b.mo631x("black_date_done", str);
                this.f2363b.mo551c((Context) this);
            }
            if (this.f2363b.mo569f(C0195JU.f445e).getCount() != 0) {
                this.f2363b.mo534b((Context) this, C0195JU.f445e);
            }
            mo3720d();
            this.f2363b.mo582h((Context) this);
        } catch (Exception e) {
            Log.d("adv_search_error=", e.getMessage());
        }
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == 0) {
            return;
        }
        if (i == 2) {
            if (intent != null) {
                this.f2391p.setText(intent.getStringExtra("calc_result"));
            }
        } else if (i == 1) {
            if (i2 == -1) {
                String str = "data1";
                String str2 = "display_name";
                Cursor query = getContentResolver().query(intent.getData(), new String[]{str, str2}, null, null, null);
                query.moveToFirst();
                String string = query.getString(query.getColumnIndex(str));
                String string2 = query.getString(query.getColumnIndex(str2));
                this.f2372fa.setText(string);
                query.close();
                StringBuilder sb = new StringBuilder();
                sb.append("ZZZ number : ");
                sb.append(string);
                sb.append(" , name : ");
                sb.append(string2);
                Log.d("Phone=", sb.toString());
            }
        } else if (i == this.f2376ha) {
            mo3707b(intent);
        } else if (i == this.f2374ga) {
            mo3692a(intent);
        }
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|(1:6)|7|8|(3:10|(1:12)(1:13)|14)(1:15)|16|17|(7:19|(1:21)(1:23)|22|24|(1:26)(3:28|(1:30)|31)|27|31)|32|33|(3:35|(1:37)(1:38)|39)|40|(3:42|43|47)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|(1:6)|7|8|(3:10|(1:12)(1:13)|14)(1:15)|16|17|(7:19|(1:21)(1:23)|22|24|(1:26)(3:28|(1:30)|31)|27|31)|32|33|(3:35|(1:37)(1:38)|39)|40|42|43|47) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x01f8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x02ba */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x018c */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0196 A[Catch:{ Exception -> 0x01f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x01f3 A[Catch:{ Exception -> 0x01f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0202 A[Catch:{ Exception -> 0x02ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x02c4 A[Catch:{ Exception -> 0x02ef }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            java.lang.String r0 = "TR_ID"
            java.lang.String r1 = "read_imei"
            java.lang.String r2 = ""
            java.lang.String r3 = "G_NAME"
            java.lang.String r4 = "CUS_NAME"
            java.lang.String r5 = "CURR_NAME"
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2.super.onCreate(r13)
            r13 = 2131492913(0x7f0c0031, float:1.8609291E38)
            r12.setContentView(r13)
            r12.mo3679L()
            r13 = 2131755052(0x7f10002c, float:1.9140972E38)
            java.lang.String r13 = r12.getString(r13)
            r12.setTitle(r13)
            r13 = 2131296530(0x7f090112, float:1.821098E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.ListView r13 = (android.widget.ListView) r13
            r12.f2337C = r13
            r13 = 2131296440(0x7f0900b8, float:1.8210797E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            android.widget.ListView r13 = r12.f2337C
            r6 = 2
            r13.setChoiceMode(r6)
            JU r13 = new JU
            android.database.sqlite.SQLiteDatabase r7 = r12.f2361a
            r13.<init>(r7, r12)
            r12.f2363b = r13
            JU r13 = r12.f2363b
            r7 = 0
            java.lang.String r8 = "prefOthers_currency"
            boolean r13 = r13.mo524a(r8, r7)
            p000.C0195JU.f451k = r13
            r13 = 2131296470(0x7f0900d6, float:1.8210858E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.AutoCompleteTextView r13 = (android.widget.AutoCompleteTextView) r13
            r12.f2387n = r13
            r13 = 2131296667(0x7f09019b, float:1.8211257E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.AutoCompleteTextView r13 = (android.widget.AutoCompleteTextView) r13
            r12.f2389o = r13
            r13 = 2131296431(0x7f0900af, float:1.8210778E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.EditText r13 = (android.widget.EditText) r13
            r12.f2391p = r13
            android.widget.EditText r13 = r12.f2391p
            r8 = 1
            android.text.InputFilter[] r9 = new android.text.InputFilter[r8]
            QL r10 = new QL
            r10.<init>(r6)
            r9[r7] = r10
            r13.setFilters(r9)
            android.widget.EditText r13 = r12.f2391p
            dN r9 = new dN
            r9.<init>(r13)
            r13.addTextChangedListener(r9)
            r13 = 2131296433(0x7f0900b1, float:1.8210783E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r12.f2393q = r13
            r13 = 2131296349(0x7f09005d, float:1.8210612E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.Button r13 = (android.widget.Button) r13
            r12.f2401u = r13
            r13 = 2131296346(0x7f09005a, float:1.8210606E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r12.f2407x = r13
            android.widget.ImageView r13 = r12.f2407x
            KK r9 = new KK
            r9.<init>(r12)
            r13.setOnClickListener(r9)
            r13 = 2131296495(0x7f0900ef, float:1.8210908E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r12.f2351Q = r13
            r13 = 2131296435(0x7f0900b3, float:1.8210787E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.AutoCompleteTextView r13 = (android.widget.AutoCompleteTextView) r13
            r12.f2397s = r13
            r13 = 2131296344(0x7f090058, float:1.8210602E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r12.f2409y = r13
            r13 = 2131296416(0x7f0900a0, float:1.8210748E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            r12.f2338D = r13
            r13 = 2131296417(0x7f0900a1, float:1.821075E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            r12.f2339E = r13
            r13 = 2131296419(0x7f0900a3, float:1.8210754E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            r12.f2340F = r13
            r13 = 2131296420(0x7f0900a4, float:1.8210756E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            r12.f2341G = r13
            r13 = 2131296424(0x7f0900a8, float:1.8210764E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            r12.f2342H = r13
            r13 = 2131296584(0x7f090148, float:1.8211089E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.RadioGroup r13 = (android.widget.RadioGroup) r13
            r12.f2343I = r13
            java.util.Calendar r13 = java.util.Calendar.getInstance()
            java.text.SimpleDateFormat r9 = new java.text.SimpleDateFormat
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r11 = "dd-MM-yyyy"
            r9.<init>(r11, r10)
            android.widget.TextView r10 = r12.f2393q
            java.util.Date r11 = r13.getTime()
            java.lang.String r9 = r9.format(r11)
            r10.setText(r9)
            int r9 = r13.get(r8)
            r12.f2381k = r9
            int r9 = r13.get(r6)
            r12.f2383l = r9
            r9 = 5
            int r13 = r13.get(r9)
            r12.f2385m = r13
            android.widget.TextView r13 = r12.f2393q
            VK r9 = new VK
            r9.<init>(r12)
            r13.setOnClickListener(r9)
            r12.mo3759z()
            android.widget.ArrayAdapter r13 = new android.widget.ArrayAdapter
            java.lang.String[] r9 = r12.f2355U
            r10 = 17367050(0x109000a, float:2.5162954E-38)
            r13.<init>(r12, r10, r9)
            r12.f2348N = r13
            android.widget.AutoCompleteTextView r13 = r12.f2387n
            r13.setThreshold(r8)
            android.widget.AutoCompleteTextView r13 = r12.f2387n
            android.widget.ArrayAdapter<java.lang.String> r9 = r12.f2348N
            r13.setAdapter(r9)
            r12.mo3704a(r8)
            android.content.Intent r13 = r12.getIntent()     // Catch:{ Exception -> 0x018c }
            java.lang.String r13 = r13.getStringExtra(r1)     // Catch:{ Exception -> 0x018c }
            if (r13 == 0) goto L_0x018c
            android.content.Intent r13 = r12.getIntent()     // Catch:{ Exception -> 0x018c }
            java.lang.String r13 = r13.getStringExtra(r1)     // Catch:{ Exception -> 0x018c }
            java.lang.String r1 = "1"
            boolean r13 = r13.equals(r1)     // Catch:{ Exception -> 0x018c }
            if (r13 == 0) goto L_0x018c
            JU r13 = r12.f2363b     // Catch:{ Exception -> 0x018c }
            r13.mo481T()     // Catch:{ Exception -> 0x018c }
        L_0x018c:
            android.content.Intent r13 = r12.getIntent()     // Catch:{ Exception -> 0x01f8 }
            java.lang.String r13 = r13.getStringExtra(r4)     // Catch:{ Exception -> 0x01f8 }
            if (r13 == 0) goto L_0x01f3
            android.widget.AutoCompleteTextView r13 = r12.f2387n     // Catch:{ Exception -> 0x01f8 }
            android.content.Intent r1 = r12.getIntent()     // Catch:{ Exception -> 0x01f8 }
            java.lang.String r1 = r1.getStringExtra(r4)     // Catch:{ Exception -> 0x01f8 }
            r13.setText(r1)     // Catch:{ Exception -> 0x01f8 }
            android.content.Intent r13 = r12.getIntent()     // Catch:{ Exception -> 0x01f8 }
            java.lang.String r13 = r13.getStringExtra(r4)     // Catch:{ Exception -> 0x01f8 }
            r12.f2367d = r13     // Catch:{ Exception -> 0x01f8 }
            android.content.Intent r13 = r12.getIntent()     // Catch:{ Exception -> 0x01f8 }
            java.lang.String r1 = "CUS_GSM"
            java.lang.String r13 = r13.getStringExtra(r1)     // Catch:{ Exception -> 0x01f8 }
            r12.f2375h = r13     // Catch:{ Exception -> 0x01f8 }
            android.content.Intent r13 = r12.getIntent()     // Catch:{ Exception -> 0x01f8 }
            java.lang.String r1 = "CUS_ID"
            java.lang.String r13 = r13.getStringExtra(r1)     // Catch:{ Exception -> 0x01f8 }
            r12.f2365c = r13     // Catch:{ Exception -> 0x01f8 }
            android.content.Intent r13 = r12.getIntent()     // Catch:{ Exception -> 0x01f8 }
            java.lang.String r13 = r13.getStringExtra(r3)     // Catch:{ Exception -> 0x01f8 }
            r12.f2369e = r13     // Catch:{ Exception -> 0x01f8 }
            android.content.Intent r13 = r12.getIntent()     // Catch:{ Exception -> 0x01f8 }
            java.lang.String r13 = r13.getStringExtra(r5)     // Catch:{ Exception -> 0x01f8 }
            if (r13 != 0) goto L_0x01db
            r13 = r2
            goto L_0x01e3
        L_0x01db:
            android.content.Intent r13 = r12.getIntent()     // Catch:{ Exception -> 0x01f8 }
            java.lang.String r13 = r13.getStringExtra(r5)     // Catch:{ Exception -> 0x01f8 }
        L_0x01e3:
            r12.f2371f = r13     // Catch:{ Exception -> 0x01f8 }
            r12.f2354T = r8     // Catch:{ Exception -> 0x01f8 }
            android.widget.EditText r13 = r12.f2391p     // Catch:{ Exception -> 0x01f8 }
            r13.requestFocus()     // Catch:{ Exception -> 0x01f8 }
            r12.mo3675H()     // Catch:{ Exception -> 0x01f8 }
            r12.mo3704a(r8)     // Catch:{ Exception -> 0x01f8 }
            goto L_0x01f8
        L_0x01f3:
            android.widget.AutoCompleteTextView r13 = r12.f2387n     // Catch:{ Exception -> 0x01f8 }
            r13.requestFocus()     // Catch:{ Exception -> 0x01f8 }
        L_0x01f8:
            android.content.Intent r13 = r12.getIntent()     // Catch:{ Exception -> 0x02ba }
            java.lang.String r13 = r13.getStringExtra(r0)     // Catch:{ Exception -> 0x02ba }
            if (r13 == 0) goto L_0x02ba
            r12.mo3675H()     // Catch:{ Exception -> 0x02ba }
            r12.mo3704a(r7)     // Catch:{ Exception -> 0x02ba }
            android.content.Intent r13 = r12.getIntent()     // Catch:{ Exception -> 0x02ba }
            java.lang.String r13 = r13.getStringExtra(r0)     // Catch:{ Exception -> 0x02ba }
            int r13 = java.lang.Integer.parseInt(r13)     // Catch:{ Exception -> 0x02ba }
            r12.f2377i = r13     // Catch:{ Exception -> 0x02ba }
            android.widget.EditText r13 = r12.f2391p     // Catch:{ Exception -> 0x02ba }
            android.content.Intent r0 = r12.getIntent()     // Catch:{ Exception -> 0x02ba }
            java.lang.String r1 = "TR_AMOUNT"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ Exception -> 0x02ba }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02ba }
            java.lang.String r1 = ","
            java.lang.String r0 = r0.replaceAll(r1, r2)     // Catch:{ Exception -> 0x02ba }
            r13.setText(r0)     // Catch:{ Exception -> 0x02ba }
            android.widget.TextView r13 = r12.f2393q     // Catch:{ Exception -> 0x02ba }
            android.content.Intent r0 = r12.getIntent()     // Catch:{ Exception -> 0x02ba }
            java.lang.String r1 = "TR_DATE"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ Exception -> 0x02ba }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02ba }
            r13.setText(r0)     // Catch:{ Exception -> 0x02ba }
            JU r13 = r12.f2363b     // Catch:{ Exception -> 0x02ba }
            int r0 = r12.f2377i     // Catch:{ Exception -> 0x02ba }
            java.lang.String r13 = r13.mo528b(r0)     // Catch:{ Exception -> 0x02ba }
            java.lang.String r0 = "0"
            boolean r13 = r13.equals(r0)     // Catch:{ Exception -> 0x02ba }
            if (r13 != 0) goto L_0x026a
            JU r13 = r12.f2363b     // Catch:{ Exception -> 0x02ba }
            int r0 = r12.f2377i     // Catch:{ Exception -> 0x02ba }
            java.lang.String r13 = r13.mo548c(r0)     // Catch:{ Exception -> 0x02ba }
            r12.f2360Z = r13     // Catch:{ Exception -> 0x02ba }
            android.widget.RadioGroup r13 = r12.f2411z     // Catch:{ Exception -> 0x02ba }
            r0 = 4
            r13.setVisibility(r0)     // Catch:{ Exception -> 0x02ba }
            android.widget.AutoCompleteTextView r13 = r12.f2397s     // Catch:{ Exception -> 0x02ba }
            java.lang.String r0 = r12.f2360Z     // Catch:{ Exception -> 0x02ba }
        L_0x0266:
            r13.setText(r0)     // Catch:{ Exception -> 0x02ba }
            goto L_0x0280
        L_0x026a:
            android.widget.RadioGroup r13 = r12.f2411z     // Catch:{ Exception -> 0x02ba }
            r13.setVisibility(r7)     // Catch:{ Exception -> 0x02ba }
            android.widget.AutoCompleteTextView r13 = r12.f2397s     // Catch:{ Exception -> 0x02ba }
            android.content.Intent r0 = r12.getIntent()     // Catch:{ Exception -> 0x02ba }
            java.lang.String r1 = "TR_REMARKS"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ Exception -> 0x02ba }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02ba }
            goto L_0x0266
        L_0x0280:
            android.content.Intent r13 = r12.getIntent()     // Catch:{ Exception -> 0x02ba }
            java.lang.String r0 = "TR_TYPE"
            r1 = -10
            int r13 = r13.getIntExtra(r0, r1)     // Catch:{ Exception -> 0x02ba }
            android.widget.Button r0 = r12.f2401u     // Catch:{ Exception -> 0x02ba }
            r1 = 2131755108(0x7f100064, float:1.9141086E38)
            java.lang.String r1 = r12.getString(r1)     // Catch:{ Exception -> 0x02ba }
            r0.setText(r1)     // Catch:{ Exception -> 0x02ba }
            int[] r0 = r12.f2357W     // Catch:{ Exception -> 0x02ba }
            r0 = r0[r7]     // Catch:{ Exception -> 0x02ba }
            if (r13 != r0) goto L_0x02a4
            android.widget.RadioButton r13 = r12.f2333A     // Catch:{ Exception -> 0x02ba }
        L_0x02a0:
            r13.setChecked(r8)     // Catch:{ Exception -> 0x02ba }
            goto L_0x02ad
        L_0x02a4:
            int[] r0 = r12.f2357W     // Catch:{ Exception -> 0x02ba }
            r0 = r0[r6]     // Catch:{ Exception -> 0x02ba }
            if (r13 != r0) goto L_0x02ad
            android.widget.RadioButton r13 = r12.f2335B     // Catch:{ Exception -> 0x02ba }
            goto L_0x02a0
        L_0x02ad:
            android.widget.EditText r13 = r12.f2391p     // Catch:{ Exception -> 0x02ba }
            r13.requestFocus()     // Catch:{ Exception -> 0x02ba }
            android.widget.EditText r13 = r12.f2391p     // Catch:{ Exception -> 0x02ba }
            r13.selectAll()     // Catch:{ Exception -> 0x02ba }
            r12.mo3682O()     // Catch:{ Exception -> 0x02ba }
        L_0x02ba:
            android.content.Intent r13 = r12.getIntent()     // Catch:{ Exception -> 0x02ef }
            java.lang.String r13 = r13.getStringExtra(r3)     // Catch:{ Exception -> 0x02ef }
            if (r13 == 0) goto L_0x02ef
            android.content.Intent r13 = r12.getIntent()     // Catch:{ Exception -> 0x02ef }
            java.lang.String r13 = r13.getStringExtra(r3)     // Catch:{ Exception -> 0x02ef }
            r12.f2369e = r13     // Catch:{ Exception -> 0x02ef }
            android.content.Intent r13 = r12.getIntent()     // Catch:{ Exception -> 0x02ef }
            java.lang.String r13 = r13.getStringExtra(r5)     // Catch:{ Exception -> 0x02ef }
            if (r13 != 0) goto L_0x02d9
            goto L_0x02e1
        L_0x02d9:
            android.content.Intent r13 = r12.getIntent()     // Catch:{ Exception -> 0x02ef }
            java.lang.String r2 = r13.getStringExtra(r5)     // Catch:{ Exception -> 0x02ef }
        L_0x02e1:
            r12.f2371f = r2     // Catch:{ Exception -> 0x02ef }
            android.content.Intent r13 = r12.getIntent()     // Catch:{ Exception -> 0x02ef }
            java.lang.String r0 = "screen_main"
            boolean r13 = r13.getBooleanExtra(r0, r7)     // Catch:{ Exception -> 0x02ef }
            r12.f2400ta = r13     // Catch:{ Exception -> 0x02ef }
        L_0x02ef:
            android.widget.ListView r13 = r12.f2337C
            eL r0 = new eL
            r0.<init>(r12)
            r13.setOnItemClickListener(r0)
            android.widget.ListView r13 = r12.f2337C
            r0 = 3
            r13.setChoiceMode(r0)
            android.widget.ListView r13 = r12.f2337C
            oL r0 = new oL
            r0.<init>(r12)
            r13.setMultiChoiceModeListener(r0)
            r12.mo3755v()     // Catch:{ Exception -> 0x0315 }
            r12.mo3748p()     // Catch:{ Exception -> 0x0315 }
            JU r13 = r12.f2363b     // Catch:{ Exception -> 0x0315 }
            r13.mo551c(r12)     // Catch:{ Exception -> 0x0315 }
            goto L_0x0326
        L_0x0315:
            r13 = move-exception
            java.lang.StackTraceElement[] r0 = r13.getStackTrace()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "oncreate_error="
            android.util.Log.d(r1, r0)
            r13.printStackTrace()
        L_0x0326:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2.onCreate(android.os.Bundle):void");
    }

    public Dialog onCreateDialog(int i) {
        if (i == 0) {
            DatePickerDialog datePickerDialog = new DatePickerDialog(mo3670C() ? new ContextThemeWrapper(this, 16973939) : this, this.f2402ua, this.f2381k, this.f2383l, this.f2385m);
            return datePickerDialog;
        } else if (i != 4) {
            return null;
        } else {
            DatePickerDialog datePickerDialog2 = new DatePickerDialog(mo3670C() ? new ContextThemeWrapper(this, 16973939) : this, this.f2404va, this.f2381k, this.f2383l, this.f2385m);
            return datePickerDialog2;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2] */
    public Loader<List<C0232LL>> onCreateLoader(int i, Bundle bundle) {
        return new C0301OL(this, this.f2365c, this.f2371f, this.f2363b);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131558415, menu);
        SearchView actionView = MenuItemCompat.getActionView(menu.findItem(2131296605));
        actionView.setSearchableInfo(((SearchManager) getSystemService("search")).getSearchableInfo(getComponentName()));
        actionView.setQueryHint(getString(2131755371));
        actionView.setOnQueryTextListener(new C1197zL(this));
        return true;
    }

    public void onDestroy() {
        Customer_Det_List_edit2.super.onDestroy();
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f2387n.setText(adapterView.getItemAtPosition(i).toString());
        mo3748p();
        mo3675H();
        mo3704a(true);
        this.f2391p.requestFocus();
    }

    public void onLoaderReset(Loader<List<C0232LL>> loader) {
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str = "t_name_lock";
        String str2 = "f_name_lock";
        int itemId = menuItem.getItemId();
        if (itemId == 2131296577) {
            mo3716c();
            try {
                mo3672E();
            } catch (Exception unused) {
            }
            return true;
        } else if (itemId == 16908332) {
            mo3682O();
            finish();
            return true;
        } else if (itemId != 2131296646) {
            return Customer_Det_List_edit2.super.onOptionsItemSelected(menuItem);
        } else {
            try {
                String obj = this.f2387n.getText().toString();
                String obj2 = this.f2389o.getText().toString();
                boolean a = this.f2363b.mo524a(str2, true);
                this.f2387n.setText(this.f2389o.getText());
                this.f2389o.setText(obj);
                mo3708b(this.f2387n.getText().toString());
                this.f2363b.mo543b(str2, this.f2363b.mo524a(str, false));
                this.f2363b.mo543b(str, a);
                mo3673F();
                mo3684Q();
                this.f2387n.setText(obj2);
                this.f2389o.setText(obj);
                mo3748p();
                mo3675H();
            } catch (Exception unused2) {
            }
            return true;
        }
    }

    public void onRadioButtonClicked(View view) {
        RadioButton radioButton = (RadioButton) view;
        if (radioButton.isChecked()) {
            this.f2343I.setTag(radioButton.getText().toString());
            this.f2371f = radioButton.getText().toString();
            mo3758y();
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        int i2;
        if (i != 0) {
            if (i == 112) {
                if (iArr.length != 1 || iArr[0] != 0) {
                    i2 = 2131755273;
                } else {
                    return;
                }
            } else if (i != 113) {
                return;
            } else {
                if (iArr.length != 1 || iArr[0] != 0) {
                    i2 = 2131755272;
                } else {
                    return;
                }
            }
            mo3700a(getString(i2));
        } else if (iArr.length == 1 && iArr[0] == 0) {
            mo3751r();
        }
    }

    public void onResume() {
        Customer_Det_List_edit2.super.onResume();
    }

    public void onStart() {
        Customer_Det_List_edit2.super.onStart();
    }

    public void onStop() {
        Customer_Det_List_edit2.super.onStop();
    }

    /* renamed from: p */
    public final void mo3748p() {
        getSupportLoaderManager().initLoader((int) System.currentTimeMillis(), null, this).forceLoad();
    }

    public void phone_pick_btn(View view) {
        startActivityForResult(new Intent("android.intent.action.PICK", Phone.CONTENT_URI), 1);
    }

    /* renamed from: q */
    public void mo3750q() {
        for (int size = this.f2347M.size() - 1; size >= 0; size--) {
            if (this.f2347M.valueAt(size)) {
                C0232LL item = this.f2345K.getItem(this.f2347M.keyAt(size));
                this.f2345K.remove(item);
                C0195JU ju = this.f2363b;
                StringBuilder sb = new StringBuilder();
                sb.append("delete from transactions where id=");
                sb.append(item.mo778i());
                ju.mo562d(sb.toString());
            }
        }
        FragmentStatePagerSupport_Main.f2451d = true;
        mo3758y();
        mo3704a(true);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    /* renamed from: r */
    public void mo3751r() {
        String str;
        String str2 = "getDeviceId";
        String str3 = "0";
        TelephonyManager telephonyManager = (TelephonyManager) getSystemService("phone");
        try {
            C0195JU.f445e = telephonyManager.getDeviceId().substring(0, 14);
            C0195JU.f446f = C0753eN.m2610a(C0195JU.f445e);
            if (this.f2363b.mo461I() != 0 && this.f2363b.mo587j(C0195JU.f445e).equals(str3) && this.f2363b.mo579h(C0195JU.f445e) <= 0) {
                if (VERSION.SDK_INT >= 23) {
                    if (!this.f2363b.mo587j(telephonyManager.getDeviceId(0).substring(0, 14)).equals(str3)) {
                        C0195JU.f445e = telephonyManager.getDeviceId(0).substring(0, 14);
                        str = C0195JU.f445e;
                    } else {
                        if (!this.f2363b.mo587j(telephonyManager.getDeviceId(1).substring(0, 14)).equals(str3)) {
                            C0195JU.f445e = telephonyManager.getDeviceId(1).substring(0, 14);
                            str = C0195JU.f445e;
                        }
                    }
                } else if (!this.f2363b.mo587j(m2173a((Context) this, str2, 0).substring(0, 14)).equals(str3)) {
                    C0195JU.f445e = m2173a((Context) this, str2, 0).substring(0, 14);
                    str = C0195JU.f445e;
                } else {
                    if (!this.f2363b.mo587j(m2173a((Context) this, str2, 1).substring(0, 14)).equals(str3)) {
                        C0195JU.f445e = m2173a((Context) this, str2, 1).substring(0, 14);
                        str = C0195JU.f445e;
                    }
                }
                C0195JU.f446f = C0753eN.m2610a(str);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.support.v7.app.AppCompatActivity] */
    /* renamed from: s */
    public final void mo3752s() {
        int i;
        Resources resources;
        if (this.f2409y.getTag() != null) {
            resources = getResources();
            i = 2130903043;
        } else {
            resources = getResources();
            i = 2130903056;
        }
        String[] stringArray = resources.getStringArray(i);
        Builder builder = new Builder(this);
        builder.setItems(stringArray, new C0517YK(this, stringArray));
        AlertDialog create = builder.create();
        ListView listView = create.getListView();
        listView.setDivider(new ColorDrawable(-7829368));
        listView.setDividerHeight(1);
        create.show();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    /* renamed from: t */
    public void mo3753t() {
        String str = ",";
        String str2 = "";
        int size = this.f2347M.size() - 1;
        if (this.f2347M.valueAt(size)) {
            C0232LL item = this.f2345K.getItem(this.f2347M.keyAt(size));
            try {
                this.f2377i = Integer.parseInt(item.mo778i().toString());
                this.f2391p.setText(item.mo775f().toString().replaceAll(str, str2));
                this.f2393q.setText(item.mo777h());
                this.f2359Y = item.mo775f().toString().replaceAll(str, str2);
                this.f2409y.setTag(item.mo776g() != null ? item.mo776g() : str2);
                this.f2362aa = this.f2409y.getTag().toString();
                item.mo780k();
                this.f2364ba = item.mo766a();
                this.f2401u.setText(getString(2131755108));
                this.f2368da = str2;
                this.f2360Z = item.mo779j();
                if (!this.f2363b.mo528b(this.f2377i).equals("0")) {
                    this.f2360Z = this.f2363b.mo548c(this.f2377i);
                    this.f2370ea = this.f2367d;
                    this.f2368da = this.f2363b.mo565e(this.f2377i);
                    if (this.f2368da.equals(this.f2367d)) {
                        this.f2370ea = this.f2363b.mo497a(this.f2377i);
                    }
                }
                this.f2387n.setText(this.f2370ea);
                this.f2389o.setText(this.f2368da);
                if (!this.f2409y.getTag().toString().equals(str2)) {
                    mo3721d(this.f2409y.getTag().toString());
                } else {
                    mo3698a(this.f2409y);
                }
                mo3704a(false);
                mo3755v();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: u */
    public void mo3754u() {
        if (!this.f2363b.mo528b(this.f2377i).equals("0")) {
            mo3704a(false);
            mo3755v();
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2] */
    /* renamed from: v */
    public void mo3755v() {
        String str = ":";
        String str2 = Attribute.NAME;
        try {
            if (C0195JU.f451k) {
                this.f2344J = this.f2363b.mo605p();
                String str3 = "";
                this.f2371f = this.f2371f == null ? str3 : this.f2371f;
                RadioButton[] radioButtonArr = new RadioButton[this.f2344J.size()];
                this.f2343I.setTag(null);
                this.f2343I.removeAllViews();
                this.f2343I.clearCheck();
                for (int i = 0; i < this.f2344J.size(); i++) {
                    radioButtonArr[i] = new RadioButton(this);
                    radioButtonArr[i].setText((CharSequence) ((HashMap) this.f2344J.get(i)).get(str2));
                    radioButtonArr[i].setId(Integer.parseInt((String) ((HashMap) this.f2344J.get(i)).get(Attribute.f2026ID)) + 100);
                    radioButtonArr[i].setOnClickListener(new C1175yL(this));
                    this.f2343I.addView(radioButtonArr[i]);
                    if (this.f2364ba != null && this.f2364ba.equals(((HashMap) this.f2344J.get(i)).get(str2))) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.f2364ba);
                        sb.append(str);
                        sb.append((String) ((HashMap) this.f2344J.get(i)).get(str2));
                        sb.append(str);
                        sb.append(this.f2367d);
                        Log.d("tr_curr_name_l=", sb.toString());
                        this.f2343I.check(radioButtonArr[i].getId());
                        this.f2343I.setTag(((HashMap) this.f2344J.get(i)).get(str2));
                        this.f2371f = (String) ((HashMap) this.f2344J.get(i)).get(str2);
                    }
                }
                if (!this.f2371f.equals(str3)) {
                    this.f2343I.setTag(this.f2371f);
                    for (int i2 = 0; i2 < radioButtonArr.length; i2++) {
                        if (radioButtonArr[i2].getText().toString().equals(this.f2371f)) {
                            this.f2343I.check(radioButtonArr[i2].getId());
                        }
                    }
                } else if (this.f2364ba == null || this.f2364ba.equals(str3)) {
                    this.f2343I.check(radioButtonArr[this.f2344J.size() - 1].getId());
                    this.f2343I.setTag(radioButtonArr[this.f2344J.size() - 1].getText().toString());
                    this.f2371f = radioButtonArr[this.f2344J.size() - 1].getText().toString();
                }
            }
        } catch (Exception e) {
            Log.d("fill_curr_error=", e.getMessage());
            e.printStackTrace();
        }
    }

    /* renamed from: w */
    public final C0232LL mo3756w() {
        Cursor z = this.f2363b.mo636z(this.f2387n.getText().toString());
        z.moveToFirst();
        C0232LL ll = null;
        while (!z.isAfterLast()) {
            String str = "_in";
            ll = new C0232LL(z.getString(z.getColumnIndex("_id")), z.getString(z.getColumnIndex("date_")), z.getString(z.getColumnIndex("amount")), z.getString(z.getColumnIndex("remarks")), this.f2357W[z.getInt(z.getColumnIndex(str))], String.valueOf(z.getInt(z.getColumnIndex(str))), z.getString(z.getColumnIndex("param1")), z.getString(z.getColumnIndex("curr_name")));
            z.moveToNext();
        }
        z.close();
        return ll;
    }

    /* renamed from: x */
    public final void mo3757x() {
        mo3716c();
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction("android.intent.action.GET_CONTENT");
        startActivityForResult(Intent.createChooser(intent, "Select File"), this.f2376ha);
    }

    /* renamed from: y */
    public void mo3758y() {
        Cursor cursor;
        String str;
        String str2;
        C0195JU ju;
        if (this.f2343I.getTag() != null) {
            ju = this.f2363b;
            str2 = this.f2387n.getText().toString();
            str = this.f2343I.getTag().toString();
        } else if (!C0195JU.f451k) {
            cursor = this.f2363b.mo593l(this.f2387n.getText().toString());
            mo3693a(cursor);
            mo3675H();
        } else {
            ju = this.f2363b;
            str2 = this.f2387n.getText().toString();
            str = this.f2371f;
            if (str == null) {
                str = "";
            }
        }
        cursor = ju.mo570f(str2, str);
        mo3693a(cursor);
        mo3675H();
    }

    /* renamed from: z */
    public void mo3759z() {
        Cursor D = this.f2363b.mo453D();
        this.f2355U = new String[D.getCount()];
        if (D.moveToFirst()) {
            int i = 0;
            do {
                this.f2355U[i] = D.getString(D.getColumnIndex("_id"));
                i++;
            } while (D.moveToNext());
        }
        D.close();
    }
}
