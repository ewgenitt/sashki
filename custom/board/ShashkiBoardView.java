package cab.shashki.app.ui.custom.board;

import N0.C0574l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import cab.shashki.app.db.entities.HalmaParams;
import cab.shashki.app.ui.custom.board.C0843z;
import cab.shashki.app.ui.custom.board.O;
import f0.AbstractC0890F;
import f0.AbstractC0918v;
import g3.InterfaceC1005a;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@SuppressLint({"DefaultLocale"})
/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class ShashkiBoardView extends O0 {

    /* renamed from: H0 */
    private W f11419H0;

    /* renamed from: I0 */
    private int f11420I0;

    private static final class a {

        /* renamed from: a */
        private final C0843z.j f11421a;

        /* renamed from: b */
        private final PointF f11422b;

        /* renamed from: c */
        private final PointF f11423c;

        /* renamed from: d */
        private final String f11424d;

        public a(C0843z.j jVar, PointF pointF, PointF pointF2, String str) {
            h3.m.e(jVar, "piece");
            h3.m.e(pointF, "from");
            h3.m.e(pointF2, "to");
            h3.m.e(str, "pos");
            this.f11421a = jVar;
            this.f11422b = pointF;
            this.f11423c = pointF2;
            this.f11424d = str;
        }

        public final PointF a() {
            return this.f11422b;
        }

        public final C0843z.j b() {
            return this.f11421a;
        }

        public final String c() {
            return this.f11424d;
        }

        public final PointF d() {
            return this.f11423c;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShashkiBoardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        h3.m.e(context, "context");
        h3.m.e(attributeSet, "attrs");
    }

    public static final void E2(ShashkiBoardView shashkiBoardView) {
        shashkiBoardView.setAmountOfPieces(0);
        for (C0843z.j jVar : shashkiBoardView.getPieces()) {
            jVar.k(false);
        }
        for (C0843z.g gVar : shashkiBoardView.getLines()) {
            gVar.d(null);
        }
        shashkiBoardView.getZones().clear();
        shashkiBoardView.getLights().clear();
        shashkiBoardView.getRemoved().clear();
        shashkiBoardView.getCounter().clear();
        shashkiBoardView.w();
    }

    private final void F2() {
        setAmountOfPieces(0);
        for (C0843z.j jVar : getPieces()) {
            jVar.k(false);
        }
        for (C0843z.g gVar : getLines()) {
            gVar.d(null);
        }
        getZones().clear();
        getLights().clear();
        getDynamicCells().clear();
        getRemoved().clear();
        getCounter().clear();
        getHandWhite().clear();
        getHandBlack().clear();
        getPrisonWhite().clear();
        getPrisonBlack().clear();
    }

    public static /* synthetic */ void H2(ShashkiBoardView shashkiBoardView, String str, String str2, boolean z4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z4 = true;
        }
        shashkiBoardView.G2(str, str2, z4);
    }

    public static final void I2(String str, String str2, ShashkiBoardView shashkiBoardView, boolean z4) {
        C0843z.j jVar;
        N0.K k4 = N0.K.f2926a;
        if (k4.P(str) && k4.O(str2)) {
            char cCharAt = str2.charAt(0);
            char cCharAt2 = str.charAt(1);
            StringBuilder sb = new StringBuilder();
            sb.append(cCharAt);
            sb.append(cCharAt2);
            str = sb.toString();
        }
        PointF pointFI = shashkiBoardView.i(str);
        int cellSizeY = shashkiBoardView.getCellSizeY();
        o0.s collection = shashkiBoardView.getCollection();
        int cellSizeY2 = cellSizeY + ((collection == null || !collection.e()) ? 0 : shashkiBoardView.getCellSizeY());
        C0843z.j[] pieces = shashkiBoardView.getPieces();
        int length = pieces.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                jVar = null;
                break;
            }
            jVar = pieces[i4];
            if (jVar.f() && h3.m.a(jVar.getPosition(), str2)) {
                break;
            } else {
                i4++;
            }
        }
        if (jVar == null) {
            if (!N0.K.f2926a.O(str2)) {
                List<C0843z.b> dynamicCells = shashkiBoardView.getDynamicCells();
                if (androidx.activity.B.a(dynamicCells) && dynamicCells.isEmpty()) {
                    return;
                }
                Iterator<T> it = dynamicCells.iterator();
                while (it.hasNext()) {
                    if (h3.m.a(((C0843z.b) it.next()).b(), str2)) {
                    }
                }
                return;
            }
            shashkiBoardView.c2(str2, str);
            return;
        }
        PointF pointF = new PointF(((PointF) jVar).x, ((PointF) jVar).y);
        int i5 = shashkiBoardView.f11420I0 - 1;
        for (int i6 = 0; i6 < i5; i6++) {
            float f4 = i6;
            float f5 = pointFI.x * f4;
            int i7 = shashkiBoardView.f11420I0;
            jVar.set((f5 + ((i7 - i6) * pointF.x)) / i7, ((f4 * pointFI.y) + ((i7 - i6) * pointF.y)) / i7);
            shashkiBoardView.x(((int) ((PointF) jVar).x) - shashkiBoardView.getCellSizeX(), (((int) ((PointF) jVar).y) - cellSizeY2) - shashkiBoardView.getCellSizeY(), ((int) ((PointF) jVar).x) + shashkiBoardView.getCellSizeX(), ((int) ((PointF) jVar).y) + cellSizeY2);
        }
        jVar.set(pointFI);
        if (z4 && shashkiBoardView.c2(str2, str)) {
            jVar.set(pointF);
        } else {
            if (!h3.m.a(str2, str)) {
                shashkiBoardView.o1(str);
            }
            jVar.i(str);
            shashkiBoardView.R1();
        }
        shashkiBoardView.w();
        shashkiBoardView.setMovedPiece(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0055, code lost:
    
        r2.add(new cab.shashki.app.ui.custom.board.ShashkiBoardView.a(r10, r17.i((java.lang.String) r6.getKey()), r17.i((java.lang.String) r6.getValue()), (java.lang.String) r6.getValue()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void K2(cab.shashki.app.ui.custom.board.ShashkiBoardView r17, java.util.Map r18) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cab.shashki.app.ui.custom.board.ShashkiBoardView.K2(cab.shashki.app.ui.custom.board.ShashkiBoardView, java.util.Map):void");
    }

    public static final void M2(ShashkiBoardView shashkiBoardView, int i4) {
        for (C0843z.j jVar : shashkiBoardView.getPieces()) {
            if (jVar.a() == i4 && jVar.f()) {
                jVar.k(false);
                shashkiBoardView.setAmountOfPieces(shashkiBoardView.getAmountOfPieces() - 1);
                shashkiBoardView.getAmountOfPieces();
            }
        }
        shashkiBoardView.R1();
        shashkiBoardView.w();
    }

    public static final void N2(ShashkiBoardView shashkiBoardView, Iterable iterable) {
        shashkiBoardView.F2();
        boolean zL0 = C0843z.f11502a.l0(shashkiBoardView.getMode());
        if (zL0) {
            if (shashkiBoardView.getMode().p() == 21) {
                C0574l.f2981a.h(iterable, shashkiBoardView.getMode());
            } else {
                C0574l.f2981a.e(iterable, shashkiBoardView.getMode());
            }
            shashkiBoardView.c();
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C0843z.i iVar = (C0843z.i) it.next();
            if (shashkiBoardView.getAmountOfPieces() < 128) {
                if (zL0) {
                    shashkiBoardView.getDynamicCells().add(new C0843z.b(iVar.getPosition(), iVar.d(), shashkiBoardView.i(iVar.getPosition())));
                }
                if (iVar.a() >= 0 && iVar.a() != 128) {
                    shashkiBoardView.f1(iVar.getPosition(), iVar.a(), iVar.b(), shashkiBoardView.getSupportCount());
                }
            }
        }
        shashkiBoardView.w();
    }

    public static final void Q2(List list, ShashkiBoardView shashkiBoardView, String str, int i4) {
        C0843z.j jVar;
        C0843z.j jVar2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            C0843z.j[] pieces = shashkiBoardView.getPieces();
            int length = pieces.length;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                jVar = null;
                if (i6 >= length) {
                    jVar2 = null;
                    break;
                }
                jVar2 = pieces[i6];
                if (jVar2.f() && h3.m.a(jVar2.getPosition(), str2)) {
                    break;
                } else {
                    i6++;
                }
            }
            if (jVar2 != null) {
                jVar2.h(str);
                jVar2.j(i4);
            } else {
                C0843z.j[] pieces2 = shashkiBoardView.getPieces();
                int length2 = pieces2.length;
                while (true) {
                    if (i5 >= length2) {
                        break;
                    }
                    C0843z.j jVar3 = pieces2[i5];
                    if (!jVar3.f()) {
                        jVar = jVar3;
                        break;
                    }
                    i5++;
                }
                if (jVar != null) {
                    jVar.i(str2);
                    jVar.h(str);
                    jVar.j(i4);
                    jVar.set(shashkiBoardView.i(str2));
                    jVar.k(true);
                    shashkiBoardView.setAmountOfPieces(shashkiBoardView.getAmountOfPieces() + 1);
                }
                T2.u uVar = T2.u.f3817a;
            }
        }
        shashkiBoardView.R1();
        shashkiBoardView.w();
    }

    public static final void R2(ShashkiBoardView shashkiBoardView, o0.x xVar) {
        shashkiBoardView.setRotatePiece(!xVar.c());
        shashkiBoardView.R1();
        shashkiBoardView.F0();
        shashkiBoardView.w();
    }

    public static final void S2(String str, ShashkiBoardView shashkiBoardView) {
        N0.K k4 = N0.K.f2926a;
        o0.s collection = shashkiBoardView.getCollection();
        h3.m.b(collection);
        Iterable<C0843z.i> iterableB = k4.B(str, collection, shashkiBoardView.getMode());
        boolean zL0 = C0843z.f11502a.l0(shashkiBoardView.getMode());
        shashkiBoardView.F2();
        if (zL0) {
            if (shashkiBoardView.getMode().p() == 21) {
                C0574l.f2981a.h(iterableB, shashkiBoardView.getMode());
            } else {
                C0574l.f2981a.e(iterableB, shashkiBoardView.getMode());
            }
            shashkiBoardView.c();
        }
        for (C0843z.i iVar : iterableB) {
            if (zL0) {
                shashkiBoardView.getDynamicCells().add(new C0843z.b(iVar.getPosition(), iVar.d(), shashkiBoardView.i(iVar.getPosition())));
            }
            if (iVar.a() != 128) {
                shashkiBoardView.f1(iVar.getPosition(), iVar.a(), iVar.b(), shashkiBoardView.getSupportCount());
            }
        }
        shashkiBoardView.setAddPieceMode(-2);
        shashkiBoardView.R1();
        shashkiBoardView.w();
    }

    public static final void U2(InterfaceC1005a interfaceC1005a) {
        interfaceC1005a.a();
    }

    public static final void W2(ShashkiBoardView shashkiBoardView) {
        shashkiBoardView.w();
    }

    public static final void setBoard$lambda$2(ShashkiBoardView shashkiBoardView) {
        shashkiBoardView.F0();
        shashkiBoardView.w();
    }

    private final void setCollection(final o0.x xVar) {
        if (!h3.m.a(getCollection(), xVar) || (xVar instanceof o0.K)) {
            setCollection((o0.s) xVar);
            C0843z.f.f11546a.g(1).C(h3.m.a(xVar.getName(), "snow") ? AbstractC0918v.P7 : AbstractC0918v.f14712R);
            getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.w0
                @Override // java.lang.Runnable
                public final void run() {
                    ShashkiBoardView.R2(this.f11496d, xVar);
                }
            });
        }
    }

    public final void D2() {
        getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.y0
            @Override // java.lang.Runnable
            public final void run() {
                ShashkiBoardView.E2(this.f11501d);
            }
        });
    }

    public final void G2(final String str, final String str2, final boolean z4) {
        h3.m.e(str, "from");
        h3.m.e(str2, "target");
        O.a aVar = O.f11392r;
        if (aVar.a(str2) || N0.K.f2926a.O(str2)) {
            if (aVar.a(str) || N0.K.f2926a.O(str)) {
                getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.B0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ShashkiBoardView.I2(str2, str, this, z4);
                    }
                });
            }
        }
    }

    public final void J2(final Map map) {
        h3.m.e(map, "paths");
        getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.A0
            @Override // java.lang.Runnable
            public final void run() {
                ShashkiBoardView.K2(this.f11308d, map);
            }
        });
    }

    public final void L2(final int i4) {
        getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.z0
            @Override // java.lang.Runnable
            public final void run() {
                ShashkiBoardView.M2(this.f11569d, i4);
            }
        });
    }

    public final void O2(String str, C0843z.c cVar) {
        h3.m.e(str, "type");
        h3.m.e(cVar, "mode");
        if (h3.m.a(cVar.h(), str)) {
            return;
        }
        cVar.B(str);
        if (h3.m.a(cVar, getMode())) {
            getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.x0
                @Override // java.lang.Runnable
                public final void run() {
                    ShashkiBoardView.setBoard$lambda$2(this.f11499d);
                }
            });
        }
    }

    public final void P2(final List list, final int i4, final String str) {
        h3.m.e(list, "positions");
        getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.u0
            @Override // java.lang.Runnable
            public final void run() {
                ShashkiBoardView.Q2(list, this, str, i4);
            }
        });
    }

    public final void T2(final InterfaceC1005a interfaceC1005a) {
        h3.m.e(interfaceC1005a, "action");
        getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.D0
            @Override // java.lang.Runnable
            public final void run() {
                ShashkiBoardView.U2(interfaceC1005a);
            }
        });
    }

    public final void V2() {
        getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.C0
            @Override // java.lang.Runnable
            public final void run() {
                ShashkiBoardView.W2(this.f11315d);
            }
        });
    }

    public final void X2() {
        o0.x xVarJ;
        W w4 = this.f11419H0;
        if (w4 == null || (xVarJ = w4.J()) == null) {
            return;
        }
        setCollection(xVarJ);
    }

    @Override // cab.shashki.app.ui.custom.board.O0
    protected boolean c2(String str, String str2) {
        h3.m.e(str, HalmaParams.START);
        h3.m.e(str2, "finish");
        W w4 = this.f11419H0;
        boolean z4 = false;
        if (w4 != null && w4.j(this, str, str2)) {
            z4 = true;
        }
        return !z4;
    }

    @Override // cab.shashki.app.ui.custom.board.O0
    protected void m2(String str) {
        h3.m.e(str, "position");
        W w4 = this.f11419H0;
        if (w4 != null) {
            w4.h(this, str);
        }
    }

    @Override // cab.shashki.app.ui.custom.board.O0
    protected void n2(C0843z.i iVar) {
        h3.m.e(iVar, "piece");
        W w4 = this.f11419H0;
        if (w4 != null) {
            w4.w(this, iVar);
        }
    }

    public final void set(final Iterable<? extends C0843z.i> iterable) {
        h3.m.e(iterable, "combination");
        getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.v0
            @Override // java.lang.Runnable
            public final void run() {
                ShashkiBoardView.N2(this.f11494d, iterable);
            }
        });
    }

    public final void setBoard(String str) {
        h3.m.e(str, "type");
        O2(str, C0843z.f.f11546a.g(1));
    }

    public final void setListener(W w4) {
        this.f11419H0 = w4;
        if (w4 != null) {
            setCollection(w4.J());
        }
    }

    public final void setPosition(final String str) {
        h3.m.e(str, "position");
        getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.t0
            @Override // java.lang.Runnable
            public final void run() {
                ShashkiBoardView.S2(str, this);
            }
        });
    }

    public final void setSmooth(int i4) {
        this.f11420I0 = i4;
    }

    @Override // cab.shashki.app.ui.custom.board.N
    protected boolean z0() {
        File file;
        if (!K()) {
            return false;
        }
        if (h3.m.a(getLoadedFile(), getMode().h())) {
            Drawable boardDrawable = getBoardDrawable();
            if (boardDrawable != null) {
                boardDrawable.setBounds(0, 0, getSize(), getSize());
            }
            return true;
        }
        if (p3.n.m0(getMode().h(), '/', false, 2, null)) {
            file = new File(getMode().h());
        } else {
            File filesDir = getContext().getFilesDir();
            if (filesDir == null) {
                return false;
            }
            file = new File(new File(filesDir, "board"), getMode().h());
        }
        if (!file.exists()) {
            return false;
        }
        C0843z c0843z = C0843z.f11502a;
        Context context = getContext();
        h3.m.d(context, "getContext(...)");
        setBoardDrawable(c0843z.m0(context, p3.n.n(getMode().h(), ".svg", false, 2, null), file));
        Drawable boardDrawable2 = getBoardDrawable();
        if (boardDrawable2 != null) {
            boardDrawable2.setBounds(0, 0, getSize(), getSize());
        }
        setLoadedFile(getMode().h());
        return true;
    }

    public /* synthetic */ ShashkiBoardView(Context context, AttributeSet attributeSet, int i4, int i5, h3.h hVar) {
        this(context, attributeSet, (i5 & 4) != 0 ? 0 : i4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShashkiBoardView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        h3.m.e(context, "context");
        h3.m.e(attributeSet, "attrs");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0890F.f14585a);
        h3.m.d(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        setFix(typedArrayObtainStyledAttributes.getBoolean(AbstractC0890F.f14586b, false));
        this.f11420I0 = typedArrayObtainStyledAttributes.getInt(AbstractC0890F.f14588d, 16);
        setMargin(typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC0890F.f14587c, 0));
        setRotate(typedArrayObtainStyledAttributes.getBoolean(AbstractC0890F.f14589e, false));
        typedArrayObtainStyledAttributes.recycle();
        setAddPieceMode(-2);
        setTAG("BoardView");
    }
}