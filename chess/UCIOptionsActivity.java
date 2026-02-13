package cab.shashki.app.ui.chess;

import N0.C0573k;
import T2.u;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import cab.shashki.app.ui.chess.UCIOptionsActivity;
import cab.shashki.app.ui.chess.c;
import cab.shashki.app.ui.chess.uci_storage.StorageActivity;
import f0.AbstractActivityC0911o;
import f0.AbstractC0888D;
import f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L;
import g0.G0;
import g3.InterfaceC1016l;
import g3.InterfaceC1020p;
import h3.h;
import h3.l;
import h3.m;
import java.util.List;
import q0.V;
import t0.C1383g;
import u0.z;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class UCIOptionsActivity extends AbstractActivityC0911o implements cab.shashki.app.ui.chess.c {

    /* renamed from: M, reason: collision with root package name */
    public static final a f10911M = new a(null);

    /* renamed from: J, reason: collision with root package name */
    private String f10912J = "uci";

    /* renamed from: K, reason: collision with root package name */
    private z f10913K;

    /* renamed from: L, reason: collision with root package name */
    private G0 f10914L;

    public static final class a {
        public /* synthetic */ a(h hVar) {
            this();
        }

        private a() {
        }
    }

    /* synthetic */ class b extends l implements InterfaceC1016l {
        b(Object obj) {
            super(1, obj, cab.shashki.app.ui.chess.b.class, "open", "open(Lcab/shashki/app/ui/chess/UCIOptionsView$UCIOption;)V", 0);
        }

        public final void m(c.b bVar) {
            m.e(bVar, "p0");
            ((cab.shashki.app.ui.chess.b) this.f16244e).O0(bVar);
        }

        @Override // g3.InterfaceC1016l
        public /* bridge */ /* synthetic */ Object o(Object obj) {
            m((c.b) obj);
            return u.f3817a;
        }
    }

    /* synthetic */ class c extends l implements InterfaceC1020p {
        c(Object obj) {
            super(2, obj, cab.shashki.app.ui.chess.b.class, "save", "save(Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // g3.InterfaceC1020p
        public /* bridge */ /* synthetic */ Object k(Object obj, Object obj2) {
            m((String) obj, (String) obj2);
            return u.f3817a;
        }

        public final void m(String str, String str2) {
            m.e(str, "p0");
            m.e(str2, "p1");
            ((cab.shashki.app.ui.chess.b) this.f16244e).P0(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c3(UCIOptionsActivity uCIOptionsActivity, int i4) {
        z zVar = uCIOptionsActivity.f10913K;
        if (zVar == null) {
            m.r("adapter");
            zVar = null;
        }
        return zVar.G(i4).r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u d3(cab.shashki.app.ui.chess.b bVar, UCIOptionsActivity uCIOptionsActivity, int i4) {
        z zVar = uCIOptionsActivity.f10913K;
        if (zVar == null) {
            m.r("adapter");
            zVar = null;
        }
        bVar.K0(zVar.G(i4));
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e3(cab.shashki.app.ui.chess.b bVar, View view) {
        bVar.D0();
    }

    @Override // cab.shashki.app.ui.chess.c
    public void E1(List list) {
        m.e(list, "options");
        z zVar = this.f10913K;
        if (zVar == null) {
            m.r("adapter");
            zVar = null;
        }
        zVar.K(list);
    }

    @Override // cab.shashki.app.ui.chess.c
    public void K0(c.b bVar) {
        m.e(bVar, "option");
        cab.shashki.app.ui.chess.a.f10915u0.a(new c(V2()), bVar).S4(g2(), "uci");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f0.AbstractActivityC0911o
    /* renamed from: b3, reason: merged with bridge method [inline-methods] */
    public void S2(final cab.shashki.app.ui.chess.b bVar) {
        m.e(bVar, "presenter");
        super.S2(bVar);
        this.f10913K = new z(new b(bVar));
        G0 g02 = this.f10914L;
        G0 g03 = null;
        if (g02 == null) {
            m.r("binding");
            g02 = null;
        }
        RecyclerView recyclerView = g02.f15358c;
        z zVar = this.f10913K;
        if (zVar == null) {
            m.r("adapter");
            zVar = null;
        }
        recyclerView.setAdapter(zVar);
        G0 g04 = this.f10914L;
        if (g04 == null) {
            m.r("binding");
            g04 = null;
        }
        RecyclerView recyclerView2 = g04.f15358c;
        m.d(recyclerView2, "list");
        new C1383g.a(recyclerView2, new InterfaceC1016l() { // from class: x0.J
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return Boolean.valueOf(UCIOptionsActivity.c3(this.f20290d, ((Integer) obj).intValue()));
            }
        }, new InterfaceC1016l() { // from class: x0.K
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return UCIOptionsActivity.d3(bVar, this, ((Integer) obj).intValue());
            }
        });
        G0 g05 = this.f10914L;
        if (g05 == null) {
            m.r("binding");
        } else {
            g03 = g05;
        }
        g03.f15357b.setOnClickListener(new View.OnClickListener() { // from class: x0.L
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UCIOptionsActivity.e3(bVar, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f0.AbstractActivityC0911o
    /* renamed from: f3, reason: merged with bridge method [inline-methods] */
    public cab.shashki.app.ui.chess.b U2() {
        return new cab.shashki.app.ui.chess.b(this.f10912J);
    }

    @Override // cab.shashki.app.ui.chess.c
    public void k1(V.b bVar) {
        startActivityForResult(new Intent(this, (Class<?>) StorageActivity.class).putExtra("request_file", true).putExtra("type", bVar != null ? bVar.ordinal() : -1), 97);
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i4, int i5, Intent intent) {
        String stringExtra;
        super.onActivityResult(i4, i5, intent);
        if (i5 == -1 && i4 == 97) {
            cab.shashki.app.ui.chess.b bVar = (cab.shashki.app.ui.chess.b) V2();
            if (intent == null || (stringExtra = intent.getStringExtra("request_file")) == null) {
                return;
            }
            bVar.Q0(stringExtra);
        }
    }

    @Override // f0.AbstractActivityC0911o, f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        G0 g0D = G0.d(getLayoutInflater());
        this.f10914L = g0D;
        if (g0D == null) {
            m.r("binding");
            g0D = null;
        }
        setContentView(g0D.a());
        AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L.H2(this, AbstractC0888D.H6, false, 2, null);
        C0573k c0573k = C0573k.f2973a;
        G0 g02 = this.f10914L;
        if (g02 == null) {
            m.r("binding");
            g02 = null;
        }
        RecyclerView recyclerView = g02.f15358c;
        m.d(recyclerView, "list");
        C0573k.v(c0573k, recyclerView, 0, 1, null);
        G0 g03 = this.f10914L;
        if (g03 == null) {
            m.r("binding");
            g03 = null;
        }
        ImageView imageView = g03.f15357b;
        m.d(imageView, "add");
        C0573k.s(c0573k, imageView, 0, 1, null);
        if (getIntent().hasExtra("type")) {
            String stringExtra = getIntent().getStringExtra("type");
            if (stringExtra == null) {
                stringExtra = "uci";
            }
            this.f10912J = stringExtra;
        }
        String str = this.f10912J;
        if (str.length() > 0) {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String strSubstring = str.substring(1);
            m.d(strSubstring, "substring(...)");
            str = upperCase + strSubstring;
        }
        a(str);
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onPause() {
        super.onPause();
        ((cab.shashki.app.ui.chess.b) V2()).R0(this);
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onResume() {
        super.onResume();
        ((cab.shashki.app.ui.chess.b) V2()).E0(this);
    }
}