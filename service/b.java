package cab.shashki.app.service;

import O0.f;
import R0.A;
import R0.B;
import R0.C0580a;
import R0.C0581b;
import R0.e;
import R0.h;
import R0.i;
import R0.j;
import R0.q;
import R0.r;
import R0.s;
import R0.t;
import R0.u;
import R0.v;
import R0.w;
import R0.x;
import R0.y;
import R0.z;
import T2.f;
import T2.g;
import U2.AbstractC0590i;
import U2.L;
import U2.p;
import V0.k;
import a3.AbstractC0614b;
import a3.InterfaceC0613a;
import cab.shashki.app.ShashkiApp;
import cab.shashki.app.db.entities.CheckersParams;
import cab.shashki.app.db.entities.HalmaParams;
import cab.shashki.app.service.FairyRepository;
import cab.shashki.cpp.CppGame;
import e0.InterfaceC0869b;
import e0.InterfaceC0870c;
import f0.AbstractC0888D;
import g3.InterfaceC1005a;
import h3.m;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import p3.n;
import q0.C1276B;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class b {

    /* renamed from: a */
    public static final b f10603a = new b();

    /* renamed from: b */
    private static final f f10604b = g.a(new InterfaceC1005a() { // from class: q0.f
        @Override // g3.InterfaceC1005a
        public final Object a() {
            return cab.shashki.app.service.b.h();
        }
    });

    /* renamed from: c */
    private static final Set f10605c = L.f(Integer.valueOf(AbstractC0888D.P5), Integer.valueOf(AbstractC0888D.W5), Integer.valueOf(AbstractC0888D.g5), Integer.valueOf(AbstractC0888D.K5), Integer.valueOf(AbstractC0888D.f5), Integer.valueOf(AbstractC0888D.Q5), Integer.valueOf(AbstractC0888D.c6), Integer.valueOf(AbstractC0888D.n5), Integer.valueOf(AbstractC0888D.Y5), Integer.valueOf(AbstractC0888D.r5), Integer.valueOf(AbstractC0888D.p5), Integer.valueOf(AbstractC0888D.m5), Integer.valueOf(AbstractC0888D.l6), Integer.valueOf(AbstractC0888D.w5), Integer.valueOf(AbstractC0888D.u5), Integer.valueOf(AbstractC0888D.m6), Integer.valueOf(AbstractC0888D.q5), Integer.valueOf(AbstractC0888D.G5), Integer.valueOf(AbstractC0888D.y5), Integer.valueOf(AbstractC0888D.L5));

    public static final class a extends Enum {

        /* renamed from: A */
        public static final a f10606A;

        /* renamed from: A0 */
        public static final a f10607A0;

        /* renamed from: A1 */
        public static final a f10608A1;

        /* renamed from: A2 */
        public static final a f10609A2;

        /* renamed from: A3 */
        public static final a f10610A3;
        public static final a A4;

        /* renamed from: B */
        public static final a f10611B;

        /* renamed from: B0 */
        public static final a f10612B0;

        /* renamed from: B1 */
        public static final a f10613B1;

        /* renamed from: B2 */
        public static final a f10614B2;

        /* renamed from: B3 */
        public static final a f10615B3;
        public static final a B4;

        /* renamed from: C */
        public static final a f10616C;

        /* renamed from: C0 */
        public static final a f10617C0;

        /* renamed from: C1 */
        public static final a f10618C1;

        /* renamed from: C2 */
        public static final a f10619C2;

        /* renamed from: C3 */
        public static final a f10620C3;
        private static final /* synthetic */ a[] C4;

        /* renamed from: D */
        public static final a f10621D;

        /* renamed from: D0 */
        public static final a f10622D0;

        /* renamed from: D1 */
        public static final a f10623D1;

        /* renamed from: D2 */
        public static final a f10624D2;

        /* renamed from: D3 */
        public static final a f10625D3;
        private static final /* synthetic */ InterfaceC0613a D4;

        /* renamed from: E */
        public static final a f10626E;

        /* renamed from: E0 */
        public static final a f10627E0;

        /* renamed from: E1 */
        public static final a f10628E1;

        /* renamed from: E2 */
        public static final a f10629E2;

        /* renamed from: E3 */
        public static final a f10630E3;

        /* renamed from: F */
        public static final a f10631F;

        /* renamed from: F0 */
        public static final a f10632F0;

        /* renamed from: F1 */
        public static final a f10633F1;

        /* renamed from: F2 */
        public static final a f10634F2;

        /* renamed from: F3 */
        public static final a f10635F3;

        /* renamed from: G */
        public static final a f10636G;

        /* renamed from: G0 */
        public static final a f10637G0;

        /* renamed from: G1 */
        public static final a f10638G1;

        /* renamed from: G2 */
        public static final a f10639G2;

        /* renamed from: G3 */
        public static final a f10640G3;

        /* renamed from: H */
        public static final a f10641H;

        /* renamed from: H0 */
        public static final a f10642H0;

        /* renamed from: H1 */
        public static final a f10643H1;

        /* renamed from: H2 */
        public static final a f10644H2;

        /* renamed from: H3 */
        public static final a f10645H3;

        /* renamed from: I */
        public static final a f10646I;

        /* renamed from: I0 */
        public static final a f10647I0;

        /* renamed from: I1 */
        public static final a f10648I1;

        /* renamed from: I2 */
        public static final a f10649I2;
        public static final a I3;

        /* renamed from: J */
        public static final a f10650J;

        /* renamed from: J0 */
        public static final a f10651J0;

        /* renamed from: J1 */
        public static final a f10652J1;

        /* renamed from: J2 */
        public static final a f10653J2;
        public static final a J3;

        /* renamed from: K */
        public static final a f10654K;

        /* renamed from: K0 */
        public static final a f10655K0;

        /* renamed from: K1 */
        public static final a f10656K1;

        /* renamed from: K2 */
        public static final a f10657K2;
        public static final a K3;

        /* renamed from: L */
        public static final a f10658L;

        /* renamed from: L0 */
        public static final a f10659L0;

        /* renamed from: L1 */
        public static final a f10660L1;

        /* renamed from: L2 */
        public static final a f10661L2;
        public static final a L3;

        /* renamed from: M */
        public static final a f10662M;

        /* renamed from: M0 */
        public static final a f10663M0;

        /* renamed from: M1 */
        public static final a f10664M1;

        /* renamed from: M2 */
        public static final a f10665M2;
        public static final a M3;

        /* renamed from: N */
        public static final a f10666N;

        /* renamed from: N0 */
        public static final a f10667N0;

        /* renamed from: N1 */
        public static final a f10668N1;

        /* renamed from: N2 */
        public static final a f10669N2;
        public static final a N3;

        /* renamed from: O */
        public static final a f10670O;

        /* renamed from: O0 */
        public static final a f10671O0;

        /* renamed from: O1 */
        public static final a f10672O1;

        /* renamed from: O2 */
        public static final a f10673O2;
        public static final a O3;

        /* renamed from: P */
        public static final a f10674P;

        /* renamed from: P0 */
        public static final a f10675P0;

        /* renamed from: P1 */
        public static final a f10676P1;

        /* renamed from: P2 */
        public static final a f10677P2;
        public static final a P3;

        /* renamed from: Q */
        public static final a f10678Q;

        /* renamed from: Q0 */
        public static final a f10679Q0;

        /* renamed from: Q1 */
        public static final a f10680Q1;

        /* renamed from: Q2 */
        public static final a f10681Q2;
        public static final a Q3;

        /* renamed from: R */
        public static final a f10682R;

        /* renamed from: R0 */
        public static final a f10683R0;

        /* renamed from: R1 */
        public static final a f10684R1;

        /* renamed from: R2 */
        public static final a f10685R2;
        public static final a R3;

        /* renamed from: S */
        public static final a f10686S;

        /* renamed from: S0 */
        public static final a f10687S0;

        /* renamed from: S1 */
        public static final a f10688S1;

        /* renamed from: S2 */
        public static final a f10689S2;
        public static final a S3;

        /* renamed from: T */
        public static final a f10690T;

        /* renamed from: T0 */
        public static final a f10691T0;

        /* renamed from: T1 */
        public static final a f10692T1;

        /* renamed from: T2 */
        public static final a f10693T2;
        public static final a T3;

        /* renamed from: U */
        public static final a f10694U;

        /* renamed from: U0 */
        public static final a f10695U0;

        /* renamed from: U1 */
        public static final a f10696U1;

        /* renamed from: U2 */
        public static final a f10697U2;
        public static final a U3;

        /* renamed from: V */
        public static final a f10698V;

        /* renamed from: V0 */
        public static final a f10699V0;

        /* renamed from: V1 */
        public static final a f10700V1;

        /* renamed from: V2 */
        public static final a f10701V2;
        public static final a V3;

        /* renamed from: W */
        public static final a f10702W;

        /* renamed from: W0 */
        public static final a f10703W0;

        /* renamed from: W1 */
        public static final a f10704W1;

        /* renamed from: W2 */
        public static final a f10705W2;
        public static final a W3;

        /* renamed from: X */
        public static final a f10706X;

        /* renamed from: X0 */
        public static final a f10707X0;

        /* renamed from: X1 */
        public static final a f10708X1;

        /* renamed from: X2 */
        public static final a f10709X2;
        public static final a X3;

        /* renamed from: Y */
        public static final a f10710Y;

        /* renamed from: Y0 */
        public static final a f10711Y0;

        /* renamed from: Y1 */
        public static final a f10712Y1;

        /* renamed from: Y2 */
        public static final a f10713Y2;
        public static final a Y3;

        /* renamed from: Z */
        public static final a f10714Z;

        /* renamed from: Z0 */
        public static final a f10715Z0;

        /* renamed from: Z1 */
        public static final a f10716Z1;

        /* renamed from: Z2 */
        public static final a f10717Z2;
        public static final a Z3;

        /* renamed from: a0 */
        public static final a f10718a0;

        /* renamed from: a1 */
        public static final a f10719a1;

        /* renamed from: a2 */
        public static final a f10720a2;

        /* renamed from: a3 */
        public static final a f10721a3;
        public static final a a4;

        /* renamed from: b0 */
        public static final a f10722b0;

        /* renamed from: b1 */
        public static final a f10723b1;

        /* renamed from: b2 */
        public static final a f10724b2;

        /* renamed from: b3 */
        public static final a f10725b3;
        public static final a b4;

        /* renamed from: c0 */
        public static final a f10726c0;

        /* renamed from: c1 */
        public static final a f10727c1;

        /* renamed from: c2 */
        public static final a f10728c2;

        /* renamed from: c3 */
        public static final a f10729c3;
        public static final a c4;

        /* renamed from: d0 */
        public static final a f10730d0;

        /* renamed from: d1 */
        public static final a f10731d1;

        /* renamed from: d2 */
        public static final a f10732d2;

        /* renamed from: d3 */
        public static final a f10733d3;
        public static final a d4;

        /* renamed from: e0 */
        public static final a f10734e0;

        /* renamed from: e1 */
        public static final a f10735e1;

        /* renamed from: e2 */
        public static final a f10736e2;

        /* renamed from: e3 */
        public static final a f10737e3;
        public static final a e4;

        /* renamed from: f0 */
        public static final a f10738f0;

        /* renamed from: f1 */
        public static final a f10739f1;

        /* renamed from: f2 */
        public static final a f10740f2;

        /* renamed from: f3 */
        public static final a f10741f3;
        public static final a f4;

        /* renamed from: g */
        public static final a f10742g;

        /* renamed from: g0 */
        public static final a f10743g0;

        /* renamed from: g1 */
        public static final a f10744g1;

        /* renamed from: g2 */
        public static final a f10745g2;

        /* renamed from: g3 */
        public static final a f10746g3;
        public static final a g4;

        /* renamed from: h */
        public static final a f10747h;

        /* renamed from: h0 */
        public static final a f10748h0;

        /* renamed from: h1 */
        public static final a f10749h1;

        /* renamed from: h2 */
        public static final a f10750h2;

        /* renamed from: h3 */
        public static final a f10751h3;
        public static final a h4;

        /* renamed from: i */
        public static final a f10752i;

        /* renamed from: i0 */
        public static final a f10753i0;

        /* renamed from: i1 */
        public static final a f10754i1;

        /* renamed from: i2 */
        public static final a f10755i2;

        /* renamed from: i3 */
        public static final a f10756i3;
        public static final a i4;

        /* renamed from: j */
        public static final a f10757j;

        /* renamed from: j0 */
        public static final a f10758j0;

        /* renamed from: j1 */
        public static final a f10759j1;

        /* renamed from: j2 */
        public static final a f10760j2;

        /* renamed from: j3 */
        public static final a f10761j3;
        public static final a j4;

        /* renamed from: k */
        public static final a f10762k;

        /* renamed from: k0 */
        public static final a f10763k0;

        /* renamed from: k1 */
        public static final a f10764k1;

        /* renamed from: k2 */
        public static final a f10765k2;

        /* renamed from: k3 */
        public static final a f10766k3;
        public static final a k4;

        /* renamed from: l */
        public static final a f10767l;

        /* renamed from: l0 */
        public static final a f10768l0;

        /* renamed from: l1 */
        public static final a f10769l1;

        /* renamed from: l2 */
        public static final a f10770l2;

        /* renamed from: l3 */
        public static final a f10771l3;
        public static final a l4;

        /* renamed from: m */
        public static final a f10772m;

        /* renamed from: m0 */
        public static final a f10773m0;

        /* renamed from: m1 */
        public static final a f10774m1;

        /* renamed from: m2 */
        public static final a f10775m2;

        /* renamed from: m3 */
        public static final a f10776m3;
        public static final a m4;

        /* renamed from: n */
        public static final a f10777n;

        /* renamed from: n0 */
        public static final a f10778n0;

        /* renamed from: n1 */
        public static final a f10779n1;

        /* renamed from: n2 */
        public static final a f10780n2;

        /* renamed from: n3 */
        public static final a f10781n3;
        public static final a n4;

        /* renamed from: o */
        public static final a f10782o;

        /* renamed from: o0 */
        public static final a f10783o0;

        /* renamed from: o1 */
        public static final a f10784o1;

        /* renamed from: o2 */
        public static final a f10785o2;

        /* renamed from: o3 */
        public static final a f10786o3;
        public static final a o4;

        /* renamed from: p */
        public static final a f10787p;

        /* renamed from: p0 */
        public static final a f10788p0;

        /* renamed from: p1 */
        public static final a f10789p1;

        /* renamed from: p2 */
        public static final a f10790p2;

        /* renamed from: p3 */
        public static final a f10791p3;
        public static final a p4;

        /* renamed from: q */
        public static final a f10792q;

        /* renamed from: q0 */
        public static final a f10793q0;

        /* renamed from: q1 */
        public static final a f10794q1;

        /* renamed from: q2 */
        public static final a f10795q2;

        /* renamed from: q3 */
        public static final a f10796q3;
        public static final a q4;

        /* renamed from: r */
        public static final a f10797r;

        /* renamed from: r0 */
        public static final a f10798r0;

        /* renamed from: r1 */
        public static final a f10799r1;

        /* renamed from: r2 */
        public static final a f10800r2;

        /* renamed from: r3 */
        public static final a f10801r3;
        public static final a r4;

        /* renamed from: s */
        public static final a f10802s;

        /* renamed from: s0 */
        public static final a f10803s0;

        /* renamed from: s1 */
        public static final a f10804s1;

        /* renamed from: s2 */
        public static final a f10805s2;

        /* renamed from: s3 */
        public static final a f10806s3;
        public static final a s4;

        /* renamed from: t */
        public static final a f10807t;

        /* renamed from: t0 */
        public static final a f10808t0;

        /* renamed from: t1 */
        public static final a f10809t1;

        /* renamed from: t2 */
        public static final a f10810t2;

        /* renamed from: t3 */
        public static final a f10811t3;
        public static final a t4;

        /* renamed from: u */
        public static final a f10812u;

        /* renamed from: u0 */
        public static final a f10813u0;

        /* renamed from: u1 */
        public static final a f10814u1;

        /* renamed from: u2 */
        public static final a f10815u2;

        /* renamed from: u3 */
        public static final a f10816u3;
        public static final a u4;

        /* renamed from: v */
        public static final a f10817v;

        /* renamed from: v0 */
        public static final a f10818v0;

        /* renamed from: v1 */
        public static final a f10819v1;

        /* renamed from: v2 */
        public static final a f10820v2;

        /* renamed from: v3 */
        public static final a f10821v3;
        public static final a v4;

        /* renamed from: w */
        public static final a f10822w;

        /* renamed from: w0 */
        public static final a f10823w0;

        /* renamed from: w1 */
        public static final a f10824w1;

        /* renamed from: w2 */
        public static final a f10825w2;

        /* renamed from: w3 */
        public static final a f10826w3;
        public static final a w4;

        /* renamed from: x */
        public static final a f10827x;

        /* renamed from: x0 */
        public static final a f10828x0;

        /* renamed from: x1 */
        public static final a f10829x1;

        /* renamed from: x2 */
        public static final a f10830x2;

        /* renamed from: x3 */
        public static final a f10831x3;
        public static final a x4;

        /* renamed from: y */
        public static final a f10832y;

        /* renamed from: y0 */
        public static final a f10833y0;

        /* renamed from: y1 */
        public static final a f10834y1;

        /* renamed from: y2 */
        public static final a f10835y2;

        /* renamed from: y3 */
        public static final a f10836y3;
        public static final a y4;

        /* renamed from: z */
        public static final a f10837z;

        /* renamed from: z0 */
        public static final a f10838z0;

        /* renamed from: z1 */
        public static final a f10839z1;

        /* renamed from: z2 */
        public static final a f10840z2;

        /* renamed from: z3 */
        public static final a f10841z3;
        public static final a z4;

        /* renamed from: d */
        private final String f10842d;

        /* renamed from: e */
        private final int f10843e;

        /* renamed from: f */
        private final int f10844f;

        static {
            b bVar = b.f10603a;
            f10742g = new a("Default", 0, bVar.C(AbstractC0888D.f14439W2), AbstractC0888D.k6, 0);
            f10747h = new a("Poddavki", 1, bVar.C(AbstractC0888D.f14571x3), AbstractC0888D.e6, 1);
            f10752i = new a("KestoG", 2, bVar.C(AbstractC0888D.f14511l3), AbstractC0888D.k6, 2);
            f10757j = new a("Chess", 3, bVar.C(AbstractC0888D.L3), AbstractC0888D.t5, 3);
            f10762k = new a("Checkers", 4, bVar.C(AbstractC0888D.f14363E2), AbstractC0888D.s5, 4);
            f10767l = new a("Brazil", 5, bVar.C(AbstractC0888D.f14506k3), AbstractC0888D.k5, 5);
            f10772m = new a("Pool", 6, bVar.C(AbstractC0888D.f14516m3), AbstractC0888D.f6, 6);
            f10777n = new a("Reversi", 7, bVar.C(AbstractC0888D.f14344A3), AbstractC0888D.j6, 7);
            f10782o = new a("International", 8, bVar.C(AbstractC0888D.f14476e3), AbstractC0888D.M5, 8);
            f10787p = new a("MIX", 9, bVar.C(AbstractC0888D.f14556u3), AbstractC0888D.a6, 9);
            f10792q = new a("Corners33", 10, bVar.C(AbstractC0888D.f14403N2), AbstractC0888D.z6, 100000);
            f10797r = new a("Corners34", 11, bVar.C(AbstractC0888D.f14407O2), AbstractC0888D.A6, 100001);
            f10802s = new a("Corners44", 12, bVar.C(AbstractC0888D.f14411P2), AbstractC0888D.B6, 100002);
            f10807t = new a("Corners10", 13, bVar.C(AbstractC0888D.f14399M2), AbstractC0888D.y6, 100003);
            f10812u = new a("Killer", 14, bVar.C(AbstractC0888D.f14521n3), AbstractC0888D.S5, 100004);
            f10817v = new a("Breakthrough", 15, bVar.C(AbstractC0888D.f14348B2), AbstractC0888D.l5, 100005);
            f10822w = new a("Frisian", 16, bVar.C(AbstractC0888D.f14447Y2), AbstractC0888D.D5, 100006);
            f10827x = new a("MiniUgolki", 17, bVar.C(AbstractC0888D.f14415Q2), AbstractC0888D.C6, 100007);
            f10832y = new a("Carballo", 18, bVar.C(AbstractC0888D.f14378H2), AbstractC0888D.t5, 100008);
            f10837z = new a("Lc0", 19, bVar.C(AbstractC0888D.f14531p3), AbstractC0888D.t5, 100009);
            f10606A = new a("Zebra", 20, bVar.C(AbstractC0888D.S3), AbstractC0888D.j6, 100010);
            f10611B = new a("UCI", 21, bVar.C(AbstractC0888D.Q3), AbstractC0888D.t5, 100011);
            f10616C = new a("Antidraughts", 22, bVar.C(AbstractC0888D.f14575y2), AbstractC0888D.h5, 100012);
            f10621D = new a("Turkish", 23, bVar.C(AbstractC0888D.P3), AbstractC0888D.x6, 100013);
            f10626E = new a("Thai", 24, bVar.C(AbstractC0888D.N3), AbstractC0888D.v6, 100014);
            f10631F = new a("Greek", 25, bVar.C(AbstractC0888D.f14461b3), AbstractC0888D.H5, 100015);
            f10636G = new a("Armenian", 26, bVar.C(AbstractC0888D.f14343A2), AbstractC0888D.j5, 100016);
            f10641H = new a("Gothic", 27, bVar.C(AbstractC0888D.f14451Z2), AbstractC0888D.F5, 100017);
            f10646I = new a("Laska", 28, bVar.C(AbstractC0888D.f14526o3), AbstractC0888D.U5, 100018);
            f10650J = new a("Spanish", 29, bVar.C(AbstractC0888D.f14369F3), AbstractC0888D.o6, 100019);
            f10654K = new a("Italian", 30, bVar.C(AbstractC0888D.f14481f3), AbstractC0888D.N5, 100020);
            f10658L = new a("Jamaican", 31, bVar.C(AbstractC0888D.f14486g3), AbstractC0888D.O5, 100021);
            f10662M = new a("Argentinian", 32, bVar.C(AbstractC0888D.f14580z2), AbstractC0888D.i5, 100022);
            f10666N = new a("Filipino", 33, bVar.C(AbstractC0888D.f14443X2), AbstractC0888D.C5, 100023);
            f10670O = new a("Mozambican", 34, bVar.C(AbstractC0888D.f14561v3), AbstractC0888D.b6, 100024);
            f10674P = new a("Canadian", 35, bVar.C(AbstractC0888D.f14368F2), AbstractC0888D.o5, 100025);
            f10678Q = new a("Malaysian", 36, bVar.C(AbstractC0888D.f14541r3), AbstractC0888D.X5, 100026);
            f10682R = new a("Czech", 37, bVar.C(AbstractC0888D.f14435V2), AbstractC0888D.B5, 100027);
            f10686S = new a("Portugal", 38, bVar.C(AbstractC0888D.f14576y3), AbstractC0888D.g6, 100028);
            f10690T = new a("SriLanka", 39, bVar.C(AbstractC0888D.f14379H3), AbstractC0888D.q6, 100029);
            f10694U = new a("Towers", 40, bVar.C(AbstractC0888D.O3), AbstractC0888D.w6, 100030);
            f10698V = new a("Columns", 41, bVar.C(AbstractC0888D.f14395L2), AbstractC0888D.v5, 100031);
            f10702W = new a("Tanzanian", 42, bVar.C(AbstractC0888D.M3), AbstractC0888D.u6, 100032);
            f10706X = new a("Xiangqi", 43, bVar.C(AbstractC0888D.R3), AbstractC0888D.D6, 100033);
            f10710Y = new a("Shogi", 44, bVar.C(AbstractC0888D.f14359D3), AbstractC0888D.n6, 100034);
            f10714Z = new a("Janggi", 45, bVar.C(AbstractC0888D.f14491h3), AbstractC0888D.P5, 100035);
            f10718a0 = new a("Makruk", 46, bVar.C(AbstractC0888D.f14536q3), AbstractC0888D.W5, 100036);
            f10722b0 = new a("Antichess", 47, bVar.C(AbstractC0888D.f14570x2), AbstractC0888D.g5, 100037);
            f10726c0 = new a("Stavropol", 48, bVar.C(AbstractC0888D.I3), AbstractC0888D.r6, 100038);
            f10730d0 = new a("Hordes", 49, bVar.C(AbstractC0888D.f14466c3), AbstractC0888D.K5, 100039);
            f10734e0 = new a("Amazon", 50, bVar.C(AbstractC0888D.f14565w2), AbstractC0888D.f5, 100040);
            f10738f0 = new a("Chaturanga", 51, bVar.C(AbstractC0888D.f14387J2), AbstractC0888D.r5, 100041);
            f10743g0 = new a("Nightrider", 52, bVar.C(AbstractC0888D.f14566w3), AbstractC0888D.c6, 100042);
            f10748h0 = new a("Minichess", 53, bVar.C(AbstractC0888D.f14546s3), AbstractC0888D.Y5, 100043);
            f10753i0 = new a("Jesonmor", 54, bVar.C(AbstractC0888D.f14496i3), AbstractC0888D.Q5, 100044);
            f10758j0 = new a("Shatar", 55, bVar.C(AbstractC0888D.f14349B3), AbstractC0888D.l6, 100045);
            f10763k0 = new a("Capablanca", 56, bVar.C(AbstractC0888D.f14373G2), AbstractC0888D.p5, 100046);
            f10768l0 = new a("BtChess", 57, bVar.C(AbstractC0888D.f14353C2), AbstractC0888D.m5, 100047);
            f10773m0 = new a("C4", 58, bVar.C(AbstractC0888D.f14358D2), AbstractC0888D.n5, 100048);
            f10778n0 = new a("CrazyHouse", 59, bVar.C(AbstractC0888D.f14419R2), AbstractC0888D.w5, 100049);
            f10783o0 = new a("Chessgi", 60, bVar.C(AbstractC0888D.f14391K2), AbstractC0888D.u5, 100050);
            f10788p0 = new a("Shatranj", 61, bVar.C(AbstractC0888D.f14354C3), AbstractC0888D.m6, 100051);
            f10793q0 = new a("Cavalry", 62, bVar.C(AbstractC0888D.f14383I2), AbstractC0888D.q5, 100052);
            f10798r0 = new a("Grand", 63, bVar.C(AbstractC0888D.f14456a3), AbstractC0888D.G5, 100053);
            f10803s0 = new a("MiniShogi", 64, bVar.C(AbstractC0888D.f14551t3), AbstractC0888D.Z5, 100054);
            f10808t0 = new a("CustomFairy", 65, bVar.C(AbstractC0888D.f14427T2), AbstractC0888D.y5, 100055);
            f10813u0 = new a("Spantsireti", 66, bVar.C(AbstractC0888D.f14374G3), AbstractC0888D.p6, 100056);
            f10818v0 = new a("StavropolTowers", 67, bVar.C(AbstractC0888D.K3), AbstractC0888D.t6, 100057);
            f10823w0 = new a("StavropolColumns", 68, bVar.C(AbstractC0888D.J3), AbstractC0888D.s6, 100058);
            f10828x0 = new a("CustomCheckers", 69, bVar.C(AbstractC0888D.f14423S2), AbstractC0888D.x5, 100059);
            f10833y0 = new a("Kenyan", 70, bVar.C(AbstractC0888D.f14501j3), AbstractC0888D.R5, 100060);
            f10838z0 = new a("Skifi", 71, bVar.C(AbstractC0888D.f14364E3), AbstractC0888D.k6, 100061);
            f10607A0 = new a("CustomHalma", 72, bVar.C(AbstractC0888D.f14431U2), AbstractC0888D.A5, 100062);
            f10612B0 = new a("Hostage", 73, bVar.C(AbstractC0888D.f14471d3), AbstractC0888D.L5, 100063);
            f10617C0 = new a("Quixo", 74, bVar.C(AbstractC0888D.f14581z3), AbstractC0888D.i6, 100064);
            f10622D0 = new a("BluetoothRD", 75, "Bluetooth", AbstractC0888D.k6, 10);
            f10627E0 = new a("WiFiRD", 76, "WiFiLocal", AbstractC0888D.k6, 11);
            f10632F0 = new a("BluetoothCS", 77, "Bluetooth.Chess", AbstractC0888D.t5, 12);
            f10637G0 = new a("WiFiCS", 78, "WiFiLocal.Chess", AbstractC0888D.t5, 13);
            f10642H0 = new a("BluetoothCH", 79, "Bluetooth.Checkers", AbstractC0888D.s5, 14);
            f10647I0 = new a("WiFiCH", 80, "WiFiLocal.Checkers", AbstractC0888D.s5, 15);
            f10651J0 = new a("BluetoothBr", 81, "Bluetooth.Brazil", AbstractC0888D.k5, 16);
            f10655K0 = new a("WiFiBr", 82, "WiFiLocal.Brazil", AbstractC0888D.k5, 17);
            f10659L0 = new a("BluetoothPd", 83, "Bluetooth.Poddavki", AbstractC0888D.e6, 18);
            f10663M0 = new a("WiFiPd", 84, "WiFiLocal.Poddavki", AbstractC0888D.e6, 19);
            f10667N0 = new a("BluetoothP", 85, "Bluetooth.Pool", AbstractC0888D.f6, 20);
            f10671O0 = new a("WiFiP", 86, "WiFiLocal.Pool", AbstractC0888D.f6, 21);
            f10675P0 = new a("BluetoothR", 87, "Bluetooth.Reversi", AbstractC0888D.j6, 22);
            f10679Q0 = new a("WiFiR", 88, "WiFiLocal.Reversi", AbstractC0888D.j6, 23);
            f10683R0 = new a("BluetoothU33", 89, "Bluetooth.Ugolki_3x3", AbstractC0888D.z6, 24);
            f10687S0 = new a("WiFiU33", 90, "WiFiLocal.Ugolki_3x3", AbstractC0888D.z6, 25);
            f10691T0 = new a("BluetoothU34", 91, "Bluetooth.Ugolki_3x4", AbstractC0888D.A6, 26);
            f10695U0 = new a("WiFiU34", 92, "WiFiLocal.Ugolki_3x4", AbstractC0888D.A6, 27);
            f10699V0 = new a("BluetoothU44", 93, "Bluetooth.Ugolki_4x4", AbstractC0888D.B6, 28);
            f10703W0 = new a("WiFiU44", 94, "WiFiLocal.Ugolki_4x4", AbstractC0888D.B6, 29);
            f10707X0 = new a("BluetoothU10", 95, "Bluetooth.Ugolki10", AbstractC0888D.y6, 30);
            f10711Y0 = new a("WiFiU10", 96, "WiFiLocal.Ugolki10", AbstractC0888D.y6, 31);
            f10715Z0 = new a("FireRD", 97, "Fire.Shashki", AbstractC0888D.k6, 32);
            f10719a1 = new a("FireCS", 98, "Fire.Chess", AbstractC0888D.t5, 33);
            f10723b1 = new a("FireCH", 99, "Fire.Checkers", AbstractC0888D.s5, 34);
            f10727c1 = new a("FireBr", 100, "Fire.Brazil", AbstractC0888D.k5, 35);
            f10731d1 = new a("FirePd", 101, "Fire.Poddavki", AbstractC0888D.e6, 36);
            f10735e1 = new a("FireP", 102, "Fire.Pool", AbstractC0888D.f6, 37);
            f10739f1 = new a("FireR", 103, "Fire.Reversi", AbstractC0888D.j6, 38);
            f10744g1 = new a("FireU33", 104, "Fire.Ugolki_3x3", AbstractC0888D.z6, 39);
            f10749h1 = new a("FireU34", 105, "Fire.Ugolki_3x4", AbstractC0888D.A6, 40);
            f10754i1 = new a("FireU44", 106, "Fire.Ugolki_4x4", AbstractC0888D.B6, 41);
            f10759j1 = new a("FireU10", 107, "Fire.Ugolki10", AbstractC0888D.y6, 42);
            f10764k1 = new a("BlueI", 108, "Bluetooth.International", AbstractC0888D.M5, 43);
            f10769l1 = new a("WiFiI", 109, "WiFiLocal.International", AbstractC0888D.M5, 44);
            f10774m1 = new a("FireI", 110, "Fire.International", AbstractC0888D.M5, 45);
            f10779n1 = new a("BlueK", 111, "Bluetooth.Killer", AbstractC0888D.S5, 46);
            f10784o1 = new a("WiFiK", 112, "WiFiLocal.Killer", AbstractC0888D.S5, 47);
            f10789p1 = new a("FireK", 113, "Fire.Killer", AbstractC0888D.S5, 48);
            f10794q1 = new a("BlueBt", 114, "Bluetooth.Breakthrough", AbstractC0888D.l5, 49);
            f10799r1 = new a("WiFiBt", 115, "WiFiLocal.Breakthrough", AbstractC0888D.l5, 50);
            f10804s1 = new a("FireBt", 116, "Fire.Breakthrough", AbstractC0888D.l5, 51);
            f10809t1 = new a("BlueFri", 117, "Bluetooth.Frisian", AbstractC0888D.D5, 52);
            f10814u1 = new a("WiFiFri", 118, "WiFiLocal.Frisian", AbstractC0888D.D5, 53);
            f10819v1 = new a("FireFri", 119, "Fire.Frisian", AbstractC0888D.D5, 54);
            f10824w1 = new a("BlueUM", 120, "Bluetooth.UgolkiMini", AbstractC0888D.C6, 55);
            f10829x1 = new a("WifiUM", 121, "WiFiLocal.UgolkiMini", AbstractC0888D.C6, 56);
            f10834y1 = new a("FireUM", 122, "Fire.UgolkiMini", AbstractC0888D.C6, 57);
            f10839z1 = new a("BlueAnti", 123, "Bluetooth.Anti", AbstractC0888D.h5, 58);
            f10608A1 = new a("WiFiAnti", 124, "WiFiLocal.Anti", AbstractC0888D.h5, 59);
            f10613B1 = new a("FireAnti", 125, "Fire.Anti", AbstractC0888D.h5, 60);
            f10618C1 = new a("BlueTur", 126, "Bluetooth.Tur", AbstractC0888D.x6, 61);
            f10623D1 = new a("WiFiTur", 127, "WiFiLocal.Tur", AbstractC0888D.x6, 62);
            f10628E1 = new a("FireTur", 128, "Fire.Tur", AbstractC0888D.x6, 63);
            f10633F1 = new a("BlueThai", 129, "Bluetooth.Thai", AbstractC0888D.v6, 64);
            f10638G1 = new a("WiFiThai", 130, "WiFiLocal.Thai", AbstractC0888D.v6, 65);
            f10643H1 = new a("FireThai", 131, "Fire.Thai", AbstractC0888D.v6, 66);
            f10648I1 = new a("BlueGreek", 132, "Bluetooth.Greek", AbstractC0888D.H5, 67);
            f10652J1 = new a("WiFiGreek", 133, "WiFiLocal.Greek", AbstractC0888D.H5, 68);
            f10656K1 = new a("FireGreek", 134, "Fire.Greek", AbstractC0888D.H5, 69);
            f10660L1 = new a("BlueArmenian", 135, "Bluetooth.Armenian", AbstractC0888D.j5, 70);
            f10664M1 = new a("WiFiArmenian", 136, "WiFiLocal.Armenian", AbstractC0888D.j5, 71);
            f10668N1 = new a("FireArmenian", 137, "Fire.Armenian", AbstractC0888D.j5, 72);
            f10672O1 = new a("BlueGothic", 138, "Bluetooth.Gothic", AbstractC0888D.F5, 73);
            f10676P1 = new a("WiFiGothic", 139, "WiFiLocal.Gothic", AbstractC0888D.F5, 74);
            f10680Q1 = new a("FireGothic", 140, "Fire.Gothic", AbstractC0888D.F5, 75);
            f10684R1 = new a("BlueLaska", 141, "Bluetooth.Laska", AbstractC0888D.U5, 76);
            f10688S1 = new a("WiFiLaska", 142, "WiFiLocal.Laska", AbstractC0888D.U5, 77);
            f10692T1 = new a("FireLaska", 143, "Fire.Laska", AbstractC0888D.U5, 78);
            f10696U1 = new a("BlueSpanish", 144, "Bluetooth.Spanish", AbstractC0888D.o6, 79);
            f10700V1 = new a("WiFiSpanish", 145, "WiFiLocal.Spanish", AbstractC0888D.o6, 80);
            f10704W1 = new a("FireSpanish", 146, "Fire.Spanish", AbstractC0888D.o6, 81);
            f10708X1 = new a("BlueItalian", 147, "Bluetooth.Italian", AbstractC0888D.N5, 82);
            f10712Y1 = new a("WiFiItalian", 148, "WiFiLocal.Italian", AbstractC0888D.N5, 83);
            f10716Z1 = new a("FireItalian", 149, "Fire.Italian", AbstractC0888D.N5, 84);
            f10720a2 = new a("BlueJamaican", 150, "Bluetooth.Jamaican", AbstractC0888D.O5, 85);
            f10724b2 = new a("WiFiJamaican", 151, "WiFiLocal.Jamaican", AbstractC0888D.O5, 86);
            f10728c2 = new a("FireJamaican", 152, "Fire.Jamaican", AbstractC0888D.O5, 87);
            f10732d2 = new a("BlueArgentinian", 153, "Bluetooth.Argentinian", AbstractC0888D.i5, 88);
            f10736e2 = new a("WiFiArgentinian", 154, "WiFiLocal.Argentinian", AbstractC0888D.i5, 89);
            f10740f2 = new a("FireArgentinian", 155, "Fire.Argentinian", AbstractC0888D.i5, 90);
            f10745g2 = new a("BlueFilipino", 156, "Bluetooth.Filipino", AbstractC0888D.C5, 91);
            f10750h2 = new a("WiFiFilipino", 157, "WiFiLocal.Filipino", AbstractC0888D.C5, 92);
            f10755i2 = new a("FireFilipino", 158, "Fire.Filipino", AbstractC0888D.C5, 93);
            f10760j2 = new a("BlueMozambican", 159, "Bluetooth.Mozambican", AbstractC0888D.b6, 94);
            f10765k2 = new a("WiFiMozambican", 160, "WiFiLocal.Mozambican", AbstractC0888D.b6, 95);
            f10770l2 = new a("FireMozambican", 161, "Fire.Mozambican", AbstractC0888D.b6, 96);
            f10775m2 = new a("BlueCanadian", 162, "Bluetooth.Canadian", AbstractC0888D.o5, 97);
            f10780n2 = new a("WiFiCanadian", 163, "WiFiLocal.Canadian", AbstractC0888D.o5, 98);
            f10785o2 = new a("FireCanadian", 164, "Fire.Canadian", AbstractC0888D.o5, 99);
            f10790p2 = new a("BlueMalaysian", 165, "Bluetooth.Malaysian", AbstractC0888D.X5, 100);
            f10795q2 = new a("WiFiMalaysian", 166, "WiFiLocal.Malaysian", AbstractC0888D.X5, 101);
            f10800r2 = new a("FireMalaysian", 167, "Fire.Malaysian", AbstractC0888D.X5, 102);
            f10805s2 = new a("BlueCzech", 168, "Bluetooth.Czech", AbstractC0888D.B5, 103);
            f10810t2 = new a("WiFiCzech", 169, "WiFiLocal.Czech", AbstractC0888D.B5, 104);
            f10815u2 = new a("FireCzech", 170, "Fire.Czech", AbstractC0888D.B5, 105);
            f10820v2 = new a("BluePortugal", 171, "Bluetooth.Portugal", AbstractC0888D.g6, 106);
            f10825w2 = new a("WiFiPortugal", 172, "WiFiLocal.Portugal", AbstractC0888D.g6, 107);
            f10830x2 = new a("FirePortugal", 173, "Fire.Portugal", AbstractC0888D.g6, 108);
            f10835y2 = new a("BlueSriLanka", 174, "Bluetooth.SriLanka", AbstractC0888D.q6, 109);
            f10840z2 = new a("WiFiSriLanka", 175, "WiFiLocal.SriLanka", AbstractC0888D.q6, 110);
            f10609A2 = new a("FireSriLanka", 176, "Fire.SriLanka", AbstractC0888D.q6, 111);
            f10614B2 = new a("BlueTowers", 177, "Bluetooth.Towers", AbstractC0888D.w6, 112);
            f10619C2 = new a("WiFiTowers", 178, "WiFiLocal.Towers", AbstractC0888D.w6, 113);
            f10624D2 = new a("FireTowers", 179, "Fire.Towers", AbstractC0888D.w6, 114);
            f10629E2 = new a("BlueColumns", 180, "Bluetooth.Columns", AbstractC0888D.v5, 115);
            f10634F2 = new a("WiFiColumns", 181, "WiFiLocal.Columns", AbstractC0888D.v5, 116);
            f10639G2 = new a("FireColumns", 182, "Fire.Columns", AbstractC0888D.v5, 117);
            f10644H2 = new a("BlueTanzanian", 183, "Bluetooth.Tanzanian", AbstractC0888D.u6, 118);
            f10649I2 = new a("WiFiTanzanian", 184, "WiFiLocal.Tanzanian", AbstractC0888D.u6, 119);
            f10653J2 = new a("FireTanzanian", 185, "Fire.Tanzanian", AbstractC0888D.u6, 120);
            f10657K2 = new a("BlueXiangqi", 186, "Bluetooth.Xiangqi", AbstractC0888D.D6, 121);
            f10661L2 = new a("WiFiXiangqi", 187, "WiFiLocal.Xiangqi", AbstractC0888D.D6, 122);
            f10665M2 = new a("FireXiangqi", 188, "Fire.Xiangqi", AbstractC0888D.D6, 123);
            f10669N2 = new a("BlueShogi", 189, "Bluetooth.Shogi", AbstractC0888D.n6, 124);
            f10673O2 = new a("WiFiShogi", 190, "WiFiLocal.Shogi", AbstractC0888D.n6, 125);
            f10677P2 = new a("FireShogi", 191, "Fire.Shogi", AbstractC0888D.n6, 126);
            f10681Q2 = new a("BlueJanggi", 192, "Bluetooth.Janggi", AbstractC0888D.P5, 127);
            f10685R2 = new a("WiFiJanggi", 193, "WiFiLocal.Janggi", AbstractC0888D.P5, 128);
            f10689S2 = new a("FireJanggi", 194, "Fire.Janggi", AbstractC0888D.P5, 129);
            f10693T2 = new a("BlueMarkuk", 195, "Bluetooth.Markuk", AbstractC0888D.W5, 130);
            f10697U2 = new a("WiFiMarkuk", 196, "WiFiLocal.Markuk", AbstractC0888D.W5, 131);
            f10701V2 = new a("FireMarkuk", 197, "Fire.Markuk", AbstractC0888D.W5, 132);
            f10705W2 = new a("BlueAntichess", 198, "Bluetooth.Antichess", AbstractC0888D.g5, 133);
            f10709X2 = new a("WiFiAntichess", 199, "WiFiLocal.Antichess", AbstractC0888D.g5, 134);
            f10713Y2 = new a("FireAntichess", 200, "Fire.Antichess", AbstractC0888D.g5, 135);
            f10717Z2 = new a("BlueStavropol", 201, "Bluetooth.Stavropol", AbstractC0888D.r6, 136);
            f10721a3 = new a("WiFiStavropol", 202, "WiFiLocal.Stavropol", AbstractC0888D.r6, 137);
            f10725b3 = new a("FireStavropol", 203, "Fire.Stavropol", AbstractC0888D.r6, 138);
            f10729c3 = new a("BlueHordes", 204, "Bluetooth.Hordes", AbstractC0888D.K5, 139);
            f10733d3 = new a("WiFiHordes", 205, "WiFiLocal.Hordes", AbstractC0888D.K5, 140);
            f10737e3 = new a("FireHordes", 206, "Fire.Hordes", AbstractC0888D.K5, 141);
            f10741f3 = new a("BlueAmazon", 207, "Bluetooth.Amazon", AbstractC0888D.f5, 142);
            f10746g3 = new a("WiFiAmazon", 208, "WiFiLocal.Amazon", AbstractC0888D.f5, 143);
            f10751h3 = new a("FireAmazon", 209, "Fire.Amazon", AbstractC0888D.f5, 144);
            f10756i3 = new a("BlueChaturanga", 210, "Bluetooth.Chaturanga", AbstractC0888D.r5, 145);
            f10761j3 = new a("WiFiChaturanga", 211, "WiFiLocal.Chaturanga", AbstractC0888D.r5, 146);
            f10766k3 = new a("FireChaturanga", 212, "Fire.Chaturanga", AbstractC0888D.r5, 147);
            f10771l3 = new a("BlueNightrider", 213, "Bluetooth.Nightrider", AbstractC0888D.c6, 148);
            f10776m3 = new a("WiFiNightrider", 214, "WiFiLocal.Nightrider", AbstractC0888D.c6, 149);
            f10781n3 = new a("FireNightrider", 215, "Fire.Nightrider", AbstractC0888D.c6, 150);
            f10786o3 = new a("BlueMiniChess", 216, "Bluetooth.MiniChess", AbstractC0888D.Y5, 151);
            f10791p3 = new a("WiFiMiniChess", 217, "WiFiLocal.MiniChess", AbstractC0888D.Y5, 152);
            f10796q3 = new a("FireMiniChess", 218, "Fire.MiniChess", AbstractC0888D.Y5, 153);
            f10801r3 = new a("BlueJesonmor", 219, "Bluetooth.Jesonmor", AbstractC0888D.Q5, 154);
            f10806s3 = new a("WiFiJesonmor", 220, "WiFiLocal.Jesonmor", AbstractC0888D.Q5, 155);
            f10811t3 = new a("FireJesonmor", 221, "Fire.Jesonmor", AbstractC0888D.Q5, 156);
            f10816u3 = new a("BlueShatar", 222, "Bluetooth.Shatar", AbstractC0888D.l6, 157);
            f10821v3 = new a("WiFiShatar", 223, "WiFiLocal.Shatar", AbstractC0888D.l6, 158);
            f10826w3 = new a("FireShatar", 224, "Fire.Shatar", AbstractC0888D.l6, 159);
            f10831x3 = new a("BlueCapablanca", 225, "Bluetooth.Capablanca", AbstractC0888D.p5, 160);
            f10836y3 = new a("WiFiCapablanca", 226, "WiFiLocal.Capablanca", AbstractC0888D.p5, 161);
            f10841z3 = new a("FireCapablanca", 227, "Fire.Capablanca", AbstractC0888D.p5, 162);
            f10610A3 = new a("BlueBtChess", 228, "Bluetooth.BtPawns", AbstractC0888D.m5, 163);
            f10615B3 = new a("WiFiBtChess", 229, "WiFiLocal.BtPawns", AbstractC0888D.m5, 164);
            f10620C3 = new a("FireBtChess", 230, "Fire.BtPawns", AbstractC0888D.m5, 165);
            f10625D3 = new a("BlueC4", 231, "Bluetooth.C4", AbstractC0888D.n5, 166);
            f10630E3 = new a("WiFiC4", 232, "WiFiLocal.C4", AbstractC0888D.n5, 167);
            f10635F3 = new a("FireC4", 233, "Fire.C4", AbstractC0888D.n5, 168);
            f10640G3 = new a("BlueCrazyHouse", 234, "Bluetooth.CrazyHouse", AbstractC0888D.w5, 169);
            f10645H3 = new a("WiFiCrazyHouse", 235, "WiFiLocal.CrazyHouse", AbstractC0888D.w5, 170);
            I3 = new a("FireCrazyHouse", 236, "Fire.CrazyHouse", AbstractC0888D.w5, 171);
            J3 = new a("BlueChessgi", 237, "Bluetooth.Chessgi", AbstractC0888D.u5, 172);
            K3 = new a("WiFiChessgi", 238, "WiFiLocal.Chessgi", AbstractC0888D.u5, 173);
            L3 = new a("FireChessgi", 239, "Fire.Chessgi", AbstractC0888D.u5, 174);
            M3 = new a("BlueShatranj", 240, "Bluetooth.Shatranj", AbstractC0888D.m6, 175);
            N3 = new a("WiFiShatranj", 241, "WiFiLocal.Shatranj", AbstractC0888D.m6, 176);
            O3 = new a("FireShatranj", 242, "Fire.Shatranj", AbstractC0888D.m6, 177);
            P3 = new a("BlueCavalry", 243, "Bluetooth.Cavalry", AbstractC0888D.q5, 178);
            Q3 = new a("WiFiCavalry", 244, "WiFiLocal.Cavalry", AbstractC0888D.q5, 179);
            R3 = new a("FireCavalry", 245, "Fire.Cavalry", AbstractC0888D.q5, 180);
            S3 = new a("BlueGrand", 246, "Bluetooth.Grand", AbstractC0888D.G5, 181);
            T3 = new a("WiFiGrand", 247, "WiFiLocal.Grand", AbstractC0888D.G5, 182);
            U3 = new a("FireGrand", 248, "Fire.Grand", AbstractC0888D.G5, 183);
            V3 = new a("BlueMiniShogi", 249, "Bluetooth.MiniShogi", AbstractC0888D.Z5, 184);
            W3 = new a("WiFiMiniShogi", 250, "WiFiLocal.MiniShogi", AbstractC0888D.Z5, 185);
            X3 = new a("FireMiniShogi", 251, "Fire.MiniShogi", AbstractC0888D.Z5, 186);
            Y3 = new a("BlueSpantsireti", 252, "Bluetooth.Spantsireti", AbstractC0888D.p6, 187);
            Z3 = new a("WiFiSpantsireti", 253, "WiFiLocal.Spantsireti", AbstractC0888D.p6, 188);
            a4 = new a("FireSpantsireti", 254, "Fire.Spantsireti", AbstractC0888D.p6, 189);
            b4 = new a("BlueStavropolTowers", 255, "Bluetooth.StavropolTowers", AbstractC0888D.t6, 190);
            c4 = new a("WiFiStavropolTowers", 256, "WiFiLocal.StavropolTowers", AbstractC0888D.t6, 191);
            d4 = new a("FireStavropolTowers", 257, "Fire.StavropolTowers", AbstractC0888D.t6, 192);
            e4 = new a("BlueStavropolColumns", 258, "Bluetooth.StavropolColumns", AbstractC0888D.s6, 193);
            f4 = new a("WiFiStavropolColumns", 259, "WiFiLocal.StavropolColumns", AbstractC0888D.s6, 194);
            g4 = new a("FireStavropolColumns", 260, "Fire.StavropolColumns", AbstractC0888D.s6, 195);
            h4 = new a("BlueCustomCheckers", 261, "Bluetooth.CustomCheckers", AbstractC0888D.x5, 196);
            i4 = new a("WiFiCustomCheckers", 262, "WiFiLocal.CustomCheckers", AbstractC0888D.x5, 197);
            j4 = new a("FireCustomCheckers", 263, "Fire.CustomCheckers", AbstractC0888D.x5, 198);
            k4 = new a("BlueKenyan", 264, "Bluetooth.Kenyan", AbstractC0888D.R5, 199);
            l4 = new a("WiFiKenyan", 265, "WiFiLocal.Kenyan", AbstractC0888D.R5, 200);
            m4 = new a("FireKenyan", 266, "Fire.Kenyan", AbstractC0888D.R5, 201);
            n4 = new a("BlueCustomChess", 267, "Bluetooth.CustomChess", AbstractC0888D.y5, 202);
            o4 = new a("WiFiCustomChess", 268, "WiFiLocal.CustomChess", AbstractC0888D.y5, 203);
            p4 = new a("FireCustomChess", 269, "Fire.CustomChess", AbstractC0888D.y5, 204);
            q4 = new a("BlueCustomHalma", 270, "Bluetooth.Halma", AbstractC0888D.A5, 205);
            r4 = new a("WiFiCustomHalma", 271, "WiFiLocal.Halma", AbstractC0888D.A5, 206);
            s4 = new a("FireCustomHalma", 272, "Fire.Halma", AbstractC0888D.A5, 207);
            t4 = new a("BlueHostage", 273, "Bluetooth.Hostage", AbstractC0888D.L5, 208);
            u4 = new a("WiFiHostage", 274, "WiFiLocal.Hostage", AbstractC0888D.L5, 209);
            v4 = new a("FireHostage", 275, "Fire.Hostage", AbstractC0888D.L5, 210);
            w4 = new a("BlueQuixo", 276, "Bluetooth.Quixo", AbstractC0888D.i6, 211);
            x4 = new a("WiFiQuixo", 277, "WiFiLocal.Quixo", AbstractC0888D.i6, 212);
            y4 = new a("FireQuixo", 278, "Fire.Quixo", AbstractC0888D.i6, 213);
            z4 = new a("BlueMix", 279, "Bluetooth.Mix", AbstractC0888D.a6, 214);
            A4 = new a("WiFiMix", 280, "WiFiLocal.Mix", AbstractC0888D.a6, 215);
            B4 = new a("FireMix", 281, "Fire.Mix", AbstractC0888D.a6, 216);
            a[] aVarArrA = a();
            C4 = aVarArrA;
            D4 = AbstractC0614b.a(aVarArrA);
        }

        private a(String str, int i5, String str2, int i6, int i7) {
            super(str, i5);
            this.f10842d = str2;
            this.f10843e = i6;
            this.f10844f = i7;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f10742g, f10747h, f10752i, f10757j, f10762k, f10767l, f10772m, f10777n, f10782o, f10787p, f10792q, f10797r, f10802s, f10807t, f10812u, f10817v, f10822w, f10827x, f10832y, f10837z, f10606A, f10611B, f10616C, f10621D, f10626E, f10631F, f10636G, f10641H, f10646I, f10650J, f10654K, f10658L, f10662M, f10666N, f10670O, f10674P, f10678Q, f10682R, f10686S, f10690T, f10694U, f10698V, f10702W, f10706X, f10710Y, f10714Z, f10718a0, f10722b0, f10726c0, f10730d0, f10734e0, f10738f0, f10743g0, f10748h0, f10753i0, f10758j0, f10763k0, f10768l0, f10773m0, f10778n0, f10783o0, f10788p0, f10793q0, f10798r0, f10803s0, f10808t0, f10813u0, f10818v0, f10823w0, f10828x0, f10833y0, f10838z0, f10607A0, f10612B0, f10617C0, f10622D0, f10627E0, f10632F0, f10637G0, f10642H0, f10647I0, f10651J0, f10655K0, f10659L0, f10663M0, f10667N0, f10671O0, f10675P0, f10679Q0, f10683R0, f10687S0, f10691T0, f10695U0, f10699V0, f10703W0, f10707X0, f10711Y0, f10715Z0, f10719a1, f10723b1, f10727c1, f10731d1, f10735e1, f10739f1, f10744g1, f10749h1, f10754i1, f10759j1, f10764k1, f10769l1, f10774m1, f10779n1, f10784o1, f10789p1, f10794q1, f10799r1, f10804s1, f10809t1, f10814u1, f10819v1, f10824w1, f10829x1, f10834y1, f10839z1, f10608A1, f10613B1, f10618C1, f10623D1, f10628E1, f10633F1, f10638G1, f10643H1, f10648I1, f10652J1, f10656K1, f10660L1, f10664M1, f10668N1, f10672O1, f10676P1, f10680Q1, f10684R1, f10688S1, f10692T1, f10696U1, f10700V1, f10704W1, f10708X1, f10712Y1, f10716Z1, f10720a2, f10724b2, f10728c2, f10732d2, f10736e2, f10740f2, f10745g2, f10750h2, f10755i2, f10760j2, f10765k2, f10770l2, f10775m2, f10780n2, f10785o2, f10790p2, f10795q2, f10800r2, f10805s2, f10810t2, f10815u2, f10820v2, f10825w2, f10830x2, f10835y2, f10840z2, f10609A2, f10614B2, f10619C2, f10624D2, f10629E2, f10634F2, f10639G2, f10644H2, f10649I2, f10653J2, f10657K2, f10661L2, f10665M2, f10669N2, f10673O2, f10677P2, f10681Q2, f10685R2, f10689S2, f10693T2, f10697U2, f10701V2, f10705W2, f10709X2, f10713Y2, f10717Z2, f10721a3, f10725b3, f10729c3, f10733d3, f10737e3, f10741f3, f10746g3, f10751h3, f10756i3, f10761j3, f10766k3, f10771l3, f10776m3, f10781n3, f10786o3, f10791p3, f10796q3, f10801r3, f10806s3, f10811t3, f10816u3, f10821v3, f10826w3, f10831x3, f10836y3, f10841z3, f10610A3, f10615B3, f10620C3, f10625D3, f10630E3, f10635F3, f10640G3, f10645H3, I3, J3, K3, L3, M3, N3, O3, P3, Q3, R3, S3, T3, U3, V3, W3, X3, Y3, Z3, a4, b4, c4, d4, e4, f4, g4, h4, i4, j4, k4, l4, m4, n4, o4, p4, q4, r4, s4, t4, u4, v4, w4, x4, y4, z4, A4, B4};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) C4.clone();
        }

        public final String b() {
            return this.f10842d;
        }

        public final int c() {
            return this.f10844f;
        }

        public final int d() {
            return this.f10843e;
        }
    }

    /* renamed from: cab.shashki.app.service.b$b */
    public static final class C0143b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return W2.a.d(Integer.valueOf(((a) obj).c()), Integer.valueOf(((a) obj2).c()));
        }
    }

    private b() {
    }

    public final String C(int i4) {
        String string = ShashkiApp.f10561b.a().getString(i4);
        m.d(string, "getString(...)");
        return string;
    }

    public static /* synthetic */ boolean I(b bVar, InterfaceC0870c interfaceC0870c, String str, List list, int i4, boolean z4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i4 = list != null ? list.size() : 0;
        }
        return bVar.H(interfaceC0870c, str, list, i4, (i5 & 16) != 0 ? false : z4);
    }

    public static /* synthetic */ boolean d(b bVar, Integer num, CheckersParams checkersParams, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            checkersParams = null;
        }
        return bVar.c(num, checkersParams);
    }

    private final a f(Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            List listK = f10603a.k();
            if (iIntValue >= 100000) {
                iIntValue -= 99783;
            }
            a aVar = (a) p.I(listK, iIntValue);
            if (aVar != null) {
                return aVar;
            }
        }
        return a.f10742g;
    }

    public static final List h() {
        return AbstractC0590i.H(a.values(), new C0143b());
    }

    private final List k() {
        return (List) f10604b.getValue();
    }

    public static /* synthetic */ InterfaceC0870c p(b bVar, Integer num, cab.shashki.app.db.entities.a aVar, int i4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            i4 = 0;
        }
        return bVar.n(num, aVar, i4);
    }

    public static /* synthetic */ InterfaceC0870c r(b bVar, int i4, cab.shashki.app.db.entities.a aVar, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            aVar = null;
        }
        if ((i6 & 4) != 0) {
            i5 = 0;
        }
        return bVar.q(i4, aVar, i5);
    }

    public final boolean A(int i4) {
        return n.x(f(Integer.valueOf(i4)).b(), "WiFiLocal", false, 2, null);
    }

    public final boolean B(int i4) {
        return AbstractC0590i.q(new Integer[]{Integer.valueOf(AbstractC0888D.k6), Integer.valueOf(AbstractC0888D.t5)}, Integer.valueOf(w(Integer.valueOf(i4))));
    }

    public final boolean D(Integer num) {
        return num == null || AbstractC0590i.q(new Integer[]{Integer.valueOf(a.f10742g.c()), Integer.valueOf(a.f10747h.c()), Integer.valueOf(a.f10832y.c()), Integer.valueOf(a.f10837z.c()), Integer.valueOf(a.f10757j.c()), Integer.valueOf(a.f10611B.c())}, num) || (z(num) && AbstractC0590i.q(new Integer[]{Integer.valueOf(AbstractC0888D.k6), Integer.valueOf(AbstractC0888D.e6), Integer.valueOf(AbstractC0888D.t5), Integer.valueOf(AbstractC0888D.D6)}, Integer.valueOf(w(num))));
    }

    public final boolean E(Integer num) {
        return AbstractC0590i.q(new Integer[]{Integer.valueOf(AbstractC0888D.D6), Integer.valueOf(AbstractC0888D.P5)}, Integer.valueOf(w(num)));
    }

    public final boolean F(Integer num) {
        return AbstractC0590i.q(new Integer[]{Integer.valueOf(a.f10757j.c()), Integer.valueOf(a.f10837z.c()), Integer.valueOf(a.f10611B.c()), Integer.valueOf(a.f10606A.c()), Integer.valueOf(a.f10782o.c()), Integer.valueOf(a.f10812u.c()), Integer.valueOf(a.f10817v.c()), Integer.valueOf(a.f10822w.c()), Integer.valueOf(a.f10616C.c())}, num);
    }

    public final InterfaceC0870c G(InterfaceC0870c interfaceC0870c, String str, List list) {
        m.e(interfaceC0870c, "<this>");
        I(this, interfaceC0870c, str, list, 0, false, 24, null);
        return interfaceC0870c;
    }

    public final boolean H(InterfaceC0870c interfaceC0870c, String str, List list, int i4, boolean z4) {
        m.e(interfaceC0870c, "e");
        if (interfaceC0870c instanceof P0.b) {
            ((P0.b) interfaceC0870c).b(str, list, i4, z4);
            return true;
        }
        if (str == null && z4) {
            interfaceC0870c.resetGame();
        } else if (str != null) {
            interfaceC0870c.setPosition(str);
        }
        if (list != null) {
            for (int i5 = 0; i5 < i4; i5++) {
                if (!interfaceC0870c.makeMove((String) list.get(i5))) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int J(int i4) {
        a aVar;
        int iW = w(Integer.valueOf(i4));
        a[] aVarArrValues = a.values();
        int length = aVarArrValues.length;
        int i5 = 0;
        while (true) {
            aVar = null;
            if (i5 >= length) {
                break;
            }
            a aVar2 = aVarArrValues[i5];
            if (aVar2.d() == iW && !n.x(aVar2.b(), "Bluetooth", false, 2, null) && !n.x(aVar2.b(), "WiFiLocal", false, 2, null) && !n.x(aVar2.b(), "Fire", false, 2, null)) {
                aVar = aVar2;
                break;
            }
            i5++;
        }
        if (aVar == null) {
            aVar = a.f10742g;
        }
        return aVar.c();
    }

    public final int K(String str) {
        a aVar;
        a[] aVarArrValues = a.values();
        int length = aVarArrValues.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                aVar = null;
                break;
            }
            aVar = aVarArrValues[i4];
            if (m.a(aVar.b(), str)) {
                break;
            }
            i4++;
        }
        if (aVar == null) {
            aVar = a.f10742g;
        }
        return aVar.c();
    }

    public final int L(String str) {
        return f(Integer.valueOf(K(str))).d();
    }

    public final int M(Integer num) {
        a aVar;
        a[] aVarArrValues = a.values();
        int length = aVarArrValues.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                aVar = null;
                break;
            }
            aVar = aVarArrValues[i4];
            int iD = aVar.d();
            if (num != null && iD == num.intValue() && !f10603a.z(Integer.valueOf(aVar.c()))) {
                break;
            }
            i4++;
        }
        return aVar != null ? aVar.c() : a.f10742g.c();
    }

    public final boolean c(Integer num, CheckersParams checkersParams) {
        int iW = w(num);
        return AbstractC0590i.q(new Integer[]{Integer.valueOf(AbstractC0888D.v6), Integer.valueOf(AbstractC0888D.s5), Integer.valueOf(AbstractC0888D.f6), Integer.valueOf(AbstractC0888D.j6), Integer.valueOf(AbstractC0888D.O5), Integer.valueOf(AbstractC0888D.R5)}, Integer.valueOf(iW)) || (iW == AbstractC0888D.x5 && checkersParams != null && checkersParams.getReverseColor());
    }

    public final boolean e(String str) {
        return AbstractC0590i.q(new Integer[]{Integer.valueOf(AbstractC0888D.k6), Integer.valueOf(AbstractC0888D.e6), Integer.valueOf(AbstractC0888D.t5), Integer.valueOf(AbstractC0888D.s5), Integer.valueOf(AbstractC0888D.k5), Integer.valueOf(AbstractC0888D.f6), Integer.valueOf(AbstractC0888D.v6), Integer.valueOf(AbstractC0888D.z6), Integer.valueOf(AbstractC0888D.A6), Integer.valueOf(AbstractC0888D.B6), Integer.valueOf(AbstractC0888D.y6), Integer.valueOf(AbstractC0888D.j6), Integer.valueOf(AbstractC0888D.x6), Integer.valueOf(AbstractC0888D.H5), Integer.valueOf(AbstractC0888D.j5), Integer.valueOf(AbstractC0888D.F5), Integer.valueOf(AbstractC0888D.o6), Integer.valueOf(AbstractC0888D.N5), Integer.valueOf(AbstractC0888D.O5), Integer.valueOf(AbstractC0888D.i5), Integer.valueOf(AbstractC0888D.C5), Integer.valueOf(AbstractC0888D.b6), Integer.valueOf(AbstractC0888D.B5), Integer.valueOf(AbstractC0888D.g6), Integer.valueOf(AbstractC0888D.u6), Integer.valueOf(AbstractC0888D.g5), Integer.valueOf(AbstractC0888D.W5), Integer.valueOf(AbstractC0888D.K5), Integer.valueOf(AbstractC0888D.r6), Integer.valueOf(AbstractC0888D.f5), Integer.valueOf(AbstractC0888D.r5), Integer.valueOf(AbstractC0888D.c6), Integer.valueOf(AbstractC0888D.l6), Integer.valueOf(AbstractC0888D.m5), Integer.valueOf(AbstractC0888D.m6), Integer.valueOf(AbstractC0888D.q5), Integer.valueOf(AbstractC0888D.t6), Integer.valueOf(AbstractC0888D.s6), Integer.valueOf(AbstractC0888D.R5), Integer.valueOf(AbstractC0888D.a6)}, Integer.valueOf(L(str)));
    }

    public final String g(Integer num) {
        int iC = a.f10742g.c();
        if (num != null && num.intValue() == iC) {
            return "Jawel";
        }
        int iC2 = a.f10747h.c();
        if (num != null && num.intValue() == iC2) {
            return "Jawel";
        }
        int iC3 = a.f10752i.c();
        if (num != null && num.intValue() == iC3) {
            return "KestoG 1.5";
        }
        int iC4 = a.f10767l.c();
        if (num != null && num.intValue() == iC4) {
            return "KestoG 1.5";
        }
        int iC5 = a.f10772m.c();
        if (num != null && num.intValue() == iC5) {
            return "KestoG 1.5";
        }
        int iC6 = a.f10686S.c();
        if (num != null && num.intValue() == iC6) {
            return "KestoG 1.5";
        }
        int iC7 = a.f10658L.c();
        if (num != null && num.intValue() == iC7) {
            return "KestoG 1.5";
        }
        int iC8 = a.f10666N.c();
        if (num != null && num.intValue() == iC8) {
            return "KestoG 1.5";
        }
        int iC9 = a.f10670O.c();
        if (num != null && num.intValue() == iC9) {
            return "KestoG 1.5";
        }
        int iC10 = a.f10782o.c();
        if (num != null && num.intValue() == iC10) {
            return "Scan 3.1";
        }
        int iC11 = a.f10812u.c();
        if (num != null && num.intValue() == iC11) {
            return "Scan 3.1";
        }
        int iC12 = a.f10817v.c();
        if (num != null && num.intValue() == iC12) {
            return "Scan 3.1";
        }
        int iC13 = a.f10822w.c();
        if (num != null && num.intValue() == iC13) {
            return "Scan 3.1";
        }
        int iC14 = a.f10616C.c();
        if (num != null && num.intValue() == iC14) {
            return "Scan 3.1";
        }
        int iC15 = a.f10718a0.c();
        if (num != null && num.intValue() == iC15) {
            return "Fairy-Stockfish";
        }
        int iC16 = a.f10710Y.c();
        if (num != null && num.intValue() == iC16) {
            return "Fairy-Stockfish";
        }
        int iC17 = a.f10714Z.c();
        if (num != null && num.intValue() == iC17) {
            return "Fairy-Stockfish";
        }
        int iC18 = a.f10706X.c();
        if (num != null && num.intValue() == iC18) {
            return "Fairy-Stockfish";
        }
        int iC19 = a.f10722b0.c();
        if (num != null && num.intValue() == iC19) {
            return "Fairy-Stockfish";
        }
        int iC20 = a.f10734e0.c();
        if (num != null && num.intValue() == iC20) {
            return "Fairy-Stockfish";
        }
        int iC21 = a.f10738f0.c();
        if (num != null && num.intValue() == iC21) {
            return "Fairy-Stockfish";
        }
        int iC22 = a.f10730d0.c();
        if (num != null && num.intValue() == iC22) {
            return "Fairy-Stockfish";
        }
        int iC23 = a.f10743g0.c();
        if (num != null && num.intValue() == iC23) {
            return "Fairy-Stockfish";
        }
        int iC24 = a.f10748h0.c();
        if (num != null && num.intValue() == iC24) {
            return "Fairy-Stockfish";
        }
        int iC25 = a.f10753i0.c();
        if (num != null && num.intValue() == iC25) {
            return "Fairy-Stockfish";
        }
        int iC26 = a.f10758j0.c();
        if (num != null && num.intValue() == iC26) {
            return "Fairy-Stockfish";
        }
        int iC27 = a.f10763k0.c();
        if (num != null && num.intValue() == iC27) {
            return "Fairy-Stockfish";
        }
        int iC28 = a.f10768l0.c();
        if (num != null && num.intValue() == iC28) {
            return "Fairy-Stockfish";
        }
        int iC29 = a.f10773m0.c();
        if (num != null && num.intValue() == iC29) {
            return "Fairy-Stockfish";
        }
        int iC30 = a.f10803s0.c();
        if (num != null && num.intValue() == iC30) {
            return "Fairy-Stockfish";
        }
        int iC31 = a.f10778n0.c();
        if (num != null && num.intValue() == iC31) {
            return "Fairy-Stockfish";
        }
        int iC32 = a.f10783o0.c();
        if (num != null && num.intValue() == iC32) {
            return "Fairy-Stockfish";
        }
        int iC33 = a.f10788p0.c();
        if (num != null && num.intValue() == iC33) {
            return "Fairy-Stockfish";
        }
        int iC34 = a.f10793q0.c();
        if (num != null && num.intValue() == iC34) {
            return "Fairy-Stockfish";
        }
        int iC35 = a.f10798r0.c();
        if (num != null && num.intValue() == iC35) {
            return "Fairy-Stockfish";
        }
        int iC36 = a.f10612B0.c();
        if (num != null && num.intValue() == iC36) {
            return "Fairy-Stockfish";
        }
        int iC37 = a.f10808t0.c();
        if (num != null && num.intValue() == iC37) {
            return "Fairy-Stockfish";
        }
        return (num != null && num.intValue() == a.f10757j.c()) ? "Stockfish" : v(num);
    }

    public final InterfaceC0870c i(int i4, int i5, InterfaceC0869b.a aVar, InterfaceC1005a interfaceC1005a) {
        m.e(aVar, "analiseListener");
        m.e(interfaceC1005a, "onFail");
        if (i4 == a.f10714Z.c()) {
            return new t(i5, aVar);
        }
        if (i4 == a.f10718a0.c()) {
            return new v(i5, aVar);
        }
        if (i4 == a.f10722b0.c()) {
            return new C0581b(i5, aVar);
        }
        if (i4 == a.f10734e0.c()) {
            return new C0580a(i5, aVar);
        }
        if (i4 == a.f10758j0.c()) {
            return new z(i5, aVar);
        }
        if (i4 == a.f10788p0.c()) {
            return new A(i5, aVar);
        }
        if (i4 == a.f10768l0.c()) {
            return new R0.c(i5, aVar);
        }
        if (i4 == a.f10763k0.c()) {
            return new e(i5, aVar);
        }
        if (i4 == a.f10738f0.c()) {
            return new R0.g(i5, aVar);
        }
        if (i4 == a.f10778n0.c()) {
            return new i(i5, aVar);
        }
        if (i4 == a.f10743g0.c()) {
            return new y(i5, aVar);
        }
        if (i4 == a.f10748h0.c()) {
            return new w(i5, aVar);
        }
        if (i4 == a.f10803s0.c()) {
            return new x(i5, aVar);
        }
        if (i4 == a.f10753i0.c()) {
            return new u(i5, aVar);
        }
        if (i4 == a.f10793q0.c()) {
            return new R0.f(i5, aVar);
        }
        if (i4 == a.f10783o0.c()) {
            return new h(i5, aVar);
        }
        if (i4 == a.f10612B0.c()) {
            return new s(i5, aVar);
        }
        if (i4 == a.f10730d0.c()) {
            return new r(i5, aVar);
        }
        if (i4 == a.f10798r0.c()) {
            return new q(i5, aVar);
        }
        if (i4 == a.f10710Y.c()) {
            return new B(i5, aVar);
        }
        if (i4 == a.f10773m0.c()) {
            return new R0.d(i5, aVar);
        }
        if (i4 != a.f10808t0.c()) {
            return null;
        }
        FairyRepository.a aVarL = FairyRepository.f10588a.l();
        return aVarL == null ? (InterfaceC0870c) interfaceC1005a.a() : new j(aVarL, i5, aVar);
    }

    public final int j(int i4) {
        for (a aVar : a.values()) {
            if (n.x(aVar.b(), "Bluetooth", false, 2, null) && f10603a.f(Integer.valueOf(i4)).d() == aVar.d()) {
                return aVar.c();
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public final int l(int i4) {
        for (a aVar : a.values()) {
            if (n.x(aVar.b(), "Fire", false, 2, null) && f10603a.f(Integer.valueOf(i4)).d() == aVar.d()) {
                return aVar.c();
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public final String m(int i4) {
        a aVar;
        a[] aVarArrValues = a.values();
        int length = aVarArrValues.length;
        int i5 = 0;
        while (true) {
            aVar = null;
            if (i5 >= length) {
                break;
            }
            a aVar2 = aVarArrValues[i5];
            if (aVar2.d() == i4 && !n.x(aVar2.b(), "Bluetooth", false, 2, null) && !n.x(aVar2.b(), "WiFiLocal", false, 2, null) && !n.x(aVar2.b(), "Fire", false, 2, null)) {
                aVar = aVar2;
                break;
            }
            i5++;
        }
        if (aVar == null) {
            aVar = a.f10742g;
        }
        return aVar.b();
    }

    public final InterfaceC0870c n(Integer num, cab.shashki.app.db.entities.a aVar, int i4) {
        return q(f(num).d(), aVar, i4);
    }

    public final InterfaceC0870c o(String str, cab.shashki.app.db.entities.a aVar, int i4) {
        m.e(str, "engine");
        return n(Integer.valueOf(K(str)), aVar, i4);
    }

    public final InterfaceC0870c q(int i4, cab.shashki.app.db.entities.a aVar, int i5) {
        CppGame cppGameHalma;
        CppGame cppGameUniversal;
        if (ShashkiApp.f10561b.b() && !AbstractC0590i.q(new Integer[]{Integer.valueOf(AbstractC0888D.k6), Integer.valueOf(AbstractC0888D.e6), Integer.valueOf(AbstractC0888D.t5), Integer.valueOf(AbstractC0888D.D6)}, Integer.valueOf(i4))) {
            return new W0.d(i5 + 1);
        }
        if (i4 == AbstractC0888D.s5) {
            CppGame cppGame = CppGame.get(a.f10762k.c(), i5 + 1, null);
            m.d(cppGame, "get(...)");
            return cppGame;
        }
        if (i4 == AbstractC0888D.v6) {
            CppGame cppGame2 = CppGame.get(a.f10626E.c(), i5 + 1, null);
            m.d(cppGame2, "get(...)");
            return cppGame2;
        }
        if (i4 == AbstractC0888D.R5) {
            CppGame cppGame3 = CppGame.get(a.f10833y0.c(), i5 + 1, null);
            m.d(cppGame3, "get(...)");
            return cppGame3;
        }
        if (i4 == AbstractC0888D.t5) {
            return new Q0.b(i5, false, null, 6, null);
        }
        if (i4 == AbstractC0888D.D6) {
            return new k(i5);
        }
        if (i4 == AbstractC0888D.n6) {
            return i5 > 0 ? new B(i5, null) : new T0.g();
        }
        if (i4 == AbstractC0888D.Z5) {
            return new x(i5 + 1, null);
        }
        if (i4 == AbstractC0888D.P5) {
            return new t(i5 + 1, null);
        }
        if (i4 == AbstractC0888D.W5) {
            return new v(i5 + 1, null);
        }
        if (i4 == AbstractC0888D.g5) {
            return new C0581b(i5 + 1, null);
        }
        if (i4 == AbstractC0888D.K5) {
            return new r(i5 + 1, null);
        }
        if (i4 == AbstractC0888D.f5) {
            return new C0580a(i5 + 1, null);
        }
        if (i4 == AbstractC0888D.m5) {
            return new R0.c(i5 + 1, null);
        }
        if (i4 == AbstractC0888D.l6) {
            return new z(i5 + 1, null);
        }
        if (i4 == AbstractC0888D.m6) {
            return new A(i5 + 1, null);
        }
        if (i4 == AbstractC0888D.G5) {
            return new q(i5 + 1, null);
        }
        if (i4 == AbstractC0888D.p5) {
            return new e(i5 + 1, null);
        }
        if (i4 == AbstractC0888D.w5) {
            return new i(i5 + 1, null);
        }
        if (i4 == AbstractC0888D.u5) {
            return new h(i5 + 1, null);
        }
        if (i4 == AbstractC0888D.L5) {
            return new s(i5 + 1, null);
        }
        if (i4 == AbstractC0888D.c6) {
            return new y(i5 + 1, null);
        }
        if (i4 == AbstractC0888D.q5) {
            return new R0.f(i5 + 1, null);
        }
        if (i4 == AbstractC0888D.Y5) {
            return new w(i5 + 1, null);
        }
        if (i4 == AbstractC0888D.Q5) {
            return new u(i5 + 1, null);
        }
        if (i4 == AbstractC0888D.r5) {
            return new R0.g(i5 + 1, null);
        }
        if (i4 == AbstractC0888D.n5) {
            return new R0.d(i5 + 1, null);
        }
        if (i4 == AbstractC0888D.k5) {
            CppGame cppGame4 = CppGame.get(a.f10767l.c(), i5 + 1, null);
            m.d(cppGame4, "get(...)");
            return cppGame4;
        }
        if (i4 == AbstractC0888D.f6) {
            CppGame cppGame5 = CppGame.get(a.f10772m.c(), i5 + 1, null);
            m.d(cppGame5, "get(...)");
            return cppGame5;
        }
        if (i4 == AbstractC0888D.j6) {
            CppGame cppGame6 = CppGame.get(a.f10777n.c(), i5 + 1, null);
            m.d(cppGame6, "get(...)");
            return cppGame6;
        }
        if (i4 == AbstractC0888D.a6) {
            CppGame cppGame7 = CppGame.get(a.f10787p.c(), i5, null);
            m.d(cppGame7, "get(...)");
            return cppGame7;
        }
        if (i4 == AbstractC0888D.B5) {
            CppGame cppGame8 = CppGame.get(a.f10682R.c(), i5, null);
            m.d(cppGame8, "get(...)");
            return cppGame8;
        }
        if (i4 == AbstractC0888D.u6) {
            CppGame cppGame9 = CppGame.get(a.f10702W.c(), i5, null);
            m.d(cppGame9, "get(...)");
            return cppGame9;
        }
        if (i4 == AbstractC0888D.g6) {
            CppGame cppGame10 = CppGame.get(a.f10686S.c(), i5, null);
            m.d(cppGame10, "get(...)");
            return cppGame10;
        }
        if (i4 == AbstractC0888D.z6) {
            CppGame cppGame11 = CppGame.get(a.f10792q.c(), i5, null);
            m.d(cppGame11, "get(...)");
            return cppGame11;
        }
        if (i4 == AbstractC0888D.A6) {
            CppGame cppGame12 = CppGame.get(a.f10797r.c(), i5, null);
            m.d(cppGame12, "get(...)");
            return cppGame12;
        }
        if (i4 == AbstractC0888D.B6) {
            CppGame cppGame13 = CppGame.get(a.f10802s.c(), i5, null);
            m.d(cppGame13, "get(...)");
            return cppGame13;
        }
        if (i4 == AbstractC0888D.y6) {
            CppGame cppGame14 = CppGame.get(a.f10807t.c(), i5, null);
            m.d(cppGame14, "get(...)");
            return cppGame14;
        }
        if (i4 == AbstractC0888D.C6) {
            CppGame cppGame15 = CppGame.get(a.f10827x.c(), i5, null);
            m.d(cppGame15, "get(...)");
            return cppGame15;
        }
        if (i4 == AbstractC0888D.i6) {
            CppGame cppGame16 = CppGame.get(a.f10617C0.c(), i5, null);
            m.d(cppGame16, "get(...)");
            return cppGame16;
        }
        if (i4 == AbstractC0888D.M5) {
            return new O0.a(f.b.f3138f);
        }
        if (i4 == AbstractC0888D.S5) {
            return new O0.a(f.b.f3139g);
        }
        if (i4 == AbstractC0888D.l5) {
            return new O0.a(f.b.f3140h);
        }
        if (i4 == AbstractC0888D.D5) {
            return new O0.a(f.b.f3141i);
        }
        if (i4 == AbstractC0888D.h5) {
            return new O0.a(f.b.f3142j);
        }
        if (i4 == AbstractC0888D.x6) {
            CppGame cppGame17 = CppGame.get(a.f10621D.c(), i5, null);
            m.d(cppGame17, "get(...)");
            return cppGame17;
        }
        if (i4 == AbstractC0888D.H5) {
            CppGame cppGame18 = CppGame.get(a.f10631F.c(), i5, null);
            m.d(cppGame18, "get(...)");
            return cppGame18;
        }
        if (i4 == AbstractC0888D.j5) {
            CppGame cppGame19 = CppGame.get(a.f10636G.c(), i5, null);
            m.d(cppGame19, "get(...)");
            return cppGame19;
        }
        if (i4 == AbstractC0888D.F5) {
            CppGame cppGame20 = CppGame.get(a.f10641H.c(), i5, null);
            m.d(cppGame20, "get(...)");
            return cppGame20;
        }
        if (i4 == AbstractC0888D.o6) {
            CppGame cppGame21 = CppGame.get(a.f10650J.c(), i5, null);
            m.d(cppGame21, "get(...)");
            return cppGame21;
        }
        if (i4 == AbstractC0888D.N5) {
            CppGame cppGame22 = CppGame.get(a.f10654K.c(), i5, null);
            m.d(cppGame22, "get(...)");
            return cppGame22;
        }
        if (i4 == AbstractC0888D.p6) {
            CppGame cppGame23 = CppGame.get(a.f10813u0.c(), i5, null);
            m.d(cppGame23, "get(...)");
            return cppGame23;
        }
        if (i4 == AbstractC0888D.i5) {
            CppGame cppGame24 = CppGame.get(a.f10662M.c(), i5, null);
            m.d(cppGame24, "get(...)");
            return cppGame24;
        }
        if (i4 == AbstractC0888D.O5) {
            CppGame cppGame25 = CppGame.get(a.f10658L.c(), i5, null);
            m.d(cppGame25, "get(...)");
            return cppGame25;
        }
        if (i4 == AbstractC0888D.C5) {
            CppGame cppGame26 = CppGame.get(a.f10666N.c(), i5, null);
            m.d(cppGame26, "get(...)");
            return cppGame26;
        }
        if (i4 == AbstractC0888D.b6) {
            CppGame cppGame27 = CppGame.get(a.f10670O.c(), i5, null);
            m.d(cppGame27, "get(...)");
            return cppGame27;
        }
        if (i4 == AbstractC0888D.o5) {
            CppGame cppGame28 = CppGame.get(a.f10674P.c(), i5, null);
            m.d(cppGame28, "get(...)");
            return cppGame28;
        }
        if (i4 == AbstractC0888D.q6) {
            CppGame cppGame29 = CppGame.get(a.f10690T.c(), i5, null);
            m.d(cppGame29, "get(...)");
            return cppGame29;
        }
        if (i4 == AbstractC0888D.X5) {
            CppGame cppGame30 = CppGame.get(a.f10678Q.c(), i5, null);
            m.d(cppGame30, "get(...)");
            return cppGame30;
        }
        if (i4 == AbstractC0888D.U5) {
            CppGame cppGame31 = CppGame.get(a.f10646I.c(), i5, null);
            m.d(cppGame31, "get(...)");
            return cppGame31;
        }
        if (i4 == AbstractC0888D.w6) {
            CppGame cppGame32 = CppGame.get(a.f10694U.c(), i5, null);
            m.d(cppGame32, "get(...)");
            return cppGame32;
        }
        if (i4 == AbstractC0888D.v5) {
            CppGame cppGame33 = CppGame.get(a.f10698V.c(), i5, null);
            m.d(cppGame33, "get(...)");
            return cppGame33;
        }
        if (i4 == AbstractC0888D.r6) {
            CppGame cppGame34 = CppGame.get(a.f10726c0.c(), i5, null);
            m.d(cppGame34, "get(...)");
            return cppGame34;
        }
        if (i4 == AbstractC0888D.t6) {
            CppGame cppGame35 = CppGame.get(a.f10818v0.c(), i5, null);
            m.d(cppGame35, "get(...)");
            return cppGame35;
        }
        if (i4 == AbstractC0888D.s6) {
            CppGame cppGame36 = CppGame.get(a.f10823w0.c(), i5, null);
            m.d(cppGame36, "get(...)");
            return cppGame36;
        }
        if (i4 == AbstractC0888D.x5) {
            CheckersParams checkersParams = aVar instanceof CheckersParams ? (CheckersParams) aVar : null;
            return (checkersParams == null || (cppGameUniversal = CppGame.universal(i5, checkersParams)) == null) ? new W0.d(i5 + 1) : cppGameUniversal;
        }
        if (i4 != AbstractC0888D.A5) {
            return i4 == AbstractC0888D.e6 ? new W0.d(i5 + 1, true) : new W0.d(i5 + 1);
        }
        HalmaParams halmaParams = aVar instanceof HalmaParams ? (HalmaParams) aVar : null;
        return (halmaParams == null || (cppGameHalma = CppGame.halma(i5, halmaParams)) == null) ? new W0.d(i5 + 1) : cppGameHalma;
    }

    public final Set s() {
        return f10605c;
    }

    public final int t(int i4) {
        for (a aVar : a.values()) {
            if (n.x(aVar.b(), "WiFiLocal", false, 2, null) && f10603a.f(Integer.valueOf(i4)).d() == aVar.d()) {
                return aVar.c();
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public final boolean u(Integer num) {
        if (!AbstractC0590i.q(new Integer[]{Integer.valueOf(a.f10757j.c()), Integer.valueOf(a.f10837z.c()), Integer.valueOf(a.f10611B.c()), Integer.valueOf(a.f10626E.c()), Integer.valueOf(a.f10762k.c()), Integer.valueOf(a.f10767l.c()), Integer.valueOf(a.f10772m.c()), Integer.valueOf(a.f10654K.c()), Integer.valueOf(a.f10838z0.c()), Integer.valueOf(a.f10752i.c()), Integer.valueOf(a.f10606A.c()), Integer.valueOf(a.f10682R.c()), Integer.valueOf(a.f10686S.c()), Integer.valueOf(a.f10658L.c()), Integer.valueOf(a.f10666N.c()), Integer.valueOf(a.f10670O.c()), Integer.valueOf(a.f10706X.c()), Integer.valueOf(a.f10710Y.c()), Integer.valueOf(a.f10718a0.c()), Integer.valueOf(a.f10722b0.c()), Integer.valueOf(a.f10714Z.c()), Integer.valueOf(a.f10730d0.c()), Integer.valueOf(a.f10734e0.c()), Integer.valueOf(a.f10738f0.c()), Integer.valueOf(a.f10743g0.c()), Integer.valueOf(a.f10748h0.c()), Integer.valueOf(a.f10753i0.c()), Integer.valueOf(a.f10758j0.c()), Integer.valueOf(a.f10763k0.c()), Integer.valueOf(a.f10768l0.c()), Integer.valueOf(a.f10773m0.c()), Integer.valueOf(a.f10778n0.c()), Integer.valueOf(a.f10783o0.c()), Integer.valueOf(a.f10788p0.c()), Integer.valueOf(a.f10793q0.c()), Integer.valueOf(a.f10798r0.c()), Integer.valueOf(a.f10803s0.c()), Integer.valueOf(a.f10612B0.c()), Integer.valueOf(a.f10808t0.c()), Integer.valueOf(a.f10833y0.c()), Integer.valueOf(a.f10702W.c()), Integer.valueOf(a.f10787p.c())}, num)) {
            int iC = a.f10782o.c();
            if (num == null || num.intValue() != iC || !C1276B.f18948a.g().exists()) {
                int iC2 = a.f10812u.c();
                if (num == null || num.intValue() != iC2 || !C1276B.f18948a.h().exists()) {
                    int iC3 = a.f10817v.c();
                    if (num == null || num.intValue() != iC3 || !C1276B.f18948a.b().exists()) {
                        int iC4 = a.f10822w.c();
                        if (num == null || num.intValue() != iC4 || !C1276B.f18948a.f().exists()) {
                            int iC5 = a.f10616C.c();
                            if (num == null || num.intValue() != iC5 || !C1276B.f18948a.a().exists()) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public final String v(Integer num) {
        return f(num).b();
    }

    public final int w(Integer num) {
        return f(num).d();
    }

    public final boolean x(int i4) {
        return n.x(f(Integer.valueOf(i4)).b(), "Bluetooth", false, 2, null);
    }

    public final boolean y(int i4) {
        return n.x(f(Integer.valueOf(i4)).b(), "Fire", false, 2, null);
    }

    public final boolean z(Integer num) {
        return num != null && m3.h.j(10, 100000).h(num.intValue());
    }
}