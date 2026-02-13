package cab.shashki.app.ui.universal;

import android.graphics.Bitmap;
import android.net.Uri;
import f0.InterfaceC0912p;
import h3.m;
import java.io.File;
import java.util.List;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public interface e extends InterfaceC0912p {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final cab.shashki.app.db.entities.a f11903a;

        /* renamed from: b, reason: collision with root package name */
        private final long f11904b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f11905c;

        public a(cab.shashki.app.db.entities.a aVar, long j4, boolean z4) {
            m.e(aVar, "engine");
            this.f11903a = aVar;
            this.f11904b = j4;
            this.f11905c = z4;
        }

        public final long a() {
            return this.f11904b;
        }

        public final cab.shashki.app.db.entities.a b() {
            return this.f11903a;
        }

        public final boolean c() {
            return this.f11905c;
        }
    }

    void N1(String str);

    void W0(String str);

    void a1(List list, cab.shashki.app.db.entities.a aVar);

    void b(int i4);

    void e();

    void finish();

    void h0(String str);

    void i0(File file);

    void j(Bitmap bitmap);

    void k0(Uri uri);

    void l(int i4, int i5, A2.c cVar);

    void o();

    void q(int i4);

    void s(String str);
}