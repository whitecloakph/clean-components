package com.whitecloak.cleancomponents.app.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.widget.Toast;

import com.whitecloak.cleancomponents.R;
import com.whitecloak.cleancomponents.app.common.base.BaseMvpLazyFragment;

import javax.inject.Inject;

public class SettingsFragment extends BaseMvpLazyFragment<SettingsView, SettingsPresenter> implements SettingsView {

    @Inject
    SettingsPresenter presenter;

    public static SettingsFragment newInstance() {
        Bundle args = new Bundle();

        SettingsFragment fragment = new SettingsFragment();
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_settings;
    }

    @NonNull
    @Override
    protected SettingsPresenter getMvpPresenter() {
        return presenter;
    }

    @NonNull
    @Override
    protected SettingsView getMvpView() {
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
