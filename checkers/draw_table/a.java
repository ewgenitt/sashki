package cab.shashki.app.ui.checkers.draw_table;

import f0.InterfaceC0912p;
import h3.m;
import java.util.List;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public interface a extends InterfaceC0912p {

    /* renamed from: cab.shashki.app.ui.checkers.draw_table.a$a, reason: collision with other inner class name */
    public static final class C0144a {

        /* renamed from: a, reason: collision with root package name */
        private final String f10894a;

        /* renamed from: b, reason: collision with root package name */
        private final String f10895b;

        public C0144a(String str, String str2) {
            m.e(str, "debut");
            m.e(str2, "position");
            this.f10894a = str;
            this.f10895b = str2;
        }

        public final String a() {
            return this.f10894a;
        }

        public final String b() {
            return this.f10895b;
        }
    }

    void J(List list);

    void finish();
}