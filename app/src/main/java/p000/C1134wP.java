package p000;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.SearchView;
import android.text.ClipboardManager;
import android.text.InputFilter;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.itextpdf.tool.xml.css.CSS.Property;
import com.itextpdf.tool.xml.css.CSS.Value;
import com.itextpdf.tool.xml.html.HTML.Attribute;
import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport;
import com.valdio.valdioveliu.recyclerview.frag.Calculator;
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
/* renamed from: wP */
public class C1134wP extends Fragment implements OnClickListener {

    /* renamed from: a */
    public static double f3933a;

    /* renamed from: A */
    public TextView f3934A;

    /* renamed from: B */
    public C0302OM f3935B;

    /* renamed from: C */
    public ListView f3936C;

    /* renamed from: D */
    public SparseBooleanArray f3937D;

    /* renamed from: E */
    public int f3938E;

    /* renamed from: F */
    public int f3939F;

    /* renamed from: G */
    public int f3940G;

    /* renamed from: H */
    public int f3941H;

    /* renamed from: I */
    public String[] f3942I;

    /* renamed from: J */
    public TypedArray f3943J;

    /* renamed from: K */
    public List<C0796gO> f3944K;

    /* renamed from: L */
    public C0063DH f3945L;

    /* renamed from: M */
    public int[] f3946M;

    /* renamed from: N */
    public LinearLayout f3947N;

    /* renamed from: O */
    public OnClickListener f3948O;

    /* renamed from: P */
    public boolean f3949P;

    /* renamed from: Q */
    public ProgressDialog f3950Q;

    /* renamed from: R */
    public String f3951R;

    /* renamed from: S */
    public int f3952S;

    /* renamed from: T */
    public String f3953T;

    /* renamed from: U */
    public int f3954U;

    /* renamed from: V */
    public int f3955V;

    /* renamed from: W */
    public String f3956W;

    /* renamed from: X */
    public String f3957X;

    /* renamed from: Y */
    public TextView f3958Y;

    /* renamed from: Z */
    public TextView f3959Z;

    /* renamed from: aa */
    public AutoCompleteTextView f3960aa;

    /* renamed from: b */
    public String f3961b = null;

    /* renamed from: ba */
    public EditText f3962ba;

    /* renamed from: c */
    public String f3963c = null;

    /* renamed from: ca */
    public TextView f3964ca;

    /* renamed from: d */
    public String f3965d = null;

    /* renamed from: da */
    public TextView f3966da;

    /* renamed from: e */
    public String f3967e = null;

    /* renamed from: ea */
    public AutoCompleteTextView f3968ea;

    /* renamed from: f */
    public int f3969f = 0;

    /* renamed from: fa */
    public AutoCompleteTextView f3970fa;

    /* renamed from: g */
    public String f3971g = null;

    /* renamed from: ga */
    public Button f3972ga;

    /* renamed from: h */
    public String f3973h = null;

    /* renamed from: ha */
    public Button f3974ha;

    /* renamed from: i */
    public String f3975i = null;

    /* renamed from: ia */
    public Button f3976ia;

    /* renamed from: j */
    public int f3977j = 0;

    /* renamed from: ja */
    public ImageView f3978ja;

    /* renamed from: k */
    public List<C0232LL> f3979k = new ArrayList();

    /* renamed from: ka */
    public RadioGroup f3980ka;

    /* renamed from: l */
    public String f3981l = null;

    /* renamed from: la */
    public RadioButton f3982la;

    /* renamed from: m */
    public int f3983m;

    /* renamed from: ma */
    public RadioButton f3984ma;

    /* renamed from: n */
    public int f3985n;

    /* renamed from: na */
    public LinearLayout f3986na;

    /* renamed from: o */
    public SQLiteDatabase f3987o;

    /* renamed from: oa */
    public LinearLayout f3988oa;

    /* renamed from: p */
    public C0195JU f3989p;

    /* renamed from: pa */
    public LinearLayout f3990pa;

    /* renamed from: q */
    public String[] f3991q;

    /* renamed from: qa */
    public LinearLayout f3992qa;

    /* renamed from: r */
    public TextView f3993r;

    /* renamed from: ra */
    public ArrayAdapter<String> f3994ra;

    /* renamed from: s */
    public ImageView f3995s;

    /* renamed from: sa */
    public ArrayAdapter<String> f3996sa;

    /* renamed from: t */
    public ImageView f3997t;

    /* renamed from: ta */
    public String[] f3998ta;

    /* renamed from: u */
    public ImageView f3999u;

    /* renamed from: ua */
    public EditText f4000ua;

    /* renamed from: v */
    public ImageView f4001v;

    /* renamed from: va */
    public EditText f4002va;

    /* renamed from: w */
    public TextView f4003w;

    /* renamed from: x */
    public TextView f4004x;

    /* renamed from: y */
    public TextView f4005y;

    /* renamed from: z */
    public TextView f4006z;

    /* renamed from: wP$a */
    private class C1135a implements Comparator<C0232LL> {
        public C1135a() {
        }

        public /* synthetic */ C1135a(C1134wP wPVar, C0350QO qo) {
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

    /* renamed from: wP$b */
    private class C1136b implements Comparator<C0232LL> {
        public C1136b() {
        }

        public /* synthetic */ C1136b(C1134wP wPVar, C0350QO qo) {
            this();
        }

        /* renamed from: a */
        public int compare(C0232LL ll, C0232LL ll2) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
            try {
                int compareTo = simpleDateFormat.parse(ll2.mo777h()).compareTo(simpleDateFormat.parse(ll.mo777h()));
                return compareTo == 0 ? Integer.valueOf(ll2.mo778i()).compareTo(Integer.valueOf(ll.mo778i())) : compareTo;
            } catch (ParseException unused) {
                return ll2.mo777h().compareTo(ll.mo777h());
            }
        }
    }

    /* renamed from: wP$c */
    private class C1137c implements Comparator<C0232LL> {
        public C1137c() {
        }

        public /* synthetic */ C1137c(C1134wP wPVar, C0350QO qo) {
            this();
        }

        /* renamed from: a */
        public int compare(C0232LL ll, C0232LL ll2) {
            String str = "";
            String str2 = ",";
            return Double.valueOf(ll.mo770c().replaceAll(str2, str)).compareTo(Double.valueOf(ll2.mo770c().replaceAll(str2, str)));
        }
    }

    /* renamed from: wP$d */
    private class C1138d implements Comparator<C0232LL> {
        public C1138d() {
        }

        public /* synthetic */ C1138d(C1134wP wPVar, C0350QO qo) {
            this();
        }

        /* renamed from: a */
        public int compare(C0232LL ll, C0232LL ll2) {
            String str = "";
            String str2 = ",";
            return Double.valueOf(ll2.mo770c().replaceAll(str2, str)).compareTo(Double.valueOf(ll.mo770c().replaceAll(str2, str)));
        }
    }

    /* renamed from: wP$e */
    private class C1139e implements Comparator<C0232LL> {
        public C1139e() {
        }

        public /* synthetic */ C1139e(C1134wP wPVar, C0350QO qo) {
            this();
        }

        /* renamed from: a */
        public int compare(C0232LL ll, C0232LL ll2) {
            String str = "";
            String str2 = ",";
            return Double.valueOf(ll.mo775f().replaceAll(str2, str)).compareTo(Double.valueOf(ll2.mo775f().replaceAll(str2, str)));
        }
    }

    /* renamed from: wP$f */
    private class C1140f implements Comparator<C0232LL> {
        public C1140f() {
        }

        public /* synthetic */ C1140f(C1134wP wPVar, C0350QO qo) {
            this();
        }

        /* renamed from: a */
        public int compare(C0232LL ll, C0232LL ll2) {
            String str = "";
            String str2 = ",";
            return Double.valueOf(ll2.mo775f().replaceAll(str2, str)).compareTo(Double.valueOf(ll.mo775f().replaceAll(str2, str)));
        }
    }

    public C1134wP() {
        String str = "January";
        String str2 = "February";
        String str3 = "March";
        String str4 = "April";
        String str5 = "May";
        String str6 = "June";
        this.f3991q = new String[]{str, str2, str3, str4, str5, str6, "July", "August", "September", "October", "November", "December"};
        this.f3993r = null;
        this.f3995s = null;
        this.f3997t = null;
        this.f3999u = null;
        this.f4001v = null;
        this.f4003w = null;
        this.f4004x = null;
        this.f4005y = null;
        this.f4006z = null;
        this.f3934A = null;
        this.f3938E = 0;
        this.f3946M = new int[]{2131230923, 1, 2131230855};
        this.f3947N = null;
        this.f3948O = new C0992pP(this);
        this.f3952S = 0;
        this.f3953T = "";
        this.f3954U = 0;
        this.f3955V = 0;
        this.f3956W = Value.PERCENTAGE;
        this.f3957X = Value.PERCENTAGE;
        this.f3958Y = null;
        this.f3959Z = null;
        this.f3960aa = null;
        this.f3962ba = null;
        this.f3964ca = null;
        this.f3966da = null;
        this.f3968ea = null;
        this.f3970fa = null;
        this.f3972ga = null;
        this.f3974ha = null;
        this.f3976ia = null;
        this.f3978ja = null;
        this.f3980ka = null;
        this.f3982la = null;
        this.f3984ma = null;
        this.f3986na = null;
        this.f3988oa = null;
        this.f3990pa = null;
        this.f3992qa = null;
        this.f3998ta = new String[]{str, str2, str3, str4, str5, str6, "July", "August", "September", "October", "November", "December"};
    }

    private void sort_date_click(View view) {
        int i;
        if (this.f3938E == 0) {
            mo5315h(this.f3979k);
            this.f3935B.notifyDataSetChanged();
            i = 1;
        } else {
            mo5300b(this.f3979k);
            this.f3935B.notifyDataSetChanged();
            i = 0;
        }
        this.f3938E = i;
    }

    /* renamed from: a */
    public double mo5288a(List<C0232LL> list) {
        if (this.f3955V == 1) {
            return f3933a;
        }
        double d = 0.0d;
        for (int size = list.size() - 1; size >= 0; size--) {
            int i = ((C0232LL) list.get(size)).mo780k() == this.f3946M[0] ? -1 : ((C0232LL) list.get(size)).mo780k() == this.f3946M[2] ? 1 : 0;
            double parseDouble = Double.parseDouble(((C0232LL) list.get(size)).mo775f().replaceAll(",", ""));
            double d2 = (double) i;
            Double.isNaN(d2);
            d += parseDouble * d2;
        }
        return d;
    }

    /* renamed from: a */
    public final void mo5289a() {
        this.f3951R = "";
        this.f3950Q = new ProgressDialog(getActivity());
        this.f3950Q.setProgressStyle(0);
        this.f3950Q.setCancelable(false);
        this.f3950Q.setButton(-2, "Cancel", new C0150HO(this));
        this.f3950Q.show();
        this.f3951R = getString(2131755423);
        this.f3950Q.setMessage(this.f3951R);
    }

    /* renamed from: a */
    public void mo5290a(View view) {
        startActivityForResult(new Intent("android.intent.action.PICK", Phone.CONTENT_URI), 1);
    }

    /* renamed from: a */
    public final void mo5291a(String str) {
        new Builder(getActivity()).setTitle("Permission Request").setMessage(str).setCancelable(false).setPositiveButton(17039379, new C0778fP(this)).show();
    }

    /* renamed from: a */
    public void mo5292a(String str, String str2, String str3, String str4) {
        try {
            Builder builder = new Builder(getActivity());
            View inflate = getActivity().getLayoutInflater().inflate(2131492955, null);
            builder.setView(inflate);
            EditText editText = (EditText) inflate.findViewById(2131296387);
            EditText editText2 = (EditText) inflate.findViewById(2131296389);
            ImageView imageView = (ImageView) inflate.findViewById(2131296498);
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) inflate.findViewById(2131296384);
            editText.setText(str2);
            editText2.setText(str3);
            autoCompleteTextView.setText(str4);
            this.f4000ua = editText2;
            editText2.requestFocus();
            imageView.setOnClickListener(new C0903lP(this));
            builder.setPositiveButton(getString(2131755359), new C0922mP(this));
            builder.setNegativeButton(getString(2131755358), new C0944nP(this));
            AlertDialog create = builder.create();
            create.getWindow().setSoftInputMode(4);
            create.show();
            Button button = create.getButton(-1);
            C0963oP oPVar = new C0963oP(this, editText2, str, editText, create);
            button.setOnClickListener(oPVar);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void mo5293a(boolean z) {
        try {
            Builder builder = new Builder(getActivity());
            View inflate = getActivity().getLayoutInflater().inflate(2131492921, null);
            builder.setView(inflate);
            this.f3960aa = (AutoCompleteTextView) inflate.findViewById(2131296388);
            this.f3960aa.setText(this.f3963c);
            this.f3962ba = (EditText) inflate.findViewById(2131296431);
            this.f4002va = this.f3962ba;
            this.f3962ba.setFilters(new InputFilter[]{new C0345QL(2)});
            this.f3962ba.addTextChangedListener(new C0733dN(this.f3962ba));
            this.f3962ba.requestFocus();
            this.f3964ca = (TextView) inflate.findViewById(2131296433);
            this.f3966da = (TextView) inflate.findViewById(2131296434);
            this.f3972ga = (Button) inflate.findViewById(2131296349);
            this.f3974ha = (Button) inflate.findViewById(2131296347);
            this.f3976ia = (Button) inflate.findViewById(2131296348);
            this.f3978ja = (ImageView) inflate.findViewById(2131296346);
            this.f3980ka = (RadioGroup) inflate.findViewById(2131296583);
            this.f3982la = (RadioButton) inflate.findViewById(2131296581);
            this.f3984ma = (RadioButton) inflate.findViewById(2131296582);
            this.f3980ka.check(2131296582);
            this.f3968ea = (AutoCompleteTextView) inflate.findViewById(2131296435);
            this.f3970fa = (AutoCompleteTextView) inflate.findViewById(2131296436);
            this.f3986na = (LinearLayout) inflate.findViewById(2131296416);
            this.f3988oa = (LinearLayout) inflate.findViewById(2131296417);
            this.f3990pa = (LinearLayout) inflate.findViewById(2131296419);
            this.f3992qa = (LinearLayout) inflate.findViewById(2131296420);
            mo5301b(z);
            builder.setCancelable(true);
            AlertDialog create = builder.create();
            create.getWindow().setSoftInputMode(4);
            this.f3974ha.setOnClickListener(new C0412TO(this, create));
            this.f3976ia.setOnClickListener(new C0438UO(this, create));
            this.f3972ga.setOnClickListener(new C0459VO(this, create));
            this.f3978ja.setOnClickListener(new C0480WO(this));
            create.show();
        } catch (Exception e) {
            Log.d("adv_search_error=", e.getMessage());
        }
    }

    /* renamed from: a */
    public boolean mo5294a(int i) {
        String str = ",";
        boolean z = false;
        int i2 = i == 2131296347 ? -1 : i == 2131296348 ? 1 : 0;
        mo5313g();
        if (mo5312f()) {
            if (i2 != 0) {
                try {
                    C0195JU ju = this.f3989p;
                    StringBuilder sb = new StringBuilder();
                    sb.append("insert into transactions (cus_id,out,[in],date_,remarks,now_) values((select b.id from customers as b where b.name='");
                    sb.append(this.f3960aa.getText());
                    sb.append("'),");
                    sb.append(this.f3962ba.getText().toString().replaceAll(str, ""));
                    sb.append(str);
                    sb.append(i2);
                    sb.append(",'");
                    sb.append(this.f3966da.getText());
                    sb.append("','");
                    sb.append(this.f3970fa.getText());
                    sb.append("',strftime('%Y-%m-%d','now'))");
                    ju.mo562d(sb.toString());
                    this.f3962ba.setText(null);
                    Calendar instance = Calendar.getInstance();
                    this.f3966da.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).format(instance.getTime()));
                    this.f3939F = instance.get(1);
                    this.f3940G = instance.get(2);
                    this.f3941H = instance.get(5);
                    this.f3970fa.setText(null);
                    this.f3962ba.requestFocus();
                    z = true;
                } catch (Exception unused) {
                    Toast.makeText(getActivity(), getString(2131755389), 1);
                }
            }
            mo5326n();
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo5295a(String str, String str2, Context context) {
        C1011qP qPVar = new C1011qP(this);
        Builder builder = new Builder(context);
        builder.setTitle(str);
        builder.setMessage(str2);
        builder.setPositiveButton(getString(2131755137), new C1033rP(this, qPVar));
        builder.setNegativeButton(getString(2131755136), new C1053sP(this, qPVar));
        builder.show();
        try {
            Looper.loop();
        } catch (RuntimeException unused) {
        }
        return this.f3949P;
    }

    public void amount_add_btn(View view) {
        mo5293a(true);
    }

    /* renamed from: b */
    public void mo5297b() {
        C0195JU ju = this.f3989p;
        StringBuilder sb = new StringBuilder();
        sb.append("insert into customers (name,gsm) values('");
        sb.append(this.f3960aa.getText());
        sb.append("','0')");
        ju.mo562d(sb.toString());
    }

    /* renamed from: b */
    public void mo5298b(int i) {
        TextView textView;
        String str;
        StringBuilder sb;
        double d;
        StringBuilder sb2;
        TextView textView2;
        TextView textView3;
        StringBuilder sb3;
        NumberFormat instance = NumberFormat.getInstance(Locale.ENGLISH);
        if (this.f3955V == 1) {
            d = mo5288a(this.f3935B.f863d);
            FragmentStatePagerSupport.f2420f = instance.format(d);
            this.f3965d = instance.format(d);
            if (d >= 0.0d) {
                this.f3995s.setImageResource(this.f3946M[2]);
                textView = this.f3993r;
                sb2 = new StringBuilder();
            } else {
                this.f3995s.setImageResource(this.f3946M[0]);
                textView2 = this.f3993r;
                sb = new StringBuilder();
                sb.append(getString(2131755403));
                sb.append(instance.format(d));
                str = sb.toString();
                textView.setText(str);
            }
        } else {
            if (i == 1) {
                this.f3993r.setText(getString(2131755188));
                try {
                    ArrayList o = this.f3989p.mo604o(this.f3963c);
                    if (o.size() > 0 && this.f3989p.mo596m(this.f3963c).getCount() != 0) {
                        this.f3965d = instance.format(Double.parseDouble((String) o.get(0)));
                        FragmentStatePagerSupport.f2420f = this.f3965d;
                        if (Double.parseDouble((String) o.get(0)) >= 0.0d) {
                            this.f3995s.setImageResource(this.f3946M[2]);
                            textView3 = this.f3993r;
                            sb3 = new StringBuilder();
                            sb3.append(getString(2131755404));
                            sb3.append(instance.format(Double.parseDouble((String) o.get(0))));
                        } else {
                            this.f3995s.setImageResource(this.f3946M[0]);
                            textView3 = this.f3993r;
                            sb3 = new StringBuilder();
                            sb3.append(getString(2131755403));
                            sb3.append(instance.format(Double.parseDouble((String) o.get(0))));
                        }
                        textView3.setText(sb3.toString());
                    } else {
                        return;
                    }
                } catch (Exception unused) {
                }
            } else if (i == 2) {
                d = mo5288a(this.f3935B.f863d);
                FragmentStatePagerSupport.f2420f = instance.format(d);
                this.f3965d = instance.format(d);
                if (d >= 0.0d) {
                    this.f3995s.setImageResource(this.f3946M[2]);
                    textView = this.f3993r;
                    sb2 = new StringBuilder();
                } else {
                    this.f3995s.setImageResource(this.f3946M[0]);
                    textView2 = this.f3993r;
                    sb = new StringBuilder();
                    sb.append(getString(2131755403));
                    sb.append(instance.format(d));
                    str = sb.toString();
                    textView.setText(str);
                }
            }
        }
        sb2.append(getString(2131755404));
        sb2.append(instance.format(d));
        str = sb2.toString();
        textView.setText(str);
    }

    /* renamed from: b */
    public void mo5299b(String str) {
        ((ClipboardManager) getActivity().getSystemService("clipboard")).setText(str);
        Toast.makeText(getContext(), "Copied to clipboard", 0).show();
    }

    /* renamed from: b */
    public final void mo5300b(List<C0232LL> list) {
        Collections.sort(this.f3979k, new C1136b(this, null));
    }

    /* renamed from: b */
    public void mo5301b(boolean z) {
        TextView textView;
        OnClickListener yo;
        RadioButton radioButton;
        Calendar instance = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        mo5328o();
        mo5337p();
        this.f3996sa = new ArrayAdapter<>(getActivity(), 17367050, this.f3998ta);
        this.f3994ra = new ArrayAdapter<>(getActivity(), 17367050, this.f3991q);
        this.f3960aa.setThreshold(1);
        this.f3960aa.setAdapter(this.f3994ra);
        if (z) {
            this.f3986na.setVisibility(8);
            this.f3988oa.setVisibility(8);
            this.f3990pa.setVisibility(0);
            this.f3992qa.setVisibility(0);
            this.f3970fa.setThreshold(1);
            this.f3970fa.setAdapter(this.f3996sa);
            this.f3966da.setText(simpleDateFormat.format(instance.getTime()));
            textView = this.f3966da;
            yo = new C0501XO(this);
        } else {
            this.f3990pa.setVisibility(8);
            this.f3992qa.setVisibility(8);
            this.f3986na.setVisibility(0);
            this.f3988oa.setVisibility(0);
            this.f3968ea.setThreshold(1);
            this.f3968ea.setAdapter(this.f3996sa);
            this.f3972ga.setText(getString(2131755108));
            this.f3968ea.setText(this.f3975i);
            this.f3964ca.setText(this.f3971g);
            this.f3962ba.setText(this.f3973h);
            int i = this.f3977j;
            int[] iArr = this.f3946M;
            if (i == iArr[0]) {
                radioButton = this.f3982la;
            } else {
                if (i == iArr[2]) {
                    radioButton = this.f3984ma;
                }
                this.f3962ba.requestFocus();
                this.f3962ba.selectAll();
                textView = this.f3964ca;
                yo = new C0521YO(this);
            }
            radioButton.setChecked(true);
            this.f3962ba.requestFocus();
            this.f3962ba.selectAll();
            textView = this.f3964ca;
            yo = new C0521YO(this);
        }
        textView.setOnClickListener(yo);
    }

    /* renamed from: c */
    public void mo5302c() {
        try {
            this.f3955V = 0;
            Builder builder = new Builder(getActivity());
            View inflate = getActivity().getLayoutInflater().inflate(2131492918, null);
            builder.setView(inflate);
            this.f3958Y = (TextView) inflate.findViewById(2131296451);
            this.f3959Z = (TextView) inflate.findViewById(2131296647);
            this.f3958Y.setOnClickListener(new C0235LO(this));
            this.f3959Z.setOnClickListener(new C0262MO(this));
            builder.setPositiveButton(getString(2131755109), new C0282NO(this));
            builder.setNegativeButton(getString(2131755106), new C0306OO(this));
            AlertDialog create = builder.create();
            create.getWindow().setSoftInputMode(4);
            create.show();
            create.getButton(-1).setOnClickListener(new C0328PO(this, create));
        } catch (Exception e) {
            Log.d("adv_search_error=", e.getMessage());
        }
    }

    /* renamed from: c */
    public void mo5303c(String str) {
        this.f3935B.getFilter().filter(str);
    }

    /* renamed from: c */
    public final void mo5304c(List<C0232LL> list) {
        Collections.sort(this.f3979k, new C1138d(this, null));
    }

    public void calc_pick_btn(View view) {
        Intent intent = new Intent(view.getContext(), Calculator.class);
        intent.putExtra("tr_amount", this.f4002va.getText().toString());
        startActivityForResult(intent, 2);
    }

    public void call_btn(View view) {
        if (this.f3967e.length() < 3) {
            this.f3954U = 1;
            mo5292a(this.f3961b, this.f3963c, this.f3967e, "");
            return;
        }
        this.f3989p.mo541b(this.f3967e);
    }

    /* renamed from: d */
    public void mo5307d() {
        String str = "android.permission.WRITE_EXTERNAL_STORAGE";
        if (!(ContextCompat.checkSelfPermission(getActivity(), str) == 0)) {
            ActivityCompat.requestPermissions(getActivity(), new String[]{str}, C0776fN.AppCompatTheme_windowActionBarOverlay);
        }
    }

    /* renamed from: d */
    public final void mo5308d(List<C0232LL> list) {
        Collections.sort(list, Collections.reverseOrder(new C0627bP(this)));
    }

    /* renamed from: e */
    public final void mo5309e(List<C0232LL> list) {
        Collections.sort(list, Collections.reverseOrder(new C0572_O(this)));
    }

    /* renamed from: e */
    public boolean mo5310e() {
        boolean z = false;
        int i = this.f3982la.isChecked() ? -1 : this.f3984ma.isChecked() ? 1 : 0;
        mo5313g();
        if (mo5316h()) {
            try {
                if (this.f3972ga.getText().equals(getString(2131755108)) && this.f3969f != 0) {
                    C0195JU ju = this.f3989p;
                    StringBuilder sb = new StringBuilder();
                    sb.append("update transactions set out='");
                    sb.append(this.f3962ba.getText().toString().replaceAll(",", ""));
                    sb.append("',[in]='");
                    sb.append(i);
                    sb.append("',date_='");
                    sb.append(this.f3964ca.getText());
                    sb.append("',remarks='");
                    sb.append(this.f3968ea.getText());
                    sb.append("' where id='");
                    sb.append(this.f3969f);
                    sb.append("'");
                    ju.mo562d(sb.toString());
                    this.f3962ba.setText(null);
                    Calendar instance = Calendar.getInstance();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
                    this.f3964ca.setText(simpleDateFormat.format(instance.getTime()));
                    this.f3966da.setText(simpleDateFormat.format(instance.getTime()));
                    this.f3939F = instance.get(1);
                    this.f3940G = instance.get(2);
                    this.f3941H = instance.get(5);
                    this.f3968ea.setText(null);
                    this.f3970fa.setText(null);
                    this.f3972ga.setText(getString(2131755103));
                    this.f3969f = 0;
                    z = true;
                }
                mo5326n();
                mo5301b(true);
            } catch (Exception unused) {
                Toast.makeText(getActivity(), getString(2131755389), 1);
            }
        }
        return z;
    }

    /* renamed from: f */
    public final void mo5311f(List<C0232LL> list) {
        Collections.sort(this.f3979k, new C1140f(this, null));
    }

    /* renamed from: f */
    public final boolean mo5312f() {
        Log.d("IMEI=", "AFTER VALIDATION");
        boolean a = C0008AO.m5a(this.f3962ba);
        if (!C0008AO.m5a(this.f3970fa)) {
            a = false;
        }
        if (!C0008AO.m5a(this.f3960aa)) {
            a = false;
        }
        if ((this.f3989p.mo623v() <= 100 || this.f3989p.mo626w(C0195JU.f445e) != 0 || this.f3989p.mo602o(C0195JU.f445e, C0195JU.f446f) != 0 || (this.f3989p.mo627w().getCount() <= 5 && this.f3989p.mo623v() <= 200)) && this.f3989p.mo579h(C0195JU.f445e) <= 0) {
            this.f3972ga.setError(null);
            return a;
        }
        mo5318i();
        this.f3972ga.setError(getString(2131755238));
        return false;
    }

    /* renamed from: g */
    public final void mo5313g() {
        if (this.f3989p.mo590k(this.f3960aa.getText().toString()) == 0 && this.f3960aa.getText().toString().length() >= 1 && this.f3972ga.getText().toString().equals(getString(2131755103))) {
            String string = getString(2131755419);
            StringBuilder sb = new StringBuilder();
            sb.append(getString(2131755419));
            sb.append(this.f3960aa.getText());
            mo5295a(string, sb.toString(), getActivity());
        }
    }

    /* renamed from: g */
    public final void mo5314g(List<C0232LL> list) {
        Collections.sort(this.f3979k, new C1139e(this, null));
    }

    /* renamed from: h */
    public final void mo5315h(List<C0232LL> list) {
        Collections.sort(this.f3979k, new C1135a(this, null));
    }

    /* renamed from: h */
    public final boolean mo5316h() {
        boolean a = C0008AO.m5a(this.f3962ba);
        if (!C0008AO.m5a(this.f3968ea)) {
            a = false;
        }
        if (!C0008AO.m5a(this.f3960aa)) {
            a = false;
        }
        if ((this.f3989p.mo623v() <= 100 || this.f3989p.mo626w(C0195JU.f445e) != 0 || this.f3989p.mo602o(C0195JU.f445e, C0195JU.f446f) != 0 || (this.f3989p.mo627w().getCount() <= 5 && this.f3989p.mo623v() <= 200)) && this.f3989p.mo579h(C0195JU.f445e) <= 0) {
            this.f3972ga.setError(null);
            return a;
        }
        mo5318i();
        this.f3972ga.setError(getString(2131755238));
        return false;
    }

    public void help_btn(View view) {
        mo5338q();
    }

    /* renamed from: i */
    public void mo5318i() {
        try {
            Builder builder = new Builder(getActivity());
            View inflate = getActivity().getLayoutInflater().inflate(2131492962, null);
            builder.setView(inflate);
            TextView textView = (TextView) inflate.findViewById(2131296489);
            EditText editText = (EditText) inflate.findViewById(2131296490);
            editText.setHint(2131755232);
            TextView textView2 = (TextView) inflate.findViewById(2131296491);
            ImageView imageView = (ImageView) inflate.findViewById(2131296494);
            textView.setTag(C0195JU.f445e);
            StringBuilder sb = new StringBuilder();
            sb.append(getString(2131755379));
            sb.append("\n");
            sb.append(C0195JU.f445e);
            textView.setText(sb.toString());
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            textView2.setText(2131755140);
            builder.setPositiveButton(getString(2131755070), new C1073tP(this));
            AlertDialog create = builder.create();
            create.getWindow().setSoftInputMode(4);
            create.show();
            imageView.setOnClickListener(new C1093uP(this, textView, create));
            textView.setOnClickListener(new C1113vP(this, textView, create));
            create.getButton(-1).setOnClickListener(new C0128GO(this, editText, create));
        } catch (Exception e) {
            Log.d("adv_search_error=", e.getMessage());
        }
    }

    /* renamed from: i */
    public final void mo5319i(List<C0232LL> list) {
        Collections.sort(this.f3979k, new C1137c(this, null));
    }

    /* renamed from: j */
    public void mo5320j() {
        for (int size = this.f3937D.size() - 1; size >= 0; size--) {
            if (this.f3937D.valueAt(size)) {
                C0232LL item = this.f3935B.getItem(this.f3937D.keyAt(size));
                this.f3935B.remove(item);
                C0195JU ju = this.f3989p;
                StringBuilder sb = new StringBuilder();
                sb.append("delete from transactions where id=");
                sb.append(item.mo778i());
                ju.mo562d(sb.toString());
            }
        }
    }

    /* renamed from: j */
    public final void mo5321j(List<C0232LL> list) {
        Collections.sort(list, Collections.reverseOrder(new C0607aP(this)));
    }

    /* renamed from: k */
    public void mo5322k() {
        int size = this.f3937D.size() - 1;
        if (this.f3937D.valueAt(size)) {
            C0232LL item = this.f3935B.getItem(this.f3937D.keyAt(size));
            try {
                this.f3969f = Integer.parseInt(item.mo778i());
                this.f3971g = item.mo777h();
                this.f3973h = item.mo775f();
                this.f3975i = item.mo779j();
                this.f3977j = item.mo780k();
                mo5293a(false);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: k */
    public final void mo5323k(List<C0232LL> list) {
        Collections.sort(list, Collections.reverseOrder(new C0549ZO(this)));
    }

    /* renamed from: l */
    public final void mo5324l() {
        try {
            mo5289a();
            V a = qa.a(getActivity());
            StringBuilder sb = new StringBuilder();
            sb.append("http://easycard.work/abd/v1/imei/_ID_/check".replace("_ID_", C0195JU.f445e));
            sb.append("?code=");
            sb.append(this.f3953T);
            String sb2 = sb.toString();
            Log.d("Imei_list", "Start...");
            a.a(new pa(0, sb2, new C0170IO(this), new C0189JO(this)));
        } catch (Exception unused) {
            this.f3950Q.dismiss();
        }
    }

    /* renamed from: m */
    public void mo5325m() {
        this.f3935B = new C0302OM(getActivity(), 2131492929, this.f3979k);
        this.f3935B.f868i.clear();
        mo5300b(this.f3979k);
        this.f3935B.notifyDataSetChanged();
        this.f3936C.setAdapter(this.f3935B);
    }

    /* renamed from: n */
    public void mo5326n() {
        Cursor cursor;
        if (this.f3955V == 0) {
            cursor = this.f3989p.mo593l(this.f3961b);
        } else {
            boolean isEmpty = this.f3956W.isEmpty();
            String str = Value.PERCENTAGE;
            this.f3956W = isEmpty ? str : this.f3956W;
            if (!this.f3957X.isEmpty()) {
                str = this.f3957X;
            }
            this.f3957X = str;
            cursor = this.f3989p.mo492a(this.f3961b, this.f3956W, this.f3957X);
        }
        cursor.getCount();
        f3933a = 0.0d;
        this.f3979k.clear();
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            List<C0232LL> list = this.f3979k;
            String str2 = "_in";
            C0232LL ll = new C0232LL(cursor.getString(cursor.getColumnIndex("_id")), cursor.getString(cursor.getColumnIndex("date_")), cursor.getString(cursor.getColumnIndex("amount")), cursor.getString(cursor.getColumnIndex("remarks")), this.f3946M[cursor.getInt(cursor.getColumnIndex(str2))], String.valueOf(cursor.getInt(cursor.getColumnIndex(str2))));
            list.add(ll);
            cursor.moveToNext();
        }
        cursor.close();
        for (int size = this.f3979k.size() - 1; size >= 0; size--) {
            f3933a += Double.parseDouble(((C0232LL) this.f3979k.get(size)).mo775f().replaceAll(",", "")) * (Double.parseDouble(((C0232LL) this.f3979k.get(size)).mo770c()) - 1.0d);
            C0232LL ll2 = (C0232LL) this.f3979k.get(size);
            ll2.mo769b(String.valueOf(f3933a));
            this.f3979k.set(size, ll2);
        }
        mo5325m();
        if (this.f3955V == 1) {
            mo5315h(this.f3979k);
            this.f3935B.notifyDataSetChanged();
            this.f3938E = 1;
        }
        mo5298b(1);
    }

    public void no_result_btn(View view) {
        Log.d("no result", "Click");
        this.f3955V = 0;
        mo5326n();
    }

    /* renamed from: o */
    public void mo5328o() {
        Cursor D = this.f3989p.mo453D();
        this.f3991q = new String[D.getCount()];
        if (D.moveToFirst()) {
            int i = 0;
            do {
                this.f3991q[i] = D.getString(D.getColumnIndex("_id"));
                i++;
            } while (D.moveToNext());
        }
        D.close();
        this.f3960aa.setThreshold(1);
        this.f3960aa.setAdapter(this.f3994ra);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        getActivity();
        if (i2 == 0) {
            return;
        }
        if (i == 1) {
            getActivity();
            if (i2 == -1) {
                String str = "data1";
                String str2 = "display_name";
                Cursor query = getActivity().getContentResolver().query(intent.getData(), new String[]{str, str2}, null, null, null);
                query.moveToFirst();
                String string = query.getString(query.getColumnIndex(str));
                query.getString(query.getColumnIndex(str2));
                this.f4000ua.setText(string);
                query.close();
            }
        } else if (i == 2 && intent != null) {
            this.f4002va.setText(intent.getStringExtra("calc_result"));
        }
    }

    public void onClick(View view) {
        this.f3979k = this.f3935B.f863d;
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

    public void onCreate(Bundle bundle) {
        C1134wP.super.onCreate(bundle);
        String str = "";
        this.f3961b = getArguments() != null ? getArguments().getString("cus_id") : str;
        this.f3963c = getArguments() != null ? getArguments().getString("cus_name") : str;
        this.f3967e = getArguments() != null ? getArguments().getString("cus_gsm") : str;
        this.f3965d = getArguments() != null ? getArguments().getString("cus_bal") : str;
        Integer num = null;
        this.f3983m = (getArguments() != null ? Integer.valueOf(getArguments().getInt(Property.POSITION)) : null).intValue();
        if (getArguments() != null) {
            num = Integer.valueOf(getArguments().getInt(Attribute.SIZE));
        }
        this.f3985n = num.intValue();
        if (getArguments() != null) {
            str = getArguments().getString("searchString");
        }
        this.f3981l = str;
        this.f3989p = new C0195JU(this.f3987o, getActivity());
        Calendar instance = Calendar.getInstance();
        new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        this.f3939F = instance.get(1);
        this.f3940G = instance.get(2);
        this.f3941H = instance.get(5);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(2131558409, menu);
        MenuItem findItem = menu.findItem(2131296605);
        SearchView actionView = MenuItemCompat.getActionView(findItem);
        actionView.setSearchableInfo(((SearchManager) getActivity().getSystemService("search")).getSearchableInfo(getActivity().getComponentName()));
        actionView.setQueryHint(getString(2131755371));
        actionView.setOnQueryTextListener(new C0797gP(this));
        MenuItemCompat.setOnActionExpandListener(findItem, new C0817hP(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(2131492894, viewGroup, false);
        this.f3993r = (TextView) inflate.findViewById(2131296466);
        this.f3995s = (ImageView) inflate.findViewById(2131296495);
        this.f3997t = (ImageView) inflate.findViewById(2131296497);
        this.f3999u = (ImageView) inflate.findViewById(2131296498);
        this.f4001v = (ImageView) inflate.findViewById(2131296503);
        this.f3997t.setOnClickListener(this.f3948O);
        this.f3999u.setOnClickListener(this.f3948O);
        this.f4001v.setOnClickListener(this.f3948O);
        this.f4003w = (TextView) inflate.findViewById(2131296679);
        this.f4004x = (TextView) inflate.findViewById(2131296675);
        this.f4005y = (TextView) inflate.findViewById(2131296682);
        this.f4006z = (TextView) inflate.findViewById(2131296676);
        this.f4003w.setOnClickListener(this);
        this.f4004x.setOnClickListener(this);
        this.f4005y.setOnClickListener(this);
        this.f4006z.setOnClickListener(this);
        this.f3995s.setOnClickListener(this);
        this.f4003w.setTextColor(-1);
        this.f4004x.setTextColor(-1);
        this.f4005y.setTextColor(-1);
        this.f4006z.setTextColor(-1);
        this.f3947N = (LinearLayout) inflate.findViewById(2131296413);
        this.f3936C = (ListView) inflate.findViewById(16908298);
        TextView textView = (TextView) inflate.findViewById(16908292);
        textView.setOnClickListener(this.f3948O);
        this.f3936C.setEmptyView(textView);
        this.f3935B = new C0302OM(getActivity(), 2131492929, this.f3979k);
        this.f3936C.setAdapter(this.f3935B);
        this.f3935B.notifyDataSetChanged();
        FragmentStatePagerSupport.f2415a = this.f3935B;
        mo5326n();
        setHasOptionsMenu(true);
        this.f3936C.setChoiceMode(3);
        this.f3936C.setMultiChoiceModeListener(new C0350QO(this));
        this.f3936C.setOnItemClickListener(new C0646cP(this));
        mo5326n();
        return inflate;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131296268) {
            mo5339r();
            return true;
        }
        if (itemId == 2131296272) {
            mo5302c();
        } else if (itemId == 2131296271) {
            mo5307d();
            mo5315h(this.f3979k);
            this.f3935B.notifyDataSetChanged();
            this.f3938E = 1;
            C0195JU ju = this.f3989p;
            ju.mo507a(this.f3936C, ju.mo465K(this.f3963c), mo5288a(this.f3935B.f863d), this.f3956W, this.f3957X);
            C0195JU ju2 = this.f3989p;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f3989p.mo465K(this.f3963c));
            sb.append(".pdf");
            ju2.mo462I(sb.toString());
            return true;
        } else if (itemId == 2131296269) {
            mo5338q();
            return true;
        } else if (itemId == 2131296270) {
            Builder builder = new Builder(getActivity());
            builder.setMessage(getString(2131755066));
            builder.setPositiveButton(getString(2131755137), new C0838iP(this));
            builder.setNegativeButton(getString(2131755136), new C0858jP(this));
            builder.create().show();
            new Handler().postDelayed(new C0878kP(this), 1000);
            return true;
        } else if (itemId == 16908332) {
            getActivity().finish();
            return true;
        }
        return C1134wP.super.onOptionsItemSelected(menuItem);
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (i != 112) {
            return;
        }
        if (iArr.length != 1 || iArr[0] != 0) {
            mo5291a(getString(2131755273));
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C1134wP.super.onViewCreated(view, bundle);
    }

    /* renamed from: p */
    public void mo5337p() {
        Cursor C = this.f3989p.mo451C(this.f3960aa.getText().toString());
        this.f3998ta = new String[C.getCount()];
        if (C.moveToFirst()) {
            int i = 0;
            do {
                this.f3998ta[i] = C.getString(C.getColumnIndex("remarks"));
                i++;
            } while (C.moveToNext());
        }
        C.close();
        this.f3996sa = new ArrayAdapter<>(getActivity(), 17367050, this.f3998ta);
    }

    /* renamed from: q */
    public void mo5338q() {
        String str = this.f3965d;
        if (this.f3967e.length() < 3) {
            mo5292a(this.f3961b, this.f3963c, this.f3967e, "");
            return;
        }
        C0195JU ju = this.f3989p;
        String str2 = this.f3967e;
        StringBuilder sb = new StringBuilder();
        sb.append(getString(2131755382));
        sb.append(str);
        ju.mo634y(str2, sb.toString());
    }

    /* renamed from: r */
    public void mo5339r() {
        Dialog dialog = new Dialog(getActivity());
        LinearLayout linearLayout = new LinearLayout(getActivity());
        this.f3942I = getActivity().getResources().getStringArray(2130903058);
        this.f3943J = getActivity().getResources().obtainTypedArray(2130903045);
        ListView listView = new ListView(getActivity());
        this.f3944K = new ArrayList();
        int i = 0;
        while (true) {
            String[] strArr = this.f3942I;
            if (i < strArr.length) {
                this.f3944K.add(new C0796gO(strArr[i], this.f3943J.getResourceId(i, -1)));
                i++;
            } else {
                this.f3943J.recycle();
                this.f3945L = new C0063DH(getActivity(), this.f3944K);
                listView.setAdapter(this.f3945L);
                listView.setOnItemClickListener(new C0211KO(this, dialog));
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

    public void setUserVisibleHint(boolean z) {
        C1134wP.super.setUserVisibleHint(z);
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("=");
            sb.append(this.f3983m);
            Log.d("onCreateVisible", sb.toString());
            FragmentStatePagerSupport.f2422h = this.f3963c;
            FragmentStatePagerSupport.f2421g = this.f3967e;
            FragmentStatePagerSupport.f2420f = this.f3965d;
            FragmentStatePagerSupport.f2416b = this.f3961b;
        }
    }

    public void sort_amount_click(View view) {
        int i;
        if (this.f3938E == 0) {
            mo5314g(this.f3979k);
            this.f3935B.notifyDataSetChanged();
            i = 1;
        } else {
            mo5311f(this.f3979k);
            this.f3935B.notifyDataSetChanged();
            i = 0;
        }
        this.f3938E = i;
    }

    public void sort_net_bal_click(View view) {
        int i;
        if (this.f3938E == 0) {
            mo5319i(this.f3979k);
            this.f3935B.notifyDataSetChanged();
            i = 1;
        } else {
            mo5304c(this.f3979k);
            this.f3935B.notifyDataSetChanged();
            i = 0;
        }
        this.f3938E = i;
    }

    public void sort_remarks_click(View view) {
        int i;
        if (this.f3938E == 0) {
            mo5321j(this.f3979k);
            this.f3935B.notifyDataSetChanged();
            i = 1;
        } else {
            mo5308d(this.f3979k);
            this.f3935B.notifyDataSetChanged();
            i = 0;
        }
        this.f3938E = i;
    }

    public void sort_tr_type_click(View view) {
        int i;
        if (this.f3938E == 0) {
            mo5323k(this.f3979k);
            this.f3935B.notifyDataSetChanged();
            i = 1;
        } else {
            mo5309e(this.f3979k);
            this.f3935B.notifyDataSetChanged();
            i = 0;
        }
        this.f3938E = i;
    }
}
