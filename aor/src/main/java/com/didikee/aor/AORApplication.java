package com.didikee.aor;

import android.app.Application;

import com.liulishuo.filedownloader.FileDownloader;

/**
 * Created by didik on 2017/3/28.
 */

public class AORApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        /**
         * 仅仅是缓存Application的Context，不耗时
         */
        FileDownloader.init(getApplicationContext());
    }
}
