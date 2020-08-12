package p000;

import java.io.PrintStream;
import java.io.PrintWriter;

/* renamed from: XV */
public class C0508XV extends RuntimeException {

    /* renamed from: a */
    public Throwable f1454a;

    public C0508XV() {
    }

    public C0508XV(String str) {
        super(str);
    }

    public C0508XV(Throwable th) {
        this.f1454a = th;
    }

    /* renamed from: a */
    public Throwable mo1466a() {
        return this.f1454a;
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public void printStackTrace(PrintStream printStream) {
        Throwable a = mo1466a();
        super.printStackTrace(printStream);
        if (a != null) {
            printStream.println("Caused by:");
            a.printStackTrace(printStream);
        }
    }

    public void printStackTrace(PrintWriter printWriter) {
        Throwable a = mo1466a();
        super.printStackTrace(printWriter);
        if (a != null) {
            printWriter.println("Caused by:");
            a.printStackTrace(printWriter);
        }
    }
}
