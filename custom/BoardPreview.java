package cab.shashki.app.ui.custom;

import G0.a0;
import M0.A1;
import N0.AbstractC0575m;
import N0.C0574l;
import N0.K;
import T2.l;
import U2.p;
import a3.AbstractC0614b;
import a3.InterfaceC0613a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.vectordrawable.graphics.drawable.o;
import cab.shashki.app.db.entities.Cells;
import cab.shashki.app.db.entities.CheckersParams;
import cab.shashki.app.db.entities.HalmaParams;
import cab.shashki.app.service.FairyRepository;
import cab.shashki.app.ui.custom.BoardPreview;
import cab.shashki.app.ui.custom.board.C0843z;
import f0.AbstractC0888D;
import f0.AbstractC0889E;
import f0.AbstractC0917u;
import f0.AbstractC0918v;
import g3.InterfaceC1016l;
import h3.h;
import h3.m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o0.C1218E;
import o0.s;
import o0.t;
import o0.x;
import o3.g;
import org.xmlpull.v1.XmlPullParserException;
import p3.j;
import p3.n;
import q0.C1281e;
import z0.v1;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class BoardPreview extends View {

    /* renamed from: H, reason: collision with root package name */
    public static final a f11200H = new a(null);

    /* renamed from: I, reason: collision with root package name */
    private static final int f11201I = AbstractC0575m.d(a.EnumC0149a.f11245k, a.EnumC0149a.f11246l, a.EnumC0149a.f11253s, a.EnumC0149a.f11256v, a.EnumC0149a.f11257w, a.EnumC0149a.f11251q, a.EnumC0149a.f11259y, a.EnumC0149a.f11260z, a.EnumC0149a.f11255u, a.EnumC0149a.f11254t, a.EnumC0149a.f11248n, a.EnumC0149a.f11258x, a.EnumC0149a.f11234A, a.EnumC0149a.f11236C);

    /* renamed from: A, reason: collision with root package name */
    private int f11202A;

    /* renamed from: B, reason: collision with root package name */
    private int f11203B;

    /* renamed from: C, reason: collision with root package name */
    private int f11204C;

    /* renamed from: D, reason: collision with root package name */
    private float f11205D;

    /* renamed from: E, reason: collision with root package name */
    private float f11206E;

    /* renamed from: F, reason: collision with root package name */
    private final C0843z.c f11207F;

    /* renamed from: G, reason: collision with root package name */
    private Iterable f11208G;

    /* renamed from: b, reason: collision with root package name */
    private Drawable f11209b;

    /* renamed from: c, reason: collision with root package name */
    private Drawable f11210c;

    /* renamed from: d, reason: collision with root package name */
    private Drawable f11211d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f11212e;

    /* renamed from: f, reason: collision with root package name */
    private List f11213f;

    /* renamed from: g, reason: collision with root package name */
    private x f11214g;

    /* renamed from: h, reason: collision with root package name */
    private cab.shashki.app.db.entities.a f11215h;

    /* renamed from: i, reason: collision with root package name */
    private String f11216i;

    /* renamed from: j, reason: collision with root package name */
    private String f11217j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f11218k;

    /* renamed from: l, reason: collision with root package name */
    private a.EnumC0149a f11219l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f11220m;

    /* renamed from: n, reason: collision with root package name */
    private final Path f11221n;

    /* renamed from: o, reason: collision with root package name */
    private final Paint f11222o;

    /* renamed from: p, reason: collision with root package name */
    private final Paint f11223p;

    /* renamed from: q, reason: collision with root package name */
    private final Paint f11224q;

    /* renamed from: r, reason: collision with root package name */
    private final Paint f11225r;

    /* renamed from: s, reason: collision with root package name */
    private final Paint f11226s;

    /* renamed from: t, reason: collision with root package name */
    private final Paint f11227t;

    /* renamed from: u, reason: collision with root package name */
    private final Paint f11228u;

    /* renamed from: v, reason: collision with root package name */
    private final Paint f11229v;

    /* renamed from: w, reason: collision with root package name */
    private final Paint f11230w;

    /* renamed from: x, reason: collision with root package name */
    private final Paint f11231x;

    /* renamed from: y, reason: collision with root package name */
    private List f11232y;

    /* renamed from: z, reason: collision with root package name */
    private int f11233z;

    public static final class a {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: cab.shashki.app.ui.custom.BoardPreview$a$a, reason: collision with other inner class name */
        private static final class EnumC0149a {

            /* renamed from: D, reason: collision with root package name */
            private static final /* synthetic */ EnumC0149a[] f11237D;

            /* renamed from: E, reason: collision with root package name */
            private static final /* synthetic */ InterfaceC0613a f11238E;

            /* renamed from: d, reason: collision with root package name */
            private int f11261d;

            /* renamed from: e, reason: collision with root package name */
            public static final EnumC0149a f11239e = new EnumC0149a("USUAL", 0, 8);

            /* renamed from: f, reason: collision with root package name */
            public static final EnumC0149a f11240f = new EnumC0149a("INTERNATIONAL", 1, 10);

            /* renamed from: g, reason: collision with root package name */
            public static final EnumC0149a f11241g = new EnumC0149a("MINI", 2, 6);

            /* renamed from: h, reason: collision with root package name */
            public static final EnumC0149a f11242h = new EnumC0149a("LASKA", 3, 7);

            /* renamed from: i, reason: collision with root package name */
            public static final EnumC0149a f11243i = new EnumC0149a("TOWERS", 4, 8);

            /* renamed from: j, reason: collision with root package name */
            public static final EnumC0149a f11244j = new EnumC0149a("CANADIAN", 5, 12);

            /* renamed from: k, reason: collision with root package name */
            public static final EnumC0149a f11245k = new EnumC0149a("XIANGQI", 6, 10);

            /* renamed from: l, reason: collision with root package name */
            public static final EnumC0149a f11246l = new EnumC0149a("SHOGI", 7, 11);

            /* renamed from: m, reason: collision with root package name */
            public static final EnumC0149a f11247m = new EnumC0149a("MAKRUK", 8, 8);

            /* renamed from: n, reason: collision with root package name */
            public static final EnumC0149a f11248n = new EnumC0149a("QUIXO", 9, 5);

            /* renamed from: o, reason: collision with root package name */
            public static final EnumC0149a f11249o = new EnumC0149a("MINI_CHESS", 10, 5);

            /* renamed from: p, reason: collision with root package name */
            public static final EnumC0149a f11250p = new EnumC0149a("NINE", 11, 9);

            /* renamed from: q, reason: collision with root package name */
            public static final EnumC0149a f11251q = new EnumC0149a("C4", 12, 7);

            /* renamed from: r, reason: collision with root package name */
            public static final EnumC0149a f11252r = new EnumC0149a("GRAND", 13, 10);

            /* renamed from: s, reason: collision with root package name */
            public static final EnumC0149a f11253s = new EnumC0149a("MINISHOGI", 14, 5);

            /* renamed from: t, reason: collision with root package name */
            public static final EnumC0149a f11254t = new EnumC0149a("CAPABLANCA", 15, 10);

            /* renamed from: u, reason: collision with root package name */
            public static final EnumC0149a f11255u = new EnumC0149a("SPANTSIRETI", 16, 10);

            /* renamed from: v, reason: collision with root package name */
            public static final EnumC0149a f11256v = new EnumC0149a("CUSTOM", 17, 1);

            /* renamed from: w, reason: collision with root package name */
            public static final EnumC0149a f11257w = new EnumC0149a("UNIVERSAL", 18, 1);

            /* renamed from: x, reason: collision with root package name */
            public static final EnumC0149a f11258x = new EnumC0149a("LINE_GRID", 19, 1);

            /* renamed from: y, reason: collision with root package name */
            public static final EnumC0149a f11259y = new EnumC0149a("HALMA", 20, 1);

            /* renamed from: z, reason: collision with root package name */
            public static final EnumC0149a f11260z = new EnumC0149a("HEXAGON", 21, 1);

            /* renamed from: A, reason: collision with root package name */
            public static final EnumC0149a f11234A = new EnumC0149a("DC", 22, 1);

            /* renamed from: B, reason: collision with root package name */
            public static final EnumC0149a f11235B = new EnumC0149a("MIX", 23, 8);

            /* renamed from: C, reason: collision with root package name */
            public static final EnumC0149a f11236C = new EnumC0149a("STERN", 24, 1);

            static {
                EnumC0149a[] enumC0149aArrA = a();
                f11237D = enumC0149aArrA;
                f11238E = AbstractC0614b.a(enumC0149aArrA);
            }

            private EnumC0149a(String str, int i4, int i5) {
                this.f11261d = i5;
            }

            private static final /* synthetic */ EnumC0149a[] a() {
                return new EnumC0149a[]{f11239e, f11240f, f11241g, f11242h, f11243i, f11244j, f11245k, f11246l, f11247m, f11248n, f11249o, f11250p, f11251q, f11252r, f11253s, f11254t, f11255u, f11256v, f11257w, f11258x, f11259y, f11260z, f11234A, f11235B, f11236C};
            }

            public static EnumC0149a valueOf(String str) {
                return (EnumC0149a) Enum.valueOf(EnumC0149a.class, str);
            }

            public static EnumC0149a[] values() {
                return (EnumC0149a[]) f11237D.clone();
            }

            public final int b() {
                return this.f11261d;
            }
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(boolean z4, int i4, int i5, boolean z5) {
            if (z4) {
                return (i4 % 8) * i5;
            }
            int i6 = (i4 & 3) * i5 * 2;
            if ((((1 << i4) & (-252645136)) != 0) != z5) {
                i5 = 0;
            }
            return i6 + i5;
        }

        static /* synthetic */ int d(a aVar, boolean z4, int i4, int i5, boolean z5, int i6, Object obj) {
            if ((i6 & 8) != 0) {
                z5 = false;
            }
            return aVar.c(z4, i4, i5, z5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int e(boolean z4, int i4, int i5) {
            return z4 ? (i4 / 8) * i5 : (i4 >> 2) * i5;
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11262a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f11263b;

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
            f11262a = iArr;
            int[] iArr2 = new int[a.EnumC0149a.values().length];
            try {
                iArr2[a.EnumC0149a.f11245k.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[a.EnumC0149a.f11246l.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[a.EnumC0149a.f11254t.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[a.EnumC0149a.f11255u.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[a.EnumC0149a.f11253s.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[a.EnumC0149a.f11240f.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[a.EnumC0149a.f11244j.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[a.EnumC0149a.f11242h.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[a.EnumC0149a.f11241g.ordinal()] = 9;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[a.EnumC0149a.f11249o.ordinal()] = 10;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[a.EnumC0149a.f11252r.ordinal()] = 11;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[a.EnumC0149a.f11250p.ordinal()] = 12;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[a.EnumC0149a.f11251q.ordinal()] = 13;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[a.EnumC0149a.f11248n.ordinal()] = 14;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[a.EnumC0149a.f11258x.ordinal()] = 15;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[a.EnumC0149a.f11257w.ordinal()] = 16;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[a.EnumC0149a.f11260z.ordinal()] = 17;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[a.EnumC0149a.f11256v.ordinal()] = 18;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[a.EnumC0149a.f11236C.ordinal()] = 19;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[a.EnumC0149a.f11259y.ordinal()] = 20;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[a.EnumC0149a.f11234A.ordinal()] = 21;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[a.EnumC0149a.f11239e.ordinal()] = 22;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[a.EnumC0149a.f11243i.ordinal()] = 23;
            } catch (NoSuchFieldError unused28) {
            }
            f11263b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardPreview(Context context) {
        super(context);
        m.e(context, "context");
        this.f11219l = a.EnumC0149a.f11239e;
        this.f11221n = new Path();
        this.f11222o = new Paint();
        this.f11223p = new Paint();
        this.f11224q = new Paint();
        this.f11225r = new Paint();
        this.f11226s = new Paint();
        this.f11227t = new Paint();
        this.f11228u = new Paint();
        this.f11229v = new Paint();
        this.f11230w = new Paint();
        this.f11231x = new Paint();
        this.f11232y = p.g();
        this.f11207F = C0843z.c.f(C0843z.f.f11546a.g(25), 0, 0, 0, 0, null, null, 0.0f, 0.0f, 0, 0, 0, false, 0, 0, null, 0, 0, 0, 0, 0, 1048575, null);
        X(this, context, false, 2, null);
    }

    private final void A(Canvas canvas, int i4, int i5, int i6, int i7, float f4, String str, CheckersParams checkersParams) {
        g gVarY;
        y(canvas, i4, f4, i5, i6, i7);
        canvas.save();
        canvas.scale(1.0f, -1.0f, f4, f4);
        y(canvas, i4, f4, i5, i6, i7);
        canvas.restore();
        int i8 = i4 & (-2);
        float f5 = i5;
        float f6 = (f4 - ((i5 + i7) * i8)) + f5;
        for (int i9 = 0; i9 < i8; i9++) {
            canvas.drawLine(f6, f4, f6 + f5, f4, this.f11222o);
            f6 += i5 * 3;
        }
        Set<String> blocked = checkersParams.getBlocked();
        if (blocked != null && (gVarY = p.y(blocked)) != null) {
            Iterator it = gVarY.iterator();
            while (it.hasNext()) {
                PointF pointFV = V((String) it.next(), i4, i5, i6);
                float f7 = pointFV.x;
                float f8 = i7;
                float f9 = pointFV.y;
                canvas.drawLine(f7 - f8, f9 - f8, f7 + f8, f9 + f8, this.f11222o);
                float f10 = pointFV.x;
                float f11 = pointFV.y;
                canvas.drawLine(f10 - f8, f11 + f8, f10 + f8, f11 - f8, this.f11222o);
            }
        }
        for (List list : o3.h.i(o3.h.o(p.y(n.h0(str, new char[]{','}, false, 0, 6, null)), new InterfaceC1016l() { // from class: C0.a
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return BoardPreview.B((String) obj);
            }
        }), new InterfaceC1016l() { // from class: C0.b
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return Boolean.valueOf(BoardPreview.C((List) obj));
            }
        })) {
            PointF pointFV2 = V((String) list.get(0), i4, i5, i6);
            float f12 = i6;
            float f13 = 1;
            q(canvas, (pointFV2.x - f12) + f13, (pointFV2.y - f12) + f13, ((String) list.get(1)).charAt(0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List B(String str) {
        m.e(str, "it");
        return n.h0(str, new char[]{':'}, false, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean C(List list) {
        m.e(list, "it");
        return list.size() > 1;
    }

    private final void D(Canvas canvas, String str) {
        int i4 = 0;
        for (int i5 = 0; i5 < 10; i5++) {
            int i6 = 0;
            while (i6 < 5) {
                float f4 = this.f11205D;
                int i7 = this.f11233z;
                float f5 = f4 + (((i6 * 2) + ((i5 & 1) ^ 1)) * i7);
                float f6 = this.f11206E + (i7 * i5);
                Canvas canvas2 = canvas;
                canvas2.drawRect(f5, f6, f5 + i7, f6 + i7, this.f11229v);
                i4++;
                char cCharAt = str.charAt(i4);
                if (cCharAt != 'e') {
                    q(canvas2, f5, f6, cCharAt);
                } else {
                    String str2 = this.f11217j;
                    if (str2 != null) {
                        char cCharAt2 = str2.charAt(i4);
                        Character chValueOf = Character.valueOf(cCharAt2);
                        if (cCharAt2 == 'e') {
                            chValueOf = null;
                        }
                        if (chValueOf != null) {
                            char cCharValue = chValueOf.charValue();
                            this.f11224q.setAlpha(128);
                            this.f11223p.setAlpha(128);
                            q(canvas2, f5, f6, cCharValue);
                            this.f11224q.setAlpha(255);
                            this.f11223p.setAlpha(255);
                        }
                    }
                }
                i6++;
                canvas = canvas2;
            }
        }
    }

    private final void E(Canvas canvas, String str) {
        int i4 = 0;
        int i5 = 0;
        while (i5 < 7) {
            int i6 = ((i5 & 1) ^ 1) + 3;
            int i7 = i4;
            for (int i8 = 0; i8 < i6; i8++) {
                float f4 = this.f11205D;
                int i9 = this.f11233z;
                float f5 = f4 + (((i8 * 2) + r8) * i9);
                float f6 = this.f11206E + (i9 * i5);
                canvas.drawRect(f5, f6, i9 + f5, f6 + i9, this.f11229v);
                char cCharAt = str.charAt(i7);
                if (cCharAt != '.') {
                    q(canvas, f5, f6, cCharAt);
                } else {
                    String str2 = this.f11217j;
                    if (str2 != null) {
                        char cCharAt2 = str2.charAt(i7);
                        Character chValueOf = Character.valueOf(cCharAt2);
                        if (cCharAt2 == '.') {
                            chValueOf = null;
                        }
                        if (chValueOf != null) {
                            char cCharValue = chValueOf.charValue();
                            this.f11224q.setAlpha(128);
                            this.f11223p.setAlpha(128);
                            q(canvas, f5, f6, cCharValue);
                            this.f11224q.setAlpha(255);
                            this.f11223p.setAlpha(255);
                        }
                    }
                }
                i7++;
            }
            i5++;
            i4 = i7;
        }
    }

    private final void F(Canvas canvas, String str, CheckersParams checkersParams) {
        if (checkersParams == null) {
            Drawable drawable = this.f11212e;
            if (drawable != null) {
                int i4 = this.f11202A;
                drawable.setBounds(0, 0, i4, i4);
                drawable.draw(canvas);
                return;
            }
            return;
        }
        k(checkersParams.getRows(), checkersParams.getColumns());
        float[] fArr = new float[checkersParams.getColumns()];
        float[] fArr2 = new float[checkersParams.getRows()];
        float f4 = this.f11205D;
        int i5 = this.f11233z;
        fArr[0] = f4 + (i5 >> 1);
        fArr2[0] = (this.f11202A - this.f11206E) - (i5 >> 1);
        int columns = checkersParams.getColumns() - 1;
        int i6 = 0;
        while (i6 < columns) {
            int i7 = i6 + 1;
            fArr[i7] = fArr[i6] + this.f11233z;
            i6 = i7;
        }
        int rows = checkersParams.getRows() - 1;
        int i8 = 0;
        while (i8 < rows) {
            int i9 = i8 + 1;
            fArr2[i9] = fArr2[i8] - this.f11233z;
            i8 = i9;
        }
        for (l lVar : this.f11232y) {
            canvas.drawLine(fArr[((Point) lVar.c()).x], fArr2[((Point) lVar.c()).y], fArr[((Point) lVar.d()).x], fArr2[((Point) lVar.d()).y], this.f11222o);
        }
        for (l lVar2 : o3.h.o(o3.h.i(o3.h.o(p.y(n.h0(str, new char[]{','}, false, 0, 6, null)), new InterfaceC1016l() { // from class: C0.f
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return BoardPreview.G((String) obj);
            }
        }), new InterfaceC1016l() { // from class: C0.g
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return Boolean.valueOf(BoardPreview.H((List) obj));
            }
        }), new InterfaceC1016l() { // from class: C0.h
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return BoardPreview.I((List) obj);
            }
        })) {
            float fCharAt = ((((String) lVar2.c()).charAt(0) - 'a') * this.f11233z) + this.f11205D;
            int rows2 = checkersParams.getRows();
            m.d(((String) lVar2.c()).substring(1), "substring(...)");
            q(canvas, fCharAt, ((rows2 - Integer.parseInt(r6)) * this.f11233z) + this.f11206E, ((Character) lVar2.d()).charValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List G(String str) {
        m.e(str, "it");
        return n.h0(str, new char[]{':'}, false, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean H(List list) {
        m.e(list, "it");
        return list.size() > 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l I(List list) {
        m.e(list, "a");
        return new l(list.get(0), Character.valueOf(((String) list.get(1)).charAt(0)));
    }

    private final void J(Canvas canvas, String str) {
        for (int i4 = 0; i4 < 6; i4++) {
            for (int i5 = 0; i5 < 3; i5++) {
                float f4 = this.f11205D;
                int i6 = this.f11233z;
                float f5 = f4 + (((i5 * 2) + ((i4 & 1) ^ 1)) * i6);
                float f6 = this.f11206E + (i6 * i4);
                canvas.drawRect(f5, f6, f5 + i6, f6 + i6, this.f11229v);
            }
        }
        for (int i7 = 0; i7 < 36; i7++) {
            char cCharAt = str.charAt(i7);
            if (cCharAt != '.') {
                i(canvas, false, this.f11205D, this.f11206E, i7, cCharAt);
            }
            String str2 = this.f11217j;
            if (str2 != null) {
                char cCharAt2 = str2.charAt(i7);
                Character chValueOf = Character.valueOf(cCharAt2);
                if (cCharAt2 == '.') {
                    chValueOf = null;
                }
                if (chValueOf != null) {
                    char cCharValue = chValueOf.charValue();
                    this.f11224q.setAlpha(128);
                    this.f11223p.setAlpha(128);
                    i(canvas, false, this.f11205D, this.f11206E, i7, cCharValue);
                    this.f11224q.setAlpha(255);
                    this.f11223p.setAlpha(255);
                }
            }
        }
    }

    private final void K(Canvas canvas, String str) {
        for (int i4 = 0; i4 < 5; i4++) {
            int i5 = ((i4 & 1) ^ 1) + 2;
            for (int i6 = 0; i6 < i5; i6++) {
                float f4 = this.f11205D;
                int i7 = this.f11233z;
                float f5 = f4 + (((i6 * 2) + r3) * i7);
                float f6 = this.f11206E + (i7 * i4);
                canvas.drawRect(f5, f6, f5 + i7, f6 + i7, this.f11229v);
            }
        }
        s(this, canvas, str, null, 5, 0.0f, 16, null);
    }

    private final void L(Canvas canvas, String str) {
        for (int i4 = 0; i4 < 9; i4++) {
            int i5 = ((i4 & 1) ^ 1) + 4;
            for (int i6 = 0; i6 < i5; i6++) {
                float f4 = this.f11205D;
                int i7 = this.f11233z;
                float f5 = f4 + (((i6 * 2) + r3) * i7);
                float f6 = this.f11206E + (i7 * i4);
                canvas.drawRect(f5, f6, f5 + i7, f6 + i7, this.f11229v);
            }
        }
        s(this, canvas, str, null, 9, 0.0f, 16, null);
    }

    private final void N(Canvas canvas, String str) {
        x xVar = this.f11214g;
        if (xVar == null) {
            return;
        }
        for (int i4 = 0; i4 < 5; i4++) {
            for (int i5 = 0; i5 < 5; i5++) {
                int i6 = this.f11233z;
                float f4 = (i6 * i5) + this.f11205D;
                float f5 = (i6 * i4) + this.f11206E;
                int i7 = (i4 * 5) + i5;
                List list = this.f11213f;
                Drawable drawable = list != null ? (Drawable) p.I(list, xVar.a(str.charAt(i7))) : null;
                if (drawable != null) {
                    int i8 = this.f11233z;
                    drawable.setBounds((int) f4, (int) f5, (int) (f4 + i8), (int) (f5 + i8));
                }
                if (drawable != null) {
                    drawable.draw(canvas);
                }
            }
        }
    }

    private final void O(Canvas canvas, String str, HalmaParams halmaParams) {
        if (halmaParams != null) {
            int size = (halmaParams.getSize() << 2) - 3;
            int iMin = (Math.min(getWidth(), getHeight()) / size) * size;
            this.f11202A = iMin;
            int i4 = iMin / size;
            this.f11233z = i4;
            int i5 = i4 >> 1;
            this.f11205D = (getWidth() - (this.f11233z * ((halmaParams.getSize() * 3) - 2))) * 0.5f;
            this.f11206E = (getHeight() - (this.f11233z * size)) * 0.5f;
            int i6 = 0;
            for (Object obj : p.y(a0.f1214a.a(halmaParams.getSize()))) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    p.n();
                }
                int iCharAt = (r6.charAt(0) - 'a') * i5;
                String strSubstring = ((String) obj).substring(1);
                m.d(strSubstring, "substring(...)");
                int i8 = (size - Integer.parseInt(strSubstring)) * this.f11233z;
                char cCharAt = str.charAt(i6);
                if (cCharAt == '.') {
                    float f4 = this.f11205D + iCharAt;
                    float f5 = i5;
                    canvas.drawCircle(f4 + f5, this.f11206E + i8 + f5, 0.5f, this.f11222o);
                } else {
                    q(canvas, this.f11205D + iCharAt, this.f11206E + i8, cCharAt);
                }
                i6 = i7;
            }
        }
    }

    private final void P(Canvas canvas, String str, CheckersParams checkersParams) {
        if (checkersParams == null) {
            Drawable drawable = this.f11212e;
            if (drawable != null) {
                int i4 = this.f11202A;
                drawable.setBounds(0, 0, i4, i4);
                drawable.draw(canvas);
                return;
            }
            return;
        }
        n(this, canvas, checkersParams.getRows(), checkersParams.getColumns(), false, 8, null);
        Set<String> blocked = checkersParams.getBlocked();
        if (blocked != null) {
            for (String str2 : blocked) {
                int rows = checkersParams.getRows();
                m.d(str2.substring(1), "substring(...)");
                float f4 = this.f11206E + ((rows - Integer.parseInt(r2)) * this.f11233z);
                int iCharAt = str2.charAt(0) - 'a';
                int i5 = this.f11233z;
                float f5 = (iCharAt * i5) + this.f11205D;
                canvas.drawRect(f5, f4, i5 + f5, f4 + i5, this.f11231x);
            }
        }
        for (l lVar : o3.h.o(o3.h.i(o3.h.o(p.y(n.h0(str, new char[]{','}, false, 0, 6, null)), new InterfaceC1016l() { // from class: C0.c
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return BoardPreview.Q((String) obj);
            }
        }), new InterfaceC1016l() { // from class: C0.d
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return Boolean.valueOf(BoardPreview.R((List) obj));
            }
        }), new InterfaceC1016l() { // from class: C0.e
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return BoardPreview.S((List) obj);
            }
        })) {
            float fCharAt = ((((String) lVar.c()).charAt(0) - 'a') * this.f11233z) + this.f11205D;
            int rows2 = checkersParams.getRows();
            m.d(((String) lVar.c()).substring(1), "substring(...)");
            q(canvas, fCharAt, ((rows2 - Integer.parseInt(r5)) * this.f11233z) + this.f11206E, ((Character) lVar.d()).charValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List Q(String str) {
        m.e(str, "it");
        return n.h0(str, new char[]{':'}, false, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean R(List list) {
        m.e(list, "it");
        return list.size() > 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l S(List list) {
        m.e(list, "a");
        return new l(list.get(0), Character.valueOf(((String) list.get(1)).charAt(0)));
    }

    private final void T(Canvas canvas, String str) {
        BoardPreview boardPreview;
        Canvas canvas2;
        boolean z4 = str.length() >= 64;
        int i4 = z4 ? 64 : 32;
        int i5 = 0;
        while (i5 < i4) {
            char cCharAt = str.charAt(i5);
            if (cCharAt == '.' || cCharAt == 'e') {
                boardPreview = this;
                canvas2 = canvas;
            } else {
                boardPreview = this;
                canvas2 = canvas;
                boardPreview.i(canvas2, z4, this.f11205D, this.f11206E, i5, cCharAt);
            }
            String str2 = boardPreview.f11217j;
            if (str2 != null) {
                char cCharAt2 = str2.charAt(i5);
                Character chValueOf = Character.valueOf(cCharAt2);
                if (cCharAt2 == '.' || cCharAt2 == 'e') {
                    chValueOf = null;
                }
                if (chValueOf != null) {
                    char cCharValue = chValueOf.charValue();
                    boardPreview.f11224q.setAlpha(128);
                    boardPreview.f11223p.setAlpha(128);
                    boardPreview.i(canvas2, z4, boardPreview.f11205D, boardPreview.f11206E, i5, cCharValue);
                    boardPreview.f11224q.setAlpha(255);
                    boardPreview.f11223p.setAlpha(255);
                }
            }
            i5++;
            canvas = canvas2;
        }
    }

    private final PointF U(String str) throws NumberFormatException {
        int i4 = Integer.parseInt(new j("[*$]").k(str, ""));
        float f4 = 1;
        return new PointF(this.f11233z * ((((i4 & 127) - this.f11207F.w()) & 127) + ((this.f11207F.u() + f4) * 0.5f)), this.f11233z * ((((i4 >> 7) - this.f11207F.x()) & 127) + ((f4 + this.f11207F.v()) * 0.5f)));
    }

    private final PointF V(String str, int i4, int i5, int i6) {
        int iCharAt = str.charAt(0) - 'a';
        String strSubstring = str.substring(1);
        m.d(strSubstring, "substring(...)");
        int i7 = Integer.parseInt(strSubstring) - 1;
        int i8 = this.f11202A;
        return new PointF((i8 >> 1) + ((i5 + (i5 >> 1)) * ((iCharAt - i4) + 1)), (i8 >> 1) + (i6 * ((((i4 - i7) - 1) << 1) - Math.abs((i4 - iCharAt) - 1))));
    }

    private final void W(Context context, boolean z4) {
        if (z4) {
            context.setTheme(AbstractC0889E.f14582a);
        }
        if (z4) {
            this.f11230w.setColor(-1455716);
            this.f11229v.setColor(-5733556);
            this.f11223p.setColor(-16777216);
            this.f11224q.setColor(-1);
            this.f11222o.setColor(-16777216);
        } else {
            this.f11230w.setColor(androidx.core.content.a.c(context, AbstractC0917u.f14631e));
            this.f11229v.setColor(androidx.core.content.a.c(context, AbstractC0917u.f14630d));
            this.f11224q.setColor(androidx.core.content.a.c(context, AbstractC0917u.f14634h));
            this.f11223p.setColor(androidx.core.content.a.c(context, AbstractC0917u.f14633g));
            this.f11222o.setColor(androidx.core.content.a.c(context, AbstractC0917u.f14632f));
        }
        this.f11227t.setColor(-65536);
        this.f11228u.setColor(-16776961);
        this.f11225r.setColor(Color.argb(255, 205, 220, 57));
        this.f11226s.setColor(Color.argb(255, 76, 175, 80));
        this.f11231x.setColor(androidx.core.content.a.c(context, AbstractC0917u.f14628b));
        this.f11223p.setFlags(1);
        this.f11224q.setFlags(1);
        this.f11222o.setFlags(1);
        this.f11222o.setStyle(Paint.Style.STROKE);
        this.f11222o.setAlpha(128);
    }

    static /* synthetic */ void X(BoardPreview boardPreview, Context context, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        boardPreview.W(context, z4);
    }

    public static /* synthetic */ boolean Z(BoardPreview boardPreview, Integer num, String str, String str2, cab.shashki.app.db.entities.a aVar, t tVar, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            str2 = null;
        }
        if ((i4 & 8) != 0) {
            aVar = null;
        }
        if ((i4 & 16) != 0) {
            tVar = null;
        }
        return boardPreview.Y(num, str, str2, aVar, tVar);
    }

    public static /* synthetic */ boolean b0(BoardPreview boardPreview, int i4, String str, String str2, cab.shashki.app.db.entities.a aVar, t tVar, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            str2 = null;
        }
        if ((i5 & 8) != 0) {
            aVar = null;
        }
        if ((i5 & 16) != 0) {
            tVar = null;
        }
        return boardPreview.a0(i4, str, str2, aVar, tVar);
    }

    private final String c0(String str) {
        a.EnumC0149a enumC0149a = this.f11219l;
        if (enumC0149a != a.EnumC0149a.f11242h && enumC0149a != a.EnumC0149a.f11243i) {
            return str;
        }
        boolean z4 = enumC0149a == a.EnumC0149a.f11243i;
        StringBuilder sb = new StringBuilder(".........................");
        if (z4) {
            sb.append(".......");
        }
        List listH0 = n.h0(str, new char[]{','}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(p.o(listH0, 10));
        Iterator it = listH0.iterator();
        while (it.hasNext()) {
            arrayList.add(n.h0((String) it.next(), new char[]{':'}, false, 0, 6, null));
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            List list = (List) obj;
            if (!z4) {
                Integer numI = n.i((String) list.get(0));
                if (numI != null) {
                    sb.setCharAt(numI.intValue() - 1, n.z0((CharSequence) list.get(1)));
                }
            } else if (((String) list.get(0)).length() == 2) {
                sb.setCharAt(K.f2926a.M((String) list.get(0)), n.z0((CharSequence) list.get(1)));
            }
        }
        String string = sb.toString();
        m.d(string, "toString(...)");
        return string;
    }

    private final void i(Canvas canvas, boolean z4, float f4, float f5, int i4, char c4) {
        int iC;
        int iE;
        int i5 = this.f11233z;
        a.EnumC0149a enumC0149a = this.f11219l;
        int[] iArr = b.f11263b;
        int i6 = iArr[enumC0149a.ordinal()];
        if (i6 == 9) {
            iC = (i4 % 6) * i5;
        } else if (i6 != 22 && i6 != 23) {
            return;
        } else {
            iC = f11200H.c(z4, i4, i5, this.f11220m);
        }
        float f6 = f4 + iC;
        int i7 = iArr[this.f11219l.ordinal()];
        if (i7 == 9) {
            iE = (i4 / 6) * i5;
        } else if (i7 != 22 && i7 != 23) {
            return;
        } else {
            iE = f11200H.e(z4, i4, i5);
        }
        q(canvas, f6, f5 + iE, c4);
    }

    private final void j() {
        int width = getWidth();
        int height = getHeight();
        a.EnumC0149a enumC0149a = this.f11219l;
        int iG = enumC0149a == a.EnumC0149a.f11234A ? this.f11207F.g() : enumC0149a.b();
        int iMin = (Math.min(width, height) / iG) * iG;
        this.f11202A = iMin;
        this.f11233z = iMin / iG;
        this.f11203B = (width - iMin) >> 1;
        this.f11204C = (height - iMin) >> 1;
        int i4 = b.f11263b[this.f11219l.ordinal()];
        if (i4 == 1) {
            int i5 = this.f11202A;
            this.f11205D = ((width - i5) + this.f11233z) / 2.0f;
            this.f11206E = (height - i5) / 2.0f;
            return;
        }
        if (i4 == 2) {
            int i6 = this.f11202A / 11;
            this.f11233z = i6;
            this.f11205D = ((width - r2) / 2.0f) + i6;
            this.f11206E = ((height - r2) / 2.0f) + 2;
            return;
        }
        if (i4 == 3 || i4 == 4) {
            int i7 = this.f11202A;
            this.f11205D = (width - i7) / 2.0f;
            this.f11206E = ((width - i7) / 2.0f) - this.f11233z;
        } else {
            int i8 = this.f11202A;
            this.f11205D = (width - i8) / 2.0f;
            this.f11206E = (height - i8) / 2.0f;
        }
    }

    private final void k(int i4, int i5) {
        int iMax = Math.max(i5, i4);
        int iMin = (Math.min(getWidth(), getHeight()) / iMax) * iMax;
        this.f11202A = iMin;
        this.f11233z = iMin / iMax;
        this.f11205D = (iMax - i5) * r1 * 0.5f;
        this.f11206E = r1 * (iMax - i4) * 0.5f;
    }

    private final void l(Canvas canvas, String str) {
        float f4 = this.f11205D;
        float f5 = this.f11206E;
        int i4 = this.f11233z;
        canvas.drawRect(f4, (i4 * 2) + f5, this.f11202A + f4, f5 + (i4 * 10), this.f11230w);
        for (int i5 = 0; i5 < 8; i5++) {
            for (int i6 = 0; i6 < 5; i6++) {
                float f6 = this.f11205D;
                int i7 = this.f11233z;
                float f7 = f6 + (((i6 * 2) + ((i5 & 1) ^ 1)) * i7);
                float f8 = this.f11206E + ((i5 + 2) * i7);
                canvas.drawRect(f7, f8, f7 + i7, f8 + i7, this.f11229v);
                if (!this.f11218k) {
                    q(canvas, f7, f8, str.charAt((i5 * 5) + i6));
                }
            }
        }
        if (this.f11218k) {
            s(this, canvas, str, null, 10, 0.0f, 16, null);
        }
    }

    private final void m(Canvas canvas, int i4, int i5, boolean z4) {
        k(i4, i5);
        if (!z4) {
            w(canvas, i4, i5, this.f11205D, this.f11206E);
            return;
        }
        float f4 = this.f11205D;
        float f5 = this.f11206E;
        int i6 = this.f11233z;
        canvas.drawRect(f4, f5, f4 + (i6 * i5), f5 + (i6 * i4), this.f11230w);
        int i7 = i4 & 1;
        for (int i8 = 0; i8 < i4; i8++) {
            for (int i9 = 0; i9 < i5; i9++) {
                if (((i9 ^ i8) & 1) != i7) {
                    int i10 = this.f11233z;
                    float f6 = (i10 * i9) + this.f11205D;
                    float f7 = (i10 * i8) + this.f11206E;
                    canvas.drawRect(f6, f7, i10 + f6, i10 + f7, this.f11229v);
                }
            }
        }
    }

    static /* synthetic */ void n(BoardPreview boardPreview, Canvas canvas, int i4, int i5, boolean z4, int i6, Object obj) {
        if ((i6 & 8) != 0) {
            z4 = true;
        }
        boardPreview.m(canvas, i4, i5, z4);
    }

    private final void o(Canvas canvas, String str) {
        int i4 = 0;
        while (i4 < 6) {
            i4++;
            float f4 = this.f11233z * i4;
            float f5 = this.f11206E;
            canvas.drawLine(f4, f5, f4, f5 + this.f11202A, this.f11222o);
        }
        Paint[] paintArr = {this.f11224q, this.f11223p};
        float f6 = this.f11233z / 3.0f;
        for (C0843z.i iVar : K.C(K.f2926a, str, (s) p.G(C1218E.f18139a.p()), null, 4, null)) {
            float fCharAt = this.f11205D + (((iVar.getPosition().charAt(0) - 'a') + 0.4f) * this.f11233z);
            float f7 = this.f11206E;
            m.d(iVar.getPosition().substring(1), "substring(...)");
            canvas.drawCircle(fCharAt, f7 + ((7.5f - Integer.parseInt(r7)) * this.f11233z), f6, paintArr[iVar.a()]);
        }
    }

    private final void p(Canvas canvas, String str) {
        int[] iArr = new int[2];
        if (n.B(str, 'e', false, 2, null)) {
            iArr[0] = -1;
            iArr[1] = 1;
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        int i4 = 0;
        int i5 = 0;
        while (i5 < 12) {
            int i6 = i4;
            for (int i7 = 0; i7 < 6; i7++) {
                float f4 = this.f11205D;
                int i8 = this.f11233z;
                int i9 = i5 & 1;
                float f5 = f4 + (((i7 * 2) + (i9 ^ 1)) * i8);
                float f6 = this.f11206E + (i8 * i5);
                canvas.drawRect(f5, f6, i8 + f5, f6 + i8, this.f11229v);
                float f7 = f5 + (this.f11233z * iArr[i9]);
                char cCharAt = str.charAt(i6);
                if (cCharAt == '.' || cCharAt == 'e') {
                    String str2 = this.f11217j;
                    if (str2 != null) {
                        char cCharAt2 = str2.charAt(i6);
                        Character chValueOf = Character.valueOf(cCharAt2);
                        if (cCharAt2 == '.' || cCharAt2 == 'e') {
                            chValueOf = null;
                        }
                        if (chValueOf != null) {
                            char cCharValue = chValueOf.charValue();
                            this.f11224q.setAlpha(128);
                            this.f11223p.setAlpha(128);
                            q(canvas, f7, f6, cCharValue);
                            this.f11224q.setAlpha(255);
                            this.f11223p.setAlpha(255);
                        }
                    }
                } else {
                    q(canvas, f7, f6, cCharAt);
                }
                i6++;
            }
            i5++;
            i4 = i6;
        }
    }

    private final void q(Canvas canvas, float f4, float f5, char c4) {
        int i4 = this.f11233z;
        if (c4 == 'B') {
            float f6 = i4 / 2.0f;
            float f7 = f4 + f6;
            float f8 = f5 + f6;
            canvas.drawCircle(f7, f8, (i4 / 2) - 1, this.f11223p);
            canvas.drawCircle(f7, f8, 2.0f, this.f11224q);
            return;
        }
        if (c4 == 'b') {
            float f9 = i4 / 2.0f;
            canvas.drawCircle(f4 + f9, f5 + f9, (i4 / 2) - 1, this.f11223p);
            return;
        }
        switch (c4) {
            case 'W':
                float f10 = i4 / 2.0f;
                float f11 = f4 + f10;
                float f12 = f5 + f10;
                canvas.drawCircle(f11, f12, (i4 / 2) - 1, this.f11224q);
                canvas.drawCircle(f11, f12, 2.0f, this.f11223p);
                break;
            case 'X':
                float f13 = i4 / 2.0f;
                float f14 = f4 + f13;
                float f15 = f5 + f13;
                canvas.drawCircle(f14, f15, (i4 / 2) - 1, this.f11225r);
                canvas.drawCircle(f14, f15, 2.0f, this.f11223p);
                break;
            case 'Y':
                float f16 = i4 / 2.0f;
                float f17 = f4 + f16;
                float f18 = f5 + f16;
                canvas.drawCircle(f17, f18, (i4 / 2) - 1, this.f11226s);
                canvas.drawCircle(f17, f18, 2.0f, this.f11224q);
                break;
            default:
                switch (c4) {
                    case 'v':
                        float f19 = i4 / 2.0f;
                        canvas.drawCircle(f4 + f19, f5 + f19, (i4 / 2) - 1, this.f11227t);
                        break;
                    case 'w':
                        float f20 = i4 / 2.0f;
                        canvas.drawCircle(f4 + f20, f5 + f20, (i4 / 2) - 1, this.f11224q);
                        break;
                    case 'x':
                        float f21 = i4 / 2.0f;
                        canvas.drawCircle(f4 + f21, f5 + f21, (i4 / 2) - 1, this.f11225r);
                        break;
                    case 'y':
                        float f22 = i4 / 2.0f;
                        canvas.drawCircle(f4 + f22, f5 + f22, (i4 / 2) - 1, this.f11226s);
                        break;
                    case 'z':
                        float f23 = i4 / 2.0f;
                        canvas.drawCircle(f4 + f23, f5 + f23, (i4 / 2) - 1, this.f11228u);
                        break;
                }
        }
    }

    private final void r(Canvas canvas, String str, Drawable drawable, int i4, float f4) {
        if (drawable != null) {
            int i5 = this.f11203B;
            int i6 = this.f11204C;
            int i7 = this.f11202A;
            drawable.setBounds(i5, i6, i7 + i5, i7 + i6);
        }
        if (drawable != null) {
            drawable.draw(canvas);
        }
        K k4 = K.f2926a;
        x xVar = this.f11214g;
        if (xVar == null) {
            return;
        }
        for (C0843z.i iVar : K.C(k4, str, xVar, null, 4, null)) {
            if (!K.f2926a.O(iVar.getPosition())) {
                float fCharAt = this.f11205D + ((iVar.getPosition().charAt(0) - 'a') * this.f11233z);
                float f5 = this.f11206E;
                m.d(iVar.getPosition().substring(1), "substring(...)");
                float f6 = f5 + ((i4 - Integer.parseInt(r2)) * this.f11233z * f4);
                List list = this.f11213f;
                Drawable drawable2 = list != null ? (Drawable) p.I(list, iVar.a()) : null;
                if (drawable2 != null) {
                    int i8 = this.f11233z;
                    drawable2.setBounds((int) fCharAt, (int) f6, (int) (fCharAt + i8), (int) (f6 + i8));
                }
                if (drawable2 != null) {
                    drawable2.draw(canvas);
                }
            }
        }
    }

    static /* synthetic */ void s(BoardPreview boardPreview, Canvas canvas, String str, Drawable drawable, int i4, float f4, int i5, Object obj) {
        boardPreview.r(canvas, str, drawable, (i5 & 8) != 0 ? 8 : i4, (i5 & 16) != 0 ? 1.0f : f4);
    }

    private final void setCollection(x xVar) throws XmlPullParserException, Resources.NotFoundException, IOException {
        ArrayList arrayList;
        List listD;
        if (m.a(this.f11214g, xVar)) {
            return;
        }
        if (!(xVar instanceof v1)) {
            if (xVar == null || (listD = xVar.d()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                Iterator it = listD.iterator();
                while (it.hasNext()) {
                    o oVarB = o.b(getResources(), ((Number) it.next()).intValue(), getContext().getTheme());
                    if (oVarB != null) {
                        arrayList.add(oVarB);
                    }
                }
            }
            this.f11213f = arrayList;
        }
        this.f11214g = xVar;
    }

    private final void t(Canvas canvas, String str, FairyRepository.a aVar) {
        List list;
        if (aVar != null && (list = this.f11213f) != null && !list.isEmpty()) {
            m(canvas, aVar.rows(), aVar.columns(), aVar.c().getUniversalBoard());
            s(this, canvas, str, null, aVar.rows(), 0.0f, 16, null);
            return;
        }
        Drawable drawable = this.f11211d;
        if (drawable != null) {
            int i4 = this.f11202A;
            drawable.setBounds(0, 0, i4, i4);
            drawable.draw(canvas);
        }
    }

    private final void u(Canvas canvas) throws Throwable {
        Canvas canvas2;
        float f4 = this.f11233z * 0.5f;
        Iterable<C0843z.i> iterable = this.f11208G;
        if (iterable == null) {
            m.r("pieces");
            iterable = null;
        }
        for (C0843z.i iVar : iterable) {
            PointF pointFU = U(iVar.getPosition());
            float f5 = pointFU.x;
            float f6 = pointFU.y;
            int iSave = canvas.save();
            canvas.translate(f5, f6);
            float f7 = -f4;
            try {
                canvas2 = canvas;
            } catch (Throwable th) {
                th = th;
                canvas2 = canvas;
            }
            try {
                canvas2.drawRect(f7, f7, f4, f4, this.f11230w);
                int iA = iVar.a();
                if (iA == 0 || iA == 1) {
                    canvas2.drawCircle(0.0f, 0.0f, f4, this.f11224q);
                    if (iVar.a() == 1) {
                        canvas2.drawCircle(0.0f, 0.0f, 2.0f, this.f11223p);
                    }
                } else if (iA == 2 || iA == 3) {
                    canvas2.drawCircle(0.0f, 0.0f, f4, this.f11223p);
                    if (iVar.a() == 3) {
                        canvas2.drawCircle(0.0f, 0.0f, 2.0f, this.f11224q);
                    }
                }
                canvas2.restoreToCount(iSave);
                canvas = canvas2;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                canvas2.restoreToCount(iSave);
                throw th3;
            }
        }
    }

    private final void v(Canvas canvas, String str) {
        for (int i4 = 0; i4 < 10; i4++) {
            for (int i5 = 0; i5 < 5; i5++) {
                float f4 = this.f11205D;
                int i6 = this.f11233z;
                float f5 = f4 + (((i5 * 2) + (i4 & 1)) * i6);
                float f6 = this.f11206E + (i6 * i4);
                canvas.drawRect(f5, f6, f5 + i6, f6 + i6, this.f11229v);
            }
        }
        s(this, canvas, str, null, 10, 0.0f, 16, null);
    }

    private final void w(Canvas canvas, int i4, int i5, float f4, float f5) {
        float f6 = f4 + (this.f11233z * i5);
        int i6 = i4 + 1;
        float f7 = f5;
        for (int i7 = 0; i7 < i6; i7++) {
            canvas.drawLine(f4, f7, f6, f7, this.f11222o);
            f7 += this.f11233z;
        }
        float f8 = f5 + (this.f11233z * i4);
        int i8 = i5 + 1;
        float f9 = f4;
        for (int i9 = 0; i9 < i8; i9++) {
            canvas.drawLine(f9, f5, f9, f8, this.f11222o);
            f9 += this.f11233z;
        }
    }

    private final void x(Canvas canvas, String str, HalmaParams halmaParams) {
        if (halmaParams != null) {
            n(this, canvas, halmaParams.getHeight(), halmaParams.getSize(), false, 8, null);
            int height = halmaParams.getHeight() * halmaParams.getSize();
            for (int i4 = 0; i4 < height; i4++) {
                char cCharAt = str.charAt(i4);
                if (cCharAt != '.') {
                    q(canvas, ((i4 % halmaParams.getSize()) * this.f11233z) + this.f11205D, ((i4 / halmaParams.getSize()) * this.f11233z) + this.f11206E, cCharAt);
                }
            }
        }
    }

    private final void y(Canvas canvas, int i4, float f4, int i5, int i6, int i7) {
        int iSave;
        Canvas canvas2 = canvas;
        float f5 = i5;
        float f6 = f5 * 3.0f;
        int i8 = i6 * i4;
        int i9 = i5 + i7;
        float f7 = i7;
        float f8 = (f4 - (i4 * i9)) + f7;
        float f9 = f4 - (((i4 + i4) - 1) * i6);
        int i10 = 0;
        while (i10 < i4) {
            float fAbs = (Math.abs(i4 - i10) * i9) + f8;
            int i11 = 0;
            while (i11 < i10) {
                iSave = canvas2.save();
                canvas2.translate(fAbs, f9);
                try {
                    int i12 = i9;
                    canvas2.drawPath(this.f11221n, this.f11222o);
                    canvas2.restoreToCount(iSave);
                    fAbs += f6;
                    i11++;
                    i9 = i12;
                } finally {
                }
            }
            int i13 = i9;
            float f10 = (i13 & (-r3)) + f8;
            int i14 = i4 - (i10 & 1);
            int i15 = 0;
            while (i15 < i14) {
                iSave = canvas2.save();
                canvas2.translate(f10, i8 + f9);
                try {
                    int i16 = i14;
                    canvas2.drawPath(this.f11221n, this.f11222o);
                    canvas2.restoreToCount(iSave);
                    f10 += f6;
                    i15++;
                    i14 = i16;
                } finally {
                }
            }
            f9 += i6;
            i10++;
            i9 = i13;
        }
        int i17 = i4 >> 1;
        int i18 = 0;
        while (i18 < i17) {
            float f11 = f4 + ((i6 << 1) * i18) + ((-(i4 & 1)) & i6);
            float f12 = i6 + f11;
            float f13 = f8;
            canvas2.drawLine(f13, f12, f8 + f7, f11, this.f11222o);
            float f14 = ((i4 * f6) + f13) - f5;
            canvas2 = canvas;
            canvas2.drawLine(f14, f12, f14 - f7, f11, this.f11222o);
            i18++;
            f8 = f13;
        }
    }

    private final void z(Canvas canvas, String str, CheckersParams checkersParams) {
        if (checkersParams == null) {
            Drawable drawable = this.f11212e;
            if (drawable != null) {
                int i4 = this.f11202A;
                drawable.setBounds(0, 0, i4, i4);
                drawable.draw(canvas);
                return;
            }
            return;
        }
        int columns = checkersParams.getColumns();
        int iMin = Math.min(getWidth(), getHeight());
        this.f11202A = iMin;
        int i5 = (iMin / ((columns * 3) + 2)) & (-2);
        int i6 = (int) (((iMin / r1) & (-2)) * 0.866f);
        int i7 = i5 >> 1;
        this.f11233z = (i6 << 1) - 2;
        this.f11221n.reset();
        float f4 = i7;
        float f5 = i6;
        this.f11221n.rLineTo(f4, -f5);
        this.f11221n.rLineTo(i5, 0.0f);
        this.f11221n.rLineTo(f4, f5);
        A(canvas, columns, i5, i6, i7, iMin * 0.5f, str, checkersParams);
    }

    public final void M(Canvas canvas) throws Throwable {
        m.e(canvas, "canvas");
        String str = this.f11216i;
        if (str == null) {
        }
        j();
        if (!AbstractC0575m.b(this.f11219l, f11201I)) {
            float f4 = this.f11205D;
            float f5 = this.f11206E;
            int i4 = this.f11202A;
            canvas.drawRect(f4, f5, i4 + f4, i4 + f5, this.f11230w);
            this.f11224q.setAlpha(255);
            this.f11223p.setAlpha(255);
        }
        switch (b.f11263b[this.f11219l.ordinal()]) {
            case 1:
                s(this, canvas, str, this.f11209b, 10, 0.0f, 16, null);
                break;
            case 2:
                r(canvas, str, this.f11210c, 9, 1.2222222f);
                break;
            case 3:
            case 4:
                l(canvas, str);
                break;
            case 5:
                s(this, canvas, str, null, 5, 0.0f, 16, null);
                break;
            case 6:
                D(canvas, str);
                break;
            case 7:
                p(canvas, str);
                break;
            case 8:
                E(canvas, str);
                break;
            case 9:
                J(canvas, str);
                break;
            case 10:
                K(canvas, str);
                break;
            case 11:
                v(canvas, str);
                break;
            case 12:
                L(canvas, str);
                break;
            case 13:
                o(canvas, str);
                break;
            case 14:
                N(canvas, str);
                break;
            case 15:
                cab.shashki.app.db.entities.a aVar = this.f11215h;
                F(canvas, str, aVar instanceof CheckersParams ? (CheckersParams) aVar : null);
                break;
            case 16:
                cab.shashki.app.db.entities.a aVar2 = this.f11215h;
                P(canvas, str, aVar2 instanceof CheckersParams ? (CheckersParams) aVar2 : null);
                break;
            case 17:
                cab.shashki.app.db.entities.a aVar3 = this.f11215h;
                z(canvas, str, aVar3 instanceof CheckersParams ? (CheckersParams) aVar3 : null);
                break;
            case 18:
                cab.shashki.app.db.entities.a aVar4 = this.f11215h;
                t(canvas, str, aVar4 instanceof FairyRepository.a ? (FairyRepository.a) aVar4 : null);
                break;
            case 19:
                cab.shashki.app.db.entities.a aVar5 = this.f11215h;
                O(canvas, str, aVar5 instanceof HalmaParams ? (HalmaParams) aVar5 : null);
                break;
            case 20:
                cab.shashki.app.db.entities.a aVar6 = this.f11215h;
                x(canvas, str, aVar6 instanceof HalmaParams ? (HalmaParams) aVar6 : null);
                break;
            case 21:
                u(canvas);
                break;
            default:
                for (int i5 = 0; i5 < 32; i5++) {
                    float f6 = this.f11205D;
                    a aVar7 = f11200H;
                    float fD = a.d(aVar7, false, i5, this.f11233z, false, 8, null) + f6;
                    float fE = aVar7.e(false, i5, this.f11233z) + this.f11206E;
                    int i6 = this.f11233z;
                    canvas.drawRect(fD, fE, i6 + fD, fE + i6, this.f11229v);
                }
                a.EnumC0149a enumC0149a = this.f11219l;
                if (enumC0149a != a.EnumC0149a.f11247m && enumC0149a != a.EnumC0149a.f11235B) {
                    if (this.f11218k) {
                        s(this, canvas, str, null, 0, 0.0f, 24, null);
                        break;
                    } else {
                        T(canvas, str);
                        break;
                    }
                } else {
                    s(this, canvas, str, null, 0, 0.0f, 24, null);
                    break;
                }
                break;
        }
    }

    public final boolean Y(Integer num, String str, String str2, cab.shashki.app.db.entities.a aVar, t tVar) {
        m.e(str, "position");
        return a0(cab.shashki.app.service.b.f10603a.w(num), str, str2, aVar, tVar);
    }

    public final boolean a0(int i4, String str, String str2, cab.shashki.app.db.entities.a aVar, t tVar) throws XmlPullParserException, Resources.NotFoundException, IOException {
        a.EnumC0149a enumC0149a;
        List listG;
        List listG2;
        List listG3;
        List listG4;
        m.e(str, "position");
        this.f11216i = null;
        boolean z4 = false;
        this.f11218k = false;
        if (i4 == AbstractC0888D.t5 || i4 == AbstractC0888D.g5 || i4 == AbstractC0888D.K5 || i4 == AbstractC0888D.l6 || i4 == AbstractC0888D.r5 || i4 == AbstractC0888D.f5 || i4 == AbstractC0888D.c6 || i4 == AbstractC0888D.m5 || i4 == AbstractC0888D.m6 || i4 == AbstractC0888D.q5) {
            if (!C1281e.f19032a.b().j(str)) {
                return false;
            }
            this.f11218k = true;
            setCollection((x) p.G(C1218E.f18139a.c()));
            enumC0149a = a.EnumC0149a.f11239e;
        } else if (i4 == AbstractC0888D.D6 || i4 == AbstractC0888D.P5) {
            if (!C1281e.f19032a.y().j(str)) {
                return false;
            }
            Drawable drawableB = this.f11209b;
            if (drawableB == null) {
                drawableB = o.b(getResources(), AbstractC0918v.Pa, getContext().getTheme());
            }
            this.f11209b = drawableB;
            setCollection((x) p.G(C1218E.f18139a.w()));
            enumC0149a = a.EnumC0149a.f11245k;
        } else if (i4 == AbstractC0888D.W5) {
            if (!C1281e.f19032a.l().j(str)) {
                return false;
            }
            setCollection((x) p.G(C1218E.f18139a.n()));
            enumC0149a = a.EnumC0149a.f11247m;
        } else if (i4 == AbstractC0888D.p5) {
            if (!C1281e.f19032a.a().j(str)) {
                return false;
            }
            setCollection((x) p.G(C1218E.f18139a.a()));
            this.f11218k = true;
            enumC0149a = a.EnumC0149a.f11254t;
        } else if (i4 == AbstractC0888D.G5) {
            if (!C1281e.f19032a.g().j(str)) {
                return false;
            }
            setCollection((x) p.G(C1218E.f18139a.a()));
            enumC0149a = a.EnumC0149a.f11252r;
        } else if (i4 == AbstractC0888D.w5 || i4 == AbstractC0888D.u5 || i4 == AbstractC0888D.L5) {
            if (!C1281e.f19032a.f().j(str)) {
                return false;
            }
            this.f11218k = true;
            setCollection((x) p.G(C1218E.f18139a.c()));
            enumC0149a = a.EnumC0149a.f11239e;
        } else if (i4 == AbstractC0888D.n6) {
            if (!C1281e.f19032a.v().j(str)) {
                return false;
            }
            Drawable drawableB2 = this.f11210c;
            if (drawableB2 == null) {
                drawableB2 = o.b(getResources(), AbstractC0918v.J7, getContext().getTheme());
            }
            this.f11210c = drawableB2;
            setCollection((x) p.G(C1218E.f18139a.r()));
            enumC0149a = a.EnumC0149a.f11246l;
        } else if (i4 == AbstractC0888D.Z5) {
            if (!C1281e.f19032a.n().j(str)) {
                return false;
            }
            setCollection((x) p.G(C1218E.f18139a.r()));
            enumC0149a = a.EnumC0149a.f11253s;
        } else if (i4 == AbstractC0888D.M5 || i4 == AbstractC0888D.S5 || i4 == AbstractC0888D.h5 || i4 == AbstractC0888D.l5 || i4 == AbstractC0888D.D5) {
            if (!C1281e.f19032a.i().j(str)) {
                return false;
            }
            enumC0149a = a.EnumC0149a.f11240f;
        } else if (i4 == AbstractC0888D.Y5) {
            if (!C1281e.f19032a.m().j(str)) {
                return false;
            }
            setCollection((x) p.G(C1218E.f18139a.c()));
            enumC0149a = a.EnumC0149a.f11249o;
        } else if (i4 == AbstractC0888D.Q5) {
            if (!C1281e.f19032a.j().j(str)) {
                return false;
            }
            setCollection((x) p.G(C1218E.f18139a.c()));
            enumC0149a = a.EnumC0149a.f11250p;
        } else if (i4 == AbstractC0888D.U5) {
            if (!C1281e.f19032a.k().j(str)) {
                return false;
            }
            enumC0149a = a.EnumC0149a.f11242h;
        } else if (i4 == AbstractC0888D.w6 || i4 == AbstractC0888D.v5 || i4 == AbstractC0888D.t6 || i4 == AbstractC0888D.s6) {
            if (!C1281e.f19032a.w().j(str)) {
                return false;
            }
            enumC0149a = a.EnumC0149a.f11243i;
        } else if (i4 == AbstractC0888D.o5 || i4 == AbstractC0888D.q6 || i4 == AbstractC0888D.X5) {
            if (!C1281e.f19032a.q().j(str)) {
                return false;
            }
            enumC0149a = a.EnumC0149a.f11244j;
        } else if (i4 == AbstractC0888D.C6) {
            if (!C1281e.f19032a.c().j(str)) {
                return false;
            }
            enumC0149a = a.EnumC0149a.f11241g;
        } else if (i4 == AbstractC0888D.y6 || i4 == AbstractC0888D.z6 || i4 == AbstractC0888D.A6 || i4 == AbstractC0888D.B6) {
            if (!C1281e.f19032a.c().j(str)) {
                return false;
            }
            enumC0149a = a.EnumC0149a.f11239e;
        } else if (i4 == AbstractC0888D.i6) {
            if (!C1281e.f19032a.p().j(str)) {
                return false;
            }
            setCollection(C1218E.f18139a.q());
            enumC0149a = a.EnumC0149a.f11248n;
        } else if (i4 == AbstractC0888D.a6) {
            if (!C1281e.f19032a.o().j(str)) {
                return false;
            }
            setCollection(A1.f2575a);
            enumC0149a = a.EnumC0149a.f11235B;
        } else if (i4 == AbstractC0888D.A5) {
            if (!C1281e.f19032a.c().j(str)) {
                return false;
            }
            this.f11215h = aVar;
            HalmaParams halmaParams = aVar instanceof HalmaParams ? (HalmaParams) aVar : null;
            enumC0149a = (halmaParams == null || !halmaParams.isStern()) ? a.EnumC0149a.f11259y : a.EnumC0149a.f11236C;
        } else if (i4 == AbstractC0888D.y5) {
            Drawable drawableB3 = this.f11211d;
            if (drawableB3 == null) {
                drawableB3 = o.b(getResources(), AbstractC0918v.f14866x2, getContext().getTheme());
            }
            this.f11211d = drawableB3;
            this.f11215h = aVar;
            if (tVar != null && (aVar instanceof FairyRepository.a)) {
                FairyRepository.a aVar2 = (FairyRepository.a) aVar;
                setCollection(tVar.d(aVar2.c()));
                this.f11213f = tVar.c(aVar2.c());
            }
            enumC0149a = a.EnumC0149a.f11256v;
        } else if (i4 == AbstractC0888D.x5) {
            cab.shashki.app.db.entities.a aVar3 = this.f11215h;
            Drawable drawableB4 = this.f11212e;
            if (drawableB4 == null) {
                drawableB4 = o.b(getResources(), AbstractC0918v.f14861w2, getContext().getTheme());
            }
            this.f11212e = drawableB4;
            this.f11215h = aVar;
            if (aVar != null) {
                C1281e c1281e = C1281e.f19032a;
                if (!c1281e.x().j(str) && !c1281e.e().j(str)) {
                    this.f11215h = null;
                }
            }
            CheckersParams checkersParams = aVar instanceof CheckersParams ? (CheckersParams) aVar : null;
            Cells cells = checkersParams != null ? checkersParams.getCells() : null;
            int i5 = cells == null ? -1 : b.f11262a[cells.ordinal()];
            if (i5 == 1) {
                enumC0149a = a.EnumC0149a.f11260z;
            } else if (i5 == 2) {
                if (!m.a(aVar3, aVar)) {
                    C0843z c0843z = C0843z.f11502a;
                    CheckersParams checkersParams2 = (CheckersParams) aVar;
                    int columns = checkersParams2.getColumns();
                    int rows = checkersParams2.getRows();
                    Set<String> blocked = checkersParams2.getBlocked();
                    if (blocked == null || (listG = p.b0(blocked)) == null) {
                        listG = p.g();
                    }
                    Set<String> breaks = checkersParams2.getBreaks();
                    if (breaks == null || (listG2 = p.b0(breaks)) == null) {
                        listG2 = p.g();
                    }
                    this.f11232y = c0843z.C(columns, rows, listG, listG2);
                }
                enumC0149a = a.EnumC0149a.f11258x;
            } else if (i5 == 3) {
                if (!m.a(aVar3, aVar)) {
                    C0843z c0843z2 = C0843z.f11502a;
                    CheckersParams checkersParams3 = (CheckersParams) aVar;
                    int columns2 = checkersParams3.getColumns();
                    int rows2 = checkersParams3.getRows();
                    Set<String> blocked2 = checkersParams3.getBlocked();
                    if (blocked2 == null || (listG3 = p.b0(blocked2)) == null) {
                        listG3 = p.g();
                    }
                    Set<String> breaks2 = checkersParams3.getBreaks();
                    if (breaks2 == null || (listG4 = p.b0(breaks2)) == null) {
                        listG4 = p.g();
                    }
                    this.f11232y = c0843z2.k0(columns2, rows2, listG3, listG4);
                }
                enumC0149a = a.EnumC0149a.f11258x;
            } else if (i5 == 4) {
                this.f11215h = null;
                enumC0149a = a.EnumC0149a.f11257w;
            } else if (i5 != 5) {
                enumC0149a = a.EnumC0149a.f11257w;
            } else {
                Iterable iterableC = K.C(K.f2926a, str, C1218E.f18139a.u(), null, 4, null);
                this.f11208G = iterableC;
                C0574l c0574l = C0574l.f2981a;
                if (iterableC == null) {
                    m.r("pieces");
                    iterableC = null;
                }
                c0574l.e(iterableC, this.f11207F);
                enumC0149a = a.EnumC0149a.f11234A;
            }
        } else if (i4 == AbstractC0888D.n5) {
            enumC0149a = a.EnumC0149a.f11251q;
        } else if (i4 != AbstractC0888D.p6) {
            C1281e c1281e2 = C1281e.f19032a;
            if (!c1281e2.s().j(str) && !c1281e2.u().j(str) && !c1281e2.r().j(str)) {
                return false;
            }
            enumC0149a = a.EnumC0149a.f11239e;
        } else {
            if (!C1281e.f19032a.t().j(str)) {
                return false;
            }
            enumC0149a = a.EnumC0149a.f11255u;
        }
        this.f11219l = enumC0149a;
        if (enumC0149a == a.EnumC0149a.f11239e && n.B(str, 'e', false, 2, null)) {
            z4 = true;
        }
        this.f11220m = z4;
        this.f11216i = c0(str);
        this.f11217j = str2 != null ? c0(str2) : null;
        postInvalidate();
        return true;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) throws Throwable {
        m.e(canvas, "canvas");
        super.onDraw(canvas);
        M(canvas);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.e(context, "context");
        this.f11219l = a.EnumC0149a.f11239e;
        this.f11221n = new Path();
        this.f11222o = new Paint();
        this.f11223p = new Paint();
        this.f11224q = new Paint();
        this.f11225r = new Paint();
        this.f11226s = new Paint();
        this.f11227t = new Paint();
        this.f11228u = new Paint();
        this.f11229v = new Paint();
        this.f11230w = new Paint();
        this.f11231x = new Paint();
        this.f11232y = p.g();
        this.f11207F = C0843z.c.f(C0843z.f.f11546a.g(25), 0, 0, 0, 0, null, null, 0.0f, 0.0f, 0, 0, 0, false, 0, 0, null, 0, 0, 0, 0, 0, 1048575, null);
        X(this, context, false, 2, null);
    }
}