package com.whitecloak.cleancomponents.mvpactivity;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.whitecloak.cleancomponents.mvp.MvpPresenter;
import com.whitecloak.cleancomponents.mvp.MvpView;

public abstract class AutoMvpActivity<V extends MvpView, P extends MvpPresenter<V>> extends AppCompatActivity {

    private P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupDependencies();

        mPresenter = getMvpPresenter();
        mPresenter.attachView(getMvpView());

        setContentView(getLayoutRes());
        setupViews();

        loadContent();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.detachView();
    }

    @LayoutRes
    protected abstract int getLayoutRes();

    @NonNull
    protected abstract V getMvpView();

    @NonNull
    protected abstract P getMvpPresenter();

    protected abstract void setupDependencies();

    protected abstract void setupViews();

    protected abstract void loadContent();
}
