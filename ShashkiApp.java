package cab.shashki.app;

import N.b;
import androidx.appcompat.app.d;
import h3.h;
import h3.m;
import k1.AbstractC1147d;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class ShashkiApp extends b {

    /* renamed from: c, reason: collision with root package name */
    private static ShashkiApp f10562c;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f10564e;

    /* renamed from: b, reason: collision with root package name */
    public static final a f10561b = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static boolean f10563d = true;

    public static final class a {
        public /* synthetic */ a(h hVar) {
            this();
        }

        public final ShashkiApp a() {
            ShashkiApp shashkiApp = ShashkiApp.f10562c;
            if (shashkiApp != null) {
                return shashkiApp;
            }
            m.r("app");
            return null;
        }

        public final boolean b() {
            return ShashkiApp.f10563d;
        }

        public final boolean c() {
            return ShashkiApp.f10564e;
        }

        public final void d(boolean z4) {
            ShashkiApp.f10564e = z4;
        }

        private a() {
        }
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        f10562c = this;
        d.C(true);
        try {
            AbstractC1147d.a(this, "shashki");
            f10563d = false;
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }
}