package com.whitecloak.cleancomponents.app.common.injection;

import com.whitecloak.cleancomponents.app.login.LoginActivity;
import com.whitecloak.cleancomponents.app.login.LoginModule;
import com.whitecloak.cleancomponents.app.register.RegisterActivity;
import com.whitecloak.cleancomponents.app.register.RegisterModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules = LoginModule.class)
    abstract LoginActivity loginActivity();

    @ContributesAndroidInjector(modules = RegisterModule.class)
    abstract RegisterActivity registerActivity();
}
