package cab.shashki.app.ui.checkers.draw_table;

import N0.C0573k;
import U2.p;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import cab.shashki.app.ui.GridAutoLayoutManager;
import cab.shashki.app.ui.checkers.draw_table.a;
import cab.shashki.app.ui.custom.BoardPreview;
import f0.AbstractActivityC0911o;
import f0.AbstractC0888D;
import f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L;
import g0.C0984n0;
import g0.C0996v;
import h3.h;
import h3.m;
import java.util.List;
import p3.n;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class PreviewTableActivity extends AbstractActivityC0911o implements cab.shashki.app.ui.checkers.draw_table.a {

    /* renamed from: L */
    public static final a f10888L = new a(null);

    /* renamed from: J */
    private c f10889J;

    /* renamed from: K */
    private C0996v f10890K;

    public static final class a {
        public /* synthetic */ a(h hVar) {
            this();
        }

        private a() {
        }
    }

    private static final class b extends RecyclerView.D {

        /* renamed from: u */
        private final C0984n0 f10891u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C0984n0 c0984n0) {
            super(c0984n0.a());
            m.e(c0984n0, "binding");
            this.f10891u = c0984n0;
        }

        public final C0984n0 O() {
            return this.f10891u;
        }
    }

    private static final class c extends RecyclerView.h {

        /* renamed from: d */
        private final int f10892d;

        /* renamed from: e */
        private List f10893e = p.g();

        public c(int i4) {
            this.f10892d = i4;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: F */
        public void u(b bVar, int i4) {
            m.e(bVar, "holder");
            a.C0144a c0144a = (a.C0144a) this.f10893e.get(i4);
            bVar.O().f15789e.setText(c0144a.a());
            BoardPreview.b0(bVar.O().f15786b, this.f10892d, c0144a.b(), null, null, null, 28, null);
            bVar.O().f15788d.setText(n.C0(c0144a.b()) == 'w' ? AbstractC0888D.L6 : AbstractC0888D.f14562w);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: G */
        public b w(ViewGroup viewGroup, int i4) {
            m.e(viewGroup, "parent");
            C0984n0 c0984n0D = C0984n0.d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            m.d(c0984n0D, "inflate(...)");
            return new b(c0984n0D);
        }

        public final void H(List list) {
            m.e(list, "<set-?>");
            this.f10893e = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int h() {
            return this.f10893e.size();
        }
    }

    @Override // cab.shashki.app.ui.checkers.draw_table.a
    public void J(List list) {
        String strU0;
        m.e(list, "elements");
        String strK0 = ((cab.shashki.app.ui.checkers.draw_table.b) V2()).K0();
        c cVar = null;
        if (strK0 != null && (strU0 = n.u0(strK0, '/', null, 2, null)) != null) {
            a(strU0 + " (" + list.size() + ")");
        }
        C0996v c0996v = this.f10890K;
        if (c0996v == null) {
            m.r("binding");
            c0996v = null;
        }
        c0996v.f15901b.setVisibility(8);
        c cVar2 = this.f10889J;
        if (cVar2 == null) {
            m.r("adapter");
            cVar2 = null;
        }
        cVar2.H(list);
        c cVar3 = this.f10889J;
        if (cVar3 == null) {
            m.r("adapter");
        } else {
            cVar = cVar3;
        }
        cVar.m();
    }

    @Override // f0.AbstractActivityC0911o
    /* renamed from: Y2 */
    public void S2(cab.shashki.app.ui.checkers.draw_table.b bVar) {
        String strU0;
        m.e(bVar, "presenter");
        super.S2(bVar);
        String strK0 = bVar.K0();
        c cVar = null;
        if (strK0 != null && (strU0 = n.u0(strK0, '/', null, 2, null)) != null) {
            a(strU0);
        }
        this.f10889J = new c(bVar.L0());
        C0996v c0996v = this.f10890K;
        if (c0996v == null) {
            m.r("binding");
            c0996v = null;
        }
        c0996v.f15902c.setLayoutManager(new GridAutoLayoutManager(this, 132.0f, 0, 4, null));
        C0996v c0996v2 = this.f10890K;
        if (c0996v2 == null) {
            m.r("binding");
            c0996v2 = null;
        }
        RecyclerView recyclerView = c0996v2.f15902c;
        c cVar2 = this.f10889J;
        if (cVar2 == null) {
            m.r("adapter");
        } else {
            cVar = cVar2;
        }
        recyclerView.setAdapter(cVar);
    }

    @Override // f0.AbstractActivityC0911o
    /* renamed from: Z2 */
    public cab.shashki.app.ui.checkers.draw_table.b U2() {
        Intent intent = getIntent();
        String stringExtra = intent != null ? intent.getStringExtra("variant") : null;
        Intent intent2 = getIntent();
        return new cab.shashki.app.ui.checkers.draw_table.b(stringExtra, intent2 != null ? intent2.getStringExtra("file") : null);
    }

    @Override // f0.AbstractActivityC0911o, f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0996v c0996vD = C0996v.d(getLayoutInflater());
        this.f10890K = c0996vD;
        if (c0996vD == null) {
            m.r("binding");
            c0996vD = null;
        }
        setContentView(c0996vD.a());
        AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L.H2(this, AbstractC0888D.f14472e, false, 2, null);
        C0573k c0573k = C0573k.f2973a;
        C0996v c0996v = this.f10890K;
        if (c0996v == null) {
            m.r("binding");
            c0996v = null;
        }
        RecyclerView recyclerView = c0996v.f15902c;
        m.d(recyclerView, "table");
        C0573k.v(c0573k, recyclerView, 0, 1, null);
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onPause() {
        super.onPause();
        ((cab.shashki.app.ui.checkers.draw_table.b) V2()).v0(this);
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onResume() {
        super.onResume();
        ((cab.shashki.app.ui.checkers.draw_table.b) V2()).H0(this);
    }
}