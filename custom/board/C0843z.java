package cab.shashki.app.ui.custom.board;

import M0.A1;
import N0.C0574l;
import N0.K;
import U2.AbstractC0590i;
import a3.AbstractC0614b;
import a3.InterfaceC0613a;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ImageDecoder;
import android.graphics.Picture;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import cab.shashki.app.ShashkiApp;
import cab.shashki.app.db.entities.Cells;
import cab.shashki.app.db.entities.CheckersParams;
import cab.shashki.app.db.entities.HalmaParams;
import cab.shashki.app.service.FairyRepository;
import cab.shashki.app.ui.custom.board.C0843z;
import e.AbstractC0867a;
import f0.AbstractC0888D;
import f0.AbstractC0918v;
import g3.InterfaceC1016l;
import i0.AbstractC1051f;
import j1.C1101i;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o0.C1218E;
import o0.C1234e;
import o0.C1235f;
import o0.C1237h;
import o0.C1238i;
import o0.C1239j;
import o0.C1240k;
import o0.C1241l;
import o0.InterfaceC1236g;
import q0.C1277a;

/* renamed from: cab.shashki.app.ui.custom.board.z */
/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class C0843z {

    /* renamed from: a */
    public static final C0843z f11502a = new C0843z();

    /* renamed from: b */
    private static final SharedPreferences f11503b = androidx.preference.k.b(ShashkiApp.f10561b.a());

    /* renamed from: cab.shashki.app.ui.custom.board.z$a */
    public static final class a {

        /* renamed from: a */
        private final c f11504a;

        /* renamed from: b */
        private final h f11505b;

        /* renamed from: c */
        private final List f11506c;

        /* renamed from: d */
        private final List f11507d;

        /* renamed from: e */
        private final List f11508e;

        /* renamed from: f */
        private final int f11509f;

        /* renamed from: g */
        private final int f11510g;

        public a(c cVar, h hVar, List list, List list2, List list3, int i4, int i5) {
            h3.m.e(cVar, "grid");
            h3.m.e(hVar, "mode");
            this.f11504a = cVar;
            this.f11505b = hVar;
            this.f11506c = list;
            this.f11507d = list2;
            this.f11508e = list3;
            this.f11509f = i4;
            this.f11510g = i5;
        }

        public final int a() {
            return this.f11509f;
        }

        public final List b() {
            return this.f11506c;
        }

        public final List c() {
            return this.f11507d;
        }

        public final c d() {
            return this.f11504a;
        }

        public final h e() {
            return this.f11505b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h3.m.a(this.f11504a, aVar.f11504a) && this.f11505b == aVar.f11505b && h3.m.a(this.f11506c, aVar.f11506c) && h3.m.a(this.f11507d, aVar.f11507d) && h3.m.a(this.f11508e, aVar.f11508e) && this.f11509f == aVar.f11509f && this.f11510g == aVar.f11510g;
        }

        public final List f() {
            return this.f11508e;
        }

        public final int g() {
            return this.f11510g;
        }

        public int hashCode() {
            int iHashCode = ((this.f11504a.hashCode() * 31) + this.f11505b.hashCode()) * 31;
            List list = this.f11506c;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            List list2 = this.f11507d;
            int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.f11508e;
            return ((((iHashCode3 + (list3 != null ? list3.hashCode() : 0)) * 31) + this.f11509f) * 31) + this.f11510g;
        }

        public String toString() {
            return "BoardParams(grid=" + this.f11504a + ", mode=" + this.f11505b + ", blocked=" + this.f11506c + ", breaks=" + this.f11507d + ", spins=" + this.f11508e + ", blackColor=" + this.f11509f + ", whiteColor=" + this.f11510g + ")";
        }
    }

    /* renamed from: cab.shashki.app.ui.custom.board.z$b */
    public static final class b {

        /* renamed from: a */
        private final String f11511a;

        /* renamed from: b */
        private int f11512b;

        /* renamed from: c */
        private PointF f11513c;

        public b(String str, int i4, PointF pointF) {
            h3.m.e(str, "pos");
            h3.m.e(pointF, "point");
            this.f11511a = str;
            this.f11512b = i4;
            this.f11513c = pointF;
        }

        public final PointF a() {
            return this.f11513c;
        }

        public final String b() {
            return this.f11511a;
        }

        public final int c() {
            return this.f11512b;
        }

        public final void d(PointF pointF) {
            h3.m.e(pointF, "<set-?>");
            this.f11513c = pointF;
        }

        public final void e(int i4) {
            this.f11512b = i4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return h3.m.a(this.f11511a, bVar.f11511a) && this.f11512b == bVar.f11512b && h3.m.a(this.f11513c, bVar.f11513c);
        }

        public int hashCode() {
            return (((this.f11511a.hashCode() * 31) + this.f11512b) * 31) + this.f11513c.hashCode();
        }

        public String toString() {
            return "DynamicCell(pos=" + this.f11511a + ", type=" + this.f11512b + ", point=" + this.f11513c + ")";
        }
    }

    /* renamed from: cab.shashki.app.ui.custom.board.z$d */
    public static final class d {

        /* renamed from: d */
        public static final a f11534d = new a(null);

        /* renamed from: a */
        private final String f11535a;

        /* renamed from: b */
        private final e f11536b;

        /* renamed from: c */
        private Drawable f11537c;

        /* renamed from: cab.shashki.app.ui.custom.board.z$d$a */
        public static final class a {

            /* renamed from: cab.shashki.app.ui.custom.board.z$d$a$a */
            public /* synthetic */ class C0150a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f11538a;

                static {
                    int[] iArr = new int[e.values().length];
                    try {
                        iArr[e.f11539d.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[e.f11540e.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[e.f11541f.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[e.f11543h.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[e.f11542g.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f11538a = iArr;
                }
            }

            public /* synthetic */ a(h3.h hVar) {
                this();
            }

            public final Drawable b(Context context, e eVar, c cVar) {
                int iR;
                int i4 = C0150a.f11538a[eVar.ordinal()];
                if (i4 == 1) {
                    iR = cVar.r();
                } else if (i4 == 2) {
                    iR = cVar.n();
                } else if (i4 == 3) {
                    iR = cVar.o();
                } else if (i4 == 4) {
                    iR = cVar.z();
                } else {
                    if (i4 != 5) {
                        throw new T2.j();
                    }
                    iR = cVar.y();
                }
                Drawable drawableB = AbstractC0867a.b(context, iR);
                h3.m.b(drawableB);
                return drawableB;
            }

            private a() {
            }
        }

        public d(String str, e eVar, Drawable drawable) {
            h3.m.e(str, "pos");
            h3.m.e(eVar, "type");
            h3.m.e(drawable, "drawable");
            this.f11535a = str;
            this.f11536b = eVar;
            this.f11537c = drawable;
        }

        public final Drawable a() {
            return this.f11537c;
        }

        public final String b() {
            return this.f11535a;
        }

        public final e c() {
            return this.f11536b;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public d(String str, e eVar, Context context, c cVar) {
            this(str, eVar, f11534d.b(context, eVar, cVar));
            h3.m.e(str, "pos");
            h3.m.e(eVar, "type");
            h3.m.e(context, "context");
            h3.m.e(cVar, "mode");
        }
    }

    /* renamed from: cab.shashki.app.ui.custom.board.z$e */
    public static final class e extends Enum {

        /* renamed from: d */
        public static final e f11539d = new e("MOVE", 0);

        /* renamed from: e */
        public static final e f11540e = new e("FROM_B", 1);

        /* renamed from: f */
        public static final e f11541f = new e("FROM_W", 2);

        /* renamed from: g */
        public static final e f11542g = new e("TO_B", 3);

        /* renamed from: h */
        public static final e f11543h = new e("TO_W", 4);

        /* renamed from: i */
        private static final /* synthetic */ e[] f11544i;

        /* renamed from: j */
        private static final /* synthetic */ InterfaceC0613a f11545j;

        static {
            e[] eVarArrA = a();
            f11544i = eVarArrA;
            f11545j = AbstractC0614b.a(eVarArrA);
        }

        private e(String str, int i4) {
            super(str, i4);
        }

        private static final /* synthetic */ e[] a() {
            return new e[]{f11539d, f11540e, f11541f, f11542g, f11543h};
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f11544i.clone();
        }
    }

    /* renamed from: cab.shashki.app.ui.custom.board.z$f */
    public static final class f {

        /* renamed from: a */
        public static final f f11546a = new f();

        /* renamed from: b */
        private static final List f11547b;

        static {
            c cVar = new c(0, 1, 1, 1, null, null, 0.0f, 0.0f, 0, 0, 0, false, 0, AbstractC0918v.w4, null, 0, 0, 0, 0, 0, 1040368, null);
            c cVar2 = new c(1, 8, 8, 18, null, null, 1.0f, 1.0f, 0, 0, 0, false, 0, AbstractC0918v.f14712R, null, 0, 0, 0, 0, 0, 1040176, null);
            c cVar3 = new c(2, 6, 6, 14, null, null, 1.0f, 1.0f, 0, 0, 0, false, 0, 0, null, 0, 0, 0, 0, 0, 1048368, null);
            c cVar4 = new c(3, 5, 5, 12, null, null, 1.0f, 1.0f, 0, 0, 0, false, 0, 0, null, 0, 0, 0, 0, 0, 1048368, null);
            c cVar5 = new c(4, 7, 7, 17, new InterfaceC1016l() { // from class: cab.shashki.app.ui.custom.board.C
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return Float.valueOf(C0843z.f.h(((Integer) obj).intValue()));
                }
            }, new InterfaceC1016l() { // from class: cab.shashki.app.ui.custom.board.D
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return Float.valueOf(C0843z.f.i(((Integer) obj).intValue()));
                }
            }, 1.0f, 1.5f, 0, 0, 0, false, 0, 0, null, AbstractC0918v.v5, AbstractC0918v.f14669G2, AbstractC0918v.f14683J2, AbstractC0918v.X7, AbstractC0918v.b8, 32512, null);
            c cVar6 = new c(5, 8, 8, 16, null, null, 0.0f, 0.0f, 0, 0, 0, false, 0, 0, null, 0, 0, 0, 0, 0, 1048560, null);
            c cVar7 = new c(6, 8, 8, 18, null, null, 1.0f, 1.0f, 0, 0, 0, false, 0, 0, null, 0, 0, 0, 0, 0, 1048368, null);
            c cVar8 = new c(7, 8, 8, 18, null, null, 1.0f, 1.0f, 0, 0, 0, false, 0, 0, null, 0, 0, 0, 0, 0, 1048368, null);
            c cVar9 = new c(8, 9, 9, 20, null, null, 1.0f, 1.0f, 0, 0, 0, false, 0, 0, null, 0, 0, 0, 0, 0, 1048368, null);
            c cVar10 = new c(9, 7, 7, 14, null, null, 0.0f, 0.0f, 0, 0, 0, false, 0, 0, null, AbstractC0918v.u5, AbstractC0918v.f14669G2, AbstractC0918v.f14683J2, AbstractC0918v.Y7, AbstractC0918v.c8, 32752, null);
            c cVar11 = new c(10, 7, 7, 14, null, null, 0.0f, 0.0f, 0, 0, 0, false, 0, 0, null, 0, 0, 0, 0, 0, 1048560, null);
            c cVar12 = new c(11, 10, 10, 22, null, null, 1.0f, 1.0f, 0, 0, 0, false, 0, 0, null, 0, 0, 0, 0, 0, 1048368, null);
            c cVar13 = new c(12, 12, 12, 24, null, null, 0.0f, 0.0f, 2, 2, 0, true, 1, 0, null, 0, 0, 0, 0, 0, 1041648, null);
            c cVar14 = new c(13, 12, 12, 24, null, null, 0.0f, 0.0f, 2, 2, 0, true, 3, 0, null, 0, 0, 0, 0, 0, 1041648, null);
            c cVar15 = new c(14, 10, 8, 22, null, null, 1.0f, 3.0f, 0, 0, 0, false, 0, 0, null, 0, 0, 0, 0, 0, 1048368, null);
            c cVar16 = new c(15, 10, 10, 20, null, null, 0.0f, 0.0f, 0, 0, 0, false, 0, 0, null, 0, 0, 0, 0, 0, 1048560, null);
            c cVar17 = new c(16, 9, 10, 20, null, null, 1.0f, 0.0f, 0, 0, 0, true, 0, AbstractC0918v.Pa, null, AbstractC0918v.u5, AbstractC0918v.f14669G2, AbstractC0918v.f14683J2, AbstractC0918v.X7, AbstractC0918v.b8, 22448, null);
            InterfaceC1016l interfaceC1016l = new InterfaceC1016l() { // from class: cab.shashki.app.ui.custom.board.E
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return Float.valueOf(C0843z.f.j(((Integer) obj).intValue()));
                }
            };
            InterfaceC1016l interfaceC1016l2 = new InterfaceC1016l() { // from class: cab.shashki.app.ui.custom.board.F
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return Float.valueOf(C0843z.f.k(((Integer) obj).intValue()));
                }
            };
            int i4 = AbstractC0918v.J7;
            int i5 = AbstractC0918v.f14674H2;
            int i6 = AbstractC0918v.f14687K2;
            int i7 = AbstractC0918v.a8;
            int i8 = 0;
            List listJ = U2.p.j(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, new c(17, 11, 9, 22, interfaceC1016l, interfaceC1016l2, 0.0f, 0.0f, 1, 0, 0, true, 0, i4, null, 0, i5, i6, i7, i7, 54976, null), new c(18, 8, 5, 28, new InterfaceC1016l() { // from class: cab.shashki.app.ui.custom.board.G
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return Float.valueOf(C0843z.f.l(((Integer) obj).intValue()));
                }
            }, new InterfaceC1016l() { // from class: cab.shashki.app.ui.custom.board.H
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return Float.valueOf(C0843z.f.m(((Integer) obj).intValue()));
                }
            }, 0.0f, 2.0f, 0, 0, 0, false, 0, 0, null, 0, 0, 0, 0, 0, 1048320, null), new c(19, 12, 12, 24, null, null, 0.0f, 0.0f, 0, 0, 0, false, 0, 0, null, 0, 0, 0, 0, 0, 1048560, null), new c(20, 1, 1, 1, null, null, 0.0f, 0.0f, 0, 0, 0, false, 0, 0, null, AbstractC0918v.u5, AbstractC0918v.f14669G2, AbstractC0918v.f14683J2, AbstractC0918v.X7, AbstractC0918v.b8, 32752, null), new c(21, 1, 1, 1, null, null, 0.0f, 0.0f, 0, 0, 0, false, 0, 0, null, AbstractC0918v.u5, AbstractC0918v.f14669G2, AbstractC0918v.f14683J2, AbstractC0918v.X7, AbstractC0918v.b8, 32752, null), new c(22, 8, 8, 18, null, null, 1.0f, 1.0f, 0, 0, 0, false, 0, 0, null, 0, 0, 0, 0, 0, 1048368, null), new c(23, 5, 5, 10, null, null, 0.0f, 0.0f, 0, 0, 0, false, 0, 0, null, AbstractC0918v.u5, AbstractC0918v.f14669G2, AbstractC0918v.f14683J2, AbstractC0918v.X7, AbstractC0918v.b8, 32752, null), new c(24, 1, 1, 1, null, null, 0.0f, 0.0f, 0, 0, 0, false, 0, 0, null, 0, 0, 0, 0, 0, 1048560, null), new c(25, 1, 1, 1, null, null, 0.0f, 0.0f, 0, 0, 0, false, 0, 0, null, 0, 0, 0, 0, 0, 1048560, null), new c(26, 1, 1, 1, null, null, 0.0f, 0.0f, 0, 0, 0, false, 0, 0, null, AbstractC0918v.u5, AbstractC0918v.f14669G2, AbstractC0918v.f14683J2, AbstractC0918v.X7, AbstractC0918v.b8, 32752, null));
            f11547b = listJ;
            for (Object obj : listJ) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    U2.p.n();
                }
                ((c) obj).p();
                i8 = i9;
            }
        }

        private f() {
        }

        public static final float h(int i4) {
            return i4 / 8.0f;
        }

        public static final float i(int i4) {
            return (i4 * 2.0f) / 17;
        }

        public static final float j(int i4) {
            return i4 / 11.0f;
        }

        public static final float k(int i4) {
            return i4 / 9.0f;
        }

        public static final float l(int i4) {
            return i4 / 8.0f;
        }

        public static final float m(int i4) {
            return i4 / 7.0f;
        }

        public final c g(int i4) {
            return (c) f11547b.get(i4);
        }
    }

    /* renamed from: cab.shashki.app.ui.custom.board.z$g */
    public static final class g {

        /* renamed from: a */
        private K.c f11548a;

        /* renamed from: b */
        private int f11549b;

        public g(K.c cVar, int i4) {
            this.f11548a = cVar;
            this.f11549b = i4;
        }

        public final int a() {
            return this.f11549b;
        }

        public final K.c b() {
            return this.f11548a;
        }

        public final void c(int i4) {
            this.f11549b = i4;
        }

        public final void d(K.c cVar) {
            this.f11548a = cVar;
        }

        public /* synthetic */ g(K.c cVar, int i4, int i5, h3.h hVar) {
            this((i5 & 1) != 0 ? null : cVar, (i5 & 2) != 0 ? -1 : i4);
        }
    }

    /* renamed from: cab.shashki.app.ui.custom.board.z$h */
    public static final class h extends Enum {

        /* renamed from: d */
        public static final h f11550d = new h("NONE", 0);

        /* renamed from: e */
        public static final h f11551e = new h("WHITE", 1);

        /* renamed from: f */
        public static final h f11552f = new h("DIRECT", 2);

        /* renamed from: g */
        public static final h f11553g = new h("REVERSE", 3);

        /* renamed from: h */
        public static final h f11554h = new h("WHITE_REVERSE", 4);

        /* renamed from: i */
        private static final /* synthetic */ h[] f11555i;

        /* renamed from: j */
        private static final /* synthetic */ InterfaceC0613a f11556j;

        static {
            h[] hVarArrA = a();
            f11555i = hVarArrA;
            f11556j = AbstractC0614b.a(hVarArrA);
        }

        private h(String str, int i4) {
            super(str, i4);
        }

        private static final /* synthetic */ h[] a() {
            return new h[]{f11550d, f11551e, f11552f, f11553g, f11554h};
        }

        public static h valueOf(String str) {
            return (h) Enum.valueOf(h.class, str);
        }

        public static h[] values() {
            return (h[]) f11555i.clone();
        }
    }

    /* renamed from: cab.shashki.app.ui.custom.board.z$i */
    public interface i {
        int a();

        String b();

        int d();

        String getPosition();
    }

    /* renamed from: cab.shashki.app.ui.custom.board.z$k */
    public static final class k {

        /* renamed from: a */
        private final String f11562a;

        /* renamed from: b */
        private PointF f11563b;

        public k(String str, PointF pointF) {
            h3.m.e(str, "pos");
            h3.m.e(pointF, "point");
            this.f11562a = str;
            this.f11563b = pointF;
        }

        public final PointF a() {
            return this.f11563b;
        }

        public final String b() {
            return this.f11562a;
        }

        public final void c(PointF pointF) {
            h3.m.e(pointF, "<set-?>");
            this.f11563b = pointF;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return h3.m.a(this.f11562a, kVar.f11562a) && h3.m.a(this.f11563b, kVar.f11563b);
        }

        public int hashCode() {
            return (this.f11562a.hashCode() * 31) + this.f11563b.hashCode();
        }

        public String toString() {
            return "SomeCell(pos=" + this.f11562a + ", point=" + this.f11563b + ")";
        }

        public /* synthetic */ k(String str, PointF pointF, int i4, h3.h hVar) {
            this(str, (i4 & 2) != 0 ? new PointF() : pointF);
        }
    }

    /* renamed from: cab.shashki.app.ui.custom.board.z$l */
    public static final class l extends Drawable {

        /* renamed from: a */
        private final Picture f11564a;

        public l(Picture picture) {
            h3.m.e(picture, "svg");
            this.f11564a = picture;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            h3.m.e(canvas, "canvas");
            canvas.drawPicture(this.f11564a, getBounds());
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -2;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i4) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    /* renamed from: cab.shashki.app.ui.custom.board.z$m */
    public /* synthetic */ class m {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11565a;

        static {
            int[] iArr = new int[Cells.values().length];
            try {
                iArr[Cells.HEXAGON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Cells.ALQUERQUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Cells.ZAMMA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Cells.DYNAMIC_HEX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Cells.DYNAMIC_CHECKERS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f11565a = iArr;
        }
    }

    /* renamed from: cab.shashki.app.ui.custom.board.z$n */
    public static final class n {

        /* renamed from: a */
        private final String f11566a;

        /* renamed from: b */
        private final String f11567b;

        /* renamed from: c */
        private final int f11568c;

        public n(String str, String str2, int i4) {
            h3.m.e(str, "a");
            h3.m.e(str2, "b");
            this.f11566a = str;
            this.f11567b = str2;
            this.f11568c = i4;
        }

        public final String a() {
            return this.f11566a;
        }

        public final String b() {
            return this.f11567b;
        }

        public final int c() {
            return this.f11568c;
        }

        public /* synthetic */ n(String str, String str2, int i4, int i5, h3.h hVar) {
            this(str, str2, (i5 & 4) != 0 ? -65536 : i4);
        }
    }

    private C0843z() {
    }

    public static final T2.l A(int i4, T2.l lVar) {
        h3.m.e(lVar, "it");
        return new T2.l(new Point(((Point) lVar.c()).x, (i4 - ((Point) lVar.c()).y) - 1), new Point(((Point) lVar.d()).x, (i4 - ((Point) lVar.d()).y) - 1));
    }

    public static final boolean B(List list, List list2, T2.l lVar) {
        h3.m.e(lVar, "it");
        if (list.contains(lVar.c()) || list.contains(lVar.d())) {
            return false;
        }
        if (androidx.activity.B.a(list2) && list2.isEmpty()) {
            return true;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            T2.l lVar2 = (T2.l) it.next();
            if (h3.m.a(lVar2, lVar)) {
                return false;
            }
            if (h3.m.a(lVar2.d(), lVar.c()) && h3.m.a(lVar2.c(), lVar.d())) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ o0.x E(C0843z c0843z, int i4, cab.shashki.app.db.entities.a aVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            aVar = null;
        }
        return c0843z.D(i4, aVar);
    }

    public static final InterfaceC1236g F(String str) {
        h3.m.e(str, "it");
        return new C1235f(str);
    }

    public static final InterfaceC1236g G(String str) {
        h3.m.e(str, "it");
        return new C1241l(str);
    }

    public static final InterfaceC1236g H(String str) {
        h3.m.e(str, "it");
        return new C1240k(str);
    }

    public static final InterfaceC1236g I(String str) {
        h3.m.e(str, "it");
        return new C1237h(str);
    }

    public static final InterfaceC1236g J(String str) {
        h3.m.e(str, "it");
        return new C1239j(str);
    }

    public static final InterfaceC1236g K(String str) {
        h3.m.e(str, "it");
        return new C1238i(str);
    }

    public static final InterfaceC1236g L(String str) {
        h3.m.e(str, "it");
        return new C1237h(str);
    }

    public static final InterfaceC1236g M(String str) {
        h3.m.e(str, "it");
        return new C1234e(str);
    }

    public static final InterfaceC1236g N(String str) {
        h3.m.e(str, "it");
        return new C1234e(str);
    }

    public static final float P(int i4, FairyRepository.GameParams gameParams, int i5) {
        return i5 / (i4 + gameParams.getOx());
    }

    public static final float Q(int i4, FairyRepository.GameParams gameParams, int i5) {
        return i5 / (i4 + gameParams.getOy());
    }

    private final int T(int i4, int i5, int i6, Point point, Point point2) {
        point.set(0, 0);
        point2.set(i4 << 1, i5 << 1);
        if (i6 == 0) {
            point2.offset(2, 2);
        } else {
            if (i6 == 1) {
                if (i4 > i5) {
                    point.set(0, 4);
                    point2.offset(0, 8);
                    if (point2.x >= point2.y) {
                        point2.offset(2, 0);
                    }
                    return 2;
                }
                point.set(4, 0);
                point2.offset(8, 0);
                if (point2.y >= point2.x) {
                    point2.offset(0, 2);
                }
                return 1;
            }
            if (i6 == 2) {
                point.set(4, 4);
                point2.offset(8, 8);
                return 3;
            }
        }
        return 0;
    }

    private final int V(int i4, int i5, int i6, Point point, Point point2) {
        point.set(0, 0);
        point2.set(i4 << 1, i5 << 1);
        if (i6 != 1) {
            if (i6 != 2) {
                return 0;
            }
            point.set(2, 2);
            point2.offset(4, 4);
            return 3;
        }
        if (i4 > i5) {
            point.set(0, 2);
            point2.offset(0, 4);
            return 2;
        }
        point.set(2, 0);
        point2.offset(4, 0);
        return 1;
    }

    public static final float X(int i4, int i5) {
        return (i5 / ((i4 * 3) + 2)) & (-2);
    }

    public static final float Y(int i4, int i5) {
        return ((i5 / ((i4 * 3) + 2)) & (-2)) * 0.866f;
    }

    public static final float a0(int i4, int i5) {
        return (i5 * 2.0f) / i4;
    }

    public static final float b0(int i4, int i5) {
        return (i5 * 2.0f) / i4;
    }

    public static /* synthetic */ a e0(C0843z c0843z, int i4, Context context, cab.shashki.app.db.entities.a aVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            context = ShashkiApp.f10561b.a();
        }
        if ((i5 & 4) != 0) {
            aVar = null;
        }
        return c0843z.d0(i4, context, aVar);
    }

    private final c g0(int i4, int i5, int i6) {
        Point point = new Point();
        Point point2 = new Point();
        int iT = T(i4, i5, i6, point, point2);
        final int iMax = Math.max(point2.x, point2.y);
        int i7 = i4 + point.x;
        int i8 = i5 + point.y;
        c cVarF = c.f(f.f11546a.g(22), 0, 0, 0, 0, null, null, 0.0f, 0.0f, 0, 0, 0, false, 0, 0, null, 0, 0, 0, 0, 0, 1048575, null);
        cVarF.I(i7);
        cVarF.J(i8);
        cVarF.A(iMax);
        cVarF.G(iT);
        cVarF.M(point.x >> 1);
        cVarF.N(point.y >> 1);
        cVarF.D(new InterfaceC1016l() { // from class: cab.shashki.app.ui.custom.board.q
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return Float.valueOf(C0843z.i0(iMax, ((Integer) obj).intValue()));
            }
        });
        cVarF.E(new InterfaceC1016l() { // from class: cab.shashki.app.ui.custom.board.r
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return Float.valueOf(C0843z.j0(iMax, ((Integer) obj).intValue()));
            }
        });
        cVarF.K((iMax - (i7 << 1)) >> 1);
        cVarF.L((iMax - (i8 << 1)) >> 1);
        cVarF.H(true);
        return cVarF;
    }

    public static final float i0(int i4, int i5) {
        return (i5 * 2.0f) / i4;
    }

    public static final float j0(int i4, int i5) {
        return (i5 * 2.0f) / i4;
    }

    public static final void n0(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        h3.m.e(imageDecoder, "d");
        h3.m.e(imageInfo, "<unused var>");
        h3.m.e(source, "<unused var>");
        imageDecoder.setAllocator(1);
    }

    private final Point o0(String str) {
        int iCharAt = str.charAt(0) - 'a';
        String strSubstring = str.substring(1);
        h3.m.d(strSubstring, "substring(...)");
        return new Point(iCharAt, Integer.parseInt(strSubstring) - 1);
    }

    private final o0.x w(int i4, List list, InterfaceC1016l interfaceC1016l) {
        Object obj = null;
        String string = f11503b.getString(ShashkiApp.f10561b.a().getString(i4), null);
        if (string != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (h3.m.a(((o0.x) next).getName(), string)) {
                    obj = next;
                    break;
                }
            }
            o0.x xVar = (o0.x) obj;
            if (xVar == null) {
                xVar = (o0.x) interfaceC1016l.o(string);
            }
            if (xVar != null) {
                return xVar;
            }
        }
        return (o0.x) U2.p.G(list);
    }

    private final List x(List list, final int i4, List list2, List list3) {
        final ArrayList arrayList = new ArrayList(U2.p.o(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(o0((String) it.next()));
        }
        final List listQ = o3.h.q(o3.h.o(o3.h.o(U2.p.y(list3), new InterfaceC1016l() { // from class: cab.shashki.app.ui.custom.board.s
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return C0843z.y((String) obj);
            }
        }), new InterfaceC1016l() { // from class: cab.shashki.app.ui.custom.board.t
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return C0843z.z((List) obj);
            }
        }));
        return o3.h.q(o3.h.i(o3.h.o(U2.p.y(list), new InterfaceC1016l() { // from class: cab.shashki.app.ui.custom.board.u
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return C0843z.A(i4, (T2.l) obj);
            }
        }), new InterfaceC1016l() { // from class: cab.shashki.app.ui.custom.board.v
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return Boolean.valueOf(C0843z.B(arrayList, listQ, (T2.l) obj));
            }
        }));
    }

    public static final List y(String str) {
        h3.m.e(str, "it");
        return p3.n.h0(str, new char[]{':'}, false, 2, 2, null);
    }

    public static final T2.l z(List list) {
        h3.m.e(list, "it");
        C0843z c0843z = f11502a;
        return new T2.l(c0843z.o0((String) list.get(0)), c0843z.o0((String) list.get(1)));
    }

    public final List C(int i4, int i5, List list, List list2) {
        h3.m.e(list, "blocked");
        h3.m.e(list2, "breaks");
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = 0;
            while (i7 < i4) {
                Point point = new Point(i7, i6);
                int i8 = i7 + 1;
                if (i8 < i4) {
                    arrayList.add(new T2.l(point, new Point(i8, i6)));
                    int i9 = i6 + 1;
                    if (i9 < i5 && (i7 & 1) == (i6 & 1)) {
                        arrayList.add(new T2.l(point, new Point(i8, i9)));
                    }
                }
                int i10 = i6 + 1;
                if (i10 < i5) {
                    arrayList.add(new T2.l(point, new Point(i7, i10)));
                    if (i7 > 0 && (i7 & 1) == (i6 & 1)) {
                        arrayList.add(new T2.l(point, new Point(i7 - 1, i10)));
                    }
                }
                i7 = i8;
            }
        }
        return x(arrayList, i5, list, list2);
    }

    public final o0.x D(int i4, cab.shashki.app.db.entities.a aVar) {
        if (i4 == AbstractC0888D.t5 || i4 == AbstractC0888D.g5 || i4 == AbstractC0888D.K5 || i4 == AbstractC0888D.f5 || i4 == AbstractC0888D.r5 || i4 == AbstractC0888D.c6 || i4 == AbstractC0888D.Y5 || i4 == AbstractC0888D.Q5 || i4 == AbstractC0888D.l6 || i4 == AbstractC0888D.m5 || i4 == AbstractC0888D.w5 || i4 == AbstractC0888D.u5 || i4 == AbstractC0888D.L5 || i4 == AbstractC0888D.m6 || i4 == AbstractC0888D.q5) {
            return w(AbstractC0888D.f14429U0, C1218E.f18139a.c(), new InterfaceC1016l() { // from class: cab.shashki.app.ui.custom.board.d
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return C0843z.F((String) obj);
                }
            });
        }
        if (i4 == AbstractC0888D.D6 || i4 == AbstractC0888D.P5) {
            return w(AbstractC0888D.f14347B1, C1218E.f18139a.w(), new InterfaceC1016l() { // from class: cab.shashki.app.ui.custom.board.e
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return C0843z.G((String) obj);
                }
            });
        }
        if (i4 == AbstractC0888D.j6 || i4 == AbstractC0888D.n5) {
            return w(AbstractC0888D.f14494i1, C1218E.f18139a.p(), new InterfaceC1016l() { // from class: cab.shashki.app.ui.custom.board.f
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return C0843z.H((String) obj);
                }
            });
        }
        if (i4 == AbstractC0888D.a6) {
            return A1.f2575a;
        }
        if (i4 == AbstractC0888D.z6 || i4 == AbstractC0888D.A6 || i4 == AbstractC0888D.B6 || i4 == AbstractC0888D.y6 || i4 == AbstractC0888D.C6) {
            return w(AbstractC0888D.f14433V0, C1218E.f18139a.d(), new InterfaceC1016l() { // from class: cab.shashki.app.ui.custom.board.g
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return C0843z.I((String) obj);
                }
            });
        }
        if (i4 == AbstractC0888D.n6 || i4 == AbstractC0888D.Z5) {
            return w(AbstractC0888D.f14524o1, C1218E.f18139a.r(), new InterfaceC1016l() { // from class: cab.shashki.app.ui.custom.board.h
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return C0843z.J((String) obj);
                }
            });
        }
        if (i4 == AbstractC0888D.U5) {
            return C1218E.f18139a.k();
        }
        if (i4 == AbstractC0888D.w6 || i4 == AbstractC0888D.v5 || i4 == AbstractC0888D.t6 || i4 == AbstractC0888D.s6) {
            return C1218E.f18139a.v();
        }
        if (i4 == AbstractC0888D.W5) {
            return w(AbstractC0888D.f14474e1, C1218E.f18139a.n(), new InterfaceC1016l() { // from class: cab.shashki.app.ui.custom.board.i
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return C0843z.K((String) obj);
                }
            });
        }
        if (i4 == AbstractC0888D.p5 || i4 == AbstractC0888D.G5) {
            return (o0.x) U2.p.G(C1218E.f18139a.a());
        }
        if (i4 == AbstractC0888D.i6) {
            return C1218E.f18139a.q();
        }
        if (i4 == AbstractC0888D.y5) {
            FairyRepository fairyRepository = FairyRepository.f10588a;
            h3.m.c(aVar, "null cannot be cast to non-null type cab.shashki.app.service.FairyRepository.CustomEngine");
            return fairyRepository.s((FairyRepository.a) aVar);
        }
        if (i4 == AbstractC0888D.A5) {
            HalmaParams halmaParams = aVar instanceof HalmaParams ? (HalmaParams) aVar : null;
            return (halmaParams == null || !halmaParams.isStern()) ? (aVar == null || !aVar.is4()) ? w(AbstractC0888D.f14433V0, C1218E.f18139a.d(), new InterfaceC1016l() { // from class: cab.shashki.app.ui.custom.board.j
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return C0843z.L((String) obj);
                }
            }) : C1218E.f18139a.s() : C1218E.f18139a.t();
        }
        if (i4 != AbstractC0888D.x5) {
            return w(AbstractC0888D.f14425T0, C1218E.f18139a.b(), new InterfaceC1016l() { // from class: cab.shashki.app.ui.custom.board.l
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return C0843z.N((String) obj);
                }
            });
        }
        h3.m.c(aVar, "null cannot be cast to non-null type cab.shashki.app.db.entities.CheckersParams");
        CheckersParams checkersParams = (CheckersParams) aVar;
        return checkersParams.getCells() == Cells.HEXAGON ? checkersParams.getFourPlayers() ? (checkersParams.getTowerCapture() || checkersParams.getLayeredPiece()) ? C1218E.f18139a.e() : checkersParams.getGorgonCapture() ? C1218E.f18139a.g() : C1218E.f18139a.i() : (checkersParams.getTowerCapture() || checkersParams.getLayeredPiece()) ? C1218E.f18139a.f() : checkersParams.getGorgonCapture() ? C1218E.f18139a.h() : C1218E.f18139a.j() : checkersParams.getFourPlayers() ? (checkersParams.getTowerCapture() || checkersParams.getLayeredPiece()) ? C1218E.f18139a.u() : checkersParams.getGorgonCapture() ? C1218E.f18139a.l() : C1218E.f18139a.o() : (checkersParams.getTowerCapture() || checkersParams.getLayeredPiece()) ? C1218E.f18139a.v() : checkersParams.getGorgonCapture() ? C1218E.f18139a.m() : w(AbstractC0888D.f14425T0, C1218E.f18139a.b(), new InterfaceC1016l() { // from class: cab.shashki.app.ui.custom.board.k
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return C0843z.M((String) obj);
            }
        });
    }

    public final c O(FairyRepository.a aVar) {
        String absolutePath;
        if (aVar == null) {
            return f.f11546a.g(0);
        }
        final FairyRepository.GameParams gameParamsC = aVar.c();
        if (gameParamsC.getUniversalBoard()) {
            return g0(gameParamsC.getX(), gameParamsC.getY(), aVar.boardExtra());
        }
        Point point = new Point();
        Point point2 = new Point();
        int x4 = gameParamsC.getX();
        int y4 = gameParamsC.getY();
        Integer handMode = gameParamsC.getHandMode();
        int iV = V(x4, y4, handMode != null ? handMode.intValue() : 0, point, point2);
        int iMax = Math.max(point2.x, point2.y);
        final int x5 = gameParamsC.getX() + point.x;
        final int y5 = gameParamsC.getY() + point.y;
        c cVarF = c.f(f.f11546a.g(24), 0, 0, 0, 0, null, null, 0.0f, 0.0f, 0, 0, 0, false, 0, 0, null, 0, 0, 0, 0, 0, 1048575, null);
        cVarF.I(x5);
        cVarF.J(y5);
        cVarF.A(iMax);
        cVarF.G(iV);
        cVarF.D(new InterfaceC1016l() { // from class: cab.shashki.app.ui.custom.board.o
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return Float.valueOf(C0843z.P(x5, gameParamsC, ((Integer) obj).intValue()));
            }
        });
        cVarF.E(new InterfaceC1016l() { // from class: cab.shashki.app.ui.custom.board.p
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return Float.valueOf(C0843z.Q(y5, gameParamsC, ((Integer) obj).intValue()));
            }
        });
        cVarF.M(point.x >> 1);
        cVarF.N(point.y >> 1);
        cVarF.K(gameParamsC.getOx());
        cVarF.L(gameParamsC.getOy());
        cVarF.C(0);
        if (gameParamsC.getBoardFile() == null) {
            absolutePath = "0";
        } else {
            absolutePath = new File(new File(FairyRepository.f10588a.k(), aVar.a()), gameParamsC.getBoardFile()).getAbsolutePath();
            h3.m.b(absolutePath);
        }
        cVarF.B(absolutePath);
        return cVarF;
    }

    public final c R(int i4, int i5) {
        c cVarF = c.f(f.f11546a.g(25), 0, 0, 0, 0, null, null, 0.0f, 0.0f, 0, 0, 0, false, 0, 0, null, 0, 0, 0, 0, 0, 1048575, null);
        C0574l.f2981a.b(0, 0, i4, i5, cVarF);
        cVarF.F(((i4 * i5) >> 1) + (i4 & i5 & 1));
        return cVarF;
    }

    public final c S(int i4) {
        c cVarF = c.f(f.f11546a.g(21), 0, 0, 0, 0, null, null, 0.0f, 0.0f, 0, 0, 0, false, 0, 0, null, 0, 0, 0, 0, 0, 1048575, null);
        int i5 = (i4 << 1) - 1;
        C0574l.f2981a.c((i4 & 1) ^ 1, 0, i5, i5, cVarF);
        cVarF.F((i4 * 3 * (i4 - 1)) + 1);
        return cVarF;
    }

    public final c U(int i4, String str, boolean z4, cab.shashki.app.db.entities.a aVar) {
        h3.m.e(str, "board");
        return i4 == AbstractC0888D.C6 ? f.f11546a.g(2) : i4 == AbstractC0888D.U5 ? f.f11546a.g(4) : i4 == AbstractC0888D.Y5 ? f.f11546a.g(3) : i4 == AbstractC0888D.Q5 ? f.f11546a.g(8) : i4 == AbstractC0888D.n5 ? f.f11546a.g(9) : AbstractC0590i.q(new Integer[]{Integer.valueOf(AbstractC0888D.w5), Integer.valueOf(AbstractC0888D.u5)}, Integer.valueOf(i4)) ? f.f11546a.g(12) : AbstractC0590i.q(new Integer[]{Integer.valueOf(AbstractC0888D.p5), Integer.valueOf(AbstractC0888D.p6)}, Integer.valueOf(i4)) ? f.f11546a.g(14) : i4 == AbstractC0888D.G5 ? f.f11546a.g(11) : i4 == AbstractC0888D.L5 ? f.f11546a.g(13) : AbstractC0590i.q(new Integer[]{Integer.valueOf(AbstractC0888D.D6), Integer.valueOf(AbstractC0888D.P5)}, Integer.valueOf(i4)) ? f.f11546a.g(16) : i4 == AbstractC0888D.n6 ? f.f11546a.g(17) : i4 == AbstractC0888D.Z5 ? f.f11546a.g(18) : i4 == AbstractC0888D.i6 ? f.f11546a.g(10) : AbstractC0590i.q(new Integer[]{Integer.valueOf(AbstractC0888D.w6), Integer.valueOf(AbstractC0888D.v5), Integer.valueOf(AbstractC0888D.t6), Integer.valueOf(AbstractC0888D.s6)}, Integer.valueOf(i4)) ? f.f11546a.g(7) : AbstractC0590i.q(new Integer[]{Integer.valueOf(AbstractC0888D.M5), Integer.valueOf(AbstractC0888D.S5), Integer.valueOf(AbstractC0888D.l5), Integer.valueOf(AbstractC0888D.h5), Integer.valueOf(AbstractC0888D.D5)}, Integer.valueOf(i4)) ? f.f11546a.g(15) : AbstractC0590i.q(new Integer[]{Integer.valueOf(AbstractC0888D.o5), Integer.valueOf(AbstractC0888D.X5), Integer.valueOf(AbstractC0888D.q6)}, Integer.valueOf(i4)) ? f.f11546a.g(19) : aVar instanceof FairyRepository.a ? O((FairyRepository.a) aVar) : aVar != null ? h0(aVar) : (h3.m.a(str, "1") && z4) ? f.f11546a.g(6) : h3.m.a(str, "1") ? f.f11546a.g(5) : f.f11546a.g(1);
    }

    public final c W(final int i4) {
        c cVarF = c.f(f.f11546a.g(20), 0, 0, 0, 0, null, null, 0.0f, 0.0f, 0, 0, 0, false, 0, 0, null, 0, 0, 0, 0, 0, 1048575, null);
        cVarF.I(i4);
        cVarF.J(i4);
        cVarF.A((i4 * 4) + 2);
        cVarF.D(new InterfaceC1016l() { // from class: cab.shashki.app.ui.custom.board.x
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return Float.valueOf(C0843z.X(i4, ((Integer) obj).intValue()));
            }
        });
        cVarF.E(new InterfaceC1016l() { // from class: cab.shashki.app.ui.custom.board.y
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return Float.valueOf(C0843z.Y(i4, ((Integer) obj).intValue()));
            }
        });
        cVarF.K(1.0f);
        cVarF.L(1.0f);
        return cVarF;
    }

    public final c Z(int i4, int i5, int i6) {
        final int iMax = Math.max(i4, i5) << 1;
        c cVarF = c.f(f.f11546a.g(23), 0, 0, 0, 0, null, null, 0.0f, 0.0f, 0, 0, 0, false, 0, 0, null, 0, 0, 0, 0, 0, 1048575, null);
        cVarF.A(iMax);
        cVarF.G(i6);
        cVarF.I(i4);
        cVarF.J(i5);
        cVarF.D(new InterfaceC1016l() { // from class: cab.shashki.app.ui.custom.board.m
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return Float.valueOf(C0843z.b0(iMax, ((Integer) obj).intValue()));
            }
        });
        cVarF.E(new InterfaceC1016l() { // from class: cab.shashki.app.ui.custom.board.n
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return Float.valueOf(C0843z.a0(iMax, ((Integer) obj).intValue()));
            }
        });
        cVarF.K((iMax - (i4 << 1)) >> 1);
        cVarF.L((iMax - (i5 << 1)) >> 1);
        return cVarF;
    }

    public final h c0(int i4) {
        return (i4 == AbstractC0888D.g6 || i4 == AbstractC0888D.q6) ? h.f11551e : i4 == AbstractC0888D.N5 ? h.f11554h : (i4 == AbstractC0888D.s5 || (i4 == AbstractC0888D.f6 && !C1277a.f19012a.e())) ? h.f11553g : (i4 == AbstractC0888D.v6 || (i4 == AbstractC0888D.k5 && !C1277a.f19012a.c())) ? h.f11552f : h.f11550d;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final cab.shashki.app.ui.custom.board.C0843z.a d0(int r18, android.content.Context r19, cab.shashki.app.db.entities.a r20) {
        /*
            r17 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.String r3 = "ctx"
            h3.m.e(r1, r3)
            t0.g r3 = t0.C1383g.f19765a
            android.content.SharedPreferences r4 = cab.shashki.app.ui.custom.board.C0843z.f11503b
            int r5 = f0.AbstractC0888D.f14569x1
            java.lang.String r5 = r1.getString(r5)
            r6 = 0
            java.lang.String r5 = r4.getString(r5, r6)
            boolean r3 = r3.a(r1, r5)
            if (r3 == 0) goto L30
            int r3 = f0.AbstractC0888D.f14437W0
            java.lang.String r3 = r1.getString(r3)
            r7 = -72057589755198139(0xff000000ff454545, double:-5.486129285862026E303)
            long r7 = r4.getLong(r3, r7)
            goto L3f
        L30:
            int r3 = f0.AbstractC0888D.f14421S0
            java.lang.String r3 = r1.getString(r3)
            r7 = -24625431216272996(0xffa8834cffe9c99c, double:-8.606769661918005E306)
            long r7 = r4.getLong(r3, r7)
        L3f:
            int r3 = f0.AbstractC0888D.f14417R0
            java.lang.String r3 = r1.getString(r3)
            java.lang.String r3 = r4.getString(r3, r6)
            if (r3 != 0) goto L4d
            java.lang.String r3 = "1"
        L4d:
            int r5 = f0.AbstractC0888D.f14397M0
            java.lang.String r1 = r1.getString(r5)
            r5 = 1
            boolean r1 = r4.getBoolean(r1, r5)
            int r4 = f0.AbstractC0888D.x5
            if (r0 != r4) goto L5f
        L5c:
            r4 = r17
            goto L61
        L5f:
            r5 = 0
            goto L5c
        L61:
            cab.shashki.app.ui.custom.board.z$c r10 = r4.U(r0, r3, r1, r2)
            cab.shashki.app.ui.custom.board.z$h r11 = r17.c0(r18)
            boolean r0 = r2 instanceof cab.shashki.app.db.entities.CheckersParams
            if (r0 == 0) goto L71
            r1 = r2
            cab.shashki.app.db.entities.CheckersParams r1 = (cab.shashki.app.db.entities.CheckersParams) r1
            goto L72
        L71:
            r1 = r6
        L72:
            if (r1 == 0) goto L86
            java.util.Set r1 = r1.getBlocked()
            if (r1 == 0) goto L86
            if (r5 == 0) goto L7d
            goto L7e
        L7d:
            r1 = r6
        L7e:
            if (r1 == 0) goto L86
            java.util.List r1 = U2.p.b0(r1)
            r12 = r1
            goto L87
        L86:
            r12 = r6
        L87:
            if (r0 == 0) goto L8d
            r1 = r2
            cab.shashki.app.db.entities.CheckersParams r1 = (cab.shashki.app.db.entities.CheckersParams) r1
            goto L8e
        L8d:
            r1 = r6
        L8e:
            if (r1 == 0) goto La2
            java.util.Set r1 = r1.getBreaks()
            if (r1 == 0) goto La2
            if (r5 == 0) goto L99
            goto L9a
        L99:
            r1 = r6
        L9a:
            if (r1 == 0) goto La2
            java.util.List r1 = U2.p.b0(r1)
            r13 = r1
            goto La3
        La2:
            r13 = r6
        La3:
            if (r0 == 0) goto La9
            r0 = r2
            cab.shashki.app.db.entities.CheckersParams r0 = (cab.shashki.app.db.entities.CheckersParams) r0
            goto Laa
        La9:
            r0 = r6
        Laa:
            if (r0 == 0) goto Lbc
            java.util.Set r0 = r0.getSpins()
            if (r0 == 0) goto Lbc
            if (r5 == 0) goto Lb5
            goto Lb6
        Lb5:
            r0 = r6
        Lb6:
            if (r0 == 0) goto Lbc
            java.util.List r6 = U2.p.b0(r0)
        Lbc:
            r14 = r6
            cab.shashki.app.preference.BoardColorsPreference$a r0 = cab.shashki.app.preference.BoardColorsPreference.f10576b0
            int r15 = r0.a(r7)
            int r16 = r0.b(r7)
            cab.shashki.app.ui.custom.board.z$a r9 = new cab.shashki.app.ui.custom.board.z$a
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: cab.shashki.app.ui.custom.board.C0843z.d0(int, android.content.Context, cab.shashki.app.db.entities.a):cab.shashki.app.ui.custom.board.z$a");
    }

    public final c f0(int i4) {
        int i5 = (i4 * 4) - 3;
        c cVarF = c.f(f.f11546a.g(26), 0, 0, 0, 0, null, null, 0.0f, 0.0f, 0, 0, 0, false, 0, 0, null, 0, 0, 0, 0, 0, 1048575, null);
        cVarF.A(i5 << 1);
        cVarF.F(i4);
        cVarF.L(0.0f);
        cVarF.K(i4 * 0.75f);
        cVarF.I((i4 * 3) - 2);
        cVarF.J(i5);
        return cVarF;
    }

    public final c h0(cab.shashki.app.db.entities.a aVar) {
        if (aVar == null) {
            return f.f11546a.g(0);
        }
        HalmaParams halmaParams = aVar instanceof HalmaParams ? (HalmaParams) aVar : null;
        if (halmaParams != null && halmaParams.isStern()) {
            return f0(((HalmaParams) aVar).getSize());
        }
        CheckersParams checkersParams = aVar instanceof CheckersParams ? (CheckersParams) aVar : null;
        Cells cells = checkersParams != null ? checkersParams.getCells() : null;
        int i4 = cells == null ? -1 : m.f11565a[cells.ordinal()];
        if (i4 == 1) {
            return W(((CheckersParams) aVar).getColumns());
        }
        if (i4 == 2) {
            CheckersParams checkersParams2 = (CheckersParams) aVar;
            return Z(checkersParams2.getColumns(), checkersParams2.getRows(), 4);
        }
        if (i4 == 3) {
            CheckersParams checkersParams3 = (CheckersParams) aVar;
            return Z(checkersParams3.getColumns(), checkersParams3.getRows(), 5);
        }
        if (i4 == 4) {
            return S(((CheckersParams) aVar).getColumns());
        }
        if (i4 != 5) {
            return g0(aVar.columns(), aVar.rows(), aVar.boardExtra());
        }
        CheckersParams checkersParams4 = (CheckersParams) aVar;
        return R(checkersParams4.getColumns(), checkersParams4.getRows());
    }

    public final List k0(int i4, int i5, List list, List list2) {
        h3.m.e(list, "blocked");
        h3.m.e(list2, "breaks");
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = 0;
            while (i7 < i4) {
                Point point = new Point(i7, i6);
                int i8 = i7 + 1;
                if (i8 < i4) {
                    int i9 = i6 & 1;
                    if (i9 == 0) {
                        arrayList.add(new T2.l(point, new Point(i8, i6)));
                    }
                    int i10 = i6 + 1;
                    if (i10 < i5 && (i7 & 1) == i9) {
                        arrayList.add(new T2.l(point, new Point(i8, i10)));
                    }
                }
                int i11 = i6 + 1;
                if (i11 < i5) {
                    int i12 = i7 & 1;
                    if (i12 == 0) {
                        arrayList.add(new T2.l(point, new Point(i7, i11)));
                    }
                    if (i7 > 0 && i12 == (i6 & 1)) {
                        arrayList.add(new T2.l(point, new Point(i7 - 1, i11)));
                    }
                }
                i7 = i8;
            }
        }
        return x(arrayList, i5, list, list2);
    }

    public final boolean l0(c cVar) {
        h3.m.e(cVar, "mode");
        return cVar.p() == 21 || cVar.p() == 25;
    }

    public final Drawable m0(Context context, boolean z4, File file) throws IOException {
        h3.m.e(context, "context");
        h3.m.e(file, "imageFile");
        if (z4) {
            Picture pictureN = C1101i.h(new FileInputStream(file)).n();
            h3.m.d(pictureN, "renderToPicture(...)");
            return new l(pictureN);
        }
        if (Build.VERSION.SDK_INT < 28) {
            return new BitmapDrawable(context.getResources(), BitmapFactory.decodeFile(file.getAbsolutePath()));
        }
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(file), new ImageDecoder.OnHeaderDecodedListener() { // from class: cab.shashki.app.ui.custom.board.w
            @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
            public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                C0843z.n0(imageDecoder, imageInfo, source);
            }
        });
        h3.m.b(drawableDecodeDrawable);
        return drawableDecodeDrawable;
    }

    /* renamed from: cab.shashki.app.ui.custom.board.z$j */
    public static final class j extends PointF implements i {

        /* renamed from: d */
        private String f11557d;

        /* renamed from: e */
        private int f11558e;

        /* renamed from: f */
        private int f11559f;

        /* renamed from: g */
        private String f11560g;

        /* renamed from: h */
        private boolean f11561h;

        public j() {
            this.f11557d = "";
        }

        @Override // cab.shashki.app.ui.custom.board.C0843z.i
        public int a() {
            return this.f11558e;
        }

        @Override // cab.shashki.app.ui.custom.board.C0843z.i
        public String b() {
            return this.f11560g;
        }

        @Override // cab.shashki.app.ui.custom.board.C0843z.i
        public int d() {
            return this.f11559f;
        }

        public final boolean f() {
            return this.f11561h;
        }

        public void g(int i4) {
            this.f11559f = i4;
        }

        @Override // cab.shashki.app.ui.custom.board.C0843z.i
        public String getPosition() {
            return this.f11557d;
        }

        public void h(String str) {
            this.f11560g = str;
        }

        public void i(String str) {
            h3.m.e(str, "<set-?>");
            this.f11557d = str;
        }

        public void j(int i4) {
            this.f11558e = i4;
        }

        public final void k(boolean z4) {
            this.f11561h = z4;
        }

        public j(String str, int i4) {
            h3.m.e(str, "position");
            this.f11557d = "";
            i(str);
            j(i4);
            if (i4 == 128) {
                h("E");
            }
        }

        public j(String str, String str2, String str3) {
            h3.m.e(str, "position");
            h3.m.e(str2, "extra");
            h3.m.e(str3, "types");
            this.f11557d = "";
            i(str);
            h(str2);
            j(p3.n.M(str3, str2.charAt(0), 0, false, 6, null));
        }

        public j(String str, int i4, int i5, String str2) {
            h3.m.e(str, "position");
            this.f11557d = "";
            i(str);
            j(i4);
            g(i5);
            h(str2);
        }
    }

    /* renamed from: cab.shashki.app.ui.custom.board.z$c */
    public static final class c {

        /* renamed from: a */
        private final int f11514a;

        /* renamed from: b */
        private int f11515b;

        /* renamed from: c */
        private int f11516c;

        /* renamed from: d */
        private int f11517d;

        /* renamed from: e */
        private InterfaceC1016l f11518e;

        /* renamed from: f */
        private InterfaceC1016l f11519f;

        /* renamed from: g */
        private float f11520g;

        /* renamed from: h */
        private float f11521h;

        /* renamed from: i */
        private int f11522i;

        /* renamed from: j */
        private int f11523j;

        /* renamed from: k */
        private int f11524k;

        /* renamed from: l */
        private boolean f11525l;

        /* renamed from: m */
        private int f11526m;

        /* renamed from: n */
        private int f11527n;

        /* renamed from: o */
        private String f11528o;

        /* renamed from: p */
        private final int f11529p;

        /* renamed from: q */
        private final int f11530q;

        /* renamed from: r */
        private final int f11531r;

        /* renamed from: s */
        private final int f11532s;

        /* renamed from: t */
        private final int f11533t;

        public c(int i4, int i5, int i6, int i7, InterfaceC1016l interfaceC1016l, InterfaceC1016l interfaceC1016l2, float f4, float f5, int i8, int i9, int i10, boolean z4, int i11, int i12, String str, int i13, int i14, int i15, int i16, int i17) {
            h3.m.e(interfaceC1016l, "cellX");
            h3.m.e(interfaceC1016l2, "cellY");
            h3.m.e(str, "boardFile");
            this.f11514a = i4;
            this.f11515b = i5;
            this.f11516c = i6;
            this.f11517d = i7;
            this.f11518e = interfaceC1016l;
            this.f11519f = interfaceC1016l2;
            this.f11520g = f4;
            this.f11521h = f5;
            this.f11522i = i8;
            this.f11523j = i9;
            this.f11524k = i10;
            this.f11525l = z4;
            this.f11526m = i11;
            this.f11527n = i12;
            this.f11528o = str;
            this.f11529p = i13;
            this.f11530q = i14;
            this.f11531r = i15;
            this.f11532s = i16;
            this.f11533t = i17;
        }

        public static final float c(int i4, int i5) {
            return (i5 * 2.0f) / i4;
        }

        public static final float d(int i4, int i5) {
            return (i5 * 2.0f) / i4;
        }

        public static /* synthetic */ c f(c cVar, int i4, int i5, int i6, int i7, InterfaceC1016l interfaceC1016l, InterfaceC1016l interfaceC1016l2, float f4, float f5, int i8, int i9, int i10, boolean z4, int i11, int i12, String str, int i13, int i14, int i15, int i16, int i17, int i18, Object obj) {
            int i19;
            int i20;
            int i21 = (i18 & 1) != 0 ? cVar.f11514a : i4;
            int i22 = (i18 & 2) != 0 ? cVar.f11515b : i5;
            int i23 = (i18 & 4) != 0 ? cVar.f11516c : i6;
            int i24 = (i18 & 8) != 0 ? cVar.f11517d : i7;
            InterfaceC1016l interfaceC1016l3 = (i18 & 16) != 0 ? cVar.f11518e : interfaceC1016l;
            InterfaceC1016l interfaceC1016l4 = (i18 & 32) != 0 ? cVar.f11519f : interfaceC1016l2;
            float f6 = (i18 & 64) != 0 ? cVar.f11520g : f4;
            float f7 = (i18 & 128) != 0 ? cVar.f11521h : f5;
            int i25 = (i18 & 256) != 0 ? cVar.f11522i : i8;
            int i26 = (i18 & 512) != 0 ? cVar.f11523j : i9;
            int i27 = (i18 & 1024) != 0 ? cVar.f11524k : i10;
            boolean z5 = (i18 & 2048) != 0 ? cVar.f11525l : z4;
            int i28 = (i18 & 4096) != 0 ? cVar.f11526m : i11;
            int i29 = (i18 & 8192) != 0 ? cVar.f11527n : i12;
            int i30 = i21;
            String str2 = (i18 & 16384) != 0 ? cVar.f11528o : str;
            int i31 = (i18 & 32768) != 0 ? cVar.f11529p : i13;
            int i32 = (i18 & 65536) != 0 ? cVar.f11530q : i14;
            int i33 = (i18 & 131072) != 0 ? cVar.f11531r : i15;
            int i34 = (i18 & 262144) != 0 ? cVar.f11532s : i16;
            if ((i18 & 524288) != 0) {
                i20 = i34;
                i19 = cVar.f11533t;
            } else {
                i19 = i17;
                i20 = i34;
            }
            return cVar.e(i30, i22, i23, i24, interfaceC1016l3, interfaceC1016l4, f6, f7, i25, i26, i27, z5, i28, i29, str2, i31, i32, i33, i20, i19);
        }

        public final void A(int i4) {
            this.f11517d = i4;
        }

        public final void B(String str) {
            h3.m.e(str, "<set-?>");
            this.f11528o = str;
        }

        public final void C(int i4) {
            this.f11527n = i4;
        }

        public final void D(InterfaceC1016l interfaceC1016l) {
            h3.m.e(interfaceC1016l, "<set-?>");
            this.f11518e = interfaceC1016l;
        }

        public final void E(InterfaceC1016l interfaceC1016l) {
            h3.m.e(interfaceC1016l, "<set-?>");
            this.f11519f = interfaceC1016l;
        }

        public final void F(int i4) {
            this.f11524k = i4;
        }

        public final void G(int i4) {
            this.f11526m = i4;
        }

        public final void H(boolean z4) {
            this.f11525l = z4;
        }

        public final void I(int i4) {
            this.f11515b = i4;
        }

        public final void J(int i4) {
            this.f11516c = i4;
        }

        public final void K(float f4) {
            this.f11520g = f4;
        }

        public final void L(float f4) {
            this.f11521h = f4;
        }

        public final void M(int i4) {
            this.f11522i = i4;
        }

        public final void N(int i4) {
            this.f11523j = i4;
        }

        public final c e(int i4, int i5, int i6, int i7, InterfaceC1016l interfaceC1016l, InterfaceC1016l interfaceC1016l2, float f4, float f5, int i8, int i9, int i10, boolean z4, int i11, int i12, String str, int i13, int i14, int i15, int i16, int i17) {
            h3.m.e(interfaceC1016l, "cellX");
            h3.m.e(interfaceC1016l2, "cellY");
            h3.m.e(str, "boardFile");
            return new c(i4, i5, i6, i7, interfaceC1016l, interfaceC1016l2, f4, f5, i8, i9, i10, z4, i11, i12, str, i13, i14, i15, i16, i17);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f11514a == cVar.f11514a && this.f11515b == cVar.f11515b && this.f11516c == cVar.f11516c && this.f11517d == cVar.f11517d && h3.m.a(this.f11518e, cVar.f11518e) && h3.m.a(this.f11519f, cVar.f11519f) && Float.compare(this.f11520g, cVar.f11520g) == 0 && Float.compare(this.f11521h, cVar.f11521h) == 0 && this.f11522i == cVar.f11522i && this.f11523j == cVar.f11523j && this.f11524k == cVar.f11524k && this.f11525l == cVar.f11525l && this.f11526m == cVar.f11526m && this.f11527n == cVar.f11527n && h3.m.a(this.f11528o, cVar.f11528o) && this.f11529p == cVar.f11529p && this.f11530q == cVar.f11530q && this.f11531r == cVar.f11531r && this.f11532s == cVar.f11532s && this.f11533t == cVar.f11533t;
        }

        public final int g() {
            return this.f11517d;
        }

        public final String h() {
            return this.f11528o;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((this.f11514a * 31) + this.f11515b) * 31) + this.f11516c) * 31) + this.f11517d) * 31) + this.f11518e.hashCode()) * 31) + this.f11519f.hashCode()) * 31) + Float.floatToIntBits(this.f11520g)) * 31) + Float.floatToIntBits(this.f11521h)) * 31) + this.f11522i) * 31) + this.f11523j) * 31) + this.f11524k) * 31) + AbstractC1051f.a(this.f11525l)) * 31) + this.f11526m) * 31) + this.f11527n) * 31) + this.f11528o.hashCode()) * 31) + this.f11529p) * 31) + this.f11530q) * 31) + this.f11531r) * 31) + this.f11532s) * 31) + this.f11533t;
        }

        public final int i() {
            return this.f11527n;
        }

        public final InterfaceC1016l j() {
            return this.f11518e;
        }

        public final InterfaceC1016l k() {
            return this.f11519f;
        }

        public final int l() {
            return this.f11524k;
        }

        public final int m() {
            return this.f11526m;
        }

        public final int n() {
            return this.f11530q;
        }

        public final int o() {
            return this.f11531r;
        }

        public final int p() {
            return this.f11514a;
        }

        public final boolean q() {
            return this.f11525l;
        }

        public final int r() {
            return this.f11529p;
        }

        public final int s() {
            return this.f11515b;
        }

        public final int t() {
            return this.f11516c;
        }

        public String toString() {
            return "GridMode(id=" + this.f11514a + ", nx=" + this.f11515b + ", ny=" + this.f11516c + ", atoms=" + this.f11517d + ", cellX=" + this.f11518e + ", cellY=" + this.f11519f + ", offsetXhalfMult=" + this.f11520g + ", offsetYhalfMult=" + this.f11521h + ", startCellX=" + this.f11522i + ", startCellY=" + this.f11523j + ", dynamicSize=" + this.f11524k + ", margin=" + this.f11525l + ", extra=" + this.f11526m + ", boardRes=" + this.f11527n + ", boardFile=" + this.f11528o + ", moveHighlight=" + this.f11529p + ", fromB=" + this.f11530q + ", fromW=" + this.f11531r + ", toB=" + this.f11532s + ", toW=" + this.f11533t + ")";
        }

        public final float u() {
            return this.f11520g;
        }

        public final float v() {
            return this.f11521h;
        }

        public final int w() {
            return this.f11522i;
        }

        public final int x() {
            return this.f11523j;
        }

        public final int y() {
            return this.f11532s;
        }

        public final int z() {
            return this.f11533t;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
            	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
            	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
            */
        public /* synthetic */ c(int r22, int r23, int r24, int r25, g3.InterfaceC1016l r26, g3.InterfaceC1016l r27, float r28, float r29, int r30, int r31, int r32, boolean r33, int r34, int r35, java.lang.String r36, int r37, int r38, int r39, int r40, int r41, int r42, h3.h r43) {
            /*
                Method dump skipped, instructions count: 199
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: cab.shashki.app.ui.custom.board.C0843z.c.<init>(int, int, int, int, g3.l, g3.l, float, float, int, int, int, boolean, int, int, java.lang.String, int, int, int, int, int, int, h3.h):void");
        }
    }
}