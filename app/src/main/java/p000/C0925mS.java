package p000;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.Loader;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.SearchView;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
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
import com.itextpdf.tool.xml.css.CSS.Property;
import com.itextpdf.tool.xml.html.HTML.Attribute;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;
import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main;
import com.valdio.valdioveliu.recyclerview.threads.HelloService;
import com.valdio.valdioveliu.recyclerview.threads.HelloService_Job;
import java.io.Serializable;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

@SuppressLint({"ValidFragment"})
/* renamed from: mS */
public class C0925mS extends Fragment implements LoaderCallbacks<List<C0082EH>> {

    /* renamed from: a */
    public static int f3343a;

    /* renamed from: A */
    public Boolean f3344A;

    /* renamed from: B */
    public Boolean f3345B;

    /* renamed from: C */
    public String f3346C;

    /* renamed from: D */
    public String f3347D;

    /* renamed from: E */
    public String f3348E;

    /* renamed from: F */
    public String f3349F;

    /* renamed from: G */
    public String f3350G;

    /* renamed from: H */
    public String f3351H;

    /* renamed from: I */
    public String f3352I;

    /* renamed from: J */
    public String f3353J;

    /* renamed from: K */
    public Context f3354K;

    /* renamed from: L */
    public View f3355L;

    /* renamed from: M */
    public Activity f3356M;

    /* renamed from: N */
    public SwipeRefreshLayout f3357N;

    /* renamed from: O */
    public int f3358O;

    /* renamed from: P */
    public ArrayList<HashMap<String, String>> f3359P;

    /* renamed from: Q */
    public OnClickListener f3360Q;

    /* renamed from: R */
    public EditText f3361R;

    /* renamed from: S */
    public boolean f3362S;

    /* renamed from: T */
    public String f3363T;

    /* renamed from: U */
    public ArrayList<String> f3364U;

    /* renamed from: V */
    public Bundle f3365V;

    /* renamed from: W */
    public Bundle f3366W;

    /* renamed from: X */
    public SearchView f3367X;

    /* renamed from: Y */
    public C0926a f3368Y;

    /* renamed from: Z */
    public boolean f3369Z;

    /* renamed from: aa */
    public LoaderCallbacks<List<String>> f3370aa;

    /* renamed from: b */
    public SQLiteDatabase f3371b;

    /* renamed from: c */
    public C0195JU f3372c;

    /* renamed from: d */
    public EditText f3373d = null;

    /* renamed from: e */
    public EditText f3374e = null;

    /* renamed from: f */
    public Button f3375f = null;

    /* renamed from: g */
    public int f3376g;

    /* renamed from: h */
    public int f3377h;

    /* renamed from: i */
    public String f3378i;

    /* renamed from: j */
    public String f3379j;

    /* renamed from: k */
    public String f3380k;

    /* renamed from: l */
    public ListView f3381l;

    /* renamed from: m */
    public TextView f3382m;

    /* renamed from: n */
    public C0388SM f3383n;

    /* renamed from: o */
    public List<C0082EH> f3384o;

    /* renamed from: p */
    public ArrayList<C0260MM> f3385p;

    /* renamed from: q */
    public SparseBooleanArray f3386q;

    /* renamed from: r */
    public ActionBar f3387r;

    /* renamed from: s */
    public TextView f3388s;

    /* renamed from: t */
    public AdView f3389t;

    /* renamed from: u */
    public ImageView f3390u;

    /* renamed from: v */
    public ImageView f3391v;

    /* renamed from: w */
    public ImageView f3392w;

    /* renamed from: x */
    public int[] f3393x;

    /* renamed from: y */
    public String[] f3394y;

    /* renamed from: z */
    public boolean f3395z;

    /* renamed from: mS$a */
    public interface C0926a {
        void onButtonClicked(MenuItem menuItem);
    }

    public C0925mS() {
        Boolean valueOf = Boolean.valueOf(false);
        this.f3376g = 0;
        this.f3377h = -1;
        this.f3381l = null;
        this.f3382m = null;
        this.f3384o = new ArrayList();
        this.f3385p = new ArrayList<>();
        this.f3387r = null;
        this.f3388s = null;
        this.f3393x = new int[]{2131230923, 1, 2131230855};
        this.f3394y = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        this.f3395z = false;
        this.f3344A = valueOf;
        this.f3345B = valueOf;
        this.f3355L = null;
        this.f3358O = -1;
        this.f3359P = new ArrayList<>();
        this.f3360Q = new C0820hS(this);
        this.f3363T = "";
        this.f3364U = new ArrayList<>();
        this.f3369Z = true;
        this.f3370aa = new C0649cS(this);
    }

    /* renamed from: a */
    public static C0925mS m3049a(C0260MM mm, int i, int i2, String str, String str2) {
        C0925mS mSVar = new C0925mS();
        Bundle bundle = new Bundle();
        bundle.putString("cus_id", mm.mo889b());
        bundle.putString("cus_name", mm.mo890c());
        bundle.putInt(Property.POSITION, i);
        bundle.putInt(Attribute.SIZE, i2);
        bundle.putString("g_name", str);
        bundle.putString("curr_name", str2);
        mSVar.setArguments(bundle);
        return mSVar;
    }

    /* renamed from: a */
    public double mo4723a(List<C0082EH> list) {
        double d = 0.0d;
        for (int size = list.size() - 1; size >= 0; size--) {
            int i = ((C0082EH) list.get(size)).mo193h() == this.f3393x[0] ? -1 : ((C0082EH) list.get(size)).mo193h() == this.f3393x[2] ? 1 : 0;
            double parseDouble = Double.parseDouble(((C0082EH) list.get(size)).mo180a().replaceAll(",", ""));
            double d2 = (double) i;
            Double.isNaN(d2);
            d += parseDouble * d2;
        }
        return d;
    }

    /* renamed from: a */
    public final void mo4724a() {
        int i = Calendar.getInstance().get(14);
        LoaderManager supportLoaderManager = getActivity().getSupportLoaderManager();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3378i);
        sb.append(1);
        supportLoaderManager.initLoader((Integer.parseInt(sb.toString()) * i * 1000000) + i, null, this.f3370aa).forceLoad();
        LoaderManager supportLoaderManager2 = getActivity().getSupportLoaderManager();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f3378i);
        sb2.append(1);
        supportLoaderManager2.initLoader(Integer.parseInt(sb2.toString()) * i, null, this).forceLoad();
    }

    /* renamed from: a */
    public void mo4725a(Cursor cursor) {
        cursor.getCount();
        this.f3384o.clear();
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            C0082EH eh = new C0082EH(cursor.getString(cursor.getColumnIndex(Attribute.f2026ID)), cursor.getString(cursor.getColumnIndex("_id")), cursor.getString(cursor.getColumnIndex("phone")), cursor.getDouble(cursor.getColumnIndex("amount")), this.f3393x[cursor.getInt(cursor.getColumnIndex("_in"))], 0, cursor.getString(cursor.getColumnIndex("g_name")), !C0195JU.f451k ? "" : cursor.getString(cursor.getColumnIndex("curr_name")));
            eh.mo190e(cursor.getString(cursor.getColumnIndex("cnt")));
            this.f3384o.add(eh);
            cursor.moveToNext();
        }
        cursor.close();
        C0388SM sm = this.f3383n;
        if (sm != null) {
            sm.f1138i.clear();
            this.f3383n.notifyDataSetChanged();
        }
        this.f3365V = new Bundle();
        this.f3365V.putSerializable("dataCus", (Serializable) this.f3384o);
        mo4737b(this.f3372c.mo444A());
    }

    /* renamed from: a */
    public void onLoadFinished(Loader<List<C0082EH>> loader, List<C0082EH> list) {
        String str = "trace_E_Loader1=";
        String str2 = ":";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(FragmentStatePagerSupport_Main.m2279h());
            sb.append(str2);
            sb.append(this.f3380k);
            sb.append(str2);
            sb.append(this.f3378i);
            Log.d(str, sb.toString());
            this.f3384o = list;
            this.f3381l.setEmptyView(this.f3382m);
            this.f3383n = new C0388SM(getActivity(), 2131492935, this.f3384o);
            this.f3381l.setAdapter(this.f3383n);
            this.f3365V = new Bundle();
            this.f3365V.putSerializable("dataCus", (Serializable) this.f3384o);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(FragmentStatePagerSupport_Main.m2279h());
            sb2.append(str2);
            sb2.append(this.f3380k);
            sb2.append(str2);
            sb2.append(this.f3378i);
            sb2.append(str2);
            sb2.append(getUserVisibleHint());
            Log.d(str, sb2.toString());
            if (getUserVisibleHint() && !this.f3372c.mo524a("hello_serv", false) && this.f3377h == 0) {
                if (VERSION.SDK_INT >= 23) {
                    HelloService_Job.m2550b(getActivity());
                    return;
                }
                getActivity().startService(new Intent(getActivity(), HelloService.class));
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void mo4727a(View view) {
        try {
            if (this.f3384o.size() == 0) {
                amount_add_btn(view);
                return;
            }
            Intent intent = new Intent(view.getContext(), Customer_Det_List_edit2.class);
            intent.putExtra("G_NAME", this.f3379j);
            intent.putExtra("CURR_NAME", this.f3380k);
            intent.putExtra("screen_main", true);
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void mo4728a(ArrayAdapter<String> arrayAdapter, AutoCompleteTextView autoCompleteTextView) {
        Dialog dialog = new Dialog(getActivity());
        LinearLayout linearLayout = new LinearLayout(getActivity());
        ListView listView = new ListView(getActivity());
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new C0111FR(this, autoCompleteTextView, dialog));
        linearLayout.setFocusable(true);
        listView.setBackgroundColor(Color.parseColor("#FFFFFF"));
        linearLayout.addView(listView, -1, -1);
        dialog.setContentView(linearLayout);
        dialog.setTitle(autoCompleteTextView.getHint().toString());
        dialog.show();
    }

    /* renamed from: a */
    public final void mo4729a(String str) {
        String str2 = "g_name";
        if (getActivity() != null) {
            Intent intent = new Intent(getActivity(), FragmentStatePagerSupport_Main.class);
            intent.putExtra(str2, str);
            getActivity().finish();
            startActivity(intent);
            return;
        }
        Context context = this.f3354K;
        if (context != null) {
            Intent intent2 = new Intent(context, FragmentStatePagerSupport_Main.class);
            intent2.putExtra(str2, str);
            this.f3354K.finish();
            this.f3354K.startActivity(intent2);
        }
    }

    /* renamed from: a */
    public final void mo4730a(String str, String str2) {
        String str3 = "curr_name";
        String str4 = "g_name";
        if (getActivity() != null) {
            Intent intent = new Intent(getActivity(), FragmentStatePagerSupport_Main.class);
            intent.putExtra(str4, str);
            intent.putExtra(str3, str2);
            getActivity().finish();
            startActivity(intent);
            return;
        }
        Context context = this.f3354K;
        if (context != null) {
            Intent intent2 = new Intent(context, FragmentStatePagerSupport_Main.class);
            intent2.putExtra(str4, str);
            intent2.putExtra(str3, str2);
            this.f3354K.finish();
            this.f3354K.startActivity(intent2);
        }
    }

    /* renamed from: a */
    public void mo4731a(String str, String str2, String str3, String str4) {
        try {
            Builder builder = new Builder(getActivity());
            View inflate = getActivity().getLayoutInflater().inflate(2131492955, null);
            builder.setView(inflate);
            EditText editText = (EditText) inflate.findViewById(2131296387);
            EditText editText2 = (EditText) inflate.findViewById(2131296389);
            ImageView imageView = (ImageView) inflate.findViewById(2131296498);
            ImageView imageView2 = (ImageView) inflate.findViewById(2131296499);
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) inflate.findViewById(2131296384);
            editText.setText(str2);
            editText2.setText(str3);
            autoCompleteTextView.setText(str4);
            ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(), 17367049, this.f3372c.mo457G());
            autoCompleteTextView.setThreshold(1);
            autoCompleteTextView.setAdapter(arrayAdapter);
            autoCompleteTextView.setOnItemClickListener(new C0841iS(this, autoCompleteTextView));
            autoCompleteTextView.setOnTouchListener(new C0861jS(this, autoCompleteTextView));
            this.f3361R = editText2;
            editText2.requestFocus();
            imageView.setOnClickListener(new C0881kS(this));
            imageView2.setOnClickListener(new C0906lS(this, arrayAdapter, autoCompleteTextView));
            builder.setPositiveButton(getActivity().getString(2131755359), new C0054CR(this));
            builder.setNegativeButton(getActivity().getString(2131755358), new C0073DR(this));
            AlertDialog create = builder.create();
            create.getWindow().setSoftInputMode(4);
            create.show();
            Button button = create.getButton(-1);
            C0092ER er = new C0092ER(this, editText, editText2, autoCompleteTextView, str, create);
            button.setOnClickListener(er);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public boolean mo4732a(String str, String str2, Context context) {
        C0441UR ur = new C0441UR(this);
        Builder builder = new Builder(context);
        builder.setTitle(str);
        builder.setMessage(str2);
        builder.setPositiveButton(getActivity().getString(2131755137), new C0462VR(this, ur));
        builder.setNegativeButton(getActivity().getString(2131755136), new C0483WR(this, ur));
        builder.show();
        try {
            Looper.loop();
        } catch (RuntimeException unused) {
        }
        return this.f3362S;
    }

    public void add_btn(View view) {
        Log.d("ADD_BTN:", "START");
        if (this.f3383n.mo1179a() <= 0) {
            TextView textView = (TextView) ((LinearLayout) ((View) view.getParent()).getParent()).findViewById(2131296394);
            Intent intent = new Intent(view.getContext(), Customer_Det_List_edit.class);
            intent.putExtra("CUS_NAME", textView.getText().toString());
            startActivity(intent);
            f3343a = this.f3381l.getFirstVisiblePosition();
        }
    }

    public void amount_add_btn(View view) {
        Intent intent = new Intent(view.getContext(), Customer_Det_List_edit.class);
        intent.putExtra("G_NAME", this.f3379j);
        intent.putExtra("CURR_NAME", this.f3380k);
        startActivity(intent);
    }

    /* renamed from: b */
    public void mo4735b() {
        for (int size = this.f3386q.size() - 1; size >= 0; size--) {
            if (this.f3386q.valueAt(size)) {
                C0082EH item = this.f3383n.getItem(this.f3386q.keyAt(size));
                this.f3383n.remove(item);
                this.f3372c.mo515a(item.mo191f());
            }
        }
        mo4741c(1);
    }

    /* renamed from: b */
    public void mo4736b(int i) {
        TextView textView;
        StringBuilder sb;
        String str;
        NumberFormat instance = NumberFormat.getInstance(Locale.ENGLISH);
        String str2 = "\n";
        String str3 = "";
        String str4 = " ";
        if (i == 1) {
            this.f3388s.setText(this.f3347D);
            try {
                this.f3364U = !C0195JU.f451k ? this.f3372c.mo613r(this.f3378i) : this.f3372c.mo588j(this.f3378i, this.f3380k);
                TextView textView2 = this.f3388s;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f3348E);
                sb2.append(instance.format(Double.parseDouble((String) this.f3364U.get(0))));
                sb2.append(str4);
                sb2.append(this.f3349F);
                sb2.append(instance.format(Double.parseDouble((String) this.f3364U.get(1))));
                if (C0195JU.f451k) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str2);
                    sb3.append(this.f3380k);
                    str3 = sb3.toString();
                }
                sb2.append(str3);
                textView2.setText(sb2.toString());
                if (this.f3364U.size() > 1 && Double.parseDouble((String) this.f3364U.get(0)) == 0.0d) {
                    Double.parseDouble((String) this.f3364U.get(1));
                }
            } catch (Exception unused) {
            }
        } else if (i == 2) {
            double a = mo4723a(this.f3383n.f1133d);
            if (!C0195JU.f451k) {
                textView = this.f3388s;
                sb = new StringBuilder();
                sb.append(this.f3351H);
                str = instance.format(a);
            } else {
                textView = this.f3388s;
                sb = new StringBuilder();
                sb.append(this.f3351H);
                sb.append(instance.format(a));
                sb.append(str4);
                str = this.f3380k;
            }
            sb.append(str);
            textView.setText(sb.toString());
        } else if (i == 3) {
            this.f3388s.setText(this.f3346C);
            ArrayList j = this.f3372c.mo588j(this.f3378i, this.f3380k);
            if (j.size() > 1) {
                TextView textView3 = this.f3388s;
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.f3348E);
                sb4.append(instance.format(Double.parseDouble((String) j.get(0))));
                sb4.append(str4);
                sb4.append(this.f3349F);
                sb4.append(instance.format(Double.parseDouble((String) j.get(1))));
                if (C0195JU.f451k) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(str2);
                    sb5.append(this.f3380k);
                    str3 = sb5.toString();
                }
                sb4.append(str3);
                textView3.setText(sb4.toString());
            }
        }
        mo4743e();
    }

    /* renamed from: b */
    public void mo4737b(Cursor cursor) {
        cursor.getCount();
        this.f3385p.clear();
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            this.f3385p.add(new C0260MM(cursor.getString(cursor.getColumnIndex("_id")), cursor.getString(cursor.getColumnIndex("g_name")), cursor.getString(cursor.getColumnIndex("curr_name"))));
            cursor.moveToNext();
        }
        cursor.close();
        this.f3366W = new Bundle();
        this.f3366W.putSerializable("dataGroups", this.f3385p);
    }

    /* renamed from: b */
    public void mo4738b(View view) {
        try {
            startActivityForResult(new Intent("android.intent.action.PICK", Phone.CONTENT_URI), 1);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public void mo4739b(String str) {
        try {
            this.f3383n.getFilter().filter(str);
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public void mo4740c() {
        String str;
        TelephonyManager telephonyManager = (TelephonyManager) getActivity().getSystemService("phone");
        try {
            C0195JU.f445e = telephonyManager.getDeviceId().substring(0, 14);
            C0195JU.f446f = C0753eN.m2610a(C0195JU.f445e);
            if (!this.f3372c.mo612r().equals("") && !this.f3372c.mo612r().equals(C0195JU.f445e) && VERSION.SDK_INT >= 23 && telephonyManager.getPhoneCount() == 2) {
                if (telephonyManager.getDeviceId(0).substring(0, 14).equals(this.f3372c.mo612r())) {
                    C0195JU.f445e = telephonyManager.getDeviceId(0).substring(0, 14);
                    str = C0195JU.f445e;
                } else {
                    if (telephonyManager.getDeviceId(1).substring(0, 14).equals(this.f3372c.mo612r())) {
                        C0195JU.f445e = telephonyManager.getDeviceId(1).substring(0, 14);
                        str = C0195JU.f445e;
                    }
                }
                C0195JU.f446f = C0753eN.m2610a(str);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public void mo4741c(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(":Called:");
        sb.append(this.f3378i);
        Log.d("get_all_names=", sb.toString());
        if (i == 0) {
            mo4725a(!C0195JU.f451k ? this.f3372c.mo621u(this.f3378i) : this.f3372c.mo591k(this.f3378i, this.f3380k));
            this.f3388s.setText(getString(2131755191));
            mo4736b(1);
        } else if (i == 1) {
            mo4725a(!C0195JU.f451k ? this.f3372c.mo621u(this.f3378i) : this.f3372c.mo591k(this.f3378i, this.f3380k));
            mo4736b(3);
        }
    }

    /* renamed from: d */
    public void mo4742d() {
        int size = this.f3386q.size() - 1;
        if (this.f3386q.valueAt(size)) {
            C0082EH item = this.f3383n.getItem(this.f3386q.keyAt(size));
            this.f3376g = Integer.parseInt(item.mo191f());
            mo4731a(item.mo191f(), item.mo192g(), item.mo189e(), item.mo187d());
        }
    }

    /* renamed from: e */
    public void mo4743e() {
        try {
            if (C0195JU.f451k) {
                C0356QU qu = new C0356QU(13, this.f3372c, this.f3388s, this.f3378i, "0", this.f3380k, 0, new C0334PU());
                C0288NU.m892a().mo934a(qu);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: f */
    public void mo4744f() {
        try {
            if (this.f3372c.mo524a("black_list", false) || !this.f3372c.mo524a("prefAds", false)) {
                this.f3389t.loadAd(new AdRequest.Builder().addTestDevice("226E3AC0F4F5BB5983B2A38C295C3509").addTestDevice("95187DFF9C4F49F99F28C0103255A64F").build());
                return;
            }
            this.f3389t.setVisibility(8);
        } catch (Exception unused) {
        }
    }

    /* renamed from: g */
    public void mo4745g() {
        try {
            Builder builder = new Builder(getActivity());
            View inflate = getActivity().getLayoutInflater().inflate(2131492956, null);
            builder.setView(inflate);
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) inflate.findViewById(2131296667);
            ImageView imageView = (ImageView) inflate.findViewById(2131296501);
            ImageView imageView2 = (ImageView) inflate.findViewById(2131296500);
            AutoCompleteTextView autoCompleteTextView2 = (AutoCompleteTextView) inflate.findViewById(2131296380);
            ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(), 17367049, this.f3372c.mo616s());
            int size = this.f3386q.size() - 1;
            String str = "";
            if (this.f3386q.valueAt(size)) {
                C0082EH item = this.f3383n.getItem(this.f3386q.keyAt(size));
                String g = item.mo192g();
                item.mo191f();
                str = g;
            }
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(getActivity(), 17367050, this.f3372c.mo598m(str, autoCompleteTextView.getText().toString()));
            autoCompleteTextView2.setText(this.f3380k);
            autoCompleteTextView2.setOnItemClickListener(new C0131GR(this, autoCompleteTextView2));
            autoCompleteTextView2.setOnTouchListener(new C0153HR(this, autoCompleteTextView2));
            autoCompleteTextView2.setAdapter(arrayAdapter);
            autoCompleteTextView.setAdapter(arrayAdapter2);
            autoCompleteTextView2.requestFocus();
            autoCompleteTextView2.selectAll();
            imageView.setOnClickListener(new C0173IR(this, arrayAdapter, autoCompleteTextView2));
            imageView2.setOnClickListener(new C0192JR(this, arrayAdapter2, autoCompleteTextView));
            builder.setPositiveButton(getActivity().getString(2131755359), new C0214KR(this));
            builder.setNegativeButton(getActivity().getString(2131755358), new C0238LR(this));
            AlertDialog create = builder.create();
            create.setTitle(getActivity().getString(2131755243));
            create.getWindow().setSoftInputMode(4);
            create.show();
            Button button = create.getButton(-1);
            C0285NR nr = new C0285NR(this, autoCompleteTextView2, autoCompleteTextView, size, create);
            button.setOnClickListener(nr);
        } catch (Exception unused) {
        }
    }

    /* renamed from: h */
    public void mo4746h() {
        try {
            Builder builder = new Builder(getActivity());
            View inflate = getActivity().getLayoutInflater().inflate(2131492955, null);
            builder.setView(inflate);
            EditText editText = (EditText) inflate.findViewById(2131296389);
            ImageView imageView = (ImageView) inflate.findViewById(2131296498);
            ImageView imageView2 = (ImageView) inflate.findViewById(2131296499);
            ((EditText) inflate.findViewById(2131296387)).setVisibility(8);
            editText.setVisibility(8);
            imageView.setVisibility(8);
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) inflate.findViewById(2131296384);
            ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(), 17367049, this.f3372c.mo457G());
            autoCompleteTextView.setText(this.f3372c.mo632y(this.f3378i));
            autoCompleteTextView.setOnItemClickListener(new C0309OR(this, autoCompleteTextView));
            autoCompleteTextView.setOnTouchListener(new C0331PR(this, autoCompleteTextView));
            autoCompleteTextView.setAdapter(arrayAdapter);
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.selectAll();
            imageView2.setOnClickListener(new C0353QR(this, arrayAdapter, autoCompleteTextView));
            builder.setPositiveButton(getActivity().getString(2131755359), new C0373RR(this));
            builder.setNegativeButton(getActivity().getString(2131755358), new C0395SR(this));
            AlertDialog create = builder.create();
            create.setTitle(getActivity().getString(2131755110));
            create.getWindow().setSoftInputMode(4);
            create.show();
            create.getButton(-1).setOnClickListener(new C0415TR(this, autoCompleteTextView, create));
        } catch (Exception unused) {
        }
    }

    public void help_btn(View view) {
        mo4749j();
    }

    /* renamed from: i */
    public final void mo4748i() {
        try {
            if (C0195JU.f451k) {
                if (this.f3359P.size() == 0) {
                    this.f3359P = this.f3372c.mo605p();
                }
                int i = 0;
                while (i < this.f3359P.size()) {
                    if (this.f3358O >= this.f3359P.size() - 1) {
                        this.f3358O = -1;
                    }
                    this.f3358O++;
                    String str = (String) ((HashMap) this.f3359P.get(this.f3358O)).get(Attribute.NAME);
                    if (str.equals("") || this.f3372c.mo600n(this.f3378i, str).getCount() <= 0 || str.equals(this.f3380k)) {
                        i++;
                    } else {
                        this.f3380k = str;
                        mo4741c(1);
                        return;
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: j */
    public void mo4749j() {
        Builder builder = new Builder(getActivity());
        WebView webView = new WebView(getActivity());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/help.html");
        webView.setWebViewClient(new C0552ZR(this));
        builder.setView(webView);
        builder.setNegativeButton(getActivity().getString(2131755134), new C0575_R(this));
        builder.show();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str = "display_name";
        String str2 = "data1";
        if (i == 1) {
            try {
                getActivity();
                if (i2 == -1) {
                    Cursor query = getActivity().getContentResolver().query(intent.getData(), new String[]{str2, str}, null, null, null);
                    query.moveToFirst();
                    String string = query.getString(query.getColumnIndex(str2));
                    String string2 = query.getString(query.getColumnIndex(str));
                    this.f3361R.setText(string);
                    query.close();
                    StringBuilder sb = new StringBuilder();
                    sb.append("ZZZ number : ");
                    sb.append(string);
                    sb.append(" , name : ");
                    sb.append(string2);
                    Log.d("Phone=", sb.toString());
                }
            } catch (Exception unused) {
            }
        }
    }

    public void onAttach(Activity activity) {
        C0925mS.super.onAttach(activity);
        this.f3356M = activity;
        try {
            this.f3368Y = (C0926a) activity;
        } catch (ClassCastException unused) {
        }
    }

    public void onCreate(Bundle bundle) {
        C0925mS.super.onCreate(bundle);
        String str = "";
        this.f3378i = getArguments() != null ? getArguments().getString("cus_id") : str;
        this.f3379j = getArguments() != null ? getArguments().getString("g_name") : str;
        if (getArguments() != null) {
            str = getArguments().getString("curr_name");
        }
        this.f3380k = str;
        this.f3377h = getArguments() != null ? getArguments().getInt(Property.POSITION) : -1;
        this.f3372c = new C0195JU(this.f3371b, getActivity());
    }

    public Loader<List<C0082EH>> onCreateLoader(int i, Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        sb.append(FragmentStatePagerSupport_Main.m2279h());
        String str = ":";
        sb.append(str);
        sb.append(this.f3380k);
        sb.append(str);
        sb.append(this.f3378i);
        Log.d("trace_S_Loader1=", sb.toString());
        return new C1142wR(getActivity(), this.f3378i, this.f3380k, this.f3372c);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        Log.d("Oncreate:", "Menu_Create");
        menu.clear();
        menuInflater.inflate(2131558412, menu);
        MenuItem findItem = menu.findItem(2131296605);
        this.f3367X = MenuItemCompat.getActionView(findItem);
        this.f3367X.setSearchableInfo(((SearchManager) getActivity().getSystemService("search")).getSearchableInfo(getActivity().getComponentName()));
        this.f3367X.setQueryHint(getActivity().getString(2131755371));
        this.f3367X.setOnQueryTextListener(new C0610aS(this));
        MenuItemCompat.setOnActionExpandListener(findItem, new C0630bS(this));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:1|2|(1:4)(1:6)|5|7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0159 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public View onCreateView(android.view.LayoutInflater r2, android.view.ViewGroup r3, Bundle r4) {
        /*
            r1 = this;
            r4 = 2131492915(0x7f0c0033, float:1.8609295E38)
            r0 = 0
            android.view.View r2 = r2.inflate(r4, r3, r0)     // Catch:{ Exception -> 0x015c }
            r1.f3355L = r2     // Catch:{ Exception -> 0x015c }
            JU r2 = new JU     // Catch:{ Exception -> 0x015c }
            android.database.sqlite.SQLiteDatabase r3 = r1.f3371b     // Catch:{ Exception -> 0x015c }
            android.support.v4.app.FragmentActivity r4 = r1.getActivity()     // Catch:{ Exception -> 0x015c }
            r2.<init>(r3, r4)     // Catch:{ Exception -> 0x015c }
            r1.f3372c = r2     // Catch:{ Exception -> 0x015c }
            android.support.v4.app.FragmentActivity r2 = r1.getActivity()     // Catch:{ Exception -> 0x015c }
            r1.f3356M = r2     // Catch:{ Exception -> 0x015c }
            r2 = 1
            r1.setHasOptionsMenu(r2)     // Catch:{ Exception -> 0x015c }
            android.view.View r2 = r1.f3355L     // Catch:{ Exception -> 0x015c }
            r3 = 2131296466(0x7f0900d2, float:1.821085E38)
            android.view.View r2 = r2.findViewById(r3)     // Catch:{ Exception -> 0x015c }
            android.widget.TextView r2 = (android.widget.TextView) r2     // Catch:{ Exception -> 0x015c }
            r1.f3388s = r2     // Catch:{ Exception -> 0x015c }
            android.widget.TextView r2 = r1.f3388s     // Catch:{ Exception -> 0x015c }
            MR r3 = new MR     // Catch:{ Exception -> 0x015c }
            r3.<init>(r1)     // Catch:{ Exception -> 0x015c }
            r2.setOnClickListener(r3)     // Catch:{ Exception -> 0x015c }
            android.support.v4.app.FragmentActivity r2 = r1.getActivity()     // Catch:{ Exception -> 0x015c }
            r3 = 2131755191(0x7f1000b7, float:1.9141254E38)
            java.lang.String r2 = r2.getString(r3)     // Catch:{ Exception -> 0x015c }
            r1.f3346C = r2     // Catch:{ Exception -> 0x015c }
            android.support.v4.app.FragmentActivity r2 = r1.getActivity()     // Catch:{ Exception -> 0x015c }
            r3 = 2131755188(0x7f1000b4, float:1.9141248E38)
            java.lang.String r2 = r2.getString(r3)     // Catch:{ Exception -> 0x015c }
            r1.f3347D = r2     // Catch:{ Exception -> 0x015c }
            android.support.v4.app.FragmentActivity r2 = r1.getActivity()     // Catch:{ Exception -> 0x015c }
            r3 = 2131755192(0x7f1000b8, float:1.9141256E38)
            java.lang.String r2 = r2.getString(r3)     // Catch:{ Exception -> 0x015c }
            r1.f3348E = r2     // Catch:{ Exception -> 0x015c }
            android.support.v4.app.FragmentActivity r2 = r1.getActivity()     // Catch:{ Exception -> 0x015c }
            r3 = 2131755190(0x7f1000b6, float:1.9141252E38)
            java.lang.String r2 = r2.getString(r3)     // Catch:{ Exception -> 0x015c }
            r1.f3349F = r2     // Catch:{ Exception -> 0x015c }
            android.support.v4.app.FragmentActivity r2 = r1.getActivity()     // Catch:{ Exception -> 0x015c }
            r3 = 2131755189(0x7f1000b5, float:1.914125E38)
            java.lang.String r2 = r2.getString(r3)     // Catch:{ Exception -> 0x015c }
            r1.f3351H = r2     // Catch:{ Exception -> 0x015c }
            android.support.v4.app.FragmentActivity r2 = r1.getActivity()     // Catch:{ Exception -> 0x015c }
            r3 = 2131755409(0x7f100191, float:1.9141696E38)
            java.lang.String r2 = r2.getString(r3)     // Catch:{ Exception -> 0x015c }
            r1.f3350G = r2     // Catch:{ Exception -> 0x015c }
            android.support.v4.app.FragmentActivity r2 = r1.getActivity()     // Catch:{ Exception -> 0x015c }
            r3 = 2131755403(0x7f10018b, float:1.9141684E38)
            java.lang.String r2 = r2.getString(r3)     // Catch:{ Exception -> 0x015c }
            r1.f3352I = r2     // Catch:{ Exception -> 0x015c }
            android.support.v4.app.FragmentActivity r2 = r1.getActivity()     // Catch:{ Exception -> 0x015c }
            r3 = 2131755404(0x7f10018c, float:1.9141686E38)
            java.lang.String r2 = r2.getString(r3)     // Catch:{ Exception -> 0x015c }
            r1.f3353J = r2     // Catch:{ Exception -> 0x015c }
            android.view.View r2 = r1.f3355L     // Catch:{ Exception -> 0x015c }
            r3 = 2131296532(0x7f090114, float:1.8210983E38)
            android.view.View r2 = r2.findViewById(r3)     // Catch:{ Exception -> 0x015c }
            android.widget.ListView r2 = (android.widget.ListView) r2     // Catch:{ Exception -> 0x015c }
            r1.f3381l = r2     // Catch:{ Exception -> 0x015c }
            android.view.View r2 = r1.f3355L     // Catch:{ Exception -> 0x015c }
            r3 = 2131296440(0x7f0900b8, float:1.8210797E38)
            android.view.View r2 = r2.findViewById(r3)     // Catch:{ Exception -> 0x015c }
            android.widget.TextView r2 = (android.widget.TextView) r2     // Catch:{ Exception -> 0x015c }
            r1.f3382m = r2     // Catch:{ Exception -> 0x015c }
            android.view.View r2 = r1.f3355L     // Catch:{ Exception -> 0x015c }
            r3 = 2131296305(0x7f090031, float:1.8210523E38)
            android.view.View r2 = r2.findViewById(r3)     // Catch:{ Exception -> 0x015c }
            com.google.android.gms.ads.AdView r2 = (com.google.android.gms.ads.AdView) r2     // Catch:{ Exception -> 0x015c }
            r1.f3389t = r2     // Catch:{ Exception -> 0x015c }
            android.view.View r2 = r1.f3355L     // Catch:{ Exception -> 0x015c }
            r3 = 2131296503(0x7f0900f7, float:1.8210925E38)
            android.view.View r2 = r2.findViewById(r3)     // Catch:{ Exception -> 0x015c }
            android.widget.ImageView r2 = (android.widget.ImageView) r2     // Catch:{ Exception -> 0x015c }
            r1.f3390u = r2     // Catch:{ Exception -> 0x015c }
            android.view.View r2 = r1.f3355L     // Catch:{ Exception -> 0x015c }
            r3 = 2131296505(0x7f0900f9, float:1.8210929E38)
            android.view.View r2 = r2.findViewById(r3)     // Catch:{ Exception -> 0x015c }
            android.widget.ImageView r2 = (android.widget.ImageView) r2     // Catch:{ Exception -> 0x015c }
            r1.f3391v = r2     // Catch:{ Exception -> 0x015c }
            android.widget.ImageView r2 = r1.f3390u     // Catch:{ Exception -> 0x015c }
            android.view.View$OnClickListener r3 = r1.f3360Q     // Catch:{ Exception -> 0x015c }
            r2.setOnClickListener(r3)     // Catch:{ Exception -> 0x015c }
            android.widget.ImageView r2 = r1.f3391v     // Catch:{ Exception -> 0x015c }
            android.view.View$OnClickListener r3 = r1.f3360Q     // Catch:{ Exception -> 0x015c }
            r2.setOnClickListener(r3)     // Catch:{ Exception -> 0x015c }
            JU r2 = r1.f3372c     // Catch:{ Exception -> 0x015c }
            java.lang.String r3 = "prefOthers_transfer"
            boolean r2 = r2.mo524a(r3, r0)     // Catch:{ Exception -> 0x015c }
            r3 = 8
            if (r2 == 0) goto L_0x0106
            android.widget.ImageView r2 = r1.f3390u     // Catch:{ Exception -> 0x015c }
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x015c }
            android.widget.ImageView r2 = r1.f3391v     // Catch:{ Exception -> 0x015c }
        L_0x0102:
            r2.setVisibility(r0)     // Catch:{ Exception -> 0x015c }
            goto L_0x010e
        L_0x0106:
            android.widget.ImageView r2 = r1.f3391v     // Catch:{ Exception -> 0x015c }
            r2.setVisibility(r3)     // Catch:{ Exception -> 0x015c }
            android.widget.ImageView r2 = r1.f3390u     // Catch:{ Exception -> 0x015c }
            goto L_0x0102
        L_0x010e:
            android.view.View r2 = r1.f3355L     // Catch:{ Exception -> 0x015c }
            r3 = 2131296497(0x7f0900f1, float:1.8210912E38)
            android.view.View r2 = r2.findViewById(r3)     // Catch:{ Exception -> 0x015c }
            android.widget.ImageView r2 = (android.widget.ImageView) r2     // Catch:{ Exception -> 0x015c }
            r1.f3392w = r2     // Catch:{ Exception -> 0x015c }
            android.widget.ImageView r2 = r1.f3392w     // Catch:{ Exception -> 0x015c }
            android.view.View$OnClickListener r3 = r1.f3360Q     // Catch:{ Exception -> 0x015c }
            r2.setOnClickListener(r3)     // Catch:{ Exception -> 0x015c }
            android.widget.ListView r2 = r1.f3381l     // Catch:{ Exception -> 0x015c }
            XR r3 = new XR     // Catch:{ Exception -> 0x015c }
            r3.<init>(r1)     // Catch:{ Exception -> 0x015c }
            r2.setOnItemClickListener(r3)     // Catch:{ Exception -> 0x015c }
            android.view.View r2 = r1.f3355L     // Catch:{ Exception -> 0x015c }
            r3 = 2131296303(0x7f09002f, float:1.8210519E38)
            android.view.View r2 = r2.findViewById(r3)     // Catch:{ Exception -> 0x015c }
            android.support.v4.widget.SwipeRefreshLayout r2 = (android.support.v4.widget.SwipeRefreshLayout) r2     // Catch:{ Exception -> 0x015c }
            r1.f3357N = r2     // Catch:{ Exception -> 0x015c }
            android.support.v4.widget.SwipeRefreshLayout r2 = r1.f3357N     // Catch:{ Exception -> 0x015c }
            dS r3 = new dS     // Catch:{ Exception -> 0x015c }
            r3.<init>(r1)     // Catch:{ Exception -> 0x015c }
            r2.setOnRefreshListener(r3)     // Catch:{ Exception -> 0x015c }
            android.widget.ListView r2 = r1.f3381l     // Catch:{ Exception -> 0x015c }
            r3 = 3
            r2.setChoiceMode(r3)     // Catch:{ Exception -> 0x015c }
            android.widget.ListView r2 = r1.f3381l     // Catch:{ Exception -> 0x015c }
            gS r3 = new gS     // Catch:{ Exception -> 0x015c }
            r3.<init>(r1)     // Catch:{ Exception -> 0x015c }
            r2.setMultiChoiceModeListener(r3)     // Catch:{ Exception -> 0x015c }
            r1.mo4724a()     // Catch:{ Exception -> 0x0159 }
            r1.mo4744f()     // Catch:{ Exception -> 0x0159 }
        L_0x0159:
            android.view.View r2 = r1.f3355L     // Catch:{ Exception -> 0x015c }
            return r2
        L_0x015c:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0925mS.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public void onDestroyView() {
        C0925mS.super.onDestroyView();
        StringBuilder sb = new StringBuilder();
        sb.append("DestroyView:");
        sb.append(this.f3378i);
        Log.d("OnCreate:", sb.toString());
    }

    public void onDetach() {
        C0925mS.super.onDetach();
        Log.d("Oncreate:", "onDetach");
        this.f3356M = null;
    }

    public void onLoaderReset(Loader<List<C0082EH>> loader) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131296526) {
            StringBuilder sb = new StringBuilder();
            sb.append(menuItem.getTitle().toString());
            sb.append(":before....");
            Log.d("onItemClicked=", sb.toString());
            this.f3368Y.onButtonClicked(menuItem);
            return true;
        } else if (itemId != 16908332) {
            return C0925mS.super.onOptionsItemSelected(menuItem);
        } else {
            getActivity().finish();
            return true;
        }
    }

    public void onPause() {
        this.f3389t.pause();
        C0925mS.super.onPause();
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (i == 0) {
            if (iArr.length == 1 && iArr[0] == 0) {
                mo4740c();
            }
        } else if (i == 112 && iArr.length == 1) {
            int i2 = iArr[0];
        }
    }

    public void onResume() {
        C0925mS.super.onResume();
        AdView adView = this.f3389t;
        if (adView != null) {
            adView.resume();
        }
    }

    public void onStart() {
        C0925mS.super.onStart();
        this.f3344A = Boolean.valueOf(true);
        StringBuilder sb = new StringBuilder();
        sb.append("Start:");
        sb.append(this.f3378i);
        String str = ":";
        sb.append(str);
        sb.append(this.f3345B);
        sb.append(str);
        sb.append(this.f3344A);
        Log.d("OnCreate:", sb.toString());
        if (this.f3345B.booleanValue() && this.f3344A.booleanValue()) {
            this.f3354K = getActivity();
        }
    }

    public void setUserVisibleHint(boolean z) {
        C0925mS.super.setUserVisibleHint(z);
        if (z && this.f3378i != null && isResumed()) {
            mo4724a();
        }
    }
}
