package com.whitecloak.cleancomponents.mvp;

public abstract class BasePresenter<T extends MvpView> implements MvpPresenter<T> {

    private T mView;

    @Override
    public void attachView(T view) {
        mView = view;
    }

    @Override
    public void detachView() {
        mView = null;
    }

    @Override
    public boolean isViewAttached() {
        return mView != null;
    }

    @Override
    public T getView() {
        return mView;
    }

    @SuppressWarnings("unused")
    @Override
    public void checkViewAttached() {
        if (!isViewAttached()) throw new ViewNotAttachedException();
    }

    @SuppressWarnings("unused")
    public static class ViewNotAttachedException extends RuntimeException {
        public ViewNotAttachedException() {
            super("Please call Presenter.attachView(MvpView) before" +
                    " requesting data to the Presenter");
        }
    }
}

