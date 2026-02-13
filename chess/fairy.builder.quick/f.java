package cab.shashki.app.ui.chess.fairy.builder.quick;

import N0.C0573k;
import T2.u;
import U2.p;
import android.R;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import b0.InterfaceC0787a;
import cab.shashki.app.ui.chess.fairy.builder.quick.BetzaView;
import cab.shashki.app.ui.chess.fairy.builder.quick.BitBoardView;
import cab.shashki.app.ui.chess.fairy.builder.quick.FenView;
import cab.shashki.app.ui.chess.fairy.builder.quick.PieceSetView;
import cab.shashki.app.ui.chess.fairy.builder.quick.h;
import f0.AbstractC0920x;
import f0.AbstractC0922z;
import g0.C0955Y;
import g0.C0956Z;
import g0.C0958a0;
import g0.C0960b0;
import g0.C0962c0;
import g0.C0964d0;
import g0.C0966e0;
import g0.C0968f0;
import g0.C0970g0;
import g0.C0972h0;
import g0.C0974i0;
import g3.InterfaceC1005a;
import g3.InterfaceC1016l;
import h3.m;
import h3.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p3.n;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class f extends RecyclerView.h {

    /* renamed from: n, reason: collision with root package name */
    public static final a f11100n = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private final List f11101d;

    /* renamed from: e, reason: collision with root package name */
    private final List f11102e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC1016l f11103f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC1005a f11104g;

    /* renamed from: h, reason: collision with root package name */
    private final List f11105h;

    /* renamed from: i, reason: collision with root package name */
    private final Set f11106i;

    /* renamed from: j, reason: collision with root package name */
    private String f11107j;

    /* renamed from: k, reason: collision with root package name */
    private final InputFilter[] f11108k;

    /* renamed from: l, reason: collision with root package name */
    private final InputFilter[] f11109l;

    /* renamed from: m, reason: collision with root package name */
    private final InputFilter[] f11110m;

    public static final class a {
        public /* synthetic */ a(h3.h hVar) {
            this();
        }

        private a() {
        }
    }

    public static class b extends RecyclerView.D {

        /* renamed from: u, reason: collision with root package name */
        private final InterfaceC0787a f11111u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC0787a interfaceC0787a) {
            super(interfaceC0787a.a());
            m.e(interfaceC0787a, "binding");
            this.f11111u = interfaceC0787a;
        }

        public final InterfaceC0787a O() {
            return this.f11111u;
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11112a;

        static {
            int[] iArr = new int[h.e.values().length];
            try {
                iArr[h.e.f11130e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.e.f11129d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.e.f11131f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.e.f11134i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h.e.f11135j.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[h.e.f11139n.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[h.e.f11138m.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[h.e.f11132g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[h.e.f11133h.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f11112a = iArr;
        }
    }

    public f(List list, List list2, InterfaceC1016l interfaceC1016l, InterfaceC1005a interfaceC1005a) {
        m.e(list, "options");
        m.e(list2, "active");
        m.e(interfaceC1016l, "addOption");
        m.e(interfaceC1005a, "saveConfig");
        this.f11101d = list;
        this.f11102e = list2;
        this.f11103f = interfaceC1016l;
        this.f11104g = interfaceC1005a;
        this.f11105h = new ArrayList();
        this.f11106i = new LinkedHashSet();
        this.f11107j = "";
        this.f11108k = new InputFilter[]{new InputFilter() { // from class: z0.b0
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i4, int i5, Spanned spanned, int i6, int i7) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.f.H0(charSequence, i4, i5, spanned, i6, i7);
            }
        }};
        this.f11109l = new InputFilter[]{new InputFilter() { // from class: z0.c0
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i4, int i5, Spanned spanned, int i6, int i7) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.f.N0(charSequence, i4, i5, spanned, i6, i7);
            }
        }};
        this.f11110m = new InputFilter[]{new InputFilter() { // from class: z0.d0
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i4, int i5, Spanned spanned, int i6, int i7) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.f.O0(charSequence, i4, i5, spanned, i6, i7);
            }
        }};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u A0(h.c cVar, C0964d0 c0964d0, f fVar, String str) {
        m.e(str, "it");
        if (!m.a(str, cVar.i())) {
            cVar.k(str);
            c0964d0.f15633c.set(str);
            fVar.f11104g.a();
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B0(h.c cVar, C0964d0 c0964d0, f fVar, String str) {
        m.e(str, "it");
        if (m.a(str, cVar.i())) {
            return;
        }
        c0964d0.f15635e.setText(str);
        cVar.k(str);
        fVar.f11104g.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C0(C0964d0 c0964d0, f fVar, h.c cVar, C0964d0 c0964d02, View view) {
        if (c0964d0.f15633c.getVisibility() == 0) {
            fVar.f11106i.add(cVar);
            c0964d02.f15632b.setText("▼");
            c0964d02.f15633c.setVisibility(8);
        } else {
            fVar.f11106i.remove(cVar);
            c0964d02.f15632b.setText("▲");
            c0964d02.f15633c.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D0(f fVar, h.c cVar, View view) {
        fVar.f11103f.o(cVar);
    }

    private final void E0(C0972h0 c0972h0) {
        AppCompatEditText appCompatEditText = c0972h0.f15679b;
        if (Build.VERSION.SDK_INT >= 24) {
            appCompatEditText.setImeHintLocales(new LocaleList(Locale.US));
        }
        Object tag = appCompatEditText.getTag(AbstractC0920x.f14990Z1);
        appCompatEditText.removeTextChangedListener(tag instanceof TextWatcher ? (TextWatcher) tag : null);
        appCompatEditText.setText(this.f11107j);
        int i4 = AbstractC0920x.f14990Z1;
        C0573k c0573k = C0573k.f2973a;
        m.b(appCompatEditText);
        appCompatEditText.setTag(i4, c0573k.x(appCompatEditText, new InterfaceC1016l() { // from class: z0.M
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.f.F0(this.f20749d, (String) obj);
            }
        }));
        appCompatEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: z0.N
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i5, KeyEvent keyEvent) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.f.G0(this.f20752a, textView, i5, keyEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u F0(f fVar, String str) {
        m.e(str, "it");
        fVar.P0(str);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean G0(f fVar, TextView textView, int i4, KeyEvent keyEvent) {
        Object next;
        if (i4 != 6) {
            return false;
        }
        Iterator it = fVar.f11101d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            h.c cVar = (h.c) next;
            if (m.a(cVar.f(), fVar.f11107j) && !fVar.f11102e.contains(cVar)) {
                break;
            }
        }
        h.c cVar2 = (h.c) next;
        if (cVar2 == null) {
            return false;
        }
        fVar.f11103f.o(cVar2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence H0(CharSequence charSequence, int i4, int i5, Spanned spanned, int i6, int i7) throws IOException {
        m.b(charSequence);
        StringBuilder sb = new StringBuilder();
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            char cCharAt = charSequence.charAt(i8);
            if (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || (('0' <= cCharAt && cCharAt < ':') || n.B(" _-.,+:", cCharAt, false, 2, null)))) {
                sb.append(cCharAt);
            }
        }
        return sb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean L0(b bVar, h.c cVar, View view) {
        Toast.makeText(bVar.O().a().getContext(), cVar.e(), 0).show();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence N0(CharSequence charSequence, int i4, int i5, Spanned spanned, int i6, int i7) {
        Character chValueOf;
        String string;
        m.b(charSequence);
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char cCharAt = charSequence.charAt(i8);
            if (('a' <= cCharAt && cCharAt < '{') || cCharAt == '-') {
                chValueOf = Character.valueOf(cCharAt);
                break;
            }
        }
        chValueOf = null;
        return (chValueOf == null || (string = chValueOf.toString()) == null) ? "" : string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence O0(CharSequence charSequence, int i4, int i5, Spanned spanned, int i6, int i7) throws IOException {
        m.b(charSequence);
        StringBuilder sb = new StringBuilder();
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            char cCharAt = charSequence.charAt(i8);
            if (('a' <= cCharAt && cCharAt < '{') || (('0' <= cCharAt && cCharAt < ':') || n.B("WFDNAHLCJZGKRBQ:-", cCharAt, false, 2, null))) {
                sb.append(cCharAt);
            }
        }
        return sb;
    }

    private final void P0(String str) {
        if (m.a(this.f11107j, str)) {
            return;
        }
        this.f11107j = str;
        int size = this.f11105h.size();
        int size2 = this.f11102e.size() + 1;
        c0(str);
        int iMin = Math.min(size, this.f11105h.size());
        if (size > this.f11105h.size()) {
            r(size2 + iMin, size - this.f11105h.size());
        }
        if (iMin > 0) {
            p(size2, iMin);
        }
        if (this.f11105h.size() > size) {
            q(size2 + iMin, this.f11105h.size() - size);
        }
    }

    private final void c0(String str) {
        this.f11105h.clear();
        if (n.P(str)) {
            return;
        }
        List list = this.f11101d;
        List list2 = this.f11105h;
        for (Object obj : list) {
            h.c cVar = (h.c) obj;
            if (!this.f11102e.contains(cVar)) {
                String lowerCase = cVar.f().toLowerCase(Locale.ROOT);
                m.d(lowerCase, "toLowerCase(...)");
                if (n.x(lowerCase, str, false, 2, null) && cVar.g().a(this.f11102e, this.f11105h)) {
                    list2.add(obj);
                }
            }
        }
        List list3 = this.f11101d;
        List list4 = this.f11105h;
        for (Object obj2 : list3) {
            h.c cVar2 = (h.c) obj2;
            if (!this.f11102e.contains(cVar2)) {
                String lowerCase2 = cVar2.f().toLowerCase(Locale.ROOT);
                m.d(lowerCase2, "toLowerCase(...)");
                if (!n.x(lowerCase2, str, false, 2, null) && n.C(lowerCase2, str, false, 2, null) && cVar2.g().a(this.f11102e, this.f11105h)) {
                    list4.add(obj2);
                }
            }
        }
    }

    private final void d0(final C0955Y c0955y, final h.c cVar) throws NumberFormatException {
        c0955y.f15588d.setText(cVar.f());
        c0955y.f15589e.setText(cVar.i());
        c0955y.f15589e.setOnClickListener(new View.OnClickListener() { // from class: z0.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cab.shashki.app.ui.chess.fairy.builder.quick.f.r0(c0955y, this, cVar, view);
            }
        });
        c0955y.f15587c.i(Integer.parseInt(((h.c) this.f11102e.get(2)).i()), Integer.parseInt(((h.c) this.f11102e.get(1)).i()), cVar.i(), new BitBoardView.a() { // from class: z0.f0
            @Override // cab.shashki.app.ui.chess.fairy.builder.quick.BitBoardView.a
            public final void a(boolean z4, String str) {
                cab.shashki.app.ui.chess.fairy.builder.quick.f.s0(cVar, c0955y, this, z4, str);
            }
        });
        if (this.f11106i.contains(cVar)) {
            c0955y.f15587c.setVisibility(8);
            c0955y.f15586b.setText("▼");
        } else {
            c0955y.f15587c.setVisibility(0);
            c0955y.f15586b.setText("▲");
        }
    }

    private final void e0(C0956Z c0956z, final h.c cVar) throws Resources.NotFoundException {
        final SwitchCompat switchCompat = c0956z.f15591b;
        switchCompat.setText(cVar.f());
        switchCompat.setChecked(m.a(cVar.i(), "true"));
        switchCompat.setOnClickListener(new View.OnClickListener() { // from class: z0.O
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cab.shashki.app.ui.chess.fairy.builder.quick.f.x0(cVar, switchCompat, this, view);
            }
        });
    }

    private final void f0(C0958a0 c0958a0, final h.c cVar) {
        c0958a0.f15607b.setText(cVar.f());
        Object objC = cVar.c();
        m.c(objC, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        final List list = (List) objC;
        C0573k c0573k = C0573k.f2973a;
        Spinner spinner = c0958a0.f15608c;
        m.d(spinner, "value");
        c0573k.z(spinner, new InterfaceC1016l() { // from class: z0.X
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.f.y0(list, cVar, this, ((Integer) obj).intValue());
            }
        });
        ArrayAdapter arrayAdapter = new ArrayAdapter(c0958a0.a().getContext(), AbstractC0922z.f15220r0, R.id.text1);
        arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        arrayAdapter.addAll(list);
        c0958a0.f15608c.setAdapter((SpinnerAdapter) arrayAdapter);
        c0958a0.f15608c.setSelection(list.indexOf(cVar.i()));
    }

    private final void g0(final C0960b0 c0960b0, final h.c cVar) throws IOException {
        c0960b0.f15618d.setText(cVar.f());
        c0960b0.f15618d.setOnClickListener(new View.OnClickListener() { // from class: z0.P
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cab.shashki.app.ui.chess.fairy.builder.quick.f.o0(c0960b0, this, cVar, view);
            }
        });
        if (Build.VERSION.SDK_INT >= 24) {
            c0960b0.f15619e.setImeHintLocales(new LocaleList(Locale.US));
        }
        AppCompatEditText appCompatEditText = c0960b0.f15619e;
        Object tag = appCompatEditText.getTag(AbstractC0920x.f14990Z1);
        appCompatEditText.removeTextChangedListener(tag instanceof TextWatcher ? (TextWatcher) tag : null);
        c0960b0.f15619e.setText(cVar.i());
        AppCompatEditText appCompatEditText2 = c0960b0.f15619e;
        int i4 = AbstractC0920x.f14990Z1;
        C0573k c0573k = C0573k.f2973a;
        m.d(appCompatEditText2, "value");
        appCompatEditText2.setTag(i4, c0573k.x(appCompatEditText2, new InterfaceC1016l() { // from class: z0.Q
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.f.p0(cVar, this, c0960b0, (String) obj);
            }
        }));
        List list = this.f11102e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((h.c) obj).h() == h.e.f11131f) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p.o(arrayList, 10));
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj2 = arrayList.get(i5);
            i5++;
            Character chA0 = n.A0(((h.c) obj2).i());
            arrayList2.add(Character.valueOf(chA0 != null ? chA0.charValue() : ' '));
        }
        c0960b0.f15617c.b(Integer.parseInt(((h.c) this.f11102e.get(2)).i()), Integer.parseInt(((h.c) this.f11102e.get(1)).i()), p.N(arrayList2, "", null, null, 0, null, null, 62, null), cVar.i(), new FenView.a() { // from class: z0.S
            @Override // cab.shashki.app.ui.chess.fairy.builder.quick.FenView.a
            public final void a(String str) {
                cab.shashki.app.ui.chess.fairy.builder.quick.f.q0(cVar, this, c0960b0, str);
            }
        });
        if (this.f11106i.contains(cVar)) {
            c0960b0.f15617c.setVisibility(8);
            c0960b0.f15616b.setText("▼");
        } else {
            c0960b0.f15617c.setVisibility(0);
            c0960b0.f15616b.setText("▲");
        }
    }

    private final void h0(C0962c0 c0962c0, final h.c cVar) {
        AppCompatEditText appCompatEditText = c0962c0.f15627b;
        if (Build.VERSION.SDK_INT >= 24) {
            appCompatEditText.setImeHintLocales(new LocaleList(Locale.US));
        }
        appCompatEditText.setFilters(this.f11108k);
        Object tag = appCompatEditText.getTag(AbstractC0920x.f14990Z1);
        appCompatEditText.removeTextChangedListener(tag instanceof TextWatcher ? (TextWatcher) tag : null);
        appCompatEditText.setText(cVar.i());
        int i4 = AbstractC0920x.f14990Z1;
        C0573k c0573k = C0573k.f2973a;
        m.b(appCompatEditText);
        appCompatEditText.setTag(i4, c0573k.x(appCompatEditText, new InterfaceC1016l() { // from class: z0.V
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.f.n0(cVar, this, (String) obj);
            }
        }));
    }

    private final void i0(final C0964d0 c0964d0, final h.c cVar) {
        c0964d0.f15634d.setText(cVar.f());
        if (Build.VERSION.SDK_INT >= 24) {
            c0964d0.f15635e.setImeHintLocales(new LocaleList(Locale.US));
        }
        AppCompatEditText appCompatEditText = c0964d0.f15635e;
        Object tag = appCompatEditText.getTag(AbstractC0920x.f14990Z1);
        appCompatEditText.removeTextChangedListener(tag instanceof TextWatcher ? (TextWatcher) tag : null);
        c0964d0.f15635e.setText(cVar.i());
        AppCompatEditText appCompatEditText2 = c0964d0.f15635e;
        int i4 = AbstractC0920x.f14990Z1;
        C0573k c0573k = C0573k.f2973a;
        m.d(appCompatEditText2, "value");
        appCompatEditText2.setTag(i4, c0573k.x(appCompatEditText2, new InterfaceC1016l() { // from class: z0.g0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.f.A0(cVar, c0964d0, this, (String) obj);
            }
        }));
        c0964d0.f15633c.set(cVar.i());
        c0964d0.f15633c.O(new BetzaView.c() { // from class: z0.h0
            @Override // cab.shashki.app.ui.chess.fairy.builder.quick.BetzaView.c
            public final void a(String str) {
                cab.shashki.app.ui.chess.fairy.builder.quick.f.B0(cVar, c0964d0, this, str);
            }
        });
        if (n.x(cVar.f(), "custom", false, 2, null) || m.a(cVar.f(), "king")) {
            c0964d0.f15635e.setFilters(this.f11110m);
            c0964d0.f15632b.setVisibility(0);
            if (this.f11106i.contains(cVar)) {
                c0964d0.f15632b.setText("▼");
                c0964d0.f15633c.setVisibility(8);
            } else {
                c0964d0.f15632b.setText("▲");
                c0964d0.f15633c.setVisibility(0);
            }
        } else {
            c0964d0.f15632b.setVisibility(8);
            c0964d0.f15633c.setVisibility(8);
            c0964d0.f15635e.setFilters(this.f11109l);
        }
        c0964d0.f15632b.setOnClickListener(new View.OnClickListener() { // from class: z0.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cab.shashki.app.ui.chess.fairy.builder.quick.f.C0(c0964d0, this, cVar, c0964d0, view);
            }
        });
    }

    private final void j0(final C0966e0 c0966e0, final h.c cVar) throws IOException {
        c0966e0.f15641c.setText(cVar.f());
        c0966e0.f15643e.setOnClickListener(new View.OnClickListener() { // from class: z0.Y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cab.shashki.app.ui.chess.fairy.builder.quick.f.t0(c0966e0, this, cVar, view);
            }
        });
        if (Build.VERSION.SDK_INT >= 24) {
            c0966e0.f15643e.setImeHintLocales(new LocaleList(Locale.US));
        }
        AppCompatEditText appCompatEditText = c0966e0.f15643e;
        Object tag = appCompatEditText.getTag(AbstractC0920x.f14990Z1);
        appCompatEditText.removeTextChangedListener(tag instanceof TextWatcher ? (TextWatcher) tag : null);
        c0966e0.f15643e.setText(cVar.i());
        AppCompatEditText appCompatEditText2 = c0966e0.f15643e;
        int i4 = AbstractC0920x.f14990Z1;
        C0573k c0573k = C0573k.f2973a;
        m.d(appCompatEditText2, "value");
        appCompatEditText2.setTag(i4, c0573k.x(appCompatEditText2, new InterfaceC1016l() { // from class: z0.Z
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.f.u0(cVar, c0966e0, this, (String) obj);
            }
        }));
        List list = this.f11102e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((h.c) obj).h() == h.e.f11131f) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p.o(arrayList, 10));
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj2 = arrayList.get(i5);
            i5++;
            Character chA0 = n.A0(((h.c) obj2).i());
            arrayList2.add(Character.valueOf(chA0 != null ? chA0.charValue() : ' '));
        }
        c0966e0.f15642d.c(p.N(arrayList2, "", null, null, 0, null, null, 62, null), cVar.i(), cVar.h() == h.e.f11132g, new PieceSetView.a() { // from class: z0.a0
            @Override // cab.shashki.app.ui.chess.fairy.builder.quick.PieceSetView.a
            public final void a(String str) {
                cab.shashki.app.ui.chess.fairy.builder.quick.f.v0(cVar, c0966e0, this, str);
            }
        });
        if (this.f11106i.contains(cVar)) {
            c0966e0.f15642d.setVisibility(8);
            c0966e0.f15640b.setText("▼");
        } else {
            c0966e0.f15642d.setVisibility(0);
            c0966e0.f15640b.setText("▲");
        }
    }

    private final void k0(C0968f0 c0968f0, final h.c cVar) {
        c0968f0.f15657b.setText(androidx.core.text.b.a("<b>" + cVar.f() + "</b> " + cVar.e(), 0));
        c0968f0.f15657b.setOnClickListener(new View.OnClickListener() { // from class: z0.L
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cab.shashki.app.ui.chess.fairy.builder.quick.f.D0(this.f20746b, cVar, view);
            }
        });
    }

    private final void l0(final C0970g0 c0970g0, final h.c cVar) {
        String strI;
        Object objC = cVar.c();
        m.c(objC, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        final m3.g gVar = (m3.g) objC;
        TextView textView = c0970g0.f15666c;
        if (m.a(cVar.f(), "maxFile")) {
            strI = ((char) (((char) (Integer.parseInt(cVar.i()) + 97)) - 1)) + " (" + cVar.i() + ")";
        } else {
            strI = cVar.i();
        }
        textView.setText(strI);
        c0970g0.f15665b.setText(cVar.f());
        c0970g0.f15667d.setMax(gVar.d() - gVar.c());
        c0970g0.f15667d.setProgress(Integer.parseInt(cVar.i()) - gVar.c());
        C0573k c0573k = C0573k.f2973a;
        AppCompatSeekBar appCompatSeekBar = c0970g0.f15667d;
        m.d(appCompatSeekBar, "value");
        c0573k.y(appCompatSeekBar, new InterfaceC1016l() { // from class: z0.T
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.f.w0(gVar, c0970g0, cVar, this, ((Integer) obj).intValue());
            }
        });
    }

    private final void m0(C0974i0 c0974i0, final h.c cVar) {
        c0974i0.f15697b.setText(cVar.f());
        c0974i0.f15698c.setInputType(cVar.h() == h.e.f11137l ? 2 : 1);
        if (Build.VERSION.SDK_INT >= 24) {
            c0974i0.f15698c.setImeHintLocales(new LocaleList(Locale.US));
        }
        AppCompatEditText appCompatEditText = c0974i0.f15698c;
        Object tag = appCompatEditText.getTag(AbstractC0920x.f14990Z1);
        appCompatEditText.removeTextChangedListener(tag instanceof TextWatcher ? (TextWatcher) tag : null);
        c0974i0.f15698c.setText(cVar.i());
        AppCompatEditText appCompatEditText2 = c0974i0.f15698c;
        int i4 = AbstractC0920x.f14990Z1;
        C0573k c0573k = C0573k.f2973a;
        m.d(appCompatEditText2, "value");
        appCompatEditText2.setTag(i4, c0573k.x(appCompatEditText2, new InterfaceC1016l() { // from class: z0.U
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.f.z0(cVar, this, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u n0(h.c cVar, f fVar, String str) {
        m.e(str, "it");
        if (!m.a(str, cVar.i())) {
            cVar.k(str);
            fVar.f11104g.a();
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o0(C0960b0 c0960b0, f fVar, h.c cVar, View view) {
        if (c0960b0.f15617c.getVisibility() == 0) {
            fVar.f11106i.add(cVar);
            c0960b0.f15616b.setText("▼");
            c0960b0.f15617c.setVisibility(8);
        } else {
            fVar.f11106i.remove(cVar);
            c0960b0.f15616b.setText("▲");
            c0960b0.f15617c.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u p0(h.c cVar, f fVar, C0960b0 c0960b0, String str) {
        m.e(str, "it");
        if (!m.a(str, cVar.i())) {
            cVar.k(str);
            fVar.f11104g.a();
        }
        c0960b0.f15617c.setValue(str);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q0(h.c cVar, f fVar, C0960b0 c0960b0, String str) {
        m.e(str, "it");
        if (!m.a(str, cVar.i())) {
            cVar.k(str);
            fVar.f11104g.a();
        }
        c0960b0.f15619e.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(C0955Y c0955y, f fVar, h.c cVar, View view) {
        if (c0955y.f15587c.getVisibility() == 0) {
            fVar.f11106i.add(cVar);
            c0955y.f15586b.setText("▼");
            c0955y.f15587c.setVisibility(8);
        } else {
            fVar.f11106i.remove(cVar);
            c0955y.f15586b.setText("▲");
            c0955y.f15587c.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(h.c cVar, C0955Y c0955y, f fVar, boolean z4, String str) {
        m.e(str, "v");
        cVar.k(str);
        c0955y.f15589e.setText(str);
        if (z4) {
            fVar.f11104g.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(C0966e0 c0966e0, f fVar, h.c cVar, View view) {
        if (c0966e0.f15642d.getVisibility() == 0) {
            fVar.f11106i.add(cVar);
            c0966e0.f15640b.setText("▼");
            c0966e0.f15642d.setVisibility(8);
        } else {
            fVar.f11106i.remove(cVar);
            c0966e0.f15640b.setText("▲");
            c0966e0.f15642d.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u u0(h.c cVar, C0966e0 c0966e0, f fVar, String str) {
        m.e(str, "it");
        if (!m.a(str, cVar.i())) {
            cVar.k(str);
            c0966e0.f15642d.setValue(str);
            fVar.f11104g.a();
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(h.c cVar, C0966e0 c0966e0, f fVar, String str) {
        m.e(str, "it");
        cVar.k(str);
        c0966e0.f15643e.setText(str);
        fVar.f11104g.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u w0(m3.g gVar, C0970g0 c0970g0, h.c cVar, f fVar, int i4) {
        String strValueOf;
        int iC = i4 + gVar.c();
        TextView textView = c0970g0.f15666c;
        if (m.a(cVar.f(), "maxFile")) {
            strValueOf = ((char) (((char) (iC + 97)) - 1)) + " (" + iC + ")";
        } else {
            strValueOf = String.valueOf(iC);
        }
        textView.setText(strValueOf);
        cVar.k(String.valueOf(iC));
        fVar.f11104g.a();
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(h.c cVar, SwitchCompat switchCompat, f fVar, View view) {
        cVar.k(String.valueOf(switchCompat.isChecked()));
        fVar.f11104g.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u y0(List list, h.c cVar, f fVar, int i4) {
        String str = (String) list.get(i4);
        if (!m.a(cVar.i(), str)) {
            cVar.k(str);
            fVar.f11104g.a();
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u z0(h.c cVar, f fVar, String str) {
        m.e(str, "it");
        if (!m.a(str, cVar.i())) {
            cVar.k(str);
            fVar.f11104g.a();
        }
        return u.f3817a;
    }

    public final void I0(int i4) {
        s(i4);
        Set set = this.f11106i;
        y.a(set).remove(p.I(this.f11102e, i4));
    }

    public final void J0() {
        q(this.f11102e.size() - 1, 1);
        P0("");
        n(this.f11102e.size());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: K0, reason: merged with bridge method [inline-methods] */
    public void u(final b bVar, int i4) throws Resources.NotFoundException, NumberFormatException, IOException {
        m.e(bVar, "holder");
        final h.c cVar = i4 < this.f11102e.size() ? (h.c) this.f11102e.get(i4) : (h.c) p.I(this.f11105h, (i4 - this.f11102e.size()) - 1);
        if (cVar == null) {
            if (bVar.O() instanceof C0972h0) {
                E0((C0972h0) bVar.O());
                return;
            }
            return;
        }
        InterfaceC0787a interfaceC0787aO = bVar.O();
        if (interfaceC0787aO instanceof C0970g0) {
            l0((C0970g0) bVar.O(), cVar);
        } else if (interfaceC0787aO instanceof C0955Y) {
            d0((C0955Y) bVar.O(), cVar);
        } else if (interfaceC0787aO instanceof C0968f0) {
            k0((C0968f0) bVar.O(), cVar);
        } else if (interfaceC0787aO instanceof C0956Z) {
            e0((C0956Z) bVar.O(), cVar);
        } else if (interfaceC0787aO instanceof C0958a0) {
            f0((C0958a0) bVar.O(), cVar);
        } else if (interfaceC0787aO instanceof C0974i0) {
            m0((C0974i0) bVar.O(), cVar);
        } else if (interfaceC0787aO instanceof C0964d0) {
            i0((C0964d0) bVar.O(), cVar);
        } else if (interfaceC0787aO instanceof C0966e0) {
            j0((C0966e0) bVar.O(), cVar);
        } else if (interfaceC0787aO instanceof C0962c0) {
            h0((C0962c0) bVar.O(), cVar);
        } else if (interfaceC0787aO instanceof C0960b0) {
            g0((C0960b0) bVar.O(), cVar);
        }
        bVar.O().a().setOnLongClickListener(new View.OnLongClickListener() { // from class: z0.W
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.f.L0(bVar, cVar, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public b w(ViewGroup viewGroup, int i4) {
        InterfaceC0787a interfaceC0787aD;
        m.e(viewGroup, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        switch (i4) {
            case 0:
                interfaceC0787aD = C0955Y.d(layoutInflaterFrom, viewGroup, false);
                m.d(interfaceC0787aD, "inflate(...)");
                break;
            case 1:
                interfaceC0787aD = C0968f0.d(layoutInflaterFrom, viewGroup, false);
                m.d(interfaceC0787aD, "inflate(...)");
                break;
            case 2:
                interfaceC0787aD = C0972h0.d(layoutInflaterFrom, viewGroup, false);
                m.d(interfaceC0787aD, "inflate(...)");
                break;
            case 3:
                interfaceC0787aD = C0970g0.d(layoutInflaterFrom, viewGroup, false);
                m.d(interfaceC0787aD, "inflate(...)");
                break;
            case 4:
                interfaceC0787aD = C0964d0.d(layoutInflaterFrom, viewGroup, false);
                m.d(interfaceC0787aD, "inflate(...)");
                break;
            case 5:
                interfaceC0787aD = C0956Z.d(layoutInflaterFrom, viewGroup, false);
                m.d(interfaceC0787aD, "inflate(...)");
                break;
            case 6:
                interfaceC0787aD = C0958a0.d(layoutInflaterFrom, viewGroup, false);
                m.d(interfaceC0787aD, "inflate(...)");
                break;
            case 7:
            default:
                interfaceC0787aD = C0974i0.d(layoutInflaterFrom, viewGroup, false);
                m.d(interfaceC0787aD, "inflate(...)");
                break;
            case 8:
                interfaceC0787aD = C0960b0.d(layoutInflaterFrom, viewGroup, false);
                m.d(interfaceC0787aD, "inflate(...)");
                break;
            case 9:
                interfaceC0787aD = C0966e0.d(layoutInflaterFrom, viewGroup, false);
                m.d(interfaceC0787aD, "inflate(...)");
                break;
            case 10:
                interfaceC0787aD = C0962c0.d(layoutInflaterFrom, viewGroup, false);
                m.d(interfaceC0787aD, "inflate(...)");
                break;
        }
        return new b(interfaceC0787aD);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int h() {
        return this.f11102e.size() + 1 + this.f11105h.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int j(int i4) {
        if (i4 == this.f11102e.size()) {
            return 2;
        }
        if (i4 > this.f11102e.size()) {
            return 1;
        }
        switch (c.f11112a[((h.c) this.f11102e.get(i4)).h().ordinal()]) {
            case 1:
                return 5;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 0;
            case 5:
                return 6;
            case 6:
                return 10;
            case 7:
                return 8;
            case 8:
            case 9:
                return 9;
            default:
                return 7;
        }
    }
}