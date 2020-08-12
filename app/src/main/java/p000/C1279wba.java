package p000;

import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: wba reason: case insensitive filesystem */
public final class C1279wba extends C0357QV implements Hca {

    /* renamed from: g */
    public static final Pattern f4058g = Pattern.compile(",");

    /* renamed from: h */
    public static final int f4059h = nda.f3486a;

    /* renamed from: i */
    public static nda f4060i = mda.m3128a(C1279wba.class);

    /* renamed from: j */
    public static final String[] f4061j = {"Workbook", "WORKBOOK"};

    /* renamed from: k */
    public C1167xW f4062k;

    /* renamed from: l */
    public List f4063l;

    /* renamed from: m */
    public ArrayList f4064m;

    /* renamed from: n */
    public Hashtable f4065n;

    /* renamed from: o */
    public boolean f4066o;

    /* renamed from: p */
    public C0120a f4067p;

    /* renamed from: wba$a */
    private static final class C1151a implements C0768c {

        /* renamed from: a */
        public List f4068a = new ArrayList(128);

        /* renamed from: b */
        public int f4069b = 0;

        /* renamed from: a */
        public int mo5400a() {
            return this.f4069b;
        }

        /* renamed from: a */
        public int mo5401a(int i, byte[] bArr) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.f4068a.size(); i3++) {
                i2 += ((C0933mY) this.f4068a.get(i3)).mo162a(i + i2, bArr);
            }
            return i2;
        }

        /* renamed from: a */
        public void mo4341a(C0933mY mYVar) {
            this.f4068a.add(mYVar);
            this.f4069b += mYVar.mo163c();
        }
    }

    public C1279wba() {
        this(C1167xW.m3798z());
    }

    public C1279wba(C1167xW xWVar) {
        super(null, null);
        this.f4067p = Fca.f267d;
        this.f4062k = xWVar;
        this.f4063l = new ArrayList(3);
        this.f4064m = new ArrayList(3);
    }

    /* renamed from: a */
    public C1249mba m3753a() {
        return new C1249mba((short) (mo5396h() - 1), this.f4062k.mo5439d(), this);
    }

    /* renamed from: a */
    public C1261qba mo5393a(short s) {
        if (this.f4065n == null) {
            this.f4065n = new Hashtable();
        }
        Short valueOf = Short.valueOf(s);
        if (this.f4065n.containsKey(valueOf)) {
            return (C1261qba) this.f4065n.get(valueOf);
        }
        C1261qba qba = new C1261qba(s, this.f4062k.mo5444j(s));
        this.f4065n.put(valueOf, qba);
        return qba;
    }

    /* renamed from: a */
    public C1276vba m3752a(String str) {
        if (!this.f4062k.mo5437a(str, this.f4063l.size())) {
            C1276vba vba = new C1276vba(this);
            this.f4062k.mo5436a(this.f4063l.size(), str);
            this.f4063l.add(vba);
            boolean z = true;
            if (this.f4063l.size() != 1) {
                z = false;
            }
            vba.mo5261b(z);
            vba.mo5257a(z);
            return vba;
        }
        throw new IllegalArgumentException("The workbook already contains a sheet of this name");
    }

    /* renamed from: a */
    public void mo363a(OutputStream outputStream) {
        byte[] f = mo5394f();
        Pba pba = new Pba();
        ArrayList arrayList = new ArrayList(1);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(f);
        String str = "Workbook";
        pba.mo1066a(byteArrayInputStream, str);
        mo1117a(pba, (List) arrayList);
        if (this.f4066o) {
            arrayList.add(str);
            arrayList.add("WORKBOOK");
            Pba pba2 = this.f1057d;
            mo1116a(pba2, pba, (List) arrayList);
            pba.mo1065a().mo314a(pba2.mo1065a().mo318f());
        }
        pba.mo1069a(outputStream);
    }

    /* renamed from: b */
    public C1261qba m3756b() {
        this.f4062k.mo5448o();
        short i = (short) (mo5397i() - 1);
        if (i > 3) {
            i = (short) (i + 1);
        }
        if (i != Short.MAX_VALUE) {
            return mo5393a(i);
        }
        throw new IllegalArgumentException("Maximum number of fonts was exceeded");
    }

    /* renamed from: f */
    public byte[] mo5394f() {
        if (f4060i.mo4705a(nda.f3486a)) {
            f4060i.mo4700a(f4059h, "HSSFWorkbook.getBytes()");
        }
        C1276vba[] j = mo5398j();
        int i = 0;
        for (C1276vba c : j) {
            c.mo5262c().mo5381w();
        }
        C1151a[] aVarArr = new C1151a[r1];
        int H = this.f4062k.mo5429H();
        for (int i2 = 0; i2 < r1; i2++) {
            this.f4062k.mo5438b(i2, H);
            C1151a aVar = new C1151a();
            j[i2].mo5262c().mo5372a((C0768c) aVar, H);
            H += aVar.mo5400a();
            aVarArr[i2] = aVar;
        }
        byte[] bArr = new byte[H];
        int a = this.f4062k.mo5432a(0, bArr);
        while (i < r1) {
            C1151a aVar2 = aVarArr[i];
            int a2 = aVar2.mo5401a(a, bArr);
            if (a2 == aVar2.mo5400a()) {
                a += a2;
                i++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Actual serialized sheet size (");
                sb.append(a2);
                sb.append(") differs from pre-calculated size (");
                sb.append(aVar2.mo5400a());
                sb.append(") for sheet (");
                sb.append(i);
                sb.append(")");
                throw new IllegalStateException(sb.toString());
            }
        }
        return bArr;
    }

    /* renamed from: g */
    public C0120a mo5395g() {
        return this.f4067p;
    }

    /* renamed from: h */
    public short mo5396h() {
        return (short) this.f4062k.mo5425D();
    }

    /* renamed from: i */
    public short mo5397i() {
        return (short) this.f4062k.mo5427F();
    }

    /* renamed from: j */
    public final C1276vba[] mo5398j() {
        C1276vba[] vbaArr = new C1276vba[this.f4063l.size()];
        this.f4063l.toArray(vbaArr);
        return vbaArr;
    }

    /* renamed from: k */
    public C1167xW mo5399k() {
        return this.f4062k;
    }
}
