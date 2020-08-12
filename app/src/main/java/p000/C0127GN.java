package p000;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.valdio.valdioveliu.recyclerview.Report3_balance_month;

/* renamed from: GN */
class C0127GN extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ Report3_balance_month f279a;

    public C0127GN(Report3_balance_month report3_balance_month) {
        this.f279a = report3_balance_month;
    }

    public void onPageFinished(WebView webView, String str) {
        webView.loadUrl("javascript:DisplayItem_details('5','6','0')");
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.loadUrl(str);
        return true;
    }
}
