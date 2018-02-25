package com.whitecloak.cleancomponents.app.main;

import dagger.Module;
import dagger.Provides;

@Module
public class SettingsModule {

    @Provides
    SettingsPresenter presenter() {
        return new SettingsPresenter();
    }
}
