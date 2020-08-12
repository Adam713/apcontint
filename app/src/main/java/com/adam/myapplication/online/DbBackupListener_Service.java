package com.adam.myapplication.online;



import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.support.annotation.RequiresApi;
import android.support.v4.app.NotificationCompat.Builder;
import android.text.format.DateFormat;
import android.util.Log;
import com.options.PropertyOptions;
import com.adam.myapplication.FragmentStatePagerSupport_Main;
import java.util.Date;

@RequiresApi(api = 21)
public class DbBackupListener_Service extends JobService {

    /* renamed from: a */
    public SQLiteDatabase f2803a;

    /* renamed from: b */
    public C0195JU f2804b;

    /* renamed from: c */
    public Context f2805c;

    /* renamed from: d */
    public C0724a f2806d;

    /* renamed from: e */
    public String f2807e = "";

    /* renamed from: com.valdio.valdioveliu.recyclerview.online.DbBackupListener_Service$a */
    private class C0724a extends AsyncTask<Void, Void, Void> {
        public C0724a() {
        }

        public /* synthetic */ C0724a(DbBackupListener_Service dbBackupListener_Service, C0398SU su) {
            this();
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            Log.d("job_ser_L", "doInBackground");
            String str = "prefAutoBackup";
            if (!DbBackupListener_Service.this.f2804b.mo524a(str, true)) {
                return null;
            }
            String str2 = "db_data_changed";
            String str3 = "0";
            if (DbBackupListener_Service.this.f2804b.mo609q(str2, str3).equals(str3)) {
                DbBackupListener_Service dbBackupListener_Service = DbBackupListener_Service.this;
                dbBackupListener_Service.f2804b.mo573f(dbBackupListener_Service.f2805c);
                return null;
            }
            new DateFormat();
            DbBackupListener_Service.this.f2807e = DateFormat.format("dd-MM-yyyy", new Date()).toString();
            DbBackupListener_Service.this.f2804b.mo525aa();
            Context context = DbBackupListener_Service.this.f2805c;
            String str4 = C0195JU.f441a;
            StringBuilder sb = new StringBuilder();
            sb.append(DbBackupListener_Service.this.f2807e);
            String str5 = ".db";
            sb.append(str5);
            C0268MU.m849a(context, str4, "market.db", sb.toString(), "com.valdio.valdioveliu.recyclerview");
            DbBackupListener_Service.this.f2804b.mo631x(str2, str3);
            String str6 = "bk_drive_flag";
            DbBackupListener_Service.this.f2804b.mo631x(str6, str3);
            C0195JU ju = DbBackupListener_Service.this.f2804b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(DbBackupListener_Service.this.f2807e);
            sb2.append(str5);
            ju.mo631x("auto_filename", sb2.toString());
            DbBackupListener_Service dbBackupListener_Service2 = DbBackupListener_Service.this;
            dbBackupListener_Service2.f2804b.mo631x("auto_drive_date_request", dbBackupListener_Service2.f2807e);
            DbBackupListener_Service dbBackupListener_Service3 = DbBackupListener_Service.this;
            dbBackupListener_Service3.f2804b.mo573f(dbBackupListener_Service3.f2805c);
            try {
                FragmentStatePagerSupport_Main.f2452e = DbBackupListener_Service.this.f2804b.mo609q(str6, str3);
                if (FragmentStatePagerSupport_Main.f2452e.equals(str3) && DbBackupListener_Service.this.f2804b.mo524a(str, true)) {
                    new C0444UU(DbBackupListener_Service.this.f2805c, DbBackupListener_Service.this.f2804b).mo1297b();
                    DbBackupListener_Service.this.f2804b.mo631x(str6, FragmentStatePagerSupport_Main.f2452e);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            DbBackupListener_Service dbBackupListener_Service4 = DbBackupListener_Service.this;
            dbBackupListener_Service4.mo4235a(dbBackupListener_Service4.f2807e);
            return null;
        }

        public void onPreExecute() {
            Log.d("job_ser_L", "onPreExecute");
            DbBackupListener_Service dbBackupListener_Service = DbBackupListener_Service.this;
            dbBackupListener_Service.f2804b = new C0195JU(dbBackupListener_Service.f2803a, dbBackupListener_Service.getApplicationContext());
            DbBackupListener_Service dbBackupListener_Service2 = DbBackupListener_Service.this;
            dbBackupListener_Service2.f2805c = dbBackupListener_Service2.getApplicationContext();
            DbBackupListener_Service dbBackupListener_Service3 = DbBackupListener_Service.this;
            dbBackupListener_Service3.f2804b = new C0195JU(dbBackupListener_Service3.f2803a, dbBackupListener_Service3.f2805c);
        }
    }

    /* renamed from: a */
    public void mo4235a(String str) {
        String str2 = ".db";
        try {
            Log.d("job_ser_L", "onPostExecute");
            Intent intent = new Intent(this.f2805c, FragmentStatePagerSupport_Main.class);
            intent.putExtra("auto_back", "1");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            intent.putExtra("bk_filename", sb.toString());
            PendingIntent activity = PendingIntent.getActivity(this.f2805c, 0, intent, PropertyOptions.SEPARATE_NODE);
            Context context = this.f2805c;
            Context context2 = this.f2805c;
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            String str3 = "my_channel_id_01";
            if (VERSION.SDK_INT >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel(str3, "My Notifications", 3);
                notificationChannel.setDescription(this.f2805c.getString(2131755094));
                notificationChannel.enableLights(true);
                notificationChannel.setLightColor(-65536);
                notificationChannel.setVibrationPattern(new long[]{0, 1000, 500, 1000});
                notificationChannel.enableVibration(true);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            Builder builder = new Builder(this.f2805c, str3);
            Builder smallIcon = builder.setSmallIcon(2131623937).setContentTitle(this.f2805c.getString(2131755094)).setSmallIcon(2131623937);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f2804b.mo609q("prefBackup_path", C0195JU.f441a));
            sb2.append("/");
            sb2.append(str);
            sb2.append(str2);
            smallIcon.setContentText(sb2.toString());
            builder.setContentIntent(activity);
            notificationManager.notify(2131623937, builder.build());
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(e.getMessage());
            sb3.append("");
            Log.d("job_ser_err", sb3.toString());
            e.printStackTrace();
        }
    }

    public void onCreate() {
        super.onCreate();
    }

    public boolean onStartJob(JobParameters jobParameters) {
        this.f2806d = new C0398SU(this, jobParameters);
        this.f2806d.execute(new Void[0]);
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        C0724a aVar = this.f2806d;
        if (aVar != null) {
            aVar.cancel(true);
        }
        return false;
    }
}

