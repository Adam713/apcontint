package com.adam.myapplication;


import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.itextpdf.tool.xml.css.CSS.Value;
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

import p000.C0063DH;
import p000.C0796gO;

public class Customer_Det_List extends AppCompatActivity implements OnClickListener, C0143a {

    /* renamed from: A */
    public int[] f2172A = {2131230923, 1, 2131230855};

    /* renamed from: B */
    public Toolbar f2173B = null;

    /* renamed from: C */
    public int f2174C;

    /* renamed from: D */
    public int f2175D;

    /* renamed from: E */
    public int f2176E;

    /* renamed from: F */
    public String[] f2177F;

    /* renamed from: G */
    public TypedArray f2178G;

    /* renamed from: H */
    public List<C0796gO> f2179H;

    /* renamed from: I */
    public C0063DH f2180I;

    /* renamed from: J */
    public int f2181J = 0;

    /* renamed from: K */
    public int f2182K = 0;

    /* renamed from: L */
    public final Context f2183L = this;

    /* renamed from: M */
    public OnDateSetListener f2184M = new C0428UI(this);

    /* renamed from: N */
    public OnDateSetListener f2185N = new C0453VI(this);

    /* renamed from: O */
    public int f2186O = 0;

    /* renamed from: P */
    public String f2187P;

    /* renamed from: Q */
    public String f2188Q;

    /* renamed from: R */
    public TextView f2189R;

    /* renamed from: S */
    public TextView f2190S;
    public String TAG = Customer_Det_List.class.getSimpleName();

    /* renamed from: a */
    public SQLiteDatabase f2191a;

    /* renamed from: b */
    public C0195JU f2192b;

    /* renamed from: c */
    public String f2193c;

    /* renamed from: d */
    public String f2194d;

    /* renamed from: e */
    public String f2195e;

    /* renamed from: f */
    public String f2196f;

    /* renamed from: g */
    public double f2197g = 0.0d;

    /* renamed from: h */
    public int f2198h = 0;

    /* renamed from: i */
    public int f2199i = 0;

    /* renamed from: j */
    public AutoCompleteTextView f2200j = null;

    /* renamed from: k */
    public EditText f2201k = null;

    /* renamed from: l */
    public EditText f2202l = null;

    /* renamed from: m */
    public TextView f2203m = null;

    /* renamed from: n */
    public ImageView f2204n = null;

    /* renamed from: o */
    public TextView f2205o = null;

    /* renamed from: p */
    public TextView f2206p = null;

    /* renamed from: q */
    public TextView f2207q = null;

    /* renamed from: r */
    public TextView f2208r = null;

    /* renamed from: s */
    public Button f2209s = null;

    /* renamed from: t */
    public ListView f2210t = null;

    /* renamed from: u */
    public LinearLayout f2211u = null;

    /* renamed from: v */
    public C0302OM f2212v;

    /* renamed from: w */
    public List<C0232LL> f2213w = new ArrayList();

    /* renamed from: x */
    public SparseBooleanArray f2214x;

    /* renamed from: y */
    public ImageButton f2215y = null;

    /* renamed from: z */
    public String[] f2216z = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    /* renamed from: com.valdio.valdioveliu.recyclerview.Customer_Det_List$a */
    private static class C0681a implements Comparator<C0232LL> {
        public C0681a() {
        }

        public /* synthetic */ C0681a(C0384SI si) {
            this();
        }

        /* renamed from: a */
        public int compare(C0232LL ll, C0232LL ll2) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
            try {
                int compareTo = simpleDateFormat.parse(ll.mo777h()).compareTo(simpleDateFormat.parse(ll2.mo777h()));
                return compareTo == 0 ? Integer.valueOf(ll.mo778i()).compareTo(Integer.valueOf(ll2.mo778i())) : compareTo;
            } catch (ParseException unused) {
                return ll2.mo777h().compareTo(ll.mo777h());
            }
        }
    }

    /* renamed from: com.valdio.valdioveliu.recyclerview.Customer_Det_List$b */
    private static class C0682b implements Comparator<C0232LL> {
        public C0682b() {
        }

        public /* synthetic */ C0682b(C0384SI si) {
            this();
        }

        /* renamed from: a */
        public int compare(C0232LL ll, C0232LL ll2) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
            try {
                int compareTo = simpleDateFormat.parse(ll2.mo777h()).compareTo(simpleDateFormat.parse(ll.mo777h()));
                return compareTo == 0 ? Integer.valueOf(ll2.mo778i()).compareTo(Integer.valueOf(ll.mo778i())) : compareTo;
            } catch (ParseException unused) {
                return ll2.mo777h().compareTo(ll.mo777h());
            }
        }
    }

    /* renamed from: com.valdio.valdioveliu.recyclerview.Customer_Det_List$c */
    private static class C0683c implements Comparator<C0232LL> {
        public C0683c() {
        }

        public /* synthetic */ C0683c(C0384SI si) {
            this();
        }

        /* renamed from: a */
        public int compare(C0232LL ll, C0232LL ll2) {
            String str = "";
            String str2 = ",";
            return Double.valueOf(ll.mo770c().replaceAll(str2, str)).compareTo(Double.valueOf(ll2.mo770c().replaceAll(str2, str)));
        }
    }

    /* renamed from: com.valdio.valdioveliu.recyclerview.Customer_Det_List$d */
    private static class C0684d implements Comparator<C0232LL> {
        public C0684d() {
        }

        public /* synthetic */ C0684d(C0384SI si) {
            this();
        }

        /* renamed from: a */
        public int compare(C0232LL ll, C0232LL ll2) {
            String str = "";
            String str2 = ",";
            return Double.valueOf(ll2.mo770c().replaceAll(str2, str)).compareTo(Double.valueOf(ll.mo770c().replaceAll(str2, str)));
        }
    }

    /* renamed from: com.valdio.valdioveliu.recyclerview.Customer_Det_List$e */
    private static class C0685e implements Comparator<C0232LL> {
        public C0685e() {
        }

        public /* synthetic */ C0685e(C0384SI si) {
            this();
        }

        /* renamed from: a */
        public int compare(C0232LL ll, C0232LL ll2) {
            String str = "";
            String str2 = ",";
            return Double.valueOf(ll.mo775f().replaceAll(str2, str)).compareTo(Double.valueOf(ll2.mo775f().replaceAll(str2, str)));
        }
    }

    /* renamed from: com.valdio.valdioveliu.recyclerview.Customer_Det_List$f */
    private static class C0686f implements Comparator<C0232LL> {
        public C0686f() {
        }

        public /* synthetic */ C0686f(C0384SI si) {
            this();
        }

        /* renamed from: a */
        public int compare(C0232LL ll, C0232LL ll2) {
            String str = "";
            String str2 = ",";
            return Double.valueOf(ll2.mo775f().replaceAll(str2, str)).compareTo(Double.valueOf(ll.mo775f().replaceAll(str2, str)));
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List] */
    public Customer_Det_List() {
        String str = Value.PERCENTAGE;
        this.f2187P = str;
        this.f2188Q = str;
        this.f2189R = null;
        this.f2190S = null;
    }

    private void sort_date_click(View view) {
        int i;
        if (this.f2199i == 0) {
            mo3500h(this.f2213w);
            this.f2212v.notifyDataSetChanged();
            i = 1;
        } else {
            mo3486b(this.f2213w);
            this.f2212v.notifyDataSetChanged();
            i = 0;
        }
        this.f2199i = i;
    }

    /* renamed from: a */
    public double mo3479a(List<C0232LL> list) {
        if (this.f2186O == 1) {
            return this.f2197g;
        }
        double d = 0.0d;
        for (int size = list.size() - 1; size >= 0; size--) {
            int i = ((C0232LL) list.get(size)).mo780k() == this.f2172A[0] ? -1 : ((C0232LL) list.get(size)).mo780k() == this.f2172A[2] ? 1 : 0;
            double parseDouble = Double.parseDouble(((C0232LL) list.get(size)).mo775f().replaceAll(",", ""));
            double d2 = (double) i;
            Double.isNaN(d2);
            d += parseDouble * d2;
        }
        return d;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List, android.app.Activity] */
    /* renamed from: a */
    public void mo3480a() {
        try {
            this.f2186O = 0;
            Builder builder = new Builder(this);
            View inflate = getLayoutInflater().inflate(2131492918, null);
            builder.setView(inflate);
            this.f2189R = (TextView) inflate.findViewById(2131296451);
            this.f2190S = (TextView) inflate.findViewById(2131296647);
            this.f2189R.setOnClickListener(new C0474WI(this));
            this.f2190S.setOnClickListener(new C0494XI(this));
            builder.setPositiveButton(getString(2131755109), new C0515YI(this));
            builder.setNegativeButton(getString(2131755106), new C0542ZI(this));
            AlertDialog create = builder.create();
            create.getWindow().setSoftInputMode(4);
            create.show();
            create.getButton(-1).setOnClickListener(new C0566_I(this, create));
        } catch (Exception e) {
            Log.d("adv_search_error=", e.getMessage());
        }
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List, android.app.Activity] */
    /* renamed from: a */
    public void mo3481a(int i) {
        ImageView imageView;
        int i2;
        ImageView imageView2;
        int i3;
        NumberFormat instance = NumberFormat.getInstance(Locale.ENGLISH);
        if (this.f2186O == 1) {
            double a = mo3479a(this.f2212v.f863d);
            TextView textView = this.f2203m;
            StringBuilder sb = new StringBuilder();
            sb.append(getString(2131755189));
            sb.append(instance.format(a));
            textView.setText(sb.toString());
            if (a >= 0.0d) {
                imageView = this.f2204n;
                i2 = this.f2172A[2];
            } else {
                imageView = this.f2204n;
                i2 = this.f2172A[0];
            }
        } else {
            if (i == 1) {
                this.f2203m.setText(getString(2131755188));
                try {
                    ArrayList o = this.f2192b.mo604o(this.f2196f);
                    if (o.size() > 0 && this.f2192b.mo596m(this.f2196f).getCount() != 0) {
                        TextView textView2 = this.f2203m;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(getString(2131755187));
                        sb2.append(instance.format(Double.parseDouble((String) o.get(0))));
                        textView2.setText(sb2.toString());
                        this.f2194d = instance.format(Double.parseDouble((String) o.get(0)));
                        if (Double.parseDouble((String) o.get(0)) >= 0.0d) {
                            imageView2 = this.f2204n;
                            i3 = this.f2172A[2];
                        } else {
                            imageView2 = this.f2204n;
                            i3 = this.f2172A[0];
                        }
                        imageView2.setImageResource(i3);
                    } else {
                        return;
                    }
                } catch (Exception unused) {
                }
            } else if (i == 2) {
                double a2 = mo3479a(this.f2212v.f863d);
                TextView textView3 = this.f2203m;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(getString(2131755189));
                sb3.append(instance.format(a2));
                textView3.setText(sb3.toString());
                if (a2 >= 0.0d) {
                    imageView = this.f2204n;
                    i2 = this.f2172A[2];
                } else {
                    imageView = this.f2204n;
                    i2 = this.f2172A[0];
                }
            }
        }
        imageView.setImageResource(i2);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List, android.app.Activity] */
    /* renamed from: a */
    public void mo327a(DialogFragment dialogFragment) {
        String str;
        String str2;
        C0195JU ju;
        if (this.f2193c != null) {
            EditText editText = (EditText) dialogFragment.getDialog().findViewById(2131296387);
            EditText editText2 = (EditText) dialogFragment.getDialog().findViewById(2131296389);
            C0195JU ju2 = this.f2192b;
            StringBuilder sb = new StringBuilder();
            sb.append("update customers set name='");
            sb.append(editText.getText().toString());
            sb.append("',gsm='");
            sb.append(editText2.getText().toString());
            sb.append("' where id='");
            sb.append(this.f2193c);
            sb.append("'");
            ju2.mo562d(sb.toString());
            this.f2195e = editText2.getText().toString();
            int i = this.f2182K;
            if (i == 1) {
                this.f2192b.mo541b(editText2.getText().toString());
                return;
            }
            if (i == 2) {
                ju = this.f2192b;
                str = editText2.getText().toString();
                str2 = this.f2192b.mo531b(this.f2210t, this.f2196f, mo3479a(this.f2212v.f863d));
            } else {
                ju = this.f2192b;
                str = editText2.getText().toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(getString(2131755382));
                sb2.append(this.f2194d);
                str2 = sb2.toString();
            }
            ju.mo634y(str, str2);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List] */
    /* renamed from: a */
    public final void mo3482a(String str) {
        new Builder(this).setTitle("Permission Request").setMessage(str).setCancelable(false).setPositiveButton(17039379, new C0749eJ(this)).show();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List, android.app.Activity] */
    public void amount_add_btn(View view) {
        Intent intent = new Intent(view.getContext(), Customer_Det_List_edit.class);
        intent.putExtra("CUS_NAME", this.f2196f);
        intent.putExtra("CUS_ID", this.f2193c);
        startActivity(intent);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List, android.app.Activity] */
    /* renamed from: b */
    public void mo3484b() {
        String str = "android.permission.WRITE_EXTERNAL_STORAGE";
        if (!(ContextCompat.checkSelfPermission(this, str) == 0)) {
            ActivityCompat.requestPermissions(this, new String[]{str}, C0776fN.AppCompatTheme_windowActionBarOverlay);
        }
    }

    /* renamed from: b */
    public void mo3485b(String str) {
        this.f2212v.getFilter().filter(str);
    }

    /* renamed from: b */
    public final void mo3486b(List<C0232LL> list) {
        Collections.sort(this.f2213w, new C0682b(null));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List, android.app.Activity] */
    public void btn_cus_remove(View view) {
        Builder builder = new Builder(this);
        builder.setMessage(getString(2131755166));
        TextView textView = (TextView) ((RelativeLayout) ((View) view.getParent()).getParent()).findViewById(2131296680);
        Log.d("tr_id:=", textView.getText().toString());
        this.f2198h = Integer.parseInt(textView.getText().toString());
        builder.setPositiveButton("Yes", new C0772fJ(this));
        builder.setNegativeButton("No", new C0791gJ(this));
        builder.create().show();
    }

    /* renamed from: c */
    public void mo3488c() {
        for (int size = this.f2214x.size() - 1; size >= 0; size--) {
            if (this.f2214x.valueAt(size)) {
                C0232LL item = this.f2212v.getItem(this.f2214x.keyAt(size));
                this.f2212v.remove(item);
                C0195JU ju = this.f2192b;
                StringBuilder sb = new StringBuilder();
                sb.append("delete from transactions where id=");
                sb.append(item.mo778i());
                ju.mo562d(sb.toString());
            }
        }
        mo3495f();
    }

    /* renamed from: c */
    public final void mo3489c(List<C0232LL> list) {
        Collections.sort(this.f2213w, new C0684d(null));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List, android.app.Activity] */
    public void call_btn(View view) {
        if (this.f2195e.length() < 3) {
            this.f2182K = 1;
            C0142HH.m298a(this.f2193c, this.f2196f, this.f2195e).show(getFragmentManager(), "CUSTOMER");
            return;
        }
        this.f2192b.mo541b(this.f2195e);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List, android.app.Activity] */
    /* renamed from: d */
    public void mo3491d() {
        int size = this.f2214x.size() - 1;
        if (this.f2214x.valueAt(size)) {
            C0232LL item = this.f2212v.getItem(this.f2214x.keyAt(size));
            Intent intent = new Intent(this, Customer_Det_List_edit.class);
            intent.putExtra("CUS_NAME", this.f2196f);
            intent.putExtra("TR_ID", item.mo778i());
            intent.putExtra("TR_DATE", item.mo777h());
            intent.putExtra("TR_AMOUNT", item.mo775f());
            intent.putExtra("TR_REMARKS", item.mo779j());
            intent.putExtra("TR_TYPE", item.mo780k());
            startActivity(intent);
        }
    }

    /* renamed from: d */
    public final void mo3492d(List<C0232LL> list) {
        Collections.sort(list, Collections.reverseOrder(new C0256MI(this)));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List] */
    /* renamed from: e */
    public void mo3493e() {
        this.f2212v = new C0302OM(this, 2131492929, this.f2213w);
        this.f2212v.f868i.clear();
        mo3486b(this.f2213w);
        this.f2212v.notifyDataSetChanged();
        this.f2210t.setAdapter(this.f2212v);
    }

    /* renamed from: e */
    public final void mo3494e(List<C0232LL> list) {
        Collections.sort(list, Collections.reverseOrder(new C0205KI(this)));
    }

    /* renamed from: f */
    public void mo3495f() {
        Cursor cursor;
        if (this.f2186O == 0) {
            cursor = this.f2192b.mo593l(this.f2193c);
        } else {
            boolean isEmpty = this.f2187P.isEmpty();
            String str = Value.PERCENTAGE;
            this.f2187P = isEmpty ? str : this.f2187P;
            if (!this.f2188Q.isEmpty()) {
                str = this.f2188Q;
            }
            this.f2188Q = str;
            cursor = this.f2192b.mo492a(this.f2193c, this.f2187P, this.f2188Q);
        }
        cursor.getCount();
        this.f2197g = 0.0d;
        this.f2213w.clear();
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            List<C0232LL> list = this.f2213w;
            String str2 = "_in";
            C0232LL ll = new C0232LL(cursor.getString(cursor.getColumnIndex("_id")), cursor.getString(cursor.getColumnIndex("date_")), cursor.getString(cursor.getColumnIndex("amount")), cursor.getString(cursor.getColumnIndex("remarks")), this.f2172A[cursor.getInt(cursor.getColumnIndex(str2))], String.valueOf(cursor.getInt(cursor.getColumnIndex(str2))));
            list.add(ll);
            cursor.moveToNext();
        }
        cursor.close();
        for (int size = this.f2213w.size() - 1; size >= 0; size--) {
            this.f2197g += Double.parseDouble(((C0232LL) this.f2213w.get(size)).mo775f().replaceAll(",", "")) * (Double.parseDouble(((C0232LL) this.f2213w.get(size)).mo770c()) - 1.0d);
            C0232LL ll2 = (C0232LL) this.f2213w.get(size);
            ll2.mo769b(String.valueOf(this.f2197g));
            this.f2213w.set(size, ll2);
        }
        mo3493e();
        if (this.f2186O == 1) {
            mo3500h(this.f2213w);
            this.f2212v.notifyDataSetChanged();
            this.f2199i = 1;
        }
        mo3481a(1);
    }

    /* renamed from: f */
    public final void mo3496f(List<C0232LL> list) {
        Collections.sort(this.f2213w, new C0686f(null));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List, android.app.Activity] */
    /* renamed from: g */
    public void mo3497g() {
        if (this.f2195e.length() < 3) {
            C0142HH.m298a(this.f2193c, this.f2196f, this.f2195e).show(getFragmentManager(), "CUSTOMER");
            return;
        }
        C0195JU ju = this.f2192b;
        String str = this.f2195e;
        StringBuilder sb = new StringBuilder();
        sb.append(getString(2131755382));
        sb.append(this.f2194d);
        ju.mo634y(str, sb.toString());
    }

    /* renamed from: g */
    public final void mo3498g(List<C0232LL> list) {
        Collections.sort(this.f2213w, new C0685e(null));
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    /* renamed from: h */
    public void mo3499h() {
        Dialog dialog = new Dialog(this.f2183L);
        LinearLayout linearLayout = new LinearLayout(this);
        this.f2177F = getResources().getStringArray(2130903058);
        this.f2178G = getResources().obtainTypedArray(2130903045);
        ListView listView = new ListView(this);
        this.f2179H = new ArrayList();
        int i = 0;
        while (true) {
            String[] strArr = this.f2177F;
            if (i < strArr.length) {
                this.f2179H.add(new C0796gO(strArr[i], this.f2178G.getResourceId(i, -1)));
                i++;
            } else {
                this.f2178G.recycle();
                this.f2180I = new C0063DH(getApplicationContext(), this.f2179H);
                listView.setAdapter(this.f2180I);
                listView.setOnItemClickListener(new C0406TI(this, dialog));
                linearLayout.setFocusable(true);
                listView.setBackgroundColor(Color.parseColor("#FFFFFF"));
                listView.setDividerHeight(0);
                linearLayout.addView(listView, -1, -1);
                dialog.requestWindowFeature(1);
                dialog.setContentView(linearLayout);
                dialog.show();
                return;
            }
        }
    }

    /* renamed from: h */
    public final void mo3500h(List<C0232LL> list) {
        Collections.sort(this.f2213w, new C0681a(null));
    }

    public void help_btn(View view) {
        mo3497g();
    }

    /* renamed from: i */
    public final void mo3502i(List<C0232LL> list) {
        Collections.sort(this.f2213w, new C0683c(null));
    }

    /* renamed from: j */
    public final void mo3503j(List<C0232LL> list) {
        Collections.sort(list, Collections.reverseOrder(new C0229LI(this)));
    }

    /* renamed from: k */
    public final void mo3504k(List<C0232LL> list) {
        Collections.sort(list, Collections.reverseOrder(new C0811hJ(this)));
    }

    public void no_result_btn(View view) {
        this.f2186O = 0;
        mo3495f();
    }

    public void onClick(View view) {
        this.f2213w = this.f2212v.f863d;
        switch (view.getId()) {
            case 2131296495:
                sort_tr_type_click(view);
                return;
            case 2131296675:
                sort_amount_click(view);
                return;
            case 2131296676:
                sort_net_bal_click(view);
                return;
            case 2131296679:
                sort_date_click(view);
                return;
            case 2131296682:
                sort_remarks_click(view);
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List, android.view.View$OnClickListener, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    public void onCreate(Bundle bundle) {
        Customer_Det_List.super.onCreate(bundle);
        setContentView(2131492892);
        try {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(this);
            Field declaredField = ViewConfiguration.class.getDeclaredField("sHasPermanentMenuKey");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                declaredField.setBoolean(viewConfiguration, false);
            }
        } catch (Exception unused) {
        }
        findViewById(2131296453).setOnClickListener(new C0384SI(this));
        findViewById(2131296454).setOnClickListener(new C0597aJ(this));
        this.f2210t = (ListView) findViewById(2131296529);
        this.f2210t.setEmptyView((TextView) findViewById(2131296440));
        this.f2211u = (LinearLayout) findViewById(2131296413);
        this.f2210t.setChoiceMode(2);
        this.f2192b = new C0195JU(this.f2191a, this);
        String str = "CUS_NAME";
        if (getIntent().getStringExtra(str) != null) {
            this.f2193c = getIntent().getStringExtra("CUS_ID");
            this.f2196f = getIntent().getStringExtra(str);
            this.f2194d = getIntent().getStringExtra("CUS_BAL");
            this.f2195e = getIntent().getStringExtra("CUS_GSM");
        }
        setTitle(this.f2196f);
        this.f2203m = (TextView) findViewById(2131296466);
        this.f2204n = (ImageView) findViewById(2131296495);
        this.f2205o = (TextView) findViewById(2131296679);
        this.f2206p = (TextView) findViewById(2131296675);
        this.f2207q = (TextView) findViewById(2131296682);
        this.f2208r = (TextView) findViewById(2131296676);
        this.f2205o.setOnClickListener(this);
        this.f2206p.setOnClickListener(this);
        this.f2207q.setOnClickListener(this);
        this.f2208r.setOnClickListener(this);
        this.f2204n.setOnClickListener(this);
        this.f2205o.setTextColor(-1);
        this.f2206p.setTextColor(-1);
        this.f2207q.setTextColor(-1);
        this.f2208r.setTextColor(-1);
        Calendar instance = Calendar.getInstance();
        new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        this.f2174C = instance.get(1);
        this.f2175D = instance.get(2);
        this.f2176E = instance.get(5);
        mo3495f();
        this.f2210t.setChoiceMode(3);
        this.f2210t.setMultiChoiceModeListener(new C0729dJ(this));
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [android.content.Context] */
    /* JADX WARNING: type inference failed for: r1v0, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog onCreateDialog(int r13) {
        /*
            r12 = this;
            if (r13 == 0) goto L_0x0017
            r0 = 4
            if (r13 == r0) goto L_0x0007
            r13 = 0
            return r13
        L_0x0007:
            android.app.DatePickerDialog r13 = new android.app.DatePickerDialog
            android.app.DatePickerDialog$OnDateSetListener r2 = r12.f2185N
            int r3 = r12.f2174C
            int r4 = r12.f2175D
            int r5 = r12.f2176E
            r0 = r13
            r1 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            return r13
        L_0x0017:
            android.app.DatePickerDialog r13 = new android.app.DatePickerDialog
            android.app.DatePickerDialog$OnDateSetListener r8 = r12.f2184M
            int r9 = r12.f2174C
            int r10 = r12.f2175D
            int r11 = r12.f2176E
            r6 = r13
            r7 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.Customer_Det_List.onCreateDialog(int):android.app.Dialog");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131558409, menu);
        MenuItem findItem = menu.findItem(2131296605);
        SearchView actionView = MenuItemCompat.getActionView(findItem);
        actionView.setSearchableInfo(((SearchManager) getSystemService("search")).getSearchableInfo(getComponentName()));
        actionView.setQueryHint(getString(2131755371));
        actionView.setOnQueryTextListener(new C0276NI(this));
        MenuItemCompat.setOnActionExpandListener(findItem, new C0298OI(this));
        return true;
    }

    public void onDestroy() {
        Customer_Det_List.super.onDestroy();
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List, android.app.Activity] */
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131296268) {
            mo3499h();
            return true;
        }
        if (itemId == 2131296272) {
            mo3480a();
        } else if (itemId == 2131296271) {
            mo3484b();
            mo3500h(this.f2213w);
            this.f2212v.notifyDataSetChanged();
            this.f2199i = 1;
            C0195JU ju = this.f2192b;
            ju.mo507a(this.f2210t, ju.mo465K(this.f2196f), mo3479a(this.f2212v.f863d), this.f2187P, this.f2188Q);
            C0195JU ju2 = this.f2192b;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f2192b.mo465K(this.f2196f));
            sb.append(".pdf");
            ju2.mo462I(sb.toString());
            return true;
        } else if (itemId == 2131296269) {
            mo3497g();
            return true;
        } else if (itemId == 2131296270) {
            Builder builder = new Builder(this);
            builder.setMessage(getString(2131755066));
            builder.setPositiveButton(getString(2131755137), new C0322PI(this));
            builder.setNegativeButton(getString(2131755136), new C0342QI(this));
            builder.create().show();
            new Handler().postDelayed(new C0364RI(this), 1000);
            return true;
        } else if (itemId == 16908332) {
            finish();
            return true;
        }
        return Customer_Det_List.super.onOptionsItemSelected(menuItem);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List, android.app.Activity] */
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (i != 112) {
            return;
        }
        if (iArr.length != 1 || iArr[0] != 0) {
            mo3482a(getString(2131755273));
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List, android.app.Activity] */
    public void onRestart() {
        Customer_Det_List.super.onRestart();
        mo3495f();
    }

    public void onResume() {
        Customer_Det_List.super.onResume();
    }

    public void sort_amount_click(View view) {
        int i;
        if (this.f2199i == 0) {
            mo3498g(this.f2213w);
            this.f2212v.notifyDataSetChanged();
            i = 1;
        } else {
            mo3496f(this.f2213w);
            this.f2212v.notifyDataSetChanged();
            i = 0;
        }
        this.f2199i = i;
    }

    public void sort_net_bal_click(View view) {
        int i;
        if (this.f2199i == 0) {
            mo3502i(this.f2213w);
            this.f2212v.notifyDataSetChanged();
            i = 1;
        } else {
            mo3489c(this.f2213w);
            this.f2212v.notifyDataSetChanged();
            i = 0;
        }
        this.f2199i = i;
    }

    public void sort_remarks_click(View view) {
        int i;
        if (this.f2199i == 0) {
            mo3503j(this.f2213w);
            this.f2212v.notifyDataSetChanged();
            i = 1;
        } else {
            mo3492d(this.f2213w);
            this.f2212v.notifyDataSetChanged();
            i = 0;
        }
        this.f2199i = i;
    }

    public void sort_tr_type_click(View view) {
        int i;
        if (this.f2199i == 0) {
            mo3504k(this.f2213w);
            this.f2212v.notifyDataSetChanged();
            i = 1;
        } else {
            mo3494e(this.f2213w);
            this.f2212v.notifyDataSetChanged();
            i = 0;
        }
        this.f2199i = i;
    }
}
