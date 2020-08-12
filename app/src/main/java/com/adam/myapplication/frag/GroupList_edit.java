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
import com.itextpdf.tool.xml.html.HTML.Attribute;
import com.adam.myapplication.FragmentStatePagerSupport_Main;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class GroupList_edit extends AppCompatActivity {
    public String TAG = GroupList_edit.class.getSimpleName();

    /* renamed from: a */
    public SQLiteDatabase f2754a;

    /* renamed from: b */
    public C0195JU f2755b;

    /* renamed from: c */
    public double f2756c = 0.0d;

    /* renamed from: d */
    public int f2757d = 0;

    /* renamed from: e */
    public int f2758e = 0;

    /* renamed from: f */
    public AutoCompleteTextView f2759f = null;

    /* renamed from: g */
    public EditText f2760g = null;

    /* renamed from: h */
    public EditText f2761h = null;

    /* renamed from: i */
    public TextView f2762i = null;

    /* renamed from: j */
    public ImageView f2763j = null;

    /* renamed from: k */
    public TextView f2764k = null;

    /* renamed from: l */
    public TextView f2765l = null;

    /* renamed from: m */
    public TextView f2766m = null;

    /* renamed from: n */
    public TextView f2767n = null;

    /* renamed from: o */
    public Button f2768o = null;

    /* renamed from: p */
    public ListView f2769p = null;

    /* renamed from: q */
    public LinearLayout f2770q = null;

    /* renamed from: r */
    public C0388SM f2771r;

    /* renamed from: s */
    public ArrayList<C0082EH> f2772s = new ArrayList<>();

    /* renamed from: t */
    public SparseBooleanArray f2773t;

    /* renamed from: u */
    public ImageButton f2774u = null;

    /* renamed from: v */
    public String[] f2775v = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    /* renamed from: w */
    public int[] f2776w = {2131230923, 1, 2131230855};

    /* renamed from: x */
    public Toolbar f2777x = null;

    /* renamed from: a */
    public void mo4207a() {
        for (int size = this.f2773t.size() - 1; size >= 0; size--) {
            if (this.f2773t.valueAt(size)) {
                C0082EH item = this.f2771r.getItem(this.f2773t.keyAt(size));
                this.f2771r.remove(item);
                C0195JU ju = this.f2755b;
                StringBuilder sb = new StringBuilder();
                sb.append("delete from groups where id=");
                sb.append(item.mo191f());
                sb.append(" and id<>0");
                ju.mo562d(sb.toString());
                C0195JU ju2 = this.f2755b;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("update customers set g_id=0 where g_id=");
                sb2.append(item.mo191f());
                ju2.mo562d(sb2.toString());
            }
        }
        FragmentStatePagerSupport_Main.f2451d = true;
        mo4212d();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.content.Context, android.app.Activity, com.valdio.valdioveliu.recyclerview.frag.GroupList_edit] */
    /* renamed from: a */
    public void mo4208a(String str) {
        try {
            Builder builder = new Builder(this);
            View inflate = getLayoutInflater().inflate(2131492955, null);
            builder.setView(inflate);
            EditText editText = (EditText) inflate.findViewById(2131296389);
            ImageView imageView = (ImageView) inflate.findViewById(2131296498);
            ((EditText) inflate.findViewById(2131296387)).setVisibility(8);
            editText.setVisibility(8);
            imageView.setVisibility(8);
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) inflate.findViewById(2131296384);
            new ArrayAdapter(this, 17367049, this.f2755b.mo457G());
            autoCompleteTextView.setText(str);
            autoCompleteTextView.setOnItemClickListener(new C0464VT(this, autoCompleteTextView));
            autoCompleteTextView.setOnTouchListener(new C0485WT(this, autoCompleteTextView));
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.selectAll();
            builder.setPositiveButton(getString(2131755359), new C0506XT(this));
            builder.setNegativeButton(getString(2131755358), new C0287NT(this));
            AlertDialog create = builder.create();
            create.setTitle(getString(2131755110));
            create.getWindow().setSoftInputMode(4);
            create.show();
            create.getButton(-1).setOnClickListener(new C0311OT(this, autoCompleteTextView, str, create));
        } catch (Exception unused) {
        }
    }

    public void amount_add_btn(View view) {
        mo4213e();
    }

    /* renamed from: b */
    public void mo4210b() {
        int size = this.f2773t.size() - 1;
        if (this.f2773t.valueAt(size)) {
            mo4208a(this.f2771r.getItem(this.f2773t.keyAt(size)).mo192g());
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.frag.GroupList_edit] */
    /* renamed from: c */
    public void mo4211c() {
        this.f2771r = new C0388SM(this, 2131492978, this.f2772s);
        this.f2771r.f1138i.clear();
        this.f2771r.notifyDataSetChanged();
        this.f2769p.setAdapter(this.f2771r);
    }

    /* renamed from: d */
    public void mo4212d() {
        Cursor H = this.f2755b.mo459H();
        H.getCount();
        this.f2756c = 0.0d;
        this.f2772s.clear();
        H.moveToFirst();
        while (!H.isAfterLast()) {
            ArrayList<C0082EH> arrayList = this.f2772s;
            C0082EH eh = new C0082EH(H.getString(H.getColumnIndex("_id")), H.getString(H.getColumnIndex(Attribute.NAME)), H.getString(H.getColumnIndex("cnt")), 0.0d, 0, 0);
            arrayList.add(eh);
            H.moveToNext();
        }
        H.close();
        mo4211c();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.content.Context, android.app.Activity, com.valdio.valdioveliu.recyclerview.frag.GroupList_edit] */
    /* renamed from: e */
    public void mo4213e() {
        try {
            Builder builder = new Builder(this);
            View inflate = getLayoutInflater().inflate(2131492955, null);
            builder.setView(inflate);
            EditText editText = (EditText) inflate.findViewById(2131296389);
            ImageView imageView = (ImageView) inflate.findViewById(2131296498);
            ((EditText) inflate.findViewById(2131296387)).setVisibility(8);
            editText.setVisibility(8);
            imageView.setVisibility(8);
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) inflate.findViewById(2131296384);
            new ArrayAdapter(this, 17367049, this.f2755b.mo457G());
            autoCompleteTextView.setOnItemClickListener(new C0355QT(this, autoCompleteTextView));
            autoCompleteTextView.setOnTouchListener(new C0375RT(this, autoCompleteTextView));
            autoCompleteTextView.requestFocus();
            builder.setPositiveButton(getString(2131755359), new C0397ST(this));
            builder.setNegativeButton(getString(2131755358), new C0417TT(this));
            AlertDialog create = builder.create();
            create.setTitle(getString(2131755080));
            create.show();
            create.getButton(-1).setOnClickListener(new C0443UT(this, autoCompleteTextView, create));
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    public final void mo4214f() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    public void no_result_btn(View view) {
        mo4212d();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.frag.GroupList_edit, android.support.v7.app.AppCompatActivity] */
    public void onCreate(Bundle bundle) {
        GroupList_edit.super.onCreate(bundle);
        setContentView(2131492979);
        mo4214f();
        try {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(this);
            Field declaredField = ViewConfiguration.class.getDeclaredField("sHasPermanentMenuKey");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                declaredField.setBoolean(viewConfiguration, false);
            }
        } catch (Exception unused) {
        }
        this.f2769p = (ListView) findViewById(2131296532);
        this.f2769p.setEmptyView((TextView) findViewById(2131296440));
        this.f2769p.setChoiceMode(2);
        this.f2755b = new C0195JU(this.f2754a, this);
        mo4212d();
        this.f2769p.setChoiceMode(3);
        this.f2769p.setMultiChoiceModeListener(new C0333PT(this));
    }

    public void onDestroy() {
        GroupList_edit.super.onDestroy();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.app.Activity, com.valdio.valdioveliu.recyclerview.frag.GroupList_edit] */
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return GroupList_edit.super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.app.Activity, com.valdio.valdioveliu.recyclerview.frag.GroupList_edit] */
    public void onRestart() {
        GroupList_edit.super.onRestart();
        mo4212d();
    }

    public void onResume() {
        GroupList_edit.super.onResume();
    }
}
