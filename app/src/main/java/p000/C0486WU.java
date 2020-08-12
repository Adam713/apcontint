package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import com.itextpdf.tool.xml.html.HTML.Attribute.Value;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: WU */
public class C0486WU implements Runnable {

    /* renamed from: a */
    public final int f1388a;

    /* renamed from: b */
    public final AssetManager f1389b;

    /* renamed from: c */
    public boolean f1390c;

    /* renamed from: d */
    public ServerSocket f1391d;

    /* renamed from: e */
    public C0195JU f1392e;

    /* renamed from: f */
    public Context f1393f;

    /* renamed from: g */
    public double f1394g = 0.0d;

    /* renamed from: h */
    public int[] f1395h = {2131230923, 1, 2131230855};

    /* renamed from: i */
    public List<C0232LL> f1396i = new ArrayList();

    public C0486WU(int i, AssetManager assetManager) {
        this.f1388a = i;
        this.f1389b = assetManager;
    }

    public C0486WU(int i, AssetManager assetManager, Context context, C0195JU ju) {
        this.f1388a = i;
        this.f1389b = assetManager;
        this.f1392e = ju;
        this.f1393f = context;
    }

    /* renamed from: a */
    public final String mo1413a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.endsWith(".html") ? "text/html" : str.endsWith(".js") ? "application/javascript" : str.endsWith(".css") ? Value.TEXTCSS : "application/octet-stream";
    }

    /* renamed from: a */
    public void mo1414a() {
        this.f1390c = true;
        new Thread(this).start();
    }

    /* renamed from: a */
    public final void mo1415a(PrintStream printStream) {
        printStream.println("HTTP/1.0 500 Internal Server Error");
        printStream.flush();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1416a(Socket r10) {
        /*
            r9 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = ".pdf"
            r2 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x00ee }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ all -> 0x00ee }
            java.io.InputStream r5 = r10.getInputStream()     // Catch:{ all -> 0x00ee }
            r4.<init>(r5)     // Catch:{ all -> 0x00ee }
            r3.<init>(r4)     // Catch:{ all -> 0x00ee }
        L_0x0013:
            java.lang.String r4 = r3.readLine()     // Catch:{ all -> 0x00eb }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x00eb }
            if (r5 != 0) goto L_0x0038
            java.lang.String r5 = "GET /"
            boolean r5 = r4.startsWith(r5)     // Catch:{ all -> 0x00eb }
            if (r5 == 0) goto L_0x0013
            r5 = 47
            int r5 = r4.indexOf(r5)     // Catch:{ all -> 0x00eb }
            int r5 = r5 + 1
            r6 = 32
            int r6 = r4.indexOf(r6, r5)     // Catch:{ all -> 0x00eb }
            java.lang.String r4 = r4.substring(r5, r6)     // Catch:{ all -> 0x00eb }
            goto L_0x0039
        L_0x0038:
            r4 = r2
        L_0x0039:
            if (r4 == 0) goto L_0x0049
            boolean r5 = r4.isEmpty()     // Catch:{ all -> 0x00eb }
            if (r5 == 0) goto L_0x0042
            goto L_0x0049
        L_0x0042:
            java.lang.String r5 = "UTF-8"
            java.lang.String r4 = java.net.URLDecoder.decode(r4, r5)     // Catch:{ all -> 0x00eb }
            goto L_0x004b
        L_0x0049:
            java.lang.String r4 = "index.html"
        L_0x004b:
            java.lang.String r5 = "route="
            android.util.Log.d(r5, r4)     // Catch:{ all -> 0x00eb }
            java.lang.String r5 = r4.replace(r1, r0)     // Catch:{ all -> 0x00eb }
            r9.mo1419b(r5)     // Catch:{ all -> 0x00eb }
            JU r5 = r9.f1392e     // Catch:{ all -> 0x00eb }
            java.util.List<LL> r6 = r9.f1396i     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = r4.replace(r1, r0)     // Catch:{ all -> 0x00eb }
            double r7 = r9.f1394g     // Catch:{ all -> 0x00eb }
            r5.mo518a(r6, r0, r7)     // Catch:{ all -> 0x00eb }
            java.io.PrintStream r0 = new java.io.PrintStream     // Catch:{ all -> 0x00eb }
            java.io.OutputStream r10 = r10.getOutputStream()     // Catch:{ all -> 0x00eb }
            r0.<init>(r10)     // Catch:{ all -> 0x00eb }
            if (r4 == 0) goto L_0x00df
            java.lang.String r10 = "favicon.ico"
            boolean r10 = r4.equals(r10)     // Catch:{ all -> 0x00e9 }
            if (r10 != 0) goto L_0x00df
            java.lang.String r10 = ".html"
            boolean r10 = r4.contains(r10)     // Catch:{ all -> 0x00e9 }
            if (r10 != 0) goto L_0x0086
            boolean r10 = r4.contains(r1)     // Catch:{ all -> 0x00e9 }
            if (r10 != 0) goto L_0x0086
            goto L_0x00df
        L_0x0086:
            java.io.File r10 = new java.io.File     // Catch:{ all -> 0x00e9 }
            java.lang.String r1 = p000.C0195JU.f441a     // Catch:{ all -> 0x00e9 }
            r10.<init>(r1, r4)     // Catch:{ all -> 0x00e9 }
            byte[] r10 = r9.mo1417a(r10)     // Catch:{ all -> 0x00e9 }
            if (r10 != 0) goto L_0x009d
            r9.mo1415a(r0)     // Catch:{ all -> 0x00e9 }
            r0.close()
            r3.close()
            return
        L_0x009d:
            java.lang.String r1 = "HTTP/1.0 200 OK"
            r0.println(r1)     // Catch:{ all -> 0x00e9 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e9 }
            r1.<init>()     // Catch:{ all -> 0x00e9 }
            java.lang.String r2 = "Content-Type: "
            r1.append(r2)     // Catch:{ all -> 0x00e9 }
            java.lang.String r2 = r9.mo1413a(r4)     // Catch:{ all -> 0x00e9 }
            r1.append(r2)     // Catch:{ all -> 0x00e9 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e9 }
            r0.println(r1)     // Catch:{ all -> 0x00e9 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e9 }
            r1.<init>()     // Catch:{ all -> 0x00e9 }
            java.lang.String r2 = "Content-Length: "
            r1.append(r2)     // Catch:{ all -> 0x00e9 }
            int r2 = r10.length     // Catch:{ all -> 0x00e9 }
            r1.append(r2)     // Catch:{ all -> 0x00e9 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e9 }
            r0.println(r1)     // Catch:{ all -> 0x00e9 }
            r0.println()     // Catch:{ all -> 0x00e9 }
            r0.write(r10)     // Catch:{ all -> 0x00e9 }
            r0.flush()     // Catch:{ all -> 0x00e9 }
            r0.close()
            r3.close()
            return
        L_0x00df:
            r9.mo1415a(r0)     // Catch:{ all -> 0x00e9 }
            r0.close()
            r3.close()
            return
        L_0x00e9:
            r10 = move-exception
            goto L_0x00f1
        L_0x00eb:
            r10 = move-exception
            r0 = r2
            goto L_0x00f1
        L_0x00ee:
            r10 = move-exception
            r0 = r2
            r3 = r0
        L_0x00f1:
            if (r0 == 0) goto L_0x00f6
            r0.close()
        L_0x00f6:
            if (r3 == 0) goto L_0x00fb
            r3.close()
        L_0x00fb:
            goto L_0x00fd
        L_0x00fc:
            throw r10
        L_0x00fd:
            goto L_0x00fc
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0486WU.mo1416a(java.net.Socket):void");
    }

    /* renamed from: a */
    public byte[] mo1417a(File file) {
        int length = (int) file.length();
        byte[] bArr = new byte[length];
        byte[] bArr2 = new byte[length];
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            int read = fileInputStream.read(bArr, 0, length);
            if (read < length) {
                int i = length - read;
                while (i > 0) {
                    int read2 = fileInputStream.read(bArr2, 0, i);
                    System.arraycopy(bArr2, 0, bArr, length - i, read2);
                    i -= read2;
                }
            }
            fileInputStream.close();
            return bArr;
        } catch (IOException e) {
            throw e;
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
    }

    /* renamed from: b */
    public void mo1418b() {
        try {
            this.f1390c = false;
            if (this.f1391d != null) {
                this.f1391d.close();
                this.f1391d = null;
            }
        } catch (IOException e) {
            Log.e("SimpleWebServer", "Error closing the server socket.", e);
        }
    }

    /* renamed from: b */
    public void mo1419b(String str) {
        Cursor l = this.f1392e.mo593l(str);
        l.getCount();
        this.f1394g = 0.0d;
        this.f1396i.clear();
        l.moveToFirst();
        while (!l.isAfterLast()) {
            List<C0232LL> list = this.f1396i;
            String str2 = "_in";
            C0232LL ll = new C0232LL(l.getString(l.getColumnIndex("_id")), l.getString(l.getColumnIndex("date_")), l.getString(l.getColumnIndex("amount")), l.getString(l.getColumnIndex("remarks")), this.f1395h[l.getInt(l.getColumnIndex(str2))], String.valueOf(l.getInt(l.getColumnIndex(str2))), l.getString(l.getColumnIndex("param1")));
            list.add(ll);
            l.moveToNext();
        }
        l.close();
        for (int size = this.f1396i.size() - 1; size >= 0; size--) {
            this.f1394g += Double.parseDouble(((C0232LL) this.f1396i.get(size)).mo775f().replaceAll(",", "")) * (Double.parseDouble(((C0232LL) this.f1396i.get(size)).mo770c()) - 1.0d);
            C0232LL ll2 = (C0232LL) this.f1396i.get(size);
            ll2.mo769b(String.valueOf(this.f1394g));
            this.f1396i.set(size, ll2);
        }
    }

    public void run() {
        try {
            this.f1391d = new ServerSocket(this.f1388a);
            while (this.f1390c) {
                Socket accept = this.f1391d.accept();
                mo1416a(accept);
                accept.close();
            }
        } catch (SocketException unused) {
        } catch (IOException e) {
            Log.e("SimpleWebServer", "Web server error.", e);
        }
    }
}
