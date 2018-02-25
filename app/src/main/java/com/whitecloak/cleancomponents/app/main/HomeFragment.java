package com.whitecloak.cleancomponents.app.main;

import android.os.Bundle;
import android.support.annotation.NonNull;

import com.whitecloak.cleancomponents.R;
import com.whitecloak.cleancomponents.app.common.base.BaseMvpFragment;

import javax.inject.Inject;

public class HomeFragment extends BaseMvpFragment<HomeView, HomePresenter> implements HomeView {

    @Inject
    HomePresenter presenter;

    public static HomeFragment newInstance() {
        Bundle args = new Bundle();

        HomeFragment fragment = new HomeFragment();
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_home;
    }

    @NonNull
    @Override
    protected HomePresenter getMvpPresenter() {
        return presenter;
    }

    @NonNull
    @Override
    protected HomeView getMvpView() {
        return this;
    }

    @Override
    protected void setupDependencies() {

    }

    @Override
    protected void setupViews() {

    }

    @Override
    protected void loadContent() {

    }
}
