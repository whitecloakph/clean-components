package com.whitecloak.cleancomponents.mvrp;

import com.whitecloak.cleancomponents.mvp.MvpPresenter;
import com.whitecloak.cleancomponents.mvp.MvpView;

public interface MvrpPresenter<V extends MvpView, R extends MvrpRouter> extends MvpPresenter<V> {

    void attachRouter(R mvpRouter);

    void detachRouter();

    boolean isRouterAttached();

    R getRouter();

    void checkRouterAttached();
}
