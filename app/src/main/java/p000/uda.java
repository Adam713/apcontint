package p000;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.StringRes;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog.Builder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: uda */
public class uda {

    /* renamed from: uda$a */
    public interface C1104a extends OnRequestPermissionsResultCallback {
        /* renamed from: a */
        void mo3824a(int i, List<String> list);

        /* renamed from: b */
        void mo3827b(int i, List<String> list);
    }

    /* renamed from: a */
    public static void m3547a(int i, String[] strArr, int[] iArr, Object obj) {
        m3548a(obj);
        C1104a aVar = (C1104a) obj;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            if (iArr[i2] == 0) {
                arrayList.add(str);
            } else {
                arrayList2.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            aVar.mo3827b(i, arrayList);
        }
        if (!arrayList2.isEmpty()) {
            aVar.mo3824a(i, arrayList2);
        }
        if (!arrayList.isEmpty() && arrayList2.isEmpty()) {
            m3549a(obj, i);
        }
    }

    /* renamed from: a */
    public static void m3548a(Object obj) {
        if (!(obj instanceof Fragment) && !(obj instanceof Activity)) {
            throw new IllegalArgumentException("Caller must be an Activity or a Fragment.");
        } else if (!(obj instanceof C1104a)) {
            throw new IllegalArgumentException("Caller must implement PermissionCallbacks.");
        }
    }

    /* renamed from: a */
    public static void m3549a(Object obj, int i) {
        Method[] declaredMethods;
        String str;
        String str2 = "EasyPermissions";
        for (Method method : obj.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(rda.class) && method.getAnnotation(rda.class).value() == i) {
                if (method.getParameterTypes().length > 0) {
                    String str3 = "Cannot execute non-void method ";
                    String valueOf = String.valueOf(method.getName());
                    throw new RuntimeException(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                }
                try {
                    if (!method.isAccessible()) {
                        method.setAccessible(true);
                    }
                    method.invoke(obj, new Object[0]);
                } catch (IllegalAccessException e) {
                    e = e;
                    str = "runDefaultMethod:IllegalAccessException";
                    Log.e(str2, str, e);
                } catch (InvocationTargetException e2) {
                    e = e2;
                    str = "runDefaultMethod:InvocationTargetException";
                    Log.e(str2, str, e);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m3550a(Object obj, String str, @StringRes int i, @StringRes int i2, int i3, String... strArr) {
        m3548a(obj);
        C1104a aVar = (C1104a) obj;
        boolean z = false;
        for (String a : strArr) {
            z = z || m3554a(obj, a);
        }
        if (z) {
            new Builder(m3555b(obj)).setMessage(str).setPositiveButton(i, new tda(obj, strArr, i3)).setNegativeButton(i2, new sda(aVar, i3, strArr)).create().show();
        } else {
            m3556b(obj, strArr, i3);
        }
    }

    /* renamed from: a */
    public static void m3551a(Object obj, String str, int i, String... strArr) {
        m3550a(obj, str, 17039370, 17039360, i, strArr);
    }

    /* renamed from: a */
    public static boolean m3553a(Context context, String... strArr) {
        int length = strArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                return true;
            }
            if (ContextCompat.checkSelfPermission(context, strArr[i]) != 0) {
                z = false;
            }
            if (!z) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: a */
    public static boolean m3554a(Object obj, String str) {
        if (obj instanceof Activity) {
            return ActivityCompat.shouldShowRequestPermissionRationale((Activity) obj, str);
        }
        if (obj instanceof Fragment) {
            return ((Fragment) obj).shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    /* renamed from: b */
    public static Activity m3555b(Object obj) {
        if (obj instanceof Activity) {
            return (Activity) obj;
        }
        if (obj instanceof Fragment) {
            return ((Fragment) obj).getActivity();
        }
        return null;
    }

    /* renamed from: b */
    public static void m3556b(Object obj, String[] strArr, int i) {
        m3548a(obj);
        if (obj instanceof Activity) {
            ActivityCompat.requestPermissions((Activity) obj, strArr, i);
        } else if (obj instanceof Fragment) {
            ((Fragment) obj).requestPermissions(strArr, i);
        }
    }
}
