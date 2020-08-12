package p000;

import android.content.Intent;
import com.valdio.valdioveliu.recyclerview.CustomerList;
import com.valdio.valdioveliu.recyclerview.Splash;

/* renamed from: zO */
class C1200zO implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Splash f4199a;

    public C1200zO(Splash splash) {
        this.f4199a = splash;
    }

    public void run() {
        this.f4199a.startActivity(new Intent(this.f4199a, CustomerList.class));
        this.f4199a.finish();
    }
}
