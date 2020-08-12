package p000;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: VL */
class C0456VL implements FilenameFilter {

    /* renamed from: a */
    public final /* synthetic */ ArrayList f1310a;

    public C0456VL(ArrayList arrayList) {
        this.f1310a = arrayList;
    }

    public boolean accept(File file, String str) {
        boolean isDirectory = new File(String.format("%s/%s", new Object[]{file.getAbsolutePath(), str})).isDirectory();
        if (!isDirectory) {
            Iterator it = this.f1310a.iterator();
            while (it.hasNext()) {
                String upperCase = String.format(".{0,}\\%s$", new Object[]{(String) it.next()}).toUpperCase(Locale.getDefault());
                str = str.toUpperCase(Locale.getDefault());
                isDirectory = str.matches(upperCase);
                if (isDirectory) {
                    break;
                }
            }
        }
        return isDirectory;
    }
}
