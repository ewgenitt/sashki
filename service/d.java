package cab.shashki.app.service;

import N0.C0573k;
import O0.f;
import T2.u;
import U0.e;
import V0.i;
import V0.k;
import X0.f;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import cab.shashki.app.ShashkiApp;
import cab.shashki.app.db.entities.CheckersParams;
import cab.shashki.app.db.entities.HalmaParams;
import cab.shashki.app.service.FairyRepository;
import cab.shashki.app.service.b;
import cab.shashki.cpp.CppGame;
import e0.InterfaceC0869b;
import e0.InterfaceC0870c;
import e0.InterfaceC0871d;
import f0.AbstractC0888D;
import g3.InterfaceC1005a;
import g3.InterfaceC1016l;
import h3.h;
import h3.l;
import h3.m;
import j0.AbstractC1089v;
import j0.C1091x;
import j0.InterfaceC1068a;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import k0.C1143k;
import l0.C1174d;
import m0.C1184d;
import n0.C1205d;
import p3.n;
import q0.C1275A;
import q0.C1277a;
import q0.C1280d;
import q0.C1290n;
import q0.C1297v;
import q0.C1301z;
import q0.D;
import q0.InterfaceC1298w;
import q0.e0;
import s0.C1371a;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class d implements InterfaceC1298w {

    /* renamed from: r */
    public static final a f10847r = new a(null);

    /* renamed from: a */
    private final D f10848a = new D(0, null, 3, null);

    /* renamed from: b */
    private final C1184d f10849b;

    /* renamed from: c */
    private final M.a f10850c;

    /* renamed from: d */
    private final A2.b f10851d;

    /* renamed from: e */
    private C1091x f10852e;

    /* renamed from: f */
    private boolean f10853f;

    /* renamed from: g */
    private boolean f10854g;

    /* renamed from: h */
    private boolean f10855h;

    /* renamed from: i */
    private boolean f10856i;

    /* renamed from: j */
    private int f10857j;

    /* renamed from: k */
    private Intent f10858k;

    /* renamed from: l */
    private final ExecutorService f10859l;

    /* renamed from: m */
    private int f10860m;

    /* renamed from: n */
    private int f10861n;

    /* renamed from: o */
    private boolean f10862o;

    /* renamed from: p */
    private InterfaceC0870c f10863p;

    /* renamed from: q */
    private String f10864q;

    public static final class a {
        public /* synthetic */ a(h hVar) {
            this();
        }

        private a() {
        }
    }

    private final class b implements C1091x.a {
        public b() {
        }

        @Override // j0.C1091x.a
        public InterfaceC0870c a() {
            return d.this.f10863p;
        }

        @Override // j0.C1091x.a
        public void b() {
            d.this.T();
        }

        @Override // j0.C1091x.a
        public void c(Intent intent) {
            m.e(intent, "i");
            d.this.f10850c.d(intent);
        }

        @Override // j0.C1091x.a
        public void makeMove(String str) {
            m.e(str, "move");
            d.this.Q(str);
        }
    }

    /* synthetic */ class c extends l implements InterfaceC1016l {
        c(Object obj) {
            super(1, obj, C1184d.class, "updateNetDevices", "updateNetDevices(Ljava/util/List;)V", 0);
        }

        public final void m(List list) {
            m.e(list, "p0");
            ((C1184d) this.f16244e).l(list);
        }

        @Override // g3.InterfaceC1016l
        public /* bridge */ /* synthetic */ Object o(Object obj) {
            m((List) obj);
            return u.f3817a;
        }
    }

    public d() {
        C1184d c1184d = new C1184d();
        this.f10849b = c1184d;
        ShashkiApp.a aVar = ShashkiApp.f10561b;
        M.a aVarB = M.a.b(aVar.a());
        m.d(aVarB, "getInstance(...)");
        this.f10850c = aVarB;
        this.f10851d = new A2.b();
        this.f10859l = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: q0.L
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return cab.shashki.app.service.d.H(runnable);
            }
        });
        if (Build.VERSION.SDK_INT >= 33) {
            aVar.a().registerReceiver(c1184d, C1184d.f17305f.a(), 4);
        } else {
            aVar.a().registerReceiver(c1184d, C1184d.f17305f.a());
        }
    }

    public static final void B(d dVar, int i4) {
        InterfaceC0870c interfaceC0870c = dVar.f10863p;
        dVar.Q(interfaceC0870c != null ? interfaceC0870c.artificialIntelligence(i4) : null);
    }

    public static final void C(d dVar, long j4) {
        InterfaceC0870c interfaceC0870c = dVar.f10863p;
        dVar.Q(interfaceC0870c != null ? interfaceC0870c.artificialIntelligence(j4) : null);
    }

    private final void D(List list) {
        InterfaceC0870c interfaceC0870c = this.f10863p;
        if (interfaceC0870c == null || !cab.shashki.app.service.b.I(cab.shashki.app.service.b.f10603a, interfaceC0870c, null, list, 0, false, 24, null)) {
            InterfaceC0870c interfaceC0870c2 = this.f10863p;
            if (interfaceC0870c2 != null) {
                interfaceC0870c2.resetGame();
            }
            this.f10848a.n(null, null, true);
        }
    }

    private final boolean E(boolean z4) {
        InterfaceC0870c interfaceC0870c;
        InterfaceC0870c interfaceC0870c2 = this.f10863p;
        InterfaceC1068a interfaceC1068a = interfaceC0870c2 instanceof InterfaceC1068a ? (InterfaceC1068a) interfaceC0870c2 : null;
        if (interfaceC1068a != null) {
            return interfaceC1068a.f();
        }
        synchronized (this) {
            if (d().intValue() >= 0) {
                return true;
            }
            if (this.f10854g && (interfaceC0870c = this.f10863p) != null && interfaceC0870c.getPlayer() == z4) {
                return false;
            }
            this.f10854g = true;
            u uVar = u.f3817a;
            return true;
        }
    }

    public static final void G(d dVar) {
        C1290n c1290nH = dVar.f10848a.h();
        InterfaceC0870c interfaceC0870c = dVar.f10863p;
        if (interfaceC0870c != null) {
            cab.shashki.app.service.b.I(cab.shashki.app.service.b.f10603a, interfaceC0870c, c1290nH.k(), c1290nH.n(), 0, true, 8, null);
        }
        dVar.f10850c.d(new Intent("MainService.READY"));
    }

    public static final Thread H(Runnable runnable) {
        return new Thread(new ThreadGroup("workGroup"), runnable, "workThread", 1000000L);
    }

    public static final void I(d dVar, String str) {
        if (dVar.c()) {
            return;
        }
        dVar.f10864q = null;
        InterfaceC0870c interfaceC0870c = dVar.f10863p;
        InterfaceC0869b interfaceC0869b = interfaceC0870c instanceof InterfaceC0869b ? (InterfaceC0869b) interfaceC0870c : null;
        if (interfaceC0869b != null) {
            interfaceC0869b.quit();
        }
        dVar.J(str);
        dVar.W();
        dVar.f10850c.d(new Intent("MainService.READY"));
    }

    private final void J(String str) {
        W0.d dVar;
        Log.d("ShashkiServiceBinder", "init " + str);
        this.f10863p = null;
        System.gc();
        cab.shashki.app.service.b bVar = cab.shashki.app.service.b.f10603a;
        X(bVar.K(str));
        long jB = C0573k.f2973a.B(!bVar.F(Integer.valueOf(a())));
        final int i4 = (int) (jB >> 20);
        ShashkiApp.a aVar = ShashkiApp.f10561b;
        aVar.d(false);
        this.f10852e = new C1091x(new b(), new InterfaceC1016l() { // from class: q0.P
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.service.d.K(this.f18988d, ((Integer) obj).intValue());
            }
        });
        int iA = a();
        b.a aVar2 = b.a.f10832y;
        if (iA == aVar2.c()) {
            this.f10863p = new Q0.b(i4, C1280d.f19028a.e(), aVar.a().getAssets());
            return;
        }
        if (aVar.b() && !bVar.D(Integer.valueOf(a()))) {
            if (bVar.w(Integer.valueOf(a())) == AbstractC0888D.t5) {
                this.f10863p = new Q0.b(i4, C1280d.f19028a.e(), aVar.a().getAssets());
                X(aVar2.c());
                return;
            } else if (bVar.w(Integer.valueOf(a())) == AbstractC0888D.D6) {
                this.f10863p = new k(i4);
                X(b.a.f10706X.c());
                return;
            } else {
                this.f10863p = W0.d.L(jB, false);
                X(b.a.f10742g.c());
                return;
            }
        }
        InterfaceC0869b.a aVar3 = new InterfaceC0869b.a() { // from class: q0.Q
            @Override // e0.InterfaceC0869b.a
            public final void a(int i5, int i6, double d4, String str2) {
                cab.shashki.app.service.d.L(this.f18989a, i5, i6, d4, str2);
            }
        };
        if (a() == b.a.f10606A.c()) {
            this.f10863p = new f(aVar3);
            return;
        }
        if (a() == b.a.f10757j.c() || a() == b.a.f10837z.c() || a() == b.a.f10611B.c()) {
            P(i4, aVar3);
            return;
        }
        if (a() == b.a.f10706X.c()) {
            O(i4, aVar3);
            return;
        }
        if (a() == b.a.f10828x0.c()) {
            e0 e0Var = e0.f19058a;
            this.f10863p = CppGame.universal(i4, e0Var.g(), aVar3);
            CheckersParams checkersParamsG = e0Var.g();
            m.b(checkersParamsG);
            this.f10864q = String.valueOf(checkersParamsG.getId());
            return;
        }
        if (a() == b.a.f10607A0.c()) {
            C1297v c1297v = C1297v.f19095a;
            this.f10863p = CppGame.halma(i4, c1297v.g());
            HalmaParams halmaParamsG = c1297v.g();
            m.b(halmaParamsG);
            this.f10864q = String.valueOf(halmaParamsG.getId());
            return;
        }
        InterfaceC0870c interfaceC0870cI = bVar.i(a(), i4, aVar3, new InterfaceC1005a() { // from class: q0.S
            @Override // g3.InterfaceC1005a
            public final Object a() {
                return cab.shashki.app.service.d.M(this.f18990d, i4);
            }
        });
        this.f10863p = interfaceC0870cI;
        if (interfaceC0870cI != null) {
            if (a() == b.a.f10808t0.c()) {
                FairyRepository.a aVarL = FairyRepository.f10588a.l();
                this.f10864q = aVarL != null ? aVarL.a() : null;
                return;
            }
            return;
        }
        C1277a c1277a = C1277a.f19012a;
        CppGame.setCakeRandomization(c1277a.d());
        CppGame.setThaiRandomization(c1277a.f());
        CppGame.setKestoAlphaNotation(c1277a.c());
        CppGame.setPoolAlphaNotation(c1277a.e());
        if (bVar.z(Integer.valueOf(a()))) {
            N(str);
            return;
        }
        f.a aVar4 = O0.f.f3102J;
        if (aVar4.a(a()) != null) {
            f.b bVarA = aVar4.a(a());
            m.b(bVarA);
            this.f10863p = new O0.b(i4, bVarA, aVar3);
        } else {
            if (a() != b.a.f10742g.c() && a() != b.a.f10747h.c()) {
                this.f10863p = CppGame.get(a(), i4, aVar3);
                return;
            }
            boolean z4 = a() == b.a.f10747h.c();
            try {
                dVar = W0.d.L(jB, z4);
            } catch (OutOfMemoryError unused) {
                dVar = new W0.d(8, z4);
            }
            this.f10863p = dVar;
        }
    }

    public static final u K(d dVar, int i4) {
        dVar.X(i4);
        return u.f3817a;
    }

    public static final void L(d dVar, int i4, int i5, double d4, String str) {
        Intent intentPutExtra = new Intent("MainService.RESULT").putExtra("depth", i4).putExtra("score", i5).putExtra("time", d4).putExtra("move", str).putExtra("player", dVar.f10856i).putExtra(HalmaParams.ID, dVar.f10857j);
        dVar.f10850c.d(intentPutExtra);
        dVar.f10858k = intentPutExtra;
    }

    public static final InterfaceC0870c M(d dVar, int i4) {
        dVar.X(b.a.f10832y.c());
        return new Q0.b(i4, C1280d.f19028a.e(), ShashkiApp.f10561b.a().getAssets());
    }

    private final void N(String str) {
        InterfaceC0870c c1174d;
        C1091x c1091x;
        C1184d c1184d = this.f10849b;
        C1091x c1091x2 = this.f10852e;
        if (c1091x2 == null) {
            m.r("shashkiBroadcaster");
            c1091x2 = null;
        }
        c1184d.k(c1091x2);
        if (n.x(str, "Bluetooth", false, 2, null)) {
            ExecutorService executorService = this.f10859l;
            m.d(executorService, "executor");
            C1091x c1091x3 = this.f10852e;
            if (c1091x3 == null) {
                m.r("shashkiBroadcaster");
                c1091x3 = null;
            }
            c1174d = new C1143k(executorService, c1091x3, str);
        } else if (n.x(str, "WiFiLocal", false, 2, null)) {
            ExecutorService executorService2 = this.f10859l;
            m.d(executorService2, "executor");
            ShashkiApp shashkiAppA = ShashkiApp.f10561b.a();
            C1091x c1091x4 = this.f10852e;
            if (c1091x4 == null) {
                m.r("shashkiBroadcaster");
                c1091x = null;
            } else {
                c1091x = c1091x4;
            }
            c1174d = new C1205d(executorService2, shashkiAppA, c1091x, this.f10849b, str);
        } else {
            if (!n.x(str, "Fire", false, 2, null)) {
                return;
            }
            c cVar = new c(this.f10849b);
            ExecutorService executorService3 = this.f10859l;
            m.d(executorService3, "executor");
            C1091x c1091x5 = this.f10852e;
            if (c1091x5 == null) {
                m.r("shashkiBroadcaster");
                c1091x5 = null;
            }
            c1174d = new C1174d(cVar, executorService3, c1091x5, str);
        }
        this.f10863p = c1174d;
        cab.shashki.app.db.entities.a aVarC = cab.shashki.app.service.a.f10602a.c(a());
        this.f10864q = aVarC != null ? aVarC.id() : null;
    }

    private final void O(int i4, InterfaceC0869b.a aVar) {
        int i5;
        try {
            i5 = i4;
            try {
                this.f10863p = new i(i5, aVar, null, 4, null);
            } catch (Exception e4) {
                e = e4;
                e.printStackTrace();
                this.f10863p = new k(i5);
                ShashkiApp.f10561b.d(true);
            }
        } catch (Exception e5) {
            e = e5;
            i5 = i4;
        }
    }

    private final void P(int i4, InterfaceC0869b.a aVar) {
        try {
            this.f10863p = new e(i4, aVar, true, a() == b.a.f10611B.c() ? e.b.f3888g : e.b.f3886e);
        } catch (Exception e4) {
            e4.printStackTrace();
            boolean zE = C1280d.f19028a.e();
            ShashkiApp.a aVar2 = ShashkiApp.f10561b;
            this.f10863p = new Q0.b(i4, zE, aVar2.a().getAssets());
            X(b.a.f10832y.c());
            aVar2.d(true);
        }
    }

    public final void Q(String str) {
        synchronized (this) {
            try {
                this.f10854g = false;
                if (str != null && str.length() != 0) {
                    R(str);
                    this.f10850c.d(new Intent("MainService.MOVE").putExtra("move", str));
                }
                u uVar = u.f3817a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void R(String str) {
        InterfaceC0870c interfaceC0870c = this.f10863p;
        boolean z4 = false;
        if (interfaceC0870c != null && interfaceC0870c.getPlayer()) {
            z4 = true;
        }
        this.f10853f = z4;
        this.f10848a.A(!z4);
        this.f10848a.d(str, !(this.f10863p instanceof InterfaceC1068a));
    }

    public final void T() {
        InterfaceC0870c interfaceC0870c = this.f10863p;
        m.b(interfaceC0870c);
        this.f10853f = interfaceC0870c.getPlayer();
        D d4 = this.f10848a;
        String startPosition = interfaceC0870c.getStartPosition();
        m.d(startPosition, "getStartPosition(...)");
        String[] history = interfaceC0870c.getHistory();
        m.d(history, "getHistory(...)");
        d4.u(startPosition, history);
    }

    private final void U(String str, String str2, String str3) {
        String strG;
        InterfaceC0870c interfaceC0870c = this.f10863p;
        InterfaceC1068a interfaceC1068a = interfaceC0870c instanceof InterfaceC1068a ? (InterfaceC1068a) interfaceC0870c : null;
        if (interfaceC1068a == null || interfaceC1068a.c()) {
            C1275A c1275a = C1275A.f18941a;
            int iA = a();
            C1290n c1290nH = this.f10848a.h();
            InterfaceC0870c interfaceC0870c2 = this.f10863p;
            InterfaceC1068a interfaceC1068a2 = interfaceC0870c2 instanceof InterfaceC1068a ? (InterfaceC1068a) interfaceC0870c2 : null;
            if (interfaceC1068a2 == null || (strG = interfaceC1068a2.g()) == null) {
                strG = this.f10864q;
            }
            c1275a.a(iA, str3, c1290nH, strG);
        }
        InterfaceC0870c interfaceC0870c3 = this.f10863p;
        m.b(interfaceC0870c3);
        this.f10853f = interfaceC0870c3.getPlayer();
        this.f10848a.n(str, str2, !(this.f10863p instanceof InterfaceC1068a));
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void W() {
        /*
            r6 = this;
            q0.D r0 = r6.f10848a
            cab.shashki.app.service.b r1 = cab.shashki.app.service.b.f10603a
            int r2 = r6.a()
            int r1 = r1.J(r2)
            java.lang.String r2 = r6.f10864q
            q0.n r0 = r0.j(r1, r2)
            java.lang.String r1 = r0.k()
            java.util.List r0 = r0.n()
            e0.c r2 = r6.f10863p
            boolean r3 = r2 instanceof j0.InterfaceC1068a
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L62
            if (r1 == 0) goto L50
            if (r2 == 0) goto L29
            r2.setPosition(r1)
        L29:
            e0.c r1 = r6.f10863p
            if (r1 == 0) goto L32
            e0.c$a r1 = r1.getState()
            goto L33
        L32:
            r1 = r5
        L33:
            e0.c$a r2 = e0.InterfaceC0870c.a.BLACK_WIN
            if (r1 == r2) goto L48
            e0.c r1 = r6.f10863p
            if (r1 == 0) goto L3f
            e0.c$a r5 = r1.getState()
        L3f:
            e0.c$a r1 = e0.InterfaceC0870c.a.WHITE_WIN
            if (r5 != r1) goto L44
            goto L48
        L44:
            r6.D(r0)
            goto L53
        L48:
            e0.c r0 = r6.f10863p
            if (r0 == 0) goto L53
            r0.resetGame()
            goto L53
        L50:
            r6.D(r0)
        L53:
            e0.c r0 = r6.f10863p
            r1 = 0
            if (r0 == 0) goto L5f
            boolean r0 = r0.getPlayer()
            if (r0 != r4) goto L5f
            r1 = 1
        L5f:
            r6.f10853f = r1
            goto L73
        L62:
            boolean r3 = r2 instanceof j0.AbstractC1089v
            if (r3 == 0) goto L69
            r5 = r2
            j0.v r5 = (j0.AbstractC1089v) r5
        L69:
            if (r5 == 0) goto L6e
            r5.a0(r1, r0)
        L6e:
            q0.D r0 = r6.f10848a
            r0.m()
        L73:
            s0.a r0 = s0.C1371a.f19693a
            int r1 = r6.a()
            int r2 = r6.j()
            r0.i(r1, r2)
            r6.f10862o = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cab.shashki.app.service.d.W():void");
    }

    private void X(int i4) {
        this.f10860m = i4;
        this.f10861n = cab.shashki.app.service.b.f10603a.w(Integer.valueOf(i4));
    }

    public static final void Y(InterfaceC0869b interfaceC0869b, d dVar) {
        interfaceC0869b.startAnalise();
        dVar.f10855h = false;
    }

    public final void F() {
        String strG;
        InterfaceC0870c interfaceC0870c = this.f10863p;
        if (interfaceC0870c != null) {
            interfaceC0870c.stop();
            boolean z4 = interfaceC0870c instanceof InterfaceC1068a;
            InterfaceC1068a interfaceC1068a = z4 ? (InterfaceC1068a) interfaceC0870c : null;
            if (interfaceC1068a == null || interfaceC1068a.c()) {
                C1275A c1275a = C1275A.f18941a;
                int iA = a();
                String position = interfaceC0870c.getPosition();
                C1290n c1290nH = this.f10848a.h();
                InterfaceC1068a interfaceC1068a2 = z4 ? (InterfaceC1068a) interfaceC0870c : null;
                if (interfaceC1068a2 == null || (strG = interfaceC1068a2.g()) == null) {
                    strG = this.f10864q;
                }
                c1275a.a(iA, position, c1290nH, strG);
            }
            InterfaceC0869b interfaceC0869b = interfaceC0870c instanceof InterfaceC0869b ? (InterfaceC0869b) interfaceC0870c : null;
            if (interfaceC0869b != null) {
                interfaceC0869b.quit();
            }
        }
        this.f10863p = null;
        this.f10859l.shutdownNow();
        this.f10851d.d();
        ShashkiApp.f10561b.a().unregisterReceiver(this.f10849b);
    }

    public final void S() {
        if (this.f10863p instanceof InterfaceC1068a) {
            return;
        }
        this.f10848a.p();
    }

    public final void V() {
        this.f10848a.A(this.f10853f);
        this.f10848a.v();
    }

    @Override // q0.InterfaceC1298w
    public int a() {
        return this.f10860m;
    }

    @Override // q0.InterfaceC1298w
    public void b(int i4) {
        InterfaceC0870c interfaceC0870c = this.f10863p;
        final InterfaceC0869b interfaceC0869b = interfaceC0870c instanceof InterfaceC0869b ? (InterfaceC0869b) interfaceC0870c : null;
        if (interfaceC0869b != null) {
            this.f10855h = true;
            this.f10858k = null;
            this.f10856i = this.f10853f;
            this.f10857j = i4;
            interfaceC0869b.stop();
            this.f10859l.submit(new Runnable() { // from class: q0.J
                @Override // java.lang.Runnable
                public final void run() {
                    cab.shashki.app.service.d.Y(interfaceC0869b, this);
                }
            });
        }
    }

    @Override // q0.InterfaceC1298w
    public boolean c() {
        return this.f10862o;
    }

    @Override // q0.InterfaceC1298w
    public Integer d() {
        InterfaceC0870c interfaceC0870c = this.f10863p;
        InterfaceC0871d interfaceC0871d = interfaceC0870c instanceof InterfaceC0871d ? (InterfaceC0871d) interfaceC0870c : null;
        return Integer.valueOf(interfaceC0871d != null ? interfaceC0871d.extraPlayer() : -1);
    }

    @Override // q0.InterfaceC1298w
    public void e(boolean z4, final int i4) {
        if (E(z4)) {
            this.f10859l.submit(new Runnable() { // from class: q0.O
                @Override // java.lang.Runnable
                public final void run() {
                    cab.shashki.app.service.d.B(this.f18986d, i4);
                }
            });
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0160  */
    @Override // q0.InterfaceC1298w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object f(java.lang.String r9, java.lang.Object... r10) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cab.shashki.app.service.d.f(java.lang.String, java.lang.Object[]):java.lang.Object");
    }

    @Override // q0.InterfaceC1298w
    public void g() {
        InterfaceC0870c interfaceC0870c = this.f10863p;
        String position = interfaceC0870c != null ? interfaceC0870c.getPosition() : null;
        this.f10855h = false;
        C1371a c1371a = C1371a.f19693a;
        if (!c1371a.e()) {
            InterfaceC0870c interfaceC0870c2 = this.f10863p;
            m.b(interfaceC0870c2);
            interfaceC0870c2.resetGame();
            U(null, null, position);
            return;
        }
        InterfaceC0870c interfaceC0870c3 = this.f10863p;
        if (interfaceC0870c3 != null) {
            interfaceC0870c3.stop();
        }
        InterfaceC0870c interfaceC0870c4 = this.f10863p;
        m.b(interfaceC0870c4);
        String strK = c1371a.k(interfaceC0870c4);
        InterfaceC0870c interfaceC0870c5 = this.f10863p;
        U(strK, interfaceC0870c5 != null ? interfaceC0870c5.getStartPosition() : null, position);
    }

    @Override // q0.InterfaceC1298w
    public C1290n getHistory() {
        return this.f10848a.h();
    }

    @Override // q0.InterfaceC1298w
    public String[] getLastMove() {
        InterfaceC0870c interfaceC0870c = this.f10863p;
        if (interfaceC0870c != null) {
            return interfaceC0870c.getLastMove();
        }
        return null;
    }

    @Override // q0.InterfaceC1298w
    public Boolean getPlayer() {
        InterfaceC0870c interfaceC0870c = this.f10863p;
        m.b(interfaceC0870c);
        return Boolean.valueOf(interfaceC0870c.getPlayer());
    }

    @Override // q0.InterfaceC1298w
    public String getPosition() {
        InterfaceC0870c interfaceC0870c = this.f10863p;
        m.b(interfaceC0870c);
        String position = interfaceC0870c.getPosition();
        m.d(position, "getPosition(...)");
        return position;
    }

    @Override // q0.InterfaceC1298w
    public String[] getPossibleMoves() {
        InterfaceC0870c interfaceC0870c = this.f10863p;
        m.b(interfaceC0870c);
        String[] possibleMoves = interfaceC0870c.getPossibleMoves();
        m.d(possibleMoves, "getPossibleMoves(...)");
        return possibleMoves;
    }

    @Override // q0.InterfaceC1298w
    public String getStartPosition() {
        InterfaceC0870c interfaceC0870c = this.f10863p;
        m.b(interfaceC0870c);
        String startPosition = interfaceC0870c.getStartPosition();
        m.d(startPosition, "getStartPosition(...)");
        return startPosition;
    }

    @Override // q0.InterfaceC1298w
    public String getState() {
        InterfaceC0870c interfaceC0870c = this.f10863p;
        AbstractC1089v abstractC1089v = interfaceC0870c instanceof AbstractC1089v ? (AbstractC1089v) interfaceC0870c : null;
        if (abstractC1089v != null) {
            String strD = abstractC1089v.D();
            if (!m.a(strD, "MP_READY")) {
                this.f10848a.g();
                return strD;
            }
        }
        InterfaceC0870c interfaceC0870c2 = this.f10863p;
        m.b(interfaceC0870c2);
        InterfaceC0870c.a state = interfaceC0870c2.getState();
        if (state != InterfaceC0870c.a.PLAY && state != InterfaceC0870c.a.ENGINE_ANALISE) {
            this.f10848a.g();
        }
        if (this.f10855h) {
            state = InterfaceC0870c.a.ENGINE_ANALISE;
        }
        return state.toString();
    }

    @Override // q0.InterfaceC1298w
    public void h(final String str) {
        m.e(str, "type");
        this.f10859l.submit(new Runnable() { // from class: q0.N
            @Override // java.lang.Runnable
            public final void run() {
                cab.shashki.app.service.d.I(this.f18984d, str);
            }
        });
    }

    @Override // q0.InterfaceC1298w
    public int[] i() {
        this.f10848a.A(this.f10853f);
        long j4 = 1000;
        return new int[]{(int) (this.f10848a.h().m() / j4), (int) (this.f10848a.h().l() / j4)};
    }

    @Override // q0.InterfaceC1298w
    public int j() {
        return this.f10861n;
    }

    @Override // q0.InterfaceC1298w
    public boolean k() {
        InterfaceC0870c interfaceC0870c = this.f10863p;
        if (interfaceC0870c != null) {
            interfaceC0870c.stop();
        }
        boolean z4 = false;
        this.f10855h = false;
        this.f10854g = false;
        String strL = this.f10848a.l();
        if (strL == null) {
            return false;
        }
        InterfaceC0870c interfaceC0870c2 = this.f10863p;
        if (interfaceC0870c2 == null || !interfaceC0870c2.makeMove(strL)) {
            D d4 = this.f10848a;
            InterfaceC0870c interfaceC0870c3 = this.f10863p;
            d4.o(interfaceC0870c3 != null ? interfaceC0870c3.getHistory() : null);
            return false;
        }
        InterfaceC0870c interfaceC0870c4 = this.f10863p;
        if (interfaceC0870c4 != null && interfaceC0870c4.getPlayer()) {
            z4 = true;
        }
        this.f10853f = z4;
        this.f10848a.A(!z4);
        this.f10850c.d(new Intent("MainService.MOVE").putExtra("move", strL));
        return true;
    }

    @Override // q0.InterfaceC1298w
    public boolean l() {
        InterfaceC0870c interfaceC0870c = this.f10863p;
        m.b(interfaceC0870c);
        if (!interfaceC0870c.undoMove()) {
            return false;
        }
        InterfaceC0870c interfaceC0870c2 = this.f10863p;
        m.b(interfaceC0870c2);
        this.f10853f = interfaceC0870c2.getPlayer();
        this.f10848a.x();
        this.f10848a.A(!this.f10853f);
        return true;
    }

    @Override // q0.InterfaceC1298w
    public void m(boolean z4, final long j4) {
        if (E(z4)) {
            this.f10859l.submit(new Runnable() { // from class: q0.M
                @Override // java.lang.Runnable
                public final void run() {
                    cab.shashki.app.service.d.C(this.f18982d, j4);
                }
            });
        }
    }

    @Override // q0.InterfaceC1298w
    public boolean makeMove(String str) {
        m.e(str, "move");
        InterfaceC0870c interfaceC0870c = this.f10863p;
        m.b(interfaceC0870c);
        boolean zMakeMove = interfaceC0870c.makeMove(str);
        Log.d("ShashkiServiceBinder", "make move " + str + " " + zMakeMove);
        if (zMakeMove) {
            R(str);
        }
        return zMakeMove;
    }

    @Override // q0.InterfaceC1298w
    public void n(int i4, String str, C1290n c1290n, boolean z4) {
        String strG;
        m.e(c1290n, "history");
        if (z4) {
            C1275A.f18941a.c(c1290n);
        }
        InterfaceC0870c interfaceC0870c = this.f10863p;
        InterfaceC1068a interfaceC1068a = interfaceC0870c instanceof InterfaceC1068a ? (InterfaceC1068a) interfaceC0870c : null;
        if (interfaceC1068a == null || interfaceC1068a.c()) {
            C1275A c1275a = C1275A.f18941a;
            int iA = a();
            InterfaceC0870c interfaceC0870c2 = this.f10863p;
            String position = interfaceC0870c2 != null ? interfaceC0870c2.getPosition() : null;
            C1290n c1290nH = this.f10848a.h();
            InterfaceC0870c interfaceC0870c3 = this.f10863p;
            InterfaceC1068a interfaceC1068a2 = interfaceC0870c3 instanceof InterfaceC1068a ? (InterfaceC1068a) interfaceC0870c3 : null;
            if (interfaceC1068a2 == null || (strG = interfaceC1068a2.g()) == null) {
                strG = this.f10864q;
            }
            c1275a.a(iA, position, c1290nH, strG);
        }
        this.f10848a.r(cab.shashki.app.service.b.f10603a.J(i4), str, c1290n);
        InterfaceC0870c interfaceC0870c4 = this.f10863p;
        if (interfaceC0870c4 != null) {
            interfaceC0870c4.stop();
        }
        InterfaceC0870c interfaceC0870c5 = this.f10863p;
        InterfaceC0869b interfaceC0869b = interfaceC0870c5 instanceof InterfaceC0869b ? (InterfaceC0869b) interfaceC0870c5 : null;
        if (interfaceC0869b != null) {
            interfaceC0869b.quit();
        }
        this.f10863p = null;
        this.f10855h = false;
        C1301z.f19103a.c();
    }

    @Override // q0.InterfaceC1298w
    public boolean setPosition(String str) {
        m.e(str, "position");
        InterfaceC0870c interfaceC0870c = this.f10863p;
        String position = interfaceC0870c != null ? interfaceC0870c.getPosition() : null;
        InterfaceC0870c interfaceC0870c2 = this.f10863p;
        String startPosition = interfaceC0870c2 != null ? interfaceC0870c2.getStartPosition() : null;
        InterfaceC0870c interfaceC0870c3 = this.f10863p;
        m.b(interfaceC0870c3);
        if (!interfaceC0870c3.setPosition(str)) {
            return false;
        }
        String strI = this.f10848a.h().i();
        if (strI == null || !m.a(startPosition, str)) {
            strI = null;
        }
        InterfaceC0870c interfaceC0870c4 = this.f10863p;
        U(strI, interfaceC0870c4 != null ? interfaceC0870c4.getStartPosition() : null, position);
        return true;
    }

    @Override // q0.InterfaceC1298w
    public void stop() {
        InterfaceC0870c interfaceC0870c = this.f10863p;
        if (interfaceC0870c != null) {
            interfaceC0870c.stop();
        }
        this.f10855h = false;
    }
}