package cab.shashki.app.ui.imagebuilder;

import C2.e;
import C2.g;
import T2.l;
import T2.u;
import U2.p;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import cab.shashki.app.ui.imagebuilder.ChessCollectionActivity;
import f0.AbstractC0888D;
import g0.C0981m;
import g3.InterfaceC1016l;
import h3.h;
import h3.m;
import java.io.File;
import java.util.concurrent.Callable;
import x2.AbstractC1488f;
import z2.AbstractC1559a;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public class ChessCollectionActivity extends cab.shashki.app.ui.imagebuilder.a {

    /* renamed from: O, reason: collision with root package name */
    public static final b f11702O = new b(null);

    /* renamed from: M, reason: collision with root package name */
    private final a f11703M = new a(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);

    /* renamed from: N, reason: collision with root package name */
    private final String f11704N = "chess";

    public static final class b {
        public /* synthetic */ b(h hVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u A4(ChessCollectionActivity chessCollectionActivity, Throwable th) {
        Toast.makeText(chessCollectionActivity, AbstractC0888D.f14518n0, 0).show();
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B4(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    private final void C4(String str) {
        C0981m c0981m = (C0981m) R2();
        for (ImageView imageView : p.j(c0981m.f15774o, c0981m.f15776q, c0981m.f15773n, c0981m.f15771l, c0981m.f15775p, c0981m.f15772m, c0981m.f15765f, c0981m.f15767h, c0981m.f15764e, c0981m.f15762c, c0981m.f15766g, c0981m.f15763d)) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            m.c(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.f6650I = str;
            imageView.setLayoutParams(layoutParams2);
        }
    }

    private final void D4() {
        Bitmap bitmapJ = this.f11703M.j();
        if (bitmapJ != null) {
            ((C0981m) R2()).f15774o.setImageBitmap(bitmapJ);
        }
        Bitmap bitmapL = this.f11703M.l();
        if (bitmapL != null) {
            ((C0981m) R2()).f15776q.setImageBitmap(bitmapL);
        }
        Bitmap bitmapI = this.f11703M.i();
        if (bitmapI != null) {
            ((C0981m) R2()).f15773n.setImageBitmap(bitmapI);
        }
        Bitmap bitmapG = this.f11703M.g();
        if (bitmapG != null) {
            ((C0981m) R2()).f15771l.setImageBitmap(bitmapG);
        }
        Bitmap bitmapK = this.f11703M.k();
        if (bitmapK != null) {
            ((C0981m) R2()).f15775p.setImageBitmap(bitmapK);
        }
        Bitmap bitmapH = this.f11703M.h();
        if (bitmapH != null) {
            ((C0981m) R2()).f15772m.setImageBitmap(bitmapH);
        }
        Bitmap bitmapD = this.f11703M.d();
        if (bitmapD != null) {
            ((C0981m) R2()).f15765f.setImageBitmap(bitmapD);
        }
        Bitmap bitmapF = this.f11703M.f();
        if (bitmapF != null) {
            ((C0981m) R2()).f15767h.setImageBitmap(bitmapF);
        }
        Bitmap bitmapC = this.f11703M.c();
        if (bitmapC != null) {
            ((C0981m) R2()).f15764e.setImageBitmap(bitmapC);
        }
        Bitmap bitmapA = this.f11703M.a();
        if (bitmapA != null) {
            ((C0981m) R2()).f15762c.setImageBitmap(bitmapA);
        }
        Bitmap bitmapE = this.f11703M.e();
        if (bitmapE != null) {
            ((C0981m) R2()).f15766g.setImageBitmap(bitmapE);
        }
        Bitmap bitmapB = this.f11703M.b();
        if (bitmapB != null) {
            ((C0981m) R2()).f15763d.setImageBitmap(bitmapB);
        }
    }

    private final void O3() {
        final File filesDir = getFilesDir();
        AbstractC1488f abstractC1488fW = AbstractC1488f.q(new Callable() { // from class: J0.t0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ChessCollectionActivity.P3(this.f2100d, filesDir);
            }
        }).H(S2.a.c()).w(AbstractC1559a.a());
        final InterfaceC1016l interfaceC1016l = new InterfaceC1016l() { // from class: J0.u0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return ChessCollectionActivity.Q3(this.f2106d, (T2.u) obj);
            }
        };
        e eVar = new e() { // from class: J0.v0
            @Override // C2.e
            public final void accept(Object obj) {
                ChessCollectionActivity.R3(interfaceC1016l, obj);
            }
        };
        final InterfaceC1016l interfaceC1016l2 = new InterfaceC1016l() { // from class: J0.w0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return ChessCollectionActivity.S3(this.f2118d, (Throwable) obj);
            }
        };
        A2.c cVarD = abstractC1488fW.D(eVar, new e() { // from class: J0.x0
            @Override // C2.e
            public final void accept(Object obj) {
                ChessCollectionActivity.T3(interfaceC1016l2, obj);
            }
        });
        m.d(cVarD, "subscribe(...)");
        R2.a.a(cVarD, S2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u P3(ChessCollectionActivity chessCollectionActivity, File file) {
        m.b(file);
        File fileV2 = chessCollectionActivity.V2(file);
        File file2 = new File(fileV2, "wp.png");
        File file3 = new File(fileV2, "wr.png");
        File file4 = new File(fileV2, "wn.png");
        File file5 = new File(fileV2, "wb.png");
        File file6 = new File(fileV2, "wq.png");
        File file7 = new File(fileV2, "wk.png");
        File file8 = new File(fileV2, "bp.png");
        File file9 = new File(fileV2, "br.png");
        File file10 = new File(fileV2, "bn.png");
        File file11 = new File(fileV2, "bb.png");
        File file12 = new File(fileV2, "bq.png");
        File file13 = new File(fileV2, "bk.png");
        if (file2.exists()) {
            chessCollectionActivity.f11703M.w(BitmapFactory.decodeFile(file2.getAbsolutePath()));
        }
        if (file3.exists()) {
            chessCollectionActivity.f11703M.y(BitmapFactory.decodeFile(file3.getAbsolutePath()));
        }
        if (file4.exists()) {
            chessCollectionActivity.f11703M.v(BitmapFactory.decodeFile(file4.getAbsolutePath()));
        }
        if (file5.exists()) {
            chessCollectionActivity.f11703M.t(BitmapFactory.decodeFile(file5.getAbsolutePath()));
        }
        if (file6.exists()) {
            chessCollectionActivity.f11703M.x(BitmapFactory.decodeFile(file6.getAbsolutePath()));
        }
        if (file7.exists()) {
            chessCollectionActivity.f11703M.u(BitmapFactory.decodeFile(file7.getAbsolutePath()));
        }
        if (file8.exists()) {
            chessCollectionActivity.f11703M.q(BitmapFactory.decodeFile(file8.getAbsolutePath()));
        }
        if (file9.exists()) {
            chessCollectionActivity.f11703M.s(BitmapFactory.decodeFile(file9.getAbsolutePath()));
        }
        if (file10.exists()) {
            chessCollectionActivity.f11703M.p(BitmapFactory.decodeFile(file10.getAbsolutePath()));
        }
        if (file11.exists()) {
            chessCollectionActivity.f11703M.n(BitmapFactory.decodeFile(file11.getAbsolutePath()));
        }
        if (file12.exists()) {
            chessCollectionActivity.f11703M.r(BitmapFactory.decodeFile(file12.getAbsolutePath()));
        }
        if (file13.exists()) {
            chessCollectionActivity.f11703M.o(BitmapFactory.decodeFile(file13.getAbsolutePath()));
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u Q3(ChessCollectionActivity chessCollectionActivity, u uVar) {
        chessCollectionActivity.D4();
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R3(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u S3(ChessCollectionActivity chessCollectionActivity, Throwable th) {
        Toast.makeText(chessCollectionActivity, AbstractC0888D.f14518n0, 0).show();
        th.printStackTrace();
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T3(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V3(ChessCollectionActivity chessCollectionActivity, View view) {
        chessCollectionActivity.Z2(5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W3(ChessCollectionActivity chessCollectionActivity, View view) {
        chessCollectionActivity.Z2(7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X3(ChessCollectionActivity chessCollectionActivity, View view) {
        chessCollectionActivity.Z2(16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y3(ChessCollectionActivity chessCollectionActivity, View view) {
        chessCollectionActivity.Z2(15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z3(ChessCollectionActivity chessCollectionActivity, CompoundButton compoundButton, boolean z4) {
        chessCollectionActivity.C4(z4 ? "5:8" : "1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a4(ChessCollectionActivity chessCollectionActivity, View view) {
        if (!chessCollectionActivity.f11703M.m()) {
            Toast.makeText(chessCollectionActivity, AbstractC0888D.f14376H0, 0).show();
            return;
        }
        File filesDir = chessCollectionActivity.getFilesDir();
        m.d(filesDir, "getFilesDir(...)");
        File fileV2 = chessCollectionActivity.V2(filesDir);
        String parent = fileV2.getParent();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        File file = new File(parent, "_h" + (((C0981m) chessCollectionActivity.R2()).f15768i.isChecked() ? Float.valueOf(1.6f) : 1) + "_" + jCurrentTimeMillis);
        if (!fileV2.renameTo(file)) {
            Toast.makeText(chessCollectionActivity, AbstractC0888D.f14518n0, 0).show();
            return;
        }
        String name = file.getName();
        m.d(name, "getName(...)");
        chessCollectionActivity.X2(name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b4(ChessCollectionActivity chessCollectionActivity, View view) {
        chessCollectionActivity.Z2(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c4(ChessCollectionActivity chessCollectionActivity, View view) {
        chessCollectionActivity.Z2(6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d4(ChessCollectionActivity chessCollectionActivity, View view) {
        chessCollectionActivity.Z2(10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e4(ChessCollectionActivity chessCollectionActivity, View view) {
        chessCollectionActivity.Z2(9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f4(ChessCollectionActivity chessCollectionActivity, View view) {
        chessCollectionActivity.Z2(11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g4(ChessCollectionActivity chessCollectionActivity, View view) {
        chessCollectionActivity.Z2(13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h4(ChessCollectionActivity chessCollectionActivity, View view) {
        chessCollectionActivity.Z2(14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i4(ChessCollectionActivity chessCollectionActivity, View view) {
        chessCollectionActivity.Z2(12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u j4(ChessCollectionActivity chessCollectionActivity, Bitmap bitmap) {
        m.e(bitmap, "bitmap");
        chessCollectionActivity.f11703M.w(bitmap);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u k4(ChessCollectionActivity chessCollectionActivity, Bitmap bitmap) {
        m.e(bitmap, "bitmap");
        chessCollectionActivity.f11703M.y(bitmap);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u l4(ChessCollectionActivity chessCollectionActivity, Bitmap bitmap) {
        m.e(bitmap, "bitmap");
        chessCollectionActivity.f11703M.v(bitmap);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u m4(ChessCollectionActivity chessCollectionActivity, Bitmap bitmap) {
        m.e(bitmap, "bitmap");
        chessCollectionActivity.f11703M.t(bitmap);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u n4(ChessCollectionActivity chessCollectionActivity, Bitmap bitmap) {
        m.e(bitmap, "bitmap");
        chessCollectionActivity.f11703M.x(bitmap);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u o4(ChessCollectionActivity chessCollectionActivity, Bitmap bitmap) {
        m.e(bitmap, "bitmap");
        chessCollectionActivity.f11703M.u(bitmap);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u p4(ChessCollectionActivity chessCollectionActivity, Bitmap bitmap) {
        m.e(bitmap, "bitmap");
        chessCollectionActivity.f11703M.q(bitmap);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u q4(ChessCollectionActivity chessCollectionActivity, Bitmap bitmap) {
        m.e(bitmap, "bitmap");
        chessCollectionActivity.f11703M.s(bitmap);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u r4(ChessCollectionActivity chessCollectionActivity, Bitmap bitmap) {
        m.e(bitmap, "bitmap");
        chessCollectionActivity.f11703M.p(bitmap);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u s4(ChessCollectionActivity chessCollectionActivity, Bitmap bitmap) {
        m.e(bitmap, "bitmap");
        chessCollectionActivity.f11703M.n(bitmap);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u t4(ChessCollectionActivity chessCollectionActivity, Bitmap bitmap) {
        m.e(bitmap, "bitmap");
        chessCollectionActivity.f11703M.r(bitmap);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u u4(ChessCollectionActivity chessCollectionActivity, Bitmap bitmap) {
        m.e(bitmap, "bitmap");
        chessCollectionActivity.f11703M.o(bitmap);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap v4(ChessCollectionActivity chessCollectionActivity, File file, Uri uri, String str) {
        m.b(file);
        return chessCollectionActivity.W2(file, uri, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u w4(InterfaceC1016l interfaceC1016l, Bitmap bitmap) {
        m.e(bitmap, "it");
        interfaceC1016l.o(bitmap);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u x4(InterfaceC1016l interfaceC1016l, Object obj) {
        m.e(obj, "p0");
        return (u) interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u y4(ChessCollectionActivity chessCollectionActivity, u uVar) {
        chessCollectionActivity.D4();
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z4(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    @Override // cab.shashki.app.ui.imagebuilder.a
    protected String T2() {
        return this.f11704N;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cab.shashki.app.ui.imagebuilder.a
    /* renamed from: U3, reason: merged with bridge method [inline-methods] */
    public C0981m U2() {
        C0981m c0981mD = C0981m.d(getLayoutInflater());
        m.d(c0981mD, "inflate(...)");
        return c0981mD;
    }

    @Override // cab.shashki.app.ui.imagebuilder.a
    protected void Y2(int i4, final Uri uri) {
        l lVar;
        m.e(uri, "uri");
        final File filesDir = getFilesDir();
        switch (i4) {
            case 5:
                lVar = new l("wp.png", new InterfaceC1016l() { // from class: J0.T
                    @Override // g3.InterfaceC1016l
                    public final Object o(Object obj) {
                        return ChessCollectionActivity.j4(this.f1997d, (Bitmap) obj);
                    }
                });
                break;
            case 6:
                lVar = new l("wb.png", new InterfaceC1016l() { // from class: J0.W
                    @Override // g3.InterfaceC1016l
                    public final Object o(Object obj) {
                        return ChessCollectionActivity.m4(this.f2005d, (Bitmap) obj);
                    }
                });
                break;
            case 7:
                lVar = new l("wr.png", new InterfaceC1016l() { // from class: J0.U
                    @Override // g3.InterfaceC1016l
                    public final Object o(Object obj) {
                        return ChessCollectionActivity.k4(this.f1999d, (Bitmap) obj);
                    }
                });
                break;
            case 8:
                lVar = new l("wn.png", new InterfaceC1016l() { // from class: J0.V
                    @Override // g3.InterfaceC1016l
                    public final Object o(Object obj) {
                        return ChessCollectionActivity.l4(this.f2002d, (Bitmap) obj);
                    }
                });
                break;
            case 9:
                lVar = new l("wk.png", new InterfaceC1016l() { // from class: J0.Y
                    @Override // g3.InterfaceC1016l
                    public final Object o(Object obj) {
                        return ChessCollectionActivity.o4(this.f2012d, (Bitmap) obj);
                    }
                });
                break;
            case 10:
                lVar = new l("wq.png", new InterfaceC1016l() { // from class: J0.X
                    @Override // g3.InterfaceC1016l
                    public final Object o(Object obj) {
                        return ChessCollectionActivity.n4(this.f2008d, (Bitmap) obj);
                    }
                });
                break;
            case 11:
                lVar = new l("bp.png", new InterfaceC1016l() { // from class: J0.Z
                    @Override // g3.InterfaceC1016l
                    public final Object o(Object obj) {
                        return ChessCollectionActivity.p4(this.f2015d, (Bitmap) obj);
                    }
                });
                break;
            case 12:
                lVar = new l("bb.png", new InterfaceC1016l() { // from class: J0.c0
                    @Override // g3.InterfaceC1016l
                    public final Object o(Object obj) {
                        return ChessCollectionActivity.s4(this.f2027d, (Bitmap) obj);
                    }
                });
                break;
            case 13:
                lVar = new l("br.png", new InterfaceC1016l() { // from class: J0.a0
                    @Override // g3.InterfaceC1016l
                    public final Object o(Object obj) {
                        return ChessCollectionActivity.q4(this.f2019d, (Bitmap) obj);
                    }
                });
                break;
            case 14:
                lVar = new l("bn.png", new InterfaceC1016l() { // from class: J0.b0
                    @Override // g3.InterfaceC1016l
                    public final Object o(Object obj) {
                        return ChessCollectionActivity.r4(this.f2023d, (Bitmap) obj);
                    }
                });
                break;
            case 15:
                lVar = new l("bk.png", new InterfaceC1016l() { // from class: J0.p0
                    @Override // g3.InterfaceC1016l
                    public final Object o(Object obj) {
                        return ChessCollectionActivity.u4(this.f2085d, (Bitmap) obj);
                    }
                });
                break;
            case 16:
                lVar = new l("bq.png", new InterfaceC1016l() { // from class: J0.e0
                    @Override // g3.InterfaceC1016l
                    public final Object o(Object obj) {
                        return ChessCollectionActivity.t4(this.f2039d, (Bitmap) obj);
                    }
                });
                break;
            default:
                return;
        }
        final String str = (String) lVar.a();
        final InterfaceC1016l interfaceC1016l = (InterfaceC1016l) lVar.b();
        AbstractC1488f abstractC1488fH = AbstractC1488f.q(new Callable() { // from class: J0.y0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ChessCollectionActivity.v4(this.f2124d, filesDir, uri, str);
            }
        }).H(S2.a.c());
        final InterfaceC1016l interfaceC1016l2 = new InterfaceC1016l() { // from class: J0.z0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return ChessCollectionActivity.w4(interfaceC1016l, (Bitmap) obj);
            }
        };
        AbstractC1488f abstractC1488fW = abstractC1488fH.v(new g() { // from class: J0.A0
            @Override // C2.g
            public final Object a(Object obj) {
                return ChessCollectionActivity.x4(interfaceC1016l2, obj);
            }
        }).w(AbstractC1559a.a());
        final InterfaceC1016l interfaceC1016l3 = new InterfaceC1016l() { // from class: J0.B0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return ChessCollectionActivity.y4(this.f1933d, (T2.u) obj);
            }
        };
        e eVar = new e() { // from class: J0.C0
            @Override // C2.e
            public final void accept(Object obj) {
                ChessCollectionActivity.z4(interfaceC1016l3, obj);
            }
        };
        final InterfaceC1016l interfaceC1016l4 = new InterfaceC1016l() { // from class: J0.D0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return ChessCollectionActivity.A4(this.f1939d, (Throwable) obj);
            }
        };
        A2.c cVarD = abstractC1488fW.D(eVar, new e() { // from class: J0.E0
            @Override // C2.e
            public final void accept(Object obj) {
                ChessCollectionActivity.B4(interfaceC1016l4, obj);
            }
        });
        m.d(cVarD, "subscribe(...)");
        R2.a.a(cVarD, S2());
    }

    @Override // cab.shashki.app.ui.imagebuilder.a, f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        O3();
        ((C0981m) R2()).f15774o.setOnClickListener(new View.OnClickListener() { // from class: J0.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChessCollectionActivity.V3(this.f2032b, view);
            }
        });
        ((C0981m) R2()).f15776q.setOnClickListener(new View.OnClickListener() { // from class: J0.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChessCollectionActivity.W3(this.f2059b, view);
            }
        });
        ((C0981m) R2()).f15773n.setOnClickListener(new View.OnClickListener() { // from class: J0.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChessCollectionActivity.b4(this.f2063b, view);
            }
        });
        ((C0981m) R2()).f15771l.setOnClickListener(new View.OnClickListener() { // from class: J0.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChessCollectionActivity.c4(this.f2070b, view);
            }
        });
        ((C0981m) R2()).f15775p.setOnClickListener(new View.OnClickListener() { // from class: J0.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChessCollectionActivity.d4(this.f2073b, view);
            }
        });
        ((C0981m) R2()).f15772m.setOnClickListener(new View.OnClickListener() { // from class: J0.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChessCollectionActivity.e4(this.f2077b, view);
            }
        });
        ((C0981m) R2()).f15765f.setOnClickListener(new View.OnClickListener() { // from class: J0.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChessCollectionActivity.f4(this.f2081b, view);
            }
        });
        ((C0981m) R2()).f15767h.setOnClickListener(new View.OnClickListener() { // from class: J0.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChessCollectionActivity.g4(this.f2089b, view);
            }
        });
        ((C0981m) R2()).f15764e.setOnClickListener(new View.OnClickListener() { // from class: J0.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChessCollectionActivity.h4(this.f2093b, view);
            }
        });
        ((C0981m) R2()).f15762c.setOnClickListener(new View.OnClickListener() { // from class: J0.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChessCollectionActivity.i4(this.f2097b, view);
            }
        });
        ((C0981m) R2()).f15766g.setOnClickListener(new View.OnClickListener() { // from class: J0.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChessCollectionActivity.X3(this.f2043b, view);
            }
        });
        ((C0981m) R2()).f15763d.setOnClickListener(new View.OnClickListener() { // from class: J0.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChessCollectionActivity.Y3(this.f2047b, view);
            }
        });
        ((C0981m) R2()).f15768i.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: J0.h0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                ChessCollectionActivity.Z3(this.f2051a, compoundButton, z4);
            }
        });
        ((C0981m) R2()).f15769j.setOnClickListener(new View.OnClickListener() { // from class: J0.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChessCollectionActivity.a4(this.f2055b, view);
            }
        });
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Bitmap f11705a;

        /* renamed from: b, reason: collision with root package name */
        private Bitmap f11706b;

        /* renamed from: c, reason: collision with root package name */
        private Bitmap f11707c;

        /* renamed from: d, reason: collision with root package name */
        private Bitmap f11708d;

        /* renamed from: e, reason: collision with root package name */
        private Bitmap f11709e;

        /* renamed from: f, reason: collision with root package name */
        private Bitmap f11710f;

        /* renamed from: g, reason: collision with root package name */
        private Bitmap f11711g;

        /* renamed from: h, reason: collision with root package name */
        private Bitmap f11712h;

        /* renamed from: i, reason: collision with root package name */
        private Bitmap f11713i;

        /* renamed from: j, reason: collision with root package name */
        private Bitmap f11714j;

        /* renamed from: k, reason: collision with root package name */
        private Bitmap f11715k;

        /* renamed from: l, reason: collision with root package name */
        private Bitmap f11716l;

        public a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4, Bitmap bitmap5, Bitmap bitmap6, Bitmap bitmap7, Bitmap bitmap8, Bitmap bitmap9, Bitmap bitmap10, Bitmap bitmap11, Bitmap bitmap12) {
            this.f11705a = bitmap;
            this.f11706b = bitmap2;
            this.f11707c = bitmap3;
            this.f11708d = bitmap4;
            this.f11709e = bitmap5;
            this.f11710f = bitmap6;
            this.f11711g = bitmap7;
            this.f11712h = bitmap8;
            this.f11713i = bitmap9;
            this.f11714j = bitmap10;
            this.f11715k = bitmap11;
            this.f11716l = bitmap12;
        }

        public final Bitmap a() {
            return this.f11712h;
        }

        public final Bitmap b() {
            return this.f11715k;
        }

        public final Bitmap c() {
            return this.f11714j;
        }

        public final Bitmap d() {
            return this.f11711g;
        }

        public final Bitmap e() {
            return this.f11716l;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return m.a(this.f11705a, aVar.f11705a) && m.a(this.f11706b, aVar.f11706b) && m.a(this.f11707c, aVar.f11707c) && m.a(this.f11708d, aVar.f11708d) && m.a(this.f11709e, aVar.f11709e) && m.a(this.f11710f, aVar.f11710f) && m.a(this.f11711g, aVar.f11711g) && m.a(this.f11712h, aVar.f11712h) && m.a(this.f11713i, aVar.f11713i) && m.a(this.f11714j, aVar.f11714j) && m.a(this.f11715k, aVar.f11715k) && m.a(this.f11716l, aVar.f11716l);
        }

        public final Bitmap f() {
            return this.f11713i;
        }

        public final Bitmap g() {
            return this.f11706b;
        }

        public final Bitmap h() {
            return this.f11709e;
        }

        public int hashCode() {
            Bitmap bitmap = this.f11705a;
            int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
            Bitmap bitmap2 = this.f11706b;
            int iHashCode2 = (iHashCode + (bitmap2 == null ? 0 : bitmap2.hashCode())) * 31;
            Bitmap bitmap3 = this.f11707c;
            int iHashCode3 = (iHashCode2 + (bitmap3 == null ? 0 : bitmap3.hashCode())) * 31;
            Bitmap bitmap4 = this.f11708d;
            int iHashCode4 = (iHashCode3 + (bitmap4 == null ? 0 : bitmap4.hashCode())) * 31;
            Bitmap bitmap5 = this.f11709e;
            int iHashCode5 = (iHashCode4 + (bitmap5 == null ? 0 : bitmap5.hashCode())) * 31;
            Bitmap bitmap6 = this.f11710f;
            int iHashCode6 = (iHashCode5 + (bitmap6 == null ? 0 : bitmap6.hashCode())) * 31;
            Bitmap bitmap7 = this.f11711g;
            int iHashCode7 = (iHashCode6 + (bitmap7 == null ? 0 : bitmap7.hashCode())) * 31;
            Bitmap bitmap8 = this.f11712h;
            int iHashCode8 = (iHashCode7 + (bitmap8 == null ? 0 : bitmap8.hashCode())) * 31;
            Bitmap bitmap9 = this.f11713i;
            int iHashCode9 = (iHashCode8 + (bitmap9 == null ? 0 : bitmap9.hashCode())) * 31;
            Bitmap bitmap10 = this.f11714j;
            int iHashCode10 = (iHashCode9 + (bitmap10 == null ? 0 : bitmap10.hashCode())) * 31;
            Bitmap bitmap11 = this.f11715k;
            int iHashCode11 = (iHashCode10 + (bitmap11 == null ? 0 : bitmap11.hashCode())) * 31;
            Bitmap bitmap12 = this.f11716l;
            return iHashCode11 + (bitmap12 != null ? bitmap12.hashCode() : 0);
        }

        public final Bitmap i() {
            return this.f11708d;
        }

        public final Bitmap j() {
            return this.f11705a;
        }

        public final Bitmap k() {
            return this.f11710f;
        }

        public final Bitmap l() {
            return this.f11707c;
        }

        public final boolean m() {
            return (this.f11705a == null || this.f11706b == null || this.f11707c == null || this.f11708d == null || this.f11709e == null || this.f11710f == null || this.f11711g == null || this.f11712h == null || this.f11713i == null || this.f11714j == null || this.f11715k == null || this.f11716l == null) ? false : true;
        }

        public final void n(Bitmap bitmap) {
            this.f11712h = bitmap;
        }

        public final void o(Bitmap bitmap) {
            this.f11715k = bitmap;
        }

        public final void p(Bitmap bitmap) {
            this.f11714j = bitmap;
        }

        public final void q(Bitmap bitmap) {
            this.f11711g = bitmap;
        }

        public final void r(Bitmap bitmap) {
            this.f11716l = bitmap;
        }

        public final void s(Bitmap bitmap) {
            this.f11713i = bitmap;
        }

        public final void t(Bitmap bitmap) {
            this.f11706b = bitmap;
        }

        public String toString() {
            return "ChessImages(wp=" + this.f11705a + ", wb=" + this.f11706b + ", wr=" + this.f11707c + ", wn=" + this.f11708d + ", wk=" + this.f11709e + ", wq=" + this.f11710f + ", bp=" + this.f11711g + ", bb=" + this.f11712h + ", br=" + this.f11713i + ", bn=" + this.f11714j + ", bk=" + this.f11715k + ", bq=" + this.f11716l + ")";
        }

        public final void u(Bitmap bitmap) {
            this.f11709e = bitmap;
        }

        public final void v(Bitmap bitmap) {
            this.f11708d = bitmap;
        }

        public final void w(Bitmap bitmap) {
            this.f11705a = bitmap;
        }

        public final void x(Bitmap bitmap) {
            this.f11710f = bitmap;
        }

        public final void y(Bitmap bitmap) {
            this.f11707c = bitmap;
        }

        public /* synthetic */ a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4, Bitmap bitmap5, Bitmap bitmap6, Bitmap bitmap7, Bitmap bitmap8, Bitmap bitmap9, Bitmap bitmap10, Bitmap bitmap11, Bitmap bitmap12, int i4, h hVar) {
            this((i4 & 1) != 0 ? null : bitmap, (i4 & 2) != 0 ? null : bitmap2, (i4 & 4) != 0 ? null : bitmap3, (i4 & 8) != 0 ? null : bitmap4, (i4 & 16) != 0 ? null : bitmap5, (i4 & 32) != 0 ? null : bitmap6, (i4 & 64) != 0 ? null : bitmap7, (i4 & 128) != 0 ? null : bitmap8, (i4 & 256) != 0 ? null : bitmap9, (i4 & 512) != 0 ? null : bitmap10, (i4 & 1024) != 0 ? null : bitmap11, (i4 & 2048) != 0 ? null : bitmap12);
        }
    }
}