package com.adam.myapplication.fcm;


import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.google.firebase.messaging.FirebaseMessaging;
//TODO FIREBASE ======================
public class MyInstanceIDListenerService extends FirebaseInstanceIdService {

    /* renamed from: a */
    public static final String f2681a = "MyInstanceIDListenerService";

    /* renamed from: a */
    public final void mo4131a() {
        Log.d(f2681a, "Refreshed token: subscriber:daftar_free");
        FirebaseMessaging.getInstance().subscribeToTopic("daftar_free");
    }

    public void onTokenRefresh() {
        Log.e(f2681a, "onTokenRefresh");
        String token = FirebaseInstanceId.getInstance().getToken();
        String str = f2681a;
        StringBuilder sb = new StringBuilder();
        sb.append("Refreshed token: ");
        sb.append(token);
        Log.d(str, sb.toString());
        mo4131a();
    }
}
