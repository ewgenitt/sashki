package cab.shashki.app.ui.custom.board;

import N0.AbstractC0575m;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import cab.shashki.app.ui.custom.board.C0843z;
import java.util.List;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public abstract class O extends ViewGroup {

    /* renamed from: r */
    public static final a f11392r = new a(null);

    /* renamed from: s */
    private static final String[] f11393s = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"};

    /* renamed from: b */
    private String f11394b;

    /* renamed from: c */
    private C0843z.c f11395c;

    /* renamed from: d */
    private int f11396d;

    /* renamed from: e */
    private int f11397e;

    /* renamed from: f */
    private int f11398f;

    /* renamed from: g */
    private int f11399g;

    /* renamed from: h */
    private int f11400h;

    /* renamed from: i */
    private int f11401i;

    /* renamed from: j */
    private int f11402j;

    /* renamed from: k */
    private int f11403k;

    /* renamed from: l */
    private final int[] f11404l;

    /* renamed from: m */
    private final int[] f11405m;

    /* renamed from: n */
    private List f11406n;

    /* renamed from: o */
    private int f11407o;

    /* renamed from: p */
    private int f11408p;

    /* renamed from: q */
    private final int f11409q;

    public static final class a {
        public /* synthetic */ a(h3.h hVar) {
            this();
        }

        public final boolean a(String str) {
            return str != null && new p3.j("[`_a-z]?-?\\d+").j(str);
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        h3.m.e(context, "context");
        h3.m.e(attributeSet, "attrs");
        this.f11394b = "GridView";
        this.f11395c = C0843z.f.f11546a.g(0);
        this.f11404l = new int[16];
        this.f11405m = new int[16];
        this.f11406n = U2.p.g();
        this.f11407o = this.f11395c.g();
        this.f11409q = AbstractC0575m.c(24, 22, 20, 23, 21, 25, 26);
    }

    private final void a() {
        int iG = this.f11396d / this.f11395c.g();
        this.f11402j = iG;
        this.f11401i = iG;
        int i4 = iG / 2;
        this.f11399g = i4;
        this.f11400h = i4;
        int i5 = (iG * 5) / 16;
        this.f11403k = i5;
        this.f11397e = (this.f11396d - i5) / 2;
    }

    private final void b() {
        int iT = this.f11396d / this.f11395c.t();
        this.f11402j = iT;
        int i4 = (int) (iT * 0.866f);
        this.f11401i = i4;
        this.f11399g = i4 / 2;
        this.f11400h = iT / 2;
        int i5 = (iT * 5) / 16;
        this.f11403k = i5;
        this.f11397e = (this.f11396d - i5) / 2;
    }

    private final void d() {
        int iT = this.f11396d / this.f11395c.t();
        this.f11402j = iT;
        int i4 = iT / 2;
        this.f11400h = i4;
        int i5 = (int) (iT * 0.6f);
        this.f11401i = i5;
        this.f11399g = i5 / 2;
        int i6 = (i4 * 7) / 8;
        this.f11403k = i6;
        int i7 = this.f11396d;
        this.f11397e = (i7 - i6) / 2;
        this.f11395c.K(((i7 / i5) - (r1.s() << 1)) + 1);
    }

    private final PointF e(String str) throws NumberFormatException {
        int i4 = Integer.parseInt(str);
        float f4 = 1;
        return new PointF(((((i4 & 127) - this.f11395c.w()) & 127) * this.f11401i) + (this.f11399g * (this.f11395c.u() + f4)), ((((i4 >> 7) - this.f11395c.x()) & 127) * this.f11402j) + (this.f11400h * (f4 + this.f11395c.v())));
    }

    private final String f(float f4, float f5) {
        float f6 = 1;
        return String.valueOf(((j3.a.b((f4 - (this.f11399g * (this.f11395c.u() + f6))) / this.f11401i) + this.f11395c.w()) & 127) | (((j3.a.b((f5 - (this.f11400h * (f6 + this.f11395c.v()))) / this.f11402j) + this.f11395c.x()) & 127) << 7));
    }

    private final PointF g(String str) throws NumberFormatException {
        int i4 = Integer.parseInt(str);
        float f4 = 1;
        return new PointF(((((i4 & 127) - this.f11395c.w()) & 127) * this.f11401i) + (this.f11399g * (this.f11395c.u() + f4)), (((((i4 >> 8) - this.f11395c.x()) & 63) + ((i4 & 1) * 0.5f)) * this.f11402j) + (this.f11400h * (f4 + this.f11395c.v())));
    }

    private final String h(float f4, float f5) {
        float f6 = 1;
        int iB = j3.a.b((f4 - (this.f11399g * (this.f11395c.u() + f6))) / this.f11401i) + this.f11395c.w();
        int i4 = iB & 127;
        int i5 = iB & 1;
        return String.valueOf((((((j3.a.b(((f5 - (this.f11400h * (f6 + this.f11395c.v()))) / this.f11402j) - (i5 * 0.5f)) + this.f11395c.x()) & 63) << 1) + i5) << 7) | i4);
    }

    private final PointF m(String str) {
        int iT = this.f11395c.t();
        String strSubstring = str.substring(1);
        h3.m.d(strSubstring, "substring(...)");
        int i4 = iT - Integer.parseInt(strSubstring);
        int iCharAt = str.charAt(0) - 'a';
        float f4 = 1;
        return new PointF((iCharAt * this.f11401i) + (this.f11399g * (f4 + this.f11395c.u())), (i4 * this.f11402j) + (this.f11400h * (this.f11395c.v() + f4)));
    }

    private final String n(float f4, float f5) {
        float f6 = 1;
        int iB = j3.a.b((f5 - (this.f11400h * (this.f11395c.v() + f6))) / this.f11402j);
        char cB = (char) ((j3.a.b((f4 - (this.f11399g * ((f6 + this.f11395c.u()) + (r0 << 1)))) / (this.f11401i << 1)) << 1) + ((this.f11395c.l() + iB + 1) & 1) + 97);
        int iT = this.f11395c.t() - iB;
        StringBuilder sb = new StringBuilder();
        sb.append(cB);
        sb.append(iT);
        return sb.toString();
    }

    protected final void c() {
        if (this.f11395c.p() == 21) {
            b();
            return;
        }
        if (this.f11395c.p() == 25) {
            a();
            return;
        }
        if (this.f11395c.p() == 26) {
            d();
            return;
        }
        float fFloatValue = ((Number) this.f11395c.j().o(Integer.valueOf(this.f11396d))).floatValue();
        float fFloatValue2 = ((Number) this.f11395c.k().o(Integer.valueOf(this.f11396d))).floatValue();
        this.f11401i = j3.a.b(fFloatValue);
        int iB = j3.a.b(fFloatValue2);
        this.f11402j = iB;
        this.f11399g = this.f11401i / 2;
        this.f11400h = iB / 2;
        int iP = this.f11395c.p();
        this.f11403k = iP != 10 ? iP != 17 ? iP != 20 ? (this.f11399g * 7) / 8 : (this.f11402j * 4) / 5 : (this.f11400h * 7) / 8 : this.f11399g;
        this.f11397e = (this.f11396d / 2) - (this.f11395c.q() ? this.f11403k : this.f11403k / 2);
        if (this.f11395c.p() == 20) {
            int iS = (this.f11395c.s() + this.f11395c.s()) - 1;
            for (int i4 = 0; i4 < iS; i4++) {
                this.f11404l[i4] = (this.f11396d >> 1) + ((this.f11401i + this.f11399g) * ((i4 - this.f11395c.s()) + 1));
                this.f11405m[i4] = (this.f11396d >> 1) + ((this.f11402j << 1) * ((this.f11395c.s() - i4) - 1));
            }
            while (iS < 16) {
                this.f11404l[iS] = 0;
                this.f11405m[iS] = 0;
                iS++;
            }
            return;
        }
        float f4 = 1;
        float fU = this.f11399g * (this.f11395c.u() + f4);
        float fV = this.f11400h * (f4 - this.f11395c.v());
        for (int i5 = 0; i5 < 16; i5++) {
            if (i5 < this.f11395c.s()) {
                this.f11404l[i5] = (int) ((i5 * fFloatValue) + fU);
            } else {
                this.f11404l[i5] = 0;
            }
            if (i5 < this.f11395c.t() + 1) {
                this.f11405m[i5] = (int) (((this.f11395c.t() - i5) * fFloatValue2) - fV);
            } else {
                this.f11405m[i5] = 0;
            }
        }
    }

    protected final int getBorder() {
        return this.f11397e;
    }

    protected final int getCellSizeX() {
        return this.f11401i;
    }

    protected final int getCellSizeY() {
        return this.f11402j;
    }

    protected final int getHalfCellX() {
        return this.f11399g;
    }

    protected final int getHalfCellY() {
        return this.f11400h;
    }

    protected final List<T2.l> getLineGrid() {
        return this.f11406n;
    }

    protected final int getMargin() {
        return this.f11408p;
    }

    protected final C0843z.c getMode() {
        return this.f11395c;
    }

    protected final int getPieceRadius() {
        return this.f11403k;
    }

    protected final int getSize() {
        return this.f11396d;
    }

    protected final String getTAG() {
        return this.f11394b;
    }

    protected final int getViewSize() {
        return this.f11398f;
    }

    protected final int[] getXs() {
        return this.f11404l;
    }

    protected final int[] getYs() {
        return this.f11405m;
    }

    protected PointF i(String str) {
        h3.m.e(str, "pos");
        if (this.f11395c.p() == 21) {
            return g(str);
        }
        if (this.f11395c.p() == 25) {
            return e(str);
        }
        if (this.f11395c.p() == 26) {
            return m(str);
        }
        int iCharAt = (str.charAt(0) - 'a') + this.f11395c.w();
        String strSubstring = str.substring(1);
        h3.m.d(strSubstring, "substring(...)");
        int i4 = (Integer.parseInt(strSubstring) - 1) + this.f11395c.x();
        float f4 = this.f11404l[iCharAt];
        float fAbs = i4 >= 0 ? this.f11405m[i4] : this.f11405m[0] - (i4 * this.f11402j);
        if (this.f11395c.p() == 20) {
            fAbs -= Math.abs((this.f11395c.s() - iCharAt) - 1) * this.f11402j;
        }
        return new PointF(f4, fAbs);
    }

    protected String j(float f4, float f5) {
        if (this.f11395c.p() == 21) {
            return h(f4, f5);
        }
        if (this.f11395c.p() == 25) {
            return f(f4, f5);
        }
        if (this.f11395c.p() == 26) {
            return n(f4, f5);
        }
        if (this.f11395c.p() != 20) {
            int iV = (((int) (f5 - (this.f11400h * this.f11395c.v()))) / this.f11402j) + this.f11395c.x();
            int iU = (((int) (f4 - (this.f11399g * this.f11395c.u()))) / this.f11401i) - this.f11395c.w();
            int iF = m3.h.f(iV, this.f11395c.x(), (this.f11395c.t() - 1) + this.f11395c.x());
            char cF = (char) (m3.h.f(iU, -this.f11395c.w(), (this.f11395c.s() - 1) - this.f11395c.w()) + 97);
            int iT = this.f11395c.t() - iF;
            StringBuilder sb = new StringBuilder();
            sb.append(cF);
            sb.append(iT);
            return sb.toString();
        }
        int iS = this.f11395c.s() + this.f11395c.s();
        int i4 = iS - 1;
        int i5 = iS - 2;
        int iF2 = m3.h.f((int) ((f4 - (this.f11401i * 2.125f)) / (r2 + this.f11399g)), 0, i5);
        int iAbs = Math.abs((this.f11395c.s() - 1) - iF2) + i4;
        int iF3 = m3.h.f((int) ((((f5 + (iAbs * r5)) - (this.f11396d * 0.5f)) / this.f11402j) / 2), 0, i5);
        return f11393s[iF2] + (i4 - iF3);
    }

    protected abstract void k();

    protected final void l(int i4, int i5) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int iMin = Math.min(i4, i5) - (this.f11408p * 2);
        int i6 = this.f11407o;
        int i7 = (iMin / i6) * i6;
        int i8 = (i4 - i7) / 2;
        int i9 = (i5 - i7) / 2;
        childAt.layout(i8, i9, i8 + i7, i9 + i7);
        this.f11398f = i7;
        if (this.f11396d == 0) {
            this.f11396d = i7;
        }
        c();
        k();
        Log.d(this.f11394b, "cell size " + this.f11401i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        if (!z4 || getChildCount() <= 0) {
            return;
        }
        l(i6 - i4, i7 - i5);
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int iResolveSize = View.resolveSize(getSuggestedMinimumWidth(), i4);
        int iResolveSize2 = View.resolveSize(getSuggestedMinimumHeight(), i5);
        setMeasuredDimension(iResolveSize, iResolveSize2);
        Log.d(this.f11394b, "onMeasure " + iResolveSize + "x" + iResolveSize2);
    }

    protected final void setBorder(int i4) {
        this.f11397e = i4;
    }

    protected final void setCellSizeX(int i4) {
        this.f11401i = i4;
    }

    protected final void setCellSizeY(int i4) {
        this.f11402j = i4;
    }

    public void setGridMode(C0843z.c cVar) {
        h3.m.e(cVar, "mode");
        if (this.f11395c.p() != cVar.p() || AbstractC0575m.a(cVar.p(), this.f11409q)) {
            this.f11395c = cVar;
            this.f11407o = cVar.g();
            this.f11406n = cVar.p() == 23 ? cVar.m() == 4 ? C0843z.f11502a.C(cVar.s(), cVar.t(), U2.p.g(), U2.p.g()) : C0843z.f11502a.k0(cVar.s(), cVar.t(), U2.p.g(), U2.p.g()) : U2.p.g();
            l(getWidth(), getHeight());
        }
    }

    protected final void setHalfCellX(int i4) {
        this.f11399g = i4;
    }

    protected final void setHalfCellY(int i4) {
        this.f11400h = i4;
    }

    protected final void setLineGrid(List<? extends T2.l> list) {
        h3.m.e(list, "<set-?>");
        this.f11406n = list;
    }

    protected final void setMargin(int i4) {
        this.f11408p = i4;
    }

    protected final void setMode(C0843z.c cVar) {
        h3.m.e(cVar, "<set-?>");
        this.f11395c = cVar;
    }

    protected final void setPieceRadius(int i4) {
        this.f11403k = i4;
    }

    protected final void setSize(int i4) {
        this.f11396d = i4;
    }

    protected final void setTAG(String str) {
        h3.m.e(str, "<set-?>");
        this.f11394b = str;
    }

    protected final void setViewSize(int i4) {
        this.f11398f = i4;
    }
}