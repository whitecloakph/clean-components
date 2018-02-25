package com.whitecloak.cleancomponents.app.common.base;

import android.support.v4.app.Fragment;

import com.whitecloak.cleancomponents.mvp.MvpView;
import com.whitecloak.cleancomponents.mvrp.MvrpPresenter;
import com.whitecloak.cleancomponents.mvrp.MvrpRouter;
import com.whitecloak.mvrpactivity.MvrpActivity;

import javax.inject.Inject;

import butterknife.ButterKnife;
import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

public abstract class BaseMvrpActivity<V extends MvpView, R extends MvrpRouter, P extends MvrpPresenter<V, R>> extends MvrpActivity<V, R, P> implements
        HasSupportFragmentInjector {

    @Inject
    DispatchingAndroidInjector<Fragment> supportFragmentInjector;

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return supportFragmentInjector;
    }

    @Override
    protected void preSetupDependencies() {
        AndroidInjection.inject(this);
    }

    @Override
    protected void preSetupViews() {
        ButterKnife.bind(this);
    }
}
