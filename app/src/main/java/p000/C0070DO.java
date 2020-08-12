package p000;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.v4.app.NotificationCompat.BigPictureStyle;
import android.support.v4.app.NotificationCompat.Builder;
import android.support.v4.app.NotificationCompat.InboxStyle;
import android.text.Html;
import android.text.TextUtils;
import android.util.Patterns;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

/* renamed from: DO */
public class C0070DO {

    /* renamed from: a */
    public Context f169a;

    public C0070DO(Context context) {
        this.f169a = context;
    }

    /* renamed from: a */
    public Bitmap mo138a(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            return BitmapFactory.decodeStream(httpURLConnection.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public final void mo139a(Bitmap bitmap, Builder builder, int i, String str, String str2, String str3, PendingIntent pendingIntent, Uri uri) {
        BigPictureStyle bigPictureStyle = new BigPictureStyle();
        bigPictureStyle.setBigContentTitle(str);
        bigPictureStyle.setSummaryText(Html.fromHtml(str2).toString());
        bigPictureStyle.bigPicture(bitmap);
        ((NotificationManager) this.f169a.getSystemService("notification")).notify(101, builder.setSmallIcon(i).setTicker(str).setWhen(0).setAutoCancel(true).setContentTitle(str).setContentIntent(pendingIntent).setStyle(bigPictureStyle).setWhen(Long.valueOf(str3).longValue()).setSmallIcon(2131623937).setLargeIcon(BitmapFactory.decodeResource(this.f169a.getResources(), i)).setContentText(str2).build());
    }

    /* renamed from: a */
    public final void mo140a(Builder builder, int i, String str, String str2, String str3, PendingIntent pendingIntent, Uri uri) {
        InboxStyle inboxStyle = new InboxStyle();
        if (C0027BO.f50a) {
            new C0051CO(this.f169a).mo100a(str2);
            List asList = Arrays.asList(new C0051CO(this.f169a).mo99a().split("\\|"));
            for (int size = asList.size() - 1; size >= 0; size--) {
                inboxStyle.addLine((CharSequence) asList.get(size));
            }
        } else {
            inboxStyle.addLine(str2);
        }
        ((NotificationManager) this.f169a.getSystemService("notification")).notify(100, builder.setSmallIcon(i).setTicker(str).setWhen(0).setAutoCancel(true).setContentTitle(str).setContentIntent(pendingIntent).setStyle(inboxStyle).setWhen(Long.valueOf(str3).longValue()).setSmallIcon(2131623937).setLargeIcon(BitmapFactory.decodeResource(this.f169a.getResources(), i)).setContentText(str2).build());
    }

    /* renamed from: a */
    public void mo141a(String str, String str2, String str3, Intent intent) {
        mo142a(str, str2, str3, intent, null);
    }

    /* renamed from: a */
    public void mo142a(String str, String str2, String str3, Intent intent, String str4) {
        if (!TextUtils.isEmpty(str2)) {
            intent.setFlags(603979776);
            PendingIntent activity = PendingIntent.getActivity(this.f169a, 0, intent, 268435456);
            NotificationManager notificationManager = (NotificationManager) this.f169a.getSystemService("notification");
            String str5 = "my_channel_id_02";
            if (VERSION.SDK_INT >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel(str5, "My Notifications", 3);
                notificationChannel.setDescription(str2);
                notificationChannel.enableLights(true);
                notificationChannel.setLightColor(-65536);
                notificationChannel.setVibrationPattern(new long[]{0, 1000, 500, 1000});
                notificationChannel.enableVibration(true);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            Builder builder = new Builder(this.f169a, str5);
            StringBuilder sb = new StringBuilder();
            sb.append("android.resource://");
            sb.append(this.f169a.getPackageName());
            sb.append("/raw/notification");
            Uri parse = Uri.parse(sb.toString());
            if (!TextUtils.isEmpty(str4)) {
                if (str4 != null && str4.length() > 4 && Patterns.WEB_URL.matcher(str4).matches()) {
                    Bitmap a = mo138a(str4);
                    if (a != null) {
                        mo139a(a, builder, 2131623937, str, str2, str3, activity, parse);
                    }
                }
            }
            mo140a(builder, 2131623937, str, str2, str3, activity, parse);
        }
    }
}
