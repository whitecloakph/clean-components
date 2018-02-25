package com.whitecloak.cleancomponents.mvrpactivity;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

import com.whitecloak.cleancomponents.mvrp.MvrpRouter;

public abstract class MvrpBaseRouter implements MvrpRouter {

    private final Activity mActivity;
    private final FragmentManager mFragmentManager;

    public MvrpBaseRouter(@NonNull Activity activity) {
        mActivity = activity;
        mFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
    }

    public Activity getActivity() {
        return mActivity;
    }

    public void back() {
        if (mFragmentManager.getBackStackEntryCount() > 0) {
            mFragmentManager.popBackStack();
            return;
        }

        finish();
    }

    public void finish() {
        mActivity.finish();
    }
}
