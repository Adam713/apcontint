package com.adam.myapplication.threads;


import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.widget.Toast;
import com.adam.myapplication.FragmentStatePagerSupport_Main;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class HelloService extends Service {

    /* renamed from: a */
    public Looper f2820a;

    /* renamed from: b */
    public C0725a f2821b;

    /* renamed from: c */
    public Context f2822c;

    /* renamed from: d */
    public SQLiteDatabase f2823d;

    /* renamed from: e */
    public C0195JU f2824e;

    /* renamed from: f */
    public int[] f2825f = {2131230923, 1, 2131230855};

    /* renamed from: g */
    public int f2826g = 0;

    /* renamed from: com.valdio.valdioveliu.recyclerview.threads.HelloService$a */
    private final class C0725a extends Handler {
        public C0725a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            String str = ".db";
            String str2 = "db_data_changed";
            String str3 = "prefAutoBackup";
            String str4 = "prefBackup_path";
            String str5 = "bk_drive_flag";
            String str6 = "0";
            try {
                HelloService.this.f2824e.mo481T();
                HelloService.this.f2824e.mo572f();
                HelloService.this.f2824e.mo560d();
                HelloService.this.f2824e.mo568e();
                if (C0195JU.f451k) {
                    HelloService.this.mo4247a(HelloService.this.f2824e.mo618t());
                }
                if (HelloService.this.mo4248a(HelloService.this.f2824e.mo609q(str4, C0195JU.f441a))) {
                    HelloService.this.f2824e.mo525aa();
                } else {
                    HelloService.this.f2824e.mo631x(str4, C0195JU.f441a);
                }
                if (HelloService.this.f2824e.mo524a(str3, true) && !HelloService.this.f2824e.mo609q(str2, str6).equals(str6)) {
                    String format = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).format(Calendar.getInstance().getTime());
                    if (HelloService.this.f2824e.mo476Q()) {
                        HelloService.this.f2824e.mo525aa();
                        StringBuilder sb = new StringBuilder();
                        sb.append(format);
                        sb.append(str);
                        C0268MU.m849a(HelloService.this.f2822c, C0195JU.f441a, "market.db", sb.toString(), "com.valdio.valdioveliu.recyclerview");
                        HelloService.this.f2824e.mo631x(str2, str6);
                        HelloService.this.f2824e.mo631x(str5, str6);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(format);
                        sb2.append(str);
                        HelloService.this.f2824e.mo631x("auto_filename", sb2.toString());
                        HelloService.this.f2824e.mo631x("auto_drive_date_request", format);
                        FragmentStatePagerSupport_Main.f2452e = HelloService.this.f2824e.mo609q(str5, str6);
                        if (FragmentStatePagerSupport_Main.f2452e.equals(str6) && HelloService.this.f2824e.mo524a(str3, true)) {
                            new C0444UU(HelloService.this.f2822c, HelloService.this.f2824e).mo1297b();
                            HelloService.this.f2824e.mo631x(str5, FragmentStatePagerSupport_Main.f2452e);
                        }
                        HelloService.this.f2824e.mo543b("hello_serv", true);
                        HelloService.this.stopSelf(message.arg1);
                    }
                }
            } catch (Exception unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: a */
    public void mo4247a(Cursor cursor) {
        Log.d("trace_S_read_Curr=", FragmentStatePagerSupport_Main.m2279h());
        cursor.getCount();
        C0195JU.f455o.clear();
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            C0195JU.f455o.add(new C0260MM(cursor.getString(cursor.getColumnIndex("_id")), cursor.getString(cursor.getColumnIndex("g_name")), cursor.getString(cursor.getColumnIndex("curr_name"))));
            cursor.moveToNext();
        }
        cursor.close();
        Log.d("trace_E_read_Curr=", FragmentStatePagerSupport_Main.m2279h());
    }

    /* renamed from: a */
    public boolean mo4248a(String str) {
        Log.d("trace_S_app_folder=", FragmentStatePagerSupport_Main.m2279h());
        File file = new File(str);
        new File(file, "test");
        if (!file.isDirectory() || !file.canWrite() || !file.exists()) {
            new File(C0195JU.f441a).mkdirs();
            StringBuilder sb = new StringBuilder();
            sb.append(getString(2131755092));
            sb.append("#");
            sb.append(str);
            Toast.makeText(this, sb.toString(), 1).show();
            return false;
        }
        Log.d("trace_E_app_folder=", FragmentStatePagerSupport_Main.m2279h());
        return true;
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        this.f2822c = getApplicationContext();
        this.f2824e = new C0195JU(this.f2823d, this.f2822c);
        HandlerThread handlerThread = new HandlerThread("ServiceStartArguments", 10);
        handlerThread.start();
        this.f2820a = handlerThread.getLooper();
        this.f2821b = new C0725a(this.f2820a);
    }

    public void onDestroy() {
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.f2822c == null || this.f2824e == null) {
            this.f2822c = getApplicationContext();
            this.f2824e = new C0195JU(this.f2823d, this.f2822c);
        }
        Message obtainMessage = this.f2821b.obtainMessage();
        obtainMessage.arg1 = i2;
        this.f2821b.sendMessage(obtainMessage);
        return 1;
    }
}
