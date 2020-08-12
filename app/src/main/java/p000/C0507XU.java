package p000;

import android.app.job.JobParameters;
import android.util.Log;
import com.valdio.valdioveliu.recyclerview.threads.HelloService_Job;

/* renamed from: XU */
class C0507XU extends C0726a {

    /* renamed from: b */
    public final /* synthetic */ JobParameters f1452b;

    /* renamed from: c */
    public final /* synthetic */ HelloService_Job f1453c;

    public C0507XU(HelloService_Job helloService_Job, JobParameters jobParameters) {
        this.f1453c = helloService_Job;
        this.f1452b = jobParameters;
        super(helloService_Job, null);
    }

    /* renamed from: a */
    public void onPostExecute(Void voidR) {
        super.onPostExecute(voidR);
        StringBuilder sb = new StringBuilder();
        sb.append("onPostExecute:");
        String str = "hello_serv";
        sb.append(this.f1453c.f2830c.mo524a(str, false));
        Log.d("job_ser_he", sb.toString());
        this.f1453c.f2830c.mo543b(str, true);
        this.f1453c.jobFinished(this.f1452b, true);
    }
}
