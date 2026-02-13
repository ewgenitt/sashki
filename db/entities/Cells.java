package cab.shashki.app.db.entities;

import a3.AbstractC0614b;
import a3.InterfaceC0613a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class Cells {
    private static final /* synthetic */ InterfaceC0613a $ENTRIES;
    private static final /* synthetic */ Cells[] $VALUES;

    /* renamed from: v, reason: collision with root package name */
    private final int f10570v;
    public static final Cells BLACK = new Cells("BLACK", 0, 0);
    public static final Cells WHITE = new Cells("WHITE", 1, 1);
    public static final Cells ALL = new Cells("ALL", 2, 2);
    public static final Cells HEXAGON = new Cells("HEXAGON", 3, 3);
    public static final Cells ALQUERQUE = new Cells("ALQUERQUE", 4, 4);
    public static final Cells ZAMMA = new Cells("ZAMMA", 5, 5);
    public static final Cells DYNAMIC_HEX = new Cells("DYNAMIC_HEX", 6, 6);
    public static final Cells DYNAMIC_CHECKERS = new Cells("DYNAMIC_CHECKERS", 7, 7);

    private static final /* synthetic */ Cells[] $values() {
        return new Cells[]{BLACK, WHITE, ALL, HEXAGON, ALQUERQUE, ZAMMA, DYNAMIC_HEX, DYNAMIC_CHECKERS};
    }

    static {
        Cells[] cellsArr$values = $values();
        $VALUES = cellsArr$values;
        $ENTRIES = AbstractC0614b.a(cellsArr$values);
    }

    private Cells(String str, int i4, int i5) {
        this.f10570v = i5;
    }

    public static InterfaceC0613a getEntries() {
        return $ENTRIES;
    }

    public static Cells valueOf(String str) {
        return (Cells) Enum.valueOf(Cells.class, str);
    }

    public static Cells[] values() {
        return (Cells[]) $VALUES.clone();
    }

    public final int getV() {
        return this.f10570v;
    }

    public final boolean isDynamic() {
        int i4 = this.f10570v;
        return i4 == 6 || i4 == 7;
    }

    public final boolean isHex() {
        int i4 = this.f10570v;
        return i4 == 3 || i4 == 6;
    }
}