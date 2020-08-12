package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.List;

/* renamed from: kH */
class C0870kH extends Handler {
    public C0870kH(Looper looper) {
        super(looper);
    }

    public void handleMessage(Message message) {
        int i = message.what;
        if (i != 3) {
            int i2 = 0;
            if (i == 8) {
                List list = (List) message.obj;
                int size = list.size();
                while (i2 < size) {
                    C0382SG sg = (C0382SG) list.get(i2);
                    sg.f1106f.mo4600a(sg);
                    i2++;
                }
            } else if (i == 13) {
                List list2 = (List) message.obj;
                int size2 = list2.size();
                while (i2 < size2) {
                    C0202KG kg = (C0202KG) list2.get(i2);
                    kg.f500a.mo4605b(kg);
                    i2++;
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown handler message received: ");
                sb.append(message.what);
                throw new AssertionError(sb.toString());
            }
        } else {
            C0202KG kg2 = (C0202KG) message.obj;
            if (kg2.mo656f().f3256p) {
                C0039CH.m99a("Main", "canceled", kg2.f501b.mo5049d(), "target got garbage collected");
            }
            kg2.f500a.mo4604a(kg2.mo660j());
        }
    }
}
