package com.whitecloak.mvpfragment;

import com.whitecloak.cleancomponents.mvp.MvpPresenter;
import com.whitecloak.cleancomponents.mvp.MvpView;

public abstract class MvpLazyFragment<V extends MvpView, P extends MvpPresenter<V>> extends MvpFragment<V, P> {

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
