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
import cab.shashki.app.ui.imagebuilder.OthelloCollectionActivity;
import f0.AbstractC0888D;
import g0.C0985o;
import g3.InterfaceC1016l;
import h3.h;
import h3.m;
import java.io.File;
import java.util.concurrent.Callable;
import x2.AbstractC1488f;
import z2.AbstractC1559a;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class OthelloCollectionActivity extends cab.shashki.app.ui.imagebuilder.a {

    /* renamed from: O, reason: collision with root package name */
    public static final a f11742O = new a(null);

    /* renamed from: M, reason: collision with root package name */
    private final String f11743M = "wb";

    /* renamed from: N, reason: collision with root package name */
    private final b f11744N = new b(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);

    public static final class a {
        public /* synthetic */ a(h hVar) {
            this();
        }

        private a() {
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Bitmap f11745a;

        /* renamed from: b, reason: collision with root package name */
        private Bitmap f11746b;

        public b(Bitmap bitmap, Bitmap bitmap2) {
            this.f11745a = bitmap;
            this.f11746b = bitmap2;
        }

        public final Bitmap a() {
            return this.f11745a;
        }

        public final Bitmap b() {
            return this.f11746b;
        }

        public final boolean c() {
            return (this.f11745a == null || this.f11746b == null) ? false : true;
        }

        public final void d(Bitmap bitmap) {
            this.f11745a = bitmap;
        }

        public final void e(Bitmap bitmap) {
            this.f11746b = bitmap;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return m.a(this.f11745a, bVar.f11745a) && m.a(this.f11746b, bVar.f11746b);
        }

        public int hashCode() {
            Bitmap bitmap = this.f11745a;
            int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
            Bitmap bitmap2 = this.f11746b;
            return iHashCode + (bitmap2 != null ? bitmap2.hashCode() : 0);
        }

        public String toString() {
            return "Othello(b=" + this.f11745a + ", w=" + this.f11746b + ")";
        }

        public /* synthetic */ b(Bitmap bitmap, Bitmap bitmap2, int i4, h hVar) {
            this((i4 & 1) != 0 ? null : bitmap, (i4 & 2) != 0 ? null : bitmap2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A3(OthelloCollectionActivity othelloCollectionActivity, View view) {
        othelloCollectionActivity.Z2(6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B3(OthelloCollectionActivity othelloCollectionActivity, View view) {
        othelloCollectionActivity.Z2(5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C3(OthelloCollectionActivity othelloCollectionActivity, View view) {
        if (!othelloCollectionActivity.f11744N.c()) {
            Toast.makeText(othelloCollectionActivity, AbstractC0888D.f14376H0, 0).show();
            return;
        }
        File filesDir = othelloCollectionActivity.getFilesDir();
        m.d(filesDir, "getFilesDir(...)");
        File fileV2 = othelloCollectionActivity.V2(filesDir);
        File file = new File(fileV2.getParent(), "_h1_" + (System.currentTimeMillis() / 1000));
        if (!fileV2.renameTo(file)) {
            Toast.makeText(othelloCollectionActivity, AbstractC0888D.f14518n0, 0).show();
            return;
        }
        String name = file.getName();
        m.d(name, "getName(...)");
        othelloCollectionActivity.X2(name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u D3(OthelloCollectionActivity othelloCollectionActivity, Bitmap bitmap) {
        m.e(bitmap, "bitmap");
        othelloCollectionActivity.f11744N.d(bitmap);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u E3(OthelloCollectionActivity othelloCollectionActivity, Bitmap bitmap) {
        m.e(bitmap, "bitmap");
        othelloCollectionActivity.f11744N.e(bitmap);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap F3(OthelloCollectionActivity othelloCollectionActivity, File file, Uri uri, String str) {
        m.b(file);
        return othelloCollectionActivity.W2(file, uri, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u G3(InterfaceC1016l interfaceC1016l, Bitmap bitmap) {
        m.e(bitmap, "it");
        interfaceC1016l.o(bitmap);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u H3(InterfaceC1016l interfaceC1016l, Object obj) {
        m.e(obj, "p0");
        return (u) interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u I3(OthelloCollectionActivity othelloCollectionActivity, u uVar) {
        othelloCollectionActivity.M3();
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J3(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u K3(OthelloCollectionActivity othelloCollectionActivity, Throwable th) {
        Toast.makeText(othelloCollectionActivity, AbstractC0888D.f14518n0, 0).show();
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L3(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    private final void M3() {
        Bitmap bitmapA = this.f11744N.a();
        if (bitmapA != null) {
            ((C0985o) R2()).f15791b.setImageBitmap(bitmapA);
        }
        Bitmap bitmapB = this.f11744N.b();
        if (bitmapB != null) {
            ((C0985o) R2()).f15794e.setImageBitmap(bitmapB);
        }
    }

    private final void t3() {
        final File filesDir = getFilesDir();
        AbstractC1488f abstractC1488fW = AbstractC1488f.q(new Callable() { // from class: J0.X0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return OthelloCollectionActivity.u3(this.f2009d, filesDir);
            }
        }).H(S2.a.c()).w(AbstractC1559a.a());
        final InterfaceC1016l interfaceC1016l = new InterfaceC1016l() { // from class: J0.Y0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return OthelloCollectionActivity.v3(this.f2013d, (T2.u) obj);
            }
        };
        e eVar = new e() { // from class: J0.Z0
            @Override // C2.e
            public final void accept(Object obj) {
                OthelloCollectionActivity.w3(interfaceC1016l, obj);
            }
        };
        final InterfaceC1016l interfaceC1016l2 = new InterfaceC1016l() { // from class: J0.a1
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return OthelloCollectionActivity.x3(this.f2020d, (Throwable) obj);
            }
        };
        A2.c cVarD = abstractC1488fW.D(eVar, new e() { // from class: J0.b1
            @Override // C2.e
            public final void accept(Object obj) {
                OthelloCollectionActivity.y3(interfaceC1016l2, obj);
            }
        });
        m.d(cVarD, "subscribe(...)");
        R2.a.a(cVarD, S2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u u3(OthelloCollectionActivity othelloCollectionActivity, File file) {
        m.b(file);
        File fileV2 = othelloCollectionActivity.V2(file);
        File file2 = new File(fileV2, "b.png");
        File file3 = new File(fileV2, "w.png");
        if (file2.exists()) {
            othelloCollectionActivity.f11744N.d(BitmapFactory.decodeFile(file2.getAbsolutePath()));
        }
        if (file3.exists()) {
            othelloCollectionActivity.f11744N.e(BitmapFactory.decodeFile(file3.getAbsolutePath()));
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u v3(OthelloCollectionActivity othelloCollectionActivity, u uVar) {
        othelloCollectionActivity.M3();
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w3(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u x3(OthelloCollectionActivity othelloCollectionActivity, Throwable th) {
        Toast.makeText(othelloCollectionActivity, AbstractC0888D.f14518n0, 0).show();
        th.printStackTrace();
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y3(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    @Override // cab.shashki.app.ui.imagebuilder.a
    protected String T2() {
        return this.f11743M;
    }

    @Override // cab.shashki.app.ui.imagebuilder.a
    protected void Y2(int i4, final Uri uri) {
        l lVar;
        m.e(uri, "uri");
        final File filesDir = getFilesDir();
        if (i4 == 5) {
            lVar = new l("b.png", new InterfaceC1016l() { // from class: J0.U0
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return OthelloCollectionActivity.D3(this.f2000d, (Bitmap) obj);
                }
            });
        } else if (i4 != 6) {
            return;
        } else {
            lVar = new l("w.png", new InterfaceC1016l() { // from class: J0.c1
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return OthelloCollectionActivity.E3(this.f2028d, (Bitmap) obj);
                }
            });
        }
        final String str = (String) lVar.a();
        final InterfaceC1016l interfaceC1016l = (InterfaceC1016l) lVar.b();
        AbstractC1488f abstractC1488fH = AbstractC1488f.q(new Callable() { // from class: J0.d1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return OthelloCollectionActivity.F3(this.f2033d, filesDir, uri, str);
            }
        }).H(S2.a.c());
        final InterfaceC1016l interfaceC1016l2 = new InterfaceC1016l() { // from class: J0.e1
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return OthelloCollectionActivity.G3(interfaceC1016l, (Bitmap) obj);
            }
        };
        AbstractC1488f abstractC1488fW = abstractC1488fH.v(new g() { // from class: J0.f1
            @Override // C2.g
            public final Object a(Object obj) {
                return OthelloCollectionActivity.H3(interfaceC1016l2, obj);
            }
        }).w(AbstractC1559a.a());
        final InterfaceC1016l interfaceC1016l3 = new InterfaceC1016l() { // from class: J0.g1
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return OthelloCollectionActivity.I3(this.f2048d, (T2.u) obj);
            }
        };
        e eVar = new e() { // from class: J0.h1
            @Override // C2.e
            public final void accept(Object obj) {
                OthelloCollectionActivity.J3(interfaceC1016l3, obj);
            }
        };
        final InterfaceC1016l interfaceC1016l4 = new InterfaceC1016l() { // from class: J0.i1
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return OthelloCollectionActivity.K3(this.f2056d, (Throwable) obj);
            }
        };
        A2.c cVarD = abstractC1488fW.D(eVar, new e() { // from class: J0.j1
            @Override // C2.e
            public final void accept(Object obj) {
                OthelloCollectionActivity.L3(interfaceC1016l4, obj);
            }
        });
        m.d(cVarD, "subscribe(...)");
        R2.a.a(cVarD, S2());
    }

    @Override // cab.shashki.app.ui.imagebuilder.a, f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        t3();
        ((C0985o) R2()).f15794e.setOnClickListener(new View.OnClickListener() { // from class: J0.k1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OthelloCollectionActivity.A3(this.f2064b, view);
            }
        });
        ((C0985o) R2()).f15791b.setOnClickListener(new View.OnClickListener() { // from class: J0.V0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OthelloCollectionActivity.B3(this.f2003b, view);
            }
        });
        ((C0985o) R2()).f15792c.setOnClickListener(new View.OnClickListener() { // from class: J0.W0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OthelloCollectionActivity.C3(this.f2006b, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cab.shashki.app.ui.imagebuilder.a
    /* renamed from: z3, reason: merged with bridge method [inline-methods] */
    public C0985o U2() {
        C0985o c0985oD = C0985o.d(getLayoutInflater());
        m.d(c0985oD, "inflate(...)");
        return c0985oD;
    }
}