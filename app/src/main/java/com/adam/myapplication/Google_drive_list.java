package com.adam.myapplication;


import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.format.DateFormat;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential;
import com.google.api.client.googleapis.extensions.android.gms.auth.GooglePlayServicesAvailabilityIOException;
import com.google.api.client.googleapis.extensions.android.gms.auth.UserRecoverableAuthIOException;
import com.google.api.client.http.FileContent;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.Drive.Builder;
import com.google.api.services.drive.Drive.Files;
import com.google.api.services.drive.model.File;
import com.google.api.services.drive.model.FileList;
import com.itextpdf.tool.xml.html.HTML.Attribute;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

public class Google_drive_list extends AppCompatActivity implements C1104a {

    /* renamed from: a */
    public static final String[] f2489a = {"https://www.googleapis.com/auth/drive"};

    /* renamed from: b */
    public GoogleAccountCredential f2490b;

    /* renamed from: c */
    public TextView f2491c;

    /* renamed from: d */
    public TextView f2492d;

    /* renamed from: e */
    public ImageView f2493e;

    /* renamed from: f */
    public String f2494f = null;

    /* renamed from: g */
    public String f2495g = null;

    /* renamed from: h */
    public String f2496h = "DAFTAR";

    /* renamed from: i */
    public String f2497i;

    /* renamed from: j */
    public String f2498j;

    /* renamed from: k */
    public String f2499k;

    /* renamed from: l */
    public String f2500l;

    /* renamed from: m */
    public String f2501m;

    /* renamed from: n */
    public ProgressDialog f2502n;

    /* renamed from: o */
    public ListView f2503o;

    /* renamed from: p */
    public C0388SM f2504p;

    /* renamed from: q */
    public AdView f2505q;

    /* renamed from: r */
    public List<C0082EH> f2506r;

    /* renamed from: s */
    public String f2507s;

    /* renamed from: t */
    public SparseBooleanArray f2508t;

    /* renamed from: u */
    public ArrayList<C0082EH> f2509u;

    /* renamed from: v */
    public SQLiteDatabase f2510v;

    /* renamed from: w */
    public C0195JU f2511w;

    /* renamed from: com.valdio.valdioveliu.recyclerview.Google_drive_list$a */
    private class C0699a extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: a */
        public Drive f2512a = null;

        /* renamed from: b */
        public Exception f2513b = null;

        /* renamed from: c */
        public ArrayList<C0082EH> f2514c = new ArrayList<>();

        /* renamed from: d */
        public String f2515d = null;

        public C0699a(GoogleAccountCredential googleAccountCredential, ArrayList<C0082EH> arrayList) {
            this.f2514c = arrayList;
            this.f2512a = new Builder(AndroidHttp.newCompatibleTransport(), JacksonFactory.getDefaultInstance(), Google_drive_list.this.mo3821a((HttpRequestInitializer) googleAccountCredential)).setApplicationName("Drive API Android Quickstart").build();
        }

        /* renamed from: a */
        public Boolean doInBackground(Void... voidArr) {
            try {
                return Boolean.valueOf(mo3852a());
            } catch (Exception e) {
                this.f2513b = e;
                cancel(true);
                return Boolean.valueOf(false);
            }
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [com.valdio.valdioveliu.recyclerview.Google_drive_list, android.app.Activity] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0, types: [com.valdio.valdioveliu.recyclerview.Google_drive_list, android.app.Activity]
          assigns: [com.valdio.valdioveliu.recyclerview.Google_drive_list]
          uses: [android.app.Activity]
          mth insns count: 4
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo3850a(android.app.ProgressDialog r3, java.lang.String r4) {
            /*
                r2 = this;
                com.valdio.valdioveliu.recyclerview.Google_drive_list r0 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this
                KM r1 = new KM
                r1.<init>(r2, r3, r4)
                r0.runOnUiThread(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.Google_drive_list.C0699a.mo3850a(android.app.ProgressDialog, java.lang.String):void");
        }

        /* renamed from: a */
        public void onPostExecute(Boolean bool) {
            Google_drive_list.this.f2502n.hide();
            if (!bool.booleanValue()) {
                Google_drive_list.this.f2491c.setText("No file deleted.");
                Google_drive_list.this.f2506r.clear();
                Google_drive_list.this.f2504p.notifyDataSetChanged();
                return;
            }
            Google_drive_list.this.mo3838k();
        }

        /* renamed from: a */
        public final boolean mo3852a() {
            try {
                Iterator it = this.f2514c.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    C0082EH eh = (C0082EH) it.next();
                    this.f2512a.files().delete(eh.mo191f()).execute();
                    mo3850a(Google_drive_list.this.f2502n, eh.mo192g());
                    z = true;
                }
                return z;
            } catch (Exception e) {
                Log.d("delete_error=", e.getMessage());
                return false;
            }
        }

        public void onCancelled() {
            String str;
            TextView textView;
            Google_drive_list.this.f2502n.hide();
            GooglePlayServicesAvailabilityIOException googlePlayServicesAvailabilityIOException = this.f2513b;
            if (googlePlayServicesAvailabilityIOException == null) {
                textView = Google_drive_list.this.f2491c;
                str = "Request cancelled.";
            } else if (googlePlayServicesAvailabilityIOException instanceof GooglePlayServicesAvailabilityIOException) {
                Google_drive_list.this.mo3823a(googlePlayServicesAvailabilityIOException.getConnectionStatusCode());
                return;
            } else if (googlePlayServicesAvailabilityIOException instanceof UserRecoverableAuthIOException) {
                Google_drive_list.this.startActivityForResult(((UserRecoverableAuthIOException) googlePlayServicesAvailabilityIOException).getIntent(), 1001);
                return;
            } else {
                textView = Google_drive_list.this.f2491c;
                StringBuilder sb = new StringBuilder();
                sb.append("Download:The following error occurred:\n");
                sb.append(this.f2513b.getMessage());
                str = sb.toString();
            }
            textView.setText(str);
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [com.valdio.valdioveliu.recyclerview.Google_drive_list, android.app.Activity] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0, types: [com.valdio.valdioveliu.recyclerview.Google_drive_list, android.app.Activity]
          assigns: [com.valdio.valdioveliu.recyclerview.Google_drive_list]
          uses: [com.valdio.valdioveliu.recyclerview.Google_drive_list, android.app.Activity]
          mth insns count: 8
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPreExecute() {
            /*
                r3 = this;
                com.valdio.valdioveliu.recyclerview.Google_drive_list r0 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this
                android.app.ProgressDialog r1 = r0.f2502n
                r2 = 2131755203(0x7f1000c3, float:1.9141279E38)
                java.lang.String r0 = r0.getString(r2)
                r1.setMessage(r0)
                com.valdio.valdioveliu.recyclerview.Google_drive_list r0 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this
                android.app.ProgressDialog r0 = r0.f2502n
                r0.show()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.Google_drive_list.C0699a.onPreExecute():void");
        }
    }

    /* renamed from: com.valdio.valdioveliu.recyclerview.Google_drive_list$b */
    private class C0700b extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: a */
        public Drive f2517a = null;

        /* renamed from: b */
        public Exception f2518b = null;

        /* renamed from: c */
        public String f2519c = null;

        /* renamed from: d */
        public String f2520d = null;

        public C0700b(GoogleAccountCredential googleAccountCredential, String str, String str2) {
            this.f2519c = str;
            this.f2520d = str2;
            this.f2517a = new Builder(AndroidHttp.newCompatibleTransport(), JacksonFactory.getDefaultInstance(), Google_drive_list.this.mo3821a((HttpRequestInitializer) googleAccountCredential)).setApplicationName("Drive API Android Quickstart").build();
        }

        /* renamed from: a */
        public Boolean doInBackground(Void... voidArr) {
            try {
                return Boolean.valueOf(mo3859a());
            } catch (Exception e) {
                this.f2518b = e;
                cancel(true);
                return Boolean.valueOf(false);
            }
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Google_drive_list] */
        /* JADX WARNING: type inference failed for: r6v11, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Google_drive_list] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v3, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Google_drive_list]
          assigns: [com.valdio.valdioveliu.recyclerview.Google_drive_list]
          uses: [android.content.Context]
          mth insns count: 51
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPostExecute(java.lang.Boolean r6) {
            /*
                r5 = this;
                com.valdio.valdioveliu.recyclerview.Google_drive_list r0 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this
                android.app.ProgressDialog r0 = r0.f2502n
                r0.hide()
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L_0x0027
                com.valdio.valdioveliu.recyclerview.Google_drive_list r6 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this
                android.widget.TextView r6 = r6.f2491c
                java.lang.String r0 = "No file downloaded."
                r6.setText(r0)
                com.valdio.valdioveliu.recyclerview.Google_drive_list r6 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this
                java.util.List<EH> r6 = r6.f2506r
                r6.clear()
                com.valdio.valdioveliu.recyclerview.Google_drive_list r6 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this
                SM r6 = r6.f2504p
                r6.notifyDataSetChanged()
                goto L_0x0092
            L_0x0027:
                android.text.format.DateFormat r6 = new android.text.format.DateFormat
                r6.<init>()
                java.util.Date r6 = new java.util.Date
                r6.<init>()
                java.lang.String r0 = "yyyyMMddkkmmss"
                java.lang.CharSequence r6 = android.text.format.DateFormat.format(r0, r6)
                java.lang.String r6 = r6.toString()
                com.valdio.valdioveliu.recyclerview.Google_drive_list r0 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r6)
                java.lang.String r6 = "-market.db"
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                java.lang.String r1 = "com.valdio.valdioveliu.recyclerview"
                java.lang.String r2 = "market.db"
                p000.C0268MU.m848a(r0, r2, r6, r1)
                com.valdio.valdioveliu.recyclerview.Google_drive_list r6 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this
                JU r6 = r6.f2511w
                r6.mo550c()
                java.io.File r6 = new java.io.File
                java.lang.String r0 = p000.C0195JU.f441a
                r6.<init>(r0)
                r6.mkdirs()
                com.valdio.valdioveliu.recyclerview.Google_drive_list r6 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this
                java.lang.String r0 = p000.C0195JU.f441a
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Drive_"
                r3.append(r4)
                java.lang.String r4 = r5.f2520d
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                int r6 = p000.C0268MU.m850b(r6, r2, r0, r3, r1)
                if (r6 != 0) goto L_0x0092
                android.os.Handler r6 = new android.os.Handler
                r6.<init>()
                LM r0 = new LM
                r0.<init>(r5)
                r1 = 5000(0x1388, double:2.4703E-320)
                r6.postDelayed(r0, r1)
            L_0x0092:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.Google_drive_list.C0700b.onPostExecute(java.lang.Boolean):void");
        }

        /* renamed from: a */
        public final boolean mo3859a() {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("Drive_");
                sb.append(this.f2520d);
                this.f2517a.files().get(this.f2519c).executeMediaAndDownloadTo(C0195JU.m412W(sb.toString()));
                return true;
            } catch (Exception e) {
                Log.d("download_error=", e.getMessage());
                return false;
            }
        }

        public void onCancelled() {
            String str;
            TextView textView;
            Google_drive_list.this.f2502n.hide();
            GooglePlayServicesAvailabilityIOException googlePlayServicesAvailabilityIOException = this.f2518b;
            if (googlePlayServicesAvailabilityIOException == null) {
                textView = Google_drive_list.this.f2491c;
                str = "Request cancelled.";
            } else if (googlePlayServicesAvailabilityIOException instanceof GooglePlayServicesAvailabilityIOException) {
                Google_drive_list.this.mo3823a(googlePlayServicesAvailabilityIOException.getConnectionStatusCode());
                return;
            } else if (googlePlayServicesAvailabilityIOException instanceof UserRecoverableAuthIOException) {
                Google_drive_list.this.startActivityForResult(((UserRecoverableAuthIOException) googlePlayServicesAvailabilityIOException).getIntent(), 1001);
                return;
            } else {
                textView = Google_drive_list.this.f2491c;
                StringBuilder sb = new StringBuilder();
                sb.append("Download:The following error occurred:\n");
                sb.append(this.f2518b.getMessage());
                str = sb.toString();
            }
            textView.setText(str);
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [com.valdio.valdioveliu.recyclerview.Google_drive_list, android.app.Activity] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0, types: [com.valdio.valdioveliu.recyclerview.Google_drive_list, android.app.Activity]
          assigns: [com.valdio.valdioveliu.recyclerview.Google_drive_list]
          uses: [com.valdio.valdioveliu.recyclerview.Google_drive_list, android.app.Activity]
          mth insns count: 8
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPreExecute() {
            /*
                r3 = this;
                com.valdio.valdioveliu.recyclerview.Google_drive_list r0 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this
                android.app.ProgressDialog r1 = r0.f2502n
                r2 = 2131755203(0x7f1000c3, float:1.9141279E38)
                java.lang.String r0 = r0.getString(r2)
                r1.setMessage(r0)
                com.valdio.valdioveliu.recyclerview.Google_drive_list r0 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this
                android.app.ProgressDialog r0 = r0.f2502n
                r0.show()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.Google_drive_list.C0700b.onPreExecute():void");
        }
    }

    /* renamed from: com.valdio.valdioveliu.recyclerview.Google_drive_list$c */
    private class C0701c extends AsyncTask<Void, Void, List<C0082EH>> {

        /* renamed from: a */
        public Drive f2522a = null;

        /* renamed from: b */
        public Exception f2523b = null;

        public C0701c(GoogleAccountCredential googleAccountCredential) {
            this.f2522a = new Builder(AndroidHttp.newCompatibleTransport(), JacksonFactory.getDefaultInstance(), Google_drive_list.this.mo3821a((HttpRequestInitializer) googleAccountCredential)).setApplicationName("Drive API Android Quickstart").build();
        }

        /* renamed from: a */
        public final String mo3864a(String str) {
            File file = new File();
            file.setName(str);
            file.setMimeType("application/vnd.google-apps.folder");
            return mo3868b(str) == null ? ((File) this.f2522a.files().create(file).setFields(Attribute.f2026ID).execute()).getId() : mo3868b(str);
        }

        /* renamed from: a */
        public final List<C0082EH> mo3865a() {
            ArrayList arrayList = new ArrayList();
            String a = mo3864a(Google_drive_list.this.f2496h);
            Files.List list = this.f2522a.files().list();
            StringBuilder sb = new StringBuilder();
            sb.append("'");
            sb.append(a);
            sb.append("' in parents");
            FileList fileList = (FileList) list.setQ(sb.toString()).setFields("nextPageToken, files(id, name,mimeType,modifiedTime,size)").setPageToken(null).execute();
            List files = fileList.getFiles();
            Google_drive_list.this.f2506r.clear();
            Google_drive_list google_drive_list = Google_drive_list.this;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" ");
            sb2.append(files.size());
            google_drive_list.f2499k = sb2.toString();
            if (files != null) {
                for (File file : fileList.getFiles()) {
                    if (file.getSize() != null) {
                        arrayList.add(String.format("%s (%s)-%s\n", new Object[]{file.getName(), file.getId(), file.getMimeType()}));
                        try {
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
                            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                            Date parse = simpleDateFormat.parse(file.getModifiedTime().toString());
                            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                            C0082EH eh = new C0082EH(file.getId(), file.getName(), simpleDateFormat2.format(parse), 0.0d, 0, 0, C0195JU.m415a(file.getSize().longValue()));
                            Google_drive_list.this.f2506r.add(eh);
                        } catch (Exception e) {
                            C0082EH eh2 = new C0082EH(file.getId(), file.getName(), file.getModifiedTime().toString(), 0.0d, 0, 0, C0195JU.m415a(file.getSize().longValue()));
                            Google_drive_list.this.f2506r.add(eh2);
                            Log.d("date_error=", e.getMessage());
                        }
                    }
                }
            }
            return Google_drive_list.this.f2506r;
        }

        /* renamed from: a */
        public List<C0082EH> doInBackground(Void... voidArr) {
            try {
                return mo3865a();
            } catch (Exception e) {
                this.f2523b = e;
                cancel(true);
                return null;
            }
        }

        /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Google_drive_list] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Google_drive_list]
          assigns: [com.valdio.valdioveliu.recyclerview.Google_drive_list]
          uses: [android.content.Context]
          mth insns count: 54
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPostExecute(java.util.List<p000.C0082EH> r5) {
            /*
                r4 = this;
                com.valdio.valdioveliu.recyclerview.Google_drive_list r0 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this     // Catch:{ Exception -> 0x0076 }
                android.app.ProgressDialog r0 = r0.f2502n     // Catch:{ Exception -> 0x0076 }
                r0.hide()     // Catch:{ Exception -> 0x0076 }
                if (r5 == 0) goto L_0x005a
                int r0 = r5.size()     // Catch:{ Exception -> 0x0076 }
                if (r0 != 0) goto L_0x0010
                goto L_0x005a
            L_0x0010:
                com.valdio.valdioveliu.recyclerview.Google_drive_list r0 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this     // Catch:{ Exception -> 0x0076 }
                SM r1 = new SM     // Catch:{ Exception -> 0x0076 }
                com.valdio.valdioveliu.recyclerview.Google_drive_list r2 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this     // Catch:{ Exception -> 0x0076 }
                r3 = 2131492982(0x7f0c0076, float:1.8609431E38)
                r1.<init>(r2, r3, r5)     // Catch:{ Exception -> 0x0076 }
                r0.f2504p = r1     // Catch:{ Exception -> 0x0076 }
                com.valdio.valdioveliu.recyclerview.Google_drive_list r5 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this     // Catch:{ Exception -> 0x0076 }
                SM r5 = r5.f2504p     // Catch:{ Exception -> 0x0076 }
                java.util.ArrayList<java.lang.Integer> r5 = r5.f1138i     // Catch:{ Exception -> 0x0076 }
                r5.clear()     // Catch:{ Exception -> 0x0076 }
                com.valdio.valdioveliu.recyclerview.Google_drive_list r5 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this     // Catch:{ Exception -> 0x0076 }
                SM r5 = r5.f2504p     // Catch:{ Exception -> 0x0076 }
                r5.notifyDataSetChanged()     // Catch:{ Exception -> 0x0076 }
                com.valdio.valdioveliu.recyclerview.Google_drive_list r5 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this     // Catch:{ Exception -> 0x0076 }
                android.widget.ListView r5 = r5.f2503o     // Catch:{ Exception -> 0x0076 }
                com.valdio.valdioveliu.recyclerview.Google_drive_list r0 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this     // Catch:{ Exception -> 0x0076 }
                SM r0 = r0.f2504p     // Catch:{ Exception -> 0x0076 }
                r5.setAdapter(r0)     // Catch:{ Exception -> 0x0076 }
                com.valdio.valdioveliu.recyclerview.Google_drive_list r5 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this     // Catch:{ Exception -> 0x0076 }
                android.widget.TextView r5 = r5.f2492d     // Catch:{ Exception -> 0x0076 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0076 }
                r0.<init>()     // Catch:{ Exception -> 0x0076 }
                com.valdio.valdioveliu.recyclerview.Google_drive_list r1 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this     // Catch:{ Exception -> 0x0076 }
                java.lang.String r1 = r1.f2498j     // Catch:{ Exception -> 0x0076 }
                r0.append(r1)     // Catch:{ Exception -> 0x0076 }
                com.valdio.valdioveliu.recyclerview.Google_drive_list r1 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this     // Catch:{ Exception -> 0x0076 }
                java.lang.String r1 = r1.f2499k     // Catch:{ Exception -> 0x0076 }
                r0.append(r1)     // Catch:{ Exception -> 0x0076 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0076 }
                r5.setText(r0)     // Catch:{ Exception -> 0x0076 }
                goto L_0x0085
            L_0x005a:
                com.valdio.valdioveliu.recyclerview.Google_drive_list r5 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this     // Catch:{ Exception -> 0x0076 }
                android.widget.TextView r5 = r5.f2491c     // Catch:{ Exception -> 0x0076 }
                com.valdio.valdioveliu.recyclerview.Google_drive_list r0 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this     // Catch:{ Exception -> 0x0076 }
                java.lang.String r0 = r0.f2500l     // Catch:{ Exception -> 0x0076 }
                r5.setText(r0)     // Catch:{ Exception -> 0x0076 }
                com.valdio.valdioveliu.recyclerview.Google_drive_list r5 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this     // Catch:{ Exception -> 0x0076 }
                java.util.List<EH> r5 = r5.f2506r     // Catch:{ Exception -> 0x0076 }
                r5.clear()     // Catch:{ Exception -> 0x0076 }
                com.valdio.valdioveliu.recyclerview.Google_drive_list r5 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this     // Catch:{ Exception -> 0x0076 }
                SM r5 = r5.f2504p     // Catch:{ Exception -> 0x0076 }
                r5.notifyDataSetChanged()     // Catch:{ Exception -> 0x0076 }
                goto L_0x0085
            L_0x0076:
                com.valdio.valdioveliu.recyclerview.Google_drive_list r5 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this
                android.widget.TextView r5 = r5.f2491c
                java.lang.Exception r0 = r4.f2523b
                java.lang.String r0 = r0.getMessage()
                r5.setText(r0)
            L_0x0085:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.Google_drive_list.C0701c.onPostExecute(java.util.List):void");
        }

        /* renamed from: b */
        public final String mo3868b(String str) {
            String str2 = null;
            String str3 = null;
            do {
                Files.List list = this.f2522a.files().list();
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

        public void onCancelled() {
            String str;
            TextView textView;
            String str2;
            StringBuilder sb;
            Google_drive_list.this.f2502n.hide();
            GooglePlayServicesAvailabilityIOException googlePlayServicesAvailabilityIOException = this.f2523b;
            if (googlePlayServicesAvailabilityIOException != null) {
                if (googlePlayServicesAvailabilityIOException instanceof GooglePlayServicesAvailabilityIOException) {
                    Google_drive_list.this.mo3823a(googlePlayServicesAvailabilityIOException.getConnectionStatusCode());
                } else if (googlePlayServicesAvailabilityIOException instanceof UserRecoverableAuthIOException) {
                    Google_drive_list.this.startActivityForResult(((UserRecoverableAuthIOException) googlePlayServicesAvailabilityIOException).getIntent(), 1001);
                } else {
                    if (Google_drive_list.this.f2490b.getSelectedAccountName() == null) {
                        textView = Google_drive_list.this.f2491c;
                        sb = new StringBuilder();
                        sb.append("LIST: The following error occurred:\n");
                        str2 = this.f2523b.getMessage();
                    } else {
                        textView = Google_drive_list.this.f2491c;
                        sb = new StringBuilder();
                        sb.append(Google_drive_list.this.f2501m);
                        sb.append("\nLIST: The following error occurred:\n");
                        sb.append(this.f2523b.getMessage());
                        sb.append(":");
                        str2 = Google_drive_list.this.f2490b.getSelectedAccountName();
                    }
                    sb.append(str2);
                    str = sb.toString();
                }
                Google_drive_list.this.f2506r.clear();
                Google_drive_list.this.f2504p.notifyDataSetChanged();
                Google_drive_list google_drive_list = Google_drive_list.this;
                google_drive_list.f2503o.setAdapter(google_drive_list.f2504p);
            }
            textView = Google_drive_list.this.f2491c;
            str = "Request cancelled.";
            textView.setText(str);
            Google_drive_list.this.f2506r.clear();
            Google_drive_list.this.f2504p.notifyDataSetChanged();
            Google_drive_list google_drive_list2 = Google_drive_list.this;
            google_drive_list2.f2503o.setAdapter(google_drive_list2.f2504p);
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [com.valdio.valdioveliu.recyclerview.Google_drive_list, android.app.Activity] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0, types: [com.valdio.valdioveliu.recyclerview.Google_drive_list, android.app.Activity]
          assigns: [com.valdio.valdioveliu.recyclerview.Google_drive_list]
          uses: [android.app.Activity]
          mth insns count: 10
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPreExecute() {
            /*
                r3 = this;
                com.valdio.valdioveliu.recyclerview.Google_drive_list r0 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this     // Catch:{ Exception -> 0x0017 }
                android.app.ProgressDialog r0 = r0.f2502n     // Catch:{ Exception -> 0x0017 }
                com.valdio.valdioveliu.recyclerview.Google_drive_list r1 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this     // Catch:{ Exception -> 0x0017 }
                r2 = 2131755205(0x7f1000c5, float:1.9141283E38)
                java.lang.String r1 = r1.getString(r2)     // Catch:{ Exception -> 0x0017 }
                r0.setMessage(r1)     // Catch:{ Exception -> 0x0017 }
                com.valdio.valdioveliu.recyclerview.Google_drive_list r0 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this     // Catch:{ Exception -> 0x0017 }
                android.app.ProgressDialog r0 = r0.f2502n     // Catch:{ Exception -> 0x0017 }
                r0.show()     // Catch:{ Exception -> 0x0017 }
            L_0x0017:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.Google_drive_list.C0701c.onPreExecute():void");
        }
    }

    /* renamed from: com.valdio.valdioveliu.recyclerview.Google_drive_list$d */
    private class C0702d extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: a */
        public Drive f2525a = null;

        /* renamed from: b */
        public Exception f2526b = null;

        /* renamed from: c */
        public String f2527c = null;

        public C0702d(GoogleAccountCredential googleAccountCredential, String str) {
            this.f2527c = str;
            this.f2525a = new Builder(AndroidHttp.newCompatibleTransport(), JacksonFactory.getDefaultInstance(), Google_drive_list.this.mo3821a((HttpRequestInitializer) googleAccountCredential)).setApplicationName("Drive API Android Quickstart").build();
        }

        /* renamed from: a */
        public Boolean doInBackground(Void... voidArr) {
            try {
                return Boolean.valueOf(mo3876a());
            } catch (Exception e) {
                this.f2526b = e;
                cancel(true);
                return Boolean.valueOf(false);
            }
        }

        /* renamed from: a */
        public final String mo3874a(String str) {
            File file = new File();
            file.setName(str);
            file.setMimeType("application/vnd.google-apps.folder");
            return mo3877b(str) == null ? ((File) this.f2525a.files().create(file).setFields(Attribute.f2026ID).execute()).getId() : mo3877b(str);
        }

        /* JADX WARNING: type inference failed for: r4v3, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Google_drive_list] */
        /* JADX WARNING: type inference failed for: r0v2, types: [com.valdio.valdioveliu.recyclerview.Google_drive_list, android.app.Activity] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v3, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Google_drive_list]
          assigns: [com.valdio.valdioveliu.recyclerview.Google_drive_list]
          uses: [android.content.Context]
          mth insns count: 40
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPostExecute(java.lang.Boolean r4) {
            /*
                r3 = this;
                com.valdio.valdioveliu.recyclerview.Google_drive_list r0 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this     // Catch:{ Exception -> 0x0068 }
                android.app.ProgressDialog r0 = r0.f2502n     // Catch:{ Exception -> 0x0068 }
                r0.hide()     // Catch:{ Exception -> 0x0068 }
                boolean r4 = r4.booleanValue()     // Catch:{ Exception -> 0x0068 }
                if (r4 != 0) goto L_0x0027
                com.valdio.valdioveliu.recyclerview.Google_drive_list r4 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this     // Catch:{ Exception -> 0x0068 }
                android.widget.TextView r4 = r4.f2491c     // Catch:{ Exception -> 0x0068 }
                java.lang.String r0 = "No file uploaded."
                r4.setText(r0)     // Catch:{ Exception -> 0x0068 }
                com.valdio.valdioveliu.recyclerview.Google_drive_list r4 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this     // Catch:{ Exception -> 0x0068 }
                java.util.List<EH> r4 = r4.f2506r     // Catch:{ Exception -> 0x0068 }
                r4.clear()     // Catch:{ Exception -> 0x0068 }
                com.valdio.valdioveliu.recyclerview.Google_drive_list r4 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this     // Catch:{ Exception -> 0x0068 }
                SM r4 = r4.f2504p     // Catch:{ Exception -> 0x0068 }
                r4.notifyDataSetChanged()     // Catch:{ Exception -> 0x0068 }
                goto L_0x0063
            L_0x0027:
                com.valdio.valdioveliu.recyclerview.Google_drive_list r4 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this     // Catch:{ Exception -> 0x0068 }
                com.valdio.valdioveliu.recyclerview.Google_drive_list r0 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this     // Catch:{ Exception -> 0x0068 }
                r1 = 2131755095(0x7f100057, float:1.914106E38)
                java.lang.String r0 = r0.getString(r1)     // Catch:{ Exception -> 0x0068 }
                r1 = 1
                android.widget.Toast r4 = android.widget.Toast.makeText(r4, r0, r1)     // Catch:{ Exception -> 0x0068 }
                r4.show()     // Catch:{ Exception -> 0x0068 }
                java.util.Calendar r4 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x0068 }
                java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0068 }
                java.lang.String r1 = "dd-MM-yyyy"
                java.util.Locale r2 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x0068 }
                r0.<init>(r1, r2)     // Catch:{ Exception -> 0x0068 }
                java.util.Date r4 = r4.getTime()     // Catch:{ Exception -> 0x0068 }
                java.lang.String r4 = r0.format(r4)     // Catch:{ Exception -> 0x0068 }
                com.valdio.valdioveliu.recyclerview.Google_drive_list r0 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this     // Catch:{ Exception -> 0x0068 }
                JU r0 = r0.f2511w     // Catch:{ Exception -> 0x0068 }
                java.lang.String r1 = "auto_drive_date_save"
                r0.mo631x(r1, r4)     // Catch:{ Exception -> 0x0068 }
                com.valdio.valdioveliu.recyclerview.Google_drive_list r4 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this     // Catch:{ Exception -> 0x0068 }
                JU r4 = r4.f2511w     // Catch:{ Exception -> 0x0068 }
                java.lang.String r0 = "db_data_changed"
                java.lang.String r1 = "0"
                r4.mo631x(r0, r1)     // Catch:{ Exception -> 0x0068 }
            L_0x0063:
                com.valdio.valdioveliu.recyclerview.Google_drive_list r4 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this     // Catch:{ Exception -> 0x0068 }
                r4.mo3838k()     // Catch:{ Exception -> 0x0068 }
            L_0x0068:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.Google_drive_list.C0702d.onPostExecute(java.lang.Boolean):void");
        }

        /* renamed from: a */
        public final boolean mo3876a() {
            File file = new File();
            file.setName(this.f2527c);
            String str = "application/x-sqlite3";
            file.setMimeType(str);
            file.setParents(Collections.singletonList(mo3874a(Google_drive_list.this.f2496h)));
            StringBuilder sb = new StringBuilder();
            sb.append(C0195JU.f441a);
            sb.append("/");
            sb.append(this.f2527c);
            File file2 = (File) this.f2525a.files().create(file, new FileContent(str, new java.io.File(sb.toString()))).setFields(Attribute.f2026ID).execute();
            return true;
        }

        /* renamed from: b */
        public final String mo3877b(String str) {
            String str2 = null;
            String str3 = null;
            do {
                Files.List list = this.f2525a.files().list();
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

        public void onCancelled() {
            String str;
            TextView textView;
            Google_drive_list.this.f2502n.hide();
            GooglePlayServicesAvailabilityIOException googlePlayServicesAvailabilityIOException = this.f2526b;
            if (googlePlayServicesAvailabilityIOException == null) {
                textView = Google_drive_list.this.f2491c;
                str = "Request cancelled.";
            } else if (googlePlayServicesAvailabilityIOException instanceof GooglePlayServicesAvailabilityIOException) {
                Google_drive_list.this.mo3823a(googlePlayServicesAvailabilityIOException.getConnectionStatusCode());
                return;
            } else if (googlePlayServicesAvailabilityIOException instanceof UserRecoverableAuthIOException) {
                Google_drive_list.this.startActivityForResult(((UserRecoverableAuthIOException) googlePlayServicesAvailabilityIOException).getIntent(), 1001);
                return;
            } else if (Google_drive_list.this.f2490b.getSelectedAccountName() == null) {
                textView = Google_drive_list.this.f2491c;
                StringBuilder sb = new StringBuilder();
                sb.append("UPLOAD: The following error occurred:\n");
                sb.append(this.f2526b.getMessage());
                str = sb.toString();
            } else {
                TextView c = Google_drive_list.this.f2491c;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Google_drive_list.this.f2501m);
                sb2.append("\nUPLOAD: The following error occurred:\n");
                sb2.append(this.f2526b.getMessage());
                sb2.append(":");
                sb2.append(Google_drive_list.this.f2490b.getSelectedAccountName());
                c.setText(sb2.toString());
                this.f2526b.printStackTrace();
                return;
            }
            textView.setText(str);
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [com.valdio.valdioveliu.recyclerview.Google_drive_list, android.app.Activity] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0, types: [com.valdio.valdioveliu.recyclerview.Google_drive_list, android.app.Activity]
          assigns: [com.valdio.valdioveliu.recyclerview.Google_drive_list]
          uses: [com.valdio.valdioveliu.recyclerview.Google_drive_list, android.app.Activity]
          mth insns count: 8
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPreExecute() {
            /*
                r3 = this;
                com.valdio.valdioveliu.recyclerview.Google_drive_list r0 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this
                android.app.ProgressDialog r1 = r0.f2502n
                r2 = 2131755200(0x7f1000c0, float:1.9141273E38)
                java.lang.String r0 = r0.getString(r2)
                r1.setMessage(r0)
                com.valdio.valdioveliu.recyclerview.Google_drive_list r0 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this
                android.app.ProgressDialog r0 = r0.f2502n
                r0.show()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.Google_drive_list.C0702d.onPreExecute():void");
        }
    }

    public Google_drive_list() {
        String str = "";
        this.f2497i = str;
        this.f2498j = str;
        this.f2499k = str;
        this.f2500l = str;
        this.f2501m = str;
        this.f2503o = null;
        this.f2506r = new ArrayList();
        this.f2507s = str;
        this.f2509u = new ArrayList<>();
    }

    /* renamed from: a */
    public final HttpRequestInitializer mo3821a(HttpRequestInitializer httpRequestInitializer) {
        return new C0148HM(this, httpRequestInitializer);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Google_drive_list, android.app.Activity] */
    /* renamed from: a */
    public final void mo3822a() {
        String str = "-market.db";
        try {
            if (!mo3840m()) {
                mo3826b();
            } else if (this.f2490b.getSelectedAccountName() == null) {
                mo3833g();
            } else if (!mo3839l()) {
                this.f2491c.setText(getString(2131755258));
                this.f2506r.clear();
                this.f2504p.notifyDataSetChanged();
            } else {
                new DateFormat();
                String charSequence = DateFormat.format("yyyyMMddkkmmss", new Date()).toString();
                StringBuilder sb = new StringBuilder();
                sb.append(charSequence);
                sb.append(str);
                C0268MU.m848a(this, "market.db", sb.toString(), "com.valdio.valdioveliu.recyclerview");
                if (this.f2507s.equals("")) {
                    GoogleAccountCredential googleAccountCredential = this.f2490b;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(charSequence);
                    sb2.append(str);
                    new C0702d(googleAccountCredential, sb2.toString()).execute(new Void[0]);
                    return;
                }
                new C0702d(this.f2490b, this.f2507s).execute(new Void[0]);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.Google_drive_list, android.app.Activity] */
    /* renamed from: a */
    public void mo3823a(int i) {
        GoogleApiAvailability.getInstance().getErrorDialog(this, i, 1002).show();
    }

    /* renamed from: a */
    public void mo3824a(int i, List<String> list) {
    }

    public void amount_add_btn(View view) {
        mo3829c();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Google_drive_list] */
    /* renamed from: b */
    public final void mo3826b() {
        GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
        int isGooglePlayServicesAvailable = instance.isGooglePlayServicesAvailable(this);
        if (instance.isUserResolvableError(isGooglePlayServicesAvailable)) {
            mo3823a(isGooglePlayServicesAvailable);
        }
    }

    /* renamed from: b */
    public void mo3827b(int i, List<String> list) {
    }

    public void backup_btn(View view) {
        mo3829c();
    }

    /* renamed from: c */
    public void mo3829c() {
        try {
            mo3822a();
        } catch (Exception e) {
            Log.d("drive_error=", e.getMessage());
            this.f2491c.setText(e.getMessage());
            this.f2506r.clear();
            this.f2504p.notifyDataSetChanged();
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.content.Context, android.support.v4.app.FragmentActivity, java.lang.Object, com.valdio.valdioveliu.recyclerview.Google_drive_list, android.app.Activity] */
    @rda(1003)
    /* renamed from: d */
    public final void mo3830d() {
        String str = "android.permission.GET_ACCOUNTS";
        try {
            if (uda.m3553a((Context) this, str)) {
                String string = getPreferences(0).getString("accountName1", null);
                if (string != null) {
                    this.f2490b.setSelectedAccountName(string);
                    mo3838k();
                    return;
                }
                startActivityForResult(this.f2490b.newChooseAccountIntent(), 1000);
                return;
            }
            uda.m3551a((Object) this, "This app needs to access your Google account (via Contacts).", 1003, str);
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.content.Context, android.support.v4.app.FragmentActivity, java.lang.Object, com.valdio.valdioveliu.recyclerview.Google_drive_list, android.app.Activity] */
    @rda(1003)
    /* renamed from: e */
    public final void mo3831e() {
        String str = "android.permission.GET_ACCOUNTS";
        try {
            if (uda.m3553a((Context) this, str)) {
                String string = getPreferences(0).getString("accountName1", null);
                if (string != null) {
                    this.f2490b.setSelectedAccountName(string);
                    if (mo3839l()) {
                        new C0700b(this.f2490b, this.f2495g, this.f2494f).execute(new Void[0]);
                        return;
                    }
                    return;
                }
                startActivityForResult(this.f2490b.newChooseAccountIntent(), 1000);
                return;
            }
            uda.m3551a((Object) this, "This app needs to access your Google account (via Contacts).", 1003, str);
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.content.Context, android.support.v4.app.FragmentActivity, java.lang.Object, com.valdio.valdioveliu.recyclerview.Google_drive_list] */
    @rda(1003)
    /* renamed from: f */
    public final void mo3832f() {
        String str = "android.permission.GET_ACCOUNTS";
        try {
            if (uda.m3553a((Context) this, str)) {
                startActivityForResult(this.f2490b.newChooseAccountIntent(), 1000);
                return;
            }
            uda.m3551a((Object) this, "This app needs to access your Google account (via Contacts).", 1003, str);
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.content.Context, android.support.v4.app.FragmentActivity, java.lang.Object, com.valdio.valdioveliu.recyclerview.Google_drive_list, android.app.Activity] */
    @rda(1003)
    /* renamed from: g */
    public final void mo3833g() {
        String str = "android.permission.GET_ACCOUNTS";
        try {
            if (uda.m3553a((Context) this, str)) {
                String string = getPreferences(0).getString("accountName1", null);
                if (string != null) {
                    this.f2490b.setSelectedAccountName(string);
                    if (mo3839l()) {
                        mo3842o();
                        return;
                    }
                    return;
                }
                startActivityForResult(this.f2490b.newChooseAccountIntent(), 1000);
                return;
            }
            uda.m3551a((Object) this, "This app needs to access your Google account (via Contacts).", 1003, str);
        } catch (Exception unused) {
        }
    }

    /* renamed from: h */
    public final void mo3834h() {
        this.f2509u.clear();
        for (int size = this.f2508t.size() - 1; size >= 0; size--) {
            if (this.f2508t.valueAt(size)) {
                this.f2509u.add(this.f2504p.getItem(this.f2508t.keyAt(size)));
            }
        }
        new C0699a(this.f2490b, this.f2509u).execute(new Void[0]);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Google_drive_list, android.app.Activity] */
    public void help_btn(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        WebView webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/help.html");
        webView.setWebViewClient(new C0106FM(this));
        builder.setView(webView);
        builder.setNegativeButton(getString(2131755134), new C0126GM(this));
        builder.show();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Google_drive_list, android.app.Activity] */
    /* renamed from: i */
    public void mo3836i() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        StringBuilder sb = new StringBuilder();
        sb.append(getString(2131755362));
        sb.append(" ");
        sb.append(this.f2494f);
        sb.append("?");
        builder.setMessage(sb.toString());
        builder.setPositiveButton(getString(2131755359), new C0168IM(this));
        builder.setNegativeButton(getString(2131755358), new C0187JM(this));
        builder.create().show();
    }

    /* renamed from: j */
    public final void mo3837j() {
        this.f2511w.mo631x("upgrade_db", "0");
        if (!mo3840m()) {
            mo3826b();
        } else if (this.f2490b.getSelectedAccountName() == null) {
            mo3831e();
        } else if (!mo3839l()) {
            this.f2491c.setText("No network connection available.");
        } else {
            new C0700b(this.f2490b, this.f2495g, this.f2494f).execute(new Void[0]);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.Google_drive_list, android.app.Activity] */
    /* renamed from: k */
    public final void mo3838k() {
        if (!mo3840m()) {
            mo3826b();
        } else if (this.f2490b.getSelectedAccountName() == null) {
            mo3830d();
        } else if (!mo3839l()) {
            this.f2491c.setText(getString(2131755258));
        } else {
            new C0701c(this.f2490b).execute(new Void[0]);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.valdio.valdioveliu.recyclerview.Google_drive_list, android.app.Activity] */
    /* renamed from: l */
    public final boolean mo3839l() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Google_drive_list] */
    /* renamed from: m */
    public final boolean mo3840m() {
        GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this);
        return true;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Google_drive_list, android.support.v7.app.AppCompatActivity] */
    /* renamed from: n */
    public void mo3841n() {
        try {
            this.f2505q = findViewById(2131296305);
            this.f2511w = new C0195JU(this.f2510v, this);
            if (this.f2511w.mo524a("black_list", false) || !this.f2511w.mo524a("prefAds", false)) {
                this.f2505q.loadAd(new AdRequest.Builder().addTestDevice("95187DFF9C4F49F99F28C0103255A64F").build());
                return;
            }
            this.f2505q.setVisibility(8);
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Google_drive_list] */
    /* renamed from: o */
    public void mo3842o() {
        new DateFormat();
        String charSequence = DateFormat.format("yyyyMMddkkmmss", new Date()).toString();
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence);
        String str = "-market.db";
        sb.append(str);
        C0268MU.m848a(this, "market.db", sb.toString(), "com.valdio.valdioveliu.recyclerview");
        if (this.f2507s.equals("")) {
            GoogleAccountCredential googleAccountCredential = this.f2490b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(charSequence);
            sb2.append(str);
            new C0702d(googleAccountCredential, sb2.toString()).execute(new Void[0]);
            return;
        }
        new C0702d(this.f2490b, this.f2507s).execute(new Void[0]);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.support.v4.app.FragmentActivity, com.valdio.valdioveliu.recyclerview.Google_drive_list, android.app.Activity] */
    public void onActivityResult(int i, int i2, Intent intent) {
        Google_drive_list.super.onActivityResult(i, i2, intent);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2497i);
        sb.append("r_code=");
        sb.append(i);
        sb.append(":");
        sb.append(i2);
        this.f2497i = sb.toString();
        switch (i) {
            case 1000:
                if (i2 == -1 && intent != null && intent.getExtras() != null) {
                    String stringExtra = intent.getStringExtra("authAccount");
                    if (stringExtra != null) {
                        this.f2511w.mo631x("PREF_ACCOUNT_NAME", stringExtra);
                        Editor edit = getPreferences(0).edit();
                        edit.putString("accountName1", stringExtra);
                        edit.apply();
                        this.f2490b.setSelectedAccountName(stringExtra);
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                break;
            case 1001:
                if (i2 != -1) {
                    return;
                }
                break;
            case 1002:
                if (i2 != -1) {
                    this.f2491c.setText("This app requires Google Play Services. Please install Google Play Services on your device and relaunch this app.");
                    return;
                }
                break;
            default:
                return;
        }
        mo3838k();
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Google_drive_list, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|(1:4)|5|6|(2:10|(1:12)(1:13))|(3:14|15|(1:21))|22|24) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0111 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x00de */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00fe A[Catch:{ Exception -> 0x0111 }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x010e A[Catch:{ Exception -> 0x0111 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            java.lang.String r0 = "1"
            java.lang.String r1 = "change_email_flag"
            java.lang.String r2 = "bk_flag"
            com.valdio.valdioveliu.recyclerview.Google_drive_list.super.onCreate(r8)
            r8 = 0
            android.content.SharedPreferences r8 = r7.getPreferences(r8)
            java.lang.String[] r3 = f2489a
            java.util.List r3 = java.util.Arrays.asList(r3)
            com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential r3 = com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential.usingOAuth2(r7, r3)
            com.google.api.client.util.ExponentialBackOff r4 = new com.google.api.client.util.ExponentialBackOff
            r4.<init>()
            com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential r3 = r3.setBackOff(r4)
            java.lang.String r4 = "accountName1"
            r5 = 0
            java.lang.String r6 = r8.getString(r4, r5)
            com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential r3 = r3.setSelectedAccountName(r6)
            r7.f2490b = r3
            r3 = 2131493014(0x7f0c0096, float:1.8609496E38)
            r7.setContentView(r3)
            r7.mo3848p()
            r3 = 2131755090(0x7f100052, float:1.914105E38)
            java.lang.String r3 = r7.getString(r3)
            r7.f2496h = r3
            r3 = 2131755257(0x7f1000f9, float:1.9141388E38)
            java.lang.String r3 = r7.getString(r3)
            r7.f2498j = r3
            r3 = 2131755395(0x7f100183, float:1.9141668E38)
            java.lang.String r3 = r7.getString(r3)
            r7.f2500l = r3
            r3 = 2131755260(0x7f1000fc, float:1.9141394E38)
            java.lang.String r3 = r7.getString(r3)
            r7.f2501m = r3
            r3 = 2131296529(0x7f090111, float:1.8210977E38)
            android.view.View r3 = r7.findViewById(r3)
            android.widget.ListView r3 = (android.widget.ListView) r3
            r7.f2503o = r3
            r3 = 2131296440(0x7f0900b8, float:1.8210797E38)
            android.view.View r3 = r7.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r7.f2491c = r3
            android.widget.TextView r3 = r7.f2491c
            java.lang.String r6 = ""
            r3.setText(r6)
            r3 = 2131296466(0x7f0900d2, float:1.821085E38)
            android.view.View r3 = r7.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r7.f2492d = r3
            r3 = 2131296497(0x7f0900f1, float:1.8210912E38)
            android.view.View r3 = r7.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r7.f2493e = r3
            android.widget.ImageView r3 = r7.f2493e
            r6 = 17301589(0x1080055, float:2.4979493E-38)
            r3.setImageResource(r6)
            JU r3 = new JU
            android.database.sqlite.SQLiteDatabase r6 = r7.f2510v
            r3.<init>(r6, r7)
            r7.f2511w = r3
            JU r3 = r7.f2511w
            java.lang.String r8 = r8.getString(r4, r5)
            java.lang.String r4 = "PREF_ACCOUNT_NAME"
            r3.mo631x(r4, r8)
            android.widget.ListView r8 = r7.f2503o
            android.widget.TextView r3 = r7.f2491c
            r8.setEmptyView(r3)
            SM r8 = new SM
            java.util.List<EH> r3 = r7.f2506r
            r6 = 2131492982(0x7f0c0076, float:1.8609431E38)
            r8.<init>(r7, r6, r3)
            r7.f2504p = r8
            android.app.ProgressDialog r8 = new android.app.ProgressDialog
            r8.<init>(r7)
            r7.f2502n = r8
            android.app.ProgressDialog r8 = r7.f2502n
            r3 = 2131755200(0x7f1000c0, float:1.9141273E38)
            java.lang.String r3 = r7.getString(r3)
            r8.setMessage(r3)
            r7.mo3841n()     // Catch:{ Exception -> 0x00de }
            JU r8 = r7.f2511w     // Catch:{ Exception -> 0x00de }
            java.lang.String r8 = r8.mo609q(r4, r5)     // Catch:{ Exception -> 0x00de }
            if (r8 != 0) goto L_0x00de
            r7.mo3832f()     // Catch:{ Exception -> 0x00de }
        L_0x00de:
            android.content.Intent r8 = r7.getIntent()     // Catch:{ Exception -> 0x0111 }
            java.lang.String r8 = r8.getStringExtra(r2)     // Catch:{ Exception -> 0x0111 }
            if (r8 == 0) goto L_0x0111
            JU r8 = r7.f2511w     // Catch:{ Exception -> 0x0111 }
            java.lang.String r8 = r8.mo609q(r4, r5)     // Catch:{ Exception -> 0x0111 }
            if (r8 == 0) goto L_0x0111
            android.content.Intent r8 = r7.getIntent()     // Catch:{ Exception -> 0x0111 }
            java.lang.String r8 = r8.getStringExtra(r2)     // Catch:{ Exception -> 0x0111 }
            boolean r8 = r8.equals(r0)     // Catch:{ Exception -> 0x0111 }
            if (r8 == 0) goto L_0x010e
            android.content.Intent r8 = r7.getIntent()     // Catch:{ Exception -> 0x0111 }
            java.lang.String r2 = "auto_filename"
            java.lang.String r8 = r8.getStringExtra(r2)     // Catch:{ Exception -> 0x0111 }
            r7.f2507s = r8     // Catch:{ Exception -> 0x0111 }
            r7.mo3829c()     // Catch:{ Exception -> 0x0111 }
            goto L_0x0111
        L_0x010e:
            r7.mo3838k()     // Catch:{ Exception -> 0x0111 }
        L_0x0111:
            android.content.Intent r8 = r7.getIntent()     // Catch:{ Exception -> 0x0134 }
            java.lang.String r8 = r8.getStringExtra(r1)     // Catch:{ Exception -> 0x0134 }
            if (r8 == 0) goto L_0x0134
            JU r8 = r7.f2511w     // Catch:{ Exception -> 0x0134 }
            java.lang.String r8 = r8.mo609q(r4, r5)     // Catch:{ Exception -> 0x0134 }
            if (r8 == 0) goto L_0x0134
            android.content.Intent r8 = r7.getIntent()     // Catch:{ Exception -> 0x0134 }
            java.lang.String r8 = r8.getStringExtra(r1)     // Catch:{ Exception -> 0x0134 }
            boolean r8 = r8.equals(r0)     // Catch:{ Exception -> 0x0134 }
            if (r8 == 0) goto L_0x0134
            r7.mo3832f()     // Catch:{ Exception -> 0x0134 }
        L_0x0134:
            android.widget.ListView r8 = r7.f2503o
            r0 = 2
            r8.setChoiceMode(r0)
            android.widget.ListView r8 = r7.f2503o
            r0 = 3
            r8.setChoiceMode(r0)
            android.widget.ListView r8 = r7.f2503o
            DM r0 = new DM
            r0.<init>(r7)
            r8.setMultiChoiceModeListener(r0)
            android.widget.ListView r8 = r7.f2503o
            EM r0 = new EM
            r0.<init>(r7)
            r8.setOnItemClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valdio.valdioveliu.recyclerview.Google_drive_list.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131558407, menu);
        return true;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.valdio.valdioveliu.recyclerview.Google_drive_list, android.app.Activity] */
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            finish();
            return true;
        } else if (itemId != 2131296366) {
            return Google_drive_list.super.onOptionsItemSelected(menuItem);
        } else {
            mo3832f();
            return true;
        }
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Google_drive_list.super.onRequestPermissionsResult(i, strArr, iArr);
        uda.m3547a(i, strArr, iArr, (Object) this);
    }

    /* renamed from: p */
    public final void mo3848p() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
}
