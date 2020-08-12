package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential;
import com.google.api.client.http.FileContent;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.ExponentialBackOff;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.Drive.Builder;
import com.google.api.services.drive.Drive.Files.List;
import com.google.api.services.drive.model.File;
import com.google.api.services.drive.model.FileList;
import com.itextpdf.tool.xml.html.HTML.Attribute;
import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Locale;

/* renamed from: UU */
public class C0444UU {

    /* renamed from: a */
    public static final String[] f1265a = {"https://www.googleapis.com/auth/drive"};

    /* renamed from: b */
    public GoogleAccountCredential f1266b;

    /* renamed from: c */
    public String f1267c = null;

    /* renamed from: d */
    public String f1268d = null;

    /* renamed from: e */
    public String f1269e = "DAFTAR";

    /* renamed from: f */
    public String f1270f;

    /* renamed from: g */
    public String f1271g;

    /* renamed from: h */
    public String f1272h;

    /* renamed from: i */
    public String f1273i;

    /* renamed from: j */
    public String f1274j;

    /* renamed from: k */
    public String f1275k;

    /* renamed from: l */
    public Context f1276l;

    /* renamed from: m */
    public C0195JU f1277m;

    /* renamed from: n */
    public SQLiteDatabase f1278n;

    /* renamed from: UU$a */
    private class C0445a extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: a */
        public Drive f1279a = null;

        /* renamed from: b */
        public Exception f1280b = null;

        /* renamed from: c */
        public String f1281c = null;

        public C0445a(GoogleAccountCredential googleAccountCredential, String str) {
            this.f1281c = str;
            C0444UU.this.f1277m = new C0195JU(C0444UU.this.f1278n, C0444UU.this.f1276l);
            this.f1279a = new Builder(AndroidHttp.newCompatibleTransport(), JacksonFactory.getDefaultInstance(), C0444UU.this.mo1294a((HttpRequestInitializer) googleAccountCredential)).setApplicationName("Drive API Android Quickstart").build();
        }

        /* renamed from: a */
        public Boolean doInBackground(Void... voidArr) {
            try {
                return Boolean.valueOf(mo1303a());
            } catch (Exception e) {
                this.f1280b = e;
                cancel(true);
                return Boolean.valueOf(false);
            }
        }

        /* renamed from: a */
        public final String mo1301a(String str) {
            File file = new File();
            file.setName(str);
            file.setMimeType("application/vnd.google-apps.folder");
            return mo1304b(str) == null ? ((File) this.f1279a.files().create(file).setFields(Attribute.f2026ID).execute()).getId() : mo1304b(str);
        }

        /* renamed from: a */
        public void onPostExecute(Boolean bool) {
            try {
                if (!bool.booleanValue()) {
                    mo1305c("0");
                    Log.d("Upload", "No file uploaded.");
                    return;
                }
                mo1305c("1");
                C0444UU.this.f1277m.mo631x("auto_drive_date_save", new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).format(Calendar.getInstance().getTime()));
                C0195JU.f460t = false;
            } catch (Exception unused) {
            }
        }

        /* renamed from: a */
        public final boolean mo1303a() {
            File file = new File();
            file.setName(this.f1281c);
            String str = "application/x-sqlite3";
            file.setMimeType(str);
            file.setParents(Collections.singletonList(mo1301a(C0444UU.this.f1269e)));
            StringBuilder sb = new StringBuilder();
            sb.append(C0195JU.f441a);
            sb.append("/");
            sb.append(this.f1281c);
            File file2 = (File) this.f1279a.files().create(file, new FileContent(str, new java.io.File(sb.toString()))).setFields(Attribute.f2026ID).execute();
            return true;
        }

        /* renamed from: b */
        public final String mo1304b(String str) {
            String str2 = null;
            String str3 = null;
            do {
                List list = this.f1279a.files().list();
                StringBuilder sb = new StringBuilder();
                sb.append("mimeType='application/vnd.google-apps.folder' and name contains '");
                sb.append(str);
                sb.append("'");
                FileList fileList = (FileList) list.setQ(sb.toString()).setSpaces("drive").setFields("nextPageToken, files(id, name)").setPageToken(str2).execute();
                for (File id : fileList.getFiles()) {
                    str3 = id.getId();
                }
                str2 = fileList.getNextPageToken();
            } while (str2 != null);
            return str3;
        }

        /* renamed from: c */
        public final void mo1305c(String str) {
            FragmentStatePagerSupport_Main.f2452e = str;
            C0444UU.this.f1277m.mo631x("bk_drive_flag", str);
        }

        public void onCancelled() {
            mo1305c("0");
            Exception exc = this.f1280b;
        }

        public void onPreExecute() {
            mo1305c("2");
            Log.d("drive=", "onPreExecute");
        }
    }

    public C0444UU(Context context, C0195JU ju) {
        String str = "";
        this.f1270f = str;
        this.f1271g = str;
        this.f1272h = str;
        this.f1273i = str;
        this.f1274j = str;
        this.f1275k = str;
        try {
            this.f1276l = context;
            this.f1277m = ju;
            this.f1277m = new C0195JU(this.f1278n, context);
            this.f1266b = GoogleAccountCredential.usingOAuth2(context, Arrays.asList(f1265a)).setBackOff(new ExponentialBackOff()).setSelectedAccountName(ju.mo609q("PREF_ACCOUNT_NAME", null));
            this.f1269e = context.getString(2131755090);
            Log.d("job_start=", "google_drive_auto");
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final HttpRequestInitializer mo1294a(HttpRequestInitializer httpRequestInitializer) {
        return new C0418TU(this, httpRequestInitializer);
    }

    /* renamed from: a */
    public final void mo1295a() {
        String str;
        try {
            String str2 = "drive_err";
            if (!mo1299d()) {
                str = "acquireGooglePlayServices";
            } else if (this.f1266b.getSelectedAccountName() == null) {
                str = "chooseAccount_upload";
            } else if (!mo1298c()) {
                Log.d("isDeviceOnline", "No");
                return;
            } else {
                Log.d("drive_file=", this.f1275k);
                if (!this.f1275k.equals("")) {
                    new C0445a(this.f1266b, this.f1275k).execute(new Void[0]);
                    return;
                }
                return;
            }
            Log.d(str2, str);
        } catch (Exception unused) {
            mo1296a("0");
        }
    }

    /* renamed from: a */
    public final void mo1296a(String str) {
        FragmentStatePagerSupport_Main.f2452e = str;
        this.f1277m.mo631x("bk_drive_flag", str);
    }

    /* renamed from: b */
    public void mo1297b() {
        try {
            if (!FragmentStatePagerSupport_Main.f2452e.equals("1")) {
                mo1296a("2");
                C0195JU.f441a = this.f1277m.mo609q("prefBackup_path", C0195JU.f441a);
                this.f1275k = this.f1277m.mo609q("auto_filename", "");
                mo1295a();
            }
        } catch (Exception unused) {
            mo1296a("0");
        }
    }

    /* renamed from: c */
    public final boolean mo1298c() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f1276l.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: d */
    public final boolean mo1299d() {
        GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.f1276l);
        return true;
    }
}
