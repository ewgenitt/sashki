package cab.shashki.app.ui.chess;

import C2.g;
import R0.p;
import T2.u;
import cab.shashki.app.db.entities.HalmaParams;
import cab.shashki.app.service.b;
import cab.shashki.app.ui.chess.c;
import f0.AbstractC0909m;
import g3.InterfaceC1016l;
import h3.m;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p3.h;
import p3.j;
import q0.H;
import q0.InterfaceC1298w;
import q0.V;
import q0.X;
import u2.C1409c;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class b extends AbstractC0909m {

    /* renamed from: d */
    private final String f10919d;

    /* renamed from: e */
    private final j f10920e;

    /* renamed from: f */
    private final j f10921f;

    /* renamed from: g */
    private final j f10922g;

    /* renamed from: h */
    private final j f10923h;

    /* renamed from: i */
    private final H f10924i;

    /* renamed from: j */
    private final C1409c f10925j;

    /* renamed from: k */
    private final Map f10926k;

    /* renamed from: l */
    private final Map f10927l;

    /* renamed from: m */
    private final Map f10928m;

    /* renamed from: n */
    private boolean f10929n;

    /* renamed from: o */
    private int f10930o;

    /* renamed from: p */
    private String f10931p;

    private static final class a implements c.b {

        /* renamed from: f */
        private boolean f10934f;

        /* renamed from: h */
        private int f10936h;

        /* renamed from: i */
        private int f10937i;

        /* renamed from: d */
        private String f10932d = "";

        /* renamed from: e */
        private String f10933e = "";

        /* renamed from: g */
        private String f10935g = "";

        /* renamed from: j */
        private c.a f10938j = c.a.f10939e;

        public final c.a a() {
            return this.f10938j;
        }

        public void b(String str) {
            m.e(str, "<set-?>");
            this.f10935g = str;
        }

        public final void c(int i4) {
            this.f10937i = i4;
        }

        public final void d(int i4) {
            this.f10936h = i4;
        }

        public void e(String str) {
            m.e(str, "<set-?>");
            this.f10932d = str;
        }

        @Override // cab.shashki.app.ui.chess.c.b
        public String f() {
            return this.f10935g;
        }

        public void g(boolean z4) {
            this.f10934f = z4;
        }

        @Override // cab.shashki.app.ui.chess.c.b
        public String getName() {
            return this.f10932d;
        }

        @Override // cab.shashki.app.ui.chess.c.b
        public String getValue() {
            return this.f10933e;
        }

        @Override // cab.shashki.app.ui.chess.c.b
        public int h() {
            return this.f10937i;
        }

        @Override // cab.shashki.app.ui.chess.c.b
        public int i() {
            return this.f10936h;
        }

        public final void j(c.a aVar) {
            m.e(aVar, "<set-?>");
            this.f10938j = aVar;
        }

        public void k(String str) {
            m.e(str, "<set-?>");
            this.f10933e = str;
        }

        @Override // cab.shashki.app.ui.chess.c.b
        public c.a n() {
            return this.f10938j;
        }

        @Override // cab.shashki.app.ui.chess.c.b
        public boolean r() {
            return this.f10934f;
        }
    }

    /* renamed from: cab.shashki.app.ui.chess.b$b */
    public static final class C0146b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return W2.a.d(Boolean.valueOf(((a) obj2).r()), Boolean.valueOf(((a) obj).r()));
        }
    }

    public b(String str) {
        m.e(str, "type");
        this.f10919d = str;
        this.f10920e = new j("default (\\S+).*");
        this.f10921f = new j("current (\\S+).*");
        this.f10922g = new j(" type (\\S+)");
        this.f10923h = new j(" min\\s+(-?\\d+)\\s+max\\s+(-?\\d+)");
        this.f10924i = new H(new InterfaceC1016l() { // from class: x0.M
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.chess.b.I0(this.f20294d, (q0.H) obj);
            }
        }, new InterfaceC1016l() { // from class: x0.N
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.chess.b.J0(this.f20295d, (q0.H) obj);
            }
        });
        this.f10925j = C1409c.u(Boolean.TRUE);
        this.f10926k = new LinkedHashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f10927l = linkedHashMap;
        this.f10928m = new LinkedHashMap();
        this.f10930o = -1;
        linkedHashMap.putAll(X.f19008a.d(str));
    }

    private final boolean C0() {
        if (m.a(this.f10919d, this.f10931p)) {
            return true;
        }
        if (m.a(this.f10919d, p.c.f3630e.b()) && this.f10930o == b.a.f10706X.c()) {
            return true;
        }
        if (m.a(this.f10919d, "uci")) {
            return this.f10930o == b.a.f10757j.c() || this.f10930o == b.a.f10611B.c();
        }
        return false;
    }

    public static final List F0(b bVar, Boolean bool) {
        m.e(bool, "it");
        return bVar.M0();
    }

    public static final List G0(InterfaceC1016l interfaceC1016l, Object obj) {
        m.e(obj, "p0");
        return (List) interfaceC1016l.o(obj);
    }

    public static final u H0(b bVar, List list) {
        c cVar = (c) bVar.w0();
        if (cVar != null) {
            m.b(list);
            cVar.E1(list);
        }
        return u.f3817a;
    }

    public static final u I0(b bVar, H h4) {
        m.e(h4, "it");
        bVar.N0();
        return u.f3817a;
    }

    public static final u J0(b bVar, H h4) {
        m.e(h4, "it");
        if (bVar.w0() != null) {
            h4.g();
        }
        return u.f3817a;
    }

    private final boolean L0() {
        return m.a(this.f10919d, "uci") && this.f10930o == b.a.f10757j.c();
    }

    private final List M0() {
        List listX;
        String str;
        List listA;
        c.a aVar;
        h hVarC;
        List listA2;
        List listA3;
        String str2;
        List listA4;
        synchronized (this.f10928m) {
            try {
                this.f10928m.clear();
                for (Map.Entry entry : this.f10926k.entrySet()) {
                    a aVar2 = new a();
                    aVar2.e((String) entry.getKey());
                    aVar2.b((String) entry.getValue());
                    h hVarC2 = j.c(this.f10921f, (CharSequence) entry.getValue(), 0, 2, null);
                    if (hVarC2 == null || (listA4 = hVarC2.a()) == null || (str = (String) listA4.get(1)) == null) {
                        h hVarC3 = j.c(this.f10920e, (CharSequence) entry.getValue(), 0, 2, null);
                        str = (hVarC3 == null || (listA = hVarC3.a()) == null) ? "" : (String) listA.get(1);
                    }
                    aVar2.k(str);
                    h hVarC4 = j.c(this.f10922g, (CharSequence) entry.getValue(), 0, 2, null);
                    if (hVarC4 == null || (listA3 = hVarC4.a()) == null || (str2 = (String) listA3.get(1)) == null) {
                        aVar = null;
                    } else {
                        c.a[] aVarArrValues = c.a.values();
                        int length = aVarArrValues.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                aVar = null;
                                break;
                            }
                            aVar = aVarArrValues[i4];
                            if (m.a(aVar.b(), str2)) {
                                break;
                            }
                            i4++;
                        }
                        if (aVar == null) {
                            aVar = c.a.f10944j;
                            aVar.c(str2);
                        }
                    }
                    if (aVar != null) {
                        aVar2.j(aVar);
                        if (aVar == c.a.f10942h && (hVarC = j.c(this.f10923h, (CharSequence) entry.getValue(), 0, 2, null)) != null && (listA2 = hVarC.a()) != null) {
                            aVar2.d(Integer.parseInt((String) listA2.get(1)));
                            aVar2.c(Integer.parseInt((String) listA2.get(2)));
                        }
                    }
                    this.f10928m.put(entry.getKey(), aVar2);
                }
                for (Map.Entry entry2 : this.f10927l.entrySet()) {
                    a aVar3 = (a) this.f10928m.get(entry2.getKey());
                    if (aVar3 != null) {
                        aVar3.k((String) entry2.getValue());
                        aVar3.g(true);
                    } else {
                        Map map = this.f10928m;
                        Object key = entry2.getKey();
                        a aVar4 = new a();
                        aVar4.e((String) entry2.getKey());
                        aVar4.k((String) entry2.getValue());
                        aVar4.g(true);
                        map.put(key, aVar4);
                    }
                }
                listX = U2.p.X(this.f10928m.values(), new C0146b());
            } catch (Throwable th) {
                throw th;
            }
        }
        return listX;
    }

    private final void N0() {
        InterfaceC1298w interfaceC1298wJ = this.f10924i.j();
        this.f10930o = interfaceC1298wJ != null ? interfaceC1298wJ.a() : -1;
        InterfaceC1298w interfaceC1298wJ2 = this.f10924i.j();
        Object objF = interfaceC1298wJ2 != null ? interfaceC1298wJ2.f("fairy_variant", new Object[0]) : null;
        this.f10931p = objF instanceof String ? (String) objF : null;
        if (C0()) {
            InterfaceC1298w interfaceC1298wJ3 = this.f10924i.j();
            Object objF2 = interfaceC1298wJ3 != null ? interfaceC1298wJ3.f("uci", new Object[0]) : null;
            Map map = objF2 instanceof Map ? (Map) objF2 : null;
            if (map == null) {
                return;
            }
            this.f10926k.clear();
            this.f10926k.putAll(map);
            this.f10925j.accept(Boolean.TRUE);
        }
    }

    public final void D0() {
        c cVar = (c) w0();
        if (cVar != null) {
            cVar.K0(new a());
        }
    }

    public void E0(c cVar) {
        m.e(cVar, "view");
        super.q0(cVar);
        this.f10924i.g();
        x2.m mVarQ = this.f10925j.q(S2.a.c());
        final InterfaceC1016l interfaceC1016l = new InterfaceC1016l() { // from class: x0.O
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.chess.b.F0(this.f20296d, (Boolean) obj);
            }
        };
        x2.m mVarK = mVarQ.k(new g() { // from class: x0.P
            @Override // C2.g
            public final Object a(Object obj) {
                return cab.shashki.app.ui.chess.b.G0(interfaceC1016l, obj);
            }
        });
        m.d(mVarK, "map(...)");
        d0(mVarK, new InterfaceC1016l() { // from class: x0.Q
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.chess.b.H0(this.f20298d, (List) obj);
            }
        });
    }

    public final void K0(c.b bVar) {
        m.e(bVar, "option");
        this.f10927l.remove(bVar.getName());
        X.f19008a.c(bVar.getName(), this.f10919d);
        this.f10925j.accept(Boolean.TRUE);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void O0(c.b bVar) {
        m.e(bVar, "option");
        this.f10929n = false;
        String name = bVar.getName();
        switch (name.hashCode()) {
            case -1534006367:
                if (name.equals("UCI_Variant")) {
                    return;
                }
                break;
            case 2241838:
                if (name.equals("Hash")) {
                    return;
                }
                break;
            case 225038424:
                if (name.equals("EvalFile")) {
                    c cVar = (c) w0();
                    if (cVar != null) {
                        V.b bVar2 = V.b.f19003e;
                        if (!L0()) {
                            bVar2 = null;
                        }
                        cVar.k1(bVar2);
                        return;
                    }
                    return;
                }
                break;
            case 1999063951:
                if (name.equals("EvalFileSmall")) {
                    this.f10929n = true;
                    c cVar2 = (c) w0();
                    if (cVar2 != null) {
                        cVar2.k1(V.b.f19004f);
                        return;
                    }
                    return;
                }
                break;
        }
        c cVar3 = (c) w0();
        if (cVar3 != null) {
            cVar3.K0(bVar);
        }
    }

    public final void P0(String str, String str2) {
        InterfaceC1298w interfaceC1298wJ;
        m.e(str, HalmaParams.NAME);
        m.e(str2, "value");
        a aVar = (a) this.f10928m.get(str);
        if ((aVar != null ? aVar.a() : null) != c.a.f10943i) {
            this.f10927l.put(str, str2);
            X.f19008a.a(str, str2, this.f10919d);
        }
        if (C0() && (interfaceC1298wJ = this.f10924i.j()) != null) {
            interfaceC1298wJ.f("uci_set", str, str2);
        }
        this.f10925j.accept(Boolean.TRUE);
    }

    public final void Q0(String str) {
        m.e(str, "path");
        P0(this.f10929n ? "EvalFileSmall" : "EvalFile", str);
    }

    public void R0(c cVar) {
        m.e(cVar, "view");
        super.v0(cVar);
        this.f10924i.k();
    }
}