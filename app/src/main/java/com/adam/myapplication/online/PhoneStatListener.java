package com.adam.myapplication.online;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build.VERSION;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.util.Log;
import com.adam.myapplication.FragmentStatePagerSupport_Main;

public class PhoneStatListener extends BroadcastReceiver {

    /* renamed from: a */
    public SQLiteDatabase f2812a;

    /* renamed from: b */
    public C0195JU f2813b;

    /* renamed from: c */
    public Context f2814c;

    /* renamed from: d */
    public String f2815d = "";

    /* renamed from: e */
    public int f2816e = 0;

    public void onReceive(Context context, Intent intent) {
        String str = "0";
        String str2 = "bk_drive_flag";
        try {
            int b = C0465VU.m1287b(context);
            this.f2813b = new C0195JU(this.f2812a, context);
            this.f2814c = context;
            StringBuilder sb = new StringBuilder();
            sb.append("status(");
            sb.append(b);
            sb.append("):");
            sb.append(intent.getAction());
            Log.d("status=", sb.toString());
            if (VERSION.SDK_INT > 9) {
                StrictMode.setThreadPolicy(new Builder().permitAll().build());
            }
            if (b == 1 || b == 2) {
                this.f2813b.mo479S();
                this.f2813b.mo551c(this.f2814c);
                FragmentStatePagerSupport_Main.f2452e = this.f2813b.mo609q(str2, str);
                if (FragmentStatePagerSupport_Main.f2452e.equals(str) && this.f2813b.mo524a("prefAutoBackup", true)) {
                    new C0444UU(this.f2814c, this.f2813b).mo1297b();
                    this.f2813b.mo631x(str2, FragmentStatePagerSupport_Main.f2452e);
                }
            }
        } catch (Exception unused) {
        }
    }
}

