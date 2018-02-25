package com.whitecloak.cleancomponents.app.login;

import android.support.annotation.NonNull;

import com.whitecloak.cleancomponents.mvp.MvpBasePresenter;

public class LoginPresenter extends MvpBasePresenter<LoginView> {

    public LoginPresenter() {
    }

    public void login(@NonNull String username, @NonNull String password) {
        getView().showMain();
    }
}
