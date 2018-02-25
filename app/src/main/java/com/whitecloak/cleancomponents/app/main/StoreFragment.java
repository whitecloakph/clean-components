package com.whitecloak.cleancomponents.app.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.widget.Toast;

import com.whitecloak.cleancomponents.R;
import com.whitecloak.cleancomponents.app.common.base.BaseMvpLazyFragment;

import javax.inject.Inject;

public class StoreFragment extends BaseMvpLazyFragment<StoreView, StorePresenter> implements StoreView {

    @Inject
    StorePresenter presenter;

    public static StoreFragment newInstance() {
        Bundle args = new Bundle();

        StoreFragment fragment = new StoreFragment();
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_store;
    }

    @NonNull
    @Override
    protected StorePresenter getMvpPresenter() {
        return presenter;
    }

    @NonNull
    @Override
    protected StoreView getMvpView() {
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

    @Override
    public void lazyLoadContent() {
        Toast.makeText(getActivity(), "Lazy load content", Toast.LENGTH_SHORT).show();
    }
}
