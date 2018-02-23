package com.whitecloak.cleancomponents.mvrp;

import android.app.Activity;

public interface MvrpRouter {

    Activity getActivity();

    void back();

    void finish();
}
