package cab.shashki.app.ui.chess.fairy.builder.quick;

import R0.j;
import T2.u;
import U2.AbstractC0590i;
import U2.p;
import a3.AbstractC0614b;
import a3.InterfaceC0613a;
import androidx.activity.B;
import cab.shashki.app.db.entities.HalmaParams;
import cab.shashki.app.service.FairyRepository;
import cab.shashki.app.ui.chess.fairy.builder.quick.e;
import cab.shashki.app.ui.chess.fairy.builder.quick.i;
import cab.shashki.app.ui.chess.fairy.builder.quick.k;
import e3.AbstractC0877c;
import f0.AbstractC0888D;
import f0.AbstractC0909m;
import g3.InterfaceC1005a;
import g3.InterfaceC1016l;
import g3.InterfaceC1020p;
import g3.InterfaceC1023s;
import h3.l;
import h3.m;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p3.AbstractC1273a;
import p3.n;
import u2.C1409c;
import x2.AbstractC1488f;
import z0.u1;
import z0.w1;
import z2.AbstractC1559a;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class k extends AbstractC0909m {

    /* renamed from: d, reason: collision with root package name */
    private final String f11152d;

    /* renamed from: p, reason: collision with root package name */
    private long f11164p;

    /* renamed from: r, reason: collision with root package name */
    private String f11166r;

    /* renamed from: u, reason: collision with root package name */
    private i.a f11169u;

    /* renamed from: v, reason: collision with root package name */
    private String f11170v;

    /* renamed from: w, reason: collision with root package name */
    private String f11171w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f11172x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f11173y;

    /* renamed from: e, reason: collision with root package name */
    private final C1409c f11153e = C1409c.u(b.f11178d);

    /* renamed from: f, reason: collision with root package name */
    private final C1409c f11154f = C1409c.u(p.g());

    /* renamed from: g, reason: collision with root package name */
    private final List f11155g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final List f11156h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private final C1409c f11157i = C1409c.u(Boolean.TRUE);

    /* renamed from: j, reason: collision with root package name */
    private final C1409c f11158j = C1409c.t();

    /* renamed from: k, reason: collision with root package name */
    private final C1409c f11159k = C1409c.t();

    /* renamed from: l, reason: collision with root package name */
    private final C1409c f11160l = C1409c.t();

    /* renamed from: m, reason: collision with root package name */
    private final Map f11161m = new LinkedHashMap();

    /* renamed from: n, reason: collision with root package name */
    private final List f11162n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    private final Map f11163o = new LinkedHashMap();

    /* renamed from: q, reason: collision with root package name */
    private String f11165q = "";

    /* renamed from: s, reason: collision with root package name */
    private String f11167s = "";

    /* renamed from: t, reason: collision with root package name */
    private i.a f11168t = new i.a(0, 0, 0, 7, null);

    /* renamed from: z, reason: collision with root package name */
    private int f11174z = -1;

    /* renamed from: A, reason: collision with root package name */
    private int f11151A = -1;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f11175a;

        /* renamed from: b, reason: collision with root package name */
        private final int f11176b;

        /* renamed from: c, reason: collision with root package name */
        private final int f11177c;

        public a(int i4, int i5, int i6) {
            this.f11175a = i4;
            this.f11176b = i5;
            this.f11177c = i6;
        }

        public final int a() {
            return this.f11176b;
        }

        public final int b() {
            return this.f11177c;
        }

        public final int c() {
            return this.f11175a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* renamed from: d, reason: collision with root package name */
        public static final b f11178d = new b("Start", 0);

        /* renamed from: e, reason: collision with root package name */
        public static final b f11179e = new b("Loading", 1);

        /* renamed from: f, reason: collision with root package name */
        public static final b f11180f = new b("Edit", 2);

        /* renamed from: g, reason: collision with root package name */
        public static final b f11181g = new b("Error", 3);

        /* renamed from: h, reason: collision with root package name */
        public static final b f11182h = new b("Default", 4);

        /* renamed from: i, reason: collision with root package name */
        public static final b f11183i = new b("SelectLib", 5);

        /* renamed from: j, reason: collision with root package name */
        public static final b f11184j = new b("LoadLibVariants", 6);

        /* renamed from: k, reason: collision with root package name */
        public static final b f11185k = new b("AddLetter", 7);

        /* renamed from: l, reason: collision with root package name */
        public static final b f11186l = new b("AddImage", 8);

        /* renamed from: m, reason: collision with root package name */
        public static final b f11187m = new b("AddPromotion", 9);

        /* renamed from: n, reason: collision with root package name */
        public static final b f11188n = new b("ChangePromotion", 10);

        /* renamed from: o, reason: collision with root package name */
        public static final b f11189o = new b("Delete", 11);

        /* renamed from: p, reason: collision with root package name */
        private static final /* synthetic */ b[] f11190p;

        /* renamed from: q, reason: collision with root package name */
        private static final /* synthetic */ InterfaceC0613a f11191q;

        static {
            b[] bVarArrA = a();
            f11190p = bVarArrA;
            f11191q = AbstractC0614b.a(bVarArrA);
        }

        private b(String str, int i4) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f11178d, f11179e, f11180f, f11181g, f11182h, f11183i, f11184j, f11185k, f11186l, f11187m, f11188n, f11189o};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f11190p.clone();
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11192a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f11178d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f11179e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.f11180f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.f11184j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.f11181g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.f11183i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b.f11185k.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[b.f11186l.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[b.f11187m.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[b.f11188n.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[b.f11182h.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[b.f11189o.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f11192a = iArr;
        }
    }

    /* synthetic */ class d extends l implements InterfaceC1023s {
        d(Object obj) {
            super(5, obj, k.class, "setInfo", "setInfo(IIILjava/util/List;Ljava/lang/String;)V", 0);
        }

        public final void m(int i4, int i5, int i6, List list, String str) {
            m.e(list, "p3");
            m.e(str, "p4");
            ((k) this.f16244e).t2(i4, i5, i6, list, str);
        }

        @Override // g3.InterfaceC1023s
        public /* bridge */ /* synthetic */ Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            m(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), (List) obj4, (String) obj5);
            return u.f3817a;
        }
    }

    /* synthetic */ class e extends l implements InterfaceC1023s {
        e(Object obj) {
            super(5, obj, k.class, "setInfo", "setInfo(IIILjava/util/List;Ljava/lang/String;)V", 0);
        }

        public final void m(int i4, int i5, int i6, List list, String str) {
            m.e(list, "p3");
            m.e(str, "p4");
            ((k) this.f16244e).t2(i4, i5, i6, list, str);
        }

        @Override // g3.InterfaceC1023s
        public /* bridge */ /* synthetic */ Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            m(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), (List) obj4, (String) obj5);
            return u.f3817a;
        }
    }

    /* synthetic */ class f extends l implements InterfaceC1023s {
        f(Object obj) {
            super(5, obj, k.class, "setInfo", "setInfo(IIILjava/util/List;Ljava/lang/String;)V", 0);
        }

        public final void m(int i4, int i5, int i6, List list, String str) {
            m.e(list, "p3");
            m.e(str, "p4");
            ((k) this.f16244e).t2(i4, i5, i6, list, str);
        }

        @Override // g3.InterfaceC1023s
        public /* bridge */ /* synthetic */ Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            m(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), (List) obj4, (String) obj5);
            return u.f3817a;
        }
    }

    /* synthetic */ class g extends l implements InterfaceC1016l {

        /* renamed from: m, reason: collision with root package name */
        public static final g f11193m = new g();

        g() {
            super(1, Throwable.class, "printStackTrace", "printStackTrace()V", 0);
        }

        public final void m(Throwable th) {
            m.e(th, "p0");
            th.printStackTrace();
        }

        @Override // g3.InterfaceC1016l
        public /* bridge */ /* synthetic */ Object o(Object obj) {
            m((Throwable) obj);
            return u.f3817a;
        }
    }

    /* synthetic */ class h extends l implements InterfaceC1023s {
        h(Object obj) {
            super(5, obj, k.class, "setInfo", "setInfo(IIILjava/util/List;Ljava/lang/String;)V", 0);
        }

        public final void m(int i4, int i5, int i6, List list, String str) {
            m.e(list, "p3");
            m.e(str, "p4");
            ((k) this.f16244e).t2(i4, i5, i6, list, str);
        }

        @Override // g3.InterfaceC1023s
        public /* bridge */ /* synthetic */ Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            m(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), (List) obj4, (String) obj5);
            return u.f3817a;
        }
    }

    public k(String str, String str2, String str3) {
        this.f11152d = str;
        int i4 = 0;
        for (Object obj : o3.h.o(AbstractC0590i.o(w1.f20876a.c()), new InterfaceC1016l() { // from class: z0.G0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj2) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.k.o1(((Integer) obj2).intValue());
            }
        })) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                p.n();
            }
            ((i4 & 1) == 0 ? this.f11155g : this.f11156h).add((e.a) obj);
            i4 = i5;
        }
        if (str2 != null && str3 != null) {
            S1(str2, str3);
            return;
        }
        if (this.f11152d == null) {
            FairyRepository fairyRepository = FairyRepository.f10588a;
            if (fairyRepository.C().exists()) {
                e3.i.l(fairyRepository.C());
            }
            fairyRepository.C().mkdirs();
            this.f11163o.putAll(fairyRepository.m());
            return;
        }
        AbstractC1488f abstractC1488fH = AbstractC1488f.q(new Callable() { // from class: z0.H0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cab.shashki.app.ui.chess.fairy.builder.quick.k.p1(this.f20738d);
            }
        }).H(S2.a.c());
        final InterfaceC1016l interfaceC1016l = new InterfaceC1016l() { // from class: z0.I0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj2) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.k.q1(this.f20740d, (T2.u) obj2);
            }
        };
        C2.e eVar = new C2.e() { // from class: z0.J0
            @Override // C2.e
            public final void accept(Object obj2) {
                cab.shashki.app.ui.chess.fairy.builder.quick.k.r1(interfaceC1016l, obj2);
            }
        };
        final InterfaceC1016l interfaceC1016l2 = new InterfaceC1016l() { // from class: z0.K0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj2) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.k.s1(this.f20745d, (Throwable) obj2);
            }
        };
        A2.c cVarD = abstractC1488fH.D(eVar, new C2.e() { // from class: z0.L0
            @Override // C2.e
            public final void accept(Object obj2) {
                cab.shashki.app.ui.chess.fairy.builder.quick.k.t1(interfaceC1016l2, obj2);
            }
        });
        m.d(cVarD, "subscribe(...)");
        R2.a.a(cVarD, t0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u A1(k kVar, Boolean bool) {
        cab.shashki.app.ui.chess.fairy.builder.quick.d dVar = (cab.shashki.app.ui.chess.fairy.builder.quick.d) kVar.w0();
        if (dVar != null) {
            m.b(bool);
            dVar.d1(bool.booleanValue());
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u A2(k kVar, Throwable th) {
        kVar.f11165q = th.toString();
        kVar.f11153e.accept(b.f11181g);
        return u.f3817a;
    }

    private final void B1(final String str) {
        AbstractC1488f abstractC1488fJ = AbstractC1488f.q(new Callable() { // from class: z0.M0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cab.shashki.app.ui.chess.fairy.builder.quick.k.C1(this.f20750d, str);
            }
        }).H(S2.a.c()).J(16L, TimeUnit.SECONDS);
        final InterfaceC1016l interfaceC1016l = new InterfaceC1016l() { // from class: z0.N0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.k.D1((T2.u) obj);
            }
        };
        C2.e eVar = new C2.e() { // from class: z0.O0
            @Override // C2.e
            public final void accept(Object obj) {
                cab.shashki.app.ui.chess.fairy.builder.quick.k.E1(interfaceC1016l, obj);
            }
        };
        final InterfaceC1016l interfaceC1016l2 = new InterfaceC1016l() { // from class: z0.Q0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.k.F1(this.f20763d, (Throwable) obj);
            }
        };
        A2.c cVarD = abstractC1488fJ.D(eVar, new C2.e() { // from class: z0.R0
            @Override // C2.e
            public final void accept(Object obj) {
                cab.shashki.app.ui.chess.fairy.builder.quick.k.G1(interfaceC1016l2, obj);
            }
        });
        m.d(cVarD, "subscribe(...)");
        R2.a.a(cVarD, t0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B2(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u C1(k kVar, String str) throws IOException {
        kVar.H1(str);
        return u.f3817a;
    }

    private final void C2() {
        C1409c c1409c = this.f11153e;
        C1409c c1409c2 = this.f11154f;
        final InterfaceC1020p interfaceC1020p = new InterfaceC1020p() { // from class: z0.e1
            @Override // g3.InterfaceC1020p
            public final Object k(Object obj, Object obj2) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.k.D2(this.f20811d, (k.b) obj, (List) obj2);
            }
        };
        x2.m mVarQ = x2.m.f(c1409c, c1409c2, new C2.c() { // from class: z0.f1
            @Override // C2.c
            public final Object a(Object obj, Object obj2) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.k.E2(interfaceC1020p, obj, obj2);
            }
        }).q(S2.a.a());
        m.d(mVarQ, "subscribeOn(...)");
        d0(mVarQ, new InterfaceC1016l() { // from class: z0.g1
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.k.F2(this.f20821d, (T2.p) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u D1(u uVar) {
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final T2.p D2(k kVar, b bVar, List list) {
        m.e(bVar, "state");
        m.e(list, "set");
        return kVar.J1(bVar, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E1(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final T2.p E2(InterfaceC1020p interfaceC1020p, Object obj, Object obj2) {
        m.e(obj, "p0");
        m.e(obj2, "p1");
        return (T2.p) interfaceC1020p.k(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u F1(k kVar, Throwable th) {
        kVar.f11165q = th.toString();
        kVar.f11153e.accept(b.f11181g);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u F2(k kVar, T2.p pVar) {
        cab.shashki.app.ui.chess.fairy.builder.quick.d dVar;
        b bVar = (b) pVar.c();
        switch (c.f11192a[bVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                cab.shashki.app.ui.chess.fairy.builder.quick.d dVar2 = (cab.shashki.app.ui.chess.fairy.builder.quick.d) kVar.w0();
                if (dVar2 != null) {
                    dVar2.R0();
                }
                if (bVar == b.f11184j && (dVar = (cab.shashki.app.ui.chess.fairy.builder.quick.d) kVar.w0()) != null) {
                    String str = (String) kVar.f11160l.v();
                    if (str == null) {
                        str = "";
                    }
                    dVar.g1(str);
                }
                return u.f3817a;
            case 5:
                cab.shashki.app.ui.chess.fairy.builder.quick.d dVar3 = (cab.shashki.app.ui.chess.fairy.builder.quick.d) kVar.w0();
                if (dVar3 != null) {
                    dVar3.B0(kVar.f11165q);
                }
                return u.f3817a;
            case 6:
                cab.shashki.app.ui.chess.fairy.builder.quick.d dVar4 = (cab.shashki.app.ui.chess.fairy.builder.quick.d) kVar.w0();
                if (dVar4 != null) {
                    dVar4.a0();
                }
                return u.f3817a;
            case 7:
                cab.shashki.app.ui.chess.fairy.builder.quick.d dVar5 = (cab.shashki.app.ui.chess.fairy.builder.quick.d) kVar.w0();
                if (dVar5 != null) {
                    dVar5.r0(AbstractC0888D.f14357D1);
                    break;
                }
                break;
            case 8:
                cab.shashki.app.ui.chess.fairy.builder.quick.d dVar6 = (cab.shashki.app.ui.chess.fairy.builder.quick.d) kVar.w0();
                if (dVar6 != null) {
                    dVar6.r0(AbstractC0888D.f14366F0);
                    break;
                }
                break;
            case 9:
            case 10:
                cab.shashki.app.ui.chess.fairy.builder.quick.d dVar7 = (cab.shashki.app.ui.chess.fairy.builder.quick.d) kVar.w0();
                if (dVar7 != null) {
                    dVar7.r0(AbstractC0888D.h4);
                    break;
                }
                break;
            default:
                cab.shashki.app.ui.chess.fairy.builder.quick.d dVar8 = (cab.shashki.app.ui.chess.fairy.builder.quick.d) kVar.w0();
                if (dVar8 != null) {
                    dVar8.r0(0);
                    break;
                }
                break;
        }
        cab.shashki.app.ui.chess.fairy.builder.quick.d dVar9 = (cab.shashki.app.ui.chess.fairy.builder.quick.d) kVar.w0();
        if (dVar9 != null) {
            dVar9.L();
            dVar9.K((List) pVar.a(), kVar.f11174z);
            dVar9.f0((List) pVar.b(), kVar.f11151A);
            dVar9.H0(!kVar.f11173y);
            dVar9.c0(!kVar.f11173y && AbstractC0590i.q(new b[]{b.f11182h, b.f11187m, b.f11188n}, bVar));
            dVar9.C0(bVar == b.f11182h);
            dVar9.m1(kVar.f11167s.length() > 0);
            dVar9.T(bVar == b.f11189o);
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G1(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    private final void H1(final String str) throws IOException {
        final File file = new File(FairyRepository.f10588a.C(), "var.ini");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), p3.d.f18870b), 8192);
        try {
            bufferedWriter.write(str);
            bufferedWriter.write("\n#");
            u uVar = u.f3817a;
            AbstractC0877c.a(bufferedWriter, null);
            j.a aVar = R0.j.f3579K;
            String absolutePath = file.getAbsolutePath();
            m.d(absolutePath, "getAbsolutePath(...)");
            aVar.a(absolutePath, new InterfaceC1020p() { // from class: z0.q1
                @Override // g3.InterfaceC1020p
                public final Object k(Object obj, Object obj2) {
                    return cab.shashki.app.ui.chess.fairy.builder.quick.k.I1(this.f20848d, file, str, (List) obj, (String) obj2);
                }
            });
        } finally {
        }
    }

    private final void H2(String str) {
        File file = new File(FairyRepository.f10588a.k(), str);
        T2.l lVarL1 = L1();
        String str2 = (String) lVarL1.a();
        Map map = (Map) lVarL1.b();
        Object objV = this.f11160l.v();
        m.d(objV, "getValue(...)");
        String str3 = (String) objV;
        int iC = ((a) this.f11158j.v()).c();
        int iA = ((a) this.f11158j.v()).a();
        String str4 = this.f11170v;
        String str5 = this.f11166r;
        Object objV2 = this.f11157i.v();
        m.d(objV2, "getValue(...)");
        FairyRepository.GameParams gameParams = new FairyRepository.GameParams(str3, iC, iA, 0.5f, 0.5f, str2, null, str4, str5, ((Boolean) objV2).booleanValue(), map, Integer.valueOf(((a) this.f11158j.v()).b()), this.f11171w);
        File file2 = new File(file, "params.json");
        String strT = new H1.d().t(gameParams);
        m.d(strT, "toJson(...)");
        e3.i.h(file2, strT, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u I1(k kVar, File file, String str, List list, String str2) throws IOException, NumberFormatException {
        m.e(list, "variants");
        m.e(str2, "e");
        kVar.f11165q = str2;
        if (str2.length() > 0) {
            kVar.f11153e.accept(b.f11181g);
        } else if (list.size() == 1) {
            j.a aVar = R0.j.f3579K;
            String absolutePath = file.getAbsolutePath();
            String str3 = kVar.f11166r;
            if (str3 == null) {
                str3 = "custom_cc";
            }
            aVar.b(absolutePath, str3, new d(kVar));
        } else if (!list.isEmpty()) {
            file.delete();
            kVar.f11170v = FairyRepository.v(FairyRepository.f10588a, str, list, null, 4, null);
            kVar.f11162n.clear();
            kVar.f11162n.addAll(list);
            kVar.f11153e.accept(b.f11183i);
        }
        return u.f3817a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final T2.p J1(b bVar, List list) {
        boolean z4;
        i.a aVar;
        int i4 = 0;
        switch (c.f11192a[bVar.ordinal()]) {
            case 7:
                List listG = p.g();
                m3.c cVar = new m3.c('A', 'Z');
                ArrayList arrayList = new ArrayList();
                for (Object obj : cVar) {
                    char cCharValue = ((Character) obj).charValue();
                    if (B.a(list) && list.isEmpty()) {
                        z4 = false;
                    } else {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (((i.a) it.next()).b() == cCharValue) {
                                z4 = true;
                            }
                        }
                        z4 = false;
                    }
                    if (!z4) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(p.o(arrayList, 10));
                int size = arrayList.size();
                while (i4 < size) {
                    Object obj2 = arrayList.get(i4);
                    i4++;
                    Character ch = (Character) obj2;
                    ch.charValue();
                    arrayList2.add(new e.a(ch, null));
                }
                return new T2.p(listG, arrayList2, bVar);
            case 8:
            case 9:
            case 10:
                if (l2()) {
                    return new T2.p(p.j(p.G(list), this.f11168t), m.a(this.f11169u, this.f11168t) ? this.f11156h : this.f11155g, bVar);
                }
                if (!this.f11172x && ((aVar = this.f11169u) == null || (list = p.d(aVar)) == null)) {
                    list = p.g();
                }
                return new T2.p(list, this.f11155g, bVar);
            case 11:
                return l2() ? new T2.p(p.j(p.G(list), this.f11168t), p.g(), bVar) : new T2.p(list, p.g(), bVar);
            case 12:
                return new T2.p(list, p.g(), bVar);
            default:
                return new T2.p(p.g(), p.g(), bVar);
        }
    }

    private final T2.l L1() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        StringBuilder sb = new StringBuilder();
        if (l2()) {
            sb.append(this.f11168t.b());
            sb.append(Character.toUpperCase(this.f11168t.b()));
            linkedHashMap.put(String.valueOf(this.f11168t.b()), Integer.valueOf(this.f11168t.a()));
            String strValueOf = String.valueOf(this.f11168t.b());
            m.c(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            m.d(upperCase, "toUpperCase(...)");
            Object objV = this.f11154f.v();
            m.d(objV, "getValue(...)");
            linkedHashMap.put(upperCase, Integer.valueOf(((i.a) p.G((List) objV)).a()));
        } else {
            Object objV2 = this.f11154f.v();
            m.d(objV2, "getValue(...)");
            for (i.a aVar : (Iterable) objV2) {
                char lowerCase = Character.toLowerCase(aVar.b());
                if (aVar.c() >= 0) {
                    sb.append('+');
                    linkedHashMap.put("+" + lowerCase, Integer.valueOf(aVar.c() + 1));
                }
                sb.append(lowerCase);
                linkedHashMap.put(String.valueOf(lowerCase), Integer.valueOf(aVar.a() + 1));
                if (aVar.c() >= 0) {
                    sb.append('+');
                    linkedHashMap.put("+" + aVar.b(), Integer.valueOf(aVar.c()));
                }
                linkedHashMap.put(String.valueOf(aVar.b()), Integer.valueOf(aVar.a()));
                sb.append(aVar.b());
            }
        }
        return new T2.l(sb.toString(), linkedHashMap);
    }

    private final void M1(String str) throws IOException {
        int iIntValue;
        Integer num;
        Integer num2;
        Object objK = new H1.d().k(e3.i.f(new File(new File(FairyRepository.f10588a.k(), str), "params.json"), null, 1, null), FairyRepository.GameParams.class);
        m.b(objK);
        FairyRepository.GameParams gameParams = (FairyRepository.GameParams) objK;
        C1409c c1409c = this.f11154f;
        String pieces = gameParams.getPieces();
        StringBuilder sb = new StringBuilder();
        int length = pieces.length();
        for (int i4 = 0; i4 < length; i4++) {
            char cCharAt = pieces.charAt(i4);
            if (Character.isLetter(cCharAt) && Character.isUpperCase(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        m.d(string, "toString(...)");
        ArrayList arrayList = new ArrayList(string.length());
        int i5 = 0;
        while (true) {
            iIntValue = -2;
            if (i5 >= string.length()) {
                break;
            }
            char cCharAt2 = string.charAt(i5);
            Map<String, Integer> pieceMap = gameParams.getPieceMap();
            int iIntValue2 = (pieceMap == null || (num2 = pieceMap.get(String.valueOf(cCharAt2))) == null) ? -2 : num2.intValue();
            Map<String, Integer> pieceMap2 = gameParams.getPieceMap();
            if (pieceMap2 != null) {
                Integer num3 = pieceMap2.get("+" + cCharAt2);
                if (num3 != null) {
                    iIntValue = num3.intValue();
                }
            }
            arrayList.add(new i.a(cCharAt2, iIntValue2, iIntValue));
            i5++;
        }
        c1409c.accept(arrayList);
        this.f11161m.clear();
        Object objV = this.f11154f.v();
        m.d(objV, "getValue(...)");
        for (i.a aVar : (Iterable) objV) {
            this.f11161m.put(Character.valueOf(aVar.b()), Boolean.valueOf(aVar.c() >= 0));
        }
        if (l2()) {
            this.f11168t.e(Character.toLowerCase(gameParams.getPieces().charAt(0)));
            i.a aVar2 = this.f11168t;
            Map<String, Integer> pieceMap3 = gameParams.getPieceMap();
            if (pieceMap3 != null && (num = pieceMap3.get(String.valueOf(this.f11168t.b()))) != null) {
                iIntValue = num.intValue();
            }
            aVar2.d(iIntValue);
        }
        this.f11173y = !this.f11161m.isEmpty();
        String variant = gameParams.getVariant();
        if (variant == null) {
            variant = "custom_cc";
        }
        this.f11166r = variant;
        this.f11165q = "";
        this.f11167s = "";
        this.f11170v = gameParams.getLib();
        this.f11171w = gameParams.getImageSet();
        this.f11160l.accept(gameParams.getName());
        C1409c c1409c2 = this.f11158j;
        int x4 = gameParams.getX();
        int y4 = gameParams.getY();
        Integer handMode = gameParams.getHandMode();
        c1409c2.accept(new a(x4, y4, handMode != null ? handMode.intValue() : 0));
        this.f11157i.accept(Boolean.valueOf(gameParams.getUniversalBoard()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u T1(File file, String str, k kVar) throws IOException, NumberFormatException {
        R0.j.f3579K.b(file.getAbsolutePath(), str, new e(kVar));
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u U1(u uVar) {
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V1(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u W1(k kVar, Throwable th) {
        kVar.f11165q = th.toString();
        kVar.f11153e.accept(b.f11181g);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X1(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u c2(k kVar) {
        String str = kVar.f11152d;
        if (str == null) {
            kVar.m2();
        } else {
            kVar.H2(str);
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u d2(k kVar, u uVar) {
        FairyRepository.E(FairyRepository.f10588a, null, 1, null);
        kVar.f11159k.accept(Boolean.TRUE);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e2(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u f2(k kVar, Throwable th) {
        cab.shashki.app.ui.chess.fairy.builder.quick.d dVar = (cab.shashki.app.ui.chess.fairy.builder.quick.d) kVar.w0();
        if (dVar != null) {
            dVar.M();
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g2(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String[] i2(k kVar) {
        Set setM = AbstractC0590i.M(u1.f20864a.a());
        Iterator it = kVar.f11163o.values().iterator();
        while (it.hasNext()) {
            setM.addAll((Set) it.next());
        }
        File[] fileArrListFiles = FairyRepository.f10588a.k().listFiles(new FileFilter() { // from class: z0.i1
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.k.j2(file);
            }
        });
        if (fileArrListFiles != null) {
            ArrayList arrayList = new ArrayList(fileArrListFiles.length);
            for (File file : fileArrListFiles) {
                arrayList.add(file.getName());
            }
            setM.removeAll(p.f0(arrayList));
        }
        return (String[]) p.W(p.b0(setM)).toArray(new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j2(File file) {
        return file.isDirectory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u k2(k kVar, String[] strArr) {
        cab.shashki.app.ui.chess.fairy.builder.quick.d dVar = (cab.shashki.app.ui.chess.fairy.builder.quick.d) kVar.w0();
        if (dVar != null) {
            m.b(strArr);
            dVar.P(strArr);
        }
        return u.f3817a;
    }

    private final boolean l2() {
        return this.f11161m.size() == 1 && !((Boolean) p.F(this.f11161m.values())).booleanValue();
    }

    private final void m2() {
        List listG;
        File[] fileArrListFiles = FairyRepository.f10588a.k().listFiles(new FileFilter() { // from class: z0.h1
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.k.n2(file);
            }
        });
        if (fileArrListFiles != null) {
            listG = new ArrayList(fileArrListFiles.length);
            for (File file : fileArrListFiles) {
                listG.add(file.getName());
            }
        } else {
            listG = p.g();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (listG.contains(String.valueOf(jCurrentTimeMillis))) {
            jCurrentTimeMillis++;
        }
        T2.l lVarL1 = L1();
        String str = (String) lVarL1.a();
        Map map = (Map) lVarL1.b();
        Object objV = this.f11160l.v();
        m.d(objV, "getValue(...)");
        String str2 = (String) objV;
        int iC = ((a) this.f11158j.v()).c();
        int iA = ((a) this.f11158j.v()).a();
        String str3 = this.f11170v;
        String str4 = this.f11166r;
        Object objV2 = this.f11157i.v();
        m.d(objV2, "getValue(...)");
        FairyRepository.GameParams gameParams = new FairyRepository.GameParams(str2, iC, iA, 0.5f, 0.5f, str, null, str3, str4, ((Boolean) objV2).booleanValue(), map, Integer.valueOf(((a) this.f11158j.v()).b()), null, 4096, null);
        FairyRepository fairyRepository = FairyRepository.f10588a;
        File file2 = new File(fairyRepository.C(), "params.json");
        String strT = new H1.d().t(gameParams);
        m.d(strT, "toJson(...)");
        e3.i.h(file2, strT, null, 2, null);
        new File(fairyRepository.C().getAbsolutePath()).renameTo(new File(fairyRepository.k(), listG.contains(this.f11166r) ? String.valueOf(jCurrentTimeMillis) : this.f11166r));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n2(File file) {
        return file.isDirectory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e.a o1(int i4) {
        return new e.a(null, Integer.valueOf(i4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u p1(k kVar) throws IOException {
        kVar.M1(kVar.f11152d);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p2(k kVar) {
        kVar.f11159k.accept(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u q1(k kVar, u uVar) {
        kVar.f11153e.accept(b.f11182h);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u q2(k kVar, String str, String str2) throws IOException, NumberFormatException {
        String string;
        FairyRepository.f10588a.C().mkdirs();
        kVar.f11166r = str2;
        kVar.f11167s = "";
        C1409c c1409c = kVar.f11160l;
        m.b(str2);
        if (str2.length() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append((Object) AbstractC1273a.f(str2.charAt(0)));
            String strSubstring = str2.substring(1);
            m.d(strSubstring, "substring(...)");
            sb.append(strSubstring);
            string = sb.toString();
        } else {
            string = str2;
        }
        c1409c.accept(string);
        R0.j.f3579K.b(str, str2, new f(kVar));
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r1(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r2(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u s1(k kVar, Throwable th) {
        th.printStackTrace();
        kVar.f11159k.accept(Boolean.TRUE);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s2(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t1(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t2(int i4, int i5, int i6, List list, String str) {
        this.f11158j.accept(new a(i5, i4, i6));
        this.f11161m.clear();
        Iterator it = list.iterator();
        while (true) {
            boolean z4 = false;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            Character chValueOf = Character.valueOf(n.C0(str2));
            Map map = this.f11161m;
            if (str2.charAt(0) == '+') {
                z4 = true;
            }
            map.put(chValueOf, Boolean.valueOf(z4));
        }
        if (this.f11161m.isEmpty()) {
            int length = str.length() / 2;
            for (int i7 = 0; i7 < length; i7++) {
                char cCharAt = str.charAt(i7);
                if ('A' <= cCharAt && cCharAt < '[') {
                    Integer numValueOf = Integer.valueOf(i7 + 11);
                    if (numValueOf.intValue() >= length) {
                        numValueOf = null;
                    }
                    this.f11161m.put(Character.valueOf(cCharAt), Boolean.valueOf(numValueOf != null && str.charAt(numValueOf.intValue()) == '+'));
                }
            }
        }
        this.f11173y = !this.f11161m.isEmpty();
        ArrayList arrayList = new ArrayList();
        if (this.f11173y) {
            for (Map.Entry entry : this.f11161m.entrySet()) {
                T2.l lVarA = w1.f20876a.a(((Character) entry.getKey()).charValue());
                arrayList.add(new i.a(((Character) entry.getKey()).charValue(), ((Number) lVarA.c()).intValue(), ((Boolean) entry.getValue()).booleanValue() ? ((Number) lVarA.d()).intValue() : -2));
                this.f11168t.e(Character.toLowerCase(((Character) entry.getKey()).charValue()));
                this.f11168t.d(((Number) lVarA.c()).intValue() + 1);
            }
        } else {
            arrayList.add(new i.a('K', 0, 0, 4, null));
            arrayList.add(new i.a('Q', 2, 0, 4, null));
            arrayList.add(new i.a('N', 4, 0, 4, null));
            arrayList.add(new i.a('R', 6, 0, 4, null));
            arrayList.add(new i.a('B', 8, 0, 4, null));
            arrayList.add(new i.a('P', 10, 0, 4, null));
        }
        this.f11154f.accept(arrayList);
        if (this.f11153e.v() != b.f11184j) {
            this.f11153e.accept(b.f11182h);
        } else {
            m2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u w1(k kVar, a aVar) {
        cab.shashki.app.ui.chess.fairy.builder.quick.d dVar = (cab.shashki.app.ui.chess.fairy.builder.quick.d) kVar.w0();
        if (dVar != null) {
            dVar.u(aVar.a() + "x" + aVar.c());
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u x1(k kVar) {
        kVar.G2();
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u x2(String str, String str2, k kVar) throws IOException, NumberFormatException {
        R0.j.f3579K.b(str, str2, new h(kVar));
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u y1(k kVar, Boolean bool) {
        cab.shashki.app.ui.chess.fairy.builder.quick.d dVar = (cab.shashki.app.ui.chess.fairy.builder.quick.d) kVar.w0();
        if (dVar != null) {
            dVar.finish();
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u y2(u uVar) {
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u z1(k kVar, String str) {
        cab.shashki.app.ui.chess.fairy.builder.quick.d dVar;
        if (System.currentTimeMillis() > kVar.f11164p && (dVar = (cab.shashki.app.ui.chess.fairy.builder.quick.d) kVar.w0()) != null) {
            m.b(str);
            dVar.H(str);
        }
        cab.shashki.app.ui.chess.fairy.builder.quick.d dVar2 = (cab.shashki.app.ui.chess.fairy.builder.quick.d) kVar.w0();
        if (dVar2 != null) {
            dVar2.z0("[" + kVar.f11166r + "]");
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z2(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G2() {
        /*
            r5 = this;
            u2.c r0 = r5.f11153e
            java.lang.Object r0 = r0.v()
            cab.shashki.app.ui.chess.fairy.builder.quick.k$b r1 = cab.shashki.app.ui.chess.fairy.builder.quick.k.b.f11178d
            if (r0 == r1) goto L15
            u2.c r0 = r5.f11153e
            java.lang.Object r0 = r0.v()
            cab.shashki.app.ui.chess.fairy.builder.quick.k$b r1 = cab.shashki.app.ui.chess.fairy.builder.quick.k.b.f11181g
            if (r0 == r1) goto L15
            return
        L15:
            u2.c r0 = r5.f11153e
            cab.shashki.app.ui.chess.fairy.builder.quick.k$b r1 = cab.shashki.app.ui.chess.fairy.builder.quick.k.b.f11179e
            r0.accept(r1)
            android.content.Context r0 = r5.r0()
            r1 = 0
            if (r0 == 0) goto L2a
            java.lang.String r2 = "clipboard"
            java.lang.Object r0 = r0.getSystemService(r2)
            goto L2b
        L2a:
            r0 = r1
        L2b:
            boolean r2 = r0 instanceof android.content.ClipboardManager
            if (r2 == 0) goto L32
            android.content.ClipboardManager r0 = (android.content.ClipboardManager) r0
            goto L33
        L32:
            r0 = r1
        L33:
            r2 = 0
            if (r0 == 0) goto L57
            android.content.ClipData r0 = r0.getPrimaryClip()
            if (r0 == 0) goto L57
            int r3 = r0.getItemCount()
            if (r3 <= 0) goto L43
            goto L44
        L43:
            r0 = r1
        L44:
            if (r0 == 0) goto L57
            android.content.ClipData$Item r0 = r0.getItemAt(r2)
            if (r0 == 0) goto L57
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L57
            java.lang.String r0 = r0.toString()
            goto L58
        L57:
            r0 = r1
        L58:
            if (r0 == 0) goto L74
            cab.shashki.app.service.FairyRepository r3 = cab.shashki.app.service.FairyRepository.f10588a
            p3.j r3 = r3.o()
            r4 = 2
            p3.h r2 = p3.j.c(r3, r0, r2, r4, r1)
            if (r2 == 0) goto L74
            java.util.List r2 = r2.a()
            if (r2 == 0) goto L74
            r1 = 1
            java.lang.Object r1 = r2.get(r1)
            java.lang.String r1 = (java.lang.String) r1
        L74:
            r5.f11166r = r1
            if (r0 == 0) goto L86
            if (r1 != 0) goto L7b
            goto L86
        L7b:
            u2.c r2 = r5.f11160l
            r2.accept(r1)
            r5.f11167s = r0
            r5.B1(r0)
            return
        L86:
            android.content.Context r0 = r5.r0()
            if (r0 == 0) goto L94
            int r1 = f0.AbstractC0888D.f14520n2
            java.lang.String r0 = r0.getString(r1)
            if (r0 != 0) goto L96
        L94:
            java.lang.String r0 = "-"
        L96:
            r5.f11165q = r0
            u2.c r0 = r5.f11153e
            cab.shashki.app.ui.chess.fairy.builder.quick.k$b r1 = cab.shashki.app.ui.chess.fairy.builder.quick.k.b.f11181g
            r0.accept(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cab.shashki.app.ui.chess.fairy.builder.quick.k.G2():void");
    }

    public final String K1() {
        return this.f11152d;
    }

    public final void N1() {
        this.f11151A = -1;
        this.f11174z = -1;
        this.f11172x = false;
        b bVar = (b) this.f11153e.v();
        switch (bVar != null ? c.f11192a[bVar.ordinal()] : -1) {
            case 9:
            case 10:
                i.a aVar = this.f11169u;
                if (aVar != null) {
                    Object objV = this.f11154f.v();
                    m.d(objV, "getValue(...)");
                    List listD0 = p.d0((Collection) objV);
                    listD0.add(aVar);
                    this.f11154f.accept(listD0);
                    this.f11153e.accept(b.f11182h);
                    break;
                }
                break;
            case 11:
                this.f11153e.accept(b.f11185k);
                break;
        }
    }

    public final void O1(e.a aVar, int i4) {
        m.e(aVar, "item");
        b bVar = (b) this.f11153e.v();
        switch (bVar == null ? -1 : c.f11192a[bVar.ordinal()]) {
            case 7:
                Character chA = aVar.a();
                if (chA != null) {
                    this.f11169u = new i.a(chA.charValue(), 0, 0, 6, null);
                    this.f11153e.accept(b.f11186l);
                    break;
                }
                break;
            case 8:
                i.a aVar2 = this.f11169u;
                if (aVar2 != null) {
                    aVar2.d(i4 * 2);
                    if (m.a(this.f11168t, aVar2)) {
                        aVar2.d(aVar2.a() + 1);
                        aVar2.a();
                    }
                    if (!this.f11173y) {
                        this.f11153e.accept(b.f11187m);
                        break;
                    } else if (!m.a(this.f11161m.get(Character.valueOf(aVar2.b())), Boolean.TRUE)) {
                        this.f11174z = -1;
                        this.f11151A = -1;
                        this.f11153e.accept(b.f11182h);
                        break;
                    } else {
                        this.f11151A = aVar2.c() / 2;
                        this.f11153e.accept(b.f11188n);
                        break;
                    }
                }
                break;
            case 9:
            case 10:
                i.a aVar3 = this.f11169u;
                if (aVar3 != null) {
                    aVar3.f(i4 * 2);
                }
                if (!this.f11173y) {
                    if (this.f11153e.v() == b.f11187m) {
                        this.f11153e.accept(b.f11188n);
                        break;
                    }
                } else {
                    this.f11174z = -1;
                    this.f11151A = -1;
                    this.f11153e.accept(b.f11182h);
                    break;
                }
                break;
        }
    }

    public final void P1() {
        b bVar = (b) this.f11153e.v();
        switch (bVar == null ? -1 : c.f11192a[bVar.ordinal()]) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
                this.f11174z = -1;
                this.f11151A = -1;
                this.f11169u = null;
                this.f11153e.accept(b.f11182h);
                break;
            case 11:
            default:
                cab.shashki.app.ui.chess.fairy.builder.quick.d dVar = (cab.shashki.app.ui.chess.fairy.builder.quick.d) w0();
                if (dVar != null) {
                    dVar.finish();
                    break;
                }
                break;
        }
    }

    public final void Q1() throws IOException {
        if (this.f11153e.v() == b.f11180f) {
            H1(this.f11167s);
        }
    }

    public final void R1() {
        cab.shashki.app.ui.chess.fairy.builder.quick.d dVar = (cab.shashki.app.ui.chess.fairy.builder.quick.d) w0();
        if (dVar != null) {
            dVar.n1(this.f11167s);
        }
    }

    public final void S1(final String str, String str2) {
        m.e(str, HalmaParams.NAME);
        m.e(str2, "text");
        this.f11153e.accept(b.f11179e);
        this.f11160l.accept(str);
        this.f11166r = str;
        this.f11167s = str2;
        final File file = new File(FairyRepository.f10588a.C(), "var.ini");
        AbstractC1488f abstractC1488fJ = AbstractC1488f.q(new Callable() { // from class: z0.E0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cab.shashki.app.ui.chess.fairy.builder.quick.k.T1(file, str, this);
            }
        }).H(S2.a.c()).J(16L, TimeUnit.SECONDS);
        final InterfaceC1016l interfaceC1016l = new InterfaceC1016l() { // from class: z0.P0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.k.U1((T2.u) obj);
            }
        };
        C2.e eVar = new C2.e() { // from class: z0.a1
            @Override // C2.e
            public final void accept(Object obj) {
                cab.shashki.app.ui.chess.fairy.builder.quick.k.V1(interfaceC1016l, obj);
            }
        };
        final InterfaceC1016l interfaceC1016l2 = new InterfaceC1016l() { // from class: z0.l1
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.k.W1(this.f20836d, (Throwable) obj);
            }
        };
        A2.c cVarD = abstractC1488fJ.D(eVar, new C2.e() { // from class: z0.p1
            @Override // C2.e
            public final void accept(Object obj) {
                cab.shashki.app.ui.chess.fairy.builder.quick.k.X1(interfaceC1016l2, obj);
            }
        });
        m.d(cVarD, "subscribe(...)");
        R2.a.a(cVarD, t0());
    }

    public final void Y1() {
        this.f11151A = -1;
        this.f11174z = -1;
        Object objV = this.f11153e.v();
        b bVar = b.f11182h;
        if (objV == bVar) {
            this.f11153e.accept(b.f11189o);
        } else {
            this.f11169u = null;
            this.f11153e.accept(bVar);
        }
    }

    public final void Z1() {
        if (this.f11167s.length() > 0) {
            this.f11153e.accept(b.f11180f);
            cab.shashki.app.ui.chess.fairy.builder.quick.d dVar = (cab.shashki.app.ui.chess.fairy.builder.quick.d) w0();
            if (dVar != null) {
                dVar.n1(this.f11167s);
            }
        }
    }

    public final void a2(i.a aVar, int i4) {
        m.e(aVar, "item");
        b bVar = (b) this.f11153e.v();
        int i5 = bVar == null ? -1 : c.f11192a[bVar.ordinal()];
        if (i5 == 8 || i5 == 11) {
            if (this.f11172x || this.f11153e.v() == b.f11182h) {
                this.f11172x = true;
                this.f11169u = aVar;
                this.f11174z = i4;
                this.f11151A = aVar.a() / 2;
                this.f11153e.accept(b.f11186l);
                return;
            }
            return;
        }
        if (i5 != 12) {
            return;
        }
        C1409c c1409c = this.f11154f;
        Object objV = c1409c.v();
        m.d(objV, "getValue(...)");
        List listD0 = p.d0((Collection) objV);
        listD0.remove(i4);
        c1409c.accept(listD0);
    }

    public final void b2() {
        AbstractC1488f abstractC1488fW = AbstractC1488f.q(new Callable() { // from class: z0.U0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cab.shashki.app.ui.chess.fairy.builder.quick.k.c2(this.f20776d);
            }
        }).H(S2.a.c()).w(AbstractC1559a.a());
        final InterfaceC1016l interfaceC1016l = new InterfaceC1016l() { // from class: z0.V0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.k.d2(this.f20779d, (T2.u) obj);
            }
        };
        C2.e eVar = new C2.e() { // from class: z0.W0
            @Override // C2.e
            public final void accept(Object obj) {
                cab.shashki.app.ui.chess.fairy.builder.quick.k.e2(interfaceC1016l, obj);
            }
        };
        final InterfaceC1016l interfaceC1016l2 = new InterfaceC1016l() { // from class: z0.X0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.k.f2(this.f20786d, (Throwable) obj);
            }
        };
        A2.c cVarD = abstractC1488fW.D(eVar, new C2.e() { // from class: z0.Y0
            @Override // C2.e
            public final void accept(Object obj) {
                cab.shashki.app.ui.chess.fairy.builder.quick.k.g2(interfaceC1016l2, obj);
            }
        });
        m.d(cVarD, "subscribe(...)");
        R2.a.a(cVarD, t0());
    }

    public final void h2() {
        if (this.f11162n.isEmpty()) {
            AbstractC1488f abstractC1488fH = AbstractC1488f.q(new Callable() { // from class: z0.S0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return cab.shashki.app.ui.chess.fairy.builder.quick.k.i2(this.f20768d);
                }
            }).H(S2.a.a());
            m.d(abstractC1488fH, "subscribeOn(...)");
            c0(abstractC1488fH, new InterfaceC1016l() { // from class: z0.T0
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return cab.shashki.app.ui.chess.fairy.builder.quick.k.k2(this.f20773d, (String[]) obj);
                }
            });
        } else {
            cab.shashki.app.ui.chess.fairy.builder.quick.d dVar = (cab.shashki.app.ui.chess.fairy.builder.quick.d) w0();
            if (dVar != null) {
                dVar.P((String[]) this.f11162n.toArray(new String[0]));
            }
        }
    }

    public final void o2() {
        final String absolutePath;
        String str = this.f11170v;
        if (str != null) {
            File file = new File(FairyRepository.f10588a.p(), str);
            if (!file.exists() || !file.isFile()) {
                file = null;
            }
            if (file == null || (absolutePath = file.getAbsolutePath()) == null) {
                return;
            }
            this.f11153e.accept(b.f11184j);
            AbstractC1488f abstractC1488fH = AbstractC1488f.r(this.f11162n).H(S2.a.c()).J(this.f11162n.size() * 6, TimeUnit.SECONDS).h(new C2.a() { // from class: z0.Z0
                @Override // C2.a
                public final void run() {
                    cab.shashki.app.ui.chess.fairy.builder.quick.k.p2(this.f20794a);
                }
            });
            final InterfaceC1016l interfaceC1016l = new InterfaceC1016l() { // from class: z0.b1
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return cab.shashki.app.ui.chess.fairy.builder.quick.k.q2(this.f20801d, absolutePath, (String) obj);
                }
            };
            C2.e eVar = new C2.e() { // from class: z0.c1
                @Override // C2.e
                public final void accept(Object obj) {
                    cab.shashki.app.ui.chess.fairy.builder.quick.k.r2(interfaceC1016l, obj);
                }
            };
            final g gVar = g.f11193m;
            A2.c cVarD = abstractC1488fH.D(eVar, new C2.e() { // from class: z0.d1
                @Override // C2.e
                public final void accept(Object obj) {
                    cab.shashki.app.ui.chess.fairy.builder.quick.k.s2(gVar, obj);
                }
            });
            m.d(cVarD, "subscribe(...)");
            R2.a.a(cVarD, t0());
        }
    }

    public final void u2(String str) {
        m.e(str, "text");
        this.f11164p = System.currentTimeMillis() + 500;
        this.f11160l.accept(str);
    }

    public void v1(cab.shashki.app.ui.chess.fairy.builder.quick.d dVar) {
        m.e(dVar, "view");
        super.q0(dVar);
        C2();
        C1409c c1409c = this.f11159k;
        m.d(c1409c, "finish");
        d0(c1409c, new InterfaceC1016l() { // from class: z0.r1
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.k.y1(this.f20853d, (Boolean) obj);
            }
        });
        C1409c c1409c2 = this.f11160l;
        m.d(c1409c2, "title");
        d0(c1409c2, new InterfaceC1016l() { // from class: z0.s1
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.k.z1(this.f20856d, (String) obj);
            }
        });
        C1409c c1409c3 = this.f11157i;
        m.d(c1409c3, "universal");
        d0(c1409c3, new InterfaceC1016l() { // from class: z0.t1
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.k.A1(this.f20859d, (Boolean) obj);
            }
        });
        C1409c c1409c4 = this.f11158j;
        m.d(c1409c4, HalmaParams.SIZE);
        d0(c1409c4, new InterfaceC1016l() { // from class: cab.shashki.app.ui.chess.fairy.builder.quick.j
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return k.w1(this.f11150d, (k.a) obj);
            }
        });
        if (this.f11152d == null) {
            if (this.f11153e.v() == b.f11178d || this.f11153e.v() == b.f11181g) {
                Y(500, new InterfaceC1005a() { // from class: z0.F0
                    @Override // g3.InterfaceC1005a
                    public final Object a() {
                        return cab.shashki.app.ui.chess.fairy.builder.quick.k.x1(this.f20734d);
                    }
                });
            }
        }
    }

    public final void v2(boolean z4) {
        this.f11157i.accept(Boolean.valueOf(z4));
    }

    public final void w2(final String str) {
        String string;
        m.e(str, "variant");
        this.f11166r = str;
        this.f11165q = "";
        this.f11167s = "";
        C1409c c1409c = this.f11160l;
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append((Object) AbstractC1273a.f(str.charAt(0)));
            String strSubstring = str.substring(1);
            m.d(strSubstring, "substring(...)");
            sb.append(strSubstring);
            string = sb.toString();
        } else {
            string = str;
        }
        c1409c.accept(string);
        this.f11153e.accept(b.f11179e);
        if (this.f11170v == null && !AbstractC0590i.q(u1.f20864a.a(), str)) {
            Iterator it = this.f11163o.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Set) entry.getValue()).contains(str)) {
                    this.f11170v = (String) entry.getKey();
                    break;
                }
            }
            if (this.f11170v == null) {
                this.f11159k.accept(Boolean.TRUE);
                return;
            }
        }
        String str2 = this.f11170v;
        final String absolutePath = null;
        if (str2 != null) {
            File file = new File(FairyRepository.f10588a.p(), str2);
            if (!file.exists() || !file.isFile()) {
                file = null;
            }
            if (file != null) {
                absolutePath = file.getAbsolutePath();
            }
        }
        AbstractC1488f abstractC1488fJ = AbstractC1488f.q(new Callable() { // from class: z0.j1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cab.shashki.app.ui.chess.fairy.builder.quick.k.x2(absolutePath, str, this);
            }
        }).H(S2.a.c()).J(8L, TimeUnit.SECONDS);
        final InterfaceC1016l interfaceC1016l = new InterfaceC1016l() { // from class: z0.k1
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.k.y2((T2.u) obj);
            }
        };
        C2.e eVar = new C2.e() { // from class: z0.m1
            @Override // C2.e
            public final void accept(Object obj) {
                cab.shashki.app.ui.chess.fairy.builder.quick.k.z2(interfaceC1016l, obj);
            }
        };
        final InterfaceC1016l interfaceC1016l2 = new InterfaceC1016l() { // from class: z0.n1
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.k.A2(this.f20838d, (Throwable) obj);
            }
        };
        A2.c cVarD = abstractC1488fJ.D(eVar, new C2.e() { // from class: z0.o1
            @Override // C2.e
            public final void accept(Object obj) {
                cab.shashki.app.ui.chess.fairy.builder.quick.k.B2(interfaceC1016l2, obj);
            }
        });
        m.d(cVarD, "subscribe(...)");
        R2.a.a(cVarD, t0());
    }
}