package cab.shashki.app.db;

import P.f;
import P.o;
import P.u;
import P.w;
import R.b;
import R.e;
import T.g;
import T.h;
import androidx.appcompat.app.x;
import cab.shashki.app.db.entities.HalmaParams;
import h0.C1028b;
import h0.C1032f;
import h0.C1034h;
import h0.InterfaceC1027a;
import h0.InterfaceC1031e;
import h0.InterfaceC1033g;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class ShashkiDatabase_Impl extends ShashkiDatabase {

    /* renamed from: p, reason: collision with root package name */
    private volatile InterfaceC1033g f10565p;

    /* renamed from: q, reason: collision with root package name */
    private volatile InterfaceC1027a f10566q;

    /* renamed from: r, reason: collision with root package name */
    private volatile InterfaceC1031e f10567r;

    @Override // cab.shashki.app.db.ShashkiDatabase
    public InterfaceC1027a C() {
        InterfaceC1027a interfaceC1027a;
        if (this.f10566q != null) {
            return this.f10566q;
        }
        synchronized (this) {
            try {
                if (this.f10566q == null) {
                    this.f10566q = new C1028b(this);
                }
                interfaceC1027a = this.f10566q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1027a;
    }

    @Override // cab.shashki.app.db.ShashkiDatabase
    public InterfaceC1031e D() {
        InterfaceC1031e interfaceC1031e;
        if (this.f10567r != null) {
            return this.f10567r;
        }
        synchronized (this) {
            try {
                if (this.f10567r == null) {
                    this.f10567r = new C1032f(this);
                }
                interfaceC1031e = this.f10567r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1031e;
    }

    @Override // cab.shashki.app.db.ShashkiDatabase
    public InterfaceC1033g E() {
        InterfaceC1033g interfaceC1033g;
        if (this.f10565p != null) {
            return this.f10565p;
        }
        synchronized (this) {
            try {
                if (this.f10565p == null) {
                    this.f10565p = new C1034h(this);
                }
                interfaceC1033g = this.f10565p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1033g;
    }

    @Override // P.u
    protected o g() {
        return new o(this, new HashMap(0), new HashMap(0), "Games", "Moves", "FireExtensions", "FireMessage", "AnaliseEntities", "AlterEntities", "Filter", "AlterMoves");
    }

    @Override // P.u
    protected h h(f fVar) {
        return fVar.f3253c.a(h.b.a(fVar.f3251a).c(fVar.f3252b).b(new w(fVar, new a(9), "48bf45e5c03d7257abb328f89cf09873", "0593aad3ff3e9f3007583f37c5520add")).a());
    }

    @Override // P.u
    public List j(Map map) {
        return Arrays.asList(new Q.a[0]);
    }

    @Override // P.u
    public Set o() {
        return new HashSet();
    }

    @Override // P.u
    protected Map p() {
        HashMap map = new HashMap();
        map.put(InterfaceC1033g.class, C1034h.u());
        map.put(InterfaceC1027a.class, C1028b.h());
        map.put(InterfaceC1031e.class, C1032f.e());
        return map;
    }

    class a extends w.b {
        a(int i4) {
            super(i4);
        }

        @Override // P.w.b
        public void a(g gVar) {
            gVar.o("CREATE TABLE IF NOT EXISTS `Games` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `date` INTEGER NOT NULL, `engine` INTEGER NOT NULL, `engine_state` INTEGER NOT NULL, `engine_time` INTEGER NOT NULL, `engine_diff` INTEGER NOT NULL, `engine_time_control` INTEGER NOT NULL, `white_time` INTEGER NOT NULL, `black_time` INTEGER NOT NULL, `rotation` INTEGER NOT NULL, `start_position` TEXT, `preview` TEXT)");
            gVar.o("CREATE TABLE IF NOT EXISTS `Moves` (`game` INTEGER NOT NULL, `number` INTEGER NOT NULL, `notation` TEXT NOT NULL, PRIMARY KEY(`game`, `number`), FOREIGN KEY(`game`) REFERENCES `Games`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            gVar.o("CREATE TABLE IF NOT EXISTS `FireExtensions` (`random` INTEGER NOT NULL, `player` INTEGER NOT NULL, `state` TEXT NOT NULL, `game` INTEGER NOT NULL, `token` TEXT NOT NULL, `request` INTEGER NOT NULL, `createdAt` INTEGER NOT NULL, `requestNew` INTEGER NOT NULL, `moveState` INTEGER NOT NULL, `tokenHash` INTEGER NOT NULL, `mute` INTEGER NOT NULL, `name` TEXT, PRIMARY KEY(`game`), FOREIGN KEY(`game`) REFERENCES `Games`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            gVar.o("CREATE TABLE IF NOT EXISTS `FireMessage` (`time` INTEGER NOT NULL, `state` INTEGER NOT NULL, `game` INTEGER NOT NULL, `message` TEXT NOT NULL, `position` TEXT, PRIMARY KEY(`game`, `time`), FOREIGN KEY(`game`) REFERENCES `Games`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            gVar.o("CREATE TABLE IF NOT EXISTS `AnaliseEntities` (`game` INTEGER NOT NULL, `n` INTEGER NOT NULL, `after` INTEGER NOT NULL, `score` INTEGER NOT NULL, `depth` INTEGER NOT NULL, `time` REAL NOT NULL, `pv` TEXT NOT NULL, PRIMARY KEY(`game`, `n`), FOREIGN KEY(`game`) REFERENCES `Games`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            gVar.o("CREATE TABLE IF NOT EXISTS `AlterEntities` (`game` INTEGER NOT NULL, `n` INTEGER NOT NULL, `after` INTEGER NOT NULL, `alternative` TEXT NOT NULL, `alter_after` INTEGER NOT NULL, `score` INTEGER NOT NULL, `depth` INTEGER NOT NULL, `time` REAL NOT NULL, `pv` TEXT NOT NULL, PRIMARY KEY(`game`, `n`), FOREIGN KEY(`game`) REFERENCES `Games`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            gVar.o("CREATE TABLE IF NOT EXISTS `Filter` (`type` INTEGER NOT NULL, `name` TEXT NOT NULL, `moves` TEXT NOT NULL, `from` INTEGER, `to` INTEGER, `ai` INTEGER NOT NULL, `multiplayer` INTEGER NOT NULL, `customPosition` INTEGER NOT NULL, `inverse` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
            gVar.o("CREATE TABLE IF NOT EXISTS `AlterMoves` (`game` INTEGER NOT NULL, `alter` INTEGER NOT NULL, `number` INTEGER NOT NULL, `notation` TEXT NOT NULL, PRIMARY KEY(`game`, `alter`, `number`), FOREIGN KEY(`game`) REFERENCES `Games`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            gVar.o("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.o("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '48bf45e5c03d7257abb328f89cf09873')");
        }

        @Override // P.w.b
        public void b(g gVar) {
            gVar.o("DROP TABLE IF EXISTS `Games`");
            gVar.o("DROP TABLE IF EXISTS `Moves`");
            gVar.o("DROP TABLE IF EXISTS `FireExtensions`");
            gVar.o("DROP TABLE IF EXISTS `FireMessage`");
            gVar.o("DROP TABLE IF EXISTS `AnaliseEntities`");
            gVar.o("DROP TABLE IF EXISTS `AlterEntities`");
            gVar.o("DROP TABLE IF EXISTS `Filter`");
            gVar.o("DROP TABLE IF EXISTS `AlterMoves`");
            if (((u) ShashkiDatabase_Impl.this).f3335h == null || ((u) ShashkiDatabase_Impl.this).f3335h.size() <= 0) {
                return;
            }
            x.a(((u) ShashkiDatabase_Impl.this).f3335h.get(0));
            throw null;
        }

        @Override // P.w.b
        public void c(g gVar) {
            if (((u) ShashkiDatabase_Impl.this).f3335h == null || ((u) ShashkiDatabase_Impl.this).f3335h.size() <= 0) {
                return;
            }
            x.a(((u) ShashkiDatabase_Impl.this).f3335h.get(0));
            throw null;
        }

        @Override // P.w.b
        public void d(g gVar) {
            ((u) ShashkiDatabase_Impl.this).f3328a = gVar;
            gVar.o("PRAGMA foreign_keys = ON");
            ShashkiDatabase_Impl.this.v(gVar);
            if (((u) ShashkiDatabase_Impl.this).f3335h == null || ((u) ShashkiDatabase_Impl.this).f3335h.size() <= 0) {
                return;
            }
            x.a(((u) ShashkiDatabase_Impl.this).f3335h.get(0));
            throw null;
        }

        @Override // P.w.b
        public void f(g gVar) {
            b.a(gVar);
        }

        @Override // P.w.b
        public w.c g(g gVar) {
            HashMap map = new HashMap(12);
            map.put(HalmaParams.ID, new e.a(HalmaParams.ID, "INTEGER", true, 1, null, 1));
            map.put("date", new e.a("date", "INTEGER", true, 0, null, 1));
            map.put("engine", new e.a("engine", "INTEGER", true, 0, null, 1));
            map.put("engine_state", new e.a("engine_state", "INTEGER", true, 0, null, 1));
            map.put("engine_time", new e.a("engine_time", "INTEGER", true, 0, null, 1));
            map.put("engine_diff", new e.a("engine_diff", "INTEGER", true, 0, null, 1));
            map.put("engine_time_control", new e.a("engine_time_control", "INTEGER", true, 0, null, 1));
            map.put("white_time", new e.a("white_time", "INTEGER", true, 0, null, 1));
            map.put("black_time", new e.a("black_time", "INTEGER", true, 0, null, 1));
            map.put("rotation", new e.a("rotation", "INTEGER", true, 0, null, 1));
            map.put("start_position", new e.a("start_position", "TEXT", false, 0, null, 1));
            map.put("preview", new e.a("preview", "TEXT", false, 0, null, 1));
            e eVar = new e("Games", map, new HashSet(0), new HashSet(0));
            e eVarA = e.a(gVar, "Games");
            if (!eVar.equals(eVarA)) {
                return new w.c(false, "Games(cab.shashki.app.db.entities.Game).\n Expected:\n" + eVar + "\n Found:\n" + eVarA);
            }
            HashMap map2 = new HashMap(3);
            map2.put("game", new e.a("game", "INTEGER", true, 1, null, 1));
            map2.put("number", new e.a("number", "INTEGER", true, 2, null, 1));
            map2.put("notation", new e.a("notation", "TEXT", true, 0, null, 1));
            HashSet hashSet = new HashSet(1);
            hashSet.add(new e.c("Games", "CASCADE", "NO ACTION", Arrays.asList("game"), Arrays.asList(HalmaParams.ID)));
            e eVar2 = new e("Moves", map2, hashSet, new HashSet(0));
            e eVarA2 = e.a(gVar, "Moves");
            if (!eVar2.equals(eVarA2)) {
                return new w.c(false, "Moves(cab.shashki.app.db.entities.Move).\n Expected:\n" + eVar2 + "\n Found:\n" + eVarA2);
            }
            HashMap map3 = new HashMap(12);
            map3.put("random", new e.a("random", "INTEGER", true, 0, null, 1));
            map3.put("player", new e.a("player", "INTEGER", true, 0, null, 1));
            map3.put("state", new e.a("state", "TEXT", true, 0, null, 1));
            map3.put("game", new e.a("game", "INTEGER", true, 1, null, 1));
            map3.put("token", new e.a("token", "TEXT", true, 0, null, 1));
            map3.put("request", new e.a("request", "INTEGER", true, 0, null, 1));
            map3.put("createdAt", new e.a("createdAt", "INTEGER", true, 0, null, 1));
            map3.put("requestNew", new e.a("requestNew", "INTEGER", true, 0, null, 1));
            map3.put("moveState", new e.a("moveState", "INTEGER", true, 0, null, 1));
            map3.put("tokenHash", new e.a("tokenHash", "INTEGER", true, 0, null, 1));
            map3.put("mute", new e.a("mute", "INTEGER", true, 0, null, 1));
            map3.put(HalmaParams.NAME, new e.a(HalmaParams.NAME, "TEXT", false, 0, null, 1));
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new e.c("Games", "CASCADE", "NO ACTION", Arrays.asList("game"), Arrays.asList(HalmaParams.ID)));
            e eVar3 = new e("FireExtensions", map3, hashSet2, new HashSet(0));
            e eVarA3 = e.a(gVar, "FireExtensions");
            if (!eVar3.equals(eVarA3)) {
                return new w.c(false, "FireExtensions(cab.shashki.app.db.entities.FireGameExtension).\n Expected:\n" + eVar3 + "\n Found:\n" + eVarA3);
            }
            HashMap map4 = new HashMap(5);
            map4.put("time", new e.a("time", "INTEGER", true, 2, null, 1));
            map4.put("state", new e.a("state", "INTEGER", true, 0, null, 1));
            map4.put("game", new e.a("game", "INTEGER", true, 1, null, 1));
            map4.put("message", new e.a("message", "TEXT", true, 0, null, 1));
            map4.put("position", new e.a("position", "TEXT", false, 0, null, 1));
            HashSet hashSet3 = new HashSet(1);
            hashSet3.add(new e.c("Games", "CASCADE", "NO ACTION", Arrays.asList("game"), Arrays.asList(HalmaParams.ID)));
            e eVar4 = new e("FireMessage", map4, hashSet3, new HashSet(0));
            e eVarA4 = e.a(gVar, "FireMessage");
            if (!eVar4.equals(eVarA4)) {
                return new w.c(false, "FireMessage(cab.shashki.app.db.entities.FireMessage).\n Expected:\n" + eVar4 + "\n Found:\n" + eVarA4);
            }
            HashMap map5 = new HashMap(7);
            map5.put("game", new e.a("game", "INTEGER", true, 1, null, 1));
            map5.put("n", new e.a("n", "INTEGER", true, 2, null, 1));
            map5.put("after", new e.a("after", "INTEGER", true, 0, null, 1));
            map5.put("score", new e.a("score", "INTEGER", true, 0, null, 1));
            map5.put("depth", new e.a("depth", "INTEGER", true, 0, null, 1));
            map5.put("time", new e.a("time", "REAL", true, 0, null, 1));
            map5.put("pv", new e.a("pv", "TEXT", true, 0, null, 1));
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new e.c("Games", "CASCADE", "NO ACTION", Arrays.asList("game"), Arrays.asList(HalmaParams.ID)));
            e eVar5 = new e("AnaliseEntities", map5, hashSet4, new HashSet(0));
            e eVarA5 = e.a(gVar, "AnaliseEntities");
            if (!eVar5.equals(eVarA5)) {
                return new w.c(false, "AnaliseEntities(cab.shashki.app.db.entities.AnaliseEntity).\n Expected:\n" + eVar5 + "\n Found:\n" + eVarA5);
            }
            HashMap map6 = new HashMap(9);
            map6.put("game", new e.a("game", "INTEGER", true, 1, null, 1));
            map6.put("n", new e.a("n", "INTEGER", true, 2, null, 1));
            map6.put("after", new e.a("after", "INTEGER", true, 0, null, 1));
            map6.put("alternative", new e.a("alternative", "TEXT", true, 0, null, 1));
            map6.put("alter_after", new e.a("alter_after", "INTEGER", true, 0, null, 1));
            map6.put("score", new e.a("score", "INTEGER", true, 0, null, 1));
            map6.put("depth", new e.a("depth", "INTEGER", true, 0, null, 1));
            map6.put("time", new e.a("time", "REAL", true, 0, null, 1));
            map6.put("pv", new e.a("pv", "TEXT", true, 0, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new e.c("Games", "CASCADE", "NO ACTION", Arrays.asList("game"), Arrays.asList(HalmaParams.ID)));
            e eVar6 = new e("AlterEntities", map6, hashSet5, new HashSet(0));
            e eVarA6 = e.a(gVar, "AlterEntities");
            if (!eVar6.equals(eVarA6)) {
                return new w.c(false, "AlterEntities(cab.shashki.app.db.entities.AlterEntity).\n Expected:\n" + eVar6 + "\n Found:\n" + eVarA6);
            }
            HashMap map7 = new HashMap(10);
            map7.put("type", new e.a("type", "INTEGER", true, 0, null, 1));
            map7.put(HalmaParams.NAME, new e.a(HalmaParams.NAME, "TEXT", true, 0, null, 1));
            map7.put("moves", new e.a("moves", "TEXT", true, 0, null, 1));
            map7.put("from", new e.a("from", "INTEGER", false, 0, null, 1));
            map7.put("to", new e.a("to", "INTEGER", false, 0, null, 1));
            map7.put("ai", new e.a("ai", "INTEGER", true, 0, null, 1));
            map7.put("multiplayer", new e.a("multiplayer", "INTEGER", true, 0, null, 1));
            map7.put("customPosition", new e.a("customPosition", "INTEGER", true, 0, null, 1));
            map7.put("inverse", new e.a("inverse", "INTEGER", true, 0, null, 1));
            map7.put(HalmaParams.ID, new e.a(HalmaParams.ID, "INTEGER", true, 1, null, 1));
            e eVar7 = new e("Filter", map7, new HashSet(0), new HashSet(0));
            e eVarA7 = e.a(gVar, "Filter");
            if (!eVar7.equals(eVarA7)) {
                return new w.c(false, "Filter(cab.shashki.app.db.entities.Filter).\n Expected:\n" + eVar7 + "\n Found:\n" + eVarA7);
            }
            HashMap map8 = new HashMap(4);
            map8.put("game", new e.a("game", "INTEGER", true, 1, null, 1));
            map8.put("alter", new e.a("alter", "INTEGER", true, 2, null, 1));
            map8.put("number", new e.a("number", "INTEGER", true, 3, null, 1));
            map8.put("notation", new e.a("notation", "TEXT", true, 0, null, 1));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new e.c("Games", "CASCADE", "NO ACTION", Arrays.asList("game"), Arrays.asList(HalmaParams.ID)));
            e eVar8 = new e("AlterMoves", map8, hashSet6, new HashSet(0));
            e eVarA8 = e.a(gVar, "AlterMoves");
            if (eVar8.equals(eVarA8)) {
                return new w.c(true, null);
            }
            return new w.c(false, "AlterMoves(cab.shashki.app.db.entities.AlterMove).\n Expected:\n" + eVar8 + "\n Found:\n" + eVarA8);
        }

        @Override // P.w.b
        public void e(g gVar) {
        }
    }
}