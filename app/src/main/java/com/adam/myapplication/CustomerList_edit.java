package com.adam.myapplication;


import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class CustomerList_edit extends AppCompatActivity {

    /* renamed from: a */
    public SQLiteDatabase f2131a;

    /* renamed from: b */
    public AutoCompleteTextView f2132b = null;

    /* renamed from: c */
    public EditText f2133c = null;

    /* renamed from: d */
    public EditText f2134d = null;

    /* renamed from: e */
    public Button f2135e = null;

    /* renamed from: f */
    public ImageButton f2136f = null;

    /* renamed from: g */
    public int f2137g = 0;

    /* renamed from: h */
    public C0195JU f2138h;

    /* renamed from: i */
    public ListView f2139i = null;

    /* renamed from: j */
    public C0388SM f2140j;

    /* renamed from: k */
    public List<C0082EH> f2141k = new ArrayList();

    /* renamed from: l */
    public SparseBooleanArray f2142l;

    /* renamed from: m */
    public ImageButton f2143m = null;

    /* renamed from: n */
    public String[] f2144n = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    /* JADX WARNING: type inference failed for: r10v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.CustomerList_edit] */
    /* renamed from: a */
    public void mo3437a(Cursor cursor) {
        cursor.getCount();
        this.f2141k.clear();
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            List<C0082EH> list = this.f2141k;
            C0082EH eh = new C0082EH(cursor.getString(cursor.getColumnIndex("ID")), cursor.getString(cursor.getColumnIndex("_id")), cursor.getString(cursor.getColumnIndex("gsm")), 0.0d, 0, 0);
            list.add(eh);
            cursor.moveToNext();
        }
        cursor.close();
        this.f2140j = new C0388SM(this, 2131492938, this.f2141k);
        this.f2140j.f1138i.clear();
        this.f2139i.setAdapter(this.f2140j);
    }

    /* renamed from: a */
    public final boolean mo3438a() {
        boolean a = C0008AO.m5a(this.f2133c);
        if (!C0008AO.m7a(this.f2134d, true)) {
            return false;
        }
        return a;
    }

    /* renamed from: b */
    public void mo3439b() {
        Log.d("getSelectedIds_CNT=", String.valueOf(this.f2142l.size()));
        for (int size = this.f2142l.size() - 1; size >= 0; size--) {
            if (this.f2142l.valueAt(size)) {
                C0082EH item = this.f2140j.getItem(this.f2142l.keyAt(size));
                this.f2140j.remove(item);
                this.f2138h.mo515a(item.mo191f());
            }
        }
        mo3443d();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.CustomerList_edit, android.app.Activity] */
    public void btn_cus_remove(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) ((View) view.getParent()).getParent();
        TextView textView = (TextView) relativeLayout.findViewById(2131296385);
        TextView textView2 = (TextView) relativeLayout.findViewById(2131296394);
        Builder builder = new Builder(this);
        StringBuilder sb = new StringBuilder();
        sb.append(textView2.getText().toString());
        sb.append("#");
        sb.append(getString(2131755166));
        builder.setMessage(sb.toString());
        this.f2137g = Integer.parseInt(textView.getText().toString());
        builder.setPositiveButton(getString(2131755137), new C1127wI(this));
        builder.setNegativeButton(getString(2131755136), new C1153xI(this));
        builder.create().show();
        this.f2133c.requestFocus();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.CustomerList_edit, android.app.Activity] */
    public void btn_cus_save(View view) {
        if (mo3438a()) {
            try {
                if (this.f2135e.getText().equals(getString(2131755103))) {
                    C0195JU ju = this.f2138h;
                    StringBuilder sb = new StringBuilder();
                    sb.append("insert into customers (name,gsm) values('");
                    sb.append(this.f2133c.getText());
                    sb.append("','");
                    sb.append(this.f2134d.getText());
                    sb.append("')");
                    ju.mo562d(sb.toString());
                    if (getIntent().getStringExtra("CUS_NAME") != null) {
                        finish();
                    }
                    this.f2133c.setText(null);
                    this.f2134d.setText(null);
                } else {
                    if (this.f2135e.getText().equals(getString(2131755108)) && this.f2137g != 0) {
                        C0195JU ju2 = this.f2138h;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("update customers set name='");
                        sb2.append(this.f2133c.getText());
                        sb2.append("',gsm='");
                        sb2.append(this.f2134d.getText());
                        sb2.append("' where id='");
                        sb2.append(this.f2137g);
                        sb2.append("'");
                        ju2.mo562d(sb2.toString());
                        this.f2133c.setText(null);
                        this.f2134d.setText(null);
                        this.f2135e.setText(getString(2131755103));
                        this.f2137g = 0;
                    }
                    mo3443d();
                }
                this.f2133c.requestFocus();
                mo3443d();
            } catch (Exception unused) {
                Toast.makeText(getApplicationContext(), getString(2131755389), 1);
            }
        } else {
            Toast.makeText(this, getString(2131755421), 1).show();
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.valdio.valdioveliu.recyclerview.CustomerList_edit, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    /* renamed from: c */
    public void mo3442c() {
        int size = this.f2142l.size() - 1;
        if (this.f2142l.valueAt(size)) {
            this.f2140j.getItem(this.f2142l.keyAt(size));
            this.f2137g = Integer.parseInt(((TextView) findViewById(2131296385)).getText().toString());
            this.f2133c.setText(((TextView) findViewById(2131296394)).getText().toString());
            this.f2134d.setText(((TextView) findViewById(2131296389)).getText().toString());
            this.f2135e.setText(getString(2131755108));
        }
    }

    /* renamed from: d */
    public void mo3443d() {
        mo3437a(this.f2138h.mo453D());
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.CustomerList_edit, android.app.Activity] */
    public void onBackPressed() {
        Intent intent = new Intent(this, CustomerList.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.CustomerList_edit, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    public void onCreate(Bundle bundle) {
        String str = "CUS_NAME";
        CustomerList_edit.super.onCreate(bundle);
        setContentView(2131492914);
        Toolbar findViewById = findViewById(2131296669);
        setTitle(getString(2131755062));
        this.f2139i = (ListView) findViewById(2131296531);
        this.f2138h = new C0195JU(this.f2131a, this);
        this.f2133c = (EditText) findViewById(2131296429);
        this.f2134d = (EditText) findViewById(2131296412);
        this.f2135e = (Button) findViewById(2131296351);
        this.f2136f = (ImageButton) findViewById(2131296586);
        try {
            if (getIntent().getStringExtra(str) != null) {
                this.f2133c.setText(getIntent().getStringExtra(str));
                this.f2134d.setText("0");
                this.f2134d.requestFocus();
            }
        } catch (Exception unused) {
        }
        mo3443d();
        this.f2139i.setChoiceMode(3);
        this.f2139i.setMultiChoiceModeListener(new C1106vI(this));
    }

    public void onDestroy() {
        CustomerList_edit.super.onDestroy();
    }

    public void onResume() {
        CustomerList_edit.super.onResume();
    }

    public void save_btn(View view) {
    }
}
