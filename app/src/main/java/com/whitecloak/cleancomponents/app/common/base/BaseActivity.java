package com.whitecloak.cleancomponents.app.common.base;

import com.whitecloak.cleancomponents.mvp.MvpPresenter;
import com.whitecloak.cleancomponents.mvp.MvpView;
import com.whitecloak.cleancomponents.mvpactivity.MvpActivity;

import butterknife.ButterKnife;
import dagger.android.AndroidInjection;

public abstract class BaseActivity<V extends MvpView, P extends MvpPresenter<V>> extends MvpActivity<V, P> {

    @Override
    protected void preSetupDepdencies() {
        AndroidInjection.inject(this);
    }

    @Override
    protected void preSetupViews() {
        ButterKnife.bind(this);
    }
}
