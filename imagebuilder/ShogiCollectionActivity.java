package cab.shashki.app.ui.imagebuilder;

import C2.e;
import C2.g;
import T2.l;
import T2.u;
import U2.p;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.core.view.P;
import cab.shashki.app.ui.imagebuilder.ShogiCollectionActivity;
import e3.AbstractC0876b;
import e3.AbstractC0877c;
import f0.AbstractC0888D;
import f0.AbstractC0920x;
import g0.C0987p;
import g3.InterfaceC1016l;
import h3.h;
import h3.m;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import o0.C1218E;
import o0.H;
import p3.n;
import x2.AbstractC1488f;
import z2.AbstractC1559a;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class ShogiCollectionActivity extends cab.shashki.app.ui.imagebuilder.a {

    /* renamed from: P */
    public static final a f11747P = new a(null);

    /* renamed from: Q */
    private static final String f11748Q = ((H) p.G(C1218E.f18139a.r())).b();

    /* renamed from: M */
    private final String f11749M = "shogi";

    /* renamed from: N */
    private final Map f11750N = new LinkedHashMap();

    /* renamed from: O */
    private final Map f11751O = new LinkedHashMap();

    public static final class a {
        public /* synthetic */ a(h hVar) {
            this();
        }

        public final String a() {
            return ShogiCollectionActivity.f11748Q;
        }

        private a() {
        }
    }

    public static final boolean A3(View view) {
        m.e(view, "it");
        return view instanceof ImageView;
    }

    public static final void B3(ShogiCollectionActivity shogiCollectionActivity, char c4, View view) {
        shogiCollectionActivity.Z2(n.M(f11748Q, c4, 0, false, 6, null));
    }

    public static final void C3(ShogiCollectionActivity shogiCollectionActivity, View view) {
        if (!shogiCollectionActivity.s3()) {
            Toast.makeText(shogiCollectionActivity, AbstractC0888D.f14376H0, 0).show();
            return;
        }
        File filesDir = shogiCollectionActivity.getFilesDir();
        m.d(filesDir, "getFilesDir(...)");
        File fileV2 = shogiCollectionActivity.V2(filesDir);
        File file = new File(fileV2.getParent(), "_h1_" + (System.currentTimeMillis() / 1000));
        if (!fileV2.renameTo(file)) {
            Toast.makeText(shogiCollectionActivity, AbstractC0888D.f14518n0, 0).show();
            return;
        }
        String name = file.getName();
        m.d(name, "getName(...)");
        shogiCollectionActivity.X2(name);
    }

    private final l D3(File file, Uri uri, char c4) throws FileNotFoundException {
        File fileV2 = V2(file);
        InputStream inputStreamOpenInputStream = getContentResolver().openInputStream(uri);
        m.b(inputStreamOpenInputStream);
        File file2 = new File(fileV2, "w" + c4 + ".png");
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            AbstractC0876b.a(inputStreamOpenInputStream, fileOutputStream, 4096);
            AbstractC0877c.a(fileOutputStream, null);
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file2.getAbsolutePath());
            Matrix matrix = new Matrix();
            matrix.postRotate(180.0f);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, false);
            m.d(bitmapCreateBitmap, "createBitmap(...)");
            fileOutputStream = new FileOutputStream(new File(fileV2, "b" + c4 + ".png"));
            try {
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                AbstractC0877c.a(fileOutputStream, null);
                return new l(bitmapDecodeFile, bitmapCreateBitmap);
            } finally {
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public static final l E3(ShogiCollectionActivity shogiCollectionActivity, Uri uri, char c4) {
        File filesDir = shogiCollectionActivity.getFilesDir();
        m.d(filesDir, "getFilesDir(...)");
        return shogiCollectionActivity.D3(filesDir, uri, c4);
    }

    public static final u F3(ShogiCollectionActivity shogiCollectionActivity, char c4, l lVar) {
        m.e(lVar, "it");
        shogiCollectionActivity.f11750N.put(Character.valueOf(Character.toUpperCase(c4)), lVar.c());
        shogiCollectionActivity.f11750N.put(Character.valueOf(c4), lVar.d());
        return u.f3817a;
    }

    public static final u G3(InterfaceC1016l interfaceC1016l, Object obj) {
        m.e(obj, "p0");
        return (u) interfaceC1016l.o(obj);
    }

    public static final u H3(ShogiCollectionActivity shogiCollectionActivity, u uVar) {
        shogiCollectionActivity.L3();
        return u.f3817a;
    }

    public static final void I3(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    public static final u J3(ShogiCollectionActivity shogiCollectionActivity, Throwable th) {
        Toast.makeText(shogiCollectionActivity, AbstractC0888D.f14518n0, 0).show();
        return u.f3817a;
    }

    public static final void K3(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    private final void L3() {
        ImageView imageView;
        for (Map.Entry entry : this.f11750N.entrySet()) {
            if (Character.isUpperCase(((Character) entry.getKey()).charValue()) && (imageView = (ImageView) this.f11751O.get(Character.valueOf(Character.toLowerCase(((Character) entry.getKey()).charValue())))) != null) {
                imageView.setImageBitmap((Bitmap) entry.getValue());
            }
        }
    }

    private final boolean s3() {
        return this.f11750N.size() == f11748Q.length();
    }

    private final void t3() {
        final File filesDir = getFilesDir();
        AbstractC1488f abstractC1488fW = AbstractC1488f.q(new Callable() { // from class: J0.m1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ShogiCollectionActivity.w3(this.f2074d, filesDir);
            }
        }).H(S2.a.c()).w(AbstractC1559a.a());
        final InterfaceC1016l interfaceC1016l = new InterfaceC1016l() { // from class: J0.n1
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return ShogiCollectionActivity.x3(this.f2078d, (T2.u) obj);
            }
        };
        e eVar = new e() { // from class: J0.o1
            @Override // C2.e
            public final void accept(Object obj) {
                ShogiCollectionActivity.y3(interfaceC1016l, obj);
            }
        };
        final InterfaceC1016l interfaceC1016l2 = new InterfaceC1016l() { // from class: J0.p1
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return ShogiCollectionActivity.u3(this.f2086d, (Throwable) obj);
            }
        };
        A2.c cVarD = abstractC1488fW.D(eVar, new e() { // from class: J0.q1
            @Override // C2.e
            public final void accept(Object obj) {
                ShogiCollectionActivity.v3(interfaceC1016l2, obj);
            }
        });
        m.d(cVarD, "subscribe(...)");
        R2.a.a(cVarD, S2());
    }

    public static final u u3(ShogiCollectionActivity shogiCollectionActivity, Throwable th) {
        Toast.makeText(shogiCollectionActivity, AbstractC0888D.f14518n0, 0).show();
        th.printStackTrace();
        return u.f3817a;
    }

    public static final void v3(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    public static final u w3(ShogiCollectionActivity shogiCollectionActivity, File file) {
        m.b(file);
        File fileV2 = shogiCollectionActivity.V2(file);
        String str = f11748Q;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (Character.isUpperCase(cCharAt)) {
                String strValueOf = String.valueOf(cCharAt);
                m.c(strValueOf, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = strValueOf.toLowerCase(Locale.ROOT);
                m.d(lowerCase, "toLowerCase(...)");
                File file2 = new File(fileV2, "w" + lowerCase + ".png");
                if (!file2.exists()) {
                    file2 = null;
                }
                if (file2 != null) {
                    shogiCollectionActivity.f11750N.put(Character.valueOf(cCharAt), BitmapFactory.decodeFile(file2.getAbsolutePath()));
                }
            }
        }
        return u.f3817a;
    }

    public static final u x3(ShogiCollectionActivity shogiCollectionActivity, u uVar) {
        shogiCollectionActivity.L3();
        return u.f3817a;
    }

    public static final void y3(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    @Override // cab.shashki.app.ui.imagebuilder.a
    protected String T2() {
        return this.f11749M;
    }

    @Override // cab.shashki.app.ui.imagebuilder.a
    protected void Y2(int i4, final Uri uri) {
        m.e(uri, "uri");
        if (i4 >= 0) {
            String str = f11748Q;
            if (i4 < str.length()) {
                final char cCharAt = str.charAt(i4);
                AbstractC1488f abstractC1488fH = AbstractC1488f.q(new Callable() { // from class: J0.t1
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return ShogiCollectionActivity.E3(this.f2102d, uri, cCharAt);
                    }
                }).H(S2.a.c());
                final InterfaceC1016l interfaceC1016l = new InterfaceC1016l() { // from class: J0.u1
                    @Override // g3.InterfaceC1016l
                    public final Object o(Object obj) {
                        return ShogiCollectionActivity.F3(this.f2107d, cCharAt, (T2.l) obj);
                    }
                };
                AbstractC1488f abstractC1488fW = abstractC1488fH.v(new g() { // from class: J0.v1
                    @Override // C2.g
                    public final Object a(Object obj) {
                        return ShogiCollectionActivity.G3(interfaceC1016l, obj);
                    }
                }).w(AbstractC1559a.a());
                final InterfaceC1016l interfaceC1016l2 = new InterfaceC1016l() { // from class: J0.w1
                    @Override // g3.InterfaceC1016l
                    public final Object o(Object obj) {
                        return ShogiCollectionActivity.H3(this.f2119d, (T2.u) obj);
                    }
                };
                e eVar = new e() { // from class: J0.x1
                    @Override // C2.e
                    public final void accept(Object obj) {
                        ShogiCollectionActivity.I3(interfaceC1016l2, obj);
                    }
                };
                final InterfaceC1016l interfaceC1016l3 = new InterfaceC1016l() { // from class: J0.y1
                    @Override // g3.InterfaceC1016l
                    public final Object o(Object obj) {
                        return ShogiCollectionActivity.J3(this.f2128d, (Throwable) obj);
                    }
                };
                A2.c cVarD = abstractC1488fW.D(eVar, new e() { // from class: J0.z1
                    @Override // C2.e
                    public final void accept(Object obj) {
                        ShogiCollectionActivity.K3(interfaceC1016l3, obj);
                    }
                });
                m.d(cVarD, "subscribe(...)");
                R2.a.a(cVarD, S2());
            }
        }
    }

    @Override // cab.shashki.app.ui.imagebuilder.a, f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewFindViewById = findViewById(AbstractC0920x.D5);
        m.d(viewFindViewById, "findViewById(...)");
        for (View view : o3.h.i(P.a((ViewGroup) viewFindViewById), new InterfaceC1016l() { // from class: J0.l1
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return Boolean.valueOf(ShogiCollectionActivity.A3((View) obj));
            }
        })) {
            final char cCharAt = view.getTag().toString().charAt(0);
            Character chValueOf = Character.valueOf(cCharAt);
            Map map = this.f11751O;
            m.c(view, "null cannot be cast to non-null type android.widget.ImageView");
            map.put(chValueOf, (ImageView) view);
            view.setOnClickListener(new View.OnClickListener() { // from class: J0.r1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ShogiCollectionActivity.B3(this.f2094b, cCharAt, view2);
                }
            });
        }
        t3();
        findViewById(AbstractC0920x.r5).setOnClickListener(new View.OnClickListener() { // from class: J0.s1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ShogiCollectionActivity.C3(this.f2098b, view2);
            }
        });
    }

    @Override // cab.shashki.app.ui.imagebuilder.a
    /* renamed from: z3 */
    public C0987p U2() {
        C0987p c0987pD = C0987p.d(getLayoutInflater());
        m.d(c0987pD, "inflate(...)");
        return c0987pD;
    }
}