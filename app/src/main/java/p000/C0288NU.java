package p000;

import android.util.Log;
import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: NU */
public class C0288NU {

    /* renamed from: a */
    public static C0288NU f778a = new C0288NU();

    /* renamed from: b */
    public static C0376RU f779b = new C0376RU();

    /* renamed from: c */
    public final ThreadPoolExecutor f780c;

    /* renamed from: d */
    public final BlockingQueue<Runnable> f781d = new LinkedBlockingQueue();

    public C0288NU() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 50, TimeUnit.MILLISECONDS, this.f781d);
        this.f780c = threadPoolExecutor;
    }

    /* renamed from: a */
    public static C0288NU m892a() {
        return f778a;
    }

    /* renamed from: a */
    public void mo934a(Runnable runnable) {
        this.f780c.execute(runnable);
        StringBuilder sb = new StringBuilder();
        sb.append(FragmentStatePagerSupport_Main.m2279h());
        sb.append("#");
        sb.append(this.f780c.getActiveCount());
        String str = ":";
        sb.append(str);
        sb.append(this.f780c.getTaskCount());
        sb.append(str);
        sb.append(this.f780c.getCompletedTaskCount());
        Log.d("thread_run=", sb.toString());
    }

    /* renamed from: b */
    public C0376RU mo935b() {
        StringBuilder sb = new StringBuilder();
        sb.append(FragmentStatePagerSupport_Main.m2279h());
        sb.append("#");
        sb.append(this.f780c.getActiveCount());
        String str = ":";
        sb.append(str);
        sb.append(this.f780c.getTaskCount());
        sb.append(str);
        sb.append(this.f780c.getCompletedTaskCount());
        Log.d("main_thread_run=", sb.toString());
        return f779b;
    }
}
