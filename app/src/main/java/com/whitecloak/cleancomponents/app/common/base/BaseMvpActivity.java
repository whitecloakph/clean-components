package com.whitecloak.cleancomponents.app.common.base;

import android.support.v4.app.Fragment;

import com.whitecloak.cleancomponents.mvp.MvpPresenter;
import com.whitecloak.cleancomponents.mvp.MvpView;
import com.whitecloak.cleancomponents.mvpactivity.MvpActivity;

import javax.inject.Inject;

import butterknife.ButterKnife;
import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

public abstract class BaseMvpActivity<V extends MvpView, P extends MvpPresenter<V>> extends MvpActivity<V, P> implements
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
