package com.whitecloak.cleancomponents.mvp;

public interface MvpPresenter<V extends MvpView> {

    void attachView(V mvpView);

    void detachView();

    boolean isViewAttached();

    V getView();

    void checkViewAttached();
}
