package cab.shashki.app.ui.universal;

import a3.AbstractC0614b;
import a3.InterfaceC0613a;
import cab.shashki.app.db.entities.Cylinder;
import f0.InterfaceC0912p;
import java.util.List;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public interface d extends InterfaceC0912p {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        public static final a f11885d = new a("CLEAR", 0);

        /* renamed from: e, reason: collision with root package name */
        public static final a f11886e = new a("ADD_WHITE", 1);

        /* renamed from: f, reason: collision with root package name */
        public static final a f11887f = new a("ADD_BLACK", 2);

        /* renamed from: g, reason: collision with root package name */
        public static final a f11888g = new a("ADD_WHITE_LINE", 3);

        /* renamed from: h, reason: collision with root package name */
        public static final a f11889h = new a("ADD_BLACK_LINE", 4);

        /* renamed from: i, reason: collision with root package name */
        public static final a f11890i = new a("ADD_X", 5);

        /* renamed from: j, reason: collision with root package name */
        public static final a f11891j = new a("ADD_Y", 6);

        /* renamed from: k, reason: collision with root package name */
        public static final a f11892k = new a("ADD_X_LINE", 7);

        /* renamed from: l, reason: collision with root package name */
        public static final a f11893l = new a("ADD_Y_LINE", 8);

        /* renamed from: m, reason: collision with root package name */
        private static final /* synthetic */ a[] f11894m;

        /* renamed from: n, reason: collision with root package name */
        private static final /* synthetic */ InterfaceC0613a f11895n;

        static {
            a[] aVarArrA = a();
            f11894m = aVarArrA;
            f11895n = AbstractC0614b.a(aVarArrA);
        }

        private a(String str, int i4) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f11885d, f11886e, f11887f, f11888g, f11889h, f11890i, f11891j, f11892k, f11893l};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f11894m.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* renamed from: d, reason: collision with root package name */
        public static final b f11896d = new b("NO", 0);

        /* renamed from: e, reason: collision with root package name */
        public static final b f11897e = new b("LOCK", 1);

        /* renamed from: f, reason: collision with root package name */
        public static final b f11898f = new b("CUT", 2);

        /* renamed from: g, reason: collision with root package name */
        public static final b f11899g = new b("PORTAL", 3);

        /* renamed from: h, reason: collision with root package name */
        public static final b f11900h = new b("SPIN", 4);

        /* renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ b[] f11901i;

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ InterfaceC0613a f11902j;

        static {
            b[] bVarArrA = a();
            f11901i = bVarArrA;
            f11902j = AbstractC0614b.a(bVarArrA);
        }

        private b(String str, int i4) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f11896d, f11897e, f11898f, f11899g, f11900h};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f11901i.clone();
        }
    }

    void A();

    void C();

    void F(int i4);

    void M0(b bVar);

    void U0();

    void d();

    void finish();

    void j1(List list);

    void k(boolean z4);

    void l0(Cylinder cylinder);

    void l1(a aVar);

    void m(boolean z4);

    void n0(int i4);

    void p();

    void r(int i4);

    void w0(a aVar);
}