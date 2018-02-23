package com.whitecloak.mvrpactivity;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.whitecloak.cleancomponents.mvp.MvpView;
import com.whitecloak.cleancomponents.mvrp.MvrpPresenter;
import com.whitecloak.cleancomponents.mvrp.MvrpRouter;

public abstract class MvrpActivity<V extends MvpView, R extends MvrpRouter, P extends MvrpPresenter<V, R>> extends AppCompatActivity {

    private P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupDependencies();

        mPresenter = getMvpPresenter();
        mPresenter.attachView(getMvpView());
        mPresenter.attachRouter(getMvpRouter());

        setContentView(getLayoutRes());
        setupViews();

        loadContent();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.detachView();
        mPresenter.detachRouter();
    }

    @LayoutRes
    protected abstract int getLayoutRes();

    @NonNull
    protected abstract V getMvpView();

    @NonNull
    protected abstract R getMvpRouter();

    @NonNull
    protected abstract P getMvpPresenter();

    protected abstract void setupDependencies();

    protected abstract void setupViews();

    protected abstract void loadContent();
}
