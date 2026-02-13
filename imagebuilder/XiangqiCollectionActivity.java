package cab.shashki.app.ui.imagebuilder;

import C2.e;
import C2.g;
import T2.l;
import T2.u;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import cab.shashki.app.ui.imagebuilder.XiangqiCollectionActivity;
import f0.AbstractC0888D;
import g0.C0989q;
import g3.InterfaceC1016l;
import h3.h;
import h3.m;
import java.io.File;
import java.util.concurrent.Callable;
import x2.AbstractC1488f;
import z2.AbstractC1559a;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class XiangqiCollectionActivity extends cab.shashki.app.ui.imagebuilder.a {

    /* renamed from: O, reason: collision with root package name */
    public static final a f11752O = new a(null);

    /* renamed from: M, reason: collision with root package name */
    private final b f11753M = new b(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);

    /* renamed from: N, reason: collision with root package name */
    private final String f11754N = "xiangqi";

    public static final class a {
        public /* synthetic */ a(h hVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u A4(XiangqiCollectionActivity xiangqiCollectionActivity, Bitmap bitmap) {
        m.e(bitmap, "bitmap");
        xiangqiCollectionActivity.f11753M.p(bitmap);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap B4(XiangqiCollectionActivity xiangqiCollectionActivity, File file, Uri uri, String str) {
        m.b(file);
        return xiangqiCollectionActivity.W2(file, uri, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u C4(InterfaceC1016l interfaceC1016l, Bitmap bitmap) {
        m.e(bitmap, "it");
        interfaceC1016l.o(bitmap);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u D4(InterfaceC1016l interfaceC1016l, Object obj) {
        m.e(obj, "p0");
        return (u) interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u E4(XiangqiCollectionActivity xiangqiCollectionActivity, u uVar) {
        xiangqiCollectionActivity.I4();
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F4(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u G4(XiangqiCollectionActivity xiangqiCollectionActivity, Throwable th) {
        Toast.makeText(xiangqiCollectionActivity, AbstractC0888D.f14518n0, 0).show();
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H4(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    private final void I4() {
        Bitmap bitmapM = this.f11753M.m();
        if (bitmapM != null) {
            ((C0989q) R2()).f15845q.setImageBitmap(bitmapM);
        }
        Bitmap bitmapN = this.f11753M.n();
        if (bitmapN != null) {
            ((C0989q) R2()).f15846r.setImageBitmap(bitmapN);
        }
        Bitmap bitmapL = this.f11753M.l();
        if (bitmapL != null) {
            ((C0989q) R2()).f15844p.setImageBitmap(bitmapL);
        }
        Bitmap bitmapI = this.f11753M.i();
        if (bitmapI != null) {
            ((C0989q) R2()).f15841m.setImageBitmap(bitmapI);
        }
        Bitmap bitmapJ = this.f11753M.j();
        if (bitmapJ != null) {
            ((C0989q) R2()).f15842n.setImageBitmap(bitmapJ);
        }
        Bitmap bitmapK = this.f11753M.k();
        if (bitmapK != null) {
            ((C0989q) R2()).f15843o.setImageBitmap(bitmapK);
        }
        Bitmap bitmapH = this.f11753M.h();
        if (bitmapH != null) {
            ((C0989q) R2()).f15840l.setImageBitmap(bitmapH);
        }
        Bitmap bitmapF = this.f11753M.f();
        if (bitmapF != null) {
            ((C0989q) R2()).f15836h.setImageBitmap(bitmapF);
        }
        Bitmap bitmapG = this.f11753M.g();
        if (bitmapG != null) {
            ((C0989q) R2()).f15837i.setImageBitmap(bitmapG);
        }
        Bitmap bitmapE = this.f11753M.e();
        if (bitmapE != null) {
            ((C0989q) R2()).f15835g.setImageBitmap(bitmapE);
        }
        Bitmap bitmapB = this.f11753M.b();
        if (bitmapB != null) {
            ((C0989q) R2()).f15832d.setImageBitmap(bitmapB);
        }
        Bitmap bitmapC = this.f11753M.c();
        if (bitmapC != null) {
            ((C0989q) R2()).f15833e.setImageBitmap(bitmapC);
        }
        Bitmap bitmapD = this.f11753M.d();
        if (bitmapD != null) {
            ((C0989q) R2()).f15834f.setImageBitmap(bitmapD);
        }
        Bitmap bitmapA = this.f11753M.a();
        if (bitmapA != null) {
            ((C0989q) R2()).f15831c.setImageBitmap(bitmapA);
        }
    }

    private final void R3() {
        final File filesDir = getFilesDir();
        AbstractC1488f abstractC1488fW = AbstractC1488f.q(new Callable() { // from class: J0.d2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return XiangqiCollectionActivity.S3(this.f2037d, filesDir);
            }
        }).H(S2.a.c()).w(AbstractC1559a.a());
        final InterfaceC1016l interfaceC1016l = new InterfaceC1016l() { // from class: J0.e2
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return XiangqiCollectionActivity.T3(this.f2041d, (T2.u) obj);
            }
        };
        e eVar = new e() { // from class: J0.f2
            @Override // C2.e
            public final void accept(Object obj) {
                XiangqiCollectionActivity.U3(interfaceC1016l, obj);
            }
        };
        final InterfaceC1016l interfaceC1016l2 = new InterfaceC1016l() { // from class: J0.g2
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return XiangqiCollectionActivity.V3(this.f2049d, (Throwable) obj);
            }
        };
        A2.c cVarD = abstractC1488fW.D(eVar, new e() { // from class: J0.i2
            @Override // C2.e
            public final void accept(Object obj) {
                XiangqiCollectionActivity.W3(interfaceC1016l2, obj);
            }
        });
        m.d(cVarD, "subscribe(...)");
        R2.a.a(cVarD, S2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u S3(XiangqiCollectionActivity xiangqiCollectionActivity, File file) {
        m.b(file);
        File fileV2 = xiangqiCollectionActivity.V2(file);
        File file2 = new File(fileV2, "rp.png");
        File file3 = new File(fileV2, "rr.png");
        File file4 = new File(fileV2, "rn.png");
        File file5 = new File(fileV2, "rb.png");
        File file6 = new File(fileV2, "rc.png");
        File file7 = new File(fileV2, "rk.png");
        File file8 = new File(fileV2, "ra.png");
        File file9 = new File(fileV2, "bp.png");
        File file10 = new File(fileV2, "br.png");
        File file11 = new File(fileV2, "bn.png");
        File file12 = new File(fileV2, "bb.png");
        File file13 = new File(fileV2, "bc.png");
        File file14 = new File(fileV2, "bk.png");
        File file15 = new File(fileV2, "ba.png");
        if (file2.exists()) {
            xiangqiCollectionActivity.f11753M.B(BitmapFactory.decodeFile(file2.getAbsolutePath()));
        }
        if (file3.exists()) {
            xiangqiCollectionActivity.f11753M.C(BitmapFactory.decodeFile(file3.getAbsolutePath()));
        }
        if (file4.exists()) {
            xiangqiCollectionActivity.f11753M.A(BitmapFactory.decodeFile(file4.getAbsolutePath()));
        }
        if (file5.exists()) {
            xiangqiCollectionActivity.f11753M.x(BitmapFactory.decodeFile(file5.getAbsolutePath()));
        }
        if (file6.exists()) {
            xiangqiCollectionActivity.f11753M.y(BitmapFactory.decodeFile(file6.getAbsolutePath()));
        }
        if (file7.exists()) {
            xiangqiCollectionActivity.f11753M.z(BitmapFactory.decodeFile(file7.getAbsolutePath()));
        }
        if (file8.exists()) {
            xiangqiCollectionActivity.f11753M.w(BitmapFactory.decodeFile(file8.getAbsolutePath()));
        }
        if (file9.exists()) {
            xiangqiCollectionActivity.f11753M.u(BitmapFactory.decodeFile(file9.getAbsolutePath()));
        }
        if (file10.exists()) {
            xiangqiCollectionActivity.f11753M.v(BitmapFactory.decodeFile(file10.getAbsolutePath()));
        }
        if (file11.exists()) {
            xiangqiCollectionActivity.f11753M.t(BitmapFactory.decodeFile(file11.getAbsolutePath()));
        }
        if (file12.exists()) {
            xiangqiCollectionActivity.f11753M.q(BitmapFactory.decodeFile(file12.getAbsolutePath()));
        }
        if (file13.exists()) {
            xiangqiCollectionActivity.f11753M.r(BitmapFactory.decodeFile(file13.getAbsolutePath()));
        }
        if (file14.exists()) {
            xiangqiCollectionActivity.f11753M.s(BitmapFactory.decodeFile(file14.getAbsolutePath()));
        }
        if (file15.exists()) {
            xiangqiCollectionActivity.f11753M.p(BitmapFactory.decodeFile(file15.getAbsolutePath()));
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u T3(XiangqiCollectionActivity xiangqiCollectionActivity, u uVar) {
        xiangqiCollectionActivity.I4();
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U3(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u V3(XiangqiCollectionActivity xiangqiCollectionActivity, Throwable th) {
        Toast.makeText(xiangqiCollectionActivity, AbstractC0888D.f14518n0, 0).show();
        th.printStackTrace();
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W3(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y3(XiangqiCollectionActivity xiangqiCollectionActivity, View view) {
        xiangqiCollectionActivity.Z2(5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z3(XiangqiCollectionActivity xiangqiCollectionActivity, View view) {
        xiangqiCollectionActivity.Z2(9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a4(XiangqiCollectionActivity xiangqiCollectionActivity, View view) {
        xiangqiCollectionActivity.Z2(15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b4(XiangqiCollectionActivity xiangqiCollectionActivity, View view) {
        xiangqiCollectionActivity.Z2(17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c4(XiangqiCollectionActivity xiangqiCollectionActivity, View view) {
        xiangqiCollectionActivity.Z2(13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d4(XiangqiCollectionActivity xiangqiCollectionActivity, View view) {
        xiangqiCollectionActivity.Z2(18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e4(XiangqiCollectionActivity xiangqiCollectionActivity, View view) {
        if (!xiangqiCollectionActivity.f11753M.o()) {
            Toast.makeText(xiangqiCollectionActivity, AbstractC0888D.f14376H0, 0).show();
            return;
        }
        File filesDir = xiangqiCollectionActivity.getFilesDir();
        m.d(filesDir, "getFilesDir(...)");
        File fileV2 = xiangqiCollectionActivity.V2(filesDir);
        File file = new File(fileV2.getParent(), "_h1_" + (System.currentTimeMillis() / 1000));
        if (!fileV2.renameTo(file)) {
            Toast.makeText(xiangqiCollectionActivity, AbstractC0888D.f14518n0, 0).show();
            return;
        }
        String name = file.getName();
        m.d(name, "getName(...)");
        xiangqiCollectionActivity.X2(name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f4(XiangqiCollectionActivity xiangqiCollectionActivity, View view) {
        xiangqiCollectionActivity.Z2(7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g4(XiangqiCollectionActivity xiangqiCollectionActivity, View view) {
        xiangqiCollectionActivity.Z2(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h4(XiangqiCollectionActivity xiangqiCollectionActivity, View view) {
        xiangqiCollectionActivity.Z2(10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i4(XiangqiCollectionActivity xiangqiCollectionActivity, View view) {
        xiangqiCollectionActivity.Z2(6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j4(XiangqiCollectionActivity xiangqiCollectionActivity, View view) {
        xiangqiCollectionActivity.Z2(11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k4(XiangqiCollectionActivity xiangqiCollectionActivity, View view) {
        xiangqiCollectionActivity.Z2(12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l4(XiangqiCollectionActivity xiangqiCollectionActivity, View view) {
        xiangqiCollectionActivity.Z2(16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m4(XiangqiCollectionActivity xiangqiCollectionActivity, View view) {
        xiangqiCollectionActivity.Z2(14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u n4(XiangqiCollectionActivity xiangqiCollectionActivity, Bitmap bitmap) {
        m.e(bitmap, "bitmap");
        xiangqiCollectionActivity.f11753M.B(bitmap);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u o4(XiangqiCollectionActivity xiangqiCollectionActivity, Bitmap bitmap) {
        m.e(bitmap, "bitmap");
        xiangqiCollectionActivity.f11753M.C(bitmap);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u p4(XiangqiCollectionActivity xiangqiCollectionActivity, Bitmap bitmap) {
        m.e(bitmap, "bitmap");
        xiangqiCollectionActivity.f11753M.A(bitmap);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u q4(XiangqiCollectionActivity xiangqiCollectionActivity, Bitmap bitmap) {
        m.e(bitmap, "bitmap");
        xiangqiCollectionActivity.f11753M.x(bitmap);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u r4(XiangqiCollectionActivity xiangqiCollectionActivity, Bitmap bitmap) {
        m.e(bitmap, "bitmap");
        xiangqiCollectionActivity.f11753M.y(bitmap);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u s4(XiangqiCollectionActivity xiangqiCollectionActivity, Bitmap bitmap) {
        m.e(bitmap, "bitmap");
        xiangqiCollectionActivity.f11753M.z(bitmap);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u t4(XiangqiCollectionActivity xiangqiCollectionActivity, Bitmap bitmap) {
        m.e(bitmap, "bitmap");
        xiangqiCollectionActivity.f11753M.w(bitmap);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u u4(XiangqiCollectionActivity xiangqiCollectionActivity, Bitmap bitmap) {
        m.e(bitmap, "bitmap");
        xiangqiCollectionActivity.f11753M.u(bitmap);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u v4(XiangqiCollectionActivity xiangqiCollectionActivity, Bitmap bitmap) {
        m.e(bitmap, "bitmap");
        xiangqiCollectionActivity.f11753M.v(bitmap);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u w4(XiangqiCollectionActivity xiangqiCollectionActivity, Bitmap bitmap) {
        m.e(bitmap, "bitmap");
        xiangqiCollectionActivity.f11753M.t(bitmap);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u x4(XiangqiCollectionActivity xiangqiCollectionActivity, Bitmap bitmap) {
        m.e(bitmap, "bitmap");
        xiangqiCollectionActivity.f11753M.q(bitmap);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u y4(XiangqiCollectionActivity xiangqiCollectionActivity, Bitmap bitmap) {
        m.e(bitmap, "bitmap");
        xiangqiCollectionActivity.f11753M.r(bitmap);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u z4(XiangqiCollectionActivity xiangqiCollectionActivity, Bitmap bitmap) {
        m.e(bitmap, "bitmap");
        xiangqiCollectionActivity.f11753M.s(bitmap);
        return u.f3817a;
    }

    @Override // cab.shashki.app.ui.imagebuilder.a
    protected String T2() {
        return this.f11754N;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cab.shashki.app.ui.imagebuilder.a
    /* renamed from: X3, reason: merged with bridge method [inline-methods] */
    public C0989q U2() {
        C0989q c0989qD = C0989q.d(getLayoutInflater());
        m.d(c0989qD, "inflate(...)");
        return c0989qD;
    }

    @Override // cab.shashki.app.ui.imagebuilder.a
    protected void Y2(int i4, final Uri uri) {
        l lVar;
        m.e(uri, "uri");
        final File filesDir = getFilesDir();
        switch (i4) {
            case 5:
                lVar = new l("rp.png", new InterfaceC1016l() { // from class: J0.A1
                    @Override // g3.InterfaceC1016l
                    public final Object o(Object obj) {
                        return XiangqiCollectionActivity.n4(this.f1931d, (Bitmap) obj);
                    }
                });
                break;
            case 6:
                lVar = new l("rk.png", new InterfaceC1016l() { // from class: J0.H1
                    @Override // g3.InterfaceC1016l
                    public final Object o(Object obj) {
                        return XiangqiCollectionActivity.s4(this.f1956d, (Bitmap) obj);
                    }
                });
                break;
            case 7:
                lVar = new l("rn.png", new InterfaceC1016l() { // from class: J0.E1
                    @Override // g3.InterfaceC1016l
                    public final Object o(Object obj) {
                        return XiangqiCollectionActivity.p4(this.f1944d, (Bitmap) obj);
                    }
                });
                break;
            case 8:
                lVar = new l("rb.png", new InterfaceC1016l() { // from class: J0.F1
                    @Override // g3.InterfaceC1016l
                    public final Object o(Object obj) {
                        return XiangqiCollectionActivity.q4(this.f1948d, (Bitmap) obj);
                    }
                });
                break;
            case 9:
                lVar = new l("rr.png", new InterfaceC1016l() { // from class: J0.C1
                    @Override // g3.InterfaceC1016l
                    public final Object o(Object obj) {
                        return XiangqiCollectionActivity.o4(this.f1937d, (Bitmap) obj);
                    }
                });
                break;
            case 10:
                lVar = new l("rc.png", new InterfaceC1016l() { // from class: J0.G1
                    @Override // g3.InterfaceC1016l
                    public final Object o(Object obj) {
                        return XiangqiCollectionActivity.r4(this.f1953d, (Bitmap) obj);
                    }
                });
                break;
            case 11:
                lVar = new l("ra.png", new InterfaceC1016l() { // from class: J0.I1
                    @Override // g3.InterfaceC1016l
                    public final Object o(Object obj) {
                        return XiangqiCollectionActivity.t4(this.f1959d, (Bitmap) obj);
                    }
                });
                break;
            case 12:
                lVar = new l("bp.png", new InterfaceC1016l() { // from class: J0.J1
                    @Override // g3.InterfaceC1016l
                    public final Object o(Object obj) {
                        return XiangqiCollectionActivity.u4(this.f1962d, (Bitmap) obj);
                    }
                });
                break;
            case 13:
                lVar = new l("bk.png", new InterfaceC1016l() { // from class: J0.h2
                    @Override // g3.InterfaceC1016l
                    public final Object o(Object obj) {
                        return XiangqiCollectionActivity.z4(this.f2053d, (Bitmap) obj);
                    }
                });
                break;
            case 14:
                lVar = new l("bn.png", new InterfaceC1016l() { // from class: J0.M1
                    @Override // g3.InterfaceC1016l
                    public final Object o(Object obj) {
                        return XiangqiCollectionActivity.w4(this.f1975d, (Bitmap) obj);
                    }
                });
                break;
            case 15:
                lVar = new l("bb.png", new InterfaceC1016l() { // from class: J0.L1
                    @Override // g3.InterfaceC1016l
                    public final Object o(Object obj) {
                        return XiangqiCollectionActivity.x4(this.f1970d, (Bitmap) obj);
                    }
                });
                break;
            case 16:
                lVar = new l("br.png", new InterfaceC1016l() { // from class: J0.K1
                    @Override // g3.InterfaceC1016l
                    public final Object o(Object obj) {
                        return XiangqiCollectionActivity.v4(this.f1967d, (Bitmap) obj);
                    }
                });
                break;
            case 17:
                lVar = new l("bc.png", new InterfaceC1016l() { // from class: J0.W1
                    @Override // g3.InterfaceC1016l
                    public final Object o(Object obj) {
                        return XiangqiCollectionActivity.y4(this.f2007d, (Bitmap) obj);
                    }
                });
                break;
            case 18:
                lVar = new l("ba.png", new InterfaceC1016l() { // from class: J0.j2
                    @Override // g3.InterfaceC1016l
                    public final Object o(Object obj) {
                        return XiangqiCollectionActivity.A4(this.f2061d, (Bitmap) obj);
                    }
                });
                break;
            default:
                return;
        }
        final String str = (String) lVar.a();
        final InterfaceC1016l interfaceC1016l = (InterfaceC1016l) lVar.b();
        AbstractC1488f abstractC1488fH = AbstractC1488f.q(new Callable() { // from class: J0.k2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return XiangqiCollectionActivity.B4(this.f2065d, filesDir, uri, str);
            }
        }).H(S2.a.c());
        final InterfaceC1016l interfaceC1016l2 = new InterfaceC1016l() { // from class: J0.l2
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return XiangqiCollectionActivity.C4(interfaceC1016l, (Bitmap) obj);
            }
        };
        AbstractC1488f abstractC1488fW = abstractC1488fH.v(new g() { // from class: J0.m2
            @Override // C2.g
            public final Object a(Object obj) {
                return XiangqiCollectionActivity.D4(interfaceC1016l2, obj);
            }
        }).w(AbstractC1559a.a());
        final InterfaceC1016l interfaceC1016l3 = new InterfaceC1016l() { // from class: J0.n2
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return XiangqiCollectionActivity.E4(this.f2079d, (T2.u) obj);
            }
        };
        e eVar = new e() { // from class: J0.o2
            @Override // C2.e
            public final void accept(Object obj) {
                XiangqiCollectionActivity.F4(interfaceC1016l3, obj);
            }
        };
        final InterfaceC1016l interfaceC1016l4 = new InterfaceC1016l() { // from class: J0.B1
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return XiangqiCollectionActivity.G4(this.f1934d, (Throwable) obj);
            }
        };
        A2.c cVarD = abstractC1488fW.D(eVar, new e() { // from class: J0.D1
            @Override // C2.e
            public final void accept(Object obj) {
                XiangqiCollectionActivity.H4(interfaceC1016l4, obj);
            }
        });
        m.d(cVarD, "subscribe(...)");
        R2.a.a(cVarD, S2());
    }

    @Override // cab.shashki.app.ui.imagebuilder.a, f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        R3();
        ((C0989q) R2()).f15845q.setOnClickListener(new View.OnClickListener() { // from class: J0.N1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                XiangqiCollectionActivity.Y3(this.f1981b, view);
            }
        });
        ((C0989q) R2()).f15846r.setOnClickListener(new View.OnClickListener() { // from class: J0.T1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                XiangqiCollectionActivity.Z3(this.f1998b, view);
            }
        });
        ((C0989q) R2()).f15844p.setOnClickListener(new View.OnClickListener() { // from class: J0.U1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                XiangqiCollectionActivity.f4(this.f2001b, view);
            }
        });
        ((C0989q) R2()).f15841m.setOnClickListener(new View.OnClickListener() { // from class: J0.V1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                XiangqiCollectionActivity.g4(this.f2004b, view);
            }
        });
        ((C0989q) R2()).f15842n.setOnClickListener(new View.OnClickListener() { // from class: J0.X1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                XiangqiCollectionActivity.h4(this.f2011b, view);
            }
        });
        ((C0989q) R2()).f15843o.setOnClickListener(new View.OnClickListener() { // from class: J0.Y1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                XiangqiCollectionActivity.i4(this.f2014b, view);
            }
        });
        ((C0989q) R2()).f15840l.setOnClickListener(new View.OnClickListener() { // from class: J0.Z1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                XiangqiCollectionActivity.j4(this.f2017b, view);
            }
        });
        ((C0989q) R2()).f15836h.setOnClickListener(new View.OnClickListener() { // from class: J0.a2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                XiangqiCollectionActivity.k4(this.f2021b, view);
            }
        });
        ((C0989q) R2()).f15837i.setOnClickListener(new View.OnClickListener() { // from class: J0.b2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                XiangqiCollectionActivity.l4(this.f2025b, view);
            }
        });
        ((C0989q) R2()).f15835g.setOnClickListener(new View.OnClickListener() { // from class: J0.c2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                XiangqiCollectionActivity.m4(this.f2029b, view);
            }
        });
        ((C0989q) R2()).f15832d.setOnClickListener(new View.OnClickListener() { // from class: J0.O1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                XiangqiCollectionActivity.a4(this.f1984b, view);
            }
        });
        ((C0989q) R2()).f15833e.setOnClickListener(new View.OnClickListener() { // from class: J0.P1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                XiangqiCollectionActivity.b4(this.f1987b, view);
            }
        });
        ((C0989q) R2()).f15834f.setOnClickListener(new View.OnClickListener() { // from class: J0.Q1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                XiangqiCollectionActivity.c4(this.f1991b, view);
            }
        });
        ((C0989q) R2()).f15831c.setOnClickListener(new View.OnClickListener() { // from class: J0.R1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                XiangqiCollectionActivity.d4(this.f1993b, view);
            }
        });
        ((C0989q) R2()).f15838j.setOnClickListener(new View.OnClickListener() { // from class: J0.S1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                XiangqiCollectionActivity.e4(this.f1996b, view);
            }
        });
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Bitmap f11755a;

        /* renamed from: b, reason: collision with root package name */
        private Bitmap f11756b;

        /* renamed from: c, reason: collision with root package name */
        private Bitmap f11757c;

        /* renamed from: d, reason: collision with root package name */
        private Bitmap f11758d;

        /* renamed from: e, reason: collision with root package name */
        private Bitmap f11759e;

        /* renamed from: f, reason: collision with root package name */
        private Bitmap f11760f;

        /* renamed from: g, reason: collision with root package name */
        private Bitmap f11761g;

        /* renamed from: h, reason: collision with root package name */
        private Bitmap f11762h;

        /* renamed from: i, reason: collision with root package name */
        private Bitmap f11763i;

        /* renamed from: j, reason: collision with root package name */
        private Bitmap f11764j;

        /* renamed from: k, reason: collision with root package name */
        private Bitmap f11765k;

        /* renamed from: l, reason: collision with root package name */
        private Bitmap f11766l;

        /* renamed from: m, reason: collision with root package name */
        private Bitmap f11767m;

        /* renamed from: n, reason: collision with root package name */
        private Bitmap f11768n;

        public b(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4, Bitmap bitmap5, Bitmap bitmap6, Bitmap bitmap7, Bitmap bitmap8, Bitmap bitmap9, Bitmap bitmap10, Bitmap bitmap11, Bitmap bitmap12, Bitmap bitmap13, Bitmap bitmap14) {
            this.f11755a = bitmap;
            this.f11756b = bitmap2;
            this.f11757c = bitmap3;
            this.f11758d = bitmap4;
            this.f11759e = bitmap5;
            this.f11760f = bitmap6;
            this.f11761g = bitmap7;
            this.f11762h = bitmap8;
            this.f11763i = bitmap9;
            this.f11764j = bitmap10;
            this.f11765k = bitmap11;
            this.f11766l = bitmap12;
            this.f11767m = bitmap13;
            this.f11768n = bitmap14;
        }

        public final void A(Bitmap bitmap) {
            this.f11757c = bitmap;
        }

        public final void B(Bitmap bitmap) {
            this.f11755a = bitmap;
        }

        public final void C(Bitmap bitmap) {
            this.f11759e = bitmap;
        }

        public final Bitmap a() {
            return this.f11768n;
        }

        public final Bitmap b() {
            return this.f11765k;
        }

        public final Bitmap c() {
            return this.f11767m;
        }

        public final Bitmap d() {
            return this.f11763i;
        }

        public final Bitmap e() {
            return this.f11764j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return m.a(this.f11755a, bVar.f11755a) && m.a(this.f11756b, bVar.f11756b) && m.a(this.f11757c, bVar.f11757c) && m.a(this.f11758d, bVar.f11758d) && m.a(this.f11759e, bVar.f11759e) && m.a(this.f11760f, bVar.f11760f) && m.a(this.f11761g, bVar.f11761g) && m.a(this.f11762h, bVar.f11762h) && m.a(this.f11763i, bVar.f11763i) && m.a(this.f11764j, bVar.f11764j) && m.a(this.f11765k, bVar.f11765k) && m.a(this.f11766l, bVar.f11766l) && m.a(this.f11767m, bVar.f11767m) && m.a(this.f11768n, bVar.f11768n);
        }

        public final Bitmap f() {
            return this.f11762h;
        }

        public final Bitmap g() {
            return this.f11766l;
        }

        public final Bitmap h() {
            return this.f11761g;
        }

        public int hashCode() {
            Bitmap bitmap = this.f11755a;
            int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
            Bitmap bitmap2 = this.f11756b;
            int iHashCode2 = (iHashCode + (bitmap2 == null ? 0 : bitmap2.hashCode())) * 31;
            Bitmap bitmap3 = this.f11757c;
            int iHashCode3 = (iHashCode2 + (bitmap3 == null ? 0 : bitmap3.hashCode())) * 31;
            Bitmap bitmap4 = this.f11758d;
            int iHashCode4 = (iHashCode3 + (bitmap4 == null ? 0 : bitmap4.hashCode())) * 31;
            Bitmap bitmap5 = this.f11759e;
            int iHashCode5 = (iHashCode4 + (bitmap5 == null ? 0 : bitmap5.hashCode())) * 31;
            Bitmap bitmap6 = this.f11760f;
            int iHashCode6 = (iHashCode5 + (bitmap6 == null ? 0 : bitmap6.hashCode())) * 31;
            Bitmap bitmap7 = this.f11761g;
            int iHashCode7 = (iHashCode6 + (bitmap7 == null ? 0 : bitmap7.hashCode())) * 31;
            Bitmap bitmap8 = this.f11762h;
            int iHashCode8 = (iHashCode7 + (bitmap8 == null ? 0 : bitmap8.hashCode())) * 31;
            Bitmap bitmap9 = this.f11763i;
            int iHashCode9 = (iHashCode8 + (bitmap9 == null ? 0 : bitmap9.hashCode())) * 31;
            Bitmap bitmap10 = this.f11764j;
            int iHashCode10 = (iHashCode9 + (bitmap10 == null ? 0 : bitmap10.hashCode())) * 31;
            Bitmap bitmap11 = this.f11765k;
            int iHashCode11 = (iHashCode10 + (bitmap11 == null ? 0 : bitmap11.hashCode())) * 31;
            Bitmap bitmap12 = this.f11766l;
            int iHashCode12 = (iHashCode11 + (bitmap12 == null ? 0 : bitmap12.hashCode())) * 31;
            Bitmap bitmap13 = this.f11767m;
            int iHashCode13 = (iHashCode12 + (bitmap13 == null ? 0 : bitmap13.hashCode())) * 31;
            Bitmap bitmap14 = this.f11768n;
            return iHashCode13 + (bitmap14 != null ? bitmap14.hashCode() : 0);
        }

        public final Bitmap i() {
            return this.f11758d;
        }

        public final Bitmap j() {
            return this.f11760f;
        }

        public final Bitmap k() {
            return this.f11756b;
        }

        public final Bitmap l() {
            return this.f11757c;
        }

        public final Bitmap m() {
            return this.f11755a;
        }

        public final Bitmap n() {
            return this.f11759e;
        }

        public final boolean o() {
            return (this.f11755a == null || this.f11756b == null || this.f11757c == null || this.f11758d == null || this.f11759e == null || this.f11760f == null || this.f11761g == null || this.f11762h == null || this.f11763i == null || this.f11764j == null || this.f11765k == null || this.f11766l == null || this.f11767m == null || this.f11768n == null) ? false : true;
        }

        public final void p(Bitmap bitmap) {
            this.f11768n = bitmap;
        }

        public final void q(Bitmap bitmap) {
            this.f11765k = bitmap;
        }

        public final void r(Bitmap bitmap) {
            this.f11767m = bitmap;
        }

        public final void s(Bitmap bitmap) {
            this.f11763i = bitmap;
        }

        public final void t(Bitmap bitmap) {
            this.f11764j = bitmap;
        }

        public String toString() {
            return "XiangqiImages(rp=" + this.f11755a + ", rk=" + this.f11756b + ", rn=" + this.f11757c + ", rb=" + this.f11758d + ", rr=" + this.f11759e + ", rc=" + this.f11760f + ", ra=" + this.f11761g + ", bp=" + this.f11762h + ", bk=" + this.f11763i + ", bn=" + this.f11764j + ", bb=" + this.f11765k + ", br=" + this.f11766l + ", bc=" + this.f11767m + ", ba=" + this.f11768n + ")";
        }

        public final void u(Bitmap bitmap) {
            this.f11762h = bitmap;
        }

        public final void v(Bitmap bitmap) {
            this.f11766l = bitmap;
        }

        public final void w(Bitmap bitmap) {
            this.f11761g = bitmap;
        }

        public final void x(Bitmap bitmap) {
            this.f11758d = bitmap;
        }

        public final void y(Bitmap bitmap) {
            this.f11760f = bitmap;
        }

        public final void z(Bitmap bitmap) {
            this.f11756b = bitmap;
        }

        public /* synthetic */ b(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4, Bitmap bitmap5, Bitmap bitmap6, Bitmap bitmap7, Bitmap bitmap8, Bitmap bitmap9, Bitmap bitmap10, Bitmap bitmap11, Bitmap bitmap12, Bitmap bitmap13, Bitmap bitmap14, int i4, h hVar) {
            this((i4 & 1) != 0 ? null : bitmap, (i4 & 2) != 0 ? null : bitmap2, (i4 & 4) != 0 ? null : bitmap3, (i4 & 8) != 0 ? null : bitmap4, (i4 & 16) != 0 ? null : bitmap5, (i4 & 32) != 0 ? null : bitmap6, (i4 & 64) != 0 ? null : bitmap7, (i4 & 128) != 0 ? null : bitmap8, (i4 & 256) != 0 ? null : bitmap9, (i4 & 512) != 0 ? null : bitmap10, (i4 & 1024) != 0 ? null : bitmap11, (i4 & 2048) != 0 ? null : bitmap12, (i4 & 4096) != 0 ? null : bitmap13, (i4 & 8192) != 0 ? null : bitmap14);
        }
    }
}