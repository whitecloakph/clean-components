package com.whitecloak.cleancomponents.mvrpfragment;

import com.whitecloak.cleancomponents.mvp.MvpView;
import com.whitecloak.cleancomponents.mvrp.MvrpPresenter;
import com.whitecloak.cleancomponents.mvrp.MvrpRouter;

public abstract class MvrpLazyFragment<V extends MvpView, R extends MvrpRouter, P extends MvrpPresenter<V, R>> extends MvrpFragment<V, R, P> {

    private boolean loaded;

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (!isVisibleToUser) return;
        if (!loaded) {
            loaded = true;
            lazyLoadContent();
        }
    }

    public abstract void lazyLoadContent();
}
