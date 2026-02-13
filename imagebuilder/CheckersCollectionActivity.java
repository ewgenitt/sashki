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
import cab.shashki.app.ui.imagebuilder.CheckersCollectionActivity;
import f0.AbstractC0888D;
import g0.C0979l;
import g3.InterfaceC1016l;
import h3.h;
import h3.m;
import java.io.File;
import java.util.concurrent.Callable;
import x2.AbstractC1488f;
import z2.AbstractC1559a;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class CheckersCollectionActivity extends cab.shashki.app.ui.imagebuilder.a {

    /* renamed from: O, reason: collision with root package name */
    public static final b f11695O = new b(null);

    /* renamed from: M, reason: collision with root package name */
    private final String f11696M = "checkers";

    /* renamed from: N, reason: collision with root package name */
    private final a f11697N = new a(null, null, null, null, 15, null);

    public static final class b {
        public /* synthetic */ b(h hVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A3(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u B3(CheckersCollectionActivity checkersCollectionActivity, Throwable th) {
        Toast.makeText(checkersCollectionActivity, AbstractC0888D.f14518n0, 0).show();
        th.printStackTrace();
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C3(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E3(CheckersCollectionActivity checkersCollectionActivity, View view) {
        checkersCollectionActivity.Z2(5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F3(CheckersCollectionActivity checkersCollectionActivity, View view) {
        checkersCollectionActivity.Z2(6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G3(CheckersCollectionActivity checkersCollectionActivity, View view) {
        checkersCollectionActivity.Z2(7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H3(CheckersCollectionActivity checkersCollectionActivity, View view) {
        checkersCollectionActivity.Z2(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I3(CheckersCollectionActivity checkersCollectionActivity, View view) {
        if (!checkersCollectionActivity.f11697N.e()) {
            Toast.makeText(checkersCollectionActivity, AbstractC0888D.f14376H0, 0).show();
            return;
        }
        File filesDir = checkersCollectionActivity.getFilesDir();
        m.d(filesDir, "getFilesDir(...)");
        File fileV2 = checkersCollectionActivity.V2(filesDir);
        File file = new File(fileV2.getParent(), "_h1_" + (System.currentTimeMillis() / 1000));
        if (!fileV2.renameTo(file)) {
            Toast.makeText(checkersCollectionActivity, AbstractC0888D.f14518n0, 0).show();
            return;
        }
        String name = file.getName();
        m.d(name, "getName(...)");
        checkersCollectionActivity.X2(name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u J3(CheckersCollectionActivity checkersCollectionActivity, Bitmap bitmap) {
        m.e(bitmap, "bitmap");
        checkersCollectionActivity.f11697N.i(bitmap);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u K3(CheckersCollectionActivity checkersCollectionActivity, Bitmap bitmap) {
        m.e(bitmap, "bitmap");
        checkersCollectionActivity.f11697N.h(bitmap);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u L3(CheckersCollectionActivity checkersCollectionActivity, Bitmap bitmap) {
        m.e(bitmap, "bitmap");
        checkersCollectionActivity.f11697N.g(bitmap);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u M3(CheckersCollectionActivity checkersCollectionActivity, Bitmap bitmap) {
        m.e(bitmap, "bitmap");
        checkersCollectionActivity.f11697N.f(bitmap);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap N3(CheckersCollectionActivity checkersCollectionActivity, File file, Uri uri, String str) {
        m.b(file);
        return checkersCollectionActivity.W2(file, uri, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u O3(InterfaceC1016l interfaceC1016l, Bitmap bitmap) {
        m.e(bitmap, "it");
        interfaceC1016l.o(bitmap);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u P3(InterfaceC1016l interfaceC1016l, Object obj) {
        m.e(obj, "p0");
        return (u) interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u Q3(CheckersCollectionActivity checkersCollectionActivity, u uVar) {
        checkersCollectionActivity.U3();
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R3(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u S3(CheckersCollectionActivity checkersCollectionActivity, Throwable th) {
        Toast.makeText(checkersCollectionActivity, AbstractC0888D.f14518n0, 0).show();
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T3(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    private final void U3() {
        Bitmap bitmapD = this.f11697N.d();
        if (bitmapD != null) {
            ((C0979l) R2()).f15736g.setImageBitmap(bitmapD);
        }
        Bitmap bitmapC = this.f11697N.c();
        if (bitmapC != null) {
            ((C0979l) R2()).f15735f.setImageBitmap(bitmapC);
        }
        Bitmap bitmapB = this.f11697N.b();
        if (bitmapB != null) {
            ((C0979l) R2()).f15732c.setImageBitmap(bitmapB);
        }
        Bitmap bitmapA = this.f11697N.a();
        if (bitmapA != null) {
            ((C0979l) R2()).f15731b.setImageBitmap(bitmapA);
        }
    }

    private final void x3() {
        final File filesDir = getFilesDir();
        AbstractC1488f abstractC1488fW = AbstractC1488f.q(new Callable() { // from class: J0.E
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CheckersCollectionActivity.y3(this.f1941d, filesDir);
            }
        }).H(S2.a.c()).w(AbstractC1559a.a());
        final InterfaceC1016l interfaceC1016l = new InterfaceC1016l() { // from class: J0.F
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return CheckersCollectionActivity.z3(this.f1945d, (T2.u) obj);
            }
        };
        e eVar = new e() { // from class: J0.G
            @Override // C2.e
            public final void accept(Object obj) {
                CheckersCollectionActivity.A3(interfaceC1016l, obj);
            }
        };
        final InterfaceC1016l interfaceC1016l2 = new InterfaceC1016l() { // from class: J0.H
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return CheckersCollectionActivity.B3(this.f1954d, (Throwable) obj);
            }
        };
        A2.c cVarD = abstractC1488fW.D(eVar, new e() { // from class: J0.J
            @Override // C2.e
            public final void accept(Object obj) {
                CheckersCollectionActivity.C3(interfaceC1016l2, obj);
            }
        });
        m.d(cVarD, "subscribe(...)");
        R2.a.a(cVarD, S2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u y3(CheckersCollectionActivity checkersCollectionActivity, File file) {
        m.b(file);
        File fileV2 = checkersCollectionActivity.V2(file);
        File file2 = new File(fileV2, "wm.png");
        File file3 = new File(fileV2, "wk.png");
        File file4 = new File(fileV2, "bm.png");
        File file5 = new File(fileV2, "bk.png");
        if (file2.exists()) {
            checkersCollectionActivity.f11697N.i(BitmapFactory.decodeFile(file2.getAbsolutePath()));
        }
        if (file3.exists()) {
            checkersCollectionActivity.f11697N.h(BitmapFactory.decodeFile(file3.getAbsolutePath()));
        }
        if (file4.exists()) {
            checkersCollectionActivity.f11697N.g(BitmapFactory.decodeFile(file4.getAbsolutePath()));
        }
        if (file5.exists()) {
            checkersCollectionActivity.f11697N.f(BitmapFactory.decodeFile(file5.getAbsolutePath()));
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u z3(CheckersCollectionActivity checkersCollectionActivity, u uVar) {
        checkersCollectionActivity.U3();
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cab.shashki.app.ui.imagebuilder.a
    /* renamed from: D3, reason: merged with bridge method [inline-methods] */
    public C0979l U2() {
        C0979l c0979lD = C0979l.d(getLayoutInflater());
        m.d(c0979lD, "inflate(...)");
        return c0979lD;
    }

    @Override // cab.shashki.app.ui.imagebuilder.a
    protected String T2() {
        return this.f11696M;
    }

    @Override // cab.shashki.app.ui.imagebuilder.a
    protected void Y2(int i4, final Uri uri) {
        l lVar;
        m.e(uri, "uri");
        final File filesDir = getFilesDir();
        if (i4 == 5) {
            lVar = new l("wm.png", new InterfaceC1016l() { // from class: J0.x
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return CheckersCollectionActivity.J3(this.f2120d, (Bitmap) obj);
                }
            });
        } else if (i4 == 6) {
            lVar = new l("wk.png", new InterfaceC1016l() { // from class: J0.K
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return CheckersCollectionActivity.K3(this.f1963d, (Bitmap) obj);
                }
            });
        } else if (i4 == 7) {
            lVar = new l("bm.png", new InterfaceC1016l() { // from class: J0.L
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return CheckersCollectionActivity.L3(this.f1968d, (Bitmap) obj);
                }
            });
        } else if (i4 != 8) {
            return;
        } else {
            lVar = new l("bk.png", new InterfaceC1016l() { // from class: J0.M
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return CheckersCollectionActivity.M3(this.f1971d, (Bitmap) obj);
                }
            });
        }
        final String str = (String) lVar.a();
        final InterfaceC1016l interfaceC1016l = (InterfaceC1016l) lVar.b();
        AbstractC1488f abstractC1488fH = AbstractC1488f.q(new Callable() { // from class: J0.N
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CheckersCollectionActivity.N3(this.f1976d, filesDir, uri, str);
            }
        }).H(S2.a.c());
        final InterfaceC1016l interfaceC1016l2 = new InterfaceC1016l() { // from class: J0.O
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return CheckersCollectionActivity.O3(interfaceC1016l, (Bitmap) obj);
            }
        };
        AbstractC1488f abstractC1488fW = abstractC1488fH.v(new g() { // from class: J0.P
            @Override // C2.g
            public final Object a(Object obj) {
                return CheckersCollectionActivity.P3(interfaceC1016l2, obj);
            }
        }).w(AbstractC1559a.a());
        final InterfaceC1016l interfaceC1016l3 = new InterfaceC1016l() { // from class: J0.Q
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return CheckersCollectionActivity.Q3(this.f1988d, (T2.u) obj);
            }
        };
        e eVar = new e() { // from class: J0.S
            @Override // C2.e
            public final void accept(Object obj) {
                CheckersCollectionActivity.R3(interfaceC1016l3, obj);
            }
        };
        final InterfaceC1016l interfaceC1016l4 = new InterfaceC1016l() { // from class: J0.y
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return CheckersCollectionActivity.S3(this.f2123d, (Throwable) obj);
            }
        };
        A2.c cVarD = abstractC1488fW.D(eVar, new e() { // from class: J0.I
            @Override // C2.e
            public final void accept(Object obj) {
                CheckersCollectionActivity.T3(interfaceC1016l4, obj);
            }
        });
        m.d(cVarD, "subscribe(...)");
        R2.a.a(cVarD, S2());
    }

    @Override // cab.shashki.app.ui.imagebuilder.a, f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        x3();
        ((C0979l) R2()).f15736g.setOnClickListener(new View.OnClickListener() { // from class: J0.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckersCollectionActivity.E3(this.f2129b, view);
            }
        });
        ((C0979l) R2()).f15735f.setOnClickListener(new View.OnClickListener() { // from class: J0.A
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckersCollectionActivity.F3(this.f1929b, view);
            }
        });
        ((C0979l) R2()).f15732c.setOnClickListener(new View.OnClickListener() { // from class: J0.B
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckersCollectionActivity.G3(this.f1932b, view);
            }
        });
        ((C0979l) R2()).f15731b.setOnClickListener(new View.OnClickListener() { // from class: J0.C
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckersCollectionActivity.H3(this.f1935b, view);
            }
        });
        ((C0979l) R2()).f15733d.setOnClickListener(new View.OnClickListener() { // from class: J0.D
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckersCollectionActivity.I3(this.f1938b, view);
            }
        });
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Bitmap f11698a;

        /* renamed from: b, reason: collision with root package name */
        private Bitmap f11699b;

        /* renamed from: c, reason: collision with root package name */
        private Bitmap f11700c;

        /* renamed from: d, reason: collision with root package name */
        private Bitmap f11701d;

        public a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4) {
            this.f11698a = bitmap;
            this.f11699b = bitmap2;
            this.f11700c = bitmap3;
            this.f11701d = bitmap4;
        }

        public final Bitmap a() {
            return this.f11701d;
        }

        public final Bitmap b() {
            return this.f11700c;
        }

        public final Bitmap c() {
            return this.f11699b;
        }

        public final Bitmap d() {
            return this.f11698a;
        }

        public final boolean e() {
            return (this.f11698a == null || this.f11699b == null || this.f11700c == null || this.f11701d == null) ? false : true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return m.a(this.f11698a, aVar.f11698a) && m.a(this.f11699b, aVar.f11699b) && m.a(this.f11700c, aVar.f11700c) && m.a(this.f11701d, aVar.f11701d);
        }

        public final void f(Bitmap bitmap) {
            this.f11701d = bitmap;
        }

        public final void g(Bitmap bitmap) {
            this.f11700c = bitmap;
        }

        public final void h(Bitmap bitmap) {
            this.f11699b = bitmap;
        }

        public int hashCode() {
            Bitmap bitmap = this.f11698a;
            int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
            Bitmap bitmap2 = this.f11699b;
            int iHashCode2 = (iHashCode + (bitmap2 == null ? 0 : bitmap2.hashCode())) * 31;
            Bitmap bitmap3 = this.f11700c;
            int iHashCode3 = (iHashCode2 + (bitmap3 == null ? 0 : bitmap3.hashCode())) * 31;
            Bitmap bitmap4 = this.f11701d;
            return iHashCode3 + (bitmap4 != null ? bitmap4.hashCode() : 0);
        }

        public final void i(Bitmap bitmap) {
            this.f11698a = bitmap;
        }

        public String toString() {
            return "CheckersImages(wm=" + this.f11698a + ", wk=" + this.f11699b + ", bm=" + this.f11700c + ", bk=" + this.f11701d + ")";
        }

        public /* synthetic */ a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4, int i4, h hVar) {
            this((i4 & 1) != 0 ? null : bitmap, (i4 & 2) != 0 ? null : bitmap2, (i4 & 4) != 0 ? null : bitmap3, (i4 & 8) != 0 ? null : bitmap4);
        }
    }
}