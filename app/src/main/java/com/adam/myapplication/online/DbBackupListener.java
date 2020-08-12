package com.adam.myapplication.online;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import p000.C0195JU;

public class DbBackupListener extends BroadcastReceiver {

    /* renamed from: a */
    public SQLiteDatabase f2800a;

    /* renamed from: b */
    public C0195JU f2801b;

    /* renamed from: c */
    public Context f2802c;

    /* JADX WARNING: Can't wrap try/catch for region: R(7:9|10|11|(1:15)|16|17|18) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x00bf */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r11, android.content.Intent r12) {
        /*
            r10 = this;
            java.lang.String r12 = "db_data_changed"
            java.lang.String r0 = "prefAutoBackup"
            java.lang.String r1 = "bk_drive_flag"
            java.lang.String r2 = ".db"
            java.lang.String r3 = "0"
            JU r4 = new JU
            android.database.sqlite.SQLiteDatabase r5 = r10.f2800a
            r4.<init>(r5, r11)
            r10.f2801b = r4
            r10.f2802c = r11
            JU r11 = r10.f2801b     // Catch:{ Exception -> 0x0145 }
            r4 = 1
            boolean r11 = r11.mo524a(r0, r4)     // Catch:{ Exception -> 0x0145 }
            if (r11 != 0) goto L_0x001f
            return
        L_0x001f:
            JU r11 = r10.f2801b     // Catch:{ Exception -> 0x0145 }
            java.lang.String r11 = r11.mo609q(r12, r3)     // Catch:{ Exception -> 0x0145 }
            boolean r11 = r11.equals(r3)     // Catch:{ Exception -> 0x0145 }
            if (r11 == 0) goto L_0x0033
            JU r11 = r10.f2801b     // Catch:{ Exception -> 0x0145 }
            android.content.Context r12 = r10.f2802c     // Catch:{ Exception -> 0x0145 }
            r11.mo573f(r12)     // Catch:{ Exception -> 0x0145 }
            return
        L_0x0033:
            android.text.format.DateFormat r11 = new android.text.format.DateFormat     // Catch:{ Exception -> 0x0145 }
            r11.<init>()     // Catch:{ Exception -> 0x0145 }
            java.lang.String r11 = "dd-MM-yyyy"
            java.util.Date r5 = new java.util.Date     // Catch:{ Exception -> 0x0145 }
            r5.<init>()     // Catch:{ Exception -> 0x0145 }
            java.lang.CharSequence r11 = android.text.format.DateFormat.format(r11, r5)     // Catch:{ Exception -> 0x0145 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0145 }
            JU r5 = r10.f2801b     // Catch:{ Exception -> 0x0145 }
            r5.mo525aa()     // Catch:{ Exception -> 0x0145 }
            android.content.Context r5 = r10.f2802c     // Catch:{ Exception -> 0x0145 }
            java.lang.String r6 = p000.C0195JU.f441a     // Catch:{ Exception -> 0x0145 }
            java.lang.String r7 = "market.db"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0145 }
            r8.<init>()     // Catch:{ Exception -> 0x0145 }
            r8.append(r11)     // Catch:{ Exception -> 0x0145 }
            r8.append(r2)     // Catch:{ Exception -> 0x0145 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0145 }
            java.lang.String r9 = "com.valdio.valdioveliu.recyclerview"
            p000.C0268MU.m849a(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0145 }
            JU r5 = r10.f2801b     // Catch:{ Exception -> 0x0145 }
            r5.mo631x(r12, r3)     // Catch:{ Exception -> 0x0145 }
            JU r12 = r10.f2801b     // Catch:{ Exception -> 0x0145 }
            r12.mo631x(r1, r3)     // Catch:{ Exception -> 0x0145 }
            JU r12 = r10.f2801b     // Catch:{ Exception -> 0x0145 }
            java.lang.String r5 = "auto_filename"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0145 }
            r6.<init>()     // Catch:{ Exception -> 0x0145 }
            r6.append(r11)     // Catch:{ Exception -> 0x0145 }
            r6.append(r2)     // Catch:{ Exception -> 0x0145 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0145 }
            r12.mo631x(r5, r6)     // Catch:{ Exception -> 0x0145 }
            JU r12 = r10.f2801b     // Catch:{ Exception -> 0x0145 }
            java.lang.String r5 = "auto_drive_date_request"
            r12.mo631x(r5, r11)     // Catch:{ Exception -> 0x0145 }
            JU r12 = r10.f2801b     // Catch:{ Exception -> 0x0145 }
            android.content.Context r5 = r10.f2802c     // Catch:{ Exception -> 0x0145 }
            r12.mo573f(r5)     // Catch:{ Exception -> 0x0145 }
            JU r12 = r10.f2801b     // Catch:{ Exception -> 0x00bf }
            java.lang.String r12 = r12.mo609q(r1, r3)     // Catch:{ Exception -> 0x00bf }
            com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.f2452e = r12     // Catch:{ Exception -> 0x00bf }
            java.lang.String r12 = com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.f2452e     // Catch:{ Exception -> 0x00bf }
            boolean r12 = r12.equals(r3)     // Catch:{ Exception -> 0x00bf }
            if (r12 == 0) goto L_0x00bf
            JU r12 = r10.f2801b     // Catch:{ Exception -> 0x00bf }
            boolean r12 = r12.mo524a(r0, r4)     // Catch:{ Exception -> 0x00bf }
            if (r12 != r4) goto L_0x00bf
            UU r12 = new UU     // Catch:{ Exception -> 0x00bf }
            android.content.Context r0 = r10.f2802c     // Catch:{ Exception -> 0x00bf }
            JU r3 = r10.f2801b     // Catch:{ Exception -> 0x00bf }
            r12.<init>(r0, r3)     // Catch:{ Exception -> 0x00bf }
            r12.mo1297b()     // Catch:{ Exception -> 0x00bf }
            JU r12 = r10.f2801b     // Catch:{ Exception -> 0x00bf }
            java.lang.String r0 = com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.f2452e     // Catch:{ Exception -> 0x00bf }
            r12.mo631x(r1, r0)     // Catch:{ Exception -> 0x00bf }
        L_0x00bf:
            android.content.Intent r12 = new android.content.Intent     // Catch:{ Exception -> 0x0145 }
            android.content.Context r0 = r10.f2802c     // Catch:{ Exception -> 0x0145 }
            java.lang.Class<com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main> r1 = com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.class
            r12.<init>(r0, r1)     // Catch:{ Exception -> 0x0145 }
            java.lang.String r0 = "auto_back"
            java.lang.String r1 = "1"
            r12.putExtra(r0, r1)     // Catch:{ Exception -> 0x0145 }
            java.lang.String r0 = "bk_filename"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0145 }
            r1.<init>()     // Catch:{ Exception -> 0x0145 }
            r1.append(r11)     // Catch:{ Exception -> 0x0145 }
            r1.append(r2)     // Catch:{ Exception -> 0x0145 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0145 }
            r12.putExtra(r0, r1)     // Catch:{ Exception -> 0x0145 }
            android.support.v4.app.NotificationCompat$Builder r0 = new android.support.v4.app.NotificationCompat$Builder     // Catch:{ Exception -> 0x0145 }
            android.content.Context r1 = r10.f2802c     // Catch:{ Exception -> 0x0145 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0145 }
            android.content.Context r1 = r10.f2802c     // Catch:{ Exception -> 0x0145 }
            r3 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            android.app.PendingIntent r12 = android.app.PendingIntent.getActivity(r1, r3, r12, r4)     // Catch:{ Exception -> 0x0145 }
            r1 = 2131623937(0x7f0e0001, float:1.887504E38)
            android.support.v4.app.NotificationCompat$Builder r3 = r0.setSmallIcon(r1)     // Catch:{ Exception -> 0x0145 }
            android.content.Context r4 = r10.f2802c     // Catch:{ Exception -> 0x0145 }
            r5 = 2131755094(0x7f100056, float:1.9141058E38)
            java.lang.String r4 = r4.getString(r5)     // Catch:{ Exception -> 0x0145 }
            android.support.v4.app.NotificationCompat$Builder r3 = r3.setContentTitle(r4)     // Catch:{ Exception -> 0x0145 }
            android.support.v4.app.NotificationCompat$Builder r3 = r3.setSmallIcon(r1)     // Catch:{ Exception -> 0x0145 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0145 }
            r4.<init>()     // Catch:{ Exception -> 0x0145 }
            JU r5 = r10.f2801b     // Catch:{ Exception -> 0x0145 }
            java.lang.String r6 = "prefBackup_path"
            java.lang.String r7 = p000.C0195JU.f441a     // Catch:{ Exception -> 0x0145 }
            java.lang.String r5 = r5.mo609q(r6, r7)     // Catch:{ Exception -> 0x0145 }
            r4.append(r5)     // Catch:{ Exception -> 0x0145 }
            java.lang.String r5 = "/"
            r4.append(r5)     // Catch:{ Exception -> 0x0145 }
            r4.append(r11)     // Catch:{ Exception -> 0x0145 }
            r4.append(r2)     // Catch:{ Exception -> 0x0145 }
            java.lang.String r11 = r4.toString()     // Catch:{ Exception -> 0x0145 }
            r3.setContentText(r11)     // Catch:{ Exception -> 0x0145 }
            r0.setContentIntent(r12)     // Catch:{ Exception -> 0x0145 }
            android.content.Context r11 = r10.f2802c     // Catch:{ Exception -> 0x0145 }
            android.content.Context r12 = r10.f2802c     // Catch:{ Exception -> 0x0145 }
            java.lang.String r12 = "notification"
            java.lang.Object r11 = r11.getSystemService(r12)     // Catch:{ Exception -> 0x0145 }
            android.app.NotificationManager r11 = (android.app.NotificationManager) r11     // Catch:{ Exception -> 0x0145 }
            android.app.Notification r12 = r0.build()     // Catch:{ Exception -> 0x0145 }
            r11.notify(r1, r12)     // Catch:{ Exception -> 0x0145 }
        L_0x0145:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.online.DbBackupListener.onReceive(android.content.Context, android.content.Intent):void");
    }
}
