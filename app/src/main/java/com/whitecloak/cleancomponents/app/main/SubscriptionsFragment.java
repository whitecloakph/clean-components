package com.whitecloak.cleancomponents.app.main;

import android.os.Bundle;
import android.support.annotation.NonNull;

import com.whitecloak.cleancomponents.R;
import com.whitecloak.cleancomponents.app.common.base.BaseMvrpFragment;

import javax.inject.Inject;

public class SubscriptionsFragment extends BaseMvrpFragment<SubscriptionsView, SubscriptionsRouter, SubscriptionsPresenter> implements
        SubscriptionsView {

    @Inject
    SubscriptionsPresenter presenter;

    public static SubscriptionsFragment newInstance() {
        Bundle args = new Bundle();

        SubscriptionsFragment fragment = new SubscriptionsFragment();
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_subscriptions;
    }

    @NonNull
    @Override
    protected SubscriptionsPresenter getMvpPresenter() {
        return presenter;
    }

    @NonNull
    @Override
    protected SubscriptionsView getMvpView() {
        return this;
    }

    @NonNull
    @Override
    protected SubscriptionsRouter getMvpRouter() {
        return new SubscriptionsRouter(getActivity());
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
