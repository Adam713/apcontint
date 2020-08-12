package com.adam.myapplication.frag;


import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.itextpdf.tool.xml.html.HTML.Attribute;
import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class CurrList_edit extends AppCompatActivity {
    public String TAG = CurrList_edit.class.getSimpleName();

    /* renamed from: a */
    public SQLiteDatabase f2688a;

    /* renamed from: b */
    public C0195JU f2689b;

    /* renamed from: c */
    public double f2690c = 0.0d;

    /* renamed from: d */
    public int f2691d = 0;

    /* renamed from: e */
    public int f2692e = 0;

    /* renamed from: f */
    public AutoCompleteTextView f2693f = null;

    /* renamed from: g */
    public EditText f2694g = null;

    /* renamed from: h */
    public EditText f2695h = null;

    /* renamed from: i */
    public TextView f2696i = null;

    /* renamed from: j */
    public ImageView f2697j = null;

    /* renamed from: k */
    public TextView f2698k = null;

    /* renamed from: l */
    public TextView f2699l = null;

    /* renamed from: m */
    public TextView f2700m = null;

    /* renamed from: n */
    public TextView f2701n = null;

    /* renamed from: o */
    public Button f2702o = null;

    /* renamed from: p */
    public ListView f2703p = null;

    /* renamed from: q */
    public LinearLayout f2704q = null;

    /* renamed from: r */
    public C0388SM f2705r;

    /* renamed from: s */
    public ArrayList<C0082EH> f2706s = new ArrayList<>();

    /* renamed from: t */
    public SparseBooleanArray f2707t;

    /* renamed from: u */
    public ImageButton f2708u = null;

    /* renamed from: v */
    public String[] f2709v = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    /* renamed from: w */
    public int[] f2710w = {2131230923, 1, 2131230855};

    /* renamed from: x */
    public Toolbar f2711x = null;

    /* renamed from: a */
    public void mo4140a() {
        for (int size = this.f2707t.size() - 1; size >= 0; size--) {
            if (this.f2707t.valueAt(size)) {
                C0082EH item = this.f2705r.getItem(this.f2707t.keyAt(size));
                this.f2705r.remove(item);
                C0195JU ju = this.f2689b;
                StringBuilder sb = new StringBuilder();
                sb.append("delete from currency where id=");
                sb.append(item.mo191f());
                sb.append(" and id<>0 and id not in (select curr_id from transactions) ");
                ju.mo562d(sb.toString());
            }
        }
        FragmentStatePagerSupport_Main.f2451d = true;
        mo4145d();
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.frag.CurrList_edit, android.app.Activity] */
    /* renamed from: a */
    public void mo4141a(String str) {
        try {
            Builder builder = new Builder(this);
            View inflate = getLayoutInflater().inflate(2131492955, null);
            builder.setView(inflate);
            EditText editText = (EditText) inflate.findViewById(2131296389);
            ImageView imageView = (ImageView) inflate.findViewById(2131296498);
            ImageView imageView2 = (ImageView) inflate.findViewById(2131296499);
            ((EditText) inflate.findViewById(2131296387)).setVisibility(8);
            editText.setVisibility(8);
            imageView.setVisibility(8);
            imageView2.setVisibility(4);
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) inflate.findViewById(2131296384);
            autoCompleteTextView.setHint(getString(2131755410));
            new ArrayAdapter(this, 17367049, this.f2689b.mo616s());
            autoCompleteTextView.setText(str);
            autoCompleteTextView.setOnItemClickListener(new C1055sR(this, autoCompleteTextView));
            autoCompleteTextView.setOnTouchListener(new C0840iR(this, autoCompleteTextView));
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.selectAll();
            builder.setPositiveButton(getString(2131755359), new C0860jR(this));
            builder.setNegativeButton(getString(2131755358), new C0880kR(this));
            AlertDialog create = builder.create();
            create.setTitle(getString(2131755111));
            create.getWindow().setSoftInputMode(4);
            create.show();
            create.getButton(-1).setOnClickListener(new C0905lR(this, autoCompleteTextView, str, create));
        } catch (Exception unused) {
        }
    }

    public void amount_add_btn(View view) {
        mo4146e();
    }

    /* renamed from: b */
    public void mo4143b() {
        int size = this.f2707t.size() - 1;
        if (this.f2707t.valueAt(size)) {
            mo4141a(this.f2705r.getItem(this.f2707t.keyAt(size)).mo192g());
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.frag.CurrList_edit] */
    /* renamed from: c */
    public void mo4144c() {
        this.f2705r = new C0388SM(this, 2131492978, this.f2706s);
        this.f2705r.f1138i.clear();
        this.f2705r.notifyDataSetChanged();
        this.f2703p.setAdapter(this.f2705r);
    }

    /* renamed from: d */
    public void mo4145d() {
        Cursor o = this.f2689b.mo603o();
        o.getCount();
        this.f2690c = 0.0d;
        this.f2706s.clear();
        o.moveToFirst();
        while (!o.isAfterLast()) {
            ArrayList<C0082EH> arrayList = this.f2706s;
            C0082EH eh = new C0082EH(o.getString(o.getColumnIndex("_id")), o.getString(o.getColumnIndex(Attribute.NAME)), o.getString(o.getColumnIndex("cnt")), 0.0d, 0, 0);
            arrayList.add(eh);
            o.moveToNext();
        }
        o.close();
        mo4144c();
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.frag.CurrList_edit, android.app.Activity] */
    /* renamed from: e */
    public void mo4146e() {
        try {
            Builder builder = new Builder(this);
            View inflate = getLayoutInflater().inflate(2131492955, null);
            builder.setView(inflate);
            EditText editText = (EditText) inflate.findViewById(2131296389);
            ImageView imageView = (ImageView) inflate.findViewById(2131296498);
            ImageView imageView2 = (ImageView) inflate.findViewById(2131296499);
            ((EditText) inflate.findViewById(2131296387)).setVisibility(8);
            editText.setVisibility(8);
            imageView.setVisibility(8);
            imageView2.setVisibility(4);
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) inflate.findViewById(2131296384);
            autoCompleteTextView.setHint(getString(2131755410));
            new ArrayAdapter(this, 17367049, this.f2689b.mo616s());
            autoCompleteTextView.setOnItemClickListener(new C0946nR(this, autoCompleteTextView));
            autoCompleteTextView.setOnTouchListener(new C0965oR(this, autoCompleteTextView));
            autoCompleteTextView.requestFocus();
            builder.setPositiveButton(getString(2131755359), new C0994pR(this));
            builder.setNegativeButton(getString(2131755358), new C1013qR(this));
            AlertDialog create = builder.create();
            create.setTitle(getString(2131755079));
            create.show();
            create.getButton(-1).setOnClickListener(new C1035rR(this, autoCompleteTextView, create));
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    public final void mo4147f() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    public void no_result_btn(View view) {
        mo4145d();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.frag.CurrList_edit, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    public void onCreate(Bundle bundle) {
        CurrList_edit.super.onCreate(bundle);
        setContentView(2131492979);
        mo4147f();
        try {
            ((TextView) findViewById(2131296475)).setText(getString(2131755410));
            ViewConfiguration viewConfiguration = ViewConfiguration.get(this);
            Field declaredField = ViewConfiguration.class.getDeclaredField("sHasPermanentMenuKey");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                declaredField.setBoolean(viewConfiguration, false);
            }
        } catch (Exception unused) {
        }
        this.f2703p = (ListView) findViewById(2131296532);
        this.f2703p.setEmptyView((TextView) findViewById(2131296440));
        this.f2703p.setChoiceMode(2);
        this.f2689b = new C0195JU(this.f2688a, this);
        mo4145d();
        if (!C0195JU.f451k) {
            Toast.makeText(this, getString(2131755147), 1).show();
        }
        this.f2703p.setChoiceMode(3);
        this.f2703p.setMultiChoiceModeListener(new C0924mR(this));
    }

    public void onDestroy() {
        CurrList_edit.super.onDestroy();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.frag.CurrList_edit, android.app.Activity] */
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return CurrList_edit.super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.valdio.valdioveliu.recyclerview.frag.CurrList_edit, android.app.Activity] */
    public void onRestart() {
        CurrList_edit.super.onRestart();
        mo4145d();
    }

    public void onResume() {
        CurrList_edit.super.onResume();
    }
}
