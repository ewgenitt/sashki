package cab.shashki.app.ui.checkers.draw_table;

import A2.c;
import C2.e;
import T2.u;
import U2.p;
import cab.shashki.app.service.b;
import cab.shashki.app.ui.checkers.draw_table.a;
import cab.shashki.cpp.CppGame;
import e0.InterfaceC0870c;
import e3.AbstractC0877c;
import e3.o;
import f0.AbstractC0888D;
import f0.AbstractC0909m;
import g3.InterfaceC1016l;
import h3.l;
import h3.m;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p3.d;
import q0.C1277a;
import s0.C1371a;
import u2.C1409c;
import x2.AbstractC1488f;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class b extends AbstractC0909m {

    /* renamed from: d, reason: collision with root package name */
    private final String f10896d;

    /* renamed from: e, reason: collision with root package name */
    private final C1409c f10897e;

    /* renamed from: f, reason: collision with root package name */
    private final C1409c f10898f;

    /* renamed from: g, reason: collision with root package name */
    private final int f10899g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC0870c f10900h;

    /* synthetic */ class a extends l implements InterfaceC1016l {
        a(Object obj) {
            super(1, obj, C1409c.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        public final void m(List list) {
            ((C1409c) this.f16244e).accept(list);
        }

        @Override // g3.InterfaceC1016l
        public /* bridge */ /* synthetic */ Object o(Object obj) {
            m((List) obj);
            return u.f3817a;
        }
    }

    public b(String str, String str2) {
        this.f10896d = str2;
        C1409c c1409cT = C1409c.t();
        this.f10897e = c1409cT;
        C1409c c1409cT2 = C1409c.t();
        this.f10898f = c1409cT2;
        int i4 = m.a(str, C1277a.EnumC0198a.f19016g.b()) ? AbstractC0888D.k5 : m.a(str, C1277a.EnumC0198a.f19017h.b()) ? AbstractC0888D.O5 : m.a(str, C1277a.EnumC0198a.f19018i.b()) ? AbstractC0888D.C5 : m.a(str, C1277a.EnumC0198a.f19020k.b()) ? AbstractC0888D.b6 : m.a(str, C1277a.EnumC0198a.f19021l.b()) ? AbstractC0888D.B5 : m.a(str, C1277a.EnumC0198a.f19022m.b()) ? AbstractC0888D.u6 : m.a(str, C1277a.EnumC0198a.f19019j.b()) ? AbstractC0888D.f6 : AbstractC0888D.k6;
        this.f10899g = i4;
        if (str == null || str2 == null || !new File(str2).exists()) {
            c1409cT.accept(Boolean.TRUE);
            return;
        }
        this.f10900h = i4 == AbstractC0888D.k5 ? new CppGame(b.a.f10767l.c(), 1, 1, null) : i4 == AbstractC0888D.f6 ? new CppGame(b.a.f10772m.c(), 1, 1, null) : cab.shashki.app.service.b.r(cab.shashki.app.service.b.f10603a, i4, null, 0, 6, null);
        AbstractC1488f abstractC1488fH = AbstractC1488f.q(new Callable() { // from class: w0.x
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cab.shashki.app.ui.checkers.draw_table.b.D0(this.f20099d);
            }
        }).H(S2.a.c());
        final a aVar = new a(c1409cT2);
        e eVar = new e() { // from class: w0.y
            @Override // C2.e
            public final void accept(Object obj) {
                cab.shashki.app.ui.checkers.draw_table.b.E0(aVar, obj);
            }
        };
        final InterfaceC1016l interfaceC1016l = new InterfaceC1016l() { // from class: w0.z
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.checkers.draw_table.b.F0(this.f20101d, (Throwable) obj);
            }
        };
        c cVarD = abstractC1488fH.D(eVar, new e() { // from class: w0.A
            @Override // C2.e
            public final void accept(Object obj) {
                cab.shashki.app.ui.checkers.draw_table.b.G0(interfaceC1016l, obj);
            }
        });
        m.d(cVarD, "subscribe(...)");
        R2.a.a(cVarD, t0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List D0(b bVar) {
        return bVar.M0(bVar.f10896d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E0(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u F0(b bVar, Throwable th) {
        th.printStackTrace();
        bVar.f10897e.accept(Boolean.TRUE);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G0(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u I0(b bVar, Boolean bool) {
        cab.shashki.app.ui.checkers.draw_table.a aVar = (cab.shashki.app.ui.checkers.draw_table.a) bVar.w0();
        if (aVar != null) {
            aVar.finish();
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u J0(b bVar, List list) {
        cab.shashki.app.ui.checkers.draw_table.a aVar = (cab.shashki.app.ui.checkers.draw_table.a) bVar.w0();
        if (aVar != null) {
            m.b(list);
            aVar.J(list);
        }
        return u.f3817a;
    }

    private final List M0(String str) {
        FileInputStream fileInputStream = new FileInputStream(new File(str));
        try {
            List<String> listE = o.e(new InputStreamReader(fileInputStream, d.f18870b));
            AbstractC0877c.a(fileInputStream, null);
            ArrayList arrayList = new ArrayList(p.o(listE, 10));
            for (String str2 : listE) {
                C1371a c1371a = C1371a.f19693a;
                InterfaceC0870c interfaceC0870c = this.f10900h;
                if (interfaceC0870c == null) {
                    m.r("checker");
                    interfaceC0870c = null;
                }
                arrayList.add(new a.C0144a(str2, c1371a.b(str2, interfaceC0870c, this.f10899g)));
            }
            return arrayList;
        } finally {
        }
    }

    public void H0(cab.shashki.app.ui.checkers.draw_table.a aVar) {
        m.e(aVar, "view");
        super.q0(aVar);
        C1409c c1409c = this.f10897e;
        m.d(c1409c, "finish");
        d0(c1409c, new InterfaceC1016l() { // from class: w0.v
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.checkers.draw_table.b.I0(this.f20097d, (Boolean) obj);
            }
        });
        C1409c c1409c2 = this.f10898f;
        m.d(c1409c2, "table");
        d0(c1409c2, new InterfaceC1016l() { // from class: w0.w
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.checkers.draw_table.b.J0(this.f20098d, (List) obj);
            }
        });
    }

    public final String K0() {
        return this.f10896d;
    }

    public final int L0() {
        return this.f10899g;
    }
}