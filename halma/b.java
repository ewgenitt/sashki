package cab.shashki.app.ui.halma;

import a3.AbstractC0614b;
import a3.InterfaceC0613a;
import f0.InterfaceC0912p;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public interface b extends InterfaceC0912p {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        public static final a f11603d = new a("Clear", 0);

        /* renamed from: e, reason: collision with root package name */
        public static final a f11604e = new a("Add", 1);

        /* renamed from: f, reason: collision with root package name */
        public static final a f11605f = new a("Lock", 2);

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ a[] f11606g;

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ InterfaceC0613a f11607h;

        static {
            a[] aVarArrA = a();
            f11606g = aVarArrA;
            f11607h = AbstractC0614b.a(aVarArrA);
        }

        private a(String str, int i4) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f11603d, f11604e, f11605f};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f11606g.clone();
        }
    }

    void Y(a aVar);

    void d();

    void finish();

    void k(boolean z4);

    void m(boolean z4);

    void o1();

    void p();

    void p0();

    void r(int i4);
}