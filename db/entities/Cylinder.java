package cab.shashki.app.db.entities;

import a3.AbstractC0614b;
import a3.InterfaceC0613a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class Cylinder {
    private static final /* synthetic */ InterfaceC0613a $ENTRIES;
    private static final /* synthetic */ Cylinder[] $VALUES;

    /* renamed from: v, reason: collision with root package name */
    private final int f10571v;
    public static final Cylinder NONE = new Cylinder("NONE", 0, 0);
    public static final Cylinder HORIZONTAL = new Cylinder("HORIZONTAL", 1, 1);
    public static final Cylinder VERTICAL = new Cylinder("VERTICAL", 2, 2);

    private static final /* synthetic */ Cylinder[] $values() {
        return new Cylinder[]{NONE, HORIZONTAL, VERTICAL};
    }

    static {
        Cylinder[] cylinderArr$values = $values();
        $VALUES = cylinderArr$values;
        $ENTRIES = AbstractC0614b.a(cylinderArr$values);
    }

    private Cylinder(String str, int i4, int i5) {
        this.f10571v = i5;
    }

    public static InterfaceC0613a getEntries() {
        return $ENTRIES;
    }

    public static Cylinder valueOf(String str) {
        return (Cylinder) Enum.valueOf(Cylinder.class, str);
    }

    public static Cylinder[] values() {
        return (Cylinder[]) $VALUES.clone();
    }

    public final int getV() {
        return this.f10571v;
    }
}