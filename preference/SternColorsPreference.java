package cab.shashki.app.preference;

import G0.a0;
import U2.p;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.preference.DialogPreference;
import cab.shashki.app.preference.SternColorsPreference;
import f0.AbstractC0922z;
import g3.InterfaceC1016l;
import h3.h;
import h3.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p3.AbstractC1273a;
import p3.n;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class SternColorsPreference extends DialogPreference {

    /* renamed from: Z, reason: collision with root package name */
    public static final a f10584Z = new a(null);

    /* renamed from: Y, reason: collision with root package name */
    private String f10585Y;

    public static final class a {
        public /* synthetic */ a(h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence d(int i4) {
            String string = Integer.toString(i4 & 16777215, AbstractC1273a.a(16));
            m.d(string, "toString(...)");
            return string;
        }

        public final List b(String str) {
            m.e(str, "colors");
            List listH0 = n.h0(str, new char[]{','}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(p.o(listH0, 10));
            Iterator it = listH0.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next(), AbstractC1273a.a(16)) | (-16777216)));
            }
            return arrayList;
        }

        public final String c(List list) {
            m.e(list, "colors");
            return p.N(list, ",", null, null, 0, null, new InterfaceC1016l() { // from class: p0.c
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return SternColorsPreference.a.d(((Integer) obj).intValue());
                }
            }, 30, null);
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SternColorsPreference(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        m.e(context, "context");
    }

    @Override // androidx.preference.DialogPreference
    public int I0() {
        return AbstractC0922z.f15143J0;
    }

    public final List N0() {
        List listB;
        String str = this.f10585Y;
        return (str == null || (listB = f10584Z.b(str)) == null) ? a0.f1214a.b() : listB;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public String U(TypedArray typedArray, int i4) {
        m.e(typedArray, "a");
        return typedArray.getString(i4);
    }

    public final void P0(String str) {
        this.f10585Y = str;
        h0(str);
        K();
    }

    @Override // androidx.preference.Preference
    protected void b0(boolean z4, Object obj) {
        String strV = null;
        if (z4) {
            strV = v(null);
        } else if (obj instanceof String) {
            strV = (String) obj;
        }
        P0(strV);
    }

    public /* synthetic */ SternColorsPreference(Context context, AttributeSet attributeSet, int i4, h hVar) {
        this(context, (i4 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SternColorsPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.e(context, "context");
    }
}