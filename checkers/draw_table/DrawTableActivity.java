package cab.shashki.app.ui.checkers.draw_table;

import I0.Z1;
import N0.C0573k;
import N0.K;
import T2.j;
import android.R;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.app.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import cab.shashki.app.ui.checkers.draw_table.DrawTableActivity;
import com.google.android.material.snackbar.Snackbar;
import f0.AbstractActivityC0911o;
import f0.AbstractC0888D;
import f0.AbstractC0918v;
import f0.AbstractC0922z;
import f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L;
import g0.C0995u;
import g0.C0997w;
import g3.InterfaceC1016l;
import g3.InterfaceC1020p;
import h3.h;
import h3.l;
import h3.m;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import q0.C1277a;
import w0.t;
import w0.u;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class DrawTableActivity extends AbstractActivityC0911o implements u {

    /* renamed from: L, reason: collision with root package name */
    public static final a f10880L = new a(null);

    /* renamed from: J, reason: collision with root package name */
    private b f10881J;

    /* renamed from: K, reason: collision with root package name */
    private C0997w f10882K;

    public static final class a {
        public /* synthetic */ a(h hVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends RecyclerView.h {

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC1020p f10883d;

        /* renamed from: e, reason: collision with root package name */
        private final List f10884e;

        /* renamed from: f, reason: collision with root package name */
        private String f10885f;

        public b(InterfaceC1020p interfaceC1020p) {
            m.e(interfaceC1020p, "select");
            this.f10883d = interfaceC1020p;
            this.f10884e = new ArrayList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void I(b bVar, File file, c cVar, View view) {
            bVar.f10883d.k(file, Boolean.valueOf(cVar.O().f15892c.isChecked()));
        }

        public final File G(int i4) {
            return (File) this.f10884e.get(i4);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public void u(final c cVar, int i4) {
            m.e(cVar, "holder");
            final File file = (File) this.f10884e.get(i4);
            cVar.O().f15893d.setText(cVar.f9119a.getContext().getString(AbstractC0888D.f14386J1, Float.valueOf((file.length() / 1024) / 1024.0f)));
            cVar.O().f15894e.setText(K.f2926a.w().format(new Date(file.lastModified())));
            cVar.O().f15892c.setText(file.getName());
            cVar.O().f15892c.setChecked(m.a(file.getAbsolutePath(), this.f10885f));
            cVar.O().f15892c.setOnClickListener(new View.OnClickListener() { // from class: w0.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DrawTableActivity.b.I(this.f20067b, file, cVar, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public c w(ViewGroup viewGroup, int i4) {
            m.e(viewGroup, "parent");
            C0995u c0995uD = C0995u.d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            m.d(c0995uD, "inflate(...)");
            return new c(c0995uD);
        }

        public final void K(List list, String str) {
            m.e(list, "elements");
            this.f10884e.clear();
            this.f10884e.addAll(list);
            this.f10885f = str;
            m();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int h() {
            return this.f10884e.size();
        }
    }

    public static final class c extends RecyclerView.D {

        /* renamed from: u, reason: collision with root package name */
        private final C0995u f10886u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C0995u c0995u) {
            super(c0995u.a());
            m.e(c0995u, "binding");
            this.f10886u = c0995u;
        }

        public final C0995u O() {
            return this.f10886u;
        }
    }

    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10887a;

        static {
            int[] iArr = new int[C1277a.EnumC0198a.values().length];
            try {
                iArr[C1277a.EnumC0198a.f19015f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C1277a.EnumC0198a.f19016g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C1277a.EnumC0198a.f19017h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C1277a.EnumC0198a.f19018i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C1277a.EnumC0198a.f19020k.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C1277a.EnumC0198a.f19021l.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[C1277a.EnumC0198a.f19019j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[C1277a.EnumC0198a.f19022m.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f10887a = iArr;
        }
    }

    /* synthetic */ class e extends l implements InterfaceC1020p {
        e(Object obj) {
            super(2, obj, t.class, "selectFile", "selectFile(Ljava/io/File;Z)V", 0);
        }

        @Override // g3.InterfaceC1020p
        public /* bridge */ /* synthetic */ Object k(Object obj, Object obj2) {
            m((File) obj, ((Boolean) obj2).booleanValue());
            return T2.u.f3817a;
        }

        public final void m(File file, boolean z4) {
            m.e(file, "p0");
            ((t) this.f16244e).f1(file, z4);
        }
    }

    private final void c3() {
        Intent intentPutExtra = new Intent("android.intent.action.GET_CONTENT").setType("text/plain").addCategory("android.intent.category.OPENABLE").putExtra("android.intent.extra.sizeLimit", 65536);
        m.d(intentPutExtra, "putExtra(...)");
        try {
            startActivityForResult(Intent.createChooser(intentPutExtra, getString(AbstractC0888D.f14477f)), 17);
        } catch (Exception unused) {
            C0997w c0997w = this.f10882K;
            if (c0997w == null) {
                m.r("binding");
                c0997w = null;
            }
            Snackbar.b0(c0997w.f15914e, AbstractC0888D.f14518n0, -1).R();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e3(t tVar, View view) {
        tVar.Y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final T2.u f3(t tVar, DrawTableActivity drawTableActivity, int i4) {
        b bVar = drawTableActivity.f10881J;
        if (bVar == null) {
            m.r("adapter");
            bVar = null;
        }
        tVar.W0(bVar.G(i4));
        return T2.u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final T2.u g3(t tVar, DrawTableActivity drawTableActivity, int i4) {
        b bVar = drawTableActivity.f10881J;
        if (bVar == null) {
            m.r("adapter");
            bVar = null;
        }
        tVar.i1(bVar.G(i4));
        return T2.u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h3(DrawTableActivity drawTableActivity, View view) {
        drawTableActivity.c3();
    }

    @Override // f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L
    protected int K2() {
        return AbstractC0918v.f14762c3;
    }

    @Override // f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L
    protected void L2() {
        new a.C0075a(this).w(getLayoutInflater().inflate(AbstractC0922z.f15124A, (ViewGroup) null)).q(R.string.ok, null).x();
    }

    @Override // w0.u
    public void Y0(List list, String str) {
        m.e(list, "tables");
        b bVar = null;
        C0997w c0997w = null;
        if (list.isEmpty()) {
            C0997w c0997w2 = this.f10882K;
            if (c0997w2 == null) {
                m.r("binding");
                c0997w2 = null;
            }
            c0997w2.f15916g.setVisibility(0);
            C0997w c0997w3 = this.f10882K;
            if (c0997w3 == null) {
                m.r("binding");
            } else {
                c0997w = c0997w3;
            }
            c0997w.f15912c.setVisibility(8);
            return;
        }
        C0997w c0997w4 = this.f10882K;
        if (c0997w4 == null) {
            m.r("binding");
            c0997w4 = null;
        }
        c0997w4.f15916g.setVisibility(8);
        C0997w c0997w5 = this.f10882K;
        if (c0997w5 == null) {
            m.r("binding");
            c0997w5 = null;
        }
        c0997w5.f15912c.setVisibility(0);
        b bVar2 = this.f10881J;
        if (bVar2 == null) {
            m.r("adapter");
        } else {
            bVar = bVar2;
        }
        bVar.K(list, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f0.AbstractActivityC0911o
    /* renamed from: d3, reason: merged with bridge method [inline-methods] */
    public void S2(final t tVar) {
        int i4;
        m.e(tVar, "presenter");
        super.S2(tVar);
        switch (d.f10887a[tVar.a1().ordinal()]) {
            case 1:
                i4 = AbstractC0888D.f14448Z;
                break;
            case 2:
                i4 = AbstractC0888D.f14424T;
                break;
            case 3:
                i4 = AbstractC0888D.f14436W;
                break;
            case 4:
                i4 = AbstractC0888D.f14432V;
                break;
            case 5:
                i4 = AbstractC0888D.f14440X;
                break;
            case 6:
                i4 = AbstractC0888D.f14428U;
                break;
            case 7:
                i4 = AbstractC0888D.f14444Y;
                break;
            case 8:
                i4 = AbstractC0888D.f14453a0;
                break;
            default:
                throw new j();
        }
        setTitle(i4);
        C0997w c0997w = this.f10882K;
        C0997w c0997w2 = null;
        if (c0997w == null) {
            m.r("binding");
            c0997w = null;
        }
        c0997w.f15916g.setOnClickListener(new View.OnClickListener() { // from class: w0.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DrawTableActivity.e3(tVar, view);
            }
        });
        this.f10881J = new b(new e(tVar));
        C0997w c0997w3 = this.f10882K;
        if (c0997w3 == null) {
            m.r("binding");
            c0997w3 = null;
        }
        RecyclerView recyclerView = c0997w3.f15912c;
        b bVar = this.f10881J;
        if (bVar == null) {
            m.r("adapter");
            bVar = null;
        }
        recyclerView.setAdapter(bVar);
        f fVar = new f(new Z1(new InterfaceC1016l() { // from class: w0.b
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return DrawTableActivity.f3(tVar, this, ((Integer) obj).intValue());
            }
        }, new InterfaceC1016l() { // from class: w0.c
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return DrawTableActivity.g3(tVar, this, ((Integer) obj).intValue());
            }
        }));
        C0997w c0997w4 = this.f10882K;
        if (c0997w4 == null) {
            m.r("binding");
            c0997w4 = null;
        }
        fVar.m(c0997w4.f15912c);
        C0997w c0997w5 = this.f10882K;
        if (c0997w5 == null) {
            m.r("binding");
        } else {
            c0997w2 = c0997w5;
        }
        c0997w2.f15911b.setOnClickListener(new View.OnClickListener() { // from class: w0.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DrawTableActivity.h3(this.f20066b, view);
            }
        });
    }

    @Override // w0.u
    public void e0(boolean z4) {
        C0997w c0997w = this.f10882K;
        C0997w c0997w2 = null;
        if (c0997w == null) {
            m.r("binding");
            c0997w = null;
        }
        c0997w.f15911b.setVisibility(z4 ? 0 : 4);
        C0997w c0997w3 = this.f10882K;
        if (c0997w3 == null) {
            m.r("binding");
            c0997w3 = null;
        }
        ProgressBar progressBar = c0997w3.f15913d;
        C0997w c0997w4 = this.f10882K;
        if (c0997w4 == null) {
            m.r("binding");
        } else {
            c0997w2 = c0997w4;
        }
        progressBar.setVisibility(c0997w2.f15911b.getVisibility() ^ 4);
    }

    @Override // w0.u
    public void e1(String str) {
        m.e(str, "path");
        startActivity(new Intent(this, (Class<?>) PreviewTableActivity.class).putExtra("variant", ((t) V2()).a1().b()).putExtra("file", str));
    }

    @Override // w0.u
    public void f(String str) {
        C0997w c0997w = this.f10882K;
        if (c0997w == null) {
            m.r("binding");
            c0997w = null;
        }
        ConstraintLayout constraintLayout = c0997w.f15914e;
        if (str == null) {
            str = getString(AbstractC0888D.f14518n0);
            m.d(str, "getString(...)");
        }
        Snackbar.c0(constraintLayout, str, -1).R();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f0.AbstractActivityC0911o
    /* renamed from: i3, reason: merged with bridge method [inline-methods] */
    public t U2() {
        C1277a.EnumC0198a.C0199a c0199a = C1277a.EnumC0198a.f19014e;
        Intent intent = getIntent();
        C1277a.EnumC0198a enumC0198aA = c0199a.a(intent != null ? intent.getStringExtra("variant") : null);
        if (enumC0198aA == null) {
            enumC0198aA = C1277a.EnumC0198a.f19015f;
        }
        return new t(enumC0198aA);
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i4, int i5, Intent intent) {
        Uri data;
        super.onActivityResult(i4, i5, intent);
        if (i5 != -1 || i4 != 17 || intent == null || (data = intent.getData()) == null) {
            return;
        }
        ((t) V2()).c1(data);
    }

    @Override // f0.AbstractActivityC0911o, f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0997w c0997wD = C0997w.d(getLayoutInflater());
        this.f10882K = c0997wD;
        if (c0997wD == null) {
            m.r("binding");
            c0997wD = null;
        }
        setContentView(c0997wD.a());
        AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L.H2(this, AbstractC0888D.K6, false, 2, null);
        C0573k c0573k = C0573k.f2973a;
        C0997w c0997w = this.f10882K;
        if (c0997w == null) {
            m.r("binding");
            c0997w = null;
        }
        RecyclerView recyclerView = c0997w.f15912c;
        m.d(recyclerView, "list");
        C0573k.v(c0573k, recyclerView, 0, 1, null);
        C0997w c0997w2 = this.f10882K;
        if (c0997w2 == null) {
            m.r("binding");
            c0997w2 = null;
        }
        ImageView imageView = c0997w2.f15911b;
        m.d(imageView, "add");
        C0573k.s(c0573k, imageView, 0, 1, null);
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onPause() {
        super.onPause();
        ((t) V2()).v0(this);
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onResume() {
        super.onResume();
        ((t) V2()).T0(this);
    }

    @Override // w0.u
    public void x() {
        C0997w c0997w = this.f10882K;
        if (c0997w == null) {
            m.r("binding");
            c0997w = null;
        }
        Snackbar.b0(c0997w.f15914e, AbstractC0888D.f14478f0, -1).R();
    }
}