package p000;

/* renamed from: oW */
public abstract class C0975oW extends C1060sW {
    public C0975oW(long j, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("HPSF does not yet support the variant type ");
        sb.append(j);
        sb.append(" (");
        sb.append(C1018qW.m3336a(j));
        sb.append(", ");
        sb.append(Yca.m1601c(j));
        sb.append("). If you want support for ");
        sb.append("this variant type in one of the next POI releases please ");
        sb.append("submit a request for enhancement (RFE) to ");
        sb.append("<http://issues.apache.org/bugzilla/>! Thank you!");
        super(j, obj, sb.toString());
    }
}
