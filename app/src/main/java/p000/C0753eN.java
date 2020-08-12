package p000;

import android.util.Base64;
import com.itextpdf.text.xml.xmp.XmpWriter;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: eN */
public class C0753eN {

    /* renamed from: a */
    public static String f2906a = "a.19242891123456";

    /* renamed from: a */
    public static String m2610a(String str) {
        String str2 = "AES";
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(f2906a.getBytes(), str2);
            Cipher instance = Cipher.getInstance(str2);
            instance.init(1, secretKeySpec);
            return Base64.encodeToString(instance.doFinal(str.getBytes(XmpWriter.UTF8)), 0);
        } catch (Exception unused) {
            return null;
        }
    }
}
