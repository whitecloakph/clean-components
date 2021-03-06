package com.whitecloak.cleancomponents.mvrpfragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.whitecloak.cleancomponents.mvp.MvpView;
import com.whitecloak.cleancomponents.mvrp.MvrpPresenter;
import com.whitecloak.cleancomponents.mvrp.MvrpRouter;

public abstract class MvrpFragment<V extends MvpView, R extends MvrpRouter, P extends MvrpPresenter<V, R>> extends Fragment {

    private P mPresenter;

    @Override
    public void onAttach(Context context) {
        preSetupDependencies();
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(getLayoutRes(), container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupDependencies();

        mPresenter = getMvpPresenter();
        mPresenter.attachView(getMvpView());
        mPresenter.attachRouter(getMvpRouter());

        preSetupViews(view);
        setupViews();

        loadContent();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mPresenter.detachView();
        mPresenter.detachRouter();
    }

    @LayoutRes
    protected abstract int getLayoutRes();

    @NonNull
    protected abstract P getMvpPresenter();

    @NonNull
    protected abstract V getMvpView();

    @NonNull
    protected abstract R getMvpRouter();

    /**
     * Setup 3rd party libraries such as Dagger
     */
    protected abstract void preSetupDependencies();

    protected abstract void setupDependencies();

    /**
     * Setup 3rd party libraries such as ButterKnife or DataBinding
     *
     * @param view View
     */
    protected abstract void preSetupViews(@NonNull View view);

    protected abstract void setupViews();

    protected abstract void loadContent();
}
