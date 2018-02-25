package com.whitecloak.cleancomponents.app.register;

import dagger.Module;
import dagger.Provides;

@Module
public class RegisterModule {

    @Provides
    RegisterPresenter providePresenter() {
        return new RegisterPresenter();
    }
}
