package com.whitecloak.cleancomponents.app.common.base;

import com.whitecloak.cleancomponents.mvp.MvpView;
import com.whitecloak.cleancomponents.mvrp.MvrpPresenter;
import com.whitecloak.cleancomponents.mvrp.MvrpRouter;
import com.whitecloak.mvrpactivity.MvrpActivity;

import butterknife.ButterKnife;
import dagger.android.AndroidInjection;

public abstract class BaseMvrpActivity<V extends MvpView, R extends MvrpRouter, P extends MvrpPresenter<V, R>> extends MvrpActivity<V, R, P> {

    @Override
    protected void preSetupDependencies() {
        AndroidInjection.inject(this);
    }

    @Override
    protected void preSetupViews() {
        ButterKnife.bind(this);
    }
}
