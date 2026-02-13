package cab.shashki.app.ui.chess.fairy.builder.quick;

import U2.p;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import f0.AbstractC0918v;
import g0.C0934C;
import g3.InterfaceC1020p;
import h3.m;
import java.util.List;
import z0.w1;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class i extends RecyclerView.h {

    /* renamed from: d, reason: collision with root package name */
    private List f11142d;

    /* renamed from: e, reason: collision with root package name */
    private int f11143e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f11144f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC1020p f11145g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private char f11146a;

        /* renamed from: b, reason: collision with root package name */
        private int f11147b;

        /* renamed from: c, reason: collision with root package name */
        private int f11148c;

        public a(char c4, int i4, int i5) {
            this.f11146a = c4;
            this.f11147b = i4;
            this.f11148c = i5;
        }

        public final int a() {
            return this.f11147b;
        }

        public final char b() {
            return this.f11146a;
        }

        public final int c() {
            return this.f11148c;
        }

        public final void d(int i4) {
            this.f11147b = i4;
        }

        public final void e(char c4) {
            this.f11146a = c4;
        }

        public final void f(int i4) {
            this.f11148c = i4;
        }

        public /* synthetic */ a(char c4, int i4, int i5, int i6, h3.h hVar) {
            this((i6 & 1) != 0 ? (char) 0 : c4, (i6 & 2) != 0 ? -2 : i4, (i6 & 4) != 0 ? -2 : i5);
        }
    }

    public static final class b extends RecyclerView.D {

        /* renamed from: u, reason: collision with root package name */
        private final C0934C f11149u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C0934C c0934c) {
            super(c0934c.a());
            m.e(c0934c, "binding");
            this.f11149u = c0934c;
        }

        public final C0934C O() {
            return this.f11149u;
        }
    }

    public /* synthetic */ i(List list, int i4, boolean z4, InterfaceC1020p interfaceC1020p, int i5, h3.h hVar) {
        this(list, (i5 & 2) != 0 ? -1 : i4, (i5 & 4) != 0 ? true : z4, (i5 & 8) != 0 ? null : interfaceC1020p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(i iVar, a aVar, int i4, View view) {
        InterfaceC1020p interfaceC1020p = iVar.f11145g;
        if (interfaceC1020p != null) {
            interfaceC1020p.k(aVar, Integer.valueOf(i4));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void u(b bVar, final int i4) {
        m.e(bVar, "holder");
        final a aVar = (a) p.I(this.f11142d, i4);
        if (aVar == null) {
            return;
        }
        if (Character.isLetter(aVar.b())) {
            bVar.O().f15303d.setVisibility(0);
            bVar.O().f15303d.setText(String.valueOf(aVar.b()));
        } else {
            bVar.O().f15303d.setVisibility(this.f11144f ? 8 : 4);
        }
        bVar.O().f15303d.setBackgroundResource(i4 == this.f11143e ? AbstractC0918v.S7 : 0);
        if (aVar.a() >= 0) {
            bVar.O().f15301b.setVisibility(0);
            bVar.O().f15301b.setImageResource(w1.f20876a.b(aVar.a()));
        } else {
            bVar.O().f15301b.setVisibility(this.f11144f ? 8 : 4);
        }
        if (aVar.c() >= 0) {
            bVar.O().f15302c.setVisibility(0);
            bVar.O().f15302c.setImageResource(w1.f20876a.b(aVar.c()));
        } else {
            bVar.O().f15302c.setVisibility(this.f11144f ? 8 : 4);
        }
        bVar.f9119a.setOnClickListener(new View.OnClickListener() { // from class: z0.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cab.shashki.app.ui.chess.fairy.builder.quick.i.H(this.f20840b, aVar, i4, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public b w(ViewGroup viewGroup, int i4) {
        m.e(viewGroup, "parent");
        C0934C c0934cD = C0934C.d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        m.d(c0934cD, "inflate(...)");
        return new b(c0934cD);
    }

    public final void J(InterfaceC1020p interfaceC1020p) {
        this.f11145g = interfaceC1020p;
    }

    public final void K(boolean z4) {
        this.f11144f = z4;
    }

    public final void L(List list) {
        m.e(list, "<set-?>");
        this.f11142d = list;
    }

    public final void M(int i4) {
        this.f11143e = i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int h() {
        return this.f11142d.size();
    }

    public i(List list, int i4, boolean z4, InterfaceC1020p interfaceC1020p) {
        m.e(list, "items");
        this.f11142d = list;
        this.f11143e = i4;
        this.f11144f = z4;
        this.f11145g = interfaceC1020p;
    }
}