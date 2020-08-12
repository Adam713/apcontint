package p000;

import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;

/* renamed from: TU */
class C0418TU implements HttpRequestInitializer {

    /* renamed from: a */
    public final /* synthetic */ HttpRequestInitializer f1193a;

    /* renamed from: b */
    public final /* synthetic */ C0444UU f1194b;

    public C0418TU(C0444UU uu, HttpRequestInitializer httpRequestInitializer) {
        this.f1194b = uu;
        this.f1193a = httpRequestInitializer;
    }

    public void initialize(HttpRequest httpRequest) {
        this.f1193a.initialize(httpRequest);
        httpRequest.setConnectTimeout(180000);
        httpRequest.setReadTimeout(180000);
    }
}
