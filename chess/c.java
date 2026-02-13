package cab.shashki.app.ui.chess;

import a3.AbstractC0614b;
import a3.InterfaceC0613a;
import f0.InterfaceC0912p;
import h3.m;
import java.io.Serializable;
import java.util.List;
import q0.V;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public interface c extends InterfaceC0912p {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static final a f10939e = new a("STRING", 0, "string");

        /* renamed from: f, reason: collision with root package name */
        public static final a f10940f = new a("CHECK", 1, "check");

        /* renamed from: g, reason: collision with root package name */
        public static final a f10941g = new a("COMBO", 2, "combo");

        /* renamed from: h, reason: collision with root package name */
        public static final a f10942h = new a("SPIN", 3, "spin");

        /* renamed from: i, reason: collision with root package name */
        public static final a f10943i = new a("BUTTON", 4, "button");

        /* renamed from: j, reason: collision with root package name */
        public static final a f10944j = new a("OTHER", 5, "other");

        /* renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ a[] f10945k;

        /* renamed from: l, reason: collision with root package name */
        private static final /* synthetic */ InterfaceC0613a f10946l;

        /* renamed from: d, reason: collision with root package name */
        private String f10947d;

        static {
            a[] aVarArrA = a();
            f10945k = aVarArrA;
            f10946l = AbstractC0614b.a(aVarArrA);
        }

        private a(String str, int i4, String str2) {
            this.f10947d = str2;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f10939e, f10940f, f10941g, f10942h, f10943i, f10944j};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f10945k.clone();
        }

        public final String b() {
            return this.f10947d;
        }

        public final void c(String str) {
            m.e(str, "<set-?>");
            this.f10947d = str;
        }
    }

    public interface b extends Serializable {
        String f();

        String getName();

        String getValue();

        int h();

        int i();

        a n();

        boolean r();
    }

    void E1(List list);

    void K0(b bVar);

    void k1(V.b bVar);
}