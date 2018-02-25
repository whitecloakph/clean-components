package com.whitecloak.cleancomponents.app.common.injection;

import com.whitecloak.cleancomponents.app.login.LoginActivity;
import com.whitecloak.cleancomponents.app.login.LoginModule;
import com.whitecloak.cleancomponents.app.main.HomeFragment;
import com.whitecloak.cleancomponents.app.main.HomeModule;
import com.whitecloak.cleancomponents.app.main.MainActivity;
import com.whitecloak.cleancomponents.app.main.SettingsFragment;
import com.whitecloak.cleancomponents.app.main.SettingsModule;
import com.whitecloak.cleancomponents.app.main.StoreFragment;
import com.whitecloak.cleancomponents.app.main.StoreModule;
import com.whitecloak.cleancomponents.app.main.SubscriptionsFragment;
import com.whitecloak.cleancomponents.app.main.SubscriptionsModule;
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

    @ContributesAndroidInjector
    abstract MainActivity mainActivity();

    @ContributesAndroidInjector(modules = HomeModule.class)
    abstract HomeFragment homeFragment();

    @ContributesAndroidInjector(modules = StoreModule.class)
    abstract StoreFragment storeFragment();

    @ContributesAndroidInjector(modules = SubscriptionsModule.class)
    abstract SubscriptionsFragment subscriptionsFragment();

    @ContributesAndroidInjector(modules = SettingsModule.class)
    abstract SettingsFragment settingsFragment();
}
