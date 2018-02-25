package com.whitecloak.cleancomponents.app.login;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.widget.TextView;

import com.whitecloak.cleancomponents.R;
import com.whitecloak.cleancomponents.app.common.base.BaseMvpActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;

public class LoginActivity extends BaseMvpActivity<LoginView, LoginPresenter> implements LoginView {

    @BindView(R.id.text_username)
    TextView usernameView;

    @BindView(R.id.text_password)
    TextView passwordView;

    @Inject
    LoginPresenter presenter;

    public static Intent getStartIntent(@NonNull Context context) {
        return new Intent(context, LoginActivity.class);
    }

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

    @OnClick(R.id.button_login)
    public void onClickLogin() {
        String username = usernameView.getText().toString();
        String password = passwordView.getText().toString();
        presenter.login(username, password);
    }
}
