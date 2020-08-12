package com.adam.myapplication.threads;


import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.support.annotation.RequiresApi;
import android.util.Log;
import com.adam.myapplication.FragmentStatePagerSupport_Main;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class HelloService_Job extends JobService {

    /* renamed from: a */
    public Context f2828a;

    /* renamed from: b */
    public SQLiteDatabase f2829b;

    /* renamed from: c */
    public C0195JU f2830c;

    /* renamed from: d */
    public int[] f2831d = {2131230923, 1, 2131230855};

    /* renamed from: e */
    public int f2832e = 0;

    /* renamed from: f */
    public C0726a f2833f;

    /* renamed from: g */
    public String f2834g = "";

    /* renamed from: com.valdio.valdioveliu.recyclerview.threads.HelloService_Job$a */
    private class C0726a extends AsyncTask<Void, Void, Void> {
        public C0726a() {
        }

        public /* synthetic */ C0726a(HelloService_Job helloService_Job, C0507XU xu) {
            this();
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            String str = ".db";
            String str2 = "db_data_changed";
            String str3 = "prefAutoBackup";
            String str4 = "prefBackup_path";
            String str5 = "hello_serv";
            String str6 = "bk_drive_flag";
            String str7 = "0";
            StringBuilder sb = new StringBuilder();
            sb.append("doInBackground:");
            sb.append(C0195JU.f460t);
            sb.append(":");
            sb.append(HelloService_Job.this.f2830c.mo609q("auto_drive_date_save", ""));
            Log.d("job_ser_he", sb.toString());
            try {
                if (HelloService_Job.this.f2830c.mo524a(str5, true)) {
                    return null;
                }
                HelloService_Job.this.f2830c.mo481T();
                HelloService_Job.this.f2830c.mo572f();
                HelloService_Job.this.f2830c.mo560d();
                HelloService_Job.this.f2830c.mo568e();
                if (C0195JU.f451k) {
                    HelloService_Job.this.mo4254a(HelloService_Job.this.f2830c.mo618t());
                }
                if (HelloService_Job.this.mo4255a(HelloService_Job.this.f2830c.mo609q(str4, C0195JU.f441a))) {
                    HelloService_Job.this.f2830c.mo525aa();
                } else {
                    HelloService_Job.this.f2830c.mo631x(str4, C0195JU.f441a);
                }
                if (!HelloService_Job.this.f2830c.mo524a(str3, true) || HelloService_Job.this.f2830c.mo609q(str2, str7).equals(str7)) {
                    return null;
                }
                Calendar instance = Calendar.getInstance();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
                HelloService_Job.this.f2834g = simpleDateFormat.format(instance.getTime());
                if (!HelloService_Job.this.f2830c.mo476Q()) {
                    return null;
                }
                HelloService_Job.this.f2830c.mo525aa();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(HelloService_Job.this.f2834g);
                sb2.append(str);
                C0268MU.m849a(HelloService_Job.this.f2828a, C0195JU.f441a, "market.db", sb2.toString(), "com.valdio.valdioveliu.recyclerview");
                HelloService_Job.this.f2830c.mo631x(str2, str7);
                HelloService_Job.this.f2830c.mo631x(str6, str7);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(HelloService_Job.this.f2834g);
                sb3.append(str);
                HelloService_Job.this.f2830c.mo631x("auto_filename", sb3.toString());
                HelloService_Job.this.f2830c.mo631x("auto_drive_date_request", HelloService_Job.this.f2834g);
                FragmentStatePagerSupport_Main.f2452e = HelloService_Job.this.f2830c.mo609q(str6, str7);
                if (FragmentStatePagerSupport_Main.f2452e.equals(str7) && HelloService_Job.this.f2830c.mo524a(str3, true)) {
                    new C0444UU(HelloService_Job.this.f2828a, HelloService_Job.this.f2830c).mo1297b();
                    HelloService_Job.this.f2830c.mo631x(str6, FragmentStatePagerSupport_Main.f2452e);
                }
                HelloService_Job.this.f2830c.mo543b(str5, true);
                return null;
            } catch (Exception unused) {
                Thread.currentThread().interrupt();
            }
        }

        public void onPreExecute() {
            Log.d("job_ser_he", "onPreExecute");
            HelloService_Job helloService_Job = HelloService_Job.this;
            helloService_Job.f2830c = new C0195JU(helloService_Job.f2829b, helloService_Job.getApplicationContext());
            HelloService_Job helloService_Job2 = HelloService_Job.this;
            helloService_Job2.f2828a = helloService_Job2.getApplicationContext();
            HelloService_Job helloService_Job3 = HelloService_Job.this;
            helloService_Job3.f2830c = new C0195JU(helloService_Job3.f2829b, helloService_Job3.f2828a);
        }
    }

    @RequiresApi(api = 21)
    /* renamed from: a */
    public static void m2549a(Context context) {
        ((JobScheduler) context.getSystemService("jobscheduler")).cancel(13);
    }

    @RequiresApi(api = 21)
    /* renamed from: b */
    public static void m2550b(Context context) {
        String str;
        try {
            JobInfo build = new Builder(13, new ComponentName(context, HelloService_Job.class)).setRequiredNetworkType(0).setOverrideDeadline(1000).setMinimumLatency(10).setPersisted(true).build();
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            jobScheduler.cancel(13);
            String str2 = "ExelLog";
            if (jobScheduler.schedule(build) == 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("Job_scheduled_hell! ");
                sb.append((build.getMaxExecutionDelayMillis() / 1000) / 60);
                sb.append(" Mins:");
                sb.append((build.getMinLatencyMillis() / 1000) / 60);
                sb.append("Min(min.Latency)");
                str = sb.toString();
            } else {
                str = "Job_s not scheduled";
            }
            Log.d(str2, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo4254a(Cursor cursor) {
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
    public boolean mo4255a(String str) {
        Log.d("trace_S_app_folder=", FragmentStatePagerSupport_Main.m2279h());
        File file = new File(str);
        new File(file, "test");
        if (!file.isDirectory() || !file.canWrite() || !file.exists()) {
            new File(C0195JU.f441a).mkdirs();
            return false;
        }
        Log.d("trace_E_app_folder=", FragmentStatePagerSupport_Main.m2279h());
        return true;
    }

    public void onCreate() {
        this.f2828a = getApplicationContext();
        this.f2830c = new C0195JU(this.f2829b, this.f2828a);
    }

    public void onDestroy() {
    }

    @TargetApi(21)
    @RequiresApi(api = 21)
    public boolean onStartJob(JobParameters jobParameters) {
        if (this.f2830c.mo524a("hello_serv", false)) {
            m2549a(this.f2828a);
        }
        this.f2833f = new C0507XU(this, jobParameters);
        this.f2833f.execute(new Void[0]);
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        StringBuilder sb = new StringBuilder();
        sb.append("onStopJob:");
        sb.append(this.f2830c.mo524a("hello_serv", false));
        Log.d("job_ser_he", sb.toString());
        C0726a aVar = this.f2833f;
        if (aVar != null) {
            aVar.cancel(true);
        }
        return false;
    }
}
