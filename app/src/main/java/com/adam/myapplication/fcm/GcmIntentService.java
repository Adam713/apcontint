package com.adam.myapplication.fcm;


import android.app.IntentService;
import android.content.Intent;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;
//TODO حسابي في الفاير بيس

public class GcmIntentService extends IntentService {

    /* renamed from: a */
    public static final String f2679a = "GcmIntentService";

    public GcmIntentService() {
        super(f2679a);
    }

    /* renamed from: a */
    public static void m2489a(String str) {
        String str2;
        String str3;
        FirebaseMessaging.getInstance();
        try {
            if (FirebaseInstanceId.getInstance().getToken() != null) {
                FirebaseMessaging.getInstance().subscribeToTopic(str);
                str2 = f2679a;
                StringBuilder sb = new StringBuilder();
                sb.append("Subscribed to topic: ");
                sb.append(str);
                str3 = sb.toString();
            } else {
                str2 = f2679a;
                str3 = "error: gcm registration id is null";
            }
            Log.e(str2, str3);
        } catch (Exception e) {
            String str4 = f2679a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Topic subscribe error. Topic: ");
            sb2.append(str);
            sb2.append(", error: ");
            sb2.append(e.getMessage());
            Log.e(str4, sb2.toString());
        }
    }

    /* renamed from: a */
    public final void mo4125a() {
        try {
            String token = FirebaseInstanceId.getInstance().getToken();
            String str = f2679a;
            StringBuilder sb = new StringBuilder();
            sb.append("GCM Registration Token: ");
            sb.append(token);
            Log.e(str, sb.toString());
        } catch (Exception e) {
            Log.e(f2679a, "Failed to complete token refresh", e);
        }
    }

    public void onHandleIntent(Intent intent) {
        try {
            String stringExtra = intent.getStringExtra("key");
            String str = f2679a;
            StringBuilder sb = new StringBuilder();
            sb.append("key:=");
            sb.append(stringExtra);
            Log.e(str, sb.toString());
            char c = 65535;
            int hashCode = stringExtra.hashCode();
            if (hashCode != 514841930) {
                if (hashCode == 583281361) {
                    if (stringExtra.equals("unsubscribe")) {
                        c = 1;
                    }
                }
            } else if (stringExtra.equals("subscribe")) {
                c = 0;
            }
            if (c == 0) {
                m2489a(intent.getStringExtra("topic"));
            } else if (c != 1) {
                mo4125a();
            }
        } catch (Exception e) {
            String str2 = f2679a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Handle error:=");
            sb2.append(e.getMessage());
            Log.e(str2, sb2.toString());
        }
    }
}
