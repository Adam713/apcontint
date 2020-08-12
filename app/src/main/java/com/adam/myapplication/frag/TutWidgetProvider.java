package com.adam.myapplication.frag;


import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.widget.RemoteViews;
import com.adam.myapplication.Customer_Det_List_edit;
import com.adam.myapplication.Customer_Det_List_edit2;
import com.adam.myapplication.FragmentStatePagerSupport_Main;
import java.util.ArrayList;
import java.util.List;

public class TutWidgetProvider extends AppWidgetProvider {

    /* renamed from: a */
    public final String f2781a = "TutWidgetProvider";

    /* renamed from: b */
    public SQLiteDatabase f2782b;

    /* renamed from: c */
    public List<C0082EH> f2783c = new ArrayList();

    /* renamed from: d */
    public int[] f2784d = {2131230923, 1, 2131230855};

    /* renamed from: e */
    public int f2785e = 0;

    /* renamed from: a */
    public void mo4226a(Context context, AppWidgetManager appWidgetManager) {
        String str = "1";
        String str2 = "read_imei";
        try {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), 2131493024);
            new C0195JU(this.f2782b, context);
            Intent intent = new Intent(context, Customer_Det_List_edit.class);
            intent.putExtra(str2, str);
            remoteViews.setOnClickPendingIntent(2131296537, PendingIntent.getActivity(context, 0, intent, 134217728));
            Intent intent2 = new Intent(context, Customer_Det_List_edit2.class);
            intent2.putExtra(str2, str);
            remoteViews.setOnClickPendingIntent(2131296539, PendingIntent.getActivity(context, 0, intent2, 134217728));
            remoteViews.setOnClickPendingIntent(2131296536, PendingIntent.getActivity(context, 0, new Intent(context, FragmentStatePagerSupport_Main.class), 134217728));
            appWidgetManager.updateAppWidget(new ComponentName(context, TutWidgetProvider.class), remoteViews);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        try {
            mo4226a(context, appWidgetManager);
        } catch (Exception e) {
            Log.e("TutWidgetProvider", "Failed", e);
        }
    }
}
