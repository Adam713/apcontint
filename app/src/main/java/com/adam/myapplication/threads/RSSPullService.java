package com.adam.myapplication.threads;


import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.widget.Toast;
import com.itextpdf.tool.xml.html.HTML.Attribute;
import com.adam.myapplication.FragmentStatePagerSupport_Main;
import java.io.File;

public class RSSPullService extends IntentService {

    /* renamed from: a */
    public Context f2836a;

    /* renamed from: b */
    public SQLiteDatabase f2837b;

    /* renamed from: c */
    public C0195JU f2838c;

    /* renamed from: d */
    public int[] f2839d = {2131230923, 1, 2131230855};

    public RSSPullService() {
        super("HelloIntentService");
    }

    /* renamed from: a */
    public void mo4263a() {
        Log.d("trace_S_Cus_List=", FragmentStatePagerSupport_Main.m2279h());
        Cursor C = this.f2838c.mo450C();
        C0195JU.f452l.clear();
        C.moveToFirst();
        while (!C.isAfterLast()) {
            C0082EH eh = new C0082EH(C.getString(C.getColumnIndex(Attribute.f2026ID)), C.getString(C.getColumnIndex("_id")), C.getString(C.getColumnIndex("phone")), C.getDouble(C.getColumnIndex("amount")), this.f2839d[C.getInt(C.getColumnIndex("_in"))], 0, C.getString(C.getColumnIndex("g_name")), !C0195JU.f451k ? "" : C.getString(C.getColumnIndex("curr_name")));
            eh.mo190e(C.getString(C.getColumnIndex("cnt")));
            C0195JU.f452l.add(eh);
            C.moveToNext();
        }
        C.close();
        Log.d("trace_E_Cus_List=", FragmentStatePagerSupport_Main.m2279h());
    }

    /* renamed from: a */
    public void mo4264a(Cursor cursor) {
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
    public boolean mo4265a(String str) {
        Log.d("trace_S_app_folder=", FragmentStatePagerSupport_Main.m2279h());
        File file = new File(str);
        new File(file, "test");
        if (!file.isDirectory() || !file.canWrite() || !file.exists()) {
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

    public void onHandleIntent(Intent intent) {
        String str = "prefBackup_path";
        try {
            mo4263a();
            if (C0195JU.f451k) {
                mo4264a(this.f2838c.mo618t());
            }
            if (mo4265a(this.f2838c.mo609q(str, C0195JU.f441a))) {
                C0195JU.f441a = this.f2838c.mo609q(str, C0195JU.f441a);
            } else {
                this.f2838c.mo631x(str, C0195JU.f441a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        this.f2836a = getApplicationContext();
        this.f2838c = new C0195JU(this.f2837b, this.f2836a);
        return super.onStartCommand(intent, i, i2);
    }
}
