package p000;

import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.valdio.valdioveliu.recyclerview.Google_drive_list;

/* renamed from: HM */
class C0148HM implements HttpRequestInitializer {

    /* renamed from: a */
    public final /* synthetic */ HttpRequestInitializer f327a;

    /* renamed from: b */
    public final /* synthetic */ Google_drive_list f328b;

    public C0148HM(Google_drive_list google_drive_list, HttpRequestInitializer httpRequestInitializer) {
        this.f328b = google_drive_list;
        this.f327a = httpRequestInitializer;
    }

    public void initialize(HttpRequest httpRequest) {
        this.f327a.initialize(httpRequest);
        httpRequest.setConnectTimeout(180000);
        httpRequest.setReadTimeout(180000);
    }
}
