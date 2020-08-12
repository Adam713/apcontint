package p000;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp;

/* renamed from: SN */
class C0391SN extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ Report3_balance_month_exp f1154a;

    public C0391SN(Report3_balance_month_exp report3_balance_month_exp) {
        this.f1154a = report3_balance_month_exp;
    }

    public void onPageFinished(WebView webView, String str) {
        webView.loadUrl("javascript:DisplayItem_details('5','6','0')");
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.loadUrl(str);
        return true;
    }
}
