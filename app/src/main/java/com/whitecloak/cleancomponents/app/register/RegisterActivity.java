package com.whitecloak.cleancomponents.app.register;

import android.support.annotation.NonNull;
import android.widget.TextView;

import com.whitecloak.cleancomponents.R;
import com.whitecloak.cleancomponents.app.common.base.BaseMvrpActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;

public class RegisterActivity extends BaseMvrpActivity<RegisterView, RegisterRouter, RegisterPresenter> implements
        RegisterView {

    @BindView(R.id.text_username)
    TextView usernameView;

    @BindView(R.id.text_password)
    TextView passwordView;

    @Inject
    RegisterPresenter presenter;

    @Override
    protected int getLayoutRes() {
        return R.layout.activity_register;
    }

    @NonNull
    @Override
    protected RegisterView getMvpView() {
        return this;
    }

    @NonNull
    @Override
    protected RegisterRouter getMvpRouter() {
        return new RegisterRouter(this);
    }

    @NonNull
    @Override
    protected RegisterPresenter getMvpPresenter() {
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

    @OnClick(R.id.button_register)
    public void onClickRegister() {
        String username = usernameView.getText().toString();
        String password = passwordView.getText().toString();
        presenter.register(username, password);
    }
}
