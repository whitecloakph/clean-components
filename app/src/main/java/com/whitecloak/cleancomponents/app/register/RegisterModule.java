package com.whitecloak.cleancomponents.app.register;

import dagger.Module;
import dagger.Provides;

@Module
public class RegisterModule {

    @Provides
    RegisterPresenter presenter() {
        return new RegisterPresenter();
    }
}
