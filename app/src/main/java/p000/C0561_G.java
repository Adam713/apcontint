package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: _G */
public class C0561_G {

    /* renamed from: a */
    public final C0563b f1704a = new C0563b();

    /* renamed from: b */
    public final Context f1705b;

    /* renamed from: c */
    public final ExecutorService f1706c;

    /* renamed from: d */
    public final C0593aH f1707d;

    /* renamed from: e */
    public final Map<String, C0382SG> f1708e;

    /* renamed from: f */
    public final Map<Object, C0202KG> f1709f;

    /* renamed from: g */
    public final Map<Object, C0202KG> f1710g;

    /* renamed from: h */
    public final Set<Object> f1711h;

    /* renamed from: i */
    public final Handler f1712i;

    /* renamed from: j */
    public final Handler f1713j;

    /* renamed from: k */
    public final C0426UG f1714k;

    /* renamed from: l */
    public final C1125wH f1715l;

    /* renamed from: m */
    public final List<C0382SG> f1716m;

    /* renamed from: n */
    public final C0564c f1717n;

    /* renamed from: o */
    public final boolean f1718o;

    /* renamed from: p */
    public boolean f1719p;

    /* renamed from: _G$a */
    private static class C0562a extends Handler {

        /* renamed from: a */
        public final C0561_G f1720a;

        public C0562a(Looper looper, C0561_G _g) {
            super(looper);
            this.f1720a = _g;
        }

        public void handleMessage(Message message) {
            boolean z = false;
            switch (message.what) {
                case 1:
                    this.f1720a.mo1725e((C0202KG) message.obj);
                    return;
                case 2:
                    this.f1720a.mo1723d((C0202KG) message.obj);
                    return;
                case 4:
                    this.f1720a.mo1727f((C0382SG) message.obj);
                    return;
                case 5:
                    this.f1720a.mo1728g((C0382SG) message.obj);
                    return;
                case 6:
                    this.f1720a.mo1710a((C0382SG) message.obj, false);
                    return;
                case 7:
                    this.f1720a.mo1715b();
                    return;
                case 9:
                    this.f1720a.mo1718b((NetworkInfo) message.obj);
                    return;
                case 10:
                    C0561_G _g = this.f1720a;
                    if (message.arg1 == 1) {
                        z = true;
                    }
                    _g.mo1720b(z);
                    return;
                case 11:
                    this.f1720a.mo1712a(message.obj);
                    return;
                case 12:
                    this.f1720a.mo1719b(message.obj);
                    return;
                default:
                    C0889lH.f3241a.post(new C0540ZG(this, message));
                    return;
            }
        }
    }

    /* renamed from: _G$b */
    static class C0563b extends HandlerThread {
        public C0563b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    /* renamed from: _G$c */
    static class C0564c extends BroadcastReceiver {

        /* renamed from: a */
        public final C0561_G f1721a;

        public C0564c(C0561_G _g) {
            this.f1721a = _g;
        }

        /* renamed from: a */
        public void mo1730a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.f1721a.f1718o) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.f1721a.f1705b.registerReceiver(this, intentFilter);
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                    String str = "state";
                    if (intent.hasExtra(str)) {
                        this.f1721a.mo1714a(intent.getBooleanExtra(str, false));
                    }
                } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    this.f1721a.mo1711a(((ConnectivityManager) C0039CH.m89a(context, "connectivity")).getActiveNetworkInfo());
                }
            }
        }
    }

    public C0561_G(Context context, ExecutorService executorService, Handler handler, C0593aH aHVar, C0426UG ug, C1125wH wHVar) {
        this.f1704a.start();
        C0039CH.m96a(this.f1704a.getLooper());
        this.f1705b = context;
        this.f1706c = executorService;
        this.f1708e = new LinkedHashMap();
        this.f1709f = new WeakHashMap();
        this.f1710g = new WeakHashMap();
        this.f1711h = new HashSet();
        this.f1712i = new C0562a(this.f1704a.getLooper(), this);
        this.f1707d = aHVar;
        this.f1713j = handler;
        this.f1714k = ug;
        this.f1715l = wHVar;
        this.f1716m = new ArrayList(4);
        this.f1719p = C0039CH.m107d(this.f1705b);
        this.f1718o = C0039CH.m103b(context, "android.permission.ACCESS_NETWORK_STATE");
        this.f1717n = new C0564c(this);
        this.f1717n.mo1730a();
    }

    /* renamed from: a */
    public final void mo1706a() {
        if (!this.f1709f.isEmpty()) {
            Iterator it = this.f1709f.values().iterator();
            while (it.hasNext()) {
                C0202KG kg = (C0202KG) it.next();
                it.remove();
                if (kg.mo656f().f3256p) {
                    C0039CH.m98a("Dispatcher", "replaying", kg.mo658h().mo5049d());
                }
                mo1708a(kg, false);
            }
        }
    }

    /* renamed from: a */
    public void mo1707a(C0202KG kg) {
        Handler handler = this.f1712i;
        handler.sendMessage(handler.obtainMessage(2, kg));
    }

    /* renamed from: a */
    public void mo1708a(C0202KG kg, boolean z) {
        String str = "Dispatcher";
        if (this.f1711h.contains(kg.mo659i())) {
            this.f1710g.put(kg.mo660j(), kg);
            if (kg.mo656f().f3256p) {
                String d = kg.f501b.mo5049d();
                StringBuilder sb = new StringBuilder();
                sb.append("because tag '");
                sb.append(kg.mo659i());
                sb.append("' is paused");
                C0039CH.m99a(str, "paused", d, sb.toString());
            }
            return;
        }
        C0382SG sg = (C0382SG) this.f1708e.get(kg.mo653c());
        if (sg != null) {
            sg.mo1155a(kg);
        } else if (this.f1706c.isShutdown()) {
            if (kg.mo656f().f3256p) {
                C0039CH.m99a(str, "ignored", kg.f501b.mo5049d(), "because shut down");
            }
        } else {
            C0382SG a = C0382SG.m1109a(kg.mo656f(), this, this.f1714k, this.f1715l, kg);
            a.f1118r = this.f1706c.submit(a);
            this.f1708e.put(kg.mo653c(), a);
            if (z) {
                this.f1709f.remove(kg.mo660j());
            }
            if (kg.mo656f().f3256p) {
                C0039CH.m98a(str, "enqueued", kg.f501b.mo5049d());
            }
        }
    }

    /* renamed from: a */
    public final void mo1709a(C0382SG sg) {
        if (!sg.mo1171n()) {
            this.f1716m.add(sg);
            if (!this.f1712i.hasMessages(7)) {
                this.f1712i.sendEmptyMessageDelayed(7, 200);
            }
        }
    }

    /* renamed from: a */
    public void mo1710a(C0382SG sg, boolean z) {
        if (sg.mo1167j().f3256p) {
            String a = C0039CH.m91a(sg);
            StringBuilder sb = new StringBuilder();
            sb.append("for error");
            sb.append(z ? " (will replay)" : "");
            C0039CH.m99a("Dispatcher", "batched", a, sb.toString());
        }
        this.f1708e.remove(sg.mo1164g());
        mo1709a(sg);
    }

    /* renamed from: a */
    public void mo1711a(NetworkInfo networkInfo) {
        Handler handler = this.f1712i;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    /* renamed from: a */
    public void mo1712a(Object obj) {
        if (this.f1711h.add(obj)) {
            Iterator it = this.f1708e.values().iterator();
            while (it.hasNext()) {
                C0382SG sg = (C0382SG) it.next();
                boolean z = sg.mo1167j().f3256p;
                C0202KG c = sg.mo1160c();
                List d = sg.mo1161d();
                boolean z2 = d != null && !d.isEmpty();
                if (c != null || z2) {
                    String str = "' was paused";
                    String str2 = "because tag '";
                    String str3 = "paused";
                    String str4 = "Dispatcher";
                    if (c != null && c.mo659i().equals(obj)) {
                        sg.mo1159b(c);
                        this.f1710g.put(c.mo660j(), c);
                        if (z) {
                            String d2 = c.f501b.mo5049d();
                            StringBuilder sb = new StringBuilder();
                            sb.append(str2);
                            sb.append(obj);
                            sb.append(str);
                            C0039CH.m99a(str4, str3, d2, sb.toString());
                        }
                    }
                    if (z2) {
                        for (int size = d.size() - 1; size >= 0; size--) {
                            C0202KG kg = (C0202KG) d.get(size);
                            if (kg.mo659i().equals(obj)) {
                                sg.mo1159b(kg);
                                this.f1710g.put(kg.mo660j(), kg);
                                if (z) {
                                    String d3 = kg.f501b.mo5049d();
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(str2);
                                    sb2.append(obj);
                                    sb2.append(str);
                                    C0039CH.m99a(str4, str3, d3, sb2.toString());
                                }
                            }
                        }
                    }
                    if (sg.mo1156a()) {
                        it.remove();
                        if (z) {
                            C0039CH.m99a(str4, "canceled", C0039CH.m91a(sg), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo1713a(List<C0382SG> list) {
        if (list != null && !list.isEmpty() && ((C0382SG) list.get(0)).mo1167j().f3256p) {
            StringBuilder sb = new StringBuilder();
            for (C0382SG sg : list) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(C0039CH.m91a(sg));
            }
            C0039CH.m98a("Dispatcher", "delivered", sb.toString());
        }
    }

    /* renamed from: a */
    public void mo1714a(boolean z) {
        Handler handler = this.f1712i;
        handler.sendMessage(handler.obtainMessage(10, z ? 1 : 0, 0));
    }

    /* renamed from: b */
    public void mo1715b() {
        ArrayList arrayList = new ArrayList(this.f1716m);
        this.f1716m.clear();
        Handler handler = this.f1713j;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        mo1713a((List<C0382SG>) arrayList);
    }

    /* renamed from: b */
    public void mo1716b(C0202KG kg) {
        Handler handler = this.f1712i;
        handler.sendMessage(handler.obtainMessage(1, kg));
    }

    /* renamed from: b */
    public void mo1717b(C0382SG sg) {
        Handler handler = this.f1712i;
        handler.sendMessage(handler.obtainMessage(4, sg));
    }

    /* renamed from: b */
    public void mo1718b(NetworkInfo networkInfo) {
        ExecutorService executorService = this.f1706c;
        if (executorService instanceof C0983pH) {
            ((C0983pH) executorService).mo4983a(networkInfo);
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            mo1706a();
        }
    }

    /* renamed from: b */
    public void mo1719b(Object obj) {
        if (this.f1711h.remove(obj)) {
            ArrayList arrayList = null;
            Iterator it = this.f1710g.values().iterator();
            while (it.hasNext()) {
                C0202KG kg = (C0202KG) it.next();
                if (kg.mo659i().equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(kg);
                    it.remove();
                }
            }
            if (arrayList != null) {
                Handler handler = this.f1713j;
                handler.sendMessage(handler.obtainMessage(13, arrayList));
            }
        }
    }

    /* renamed from: b */
    public void mo1720b(boolean z) {
        this.f1719p = z;
    }

    /* renamed from: c */
    public final void mo1721c(C0202KG kg) {
        Object j = kg.mo660j();
        if (j != null) {
            kg.f510k = true;
            this.f1709f.put(j, kg);
        }
    }

    /* renamed from: c */
    public void mo1722c(C0382SG sg) {
        Handler handler = this.f1712i;
        handler.sendMessage(handler.obtainMessage(6, sg));
    }

    /* renamed from: d */
    public void mo1723d(C0202KG kg) {
        String c = kg.mo653c();
        C0382SG sg = (C0382SG) this.f1708e.get(c);
        String str = "canceled";
        String str2 = "Dispatcher";
        if (sg != null) {
            sg.mo1159b(kg);
            if (sg.mo1156a()) {
                this.f1708e.remove(c);
                if (kg.mo656f().f3256p) {
                    C0039CH.m98a(str2, str, kg.mo658h().mo5049d());
                }
            }
        }
        if (this.f1711h.contains(kg.mo659i())) {
            this.f1710g.remove(kg.mo660j());
            if (kg.mo656f().f3256p) {
                C0039CH.m99a(str2, str, kg.mo658h().mo5049d(), "because paused request got canceled");
            }
        }
        C0202KG kg2 = (C0202KG) this.f1709f.remove(kg.mo660j());
        if (kg2 != null && kg2.mo656f().f3256p) {
            C0039CH.m99a(str2, str, kg2.mo658h().mo5049d(), "from replaying");
        }
    }

    /* renamed from: d */
    public void mo1724d(C0382SG sg) {
        Handler handler = this.f1712i;
        handler.sendMessageDelayed(handler.obtainMessage(5, sg), 500);
    }

    /* renamed from: e */
    public void mo1725e(C0202KG kg) {
        mo1708a(kg, true);
    }

    /* renamed from: e */
    public final void mo1726e(C0382SG sg) {
        C0202KG c = sg.mo1160c();
        if (c != null) {
            mo1721c(c);
        }
        List d = sg.mo1161d();
        if (d != null) {
            int size = d.size();
            for (int i = 0; i < size; i++) {
                mo1721c((C0202KG) d.get(i));
            }
        }
    }

    /* renamed from: f */
    public void mo1727f(C0382SG sg) {
        if (C0789gH.m2711b(sg.mo1166i())) {
            this.f1714k.mo1214a(sg.mo1164g(), sg.mo1169l());
        }
        this.f1708e.remove(sg.mo1164g());
        mo1709a(sg);
        if (sg.mo1167j().f3256p) {
            C0039CH.m99a("Dispatcher", "batched", C0039CH.m91a(sg), "for completion");
        }
    }

    /* renamed from: g */
    public void mo1728g(C0382SG sg) {
        if (!sg.mo1171n()) {
            boolean z = false;
            if (this.f1706c.isShutdown()) {
                mo1710a(sg, false);
                return;
            }
            NetworkInfo networkInfo = null;
            if (this.f1718o) {
                networkInfo = ((ConnectivityManager) C0039CH.m89a(this.f1705b, "connectivity")).getActiveNetworkInfo();
            }
            boolean z2 = networkInfo != null && networkInfo.isConnected();
            boolean a = sg.mo1157a(this.f1719p, networkInfo);
            boolean o = sg.mo1172o();
            if (!a) {
                if (this.f1718o && o) {
                    z = true;
                }
                mo1710a(sg, z);
                if (z) {
                    mo1726e(sg);
                }
            } else if (!this.f1718o || z2) {
                if (sg.mo1167j().f3256p) {
                    C0039CH.m98a("Dispatcher", "retrying", C0039CH.m91a(sg));
                }
                if (sg.mo1163f() instanceof C0830a) {
                    sg.f1113m |= C0809hH.NO_CACHE.f3040e;
                }
                sg.f1118r = this.f1706c.submit(sg);
            } else {
                mo1710a(sg, o);
                if (o) {
                    mo1726e(sg);
                }
            }
        }
    }
}
