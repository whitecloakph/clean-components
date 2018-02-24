package com.whitecloak.cleancomponents.app.login;

import android.support.annotation.NonNull;

import com.whitecloak.cleancomponents.R;
import com.whitecloak.cleancomponents.app.common.base.BaseActivity;

import javax.inject.Inject;

public class LoginActivity extends BaseActivity<LoginView, LoginPresenter> implements LoginView {

    @Inject
    LoginPresenter presenter;

    @Override
    protected int getLayoutRes() {
        return R.layout.activity_login;
    }

    @NonNull
    @Override
    protected LoginView getMvpView() {
        return this;
    }

    @NonNull
    @Override
    protected LoginPresenter getMvpPresenter() {
        return presenter;
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
