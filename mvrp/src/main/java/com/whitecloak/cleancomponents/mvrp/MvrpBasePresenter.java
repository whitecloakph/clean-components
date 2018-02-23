package com.whitecloak.cleancomponents.mvrp;

import com.whitecloak.cleancomponents.mvp.MvpBasePresenter;
import com.whitecloak.cleancomponents.mvp.MvpView;

public abstract class MvrpBasePresenter<V extends MvpView, R extends MvrpRouter> extends MvpBasePresenter<V> implements MvrpPresenter<V, R> {

    private R mRouter;

    @Override
    public void attachRouter(R router) {
        mRouter = router;
    }

    @Override
    public void detachRouter() {
        mRouter = null;
    }

    @Override
    public boolean isRouterAttached() {
        return mRouter != null;
    }

    @Override
    public R getRouter() {
        return mRouter;
    }

    @Override
    public void checkRouterAttached() {
        if (!isRouterAttached()) throw new RouterNotAttachedException();
    }

    public static class RouterNotAttachedException extends RuntimeException {
        public RouterNotAttachedException() {
            super("Please call Presenter.attachRouter(MvpRouter) before" +
                    " requesting data to the Presenter");
        }
    }
}

