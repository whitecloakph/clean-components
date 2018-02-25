package com.whitecloak.cleancomponents.app.common.base;

import android.support.annotation.NonNull;
import android.view.View;

import com.whitecloak.cleancomponents.mvp.MvpView;
import com.whitecloak.cleancomponents.mvrp.MvrpPresenter;
import com.whitecloak.cleancomponents.mvrp.MvrpRouter;
import com.whitecloak.cleancomponents.mvrpfragment.MvrpLazyFragment;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import dagger.android.support.AndroidSupportInjection;

public abstract class BaseMvrpLazyFragment<V extends MvpView, R extends MvrpRouter, P extends MvrpPresenter<V, R>> extends MvrpLazyFragment<V, R, P> {

    private Unbinder unbinder;

    @Override
    protected void preSetupDependencies() {
        AndroidSupportInjection.inject(this);
    }

    @Override
    protected void preSetupViews(@NonNull View view) {
        unbinder = ButterKnife.bind(this, view);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
