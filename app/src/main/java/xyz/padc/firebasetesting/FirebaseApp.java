package xyz.padc.firebasetesting;

import android.app.Application;
import android.content.Context;

import com.facebook.FacebookSdk;

/**
 * Created by winthanhtike on 8/21/16.
 */
public class FirebaseApp extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        FacebookSdk.sdkInitialize(getApplicationContext());
    }

    public static Context getContext() {
        return context;
    }
}
