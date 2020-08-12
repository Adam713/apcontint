package com.adam.myapplication;


import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

public class Report1_customer_bal extends AppCompatActivity {

    /* renamed from: a */
    public SQLiteDatabase f2534a;

    /* renamed from: b */
    public C0195JU f2535b;

    /* renamed from: c */
    public int f2536c = 0;

    /* renamed from: d */
    public int f2537d = 0;

    /* renamed from: e */
    public AutoCompleteTextView f2538e = null;

    /* renamed from: f */
    public EditText f2539f = null;

    /* renamed from: g */
    public EditText f2540g = null;

    /* renamed from: h */
    public Button f2541h = null;

    /* renamed from: i */
    public ListView f2542i = null;

    /* renamed from: j */
    public ImageButton f2543j = null;

    /* renamed from: k */
    public String[] f2544k = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    /* renamed from: l */
    public int[] f2545l = {2131230923, 1, 2131230855};

    /* renamed from: a */
    public void mo3889a() {
        mo3890a(this.f2535b.mo485V());
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3890a(android.database.Cursor r9) {
        /*
            r8 = this;
            android.widget.SimpleCursorAdapter r6 = new android.widget.SimpleCursorAdapter
            r0 = 3
            java.lang.String[] r4 = new java.lang.String[r0]
            r7 = 0
            java.lang.String r1 = "_id"
            r4[r7] = r1
            r1 = 1
            java.lang.String r2 = "amount"
            r4[r1] = r2
            r1 = 2
            java.lang.String r2 = "_in"
            r4[r1] = r2
            int[] r5 = new int[r0]
            r5 = {2131296394, 2131296317, 2131296495} // fill-array
            r2 = 2131493005(0x7f0c008d, float:1.8609478E38)
            r0 = r6
            r1 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r9 = 2131296534(0x7f090116, float:1.8210987E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.ListView r9 = (android.widget.ListView) r9
            r8.f2542i = r9
            r8.f2536c = r7
            gN r9 = new gN
            r9.<init>(r8)
            r6.setViewBinder(r9)
            android.widget.ListView r9 = r8.f2542i
            r9.setAdapter(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.Report1_customer_bal.mo3890a(android.database.Cursor):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Report1_customer_bal, android.app.Activity] */
    public void onBackPressed() {
        Intent intent = new Intent(this, CustomerList.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Report1_customer_bal, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    public void onCreate(Bundle bundle) {
        Report1_customer_bal.super.onCreate(bundle);
        setContentView(2131493012);
        setTitle(getString(2131755059));
        this.f2542i = (ListView) findViewById(2131296534);
        this.f2535b = new C0195JU(this.f2534a, this);
        mo3889a();
    }

    public void onDestroy() {
        Report1_customer_bal.super.onDestroy();
    }

    public void onResume() {
        Report1_customer_bal.super.onResume();
    }
}
