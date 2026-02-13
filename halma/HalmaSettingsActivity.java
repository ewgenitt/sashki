package cab.shashki.app.ui.halma;

import G0.Y;
import G0.Z;
import N0.C0573k;
import T2.l;
import T2.u;
import U2.p;
import android.R;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.O;
import androidx.recyclerview.widget.RecyclerView;
import cab.shashki.app.db.entities.HalmaParams;
import cab.shashki.app.ui.halma.HalmaSettingsActivity;
import com.google.android.material.snackbar.Snackbar;
import e2.C0873a;
import e2.C0874b;
import f0.AbstractActivityC0911o;
import f0.AbstractC0885A;
import f0.AbstractC0888D;
import f0.AbstractC0920x;
import f0.AbstractC0922z;
import f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L;
import g0.C0993s;
import g3.InterfaceC1016l;
import g3.InterfaceC1021q;
import h3.m;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import t0.C1383g;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class HalmaSettingsActivity extends AbstractActivityC0911o implements Z {

    /* renamed from: J, reason: collision with root package name */
    private a f11581J;

    /* renamed from: K, reason: collision with root package name */
    private C0993s f11582K;

    public static final class a extends RecyclerView.h {

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC1016l f11583d;

        /* renamed from: e, reason: collision with root package name */
        private final InterfaceC1021q f11584e;

        /* renamed from: f, reason: collision with root package name */
        private final List f11585f;

        /* renamed from: g, reason: collision with root package name */
        private final SimpleDateFormat f11586g;

        /* renamed from: h, reason: collision with root package name */
        private HalmaParams f11587h;

        public a(InterfaceC1016l interfaceC1016l, InterfaceC1021q interfaceC1021q) {
            m.e(interfaceC1016l, "open");
            m.e(interfaceC1021q, "options");
            this.f11583d = interfaceC1016l;
            this.f11584e = interfaceC1021q;
            this.f11585f = new ArrayList();
            this.f11586g = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void J(l lVar, a aVar, View view) {
            HalmaParams halmaParams = aVar.f11587h;
            if (halmaParams == null || ((HalmaParams) lVar.c()).getId() != halmaParams.getId()) {
                aVar.f11583d.o(lVar.c());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void K(a aVar, b bVar, l lVar, int i4, View view) {
            aVar.f11584e.j(bVar.Q(), lVar.c(), Integer.valueOf(i4));
        }

        public final boolean H(int i4) {
            HalmaParams halmaParams;
            if (this.f11587h == null) {
                return true;
            }
            l lVar = (l) p.I(this.f11585f, i4);
            Integer numValueOf = (lVar == null || (halmaParams = (HalmaParams) lVar.c()) == null) ? null : Integer.valueOf(halmaParams.getId());
            HalmaParams halmaParams2 = this.f11587h;
            return !m.a(numValueOf, halmaParams2 != null ? Integer.valueOf(halmaParams2.getId()) : null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public void u(final b bVar, final int i4) {
            m.e(bVar, "holder");
            final l lVar = (l) this.f11585f.get(i4);
            bVar.P().setText(((HalmaParams) lVar.c()).getName());
            bVar.O().setText(this.f11586g.format(new Date(((Number) lVar.d()).longValue())));
            bVar.f9119a.setOnClickListener(new View.OnClickListener() { // from class: G0.D
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HalmaSettingsActivity.a.J(lVar, this, view);
                }
            });
            bVar.Q().setOnClickListener(new View.OnClickListener() { // from class: G0.E
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HalmaSettingsActivity.a.K(this.f1187b, bVar, lVar, i4, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public b w(ViewGroup viewGroup, int i4) {
            m.e(viewGroup, "parent");
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC0922z.f15225u, viewGroup, false);
            m.d(viewInflate, "inflate(...)");
            return new b(viewInflate);
        }

        public final void M(List list, HalmaParams halmaParams) {
            m.e(list, "items");
            this.f11585f.clear();
            this.f11585f.addAll(list);
            this.f11587h = halmaParams;
            m();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int h() {
            return this.f11585f.size();
        }
    }

    public static final class b extends RecyclerView.D {

        /* renamed from: u, reason: collision with root package name */
        private final TextView f11588u;

        /* renamed from: v, reason: collision with root package name */
        private final TextView f11589v;

        /* renamed from: w, reason: collision with root package name */
        private final ImageView f11590w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            m.e(view, "view");
            View viewFindViewById = view.findViewById(AbstractC0920x.f15029h1);
            m.b(viewFindViewById);
            this.f11588u = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(AbstractC0920x.i4);
            m.b(viewFindViewById2);
            this.f11589v = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(AbstractC0920x.p4);
            m.b(viewFindViewById3);
            this.f11590w = (ImageView) viewFindViewById3;
        }

        public final TextView O() {
            return this.f11588u;
        }

        public final TextView P() {
            return this.f11589v;
        }

        public final ImageView Q() {
            return this.f11590w;
        }
    }

    /* synthetic */ class c extends h3.l implements InterfaceC1016l {
        c(Object obj) {
            super(1, obj, Y.class, "open", "open(Lcab/shashki/app/db/entities/HalmaParams;)V", 0);
        }

        public final void m(HalmaParams halmaParams) {
            m.e(halmaParams, "p0");
            ((Y) this.f16244e).f1(halmaParams);
        }

        @Override // g3.InterfaceC1016l
        public /* bridge */ /* synthetic */ Object o(Object obj) {
            m((HalmaParams) obj);
            return u.f3817a;
        }
    }

    /* synthetic */ class d extends h3.l implements InterfaceC1021q {
        d(Object obj) {
            super(3, obj, HalmaSettingsActivity.class, "showMenu", "showMenu(Landroid/view/View;Lcab/shashki/app/db/entities/HalmaParams;I)V", 0);
        }

        @Override // g3.InterfaceC1021q
        public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3) {
            m((View) obj, (HalmaParams) obj2, ((Number) obj3).intValue());
            return u.f3817a;
        }

        public final void m(View view, HalmaParams halmaParams, int i4) {
            m.e(view, "p0");
            m.e(halmaParams, "p1");
            ((HalmaSettingsActivity) this.f16244e).r3(view, halmaParams, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i3(HalmaSettingsActivity halmaSettingsActivity, int i4) {
        a aVar = halmaSettingsActivity.f11581J;
        if (aVar == null) {
            m.r("adapter");
            aVar = null;
        }
        return aVar.H(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u j3(Y y4, int i4) {
        y4.W0(i4);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k3(Y y4, View view) {
        y4.e1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l3(HalmaSettingsActivity halmaSettingsActivity, View view) {
        halmaSettingsActivity.q3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n3(A2.c cVar, HalmaSettingsActivity halmaSettingsActivity, int i4, View view) {
        cVar.e();
        a aVar = halmaSettingsActivity.f11581J;
        if (aVar == null) {
            m.r("adapter");
            aVar = null;
        }
        aVar.n(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o3(View view) {
        view.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p3(HalmaSettingsActivity halmaSettingsActivity, View view) {
        halmaSettingsActivity.startActivity(new Intent(halmaSettingsActivity, (Class<?>) HalmaBuilderActivity.class));
    }

    private final void q3() {
        C0873a c0873a = new C0873a(this);
        c0873a.j("QR_CODE");
        c0873a.l(8);
        c0873a.k(false);
        c0873a.i(false);
        c0873a.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r3(View view, final HalmaParams halmaParams, final int i4) {
        O o4 = new O(this, view);
        o4.c(AbstractC0885A.f14318f);
        o4.e(new O.c() { // from class: G0.C
            @Override // androidx.appcompat.widget.O.c
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return HalmaSettingsActivity.s3(this.f1182a, halmaParams, i4, menuItem);
            }
        });
        o4.a().findItem(AbstractC0920x.f15012e).setVisible(halmaParams.getId() != ((Y) V2()).P0());
        o4.d(true);
        o4.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s3(HalmaSettingsActivity halmaSettingsActivity, HalmaParams halmaParams, int i4, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == AbstractC0920x.f15102w) {
            ((Y) halmaSettingsActivity.V2()).t1(halmaParams);
            return true;
        }
        if (itemId == AbstractC0920x.f15092u) {
            ((Y) halmaSettingsActivity.V2()).Q0(halmaParams);
            return true;
        }
        if (itemId == AbstractC0920x.f15082s) {
            ((Y) halmaSettingsActivity.V2()).o1(halmaParams);
            return true;
        }
        if (itemId == AbstractC0920x.f15002c) {
            ((Y) halmaSettingsActivity.V2()).U0(halmaParams);
            return true;
        }
        if (itemId != AbstractC0920x.f15012e) {
            return true;
        }
        ((Y) halmaSettingsActivity.V2()).W0(i4);
        return true;
    }

    @Override // G0.Z
    public void K1(boolean z4) {
        C0993s c0993s = this.f11582K;
        if (c0993s == null) {
            m.r("binding");
            c0993s = null;
        }
        c0993s.f15870d.setVisibility(z4 ? 0 : 8);
    }

    @Override // G0.Z
    public void b(int i4) {
        startActivity(new Intent(this, (Class<?>) HalmaBuilderActivity.class).putExtra("template", true).putExtra(HalmaParams.ID, i4));
    }

    @Override // G0.Z
    public void e() {
        C0993s c0993s = this.f11582K;
        if (c0993s == null) {
            m.r("binding");
            c0993s = null;
        }
        Snackbar.b0(c0993s.f15869c, AbstractC0888D.f14518n0, -1).R();
    }

    @Override // G0.Z
    public void f1(List list, HalmaParams halmaParams) {
        m.e(list, "list");
        C0993s c0993s = this.f11582K;
        a aVar = null;
        if (c0993s == null) {
            m.r("binding");
            c0993s = null;
        }
        c0993s.f15870d.setVisibility(8);
        a aVar2 = this.f11581J;
        if (aVar2 == null) {
            m.r("adapter");
        } else {
            aVar = aVar2;
        }
        aVar.M(list, halmaParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f0.AbstractActivityC0911o
    /* renamed from: h3, reason: merged with bridge method [inline-methods] */
    public void S2(final Y y4) {
        m.e(y4, "presenter");
        super.S2(y4);
        this.f11581J = new a(new c(y4), new d(this));
        C0993s c0993s = this.f11582K;
        C0993s c0993s2 = null;
        if (c0993s == null) {
            m.r("binding");
            c0993s = null;
        }
        RecyclerView recyclerView = c0993s.f15869c;
        a aVar = this.f11581J;
        if (aVar == null) {
            m.r("adapter");
            aVar = null;
        }
        recyclerView.setAdapter(aVar);
        C0993s c0993s3 = this.f11582K;
        if (c0993s3 == null) {
            m.r("binding");
            c0993s3 = null;
        }
        RecyclerView recyclerView2 = c0993s3.f15869c;
        m.d(recyclerView2, "list");
        new C1383g.a(recyclerView2, new InterfaceC1016l() { // from class: G0.x
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return Boolean.valueOf(HalmaSettingsActivity.i3(this.f1255d, ((Integer) obj).intValue()));
            }
        }, new InterfaceC1016l() { // from class: G0.y
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return HalmaSettingsActivity.j3(y4, ((Integer) obj).intValue());
            }
        });
        C0993s c0993s4 = this.f11582K;
        if (c0993s4 == null) {
            m.r("binding");
            c0993s4 = null;
        }
        c0993s4.f15868b.setOnClickListener(new View.OnClickListener() { // from class: G0.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HalmaSettingsActivity.k3(y4, view);
            }
        });
        C0993s c0993s5 = this.f11582K;
        if (c0993s5 == null) {
            m.r("binding");
        } else {
            c0993s2 = c0993s5;
        }
        c0993s2.f15873g.setOnClickListener(new View.OnClickListener() { // from class: G0.A
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HalmaSettingsActivity.l3(this.f1178b, view);
            }
        });
    }

    @Override // G0.Z
    public void j(Bitmap bitmap) {
        m.e(bitmap, "qr");
        C0993s c0993s = this.f11582K;
        C0993s c0993s2 = null;
        if (c0993s == null) {
            m.r("binding");
            c0993s = null;
        }
        c0993s.f15874h.setVisibility(0);
        C0993s c0993s3 = this.f11582K;
        if (c0993s3 == null) {
            m.r("binding");
        } else {
            c0993s2 = c0993s3;
        }
        c0993s2.f15874h.setImageBitmap(bitmap);
    }

    @Override // G0.Z
    public void l(final int i4, int i5, final A2.c cVar) {
        m.e(cVar, "disposable");
        C0993s c0993s = this.f11582K;
        if (c0993s == null) {
            m.r("binding");
            c0993s = null;
        }
        Snackbar snackbarB0 = Snackbar.b0(c0993s.f15869c, AbstractC0888D.f14458b0, i5);
        m.d(snackbarB0, "make(...)");
        snackbarB0.e0(R.string.cancel, new View.OnClickListener() { // from class: G0.B
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HalmaSettingsActivity.n3(cVar, this, i4, view);
            }
        });
        snackbarB0.R();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f0.AbstractActivityC0911o
    /* renamed from: m3, reason: merged with bridge method [inline-methods] */
    public Y U2() {
        return new Y();
    }

    @Override // G0.Z
    public void o() {
        C0993s c0993s = this.f11582K;
        if (c0993s == null) {
            m.r("binding");
            c0993s = null;
        }
        Snackbar.b0(c0993s.f15869c, AbstractC0888D.f14396M, -1).R();
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i4, int i5, Intent intent) {
        String strA;
        super.onActivityResult(i4, i5, intent);
        if (i4 == 8 && i5 == -1) {
            Y y4 = (Y) V2();
            C0874b c0874bH = C0873a.h(i5, intent);
            if (c0874bH == null || (strA = c0874bH.a()) == null) {
                return;
            }
            y4.i1(strA);
        }
    }

    @Override // f0.AbstractActivityC0911o, f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0993s c0993sD = C0993s.d(getLayoutInflater());
        this.f11582K = c0993sD;
        C0993s c0993s = null;
        if (c0993sD == null) {
            m.r("binding");
            c0993sD = null;
        }
        setContentView(c0993sD.a());
        AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L.H2(this, AbstractC0888D.A5, false, 2, null);
        C0573k c0573k = C0573k.f2973a;
        C0993s c0993s2 = this.f11582K;
        if (c0993s2 == null) {
            m.r("binding");
            c0993s2 = null;
        }
        RecyclerView recyclerView = c0993s2.f15869c;
        m.d(recyclerView, "list");
        C0573k.v(c0573k, recyclerView, 0, 1, null);
        C0993s c0993s3 = this.f11582K;
        if (c0993s3 == null) {
            m.r("binding");
            c0993s3 = null;
        }
        LinearLayout linearLayout = c0993s3.f15872f;
        m.d(linearLayout, "panel");
        C0573k.s(c0573k, linearLayout, 0, 1, null);
        C0993s c0993s4 = this.f11582K;
        if (c0993s4 == null) {
            m.r("binding");
            c0993s4 = null;
        }
        c0993s4.f15874h.setOnClickListener(new View.OnClickListener() { // from class: G0.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HalmaSettingsActivity.o3(view);
            }
        });
        C0993s c0993s5 = this.f11582K;
        if (c0993s5 == null) {
            m.r("binding");
        } else {
            c0993s = c0993s5;
        }
        c0993s.f15871e.setOnClickListener(new View.OnClickListener() { // from class: G0.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HalmaSettingsActivity.p3(this.f1254b, view);
            }
        });
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onPause() {
        super.onPause();
        ((Y) V2()).v0(this);
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onResume() {
        super.onResume();
        ((Y) V2()).R0(this);
    }

    @Override // G0.Z
    public void q(int i4) {
        startActivity(new Intent(this, (Class<?>) HalmaBuilderActivity.class).putExtra(HalmaParams.ID, i4));
    }

    @Override // G0.Z
    public void s(String str) {
        m.e(str, HalmaParams.NAME);
        C0993s c0993s = this.f11582K;
        if (c0993s == null) {
            m.r("binding");
            c0993s = null;
        }
        Snackbar.c0(c0993s.f15869c, str, -1).R();
    }
}