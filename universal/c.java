package cab.shashki.app.ui.universal;

import U2.p;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cab.shashki.app.ui.universal.e;
import f0.AbstractC0920x;
import f0.AbstractC0922z;
import g3.InterfaceC1016l;
import g3.InterfaceC1021q;
import h3.m;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class c extends RecyclerView.h {

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1016l f11877d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC1021q f11878e;

    /* renamed from: f, reason: collision with root package name */
    private cab.shashki.app.db.entities.a f11879f;

    /* renamed from: g, reason: collision with root package name */
    private final List f11880g;

    /* renamed from: h, reason: collision with root package name */
    private final SimpleDateFormat f11881h;

    public static final class a extends RecyclerView.D {

        /* renamed from: u, reason: collision with root package name */
        private final TextView f11882u;

        /* renamed from: v, reason: collision with root package name */
        private final TextView f11883v;

        /* renamed from: w, reason: collision with root package name */
        private final ImageView f11884w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            m.e(view, "view");
            View viewFindViewById = view.findViewById(AbstractC0920x.f15029h1);
            m.b(viewFindViewById);
            this.f11882u = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(AbstractC0920x.i4);
            m.b(viewFindViewById2);
            this.f11883v = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(AbstractC0920x.p4);
            m.b(viewFindViewById3);
            this.f11884w = (ImageView) viewFindViewById3;
        }

        public final TextView O() {
            return this.f11882u;
        }

        public final TextView P() {
            return this.f11883v;
        }

        public final ImageView Q() {
            return this.f11884w;
        }
    }

    public c(InterfaceC1016l interfaceC1016l, InterfaceC1021q interfaceC1021q) {
        m.e(interfaceC1016l, "open");
        m.e(interfaceC1021q, "options");
        this.f11877d = interfaceC1016l;
        this.f11878e = interfaceC1021q;
        this.f11880g = new ArrayList();
        this.f11881h = new SimpleDateFormat("dd.MM.yyyy HH:mm");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(cab.shashki.app.db.entities.a aVar, c cVar, View view) {
        if (m.a(aVar, cVar.f11879f)) {
            return;
        }
        cVar.f11877d.o(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(c cVar, a aVar, e.a aVar2, int i4, View view) {
        cVar.f11878e.j(aVar.Q(), aVar2, Integer.valueOf(i4));
    }

    public final cab.shashki.app.db.entities.a H() {
        return this.f11879f;
    }

    public final e.a I(int i4) {
        return (e.a) p.I(this.f11880g, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void u(final a aVar, final int i4) {
        m.e(aVar, "holder");
        final e.a aVar2 = (e.a) this.f11880g.get(i4);
        final cab.shashki.app.db.entities.a aVarB = aVar2.b();
        aVar.P().setText(aVarB.name());
        aVar.O().setText(this.f11881h.format(new Date(aVar2.a())));
        aVar.f9119a.setOnClickListener(new View.OnClickListener() { // from class: M0.y1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cab.shashki.app.ui.universal.c.K(aVarB, this, view);
            }
        });
        aVar.Q().setOnClickListener(new View.OnClickListener() { // from class: M0.z1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cab.shashki.app.ui.universal.c.L(this.f2755b, aVar, aVar2, i4, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public a w(ViewGroup viewGroup, int i4) {
        m.e(viewGroup, "parent");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC0922z.f15225u, viewGroup, false);
        m.d(viewInflate, "inflate(...)");
        return new a(viewInflate);
    }

    public final void N(List list, cab.shashki.app.db.entities.a aVar) {
        m.e(list, "items");
        this.f11880g.clear();
        this.f11880g.addAll(list);
        this.f11879f = aVar;
        m();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int h() {
        return this.f11880g.size();
    }
}