package p000;

import android.app.job.JobParameters;
import com.valdio.valdioveliu.recyclerview.online.DbBackupListener_Service;

/* renamed from: SU */
class C0398SU extends C0724a {

    /* renamed from: b */
    public final /* synthetic */ JobParameters f1164b;

    /* renamed from: c */
    public final /* synthetic */ DbBackupListener_Service f1165c;

    public C0398SU(DbBackupListener_Service dbBackupListener_Service, JobParameters jobParameters) {
        this.f1165c = dbBackupListener_Service;
        this.f1164b = jobParameters;
        super(dbBackupListener_Service, null);
    }

    /* renamed from: a */
    public void onPostExecute(Void voidR) {
        super.onPostExecute(voidR);
        this.f1165c.jobFinished(this.f1164b, true);
    }
}
