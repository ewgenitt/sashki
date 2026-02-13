package cab.shashki.app.ui.chess.fairy.builder.quick;

import f0.InterfaceC0912p;
import h3.m;
import java.util.List;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public interface c extends InterfaceC0912p {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f11093a;

        public a(List list) {
            m.e(list, "list");
            this.f11093a = list;
        }

        public final List a() {
            return this.f11093a;
        }
    }

    void A0(boolean z4);

    void I0(int i4);

    void a(String str);

    void c1(String str, String str2);

    void f(String str);

    void g0();

    void t(boolean z4, boolean z5);

    void v();

    void y(int i4);
}