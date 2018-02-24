package com.whitecloak.cleancomponents.app.common.injection;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    @Singleton
    static Context context(Application application) {
        return application;
    }
}
