package com.whitecloak.cleancomponents.app.register;

import dagger.Provides;

public class RegisterModule {

    @Provides
    RegisterPresenter providePresenter() {
        return new RegisterPresenter();
    }
}
