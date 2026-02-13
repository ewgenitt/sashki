package cab.shashki.app.ui.chess.uci_custom;

import A0.p;
import A0.q;
import N0.C0573k;
import T2.u;
import U2.AbstractC0590i;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cab.shashki.app.ui.chess.uci_custom.UCIEngineActivity;
import com.google.android.material.snackbar.Snackbar;
import f0.AbstractActivityC0911o;
import f0.AbstractC0888D;
import f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L;
import g0.B0;
import g3.InterfaceC1016l;
import h3.h;
import h3.l;
import h3.m;
import java.io.File;
import java.util.List;
import t0.C1383g;
import u0.x;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class UCIEngineActivity extends AbstractActivityC0911o implements q {

    /* renamed from: L, reason: collision with root package name */
    public static final a f11194L = new a(null);

    /* renamed from: J, reason: collision with root package name */
    private x f11195J;

    /* renamed from: K, reason: collision with root package name */
    private B0 f11196K;

    public static final class a {
        public /* synthetic */ a(h hVar) {
            this();
        }

        private a() {
        }
    }

    /* synthetic */ class b extends l implements InterfaceC1016l {
        b(Object obj) {
            super(1, obj, p.class, "selectEngine", "selectEngine(Lcab/shashki/app/ui/adapters/UciEngineFileAdapter$Engine;)V", 0);
        }

        public final void m(x.a aVar) {
            m.e(aVar, "p0");
            ((p) this.f16244e).V0(aVar);
        }

        @Override // g3.InterfaceC1016l
        public /* bridge */ /* synthetic */ Object o(Object obj) {
            m((x.a) obj);
            return u.f3817a;
        }
    }

    private final void b3() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("*/*");
        intent.addCategory("android.intent.category.OPENABLE");
        try {
            startActivityForResult(Intent.createChooser(intent, getString(AbstractC0888D.E6)), 3);
        } catch (Exception unused) {
            B0 b02 = this.f11196K;
            if (b02 == null) {
                m.r("binding");
                b02 = null;
            }
            Snackbar.b0(b02.f15298f, AbstractC0888D.f14518n0, -1).R();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d3(UCIEngineActivity uCIEngineActivity, int i4) {
        x xVar = uCIEngineActivity.f11195J;
        if (xVar == null) {
            m.r("adapter");
            xVar = null;
        }
        return xVar.G(i4).a() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u e3(p pVar, UCIEngineActivity uCIEngineActivity, int i4) {
        x xVar = uCIEngineActivity.f11195J;
        if (xVar == null) {
            m.r("adapter");
            xVar = null;
        }
        File fileA = xVar.G(i4).a();
        m.b(fileA);
        pVar.M0(fileA);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f3(UCIEngineActivity uCIEngineActivity, View view) {
        uCIEngineActivity.b3();
    }

    @Override // A0.q
    public void L0(List list, String str) {
        m.e(list, "engines");
        x xVar = this.f11195J;
        if (xVar == null) {
            m.r("adapter");
            xVar = null;
        }
        xVar.K(list, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f0.AbstractActivityC0911o
    /* renamed from: c3, reason: merged with bridge method [inline-methods] */
    public void S2(final p pVar) {
        m.e(pVar, "presenter");
        super.S2(pVar);
        this.f11195J = new x(new b(pVar));
        B0 b02 = this.f11196K;
        B0 b03 = null;
        if (b02 == null) {
            m.r("binding");
            b02 = null;
        }
        RecyclerView recyclerView = b02.f15296d;
        x xVar = this.f11195J;
        if (xVar == null) {
            m.r("adapter");
            xVar = null;
        }
        recyclerView.setAdapter(xVar);
        B0 b04 = this.f11196K;
        if (b04 == null) {
            m.r("binding");
            b04 = null;
        }
        RecyclerView recyclerView2 = b04.f15296d;
        m.d(recyclerView2, "list");
        new C1383g.a(recyclerView2, new InterfaceC1016l() { // from class: A0.b
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return Boolean.valueOf(UCIEngineActivity.d3(this.f9d, ((Integer) obj).intValue()));
            }
        }, new InterfaceC1016l() { // from class: A0.c
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return UCIEngineActivity.e3(pVar, this, ((Integer) obj).intValue());
            }
        });
        B0 b05 = this.f11196K;
        if (b05 == null) {
            m.r("binding");
            b05 = null;
        }
        b05.f15295c.setVisibility(pVar.W0() ? 0 : 8);
        B0 b06 = this.f11196K;
        if (b06 == null) {
            m.r("binding");
        } else {
            b03 = b06;
        }
        b03.f15295c.setOnClickListener(new View.OnClickListener() { // from class: A0.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UCIEngineActivity.f3(this.f12b, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f0.AbstractActivityC0911o
    /* renamed from: g3, reason: merged with bridge method [inline-methods] */
    public p U2() {
        return new p();
    }

    @Override // A0.q
    public void h(boolean z4) {
        B0 b02 = this.f11196K;
        B0 b03 = null;
        if (b02 == null) {
            m.r("binding");
            b02 = null;
        }
        b02.f15295c.setVisibility(z4 ? 8 : 0);
        B0 b04 = this.f11196K;
        if (b04 == null) {
            m.r("binding");
        } else {
            b03 = b04;
        }
        b03.f15297e.setVisibility(z4 ? 0 : 8);
    }

    @Override // A0.q
    public void i(int i4) {
        B0 b02 = this.f11196K;
        if (b02 == null) {
            m.r("binding");
            b02 = null;
        }
        Snackbar.b0(b02.f15298f, i4, -1).R();
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i4, int i5, Intent intent) {
        Uri data;
        super.onActivityResult(i4, i5, intent);
        if (i5 == -1 && i4 == 3) {
            p pVar = (p) V2();
            if (intent == null || (data = intent.getData()) == null) {
                return;
            }
            pVar.N0(data);
        }
    }

    @Override // f0.AbstractActivityC0911o, f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        String strC;
        super.onCreate(bundle);
        B0 b0D = B0.d(getLayoutInflater());
        this.f11196K = b0D;
        B0 b02 = null;
        if (b0D == null) {
            m.r("binding");
            b0D = null;
        }
        setContentView(b0D.a());
        AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L.H2(this, AbstractC0888D.E6, false, 2, null);
        C0573k c0573k = C0573k.f2973a;
        B0 b03 = this.f11196K;
        if (b03 == null) {
            m.r("binding");
            b03 = null;
        }
        RecyclerView recyclerView = b03.f15296d;
        m.d(recyclerView, "list");
        C0573k.v(c0573k, recyclerView, 0, 1, null);
        B0 b04 = this.f11196K;
        if (b04 == null) {
            m.r("binding");
            b04 = null;
        }
        ImageView imageView = b04.f15295c;
        m.d(imageView, "add");
        C0573k.s(c0573k, imageView, 0, 1, null);
        B0 b05 = this.f11196K;
        if (b05 == null) {
            m.r("binding");
        } else {
            b02 = b05;
        }
        TextView textView = b02.f15294b;
        if (Build.VERSION.SDK_INT >= 21) {
            String[] strArr = Build.SUPPORTED_ABIS;
            m.d(strArr, "SUPPORTED_ABIS");
            strC = AbstractC0590i.C(strArr, null, null, null, 0, null, null, 63, null);
        } else {
            strC = Build.CPU_ABI;
        }
        textView.setText(strC);
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onPause() {
        super.onPause();
        ((p) V2()).X0(this);
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onResume() {
        super.onResume();
        ((p) V2()).I0(this);
    }

    @Override // A0.q
    public void v0(String str) {
        m.e(str, "path");
        x xVar = this.f11195J;
        if (xVar == null) {
            m.r("adapter");
            xVar = null;
        }
        xVar.L(str);
    }
}