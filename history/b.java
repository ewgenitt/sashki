package cab.shashki.app.ui.history;

import N0.K;
import cab.shashki.app.ui.custom.board.C0843z;
import f0.InterfaceC0912p;
import h3.h;
import h3.m;
import i0.AbstractC1051f;
import i0.C1048c;
import java.util.List;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public interface b extends InterfaceC0912p {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f11682a;

        /* renamed from: b, reason: collision with root package name */
        private final int f11683b;

        /* renamed from: c, reason: collision with root package name */
        private final String f11684c;

        /* renamed from: d, reason: collision with root package name */
        private final C1048c f11685d;

        public a(String str, int i4, String str2, C1048c c1048c) {
            m.e(str, "move");
            this.f11682a = str;
            this.f11683b = i4;
            this.f11684c = str2;
            this.f11685d = c1048c;
        }

        public final C1048c a() {
            return this.f11685d;
        }

        public final String b() {
            return this.f11684c;
        }

        public final String c() {
            return this.f11682a;
        }

        public final int d() {
            return this.f11683b;
        }
    }

    void J1(boolean z4);

    void P1(boolean z4);

    void Q(int i4);

    void R(a aVar);

    void R1(int i4);

    void a(String str);

    void d0(List list, int i4, int i5);

    void g(boolean z4);

    void m0(boolean z4);

    void n(List list, int i4, cab.shashki.app.db.entities.a aVar);

    void u1(C0843z.a aVar);

    void x0(C0152b c0152b);

    void x1(boolean z4);

    void z1(boolean z4);

    /* renamed from: cab.shashki.app.ui.history.b$b, reason: collision with other inner class name */
    public static final class C0152b {

        /* renamed from: a, reason: collision with root package name */
        private final String f11686a;

        /* renamed from: b, reason: collision with root package name */
        private final int f11687b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f11688c;

        /* renamed from: d, reason: collision with root package name */
        private final K.c f11689d;

        /* renamed from: e, reason: collision with root package name */
        private final List f11690e;

        public C0152b(String str, int i4, boolean z4, K.c cVar, List list) {
            m.e(str, "position");
            this.f11686a = str;
            this.f11687b = i4;
            this.f11688c = z4;
            this.f11689d = cVar;
            this.f11690e = list;
        }

        public final List a() {
            return this.f11690e;
        }

        public final int b() {
            return this.f11687b;
        }

        public final K.c c() {
            return this.f11689d;
        }

        public final boolean d() {
            return this.f11688c;
        }

        public final String e() {
            return this.f11686a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0152b)) {
                return false;
            }
            C0152b c0152b = (C0152b) obj;
            return m.a(this.f11686a, c0152b.f11686a) && this.f11687b == c0152b.f11687b && this.f11688c == c0152b.f11688c && m.a(this.f11689d, c0152b.f11689d) && m.a(this.f11690e, c0152b.f11690e);
        }

        public int hashCode() {
            int iHashCode = ((((this.f11686a.hashCode() * 31) + this.f11687b) * 31) + AbstractC1051f.a(this.f11688c)) * 31;
            K.c cVar = this.f11689d;
            int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
            List list = this.f11690e;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "PositionAndMove(position=" + this.f11686a + ", counterId=" + this.f11687b + ", play=" + this.f11688c + ", move=" + this.f11689d + ", captured=" + this.f11690e + ")";
        }

        public /* synthetic */ C0152b(String str, int i4, boolean z4, K.c cVar, List list, int i5, h hVar) {
            this(str, (i5 & 2) != 0 ? -1 : i4, (i5 & 4) != 0 ? false : z4, (i5 & 8) != 0 ? null : cVar, (i5 & 16) != 0 ? null : list);
        }
    }
}