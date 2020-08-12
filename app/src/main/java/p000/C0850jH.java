package p000;

import android.content.Context;
import android.net.Uri;
import com.squareup.okhttp.Cache;
import com.squareup.okhttp.CacheControl;
import com.squareup.okhttp.CacheControl.Builder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: jH */
public class C0850jH implements C0593aH {

    /* renamed from: a */
    public final OkHttpClient f3146a;

    public C0850jH(Context context) {
        this(C0039CH.m101b(context));
    }

    public C0850jH(OkHttpClient okHttpClient) {
        this.f3146a = okHttpClient;
    }

    public C0850jH(File file) {
        this(file, C0039CH.m87a(file));
    }

    public C0850jH(File file, long j) {
        this(m2854a());
        try {
            this.f3146a.setCache(new Cache(file, j));
        } catch (IOException unused) {
        }
    }

    /* renamed from: a */
    public static OkHttpClient m2854a() {
        OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.setConnectTimeout(15000, TimeUnit.MILLISECONDS);
        okHttpClient.setReadTimeout(20000, TimeUnit.MILLISECONDS);
        okHttpClient.setWriteTimeout(20000, TimeUnit.MILLISECONDS);
        return okHttpClient;
    }

    /* renamed from: a */
    public C0594a mo1a(Uri uri, int i) {
        CacheControl cacheControl;
        if (i == 0) {
            cacheControl = null;
        } else if (C0809hH.m2751a(i)) {
            cacheControl = CacheControl.FORCE_CACHE;
        } else {
            Builder builder = new Builder();
            if (!C0809hH.m2752b(i)) {
                builder.noCache();
            }
            if (!C0809hH.m2753c(i)) {
                builder.noStore();
            }
            cacheControl = builder.build();
        }
        Request.Builder url = new Request.Builder().url(uri.toString());
        if (cacheControl != null) {
            url.cacheControl(cacheControl);
        }
        Response execute = this.f3146a.newCall(url.build()).execute();
        int code = execute.code();
        if (code < 300) {
            boolean z = execute.cacheResponse() != null;
            ResponseBody body = execute.body();
            return new C0594a(body.byteStream(), z, body.contentLength());
        }
        execute.body().close();
        StringBuilder sb = new StringBuilder();
        sb.append(code);
        sb.append(" ");
        sb.append(execute.message());
        throw new C0595b(sb.toString(), i, code);
    }
}
