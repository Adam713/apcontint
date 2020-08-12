package p000;

import java.io.PrintWriter;

/* renamed from: xH */
public class C1152xH {

    /* renamed from: a */
    public final int f4070a;

    /* renamed from: b */
    public final int f4071b;

    /* renamed from: c */
    public final long f4072c;

    /* renamed from: d */
    public final long f4073d;

    /* renamed from: e */
    public final long f4074e;

    /* renamed from: f */
    public final long f4075f;

    /* renamed from: g */
    public final long f4076g;

    /* renamed from: h */
    public final long f4077h;

    /* renamed from: i */
    public final long f4078i;

    /* renamed from: j */
    public final long f4079j;

    /* renamed from: k */
    public final int f4080k;

    /* renamed from: l */
    public final int f4081l;

    /* renamed from: m */
    public final int f4082m;

    /* renamed from: n */
    public final long f4083n;

    public C1152xH(int i, int i2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i3, int i4, int i5, long j9) {
        this.f4070a = i;
        this.f4071b = i2;
        this.f4072c = j;
        this.f4073d = j2;
        this.f4074e = j3;
        this.f4075f = j4;
        this.f4076g = j5;
        this.f4077h = j6;
        this.f4078i = j7;
        this.f4079j = j8;
        this.f4080k = i3;
        this.f4081l = i4;
        this.f4082m = i5;
        this.f4083n = j9;
    }

    /* renamed from: a */
    public void mo5402a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f4070a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f4071b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((double) ((((float) this.f4071b) / ((float) this.f4070a)) * 100.0f)));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f4072c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f4073d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f4080k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f4074e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f4077h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f4081l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f4075f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f4082m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f4076g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f4078i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f4079j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StatsSnapshot{maxSize=");
        sb.append(this.f4070a);
        sb.append(", size=");
        sb.append(this.f4071b);
        sb.append(", cacheHits=");
        sb.append(this.f4072c);
        sb.append(", cacheMisses=");
        sb.append(this.f4073d);
        sb.append(", downloadCount=");
        sb.append(this.f4080k);
        sb.append(", totalDownloadSize=");
        sb.append(this.f4074e);
        sb.append(", averageDownloadSize=");
        sb.append(this.f4077h);
        sb.append(", totalOriginalBitmapSize=");
        sb.append(this.f4075f);
        sb.append(", totalTransformedBitmapSize=");
        sb.append(this.f4076g);
        sb.append(", averageOriginalBitmapSize=");
        sb.append(this.f4078i);
        sb.append(", averageTransformedBitmapSize=");
        sb.append(this.f4079j);
        sb.append(", originalBitmapCount=");
        sb.append(this.f4081l);
        sb.append(", transformedBitmapCount=");
        sb.append(this.f4082m);
        sb.append(", timeStamp=");
        sb.append(this.f4083n);
        sb.append('}');
        return sb.toString();
    }
}
