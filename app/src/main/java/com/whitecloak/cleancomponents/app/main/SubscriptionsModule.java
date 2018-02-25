package com.whitecloak.cleancomponents.app.main;

import dagger.Module;
import dagger.Provides;

@Module
public class SubscriptionsModule {

    @Provides
    SubscriptionsPresenter presenter() {
        return new SubscriptionsPresenter();
    }
}
