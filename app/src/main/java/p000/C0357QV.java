package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;

/* renamed from: QV */
public abstract class C0357QV {

    /* renamed from: a */
    public static final nda f1054a = mda.m3128a(C0357QV.class);

    /* renamed from: b */
    public C0910lW f1055b;

    /* renamed from: c */
    public C0466VV f1056c;

    /* renamed from: d */
    public Pba f1057d;

    /* renamed from: e */
    public Gba f1058e;

    /* renamed from: f */
    public boolean f1059f = false;

    public C0357QV(Gba gba, Pba pba) {
        this.f1057d = pba;
        this.f1058e = gba;
    }

    /* renamed from: a */
    public final void mo1115a(Lba lba, Fba fba) {
        if (lba.mo316b()) {
            Fba a = fba.mo257a(lba.getName());
            Iterator a2 = ((Fba) lba).mo259a();
            while (a2.hasNext()) {
                mo1115a((Lba) a2.next(), a);
            }
            return;
        }
        Hba hba = (Hba) lba;
        Iba iba = new Iba(hba);
        fba.mo258a(hba.getName(), iba);
        iba.close();
    }

    /* renamed from: a */
    public void mo1116a(Pba pba, Pba pba2, List list) {
        Gba a = pba.mo1065a();
        Gba a2 = pba2.mo1065a();
        Iterator a3 = a.mo259a();
        while (a3.hasNext()) {
            Lba lba = (Lba) a3.next();
            if (!mo1119a(lba.getName(), list)) {
                mo1115a(lba, (Fba) a2);
            }
        }
    }

    /* renamed from: a */
    public void mo1117a(Pba pba, List list) {
        C0910lW d = mo1122d();
        if (d != null) {
            String str = "\u0005SummaryInformation";
            mo1118a(str, (C0804gW) d, pba);
            if (list != null) {
                list.add(str);
            }
        }
        C0466VV c = mo1121c();
        if (c != null) {
            String str2 = "\u0005DocumentSummaryInformation";
            mo1118a(str2, (C0804gW) c, pba);
            if (list != null) {
                list.add(str2);
            }
        }
    }

    /* renamed from: a */
    public void mo1118a(String str, C0804gW gWVar, Pba pba) {
        try {
            C0614aW aWVar = new C0614aW(gWVar);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            aWVar.mo1866a((OutputStream) byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            pba.mo1066a(new ByteArrayInputStream(byteArray), str);
            nda nda = f1054a;
            int i = nda.f3487b;
            StringBuilder sb = new StringBuilder();
            sb.append("Wrote property set ");
            sb.append(str);
            sb.append(" of size ");
            sb.append(byteArray.length);
            nda.mo4700a(i, sb.toString());
        } catch (C1080tW unused) {
            PrintStream printStream = System.err;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Couldn't write property set with name ");
            sb2.append(str);
            sb2.append(" as not supported by HPSF yet");
            printStream.println(sb2.toString());
        }
    }

    /* renamed from: a */
    public final boolean mo1119a(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public C0804gW mo1120b(String str) {
        StringBuilder sb;
        int i;
        nda nda;
        String str2 = "Error creating property set with name ";
        String str3 = "\n";
        Gba gba = this.f1058e;
        if (gba == null) {
            return null;
        }
        try {
            try {
                return C0824hW.m2757a(gba.mo315b(str));
            } catch (IOException e) {
                e = e;
                nda = f1054a;
                i = nda.f3488c;
                sb = new StringBuilder();
                sb.append(str2);
                sb.append(str);
                sb.append(str3);
                sb.append(e);
                nda.mo4700a(i, sb.toString());
                return null;
            } catch (C0487WV e2) {
                e = e2;
                nda = f1054a;
                i = nda.f3488c;
                sb = new StringBuilder();
                sb.append(str2);
                sb.append(str);
                sb.append(str3);
                sb.append(e);
                nda.mo4700a(i, sb.toString());
                return null;
            }
        } catch (IOException e3) {
            nda nda2 = f1054a;
            int i2 = nda.f3488c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error getting property set with name ");
            sb2.append(str);
            sb2.append(str3);
            sb2.append(e3);
            nda2.mo4700a(i2, sb2.toString());
            return null;
        }
    }

    /* renamed from: c */
    public C0466VV mo1121c() {
        if (!this.f1059f) {
            mo1123e();
        }
        return this.f1056c;
    }

    /* renamed from: d */
    public C0910lW mo1122d() {
        if (!this.f1059f) {
            mo1123e();
        }
        return this.f1055b;
    }

    /* renamed from: e */
    public void mo1123e() {
        C0804gW b = mo1120b("\u0005DocumentSummaryInformation");
        if (b != null && (b instanceof C0466VV)) {
            this.f1056c = (C0466VV) b;
        } else if (b != null) {
            f1054a.mo4701a(nda.f3488c, (Object) "DocumentSummaryInformation property set came back with wrong class - ", (Object) b.getClass());
        }
        C0804gW b2 = mo1120b("\u0005SummaryInformation");
        if (b2 instanceof C0910lW) {
            this.f1055b = (C0910lW) b2;
        } else if (b2 != null) {
            f1054a.mo4701a(nda.f3488c, (Object) "SummaryInformation property set came back with wrong class - ", (Object) b2.getClass());
        }
        this.f1059f = true;
    }
}
