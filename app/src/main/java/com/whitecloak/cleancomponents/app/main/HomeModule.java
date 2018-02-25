package com.whitecloak.cleancomponents.app.main;

import dagger.Module;
import dagger.Provides;

@Module
public class HomeModule {

    @Provides
    HomePresenter presenter() {
        return new HomePresenter();
    }
}
