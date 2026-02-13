package cab.shashki.app.ui.chess.fairy.builder.quick;

import R0.j;
import T2.q;
import T2.u;
import U2.F;
import U2.p;
import cab.shashki.app.service.FairyRepository;
import cab.shashki.app.ui.chess.fairy.builder.quick.c;
import cab.shashki.app.ui.chess.fairy.builder.quick.h;
import e3.AbstractC0877c;
import f0.AbstractC0909m;
import g3.InterfaceC1016l;
import g3.InterfaceC1020p;
import h3.l;
import h3.m;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p3.n;
import u2.C1409c;
import x2.AbstractC1488f;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class b extends AbstractC0909m {

    /* renamed from: d, reason: collision with root package name */
    private final List f11080d;

    /* renamed from: e, reason: collision with root package name */
    private final List f11081e;

    /* renamed from: f, reason: collision with root package name */
    private final List f11082f;

    /* renamed from: g, reason: collision with root package name */
    private final C1409c f11083g;

    /* renamed from: h, reason: collision with root package name */
    private final C1409c f11084h;

    /* renamed from: i, reason: collision with root package name */
    private final C1409c f11085i;

    /* renamed from: j, reason: collision with root package name */
    private final C1409c f11086j;

    /* renamed from: k, reason: collision with root package name */
    private final C1409c f11087k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f11088l;

    /* renamed from: m, reason: collision with root package name */
    private final Map f11089m;

    /* synthetic */ class a implements h.a, h3.i {
        a() {
        }

        @Override // h3.i
        public final T2.c a() {
            return new l(1, b.this, b.class, "onChangeOption", "onChangeOption(Lcab/shashki/app/ui/chess/fairy/builder/quick/Options$Option;)V", 0);
        }

        @Override // cab.shashki.app.ui.chess.fairy.builder.quick.h.a
        public final void b(h.c cVar) {
            m.e(cVar, "p0");
            b.this.g1(cVar);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof h.a) && (obj instanceof h3.i)) {
                return m.a(a(), ((h3.i) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* renamed from: cab.shashki.app.ui.chess.fairy.builder.quick.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C0148b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11091a;

        static {
            int[] iArr = new int[h.e.values().length];
            try {
                iArr[h.e.f11129d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.e.f11135j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.e.f11130e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.e.f11137l.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f11091a = iArr;
        }
    }

    /* synthetic */ class c implements h.a, h3.i {
        c() {
        }

        @Override // h3.i
        public final T2.c a() {
            return new l(1, b.this, b.class, "onChangeOption", "onChangeOption(Lcab/shashki/app/ui/chess/fairy/builder/quick/Options$Option;)V", 0);
        }

        @Override // cab.shashki.app.ui.chess.fairy.builder.quick.h.a
        public final void b(h.c cVar) {
            m.e(cVar, "p0");
            b.this.g1(cVar);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof h.a) && (obj instanceof h3.i)) {
                return m.a(a(), ((h3.i) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(String str) {
        p3.h hVarC;
        List listG = h.f11114a.g();
        this.f11080d = listG;
        List listK = p.k(listG.get(0), listG.get(1), listG.get(2));
        this.f11081e = listK;
        this.f11082f = new ArrayList();
        this.f11083g = C1409c.u(-1);
        this.f11084h = C1409c.u(Boolean.FALSE);
        this.f11085i = C1409c.t();
        this.f11086j = C1409c.t();
        C1409c c1409cU = C1409c.u(((h.c) p.G(listK)).i());
        this.f11087k = c1409cU;
        if (str != null && (hVarC = p3.j.c(new p3.j("^\\s*\\[(.*)]"), str, 0, 2, null)) != null) {
            String str2 = (String) hVarC.a().get(1);
            c1409cU.accept(str2);
            ((h.c) listK.get(0)).k(str2);
            Iterator it = o3.h.o(o3.h.o(o3.h.i(n.V(str), new InterfaceC1016l() { // from class: z0.E
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return Boolean.valueOf(cab.shashki.app.ui.chess.fairy.builder.quick.b.H0((String) obj));
                }
            }), new InterfaceC1016l() { // from class: z0.F
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return cab.shashki.app.ui.chess.fairy.builder.quick.b.J0((String) obj);
                }
            }), new InterfaceC1016l() { // from class: z0.G
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return cab.shashki.app.ui.chess.fairy.builder.quick.b.D0((List) obj);
                }
            }).iterator();
            while (it.hasNext()) {
                k1((T2.l) it.next());
            }
        }
        Iterator it2 = this.f11081e.iterator();
        while (it2.hasNext()) {
            ((h.c) it2.next()).j(new a());
        }
        i1();
        h.e eVar = h.e.f11129d;
        h.e eVar2 = h.e.f11138m;
        this.f11089m = F.i(q.a(eVar, p.j(h.e.f11134i, eVar2)), q.a(h.e.f11131f, p.j(h.e.f11133h, h.e.f11132g, eVar2)));
    }

    public static T2.l D0(List list) {
        m.e(list, "it");
        return new T2.l(n.x0((String) list.get(0)).toString(), n.x0((String) list.get(1)).toString());
    }

    public static boolean H0(String str) {
        m.e(str, "it");
        return n.B(str, '=', false, 2, null);
    }

    public static List J0(String str) {
        m.e(str, "it");
        return n.h0(str, new char[]{'='}, false, 2, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u O0(b bVar, String str) {
        cab.shashki.app.ui.chess.fairy.builder.quick.c cVar = (cab.shashki.app.ui.chess.fairy.builder.quick.c) bVar.w0();
        if (cVar != null) {
            m.b(str);
            cVar.a(str);
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u P0(b bVar, Boolean bool) {
        cab.shashki.app.ui.chess.fairy.builder.quick.c cVar = (cab.shashki.app.ui.chess.fairy.builder.quick.c) bVar.w0();
        if (cVar != null) {
            m.b(bool);
            cVar.A0(bool.booleanValue());
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u Q0(b bVar, String str) {
        cab.shashki.app.ui.chess.fairy.builder.quick.c cVar = (cab.shashki.app.ui.chess.fairy.builder.quick.c) bVar.w0();
        if (cVar != null) {
            m.b(str);
            cVar.f(str);
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u R0(b bVar, Integer num) {
        cab.shashki.app.ui.chess.fairy.builder.quick.c cVar = (cab.shashki.app.ui.chess.fairy.builder.quick.c) bVar.w0();
        if (cVar != null) {
            cVar.t(num.intValue() > 0, num.intValue() < p.i(bVar.f11082f));
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u S0(b bVar, T2.l lVar) {
        cab.shashki.app.ui.chess.fairy.builder.quick.c cVar = (cab.shashki.app.ui.chess.fairy.builder.quick.c) bVar.w0();
        if (cVar != null) {
            cVar.c1((String) lVar.c(), (String) lVar.d());
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u U0(b bVar, String str, String str2) throws IOException {
        bVar.a1((String) n.h0(str, new char[]{':'}, false, 0, 6, null).get(0), str2);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u V0(b bVar, u uVar) {
        bVar.f11084h.accept(Boolean.FALSE);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W0(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u X0(b bVar, Throwable th) {
        bVar.f11085i.accept(th.toString());
        bVar.f11084h.accept(Boolean.FALSE);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y0(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    private final void a1(final String str, final String str2) throws IOException {
        FairyRepository fairyRepository = FairyRepository.f10588a;
        fairyRepository.C().mkdirs();
        File file = new File(fairyRepository.C(), "var.ini");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), p3.d.f18870b), 8192);
        try {
            bufferedWriter.write(str2);
            u uVar = u.f3817a;
            AbstractC0877c.a(bufferedWriter, null);
            j.a aVar = R0.j.f3579K;
            String absolutePath = file.getAbsolutePath();
            m.d(absolutePath, "getAbsolutePath(...)");
            aVar.a(absolutePath, new InterfaceC1020p() { // from class: z0.z
                @Override // g3.InterfaceC1020p
                public final Object k(Object obj, Object obj2) {
                    return cab.shashki.app.ui.chess.fairy.builder.quick.b.b1(this.f20883d, str, str2, (List) obj, (String) obj2);
                }
            });
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u b1(b bVar, String str, String str2, List list, String str3) {
        m.e(list, "variants");
        m.e(str3, "e");
        if (str3.length() > 0) {
            bVar.f11085i.accept(str3);
        } else if (!list.isEmpty() && m.a(p.G(list), str)) {
            bVar.f11086j.accept(new T2.l(str, str2));
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g1(h.c cVar) {
        List list;
        cab.shashki.app.ui.chess.fairy.builder.quick.c cVar2;
        int i4 = 0;
        if (cVar.h() == h.e.f11139n) {
            this.f11087k.accept(n.h0(cVar.i(), new char[]{':'}, false, 0, 6, null).get(0));
            return;
        }
        if (this.f11088l || (list = (List) this.f11089m.get(cVar.h())) == null) {
            return;
        }
        for (Object obj : this.f11081e) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                p.n();
            }
            if (list.contains(((h.c) obj).h()) && (cVar2 = (cab.shashki.app.ui.chess.fairy.builder.quick.c) w0()) != null) {
                cVar2.y(i4);
            }
            i4 = i5;
        }
    }

    private final void j1(int i4) {
        if (i4 < 0 || i4 >= this.f11082f.size()) {
            return;
        }
        c.a aVar = (c.a) this.f11082f.get(i4);
        this.f11083g.accept(Integer.valueOf(i4));
        this.f11088l = true;
        this.f11081e.clear();
        for (T2.l lVar : aVar.a()) {
            ((h.c) lVar.c()).k((String) lVar.d());
            this.f11081e.add(lVar.c());
        }
        cab.shashki.app.ui.chess.fairy.builder.quick.c cVar = (cab.shashki.app.ui.chess.fairy.builder.quick.c) w0();
        if (cVar != null) {
            cVar.v();
        }
        this.f11088l = false;
    }

    private final void k1(T2.l lVar) {
        Integer num;
        Object next;
        Iterator it = this.f11080d.iterator();
        while (true) {
            num = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (m.a(((h.c) next).f(), lVar.c())) {
                    break;
                }
            }
        }
        h.c cVar = (h.c) next;
        if (cVar == null) {
            return;
        }
        int i4 = C0148b.f11091a[cVar.h().ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                Object objC = cVar.c();
                m.c(objC, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                if (((List) objC).contains(lVar.d())) {
                    cVar.k((String) lVar.d());
                }
            } else if (i4 != 3) {
                if (i4 != 4 || n.i((String) lVar.d()) != null) {
                    cVar.k((String) lVar.d());
                }
            } else if (m.a(lVar.d(), "true") || m.a(lVar.d(), "false")) {
                cVar.k((String) lVar.d());
            }
            this.f11081e.add(cVar);
            return;
        }
        if (m.a(cVar.f(), "maxFile")) {
            m3.c cVar2 = new m3.c('a', 'l');
            Character chA0 = n.A0((CharSequence) lVar.d());
            if (chA0 != null && cVar2.f(chA0.charValue())) {
                cVar.k(String.valueOf(n.z0((CharSequence) lVar.d()) - '`'));
                return;
            }
        }
        Object objC2 = cVar.c();
        m.c(objC2, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        m3.g gVar = (m3.g) objC2;
        Integer numI = n.i((String) lVar.d());
        if (numI != null) {
            int iIntValue = numI.intValue();
            int iC = gVar.c();
            if (iIntValue <= gVar.d() && iC <= iIntValue) {
                num = numI;
            }
            if (num != null) {
                cVar.k(String.valueOf(num.intValue()));
            }
        }
    }

    public final void M0(h.c cVar) {
        Object next;
        String string;
        m.e(cVar, "option");
        if (cVar.h() == h.e.f11131f) {
            List list = this.f11081e;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((h.c) obj).h() == h.e.f11131f) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(p.o(arrayList, 10));
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj2 = arrayList.get(i4);
                i4++;
                Character chA0 = n.A0(((h.c) obj2).i());
                arrayList2.add(Character.valueOf(chA0 != null ? chA0.charValue() : '-'));
            }
            if (p.z(arrayList2, n.A0(cVar.i()))) {
                Iterator it = new m3.c('a', 'z').iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    Character ch = (Character) next;
                    ch.charValue();
                    if (!arrayList2.contains(ch)) {
                        break;
                    }
                }
                Character ch2 = (Character) next;
                if (ch2 == null || (string = ch2.toString()) == null) {
                    return;
                } else {
                    cVar.k(string);
                }
            }
            if (n.x(cVar.f(), "custom", false, 2, null)) {
                cVar.k(cVar.i() + ":");
            } else if (m.a(cVar.f(), "king")) {
                cVar.k(cVar.i() + ":K");
            }
        }
        this.f11081e.add(cVar);
        g1(cVar);
        cVar.j(new c());
        i1();
        cab.shashki.app.ui.chess.fairy.builder.quick.c cVar2 = (cab.shashki.app.ui.chess.fairy.builder.quick.c) w0();
        if (cVar2 != null) {
            cVar2.g0();
        }
    }

    public void N0(cab.shashki.app.ui.chess.fairy.builder.quick.c cVar) {
        m.e(cVar, "view");
        super.q0(cVar);
        C1409c c1409c = this.f11087k;
        m.d(c1409c, "title");
        d0(c1409c, new InterfaceC1016l() { // from class: z0.v
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.b.O0(this.f20866d, (String) obj);
            }
        });
        C1409c c1409c2 = this.f11084h;
        m.d(c1409c2, "checking");
        d0(c1409c2, new InterfaceC1016l() { // from class: z0.A
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.b.P0(this.f20723d, (Boolean) obj);
            }
        });
        C1409c c1409c3 = this.f11085i;
        m.d(c1409c3, "errors");
        d0(c1409c3, new InterfaceC1016l() { // from class: z0.B
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.b.Q0(this.f20725d, (String) obj);
            }
        });
        C1409c c1409c4 = this.f11083g;
        m.d(c1409c4, "historyFrame");
        d0(c1409c4, new InterfaceC1016l() { // from class: z0.C
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.b.R0(this.f20727d, (Integer) obj);
            }
        });
        C1409c c1409c5 = this.f11086j;
        m.d(c1409c5, "result");
        d0(c1409c5, new InterfaceC1016l() { // from class: z0.D
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.b.S0(this.f20729d, (T2.l) obj);
            }
        });
    }

    public final void T0() {
        if (((Boolean) this.f11084h.v()).booleanValue()) {
            return;
        }
        this.f11084h.accept(Boolean.TRUE);
        StringBuilder sb = new StringBuilder();
        final String strI = ((h.c) this.f11081e.get(0)).i();
        sb.append('[');
        sb.append(strI);
        sb.append("]\n");
        int size = this.f11081e.size();
        for (int i4 = 1; i4 < size; i4++) {
            h.c cVar = (h.c) this.f11081e.get(i4);
            sb.append(cVar.f());
            sb.append(" = ");
            sb.append(cVar.i());
            sb.append('\n');
        }
        final String string = sb.toString();
        m.d(string, "toString(...)");
        AbstractC1488f abstractC1488fJ = AbstractC1488f.q(new Callable() { // from class: z0.H
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cab.shashki.app.ui.chess.fairy.builder.quick.b.U0(this.f20735d, strI, string);
            }
        }).H(S2.a.c()).J(16L, TimeUnit.SECONDS);
        final InterfaceC1016l interfaceC1016l = new InterfaceC1016l() { // from class: z0.I
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.b.V0(this.f20739d, (T2.u) obj);
            }
        };
        C2.e eVar = new C2.e() { // from class: z0.w
            @Override // C2.e
            public final void accept(Object obj) {
                cab.shashki.app.ui.chess.fairy.builder.quick.b.W0(interfaceC1016l, obj);
            }
        };
        final InterfaceC1016l interfaceC1016l2 = new InterfaceC1016l() { // from class: z0.x
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.b.X0(this.f20879d, (Throwable) obj);
            }
        };
        A2.c cVarD = abstractC1488fJ.D(eVar, new C2.e() { // from class: z0.y
            @Override // C2.e
            public final void accept(Object obj) {
                cab.shashki.app.ui.chess.fairy.builder.quick.b.Y0(interfaceC1016l2, obj);
            }
        });
        m.d(cVarD, "subscribe(...)");
        R2.a.a(cVarD, t0());
    }

    public final boolean Z0(int i4) {
        return 3 <= i4 && i4 <= p.i(this.f11081e);
    }

    public final void c1(int i4) {
        cab.shashki.app.ui.chess.fairy.builder.quick.c cVar = (cab.shashki.app.ui.chess.fairy.builder.quick.c) w0();
        if (cVar != null) {
            cVar.I0(i4);
        }
        h.c cVar2 = (h.c) this.f11081e.remove(i4);
        cVar2.k(cVar2.d());
        g1(cVar2);
        i1();
    }

    public final List d1() {
        return this.f11081e;
    }

    public final String e1() {
        Object objV = this.f11085i.v();
        m.d(objV, "getValue(...)");
        return (String) objV;
    }

    public final List f1() {
        return this.f11080d;
    }

    public final void h1() {
        j1(((Number) this.f11083g.v()).intValue() + 1);
    }

    public final void i1() {
        Integer num = (Integer) this.f11083g.v();
        while (p.i(this.f11082f) > num.intValue()) {
            List list = this.f11082f;
            list.remove(p.i(list));
        }
        List list2 = this.f11082f;
        List<h.c> list3 = this.f11081e;
        ArrayList arrayList = new ArrayList(p.o(list3, 10));
        for (h.c cVar : list3) {
            arrayList.add(new T2.l(cVar, cVar.i()));
        }
        list2.add(new c.a(arrayList));
        this.f11083g.accept(Integer.valueOf(p.i(this.f11082f)));
    }

    public final void l1() {
        j1(((Number) this.f11083g.v()).intValue() - 1);
    }
}