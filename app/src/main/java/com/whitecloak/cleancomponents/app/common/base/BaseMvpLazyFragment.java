package com.whitecloak.cleancomponents.app.common.base;

import android.support.annotation.NonNull;
import android.view.View;

import com.whitecloak.cleancomponents.mvp.MvpPresenter;
import com.whitecloak.cleancomponents.mvp.MvpView;
import com.whitecloak.cleancomponents.mvpfragment.MvpLazyFragment;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import dagger.android.support.AndroidSupportInjection;

public abstract class BaseMvpLazyFragment<V extends MvpView, P extends MvpPresenter<V>> extends MvpLazyFragment<V, P> {

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
