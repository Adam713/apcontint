package p000;

import java.io.File;
import java.util.Comparator;

/* renamed from: _L */
class C0569_L implements Comparator<File> {

    /* renamed from: a */
    public final /* synthetic */ C0600aM f1729a;

    public C0569_L(C0600aM aMVar) {
        this.f1729a = aMVar;
    }

    /* renamed from: a */
    public int compare(File file, File file2) {
        return Long.valueOf(file2.lastModified()).compareTo(Long.valueOf(file.lastModified()));
    }
}
