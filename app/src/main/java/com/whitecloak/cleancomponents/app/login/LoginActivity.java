package com.whitecloak.cleancomponents.app.login;

import android.support.annotation.NonNull;
import android.widget.TextView;

import com.whitecloak.cleancomponents.R;
import com.whitecloak.cleancomponents.app.common.base.BaseActivity;

import javax.inject.Inject;

import butterknife.BindView;

public class LoginActivity extends BaseActivity<LoginView, LoginPresenter> implements LoginView {

    @BindView(R.id.text_username)
    TextView usernameView;

    @BindView(R.id.text_password)
    TextView passwordView;

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
