package com.adam.myapplication.fcm;


import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.NotificationCompat.Builder;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.options.PropertyOptions;
import com.adam.myapplication.FragmentStatePagerSupport_Main;
import com.adam.myapplication.Google_drive_list;
//TODO UP THES
public class MyGcmPushReceiver extends FirebaseMessagingService {

    /* renamed from: a */
    public C0070DO f2680a;

    /* renamed from: a */
    public final void mo4127a(Context context, String str, String str2, String str3, Intent intent) {
        this.f2680a = new C0070DO(context);
        intent.setFlags(268468224);
        this.f2680a.mo141a(str, str2, str3, intent);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.fcm.MyGcmPushReceiver, android.app.Service] */
    /* renamed from: a */
    public final void mo4128a(String str, int i, String str2) {
        Intent intent = new Intent(this, FragmentStatePagerSupport_Main.class);
        if (i == 2) {
            intent = new Intent(this, Google_drive_list.class);
            intent.putExtra("bk_flag", "1");
            intent.putExtra("auto_filename", "");
        } else if (i == 3) {
            intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str2));
        }
        intent.addFlags(67108864);
        ((NotificationManager) getSystemService("notification")).notify(0, new Builder(this).setSmallIcon(2131623937).setContentTitle(getString(2131755090)).setContentText(str).setAutoCancel(true).setSound(RingtoneManager.getDefaultUri(2)).setContentIntent(PendingIntent.getActivity(this, 0, intent, PropertyOptions.SEPARATE_NODE)).build());
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.fcm.MyGcmPushReceiver, android.app.Service] */
    /* renamed from: a */
    public final void mo4129a(String str, String str2, String str3) {
        Intent intent = new Intent(this, FragmentStatePagerSupport_Main.class);
        intent.addFlags(67108864);
        mo4127a(getApplicationContext(), str, str2, str3, intent);
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.d("receive=", "onMessageReceived");
        try {
            if (remoteMessage.getNotification() == null || remoteMessage.getNotification().getBody().length() <= 1) {
                mo4128a(((String) remoteMessage.getData().get("data")).toString(), Integer.parseInt(((String) remoteMessage.getData().get("action_type")).toString()), ((String) remoteMessage.getData().get("url")).toString());
                return;
            }
            String title = remoteMessage.getNotification().getTitle();
            String body = remoteMessage.getNotification().getBody();
            StringBuilder sb = new StringBuilder();
            sb.append(remoteMessage.getSentTime());
            sb.append("");
            mo4129a(title, body, sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
