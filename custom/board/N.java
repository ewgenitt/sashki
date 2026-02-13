package cab.shashki.app.ui.custom.board;

import N0.AbstractC0575m;
import N0.C0574l;
import N0.K;
import U2.AbstractC0590i;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import cab.shashki.app.ui.custom.board.C0843z;
import f0.AbstractC0917u;
import f0.AbstractC0918v;
import g3.InterfaceC1016l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public abstract class N extends V {

    /* renamed from: v0, reason: collision with root package name */
    public static final a f11341v0 = new a(null);

    /* renamed from: A, reason: collision with root package name */
    private int f11342A;

    /* renamed from: B, reason: collision with root package name */
    private PointF f11343B;

    /* renamed from: C, reason: collision with root package name */
    private C0843z.j f11344C;

    /* renamed from: D, reason: collision with root package name */
    private float f11345D;

    /* renamed from: E, reason: collision with root package name */
    private int f11346E;

    /* renamed from: F, reason: collision with root package name */
    private String f11347F;

    /* renamed from: G, reason: collision with root package name */
    private Drawable f11348G;

    /* renamed from: H, reason: collision with root package name */
    private C0843z.j[] f11349H;

    /* renamed from: I, reason: collision with root package name */
    private o0.s f11350I;

    /* renamed from: J, reason: collision with root package name */
    private List f11351J;

    /* renamed from: K, reason: collision with root package name */
    private List f11352K;

    /* renamed from: L, reason: collision with root package name */
    private List f11353L;

    /* renamed from: M, reason: collision with root package name */
    private List f11354M;

    /* renamed from: N, reason: collision with root package name */
    private List f11355N;

    /* renamed from: O, reason: collision with root package name */
    private final List f11356O;

    /* renamed from: P, reason: collision with root package name */
    private List f11357P;

    /* renamed from: Q, reason: collision with root package name */
    private List f11358Q;

    /* renamed from: R, reason: collision with root package name */
    private List f11359R;

    /* renamed from: S, reason: collision with root package name */
    private Map f11360S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f11361T;

    /* renamed from: U, reason: collision with root package name */
    private final C0843z.g[] f11362U;

    /* renamed from: V, reason: collision with root package name */
    private C0843z.h f11363V;

    /* renamed from: W, reason: collision with root package name */
    private final List f11364W;

    /* renamed from: a0, reason: collision with root package name */
    private final List f11365a0;

    /* renamed from: b0, reason: collision with root package name */
    private final List f11366b0;

    /* renamed from: c0, reason: collision with root package name */
    private final List f11367c0;

    /* renamed from: d0, reason: collision with root package name */
    private final Paint f11368d0;

    /* renamed from: e0, reason: collision with root package name */
    private final Paint f11369e0;

    /* renamed from: f0, reason: collision with root package name */
    private final int f11370f0;

    /* renamed from: g0, reason: collision with root package name */
    private final Paint f11371g0;

    /* renamed from: h0, reason: collision with root package name */
    private List f11372h0;

    /* renamed from: i0, reason: collision with root package name */
    private androidx.vectordrawable.graphics.drawable.o f11373i0;

    /* renamed from: j0, reason: collision with root package name */
    private androidx.vectordrawable.graphics.drawable.o f11374j0;

    /* renamed from: k0, reason: collision with root package name */
    private androidx.vectordrawable.graphics.drawable.o f11375k0;

    /* renamed from: l0, reason: collision with root package name */
    private Drawable f11376l0;

    /* renamed from: m0, reason: collision with root package name */
    private final Paint f11377m0;

    /* renamed from: n0, reason: collision with root package name */
    private final Paint f11378n0;

    /* renamed from: o0, reason: collision with root package name */
    private final Paint f11379o0;

    /* renamed from: p0, reason: collision with root package name */
    private final Path f11380p0;

    /* renamed from: q0, reason: collision with root package name */
    private final PointF f11381q0;

    /* renamed from: r0, reason: collision with root package name */
    private final PointF f11382r0;

    /* renamed from: s0, reason: collision with root package name */
    private final PointF f11383s0;

    /* renamed from: t0, reason: collision with root package name */
    private final float f11384t0;

    /* renamed from: u0, reason: collision with root package name */
    private final int f11385u0;

    /* renamed from: z, reason: collision with root package name */
    private boolean f11386z;

    public static final class a {
        public /* synthetic */ a(h3.h hVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        h3.m.e(context, "context");
        h3.m.e(attributeSet, "attrs");
        this.f11343B = new PointF();
        this.f11345D = 1.0f;
        this.f11346E = -1;
        this.f11347F = "0";
        C0843z.j[] jVarArr = new C0843z.j[128];
        int i5 = 0;
        for (int i6 = 0; i6 < 128; i6++) {
            jVarArr[i6] = new C0843z.j();
        }
        this.f11349H = jVarArr;
        this.f11351J = new ArrayList();
        this.f11352K = new ArrayList();
        this.f11353L = new ArrayList();
        this.f11354M = new ArrayList();
        this.f11355N = new ArrayList();
        this.f11356O = new ArrayList();
        this.f11357P = new ArrayList();
        this.f11358Q = new ArrayList();
        this.f11359R = new ArrayList();
        this.f11360S = new LinkedHashMap();
        C0843z.g[] gVarArr = new C0843z.g[8];
        for (int i7 = 0; i7 < 8; i7++) {
            gVarArr[i7] = new C0843z.g(null, i5, 3, 0 == true ? 1 : 0);
        }
        this.f11362U = gVarArr;
        this.f11363V = C0843z.h.f11550d;
        this.f11364W = new ArrayList();
        this.f11365a0 = new ArrayList();
        this.f11366b0 = new ArrayList();
        this.f11367c0 = new ArrayList();
        Paint paint = new Paint();
        paint.setColor(Color.argb(255, 233, 201, 156));
        this.f11368d0 = paint;
        Paint paint2 = new Paint();
        paint2.setColor(Color.argb(255, 168, 131, 76));
        if (Build.VERSION.SDK_INT >= 21) {
            paint2.setFlags(1);
        }
        this.f11369e0 = paint2;
        int iC = androidx.core.content.a.c(context, AbstractC0917u.f14628b);
        this.f11370f0 = iC;
        Paint paint3 = new Paint();
        paint3.setColor(iC);
        this.f11371g0 = paint3;
        this.f11372h0 = U2.p.g();
        this.f11373i0 = androidx.vectordrawable.graphics.drawable.o.b(getResources(), AbstractC0918v.l4, context.getTheme());
        this.f11374j0 = androidx.vectordrawable.graphics.drawable.o.b(getResources(), AbstractC0918v.T7, context.getTheme());
        this.f11375k0 = androidx.vectordrawable.graphics.drawable.o.b(getResources(), AbstractC0918v.U7, context.getTheme());
        this.f11376l0 = androidx.core.content.a.e(context, AbstractC0918v.f14757b3);
        Paint paint4 = new Paint();
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setColor(androidx.core.content.a.c(context, AbstractC0917u.f14632f));
        this.f11377m0 = paint4;
        Paint paint5 = new Paint();
        paint5.setTextAlign(Paint.Align.CENTER);
        paint5.setFlags(1);
        this.f11378n0 = paint5;
        this.f11379o0 = new Paint();
        this.f11380p0 = new Path();
        this.f11381q0 = new PointF();
        this.f11382r0 = new PointF();
        this.f11383s0 = new PointF();
        this.f11384t0 = getResources().getDisplayMetrics().density * 4;
        this.f11385u0 = AbstractC0575m.c(24, 10, 21, 25, 26);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A0() throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            r4 = this;
            cab.shashki.app.ui.custom.board.z$c r0 = r4.getMode()
            int r0 = r0.i()
            boolean r1 = r4.z0()
            if (r1 == 0) goto L12
            r0 = -1
            r4.f11346E = r0
            goto L41
        L12:
            int r1 = r4.f11346E
            if (r1 == r0) goto L41
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r2 = r1.intValue()
            r3 = 0
            if (r2 <= 0) goto L22
            goto L23
        L22:
            r1 = r3
        L23:
            if (r1 == 0) goto L39
            int r1 = r1.intValue()
            android.content.res.Resources r2 = r4.getResources()
            android.content.Context r3 = r4.getContext()
            android.content.res.Resources$Theme r3 = r3.getTheme()
            androidx.vectordrawable.graphics.drawable.o r3 = androidx.vectordrawable.graphics.drawable.o.b(r2, r1, r3)
        L39:
            r4.f11348G = r3
            r4.f11346E = r0
            java.lang.String r0 = "0"
            r4.f11347F = r0
        L41:
            android.graphics.drawable.Drawable r0 = r4.f11348G
            if (r0 == 0) goto L51
            int r1 = r4.getSize()
            int r2 = r4.getSize()
            r3 = 0
            r0.setBounds(r3, r3, r1, r2)
        L51:
            java.util.List r0 = r4.f11372h0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L74
            o0.s r0 = r4.f11350I
            if (r0 == 0) goto L6e
            o0.D r1 = o0.C1217D.f18138a
            android.content.Context r2 = r4.getContext()
            java.lang.String r3 = "getContext(...)"
            h3.m.d(r2, r3)
            java.util.List r0 = r1.e(r2, r0)
            if (r0 != 0) goto L72
        L6e:
            java.util.List r0 = U2.p.g()
        L72:
            r4.f11372h0 = r0
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cab.shashki.app.ui.custom.board.N.A0():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B0(N n4) throws XmlPullParserException, Resources.NotFoundException, IOException {
        n4.A0();
        n4.E0();
        n4.w();
    }

    private final String D0(String str) {
        boolean zIsUpperCase = Character.isUpperCase(str.charAt(0));
        C0843z.c mode = getMode();
        int iT = zIsUpperCase ? mode.t() - getMode().x() : 1 - mode.x();
        List list = zIsUpperCase ? this.f11366b0 : this.f11367c0;
        int iIndexOf = list.indexOf(Character.valueOf(str.charAt(0)));
        if (iIndexOf == -1) {
            iIndexOf = list.size();
        }
        StringBuilder sb = new StringBuilder();
        sb.append((char) (iIndexOf + 97));
        sb.append(iT);
        return sb.toString();
    }

    private final void E0() {
        if (getMode().p() == 0) {
            return;
        }
        for (C0843z.b bVar : this.f11357P) {
            bVar.d(i(bVar.b()));
        }
        for (C0843z.k kVar : this.f11358Q) {
            kVar.c(i(kVar.b()));
        }
        for (C0843z.k kVar2 : this.f11359R) {
            kVar2.c(i(kVar2.b()));
        }
        for (C0843z.j jVar : this.f11349H) {
            if (jVar.f()) {
                jVar.set(i(jVar.getPosition()));
            }
        }
    }

    public static /* synthetic */ String H0(N n4, String str, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: wrapPosition");
        }
        if ((i5 & 2) != 0) {
            i4 = -1;
        }
        return n4.G0(str, i4);
    }

    private final void L(Canvas canvas) {
        this.f11378n0.setColor(this.f11368d0.getColor());
        for (int i4 = 0; i4 < 7; i4++) {
            canvas.drawText(String.valueOf((char) (i4 + 65)), getXs()[i4], getHalfCellY() * 0.5f, this.f11378n0);
        }
    }

    private final void M(Canvas canvas) {
        int i4;
        if (getRotateAll()) {
            canvas.save();
            canvas.rotate(180.0f, getSize() / 2.0f, getSize() / 2.0f);
            i4 = 73;
        } else {
            i4 = 0;
        }
        int i5 = this.f11363V != C0843z.h.f11551e ? 1 : 0;
        for (int i6 = 0; i6 < 12; i6++) {
            for (int i7 = 0; i7 < 6; i7++) {
                float f4 = getXs()[(i7 * 2) + ((i6 & 1) ^ i5)];
                float f5 = getYs()[11 - i6];
                i4 = getRotateAll() ? i4 - 1 : i4 + 1;
                canvas.drawText(String.valueOf(i4), f4, f5 + (getHalfCellX() / 8), this.f11378n0);
            }
        }
        if (getRotateAll()) {
            canvas.restore();
        }
    }

    private final void N(Canvas canvas) throws Throwable {
        int iP = getMode().p();
        if (iP == 4) {
            g0(canvas);
            return;
        }
        if (iP == 18) {
            m0(canvas);
            return;
        }
        if (iP == 9) {
            P(canvas);
            return;
        }
        if (iP == 10) {
            o0(canvas);
            return;
        }
        if (iP == 20) {
            b0(canvas);
            return;
        }
        if (iP == 21) {
            X(canvas);
            return;
        }
        switch (iP) {
            case 23:
                j0(canvas);
                break;
            case 24:
                Z(canvas);
                break;
            case 25:
                W(canvas);
                break;
            case 26:
                t0(canvas);
                break;
            default:
                S(canvas);
                break;
        }
    }

    private final void O(Canvas canvas) {
        if (getRotateAll()) {
            canvas.save();
            canvas.rotate(180.0f, getSize() / 2.0f, getSize() / 2.0f);
        }
        for (int i4 = 0; i4 < 8; i4++) {
            for (int i5 = 0; i5 < 4; i5++) {
                int i6 = getXs()[(i5 * 2) + ((i4 & 1) ^ 1)];
                int i7 = getYs()[7 - i4];
                int i8 = this.f11363V == C0843z.h.f11552f ? (i4 * 4) + i5 + 1 : (32 - (i4 * 4)) - i5;
                if (getRotateAll()) {
                    i8 = 33 - i8;
                }
                canvas.drawText(String.valueOf(i8), i6, i7 + (getHalfCellX() / 8), this.f11378n0);
            }
        }
        if (getRotateAll()) {
            canvas.restore();
        }
    }

    private final void P(Canvas canvas) {
        canvas.drawColor(this.f11370f0);
        int i4 = 0;
        while (i4 < 6) {
            i4++;
            float cellSizeX = getCellSizeX() * i4;
            canvas.drawLine(cellSizeX, 0.0f, cellSizeX, getSize(), this.f11368d0);
        }
    }

    private final void Q(Canvas canvas) {
        Drawable drawable;
        o0.v vVar;
        Drawable drawable2;
        C0843z.j jVar = this.f11344C;
        o0.s sVar = this.f11350I;
        int pieceRadius = (sVar == null || !sVar.e() || !getMode().q() || (this.f11350I instanceof o0.u)) ? getPieceRadius() : getCellSizeY();
        C0843z.j[] jVarArr = this.f11349H;
        int length = jVarArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            C0843z.j jVar2 = jVarArr[i4];
            if (jVar2.f() && !h3.m.a(jVar2, jVar) && (drawable2 = (Drawable) U2.p.I(this.f11372h0, jVar2.a())) != null) {
                drawable2.setBounds((int) (((PointF) jVar2).x - getPieceRadius()), (int) (((PointF) jVar2).y - pieceRadius), (int) (((PointF) jVar2).x + getPieceRadius()), (int) (((PointF) jVar2).y + getPieceRadius()));
                vVar = drawable2 instanceof o0.v ? (o0.v) drawable2 : null;
                if (vVar != null) {
                    String strB = jVar2.b();
                    h3.m.b(strB);
                    vVar.b(strB);
                }
                if (getRotateAll() && this.f11386z) {
                    canvas.save();
                    canvas.rotate(180.0f, ((PointF) jVar2).x, ((PointF) jVar2).y);
                }
                drawable2.draw(canvas);
                if (getRotateAll() && this.f11386z) {
                    canvas.restore();
                }
            }
            i4++;
        }
        if (getMode().m() == 3) {
            Y(canvas);
        }
        if (this.f11361T) {
            R(canvas);
        }
        p0(canvas);
        l0(canvas);
        x0(canvas);
        if (jVar == null || (drawable = (Drawable) U2.p.I(this.f11372h0, jVar.a())) == null) {
            return;
        }
        if (getRotateAll() && this.f11386z) {
            canvas.save();
            canvas.rotate(180.0f, ((PointF) jVar).x, ((PointF) jVar).y);
        }
        drawable.setBounds((int) (((PointF) jVar).x - getPieceRadius()), (int) (((PointF) jVar).y - pieceRadius), (int) (((PointF) jVar).x + getPieceRadius()), (int) (((PointF) jVar).y + getPieceRadius()));
        vVar = drawable instanceof o0.v ? (o0.v) drawable : null;
        if (vVar != null) {
            String strB2 = jVar.b();
            h3.m.b(strB2);
            vVar.b(strB2);
        }
        drawable.draw(canvas);
        if (getRotateAll() && this.f11386z) {
            canvas.restore();
        }
    }

    private final void R(Canvas canvas) {
        float halfCellX = getHalfCellX() * 0.8f;
        float halfCellY = getHalfCellY() * 0.8f;
        this.f11378n0.setColor(this.f11377m0.getColor());
        this.f11378n0.setTypeface(Typeface.DEFAULT_BOLD);
        for (Map.Entry entry : this.f11360S.entrySet()) {
            PointF pointFI = i((String) entry.getKey());
            if (getRotateAll()) {
                canvas.save();
                canvas.rotate(180.0f, pointFI.x, pointFI.y);
            }
            canvas.drawText(String.valueOf(((Number) entry.getValue()).intValue()), pointFI.x + halfCellX, pointFI.y + halfCellY, this.f11378n0);
            if (getRotateAll()) {
                canvas.restore();
            }
        }
        this.f11378n0.setTypeface(Typeface.DEFAULT);
    }

    private final void S(Canvas canvas) {
        float f4;
        boolean zQ = getMode().q();
        float halfCellX = getHalfCellX();
        float fU = getMode().u();
        float f5 = zQ ? 1.0f : 0.0f;
        float fW = (halfCellX * (fU - f5)) + (getMode().w() * getCellSizeX());
        float halfCellY = (getHalfCellY() * (getMode().v() - f5)) + (getMode().x() * getCellSizeY());
        int iS = getMode().s() - (getMode().w() << 1);
        int iT = getMode().t() - (getMode().x() << 1);
        canvas.drawColor(this.f11370f0);
        if (Build.VERSION.SDK_INT < 21 || !getMode().q()) {
            f4 = fW;
            canvas.drawRect(f4, halfCellY, f4 + (getCellSizeX() * (iS + 1)), halfCellY + (getCellSizeY() * (iT + 1)), this.f11369e0);
        } else {
            f4 = fW;
            canvas.drawRoundRect(f4, halfCellY, (getCellSizeX() * (iS + 1)) + fW, (getCellSizeY() * (iT + 1)) + halfCellY, getHalfCellX() * 0.5f, 0.5f * getHalfCellY(), this.f11369e0);
        }
        if (getMode().m() == 3) {
            float halfCellX2 = f4 + getHalfCellX();
            float size = getSize() - halfCellX2;
            canvas.drawRect(halfCellX2, 0.0f, size, getCellSizeY(), this.f11369e0);
            canvas.drawRect(halfCellX2, getSize() - getCellSizeY(), size, getSize(), this.f11368d0);
        }
        int i4 = (iT & 1) ^ 1;
        for (int i5 = 0; i5 < iT; i5++) {
            for (int i6 = 0; i6 < iS; i6++) {
                if ((i6 & 1) != i4) {
                    float f6 = getXs()[getMode().w() + i6];
                    float f7 = getYs()[((iT - i5) - 1) + getMode().x()];
                    canvas.drawRect(f6 - getHalfCellX(), f7 - getHalfCellX(), f6 + getHalfCellX(), getHalfCellX() + f7, this.f11368d0);
                }
            }
            i4 ^= 1;
        }
        for (PointF pointF : o3.h.o(U2.p.y(this.f11353L), new InterfaceC1016l() { // from class: cab.shashki.app.ui.custom.board.K
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return N.T(this.f11330d, (String) obj);
            }
        })) {
            canvas.drawRect(pointF.x - getHalfCellX(), pointF.y - getHalfCellX(), pointF.x + getHalfCellX(), getHalfCellX() + pointF.y, this.f11371g0);
        }
        for (T2.l lVar : this.f11355N) {
            PointF pointFI = i((String) lVar.c());
            PointF pointFI2 = i((String) lVar.d());
            this.f11379o0.setColor(-65536);
            canvas.drawLine(pointFI.x, pointFI.y, pointFI2.x, pointFI2.y, this.f11379o0);
        }
        if (this.f11354M.isEmpty()) {
            return;
        }
        this.f11379o0.setColor(this.f11377m0.getColor());
        this.f11379o0.setStyle(Paint.Style.STROKE);
        this.f11379o0.setFlags(1);
        for (PointF pointF2 : o3.h.o(U2.p.y(this.f11354M), new InterfaceC1016l() { // from class: cab.shashki.app.ui.custom.board.L
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return N.U(this.f11335d, (String) obj);
            }
        })) {
            canvas.drawCircle(pointF2.x, pointF2.y, getHalfCellX() * 3.2f, this.f11379o0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PointF T(N n4, String str) {
        h3.m.e(str, "it");
        return n4.i(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PointF U(N n4, String str) {
        h3.m.e(str, "it");
        return n4.i(str);
    }

    private final void V(Canvas canvas, float f4, float f5) {
        int halfCellX = getHalfCellX() * 3;
        int i4 = halfCellX >> 2;
        for (C0843z.b bVar : this.f11357P) {
            float f6 = bVar.a().x - f4;
            float f7 = bVar.a().y;
            int iSave = canvas.save();
            canvas.translate(f6, f7);
            try {
                canvas.drawPath(this.f11380p0, this.f11368d0);
                if (getRotateAll()) {
                    canvas.save();
                    canvas.rotate(180.0f, f4, 0.0f);
                }
                int iC = bVar.c();
                androidx.vectordrawable.graphics.drawable.o oVar = iC != 129 ? iC != 130 ? null : this.f11374j0 : this.f11375k0;
                if (oVar != null) {
                    int i5 = ((int) f4) - (halfCellX >> 3);
                    oVar.setBounds(i5, -getHalfCellX(), i5 + i4, i4 - getHalfCellX());
                    oVar.draw(canvas);
                }
                canvas.drawText(C0574l.f2981a.i(bVar.b()), f4, f5, this.f11378n0);
                if (getRotateAll()) {
                    canvas.restore();
                }
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        }
    }

    private final void W(Canvas canvas) throws Throwable {
        Canvas canvas2;
        float halfCellX = getHalfCellX();
        int halfCellX2 = getHalfCellX() * 3;
        int i4 = halfCellX2 >> 2;
        float f4 = i4;
        float f5 = f4 * 0.5f;
        this.f11368d0.setFlags(1);
        this.f11378n0.setTextSize(f4);
        this.f11378n0.setColor(this.f11377m0.getColor());
        this.f11379o0.setStrokeWidth(getHalfCellX() / 12.0f);
        canvas.drawColor(this.f11370f0);
        for (C0843z.b bVar : this.f11357P) {
            float f6 = bVar.a().x;
            float f7 = bVar.a().y;
            int iSave = canvas.save();
            canvas.translate(f6, f7);
            float f8 = -halfCellX;
            try {
                canvas2 = canvas;
                try {
                    canvas2.drawRect(f8, f8, halfCellX, halfCellX, this.f11368d0);
                    if (getRotateAll()) {
                        canvas2.save();
                        canvas2.rotate(180.0f, 0.0f, 0.0f);
                    }
                    int iC = bVar.c();
                    androidx.vectordrawable.graphics.drawable.o oVar = iC != 129 ? iC != 130 ? null : this.f11374j0 : this.f11375k0;
                    if (oVar != null) {
                        int i5 = -(halfCellX2 >> 3);
                        oVar.setBounds(i5, -getHalfCellX(), i5 + i4, i4 - getHalfCellX());
                        oVar.draw(canvas2);
                    }
                    canvas2.drawText(C0574l.f2981a.i(bVar.b()), 0.0f, f5, this.f11378n0);
                    if (getRotateAll()) {
                        canvas2.restore();
                    }
                    canvas2.restoreToCount(iSave);
                    canvas = canvas2;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    canvas2.restoreToCount(iSave);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                canvas2 = canvas;
            }
        }
    }

    private final void X(Canvas canvas) {
        float cellSizeX = (getCellSizeX() * 0.66f) - 1;
        float f4 = 0.5f * cellSizeX;
        float f5 = 0.866f * cellSizeX;
        this.f11380p0.reset();
        this.f11380p0.rLineTo(f4, f5);
        this.f11380p0.rLineTo(cellSizeX, 0.0f);
        float f6 = -f5;
        this.f11380p0.rLineTo(f4, f6);
        float f7 = -f4;
        this.f11380p0.rLineTo(f7, f6);
        this.f11380p0.rLineTo(-cellSizeX, 0.0f);
        this.f11380p0.rLineTo(f7, f5);
        canvas.drawColor(this.f11370f0);
        this.f11368d0.setFlags(1);
        this.f11378n0.setTextSize(f4);
        this.f11378n0.setColor(this.f11377m0.getColor());
        this.f11379o0.setStrokeWidth(getHalfCellX() / 12.0f);
        V(canvas, cellSizeX, 0.4f * f4);
    }

    private final void Y(Canvas canvas) {
        float fW = (getMode().w() * getCellSizeX()) + (getMode().u() * getHalfCellX());
        float fV = getMode().v() * getHalfCellY();
        float size = getSize() - fW;
        this.f11369e0.setStrokeWidth(this.f11368d0.getStrokeWidth());
        int i4 = 0;
        while (i4 < 3) {
            float halfCellY = fV + (getHalfCellY() * i4);
            Canvas canvas2 = canvas;
            canvas2.drawLine(fW, halfCellY, size, halfCellY, this.f11368d0);
            float size2 = halfCellY + (getSize() - getCellSizeY());
            canvas2.drawLine(fW, size2, size, size2, this.f11369e0);
            i4++;
            canvas = canvas2;
        }
        Canvas canvas3 = canvas;
        float cellSizeY = fV + getCellSizeY();
        float size3 = getSize() - cellSizeY;
        float size4 = getSize() - fV;
        float halfCellX = fW;
        while (halfCellX <= size) {
            float f4 = fV;
            canvas3.drawLine(halfCellX, f4, halfCellX, cellSizeY, this.f11368d0);
            canvas3.drawLine(halfCellX, size3, halfCellX, size4, this.f11369e0);
            halfCellX += getHalfCellX();
            cellSizeY = cellSizeY;
            fV = f4;
        }
    }

    private final void Z(Canvas canvas) {
        if (getMode().i() != -1) {
            canvas.drawColor(this.f11370f0);
        }
        float fU = (getMode().u() * getHalfCellX()) + (getMode().w() * getCellSizeX());
        float fV = (getMode().v() * getHalfCellY()) + (getMode().x() * getCellSizeY());
        int cellSizeX = getCellSizeX() * (getMode().s() - (getMode().w() << 1));
        int cellSizeY = getCellSizeY() * (getMode().t() - (getMode().x() << 1));
        int iS = (getMode().s() - (getMode().w() << 1)) + 1;
        int i4 = 0;
        while (i4 < iS) {
            float cellSizeX2 = (getCellSizeX() * i4) + fU;
            Canvas canvas2 = canvas;
            canvas2.drawLine(cellSizeX2, fV, cellSizeX2, fV + cellSizeY, this.f11377m0);
            i4++;
            canvas = canvas2;
        }
        Canvas canvas3 = canvas;
        int iT = (getMode().t() - (getMode().x() << 1)) + 1;
        for (int i5 = 0; i5 < iT; i5++) {
            float cellSizeY2 = (getCellSizeY() * i5) + fV;
            Canvas canvas4 = canvas3;
            canvas4.drawLine(fU, cellSizeY2, cellSizeX + fU, cellSizeY2, this.f11377m0);
            canvas3 = canvas4;
        }
    }

    private final void a0(Canvas canvas) {
        int iSave;
        int iS = getMode().s();
        float cellSizeX = getCellSizeX() * 3.0f;
        int cellSizeY = getCellSizeY() * iS;
        float size = getSize() * 0.5f;
        float cellSizeX2 = (size - ((getCellSizeX() + getHalfCellX()) * iS)) + getHalfCellX();
        float cellSizeY2 = size - (((iS + iS) - 1) * getCellSizeY());
        int i4 = 0;
        for (int i5 = 0; i5 < iS; i5++) {
            float fAbs = (Math.abs(iS - i5) * (getCellSizeX() + getHalfCellX())) + cellSizeX2;
            for (int i6 = 0; i6 < i5; i6++) {
                iSave = canvas.save();
                canvas.translate(fAbs, cellSizeY2);
                try {
                    canvas.drawPath(this.f11380p0, this.f11379o0);
                    canvas.restoreToCount(iSave);
                    fAbs += cellSizeX;
                } finally {
                }
            }
            float cellSizeX3 = ((getCellSizeX() + getHalfCellX()) & (-r6)) + cellSizeX2;
            int i7 = iS - (i5 & 1);
            for (int i8 = 0; i8 < i7; i8++) {
                iSave = canvas.save();
                canvas.translate(cellSizeX3, cellSizeY + cellSizeY2);
                try {
                    canvas.drawPath(this.f11380p0, this.f11379o0);
                    canvas.restoreToCount(iSave);
                    cellSizeX3 += cellSizeX;
                } finally {
                }
            }
            cellSizeY2 += getCellSizeY();
        }
        int i9 = iS >> 1;
        while (i4 < i9) {
            float cellSizeY3 = getYs()[(iS - i4) - 1] + (getCellSizeY() & (-(iS & 1)));
            Canvas canvas2 = canvas;
            canvas2.drawLine(cellSizeX2, cellSizeY3 + getCellSizeY(), cellSizeX2 + getHalfCellX(), cellSizeY3, this.f11379o0);
            float cellSizeX4 = ((iS * cellSizeX) + cellSizeX2) - getCellSizeX();
            canvas2.drawLine(cellSizeX4, getCellSizeY() + cellSizeY3, cellSizeX4 - getHalfCellX(), cellSizeY3, this.f11379o0);
            i4++;
            canvas = canvas2;
        }
    }

    private final void b0(Canvas canvas) {
        canvas.drawColor(this.f11370f0);
        this.f11379o0.setColor(this.f11377m0.getColor());
        this.f11379o0.setStyle(Paint.Style.STROKE);
        this.f11379o0.setFlags(1);
        this.f11380p0.reset();
        this.f11380p0.rLineTo(getHalfCellX(), -getCellSizeY());
        this.f11380p0.rLineTo(getCellSizeX(), 0.0f);
        this.f11380p0.rLineTo(getHalfCellX(), getCellSizeY());
        float size = getSize() * 0.5f;
        a0(canvas);
        int iSave = canvas.save();
        try {
            canvas.scale(1.0f, -1.0f, size, size);
            a0(canvas);
            canvas.restoreToCount(iSave);
            int iS = getMode().s() & (-2);
            float fS = (size - ((getMode().s() & (-2)) * (getCellSizeX() + getHalfCellX()))) + getCellSizeX();
            int i4 = 0;
            while (i4 < iS) {
                Canvas canvas2 = canvas;
                canvas2.drawLine(fS, size, fS + getCellSizeX(), size, this.f11379o0);
                fS += getCellSizeX() * 3;
                i4++;
                canvas = canvas2;
            }
            Canvas canvas3 = canvas;
            for (PointF pointF : o3.h.o(U2.p.y(this.f11353L), new InterfaceC1016l() { // from class: cab.shashki.app.ui.custom.board.I
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return N.c0(this.f11323d, (String) obj);
                }
            })) {
                canvas3.drawLine(pointF.x - getHalfCellX(), pointF.y - getHalfCellX(), pointF.x + getHalfCellX(), pointF.y + getHalfCellX(), this.f11379o0);
                canvas3.drawLine(pointF.x - getHalfCellX(), pointF.y + getHalfCellX(), pointF.x + getHalfCellX(), pointF.y - getHalfCellX(), this.f11379o0);
            }
            for (PointF pointF2 : o3.h.o(U2.p.y(this.f11354M), new InterfaceC1016l() { // from class: cab.shashki.app.ui.custom.board.J
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return N.d0(this.f11325d, (String) obj);
                }
            })) {
                canvas3.drawCircle(pointF2.x, pointF2.y, getCellSizeY() * 3.0f, this.f11379o0);
            }
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PointF c0(N n4, String str) {
        h3.m.e(str, "it");
        return n4.i(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PointF d0(N n4, String str) {
        h3.m.e(str, "it");
        return n4.i(str);
    }

    private final void e0(Canvas canvas) {
        char c4;
        char c5;
        int iS = getMode().s() + getMode().s();
        this.f11382r0.set(getCellSizeX() + getHalfCellX(), getCellSizeY());
        this.f11381q0.set((getSize() * 0.5f) - getCellSizeX(), ((getSize() * 0.5f) - ((iS - 1) * getCellSizeY())) + getHalfCellY());
        this.f11378n0.setColor(this.f11377m0.getColor());
        if (getRotateAll()) {
            canvas.save();
            canvas.rotate(180.0f, getSize() / 2.0f, getSize() / 2.0f);
            c5 = (char) (((char) (iS + 65)) - 2);
            iS = 0;
            c4 = 1;
        } else {
            c4 = 65535;
            c5 = 'A';
        }
        int iS2 = getMode().s();
        for (int i4 = 0; i4 < iS2; i4++) {
            iS += c4;
            String strValueOf = String.valueOf(iS);
            PointF pointF = this.f11381q0;
            canvas.drawText(strValueOf, pointF.x, pointF.y, this.f11378n0);
            PointF pointF2 = this.f11381q0;
            PointF pointF3 = this.f11382r0;
            pointF2.offset(-pointF3.x, pointF3.y);
        }
        PointF pointF4 = this.f11381q0;
        PointF pointF5 = this.f11382r0;
        pointF4.offset(pointF5.x, pointF5.y);
        int iS3 = getMode().s() - 1;
        for (int i5 = 0; i5 < iS3; i5++) {
            iS += c4;
            String strValueOf2 = String.valueOf(iS);
            PointF pointF6 = this.f11381q0;
            canvas.drawText(strValueOf2, pointF6.x, pointF6.y, this.f11378n0);
            PointF pointF7 = this.f11381q0;
            float f4 = this.f11382r0.y;
            pointF7.offset(0.0f, f4 + f4);
        }
        PointF pointF8 = this.f11381q0;
        PointF pointF9 = this.f11382r0;
        pointF8.offset(pointF9.x * 0.67f, pointF9.y * 0.5f);
        int iS4 = getMode().s() - 1;
        for (int i6 = 0; i6 < iS4; i6++) {
            String strValueOf3 = String.valueOf(c5);
            PointF pointF10 = this.f11381q0;
            canvas.drawText(strValueOf3, pointF10.x, pointF10.y, this.f11378n0);
            PointF pointF11 = this.f11381q0;
            PointF pointF12 = this.f11382r0;
            pointF11.offset(pointF12.x, pointF12.y);
            c5 = (char) (c5 - c4);
        }
        char c6 = (char) (c5 - c4);
        PointF pointF13 = this.f11381q0;
        PointF pointF14 = this.f11382r0;
        pointF13.offset(pointF14.x, -pointF14.y);
        int iS5 = getMode().s() - 1;
        for (int i7 = 0; i7 < iS5; i7++) {
            String strValueOf4 = String.valueOf(c6);
            PointF pointF15 = this.f11381q0;
            canvas.drawText(strValueOf4, pointF15.x, pointF15.y, this.f11378n0);
            PointF pointF16 = this.f11381q0;
            PointF pointF17 = this.f11382r0;
            pointF16.offset(pointF17.x, -pointF17.y);
            c6 = (char) (c6 - c4);
        }
        PointF pointF18 = this.f11381q0;
        PointF pointF19 = this.f11382r0;
        pointF18.offset((-pointF19.x) * 0.33f, pointF19.y * 0.5f);
        int iS6 = getMode().s();
        for (int i8 = 0; i8 < iS6; i8++) {
            PointF pointF20 = this.f11381q0;
            float f5 = this.f11382r0.y;
            pointF20.offset(0.0f, (-f5) - f5);
            String strValueOf5 = String.valueOf(iS);
            PointF pointF21 = this.f11381q0;
            canvas.drawText(strValueOf5, pointF21.x, pointF21.y, this.f11378n0);
            iS -= c4;
        }
        int iS7 = getMode().s() - 1;
        for (int i9 = 0; i9 < iS7; i9++) {
            PointF pointF22 = this.f11381q0;
            PointF pointF23 = this.f11382r0;
            pointF22.offset(-pointF23.x, -pointF23.y);
            String strValueOf6 = String.valueOf(iS);
            PointF pointF24 = this.f11381q0;
            canvas.drawText(strValueOf6, pointF24.x, pointF24.y, this.f11378n0);
            iS -= c4;
        }
        if (getRotateAll()) {
            canvas.restore();
        }
    }

    private final void f0(Canvas canvas) {
        int i4;
        if (getRotateAll()) {
            canvas.save();
            canvas.rotate(180.0f, getSize() / 2.0f, getSize() / 2.0f);
            i4 = 51;
        } else {
            i4 = 0;
        }
        for (int i5 = 0; i5 < 10; i5++) {
            for (int i6 = 0; i6 < 5; i6++) {
                float f4 = getXs()[(i6 * 2) + ((i5 & 1) ^ 1)];
                float f5 = getYs()[9 - i5];
                i4 = getRotateAll() ? i4 - 1 : i4 + 1;
                canvas.drawText(String.valueOf(i4), f4, f5 + (getHalfCellX() / 8), this.f11378n0);
            }
        }
        if (getRotateAll()) {
            canvas.restore();
        }
    }

    private final void g0(Canvas canvas) {
        canvas.drawColor(this.f11370f0);
        for (int i4 = 0; i4 < 7; i4++) {
            int i5 = ((i4 & 1) ^ 1) + 3;
            for (int i6 = 0; i6 < i5; i6++) {
                canvas.drawCircle(getXs()[(i6 * 2) + r2], getYs()[6 - i4], getHalfCellY(), this.f11368d0);
            }
        }
    }

    private final void h0(Canvas canvas) {
        int i4;
        int halfCellY = getHalfCellY() / 4;
        if (getRotateAll()) {
            canvas.save();
            canvas.rotate(180.0f, getSize() / 2.0f, getSize() / 2.0f);
            i4 = 26;
        } else {
            i4 = 0;
        }
        this.f11378n0.setColor(this.f11377m0.getColor());
        for (int i5 = 0; i5 < 7; i5++) {
            int i6 = i5 & 1;
            int i7 = (i6 ^ 1) + 3;
            for (int i8 = 0; i8 < i7; i8++) {
                float f4 = getXs()[(i8 * 2) + i6];
                float f5 = getYs()[6 - i5];
                i4 = getRotateAll() ? i4 - 1 : i4 + 1;
                canvas.drawText(String.valueOf(i4), f4, f5 + halfCellY, this.f11378n0);
            }
        }
        if (getRotateAll()) {
            canvas.restore();
        }
    }

    private final void i0(Canvas canvas) {
        Point point = new Point(getCellSizeX(), getCellSizeY());
        Point point2 = new Point(getHalfCellX(), getHalfCellY());
        int iP = getMode().p();
        if (iP == 20) {
            point.set(getCellSizeY() << 1, getCellSizeY() << 1);
            point2.set(getCellSizeY(), getCellSizeY());
        } else if (iP == 21) {
            point.set(getCellSizeX(), getCellSizeX());
            point2.set(getHalfCellX(), getHalfCellX());
        } else if (iP == 26) {
            point.set(getCellSizeY(), getCellSizeY());
            point2.set(getHalfCellY(), getHalfCellY());
        }
        for (C0843z.d dVar : this.f11351J) {
            PointF pointFI = i(dVar.b());
            pointFI.offset(-point2.x, -point2.y);
            Drawable drawableA = dVar.a();
            float f4 = pointFI.x;
            float f5 = pointFI.y;
            drawableA.setBounds((int) f4, (int) f5, (int) (f4 + point.x), (int) (f5 + point.y));
            dVar.a().draw(canvas);
        }
    }

    private final void j0(Canvas canvas) {
        canvas.drawColor(this.f11370f0);
        for (T2.l lVar : getLineGrid()) {
            canvas.drawLine(getXs()[((Point) lVar.c()).x], getYs()[((Point) lVar.c()).y], getXs()[((Point) lVar.d()).x], getYs()[((Point) lVar.d()).y], this.f11377m0);
        }
    }

    private final void k0(Canvas canvas) {
        this.f11382r0.set(getCellSizeX(), -getCellSizeY());
        this.f11383s0.set(((getMode().u() + 0.5f) * getHalfCellX()) + (getCellSizeX() * getMode().w()), (getSize() - (getHalfCellY() * (getMode().v() + 0.25f))) - (getCellSizeY() * getMode().x()));
        this.f11378n0.setColor(this.f11377m0.getColor());
        if (getRotateAll()) {
            this.f11382r0.negate();
            canvas.save();
            canvas.rotate(180.0f, getSize() / 2.0f, getSize() / 2.0f);
            this.f11381q0.set((getSize() - ((getMode().u() + 1) * getHalfCellX())) - (getCellSizeX() * getMode().w()), (getHalfCellY() * (getMode().v() + 1.25f)) + (getCellSizeY() * getMode().x()));
        } else {
            this.f11381q0.set(((getMode().u() + 1) * getHalfCellX()) + (getCellSizeX() * getMode().w()), (getSize() - (getHalfCellY() * (getMode().v() + 0.75f))) - (getCellSizeY() * getMode().x()));
        }
        int iS = getMode().s() - (getMode().w() << 1);
        int i4 = 0;
        for (int i5 = 0; i5 < iS; i5++) {
            canvas.drawText(String.valueOf((char) (i5 + 65)), this.f11381q0.x, this.f11383s0.y, this.f11378n0);
            this.f11381q0.x += this.f11382r0.x;
        }
        int iT = getMode().t() - (getMode().x() << 1);
        while (i4 < iT) {
            i4++;
            canvas.drawText(String.valueOf(i4), this.f11383s0.x, this.f11381q0.y, this.f11378n0);
            this.f11381q0.y += this.f11382r0.y;
        }
        if (getRotateAll()) {
            canvas.restore();
        }
    }

    private final void l0(Canvas canvas) {
        C0843z.g[] gVarArr = this.f11362U;
        int length = gVarArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            C0843z.g gVar = gVarArr[i4];
            int i6 = i5 + 1;
            K.c cVarB = gVar.b();
            if (cVarB != null) {
                this.f11379o0.setColor(gVar.a());
                int size = cVarB.d().size() - 1;
                int i7 = 0;
                while (i7 < size) {
                    this.f11379o0.setStyle(Paint.Style.STROKE);
                    String str = (String) cVarB.d().get(i7);
                    int i8 = i7 + 1;
                    String str2 = (String) cVarB.d().get(i8);
                    PointF pointFI = i(str);
                    PointF pointFI2 = i(str2);
                    this.f11380p0.reset();
                    this.f11380p0.moveTo(pointFI.x, pointFI.y);
                    Path path = this.f11380p0;
                    float f4 = pointFI.x;
                    float f5 = pointFI2.y;
                    C0843z.g[] gVarArr2 = gVarArr;
                    path.quadTo(f4, f5, pointFI2.x, f5);
                    canvas.drawPath(this.f11380p0, this.f11379o0);
                    if (i7 == cVarB.d().size() - 2) {
                        canvas.drawCircle(pointFI2.x, pointFI2.y, (((-i5) / 16.0f) + 0.6f) * getHalfCellX(), this.f11379o0);
                    }
                    this.f11379o0.setStyle(Paint.Style.FILL);
                    canvas.drawCircle(pointFI.x, pointFI.y, (((-i7) / 24.0f) + 0.3f) * getHalfCellX(), this.f11379o0);
                    i7 = i8;
                    gVarArr = gVarArr2;
                }
            }
            i4++;
            i5 = i6;
            gVarArr = gVarArr;
        }
    }

    private final void m0(Canvas canvas) {
        canvas.drawColor(this.f11370f0);
        float cellSizeX = getCellSizeX() * 5.0f;
        float cellSizeY = getCellSizeY() * 5.0f;
        int i4 = 0;
        while (i4 < 4) {
            float f4 = i4;
            float cellSizeX2 = getCellSizeX() * (1.0f + f4);
            float cellSizeY2 = getCellSizeY() * (f4 + 2.0f);
            Canvas canvas2 = canvas;
            canvas2.drawLine(cellSizeX2, getCellSizeY(), cellSizeX2, getCellSizeY() + cellSizeY, this.f11368d0);
            canvas2.drawLine(0.0f, cellSizeY2, cellSizeX, cellSizeY2, this.f11368d0);
            i4++;
            canvas = canvas2;
        }
    }

    private final void n0(Canvas canvas) {
        this.f11378n0.setColor(this.f11368d0.getColor());
        for (int i4 = 0; i4 < 5; i4++) {
            canvas.drawText(String.valueOf((char) (i4 + 65)), getXs()[i4], getSize() - getHalfCellY(), this.f11378n0);
        }
    }

    private final void o0(Canvas canvas) {
        canvas.drawColor(this.f11370f0);
        this.f11369e0.setStyle(Paint.Style.STROKE);
        this.f11369e0.setStrokeWidth(this.f11345D);
        float cellSizeX = getCellSizeX();
        float cellSizeX2 = getCellSizeX();
        if (Build.VERSION.SDK_INT >= 21) {
            canvas.drawRoundRect(cellSizeX, cellSizeX2, getSize() - cellSizeX, getSize() - cellSizeX2, getHalfCellX() * 0.5f, getHalfCellY() * 0.5f, this.f11369e0);
        } else {
            canvas.drawRect(cellSizeX, cellSizeX2, getSize() - cellSizeX, getSize() - cellSizeX2, this.f11369e0);
        }
        this.f11369e0.setStyle(Paint.Style.FILL);
    }

    private final void p0(Canvas canvas) {
        Iterator it = this.f11352K.iterator();
        while (it.hasNext()) {
            PointF pointFI = i((String) it.next());
            androidx.vectordrawable.graphics.drawable.o oVar = this.f11373i0;
            if (oVar != null) {
                oVar.setBounds((int) (pointFI.x - getPieceRadius()), (int) (pointFI.y - getPieceRadius()), (int) (pointFI.x + getPieceRadius()), (int) (pointFI.y + getPieceRadius()));
            }
            androidx.vectordrawable.graphics.drawable.o oVar2 = this.f11373i0;
            if (oVar2 != null) {
                oVar2.draw(canvas);
            }
        }
    }

    private final void q0(Canvas canvas) {
        this.f11378n0.setColor(-256);
        this.f11382r0.set(getCellSizeX(), -getCellSizeY());
        this.f11383s0.set(getCellSizeX(), getSize() - (getCellSizeY() * 2.94f));
        if (getRotateAll()) {
            this.f11382r0.negate();
            canvas.save();
            canvas.rotate(180.0f, getSize() / 2.0f, getSize() / 2.0f);
        }
        if (getRotateAll()) {
            this.f11381q0.set(getSize() - (getCellSizeX() * 1.5f), getHalfCellY());
        } else {
            this.f11381q0.set(getCellSizeX() * 1.5f, getSize() - getHalfCellY());
        }
        for (int i4 = 0; i4 < 9; i4++) {
            canvas.drawText(String.valueOf((char) (i4 + 65)), this.f11381q0.x, this.f11383s0.y, this.f11378n0);
            canvas.drawText(String.valueOf((char) (i4 + 49)), this.f11383s0.x, this.f11381q0.y, this.f11378n0);
            PointF pointF = this.f11381q0;
            float f4 = pointF.x;
            PointF pointF2 = this.f11382r0;
            pointF.x = f4 + pointF2.x;
            pointF.y += pointF2.y;
        }
        if (getRotateAll()) {
            canvas.restore();
        }
    }

    private final void r0(Canvas canvas) {
        int i4;
        this.f11382r0.set(getCellSizeX(), -getCellSizeY());
        if (getMode().q()) {
            this.f11383s0.set(getHalfCellX() / 2.0f, getSize() - (getHalfCellY() * 0.25f));
            this.f11378n0.setColor(this.f11368d0.getColor());
            i4 = 65;
        } else {
            this.f11383s0.set(getCellSizeX() / 8.0f, getSize() - (getCellSizeY() / 16.0f));
            i4 = 97;
        }
        if (getRotateAll()) {
            this.f11382r0.negate();
            canvas.save();
            canvas.rotate(180.0f, getSize() / 2.0f, getSize() / 2.0f);
        }
        if (getMode().q() && getRotateAll()) {
            this.f11381q0.set(getSize() - getCellSizeX(), getCellSizeY() * 1.125f);
        } else if (getRotateAll()) {
            this.f11381q0.set(getSize() - (getCellSizeX() * 0.875f), getCellSizeY() * 0.25f);
        } else if (getMode().q()) {
            this.f11381q0.set(getCellSizeX(), getSize() - (getCellSizeY() * 0.875f));
        } else {
            this.f11381q0.set(getCellSizeX() / 8.0f, getSize() - (getCellSizeY() * 0.75f));
        }
        int iS = getMode().s();
        for (int i5 = 0; i5 < iS; i5++) {
            canvas.drawText(String.valueOf((char) (i4 + i5)), this.f11381q0.x, this.f11383s0.y, this.f11378n0);
            canvas.drawText(String.valueOf((char) (i5 + 49)), this.f11383s0.x, this.f11381q0.y, this.f11378n0);
            PointF pointF = this.f11381q0;
            float f4 = pointF.x;
            PointF pointF2 = this.f11382r0;
            pointF.x = f4 + pointF2.x;
            pointF.y += pointF2.y;
        }
        if (getRotateAll()) {
            canvas.restore();
        }
        if (getMode().p() == 8) {
            canvas.drawCircle(getXs()[4], getYs()[4], getHalfCellX() * 0.25f, this.f11378n0);
        }
    }

    private final void s0(Canvas canvas) {
        this.f11378n0.setColor(-1);
        if (AbstractC0575m.a(getMode().p(), this.f11385u0)) {
            return;
        }
        if (getMode().p() == 15) {
            f0(canvas);
            return;
        }
        if (getMode().p() == 19) {
            M(canvas);
            return;
        }
        if (getMode().p() == 16) {
            w0(canvas);
            return;
        }
        if (getMode().p() == 17) {
            q0(canvas);
            return;
        }
        if (getMode().p() == 4) {
            h0(canvas);
            return;
        }
        if (getMode().p() == 20) {
            e0(canvas);
            return;
        }
        if (getMode().p() == 9) {
            L(canvas);
            return;
        }
        if (getMode().p() == 18) {
            n0(canvas);
            return;
        }
        if (getMode().p() == 23) {
            k0(canvas);
            return;
        }
        if (AbstractC0590i.q(new Integer[]{14, 22, 12, 13}, Integer.valueOf(getMode().p()))) {
            u0(canvas);
            return;
        }
        C0843z.h hVar = this.f11363V;
        if (hVar == C0843z.h.f11551e || hVar == C0843z.h.f11554h) {
            v0(canvas, hVar == C0843z.h.f11554h);
            return;
        }
        C0843z.h hVar2 = C0843z.h.f11550d;
        if (hVar == hVar2 && getMode().p() != 1) {
            r0(canvas);
        } else {
            if (this.f11363V == hVar2 || K()) {
                return;
            }
            O(canvas);
        }
    }

    private final void t0(Canvas canvas) {
        Canvas canvas2;
        canvas.drawColor(this.f11370f0);
        this.f11377m0.setFlags(1);
        this.f11377m0.setStrokeCap(Paint.Cap.ROUND);
        this.f11377m0.setStrokeWidth(getHalfCellY() * 0.5f);
        int size = this.f11359R.size() - 2;
        if (size >= 0) {
            int i4 = 0;
            while (true) {
                PointF pointFA = ((C0843z.k) this.f11359R.get(i4)).a();
                int i5 = i4 + 1;
                PointF pointFA2 = ((C0843z.k) this.f11359R.get(i5)).a();
                this.f11377m0.setColor(((Number) G0.a0.f1214a.b().get(i4 >> 1)).intValue());
                canvas2 = canvas;
                canvas2.drawLine(pointFA.x, pointFA.y, pointFA2.x, pointFA2.y, this.f11377m0);
                if (i4 == size) {
                    break;
                }
                i4 = i5;
                canvas = canvas2;
            }
        } else {
            canvas2 = canvas;
        }
        for (C0843z.k kVar : this.f11358Q) {
            float f4 = kVar.a().x;
            float f5 = kVar.a().y;
            int iSave = canvas2.save();
            canvas2.translate(f4, f5);
            try {
                Drawable drawable = this.f11376l0;
                if (drawable != null) {
                    drawable.setBounds(-getHalfCellY(), -getHalfCellY(), getHalfCellY(), getHalfCellY());
                }
                Drawable drawable2 = this.f11376l0;
                if (drawable2 != null) {
                    drawable2.draw(canvas2);
                }
                canvas2.restoreToCount(iSave);
            } catch (Throwable th) {
                canvas2.restoreToCount(iSave);
                throw th;
            }
        }
    }

    private final void u0(Canvas canvas) {
        this.f11382r0.set(getCellSizeX(), -getCellSizeY());
        this.f11383s0.set(((getMode().u() - 0.5f) * getHalfCellX()) + (getCellSizeX() * getMode().w()), (getSize() - (getHalfCellY() * (getMode().v() - 0.75f))) - (getCellSizeY() * getMode().x()));
        this.f11378n0.setColor(this.f11368d0.getColor());
        if (getRotateAll()) {
            this.f11382r0.negate();
            canvas.save();
            canvas.rotate(180.0f, getSize() / 2.0f, getSize() / 2.0f);
            this.f11381q0.set((getSize() - ((getMode().u() + 1) * getHalfCellX())) - (getCellSizeX() * getMode().w()), (getHalfCellY() * (getMode().v() + 1.25f)) + (getCellSizeY() * getMode().x()));
        } else {
            this.f11381q0.set(((getMode().u() + 1) * getHalfCellX()) + (getCellSizeX() * getMode().w()), (getSize() - (getHalfCellY() * (getMode().v() + 0.75f))) - (getCellSizeY() * getMode().x()));
        }
        int iS = getMode().s() - (getMode().w() << 1);
        int i4 = 0;
        for (int i5 = 0; i5 < iS; i5++) {
            canvas.drawText(String.valueOf((char) (i5 + 65)), this.f11381q0.x, this.f11383s0.y, this.f11378n0);
            this.f11381q0.x += this.f11382r0.x;
        }
        int iT = getMode().t() - (getMode().x() << 1);
        while (i4 < iT) {
            i4++;
            canvas.drawText(String.valueOf(i4), this.f11383s0.x, this.f11381q0.y, this.f11378n0);
            this.f11381q0.y += this.f11382r0.y;
        }
        if (getRotateAll()) {
            canvas.restore();
        }
    }

    private final void v0(Canvas canvas, boolean z4) {
        if (getRotateAll()) {
            canvas.save();
            canvas.rotate(180.0f, getSize() / 2.0f, getSize() / 2.0f);
        }
        for (int i4 = 0; i4 < 8; i4++) {
            for (int i5 = 0; i5 < 4; i5++) {
                int i6 = getXs()[(i5 * 2) + (i4 & 1)];
                int i7 = getYs()[7 - i4];
                int i8 = i4 * 4;
                int i9 = z4 ? i8 + i5 + 1 : (32 - i8) - i5;
                if (getRotateAll()) {
                    i9 = 33 - i9;
                }
                canvas.drawText(String.valueOf(i9), i6, i7 + (getHalfCellX() / 8), this.f11378n0);
            }
        }
        if (getRotateAll()) {
            canvas.restore();
        }
    }

    private final void w0(Canvas canvas) {
        this.f11378n0.setColor(-65536);
        this.f11382r0.set(getCellSizeX(), -getCellSizeY());
        this.f11383s0.set(getCellSizeX() * 0.8f, getSize() - (getCellSizeY() * 1.2f));
        if (getRotateAll()) {
            this.f11382r0.negate();
            canvas.save();
            canvas.rotate(180.0f, getSize() / 2.0f, getSize() / 2.0f);
        }
        if (getRotateAll()) {
            this.f11381q0.set(getSize() - (getCellSizeX() * 0.8f), getCellSizeY() * 0.4f);
        } else {
            this.f11381q0.set(getCellSizeX() * 1.2f, getSize() - (getCellSizeY() * 0.6f));
        }
        for (int i4 = 0; i4 < 9; i4++) {
            canvas.drawText(String.valueOf((char) (i4 + 65)), this.f11381q0.x, this.f11383s0.y, this.f11378n0);
            canvas.drawText(String.valueOf((char) (i4 + 49)), this.f11383s0.x, this.f11381q0.y, this.f11378n0);
            PointF pointF = this.f11381q0;
            float f4 = pointF.x;
            PointF pointF2 = this.f11382r0;
            pointF.x = f4 + pointF2.x;
            pointF.y += pointF2.y;
        }
        canvas.drawText("10", this.f11383s0.x, this.f11381q0.y, this.f11378n0);
        if (getRotateAll()) {
            canvas.restore();
        }
    }

    private final void x0(Canvas canvas) {
        this.f11379o0.setStyle(Paint.Style.STROKE);
        for (C0843z.n nVar : this.f11356O) {
            PointF pointFI = i(nVar.a());
            PointF pointFI2 = i(nVar.b());
            this.f11379o0.setColor(nVar.c());
            float f4 = 1;
            canvas.drawRect((pointFI.x - getHalfCellX()) + f4, (pointFI.y - getHalfCellY()) + f4, (pointFI2.x + getHalfCellX()) - f4, (pointFI2.y + getHalfCellY()) - f4, this.f11379o0);
        }
    }

    private final String y0(String str) {
        boolean zIsUpperCase = Character.isUpperCase(str.charAt(0));
        boolean z4 = getMode().m() == 1 || getMode().m() == 3;
        List list = zIsUpperCase ? this.f11364W : this.f11365a0;
        String strValueOf = (zIsUpperCase && z4) ? String.valueOf((char) (((char) (((char) (getMode().s() + 97)) - getMode().w())) - 1)) : z4 ? String.valueOf((char) (97 - getMode().w())) : zIsUpperCase ? String.valueOf(1 - m3.h.b(getMode().x(), 1)) : getMode().m() == 0 ? String.valueOf(getMode().t() + 1) : String.valueOf(getMode().t() - getMode().x());
        int iIndexOf = list.indexOf(Character.valueOf(str.charAt(0)));
        if (iIndexOf == -1) {
            iIndexOf = list.size();
        }
        if (z4) {
            return strValueOf + (iIndexOf + 1);
        }
        return ((char) (iIndexOf + 97)) + strValueOf;
    }

    @Override // cab.shashki.app.ui.custom.board.V
    protected void A() throws XmlPullParserException, Resources.NotFoundException, IOException {
        A0();
        w();
    }

    protected final int C0() {
        return this.f11372h0.size();
    }

    protected final void F0() {
        this.f11372h0 = U2.p.g();
        A0();
    }

    protected final String G0(String str, int i4) {
        String strB;
        Character chB0;
        h3.m.e(str, "pos");
        if (getMode().m() == 0) {
            return str;
        }
        N0.K k4 = N0.K.f2926a;
        if (k4.O(str) && !k4.P(str)) {
            return str;
        }
        o0.s sVar = this.f11350I;
        char cCharValue = (sVar == null || (strB = sVar.b()) == null || (chB0 = p3.n.B0(strB, i4)) == null) ? '-' : chB0.charValue();
        if (k4.P(str)) {
            char cCharAt = str.charAt(1);
            StringBuilder sb = new StringBuilder();
            sb.append(cCharValue);
            sb.append(cCharAt);
            return sb.toString();
        }
        int iS = getMode().s() - (getMode().w() << 1);
        int iT = getMode().t() - (getMode().x() << 1);
        int iCharAt = str.charAt(0) - '`';
        String strSubstring = str.substring(1);
        h3.m.d(strSubstring, "substring(...)");
        Integer numI = p3.n.i(strSubstring);
        int iIntValue = numI != null ? numI.intValue() : -1;
        if (1 <= iCharAt && iCharAt <= iS && 1 <= iIntValue && iIntValue <= iT) {
            return str;
        }
        if (getMode().m() != 3 || 1 > iCharAt || iCharAt > iS) {
            return cCharValue + "@";
        }
        return cCharValue + "#";
    }

    protected final boolean K() {
        return !h3.m.a(getMode().h(), "0");
    }

    protected final int getAmountOfPieces() {
        return this.f11342A;
    }

    protected final List<String> getBlocked() {
        return this.f11353L;
    }

    protected final Drawable getBoardDrawable() {
        return this.f11348G;
    }

    protected final List<T2.l> getBreaks() {
        return this.f11355N;
    }

    protected final o0.s getCollection() {
        return this.f11350I;
    }

    protected final Map<String, Integer> getCounter() {
        return this.f11360S;
    }

    protected final List<C0843z.b> getDynamicCells() {
        return this.f11357P;
    }

    protected final List<C0843z.k> getEdgeCells() {
        return this.f11359R;
    }

    protected final Paint getGridPaint() {
        return this.f11377m0;
    }

    protected final List<Character> getHandBlack() {
        return this.f11365a0;
    }

    protected final List<Character> getHandWhite() {
        return this.f11364W;
    }

    protected final List<C0843z.d> getLights() {
        return this.f11351J;
    }

    protected final C0843z.g[] getLines() {
        return this.f11362U;
    }

    protected final String getLoadedFile() {
        return this.f11347F;
    }

    protected final int getLoadedRes() {
        return this.f11346E;
    }

    protected final C0843z.j getMovedPiece() {
        return this.f11344C;
    }

    protected final C0843z.h getNumberSquares() {
        return this.f11363V;
    }

    protected final Paint getPaintCellBlack() {
        return this.f11369e0;
    }

    protected final Paint getPaintCellWhite() {
        return this.f11368d0;
    }

    protected final C0843z.j[] getPieces() {
        return this.f11349H;
    }

    protected final List<Character> getPrisonBlack() {
        return this.f11367c0;
    }

    protected final List<Character> getPrisonWhite() {
        return this.f11366b0;
    }

    protected final float getQuixoStrokeWidth() {
        return this.f11345D;
    }

    protected final List<String> getRemoved() {
        return this.f11352K;
    }

    protected final boolean getRotatePiece() {
        return this.f11386z;
    }

    protected final List<C0843z.k> getSomeCells() {
        return this.f11358Q;
    }

    protected final List<String> getSpins() {
        return this.f11354M;
    }

    protected final PointF getStartPlace() {
        return this.f11343B;
    }

    protected final boolean getSupportCount() {
        return this.f11361T;
    }

    protected final List<C0843z.n> getZones() {
        return this.f11356O;
    }

    @Override // cab.shashki.app.ui.custom.board.O
    protected PointF i(String str) {
        h3.m.e(str, "pos");
        N0.K k4 = N0.K.f2926a;
        if (k4.N(str)) {
            str = y0(str);
        } else if (k4.Q(str)) {
            str = D0(str);
        }
        return super.i(str);
    }

    @Override // cab.shashki.app.ui.custom.board.O
    protected String j(float f4, float f5) {
        return H0(this, super.j(f4, f5), 0, 2, null);
    }

    @Override // cab.shashki.app.ui.custom.board.V, cab.shashki.app.ui.custom.board.O
    protected void k() {
        super.k();
        getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.M
            @Override // java.lang.Runnable
            public final void run() throws XmlPullParserException, Resources.NotFoundException, IOException {
                N.B0(this.f11339d);
            }
        });
        this.f11378n0.setTextSize(getMode().p() != 20 ? getHalfCellX() / 2.0f : getHalfCellX());
        this.f11379o0.setStrokeWidth(getHalfCellX() / 12.0f);
        this.f11345D = getHalfCellX() / 4.0f;
    }

    protected final void setAmountOfPieces(int i4) {
        this.f11342A = i4;
    }

    protected final void setBlocked(List<String> list) {
        h3.m.e(list, "<set-?>");
        this.f11353L = list;
    }

    protected final void setBoardDrawable(Drawable drawable) {
        this.f11348G = drawable;
    }

    protected final void setBreaks(List<T2.l> list) {
        h3.m.e(list, "<set-?>");
        this.f11355N = list;
    }

    protected final void setCollection(o0.s sVar) {
        this.f11350I = sVar;
    }

    protected final void setCounter(Map<String, Integer> map) {
        h3.m.e(map, "<set-?>");
        this.f11360S = map;
    }

    protected final void setDynamicCells(List<C0843z.b> list) {
        h3.m.e(list, "<set-?>");
        this.f11357P = list;
    }

    protected final void setEdgeCells(List<C0843z.k> list) {
        h3.m.e(list, "<set-?>");
        this.f11359R = list;
    }

    protected final void setLights(List<C0843z.d> list) {
        h3.m.e(list, "<set-?>");
        this.f11351J = list;
    }

    protected final void setLoadedFile(String str) {
        h3.m.e(str, "<set-?>");
        this.f11347F = str;
    }

    protected final void setLoadedRes(int i4) {
        this.f11346E = i4;
    }

    protected final void setMovedPiece(C0843z.j jVar) {
        this.f11344C = jVar;
    }

    protected final void setNumberSquares(C0843z.h hVar) {
        h3.m.e(hVar, "<set-?>");
        this.f11363V = hVar;
    }

    protected final void setPieces(C0843z.j[] jVarArr) {
        h3.m.e(jVarArr, "<set-?>");
        this.f11349H = jVarArr;
    }

    protected final void setQuixoStrokeWidth(float f4) {
        this.f11345D = f4;
    }

    protected final void setRemoved(List<String> list) {
        h3.m.e(list, "<set-?>");
        this.f11352K = list;
    }

    protected final void setRotatePiece(boolean z4) {
        this.f11386z = z4;
    }

    protected final void setSomeCells(List<C0843z.k> list) {
        h3.m.e(list, "<set-?>");
        this.f11358Q = list;
    }

    protected final void setSpins(List<String> list) {
        h3.m.e(list, "<set-?>");
        this.f11354M = list;
    }

    protected final void setStartPlace(PointF pointF) {
        h3.m.e(pointF, "<set-?>");
        this.f11343B = pointF;
    }

    protected final void setSupportCount(boolean z4) {
        this.f11361T = z4;
    }

    @Override // cab.shashki.app.ui.custom.board.V
    protected void u(Canvas canvas) throws Throwable {
        h3.m.e(canvas, "c");
        if (getMode().p() == 0) {
            Drawable drawable = this.f11348G;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        if (this.f11348G != null || (getMode().i() <= 0 && h3.m.a(getMode().h(), "0"))) {
            if (getRotateAll()) {
                canvas.rotate(180.0f, getSize() / 2, getSize() / 2);
            }
            if (K()) {
                canvas.drawColor(this.f11370f0);
            }
            Drawable drawable2 = this.f11348G;
            if (drawable2 != null) {
                drawable2.draw(canvas);
            } else {
                N(canvas);
            }
            if (this.f11348G != null && getMode().i() == -1) {
                N(canvas);
            }
            s0(canvas);
            i0(canvas);
            Q(canvas);
        }
    }

    protected abstract boolean z0();
}