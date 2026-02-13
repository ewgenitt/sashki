package cab.shashki.app.ui.universal;

import N0.C0573k;
import T2.u;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.O;
import androidx.recyclerview.widget.RecyclerView;
import b.AbstractC0784a;
import cab.shashki.app.db.entities.CheckersParams;
import cab.shashki.app.db.entities.HalmaParams;
import cab.shashki.app.service.FairyRepository;
import cab.shashki.app.ui.chess.UCIOptionsActivity;
import cab.shashki.app.ui.chess.fairy.builder.quick.ConfigActivity;
import cab.shashki.app.ui.chess.fairy.builder.quick.QBuilderActivity;
import cab.shashki.app.ui.universal.CustomSettingsActivity;
import cab.shashki.app.ui.universal.e;
import com.google.android.material.snackbar.Snackbar;
import e2.C0873a;
import e2.C0874b;
import f0.AbstractActivityC0911o;
import f0.AbstractC0885A;
import f0.AbstractC0888D;
import f0.AbstractC0920x;
import f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L;
import g0.C0991r;
import g3.InterfaceC1016l;
import g3.InterfaceC1021q;
import h3.h;
import h3.l;
import h3.m;
import java.io.File;
import java.util.List;
import p3.n;
import t0.C1383g;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class CustomSettingsActivity extends AbstractActivityC0911o implements cab.shashki.app.ui.universal.e {

    /* renamed from: O, reason: collision with root package name */
    public static final a f11828O = new a(null);

    /* renamed from: J, reason: collision with root package name */
    private cab.shashki.app.ui.universal.c f11829J;

    /* renamed from: K, reason: collision with root package name */
    private C0991r f11830K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f11831L;

    /* renamed from: M, reason: collision with root package name */
    private final androidx.activity.result.c f11832M;

    /* renamed from: N, reason: collision with root package name */
    private final androidx.activity.result.c f11833N;

    public static final class a {
        public /* synthetic */ a(h hVar) {
            this();
        }

        private a() {
        }
    }

    /* synthetic */ class b extends l implements InterfaceC1016l {
        b(Object obj) {
            super(1, obj, cab.shashki.app.ui.universal.b.class, "open", "open(Lcab/shashki/app/db/entities/ICustomParams;)V", 0);
        }

        public final void m(cab.shashki.app.db.entities.a aVar) {
            m.e(aVar, "p0");
            ((cab.shashki.app.ui.universal.b) this.f16244e).E1(aVar);
        }

        @Override // g3.InterfaceC1016l
        public /* bridge */ /* synthetic */ Object o(Object obj) {
            m((cab.shashki.app.db.entities.a) obj);
            return u.f3817a;
        }
    }

    /* synthetic */ class c extends l implements InterfaceC1021q {
        c(Object obj) {
            super(3, obj, CustomSettingsActivity.class, "showMenu", "showMenu(Landroid/view/View;Lcab/shashki/app/ui/universal/ICustomSettings$ListItem;I)V", 0);
        }

        @Override // g3.InterfaceC1021q
        public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3) {
            m((View) obj, (e.a) obj2, ((Number) obj3).intValue());
            return u.f3817a;
        }

        public final void m(View view, e.a aVar, int i4) {
            m.e(view, "p0");
            m.e(aVar, "p1");
            ((CustomSettingsActivity) this.f16244e).I3(view, aVar, i4);
        }
    }

    public static final class d extends AbstractC0784a {
        d() {
        }

        @Override // b.AbstractC0784a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, File file) {
            m.e(context, "context");
            m.e(file, "input");
            Intent intentAddCategory = new Intent("android.intent.action.CREATE_DOCUMENT").setType("application/zip").putExtra("android.intent.extra.TITLE", file.getName()).addCategory("android.intent.category.OPENABLE");
            m.d(intentAddCategory, "addCategory(...)");
            return intentAddCategory;
        }

        @Override // b.AbstractC0784a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Uri c(int i4, Intent intent) {
            if (i4 != -1 || intent == null) {
                return null;
            }
            return intent.getData();
        }
    }

    public static final class e extends AbstractC0784a {
        e() {
        }

        @Override // b.AbstractC0784a
        public /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
            return d(context, ((Number) obj).intValue());
        }

        public Intent d(Context context, int i4) {
            m.e(context, "context");
            Intent intentAddCategory = new Intent("android.intent.action.GET_CONTENT").setType("application/zip").putExtra("android.intent.extra.sizeLimit", 2097152).addCategory("android.intent.category.OPENABLE");
            m.d(intentAddCategory, "addCategory(...)");
            return intentAddCategory;
        }

        @Override // b.AbstractC0784a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Uri c(int i4, Intent intent) {
            if (i4 != -1 || intent == null) {
                return null;
            }
            return intent.getData();
        }
    }

    public CustomSettingsActivity() {
        androidx.activity.result.c cVarD2 = d2(new d(), new androidx.activity.result.b() { // from class: M0.C0
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                CustomSettingsActivity.u3(this.f2588a, (Uri) obj);
            }
        });
        m.d(cVarD2, "registerForActivityResult(...)");
        this.f11832M = cVarD2;
        androidx.activity.result.c cVarD22 = d2(new e(), new androidx.activity.result.b() { // from class: M0.I0
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                CustomSettingsActivity.v3(this.f2607a, (Uri) obj);
            }
        });
        m.d(cVarD22, "registerForActivityResult(...)");
        this.f11833N = cVarD22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A3(CustomSettingsActivity customSettingsActivity, FairyRepository.a aVar, DialogInterface dialogInterface, int i4) {
        ((cab.shashki.app.ui.universal.b) customSettingsActivity.V2()).p1(aVar.c().getLib());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B3(CustomSettingsActivity customSettingsActivity, View view) {
        customSettingsActivity.H3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C3(CustomSettingsActivity customSettingsActivity, View view) {
        customSettingsActivity.J3(!customSettingsActivity.f11831L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D3(CustomSettingsActivity customSettingsActivity, View view) {
        customSettingsActivity.f11833N.a(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E3(View view) {
        view.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F3(CustomSettingsActivity customSettingsActivity, View view) {
        customSettingsActivity.startActivity(new Intent(customSettingsActivity, (Class<?>) BuilderActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G3(CustomSettingsActivity customSettingsActivity, View view) {
        customSettingsActivity.startActivity(new Intent(customSettingsActivity, (Class<?>) QBuilderActivity.class));
    }

    private final void H3() {
        C0873a c0873a = new C0873a(this);
        c0873a.j("QR_CODE");
        c0873a.l(8);
        c0873a.k(false);
        c0873a.i(false);
        c0873a.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I3(View view, e.a aVar, int i4) {
        O o4 = new O(this, view);
        cab.shashki.app.db.entities.a aVarB = aVar.b();
        if (aVarB instanceof CheckersParams) {
            w3(o4, (CheckersParams) aVar.b(), i4);
        } else if (aVarB instanceof FairyRepository.a) {
            x3(o4, (FairyRepository.a) aVar.b(), aVar.c(), i4);
        }
        o4.d(true);
        o4.f();
    }

    private final void J3(boolean z4) {
        this.f11831L = z4;
        C0991r c0991r = this.f11830K;
        C0991r c0991r2 = null;
        if (c0991r == null) {
            m.r("binding");
            c0991r = null;
        }
        c0991r.f15856e.setVisibility(z4 ? 0 : 8);
        C0991r c0991r3 = this.f11830K;
        if (c0991r3 == null) {
            m.r("binding");
            c0991r3 = null;
        }
        ImageView imageView = c0991r3.f15857f;
        C0991r c0991r4 = this.f11830K;
        if (c0991r4 == null) {
            m.r("binding");
            c0991r4 = null;
        }
        imageView.setVisibility(c0991r4.f15856e.getVisibility());
        C0991r c0991r5 = this.f11830K;
        if (c0991r5 == null) {
            m.r("binding");
            c0991r5 = null;
        }
        ImageView imageView2 = c0991r5.f15859h;
        C0991r c0991r6 = this.f11830K;
        if (c0991r6 == null) {
            m.r("binding");
            c0991r6 = null;
        }
        imageView2.setVisibility(c0991r6.f15856e.getVisibility());
        C0991r c0991r7 = this.f11830K;
        if (c0991r7 == null) {
            m.r("binding");
            c0991r7 = null;
        }
        ImageView imageView3 = c0991r7.f15863l;
        C0991r c0991r8 = this.f11830K;
        if (c0991r8 == null) {
            m.r("binding");
            c0991r8 = null;
        }
        imageView3.setVisibility(c0991r8.f15856e.getVisibility());
        C0991r c0991r9 = this.f11830K;
        if (c0991r9 == null) {
            m.r("binding");
            c0991r9 = null;
        }
        ImageView imageView4 = c0991r9.f15860i;
        C0991r c0991r10 = this.f11830K;
        if (c0991r10 == null) {
            m.r("binding");
            c0991r10 = null;
        }
        imageView4.setVisibility(c0991r10.f15856e.getVisibility());
        C0991r c0991r11 = this.f11830K;
        if (c0991r11 == null) {
            m.r("binding");
        } else {
            c0991r2 = c0991r11;
        }
        c0991r2.f15853b.animate().rotation(z4 ? 225.0f : 0.0f).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p3(CustomSettingsActivity customSettingsActivity, int i4) {
        cab.shashki.app.ui.universal.c cVar = customSettingsActivity.f11829J;
        cab.shashki.app.ui.universal.c cVar2 = null;
        if (cVar == null) {
            m.r("adapter");
            cVar = null;
        }
        e.a aVarI = cVar.I(i4);
        cab.shashki.app.db.entities.a aVarB = aVarI != null ? aVarI.b() : null;
        cab.shashki.app.ui.universal.c cVar3 = customSettingsActivity.f11829J;
        if (cVar3 == null) {
            m.r("adapter");
        } else {
            cVar2 = cVar3;
        }
        return (m.a(aVarB, cVar2.H()) || aVarB == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u q3(cab.shashki.app.ui.universal.b bVar, CustomSettingsActivity customSettingsActivity, int i4) {
        cab.shashki.app.ui.universal.c cVar = customSettingsActivity.f11829J;
        if (cVar == null) {
            m.r("adapter");
            cVar = null;
        }
        e.a aVarI = cVar.I(i4);
        bVar.j1(i4, aVarI != null ? aVarI.b() : null);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r3(cab.shashki.app.ui.universal.b bVar, View view) {
        bVar.F1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t3(A2.c cVar, CustomSettingsActivity customSettingsActivity, int i4, View view) {
        cVar.e();
        cab.shashki.app.ui.universal.c cVar2 = customSettingsActivity.f11829J;
        if (cVar2 == null) {
            m.r("adapter");
            cVar2 = null;
        }
        cVar2.n(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u3(CustomSettingsActivity customSettingsActivity, Uri uri) {
        cab.shashki.app.ui.universal.b bVar = (cab.shashki.app.ui.universal.b) customSettingsActivity.V2();
        if (uri == null) {
            return;
        }
        bVar.O1(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v3(CustomSettingsActivity customSettingsActivity, Uri uri) {
        cab.shashki.app.ui.universal.b bVar = (cab.shashki.app.ui.universal.b) customSettingsActivity.V2();
        if (uri == null) {
            return;
        }
        bVar.u1(uri);
    }

    private final void w3(O o4, final CheckersParams checkersParams, final int i4) {
        o4.c(AbstractC0885A.f14318f);
        o4.e(new O.c() { // from class: M0.F0
            @Override // androidx.appcompat.widget.O.c
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return CustomSettingsActivity.y3(this.f2596a, checkersParams, i4, menuItem);
            }
        });
        o4.a().findItem(AbstractC0920x.f15012e).setVisible(!m.a(checkersParams, ((cab.shashki.app.ui.universal.b) V2()).t1()));
    }

    private final void x3(O o4, final FairyRepository.a aVar, boolean z4, final int i4) {
        o4.c(AbstractC0885A.f14314b);
        o4.e(new O.c() { // from class: M0.G0
            @Override // androidx.appcompat.widget.O.c
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return CustomSettingsActivity.z3(this.f2600a, aVar, i4, menuItem);
            }
        });
        Menu menuA = o4.a();
        menuA.findItem(AbstractC0920x.f15082s).setVisible(z4);
        MenuItem menuItemFindItem = menuA.findItem(AbstractC0920x.f15092u);
        String strB = aVar.b();
        boolean z5 = false;
        menuItemFindItem.setVisible(!(strB == null || n.P(strB)));
        MenuItem menuItemFindItem2 = menuA.findItem(AbstractC0920x.f15097v);
        String variant = aVar.c().getVariant();
        cab.shashki.app.ui.universal.c cVar = null;
        if (variant == null || m.a(variant, "custom_cc")) {
            variant = null;
        }
        menuItemFindItem2.setVisible(variant != null);
        MenuItem menuItemFindItem3 = menuA.findItem(AbstractC0920x.f15012e);
        cab.shashki.app.ui.universal.c cVar2 = this.f11829J;
        if (cVar2 == null) {
            m.r("adapter");
        } else {
            cVar = cVar2;
        }
        menuItemFindItem3.setVisible(!m.a(aVar, cVar.H()));
        menuA.findItem(AbstractC0920x.f15017f).setVisible(aVar.c().getLib() != null);
        menuA.findItem(AbstractC0920x.f15112y).setVisible(Build.VERSION.SDK_INT >= 19);
        MenuItem menuItemFindItem4 = menuA.findItem(AbstractC0920x.f15022g);
        if (aVar.c().getPieceMap() != null && (aVar.c().getUniversalBoard() || aVar.c().getBoardFile() == null)) {
            z5 = true;
        }
        menuItemFindItem4.setVisible(z5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean y3(CustomSettingsActivity customSettingsActivity, CheckersParams checkersParams, int i4, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == AbstractC0920x.f15102w) {
            ((cab.shashki.app.ui.universal.b) customSettingsActivity.V2()).b2(checkersParams);
            return true;
        }
        if (itemId == AbstractC0920x.f15092u) {
            ((cab.shashki.app.ui.universal.b) customSettingsActivity.V2()).d2(checkersParams);
            return true;
        }
        if (itemId == AbstractC0920x.f15082s) {
            ((cab.shashki.app.ui.universal.b) customSettingsActivity.V2()).S1(checkersParams);
            return true;
        }
        if (itemId == AbstractC0920x.f15002c) {
            ((cab.shashki.app.ui.universal.b) customSettingsActivity.V2()).i1(checkersParams);
            return true;
        }
        if (itemId != AbstractC0920x.f15012e) {
            return true;
        }
        ((cab.shashki.app.ui.universal.b) customSettingsActivity.V2()).j1(i4, checkersParams);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z3(final CustomSettingsActivity customSettingsActivity, final FairyRepository.a aVar, int i4, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == AbstractC0920x.f15022g) {
            ((cab.shashki.app.ui.universal.b) customSettingsActivity.V2()).s1(aVar);
            return true;
        }
        if (itemId == AbstractC0920x.f15082s) {
            ((cab.shashki.app.ui.universal.b) customSettingsActivity.V2()).T1(aVar);
            return true;
        }
        if (itemId == AbstractC0920x.f15112y) {
            ((cab.shashki.app.ui.universal.b) customSettingsActivity.V2()).i2(aVar);
            return true;
        }
        if (itemId == AbstractC0920x.f15077r) {
            ((cab.shashki.app.ui.universal.b) customSettingsActivity.V2()).R1(aVar);
            return true;
        }
        if (itemId == AbstractC0920x.f15097v) {
            ((cab.shashki.app.ui.universal.b) customSettingsActivity.V2()).h2(aVar);
            return true;
        }
        if (itemId == AbstractC0920x.f15012e) {
            ((cab.shashki.app.ui.universal.b) customSettingsActivity.V2()).j1(i4, aVar);
            return true;
        }
        if (itemId == AbstractC0920x.f15092u) {
            ((cab.shashki.app.ui.universal.b) customSettingsActivity.V2()).e2(aVar);
            return true;
        }
        if (itemId != AbstractC0920x.f15017f) {
            return true;
        }
        new a.C0075a(customSettingsActivity).h(AbstractC0888D.f14463c0).q(AbstractC0888D.S6, new DialogInterface.OnClickListener() { // from class: M0.H0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                CustomSettingsActivity.A3(this.f2604b, aVar, dialogInterface, i5);
            }
        }).k(AbstractC0888D.f14505k2, null).x();
        return true;
    }

    @Override // cab.shashki.app.ui.universal.e
    public void N1(String str) {
        m.e(str, "config");
        startActivityForResult(new Intent(this, (Class<?>) ConfigActivity.class).putExtra("config", str), 1);
    }

    @Override // cab.shashki.app.ui.universal.e
    public void W0(String str) {
        m.e(str, HalmaParams.ID);
        startActivity(new Intent(this, (Class<?>) QBuilderActivity.class).putExtra("edit_id", str));
    }

    @Override // cab.shashki.app.ui.universal.e
    public void a1(List list, cab.shashki.app.db.entities.a aVar) {
        m.e(list, "list");
        C0991r c0991r = this.f11830K;
        cab.shashki.app.ui.universal.c cVar = null;
        if (c0991r == null) {
            m.r("binding");
            c0991r = null;
        }
        c0991r.f15855d.setVisibility(8);
        cab.shashki.app.ui.universal.c cVar2 = this.f11829J;
        if (cVar2 == null) {
            m.r("adapter");
        } else {
            cVar = cVar2;
        }
        cVar.N(list, aVar);
    }

    @Override // cab.shashki.app.ui.universal.e
    public void b(int i4) {
        startActivity(new Intent(this, (Class<?>) BuilderActivity.class).putExtra(HalmaParams.ID, i4).putExtra("template", true));
    }

    @Override // cab.shashki.app.ui.universal.e
    public void e() {
        C0991r c0991r = this.f11830K;
        if (c0991r == null) {
            m.r("binding");
            c0991r = null;
        }
        Snackbar.b0(c0991r.f15854c, AbstractC0888D.f14518n0, -1).R();
    }

    @Override // cab.shashki.app.ui.universal.e
    public void h0(String str) {
        m.e(str, "variant");
        startActivity(new Intent(this, (Class<?>) UCIOptionsActivity.class).putExtra("type", str));
    }

    @Override // cab.shashki.app.ui.universal.e
    public void i0(File file) {
        m.e(file, "zip");
        if (Build.VERSION.SDK_INT >= 19) {
            this.f11832M.a(file);
        }
    }

    @Override // cab.shashki.app.ui.universal.e
    public void j(Bitmap bitmap) {
        m.e(bitmap, "qr");
        C0991r c0991r = this.f11830K;
        C0991r c0991r2 = null;
        if (c0991r == null) {
            m.r("binding");
            c0991r = null;
        }
        c0991r.f15861j.setVisibility(0);
        C0991r c0991r3 = this.f11830K;
        if (c0991r3 == null) {
            m.r("binding");
        } else {
            c0991r2 = c0991r3;
        }
        c0991r2.f15861j.setImageBitmap(bitmap);
    }

    @Override // cab.shashki.app.ui.universal.e
    public void k0(Uri uri) {
        m.e(uri, "uri");
        startActivity(new Intent("android.intent.action.SEND").putExtra("android.intent.extra.STREAM", uri).addFlags(1).setType("application/zip"));
    }

    @Override // cab.shashki.app.ui.universal.e
    public void l(final int i4, int i5, final A2.c cVar) {
        m.e(cVar, "disposable");
        C0991r c0991r = this.f11830K;
        if (c0991r == null) {
            m.r("binding");
            c0991r = null;
        }
        Snackbar snackbarB0 = Snackbar.b0(c0991r.f15854c, AbstractC0888D.f14458b0, i5);
        m.d(snackbarB0, "make(...)");
        snackbarB0.e0(R.string.cancel, new View.OnClickListener() { // from class: M0.E0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomSettingsActivity.t3(cVar, this, i4, view);
            }
        });
        snackbarB0.R();
    }

    @Override // cab.shashki.app.ui.universal.e
    public void o() {
        C0991r c0991r = this.f11830K;
        if (c0991r == null) {
            m.r("binding");
            c0991r = null;
        }
        Snackbar.b0(c0991r.f15854c, AbstractC0888D.f14396M, -1).R();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f0.AbstractActivityC0911o
    /* renamed from: o3, reason: merged with bridge method [inline-methods] */
    public void S2(final cab.shashki.app.ui.universal.b bVar) {
        m.e(bVar, "presenter");
        super.S2(bVar);
        this.f11829J = new cab.shashki.app.ui.universal.c(new b(bVar), new c(this));
        C0991r c0991r = this.f11830K;
        C0991r c0991r2 = null;
        if (c0991r == null) {
            m.r("binding");
            c0991r = null;
        }
        RecyclerView recyclerView = c0991r.f15854c;
        cab.shashki.app.ui.universal.c cVar = this.f11829J;
        if (cVar == null) {
            m.r("adapter");
            cVar = null;
        }
        recyclerView.setAdapter(cVar);
        C0991r c0991r3 = this.f11830K;
        if (c0991r3 == null) {
            m.r("binding");
            c0991r3 = null;
        }
        RecyclerView recyclerView2 = c0991r3.f15854c;
        m.d(recyclerView2, "list");
        new C1383g.a(recyclerView2, new InterfaceC1016l() { // from class: M0.P0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return Boolean.valueOf(CustomSettingsActivity.p3(this.f2627d, ((Integer) obj).intValue()));
            }
        }, new InterfaceC1016l() { // from class: M0.Q0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return CustomSettingsActivity.q3(bVar, this, ((Integer) obj).intValue());
            }
        });
        C0991r c0991r4 = this.f11830K;
        if (c0991r4 == null) {
            m.r("binding");
        } else {
            c0991r2 = c0991r4;
        }
        c0991r2.f15859h.setOnClickListener(new View.OnClickListener() { // from class: M0.D0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomSettingsActivity.r3(bVar, view);
            }
        });
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i4, int i5, Intent intent) {
        String strA;
        super.onActivityResult(i4, i5, intent);
        if (i5 == -1) {
            if (i4 == 1 && intent != null && intent.hasExtra(HalmaParams.NAME)) {
                startActivity(intent.setClass(this, QBuilderActivity.class));
                return;
            }
            if (i4 == 8) {
                cab.shashki.app.ui.universal.b bVar = (cab.shashki.app.ui.universal.b) V2();
                C0874b c0874bH = C0873a.h(i5, intent);
                if (c0874bH == null || (strA = c0874bH.a()) == null) {
                    return;
                }
                bVar.G1(strA);
            }
        }
    }

    @Override // f0.AbstractActivityC0911o, f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0991r c0991rD = C0991r.d(getLayoutInflater());
        this.f11830K = c0991rD;
        C0991r c0991r = null;
        if (c0991rD == null) {
            m.r("binding");
            c0991rD = null;
        }
        setContentView(c0991rD.a());
        AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L.H2(this, AbstractC0888D.z5, false, 2, null);
        C0573k c0573k = C0573k.f2973a;
        C0991r c0991r2 = this.f11830K;
        if (c0991r2 == null) {
            m.r("binding");
            c0991r2 = null;
        }
        RecyclerView recyclerView = c0991r2.f15854c;
        m.d(recyclerView, "list");
        C0573k.v(c0573k, recyclerView, 0, 1, null);
        C0991r c0991r3 = this.f11830K;
        if (c0991r3 == null) {
            m.r("binding");
            c0991r3 = null;
        }
        LinearLayout linearLayout = c0991r3.f15858g;
        m.d(linearLayout, "panel");
        C0573k.s(c0573k, linearLayout, 0, 1, null);
        C0991r c0991r4 = this.f11830K;
        if (c0991r4 == null) {
            m.r("binding");
            c0991r4 = null;
        }
        c0991r4.f15860i.setOnClickListener(new View.OnClickListener() { // from class: M0.J0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomSettingsActivity.B3(this.f2610b, view);
            }
        });
        C0991r c0991r5 = this.f11830K;
        if (c0991r5 == null) {
            m.r("binding");
            c0991r5 = null;
        }
        c0991r5.f15853b.setOnClickListener(new View.OnClickListener() { // from class: M0.K0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomSettingsActivity.C3(this.f2613b, view);
            }
        });
        C0991r c0991r6 = this.f11830K;
        if (c0991r6 == null) {
            m.r("binding");
            c0991r6 = null;
        }
        c0991r6.f15863l.setOnClickListener(new View.OnClickListener() { // from class: M0.L0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomSettingsActivity.D3(this.f2616b, view);
            }
        });
        C0991r c0991r7 = this.f11830K;
        if (c0991r7 == null) {
            m.r("binding");
            c0991r7 = null;
        }
        c0991r7.f15861j.setOnClickListener(new View.OnClickListener() { // from class: M0.M0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomSettingsActivity.E3(view);
            }
        });
        C0991r c0991r8 = this.f11830K;
        if (c0991r8 == null) {
            m.r("binding");
            c0991r8 = null;
        }
        c0991r8.f15856e.setOnClickListener(new View.OnClickListener() { // from class: M0.N0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomSettingsActivity.F3(this.f2621b, view);
            }
        });
        C0991r c0991r9 = this.f11830K;
        if (c0991r9 == null) {
            m.r("binding");
        } else {
            c0991r = c0991r9;
        }
        c0991r.f15857f.setOnClickListener(new View.OnClickListener() { // from class: M0.O0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomSettingsActivity.G3(this.f2624b, view);
            }
        });
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onPause() {
        super.onPause();
        ((cab.shashki.app.ui.universal.b) V2()).v0(this);
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onResume() {
        super.onResume();
        ((cab.shashki.app.ui.universal.b) V2()).e1(this);
    }

    @Override // cab.shashki.app.ui.universal.e
    public void q(int i4) {
        startActivity(new Intent(this, (Class<?>) BuilderActivity.class).putExtra(HalmaParams.ID, i4));
    }

    @Override // cab.shashki.app.ui.universal.e
    public void s(String str) {
        m.e(str, HalmaParams.NAME);
        C0991r c0991r = this.f11830K;
        if (c0991r == null) {
            m.r("binding");
            c0991r = null;
        }
        Snackbar.c0(c0991r.f15854c, str, -1).R();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f0.AbstractActivityC0911o
    /* renamed from: s3, reason: merged with bridge method [inline-methods] */
    public cab.shashki.app.ui.universal.b U2() {
        return new cab.shashki.app.ui.universal.b();
    }
}