package cab.shashki.app.db.entities;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public interface a {

    /* renamed from: cab.shashki.app.db.entities.a$a, reason: collision with other inner class name */
    public static final class C0141a {
        public static int a(a aVar) {
            return 0;
        }

        public static boolean b(a aVar) {
            return aVar.is4() || aVar.is6();
        }

        public static boolean c(a aVar) {
            return false;
        }

        public static boolean d(a aVar) {
            return false;
        }

        public static boolean e(a aVar) {
            return false;
        }
    }

    int boardExtra();

    int columns();

    boolean extraPlayers();

    String id();

    boolean is3();

    boolean is4();

    boolean is6();

    String name();

    int rows();
}