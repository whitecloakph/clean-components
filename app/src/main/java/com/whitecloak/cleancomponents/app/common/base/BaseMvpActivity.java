package com.whitecloak.cleancomponents.app.common.base;

import android.app.Fragment;

import com.whitecloak.cleancomponents.mvp.MvpPresenter;
import com.whitecloak.cleancomponents.mvp.MvpView;
import com.whitecloak.cleancomponents.mvpactivity.MvpActivity;

import javax.inject.Inject;

import butterknife.ButterKnife;
import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasFragmentInjector;

public abstract class BaseMvpActivity<V extends MvpView, P extends MvpPresenter<V>> extends MvpActivity<V, P> implements
        HasFragmentInjector {

    @Inject
    DispatchingAndroidInjector<Fragment> fragmentInjector;

    @Override
    public AndroidInjector<Fragment> fragmentInjector() {
        return fragmentInjector;
    }

    @Override
    protected void preSetupDepdencies() {
        AndroidInjection.inject(this);
    }

    @Override
    protected void preSetupViews() {
        ButterKnife.bind(this);
    }
}
