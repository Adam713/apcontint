package com.adam.myapplication;



import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Report3_customer_date extends AppCompatActivity {

    /* renamed from: a */
    public SQLiteDatabase f2642a;

    /* renamed from: b */
    public C0195JU f2643b;

    /* renamed from: c */
    public int f2644c = 0;

    /* renamed from: d */
    public int f2645d;

    /* renamed from: e */
    public int f2646e;

    /* renamed from: f */
    public int f2647f;

    /* renamed from: g */
    public int f2648g = 0;

    /* renamed from: h */
    public AutoCompleteTextView f2649h = null;

    /* renamed from: i */
    public TextView f2650i = null;

    /* renamed from: j */
    public EditText f2651j = null;

    /* renamed from: k */
    public Button f2652k = null;

    /* renamed from: l */
    public ListView f2653l = null;

    /* renamed from: m */
    public ImageButton f2654m = null;

    /* renamed from: n */
    public String[] f2655n = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    /* renamed from: o */
    public int[] f2656o = {2131230923, 1, 2131230855};

    /* renamed from: p */
    public OnDateSetListener f2657p = new C0734dO(this);

    /* renamed from: a */
    public void mo4048a() {
        mo4049a(this.f2643b.mo475Q(this.f2650i.getText().toString()));
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4049a(android.database.Cursor r10) {
        /*
            r9 = this;
            int r0 = r10.getCount()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Cursor_CNT="
            android.util.Log.d(r1, r0)
            android.widget.SimpleCursorAdapter r0 = new android.widget.SimpleCursorAdapter
            r1 = 5
            java.lang.String[] r6 = new java.lang.String[r1]
            r8 = 0
            java.lang.String r2 = "_id"
            r6[r8] = r2
            r2 = 1
            java.lang.String r3 = "amount"
            r6[r2] = r3
            r2 = 2
            java.lang.String r3 = "_in"
            r6[r2] = r3
            r2 = 3
            java.lang.String r3 = "remarks"
            r6[r2] = r3
            r2 = 4
            java.lang.String r3 = "date_"
            r6[r2] = r3
            int[] r7 = new int[r1]
            r7 = {2131296394, 2131296317, 2131296495, 2131296682, 2131296679} // fill-array
            r4 = 2131493011(0x7f0c0093, float:1.860949E38)
            r2 = r0
            r3 = r9
            r5 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r9.f2644c = r8
            cO r10 = new cO
            r10.<init>(r9)
            r0.setViewBinder(r10)
            android.widget.ListView r10 = r9.f2653l
            r10.setAdapter(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.Report3_customer_date.mo4049a(android.database.Cursor):void");
    }

    public void btn_date_search(View view) {
        mo4049a(this.f2643b.mo475Q(this.f2650i.getText().toString()));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Report3_customer_date, android.app.Activity] */
    public void onBackPressed() {
        Intent intent = new Intent(this, CustomerList.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Report3_customer_date, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    public void onCreate(Bundle bundle) {
        Report3_customer_date.super.onCreate(bundle);
        setContentView(2131492917);
        setTitle(getString(2131755061));
        this.f2653l = (ListView) findViewById(2131296528);
        this.f2652k = (Button) findViewById(2131296354);
        this.f2650i = (TextView) findViewById(2131296433);
        this.f2653l.setEmptyView((TextView) findViewById(2131296440));
        this.f2643b = new C0195JU(this.f2642a, this);
        Calendar instance = Calendar.getInstance();
        this.f2650i.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).format(instance.getTime()));
        this.f2645d = instance.get(1);
        this.f2646e = instance.get(2);
        this.f2647f = instance.get(5);
        this.f2650i.setOnClickListener(new C0626bO(this));
        mo4048a();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog onCreateDialog(int r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x0004
            r7 = 0
            return r7
        L_0x0004:
            android.app.DatePickerDialog r7 = new android.app.DatePickerDialog
            android.app.DatePickerDialog$OnDateSetListener r2 = r6.f2657p
            int r3 = r6.f2645d
            int r4 = r6.f2646e
            int r5 = r6.f2647f
            r0 = r7
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.Report3_customer_date.onCreateDialog(int):android.app.Dialog");
    }

    public void onDestroy() {
        Report3_customer_date.super.onDestroy();
    }

    public void onResume() {
        Report3_customer_date.super.onResume();
    }
}
