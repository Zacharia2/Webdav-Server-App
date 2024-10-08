package com.xinglan.webdavserver.activity;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;

import androidx.annotation.NonNull;

public class WebdavServerApp extends Application {
    @SuppressLint("StaticFieldLeak")
    private static Context context;

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
    }

    public static Context getAppContext() {
        return context;
    }
}
