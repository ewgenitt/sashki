package cab.shashki.app.db.entities;

import a3.AbstractC0614b;
import a3.InterfaceC0613a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class CaptureSelf {
    private static final /* synthetic */ InterfaceC0613a $ENTRIES;
    private static final /* synthetic */ CaptureSelf[] $VALUES;

    /* renamed from: v, reason: collision with root package name */
    private final int f10569v;
    public static final CaptureSelf NO = new CaptureSelf("NO", 0, 0);
    public static final CaptureSelf CAN = new CaptureSelf("CAN", 1, 1);
    public static final CaptureSelf MUST = new CaptureSelf("MUST", 2, 2);

    private static final /* synthetic */ CaptureSelf[] $values() {
        return new CaptureSelf[]{NO, CAN, MUST};
    }

    static {
        CaptureSelf[] captureSelfArr$values = $values();
        $VALUES = captureSelfArr$values;
        $ENTRIES = AbstractC0614b.a(captureSelfArr$values);
    }

    private CaptureSelf(String str, int i4, int i5) {
        this.f10569v = i5;
    }

    public static InterfaceC0613a getEntries() {
        return $ENTRIES;
    }

    public static CaptureSelf valueOf(String str) {
        return (CaptureSelf) Enum.valueOf(CaptureSelf.class, str);
    }

    public static CaptureSelf[] values() {
        return (CaptureSelf[]) $VALUES.clone();
    }

    public final int getV() {
        return this.f10569v;
    }
}