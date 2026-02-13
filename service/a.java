package cab.shashki.app.service;

import U2.AbstractC0590i;
import cab.shashki.app.db.entities.CheckersParams;
import cab.shashki.app.db.entities.HalmaParams;
import cab.shashki.app.service.FairyRepository;
import cab.shashki.app.service.b;
import f0.AbstractC0888D;
import h3.m;
import q0.C1297v;
import q0.H;
import q0.InterfaceC1298w;
import q0.e0;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class a {

    /* renamed from: a */
    public static final a f10602a = new a();

    private a() {
    }

    public final cab.shashki.app.db.entities.a a(int i4, String str) {
        if (str == null) {
            return null;
        }
        cab.shashki.app.db.entities.a aVarI = i(Integer.valueOf(i4), str);
        l(aVarI);
        return aVarI;
    }

    public final cab.shashki.app.db.entities.a b(H h4) {
        m.e(h4, "connection");
        InterfaceC1298w interfaceC1298wJ = h4.j();
        if (interfaceC1298wJ != null) {
            return c(interfaceC1298wJ.a());
        }
        return null;
    }

    public final cab.shashki.app.db.entities.a c(int i4) {
        if (e(Integer.valueOf(i4))) {
            return e0.f19058a.g();
        }
        if (f(Integer.valueOf(i4))) {
            return FairyRepository.f10588a.l();
        }
        if (g(Integer.valueOf(i4))) {
            return C1297v.f19095a.g();
        }
        return null;
    }

    public final boolean d(String str) {
        m.e(str, HalmaParams.ID);
        return m.a(str, b.a.f10808t0.b()) || m.a(str, b.a.f10607A0.b()) || m.a(str, b.a.f10828x0.b());
    }

    public final boolean e(Integer num) {
        return AbstractC0590i.q(new Integer[]{Integer.valueOf(b.a.f10828x0.c()), Integer.valueOf(b.a.h4.c()), Integer.valueOf(b.a.i4.c()), Integer.valueOf(b.a.j4.c())}, num);
    }

    public final boolean f(Integer num) {
        return AbstractC0590i.q(new Integer[]{Integer.valueOf(b.a.f10808t0.c()), Integer.valueOf(b.a.n4.c()), Integer.valueOf(b.a.o4.c()), Integer.valueOf(b.a.p4.c())}, num);
    }

    public final boolean g(Integer num) {
        return AbstractC0590i.q(new Integer[]{Integer.valueOf(b.a.f10607A0.c()), Integer.valueOf(b.a.q4.c()), Integer.valueOf(b.a.r4.c()), Integer.valueOf(b.a.s4.c())}, num);
    }

    public final boolean h(Integer num) {
        return e(num) || f(num) || g(num);
    }

    public final cab.shashki.app.db.entities.a i(Integer num, String str) {
        m.e(str, HalmaParams.ID);
        if (e(num)) {
            return e0.f19058a.h(str);
        }
        if (f(num)) {
            return FairyRepository.f10588a.q(str);
        }
        if (g(num)) {
            return C1297v.f19095a.i(str);
        }
        return null;
    }

    public final int j(H h4) {
        HalmaParams halmaParamsG;
        CheckersParams checkersParamsG;
        m.e(h4, "connection");
        InterfaceC1298w interfaceC1298wJ = h4.j();
        if (interfaceC1298wJ != null && interfaceC1298wJ.j() == AbstractC0888D.x5 && (checkersParamsG = e0.f19058a.g()) != null && checkersParamsG.getFourPlayers()) {
            return 4;
        }
        InterfaceC1298w interfaceC1298wJ2 = h4.j();
        if (interfaceC1298wJ2 == null || interfaceC1298wJ2.j() != AbstractC0888D.A5 || (halmaParamsG = C1297v.f19095a.g()) == null) {
            return 2;
        }
        if (halmaParamsG.isStern()) {
            return 6;
        }
        return halmaParamsG.getFourPlayers() ? 4 : 2;
    }

    public final cab.shashki.app.db.entities.a k(cab.shashki.app.db.entities.a aVar, boolean z4) {
        return aVar instanceof CheckersParams ? e0.f19058a.j((CheckersParams) aVar, z4) : aVar instanceof HalmaParams ? C1297v.f19095a.k((HalmaParams) aVar, z4) : aVar;
    }

    public final void l(cab.shashki.app.db.entities.a aVar) {
        e0.f19058a.n(aVar instanceof CheckersParams ? (CheckersParams) aVar : null);
        FairyRepository.f10588a.A(aVar instanceof FairyRepository.a ? (FairyRepository.a) aVar : null);
        C1297v.f19095a.n(aVar instanceof HalmaParams ? (HalmaParams) aVar : null);
    }

    public final void m(cab.shashki.app.db.entities.a aVar) {
        e0.f19058a.o(aVar instanceof CheckersParams ? (CheckersParams) aVar : null);
        FairyRepository.f10588a.B(aVar instanceof FairyRepository.a ? (FairyRepository.a) aVar : null);
        C1297v.f19095a.o(aVar instanceof HalmaParams ? (HalmaParams) aVar : null);
    }
}