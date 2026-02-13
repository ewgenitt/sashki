package cab.shashki.app.ui.history;

import N0.C0573k;
import T2.u;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.k;
import androidx.recyclerview.widget.RecyclerView;
import cab.shashki.app.ShashkiApp;
import cab.shashki.app.ui.GridAutoLayoutManager;
import cab.shashki.app.ui.custom.BoardPreview;
import cab.shashki.app.ui.history.RecentGameActivity;
import f0.AbstractC0888D;
import f0.AbstractC0920x;
import f0.AbstractC0922z;
import f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L;
import g0.C0984n0;
import g3.InterfaceC1005a;
import g3.InterfaceC1016l;
import h3.l;
import h3.m;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import o0.t;
import org.xmlpull.v1.XmlPullParserException;
import q0.C1275A;
import q0.H;
import q0.InterfaceC1298w;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class RecentGameActivity extends AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L {

    /* renamed from: I, reason: collision with root package name */
    private final H f11642I = new H(new c(this), null, 2, null);

    /* renamed from: J, reason: collision with root package name */
    private final t f11643J = new t();

    /* renamed from: K, reason: collision with root package name */
    private a f11644K;

    /* JADX INFO: Access modifiers changed from: private */
    final class a extends RecyclerView.h {

        /* renamed from: d, reason: collision with root package name */
        private final SimpleDateFormat f11645d = new SimpleDateFormat("HH:mm:ss");

        /* renamed from: e, reason: collision with root package name */
        private final List f11646e = new ArrayList();

        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void I(RecentGameActivity recentGameActivity, C1275A.a aVar, View view) {
            recentGameActivity.X2(aVar);
        }

        public final List G() {
            return this.f11646e;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public void u(b bVar, int i4) {
            String string;
            m.e(bVar, "holder");
            final C1275A.a aVar = (C1275A.a) this.f11646e.get(i4);
            String strB = aVar.b();
            cab.shashki.app.db.entities.a aVarI = strB != null ? cab.shashki.app.service.a.f10602a.i(Integer.valueOf(aVar.a()), strB) : null;
            TextView textView = bVar.O().f15789e;
            if (aVarI == null || (string = aVarI.name()) == null) {
                string = RecentGameActivity.this.getString(cab.shashki.app.service.b.f10603a.w(Integer.valueOf(aVar.a())));
                m.d(string, "getString(...)");
            }
            textView.setText(string);
            bVar.O().f15788d.setText(this.f11645d.format(new Date(aVar.e())));
            BoardPreview boardPreview = bVar.O().f15786b;
            Integer numValueOf = Integer.valueOf(aVar.a());
            String strD = aVar.d();
            if (strD == null) {
                strD = "";
            }
            BoardPreview.Z(boardPreview, numValueOf, strD, null, aVarI, RecentGameActivity.this.f11643J, 4, null);
            BoardPreview boardPreview2 = bVar.O().f15786b;
            final RecentGameActivity recentGameActivity = RecentGameActivity.this;
            boardPreview2.setOnClickListener(new View.OnClickListener() { // from class: cab.shashki.app.ui.history.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RecentGameActivity.a.I(recentGameActivity, aVar, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public b w(ViewGroup viewGroup, int i4) {
            m.e(viewGroup, "parent");
            C0984n0 c0984n0D = C0984n0.d(RecentGameActivity.this.getLayoutInflater(), viewGroup, false);
            m.d(c0984n0D, "inflate(...)");
            return new b(c0984n0D);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int h() {
            return this.f11646e.size();
        }
    }

    private static final class b extends RecyclerView.D {

        /* renamed from: u, reason: collision with root package name */
        private final C0984n0 f11648u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C0984n0 c0984n0) {
            super(c0984n0.a());
            m.e(c0984n0, "binding");
            this.f11648u = c0984n0;
        }

        public final C0984n0 O() {
            return this.f11648u;
        }
    }

    /* synthetic */ class c extends l implements InterfaceC1016l {
        c(Object obj) {
            super(1, obj, RecentGameActivity.class, "updateGames", "updateGames(Lcab/shashki/app/service/ShashkiConnection;)V", 0);
        }

        public final void m(H h4) {
            m.e(h4, "p0");
            ((RecentGameActivity) this.f16244e).Y2(h4);
        }

        @Override // g3.InterfaceC1016l
        public /* bridge */ /* synthetic */ Object o(Object obj) {
            m((H) obj);
            return u.f3817a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X2(C1275A.a aVar) {
        cab.shashki.app.service.a.f10602a.a(aVar.a(), aVar.b());
        InterfaceC1298w interfaceC1298wJ = this.f11642I.j();
        if (interfaceC1298wJ != null) {
            interfaceC1298wJ.n(aVar.a(), aVar.b(), aVar.c(), true);
        }
        cab.shashki.app.service.b bVar = cab.shashki.app.service.b.f10603a;
        k.b(ShashkiApp.f10561b.a()).edit().putString(getString(AbstractC0888D.f14342A1), bVar.z(Integer.valueOf(aVar.a())) ? bVar.m(bVar.w(Integer.valueOf(aVar.a()))) : bVar.v(Integer.valueOf(aVar.a()))).apply();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y2(H h4) {
        a aVar = this.f11644K;
        a aVar2 = null;
        if (aVar == null) {
            m.r("adapter");
            aVar = null;
        }
        aVar.G().clear();
        InterfaceC1298w interfaceC1298wJ = h4.j();
        Object objF = interfaceC1298wJ != null ? interfaceC1298wJ.f("recent_games", new Object[0]) : null;
        List list = objF instanceof List ? (List) objF : null;
        if (list != null) {
            a aVar3 = this.f11644K;
            if (aVar3 == null) {
                m.r("adapter");
                aVar3 = null;
            }
            aVar3.G().addAll(list);
            a aVar4 = this.f11644K;
            if (aVar4 == null) {
                m.r("adapter");
            } else {
                aVar2 = aVar4;
            }
            aVar2.m();
            if (list.isEmpty()) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (cab.shashki.app.service.b.f10603a.w(Integer.valueOf(((C1275A.a) it.next()).a())) == AbstractC0888D.y5) {
                    if (this.f11643J.a()) {
                        return;
                    }
                    S2.a.c().b(new Runnable() { // from class: I0.W1
                        @Override // java.lang.Runnable
                        public final void run() throws XmlPullParserException, Resources.NotFoundException, IOException {
                            RecentGameActivity.Z2(this.f1603d);
                        }
                    });
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z2(final RecentGameActivity recentGameActivity) throws XmlPullParserException, Resources.NotFoundException, IOException {
        recentGameActivity.f11643J.b(recentGameActivity, new InterfaceC1005a() { // from class: I0.X1
            @Override // g3.InterfaceC1005a
            public final Object a() {
                return RecentGameActivity.a3(this.f1607d);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u a3(final RecentGameActivity recentGameActivity) {
        recentGameActivity.runOnUiThread(new Runnable() { // from class: I0.Y1
            @Override // java.lang.Runnable
            public final void run() {
                RecentGameActivity.b3(this.f1609d);
            }
        });
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b3(RecentGameActivity recentGameActivity) {
        a aVar = recentGameActivity.f11644K;
        if (aVar == null) {
            m.r("adapter");
            aVar = null;
        }
        aVar.m();
    }

    @Override // f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(AbstractC0922z.f15234y0);
        AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L.H2(this, AbstractC0888D.o4, false, 2, null);
        this.f11644K = new a();
        RecyclerView recyclerView = (RecyclerView) findViewById(AbstractC0920x.f15015e2);
        recyclerView.setLayoutManager(new GridAutoLayoutManager(this, 132.0f, 0, 4, null));
        a aVar = this.f11644K;
        if (aVar == null) {
            m.r("adapter");
            aVar = null;
        }
        recyclerView.setAdapter(aVar);
        C0573k c0573k = C0573k.f2973a;
        m.b(recyclerView);
        C0573k.v(c0573k, recyclerView, 0, 1, null);
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f11642I.k();
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f11642I.g();
    }
}