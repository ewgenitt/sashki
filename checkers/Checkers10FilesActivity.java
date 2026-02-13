package cab.shashki.app.ui.checkers;

import N0.C0573k;
import T2.u;
import android.R;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cab.shashki.app.ui.checkers.Checkers10FilesActivity;
import com.google.android.material.snackbar.Snackbar;
import f0.AbstractActivityC0911o;
import f0.AbstractC0888D;
import f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L;
import g0.C0963d;
import g3.InterfaceC1005a;
import g3.InterfaceC1016l;
import h3.l;
import h3.m;
import t0.C1383g;
import u0.C1399b;
import v0.InterfaceC1415C;
import v0.o;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class Checkers10FilesActivity extends AbstractActivityC0911o implements InterfaceC1415C {

    /* renamed from: J, reason: collision with root package name */
    private C1399b f10875J;

    /* renamed from: K, reason: collision with root package name */
    private C0963d f10876K;

    /* synthetic */ class a extends l implements InterfaceC1016l {
        a(Object obj) {
            super(1, obj, o.class, "onClick", "onClick(I)V", 0);
        }

        public final void m(int i4) {
            ((o) this.f16244e).T0(i4);
        }

        @Override // g3.InterfaceC1016l
        public /* bridge */ /* synthetic */ Object o(Object obj) {
            m(((Number) obj).intValue());
            return u.f3817a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d3(Checkers10FilesActivity checkers10FilesActivity, int i4) {
        C1399b c1399b = checkers10FilesActivity.f10875J;
        if (c1399b == null) {
            m.r("adapter");
            c1399b = null;
        }
        return c1399b.G(i4).b().exists();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u e3(Checkers10FilesActivity checkers10FilesActivity, int i4) {
        ((o) checkers10FilesActivity.V2()).K0(i4);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f3(InterfaceC1005a interfaceC1005a, View view) {
        interfaceC1005a.a();
    }

    @Override // v0.InterfaceC1415C
    public void T0(int i4) {
        C1399b c1399b = this.f10875J;
        if (c1399b == null) {
            m.r("adapter");
            c1399b = null;
        }
        c1399b.n(i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f0.AbstractActivityC0911o
    /* renamed from: b3, reason: merged with bridge method [inline-methods] */
    public void S2(o oVar) {
        m.e(oVar, "presenter");
        super.S2(oVar);
        C1399b c1399b = new C1399b(new a(oVar));
        this.f10875J = c1399b;
        c1399b.K(oVar.S0());
        C0963d c0963d = this.f10876K;
        C1399b c1399b2 = null;
        if (c0963d == null) {
            m.r("binding");
            c0963d = null;
        }
        RecyclerView recyclerView = c0963d.f15629b;
        C1399b c1399b3 = this.f10875J;
        if (c1399b3 == null) {
            m.r("adapter");
        } else {
            c1399b2 = c1399b3;
        }
        recyclerView.setAdapter(c1399b2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f0.AbstractActivityC0911o
    /* renamed from: c3, reason: merged with bridge method [inline-methods] */
    public o U2() {
        return new o();
    }

    @Override // v0.InterfaceC1415C
    public void h1(int i4, final InterfaceC1005a interfaceC1005a) {
        m.e(interfaceC1005a, "onCancel");
        C0963d c0963d = this.f10876K;
        if (c0963d == null) {
            m.r("binding");
            c0963d = null;
        }
        Snackbar.b0(c0963d.f15629b, AbstractC0888D.f14458b0, i4).e0(R.string.cancel, new View.OnClickListener() { // from class: v0.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Checkers10FilesActivity.f3(interfaceC1005a, view);
            }
        }).R();
    }

    @Override // f0.AbstractActivityC0911o, f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0963d c0963dD = C0963d.d(getLayoutInflater());
        this.f10876K = c0963dD;
        C0963d c0963d = null;
        if (c0963dD == null) {
            m.r("binding");
            c0963dD = null;
        }
        setContentView(c0963dD.a());
        AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L.H2(this, AbstractC0888D.f14533q0, false, 2, null);
        C0573k c0573k = C0573k.f2973a;
        C0963d c0963d2 = this.f10876K;
        if (c0963d2 == null) {
            m.r("binding");
            c0963d2 = null;
        }
        RecyclerView recyclerView = c0963d2.f15629b;
        m.d(recyclerView, "list");
        C0573k.v(c0573k, recyclerView, 0, 1, null);
        C0963d c0963d3 = this.f10876K;
        if (c0963d3 == null) {
            m.r("binding");
        } else {
            c0963d = c0963d3;
        }
        RecyclerView recyclerView2 = c0963d.f15629b;
        m.d(recyclerView2, "list");
        new C1383g.a(recyclerView2, new InterfaceC1016l() { // from class: v0.a
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return Boolean.valueOf(Checkers10FilesActivity.d3(this.f19964d, ((Integer) obj).intValue()));
            }
        }, new InterfaceC1016l() { // from class: v0.b
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return Checkers10FilesActivity.e3(this.f19965d, ((Integer) obj).intValue());
            }
        });
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onPause() {
        super.onPause();
        ((o) V2()).v0(this);
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onResume() {
        super.onResume();
        ((o) V2()).I0(this);
    }
}