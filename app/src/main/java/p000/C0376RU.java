package p000;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: RU */
public class C0376RU implements Executor {

    /* renamed from: a */
    public Handler f1089a = new Handler(Looper.getMainLooper());

    public void execute(@NonNull Runnable runnable) {
        this.f1089a.post(runnable);
    }
}
