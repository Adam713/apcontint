package p000;

import android.content.Context;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.util.Log;
import android.widget.Toast;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/* renamed from: MU */
public class C0268MU {
    /* renamed from: a */
    public static String m847a(Context context, String str, String str2) {
        try {
            return PreferenceManager.getDefaultSharedPreferences(context).getString(str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    /* renamed from: a */
    public static void m848a(Context context, String str, String str2, String str3) {
        String str4 = "package_name=";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(":");
            sb.append(context.getApplicationContext().getPackageName());
            Log.d(str4, sb.toString());
            C0195JU.f441a = m847a(context, "prefBackup_path", C0195JU.f441a);
            File file = new File(C0195JU.f441a);
            file.mkdirs();
            File dataDirectory = Environment.getDataDirectory();
            if (file.canWrite()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("//data//");
                sb2.append(str3);
                sb2.append("//databases//");
                sb2.append(str);
                File file2 = new File(dataDirectory, sb2.toString());
                File file3 = new File(file, str2);
                FileChannel channel = new FileInputStream(file2).getChannel();
                FileChannel channel2 = new FileOutputStream(file3).getChannel();
                channel2.transferFrom(channel, 0, channel.size());
                channel.close();
                channel2.close();
            }
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(context.getString(2131755172));
            sb3.append(e.getMessage());
            Toast.makeText(context, sb3.toString(), 0).show();
            Log.d("Backup Failed!:", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m849a(Context context, String str, String str2, String str3, String str4) {
        try {
            File file = new File(str);
            file.mkdirs();
            File dataDirectory = Environment.getDataDirectory();
            if (file.canWrite()) {
                StringBuilder sb = new StringBuilder();
                sb.append("//data//");
                sb.append(str4);
                sb.append("//databases//");
                sb.append(str2);
                File file2 = new File(dataDirectory, sb.toString());
                File file3 = new File(file, str3);
                FileChannel channel = new FileInputStream(file2).getChannel();
                FileChannel channel2 = new FileOutputStream(file3).getChannel();
                channel2.transferFrom(channel, 0, channel.size());
                channel.close();
                channel2.close();
            }
        } catch (Exception e) {
            Log.d("Backup Failed!:", e.getMessage());
        }
    }

    /* renamed from: b */
    public static int m850b(Context context, String str, String str2, String str3, String str4) {
        try {
            File file = new File(str2);
            File dataDirectory = Environment.getDataDirectory();
            if (!file.canWrite()) {
                return 0;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("//data//");
            sb.append(str4);
            sb.append("//databases//");
            sb.append(str);
            File file2 = new File(dataDirectory, sb.toString());
            FileChannel channel = new FileInputStream(new File(file, str3)).getChannel();
            FileChannel channel2 = new FileOutputStream(file2).getChannel();
            channel2.transferFrom(channel, 0, channel.size());
            channel.close();
            channel2.close();
            Toast.makeText(context, context.getString(2131755168), 0).show();
            return 0;
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(context.getString(2131755172));
            sb2.append(e.getMessage());
            Toast.makeText(context, sb2.toString(), 0).show();
            Log.d("Import Failed:", e.getMessage());
            return 1;
        }
    }

    /* renamed from: b */
    public static boolean m851b(Context context, String str, String str2, String str3) {
        try {
            C0195JU.f441a = m847a(context, "prefBackup_path", C0195JU.f441a);
            File file = new File(C0195JU.f441a);
            file.mkdirs();
            File dataDirectory = Environment.getDataDirectory();
            if (file.canWrite()) {
                StringBuilder sb = new StringBuilder();
                sb.append("//data//");
                sb.append(str3);
                sb.append("//databases//");
                sb.append(str);
                File file2 = new File(dataDirectory, sb.toString());
                File file3 = new File(file, str2);
                FileChannel channel = new FileInputStream(file2).getChannel();
                FileChannel channel2 = new FileOutputStream(file3).getChannel();
                channel2.transferFrom(channel, 0, channel.size());
                channel.close();
                channel2.close();
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
