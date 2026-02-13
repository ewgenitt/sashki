package cab.shashki.app.ui.chess.fairy.builder.quick;

import U2.p;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import g0.C0982m0;
import g3.InterfaceC1020p;
import h3.m;
import java.util.List;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class e extends RecyclerView.h {

    /* renamed from: d, reason: collision with root package name */
    private List f11094d;

    /* renamed from: e, reason: collision with root package name */
    private int f11095e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC1020p f11096f;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Character f11097a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f11098b;

        public a(Character ch, Integer num) {
            this.f11097a = ch;
            this.f11098b = num;
        }

        public final Character a() {
            return this.f11097a;
        }

        public final Integer b() {
            return this.f11098b;
        }
    }

    public static final class b extends RecyclerView.D {

        /* renamed from: u, reason: collision with root package name */
        private final C0982m0 f11099u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C0982m0 c0982m0) {
            super(c0982m0.a());
            m.e(c0982m0, "binding");
            this.f11099u = c0982m0;
        }

        public final C0982m0 O() {
            return this.f11099u;
        }
    }

    public /* synthetic */ e(List list, int i4, InterfaceC1020p interfaceC1020p, int i5, h3.h hVar) {
        this(list, (i5 & 2) != 0 ? -1 : i4, (i5 & 4) != 0 ? null : interfaceC1020p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(e eVar, a aVar, int i4, View view) {
        InterfaceC1020p interfaceC1020p = eVar.f11096f;
        if (interfaceC1020p != null) {
            interfaceC1020p.k(aVar, Integer.valueOf(i4));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void u(b bVar, final int i4) {
        m.e(bVar, "holder");
        final a aVar = (a) p.I(this.f11094d, i4);
        if (aVar == null) {
            return;
        }
        Character chA = aVar.a();
        if (chA == null) {
            bVar.O().f15780d.setVisibility(8);
        } else {
            bVar.O().f15780d.setVisibility(0);
            bVar.O().f15780d.setText(chA.toString());
        }
        Integer numB = aVar.b();
        if (numB == null) {
            bVar.O().f15778b.setVisibility(8);
        } else {
            bVar.O().f15778b.setVisibility(0);
            bVar.O().f15778b.setImageResource(numB.intValue());
        }
        bVar.O().f15779c.setVisibility(i4 != this.f11095e ? 8 : 0);
        bVar.f9119a.setOnClickListener(new View.OnClickListener() { // from class: z0.J
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cab.shashki.app.ui.chess.fairy.builder.quick.e.H(this.f20741b, aVar, i4, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public b w(ViewGroup viewGroup, int i4) {
        m.e(viewGroup, "parent");
        C0982m0 c0982m0D = C0982m0.d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        m.d(c0982m0D, "inflate(...)");
        return new b(c0982m0D);
    }

    public final void J(InterfaceC1020p interfaceC1020p) {
        this.f11096f = interfaceC1020p;
    }

    public final void K(List list) {
        m.e(list, "<set-?>");
        this.f11094d = list;
    }

    public final void L(int i4) {
        this.f11095e = i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int h() {
        return this.f11094d.size();
    }

    public e(List list, int i4, InterfaceC1020p interfaceC1020p) {
        m.e(list, "items");
        this.f11094d = list;
        this.f11095e = i4;
        this.f11096f = interfaceC1020p;
    }
}