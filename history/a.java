package cab.shashki.app.ui.history;

import C2.g;
import C2.i;
import R0.j;
import T2.u;
import U2.AbstractC0590i;
import U2.p;
import android.content.Context;
import android.util.SparseArray;
import cab.shashki.app.db.entities.CheckersParams;
import cab.shashki.app.service.FairyRepository;
import cab.shashki.app.ui.custom.HistoryGraphView;
import cab.shashki.app.ui.custom.board.C0843z;
import cab.shashki.app.ui.custom.board.ShashkiBoardView;
import cab.shashki.app.ui.custom.board.W;
import cab.shashki.app.ui.history.a;
import cab.shashki.app.ui.history.b;
import e0.InterfaceC0869b;
import e0.InterfaceC0870c;
import f0.AbstractC0888D;
import f0.AbstractC0909m;
import g3.InterfaceC1016l;
import g3.InterfaceC1020p;
import h0.C1030d;
import h0.InterfaceC1033g;
import h3.l;
import h3.m;
import h3.s;
import i0.C1048c;
import i0.C1054i;
import i0.C1056k;
import i0.C1057l;
import i0.C1058m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import m3.h;
import o0.C1218E;
import o0.x;
import p3.n;
import q0.C1290n;
import q0.C1293q;
import r0.C1355o;
import u2.C1409c;
import x2.AbstractC1488f;
import x2.EnumC1483a;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class a extends AbstractC0909m implements W {

    /* renamed from: A, reason: collision with root package name */
    private int f11649A;

    /* renamed from: B, reason: collision with root package name */
    private int f11650B;

    /* renamed from: C, reason: collision with root package name */
    private String f11651C;

    /* renamed from: d, reason: collision with root package name */
    private final int f11652d;

    /* renamed from: e, reason: collision with root package name */
    private final C1409c f11653e;

    /* renamed from: f, reason: collision with root package name */
    private final C1409c f11654f;

    /* renamed from: g, reason: collision with root package name */
    private final C1409c f11655g;

    /* renamed from: h, reason: collision with root package name */
    private final C1409c f11656h;

    /* renamed from: i, reason: collision with root package name */
    private final C1409c f11657i;

    /* renamed from: j, reason: collision with root package name */
    private final C1409c f11658j;

    /* renamed from: k, reason: collision with root package name */
    private final C1409c f11659k;

    /* renamed from: l, reason: collision with root package name */
    private final C1409c f11660l;

    /* renamed from: m, reason: collision with root package name */
    private final C1409c f11661m;

    /* renamed from: n, reason: collision with root package name */
    private final C1409c f11662n;

    /* renamed from: o, reason: collision with root package name */
    private final C1409c f11663o;

    /* renamed from: p, reason: collision with root package name */
    private final C1409c f11664p;

    /* renamed from: q, reason: collision with root package name */
    private final C1409c f11665q;

    /* renamed from: r, reason: collision with root package name */
    private final C1409c f11666r;

    /* renamed from: s, reason: collision with root package name */
    private final C1409c f11667s;

    /* renamed from: t, reason: collision with root package name */
    private final Map f11668t;

    /* renamed from: u, reason: collision with root package name */
    private String f11669u;

    /* renamed from: v, reason: collision with root package name */
    private Integer f11670v;

    /* renamed from: w, reason: collision with root package name */
    private InterfaceC0870c f11671w;

    /* renamed from: x, reason: collision with root package name */
    private cab.shashki.app.db.entities.a f11672x;

    /* renamed from: y, reason: collision with root package name */
    private C1355o f11673y;

    /* renamed from: z, reason: collision with root package name */
    private x f11674z;

    /* renamed from: cab.shashki.app.ui.history.a$a, reason: collision with other inner class name */
    public static final class C0151a {

        /* renamed from: a, reason: collision with root package name */
        private final int f11675a;

        /* renamed from: b, reason: collision with root package name */
        private final int f11676b;

        /* renamed from: c, reason: collision with root package name */
        private final String f11677c;

        public C0151a(int i4, int i5, String str) {
            m.e(str, "notation");
            this.f11675a = i4;
            this.f11676b = i5;
            this.f11677c = str;
        }

        public final int a() {
            return this.f11676b;
        }

        public final int b() {
            return this.f11675a;
        }

        public final String c() {
            return this.f11677c;
        }
    }

    /* synthetic */ class b extends l implements InterfaceC1016l {

        /* renamed from: m, reason: collision with root package name */
        public static final b f11678m = new b();

        b() {
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

    /* synthetic */ class c extends l implements InterfaceC1016l {

        /* renamed from: m, reason: collision with root package name */
        public static final c f11679m = new c();

        c() {
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

    /* synthetic */ class d extends l implements InterfaceC1016l {

        /* renamed from: m, reason: collision with root package name */
        public static final d f11680m = new d();

        d() {
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

    /* synthetic */ class e extends l implements InterfaceC1016l {

        /* renamed from: m, reason: collision with root package name */
        public static final e f11681m = new e();

        e() {
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

    public a(Context context, int i4) {
        m.e(context, "context");
        this.f11652d = i4;
        Boolean bool = Boolean.FALSE;
        this.f11653e = C1409c.u(bool);
        this.f11654f = C1409c.u(bool);
        this.f11655g = C1409c.u(new SparseArray());
        this.f11656h = C1409c.u(bool);
        this.f11657i = C1409c.t();
        this.f11658j = C1409c.u(-1);
        this.f11659k = C1409c.u(-1);
        this.f11660l = C1409c.u(new C0151a(-1, -1, ""));
        this.f11661m = C1409c.t();
        this.f11662n = C1409c.t();
        this.f11663o = C1409c.t();
        this.f11664p = C1409c.t();
        this.f11665q = C1409c.t();
        this.f11666r = C1409c.t();
        this.f11667s = C1409c.u(bool);
        this.f11668t = new LinkedHashMap();
        this.f11674z = (x) p.G(C1218E.f18139a.b());
        this.f11649A = -1;
        this.f11650B = 15;
        I1(context);
        d2();
        Z1();
    }

    private final void A1(List list) {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        Object next6;
        Object next7;
        Object next8;
        String str;
        Object next9;
        String str2;
        String str3;
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (((Number) ((T2.l) next).c()).intValue() == -1) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        T2.l lVar = (T2.l) next;
        if (lVar != null && (str3 = (String) lVar.d()) != null) {
            cab.shashki.app.db.entities.a aVarI = cab.shashki.app.service.a.f10602a.i(this.f11670v, str3);
            this.f11672x = aVarI;
            if (aVarI != null) {
                FairyRepository.a aVar = aVarI instanceof FairyRepository.a ? (FairyRepository.a) aVarI : null;
                if (aVar != null) {
                    try {
                        this.f11671w = new j(aVar, 1, null);
                        return;
                    } catch (Exception e4) {
                        e4.printStackTrace();
                        return;
                    }
                }
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next2 = it2.next();
                if (((Number) ((T2.l) next2).c()).intValue() == -1000) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        T2.l lVar2 = (T2.l) next2;
        if (lVar2 != null) {
            sb.append((String) lVar2.d());
            sb.append('\n');
        }
        Iterator it3 = list.iterator();
        while (true) {
            if (it3.hasNext()) {
                next3 = it3.next();
                if (((Number) ((T2.l) next3).c()).intValue() == -1006) {
                    break;
                }
            } else {
                next3 = null;
                break;
            }
        }
        T2.l lVar3 = (T2.l) next3;
        if (lVar3 != null) {
            sb.append((String) lVar3.d());
            sb.append('\n');
        }
        Iterator it4 = list.iterator();
        while (true) {
            if (it4.hasNext()) {
                next4 = it4.next();
                if (((Number) ((T2.l) next4).c()).intValue() == -1001) {
                    break;
                }
            } else {
                next4 = null;
                break;
            }
        }
        T2.l lVar4 = (T2.l) next4;
        if (lVar4 != null) {
            sb.append((String) lVar4.d());
            sb.append('\n');
        }
        Iterator it5 = list.iterator();
        while (true) {
            if (it5.hasNext()) {
                next5 = it5.next();
                if (((Number) ((T2.l) next5).c()).intValue() == -1007) {
                    break;
                }
            } else {
                next5 = null;
                break;
            }
        }
        T2.l lVar5 = (T2.l) next5;
        if (lVar5 != null) {
            sb.append("Round ");
            sb.append((String) lVar5.d());
            sb.append('\n');
        }
        Iterator it6 = list.iterator();
        while (true) {
            if (it6.hasNext()) {
                next6 = it6.next();
                if (((Number) ((T2.l) next6).c()).intValue() == -1003) {
                    break;
                }
            } else {
                next6 = null;
                break;
            }
        }
        T2.l lVar6 = (T2.l) next6;
        if (lVar6 != null) {
            sb.append("Opening ");
            sb.append((String) lVar6.d());
            sb.append('\n');
        }
        Iterator it7 = list.iterator();
        while (true) {
            if (it7.hasNext()) {
                next7 = it7.next();
                if (((Number) ((T2.l) next7).c()).intValue() == -1002) {
                    break;
                }
            } else {
                next7 = null;
                break;
            }
        }
        T2.l lVar7 = (T2.l) next7;
        if (lVar7 != null) {
            sb.append("Result ");
            sb.append((String) lVar7.d());
            sb.append('\n');
        }
        int i4 = cab.shashki.app.service.b.d(cab.shashki.app.service.b.f10603a, this.f11670v, null, 2, null) ? -1005 : -1004;
        int i5 = i4 ^ 7;
        Iterator it8 = list.iterator();
        while (true) {
            if (it8.hasNext()) {
                next8 = it8.next();
                if (((Number) ((T2.l) next8).c()).intValue() == i4) {
                    break;
                }
            } else {
                next8 = null;
                break;
            }
        }
        T2.l lVar8 = (T2.l) next8;
        String str4 = "?";
        if (lVar8 == null || (str = (String) lVar8.d()) == null) {
            str = "?";
        }
        sb.append(str);
        sb.append(" - ");
        Iterator it9 = list.iterator();
        while (true) {
            if (it9.hasNext()) {
                next9 = it9.next();
                if (((Number) ((T2.l) next9).c()).intValue() == i5) {
                    break;
                }
            } else {
                next9 = null;
                break;
            }
        }
        T2.l lVar9 = (T2.l) next9;
        if (lVar9 != null && (str2 = (String) lVar9.d()) != null) {
            str4 = str2;
        }
        sb.append(str4);
        sb.append('\n');
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Number) ((T2.l) obj).c()).intValue() <= -1020) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj2 = arrayList.get(i6);
            i6++;
            String str5 = (String) ((T2.l) obj2).d();
            int iM = n.M(str5, ':', 0, false, 6, null);
            String strSubstring = str5.substring(0, iM);
            m.d(strSubstring, "substring(...)");
            sb.append(strSubstring);
            sb.append(" \"");
            String strSubstring2 = str5.substring(iM + 1);
            m.d(strSubstring2, "substring(...)");
            sb.append(strSubstring2);
            sb.append("\"\n");
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list) {
            if (((Number) ((T2.l) obj3).c()).intValue() > -1000) {
                arrayList2.add(obj3);
            }
        }
        int size2 = arrayList2.size();
        int i7 = 0;
        while (i7 < size2) {
            Object obj4 = arrayList2.get(i7);
            i7++;
            T2.l lVar10 = (T2.l) obj4;
            this.f11668t.put(Integer.valueOf((-((Number) lVar10.c()).intValue()) - 1), lVar10.d());
        }
        String string = sb.toString();
        m.d(string, "toString(...)");
        String string2 = n.x0(string).toString();
        String str6 = string2.length() > 0 ? string2 : null;
        this.f11651C = str6;
        this.f11667s.accept(Boolean.valueOf(str6 != null));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void C1(java.util.List r21, int r22, boolean r23) {
        /*
            r20 = this;
            r0 = r20
            java.util.ArrayList r4 = new java.util.ArrayList
            r1 = 10
            r2 = r21
            int r1 = U2.p.o(r2, r1)
            r4.<init>(r1)
            java.util.Iterator r1 = r2.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()
            q0.n$c r2 = (q0.C1290n.c) r2
            java.lang.String r2 = r2.b()
            r4.add(r2)
            goto L13
        L27:
            e0.c r2 = r0.f11671w
            if (r2 != 0) goto L2c
            return
        L2c:
            boolean r1 = r4.isEmpty()
            java.lang.String r13 = "getPosition(...)"
            if (r1 == 0) goto L5a
            cab.shashki.app.service.b r5 = cab.shashki.app.service.b.f10603a
            java.lang.String r7 = r0.f11669u
            r11 = 8
            r12 = 0
            r8 = 0
            r9 = 0
            r10 = 1
            r6 = r2
            cab.shashki.app.service.b.I(r5, r6, r7, r8, r9, r10, r11, r12)
            u2.c r1 = r0.f11663o
            cab.shashki.app.ui.history.b$b r3 = new cab.shashki.app.ui.history.b$b
            java.lang.String r4 = r2.getPosition()
            h3.m.d(r4, r13)
            r9 = 30
            r10 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r1.accept(r3)
            return
        L5a:
            cab.shashki.app.service.b r1 = cab.shashki.app.service.b.f10603a
            java.lang.String r3 = r0.f11669u
            r7 = 1
            int r5 = r22 + 1
            r6 = 1
            r1.H(r2, r3, r4, r5, r6)
            java.lang.String[] r3 = r2.getLastMove()
            java.lang.Integer r4 = r0.f11670v
            int r1 = r1.w(r4)
            u2.c r4 = r0.f11663o
            java.lang.String r15 = r2.getPosition()
            h3.m.d(r15, r13)
            java.lang.Integer r5 = r0.f11670v
            if (r5 == 0) goto L8d
            boolean r6 = r0.R1()
            if (r6 == 0) goto L83
            goto L84
        L83:
            r5 = 0
        L84:
            if (r5 == 0) goto L8d
            int r5 = r5.intValue()
            r16 = r5
            goto L90
        L8d:
            r5 = -1
            r16 = -1
        L90:
            N0.K$c r5 = new N0.K$c
            r6 = 0
            r8 = r3[r6]
            java.lang.String r9 = "get(...)"
            h3.m.d(r8, r9)
            boolean r2 = r2.getPlayer()
            r2 = r2 ^ r7
            r5.<init>(r8, r1, r2)
            h3.m.b(r3)
            m3.g r2 = new m3.g
            int r8 = U2.AbstractC0590i.w(r3)
            r2.<init>(r7, r8)
            java.lang.Object[] r2 = U2.AbstractC0590i.F(r3, r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r7 = r2.length
            r3.<init>(r7)
            int r7 = r2.length
        Lb9:
            if (r6 >= r7) goto Ld2
            r8 = r2[r6]
            java.lang.String r8 = (java.lang.String) r8
            N0.K r9 = N0.K.f2926a
            h3.m.b(r8)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            java.lang.String r8 = r9.T(r8, r10)
            r3.add(r8)
            int r6 = r6 + 1
            goto Lb9
        Ld2:
            cab.shashki.app.ui.history.b$b r14 = new cab.shashki.app.ui.history.b$b
            r17 = r23
            r19 = r3
            r18 = r5
            r14.<init>(r15, r16, r17, r18, r19)
            r4.accept(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cab.shashki.app.ui.history.a.C1(java.util.List, int, boolean):void");
    }

    private final void D1(Context context, C1056k c1056k, C1054i c1054i) {
        String string;
        String string2;
        String str;
        int i4;
        cab.shashki.app.db.entities.a aVar = this.f11672x;
        if (aVar == null || (string = aVar.name()) == null) {
            string = context.getString(cab.shashki.app.service.b.f10603a.w(this.f11670v));
            m.d(string, "getString(...)");
        }
        if (c1056k == null) {
            this.f11661m.accept(string);
            return;
        }
        cab.shashki.app.service.b bVar = cab.shashki.app.service.b.f10603a;
        boolean zE = bVar.E(this.f11670v);
        if (bVar.z(this.f11670v)) {
            String string3 = context.getString(AbstractC0888D.f14475e2);
            cab.shashki.app.db.entities.a aVar2 = this.f11672x;
            if (aVar2 == null || !aVar2.extraPlayers()) {
                i4 = (!(c1054i == null && c1056k.f() == 2) && (c1054i == null || c1054i.g() == 0)) ? AbstractC0888D.T6 : zE ? AbstractC0888D.U6 : AbstractC0888D.V6;
            } else {
                cab.shashki.app.db.entities.a aVar3 = this.f11672x;
                if (aVar3 == null || !aVar3.is3()) {
                    cab.shashki.app.db.entities.a aVar4 = this.f11672x;
                    i4 = (aVar4 == null || !aVar4.is6()) ? AbstractC0888D.f14543s0 : AbstractC0888D.P4;
                } else {
                    i4 = AbstractC0888D.b5;
                }
            }
            String string4 = context.getString(i4);
            m.d(string4, "getString(...)");
            String lowerCase = string4.toLowerCase(Locale.ROOT);
            m.d(lowerCase, "toLowerCase(...)");
            str = string3 + " (" + lowerCase + ")";
        } else {
            if (c1056k.f() == 0) {
                this.f11661m.accept(string);
                return;
            }
            String strG = bVar.g(this.f11670v);
            cab.shashki.app.db.entities.a aVar5 = this.f11672x;
            if (aVar5 == null || !aVar5.is3()) {
                cab.shashki.app.db.entities.a aVar6 = this.f11672x;
                if (aVar6 == null || !aVar6.is4()) {
                    cab.shashki.app.db.entities.a aVar7 = this.f11672x;
                    string2 = (aVar7 == null || !aVar7.is6()) ? c1056k.f() == 2 ? context.getString(AbstractC0888D.f14502k) : c1056k.f() == 1 ? context.getString(AbstractC0888D.f14512m) : context.getString(AbstractC0888D.f14497j) : context.getString(AbstractC0888D.P4);
                } else {
                    string2 = context.getString(AbstractC0888D.f14543s0);
                }
            } else {
                string2 = context.getString(AbstractC0888D.b5);
            }
            str = strG + " " + string2 + ", " + (c1056k.h() ? context.getString(AbstractC0888D.B4, Integer.valueOf(c1056k.g() / 1000), Integer.valueOf((c1056k.g() % 1000) / 10)) : context.getString(AbstractC0888D.f14362E1, Integer.valueOf(c1056k.e()))) + " ";
        }
        this.f11661m.accept(string + "\n" + str);
    }

    private final void E1() {
        final s sVar = new s();
        C1355o c1355o = this.f11673y;
        if (c1355o == null) {
            c1355o = new C1355o(this.f11652d, this.f11670v);
            x2.m mVarQ = c1355o.S().q(S2.a.c());
            final InterfaceC1016l interfaceC1016l = new InterfaceC1016l() { // from class: I0.Z
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return cab.shashki.app.ui.history.a.F1(sVar, this, (T2.l) obj);
                }
            };
            C2.e eVar = new C2.e() { // from class: I0.k0
                @Override // C2.e
                public final void accept(Object obj) {
                    cab.shashki.app.ui.history.a.G1(interfaceC1016l, obj);
                }
            };
            final b bVar = b.f11678m;
            A2.c cVarN = mVarQ.n(eVar, new C2.e() { // from class: I0.v0
                @Override // C2.e
                public final void accept(Object obj) {
                    cab.shashki.app.ui.history.a.H1(bVar, obj);
                }
            });
            m.d(cVarN, "subscribe(...)");
            R2.a.a(cVarN, t0());
        }
        this.f11673y = c1355o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u F1(s sVar, a aVar, T2.l lVar) {
        int iFloatValue;
        if (!sVar.f16264d && ((Number) lVar.c()).intValue() != 0) {
            sVar.f16264d = true;
        }
        C1409c c1409c = aVar.f11659k;
        int iIntValue = ((Number) lVar.c()).intValue();
        if (iIntValue == 1) {
            iFloatValue = (int) (((Number) lVar.d()).floatValue() * 30);
        } else if (iIntValue == 2) {
            iFloatValue = ((int) (((Number) lVar.d()).floatValue() * 50)) + 30;
        } else if (iIntValue == 3) {
            iFloatValue = ((int) (((Number) lVar.d()).floatValue() * 20)) + 80;
        } else if (iIntValue != 4) {
            iFloatValue = -1;
            if (sVar.f16264d) {
                aVar.f11657i.accept(-1);
            }
        } else {
            iFloatValue = -2;
        }
        c1409c.accept(Integer.valueOf(iFloatValue));
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G1(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H1(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    private final void I1(final Context context) {
        final InterfaceC1033g interfaceC1033gE = C1030d.f16118a.b().E();
        AbstractC1488f abstractC1488fH = AbstractC1488f.q(new Callable() { // from class: I0.d0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cab.shashki.app.ui.history.a.J1(interfaceC1033gE, this);
            }
        }).H(S2.a.c());
        final InterfaceC1016l interfaceC1016l = new InterfaceC1016l() { // from class: I0.e0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.history.a.K1(this.f1632d, context, (C1057l) obj);
            }
        };
        C2.e eVar = new C2.e() { // from class: I0.f0
            @Override // C2.e
            public final void accept(Object obj) {
                cab.shashki.app.ui.history.a.L1(interfaceC1016l, obj);
            }
        };
        final c cVar = c.f11679m;
        A2.c cVarD = abstractC1488fH.D(eVar, new C2.e() { // from class: I0.g0
            @Override // C2.e
            public final void accept(Object obj) {
                cab.shashki.app.ui.history.a.M1(cVar, obj);
            }
        });
        m.d(cVarD, "subscribe(...)");
        R2.a.a(cVarD, t0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1057l J1(InterfaceC1033g interfaceC1033g, a aVar) {
        C1056k c1056kB = interfaceC1033g.b(aVar.f11652d);
        m.b(c1056kB);
        C1290n c1290nF = C1293q.f19091a.f(c1056kB);
        List<C1058m> listO = interfaceC1033g.o(aVar.f11652d);
        ArrayList arrayList = new ArrayList(p.o(listO, 10));
        for (C1058m c1058m : listO) {
            arrayList.add(new T2.l(Integer.valueOf(c1058m.b()), c1058m.c()));
        }
        return new C1057l(c1056kB, "", c1290nF, arrayList, interfaceC1033g.i(aVar.f11652d), null, 0, false, 224, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u K1(a aVar, Context context, C1057l c1057l) {
        aVar.f11669u = c1057l.c().l();
        aVar.f11670v = Integer.valueOf(c1057l.c().d());
        aVar.A1(c1057l.e());
        try {
            InterfaceC0870c interfaceC0870cP = aVar.f11671w;
            if (interfaceC0870cP == null) {
                interfaceC0870cP = cab.shashki.app.service.b.p(cab.shashki.app.service.b.f10603a, aVar.f11670v, aVar.f11672x, 0, 4, null);
            }
            aVar.f11671w = interfaceC0870cP;
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        if (!aVar.f11657i.w() && C1355o.f19488E.a(aVar.f11670v)) {
            aVar.f11657i.accept(-1);
        }
        aVar.f11656h.accept(Boolean.valueOf(c1057l.b() == null && C1355o.f19488E.a(aVar.f11670v)));
        aVar.f11662n.accept(c1057l.d());
        aVar.f11658j.accept(0);
        aVar.D1(context, c1057l.c(), c1057l.b());
        cab.shashki.app.service.b bVar = cab.shashki.app.service.b.f10603a;
        Integer num = aVar.f11670v;
        cab.shashki.app.db.entities.a aVarF = c1057l.f();
        boolean zC = bVar.c(num, aVarF instanceof CheckersParams ? (CheckersParams) aVarF : null);
        C1409c c1409c = aVar.f11665q;
        cab.shashki.app.db.entities.a aVarF2 = c1057l.f();
        c1409c.accept(Boolean.valueOf((aVarF2 == null || !aVarF2.extraPlayers()) && ((zC && c1057l.c().f() == 2) || (!zC && c1057l.c().f() == 1))));
        int iW = bVar.w(aVar.f11670v);
        if (AbstractC0590i.q(new Integer[]{Integer.valueOf(AbstractC0888D.h5), Integer.valueOf(AbstractC0888D.g5)}, Integer.valueOf(iW))) {
            aVar.f11650B = 5;
        }
        if (AbstractC0590i.q(new Integer[]{Integer.valueOf(AbstractC0888D.D6), Integer.valueOf(AbstractC0888D.n6), Integer.valueOf(AbstractC0888D.P5), Integer.valueOf(AbstractC0888D.W5), Integer.valueOf(AbstractC0888D.K5), Integer.valueOf(AbstractC0888D.f5), Integer.valueOf(AbstractC0888D.n5), Integer.valueOf(AbstractC0888D.r5), Integer.valueOf(AbstractC0888D.c6), Integer.valueOf(AbstractC0888D.l6), Integer.valueOf(AbstractC0888D.p5), Integer.valueOf(AbstractC0888D.m5), Integer.valueOf(AbstractC0888D.w5), Integer.valueOf(AbstractC0888D.u5), Integer.valueOf(AbstractC0888D.m6), Integer.valueOf(AbstractC0888D.q5), Integer.valueOf(AbstractC0888D.L5), Integer.valueOf(AbstractC0888D.G5), Integer.valueOf(AbstractC0888D.Z5)}, Integer.valueOf(iW))) {
            aVar.f11650B = 8;
        }
        aVar.Q1(iW);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L1(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M1(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    private final void Q1(int i4) {
        C0843z c0843z = C0843z.f11502a;
        this.f11674z = c0843z.D(i4, this.f11672x);
        this.f11666r.accept(C0843z.e0(c0843z, i4, null, this.f11672x, 2, null));
    }

    private final boolean R1() {
        cab.shashki.app.db.entities.a aVar = this.f11672x;
        CheckersParams checkersParams = aVar instanceof CheckersParams ? (CheckersParams) aVar : null;
        return checkersParams != null && checkersParams.getMonochorome();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List V1(C1290n c1290n, int i4, a aVar) {
        return HistoryGraphView.f11266y.c(c1290n, i4, aVar.f11672x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u W1(a aVar, int i4, List list) {
        cab.shashki.app.ui.history.b bVar = (cab.shashki.app.ui.history.b) aVar.w0();
        if (bVar != null) {
            m.b(list);
            bVar.n(list, i4, aVar.f11672x);
        }
        return u.f3817a;
    }

    private final void Z1() {
        AbstractC1488f abstractC1488fH = C1030d.f16118a.b().C().e(this.f11652d).H(S2.a.d());
        final InterfaceC1016l interfaceC1016l = new InterfaceC1016l() { // from class: I0.a0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.history.a.a2(this.f1618d, (List) obj);
            }
        };
        C2.e eVar = new C2.e() { // from class: I0.b0
            @Override // C2.e
            public final void accept(Object obj) {
                cab.shashki.app.ui.history.a.b2(interfaceC1016l, obj);
            }
        };
        final d dVar = d.f11680m;
        A2.c cVarD = abstractC1488fH.D(eVar, new C2.e() { // from class: I0.c0
            @Override // C2.e
            public final void accept(Object obj) {
                cab.shashki.app.ui.history.a.c2(dVar, obj);
            }
        });
        m.d(cVarD, "subscribe(...)");
        R2.a.a(cVarD, t0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u a2(a aVar, List list) {
        SparseArray sparseArray = new SparseArray();
        m.b(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1048c c1048c = (C1048c) it.next();
            sparseArray.put(c1048c.i(), c1048c);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C1048c c1048c2 = (C1048c) it2.next();
            C1048c c1048c3 = (C1048c) sparseArray.get(c1048c2.a());
            if (c1048c3 != null) {
                int i4 = (c1048c2.i() ^ c1048c2.a()) & 1;
                c1048c2.n((c1048c3.j() ^ (-i4)) + i4);
                c1048c2.o(c1048c2.c() - c1048c2.j());
                c1048c2.m(c1048c3.h());
            } else {
                c1048c2.n(Integer.MIN_VALUE);
                c1048c2.o(Integer.MIN_VALUE);
            }
            if (c1048c2.g() == null || c1048c2.d() == null || c1048c2.f() == null) {
                c1048c2.p(Integer.MIN_VALUE);
            } else {
                int i5 = (c1048c2.i() ^ c1048c2.d().intValue()) & 1;
                c1048c2.p(((c1048c2.f().intValue() ^ (-i5)) + i5) - c1048c2.j());
            }
        }
        aVar.f11655g.accept(sparseArray);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b2(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c2(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    private final void d2() {
        R2.c cVar = R2.c.f3673a;
        C1409c c1409c = this.f11658j;
        m.d(c1409c, "currentMove");
        x2.m mVarQ = this.f11662n.q(S2.a.c());
        final InterfaceC1016l interfaceC1016l = new InterfaceC1016l() { // from class: I0.C0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.history.a.h2((C1290n) obj);
            }
        };
        x2.m mVarK = mVarQ.k(new g() { // from class: I0.D0
            @Override // C2.g
            public final Object a(Object obj) {
                return cab.shashki.app.ui.history.a.i2(interfaceC1016l, obj);
            }
        });
        m.d(mVarK, "map(...)");
        x2.m mVarQ2 = cVar.a(c1409c, mVarK).q(S2.a.c());
        final InterfaceC1016l interfaceC1016l2 = new InterfaceC1016l() { // from class: I0.E0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return Boolean.valueOf(cab.shashki.app.ui.history.a.j2((T2.l) obj));
            }
        };
        x2.m mVarI = mVarQ2.i(new i() { // from class: I0.F0
            @Override // C2.i
            public final boolean a(Object obj) {
                return cab.shashki.app.ui.history.a.k2(interfaceC1016l2, obj);
            }
        });
        final InterfaceC1016l interfaceC1016l3 = new InterfaceC1016l() { // from class: I0.G0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.history.a.e2(this.f1531d, (T2.l) obj);
            }
        };
        C2.e eVar = new C2.e() { // from class: I0.H0
            @Override // C2.e
            public final void accept(Object obj) {
                cab.shashki.app.ui.history.a.f2(interfaceC1016l3, obj);
            }
        };
        final e eVar2 = e.f11681m;
        A2.c cVarN = mVarI.n(eVar, new C2.e() { // from class: I0.I0
            @Override // C2.e
            public final void accept(Object obj) {
                cab.shashki.app.ui.history.a.g2(eVar2, obj);
            }
        });
        m.d(cVarN, "subscribe(...)");
        R2.a.a(cVarN, t0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u e2(a aVar, T2.l lVar) {
        Integer num = (Integer) lVar.a();
        List list = (List) lVar.b();
        m.b(list);
        m.b(num);
        C1290n.c cVar = (C1290n.c) p.I(list, num.intValue());
        if (cVar != null) {
            aVar.f11660l.accept(new C0151a(num.intValue(), cVar.a(), cVar.b()));
        }
        aVar.C1(list, num.intValue(), aVar.f11649A + 1 == num.intValue());
        aVar.f11649A = num.intValue();
        aVar.f11654f.accept(Boolean.valueOf(num.intValue() != 0));
        aVar.f11653e.accept(Boolean.valueOf(p.i(list) > num.intValue()));
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f2(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g2(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List h2(C1290n c1290n) {
        m.e(c1290n, "it");
        return c1290n.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List i2(InterfaceC1016l interfaceC1016l, Object obj) {
        m.e(obj, "p0");
        return (List) interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u j1(a aVar, String str) {
        cab.shashki.app.ui.history.b bVar = (cab.shashki.app.ui.history.b) aVar.w0();
        if (bVar != null) {
            m.b(str);
            bVar.a(str);
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j2(T2.l lVar) {
        m.e(lVar, "it");
        if (((Number) lVar.c()).intValue() >= 0) {
            return ((Number) lVar.c()).intValue() < ((List) lVar.d()).size() || ((List) lVar.d()).isEmpty();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u k1(a aVar, Integer num) {
        cab.shashki.app.ui.history.b bVar = (cab.shashki.app.ui.history.b) aVar.w0();
        if (bVar != null) {
            m.b(num);
            bVar.Q(num.intValue());
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k2(InterfaceC1016l interfaceC1016l, Object obj) {
        m.e(obj, "p0");
        return ((Boolean) interfaceC1016l.o(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u l1(a aVar, Boolean bool) {
        cab.shashki.app.ui.history.b bVar = (cab.shashki.app.ui.history.b) aVar.w0();
        if (bVar != null) {
            m.b(bool);
            bVar.z1(bool.booleanValue());
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u m1(a aVar, Boolean bool) {
        cab.shashki.app.ui.history.b bVar = (cab.shashki.app.ui.history.b) aVar.w0();
        if (bVar != null) {
            m.b(bool);
            bVar.x1(bool.booleanValue());
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u n1(a aVar, Boolean bool) {
        cab.shashki.app.ui.history.b bVar = (cab.shashki.app.ui.history.b) aVar.w0();
        if (bVar != null) {
            m.b(bool);
            bVar.J1(bool.booleanValue());
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u o1(a aVar, Boolean bool) {
        cab.shashki.app.ui.history.b bVar = (cab.shashki.app.ui.history.b) aVar.w0();
        if (bVar != null) {
            m.b(bool);
            bVar.m0(bool.booleanValue());
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u p1(a aVar, Integer num) {
        cab.shashki.app.ui.history.b bVar = (cab.shashki.app.ui.history.b) aVar.w0();
        if (bVar != null) {
            m.b(num);
            bVar.R1(num.intValue());
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u q1(a aVar, Boolean bool) {
        cab.shashki.app.ui.history.b bVar = (cab.shashki.app.ui.history.b) aVar.w0();
        if (bVar != null) {
            m.b(bool);
            bVar.P1(bool.booleanValue());
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u r1(a aVar, C0843z.a aVar2) {
        cab.shashki.app.ui.history.b bVar = (cab.shashki.app.ui.history.b) aVar.w0();
        if (bVar != null) {
            m.b(aVar2);
            bVar.u1(aVar2);
        }
        aVar.f11664p.accept(Boolean.TRUE);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u s1(a aVar, C1290n c1290n) {
        cab.shashki.app.ui.history.b bVar = (cab.shashki.app.ui.history.b) aVar.w0();
        if (bVar != null) {
            bVar.g(c1290n.f().size() > 1);
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b.C0152b t1(b.C0152b c0152b, Boolean bool) {
        m.e(c0152b, "pos");
        m.e(bool, "<unused var>");
        return c0152b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b.C0152b u1(InterfaceC1020p interfaceC1020p, Object obj, Object obj2) {
        m.e(obj, "p0");
        m.e(obj2, "p1");
        return (b.C0152b) interfaceC1020p.k(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u v1(a aVar, b.C0152b c0152b) {
        cab.shashki.app.ui.history.b bVar = (cab.shashki.app.ui.history.b) aVar.w0();
        if (bVar != null) {
            m.b(c0152b);
            bVar.x0(c0152b);
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b.a w1(a aVar, C0151a c0151a, SparseArray sparseArray) {
        m.e(c0151a, "move");
        m.e(sparseArray, "sparse");
        int iB = C1048c.f16291m.b(c0151a.a(), c0151a.b());
        return new b.a(c0151a.c(), c0151a.b(), (String) aVar.f11668t.get(Integer.valueOf(iB)), (C1048c) sparseArray.get(iB));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u x1(a aVar, b.a aVar2) {
        cab.shashki.app.ui.history.b bVar = (cab.shashki.app.ui.history.b) aVar.w0();
        if (bVar != null) {
            m.b(aVar2);
            bVar.R(aVar2);
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final T2.l y1(C1290n c1290n, SparseArray sparseArray) {
        m.e(c1290n, "history");
        m.e(sparseArray, "analise");
        List listD = c1290n.d();
        ArrayList arrayList = new ArrayList(p.o(listD, 10));
        int i4 = 0;
        for (Object obj : listD) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                p.n();
            }
            C1290n.c cVar = (C1290n.c) obj;
            arrayList.add(new T2.l(cVar.b(), sparseArray.get(C1048c.f16291m.b(cVar.a(), i4))));
            i4 = i5;
        }
        return new T2.l(arrayList, Integer.valueOf(c1290n.h()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u z1(a aVar, T2.l lVar) {
        cab.shashki.app.db.entities.a aVar2;
        int i4;
        cab.shashki.app.ui.history.b bVar = (cab.shashki.app.ui.history.b) aVar.w0();
        if (bVar != null) {
            List list = (List) lVar.c();
            int iIntValue = ((Number) lVar.d()).intValue();
            cab.shashki.app.db.entities.a aVar3 = aVar.f11672x;
            if ((aVar3 == null || !aVar3.is3()) && ((aVar2 = aVar.f11672x) == null || !aVar2.is6())) {
                cab.shashki.app.db.entities.a aVar4 = aVar.f11672x;
                i4 = (aVar4 == null || !aVar4.is4()) ? 2 : 4;
            } else {
                i4 = 3;
            }
            bVar.d0(list, iIntValue, i4);
        }
        return u.f3817a;
    }

    public final String B1() {
        return this.f11651C;
    }

    @Override // cab.shashki.app.ui.custom.board.W
    public x J() {
        return this.f11674z;
    }

    public final void N1() {
        Integer num;
        List listG;
        Integer num2;
        if ((!this.f11657i.w() || ((num2 = (Integer) this.f11657i.v()) != null && num2.intValue() == -1)) && C1355o.f19488E.a(this.f11670v) && (num = (Integer) this.f11658j.v()) != null) {
            if (num.intValue() < 0) {
                num = null;
            }
            if (num != null) {
                int iIntValue = num.intValue();
                E1();
                C1355o c1355o = this.f11673y;
                if (c1355o != null) {
                    String str = this.f11669u;
                    C1290n c1290n = (C1290n) this.f11662n.v();
                    if (c1290n == null || (listG = c1290n.d()) == null) {
                        listG = p.g();
                    }
                    if (c1355o.x(str, listG, iIntValue)) {
                        this.f11657i.accept(num);
                    }
                }
            }
        }
    }

    public final void O1() {
        S1(((Number) this.f11658j.v()).intValue() + 1);
    }

    public final void P1() {
        S1(((Number) this.f11658j.v()).intValue() - 1);
    }

    public final void S1(int i4) {
        this.f11658j.accept(Integer.valueOf(i4));
    }

    public final void T1() {
        final C1290n c1290n;
        Integer num;
        C1409c c1409c = this.f11662n;
        if (c1409c == null || (c1290n = (C1290n) c1409c.v()) == null || (num = this.f11670v) == null) {
            return;
        }
        final int iW = cab.shashki.app.service.b.f10603a.w(Integer.valueOf(num.intValue()));
        AbstractC1488f abstractC1488fH = AbstractC1488f.q(new Callable() { // from class: I0.A0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cab.shashki.app.ui.history.a.V1(c1290n, iW, this);
            }
        }).H(S2.a.c());
        m.d(abstractC1488fH, "subscribeOn(...)");
        c0(abstractC1488fH, new InterfaceC1016l() { // from class: I0.B0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.history.a.W1(this.f1517d, iW, (List) obj);
            }
        });
    }

    public final void U1(int i4, int i5) {
        C1290n c1290n;
        C1409c c1409c = this.f11662n;
        if (c1409c == null || (c1290n = (C1290n) c1409c.v()) == null) {
            return;
        }
        c1290n.p(i5);
        c1290n.o(i4);
        this.f11658j.accept(Integer.valueOf(h.b(i5 - 1, 0)));
        this.f11662n.accept(c1290n);
    }

    public final void X1(int i4) {
        List listG;
        Integer num;
        if ((!this.f11657i.w() || ((num = (Integer) this.f11657i.v()) != null && num.intValue() == -1)) && C1355o.f19488E.a(this.f11670v)) {
            E1();
            C1355o c1355o = this.f11673y;
            if (c1355o != null) {
                int i5 = i4 + this.f11650B;
                String str = this.f11669u;
                C1290n c1290n = (C1290n) this.f11662n.v();
                if (c1290n == null || (listG = c1290n.d()) == null) {
                    listG = p.g();
                }
                c1355o.r(i5, str, listG);
            }
            this.f11657i.accept(Integer.MAX_VALUE);
        }
    }

    public final void Y1() {
        C1355o c1355o = this.f11673y;
        if (c1355o != null) {
            c1355o.F();
        }
        this.f11673y = null;
        this.f11659k.accept(-1);
        this.f11657i.accept(-1);
    }

    @Override // cab.shashki.app.ui.custom.board.W
    public void h(ShashkiBoardView shashkiBoardView, String str) {
        m.e(shashkiBoardView, "board");
        m.e(str, "pos");
    }

    public final int h1() {
        return this.f11650B;
    }

    public void i1(cab.shashki.app.ui.history.b bVar) {
        m.e(bVar, "view");
        super.q0(bVar);
        C1409c c1409c = this.f11661m;
        m.d(c1409c, "title");
        b0(c1409c, new InterfaceC1016l() { // from class: I0.h0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.history.a.j1(this.f1642d, (String) obj);
            }
        });
        C1409c c1409c2 = this.f11659k;
        m.d(c1409c2, "progress");
        b0(c1409c2, new InterfaceC1016l() { // from class: I0.q0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.history.a.k1(this.f1666d, (Integer) obj);
            }
        });
        C1409c c1409c3 = this.f11653e;
        m.d(c1409c3, "nextVisible");
        b0(c1409c3, new InterfaceC1016l() { // from class: I0.r0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.history.a.l1(this.f1669d, (Boolean) obj);
            }
        });
        C1409c c1409c4 = this.f11654f;
        m.d(c1409c4, "previousVisible");
        b0(c1409c4, new InterfaceC1016l() { // from class: I0.s0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.history.a.m1(this.f1672d, (Boolean) obj);
            }
        });
        C1409c c1409c5 = this.f11667s;
        m.d(c1409c5, "metaEnable");
        b0(c1409c5, new InterfaceC1016l() { // from class: I0.t0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.history.a.n1(this.f1677d, (Boolean) obj);
            }
        });
        C1409c c1409c6 = this.f11656h;
        m.d(c1409c6, "analyseSupport");
        b0(c1409c6, new InterfaceC1016l() { // from class: I0.u0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.history.a.o1(this.f1681d, (Boolean) obj);
            }
        });
        C1409c c1409c7 = this.f11657i;
        m.d(c1409c7, "analysingMove");
        b0(c1409c7, new InterfaceC1016l() { // from class: I0.w0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.history.a.p1(this.f1686d, (Integer) obj);
            }
        });
        C1409c c1409c8 = this.f11665q;
        m.d(c1409c8, "boardRotation");
        b0(c1409c8, new InterfaceC1016l() { // from class: I0.x0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.history.a.q1(this.f1688d, (Boolean) obj);
            }
        });
        C1409c c1409c9 = this.f11666r;
        m.d(c1409c9, "boardParams");
        b0(c1409c9, new InterfaceC1016l() { // from class: I0.y0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.history.a.r1(this.f1691d, (C0843z.a) obj);
            }
        });
        C1409c c1409c10 = this.f11662n;
        m.d(c1409c10, "history");
        b0(c1409c10, new InterfaceC1016l() { // from class: I0.z0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.history.a.s1(this.f1694d, (C1290n) obj);
            }
        });
        x2.m mVarQ = this.f11663o.q(S2.a.c());
        EnumC1483a enumC1483a = EnumC1483a.LATEST;
        AbstractC1488f abstractC1488fR = mVarQ.r(enumC1483a);
        AbstractC1488f abstractC1488fR2 = this.f11664p.q(S2.a.c()).r(enumC1483a);
        final InterfaceC1020p interfaceC1020p = new InterfaceC1020p() { // from class: I0.i0
            @Override // g3.InterfaceC1020p
            public final Object k(Object obj, Object obj2) {
                return cab.shashki.app.ui.history.a.t1((b.C0152b) obj, (Boolean) obj2);
            }
        };
        AbstractC1488f abstractC1488fH = AbstractC1488f.d(abstractC1488fR, abstractC1488fR2, new C2.c() { // from class: I0.j0
            @Override // C2.c
            public final Object a(Object obj, Object obj2) {
                return cab.shashki.app.ui.history.a.u1(interfaceC1020p, obj, obj2);
            }
        }).H(S2.a.c());
        m.d(abstractC1488fH, "subscribeOn(...)");
        c0(abstractC1488fH, new InterfaceC1016l() { // from class: I0.l0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.history.a.v1(this.f1652d, (b.C0152b) obj);
            }
        });
        AbstractC1488f abstractC1488fH2 = AbstractC1488f.d(this.f11660l.q(S2.a.c()).r(enumC1483a), this.f11655g.q(S2.a.c()).r(enumC1483a), new C2.c() { // from class: I0.m0
            @Override // C2.c
            public final Object a(Object obj, Object obj2) {
                return cab.shashki.app.ui.history.a.w1(this.f1655a, (a.C0151a) obj, (SparseArray) obj2);
            }
        }).H(S2.a.c());
        m.d(abstractC1488fH2, "subscribeOn(...)");
        c0(abstractC1488fH2, new InterfaceC1016l() { // from class: I0.n0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.history.a.x1(this.f1658d, (b.a) obj);
            }
        });
        AbstractC1488f abstractC1488fH3 = AbstractC1488f.d(this.f11662n.q(S2.a.c()).r(enumC1483a), this.f11655g.q(S2.a.c()).r(enumC1483a), new C2.c() { // from class: I0.o0
            @Override // C2.c
            public final Object a(Object obj, Object obj2) {
                return cab.shashki.app.ui.history.a.y1((C1290n) obj, (SparseArray) obj2);
            }
        }).H(S2.a.c());
        m.d(abstractC1488fH3, "subscribeOn(...)");
        c0(abstractC1488fH3, new InterfaceC1016l() { // from class: I0.p0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.history.a.z1(this.f1663d, (T2.l) obj);
            }
        });
    }

    @Override // cab.shashki.app.ui.custom.board.W
    public boolean j(ShashkiBoardView shashkiBoardView, String str, String str2) {
        m.e(shashkiBoardView, "board");
        m.e(str, "from");
        m.e(str2, "to");
        return true;
    }

    @Override // f0.AbstractC0909m
    public void s0() {
        super.s0();
        InterfaceC0870c interfaceC0870c = this.f11671w;
        InterfaceC0869b interfaceC0869b = interfaceC0870c instanceof InterfaceC0869b ? (InterfaceC0869b) interfaceC0870c : null;
        if (interfaceC0869b != null) {
            interfaceC0869b.quit();
        }
        C1355o c1355o = this.f11673y;
        if (c1355o != null) {
            c1355o.F();
        }
        this.f11673y = null;
    }

    @Override // cab.shashki.app.ui.custom.board.W
    public void w(ShashkiBoardView shashkiBoardView, C0843z.i iVar) {
        m.e(shashkiBoardView, "board");
        m.e(iVar, "piece");
    }
}