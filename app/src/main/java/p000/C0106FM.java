package p000;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.valdio.valdioveliu.recyclerview.Google_drive_list;

/* renamed from: FM */
class C0106FM extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ Google_drive_list f244a;

    public C0106FM(Google_drive_list google_drive_list) {
        this.f244a = google_drive_list;
    }

    public void onPageFinished(WebView webView, String str) {
        webView.loadUrl("javascript:DisplayItem_details('2','8','7')");
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.loadUrl(str);
        return true;
    }
}
