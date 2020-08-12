package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: qW */
public class C1018qW {

    /* renamed from: a */
    public static Map f3617a;

    /* renamed from: b */
    public static Map f3618b;

    /* renamed from: c */
    public static final Integer f3619c = Integer.valueOf(-2);

    /* renamed from: d */
    public static final Integer f3620d = Integer.valueOf(-1);

    /* renamed from: e */
    public static final Integer f3621e = Integer.valueOf(0);

    /* renamed from: f */
    public static final Integer f3622f = Integer.valueOf(2);

    /* renamed from: g */
    public static final Integer f3623g = Integer.valueOf(4);

    /* renamed from: h */
    public static final Integer f3624h = Integer.valueOf(8);

    static {
        HashMap hashMap = new HashMap();
        Long valueOf = Long.valueOf(0);
        hashMap.put(valueOf, "VT_EMPTY");
        Long valueOf2 = Long.valueOf(1);
        hashMap.put(valueOf2, "VT_NULL");
        Long valueOf3 = Long.valueOf(2);
        hashMap.put(valueOf3, "VT_I2");
        Long valueOf4 = Long.valueOf(3);
        hashMap.put(valueOf4, "VT_I4");
        Long valueOf5 = Long.valueOf(4);
        hashMap.put(valueOf5, "VT_R4");
        Long valueOf6 = Long.valueOf(5);
        hashMap.put(valueOf6, "VT_R8");
        Long valueOf7 = Long.valueOf(6);
        hashMap.put(valueOf7, "VT_CY");
        hashMap.put(Long.valueOf(7), "VT_DATE");
        hashMap.put(Long.valueOf(8), "VT_BSTR");
        hashMap.put(Long.valueOf(9), "VT_DISPATCH");
        hashMap.put(Long.valueOf(10), "VT_ERROR");
        hashMap.put(Long.valueOf(11), "VT_BOOL");
        hashMap.put(Long.valueOf(12), "VT_VARIANT");
        hashMap.put(Long.valueOf(13), "VT_UNKNOWN");
        hashMap.put(Long.valueOf(14), "VT_DECIMAL");
        hashMap.put(Long.valueOf(16), "VT_I1");
        hashMap.put(Long.valueOf(17), "VT_UI1");
        hashMap.put(Long.valueOf(18), "VT_UI2");
        hashMap.put(Long.valueOf(19), "VT_UI4");
        hashMap.put(Long.valueOf(20), "VT_I8");
        hashMap.put(Long.valueOf(21), "VT_UI8");
        hashMap.put(Long.valueOf(22), "VT_INT");
        hashMap.put(Long.valueOf(23), "VT_UINT");
        hashMap.put(Long.valueOf(24), "VT_VOID");
        hashMap.put(Long.valueOf(25), "VT_HRESULT");
        hashMap.put(Long.valueOf(26), "VT_PTR");
        hashMap.put(Long.valueOf(27), "VT_SAFEARRAY");
        hashMap.put(Long.valueOf(28), "VT_CARRAY");
        hashMap.put(Long.valueOf(29), "VT_USERDEFINED");
        hashMap.put(Long.valueOf(30), "VT_LPSTR");
        hashMap.put(Long.valueOf(31), "VT_LPWSTR");
        hashMap.put(Long.valueOf(64), "VT_FILETIME");
        hashMap.put(Long.valueOf(65), "VT_BLOB");
        hashMap.put(Long.valueOf(66), "VT_STREAM");
        hashMap.put(Long.valueOf(67), "VT_STORAGE");
        hashMap.put(Long.valueOf(68), "VT_STREAMED_OBJECT");
        hashMap.put(Long.valueOf(69), "VT_STORED_OBJECT");
        hashMap.put(Long.valueOf(70), "VT_BLOB_OBJECT");
        hashMap.put(Long.valueOf(71), "VT_CF");
        hashMap.put(Long.valueOf(72), "VT_CLSID");
        HashMap hashMap2 = new HashMap(hashMap.size(), 1.0f);
        hashMap2.putAll(hashMap);
        f3617a = Collections.unmodifiableMap(hashMap2);
        hashMap.clear();
        hashMap.put(valueOf, f3621e);
        hashMap.put(valueOf2, f3619c);
        hashMap.put(valueOf3, f3622f);
        hashMap.put(valueOf4, f3623g);
        hashMap.put(valueOf5, f3623g);
        hashMap.put(valueOf6, f3624h);
        hashMap.put(valueOf7, f3619c);
        hashMap.put(Long.valueOf(7), f3619c);
        hashMap.put(Long.valueOf(8), f3619c);
        hashMap.put(Long.valueOf(9), f3619c);
        hashMap.put(Long.valueOf(10), f3619c);
        hashMap.put(Long.valueOf(11), f3619c);
        hashMap.put(Long.valueOf(12), f3619c);
        hashMap.put(Long.valueOf(13), f3619c);
        hashMap.put(Long.valueOf(14), f3619c);
        hashMap.put(Long.valueOf(16), f3619c);
        hashMap.put(Long.valueOf(17), f3619c);
        hashMap.put(Long.valueOf(18), f3619c);
        hashMap.put(Long.valueOf(19), f3619c);
        hashMap.put(Long.valueOf(20), f3619c);
        hashMap.put(Long.valueOf(21), f3619c);
        hashMap.put(Long.valueOf(22), f3619c);
        hashMap.put(Long.valueOf(23), f3619c);
        hashMap.put(Long.valueOf(24), f3619c);
        hashMap.put(Long.valueOf(25), f3619c);
        hashMap.put(Long.valueOf(26), f3619c);
        hashMap.put(Long.valueOf(27), f3619c);
        hashMap.put(Long.valueOf(28), f3619c);
        hashMap.put(Long.valueOf(29), f3619c);
        hashMap.put(Long.valueOf(30), f3620d);
        hashMap.put(Long.valueOf(31), f3619c);
        hashMap.put(Long.valueOf(64), f3624h);
        hashMap.put(Long.valueOf(65), f3619c);
        hashMap.put(Long.valueOf(66), f3619c);
        hashMap.put(Long.valueOf(67), f3619c);
        hashMap.put(Long.valueOf(68), f3619c);
        hashMap.put(Long.valueOf(69), f3619c);
        hashMap.put(Long.valueOf(70), f3619c);
        hashMap.put(Long.valueOf(71), f3619c);
        hashMap.put(Long.valueOf(72), f3619c);
        HashMap hashMap3 = new HashMap(hashMap.size(), 1.0f);
        hashMap3.putAll(hashMap);
        f3618b = Collections.unmodifiableMap(hashMap3);
    }

    /* renamed from: a */
    public static String m3336a(long j) {
        String str = (String) f3617a.get(Long.valueOf(j));
        return str != null ? str : "unknown variant type";
    }
}
