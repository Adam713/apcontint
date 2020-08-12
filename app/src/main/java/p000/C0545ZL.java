package p000;

import java.io.File;
import java.util.Comparator;

/* renamed from: ZL */
class C0545ZL implements Comparator<File> {

    /* renamed from: a */
    public final /* synthetic */ C0600aM f1649a;

    public C0545ZL(C0600aM aMVar) {
        this.f1649a = aMVar;
    }

    /* renamed from: a */
    public int compare(File file, File file2) {
        return Long.valueOf(file2.lastModified()).compareTo(Long.valueOf(file.lastModified()));
    }
}
