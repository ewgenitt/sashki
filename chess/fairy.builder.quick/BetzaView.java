package cab.shashki.app.ui.chess.fairy.builder.quick;

import T2.l;
import T2.u;
import U2.AbstractC0590i;
import U2.p;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import cab.shashki.app.db.entities.HalmaParams;
import cab.shashki.app.ui.chess.fairy.builder.quick.BetzaView;
import cab.shashki.app.ui.chess.fairy.builder.quick.a;
import f0.AbstractC0917u;
import g3.InterfaceC1016l;
import g3.InterfaceC1020p;
import h3.m;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p3.n;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class BetzaView extends View {

    /* renamed from: H, reason: collision with root package name */
    public static final d f10948H = new d(null);

    /* renamed from: A, reason: collision with root package name */
    private float f10949A;

    /* renamed from: B, reason: collision with root package name */
    private float f10950B;

    /* renamed from: C, reason: collision with root package name */
    private long f10951C;

    /* renamed from: D, reason: collision with root package name */
    private int f10952D;

    /* renamed from: E, reason: collision with root package name */
    private int f10953E;

    /* renamed from: F, reason: collision with root package name */
    private int f10954F;

    /* renamed from: G, reason: collision with root package name */
    private final List f10955G;

    /* renamed from: b, reason: collision with root package name */
    private final List f10956b;

    /* renamed from: c, reason: collision with root package name */
    private final g[] f10957c;

    /* renamed from: d, reason: collision with root package name */
    private final g[] f10958d;

    /* renamed from: e, reason: collision with root package name */
    private final cab.shashki.app.ui.chess.fairy.builder.quick.a f10959e;

    /* renamed from: f, reason: collision with root package name */
    private final List f10960f;

    /* renamed from: g, reason: collision with root package name */
    private final Paint f10961g;

    /* renamed from: h, reason: collision with root package name */
    private final PointF f10962h;

    /* renamed from: i, reason: collision with root package name */
    private final RectF f10963i;

    /* renamed from: j, reason: collision with root package name */
    private final int f10964j;

    /* renamed from: k, reason: collision with root package name */
    private final int f10965k;

    /* renamed from: l, reason: collision with root package name */
    private String f10966l;

    /* renamed from: m, reason: collision with root package name */
    private String f10967m;

    /* renamed from: n, reason: collision with root package name */
    private int f10968n;

    /* renamed from: o, reason: collision with root package name */
    private int f10969o;

    /* renamed from: p, reason: collision with root package name */
    private c f10970p;

    /* renamed from: q, reason: collision with root package name */
    private float f10971q;

    /* renamed from: r, reason: collision with root package name */
    private float f10972r;

    /* renamed from: s, reason: collision with root package name */
    private float f10973s;

    /* renamed from: t, reason: collision with root package name */
    private float f10974t;

    /* renamed from: u, reason: collision with root package name */
    private float f10975u;

    /* renamed from: v, reason: collision with root package name */
    private float f10976v;

    /* renamed from: w, reason: collision with root package name */
    private float f10977w;

    /* renamed from: x, reason: collision with root package name */
    private float f10978x;

    /* renamed from: y, reason: collision with root package name */
    private float f10979y;

    /* renamed from: z, reason: collision with root package name */
    private float f10980z;

    public interface c {
        void a(String str);
    }

    public static final class d {
        public /* synthetic */ d(h3.h hVar) {
            this();
        }

        private d() {
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private final String f10994a;

        /* renamed from: b, reason: collision with root package name */
        private final int f10995b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC1016l f10996c;

        public e(String str, int i4, InterfaceC1016l interfaceC1016l) {
            m.e(str, HalmaParams.NAME);
            m.e(interfaceC1016l, "action");
            this.f10994a = str;
            this.f10995b = i4;
            this.f10996c = interfaceC1016l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final u b(int i4, InterfaceC1016l interfaceC1016l, int i5, g gVar) {
            m.e(gVar, "state");
            if (gVar.c() == i4) {
                gVar.f(0);
                gVar.e(0);
            } else {
                gVar.f(i4);
                if (((Boolean) interfaceC1016l.o(gVar)).booleanValue()) {
                    gVar.e(i5);
                }
            }
            return u.f3817a;
        }

        public final InterfaceC1016l c() {
            return this.f10996c;
        }

        public final String d() {
            return this.f10994a;
        }

        public final int e() {
            return this.f10995b;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public e(String str, final int i4, final int i5, final InterfaceC1016l interfaceC1016l) {
            this(str, i4, new InterfaceC1016l() { // from class: z0.q
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return BetzaView.e.b(i4, interfaceC1016l, i5, (BetzaView.g) obj);
                }
            });
            m.e(str, HalmaParams.NAME);
            m.e(interfaceC1016l, "limitCheck");
        }
    }

    private final class f {

        /* renamed from: a, reason: collision with root package name */
        private final int f10997a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC1020p f10998b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC1020p f10999c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ BetzaView f11000d;

        public f(BetzaView betzaView, int i4, InterfaceC1020p interfaceC1020p, InterfaceC1020p interfaceC1020p2) {
            m.e(interfaceC1020p, "moveDraw");
            m.e(interfaceC1020p2, "captureDraw");
            this.f11000d = betzaView;
            this.f10997a = i4;
            this.f10998b = interfaceC1020p;
            this.f10999c = interfaceC1020p2;
        }

        public final void a(Canvas canvas, int i4, g gVar, g gVar2) {
            m.e(canvas, "canvas");
            m.e(gVar, "ms");
            m.e(gVar2, "cs");
            if (this.f11000d.f10968n != 2 && gVar.c() == this.f10997a) {
                this.f11000d.f10961g.setColor(this.f11000d.f10953E);
                this.f10998b.k(canvas, Integer.valueOf(i4));
            }
            if (this.f11000d.f10968n == 1 || gVar2.c() != this.f10997a) {
                return;
            }
            this.f11000d.f10961g.setColor(this.f11000d.f10954F);
            this.f10999c.k(canvas, Integer.valueOf(i4));
        }
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        private int f11001a;

        /* renamed from: b, reason: collision with root package name */
        private int f11002b;

        public g(int i4, int i5) {
            this.f11001a = i4;
            this.f11002b = i5;
        }

        public final void a() {
            this.f11001a = 0;
            this.f11002b = 0;
        }

        public final int b() {
            return this.f11002b;
        }

        public final int c() {
            return this.f11001a;
        }

        public final void d(int i4, int i5) {
            this.f11001a = i4;
            this.f11002b = i5;
        }

        public final void e(int i4) {
            this.f11002b = i4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f11001a == gVar.f11001a && this.f11002b == gVar.f11002b;
        }

        public final void f(int i4) {
            this.f11001a = i4;
        }

        public int hashCode() {
            return (this.f11001a * 31) + this.f11002b;
        }

        public String toString() {
            return "State(value=" + this.f11001a + ", limit=" + this.f11002b + ")";
        }

        public /* synthetic */ g(int i4, int i5, int i6, h3.h hVar) {
            this((i6 & 1) != 0 ? 0 : i4, (i6 & 2) != 0 ? 0 : i5);
        }
    }

    public static final class h implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            b bVar = (b) obj;
            b bVar2 = (b) obj2;
            return W2.a.d(Integer.valueOf((bVar.k() << 3) + bVar.j()), Integer.valueOf((bVar2.k() << 3) + bVar2.j()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BetzaView(Context context, AttributeSet attributeSet) {
        h3.h hVar;
        super(context, attributeSet);
        m.e(context, "context");
        int i4 = 0;
        int i5 = 3;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        this.f10956b = p.j(new a('W', new l(1, 0), true, true, false, 16, null), new a('F', new l(1, 1), true, true, false, 16, null), new a('D', new l(2, 0), false, false, true), new a('N', new l(2, 1), true, false, true), new a('A', new l(2, 2), false, false, true), new a('H', new l(3, 0), false, z4, z5, 16, null), new a('C', new l(3, 1), z4, z5, z6, 16, null), new a('Z', new l(3, 2), false, false, true), new a('G', new l(3, 3), z6, false, false, 16, null));
        g[] gVarArr = new g[49];
        int i6 = 0;
        while (true) {
            hVar = null;
            if (i6 >= 49) {
                break;
            }
            gVarArr[i6] = new g(i4, i4, i5, hVar);
            i6++;
        }
        this.f10957c = gVarArr;
        g[] gVarArr2 = new g[49];
        for (int i7 = 0; i7 < 49; i7++) {
            gVarArr2[i7] = new g(i4, i4, i5, hVar);
        }
        this.f10958d = gVarArr2;
        this.f10959e = new cab.shashki.app.ui.chess.fairy.builder.quick.a();
        this.f10960f = N();
        this.f10961g = new Paint();
        this.f10962h = new PointF();
        this.f10963i = new RectF();
        this.f10964j = 10;
        this.f10965k = 7;
        this.f10966l = "";
        this.f10967m = "";
        this.f10969o = 24;
        this.f10971q = 4.0f;
        this.f10972r = 2.0f;
        this.f10973s = 1.0f;
        this.f10974t = 1.0f;
        this.f10975u = 1.0f;
        this.f10976v = 1.0f;
        this.f10977w = 1.0f;
        this.f10978x = 1.0f;
        this.f10979y = 1.0f;
        this.f10980z = 1.0f;
        this.f10949A = 1.0f;
        this.f10950B = 1.0f;
        this.f10952D = -16777216;
        this.f10953E = -16776961;
        this.f10954F = -65536;
        this.f10955G = p.j(new f(this, 1, new InterfaceC1020p() { // from class: z0.a
            @Override // g3.InterfaceC1020p
            public final Object k(Object obj, Object obj2) {
                return BetzaView.B(this.f20795d, (Canvas) obj, ((Integer) obj2).intValue());
            }
        }, new InterfaceC1020p() { // from class: z0.b
            @Override // g3.InterfaceC1020p
            public final Object k(Object obj, Object obj2) {
                return BetzaView.C(this.f20800d, (Canvas) obj, ((Integer) obj2).intValue());
            }
        }), new f(this, 2, new InterfaceC1020p() { // from class: z0.c
            @Override // g3.InterfaceC1020p
            public final Object k(Object obj, Object obj2) {
                return BetzaView.D(this.f20803d, (Canvas) obj, ((Integer) obj2).intValue());
            }
        }, new InterfaceC1020p() { // from class: z0.d
            @Override // g3.InterfaceC1020p
            public final Object k(Object obj, Object obj2) {
                return BetzaView.E(this.f20805d, (Canvas) obj, ((Integer) obj2).intValue());
            }
        }), new f(this, 3, new InterfaceC1020p() { // from class: z0.e
            @Override // g3.InterfaceC1020p
            public final Object k(Object obj, Object obj2) {
                return BetzaView.F(this.f20807d, (Canvas) obj, ((Integer) obj2).intValue());
            }
        }, new InterfaceC1020p() { // from class: z0.f
            @Override // g3.InterfaceC1020p
            public final Object k(Object obj, Object obj2) {
                return BetzaView.G(this.f20812d, (Canvas) obj, ((Integer) obj2).intValue());
            }
        }), new f(this, 4, new InterfaceC1020p() { // from class: z0.g
            @Override // g3.InterfaceC1020p
            public final Object k(Object obj, Object obj2) {
                return BetzaView.H(this.f20817d, (Canvas) obj, ((Integer) obj2).intValue());
            }
        }, new InterfaceC1020p() { // from class: z0.h
            @Override // g3.InterfaceC1020p
            public final Object k(Object obj, Object obj2) {
                return BetzaView.I(this.f20822d, (Canvas) obj, ((Integer) obj2).intValue());
            }
        }), new f(this, 5, new InterfaceC1020p() { // from class: z0.i
            @Override // g3.InterfaceC1020p
            public final Object k(Object obj, Object obj2) {
                return BetzaView.J(this.f20826d, (Canvas) obj, ((Integer) obj2).intValue());
            }
        }, new InterfaceC1020p() { // from class: z0.j
            @Override // g3.InterfaceC1020p
            public final Object k(Object obj, Object obj2) {
                return BetzaView.K(this.f20831d, (Canvas) obj, ((Integer) obj2).intValue());
            }
        }));
        M(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A(android.graphics.Canvas r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            android.graphics.Paint r2 = r0.f10961g
            r3 = 1045220557(0x3e4ccccd, float:0.2)
            float r4 = r0.f10973s
            float r4 = r4 * r3
            r2.setStrokeWidth(r4)
            java.util.List r2 = r0.f10960f
            java.util.Iterator r7 = r2.iterator()
            r8 = 0
            r9 = 0
        L18:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto Lec
            java.lang.Object r2 = r7.next()
            int r10 = r9 + 1
            if (r9 >= 0) goto L29
            U2.p.n()
        L29:
            r11 = r2
            cab.shashki.app.ui.chess.fairy.builder.quick.BetzaView$b r11 = (cab.shashki.app.ui.chess.fairy.builder.quick.BetzaView.b) r11
            cab.shashki.app.ui.chess.fairy.builder.quick.BetzaView$g[] r2 = r0.f10957c
            r2 = r2[r9]
            cab.shashki.app.ui.chess.fairy.builder.quick.BetzaView$g[] r3 = r0.f10958d
            r12 = r3[r9]
            android.graphics.Paint r3 = r0.f10961g
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.STROKE
            r3.setStyle(r4)
            android.graphics.Paint r3 = r0.f10961g
            int r4 = r0.f10953E
            r3.setColor(r4)
            int r3 = r2.c()
            r13 = 5
            r14 = 1
            if (r3 != r14) goto L58
            int r2 = r11.j()
            int r3 = r11.k()
            float r4 = r0.f10976v
            r0.w(r1, r2, r3, r4)
            goto L8b
        L58:
            if (r3 != r13) goto L68
            int r2 = r11.j()
            int r3 = r11.k()
            float r4 = r0.f10976v
            r0.v(r1, r2, r3, r4)
            goto L8b
        L68:
            cab.shashki.app.ui.chess.fairy.builder.quick.a$b r4 = cab.shashki.app.ui.chess.fairy.builder.quick.a.f11052o
            int[] r4 = r4.a()
            boolean r3 = U2.AbstractC0590i.p(r4, r3)
            if (r3 == 0) goto L8d
            r3 = r2
            int r2 = r11.j()
            r4 = r3
            int r3 = r11.k()
            r5 = r4
            int r4 = r5.c()
            int r5 = r5.b()
            r6 = 0
            r0.r(r1, r2, r3, r4, r5, r6)
        L8b:
            r15 = 0
            goto L8e
        L8d:
            r15 = 1
        L8e:
            android.graphics.Paint r2 = r0.f10961g
            int r3 = r0.f10954F
            r2.setColor(r3)
            int r2 = r12.c()
            if (r2 != r14) goto La9
            int r2 = r11.j()
            int r3 = r11.k()
            float r4 = r0.f10977w
            r0.w(r1, r2, r3, r4)
            goto Ld9
        La9:
            if (r2 != r13) goto Lb9
            int r2 = r11.j()
            int r3 = r11.k()
            float r4 = r0.f10977w
            r0.v(r1, r2, r3, r4)
            goto Ld9
        Lb9:
            cab.shashki.app.ui.chess.fairy.builder.quick.a$b r3 = cab.shashki.app.ui.chess.fairy.builder.quick.a.f11052o
            int[] r3 = r3.a()
            boolean r2 = U2.AbstractC0590i.p(r3, r2)
            if (r2 == 0) goto Ldb
            int r2 = r11.j()
            int r3 = r11.k()
            int r4 = r12.c()
            int r5 = r12.b()
            r6 = 1
            r0.r(r1, r2, r3, r4, r5, r6)
        Ld9:
            r2 = 0
            goto Ldc
        Ldb:
            r2 = 1
        Ldc:
            if (r15 == 0) goto Le9
            if (r2 == 0) goto Le9
            int r2 = r0.f10969o
            if (r9 != r2) goto Le5
            goto Le6
        Le5:
            r14 = 0
        Le6:
            r0.q(r1, r11, r14)
        Le9:
            r9 = r10
            goto L18
        Lec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cab.shashki.app.ui.chess.fairy.builder.quick.BetzaView.A(android.graphics.Canvas):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u B(BetzaView betzaView, Canvas canvas, int i4) {
        m.e(canvas, "c");
        betzaView.w(canvas, 7, i4, betzaView.f10976v);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u C(BetzaView betzaView, Canvas canvas, int i4) {
        m.e(canvas, "c");
        betzaView.w(canvas, 7, i4, betzaView.f10977w);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u D(BetzaView betzaView, Canvas canvas, int i4) {
        m.e(canvas, "c");
        betzaView.z(canvas, 7, i4);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u E(BetzaView betzaView, Canvas canvas, int i4) {
        m.e(canvas, "c");
        betzaView.p(canvas, 7, i4);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u F(BetzaView betzaView, Canvas canvas, int i4) {
        m.e(canvas, "c");
        betzaView.u(canvas, 7, i4, betzaView.f10980z);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u G(BetzaView betzaView, Canvas canvas, int i4) {
        m.e(canvas, "c");
        betzaView.u(canvas, 7, i4, betzaView.f10949A);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u H(BetzaView betzaView, Canvas canvas, int i4) {
        m.e(canvas, "c");
        betzaView.s(canvas, 7, i4, betzaView.f10978x);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u I(BetzaView betzaView, Canvas canvas, int i4) {
        m.e(canvas, "c");
        betzaView.s(canvas, 7, i4, betzaView.f10979y);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u J(BetzaView betzaView, Canvas canvas, int i4) {
        m.e(canvas, "c");
        betzaView.v(canvas, 7, i4, betzaView.f10976v);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u K(BetzaView betzaView, Canvas canvas, int i4) {
        m.e(canvas, "c");
        betzaView.v(canvas, 7, i4, betzaView.f10977w);
        return u.f3817a;
    }

    private final void L(int i4, int i5) {
        if (i4 >= 0 && i4 < 7 && i5 >= 0 && i5 < 7) {
            this.f10969o = (i5 * 7) + i4;
        } else if (i5 != 0 || i4 >= 10) {
            if (i5 > 0 && i4 < 10) {
                List listI = ((b) this.f10960f.get(this.f10969o)).i();
                if (i5 > listI.size()) {
                    performClick();
                    return;
                }
                e eVar = (e) listI.get(i5 - 1);
                int i6 = this.f10968n;
                if (i6 == 1) {
                    eVar.c().o(this.f10957c[this.f10969o]);
                } else if (i6 != 2) {
                    eVar.c().o(this.f10957c[this.f10969o]);
                    eVar.c().o(this.f10958d[this.f10969o]);
                } else {
                    eVar.c().o(this.f10958d[this.f10969o]);
                }
                P();
            }
        } else {
            if (this.f10969o == 24) {
                performClick();
                return;
            }
            this.f10968n = i4 - 7;
        }
        postInvalidate();
    }

    private final void M(Context context) {
        this.f10952D = androidx.core.content.a.c(context, AbstractC0917u.f14632f);
        this.f10953E = androidx.core.content.a.c(context, AbstractC0917u.f14629c);
        this.f10954F = androidx.core.content.a.c(context, AbstractC0917u.f14635i);
        this.f10961g.setFlags(1);
    }

    private final List N() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b('*', 3, 3, 0, false, false, false));
        for (a aVar : this.f10956b) {
            if (((Number) aVar.d().d()).intValue() == 0) {
                arrayList.add(new b(aVar, 3 - ((Number) aVar.d().c()).intValue(), 3, 12));
                arrayList.add(new b(aVar, ((Number) aVar.d().c()).intValue() + 3, 3, 192));
                arrayList.add(new b(aVar, 3, 3 - ((Number) aVar.d().c()).intValue(), 3));
                arrayList.add(new b(aVar, 3, ((Number) aVar.d().c()).intValue() + 3, 48));
            } else if (((Number) aVar.d().c()).intValue() == ((Number) aVar.d().d()).intValue()) {
                arrayList.add(new b(aVar, 3 - ((Number) aVar.d().c()).intValue(), 3 - ((Number) aVar.d().c()).intValue(), 5));
                arrayList.add(new b(aVar, 3 - ((Number) aVar.d().c()).intValue(), ((Number) aVar.d().c()).intValue() + 3, 24));
                arrayList.add(new b(aVar, ((Number) aVar.d().c()).intValue() + 3, 3 - ((Number) aVar.d().c()).intValue(), 130));
                arrayList.add(new b(aVar, ((Number) aVar.d().c()).intValue() + 3, ((Number) aVar.d().c()).intValue() + 3, 96));
            } else {
                arrayList.add(new b(aVar, 3 - ((Number) aVar.d().c()).intValue(), 3 - ((Number) aVar.d().d()).intValue(), 4));
                arrayList.add(new b(aVar, 3 - ((Number) aVar.d().c()).intValue(), ((Number) aVar.d().d()).intValue() + 3, 8));
                arrayList.add(new b(aVar, ((Number) aVar.d().c()).intValue() + 3, 3 - ((Number) aVar.d().d()).intValue(), 128));
                arrayList.add(new b(aVar, ((Number) aVar.d().c()).intValue() + 3, ((Number) aVar.d().d()).intValue() + 3, 64));
                arrayList.add(new b(aVar, 3 - ((Number) aVar.d().d()).intValue(), 3 - ((Number) aVar.d().c()).intValue(), 1));
                arrayList.add(new b(aVar, 3 - ((Number) aVar.d().d()).intValue(), ((Number) aVar.d().c()).intValue() + 3, 16));
                arrayList.add(new b(aVar, ((Number) aVar.d().d()).intValue() + 3, 3 - ((Number) aVar.d().c()).intValue(), 2));
                arrayList.add(new b(aVar, ((Number) aVar.d().d()).intValue() + 3, ((Number) aVar.d().c()).intValue() + 3, 32));
            }
        }
        return p.X(arrayList, new h());
    }

    private final void P() {
        ArrayList arrayList = new ArrayList();
        g[] gVarArr = this.f10957c;
        int length = gVarArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            g gVar = gVarArr[i5];
            int i7 = i6 + 1;
            if (gVar.c() != 0) {
                b bVar = (b) this.f10960f.get(i6);
                arrayList.add(new a.c(String.valueOf(bVar.g()), bVar.h(), gVar.c(), gVar.b()));
            }
            i5++;
            i6 = i7;
        }
        ArrayList arrayList2 = new ArrayList();
        g[] gVarArr2 = this.f10958d;
        int length2 = gVarArr2.length;
        int i8 = 0;
        while (i4 < length2) {
            g gVar2 = gVarArr2[i4];
            int i9 = i8 + 1;
            if (gVar2.c() != 0) {
                b bVar2 = (b) this.f10960f.get(i8);
                arrayList2.add(new a.c(String.valueOf(bVar2.g()), bVar2.h(), gVar2.c(), gVar2.b()));
            }
            i4++;
            i8 = i9;
        }
        this.f10966l = this.f10959e.f(arrayList, arrayList2);
        c cVar = this.f10970p;
        if (cVar != null) {
            cVar.a(getValue());
        }
    }

    private final void o() {
        this.f10971q = Math.min((getWidth() - 2.0f) / this.f10964j, (getHeight() - 2.0f) / this.f10965k);
        this.f10974t = (getWidth() - (this.f10971q * this.f10964j)) * 0.5f;
        float height = getHeight();
        float f4 = this.f10971q;
        float f5 = (height - (this.f10965k * f4)) * 0.5f;
        this.f10975u = f5;
        float f6 = f4 * 0.5f;
        this.f10972r = f6;
        float f7 = f6 * 0.5f;
        this.f10973s = f7;
        this.f10976v = 0.4f * f7;
        this.f10977w = 0.6f * f7;
        this.f10978x = 1.2f * f7;
        this.f10979y = 1.4f * f7;
        this.f10980z = 1.6f * f7;
        this.f10949A = f7 * 1.8f;
        this.f10950B = f7 * 1.8f;
        this.f10962h.set(this.f10974t + (f4 * 3.5f), f5 + (f4 * 3.5f));
    }

    private final void p(Canvas canvas, int i4, int i5) {
        float f4 = this.f10974t;
        float f5 = this.f10971q;
        float f6 = this.f10972r;
        PointF pointF = new PointF(f4 + (i4 * f5) + f6, this.f10975u + (i5 * f5) + f6);
        float f7 = pointF.x;
        PointF pointF2 = this.f10962h;
        PointF pointF3 = new PointF(f7 - pointF2.x, pointF.y - pointF2.y);
        PointF pointF4 = new PointF(pointF.x, pointF.y);
        float length = (this.f10950B * 0.5f) / pointF3.length();
        pointF3.set(pointF3.x * length, length * pointF3.y);
        float f8 = pointF3.x;
        float f9 = pointF3.y;
        pointF4.offset(f8 + f8, f9 + f9);
        pointF.offset(pointF3.x, pointF3.y);
        canvas.drawLine(pointF4.x, pointF4.y, pointF.x + pointF3.y, pointF.y - pointF3.x, this.f10961g);
        canvas.drawLine(pointF4.x, pointF4.y, pointF.x - pointF3.y, pointF.y + pointF3.x, this.f10961g);
    }

    private final void q(Canvas canvas, b bVar, boolean z4) {
        this.f10961g.setTextSize(this.f10972r);
        this.f10961g.setTextAlign(Paint.Align.CENTER);
        this.f10961g.setStyle(Paint.Style.FILL);
        this.f10961g.setColor(this.f10952D);
        this.f10961g.setAlpha(128);
        this.f10961g.setTypeface(z4 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        canvas.drawText(String.valueOf(bVar.g()), this.f10974t + (this.f10971q * (bVar.j() + 0.5f)), this.f10975u + (this.f10971q * (bVar.k() + 0.75f)), this.f10961g);
    }

    private final void r(Canvas canvas, int i4, int i5, int i6, int i7, boolean z4) {
        int i8;
        if (i7 == 0) {
            i7 = 3;
        }
        Point point = new Point(i4, i5);
        do {
            i7--;
            if (i7 < 0) {
                return;
            }
            if (i6 == 3) {
                u(canvas, point.x, point.y, z4 ? this.f10949A : this.f10980z);
            } else if (i6 == 4) {
                s(canvas, point.x, point.y, z4 ? this.f10979y : this.f10978x);
            } else if (z4) {
                p(canvas, point.x, point.y);
            } else {
                z(canvas, point.x, point.y);
            }
            point.offset(i4 - 3, i5 - 3);
            int i9 = point.x;
            if (i9 < 0 || i9 >= 7 || (i8 = point.y) < 0) {
                return;
            }
        } while (i8 < 7);
    }

    private final void s(Canvas canvas, int i4, int i5, float f4) {
        float f5 = this.f10974t;
        float f6 = this.f10971q;
        float f7 = this.f10972r;
        PointF pointF = new PointF(f5 + (i4 * f6) + f7, this.f10975u + (i5 * f6) + f7);
        float f8 = pointF.x;
        float f9 = pointF.y;
        canvas.drawLine(f8 - f4, f9, f8, f9 + f4, this.f10961g);
        float f10 = pointF.x;
        float f11 = pointF.y;
        canvas.drawLine(f10, f11 + f4, f10 + f4, f11, this.f10961g);
        float f12 = pointF.x;
        float f13 = pointF.y;
        canvas.drawLine(f12 + f4, f13, f12, f13 - f4, this.f10961g);
        float f14 = pointF.x;
        float f15 = pointF.y;
        canvas.drawLine(f14, f15 - f4, f14 - f4, f15, this.f10961g);
    }

    private final void setDescription(l lVar) {
        for (a.c cVar : (Iterable) lVar.c()) {
            String strA = cVar.a();
            for (int i4 = 0; i4 < strA.length(); i4++) {
                char cCharAt = strA.charAt(i4);
                int i5 = 0;
                for (Object obj : this.f10960f) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        p.n();
                    }
                    b bVar = (b) obj;
                    if (bVar.g() == cCharAt) {
                        if ((bVar.h() & cVar.c()) != 0) {
                            this.f10957c[i5].d(cVar.d(), cVar.b());
                        }
                    }
                    i5 = i6;
                }
            }
        }
        for (a.c cVar2 : (Iterable) lVar.d()) {
            String strA2 = cVar2.a();
            for (int i7 = 0; i7 < strA2.length(); i7++) {
                char cCharAt2 = strA2.charAt(i7);
                int i8 = 0;
                for (Object obj2 : this.f10960f) {
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        p.n();
                    }
                    b bVar2 = (b) obj2;
                    if (bVar2.g() == cCharAt2) {
                        if ((bVar2.h() & cVar2.c()) != 0) {
                            this.f10958d[i8].d(cVar2.d(), cVar2.b());
                        }
                    }
                    i8 = i9;
                }
            }
        }
    }

    private final void setValue(String str) {
        for (g gVar : this.f10957c) {
            gVar.a();
        }
        for (g gVar2 : this.f10958d) {
            gVar2.a();
        }
        this.f10966l = str;
        setDescription(this.f10959e.i(str));
        postInvalidate();
    }

    private final void t(Canvas canvas) {
        PointF pointF = new PointF(this.f10974t, this.f10975u);
        float f4 = this.f10974t;
        float f5 = 7;
        float f6 = this.f10971q;
        PointF pointF2 = new PointF(f4 + (f5 * f6), this.f10975u + (f5 * f6));
        this.f10961g.setColor(this.f10952D);
        this.f10961g.setAlpha(128);
        this.f10961g.setStyle(Paint.Style.STROKE);
        this.f10961g.setStrokeWidth(this.f10973s * 0.1f);
        for (int i4 = 0; i4 < 8; i4++) {
            float f7 = this.f10974t;
            float f8 = pointF.y;
            canvas.drawLine(f7, f8, pointF2.x, f8, this.f10961g);
            float f9 = pointF.x;
            canvas.drawLine(f9, this.f10975u, f9, pointF2.y, this.f10961g);
            float f10 = this.f10971q;
            pointF.offset(f10, f10);
        }
        this.f10961g.setStrokeWidth(this.f10973s * 0.2f);
        pointF.set(this.f10974t + (((b) this.f10960f.get(this.f10969o)).j() * this.f10971q) + this.f10972r, this.f10975u + (((b) this.f10960f.get(this.f10969o)).k() * this.f10971q) + this.f10972r);
        float f11 = pointF.x;
        float f12 = this.f10972r;
        float f13 = pointF.y;
        canvas.drawRect(f11 - f12, f13 - f12, f11 + f12, f13 + f12, this.f10961g);
    }

    private final void u(Canvas canvas, int i4, int i5, float f4) {
        float f5 = this.f10974t;
        float f6 = this.f10971q;
        float f7 = f5 + (i4 * f6);
        float f8 = this.f10972r;
        PointF pointF = new PointF(f7 + f8, this.f10975u + (i5 * f6) + f8);
        float f9 = pointF.x;
        float f10 = pointF.y;
        canvas.drawRect(f9 - f4, f10 - f4, f9 + f4, f10 + f4, this.f10961g);
    }

    private final void v(Canvas canvas, int i4, int i5, float f4) {
        float f5 = this.f10974t;
        float f6 = this.f10971q;
        float f7 = f5 + (i4 * f6);
        float f8 = this.f10972r;
        PointF pointF = new PointF(f7 + f8, this.f10975u + (i5 * f6) + f8);
        PointF pointF2 = this.f10962h;
        float fAtan2 = ((((float) Math.atan2(pointF2.y - pointF.x, pointF.y - pointF2.x)) * 180) / 3.1415927f) - 45;
        RectF rectF = this.f10963i;
        float f9 = pointF.x;
        float f10 = pointF.y;
        rectF.set(f9 - f4, f10 - f4, f9 + f4, f10 + f4);
        canvas.drawArc(this.f10963i, fAtan2, 270.0f, false, this.f10961g);
    }

    private final void w(Canvas canvas, int i4, int i5, float f4) {
        float f5 = this.f10974t;
        float f6 = this.f10971q;
        float f7 = f5 + (i4 * f6);
        float f8 = this.f10972r;
        canvas.drawCircle(f7 + f8, this.f10975u + (i5 * f6) + f8, f4, this.f10961g);
    }

    private final void x(Canvas canvas) {
        this.f10961g.setStyle(Paint.Style.FILL);
        this.f10961g.setTextSize(this.f10973s);
        this.f10961g.setTypeface(this.f10968n == 0 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        this.f10961g.setColor(this.f10953E);
        float f4 = this.f10974t;
        float f5 = this.f10971q;
        canvas.drawText("move +", f4 + (f5 * 7.5f), this.f10975u + (f5 * 0.5f), this.f10961g);
        this.f10961g.setColor(this.f10954F);
        float f6 = this.f10974t;
        float f7 = this.f10971q;
        canvas.drawText("capture", f6 + (7.5f * f7), this.f10975u + (f7 * 0.5f) + this.f10973s, this.f10961g);
        this.f10961g.setTypeface(this.f10968n == 1 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        this.f10961g.setColor(this.f10953E);
        float f8 = this.f10974t;
        float f9 = this.f10971q;
        canvas.drawText("move", f8 + (8.5f * f9), this.f10975u + (f9 * 0.6f), this.f10961g);
        this.f10961g.setTypeface(this.f10968n == 2 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        this.f10961g.setColor(this.f10954F);
        float f10 = this.f10974t;
        float f11 = this.f10971q;
        canvas.drawText("capture", f10 + (9.5f * f11), this.f10975u + (f11 * 0.6f), this.f10961g);
        float f12 = this.f10974t;
        float f13 = this.f10971q;
        float f14 = f12 + (8 * f13);
        float f15 = this.f10975u + (f13 * 1.65f);
        List listI = ((b) this.f10960f.get(this.f10969o)).i();
        this.f10961g.setColor(this.f10952D);
        this.f10961g.setTextSize(this.f10971q * 0.35f);
        this.f10961g.setTextAlign(Paint.Align.LEFT);
        this.f10961g.setTypeface(Typeface.DEFAULT);
        Iterator it = listI.iterator();
        while (it.hasNext()) {
            canvas.drawText(((e) it.next()).d(), f14, f15, this.f10961g);
            f15 += this.f10971q;
        }
        y(canvas, listI);
    }

    private final void y(Canvas canvas, List list) {
        String strValueOf;
        g[] gVarArr = this.f10957c;
        int i4 = this.f10969o;
        g gVar = gVarArr[i4];
        g gVar2 = this.f10958d[i4];
        PointF pointF = this.f10962h;
        float f4 = this.f10974t;
        float f5 = this.f10971q;
        pointF.set(f4 + (7.5f * f5), this.f10975u + (8 * f5));
        this.f10961g.setTextAlign(Paint.Align.CENTER);
        int i5 = 0;
        for (Object obj : list) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                p.n();
            }
            e eVar = (e) obj;
            if (eVar.e() == 0) {
                this.f10961g.setStyle(Paint.Style.FILL);
                this.f10961g.setColor(this.f10952D);
                int i7 = this.f10968n;
                strValueOf = "-";
                if (i7 != 1) {
                    if (i7 != 2) {
                        strValueOf = (gVar.b() == 0 ? "-" : String.valueOf(gVar.b())) + " " + (gVar2.b() != 0 ? String.valueOf(gVar2.b()) : "-");
                    } else if (gVar2.b() != 0) {
                        strValueOf = String.valueOf(gVar2.b());
                    }
                } else if (gVar.b() != 0) {
                    strValueOf = String.valueOf(gVar.b());
                }
                canvas.drawText(strValueOf, this.f10962h.x, this.f10975u + ((i5 + 1.65f) * this.f10971q), this.f10961g);
            } else if ((eVar.e() == gVar.c() && this.f10968n != 2) || (eVar.e() == gVar2.c() && this.f10968n != 1)) {
                this.f10961g.setStyle(Paint.Style.STROKE);
                ((f) this.f10955G.get(eVar.e() - 1)).a(canvas, i6, gVar, gVar2);
            }
            i5 = i6;
        }
    }

    private final void z(Canvas canvas, int i4, int i5) {
        float f4 = this.f10974t;
        float f5 = this.f10971q;
        float f6 = f4 + (i4 * f5);
        float f7 = this.f10972r;
        PointF pointF = new PointF(f6 + f7, this.f10975u + (i5 * f5) + f7);
        float f8 = pointF.x;
        PointF pointF2 = this.f10962h;
        PointF pointF3 = new PointF(f8 - pointF2.x, pointF.y - pointF2.y);
        float length = this.f10950B / pointF3.length();
        pointF3.set(pointF3.x * length, length * pointF3.y);
        float f9 = pointF.x;
        float f10 = pointF3.x;
        float f11 = pointF.y;
        float f12 = pointF3.y;
        canvas.drawLine(f9 - f10, f11 - f12, f9 + f10, f11 + f12, this.f10961g);
    }

    public final void O(c cVar) {
        this.f10970p = cVar;
    }

    public final String getValue() {
        return this.f10967m + this.f10966l;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        m.e(canvas, "canvas");
        super.onDraw(canvas);
        o();
        t(canvas);
        A(canvas);
        if (this.f10969o != 24) {
            x(canvas);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        m.e(motionEvent, "event");
        if (motionEvent.getAction() == 0) {
            this.f10951C = System.currentTimeMillis();
            return true;
        }
        if (motionEvent.getAction() == 1 && this.f10951C + 250 > System.currentTimeMillis()) {
            L((int) ((motionEvent.getX() - this.f10974t) / this.f10971q), (int) ((motionEvent.getY() - this.f10975u) / this.f10971q));
        }
        return true;
    }

    public final void set(String str) {
        String str2;
        String strSubstring;
        m.e(str, "betza");
        int iM = n.M(str, ':', 0, false, 6, null) + 1;
        if (iM > 0) {
            String strSubstring2 = str.substring(0, iM);
            m.d(strSubstring2, "substring(...)");
            this.f10967m = strSubstring2;
            strSubstring = str.substring(iM);
            m.d(strSubstring, "substring(...)");
        } else {
            if (n.E(str, ':', false, 2, null)) {
                str2 = str;
            } else {
                str2 = str + ":";
            }
            this.f10967m = str2;
            strSubstring = "";
        }
        String str3 = strSubstring;
        if (m.a(str3, this.f10966l)) {
            return;
        }
        setValue(n.s(n.s(str3, 'L', 'Z', false, 4, null), 'J', 'C', false, 4, null));
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final char f10981a;

        /* renamed from: b, reason: collision with root package name */
        private final l f10982b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f10983c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f10984d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f10985e;

        public a(char c4, l lVar, boolean z4, boolean z5, boolean z6) {
            m.e(lVar, "offset");
            this.f10981a = c4;
            this.f10982b = lVar;
            this.f10983c = z4;
            this.f10984d = z5;
            this.f10985e = z6;
        }

        public final char a() {
            return this.f10981a;
        }

        public final boolean b() {
            return this.f10984d;
        }

        public final boolean c() {
            return this.f10985e;
        }

        public final l d() {
            return this.f10982b;
        }

        public final boolean e() {
            return this.f10983c;
        }

        public /* synthetic */ a(char c4, l lVar, boolean z4, boolean z5, boolean z6, int i4, h3.h hVar) {
            this(c4, lVar, z4, z5, (i4 & 16) != 0 ? false : z6);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final char f10986a;

        /* renamed from: b, reason: collision with root package name */
        private final int f10987b;

        /* renamed from: c, reason: collision with root package name */
        private final int f10988c;

        /* renamed from: d, reason: collision with root package name */
        private final int f10989d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f10990e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f10991f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f10992g;

        /* renamed from: h, reason: collision with root package name */
        private final List f10993h;

        public b(char c4, int i4, int i5, int i6, boolean z4, boolean z5, boolean z6) {
            this.f10986a = c4;
            this.f10987b = i4;
            this.f10988c = i5;
            this.f10989d = i6;
            this.f10990e = z4;
            this.f10991f = z5;
            this.f10992g = z6;
            ArrayList arrayList = new ArrayList();
            if (z4) {
                arrayList.add(new e("rider/slider", 2, 0, new InterfaceC1016l() { // from class: z0.k
                    @Override // g3.InterfaceC1016l
                    public final Object o(Object obj) {
                        return Boolean.valueOf(BetzaView.b.l((BetzaView.g) obj));
                    }
                }));
            }
            if (z5) {
                arrayList.add(new e("hopper", 3, 0, new InterfaceC1016l() { // from class: z0.l
                    @Override // g3.InterfaceC1016l
                    public final Object o(Object obj) {
                        return Boolean.valueOf(BetzaView.b.m((BetzaView.g) obj));
                    }
                }));
                arrayList.add(new e("grasshopper", 4, 0, new InterfaceC1016l() { // from class: z0.m
                    @Override // g3.InterfaceC1016l
                    public final Object o(Object obj) {
                        return Boolean.valueOf(BetzaView.b.n((BetzaView.g) obj));
                    }
                }));
            }
            if (z6) {
                arrayList.add(new e("lame leaper", 5, 1, new InterfaceC1016l() { // from class: z0.n
                    @Override // g3.InterfaceC1016l
                    public final Object o(Object obj) {
                        return Boolean.valueOf(BetzaView.b.o((BetzaView.g) obj));
                    }
                }));
            }
            arrayList.add(new e("leaper", 1, 1, new InterfaceC1016l() { // from class: z0.o
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return Boolean.valueOf(BetzaView.b.p((BetzaView.g) obj));
                }
            }));
            if (z4) {
                arrayList.add(new e("limit", 0, new InterfaceC1016l() { // from class: z0.p
                    @Override // g3.InterfaceC1016l
                    public final Object o(Object obj) {
                        return BetzaView.b.q((BetzaView.g) obj);
                    }
                }));
            }
            this.f10993h = arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean l(g gVar) {
            m.e(gVar, "it");
            return gVar.b() == 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean m(g gVar) {
            m.e(gVar, "it");
            return gVar.b() == 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean n(g gVar) {
            m.e(gVar, "it");
            return gVar.b() == 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean o(g gVar) {
            m.e(gVar, "it");
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean p(g gVar) {
            m.e(gVar, "it");
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final u q(g gVar) {
            m.e(gVar, "it");
            if (AbstractC0590i.p(cab.shashki.app.ui.chess.fairy.builder.quick.a.f11052o.a(), gVar.c())) {
                gVar.e((gVar.b() + 1) % 10);
                if (gVar.b() == 1) {
                    gVar.e(2);
                }
            }
            return u.f3817a;
        }

        public final char g() {
            return this.f10986a;
        }

        public final int h() {
            return this.f10989d;
        }

        public final List i() {
            return this.f10993h;
        }

        public final int j() {
            return this.f10987b;
        }

        public final int k() {
            return this.f10988c;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(a aVar, int i4, int i5, int i6) {
            this(aVar.a(), i4, i5, i6, aVar.e(), aVar.b(), aVar.c());
            m.e(aVar, "base");
        }
    }
}