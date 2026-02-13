package cab.shashki.app.ui.imagebuilder;

import U2.p;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import b0.InterfaceC0787a;
import cab.shashki.app.db.entities.HalmaParams;
import e3.AbstractC0876b;
import e3.AbstractC0877c;
import f0.AbstractC0888D;
import f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L;
import h3.h;
import h3.m;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Iterator;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public abstract class a extends AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L {

    /* renamed from: L */
    public static final C0153a f11769L = new C0153a(null);

    /* renamed from: I */
    protected InterfaceC0787a f11770I;

    /* renamed from: J */
    private String f11771J = "image/png";

    /* renamed from: K */
    private final A2.b f11772K = new A2.b();

    /* renamed from: cab.shashki.app.ui.imagebuilder.a$a */
    public static final class C0153a {
        public /* synthetic */ C0153a(h hVar) {
            this();
        }

        private C0153a() {
        }
    }

    protected final InterfaceC0787a R2() {
        InterfaceC0787a interfaceC0787a = this.f11770I;
        if (interfaceC0787a != null) {
            return interfaceC0787a;
        }
        m.r("binding");
        return null;
    }

    protected final A2.b S2() {
        return this.f11772K;
    }

    protected abstract String T2();

    protected abstract InterfaceC0787a U2();

    protected final File V2(File file) {
        m.e(file, "base");
        Iterator it = p.j("collections", T2(), "tmp").iterator();
        while (it.hasNext()) {
            File file2 = new File(file, (String) it.next());
            if (!file2.exists()) {
                file2.mkdir();
            }
            file = file2;
        }
        return file;
    }

    protected final Bitmap W2(File file, Uri uri, String str) throws FileNotFoundException {
        m.e(file, "saveDir");
        m.e(uri, "uri");
        m.e(str, HalmaParams.NAME);
        File fileV2 = V2(file);
        InputStream inputStreamOpenInputStream = getContentResolver().openInputStream(uri);
        m.b(inputStreamOpenInputStream);
        File file2 = new File(fileV2, str);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            AbstractC0876b.a(inputStreamOpenInputStream, fileOutputStream, 4096);
            AbstractC0877c.a(fileOutputStream, null);
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file2.getAbsolutePath());
            m.d(bitmapDecodeFile, "decodeFile(...)");
            return bitmapDecodeFile;
        } finally {
        }
    }

    protected final void X2(String str) {
        m.e(str, HalmaParams.NAME);
        SharedPreferences.Editor editorEdit = E2().edit();
        String stringExtra = getIntent().getStringExtra("preference");
        if (stringExtra == null) {
            return;
        }
        editorEdit.putString(stringExtra, str).apply();
        setResult(-1);
        finish();
    }

    protected abstract void Y2(int i4, Uri uri);

    protected final void Z2(int i4) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType(this.f11771J);
        intent.addCategory("android.intent.category.OPENABLE");
        intent.putExtra("android.intent.extra.sizeLimit", 204800);
        try {
            startActivityForResult(Intent.createChooser(intent, getString(AbstractC0888D.f14384J)), i4);
        } catch (Exception unused) {
            Toast.makeText(this, AbstractC0888D.f14518n0, 0).show();
        }
    }

    protected final void a3(InterfaceC0787a interfaceC0787a) {
        m.e(interfaceC0787a, "<set-?>");
        this.f11770I = interfaceC0787a;
    }

    protected final void b3(String str) {
        m.e(str, "<set-?>");
        this.f11771J = str;
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i4, int i5, Intent intent) {
        Uri data;
        super.onActivityResult(i4, i5, intent);
        if (i5 != -1 || intent == null || (data = intent.getData()) == null) {
            return;
        }
        Y2(i4, data);
    }

    @Override // f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a3(U2());
        setContentView(R2().a());
        AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L.H2(this, AbstractC0888D.f14545s2, false, 2, null);
        setResult(0);
    }

    @Override // f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f11772K.d();
    }
}