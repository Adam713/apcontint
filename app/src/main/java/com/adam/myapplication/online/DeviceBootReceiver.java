package com.adam.myapplication.online;



import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;

public class DeviceBootReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public SQLiteDatabase f2809a;

    /* renamed from: b */
    public C0195JU f2810b;

    /* renamed from: c */
    public Context f2811c;

    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED")) {
            this.f2810b = new C0195JU(this.f2809a, context);
            this.f2811c = context;
            try {
                this.f2810b.mo573f(this.f2811c);
            } catch (Exception unused) {
            }
        }
    }
}
