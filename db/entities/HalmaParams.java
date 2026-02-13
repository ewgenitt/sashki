package cab.shashki.app.db.entities;

import H1.i;
import U2.p;
import android.util.Base64;
import cab.shashki.app.db.entities.a;
import h3.h;
import h3.m;
import i0.AbstractC1051f;
import java.math.BigInteger;
import java.util.ArrayList;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class HalmaParams implements cab.shashki.app.db.entities.a {
    public static final a Companion = new a(null);
    public static final String DIAGONAL = "diagonal";
    public static final String FOUR_PLAYERS = "fourPlayers";
    public static final String HEIGHT = "height";
    public static final String ID = "id";
    public static final String LOCK = "lock";
    public static final String NAME = "name";
    public static final String OUT_MOVES = "outMoves";
    public static final String SIZE = "size";
    public static final String START = "start";
    private boolean diagonal;
    private boolean fourPlayers;
    private int height;
    private int id;
    private BigInteger lockMask;
    private String name;
    private int outMoves;
    private int size;
    private int start;

    public static final class a {
        public /* synthetic */ a(h hVar) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x009e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final cab.shashki.app.db.entities.HalmaParams a(H1.i r14) {
            /*
                r13 = this;
                java.lang.String r0 = "o"
                h3.m.e(r14, r0)
                cab.shashki.app.db.entities.HalmaParams r1 = new cab.shashki.app.db.entities.HalmaParams
                r11 = 511(0x1ff, float:7.16E-43)
                r12 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                java.lang.String r0 = "id"
                H1.f r0 = r14.q(r0)
                if (r0 == 0) goto L23
                int r0 = r0.b()
                goto L24
            L23:
                r0 = 0
            L24:
                r1.setId(r0)
                java.lang.String r0 = "name"
                H1.f r0 = r14.q(r0)
                java.lang.String r0 = r0.g()
                r1.setName(r0)
                java.lang.String r0 = "size"
                H1.f r0 = r14.q(r0)
                int r0 = r0.b()
                r1.setSize(r0)
                java.lang.String r0 = "start"
                H1.f r0 = r14.q(r0)
                int r0 = r0.b()
                r1.setStart(r0)
                java.lang.String r0 = "outMoves"
                H1.f r0 = r14.q(r0)
                int r0 = r0.b()
                r1.setOutMoves(r0)
                java.lang.String r0 = "diagonal"
                H1.f r0 = r14.q(r0)
                if (r0 == 0) goto L68
                boolean r0 = r0.a()
                goto L69
            L68:
                r0 = 0
            L69:
                r1.setDiagonal(r0)
                java.lang.String r0 = "fourPlayers"
                H1.f r0 = r14.q(r0)
                if (r0 == 0) goto L78
                boolean r2 = r0.a()
            L78:
                r1.setFourPlayers(r2)
                java.lang.String r0 = "height"
                H1.f r0 = r14.q(r0)
                if (r0 == 0) goto L9e
                int r0 = r0.b()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                int r2 = r0.intValue()
                if (r2 < 0) goto L96
                r3 = 17
                if (r2 >= r3) goto L96
                goto L97
            L96:
                r0 = 0
            L97:
                if (r0 == 0) goto L9e
                int r0 = r0.intValue()
                goto La2
            L9e:
                int r0 = r1.getSize()
            La2:
                r1.setHeight(r0)
                java.lang.String r0 = "lock"
                H1.f r14 = r14.q(r0)
                if (r14 == 0) goto Lc0
                java.lang.String r14 = r14.g()
                if (r14 == 0) goto Lc0
                r0 = 3
                byte[] r14 = android.util.Base64.decode(r14, r0)
                if (r14 == 0) goto Lc0
                java.math.BigInteger r0 = new java.math.BigInteger
                r0.<init>(r14)
                goto Lc7
            Lc0:
                java.math.BigInteger r0 = java.math.BigInteger.ZERO
                java.lang.String r14 = "ZERO"
                h3.m.d(r0, r14)
            Lc7:
                r1.setLockMask(r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: cab.shashki.app.db.entities.HalmaParams.a.a(H1.i):cab.shashki.app.db.entities.HalmaParams");
        }

        private a() {
        }
    }

    public HalmaParams() {
        this(0, null, 0, 0, 0, 0, null, false, false, 511, null);
    }

    public static /* synthetic */ HalmaParams copy$default(HalmaParams halmaParams, int i4, String str, int i5, int i6, int i7, int i8, BigInteger bigInteger, boolean z4, boolean z5, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i4 = halmaParams.id;
        }
        if ((i9 & 2) != 0) {
            str = halmaParams.name;
        }
        if ((i9 & 4) != 0) {
            i5 = halmaParams.size;
        }
        if ((i9 & 8) != 0) {
            i6 = halmaParams.height;
        }
        if ((i9 & 16) != 0) {
            i7 = halmaParams.start;
        }
        if ((i9 & 32) != 0) {
            i8 = halmaParams.outMoves;
        }
        if ((i9 & 64) != 0) {
            bigInteger = halmaParams.lockMask;
        }
        if ((i9 & 128) != 0) {
            z4 = halmaParams.diagonal;
        }
        if ((i9 & 256) != 0) {
            z5 = halmaParams.fourPlayers;
        }
        boolean z6 = z4;
        boolean z7 = z5;
        int i10 = i8;
        BigInteger bigInteger2 = bigInteger;
        int i11 = i7;
        int i12 = i5;
        return halmaParams.copy(i4, str, i12, i6, i11, i10, bigInteger2, z6, z7);
    }

    @Override // cab.shashki.app.db.entities.a
    public int boardExtra() {
        return a.C0141a.a(this);
    }

    @Override // cab.shashki.app.db.entities.a
    public int columns() {
        return this.size;
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.size;
    }

    public final int component4() {
        return this.height;
    }

    public final int component5() {
        return this.start;
    }

    public final int component6() {
        return this.outMoves;
    }

    public final BigInteger component7() {
        return this.lockMask;
    }

    public final boolean component8() {
        return this.diagonal;
    }

    public final boolean component9() {
        return this.fourPlayers;
    }

    public final HalmaParams copy(int i4, String str, int i5, int i6, int i7, int i8, BigInteger bigInteger, boolean z4, boolean z5) {
        m.e(str, NAME);
        m.e(bigInteger, "lockMask");
        return new HalmaParams(i4, str, i5, i6, i7, i8, bigInteger, z4, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HalmaParams)) {
            return false;
        }
        HalmaParams halmaParams = (HalmaParams) obj;
        return this.id == halmaParams.id && m.a(this.name, halmaParams.name) && this.size == halmaParams.size && this.height == halmaParams.height && this.start == halmaParams.start && this.outMoves == halmaParams.outMoves && m.a(this.lockMask, halmaParams.lockMask) && this.diagonal == halmaParams.diagonal && this.fourPlayers == halmaParams.fourPlayers;
    }

    @Override // cab.shashki.app.db.entities.a
    public boolean extraPlayers() {
        return a.C0141a.b(this);
    }

    public final boolean getDiagonal() {
        return this.diagonal;
    }

    public final boolean getFourPlayers() {
        return this.fourPlayers;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getId() {
        return this.id;
    }

    public final BigInteger getLockMask() {
        return this.lockMask;
    }

    public final String getName() {
        return this.name;
    }

    public final int getOutMoves() {
        return this.outMoves;
    }

    public final int getSize() {
        return this.size;
    }

    public final int getStart() {
        return this.start;
    }

    public int hashCode() {
        return (((((((((((((((this.id * 31) + this.name.hashCode()) * 31) + this.size) * 31) + this.height) * 31) + this.start) * 31) + this.outMoves) * 31) + this.lockMask.hashCode()) * 31) + AbstractC1051f.a(this.diagonal)) * 31) + AbstractC1051f.a(this.fourPlayers);
    }

    @Override // cab.shashki.app.db.entities.a
    public String id() {
        return String.valueOf(this.id);
    }

    @Override // cab.shashki.app.db.entities.a
    public boolean is3() {
        return a.C0141a.c(this);
    }

    @Override // cab.shashki.app.db.entities.a
    public boolean is4() {
        return this.fourPlayers;
    }

    @Override // cab.shashki.app.db.entities.a
    public boolean is6() {
        return isStern();
    }

    public final boolean isStern() {
        return this.start == -1;
    }

    public final int[] lockArray() {
        ArrayList arrayList = new ArrayList();
        BigInteger bigIntegerClearBit = this.lockMask;
        while (!m.a(bigIntegerClearBit, BigInteger.ZERO)) {
            int lowestSetBit = bigIntegerClearBit.getLowestSetBit();
            arrayList.add(Integer.valueOf(lowestSetBit));
            bigIntegerClearBit = bigIntegerClearBit.clearBit(lowestSetBit);
        }
        return p.a0(arrayList);
    }

    @Override // cab.shashki.app.db.entities.a
    public String name() {
        return this.name;
    }

    @Override // cab.shashki.app.db.entities.a
    public int rows() {
        return this.height;
    }

    public final boolean same(HalmaParams halmaParams) {
        m.e(halmaParams, "p");
        return this.size == halmaParams.size && this.start == halmaParams.start && this.outMoves == halmaParams.outMoves && this.diagonal == halmaParams.diagonal && this.fourPlayers == halmaParams.fourPlayers && m.a(this.lockMask, halmaParams.lockMask);
    }

    public final void setDiagonal(boolean z4) {
        this.diagonal = z4;
    }

    public final void setFourPlayers(boolean z4) {
        this.fourPlayers = z4;
    }

    public final void setHeight(int i4) {
        this.height = i4;
    }

    public final void setId(int i4) {
        this.id = i4;
    }

    public final void setLockMask(BigInteger bigInteger) {
        m.e(bigInteger, "<set-?>");
        this.lockMask = bigInteger;
    }

    public final void setName(String str) {
        m.e(str, "<set-?>");
        this.name = str;
    }

    public final void setOutMoves(int i4) {
        this.outMoves = i4;
    }

    public final void setSize(int i4) {
        this.size = i4;
    }

    public final void setStart(int i4) {
        this.start = i4;
    }

    public final i toJsonObject() {
        int i4;
        i iVar = new i();
        iVar.o(NAME, this.name);
        iVar.n(SIZE, Integer.valueOf(this.size));
        iVar.n(START, Integer.valueOf(this.start));
        iVar.n(OUT_MOVES, Integer.valueOf(this.outMoves));
        if (this.diagonal) {
            iVar.m(DIAGONAL, Boolean.TRUE);
        }
        if (this.fourPlayers) {
            iVar.m(FOUR_PLAYERS, Boolean.TRUE);
        }
        if (!isStern() && (i4 = this.height) != 0 && i4 != this.size) {
            iVar.n(HEIGHT, Integer.valueOf(i4));
        }
        if (!m.a(this.lockMask, BigInteger.ZERO)) {
            iVar.o(LOCK, Base64.encodeToString(this.lockMask.toByteArray(), 3));
        }
        return iVar;
    }

    public String toString() {
        return "HalmaParams(id=" + this.id + ", name=" + this.name + ", size=" + this.size + ", height=" + this.height + ", start=" + this.start + ", outMoves=" + this.outMoves + ", lockMask=" + this.lockMask + ", diagonal=" + this.diagonal + ", fourPlayers=" + this.fourPlayers + ")";
    }

    public HalmaParams(int i4, String str, int i5, int i6, int i7, int i8, BigInteger bigInteger, boolean z4, boolean z5) {
        m.e(str, NAME);
        m.e(bigInteger, "lockMask");
        this.id = i4;
        this.name = str;
        this.size = i5;
        this.height = i6;
        this.start = i7;
        this.outMoves = i8;
        this.lockMask = bigInteger;
        this.diagonal = z4;
        this.fourPlayers = z5;
    }

    public /* synthetic */ HalmaParams(int i4, String str, int i5, int i6, int i7, int i8, BigInteger bigInteger, boolean z4, boolean z5, int i9, h hVar) {
        this((i9 & 1) != 0 ? 0 : i4, (i9 & 2) != 0 ? "" : str, (i9 & 4) != 0 ? 8 : i5, (i9 & 8) != 0 ? 8 : i6, (i9 & 16) != 0 ? 7399 : i7, (i9 & 32) != 0 ? 40 : i8, (i9 & 64) != 0 ? BigInteger.ZERO : bigInteger, (i9 & 128) != 0 ? false : z4, (i9 & 256) != 0 ? false : z5);
    }
}