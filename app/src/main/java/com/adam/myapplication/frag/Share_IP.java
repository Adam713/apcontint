package com.adam.myapplication.frag;


import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Share_IP extends AppCompatActivity {

    /* renamed from: a */
    public SQLiteDatabase f2778a;

    /* renamed from: b */
    public C0195JU f2779b;

    /* renamed from: c */
    public C0486WU f2780c;

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.support.v4.app.FragmentActivity, com.valdio.valdioveliu.recyclerview.frag.Share_IP, android.app.Activity] */
    public void onBackPressed() {
        C0486WU wu = this.f2780c;
        if (wu != null) {
            wu.mo1418b();
        }
        finish();
        Share_IP.super.onBackPressed();
        setResult(0, new Intent());
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.frag.Share_IP, android.support.v7.app.AppCompatActivity] */
    public void onCreate(Bundle bundle) {
        Share_IP.super.onCreate(bundle);
        supportRequestWindowFeature(1);
        setContentView(2131492963);
        this.f2779b = new C0195JU(this.f2778a, this);
        this.f2780c = new C0486WU(8888, getResources().getAssets());
        C0195JU ju = this.f2779b;
        ju.mo586i(ju.mo595l(), C0195JU.f441a, "index.html");
        this.f2780c.mo1414a();
        TextView textView = (TextView) findViewById(2131296510);
        TextView textView2 = (TextView) findViewById(2131296511);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setText(2131755236);
        StringBuilder sb = new StringBuilder();
        sb.append("http://");
        sb.append(this.f2779b.mo463J());
        sb.append(":8888");
        textView.setText(sb.toString());
    }

    public void onPause() {
        this.f2780c.mo1418b();
        Share_IP.super.onPause();
    }

    public void onResume() {
        Share_IP.super.onResume();
        this.f2780c = new C0486WU(8888, getResources().getAssets());
        this.f2780c.mo1414a();
    }
}
