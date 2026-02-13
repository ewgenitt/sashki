package cab.shashki.app.ui.chess.fairy.builder.quick;

import T2.l;
import T2.q;
import U2.p;
import android.util.SparseArray;
import h3.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p3.AbstractC1273a;
import p3.n;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class a {

    /* renamed from: o, reason: collision with root package name */
    public static final b f11052o = new b(null);

    /* renamed from: p, reason: collision with root package name */
    private static final int[] f11053p = {2, 3, 4};

    /* renamed from: g, reason: collision with root package name */
    private boolean f11060g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f11061h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f11062i;

    /* renamed from: l, reason: collision with root package name */
    private final SparseArray f11065l;

    /* renamed from: m, reason: collision with root package name */
    private final List f11066m;

    /* renamed from: n, reason: collision with root package name */
    private final List f11067n;

    /* renamed from: a, reason: collision with root package name */
    private final List f11054a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List f11055b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List f11056c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private boolean f11057d = true;

    /* renamed from: e, reason: collision with root package name */
    private boolean f11058e = true;

    /* renamed from: f, reason: collision with root package name */
    private boolean f11059f = true;

    /* renamed from: j, reason: collision with root package name */
    private String f11063j = "";

    /* renamed from: k, reason: collision with root package name */
    private int f11064k = 1;

    /* renamed from: cab.shashki.app.ui.chess.fairy.builder.quick.a$a, reason: collision with other inner class name */
    private static final class C0147a {

        /* renamed from: a, reason: collision with root package name */
        private final char f11068a;

        /* renamed from: b, reason: collision with root package name */
        private final int f11069b;

        /* renamed from: c, reason: collision with root package name */
        private final int f11070c;

        public C0147a(char c4, int i4, int i5) {
            this.f11068a = c4;
            this.f11069b = i4;
            this.f11070c = i5;
        }

        public final char a() {
            return this.f11068a;
        }

        public final int b() {
            return this.f11070c;
        }

        public final int c() {
            return this.f11069b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0147a)) {
                return false;
            }
            C0147a c0147a = (C0147a) obj;
            return this.f11068a == c0147a.f11068a && this.f11069b == c0147a.f11069b && this.f11070c == c0147a.f11070c;
        }

        public int hashCode() {
            return (((this.f11068a * 31) + this.f11069b) * 31) + this.f11070c;
        }

        public String toString() {
            return "Base(atom=" + this.f11068a + ", value=" + this.f11069b + ", limit=" + this.f11070c + ")";
        }
    }

    public static final class b {
        public /* synthetic */ b(h3.h hVar) {
            this();
        }

        public final int[] a() {
            return a.f11053p;
        }

        private b() {
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f11071a;

        /* renamed from: b, reason: collision with root package name */
        private final int f11072b;

        /* renamed from: c, reason: collision with root package name */
        private final int f11073c;

        /* renamed from: d, reason: collision with root package name */
        private final int f11074d;

        public c(String str, int i4, int i5, int i6) {
            m.e(str, "atoms");
            this.f11071a = str;
            this.f11072b = i4;
            this.f11073c = i5;
            this.f11074d = i6;
        }

        public final String a() {
            return this.f11071a;
        }

        public final int b() {
            return this.f11074d;
        }

        public final int c() {
            return this.f11072b;
        }

        public final int d() {
            return this.f11073c;
        }
    }

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        private int f11075a;

        public d(int i4) {
            this.f11075a = i4;
        }

        public final int a() {
            return this.f11075a;
        }

        public final void b(int i4) {
            this.f11075a = i4;
        }
    }

    private static final class e {

        /* renamed from: a, reason: collision with root package name */
        private final char f11076a;

        /* renamed from: b, reason: collision with root package name */
        private final int f11077b;

        /* renamed from: c, reason: collision with root package name */
        private final int f11078c;

        /* renamed from: d, reason: collision with root package name */
        private final int f11079d;

        public e(char c4, int i4, int i5, int i6) {
            this.f11076a = c4;
            this.f11077b = i4;
            this.f11078c = i5;
            this.f11079d = i6;
        }

        public final char a() {
            return this.f11076a;
        }

        public final int b() {
            return this.f11079d;
        }

        public final int c() {
            return this.f11077b;
        }

        public final int d() {
            return this.f11078c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f11076a == eVar.f11076a && this.f11077b == eVar.f11077b && this.f11078c == eVar.f11078c && this.f11079d == eVar.f11079d;
        }

        public int hashCode() {
            return (((((this.f11076a * 31) + this.f11077b) * 31) + this.f11078c) * 31) + this.f11079d;
        }

        public String toString() {
            return "Unit(atom=" + this.f11076a + ", mask=" + this.f11077b + ", value=" + this.f11078c + ", limit=" + this.f11079d + ")";
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public e(C0147a c0147a, int i4) {
            this(c0147a.a(), i4, c0147a.c(), c0147a.b());
            m.e(c0147a, "base");
        }
    }

    public a() {
        SparseArray sparseArray = new SparseArray();
        this.f11065l = sparseArray;
        sparseArray.put(255, "");
        sparseArray.put(204, "s");
        sparseArray.put(51, "v");
        sparseArray.put(3, "f");
        sparseArray.put(48, "b");
        sparseArray.put(192, "r");
        sparseArray.put(12, "l");
        sparseArray.put(1, "fl");
        sparseArray.put(2, "fr");
        sparseArray.put(4, "lf");
        sparseArray.put(8, "lb");
        sparseArray.put(16, "bl");
        sparseArray.put(32, "br");
        sparseArray.put(64, "rb");
        sparseArray.put(128, "rf");
        this.f11066m = p.j(255, 204, 51, 3, 48, 192, 12, 1, 2, 4, 8, 16, 32, 64, 128);
        this.f11067n = p.j(q.a(1, 1), q.a(2, 128), q.a(4, 32), q.a(8, 8), q.a(3, 3), q.a(6, 192), q.a(12, 48), q.a(9, 12), q.a(15, 255));
    }

    private final void b() {
        if (this.f11056c.isEmpty()) {
            return;
        }
        c cVar = new c(p.N(this.f11056c, "", null, null, 0, null, null, 62, null), h(this.f11063j), this.f11062i ? 4 : this.f11061h ? 3 : this.f11060g ? 5 : this.f11064k == 1 ? 1 : 2, this.f11064k);
        if (this.f11058e) {
            this.f11054a.add(cVar);
        }
        if (this.f11059f) {
            this.f11055b.add(cVar);
        }
    }

    private final String c(int i4) {
        Object obj = this.f11065l.get(i4, "-");
        m.d(obj, "get(...)");
        return (String) obj;
    }

    private final List d(int i4) {
        ArrayList arrayList = new ArrayList();
        int iIntValue = 0;
        for (int i5 = 0; i5 < 4; i5++) {
            if ((((Number) ((l) this.f11067n.get(i5)).d()).intValue() & i4) != 0) {
                iIntValue |= ((Number) ((l) this.f11067n.get(i5)).c()).intValue();
            }
        }
        int size = this.f11067n.size();
        for (int i6 = 0; i6 < size; i6++) {
            List list = this.f11067n;
            l lVar = (l) list.get(p.i(list) - i6);
            if ((((Number) lVar.c()).intValue() & iIntValue) == ((Number) lVar.c()).intValue()) {
                arrayList.add(lVar.d());
                iIntValue = (((Number) lVar.c()).intValue() ^ (-1)) & iIntValue;
            }
        }
        return arrayList;
    }

    private final List e(char c4, int i4) {
        if (n.B("FAG", c4, false, 2, null)) {
            return d(i4);
        }
        ArrayList arrayList = new ArrayList();
        while (i4 != 0) {
            Iterator it = this.f11066m.iterator();
            while (true) {
                if (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if ((i4 & iIntValue) == iIntValue) {
                        i4 &= iIntValue ^ (-1);
                        arrayList.add(Integer.valueOf(iIntValue));
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    private final Set g(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            C0147a c0147a = new C0147a(cVar.a().charAt(0), cVar.d(), cVar.b());
            Object dVar = linkedHashMap.get(c0147a);
            if (dVar == null) {
                dVar = new d(cVar.c());
                linkedHashMap.put(c0147a, dVar);
            }
            d dVar2 = (d) dVar;
            dVar2.b(cVar.c() | dVar2.a());
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Iterator it2 = e(((C0147a) entry.getKey()).a(), ((d) entry.getValue()).a()).iterator();
            while (it2.hasNext()) {
                linkedHashSet.add(new e((C0147a) entry.getKey(), ((Number) it2.next()).intValue()));
            }
        }
        return linkedHashSet;
    }

    private final int h(String str) {
        switch (str.hashCode()) {
            case 0:
                return !str.equals("") ? 0 : 255;
            case 98:
                return !str.equals("b") ? 0 : 48;
            case 102:
                return !str.equals("f") ? 0 : 3;
            case 108:
                return !str.equals("l") ? 0 : 12;
            case 114:
                return !str.equals("r") ? 0 : 192;
            case 115:
                return !str.equals("s") ? 0 : 204;
            case 118:
                return !str.equals("v") ? 0 : 51;
            case 3146:
                return !str.equals("bl") ? 0 : 16;
            case 3152:
                return !str.equals("br") ? 0 : 32;
            case 3270:
                return !str.equals("fl") ? 0 : 1;
            case 3276:
                return !str.equals("fr") ? 0 : 2;
            case 3446:
                return !str.equals("lb") ? 0 : 8;
            case 3450:
                return !str.equals("lf") ? 0 : 4;
            case 3632:
                return !str.equals("rb") ? 0 : 64;
            case 3636:
                return !str.equals("rf") ? 0 : 128;
            default:
                return 0;
        }
    }

    private final void j(char c4) {
        if (this.f11056c.isEmpty()) {
            this.f11056c.add(Character.valueOf(c4));
        } else if (this.f11056c.size() == 1 && ((Character) p.G(this.f11056c)).charValue() == c4) {
            this.f11064k = 0;
        } else {
            b();
            l();
            this.f11056c.add(Character.valueOf(c4));
        }
        this.f11057d = false;
    }

    private final void k(char c4) {
        if (!this.f11056c.isEmpty()) {
            b();
            l();
        }
        this.f11064k = c4 == 'K' ? 1 : 0;
        this.f11056c.addAll(c4 != 'B' ? (c4 == 'K' || c4 == 'Q') ? p.j('W', 'F') : c4 != 'R' ? p.g() : p.d('W') : p.d('F'));
        this.f11057d = false;
    }

    private final void l() {
        this.f11057d = true;
        this.f11062i = false;
        this.f11061h = false;
        this.f11060g = false;
        this.f11058e = true;
        this.f11059f = true;
        this.f11063j = "";
        this.f11064k = 1;
        this.f11056c.clear();
    }

    private final void m(StringBuilder sb, String str, Set set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (((e) obj).d() == 2) {
                arrayList.add(obj);
            }
        }
        o(arrayList, sb, str, "");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : set) {
            if (((e) obj2).d() == 3) {
                arrayList2.add(obj2);
            }
        }
        o(arrayList2, sb, str, "p");
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : set) {
            if (((e) obj3).d() == 4) {
                arrayList3.add(obj3);
            }
        }
        o(arrayList3, sb, str, "g");
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : set) {
            if (((e) obj4).d() == 1) {
                arrayList4.add(obj4);
            }
        }
        n(arrayList4, sb, str, false);
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : set) {
            if (((e) obj5).d() == 5) {
                arrayList5.add(obj5);
            }
        }
        n(arrayList5, sb, str, true);
    }

    private final void n(List list, StringBuilder sb, String str, boolean z4) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            sb.append(str);
            sb.append(c(eVar.c()));
            if (z4) {
                sb.append('n');
            }
            sb.append(eVar.a());
        }
    }

    private final void o(List list, StringBuilder sb, String str, String str2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            String strP = p(eVar.a());
            sb.append(str);
            sb.append(c(eVar.c()));
            sb.append(str2);
            sb.append(strP);
            Integer numValueOf = Integer.valueOf(eVar.b());
            if (numValueOf.intValue() <= 1) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                sb.append(numValueOf.intValue());
            }
        }
    }

    private final String p(char c4) {
        return c4 != 'F' ? c4 != 'N' ? c4 != 'W' ? "" : "R" : "NN" : "B";
    }

    public final String f(List list, List list2) {
        m.e(list, "moves");
        m.e(list2, "captures");
        StringBuilder sb = new StringBuilder();
        Set setG = g(list);
        Set setG2 = g(list2);
        Set setE0 = p.e0(setG);
        setE0.retainAll(setG2);
        setG.removeAll(setE0);
        setG2.removeAll(setE0);
        m(sb, "", setE0);
        m(sb, "m", setG);
        m(sb, "c", setG2);
        String string = sb.toString();
        m.d(string, "toString(...)");
        return string;
    }

    public final l i(String str) {
        m.e(str, "notation");
        this.f11054a.clear();
        this.f11055b.clear();
        l();
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char cCharAt = str.charAt(i4);
            if (!this.f11056c.isEmpty() && Character.isLowerCase(cCharAt)) {
                b();
                l();
            }
            if (cCharAt == 'm') {
                this.f11059f = false;
            } else if (cCharAt == 'c') {
                this.f11058e = false;
            } else if (cCharAt == 'n') {
                this.f11060g = true;
            } else if (cCharAt == 'p') {
                this.f11061h = true;
            } else if (cCharAt == 'g') {
                this.f11062i = true;
            } else if (cCharAt == 'f' || cCharAt == 'b' || cCharAt == 'l' || cCharAt == 'r' || cCharAt == 'v' || cCharAt == 's') {
                this.f11063j = this.f11063j + cCharAt;
            } else if ('1' <= cCharAt && cCharAt < ':') {
                this.f11064k = AbstractC1273a.d(cCharAt);
                b();
                l();
            } else if (cCharAt == 'W' || cCharAt == 'F' || cCharAt == 'D' || cCharAt == 'N' || cCharAt == 'A' || cCharAt == 'H' || cCharAt == 'C' || cCharAt == 'Z' || cCharAt == 'G') {
                j(cCharAt);
            } else if (cCharAt == 'B' || cCharAt == 'R' || cCharAt == 'Q' || cCharAt == 'K') {
                k(cCharAt);
            }
        }
        if (!this.f11057d) {
            b();
        }
        return new l(this.f11054a, this.f11055b);
    }
}