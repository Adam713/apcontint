package p000;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.Loader;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.itextpdf.tool.xml.css.CSS.Property;
import com.itextpdf.tool.xml.css.CSS.Value;
import com.itextpdf.tool.xml.html.HTML.Attribute;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit;
import java.lang.reflect.Field;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

@SuppressLint({"ValidFragment"})
/* renamed from: LS */
public class C0239LS extends Fragment implements OnClickListener, LoaderCallbacks<List<C0259ML>> {

    /* renamed from: A */
    public ImageButton f623A = null;

    /* renamed from: B */
    public String[] f624B = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    /* renamed from: C */
    public int[] f625C = {2131230923, 1, 2131230855};

    /* renamed from: D */
    public Toolbar f626D = null;

    /* renamed from: E */
    public int f627E;

    /* renamed from: F */
    public int f628F;

    /* renamed from: G */
    public int f629G;

    /* renamed from: H */
    public String f630H;

    /* renamed from: I */
    public String f631I;

    /* renamed from: J */
    public String f632J;

    /* renamed from: K */
    public AdView f633K;

    /* renamed from: L */
    public OnDateSetListener f634L;

    /* renamed from: M */
    public OnDateSetListener f635M;

    /* renamed from: N */
    public int f636N;

    /* renamed from: O */
    public String f637O;

    /* renamed from: P */
    public String f638P;

    /* renamed from: Q */
    public TextView f639Q;

    /* renamed from: R */
    public TextView f640R;

    /* renamed from: S */
    public ProgressDialog f641S;

    /* renamed from: T */
    public OnClickListener f642T;

    /* renamed from: U */
    public ArrayList<String> f643U;

    /* renamed from: V */
    public LoaderCallbacks<List<String>> f644V;

    /* renamed from: W */
    public C0244e f645W;

    /* renamed from: X */
    public Activity f646X;

    /* renamed from: a */
    public SQLiteDatabase f647a;

    /* renamed from: b */
    public C0195JU f648b;

    /* renamed from: c */
    public String f649c;

    /* renamed from: d */
    public String f650d;

    /* renamed from: e */
    public String f651e;

    /* renamed from: f */
    public double f652f = 0.0d;

    /* renamed from: g */
    public int f653g = 0;

    /* renamed from: h */
    public int f654h = 0;

    /* renamed from: i */
    public AutoCompleteTextView f655i = null;

    /* renamed from: j */
    public EditText f656j = null;

    /* renamed from: k */
    public EditText f657k = null;

    /* renamed from: l */
    public TextView f658l = null;

    /* renamed from: m */
    public ImageView f659m = null;

    /* renamed from: n */
    public ImageView f660n = null;

    /* renamed from: o */
    public ImageView f661o = null;

    /* renamed from: p */
    public TextView f662p = null;

    /* renamed from: q */
    public TextView f663q = null;

    /* renamed from: r */
    public TextView f664r = null;

    /* renamed from: s */
    public TextView f665s = null;

    /* renamed from: t */
    public TextView f666t = null;

    /* renamed from: u */
    public Button f667u = null;

    /* renamed from: v */
    public ListView f668v = null;

    /* renamed from: w */
    public TextView f669w = null;

    /* renamed from: x */
    public C0346QM f670x;

    /* renamed from: y */
    public List<C0259ML> f671y = new ArrayList();

    /* renamed from: z */
    public SparseBooleanArray f672z;

    /* renamed from: LS$a */
    private static class C0240a implements Comparator<C0259ML> {
        public C0240a() {
        }

        public /* synthetic */ C0240a(C1204zS zSVar) {
            this();
        }

        /* renamed from: a */
        public int compare(C0259ML ml, C0259ML ml2) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
            try {
                return simpleDateFormat.parse(ml.mo883b()).compareTo(simpleDateFormat.parse(ml2.mo883b()));
            } catch (ParseException unused) {
                return ml2.mo883b().compareTo(ml.mo883b());
            }
        }
    }

    /* renamed from: LS$b */
    private static class C0241b implements Comparator<C0259ML> {
        public C0241b() {
        }

        public /* synthetic */ C0241b(C1204zS zSVar) {
            this();
        }

        /* renamed from: a */
        public int compare(C0259ML ml, C0259ML ml2) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
            try {
                return simpleDateFormat.parse(ml2.mo883b()).compareTo(simpleDateFormat.parse(ml.mo883b()));
            } catch (ParseException unused) {
                return ml2.mo883b().compareTo(ml.mo883b());
            }
        }
    }

    /* renamed from: LS$c */
    private static class C0242c implements Comparator<C0259ML> {
        public C0242c() {
        }

        public /* synthetic */ C0242c(C1204zS zSVar) {
            this();
        }

        /* renamed from: a */
        public int compare(C0259ML ml, C0259ML ml2) {
            String str = "";
            String str2 = ",";
            return ml.mo885d().replaceAll(str2, str).compareTo(ml2.mo885d().replaceAll(str2, str));
        }
    }

    /* renamed from: LS$d */
    private static class C0243d implements Comparator<C0259ML> {
        public C0243d() {
        }

        public /* synthetic */ C0243d(C1204zS zSVar) {
            this();
        }

        /* renamed from: a */
        public int compare(C0259ML ml, C0259ML ml2) {
            return ml2.mo885d().compareTo(ml.mo885d());
        }
    }

    /* renamed from: LS$e */
    public interface C0244e {
        void onButtonClicked(View view);
    }

    /* renamed from: LS$f */
    private static class C0245f implements Comparator<C0259ML> {
        public C0245f() {
        }

        public /* synthetic */ C0245f(C1204zS zSVar) {
            this();
        }

        /* renamed from: a */
        public int compare(C0259ML ml, C0259ML ml2) {
            String str = "";
            String str2 = ",";
            return Double.valueOf(ml.mo882a().replaceAll(str2, str)).compareTo(Double.valueOf(ml2.mo882a().replaceAll(str2, str)));
        }
    }

    /* renamed from: LS$g */
    private static class C0246g implements Comparator<C0259ML> {
        public C0246g() {
        }

        public /* synthetic */ C0246g(C1204zS zSVar) {
            this();
        }

        /* renamed from: a */
        public int compare(C0259ML ml, C0259ML ml2) {
            String str = "";
            String str2 = ",";
            return Double.valueOf(ml2.mo882a().replaceAll(str2, str)).compareTo(Double.valueOf(ml.mo882a().replaceAll(str2, str)));
        }
    }

    public C0239LS() {
        String str = "";
        this.f630H = str;
        this.f631I = str;
        this.f632J = str;
        this.f634L = new C0074DS(this);
        this.f635M = new C0093ES(this);
        this.f636N = 0;
        String str2 = Value.PERCENTAGE;
        this.f637O = str2;
        this.f638P = str2;
        this.f639Q = null;
        this.f640R = null;
        this.f641S = null;
        this.f642T = new C1036rS(this);
        this.f643U = new ArrayList<>();
        this.f644V = new C1182yS(this);
    }

    public C0239LS(C0260MM mm, int i, int i2, String str) {
        String str2 = "";
        this.f630H = str2;
        this.f631I = str2;
        this.f632J = str2;
        this.f634L = new C0074DS(this);
        this.f635M = new C0093ES(this);
        this.f636N = 0;
        String str3 = Value.PERCENTAGE;
        this.f637O = str3;
        this.f638P = str3;
        this.f639Q = null;
        this.f640R = null;
        this.f641S = null;
        this.f642T = new C1036rS(this);
        this.f643U = new ArrayList<>();
        this.f644V = new C1182yS(this);
        Bundle bundle = new Bundle();
        bundle.putString("cus_id", mm.mo889b());
        bundle.putString("cus_name", mm.mo890c());
        bundle.putString("curr_name", mm.mo888a());
        bundle.putInt(Property.POSITION, i);
        bundle.putInt(Attribute.SIZE, i2);
        bundle.putString("searchString", str);
        setArguments(bundle);
    }

    private void sort_date_click(View view) {
        int i;
        if (this.f654h == 0) {
            mo808h(this.f671y);
            this.f670x.notifyDataSetChanged();
            i = 1;
        } else {
            mo795b(this.f671y);
            this.f670x.notifyDataSetChanged();
            i = 0;
        }
        this.f654h = i;
    }

    /* renamed from: a */
    public double mo787a(List<C0259ML> list) {
        double d = 0.0d;
        for (int size = list.size() - 1; size >= 0; size--) {
            int i = ((C0259ML) list.get(size)).mo887f() == this.f625C[0] ? -1 : ((C0259ML) list.get(size)).mo887f() == this.f625C[2] ? 1 : 0;
            double parseDouble = Double.parseDouble(((C0259ML) list.get(size)).mo882a().replaceAll(",", ""));
            double d2 = (double) i;
            Double.isNaN(d2);
            d += parseDouble * d2;
        }
        return d;
    }

    /* renamed from: a */
    public void mo788a() {
        try {
            this.f636N = 0;
            Builder builder = new Builder(getActivity());
            View inflate = getActivity().getLayoutInflater().inflate(2131492918, null);
            builder.setView(inflate);
            this.f639Q = (TextView) inflate.findViewById(2131296451);
            this.f640R = (TextView) inflate.findViewById(2131296647);
            this.f639Q.setOnClickListener(new C0112FS(this));
            this.f640R.setOnClickListener(new C0132GS(this));
            builder.setPositiveButton(getString(2131755109), new C0154HS(this));
            builder.setNegativeButton(getString(2131755106), new C0174IS(this));
            AlertDialog create = builder.create();
            create.getWindow().setSoftInputMode(4);
            create.show();
            create.getButton(-1).setOnClickListener(new C0193JS(this, create));
        } catch (Exception e) {
            Log.d("adv_search_error=", e.getMessage());
        }
    }

    /* renamed from: a */
    public void mo789a(int i) {
        ImageView imageView;
        int i2;
        TextView textView;
        StringBuilder sb;
        TextView textView2;
        StringBuilder sb2;
        StringBuilder sb3;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(i);
        String str = "";
        sb4.append(str);
        Log.d("footer_update:=", sb4.toString());
        NumberFormat instance = NumberFormat.getInstance(Locale.ENGLISH);
        String str2 = "\t";
        if (this.f636N == 1) {
            double a = mo787a(this.f670x.f1003d);
            if (a >= 0.0d) {
                this.f659m.setImageResource(this.f625C[2]);
                textView2 = this.f658l;
                sb2 = new StringBuilder();
                sb2.append(this.f632J);
                sb2.append(instance.format(a));
                if (C0195JU.f451k) {
                    sb3 = new StringBuilder();
                }
                sb2.append(str);
                textView2.setText(sb2.toString());
            }
            this.f659m.setImageResource(this.f625C[0]);
            textView2 = this.f658l;
            sb2 = new StringBuilder();
            sb2.append(this.f631I);
            sb2.append(instance.format(a));
            if (C0195JU.f451k) {
                sb3 = new StringBuilder();
            }
            sb2.append(str);
            textView2.setText(sb2.toString());
            sb3.append(str2);
            sb3.append(this.f651e);
            str = sb3.toString();
            sb2.append(str);
            textView2.setText(sb2.toString());
        } else if (i == 1) {
            this.f658l.setText(this.f630H);
            try {
                if (this.f643U.size() > 0) {
                    if (Double.parseDouble((String) this.f643U.get(0)) >= 0.0d) {
                        this.f659m.setImageResource(this.f625C[2]);
                        textView = this.f658l;
                        sb = new StringBuilder();
                        sb.append(this.f632J);
                        sb.append(instance.format(Double.parseDouble((String) this.f643U.get(0))));
                        if (C0195JU.f451k) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(str2);
                            sb5.append(this.f651e);
                            str = sb5.toString();
                        }
                        sb.append(str);
                    } else {
                        this.f659m.setImageResource(this.f625C[0]);
                        textView = this.f658l;
                        sb = new StringBuilder();
                        sb.append(this.f631I);
                        sb.append(instance.format(Double.parseDouble((String) this.f643U.get(0))));
                        if (C0195JU.f451k) {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(str2);
                            sb6.append(this.f651e);
                            str = sb6.toString();
                        }
                        sb.append(str);
                    }
                    textView.setText(sb.toString());
                }
            } catch (Exception unused) {
            }
        } else if (i == 2) {
            double a2 = mo787a(this.f670x.f1003d);
            TextView textView3 = this.f658l;
            StringBuilder sb7 = new StringBuilder();
            sb7.append(getString(2131755189));
            sb7.append(instance.format(a2));
            if (C0195JU.f451k) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str2);
                sb8.append(this.f651e);
                str = sb8.toString();
            }
            sb7.append(str);
            textView3.setText(sb7.toString());
            if (a2 >= 0.0d) {
                imageView = this.f659m;
                i2 = this.f625C[2];
            } else {
                imageView = this.f659m;
                i2 = this.f625C[0];
            }
            imageView.setImageResource(i2);
        }
    }

    /* renamed from: a */
    public void onLoadFinished(Loader<List<C0259ML>> loader, List<C0259ML> list) {
        ListView listView = this.f668v;
        if (listView != null) {
            TextView textView = this.f669w;
            if (textView != null) {
                listView.setEmptyView(textView);
            }
        }
        this.f671y = list;
        try {
            this.f670x = new C0346QM(getActivity(), 2131492931, this.f671y);
            this.f668v.setAdapter(this.f670x);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo791a(String str) {
        new Builder(getActivity()).setTitle("Permission Request").setMessage(str).setCancelable(false).setPositiveButton(17039379, new C0055CS(this)).show();
    }

    public void amount_add_btn(View view) {
        startActivity(new Intent(view.getContext(), Customer_Det_List_edit.class));
    }

    /* renamed from: b */
    public void mo793b() {
        String str = "android.permission.WRITE_EXTERNAL_STORAGE";
        if (!(ContextCompat.checkSelfPermission(getActivity(), str) == 0)) {
            ActivityCompat.requestPermissions(getActivity(), new String[]{str}, C0776fN.AppCompatTheme_windowActionBarOverlay);
        }
    }

    /* renamed from: b */
    public void mo794b(String str) {
        try {
            this.f670x.getFilter().filter(str);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public final void mo795b(List<C0259ML> list) {
        Collections.sort(this.f671y, new C0241b(null));
    }

    public void btn_cus_remove(View view) {
        Builder builder = new Builder(getActivity());
        builder.setMessage(getString(2131755166));
        TextView textView = (TextView) ((RelativeLayout) ((View) view.getParent()).getParent()).findViewById(2131296680);
        Log.d("tr_id:=", textView.getText().toString());
        this.f653g = Integer.parseInt(textView.getText().toString());
        builder.setPositiveButton("Yes", new C1056sS(this));
        builder.setNegativeButton("No", new C1076tS(this));
        builder.create().show();
    }

    /* renamed from: c */
    public final void mo797c() {
        int i = Calendar.getInstance().get(14);
        LoaderManager supportLoaderManager = getActivity().getSupportLoaderManager();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f649c);
        sb.append(1);
        supportLoaderManager.initLoader(Integer.parseInt(sb.toString()) * i * 1000000, null, this.f644V).forceLoad();
        LoaderManager supportLoaderManager2 = getActivity().getSupportLoaderManager();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f649c);
        sb2.append(1);
        supportLoaderManager2.initLoader(Integer.parseInt(sb2.toString()) * i, null, this).forceLoad();
    }

    /* renamed from: c */
    public final void mo798c(List<C0259ML> list) {
        Collections.sort(this.f671y, new C0243d(null));
    }

    /* renamed from: d */
    public final void mo799d() {
        int i = Calendar.getInstance().get(14);
        LoaderManager supportLoaderManager = getActivity().getSupportLoaderManager();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f649c);
        sb.append(1);
        supportLoaderManager.initLoader(Integer.parseInt(sb.toString()) * i * 1000000, null, this.f644V).forceLoad();
    }

    /* renamed from: d */
    public final void mo800d(List<C0259ML> list) {
        Collections.sort(list, Collections.reverseOrder(new C1163xS(this)));
    }

    /* renamed from: e */
    public void mo801e() {
        for (int size = this.f672z.size() - 1; size >= 0; size--) {
            if (this.f672z.valueAt(size)) {
                C0259ML item = this.f670x.getItem(this.f672z.keyAt(size));
                this.f670x.remove(item);
                C0195JU ju = this.f648b;
                StringBuilder sb = new StringBuilder();
                sb.append("delete from transactions where id=");
                sb.append(item.mo884c());
                ju.mo562d(sb.toString());
            }
        }
        mo807h();
    }

    /* renamed from: e */
    public final void mo802e(List<C0259ML> list) {
        Collections.sort(list, Collections.reverseOrder(new C1116vS(this)));
    }

    /* renamed from: f */
    public void mo803f() {
        int size = this.f672z.size() - 1;
        if (this.f672z.valueAt(size)) {
            C0259ML item = this.f670x.getItem(this.f672z.keyAt(size));
            Intent intent = new Intent(getActivity(), Customer_Det_List_edit.class);
            intent.putExtra("CUS_NAME", item.mo885d());
            intent.putExtra("CURR_NAME", this.f651e);
            intent.putExtra("TR_ID", item.mo884c());
            intent.putExtra("TR_DATE", item.mo883b());
            intent.putExtra("TR_AMOUNT", item.mo882a());
            intent.putExtra("TR_REMARKS", item.mo886e());
            intent.putExtra("TR_TYPE", item.mo887f());
            startActivity(intent);
        }
    }

    /* renamed from: f */
    public final void mo804f(List<C0259ML> list) {
        Collections.sort(this.f671y, new C0246g(null));
    }

    /* renamed from: g */
    public void mo805g() {
        this.f670x.f1008i.clear();
        this.f652f = 0.0d;
    }

    /* renamed from: g */
    public final void mo806g(List<C0259ML> list) {
        Collections.sort(this.f671y, new C0245f(null));
    }

    /* renamed from: h */
    public void mo807h() {
        Cursor cursor;
        StringBuilder sb = new StringBuilder();
        sb.append("get_all_names:");
        sb.append(this.f649c);
        Log.d("get_all_names", sb.toString());
        if (this.f636N == 0) {
            cursor = !C0195JU.f451k ? this.f648b.mo599n(this.f649c) : this.f648b.mo574g(this.f649c, this.f651e);
        } else {
            boolean isEmpty = this.f637O.isEmpty();
            String str = Value.PERCENTAGE;
            this.f637O = isEmpty ? str : this.f637O;
            if (!this.f638P.isEmpty()) {
                str = this.f638P;
            }
            this.f638P = str;
            cursor = !C0195JU.f451k ? this.f648b.mo526b(this.f649c, this.f637O, this.f638P) : this.f648b.mo547c(this.f649c, this.f637O, this.f638P, this.f651e);
        }
        int count = cursor.getCount();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(count);
        sb2.append("");
        Log.d("recCount_all", sb2.toString());
        this.f652f = 0.0d;
        this.f671y.clear();
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            List<C0259ML> list = this.f671y;
            C0259ML ml = new C0259ML(cursor.getString(cursor.getColumnIndex("_id")), cursor.getString(cursor.getColumnIndex("date_")), cursor.getString(cursor.getColumnIndex("amount")), cursor.getString(cursor.getColumnIndex("remarks")), this.f625C[cursor.getInt(cursor.getColumnIndex("_in"))], cursor.getString(cursor.getColumnIndex(Attribute.NAME)));
            list.add(ml);
            cursor.moveToNext();
        }
        cursor.close();
        this.f652f = 0.0d;
        mo805g();
        if (this.f636N == 1) {
            mo808h(this.f671y);
            this.f670x.notifyDataSetChanged();
            this.f654h = 1;
        }
        if (this.f636N == 0) {
            mo799d();
        }
        mo789a(1);
    }

    /* renamed from: h */
    public final void mo808h(List<C0259ML> list) {
        Collections.sort(this.f671y, new C0240a(null));
    }

    public void help_btn(View view) {
        Builder builder = new Builder(getActivity());
        WebView webView = new WebView(getActivity());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/help.html");
        webView.setWebViewClient(new C0995pS(this));
        builder.setView(webView);
        builder.setNegativeButton(getString(2131755134), new C1014qS(this));
        builder.show();
    }

    /* renamed from: i */
    public void mo810i() {
        try {
            if (this.f648b.mo524a("black_list", false) || !this.f648b.mo524a("prefAds", false)) {
                this.f633K.loadAd(new AdRequest.Builder().build());
                return;
            }
            this.f633K.setVisibility(8);
        } catch (Exception e) {
            Log.d("ads_error:", e.getMessage());
        }
    }

    /* renamed from: i */
    public final void mo811i(List<C0259ML> list) {
        Collections.sort(this.f671y, new C0242c(null));
    }

    /* renamed from: j */
    public final void mo812j(List<C0259ML> list) {
        Collections.sort(list, Collections.reverseOrder(new C1143wS(this)));
    }

    /* renamed from: k */
    public final void mo813k(List<C0259ML> list) {
        Collections.sort(list, Collections.reverseOrder(new C1096uS(this)));
    }

    public void no_result_btn(View view) {
        this.f636N = 0;
        mo807h();
    }

    public void onAttach(Activity activity) {
        C0239LS.super.onAttach(activity);
        this.f646X = activity;
        try {
            this.f645W = (C0244e) activity;
        } catch (ClassCastException unused) {
        }
    }

    public void onClick(View view) {
        this.f641S = new ProgressDialog(view.getContext());
        this.f641S.setCancelable(true);
        this.f641S.setMessage("Processing...");
        this.f641S.setProgressStyle(0);
        this.f641S.setMax(10);
        this.f641S.show();
        this.f671y = this.f670x.f1003d;
        switch (view.getId()) {
            case 2131296495:
                sort_tr_type_click(view);
                break;
            case 2131296675:
                sort_amount_click(view);
                break;
            case 2131296679:
                sort_date_click(view);
                break;
            case 2131296681:
                sort_net_bal_click(view);
                break;
            case 2131296682:
                sort_remarks_click(view);
                break;
        }
        new Handler().postDelayed(new C0215KS(this), 400);
    }

    public void onCreate(Bundle bundle) {
        C0239LS.super.onCreate(bundle);
        try {
            this.f648b = new C0195JU(this.f647a, getActivity());
            String str = "";
            this.f649c = getArguments() != null ? getArguments().getString("cus_id") : str;
            this.f650d = getArguments() != null ? getArguments().getString("cus_name") : str;
            if (getArguments() != null) {
                str = getArguments().getString("curr_name");
            }
            this.f651e = str;
        } catch (Exception unused) {
        }
    }

    public Loader<List<C0259ML>> onCreateLoader(int i, Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        sb.append("onCreateLoader:");
        sb.append(this.f649c);
        Log.d("Loader=", sb.toString());
        return new C0279NL(getActivity(), this.f649c, this.f648b, this.f651e);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (menu != null) {
            menu.clear();
        }
        menuInflater.inflate(2131558414, menu);
        MenuItem findItem = menu.findItem(2131296605);
        SearchView actionView = MenuItemCompat.getActionView(findItem);
        actionView.setSearchableInfo(((SearchManager) getActivity().getSystemService("search")).getSearchableInfo(getActivity().getComponentName()));
        actionView.setQueryHint(getString(2131755371));
        actionView.setOnQueryTextListener(new C0012AS(this));
        MenuItemCompat.setOnActionExpandListener(findItem, new C0031BS(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(2131492895, viewGroup, false);
        this.f648b = new C0195JU(this.f647a, getActivity());
        setHasOptionsMenu(true);
        StringBuilder sb = new StringBuilder();
        sb.append("onCreateView_all:");
        sb.append(this.f649c);
        Log.d("OnCreate:=", sb.toString());
        if (this.f668v == null) {
            this.f668v = (ListView) inflate.findViewById(2131296529);
            this.f669w = (TextView) inflate.findViewById(2131296440);
        }
        this.f668v.setChoiceMode(2);
        this.f658l = (TextView) inflate.findViewById(2131296466);
        this.f659m = (ImageView) inflate.findViewById(2131296495);
        this.f660n = (ImageView) inflate.findViewById(2131296497);
        this.f661o = (ImageView) inflate.findViewById(2131296503);
        this.f660n.setOnClickListener(this.f642T);
        this.f661o.setOnClickListener(this.f642T);
        this.f662p = (TextView) inflate.findViewById(2131296679);
        this.f663q = (TextView) inflate.findViewById(2131296675);
        this.f664r = (TextView) inflate.findViewById(2131296682);
        this.f666t = (TextView) inflate.findViewById(2131296681);
        this.f662p.setOnClickListener(this);
        this.f663q.setOnClickListener(this);
        this.f664r.setOnClickListener(this);
        this.f666t.setOnClickListener(this);
        this.f659m.setOnClickListener(this);
        this.f662p.setTextColor(-1);
        this.f663q.setTextColor(-1);
        this.f664r.setTextColor(-1);
        this.f666t.setTextColor(-1);
        this.f630H = getActivity().getString(2131755188);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f648b.mo597m());
        String str = ":-";
        sb2.append(str);
        this.f631I = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f648b.mo455E());
        sb3.append(str);
        this.f632J = sb3.toString();
        Calendar instance = Calendar.getInstance();
        new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        this.f627E = instance.get(1);
        this.f628F = instance.get(2);
        this.f629G = instance.get(5);
        try {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getActivity());
            Field declaredField = ViewConfiguration.class.getDeclaredField("sHasPermanentMenuKey");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                declaredField.setBoolean(viewConfiguration, false);
            }
        } catch (Exception unused) {
        }
        mo797c();
        this.f668v.setChoiceMode(3);
        this.f668v.setMultiChoiceModeListener(new C1204zS(this));
        try {
            this.f633K = inflate.findViewById(2131296305);
            mo810i();
        } catch (Exception unused2) {
        }
        return inflate;
    }

    public void onDetach() {
        C0239LS.super.onDetach();
        this.f646X = null;
    }

    public void onLoaderReset(Loader<List<C0259ML>> loader) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        String str = "-";
        String str2 = "";
        String str3 = "#";
        String str4 = "prefPrintSort";
        if (itemId == 2131296577) {
            mo793b();
            if (this.f648b.mo524a(str4, true)) {
                mo808h(this.f671y);
                this.f670x.notifyDataSetChanged();
                this.f654h = 1;
            }
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(getActivity().getString(2131755061));
                sb.append(str3);
                sb.append(this.f650d);
                if (C0195JU.f451k) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(this.f651e);
                    str2 = sb2.toString();
                }
                sb.append(str2);
                String sb3 = sb.toString();
                this.f648b.mo537b(this.f668v, this.f648b.mo465K(sb3), mo787a(this.f670x.f1003d), this.f651e);
                C0195JU ju = this.f648b;
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.f648b.mo465K(sb3));
                sb4.append(".pdf");
                ju.mo462I(sb4.toString());
            } catch (Exception unused) {
            }
            return true;
        } else if (itemId == 2131296309) {
            mo788a();
            return true;
        } else if (itemId == 2131296447) {
            mo793b();
            if (this.f648b.mo524a(str4, true)) {
                mo808h(this.f671y);
                this.f670x.notifyDataSetChanged();
                this.f654h = 1;
            }
            try {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(getActivity().getString(2131755061));
                sb5.append(str3);
                sb5.append(this.f650d);
                if (C0195JU.f451k) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(str);
                    sb6.append(this.f651e);
                    str2 = sb6.toString();
                }
                sb5.append(str2);
                String sb7 = sb5.toString();
                this.f648b.mo523a(this.f668v, this.f648b.mo465K(sb7), mo787a(this.f670x.f1003d), this.f651e);
                C0195JU ju2 = this.f648b;
                StringBuilder sb8 = new StringBuilder();
                sb8.append(this.f648b.mo465K(sb7));
                sb8.append(".xls");
                ju2.mo458G(sb8.toString());
            } catch (Exception unused2) {
            }
            return true;
        } else if (itemId != 16908332) {
            return C0239LS.super.onOptionsItemSelected(menuItem);
        } else {
            getActivity().finish();
            return true;
        }
    }

    public void onPause() {
        this.f633K.pause();
        C0239LS.super.onPause();
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (i != 112) {
            return;
        }
        if (iArr.length != 1 || iArr[0] != 0) {
            mo791a(getString(2131755273));
        }
    }

    public void onResume() {
        C0239LS.super.onResume();
        AdView adView = this.f633K;
        if (adView != null) {
            adView.resume();
        }
    }

    public void setUserVisibleHint(boolean z) {
        C0239LS.super.setUserVisibleHint(z);
    }

    public void sort_amount_click(View view) {
        int i;
        if (this.f654h == 0) {
            mo806g(this.f671y);
            this.f670x.notifyDataSetChanged();
            i = 1;
        } else {
            mo804f(this.f671y);
            this.f670x.notifyDataSetChanged();
            i = 0;
        }
        this.f654h = i;
    }

    public void sort_net_bal_click(View view) {
        int i;
        if (this.f654h == 0) {
            mo811i(this.f671y);
            this.f670x.notifyDataSetChanged();
            i = 1;
        } else {
            mo798c(this.f671y);
            this.f670x.notifyDataSetChanged();
            i = 0;
        }
        this.f654h = i;
    }

    public void sort_remarks_click(View view) {
        int i;
        if (this.f654h == 0) {
            mo812j(this.f671y);
            this.f670x.notifyDataSetChanged();
            i = 1;
        } else {
            mo800d(this.f671y);
            this.f670x.notifyDataSetChanged();
            i = 0;
        }
        this.f654h = i;
    }

    public void sort_tr_type_click(View view) {
        int i;
        if (this.f654h == 0) {
            mo813k(this.f671y);
            this.f670x.notifyDataSetChanged();
            i = 1;
        } else {
            mo802e(this.f671y);
            this.f670x.notifyDataSetChanged();
            i = 0;
        }
        this.f654h = i;
    }
}
