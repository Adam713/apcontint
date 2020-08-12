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
import android.net.Uri;
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
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
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
import com.itextpdf.tool.xml.html.HTML.Attribute;
import com.itextpdf.tool.xml.html.HTML.Tag;
import com.adam.myapplication.frag.Calculator;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
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

public class Customer_Det_List_edit extends AppCompatActivity implements OnItemClickListener, C0625bN, LoaderCallbacks<List<C0232LL>> {

    /* renamed from: A */
    public RadioButton f2257A = null;

    /* renamed from: B */
    public RadioButton f2258B = null;

    /* renamed from: C */
    public ListView f2259C = null;

    /* renamed from: D */
    public LinearLayout f2260D = null;

    /* renamed from: E */
    public LinearLayout f2261E = null;

    /* renamed from: F */
    public LinearLayout f2262F = null;

    /* renamed from: G */
    public LinearLayout f2263G = null;

    /* renamed from: H */
    public LinearLayout f2264H = null;

    /* renamed from: I */
    public RadioGroup f2265I = null;

    /* renamed from: J */
    public ArrayList<HashMap<String, String>> f2266J = new ArrayList<>();

    /* renamed from: K */
    public C0302OM f2267K;

    /* renamed from: L */
    public List<C0232LL> f2268L = new ArrayList();

    /* renamed from: M */
    public SparseBooleanArray f2269M;

    /* renamed from: N */
    public ArrayAdapter<String> f2270N;

    /* renamed from: O */
    public ArrayAdapter<String> f2271O;

    /* renamed from: P */
    public ImageButton f2272P = null;

    /* renamed from: Q */
    public ImageView f2273Q = null;

    /* renamed from: R */
    public String f2274R;

    /* renamed from: S */
    public String f2275S;

    /* renamed from: T */
    public int f2276T;

    /* renamed from: U */
    public String[] f2277U;

    /* renamed from: V */
    public String[] f2278V;

    /* renamed from: W */
    public int[] f2279W;

    /* renamed from: X */
    public String f2280X;

    /* renamed from: Y */
    public String f2281Y;

    /* renamed from: Z */
    public String f2282Z;

    /* renamed from: a */
    public SQLiteDatabase f2283a;

    /* renamed from: aa */
    public String f2284aa;

    /* renamed from: b */
    public C0195JU f2285b;

    /* renamed from: ba */
    public String f2286ba;

    /* renamed from: c */
    public String f2287c;

    /* renamed from: ca */
    public int f2288ca;

    /* renamed from: d */
    public String f2289d = null;

    /* renamed from: da */
    public EditText f2290da;

    /* renamed from: e */
    public String f2291e = null;

    /* renamed from: ea */
    public int f2292ea;

    /* renamed from: f */
    public String f2293f = null;

    /* renamed from: fa */
    public int f2294fa;

    /* renamed from: g */
    public String f2295g = null;

    /* renamed from: ga */
    public int f2296ga;

    /* renamed from: h */
    public String f2297h = null;

    /* renamed from: ha */
    public int f2298ha;

    /* renamed from: i */
    public int f2299i;

    /* renamed from: ia */
    public String f2300ia;

    /* renamed from: j */
    public double f2301j = 0.0d;

    /* renamed from: ja */
    public Uri f2302ja;

    /* renamed from: k */
    public int f2303k;

    /* renamed from: ka */
    public boolean f2304ka;

    /* renamed from: l */
    public int f2305l;

    /* renamed from: la */
    public boolean f2306la;

    /* renamed from: m */
    public int f2307m;

    /* renamed from: ma */
    public String f2308ma;

    /* renamed from: n */
    public AutoCompleteTextView f2309n = null;

    /* renamed from: na */
    public boolean f2310na;

    /* renamed from: o */
    public EditText f2311o = null;

    /* renamed from: oa */
    public OnDateSetListener f2312oa;

    /* renamed from: p */
    public TextView f2313p = null;

    /* renamed from: pa */
    public OnDateSetListener f2314pa;

    /* renamed from: q */
    public TextView f2315q = null;

    /* renamed from: qa */
    public int f2316qa;

    /* renamed from: r */
    public AutoCompleteTextView f2317r = null;

    /* renamed from: ra */
    public ProgressDialog f2318ra;

    /* renamed from: s */
    public AutoCompleteTextView f2319s = null;

    /* renamed from: sa */
    public Handler f2320sa;

    /* renamed from: t */
    public Button f2321t = null;

    /* renamed from: ta */
    public String f2322ta;

    /* renamed from: u */
    public Button f2323u = null;

    /* renamed from: ua */
    public int f2324ua;

    /* renamed from: v */
    public Button f2325v = null;

    /* renamed from: va */
    public String f2326va;

    /* renamed from: w */
    public ImageView f2327w = null;

    /* renamed from: wa */
    public boolean f2328wa;

    /* renamed from: x */
    public ImageView f2329x = null;

    /* renamed from: y */
    public ImageView f2330y = null;

    /* renamed from: z */
    public RadioGroup f2331z = null;

    /* renamed from: com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit$a */
    private class C0693a implements Comparator<C0232LL> {
        public C0693a() {
        }

        public /* synthetic */ C0693a(Customer_Det_List_edit customer_Det_List_edit, C0323PJ pj) {
            this();
        }

        /* renamed from: a */
        public int compare(C0232LL ll, C0232LL ll2) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
            try {
                int compareTo = simpleDateFormat.parse(ll.mo777h()).compareTo(simpleDateFormat.parse(ll2.mo777h()));
                return compareTo == 0 ? Integer.valueOf(ll.mo778i()).compareTo(Integer.valueOf(ll2.mo778i())) : compareTo;
            } catch (ParseException unused) {
                return 0;
            }
        }
    }

    /* renamed from: com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit$b */
    private static class C0694b implements Comparator<C0232LL> {
        public C0694b() {
        }

        public /* synthetic */ C0694b(C0323PJ pj) {
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

    public Customer_Det_List_edit() {
        String str = "";
        this.f2274R = str;
        this.f2275S = str;
        this.f2276T = 0;
        String str2 = "January";
        String str3 = "February";
        String str4 = "March";
        String str5 = "April";
        String str6 = "May";
        String str7 = "June";
        this.f2277U = new String[]{str2, str3, str4, str5, str6, str7, "July", "August", "September", "October", "November", "December"};
        this.f2278V = new String[]{str2, str3, str4, str5, str6, str7, "July", "August", "September", "October", "November", "December"};
        this.f2279W = new int[]{2131230923, 1, 2131230855};
        this.f2280X = null;
        this.f2281Y = null;
        this.f2282Z = null;
        this.f2284aa = null;
        this.f2286ba = null;
        this.f2288ca = 0;
        this.f2292ea = 3;
        this.f2294fa = 4;
        this.f2296ga = 0;
        this.f2298ha = 1;
        this.f2308ma = str;
        this.f2310na = false;
        this.f2312oa = new C0987pK(this);
        this.f2314pa = new C1006qK(this);
        this.f2316qa = 0;
        this.f2320sa = new C1028rK(this);
        this.f2322ta = str;
        this.f2324ua = 0;
        this.f2326va = str;
        this.f2328wa = false;
    }

    /* renamed from: a */
    public static String m2082a(Context context, Uri uri) {
        String str = null;
        if (uri.getScheme().equals("content")) {
            Cursor query = context.getContentResolver().query(uri, null, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndex("_display_name"));
                    }
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            query.close();
        }
        if (str != null) {
            return str;
        }
        String path = uri.getPath();
        int lastIndexOf = path.lastIndexOf(47);
        return lastIndexOf != -1 ? path.substring(lastIndexOf + 1) : path;
    }

    /* renamed from: a */
    public static String m2083a(Context context, String str, int i) {
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
    public static boolean m2085a(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    /* renamed from: b */
    public static boolean m2088b(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    /* renamed from: c */
    public static File m2092c(Context context, Uri uri) {
        InputStream openInputStream = context.getContentResolver().openInputStream(uri);
        int available = openInputStream.available();
        File c = m2093c(m2082a(context, uri));
        BufferedInputStream bufferedInputStream = new BufferedInputStream(openInputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(c, false));
        byte[] bArr = new byte[available];
        bufferedInputStream.read(bArr);
        do {
            bufferedOutputStream.write(bArr);
        } while (bufferedInputStream.read(bArr) != -1);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        bufferedInputStream.close();
        return c;
    }

    /* renamed from: c */
    public static File m2093c(String str) {
        return new File(C0195JU.f442b, str);
    }

    /* renamed from: c */
    public static boolean m2095c(Uri uri) {
        return uri.getAuthority().equalsIgnoreCase("com.google.android.apps.docs.storage");
    }

    /* renamed from: d */
    public static boolean m2098d(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    /* renamed from: A */
    public void mo3582A() {
        mo3614b(true);
        new Thread(new C1048sK(this)).start();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.app.Activity] */
    /* renamed from: B */
    public final void mo3583B() {
        String str = "android.permission.READ_PHONE_STATE";
        if (ActivityCompat.shouldShowRequestPermissionRationale(this, str)) {
            ActivityCompat.requestPermissions(this, new String[]{str}, 0);
            return;
        }
        ActivityCompat.requestPermissions(this, new String[]{str}, 0);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.content.Context, android.support.v7.app.AppCompatActivity] */
    /* renamed from: C */
    public final void mo3584C() {
        int i;
        Resources resources;
        if (this.f2330y.getTag() != null) {
            resources = getResources();
            i = 2130903043;
        } else {
            resources = getResources();
            i = 2130903056;
        }
        String[] stringArray = resources.getStringArray(i);
        Builder builder = new Builder(this);
        builder.setItems(stringArray, new C0598aK(this, stringArray));
        AlertDialog create = builder.create();
        ListView listView = create.getListView();
        listView.setDivider(new ColorDrawable(-7829368));
        listView.setDividerHeight(1);
        create.show();
    }

    /* renamed from: D */
    public final void mo3585D() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.app.Activity] */
    /* renamed from: E */
    public void mo3586E() {
        StringBuilder sb = new StringBuilder();
        for (int size = this.f2269M.size() - 1; size >= 0; size--) {
            if (this.f2269M.valueAt(size)) {
                C0232LL item = this.f2267K.getItem(this.f2269M.keyAt(size));
                sb.append(getString(item.mo780k() == this.f2279W[0] ? 2131755142 : 2131755160));
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
        this.f2285b.mo486V(sb.toString());
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.content.Context, android.support.v7.app.AppCompatActivity] */
    /* renamed from: F */
    public void mo3587F() {
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
        listView.setOnItemClickListener(new C0495XJ(this, dialog));
        linearLayout.setFocusable(true);
        listView.setBackgroundColor(Color.parseColor("#FFFFFF"));
        listView.setDividerHeight(0);
        linearLayout.addView(listView, -1, -1);
        dialog.requestWindowFeature(1);
        dialog.setContentView(linearLayout);
        dialog.show();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.app.Activity] */
    /* renamed from: G */
    public final void mo3588G() {
        ((InputMethodManager) getSystemService("input_method")).toggleSoftInput(2, 0);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.content.Context, android.app.Activity] */
    /* renamed from: H */
    public void mo3589H() {
        if (this.f2285b.mo524a("prefAutoSMS", false)) {
            try {
                mo3623d();
                return;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.f2285b.mo524a("prefAutoNotify", true)) {
            Snackbar make = Snackbar.make(this.f2259C, "", -2);
            SnackbarLayout view = make.getView();
            TextView textView = (TextView) view.findViewById(2131296631);
            C0232LL s = mo3656s();
            StringBuilder sb = new StringBuilder();
            sb.append(s.mo780k() == this.f2279W[0] ? this.f2285b.mo597m() : this.f2285b.mo455E());
            String str = " ";
            sb.append(str);
            sb.append(s.mo775f());
            sb.append(str);
            sb.append(s.mo779j());
            make.setText(sb.toString());
            make.setAction(getString(2131755224), new C0516YJ(this, make));
            textView.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(this, 17301586), null, null, null);
            textView.setOnClickListener(new C0543ZJ(this));
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.gravity = 16;
            view.setLayoutParams(layoutParams);
            ViewCompat.setLayoutDirection(make.getView(), 1);
            make.show();
            new Handler().postDelayed(new C0567_J(this, make), (long) 5000);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.content.Context] */
    /* renamed from: I */
    public final void mo3590I() {
        this.f2267K = new C0302OM(this, 2131492929, this.f2268L);
        this.f2267K.f868i.clear();
        mo3613b(this.f2268L);
        this.f2267K.notifyDataSetChanged();
        this.f2259C.setAdapter(this.f2267K);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.content.Context, android.app.Activity] */
    /* renamed from: J */
    public void mo3591J() {
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
            if (!this.f2285b.mo528b(this.f2299i).equals("0")) {
                this.f2282Z = this.f2285b.mo548c(this.f2299i);
            }
            textView4.setText(this.f2282Z);
            textView2.setText(this.f2280X);
            textView.setText(this.f2281Y);
            textView3.setText(this.f2285b.mo557d(this.f2299i));
            if (C0195JU.f451k) {
                ((TableRow) inflate.findViewById(2131296678)).setVisibility(0);
                ((TextView) inflate.findViewById(2131296432)).setText(this.f2286ba);
            }
            imageView2.setImageResource(this.f2288ca);
            if (!this.f2284aa.equals("")) {
                StringBuilder sb = new StringBuilder();
                sb.append(C0195JU.f442b);
                sb.append(this.f2284aa);
                imageView.setImageBitmap(C0195JU.m414a(sb.toString(), 300, 300));
                imageView.setTag(this.f2284aa);
                imageView.getLayoutParams().width = 200;
                imageView.getLayoutParams().height = 200;
            } else {
                imageView.setVisibility(8);
            }
            builder.setCancelable(true);
            if (imageView.getTag() != null) {
                builder.setNeutralButton(getString(2131755422), new C1088uK(this, imageView));
            }
            builder.setPositiveButton(getString(2131755170), new C1129wK(this));
            builder.setNegativeButton(getString(2131755359), new C1155xK(this));
            AlertDialog create = builder.create();
            create.setTitle(this.f2309n.getText().toString());
            create.show();
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(":");
            sb2.append(e.getMessage());
            Log.d("adv_search_error=", sb2.toString());
        }
    }

    /* renamed from: a */
    public double mo3592a(List<C0232LL> list) {
        double d = 0.0d;
        for (int size = list.size() - 1; size >= 0; size--) {
            int i = ((C0232LL) list.get(size)).mo780k() == this.f2279W[0] ? -1 : ((C0232LL) list.get(size)).mo780k() == this.f2279W[2] ? 1 : 0;
            double parseDouble = Double.parseDouble(((C0232LL) list.get(size)).mo775f().replaceAll(",", ""));
            double d2 = (double) i;
            Double.isNaN(d2);
            d += parseDouble * d2;
        }
        return d;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.content.Context] */
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
    public java.lang.String mo3593a(android.content.Context r10, android.net.Uri r11, java.lang.String r12, java.lang.String[] r13) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit.mo3593a(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.content.Context, android.app.Activity] */
    /* renamed from: a */
    public void mo3594a() {
        String str = "android.permission.SEND_SMS";
        if (!(ContextCompat.checkSelfPermission(this, str) == 0)) {
            ActivityCompat.requestPermissions(this, new String[]{str}, C0776fN.AppCompatTheme_windowFixedHeightMajor);
        }
    }

    /* renamed from: a */
    public void mo3595a(int i, int i2) {
        try {
            new Handler().postDelayed(new C1108vK(this, i), (long) i2);
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.content.Context] */
    /* renamed from: a */
    public final void mo3596a(Intent intent) {
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
            mo3603a(VERSION.SDK_INT >= 24 ? new File(C0195JU.f461u) : new File(mo3609b((Context) this, this.f2302ja)), file2);
            mo3626e(file2.getName());
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, e.getMessage(), 1).show();
        }
    }

    /* renamed from: a */
    public void mo3597a(Cursor cursor) {
        cursor.getCount();
        this.f2301j = 0.0d;
        this.f2268L.clear();
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            List<C0232LL> list = this.f2268L;
            String string = cursor.getString(cursor.getColumnIndex("_id"));
            String string2 = cursor.getString(cursor.getColumnIndex("date_"));
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(cursor.getDouble(cursor.getColumnIndex("amount")));
            String str = "_in";
            C0232LL ll = new C0232LL(string, string2, sb.toString(), cursor.getString(cursor.getColumnIndex("remarks")), this.f2279W[cursor.getInt(cursor.getColumnIndex(str))], String.valueOf(cursor.getInt(cursor.getColumnIndex(str))), cursor.getString(cursor.getColumnIndex("param1")), cursor.getString(cursor.getColumnIndex("curr_name")));
            list.add(ll);
            cursor.moveToNext();
        }
        cursor.close();
        mo3595a(1, 10);
    }

    /* renamed from: a */
    public void mo3598a(Handler handler) {
        mo3606a("", this.f2309n.getText().toString(), "", this.f2291e, handler);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.content.Context] */
    /* renamed from: a */
    public void onLoadFinished(Loader<List<C0232LL>> loader, List<C0232LL> list) {
        this.f2268L = list;
        this.f2267K = new C0302OM(this, 2131492929, this.f2268L);
        this.f2267K.f868i.clear();
        this.f2259C.setAdapter(this.f2267K);
        mo3627f();
        mo3661x();
    }

    /* renamed from: a */
    public void mo3600a(View view, boolean z) {
        if (z) {
            mo3584C();
        } else {
            mo3636o();
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.content.Context, android.app.Activity] */
    /* renamed from: a */
    public void mo3601a(ArrayAdapter<String> arrayAdapter, AutoCompleteTextView autoCompleteTextView) {
        Dialog dialog = new Dialog(this);
        LinearLayout linearLayout = new LinearLayout(this);
        ListView listView = new ListView(this);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new C1174yK(this, autoCompleteTextView, dialog));
        linearLayout.setFocusable(true);
        listView.setBackgroundColor(Color.parseColor("#FFFFFF"));
        linearLayout.addView(listView, -1, -1);
        dialog.setContentView(linearLayout);
        dialog.setTitle(getString(2131755308));
        dialog.show();
    }

    /* renamed from: a */
    public final void mo3602a(ImageView imageView) {
        imageView.setTag(null);
        imageView.setImageResource(2131230821);
    }

    /* renamed from: a */
    public final void mo3603a(File file, File file2) {
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

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.content.Context] */
    /* renamed from: a */
    public final void mo3604a(String str) {
        new Builder(this).setTitle("Permission Request").setMessage(str).setCancelable(false).setPositiveButton(17039379, new C1068tK(this)).show();
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.content.Context, android.app.Activity] */
    /* renamed from: a */
    public void mo3605a(String str, String str2, String str3, String str4) {
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
            ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367049, this.f2285b.mo457G());
            autoCompleteTextView.setThreshold(1);
            autoCompleteTextView.setAdapter(arrayAdapter);
            autoCompleteTextView.setOnItemClickListener(new C1196zK(this, autoCompleteTextView));
            autoCompleteTextView.setOnTouchListener(new C0103FJ(this, autoCompleteTextView));
            this.f2290da = editText2;
            editText2.requestFocus();
            imageView.setOnClickListener(new C0123GJ(this));
            imageView2.setOnClickListener(new C0145HJ(this, arrayAdapter, autoCompleteTextView));
            builder.setPositiveButton(getString(2131755359), new C0165IJ(this));
            builder.setNegativeButton(getString(2131755358), new C0184JJ(this));
            AlertDialog create = builder.create();
            create.getWindow().setSoftInputMode(4);
            create.show();
            Button button = create.getButton(-1);
            C0206KJ kj = new C0206KJ(this, editText2, autoCompleteTextView, editText, create);
            button.setOnClickListener(kj);
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.content.Context, android.app.Activity] */
    /* renamed from: a */
    public void mo3606a(String str, String str2, String str3, String str4, Handler handler) {
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
            ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367049, this.f2285b.mo457G());
            autoCompleteTextView.setThreshold(1);
            autoCompleteTextView.setAdapter(arrayAdapter);
            autoCompleteTextView.setOnItemClickListener(new C0230LJ(this, autoCompleteTextView));
            autoCompleteTextView.setOnTouchListener(new C0257MJ(this, autoCompleteTextView));
            this.f2290da = editText2;
            editText2.requestFocus();
            imageView.setOnClickListener(new C0277NJ(this));
            imageView2.setOnClickListener(new C0299OJ(this, arrayAdapter, autoCompleteTextView));
            builder.setPositiveButton(getString(2131755359), new C0385SJ(this));
            builder.setNegativeButton(getString(2131755358), new C0407TJ(this));
            AlertDialog create = builder.create();
            create.getWindow().setSoftInputMode(4);
            create.show();
            Button button = create.getButton(-1);
            C0429UJ uj = new C0429UJ(this, autoCompleteTextView, create, str, editText, editText2, handler);
            button.setOnClickListener(uj);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void mo3607a(boolean z) {
        TextView textView;
        OnClickListener onClickListener;
        Calendar instance = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        this.f2310na = z;
        if (z) {
            this.f2260D.setVisibility(8);
            this.f2261E.setVisibility(8);
            this.f2262F.setVisibility(0);
            this.f2263G.setVisibility(0);
            this.f2315q = (TextView) findViewById(2131296434);
            this.f2319s.setThreshold(1);
            this.f2319s.setAdapter(this.f2271O);
            this.f2315q.setText(simpleDateFormat.format(instance.getTime()));
            this.f2303k = instance.get(1);
            this.f2305l = instance.get(2);
            this.f2307m = instance.get(5);
            this.f2330y.setOnClickListener(new C0853jK(this, z));
            textView = this.f2315q;
            onClickListener = new C0873kK(this);
        } else {
            this.f2262F.setVisibility(8);
            this.f2263G.setVisibility(8);
            this.f2260D.setVisibility(0);
            this.f2261E.setVisibility(0);
            this.f2313p = (TextView) findViewById(2131296433);
            this.f2317r.setThreshold(1);
            this.f2317r.setAdapter(this.f2271O);
            this.f2329x.setOnClickListener(new C0898lK(this, z));
            textView = this.f2313p;
            onClickListener = new C0917mK(this);
        }
        textView.setOnClickListener(onClickListener);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.app.Activity] */
    /* renamed from: a */
    public boolean mo3608a(String str, String str2, Context context) {
        C0792gK gKVar = new C0792gK(this);
        Builder builder = new Builder(context);
        builder.setTitle(str);
        builder.setMessage(str2);
        builder.setPositiveButton(getString(2131755137), new C0812hK(this, gKVar));
        builder.setNegativeButton(getString(2131755136), new C0833iK(this, gKVar));
        builder.show();
        try {
            Looper.loop();
        } catch (RuntimeException unused) {
        }
        return this.f2304ka;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.content.Context] */
    /* renamed from: b */
    public String mo3609b(Context context, Uri uri) {
        try {
            if (VERSION.SDK_INT >= 19 && DocumentsContract.isDocumentUri(context, uri)) {
                String str = ":";
                if (m2088b(uri)) {
                    String[] split = DocumentsContract.getDocumentId(uri).split(str);
                    if ("primary".equalsIgnoreCase(split[0])) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(Environment.getExternalStorageDirectory());
                        sb.append("/");
                        sb.append(split[1]);
                        return sb.toString();
                    }
                } else if (m2085a(uri)) {
                    return mo3593a(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), (String) null, (String[]) null);
                } else if (m2098d(uri)) {
                    String[] split2 = DocumentsContract.getDocumentId(uri).split(str);
                    String str2 = split2[0];
                    Uri uri2 = "image".equals(str2) ? Media.EXTERNAL_CONTENT_URI : Tag.VIDEO.equals(str2) ? Video.Media.EXTERNAL_CONTENT_URI : Tag.AUDIO.equals(str2) ? Audio.Media.EXTERNAL_CONTENT_URI : null;
                    return mo3593a(context, uri2, "_id=?", new String[]{split2[1]});
                } else if (m2095c(uri)) {
                    String[] split3 = DocumentsContract.getDocumentId(uri).split(";");
                    String str3 = split3[0];
                    String str4 = split3[1];
                    return m2092c(context, uri).getAbsolutePath();
                }
            } else if ("content".equalsIgnoreCase(uri.getScheme())) {
                return mo3593a(context, uri, (String) null, (String[]) null);
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

    /* JADX WARNING: type inference failed for: r4v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.content.Context, android.app.Activity] */
    /* renamed from: b */
    public void mo3610b() {
        String str = "android.permission.WRITE_EXTERNAL_STORAGE";
        if (!(ContextCompat.checkSelfPermission(this, str) == 0)) {
            ActivityCompat.requestPermissions(this, new String[]{str}, C0776fN.AppCompatTheme_windowActionBarOverlay);
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.content.Context] */
    /* renamed from: b */
    public final void mo3611b(Intent intent) {
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
                mo3603a(new File(this.f2285b.mo530b((Context) this, intent.getData())), file2);
                mo3626e(file2.getName());
            } catch (IOException | Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public void mo3612b(String str) {
        C0082EH t = this.f2285b.mo617t(str);
        if (!t.mo191f().equals("")) {
            this.f2287c = t.mo191f();
            this.f2289d = t.mo192g();
            this.f2297h = t.mo189e();
            this.f2295g = "0";
            this.f2291e = t.mo187d();
        }
    }

    /* renamed from: b */
    public final void mo3613b(List<C0232LL> list) {
        Collections.sort(this.f2268L, new C0694b(null));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.content.Context, android.app.Activity] */
    /* renamed from: b */
    public void mo3614b(boolean z) {
        if (z) {
            this.f2318ra = new ProgressDialog(this);
            this.f2318ra.setMessage(getString(2131755205));
            this.f2318ra.show();
            return;
        }
        this.f2318ra.hide();
    }

    /* renamed from: b */
    public final boolean mo3615b(int i, int i2) {
        int i3 = VERSION.SDK_INT;
        return i3 >= i && i3 <= i2;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.app.Activity] */
    /* renamed from: b */
    public boolean mo3616b(String str, String str2, Context context) {
        C0730dK dKVar = new C0730dK(this);
        Builder builder = new Builder(context);
        builder.setTitle(str);
        builder.setMessage(str2);
        builder.setPositiveButton(getString(2131755137), new C0750eK(this, dKVar));
        builder.setNegativeButton(getString(2131755136), new C0773fK(this, dKVar));
        builder.show();
        try {
            Looper.loop();
        } catch (RuntimeException unused) {
        }
        return this.f2306la;
    }

    /* JADX WARNING: type inference failed for: r16v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r0v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.app.Activity] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.app.Activity]
      assigns: [?[OBJECT, ARRAY]]
      uses: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.app.Activity]
      mth insns count: 175
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
            r16.mo3630i()
            boolean r3 = r16.mo3629h()
            if (r3 == 0) goto L_0x01fc
            if (r2 == 0) goto L_0x01da
            android.widget.ImageView r3 = r0.f2330y     // Catch:{ Exception -> 0x01ed }
            java.lang.Object r3 = r3.getTag()     // Catch:{ Exception -> 0x01ed }
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
            JU r3 = r0.f2285b     // Catch:{ Exception -> 0x01ed }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ed }
            r1.<init>()     // Catch:{ Exception -> 0x01ed }
            r17 = r7
            java.lang.String r7 = "insert into transactions (cus_id,out,[in],date_,remarks,now_,param2,curr_id) values((select b.id from customers as b where b.name='"
            r1.append(r7)     // Catch:{ Exception -> 0x01ed }
            android.widget.AutoCompleteTextView r7 = r0.f2309n     // Catch:{ Exception -> 0x01ed }
            android.text.Editable r7 = r7.getText()     // Catch:{ Exception -> 0x01ed }
            r1.append(r7)     // Catch:{ Exception -> 0x01ed }
            r1.append(r12)     // Catch:{ Exception -> 0x01ed }
            android.widget.EditText r7 = r0.f2311o     // Catch:{ Exception -> 0x01ed }
            android.text.Editable r7 = r7.getText()     // Catch:{ Exception -> 0x01ed }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x01ed }
            java.lang.String r7 = r7.replaceAll(r15, r14)     // Catch:{ Exception -> 0x01ed }
            java.lang.String r7 = r7.replaceAll(r11, r14)     // Catch:{ Exception -> 0x01ed }
            r1.append(r7)     // Catch:{ Exception -> 0x01ed }
            r1.append(r15)     // Catch:{ Exception -> 0x01ed }
            r1.append(r2)     // Catch:{ Exception -> 0x01ed }
            r1.append(r10)     // Catch:{ Exception -> 0x01ed }
            android.widget.TextView r2 = r0.f2315q     // Catch:{ Exception -> 0x01ed }
            java.lang.CharSequence r2 = r2.getText()     // Catch:{ Exception -> 0x01ed }
            r1.append(r2)     // Catch:{ Exception -> 0x01ed }
            r1.append(r13)     // Catch:{ Exception -> 0x01ed }
            android.widget.AutoCompleteTextView r2 = r0.f2319s     // Catch:{ Exception -> 0x01ed }
            android.text.Editable r2 = r2.getText()     // Catch:{ Exception -> 0x01ed }
            r1.append(r2)     // Catch:{ Exception -> 0x01ed }
            r1.append(r9)     // Catch:{ Exception -> 0x01ed }
            JU r2 = r0.f2285b     // Catch:{ Exception -> 0x01ed }
            java.lang.String r2 = r2.mo470M()     // Catch:{ Exception -> 0x01ed }
            r1.append(r2)     // Catch:{ Exception -> 0x01ed }
            r1.append(r8)     // Catch:{ Exception -> 0x01ed }
            android.widget.RadioGroup r2 = r0.f2265I     // Catch:{ Exception -> 0x01ed }
            java.lang.Object r2 = r2.getTag()     // Catch:{ Exception -> 0x01ed }
            if (r2 != 0) goto L_0x00ae
            r7 = r17
            goto L_0x00ca
        L_0x00ae:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ed }
            r2.<init>()     // Catch:{ Exception -> 0x01ed }
            r2.append(r6)     // Catch:{ Exception -> 0x01ed }
            android.widget.RadioGroup r6 = r0.f2265I     // Catch:{ Exception -> 0x01ed }
            java.lang.Object r6 = r6.getTag()     // Catch:{ Exception -> 0x01ed }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x01ed }
            r2.append(r6)     // Catch:{ Exception -> 0x01ed }
            r2.append(r4)     // Catch:{ Exception -> 0x01ed }
            java.lang.String r7 = r2.toString()     // Catch:{ Exception -> 0x01ed }
        L_0x00ca:
            r1.append(r7)     // Catch:{ Exception -> 0x01ed }
            r1.append(r5)     // Catch:{ Exception -> 0x01ed }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x01ed }
            r3.mo562d(r1)     // Catch:{ Exception -> 0x01ed }
            goto L_0x0179
        L_0x00d9:
            r17 = r7
            JU r1 = r0.f2285b     // Catch:{ Exception -> 0x01ed }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ed }
            r3.<init>()     // Catch:{ Exception -> 0x01ed }
            java.lang.String r7 = "insert into transactions (cus_id,out,[in],date_,remarks,now_,param1,param2,curr_id) values((select b.id from customers as b where b.name='"
            r3.append(r7)     // Catch:{ Exception -> 0x01ed }
            android.widget.AutoCompleteTextView r7 = r0.f2309n     // Catch:{ Exception -> 0x01ed }
            android.text.Editable r7 = r7.getText()     // Catch:{ Exception -> 0x01ed }
            r3.append(r7)     // Catch:{ Exception -> 0x01ed }
            r3.append(r12)     // Catch:{ Exception -> 0x01ed }
            android.widget.EditText r7 = r0.f2311o     // Catch:{ Exception -> 0x01ed }
            android.text.Editable r7 = r7.getText()     // Catch:{ Exception -> 0x01ed }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x01ed }
            java.lang.String r7 = r7.replaceAll(r15, r14)     // Catch:{ Exception -> 0x01ed }
            java.lang.String r7 = r7.replaceAll(r11, r14)     // Catch:{ Exception -> 0x01ed }
            r3.append(r7)     // Catch:{ Exception -> 0x01ed }
            r3.append(r15)     // Catch:{ Exception -> 0x01ed }
            r3.append(r2)     // Catch:{ Exception -> 0x01ed }
            r3.append(r10)     // Catch:{ Exception -> 0x01ed }
            android.widget.TextView r2 = r0.f2315q     // Catch:{ Exception -> 0x01ed }
            java.lang.CharSequence r2 = r2.getText()     // Catch:{ Exception -> 0x01ed }
            r3.append(r2)     // Catch:{ Exception -> 0x01ed }
            r3.append(r13)     // Catch:{ Exception -> 0x01ed }
            android.widget.AutoCompleteTextView r2 = r0.f2319s     // Catch:{ Exception -> 0x01ed }
            android.text.Editable r2 = r2.getText()     // Catch:{ Exception -> 0x01ed }
            r3.append(r2)     // Catch:{ Exception -> 0x01ed }
            r3.append(r9)     // Catch:{ Exception -> 0x01ed }
            android.widget.ImageView r2 = r0.f2330y     // Catch:{ Exception -> 0x01ed }
            java.lang.Object r2 = r2.getTag()     // Catch:{ Exception -> 0x01ed }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x01ed }
            r3.append(r2)     // Catch:{ Exception -> 0x01ed }
            r3.append(r13)     // Catch:{ Exception -> 0x01ed }
            JU r2 = r0.f2285b     // Catch:{ Exception -> 0x01ed }
            java.lang.String r2 = r2.mo470M()     // Catch:{ Exception -> 0x01ed }
            r3.append(r2)     // Catch:{ Exception -> 0x01ed }
            r3.append(r8)     // Catch:{ Exception -> 0x01ed }
            android.widget.RadioGroup r2 = r0.f2265I     // Catch:{ Exception -> 0x01ed }
            java.lang.Object r2 = r2.getTag()     // Catch:{ Exception -> 0x01ed }
            if (r2 != 0) goto L_0x0150
            r7 = r17
            goto L_0x016c
        L_0x0150:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ed }
            r2.<init>()     // Catch:{ Exception -> 0x01ed }
            r2.append(r6)     // Catch:{ Exception -> 0x01ed }
            android.widget.RadioGroup r6 = r0.f2265I     // Catch:{ Exception -> 0x01ed }
            java.lang.Object r6 = r6.getTag()     // Catch:{ Exception -> 0x01ed }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x01ed }
            r2.append(r6)     // Catch:{ Exception -> 0x01ed }
            r2.append(r4)     // Catch:{ Exception -> 0x01ed }
            java.lang.String r7 = r2.toString()     // Catch:{ Exception -> 0x01ed }
        L_0x016c:
            r3.append(r7)     // Catch:{ Exception -> 0x01ed }
            r3.append(r5)     // Catch:{ Exception -> 0x01ed }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x01ed }
            r1.mo562d(r2)     // Catch:{ Exception -> 0x01ed }
        L_0x0179:
            android.widget.AutoCompleteTextView r1 = r0.f2309n     // Catch:{ Exception -> 0x01ed }
            android.text.Editable r1 = r1.getText()     // Catch:{ Exception -> 0x01ed }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x01ed }
            r0.mo3612b(r1)     // Catch:{ Exception -> 0x01ed }
            android.widget.EditText r1 = r0.f2311o     // Catch:{ Exception -> 0x01ed }
            r2 = 0
            r1.setText(r2)     // Catch:{ Exception -> 0x01ed }
            java.util.Calendar r1 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x01ed }
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x01ed }
            java.lang.String r4 = "dd-MM-yyyy"
            java.util.Locale r5 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x01ed }
            r3.<init>(r4, r5)     // Catch:{ Exception -> 0x01ed }
            android.widget.TextView r4 = r0.f2315q     // Catch:{ Exception -> 0x01ed }
            java.util.Date r5 = r1.getTime()     // Catch:{ Exception -> 0x01ed }
            java.lang.String r3 = r3.format(r5)     // Catch:{ Exception -> 0x01ed }
            r4.setText(r3)     // Catch:{ Exception -> 0x01ed }
            r3 = 1
            int r4 = r1.get(r3)     // Catch:{ Exception -> 0x01ed }
            r0.f2303k = r4     // Catch:{ Exception -> 0x01ed }
            r3 = 2
            int r3 = r1.get(r3)     // Catch:{ Exception -> 0x01ed }
            r0.f2305l = r3     // Catch:{ Exception -> 0x01ed }
            r3 = 5
            int r1 = r1.get(r3)     // Catch:{ Exception -> 0x01ed }
            r0.f2307m = r1     // Catch:{ Exception -> 0x01ed }
            android.widget.AutoCompleteTextView r1 = r0.f2319s     // Catch:{ Exception -> 0x01ed }
            r1.setText(r2)     // Catch:{ Exception -> 0x01ed }
            android.widget.ImageView r1 = r0.f2330y     // Catch:{ Exception -> 0x01ed }
            r0.mo3602a(r1)     // Catch:{ Exception -> 0x01ed }
            int r1 = r0.f2276T     // Catch:{ Exception -> 0x01ed }
            r2 = 1
            if (r1 != r2) goto L_0x01d0
            android.widget.EditText r1 = r0.f2311o     // Catch:{ Exception -> 0x01ed }
            r1.requestFocus()     // Catch:{ Exception -> 0x01ed }
            goto L_0x01da
        L_0x01d0:
            android.widget.AutoCompleteTextView r1 = r0.f2309n     // Catch:{ Exception -> 0x01ed }
            r1.selectAll()     // Catch:{ Exception -> 0x01ed }
            android.widget.AutoCompleteTextView r1 = r0.f2309n     // Catch:{ Exception -> 0x01ed }
            r1.requestFocus()     // Catch:{ Exception -> 0x01ed }
        L_0x01da:
            r16.mo3658u()     // Catch:{ Exception -> 0x01ed }
            r1 = 1
            r0.mo3607a(r1)     // Catch:{ Exception -> 0x01ed }
            java.util.List<LL> r1 = r0.f2268L     // Catch:{ Exception -> 0x01ed }
            int r1 = r1.size()     // Catch:{ Exception -> 0x01ed }
            if (r1 <= 0) goto L_0x01fc
            r16.mo3589H()     // Catch:{ Exception -> 0x01ed }
            goto L_0x01fc
        L_0x01ed:
            android.content.Context r1 = r16.getApplicationContext()
            r2 = 2131755389(0x7f10017d, float:1.9141656E38)
            java.lang.String r2 = r0.getString(r2)
            r3 = 1
            android.widget.Toast.makeText(r1, r2, r3)
        L_0x01fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit.btn_cus_add(android.view.View):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.content.Context, android.app.Activity] */
    public void btn_cus_remove(View view) {
        FragmentStatePagerSupport_Main.f2451d = true;
        Builder builder = new Builder(this);
        builder.setMessage(getString(2131755166));
        this.f2299i = Integer.parseInt(((TextView) ((RelativeLayout) ((View) view.getParent()).getParent()).findViewById(2131296680)).getText().toString());
        builder.setPositiveButton(getString(2131755137), new C0454VJ(this));
        builder.setNegativeButton(getString(2131755136), new C0475WJ(this));
        builder.create().show();
    }

    /* JADX WARNING: type inference failed for: r16v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r0v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.app.Activity] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.app.Activity]
      assigns: [?[OBJECT, ARRAY]]
      uses: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.app.Activity]
      mth insns count: 252
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
            android.widget.RadioButton r2 = r0.f2257A
            boolean r2 = r2.isChecked()
            if (r2 == 0) goto L_0x000f
            r2 = -1
            goto L_0x001a
        L_0x000f:
            android.widget.RadioButton r2 = r0.f2258B
            boolean r2 = r2.isChecked()
            if (r2 == 0) goto L_0x0019
            r2 = 1
            goto L_0x001a
        L_0x0019:
            r2 = 0
        L_0x001a:
            r16.mo3630i()
            boolean r4 = r16.mo3631j()
            if (r4 == 0) goto L_0x02eb
            android.widget.Button r4 = r0.f2321t     // Catch:{ Exception -> 0x02dc }
            java.lang.CharSequence r4 = r4.getText()     // Catch:{ Exception -> 0x02dc }
            r5 = 2131755108(0x7f100064, float:1.9141086E38)
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x02dc }
            boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x02dc }
            if (r4 == 0) goto L_0x02d4
            int r4 = r0.f2299i     // Catch:{ Exception -> 0x02dc }
            if (r4 == 0) goto L_0x02d4
            android.widget.ImageView r4 = r0.f2329x     // Catch:{ Exception -> 0x02dc }
            java.lang.Object r4 = r4.getTag()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r5 = "',[in]='"
            java.lang.String r6 = "')"
            java.lang.String r7 = "'"
            java.lang.String r8 = " where id='"
            java.lang.String r9 = "(select id from currency where name='"
            java.lang.String r10 = "',remarks='"
            java.lang.String r11 = "',date_='"
            java.lang.String r12 = "-"
            java.lang.String r13 = ","
            java.lang.String r14 = "update transactions set out='"
            java.lang.String r15 = "0"
            java.lang.String r3 = ""
            if (r4 != 0) goto L_0x015a
            JU r4 = r0.f2285b     // Catch:{ Exception -> 0x02dc }
            int r1 = r0.f2299i     // Catch:{ Exception -> 0x02dc }
            java.lang.String r1 = r4.mo528b(r1)     // Catch:{ Exception -> 0x02dc }
            boolean r1 = r1.equals(r15)     // Catch:{ Exception -> 0x02dc }
            if (r1 != 0) goto L_0x00e0
            JU r1 = r0.f2285b     // Catch:{ Exception -> 0x02dc }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02dc }
            r2.<init>()     // Catch:{ Exception -> 0x02dc }
            r2.append(r14)     // Catch:{ Exception -> 0x02dc }
            android.widget.EditText r4 = r0.f2311o     // Catch:{ Exception -> 0x02dc }
            android.text.Editable r4 = r4.getText()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r4 = r4.replaceAll(r13, r3)     // Catch:{ Exception -> 0x02dc }
            java.lang.String r3 = r4.replaceAll(r12, r3)     // Catch:{ Exception -> 0x02dc }
            r2.append(r3)     // Catch:{ Exception -> 0x02dc }
            r2.append(r11)     // Catch:{ Exception -> 0x02dc }
            android.widget.TextView r3 = r0.f2313p     // Catch:{ Exception -> 0x02dc }
            java.lang.CharSequence r3 = r3.getText()     // Catch:{ Exception -> 0x02dc }
            r2.append(r3)     // Catch:{ Exception -> 0x02dc }
            r2.append(r10)     // Catch:{ Exception -> 0x02dc }
            android.widget.AutoCompleteTextView r3 = r0.f2317r     // Catch:{ Exception -> 0x02dc }
            android.text.Editable r3 = r3.getText()     // Catch:{ Exception -> 0x02dc }
            r2.append(r3)     // Catch:{ Exception -> 0x02dc }
            java.lang.String r3 = "',param1='',curr_id="
            r2.append(r3)     // Catch:{ Exception -> 0x02dc }
            android.widget.RadioGroup r3 = r0.f2265I     // Catch:{ Exception -> 0x02dc }
            java.lang.Object r3 = r3.getTag()     // Catch:{ Exception -> 0x02dc }
            if (r3 != 0) goto L_0x00ad
            goto L_0x00c9
        L_0x00ad:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02dc }
            r3.<init>()     // Catch:{ Exception -> 0x02dc }
            r3.append(r9)     // Catch:{ Exception -> 0x02dc }
            android.widget.RadioGroup r4 = r0.f2265I     // Catch:{ Exception -> 0x02dc }
            java.lang.Object r4 = r4.getTag()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x02dc }
            r3.append(r4)     // Catch:{ Exception -> 0x02dc }
            r3.append(r6)     // Catch:{ Exception -> 0x02dc }
            java.lang.String r15 = r3.toString()     // Catch:{ Exception -> 0x02dc }
        L_0x00c9:
            r2.append(r15)     // Catch:{ Exception -> 0x02dc }
            r2.append(r8)     // Catch:{ Exception -> 0x02dc }
            int r3 = r0.f2299i     // Catch:{ Exception -> 0x02dc }
            r2.append(r3)     // Catch:{ Exception -> 0x02dc }
            r2.append(r7)     // Catch:{ Exception -> 0x02dc }
        L_0x00d7:
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x02dc }
        L_0x00db:
            r1.mo562d(r2)     // Catch:{ Exception -> 0x02dc }
            goto L_0x0274
        L_0x00e0:
            JU r1 = r0.f2285b     // Catch:{ Exception -> 0x02dc }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02dc }
            r4.<init>()     // Catch:{ Exception -> 0x02dc }
            r4.append(r14)     // Catch:{ Exception -> 0x02dc }
            android.widget.EditText r14 = r0.f2311o     // Catch:{ Exception -> 0x02dc }
            android.text.Editable r14 = r14.getText()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r13 = r14.replaceAll(r13, r3)     // Catch:{ Exception -> 0x02dc }
            java.lang.String r3 = r13.replaceAll(r12, r3)     // Catch:{ Exception -> 0x02dc }
            r4.append(r3)     // Catch:{ Exception -> 0x02dc }
            r4.append(r5)     // Catch:{ Exception -> 0x02dc }
            r4.append(r2)     // Catch:{ Exception -> 0x02dc }
            r4.append(r11)     // Catch:{ Exception -> 0x02dc }
            android.widget.TextView r2 = r0.f2313p     // Catch:{ Exception -> 0x02dc }
            java.lang.CharSequence r2 = r2.getText()     // Catch:{ Exception -> 0x02dc }
            r4.append(r2)     // Catch:{ Exception -> 0x02dc }
            r4.append(r10)     // Catch:{ Exception -> 0x02dc }
            android.widget.AutoCompleteTextView r2 = r0.f2317r     // Catch:{ Exception -> 0x02dc }
            android.text.Editable r2 = r2.getText()     // Catch:{ Exception -> 0x02dc }
            r4.append(r2)     // Catch:{ Exception -> 0x02dc }
            java.lang.String r2 = "',param1='',curr_id="
            r4.append(r2)     // Catch:{ Exception -> 0x02dc }
            android.widget.RadioGroup r2 = r0.f2265I     // Catch:{ Exception -> 0x02dc }
            java.lang.Object r2 = r2.getTag()     // Catch:{ Exception -> 0x02dc }
            if (r2 != 0) goto L_0x012b
            goto L_0x0147
        L_0x012b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02dc }
            r2.<init>()     // Catch:{ Exception -> 0x02dc }
            r2.append(r9)     // Catch:{ Exception -> 0x02dc }
            android.widget.RadioGroup r3 = r0.f2265I     // Catch:{ Exception -> 0x02dc }
            java.lang.Object r3 = r3.getTag()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x02dc }
            r2.append(r3)     // Catch:{ Exception -> 0x02dc }
            r2.append(r6)     // Catch:{ Exception -> 0x02dc }
            java.lang.String r15 = r2.toString()     // Catch:{ Exception -> 0x02dc }
        L_0x0147:
            r4.append(r15)     // Catch:{ Exception -> 0x02dc }
            r4.append(r8)     // Catch:{ Exception -> 0x02dc }
            int r2 = r0.f2299i     // Catch:{ Exception -> 0x02dc }
            r4.append(r2)     // Catch:{ Exception -> 0x02dc }
            r4.append(r7)     // Catch:{ Exception -> 0x02dc }
        L_0x0155:
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x02dc }
            goto L_0x00db
        L_0x015a:
            JU r1 = r0.f2285b     // Catch:{ Exception -> 0x02dc }
            int r4 = r0.f2299i     // Catch:{ Exception -> 0x02dc }
            java.lang.String r1 = r1.mo528b(r4)     // Catch:{ Exception -> 0x02dc }
            boolean r1 = r1.equals(r15)     // Catch:{ Exception -> 0x02dc }
            if (r1 != 0) goto L_0x01eb
            JU r1 = r0.f2285b     // Catch:{ Exception -> 0x02dc }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02dc }
            r2.<init>()     // Catch:{ Exception -> 0x02dc }
            r2.append(r14)     // Catch:{ Exception -> 0x02dc }
            android.widget.EditText r4 = r0.f2311o     // Catch:{ Exception -> 0x02dc }
            android.text.Editable r4 = r4.getText()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r4 = r4.replaceAll(r13, r3)     // Catch:{ Exception -> 0x02dc }
            java.lang.String r3 = r4.replaceAll(r12, r3)     // Catch:{ Exception -> 0x02dc }
            r2.append(r3)     // Catch:{ Exception -> 0x02dc }
            r2.append(r11)     // Catch:{ Exception -> 0x02dc }
            android.widget.TextView r3 = r0.f2313p     // Catch:{ Exception -> 0x02dc }
            java.lang.CharSequence r3 = r3.getText()     // Catch:{ Exception -> 0x02dc }
            r2.append(r3)     // Catch:{ Exception -> 0x02dc }
            r2.append(r10)     // Catch:{ Exception -> 0x02dc }
            android.widget.AutoCompleteTextView r3 = r0.f2317r     // Catch:{ Exception -> 0x02dc }
            android.text.Editable r3 = r3.getText()     // Catch:{ Exception -> 0x02dc }
            r2.append(r3)     // Catch:{ Exception -> 0x02dc }
            java.lang.String r3 = "',param1='"
            r2.append(r3)     // Catch:{ Exception -> 0x02dc }
            android.widget.ImageView r3 = r0.f2329x     // Catch:{ Exception -> 0x02dc }
            java.lang.Object r3 = r3.getTag()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x02dc }
            r2.append(r3)     // Catch:{ Exception -> 0x02dc }
            java.lang.String r3 = "',curr_id="
            r2.append(r3)     // Catch:{ Exception -> 0x02dc }
            android.widget.RadioGroup r3 = r0.f2265I     // Catch:{ Exception -> 0x02dc }
            java.lang.Object r3 = r3.getTag()     // Catch:{ Exception -> 0x02dc }
            if (r3 != 0) goto L_0x01bf
            goto L_0x01db
        L_0x01bf:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02dc }
            r3.<init>()     // Catch:{ Exception -> 0x02dc }
            r3.append(r9)     // Catch:{ Exception -> 0x02dc }
            android.widget.RadioGroup r4 = r0.f2265I     // Catch:{ Exception -> 0x02dc }
            java.lang.Object r4 = r4.getTag()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x02dc }
            r3.append(r4)     // Catch:{ Exception -> 0x02dc }
            r3.append(r6)     // Catch:{ Exception -> 0x02dc }
            java.lang.String r15 = r3.toString()     // Catch:{ Exception -> 0x02dc }
        L_0x01db:
            r2.append(r15)     // Catch:{ Exception -> 0x02dc }
            r2.append(r8)     // Catch:{ Exception -> 0x02dc }
            int r3 = r0.f2299i     // Catch:{ Exception -> 0x02dc }
            r2.append(r3)     // Catch:{ Exception -> 0x02dc }
            r2.append(r7)     // Catch:{ Exception -> 0x02dc }
            goto L_0x00d7
        L_0x01eb:
            JU r1 = r0.f2285b     // Catch:{ Exception -> 0x02dc }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02dc }
            r4.<init>()     // Catch:{ Exception -> 0x02dc }
            r4.append(r14)     // Catch:{ Exception -> 0x02dc }
            android.widget.EditText r14 = r0.f2311o     // Catch:{ Exception -> 0x02dc }
            android.text.Editable r14 = r14.getText()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r13 = r14.replaceAll(r13, r3)     // Catch:{ Exception -> 0x02dc }
            java.lang.String r3 = r13.replaceAll(r12, r3)     // Catch:{ Exception -> 0x02dc }
            r4.append(r3)     // Catch:{ Exception -> 0x02dc }
            r4.append(r5)     // Catch:{ Exception -> 0x02dc }
            r4.append(r2)     // Catch:{ Exception -> 0x02dc }
            r4.append(r11)     // Catch:{ Exception -> 0x02dc }
            android.widget.TextView r2 = r0.f2313p     // Catch:{ Exception -> 0x02dc }
            java.lang.CharSequence r2 = r2.getText()     // Catch:{ Exception -> 0x02dc }
            r4.append(r2)     // Catch:{ Exception -> 0x02dc }
            r4.append(r10)     // Catch:{ Exception -> 0x02dc }
            android.widget.AutoCompleteTextView r2 = r0.f2317r     // Catch:{ Exception -> 0x02dc }
            android.text.Editable r2 = r2.getText()     // Catch:{ Exception -> 0x02dc }
            r4.append(r2)     // Catch:{ Exception -> 0x02dc }
            java.lang.String r2 = "',param1='"
            r4.append(r2)     // Catch:{ Exception -> 0x02dc }
            android.widget.ImageView r2 = r0.f2329x     // Catch:{ Exception -> 0x02dc }
            java.lang.Object r2 = r2.getTag()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x02dc }
            r4.append(r2)     // Catch:{ Exception -> 0x02dc }
            java.lang.String r2 = "',curr_id="
            r4.append(r2)     // Catch:{ Exception -> 0x02dc }
            android.widget.RadioGroup r2 = r0.f2265I     // Catch:{ Exception -> 0x02dc }
            java.lang.Object r2 = r2.getTag()     // Catch:{ Exception -> 0x02dc }
            if (r2 != 0) goto L_0x0248
            goto L_0x0264
        L_0x0248:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02dc }
            r2.<init>()     // Catch:{ Exception -> 0x02dc }
            r2.append(r9)     // Catch:{ Exception -> 0x02dc }
            android.widget.RadioGroup r3 = r0.f2265I     // Catch:{ Exception -> 0x02dc }
            java.lang.Object r3 = r3.getTag()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x02dc }
            r2.append(r3)     // Catch:{ Exception -> 0x02dc }
            r2.append(r6)     // Catch:{ Exception -> 0x02dc }
            java.lang.String r15 = r2.toString()     // Catch:{ Exception -> 0x02dc }
        L_0x0264:
            r4.append(r15)     // Catch:{ Exception -> 0x02dc }
            r4.append(r8)     // Catch:{ Exception -> 0x02dc }
            int r2 = r0.f2299i     // Catch:{ Exception -> 0x02dc }
            r4.append(r2)     // Catch:{ Exception -> 0x02dc }
            r4.append(r7)     // Catch:{ Exception -> 0x02dc }
            goto L_0x0155
        L_0x0274:
            android.widget.EditText r1 = r0.f2311o     // Catch:{ Exception -> 0x02dc }
            r2 = 0
            r1.setText(r2)     // Catch:{ Exception -> 0x02dc }
            java.util.Calendar r1 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x02dc }
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x02dc }
            java.lang.String r4 = "dd-MM-yyyy"
            java.util.Locale r5 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x02dc }
            r3.<init>(r4, r5)     // Catch:{ Exception -> 0x02dc }
            android.widget.TextView r4 = r0.f2313p     // Catch:{ Exception -> 0x02dc }
            java.util.Date r5 = r1.getTime()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r5 = r3.format(r5)     // Catch:{ Exception -> 0x02dc }
            r4.setText(r5)     // Catch:{ Exception -> 0x02dc }
            android.widget.TextView r4 = r0.f2315q     // Catch:{ Exception -> 0x02dc }
            java.util.Date r5 = r1.getTime()     // Catch:{ Exception -> 0x02dc }
            java.lang.String r3 = r3.format(r5)     // Catch:{ Exception -> 0x02dc }
            r4.setText(r3)     // Catch:{ Exception -> 0x02dc }
            r3 = 1
            int r4 = r1.get(r3)     // Catch:{ Exception -> 0x02dc }
            r0.f2303k = r4     // Catch:{ Exception -> 0x02dc }
            r3 = 2
            int r3 = r1.get(r3)     // Catch:{ Exception -> 0x02dc }
            r0.f2305l = r3     // Catch:{ Exception -> 0x02dc }
            r3 = 5
            int r1 = r1.get(r3)     // Catch:{ Exception -> 0x02dc }
            r0.f2307m = r1     // Catch:{ Exception -> 0x02dc }
            android.widget.AutoCompleteTextView r1 = r0.f2317r     // Catch:{ Exception -> 0x02dc }
            r1.setText(r2)     // Catch:{ Exception -> 0x02dc }
            android.widget.ImageView r1 = r0.f2329x     // Catch:{ Exception -> 0x02dc }
            r0.mo3602a(r1)     // Catch:{ Exception -> 0x02dc }
            android.widget.AutoCompleteTextView r1 = r0.f2319s     // Catch:{ Exception -> 0x02dc }
            r1.setText(r2)     // Catch:{ Exception -> 0x02dc }
            android.widget.Button r1 = r0.f2321t     // Catch:{ Exception -> 0x02dc }
            r2 = 2131755103(0x7f10005f, float:1.9141076E38)
            java.lang.String r2 = r0.getString(r2)     // Catch:{ Exception -> 0x02dc }
            r1.setText(r2)     // Catch:{ Exception -> 0x02dc }
            r1 = 0
            r0.f2299i = r1     // Catch:{ Exception -> 0x02dc }
        L_0x02d4:
            r16.mo3658u()     // Catch:{ Exception -> 0x02dc }
            r1 = 1
            r0.mo3607a(r1)     // Catch:{ Exception -> 0x02dc }
            goto L_0x02eb
        L_0x02dc:
            android.content.Context r1 = r16.getApplicationContext()
            r2 = 2131755389(0x7f10017d, float:1.9141656E38)
            java.lang.String r2 = r0.getString(r2)
            r3 = 1
            android.widget.Toast.makeText(r1, r2, r3)
        L_0x02eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit.btn_cus_save(android.view.View):void");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.content.Context, android.app.Activity] */
    /* renamed from: c */
    public void mo3620c() {
        String str = "android.permission.WRITE_CONTACTS";
        if (!(ContextCompat.checkSelfPermission(this, str) == 0)) {
            ActivityCompat.requestPermissions(this, new String[]{str}, C0776fN.AppCompatTheme_windowActionModeOverlay);
        }
    }

    /* renamed from: c */
    public final void mo3621c(List<C0232LL> list) {
        Collections.sort(this.f2268L, new C0693a(this, null));
    }

    public void calc_pick_btn(View view) {
        Intent intent = new Intent(view.getContext(), Calculator.class);
        intent.putExtra("tr_amount", this.f2311o.getText().toString());
        startActivityForResult(intent, 2);
    }

    /* renamed from: d */
    public void mo3623d() {
        mo3594a();
        this.f2296ga = 3;
        String str = this.f2297h;
        if (str == null || str.length() < 3) {
            mo3605a(this.f2287c, this.f2289d, this.f2297h, this.f2291e);
            return;
        }
        C0232LL e = this.f2285b.mo563e(this.f2289d);
        C0195JU ju = this.f2285b;
        ju.mo516a(this.f2297h, ju.mo529b(e, this.f2289d, Double.parseDouble(e.mo768b())));
    }

    /* renamed from: d */
    public void mo3624d(String str) {
        C0302OM om = this.f2267K;
        if (om != null) {
            om.getFilter().filter(str);
        }
    }

    /* renamed from: e */
    public final Double mo3625e() {
        this.f2301j = 0.0d;
        for (int size = this.f2268L.size() - 1; size >= 0; size--) {
            String str = "";
            String str2 = ",";
            this.f2301j += Double.parseDouble(((C0232LL) this.f2268L.get(size)).mo775f().replaceAll(str2, str)) * (Double.parseDouble(((C0232LL) this.f2268L.get(size)).mo770c().replaceAll(str2, str)) - 1.0d);
            C0232LL ll = (C0232LL) this.f2268L.get(size);
            ll.mo769b(String.valueOf(this.f2301j));
            this.f2268L.set(size, ll);
        }
        return Double.valueOf(this.f2301j);
    }

    /* renamed from: e */
    public void mo3626e(String str) {
        ImageView imageView;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(C0195JU.f442b);
            sb.append(str);
            Bitmap a = C0195JU.m414a(sb.toString(), 300, 300);
            if (!this.f2310na) {
                this.f2329x.getLayoutParams().width = (int) getResources().getDimension(2131165265);
                this.f2329x.getLayoutParams().height = (int) getResources().getDimension(2131165262);
                this.f2329x.setImageBitmap(a);
                imageView = this.f2329x;
            } else {
                this.f2330y.getLayoutParams().width = (int) getResources().getDimension(2131165265);
                this.f2330y.getLayoutParams().height = (int) getResources().getDimension(2131165262);
                this.f2330y.setImageBitmap(a);
                imageView = this.f2330y;
            }
            imageView.setTag(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: f */
    public void mo3627f() {
        C0288NU.m892a().mo934a(new C0356QU(16, this.f2267K, this.f2268L, new C0334PU()));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.content.Context, android.support.v4.app.FragmentActivity] */
    /* renamed from: g */
    public final void mo3628g() {
        mo3610b();
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        try {
            this.f2302ja = this.f2285b.mo494a((Context) this, intent);
            intent.putExtra(Tag.OUTPUT, this.f2302ja);
            StringBuilder sb = new StringBuilder();
            sb.append(this.f2302ja.getPath());
            sb.append("");
            Log.d("camera_file=", sb.toString());
            startActivityForResult(intent, this.f2292ea);
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.app.Activity] */
    /* renamed from: h */
    public final boolean mo3629h() {
        Log.d("IMEI=", "AFTER VALIDATION");
        boolean a = C0008AO.m5a(this.f2311o);
        if (!C0008AO.m5a(this.f2319s)) {
            a = false;
        }
        if (!C0008AO.m5a(this.f2309n)) {
            a = false;
        }
        if (this.f2285b.mo519a()) {
            mo3632k();
            this.f2321t.setError(getString(2131755238));
            return false;
        }
        this.f2321t.setError(null);
        return a;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.content.Context, android.app.Activity] */
    /* renamed from: i */
    public final void mo3630i() {
        if (this.f2285b.mo590k(this.f2309n.getText().toString()) == 0 && this.f2309n.getText().toString().length() >= 1 && this.f2321t.getText().toString().equals(getString(2131755103))) {
            String string = getString(2131755419);
            StringBuilder sb = new StringBuilder();
            sb.append(getString(2131755419));
            sb.append(this.f2309n.getText());
            mo3608a(string, sb.toString(), (Context) this);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.app.Activity] */
    /* renamed from: j */
    public final boolean mo3631j() {
        boolean a = C0008AO.m5a(this.f2311o);
        if (!C0008AO.m5a(this.f2317r)) {
            a = false;
        }
        if (!C0008AO.m5a(this.f2309n)) {
            a = false;
        }
        if (this.f2285b.mo519a()) {
            mo3632k();
            this.f2321t.setError(getString(2131755238));
            return false;
        }
        this.f2321t.setError(null);
        return a;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.content.Context] */
    /* renamed from: k */
    public void mo3632k() {
        String str = "";
        try {
            if (this.f2285b.mo524a("black_list", false)) {
                this.f2285b.mo631x("black_date", str);
                this.f2285b.mo631x("black_date_done", str);
                this.f2285b.mo551c((Context) this);
            }
            mo3620c();
            this.f2285b.mo582h((Context) this);
        } catch (Exception e) {
            Log.d("adv_search_error=", e.getMessage());
        }
    }

    /* renamed from: l */
    public final void mo3633l() {
        getSupportLoaderManager().initLoader(Calendar.getInstance().get(14), null, this).forceLoad();
    }

    /* renamed from: m */
    public void mo3634m() {
        for (int size = this.f2269M.size() - 1; size >= 0; size--) {
            if (this.f2269M.valueAt(size)) {
                C0232LL item = this.f2267K.getItem(this.f2269M.keyAt(size));
                this.f2267K.remove(item);
                C0195JU ju = this.f2285b;
                StringBuilder sb = new StringBuilder();
                sb.append("delete from transactions where id=");
                sb.append(item.mo778i());
                ju.mo562d(sb.toString());
            }
        }
        FragmentStatePagerSupport_Main.f2451d = true;
        mo3658u();
        mo3607a(true);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.content.Context, android.app.Activity] */
    /* renamed from: n */
    public void mo3635n() {
        String str;
        String str2 = "getDeviceId";
        String str3 = "0";
        TelephonyManager telephonyManager = (TelephonyManager) getSystemService("phone");
        try {
            C0195JU.f445e = telephonyManager.getDeviceId().substring(0, 14);
            C0195JU.f446f = C0753eN.m2610a(C0195JU.f445e);
            if (this.f2285b.mo461I() != 0 && this.f2285b.mo587j(C0195JU.f445e).equals(str3) && this.f2285b.mo579h(C0195JU.f445e) <= 0) {
                if (VERSION.SDK_INT >= 23) {
                    if (!this.f2285b.mo587j(telephonyManager.getDeviceId(0).substring(0, 14)).equals(str3)) {
                        C0195JU.f445e = telephonyManager.getDeviceId(0).substring(0, 14);
                        str = C0195JU.f445e;
                    } else {
                        if (!this.f2285b.mo587j(telephonyManager.getDeviceId(1).substring(0, 14)).equals(str3)) {
                            C0195JU.f445e = telephonyManager.getDeviceId(1).substring(0, 14);
                            str = C0195JU.f445e;
                        }
                    }
                } else if (!this.f2285b.mo587j(m2083a((Context) this, str2, 0).substring(0, 14)).equals(str3)) {
                    C0195JU.f445e = m2083a((Context) this, str2, 0).substring(0, 14);
                    str = C0195JU.f445e;
                } else {
                    if (!this.f2285b.mo587j(m2083a((Context) this, str2, 1).substring(0, 14)).equals(str3)) {
                        C0195JU.f445e = m2083a((Context) this, str2, 1).substring(0, 14);
                        str = C0195JU.f445e;
                    }
                }
                C0195JU.f446f = C0753eN.m2610a(str);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.content.Context, android.support.v7.app.AppCompatActivity] */
    /* renamed from: o */
    public final void mo3636o() {
        int i;
        Resources resources;
        if (this.f2329x.getTag() != null) {
            resources = getResources();
            i = 2130903043;
        } else {
            resources = getResources();
            i = 2130903056;
        }
        String[] stringArray = resources.getStringArray(i);
        Builder builder = new Builder(this);
        builder.setItems(stringArray, new C0641cK(this, stringArray));
        AlertDialog create = builder.create();
        ListView listView = create.getListView();
        listView.setDivider(new ColorDrawable(-7829368));
        listView.setDividerHeight(1);
        create.show();
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.app.Activity] */
    public void onActivityResult(int i, int i2, Intent intent) {
        String str = "display_name";
        String str2 = "data1";
        if (i2 == 0) {
            return;
        }
        if (i == 2) {
            if (intent != null) {
                try {
                    this.f2311o.setText(intent.getStringExtra("calc_result"));
                } catch (Exception unused) {
                }
            }
        } else if (i == 1) {
            if (i2 == -1) {
                Cursor query = getContentResolver().query(intent.getData(), new String[]{str2, str}, null, null, null);
                query.moveToFirst();
                String string = query.getString(query.getColumnIndex(str2));
                String string2 = query.getString(query.getColumnIndex(str));
                this.f2290da.setText(string);
                query.close();
                StringBuilder sb = new StringBuilder();
                sb.append("ZZZ number : ");
                sb.append(string);
                sb.append(" , name : ");
                sb.append(string2);
                Log.d("Phone=", sb.toString());
            }
        } else if (i == this.f2294fa) {
            mo3611b(intent);
        } else if (i == this.f2292ea) {
            mo3596a(intent);
        }
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.content.Context, android.widget.AdapterView$OnItemClickListener, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|(1:6)|7|8|(3:10|(1:12)(1:13)|14)(1:15)|16|17|(7:19|(1:21)(1:23)|22|24|(1:26)(3:28|(1:30)|31)|27|31)|(3:32|33|(3:35|(1:37)(1:38)|39))|40|(3:42|43|45)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|(1:6)|7|8|(3:10|(1:12)(1:13)|14)(1:15)|16|17|(7:19|(1:21)(1:23)|22|24|(1:26)(3:28|(1:30)|31)|27|31)|(3:32|33|(3:35|(1:37)(1:38)|39))|40|42|43|45) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x021e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x02e0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x01b2 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x01bc A[Catch:{ Exception -> 0x021e }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0219 A[Catch:{ Exception -> 0x021e }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0228 A[Catch:{ Exception -> 0x02e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x02ea A[Catch:{ Exception -> 0x0309 }] */
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
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit.super.onCreate(r13)
            r13 = 2131492909(0x7f0c002d, float:1.8609283E38)
            r12.setContentView(r13)
            r12.mo3585D()
            r13 = 2131755063(0x7f100037, float:1.9140995E38)
            java.lang.String r13 = r12.getString(r13)
            r12.setTitle(r13)
            r13 = 2131296530(0x7f090112, float:1.821098E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.ListView r13 = (android.widget.ListView) r13
            r12.f2259C = r13
            r13 = 2131296440(0x7f0900b8, float:1.8210797E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            android.widget.ListView r13 = r12.f2259C
            r6 = 2
            r13.setChoiceMode(r6)
            JU r13 = new JU
            android.database.sqlite.SQLiteDatabase r7 = r12.f2283a
            r13.<init>(r7, r12)
            r12.f2285b = r13
            JU r13 = r12.f2285b
            r7 = 0
            java.lang.String r8 = "prefOthers_currency"
            boolean r13 = r13.mo524a(r8, r7)
            p000.C0195JU.f451k = r13
            r13 = 2131296388(0x7f090084, float:1.8210691E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.AutoCompleteTextView r13 = (android.widget.AutoCompleteTextView) r13
            r12.f2309n = r13
            r13 = 2131296431(0x7f0900af, float:1.8210778E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.EditText r13 = (android.widget.EditText) r13
            r12.f2311o = r13
            android.widget.EditText r13 = r12.f2311o
            r8 = 1
            android.text.InputFilter[] r9 = new android.text.InputFilter[r8]
            QL r10 = new QL
            r10.<init>(r6)
            r9[r7] = r10
            r13.setFilters(r9)
            android.widget.EditText r13 = r12.f2311o
            dN r9 = new dN
            r9.<init>(r13)
            r13.addTextChangedListener(r9)
            r13 = 2131296349(0x7f09005d, float:1.8210612E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.Button r13 = (android.widget.Button) r13
            r12.f2321t = r13
            r13 = 2131296347(0x7f09005b, float:1.8210608E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.Button r13 = (android.widget.Button) r13
            r12.f2323u = r13
            r13 = 2131296348(0x7f09005c, float:1.821061E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.Button r13 = (android.widget.Button) r13
            r12.f2325v = r13
            JU r13 = r12.f2285b
            android.widget.Button r9 = r12.f2323u
            android.widget.Button r10 = r12.f2325v
            r13.mo505a(r9, r10)
            r13 = 2131296346(0x7f09005a, float:1.8210606E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r12.f2327w = r13
            r13 = 2131296583(0x7f090147, float:1.8211087E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.RadioGroup r13 = (android.widget.RadioGroup) r13
            r12.f2331z = r13
            r13 = 2131296581(0x7f090145, float:1.8211083E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.RadioButton r13 = (android.widget.RadioButton) r13
            r12.f2257A = r13
            r13 = 2131296582(0x7f090146, float:1.8211085E38)
            android.view.View r9 = r12.findViewById(r13)
            android.widget.RadioButton r9 = (android.widget.RadioButton) r9
            r12.f2258B = r9
            JU r9 = r12.f2285b
            android.widget.RadioButton r10 = r12.f2257A
            android.widget.RadioButton r11 = r12.f2258B
            r9.mo509a(r10, r11)
            android.widget.RadioGroup r9 = r12.f2331z
            r9.check(r13)
            r13 = 2131296495(0x7f0900ef, float:1.8210908E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r12.f2273Q = r13
            r13 = 2131296435(0x7f0900b3, float:1.8210787E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.AutoCompleteTextView r13 = (android.widget.AutoCompleteTextView) r13
            r12.f2317r = r13
            r13 = 2131296436(0x7f0900b4, float:1.8210789E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.AutoCompleteTextView r13 = (android.widget.AutoCompleteTextView) r13
            r12.f2319s = r13
            r13 = 2131296344(0x7f090058, float:1.8210602E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r12.f2329x = r13
            r13 = 2131296345(0x7f090059, float:1.8210604E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r12.f2330y = r13
            r13 = 2131296416(0x7f0900a0, float:1.8210748E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            r12.f2260D = r13
            r13 = 2131296417(0x7f0900a1, float:1.821075E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            r12.f2261E = r13
            r13 = 2131296419(0x7f0900a3, float:1.8210754E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            r12.f2262F = r13
            r13 = 2131296420(0x7f0900a4, float:1.8210756E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            r12.f2263G = r13
            java.util.Calendar r13 = java.util.Calendar.getInstance()
            java.text.SimpleDateFormat r9 = new java.text.SimpleDateFormat
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r11 = "dd-MM-yyyy"
            r9.<init>(r11, r10)
            int r9 = r13.get(r8)
            r12.f2303k = r9
            int r9 = r13.get(r6)
            r12.f2305l = r9
            r9 = 5
            int r13 = r13.get(r9)
            r12.f2307m = r13
            r12.mo3659v()
            android.widget.ArrayAdapter r13 = new android.widget.ArrayAdapter
            java.lang.String[] r9 = r12.f2277U
            r10 = 17367050(0x109000a, float:2.5162954E-38)
            r13.<init>(r12, r10, r9)
            r12.f2270N = r13
            android.widget.AutoCompleteTextView r13 = r12.f2309n
            r13.setThreshold(r8)
            android.widget.AutoCompleteTextView r13 = r12.f2309n
            android.widget.ArrayAdapter<java.lang.String> r9 = r12.f2270N
            r13.setAdapter(r9)
            android.widget.AutoCompleteTextView r13 = r12.f2309n
            r13.setOnItemClickListener(r12)
            JU r13 = r12.f2285b
            android.widget.AutoCompleteTextView r9 = r12.f2309n
            r13.mo501a(r12, r9)
            r12.mo3607a(r8)
            r12.mo3661x()
            android.content.Intent r13 = r12.getIntent()     // Catch:{ Exception -> 0x01b2 }
            java.lang.String r13 = r13.getStringExtra(r1)     // Catch:{ Exception -> 0x01b2 }
            if (r13 == 0) goto L_0x01b2
            android.content.Intent r13 = r12.getIntent()     // Catch:{ Exception -> 0x01b2 }
            java.lang.String r13 = r13.getStringExtra(r1)     // Catch:{ Exception -> 0x01b2 }
            java.lang.String r1 = "1"
            boolean r13 = r13.equals(r1)     // Catch:{ Exception -> 0x01b2 }
            if (r13 == 0) goto L_0x01b2
            JU r13 = r12.f2285b     // Catch:{ Exception -> 0x01b2 }
            r13.mo481T()     // Catch:{ Exception -> 0x01b2 }
        L_0x01b2:
            android.content.Intent r13 = r12.getIntent()     // Catch:{ Exception -> 0x021e }
            java.lang.String r13 = r13.getStringExtra(r4)     // Catch:{ Exception -> 0x021e }
            if (r13 == 0) goto L_0x0219
            android.widget.AutoCompleteTextView r13 = r12.f2309n     // Catch:{ Exception -> 0x021e }
            android.content.Intent r1 = r12.getIntent()     // Catch:{ Exception -> 0x021e }
            java.lang.String r1 = r1.getStringExtra(r4)     // Catch:{ Exception -> 0x021e }
            r13.setText(r1)     // Catch:{ Exception -> 0x021e }
            android.content.Intent r13 = r12.getIntent()     // Catch:{ Exception -> 0x021e }
            java.lang.String r13 = r13.getStringExtra(r4)     // Catch:{ Exception -> 0x021e }
            r12.f2289d = r13     // Catch:{ Exception -> 0x021e }
            android.content.Intent r13 = r12.getIntent()     // Catch:{ Exception -> 0x021e }
            java.lang.String r1 = "CUS_GSM"
            java.lang.String r13 = r13.getStringExtra(r1)     // Catch:{ Exception -> 0x021e }
            r12.f2297h = r13     // Catch:{ Exception -> 0x021e }
            android.content.Intent r13 = r12.getIntent()     // Catch:{ Exception -> 0x021e }
            java.lang.String r1 = "CUS_ID"
            java.lang.String r13 = r13.getStringExtra(r1)     // Catch:{ Exception -> 0x021e }
            r12.f2287c = r13     // Catch:{ Exception -> 0x021e }
            android.content.Intent r13 = r12.getIntent()     // Catch:{ Exception -> 0x021e }
            java.lang.String r13 = r13.getStringExtra(r3)     // Catch:{ Exception -> 0x021e }
            r12.f2291e = r13     // Catch:{ Exception -> 0x021e }
            android.content.Intent r13 = r12.getIntent()     // Catch:{ Exception -> 0x021e }
            java.lang.String r13 = r13.getStringExtra(r5)     // Catch:{ Exception -> 0x021e }
            if (r13 != 0) goto L_0x0201
            r13 = r2
            goto L_0x0209
        L_0x0201:
            android.content.Intent r13 = r12.getIntent()     // Catch:{ Exception -> 0x021e }
            java.lang.String r13 = r13.getStringExtra(r5)     // Catch:{ Exception -> 0x021e }
        L_0x0209:
            r12.f2293f = r13     // Catch:{ Exception -> 0x021e }
            r12.f2276T = r8     // Catch:{ Exception -> 0x021e }
            android.widget.EditText r13 = r12.f2311o     // Catch:{ Exception -> 0x021e }
            r13.requestFocus()     // Catch:{ Exception -> 0x021e }
            r12.mo3607a(r8)     // Catch:{ Exception -> 0x021e }
            r12.mo3661x()     // Catch:{ Exception -> 0x021e }
            goto L_0x021e
        L_0x0219:
            android.widget.AutoCompleteTextView r13 = r12.f2309n     // Catch:{ Exception -> 0x021e }
            r13.requestFocus()     // Catch:{ Exception -> 0x021e }
        L_0x021e:
            android.content.Intent r13 = r12.getIntent()     // Catch:{ Exception -> 0x02e0 }
            java.lang.String r13 = r13.getStringExtra(r0)     // Catch:{ Exception -> 0x02e0 }
            if (r13 == 0) goto L_0x02e0
            r12.mo3607a(r7)     // Catch:{ Exception -> 0x02e0 }
            r12.mo3661x()     // Catch:{ Exception -> 0x02e0 }
            android.content.Intent r13 = r12.getIntent()     // Catch:{ Exception -> 0x02e0 }
            java.lang.String r13 = r13.getStringExtra(r0)     // Catch:{ Exception -> 0x02e0 }
            int r13 = java.lang.Integer.parseInt(r13)     // Catch:{ Exception -> 0x02e0 }
            r12.f2299i = r13     // Catch:{ Exception -> 0x02e0 }
            android.widget.EditText r13 = r12.f2311o     // Catch:{ Exception -> 0x02e0 }
            android.content.Intent r0 = r12.getIntent()     // Catch:{ Exception -> 0x02e0 }
            java.lang.String r1 = "TR_AMOUNT"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ Exception -> 0x02e0 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02e0 }
            java.lang.String r1 = ","
            java.lang.String r0 = r0.replaceAll(r1, r2)     // Catch:{ Exception -> 0x02e0 }
            r13.setText(r0)     // Catch:{ Exception -> 0x02e0 }
            android.widget.TextView r13 = r12.f2313p     // Catch:{ Exception -> 0x02e0 }
            android.content.Intent r0 = r12.getIntent()     // Catch:{ Exception -> 0x02e0 }
            java.lang.String r1 = "TR_DATE"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ Exception -> 0x02e0 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02e0 }
            r13.setText(r0)     // Catch:{ Exception -> 0x02e0 }
            JU r13 = r12.f2285b     // Catch:{ Exception -> 0x02e0 }
            int r0 = r12.f2299i     // Catch:{ Exception -> 0x02e0 }
            java.lang.String r13 = r13.mo528b(r0)     // Catch:{ Exception -> 0x02e0 }
            java.lang.String r0 = "0"
            boolean r13 = r13.equals(r0)     // Catch:{ Exception -> 0x02e0 }
            if (r13 != 0) goto L_0x0290
            JU r13 = r12.f2285b     // Catch:{ Exception -> 0x02e0 }
            int r0 = r12.f2299i     // Catch:{ Exception -> 0x02e0 }
            java.lang.String r13 = r13.mo548c(r0)     // Catch:{ Exception -> 0x02e0 }
            r12.f2282Z = r13     // Catch:{ Exception -> 0x02e0 }
            android.widget.RadioGroup r13 = r12.f2331z     // Catch:{ Exception -> 0x02e0 }
            r0 = 4
            r13.setVisibility(r0)     // Catch:{ Exception -> 0x02e0 }
            android.widget.AutoCompleteTextView r13 = r12.f2317r     // Catch:{ Exception -> 0x02e0 }
            java.lang.String r0 = r12.f2282Z     // Catch:{ Exception -> 0x02e0 }
        L_0x028c:
            r13.setText(r0)     // Catch:{ Exception -> 0x02e0 }
            goto L_0x02a6
        L_0x0290:
            android.widget.RadioGroup r13 = r12.f2331z     // Catch:{ Exception -> 0x02e0 }
            r13.setVisibility(r7)     // Catch:{ Exception -> 0x02e0 }
            android.widget.AutoCompleteTextView r13 = r12.f2317r     // Catch:{ Exception -> 0x02e0 }
            android.content.Intent r0 = r12.getIntent()     // Catch:{ Exception -> 0x02e0 }
            java.lang.String r1 = "TR_REMARKS"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ Exception -> 0x02e0 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02e0 }
            goto L_0x028c
        L_0x02a6:
            android.content.Intent r13 = r12.getIntent()     // Catch:{ Exception -> 0x02e0 }
            java.lang.String r0 = "TR_TYPE"
            r1 = -10
            int r13 = r13.getIntExtra(r0, r1)     // Catch:{ Exception -> 0x02e0 }
            android.widget.Button r0 = r12.f2321t     // Catch:{ Exception -> 0x02e0 }
            r1 = 2131755108(0x7f100064, float:1.9141086E38)
            java.lang.String r1 = r12.getString(r1)     // Catch:{ Exception -> 0x02e0 }
            r0.setText(r1)     // Catch:{ Exception -> 0x02e0 }
            int[] r0 = r12.f2279W     // Catch:{ Exception -> 0x02e0 }
            r0 = r0[r7]     // Catch:{ Exception -> 0x02e0 }
            if (r13 != r0) goto L_0x02ca
            android.widget.RadioButton r13 = r12.f2257A     // Catch:{ Exception -> 0x02e0 }
        L_0x02c6:
            r13.setChecked(r8)     // Catch:{ Exception -> 0x02e0 }
            goto L_0x02d3
        L_0x02ca:
            int[] r0 = r12.f2279W     // Catch:{ Exception -> 0x02e0 }
            r0 = r0[r6]     // Catch:{ Exception -> 0x02e0 }
            if (r13 != r0) goto L_0x02d3
            android.widget.RadioButton r13 = r12.f2258B     // Catch:{ Exception -> 0x02e0 }
            goto L_0x02c6
        L_0x02d3:
            android.widget.EditText r13 = r12.f2311o     // Catch:{ Exception -> 0x02e0 }
            r13.requestFocus()     // Catch:{ Exception -> 0x02e0 }
            android.widget.EditText r13 = r12.f2311o     // Catch:{ Exception -> 0x02e0 }
            r13.selectAll()     // Catch:{ Exception -> 0x02e0 }
            r12.mo3588G()     // Catch:{ Exception -> 0x02e0 }
        L_0x02e0:
            android.content.Intent r13 = r12.getIntent()     // Catch:{ Exception -> 0x0309 }
            java.lang.String r13 = r13.getStringExtra(r3)     // Catch:{ Exception -> 0x0309 }
            if (r13 == 0) goto L_0x0309
            android.content.Intent r13 = r12.getIntent()     // Catch:{ Exception -> 0x0309 }
            java.lang.String r13 = r13.getStringExtra(r3)     // Catch:{ Exception -> 0x0309 }
            r12.f2291e = r13     // Catch:{ Exception -> 0x0309 }
            android.content.Intent r13 = r12.getIntent()     // Catch:{ Exception -> 0x0309 }
            java.lang.String r13 = r13.getStringExtra(r5)     // Catch:{ Exception -> 0x0309 }
            if (r13 != 0) goto L_0x02ff
            goto L_0x0307
        L_0x02ff:
            android.content.Intent r13 = r12.getIntent()     // Catch:{ Exception -> 0x0309 }
            java.lang.String r2 = r13.getStringExtra(r5)     // Catch:{ Exception -> 0x0309 }
        L_0x0307:
            r12.f2293f = r2     // Catch:{ Exception -> 0x0309 }
        L_0x0309:
            android.widget.ListView r13 = r12.f2259C
            PJ r0 = new PJ
            r0.<init>(r12)
            r13.setOnItemClickListener(r0)
            android.widget.ListView r13 = r12.f2259C
            r0 = 3
            r13.setChoiceMode(r0)
            android.widget.ListView r13 = r12.f2259C
            bK r0 = new bK
            r0.<init>(r12)
            r13.setMultiChoiceModeListener(r0)
            r12.mo3655r()     // Catch:{ Exception -> 0x032e }
            r12.mo3633l()     // Catch:{ Exception -> 0x032e }
            JU r13 = r12.f2285b     // Catch:{ Exception -> 0x032e }
            r13.mo551c(r12)     // Catch:{ Exception -> 0x032e }
        L_0x032e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit.onCreate(android.os.Bundle):void");
    }

    public Dialog onCreateDialog(int i) {
        if (i == 0) {
            DatePickerDialog datePickerDialog = new DatePickerDialog(mo3662y() ? new ContextThemeWrapper(this, 16973939) : this, this.f2312oa, this.f2303k, this.f2305l, this.f2307m);
            return datePickerDialog;
        } else if (i != 4) {
            return null;
        } else {
            DatePickerDialog datePickerDialog2 = new DatePickerDialog(mo3662y() ? new ContextThemeWrapper(this, 16973939) : this, this.f2314pa, this.f2303k, this.f2305l, this.f2307m);
            return datePickerDialog2;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.content.Context] */
    public Loader<List<C0232LL>> onCreateLoader(int i, Bundle bundle) {
        return new C0301OL(this, this.f2287c, this.f2293f, this.f2285b);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131558410, menu);
        SearchView actionView = MenuItemCompat.getActionView(menu.findItem(2131296605));
        actionView.setSearchableInfo(((SearchManager) getSystemService("search")).getSearchableInfo(getComponentName()));
        actionView.setQueryHint(getString(2131755371));
        actionView.setOnQueryTextListener(new C0958oK(this));
        return true;
    }

    public void onDestroy() {
        Customer_Det_List_edit.super.onDestroy();
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f2309n.setText(adapterView.getItemAtPosition(i).toString());
        mo3612b(this.f2309n.getText().toString());
        mo3633l();
        mo3607a(true);
        mo3661x();
        this.f2311o.requestFocus();
    }

    public void onLoaderReset(Loader<List<C0232LL>> loader) {
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.app.Activity] */
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131296577) {
            mo3610b();
            try {
                if (this.f2285b.mo524a("prefPrintSort", true)) {
                    mo3621c(this.f2268L);
                    this.f2267K.notifyDataSetChanged();
                    this.f2316qa = 1;
                }
                mo3582A();
            } catch (Exception unused) {
            }
            return true;
        } else if (itemId != 16908332) {
            return Customer_Det_List_edit.super.onOptionsItemSelected(menuItem);
        } else {
            mo3588G();
            finish();
            return true;
        }
    }

    public void onRadioButtonClicked(View view) {
        RadioButton radioButton = (RadioButton) view;
        if (radioButton.isChecked()) {
            this.f2265I.setTag(radioButton.getText().toString());
            this.f2293f = this.f2265I.getTag() == null ? this.f2293f : this.f2265I.getTag().toString();
            mo3658u();
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.app.Activity] */
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
            mo3604a(getString(i2));
        } else if (iArr.length == 1 && iArr[0] == 0) {
            mo3635n();
        }
    }

    public void onResume() {
        Customer_Det_List_edit.super.onResume();
    }

    public void onStart() {
        Customer_Det_List_edit.super.onStart();
    }

    public void onStop() {
        Customer_Det_List_edit.super.onStop();
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.app.Activity] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00db  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3652p() {
        /*
            r7 = this;
            android.util.SparseBooleanArray r0 = r7.f2269M
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
            android.util.SparseBooleanArray r2 = r7.f2269M
            boolean r2 = r2.valueAt(r0)
            if (r2 == 0) goto L_0x00f0
            OM r2 = r7.f2267K
            android.util.SparseBooleanArray r3 = r7.f2269M
            int r0 = r3.keyAt(r0)
            LL r0 = r2.getItem(r0)
            r2 = 0
            r7.mo3607a(r2)
            java.lang.String r3 = r0.mo778i()
            java.lang.String r3 = r3.toString()
            int r3 = java.lang.Integer.parseInt(r3)
            r7.f2299i = r3
            android.widget.EditText r3 = r7.f2311o
            java.lang.String r4 = r0.mo775f()
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = ""
            java.lang.String r6 = ","
            java.lang.String r4 = r4.replaceAll(r6, r5)
            r3.setText(r4)
            android.widget.TextView r3 = r7.f2313p
            java.lang.String r4 = r0.mo777h()
            r3.setText(r4)
            android.widget.ImageView r3 = r7.f2329x
            java.lang.String r4 = r0.mo776g()
            if (r4 == 0) goto L_0x0059
            java.lang.String r4 = r0.mo776g()
            goto L_0x005a
        L_0x0059:
            r4 = r5
        L_0x005a:
            r3.setTag(r4)
            int r3 = r0.mo780k()
            java.lang.String r4 = r0.mo766a()
            r7.f2286ba = r4
            android.widget.Button r4 = r7.f2321t
            r6 = 2131755108(0x7f100064, float:1.9141086E38)
            java.lang.String r6 = r7.getString(r6)
            r4.setText(r6)
            int[] r4 = r7.f2279W
            r6 = r4[r2]
            if (r3 != r6) goto L_0x007f
            android.widget.RadioButton r3 = r7.f2257A
        L_0x007b:
            r3.setChecked(r1)
            goto L_0x0087
        L_0x007f:
            r6 = 2
            r4 = r4[r6]
            if (r3 != r4) goto L_0x0087
            android.widget.RadioButton r3 = r7.f2258B
            goto L_0x007b
        L_0x0087:
            JU r1 = r7.f2285b
            int r3 = r7.f2299i
            java.lang.String r1 = r1.mo528b(r3)
            java.lang.String r3 = "0"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00af
            JU r0 = r7.f2285b
            int r1 = r7.f2299i
            java.lang.String r0 = r0.mo548c(r1)
            r7.f2282Z = r0
            android.widget.RadioGroup r0 = r7.f2331z
            r1 = 4
            r0.setVisibility(r1)
            android.widget.AutoCompleteTextView r0 = r7.f2317r
            java.lang.String r1 = r7.f2282Z
            r0.setText(r1)
            goto L_0x00bd
        L_0x00af:
            android.widget.RadioGroup r1 = r7.f2331z
            r1.setVisibility(r2)
            android.widget.AutoCompleteTextView r1 = r7.f2317r
            java.lang.String r0 = r0.mo779j()
            r1.setText(r0)
        L_0x00bd:
            android.widget.ImageView r0 = r7.f2329x
            java.lang.Object r0 = r0.getTag()
            java.lang.String r0 = r0.toString()
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00db
            android.widget.ImageView r0 = r7.f2329x
            java.lang.Object r0 = r0.getTag()
            java.lang.String r0 = r0.toString()
            r7.mo3626e(r0)
            goto L_0x00e0
        L_0x00db:
            android.widget.ImageView r0 = r7.f2329x
            r7.mo3602a(r0)
        L_0x00e0:
            r7.mo3655r()
            android.widget.EditText r0 = r7.f2311o
            r0.selectAll()
            android.widget.EditText r0 = r7.f2311o
            r0.requestFocus()
            r7.mo3588G()
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit.mo3652p():void");
    }

    public void phone_pick_btn(View view) {
        startActivityForResult(new Intent("android.intent.action.PICK", Phone.CONTENT_URI), 1);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.app.Activity] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0058  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3654q() {
        /*
            r6 = this;
            r0 = 0
            r6.mo3607a(r0)
            r6.mo3655r()
            android.widget.EditText r1 = r6.f2311o
            java.lang.String r2 = r6.f2281Y
            java.lang.String r3 = ""
            java.lang.String r4 = ","
            java.lang.String r2 = r2.replaceAll(r4, r3)
            r1.setText(r2)
            android.widget.TextView r1 = r6.f2313p
            java.lang.String r2 = r6.f2280X
            r1.setText(r2)
            android.widget.ImageView r1 = r6.f2329x
            java.lang.String r2 = r6.f2284aa
            r1.setTag(r2)
            int r1 = r6.f2288ca
            android.widget.Button r2 = r6.f2321t
            r4 = 2131755108(0x7f100064, float:1.9141086E38)
            java.lang.String r4 = r6.getString(r4)
            r2.setText(r4)
            int[] r2 = r6.f2279W
            r4 = r2[r0]
            r5 = 1
            if (r1 != r4) goto L_0x003f
            android.widget.RadioButton r1 = r6.f2257A
        L_0x003b:
            r1.setChecked(r5)
            goto L_0x0047
        L_0x003f:
            r4 = 2
            r2 = r2[r4]
            if (r1 != r2) goto L_0x0047
            android.widget.RadioButton r1 = r6.f2258B
            goto L_0x003b
        L_0x0047:
            JU r1 = r6.f2285b
            int r2 = r6.f2299i
            java.lang.String r1 = r1.mo528b(r2)
            java.lang.String r2 = "0"
            boolean r1 = r1.equals(r2)
            r2 = 4
            if (r1 != 0) goto L_0x0068
            JU r0 = r6.f2285b
            int r1 = r6.f2299i
            java.lang.String r0 = r0.mo548c(r1)
            r6.f2282Z = r0
            android.widget.RadioGroup r0 = r6.f2331z
            r0.setVisibility(r2)
            goto L_0x006d
        L_0x0068:
            android.widget.RadioGroup r1 = r6.f2331z
            r1.setVisibility(r0)
        L_0x006d:
            android.widget.AutoCompleteTextView r0 = r6.f2317r
            java.lang.String r1 = r6.f2282Z
            r0.setText(r1)
            java.lang.String r0 = r6.f2284aa
            java.lang.String r1 = "tr_attach_l="
            android.util.Log.d(r1, r0)
            java.lang.String r0 = r6.f2284aa
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x008e
            java.lang.String r0 = r6.f2284aa
            android.util.Log.d(r1, r0)
            java.lang.String r0 = r6.f2284aa
            r6.mo3626e(r0)
            goto L_0x0093
        L_0x008e:
            android.widget.ImageView r0 = r6.f2329x
            r6.mo3602a(r0)
        L_0x0093:
            android.widget.EditText r0 = r6.f2311o
            r0.requestFocus()
            android.widget.EditText r0 = r6.f2311o
            r0.selectAll()
            r6.mo3588G()
            r0 = 500(0x1f4, float:7.0E-43)
            r6.mo3595a(r2, r0)
            r6.mo3661x()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit.mo3654q():void");
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.content.Context, android.support.v7.app.AppCompatActivity] */
    /* renamed from: r */
    public void mo3655r() {
        this.f2264H = (LinearLayout) findViewById(2131296424);
        this.f2265I = (RadioGroup) findViewById(2131296584);
        if (C0195JU.f451k) {
            this.f2266J = this.f2285b.mo605p();
            String str = this.f2293f;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            this.f2293f = str;
            RadioButton[] radioButtonArr = new RadioButton[this.f2266J.size()];
            this.f2265I.setTag(null);
            this.f2265I.removeAllViews();
            this.f2265I.clearCheck();
            for (int i = 0; i < this.f2266J.size(); i++) {
                radioButtonArr[i] = new RadioButton(this);
                RadioButton radioButton = radioButtonArr[i];
                HashMap hashMap = (HashMap) this.f2266J.get(i);
                String str3 = Attribute.NAME;
                radioButton.setText((CharSequence) hashMap.get(str3));
                radioButtonArr[i].setId(Integer.parseInt((String) ((HashMap) this.f2266J.get(i)).get(Attribute.f2026ID)) + 100);
                radioButtonArr[i].setOnClickListener(new C0939nK(this));
                this.f2265I.addView(radioButtonArr[i]);
                String str4 = this.f2286ba;
                if (str4 != null && str4.equals(((HashMap) this.f2266J.get(i)).get(str3))) {
                    this.f2265I.check(radioButtonArr[i].getId());
                    this.f2265I.setTag(((HashMap) this.f2266J.get(i)).get(str3));
                }
            }
            if (this.f2293f.equals(str2)) {
                String str5 = this.f2286ba;
                if (str5 == null || str5.equals(str2)) {
                    this.f2265I.check(radioButtonArr[this.f2266J.size() - 1].getId());
                    this.f2265I.setTag(radioButtonArr[this.f2266J.size() - 1].getText().toString());
                    this.f2293f = radioButtonArr[this.f2266J.size() - 1].getText().toString();
                }
            } else {
                this.f2265I.setTag(this.f2293f);
                for (int i2 = 0; i2 < radioButtonArr.length; i2++) {
                    if (radioButtonArr[i2].getText().toString().equals(this.f2293f)) {
                        this.f2265I.check(radioButtonArr[i2].getId());
                    }
                }
            }
        }
    }

    /* renamed from: s */
    public final C0232LL mo3656s() {
        Cursor z = this.f2285b.mo636z(this.f2309n.getText().toString());
        z.moveToFirst();
        C0232LL ll = null;
        while (!z.isAfterLast()) {
            String str = "_in";
            ll = new C0232LL(z.getString(z.getColumnIndex("_id")), z.getString(z.getColumnIndex("date_")), z.getString(z.getColumnIndex("amount")), z.getString(z.getColumnIndex("remarks")), this.f2279W[z.getInt(z.getColumnIndex(str))], String.valueOf(z.getInt(z.getColumnIndex(str))), z.getString(z.getColumnIndex("param1")), z.getString(z.getColumnIndex("curr_name")));
            z.moveToNext();
        }
        z.close();
        return ll;
    }

    /* renamed from: t */
    public final void mo3657t() {
        mo3610b();
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction("android.intent.action.GET_CONTENT");
        startActivityForResult(Intent.createChooser(intent, "Select File"), this.f2294fa);
    }

    /* renamed from: u */
    public void mo3658u() {
        Cursor cursor;
        String str;
        String str2;
        C0195JU ju;
        if (this.f2265I.getTag() != null) {
            ju = this.f2285b;
            str2 = this.f2309n.getText().toString();
            str = this.f2265I.getTag().toString();
        } else if (!C0195JU.f451k) {
            cursor = this.f2285b.mo593l(this.f2309n.getText().toString());
            mo3597a(cursor);
            mo3661x();
        } else {
            ju = this.f2285b;
            str2 = this.f2309n.getText().toString();
            str = this.f2293f;
            if (str == null) {
                str = "";
            }
        }
        cursor = ju.mo570f(str2, str);
        mo3597a(cursor);
        mo3661x();
    }

    /* renamed from: v */
    public void mo3659v() {
        Cursor D = this.f2285b.mo453D();
        this.f2277U = new String[D.getCount()];
        if (D.moveToFirst()) {
            int i = 0;
            do {
                this.f2277U[i] = D.getString(D.getColumnIndex("_id"));
                i++;
            } while (D.moveToNext());
        }
        D.close();
    }

    /* renamed from: w */
    public void mo3660w() {
        Cursor C = this.f2285b.mo451C(this.f2309n.getText().toString());
        this.f2278V = new String[C.getCount()];
        if (C.moveToFirst()) {
            int i = 0;
            do {
                this.f2278V[i] = C.getString(C.getColumnIndex("remarks"));
                i++;
            } while (C.moveToNext());
        }
        C.close();
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3661x() {
        /*
            r12 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r12.f2310na
            r0.append(r1)
            java.lang.String r1 = ""
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "get_remarks="
            android.util.Log.d(r1, r0)
            boolean r0 = r12.f2310na
            if (r0 == 0) goto L_0x001f
            r0 = 1
            r9 = 1
            goto L_0x0021
        L_0x001f:
            r0 = 2
            r9 = 2
        L_0x0021:
            PU r11 = new PU
            r11.<init>()
            QU r0 = new QU
            r2 = 4
            JU r3 = r12.f2285b
            android.widget.AutoCompleteTextView r4 = r12.f2309n
            android.widget.AutoCompleteTextView r5 = r12.f2317r
            android.widget.AutoCompleteTextView r6 = r12.f2319s
            android.widget.LinearLayout r8 = r12.f2262F
            android.widget.Button r10 = r12.f2321t
            r1 = r0
            r7 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            NU r1 = p000.C0288NU.m892a()
            r1.mo934a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit.mo3661x():void");
    }

    /* renamed from: y */
    public final boolean mo3662y() {
        return Build.MANUFACTURER.equalsIgnoreCase("samsung") && mo3615b(21, 22);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.content.Context] */
    /* renamed from: z */
    public void mo3663z() {
        if (ContextCompat.checkSelfPermission(this, "android.permission.READ_PHONE_STATE") != 0) {
            mo3583B();
        } else {
            mo3635n();
        }
    }
}
