package p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.hardware.fingerprint.FingerprintManager.AuthenticationCallback;
import android.hardware.fingerprint.FingerprintManager.AuthenticationResult;
import android.hardware.fingerprint.FingerprintManager.CryptoObject;
import android.os.CancellationSignal;
import android.support.v4.content.ContextCompat;
import android.widget.TextView;

@TargetApi(23)
/* renamed from: bM */
public class C0624bM extends AuthenticationCallback {

    /* renamed from: a */
    public Context f1901a;

    public C0624bM(Context context) {
        this.f1901a = context;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [com.valdio.valdioveliu.recyclerview.LoginActivity, android.app.Activity] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v4, types: [com.valdio.valdioveliu.recyclerview.LoginActivity, android.app.Activity]
      assigns: [com.valdio.valdioveliu.recyclerview.LoginActivity]
      uses: [android.app.Activity]
      mth insns count: 14
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1902a() {
        /*
            r3 = this;
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x001b }
            android.content.Context r1 = r3.f1901a     // Catch:{ Exception -> 0x001b }
            java.lang.Class<com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main> r2 = com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.class
            r0.<init>(r1, r2)     // Catch:{ Exception -> 0x001b }
            android.content.Context r1 = r3.f1901a     // Catch:{ Exception -> 0x001b }
            r1.startActivity(r0)     // Catch:{ Exception -> 0x001b }
            android.content.Context r0 = r3.f1901a     // Catch:{ Exception -> 0x001b }
            boolean r0 = r0 instanceof com.valdio.valdioveliu.recyclerview.LoginActivity     // Catch:{ Exception -> 0x001b }
            if (r0 == 0) goto L_0x001b
            android.content.Context r0 = r3.f1901a     // Catch:{ Exception -> 0x001b }
            com.valdio.valdioveliu.recyclerview.LoginActivity r0 = (com.valdio.valdioveliu.recyclerview.LoginActivity) r0     // Catch:{ Exception -> 0x001b }
            r0.finish()     // Catch:{ Exception -> 0x001b }
        L_0x001b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0624bM.mo1902a():void");
    }

    /* renamed from: a */
    public void mo1903a(FingerprintManager fingerprintManager, CryptoObject cryptoObject) {
        try {
            CancellationSignal cancellationSignal = new CancellationSignal();
            if (ContextCompat.checkSelfPermission(this.f1901a, "android.permission.USE_FINGERPRINT") == 0) {
                fingerprintManager.authenticate(cryptoObject, cancellationSignal, 0, this, null);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void mo1904a(String str, Boolean bool) {
        try {
            TextView textView = (TextView) ((Activity) this.f1901a).findViewById(2131296445);
            textView.setText(str);
            if (bool.booleanValue()) {
                textView.setTextColor(ContextCompat.getColor(this.f1901a, 2131099729));
                C0195JU.f449i = "1";
                mo1902a();
            }
        } catch (Exception unused) {
        }
    }

    public void onAuthenticationError(int i, CharSequence charSequence) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("Fingerprint Authentication error\n");
            sb.append(charSequence);
            mo1904a(sb.toString(), Boolean.valueOf(false));
        } catch (Exception unused) {
        }
    }

    public void onAuthenticationFailed() {
        try {
            mo1904a(this.f1901a.getString(2131755184), Boolean.valueOf(false));
        } catch (Exception unused) {
        }
    }

    public void onAuthenticationHelp(int i, CharSequence charSequence) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("Fingerprint Authentication help\n");
            sb.append(charSequence);
            mo1904a(sb.toString(), Boolean.valueOf(false));
        } catch (Exception unused) {
        }
    }

    public void onAuthenticationSucceeded(AuthenticationResult authenticationResult) {
        try {
            mo1904a(this.f1901a.getString(2131755185), Boolean.valueOf(true));
        } catch (Exception unused) {
        }
    }
}
