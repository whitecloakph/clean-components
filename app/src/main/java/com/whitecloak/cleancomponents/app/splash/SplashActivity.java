package com.whitecloak.cleancomponents.app.splash;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.whitecloak.cleancomponents.app.login.LoginActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = LoginActivity.getStartIntent(this);
        startActivity(intent);

        finish();
    }
}
