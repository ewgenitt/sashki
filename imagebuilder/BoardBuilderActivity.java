package cab.shashki.app.ui.imagebuilder;

import J0.C0466w;
import J0.T0;
import N0.C0573k;
import T2.u;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatSeekBar;
import cab.shashki.app.ui.imagebuilder.BoardBuilderActivity;
import com.google.android.material.snackbar.Snackbar;
import f0.AbstractActivityC0911o;
import f0.AbstractC0888D;
import f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L;
import g0.C0977k;
import g3.InterfaceC1016l;
import h3.h;
import h3.l;
import h3.m;
import j1.C1101i;
import java.io.IOException;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class BoardBuilderActivity extends AbstractActivityC0911o implements T0 {

    /* renamed from: K, reason: collision with root package name */
    public static final a f11693K = new a(null);

    /* renamed from: J, reason: collision with root package name */
    private C0977k f11694J;

    public static final class a {
        public /* synthetic */ a(h hVar) {
            this();
        }

        private a() {
        }
    }

    /* synthetic */ class b extends l implements InterfaceC1016l {
        b(Object obj) {
            super(1, obj, C0466w.class, "setOffsets", "setOffsets(Landroid/graphics/PointF;)V", 0);
        }

        public final void m(PointF pointF) {
            m.e(pointF, "p0");
            ((C0466w) this.f16244e).j1(pointF);
        }

        @Override // g3.InterfaceC1016l
        public /* bridge */ /* synthetic */ Object o(Object obj) {
            m((PointF) obj);
            return u.f3817a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u d3(C0466w c0466w, int i4) {
        c0466w.k1(i4 / 10.0f);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e3(BoardBuilderActivity boardBuilderActivity, View view) {
        boardBuilderActivity.i3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f3(C0466w c0466w, View view) {
        c0466w.T0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g3(C0466w c0466w, BoardBuilderActivity boardBuilderActivity, View view) {
        C0977k c0977k = boardBuilderActivity.f11694J;
        if (c0977k == null) {
            m.r("binding");
            c0977k = null;
        }
        c0466w.l1(c0977k.f15721g.isChecked());
    }

    private final void i3() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        intent.addCategory("android.intent.category.OPENABLE");
        try {
            startActivityForResult(Intent.createChooser(intent, getString(AbstractC0888D.f14384J)), 5);
        } catch (Exception unused) {
            C0977k c0977k = this.f11694J;
            if (c0977k == null) {
                m.r("binding");
                c0977k = null;
            }
            Snackbar.b0(c0977k.f15717c, AbstractC0888D.f14518n0, -1).R();
        }
    }

    @Override // J0.T0
    public void N(C1101i c1101i) {
        m.e(c1101i, "svg");
        C0977k c0977k = this.f11694J;
        if (c0977k == null) {
            m.r("binding");
            c0977k = null;
        }
        c0977k.f15716b.setSvg(c1101i);
    }

    @Override // J0.T0
    public void P0(int i4) {
        C0977k c0977k = this.f11694J;
        if (c0977k == null) {
            m.r("binding");
            c0977k = null;
        }
        Snackbar.b0(c0977k.f15719e, i4, -1).R();
    }

    @Override // J0.T0
    public void U(PointF pointF) {
        m.e(pointF, "offsets");
        C0977k c0977k = this.f11694J;
        if (c0977k == null) {
            m.r("binding");
            c0977k = null;
        }
        c0977k.f15716b.setOffsets(pointF);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f0.AbstractActivityC0911o
    /* renamed from: c3, reason: merged with bridge method [inline-methods] */
    public void S2(final C0466w c0466w) {
        m.e(c0466w, "presenter");
        super.S2(c0466w);
        C0977k c0977k = this.f11694J;
        C0977k c0977k2 = null;
        if (c0977k == null) {
            m.r("binding");
            c0977k = null;
        }
        c0977k.f15716b.setOffsetListener(new b(c0466w));
        C0573k c0573k = C0573k.f2973a;
        C0977k c0977k3 = this.f11694J;
        if (c0977k3 == null) {
            m.r("binding");
            c0977k3 = null;
        }
        AppCompatSeekBar appCompatSeekBar = c0977k3.f15720f;
        m.d(appCompatSeekBar, "scale");
        c0573k.y(appCompatSeekBar, new InterfaceC1016l() { // from class: J0.a
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return BoardBuilderActivity.d3(c0466w, ((Integer) obj).intValue());
            }
        });
        C0977k c0977k4 = this.f11694J;
        if (c0977k4 == null) {
            m.r("binding");
            c0977k4 = null;
        }
        c0977k4.f15717c.setOnClickListener(new View.OnClickListener() { // from class: J0.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardBuilderActivity.e3(this.f2022b, view);
            }
        });
        C0977k c0977k5 = this.f11694J;
        if (c0977k5 == null) {
            m.r("binding");
            c0977k5 = null;
        }
        c0977k5.f15719e.setOnClickListener(new View.OnClickListener() { // from class: J0.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardBuilderActivity.f3(c0466w, view);
            }
        });
        C0977k c0977k6 = this.f11694J;
        if (c0977k6 == null) {
            m.r("binding");
        } else {
            c0977k2 = c0977k6;
        }
        c0977k2.f15721g.setOnClickListener(new View.OnClickListener() { // from class: J0.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoardBuilderActivity.g3(c0466w, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f0.AbstractActivityC0911o
    /* renamed from: h3, reason: merged with bridge method [inline-methods] */
    public C0466w U2() {
        return new C0466w();
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i4, int i5, Intent intent) throws IOException {
        Uri data;
        super.onActivityResult(i4, i5, intent);
        if (i4 != 5 || i5 != -1 || intent == null || (data = intent.getData()) == null) {
            return;
        }
        ((C0466w) V2()).R0(this, data);
    }

    @Override // f0.AbstractActivityC0911o, f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0977k c0977kD = C0977k.d(getLayoutInflater());
        this.f11694J = c0977kD;
        if (c0977kD == null) {
            m.r("binding");
            c0977kD = null;
        }
        setContentView(c0977kD.a());
        AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L.H2(this, AbstractC0888D.T3, false, 2, null);
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onPause() {
        super.onPause();
        ((C0466w) V2()).v0(this);
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onResume() {
        super.onResume();
        ((C0466w) V2()).O0(this);
    }

    @Override // J0.T0
    public void s0(float f4) {
        C0977k c0977k = this.f11694J;
        C0977k c0977k2 = null;
        if (c0977k == null) {
            m.r("binding");
            c0977k = null;
        }
        c0977k.f15716b.setScale(f4);
        C0977k c0977k3 = this.f11694J;
        if (c0977k3 == null) {
            m.r("binding");
        } else {
            c0977k2 = c0977k3;
        }
        c0977k2.f15720f.setProgress((int) (f4 * 10));
    }

    @Override // J0.T0
    public void t0(boolean z4) {
        C0977k c0977k = this.f11694J;
        C0977k c0977k2 = null;
        if (c0977k == null) {
            m.r("binding");
            c0977k = null;
        }
        c0977k.f15719e.setVisibility(z4 ? 8 : 0);
        C0977k c0977k3 = this.f11694J;
        if (c0977k3 == null) {
            m.r("binding");
            c0977k3 = null;
        }
        AppCompatSeekBar appCompatSeekBar = c0977k3.f15720f;
        C0977k c0977k4 = this.f11694J;
        if (c0977k4 == null) {
            m.r("binding");
        } else {
            c0977k2 = c0977k4;
        }
        appCompatSeekBar.setVisibility(c0977k2.f15719e.getVisibility());
    }

    @Override // J0.T0
    public Bitmap v1() {
        C0977k c0977k = this.f11694J;
        if (c0977k == null) {
            m.r("binding");
            c0977k = null;
        }
        return c0977k.f15716b.getBitmap();
    }

    @Override // J0.T0
    public void y1(Drawable drawable, float f4) {
        m.e(drawable, "drawable");
        C0977k c0977k = this.f11694J;
        if (c0977k == null) {
            m.r("binding");
            c0977k = null;
        }
        c0977k.f15716b.c(drawable, f4);
    }
}