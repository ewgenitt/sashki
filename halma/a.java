package cab.shashki.app.ui.halma;

import G0.a0;
import H0.y;
import T2.u;
import cab.shashki.app.db.entities.HalmaParams;
import cab.shashki.app.ui.custom.board.C0843z;
import cab.shashki.app.ui.custom.board.ShashkiBoardView;
import cab.shashki.app.ui.custom.board.W;
import cab.shashki.app.ui.halma.b;
import f0.AbstractC0888D;
import f0.AbstractC0909m;
import g3.InterfaceC1005a;
import g3.InterfaceC1016l;
import h3.m;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import m3.g;
import m3.h;
import o0.C1218E;
import o0.x;
import p3.n;
import q0.C1297v;
import x2.AbstractC1488f;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class a extends AbstractC0909m implements W {

    /* renamed from: d, reason: collision with root package name */
    private final int f11591d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f11592e;

    /* renamed from: k, reason: collision with root package name */
    private HalmaParams f11598k;

    /* renamed from: l, reason: collision with root package name */
    private int f11599l;

    /* renamed from: n, reason: collision with root package name */
    private String f11601n;

    /* renamed from: o, reason: collision with root package name */
    private String f11602o;

    /* renamed from: f, reason: collision with root package name */
    private final List f11593f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final Set f11594g = new LinkedHashSet();

    /* renamed from: h, reason: collision with root package name */
    private final StringBuilder f11595h = new StringBuilder();

    /* renamed from: i, reason: collision with root package name */
    private final Map f11596i = new LinkedHashMap();

    /* renamed from: j, reason: collision with root package name */
    private final int f11597j = 2;

    /* renamed from: m, reason: collision with root package name */
    private b.a f11600m = b.a.f11603d;

    public a(int i4, boolean z4) {
        C1297v c1297v;
        HalmaParams halmaParamsI;
        this.f11591d = i4;
        this.f11592e = z4;
        this.f11598k = new HalmaParams(0, null, 0, 0, 0, 0, null, false, false, 511, null);
        String strB = y.f1438a.b(AbstractC0888D.z6);
        this.f11601n = strB == null ? "w" : strB;
        if (i4 >= 0 && (halmaParamsI = (c1297v = C1297v.f19095a).i(String.valueOf(i4))) != null) {
            this.f11598k = HalmaParams.copy$default(halmaParamsI, 0, null, 0, 0, 0, 0, null, false, false, 511, null);
            if (z4) {
                Long lValueOf = Long.valueOf(c1297v.e(i4));
                lValueOf = lValueOf.longValue() <= 0 ? null : lValueOf;
                if (lValueOf != null) {
                    this.f11602o = new SimpleDateFormat("d MMMM HH:mm:ss").format(new Date(lValueOf.longValue()));
                }
            }
        }
        if (this.f11598k.getStart() != -1) {
            P0();
        }
        if (i4 >= 0) {
            k1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u F0(a aVar, String str) {
        aVar.f11594g.add(str);
        aVar.k1();
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u G0(a aVar) {
        b bVar = (b) aVar.w0();
        if (bVar != null) {
            bVar.d();
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u H0(a aVar, String str) {
        if (!aVar.f11593f.contains(str)) {
            aVar.f11593f.add(str);
            aVar.k1();
        }
        return u.f3817a;
    }

    private final void P0() {
        for (int i4 = 0; i4 < 5; i4++) {
            int i5 = 0;
            while (i5 < 5) {
                int i6 = 1 << ((i5 * 5) + i4);
                StringBuilder sbF = n.f(this.f11595h);
                sbF.append((char) (i4 + 97));
                i5++;
                sbF.append(i5);
                this.f11596i.put(this.f11595h.toString(), Integer.valueOf(i6));
                if ((i6 & this.f11598k.getStart()) != 0) {
                    List list = this.f11593f;
                    String string = this.f11595h.toString();
                    m.d(string, "toString(...)");
                    list.add(string);
                }
            }
        }
        BigInteger lockMask = this.f11598k.getLockMask();
        while (!m.a(lockMask, BigInteger.ZERO)) {
            int lowestSetBit = lockMask.getLowestSetBit();
            int size = lowestSetBit / this.f11598k.getSize();
            int size2 = lowestSetBit % this.f11598k.getSize();
            Set set = this.f11594g;
            int height = this.f11598k.getHeight() - size;
            StringBuilder sb = new StringBuilder();
            sb.append((char) (size2 + 97));
            sb.append(height);
            set.add(sb.toString());
            lockMask = lockMask.clearBit(lowestSetBit);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u U0(a aVar) {
        C1297v.m(C1297v.f19095a, aVar.f11598k, null, 2, null);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u V0(a aVar, u uVar) {
        b bVar = (b) aVar.w0();
        if (bVar != null) {
            bVar.finish();
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u W0(a aVar) {
        aVar.k1();
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u X0(a aVar, String str) {
        if (aVar.f11593f.remove(str) || aVar.f11594g.remove(str)) {
            aVar.k1();
        }
        return u.f3817a;
    }

    private final void k1() {
        if (this.f11598k.isStern()) {
            this.f11601n = a0.f1214a.d(this.f11598k.getSize());
            b bVar = (b) w0();
            if (bVar != null) {
                bVar.p();
                return;
            }
            return;
        }
        Iterator it = this.f11593f.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            Integer num = (Integer) this.f11596i.get((String) it.next());
            iIntValue |= num != null ? num.intValue() : 0;
        }
        this.f11598k.setStart(iIntValue);
        n.f(this.f11595h);
        int size = this.f11598k.getSize() * this.f11598k.getHeight();
        for (int i4 = 0; i4 < size; i4++) {
            this.f11595h.append('.');
        }
        this.f11595h.append('w');
        for (String str : this.f11594g) {
            int size2 = this.f11598k.getSize();
            int height = this.f11598k.getHeight();
            m.d(str.substring(1), "substring(...)");
            this.f11595h.setCharAt(((size2 * (height - Integer.parseInt(r5))) + str.charAt(0)) - 97, 'l');
        }
        int size3 = this.f11598k.getSize();
        int height2 = this.f11598k.getHeight();
        int i5 = (size3 * height2) - 1;
        for (int i6 = 0; i6 < 25; i6++) {
            if (((1 << i6) & iIntValue) != 0) {
                int i7 = i6 % 5;
                int i8 = i6 / 5;
                int i9 = height2 - 1;
                int i10 = ((i9 - i8) * size3) + i7;
                this.f11595h.setCharAt(i10, 'w');
                this.f11595h.setCharAt(i5 - i10, 'b');
                if (this.f11598k.getFourPlayers()) {
                    int i11 = ((((i9 - i7) * size3) + size3) - 1) - i8;
                    this.f11595h.setCharAt(i11, 'x');
                    this.f11595h.setCharAt(i5 - i11, 'y');
                }
            }
        }
        this.f11601n = this.f11595h.toString();
        b bVar2 = (b) w0();
        if (bVar2 != null) {
            bVar2.p();
        }
    }

    private final boolean l1(String str) throws NumberFormatException {
        int iCharAt = str.charAt(0) - 'a';
        String strSubstring = str.substring(1);
        m.d(strSubstring, "substring(...)");
        int i4 = Integer.parseInt(strSubstring);
        int iC = h.c(this.f11598k.getSize(), this.f11598k.getHeight()) >> 1;
        return iCharAt >= 5 || i4 > 5 || iCharAt >= iC || i4 > iC;
    }

    public void E0(b bVar) {
        m.e(bVar, "view");
        super.q0(bVar);
        b bVar2 = (b) w0();
        if (bVar2 != null) {
            bVar2.m(Y0());
        }
        b bVar3 = (b) w0();
        if (bVar3 != null) {
            bVar3.r(this.f11599l);
        }
        b bVar4 = (b) w0();
        if (bVar4 != null) {
            bVar4.k(this.f11599l < this.f11597j);
        }
    }

    public final void I0() {
        this.f11593f.clear();
        this.f11594g.clear();
        k1();
    }

    @Override // cab.shashki.app.ui.custom.board.W
    public x J() {
        return this.f11598k.isStern() ? C1218E.f18139a.t() : C1218E.f18139a.s();
    }

    public final boolean J0() {
        return this.f11598k.getDiagonal();
    }

    public final boolean K0() {
        return this.f11598k.getFourPlayers();
    }

    public final b.a L0() {
        return this.f11600m;
    }

    public final String M0() {
        return this.f11602o;
    }

    public final C0843z.c N0() {
        return this.f11598k.isStern() ? C0843z.f11502a.f0(this.f11598k.getSize()) : C0843z.f11502a.h0(this.f11598k);
    }

    public final int O0() {
        return this.f11598k.getHeight();
    }

    public final boolean Q0() {
        return this.f11598k.isStern();
    }

    public final int R0() {
        return this.f11598k.getOutMoves();
    }

    public final String S0() {
        return this.f11598k.getName();
    }

    public final void T0() {
        if (this.f11599l != this.f11597j) {
            b bVar = (b) w0();
            if (bVar != null) {
                bVar.r(this.f11599l + 1);
                return;
            }
            return;
        }
        if (Y0()) {
            b bVar2 = (b) w0();
            if (bVar2 != null) {
                bVar2.finish();
                return;
            }
            return;
        }
        if (this.f11598k.getStart() == 0) {
            b bVar3 = (b) w0();
            if (bVar3 != null) {
                bVar3.p0();
                return;
            }
            return;
        }
        BigInteger bit = BigInteger.ZERO;
        String str = this.f11601n;
        int i4 = 0;
        int i5 = 0;
        while (i4 < str.length()) {
            int i6 = i5 + 1;
            if (str.charAt(i4) == 'l') {
                bit = bit.setBit(i5);
            }
            i4++;
            i5 = i6;
        }
        this.f11598k.setLockMask(bit);
        if (this.f11598k.isStern()) {
            this.f11598k.setDiagonal(false);
            this.f11598k.setFourPlayers(false);
        }
        AbstractC1488f abstractC1488fH = AbstractC1488f.q(new Callable() { // from class: G0.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cab.shashki.app.ui.halma.a.U0(this.f1213d);
            }
        }).H(S2.a.c());
        m.d(abstractC1488fH, "subscribeOn(...)");
        c0(abstractC1488fH, new InterfaceC1016l() { // from class: G0.b
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.halma.a.V0(this.f1224d, (T2.u) obj);
            }
        });
    }

    public final boolean Y0() {
        return this.f11591d >= 0 && this.f11592e;
    }

    public final void Z0(b.a aVar) {
        m.e(aVar, "action");
        if (aVar == this.f11600m) {
            return;
        }
        this.f11600m = aVar;
        b bVar = (b) w0();
        if (bVar != null) {
            bVar.Y(aVar);
        }
    }

    public final void a1(boolean z4) {
        this.f11598k.setDiagonal(z4);
    }

    public final void b1(boolean z4) {
        this.f11598k.setFourPlayers(z4);
        I0();
    }

    public final void c1(int i4) {
        this.f11598k.setOutMoves(i4);
    }

    public final void d1(String str) {
        m.e(str, HalmaParams.NAME);
        this.f11598k.setName(str);
    }

    public final void e1(int i4, int i5) {
        if (this.f11598k.getSize() == i4 && this.f11598k.getHeight() == i5) {
            return;
        }
        this.f11598k.setSize(i4);
        this.f11598k.setHeight(i5);
        I0();
        b bVar = (b) w0();
        if (bVar != null) {
            bVar.o1();
        }
    }

    public final void f1(int i4) {
        this.f11599l = i4;
        b bVar = (b) w0();
        if (bVar != null) {
            bVar.k(this.f11599l < this.f11597j);
        }
    }

    public final void g1(boolean z4) {
        if (this.f11598k.isStern() == z4) {
            return;
        }
        if (z4) {
            HalmaParams halmaParams = this.f11598k;
            halmaParams.setSize(h.g(halmaParams.getSize(), new g(2, 5)));
            this.f11598k.setStart(-1);
        } else {
            HalmaParams halmaParams2 = this.f11598k;
            halmaParams2.setSize(h.g(halmaParams2.getSize(), new g(4, 16)));
            this.f11598k.setStart(0);
        }
        HalmaParams halmaParams3 = this.f11598k;
        halmaParams3.setHeight(halmaParams3.getSize());
        I0();
        b bVar = (b) w0();
        if (bVar != null) {
            bVar.o1();
        }
    }

    @Override // cab.shashki.app.ui.custom.board.W
    public void h(ShashkiBoardView shashkiBoardView, final String str) {
        b.a aVar;
        m.e(shashkiBoardView, "board");
        m.e(str, "pos");
        if (this.f11598k.isStern() || (aVar = this.f11600m) == b.a.f11603d) {
            return;
        }
        if (aVar == b.a.f11605f) {
            Z(new InterfaceC1005a() { // from class: G0.c
                @Override // g3.InterfaceC1005a
                public final Object a() {
                    return cab.shashki.app.ui.halma.a.F0(this.f1225d, str);
                }
            });
            return;
        }
        if (l1(str)) {
            return;
        }
        int iC = h.c(this.f11598k.getSize(), this.f11598k.getHeight()) >> 1;
        if (this.f11593f.size() >= h.c(iC * iC, this.f11598k.getFourPlayers() ? 16 : 25)) {
            Z(new InterfaceC1005a() { // from class: G0.d
                @Override // g3.InterfaceC1005a
                public final Object a() {
                    return cab.shashki.app.ui.halma.a.G0(this.f1227d);
                }
            });
        } else {
            Z(new InterfaceC1005a() { // from class: G0.e
                @Override // g3.InterfaceC1005a
                public final Object a() {
                    return cab.shashki.app.ui.halma.a.H0(this.f1228d, str);
                }
            });
        }
    }

    public final int h1() {
        return this.f11598k.getSize();
    }

    public final String i1() {
        if (this.f11598k.getStart() == -1) {
            return String.valueOf(this.f11598k.getSize());
        }
        return this.f11598k.getHeight() + "x" + this.f11598k.getSize();
    }

    @Override // cab.shashki.app.ui.custom.board.W
    public boolean j(ShashkiBoardView shashkiBoardView, String str, String str2) {
        m.e(shashkiBoardView, "board");
        m.e(str, "from");
        m.e(str2, "to");
        Z(new InterfaceC1005a() { // from class: G0.g
            @Override // g3.InterfaceC1005a
            public final Object a() {
                return cab.shashki.app.ui.halma.a.W0(this.f1232d);
            }
        });
        return false;
    }

    public final String j1() {
        return this.f11601n;
    }

    @Override // cab.shashki.app.ui.custom.board.W
    public void w(ShashkiBoardView shashkiBoardView, C0843z.i iVar) {
        m.e(shashkiBoardView, "board");
        m.e(iVar, "piece");
        if (this.f11598k.isStern()) {
            return;
        }
        final String position = iVar.getPosition();
        if (this.f11600m == b.a.f11603d) {
            if (!l1(position) || m.a(iVar.b(), "l")) {
                shashkiBoardView.z1(position);
            }
            Z(new InterfaceC1005a() { // from class: G0.f
                @Override // g3.InterfaceC1005a
                public final Object a() {
                    return cab.shashki.app.ui.halma.a.X0(this.f1230d, position);
                }
            });
        }
    }
}