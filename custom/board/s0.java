package cab.shashki.app.ui.custom.board;

import N0.C0574l;
import N0.K;
import U2.AbstractC0590i;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import cab.shashki.app.ui.custom.board.C0843z;
import cab.shashki.app.ui.custom.board.O;
import f0.AbstractC0917u;
import g3.InterfaceC1016l;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import o0.InterfaceC1214A;
import p3.AbstractC1273a;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public abstract class s0 extends N {

    /* renamed from: w0 */
    private int f11481w0;

    /* renamed from: x0 */
    private boolean f11482x0;

    /* renamed from: y0 */
    private boolean f11483y0;

    /* renamed from: z0 */
    private final int f11484z0;

    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return W2.a.d(Float.valueOf(((PointF) ((C0843z.j) obj)).y), Float.valueOf(((PointF) ((C0843z.j) obj2)).y));
        }
    }

    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return W2.a.d(Float.valueOf(((PointF) ((C0843z.j) obj2)).y), Float.valueOf(((PointF) ((C0843z.j) obj)).y));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        h3.m.e(context, "context");
        h3.m.e(attributeSet, "attrs");
        this.f11482x0 = true;
        this.f11483y0 = getRotateAll();
        this.f11484z0 = 393216;
    }

    public static final void B1(s0 s0Var, String str) {
        for (C0843z.j jVar : s0Var.getPieces()) {
            if (jVar.f() && h3.m.a(jVar.getPosition(), str)) {
                jVar.k(false);
                s0Var.setAmountOfPieces(s0Var.getAmountOfPieces() - 1);
                s0Var.x((((int) ((PointF) jVar).x) - s0Var.getPieceRadius()) - 1, (((int) ((PointF) jVar).y) - s0Var.getPieceRadius()) - 1, ((int) ((PointF) jVar).x) + s0Var.getPieceRadius() + 1, ((int) ((PointF) jVar).y) + s0Var.getPieceRadius() + 1);
            }
        }
    }

    public static final void C1(s0 s0Var, List list) {
        for (C0843z.j jVar : s0Var.getPieces()) {
            if (jVar.f() && list.contains(jVar.getPosition())) {
                jVar.k(false);
                s0Var.setAmountOfPieces(s0Var.getAmountOfPieces() - 1);
                s0Var.x((((int) ((PointF) jVar).x) - s0Var.getPieceRadius()) - 1, (((int) ((PointF) jVar).y) - s0Var.getPieceRadius()) - 1, ((int) ((PointF) jVar).x) + s0Var.getPieceRadius() + 1, ((int) ((PointF) jVar).y) + s0Var.getPieceRadius() + 1);
            }
        }
    }

    private final void E1(K.c cVar, List list) {
        for (C0843z.g gVar : getLines()) {
            gVar.d(null);
        }
        C0843z.g gVar2 = (C0843z.g) AbstractC0590i.u(getLines());
        gVar2.d(cVar);
        gVar2.c(-16776961);
        getRemoved().clear();
        getRemoved().addAll(list);
        w();
    }

    public static final void F1(List list, s0 s0Var) {
        int iMin = Math.min(list.size(), 8);
        C0843z.g[] lines = s0Var.getLines();
        int length = lines.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            C0843z.g gVar = lines[i4];
            int i6 = i5 + 1;
            if (i5 < iMin) {
                gVar.d(((C0843z.g) list.get(i5)).b());
                gVar.c(((C0843z.g) list.get(i5)).a());
            } else {
                gVar.d(null);
            }
            i4++;
            i5 = i6;
        }
        s0Var.w();
    }

    public static final void G1(s0 s0Var, boolean z4) {
        if (s0Var.getRotateAll() == z4 || s0Var.getMode().p() == 9) {
            return;
        }
        s0Var.setRotateAll(z4);
        s0Var.R1();
        s0Var.w();
    }

    public static final void I1(s0 s0Var, List list, List list2, List list3) {
        s0Var.getBlocked().clear();
        s0Var.getBlocked().addAll(list);
        s0Var.getSpins().clear();
        s0Var.getSpins().addAll(list2);
        s0Var.getBreaks().clear();
        U2.p.r(s0Var.getBreaks(), o3.h.o(o3.h.i(U2.p.y(list3), new InterfaceC1016l() { // from class: cab.shashki.app.ui.custom.board.Y
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return Boolean.valueOf(s0.J1((String) obj));
            }
        }), new InterfaceC1016l() { // from class: cab.shashki.app.ui.custom.board.Z
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return s0.K1((String) obj);
            }
        }));
        if (s0Var.getMode().p() == 23) {
            s0Var.setLineGrid(s0Var.getMode().m() == 4 ? C0843z.f11502a.C(s0Var.getMode().s(), s0Var.getMode().t(), s0Var.getBlocked(), list3) : C0843z.f11502a.k0(s0Var.getMode().s(), s0Var.getMode().t(), s0Var.getBlocked(), list3));
        }
        s0Var.w();
    }

    public static final boolean J1(String str) {
        h3.m.e(str, "it");
        return p3.n.B(str, ':', false, 2, null);
    }

    public static final T2.l K1(String str) {
        h3.m.e(str, "s");
        List listH0 = p3.n.h0(str, new char[]{':'}, false, 0, 6, null);
        return new T2.l(listH0.get(0), listH0.get(1));
    }

    public static final void L1(s0 s0Var, List list) {
        s0Var.getZones().clear();
        s0Var.getZones().addAll(list);
        s0Var.w();
    }

    private final void M1(C0843z.j jVar, String str, int i4, String str2) {
        jVar.i(str);
        jVar.j(i4);
        jVar.h(str2);
        jVar.set(i(str));
        jVar.k(true);
        setAmountOfPieces(getAmountOfPieces() + 1);
        N0.K k4 = N0.K.f2926a;
        if (k4.N(str)) {
            (Character.isUpperCase(str.charAt(0)) ? getHandWhite() : getHandBlack()).add(Character.valueOf(str.charAt(0)));
        } else if (k4.Q(str)) {
            (Character.isUpperCase(str.charAt(0)) ? getPrisonWhite() : getPrisonBlack()).add(Character.valueOf(str.charAt(0)));
        }
        R1();
    }

    public static final void O1(s0 s0Var, K.c cVar, List list) {
        s0Var.E1(cVar, list);
    }

    public static final void Q1(s0 s0Var) {
        s0Var.w();
    }

    private final void c1(String str, int i4) {
        Iterator<C0843z.b> it = getDynamicCells().iterator();
        int i5 = 0;
        while (true) {
            if (!it.hasNext()) {
                i5 = -1;
                break;
            } else if (h3.m.a(it.next().b(), str)) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 < 0) {
            getDynamicCells().add(new C0843z.b(str, i4, i(str)));
        } else if (i4 == 128) {
            getDynamicCells().remove(i5);
        } else {
            C0843z.b bVar = getDynamicCells().get(i5);
            if (bVar.c() != 128) {
                i4 = 128;
            }
            bVar.e(i4);
        }
        getExecutor().submit(new RunnableC0821i0(this));
    }

    public static final void e1(List list, s0 s0Var) {
        Object next;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0843z.d dVar = (C0843z.d) it.next();
            Iterator<T> it2 = s0Var.getLights().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                C0843z.d dVar2 = (C0843z.d) next;
                if (h3.m.a(dVar2.b(), dVar.b()) && dVar2.c() == dVar.c()) {
                    break;
                }
            }
            if (next == null) {
                s0Var.getLights().add(dVar);
            }
        }
        s0Var.w();
    }

    public static /* synthetic */ void h1(s0 s0Var, String str, int i4, String str2, boolean z4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPiece");
        }
        if ((i5 & 4) != 0) {
            str2 = null;
        }
        if ((i5 & 8) != 0) {
            z4 = false;
        }
        s0Var.f1(str, i4, str2, z4);
    }

    public static /* synthetic */ void i1(s0 s0Var, String str, int i4, boolean z4, String str2, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPiece");
        }
        if ((i5 & 4) != 0) {
            z4 = true;
        }
        if ((i5 & 8) != 0) {
            str2 = null;
        }
        s0Var.g1(str, i4, z4, str2);
    }

    public static final void j1(s0 s0Var, String str, int i4, String str2) {
        h1(s0Var, str, i4, str2, false, 8, null);
    }

    public static final void l1(s0 s0Var, String str, int i4) {
        for (C0843z.j jVar : s0Var.getPieces()) {
            if (jVar.f() && h3.m.a(jVar.getPosition(), str)) {
                jVar.j(i4);
                s0Var.x((((int) ((PointF) jVar).x) - s0Var.getPieceRadius()) - 1, (((int) ((PointF) jVar).y) - s0Var.getPieceRadius()) - 1, ((int) ((PointF) jVar).x) + s0Var.getPieceRadius() + 1, ((int) ((PointF) jVar).y) + s0Var.getPieceRadius() + 1);
            }
        }
    }

    public static final void n1(s0 s0Var) {
        if (s0Var.getLights().isEmpty()) {
            return;
        }
        s0Var.getLights().clear();
        s0Var.w();
    }

    public static final void r1(s0 s0Var) {
        for (C0843z.g gVar : s0Var.getLines()) {
            gVar.d(null);
        }
        s0Var.getRemoved().clear();
        s0Var.w();
    }

    public static final void setPieceMode$lambda$4(s0 s0Var) {
        s0Var.R1();
        s0Var.w();
    }

    public static final void u1(s0 s0Var, String str, String str2) {
        String strSubstring;
        C0843z.j jVar;
        C0843z.j jVar2;
        C0843z.j[] pieces = s0Var.getPieces();
        int length = pieces.length;
        int i4 = 0;
        while (true) {
            strSubstring = null;
            if (i4 >= length) {
                jVar = null;
                break;
            }
            jVar = pieces[i4];
            if (jVar.f() && h3.m.a(jVar.getPosition(), str2) && jVar.b() != null) {
                break;
            } else {
                i4++;
            }
        }
        if (jVar == null) {
            return;
        }
        char c4 = h3.m.g(str.charAt(0), str2.charAt(0)) > 0 ? (char) 65535 : (char) 1;
        char c5 = h3.m.g(str.charAt(1), str2.charAt(1)) <= 0 ? (char) 1 : (char) 65535;
        char cCharAt = (char) (str.charAt(0) + c4);
        char cCharAt2 = (char) (str.charAt(1) + c5);
        StringBuilder sb = new StringBuilder();
        sb.append(cCharAt);
        sb.append(cCharAt2);
        String string = sb.toString();
        while (!h3.m.a(string, str2)) {
            C0843z.j[] pieces2 = s0Var.getPieces();
            int length2 = pieces2.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length2) {
                    jVar2 = null;
                    break;
                }
                jVar2 = pieces2[i5];
                if (jVar2.f() && h3.m.a(jVar2.getPosition(), string) && jVar2.b() != null) {
                    break;
                } else {
                    i5++;
                }
            }
            if (jVar2 != null) {
                String strB = jVar2.b();
                Character chValueOf = strB != null ? Character.valueOf(strB.charAt(0)) : null;
                String strB2 = jVar2.b();
                if (strB2 == null || strB2.length() != 1) {
                    String strB3 = jVar2.b();
                    if (strB3 != null) {
                        strSubstring = strB3.substring(1);
                        h3.m.d(strSubstring, "substring(...)");
                    }
                    jVar2.h(strSubstring);
                } else {
                    jVar2.k(false);
                    s0Var.setAmountOfPieces(s0Var.getAmountOfPieces() - 1);
                }
                jVar.h(jVar.b() + chValueOf);
                s0Var.w();
                return;
            }
            char cCharAt3 = (char) (string.charAt(0) + c4);
            char cCharAt4 = (char) (string.charAt(1) + c5);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cCharAt3);
            sb2.append(cCharAt4);
            string = sb2.toString();
        }
    }

    public static final void w1(s0 s0Var, List list, String str) {
        C0843z.j jVar;
        C0843z.j jVar2;
        String strSubstring;
        C0843z.j[] pieces = s0Var.getPieces();
        int length = pieces.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                jVar = null;
                break;
            }
            jVar = pieces[i4];
            if (jVar.f() && h3.m.a(jVar.getPosition(), str) && jVar.b() != null) {
                break;
            } else {
                i4++;
            }
        }
        if (jVar == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            C0843z.j[] pieces2 = s0Var.getPieces();
            int length2 = pieces2.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length2) {
                    jVar2 = null;
                    break;
                }
                jVar2 = pieces2[i5];
                if (jVar2.f() && h3.m.a(jVar2.getPosition(), str2) && jVar2.b() != null) {
                    break;
                } else {
                    i5++;
                }
            }
            if (jVar2 != null) {
                String strB = jVar2.b();
                Character chValueOf = strB != null ? Character.valueOf(strB.charAt(0)) : null;
                String strB2 = jVar2.b();
                if (strB2 == null || strB2.length() != 1) {
                    String strB3 = jVar2.b();
                    if (strB3 != null) {
                        strSubstring = strB3.substring(1);
                        h3.m.d(strSubstring, "substring(...)");
                    } else {
                        strSubstring = null;
                    }
                    jVar2.h(strSubstring);
                } else {
                    jVar2.k(false);
                    s0Var.setAmountOfPieces(s0Var.getAmountOfPieces() - 1);
                }
                jVar.h(jVar.b() + chValueOf);
            }
        }
        s0Var.w();
    }

    public static final void y1(s0 s0Var, String str) {
        String strB;
        for (C0843z.j jVar : s0Var.getPieces()) {
            if (jVar.f() && h3.m.a(jVar.getPosition(), str) && (strB = jVar.b()) != null && !Character.isUpperCase(strB.charAt(0))) {
                String strB2 = jVar.b();
                if (strB2 == null) {
                    strB2 = null;
                } else if (strB2.length() > 0) {
                    char upperCase = Character.toUpperCase(strB2.charAt(0));
                    String strSubstring = strB2.substring(1);
                    h3.m.d(strSubstring, "substring(...)");
                    strB2 = upperCase + strSubstring;
                }
                jVar.h(strB2);
                s0Var.x((((int) ((PointF) jVar).x) - s0Var.getPieceRadius()) - 1, ((((int) ((PointF) jVar).y) - s0Var.getPieceRadius()) - s0Var.getCellSizeY()) - 1, ((int) ((PointF) jVar).x) + s0Var.getPieceRadius() + 1, ((int) ((PointF) jVar).y) + s0Var.getPieceRadius() + 1);
            }
        }
    }

    public final void A1(String str, String str2) {
        final ArrayList arrayList;
        h3.m.e(str, "from");
        h3.m.e(str2, "to");
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        h3.m.d(lowerCase, "toLowerCase(...)");
        String lowerCase2 = str2.toLowerCase(locale);
        h3.m.d(lowerCase2, "toLowerCase(...)");
        O.a aVar = O.f11392r;
        if (aVar.a(lowerCase) && aVar.a(lowerCase2)) {
            int iMin = Math.min((int) lowerCase.charAt(0), (int) lowerCase2.charAt(0));
            int iMax = Math.max((int) lowerCase.charAt(0), (int) lowerCase2.charAt(0));
            int iMin2 = Math.min(AbstractC1273a.d(lowerCase.charAt(1)), AbstractC1273a.d(lowerCase2.charAt(1)));
            int iMax2 = Math.max(AbstractC1273a.d(lowerCase.charAt(1)), AbstractC1273a.d(lowerCase2.charAt(1)));
            if (iMax - iMin > 1) {
                m3.g gVarJ = m3.h.j(iMin + 1, iMax);
                arrayList = new ArrayList(U2.p.o(gVarJ, 10));
                Iterator it = gVarJ.iterator();
                while (it.hasNext()) {
                    char cA = (char) ((U2.E) it).a();
                    StringBuilder sb = new StringBuilder();
                    sb.append(cA);
                    sb.append(iMin2);
                    arrayList.add(sb.toString());
                }
            } else {
                if (iMax2 - iMin2 <= 1) {
                    return;
                }
                m3.g gVarJ2 = m3.h.j(iMin2 + 1, iMax2);
                arrayList = new ArrayList(U2.p.o(gVarJ2, 10));
                Iterator it2 = gVarJ2.iterator();
                while (it2.hasNext()) {
                    int iA = ((U2.E) it2).a();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((char) iMin);
                    sb2.append(iA);
                    arrayList.add(sb2.toString());
                }
            }
            getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.g0
                @Override // java.lang.Runnable
                public final void run() {
                    s0.C1(this.f11452d, arrayList);
                }
            });
        }
    }

    public final void D1(int i4, int i5) {
        if (getPaintCellWhite().getColor() == i4 && getPaintCellBlack().getColor() == i5) {
            return;
        }
        getPaintCellWhite().setColor(i4);
        getPaintCellBlack().setColor(i5);
        if (getMode().i() > 0 || !h3.m.a(getMode().h(), "0")) {
            return;
        }
        getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.r0
            @Override // java.lang.Runnable
            public final void run() {
                this.f11480d.w();
            }
        });
    }

    public final void H1(final List list, final List list2, final List list3) {
        h3.m.e(list, "locks");
        h3.m.e(list2, "cuts");
        h3.m.e(list3, "rotations");
        getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.q0
            @Override // java.lang.Runnable
            public final void run() {
                s0.I1(this.f11475d, list, list3, list2);
            }
        });
    }

    public final void N1(final K.c cVar, final List list) {
        h3.m.e(cVar, "move");
        h3.m.e(list, "captured");
        getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.c0
            @Override // java.lang.Runnable
            public final void run() {
                s0.O1(this.f11442d, cVar, list);
            }
        });
    }

    public final void P1(C0843z.h hVar) {
        h3.m.e(hVar, "mode");
        if (hVar == getNumberSquares()) {
            return;
        }
        setNumberSquares(hVar);
        getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.n0
            @Override // java.lang.Runnable
            public final void run() {
                s0.Q1(this.f11467d);
            }
        });
    }

    protected final void R1() {
        o0.s collection = getCollection();
        if (collection == null || !collection.e()) {
            return;
        }
        if (getRotateAll()) {
            C0843z.j[] pieces = getPieces();
            if (pieces.length > 1) {
                AbstractC0590i.n(pieces, new b());
                return;
            }
            return;
        }
        C0843z.j[] pieces2 = getPieces();
        if (pieces2.length > 1) {
            AbstractC0590i.n(pieces2, new a());
        }
    }

    public final void d1(C0843z.e eVar, String... strArr) {
        h3.m.e(eVar, "type");
        h3.m.e(strArr, "positions");
        final ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            Context context = getContext();
            h3.m.d(context, "getContext(...)");
            arrayList.add(new C0843z.d(str, eVar, context, getMode()));
        }
        getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.e0
            @Override // java.lang.Runnable
            public final void run() {
                s0.e1(arrayList, this);
            }
        });
    }

    protected final void f1(String str, int i4, String str2, boolean z4) {
        C0843z.j jVar;
        C0843z.j jVar2;
        h3.m.e(str, "pos");
        if (i4 >= 128) {
            c1(str, i4);
            return;
        }
        C0843z.j jVar3 = null;
        int i5 = 0;
        if ((getCollection() instanceof o0.u) && !(getCollection() instanceof InterfaceC1214A)) {
            C0843z.j[] pieces = getPieces();
            int length = pieces.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    jVar2 = null;
                    break;
                }
                jVar2 = pieces[i6];
                if (jVar2.f() && h3.m.a(jVar2.getPosition(), str)) {
                    break;
                } else {
                    i6++;
                }
            }
            if (jVar2 != null) {
                jVar2.h(str2 + jVar2.b());
                return;
            }
        }
        String strG0 = G0(str, i4);
        if (!h3.m.a(str, strG0)) {
            getExecutor().submit(new RunnableC0821i0(this));
        }
        if (z4) {
            C0843z.j[] pieces2 = getPieces();
            int length2 = pieces2.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length2) {
                    jVar = null;
                    break;
                }
                jVar = pieces2[i7];
                if (jVar.f() && h3.m.a(jVar.getPosition(), strG0) && jVar.a() == i4) {
                    break;
                } else {
                    i7++;
                }
            }
            if (jVar != null) {
                Integer num = getCounter().get(strG0);
                getCounter().put(strG0, Integer.valueOf((num != null ? num.intValue() : 1) + 1));
                return;
            }
        }
        o1(strG0);
        C0843z.j[] pieces3 = getPieces();
        int length3 = pieces3.length;
        while (true) {
            if (i5 >= length3) {
                break;
            }
            C0843z.j jVar4 = pieces3[i5];
            if (!jVar4.f()) {
                jVar3 = jVar4;
                break;
            }
            i5++;
        }
        if (jVar3 == null) {
            return;
        }
        M1(jVar3, strG0, i4, str2);
    }

    public final void g1(final String str, final int i4, boolean z4, final String str2) {
        h3.m.e(str, "pos");
        if (getAmountOfPieces() < 128) {
            if (!z4 || this.f11481w0 >= 0) {
                if ((O.f11392r.a(str) || N0.K.f2926a.O(str)) && i4 >= 0) {
                    getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.b0
                        @Override // java.lang.Runnable
                        public final void run() {
                            s0.j1(this.f11438d, str, i4, str2);
                        }
                    });
                }
            }
        }
    }

    protected final int getAddPieceMode() {
        return this.f11481w0;
    }

    protected final boolean getExclusion() {
        return this.f11482x0;
    }

    protected final boolean getExpectedRotation() {
        return this.f11483y0;
    }

    public final int getPieceMode() {
        return this.f11481w0;
    }

    public final List<C0843z.i> getPieces() {
        Object obj;
        C0843z.j[] pieces = getPieces();
        ArrayList arrayList = new ArrayList();
        for (C0843z.j jVar : pieces) {
            if (jVar.f()) {
                arrayList.add(jVar);
            }
        }
        Iterator<T> it = getCounter().entrySet().iterator();
        while (true) {
            Object obj2 = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int size = arrayList.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    break;
                }
                Object obj3 = arrayList.get(i4);
                i4++;
                if (h3.m.a(((C0843z.j) obj3).getPosition(), entry.getKey())) {
                    obj2 = obj3;
                    break;
                }
            }
            C0843z.j jVar2 = (C0843z.j) obj2;
            if (jVar2 != null) {
                int iIntValue = ((Number) entry.getValue()).intValue() - 1;
                for (int i5 = 0; i5 < iIntValue; i5++) {
                    arrayList.add(new C0843z.j((String) entry.getKey(), jVar2.a()));
                }
            }
        }
        for (C0843z.b bVar : getDynamicCells()) {
            int size2 = arrayList.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size2) {
                    obj = null;
                    break;
                }
                obj = arrayList.get(i6);
                i6++;
                if (h3.m.a(((C0843z.j) obj).getPosition(), bVar.b())) {
                    break;
                }
            }
            C0843z.j jVar3 = (C0843z.j) obj;
            if (jVar3 == null) {
                arrayList.add(new C0843z.j(bVar.b(), 128, bVar.c(), "E"));
            } else {
                jVar3.g(bVar.c());
            }
        }
        return arrayList;
    }

    public final void k1(String str, final int i4) {
        h3.m.e(str, "position");
        final String lowerCase = str.toLowerCase(Locale.ROOT);
        h3.m.d(lowerCase, "toLowerCase(...)");
        if (!O.f11392r.a(lowerCase) || i4 < 0 || i4 >= C0()) {
            return;
        }
        getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.d0
            @Override // java.lang.Runnable
            public final void run() {
                s0.l1(this.f11445d, lowerCase, i4);
            }
        });
    }

    public final void m1() {
        getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.o0
            @Override // java.lang.Runnable
            public final void run() {
                s0.n1(this.f11470d);
            }
        });
    }

    protected final void o1(String str) {
        h3.m.e(str, "pos");
        if (this.f11482x0) {
            for (C0843z.j jVar : getPieces()) {
                jVar.k(jVar.f() && !h3.m.a(jVar.getPosition(), str));
            }
        }
    }

    public final C0843z.i p1(String str) {
        h3.m.e(str, "position");
        for (C0843z.j jVar : getPieces()) {
            if (jVar.f() && h3.m.a(jVar.getPosition(), str)) {
                return jVar;
            }
        }
        return null;
    }

    public final void q1() {
        getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.p0
            @Override // java.lang.Runnable
            public final void run() {
                s0.r1(this.f11473d);
            }
        });
    }

    public final boolean s1() {
        return getRotateAll();
    }

    protected final void setAddPieceMode(int i4) {
        this.f11481w0 = i4;
    }

    protected final void setExclusion(boolean z4) {
        this.f11482x0 = z4;
    }

    protected final void setExpectedRotation(boolean z4) {
        this.f11483y0 = z4;
    }

    @Override // cab.shashki.app.ui.custom.board.O
    public void setGridMode(C0843z.c cVar) {
        int iM;
        h3.m.e(cVar, "mode");
        boolean z4 = false;
        setRotateAll(cVar.p() == 9 ? false : this.f11483y0);
        if (((1 << cVar.p()) & this.f11484z0) != 0 || (1 <= (iM = cVar.m()) && iM < 4)) {
            z4 = true;
        }
        setSupportCount(z4);
        getSomeCells().clear();
        getEdgeCells().clear();
        if (cVar.p() == 26) {
            List listA = G0.a0.f1214a.a(cVar.l());
            List<C0843z.k> someCells = getSomeCells();
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                someCells.add(new C0843z.k((String) it.next(), null, 2, null));
            }
            List listE = G0.a0.f1214a.e(cVar.l());
            List<C0843z.k> edgeCells = getEdgeCells();
            Iterator it2 = listE.iterator();
            while (it2.hasNext()) {
                edgeCells.add(new C0843z.k((String) it2.next(), null, 2, null));
            }
        }
        if (C0843z.f11502a.l0(cVar)) {
            if (getMode().p() == cVar.p() && getDynamicCells().size() == cVar.l()) {
                return;
            }
            getDynamicCells().clear();
            List listG = cVar.p() == 21 ? C0574l.f2981a.g(cVar.s() >> 1) : C0574l.f2981a.f(cVar.s() - 2, cVar.t() - 2);
            List<C0843z.b> dynamicCells = getDynamicCells();
            Iterator it3 = listG.iterator();
            while (it3.hasNext()) {
                dynamicCells.add(new C0843z.b((String) it3.next(), 128, new PointF()));
            }
            getExecutor().submit(new RunnableC0821i0(this));
        }
        getGridPaint().setColor(androidx.core.content.a.c(getContext(), AbstractC0917u.f14632f));
        getGridPaint().setStrokeWidth(getResources().getDisplayMetrics().density + 0.5f);
        super.setGridMode(cVar);
    }

    public final void setLines(final List<C0843z.g> list) {
        h3.m.e(list, "lines");
        getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.l0
            @Override // java.lang.Runnable
            public final void run() {
                s0.F1(list, this);
            }
        });
    }

    public final void setPieceMode(int i4) {
        this.f11481w0 = i4;
        if (i4 == -2) {
            getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.m0
                @Override // java.lang.Runnable
                public final void run() {
                    s0.setPieceMode$lambda$4(this.f11465d);
                }
            });
        }
    }

    public final void setRotate(final boolean z4) {
        this.f11483y0 = z4;
        getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.k0
            @Override // java.lang.Runnable
            public final void run() {
                s0.G1(this.f11460d, z4);
            }
        });
    }

    public final void setZones(final List<C0843z.n> list) {
        h3.m.e(list, "zones");
        getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.X
            @Override // java.lang.Runnable
            public final void run() {
                s0.L1(this.f11433d, list);
            }
        });
    }

    public final void t1(final String str, final String str2) {
        h3.m.e(str, "from");
        h3.m.e(str2, "to");
        O.a aVar = O.f11392r;
        if (aVar.a(str) && aVar.a(str2)) {
            getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.j0
                @Override // java.lang.Runnable
                public final void run() {
                    s0.u1(this.f11457d, str, str2);
                }
            });
        }
    }

    public final void v1(final String str, final List list) {
        h3.m.e(str, "pos");
        h3.m.e(list, "captured");
        if (O.f11392r.a(str)) {
            getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.a0
                @Override // java.lang.Runnable
                public final void run() {
                    s0.w1(this.f11435d, list, str);
                }
            });
        }
    }

    public final void x1(String str) {
        h3.m.e(str, "position");
        final String lowerCase = str.toLowerCase(Locale.ROOT);
        h3.m.d(lowerCase, "toLowerCase(...)");
        if (O.f11392r.a(lowerCase)) {
            getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.h0
                @Override // java.lang.Runnable
                public final void run() {
                    s0.y1(this.f11454d, lowerCase);
                }
            });
        }
    }

    public final void z1(final String str) {
        h3.m.e(str, "pos");
        if (O.f11392r.a(str) || N0.K.f2926a.O(str)) {
            getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.f0
                @Override // java.lang.Runnable
                public final void run() {
                    s0.B1(this.f11450d, str);
                }
            });
        }
    }
}