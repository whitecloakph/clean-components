package com.whitecloak.cleancomponents.app.main;

import dagger.Module;
import dagger.Provides;

@Module
public class StoreModule {

    @Provides
    StorePresenter presenter() {
        return new StorePresenter();
    }
}
