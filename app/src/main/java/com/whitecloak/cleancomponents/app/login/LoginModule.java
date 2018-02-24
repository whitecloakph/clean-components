package com.whitecloak.cleancomponents.app.login;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {

    @Provides
    LoginPresenter providePresenter() {
        return new LoginPresenter();
    }
}
