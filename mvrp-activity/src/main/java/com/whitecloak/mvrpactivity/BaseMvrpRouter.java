package com.whitecloak.mvrpactivity;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

import com.whitecloak.cleancomponents.mvrp.MvrpRouter;

public abstract class BaseMvrpRouter implements MvrpRouter {

    private final Activity mActivity;
    private final FragmentManager mFragmentManager;

    public BaseMvrpRouter(@NonNull Activity activity) {
        mActivity = activity;
        mFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
    }

    @Override
    public Activity getActivity() {
        return mActivity;
    }

    @Override
    public void back() {
        if (mFragmentManager.getBackStackEntryCount() > 0) {
            mFragmentManager.popBackStack();
            return;
        }

        finish();
    }

    @Override
    public void finish() {
        mActivity.finish();
    }
}
