package com.adam.myapplication;


import android.annotation.TargetApi;
import android.app.KeyguardManager;
import android.content.Intent;
import android.hardware.fingerprint.FingerprintManager;
import android.hardware.fingerprint.FingerprintManager.CryptoObject;
import android.os.Build.VERSION;
import android.os.Process;
import android.security.keystore.KeyGenParameterSpec.Builder;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class LoginActivity extends AppCompatActivity {

    /* renamed from: a */
    public AutoCompleteTextView f2529a;

    /* renamed from: b */
    public EditText f2530b;

    /* renamed from: c */
    public KeyStore f2531c;

    /* renamed from: d */
    public Cipher f2532d;

    /* renamed from: e */
    public TextView f2533e;

    /* JADX WARNING: type inference failed for: r2v0, types: [com.valdio.valdioveliu.recyclerview.LoginActivity, android.app.Activity] */
    /* renamed from: a */
    public final void mo3882a() {
        this.f2530b.setError(null);
        if (this.f2530b.getText().toString().equals(C0195JU.f450j)) {
            C0195JU.f449i = "1";
            mo3886e();
            return;
        }
        this.f2530b.setError(getString(2131755176));
        this.f2530b.requestFocus();
    }

    @TargetApi(23)
    /* renamed from: b */
    public boolean mo3883b() {
        try {
            this.f2532d = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                this.f2531c.load(null);
                this.f2532d.init(1, (SecretKey) this.f2531c.getKey("inv_key", null));
                return true;
            } catch (KeyPermanentlyInvalidatedException unused) {
                return false;
            } catch (IOException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException | CertificateException e) {
                throw new RuntimeException("Failed to init Cipher", e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException("Failed to get Cipher", e2);
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.LoginActivity, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    /* renamed from: c */
    public void mo3884c() {
        TextView textView;
        String str;
        try {
            KeyguardManager keyguardManager = (KeyguardManager) getSystemService("keyguard");
            FingerprintManager fingerprintManager = null;
            if (VERSION.SDK_INT >= 23) {
                fingerprintManager = (FingerprintManager) getSystemService("fingerprint");
            }
            this.f2533e = (TextView) findViewById(2131296445);
            if (VERSION.SDK_INT >= 23) {
                if (!fingerprintManager.isHardwareDetected()) {
                    textView = this.f2533e;
                    str = "Your Device does not have a Fingerprint Sensor";
                } else if (ContextCompat.checkSelfPermission(this, "android.permission.USE_FINGERPRINT") != 0) {
                    textView = this.f2533e;
                    str = "Fingerprint authentication permission not enabled";
                } else if (!fingerprintManager.hasEnrolledFingerprints()) {
                    textView = this.f2533e;
                    str = "Register at least one fingerprint in Settings";
                } else if (!keyguardManager.isKeyguardSecure()) {
                    textView = this.f2533e;
                    str = "Lock screen security not enabled in Settings";
                } else {
                    mo3885d();
                    if (mo3883b()) {
                        new C0624bM(this).mo1903a(fingerprintManager, new CryptoObject(this.f2532d));
                        return;
                    }
                    return;
                }
                textView.setText(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @TargetApi(23)
    /* renamed from: d */
    public void mo3885d() {
        String str = "AndroidKeyStore";
        try {
            this.f2531c = KeyStore.getInstance(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            KeyGenerator instance = KeyGenerator.getInstance("AES", str);
            try {
                this.f2531c.load(null);
                instance.init(new Builder("inv_key", 3).setBlockModes(new String[]{"CBC"}).setUserAuthenticationRequired(true).setEncryptionPaddings(new String[]{"PKCS7Padding"}).build());
                instance.generateKey();
            } catch (IOException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | CertificateException e2) {
                throw new RuntimeException(e2);
            }
        } catch (NoSuchAlgorithmException | NoSuchProviderException e3) {
            throw new RuntimeException("Failed to get KeyGenerator instance", e3);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.LoginActivity, android.app.Activity] */
    /* renamed from: e */
    public final void mo3886e() {
        startActivity(new Intent(this, FragmentStatePagerSupport_Main.class));
        finish();
    }

    public void onBackPressed() {
        Process.killProcess(Process.myPid());
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0030 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r3) {
        /*
            r2 = this;
            com.valdio.valdioveliu.recyclerview.LoginActivity.super.onCreate(r3)
            r3 = 2131492897(0x7f0c0021, float:1.8609259E38)
            r2.setContentView(r3)
            r3 = 2131296437(0x7f0900b5, float:1.821079E38)
            android.view.View r3 = r2.findViewById(r3)     // Catch:{ Exception -> 0x0030 }
            android.widget.AutoCompleteTextView r3 = (android.widget.AutoCompleteTextView) r3     // Catch:{ Exception -> 0x0030 }
            r2.f2529a = r3     // Catch:{ Exception -> 0x0030 }
            r3 = 2131296567(0x7f090137, float:1.8211054E38)
            android.view.View r3 = r2.findViewById(r3)     // Catch:{ Exception -> 0x0030 }
            android.widget.EditText r3 = (android.widget.EditText) r3     // Catch:{ Exception -> 0x0030 }
            r2.f2530b = r3     // Catch:{ Exception -> 0x0030 }
            r3 = 2131296439(0x7f0900b7, float:1.8210795E38)
            android.view.View r3 = r2.findViewById(r3)     // Catch:{ Exception -> 0x0030 }
            android.widget.Button r3 = (android.widget.Button) r3     // Catch:{ Exception -> 0x0030 }
            VM r0 = new VM     // Catch:{ Exception -> 0x0030 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0030 }
            r3.setOnClickListener(r0)     // Catch:{ Exception -> 0x0030 }
        L_0x0030:
            r2.mo3884c()     // Catch:{ Exception -> 0x0034 }
            goto L_0x0052
        L_0x0034:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.getMessage()
            r0.append(r1)
            java.lang.String r1 = ""
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "login_err="
            android.util.Log.d(r1, r0)
            r3.printStackTrace()
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adam.myapplication.LoginActivity.onCreate(android.os.Bundle):void");
    }
}
