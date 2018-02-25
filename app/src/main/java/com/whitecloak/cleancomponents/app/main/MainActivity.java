package com.whitecloak.cleancomponents.app.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;

import com.whitecloak.cleancomponents.R;
import com.whitecloak.cleancomponents.app.common.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @BindView(R.id.view_pager)
    ViewPager viewPager;

    @BindView(R.id.bottom_navigation)
    BottomNavigationView bottomNavigationView;

    public static Intent getStartIntent(@NonNull Context context) {
        return new Intent(context, MainActivity.class);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));

        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    /* BottomNavigationView.OnNavigationItemSelectedListener */

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.action_home:
                viewPager.setCurrentItem(0);
                break;
            case R.id.action_store:
                viewPager.setCurrentItem(1);
                break;
            case R.id.action_settings:
                viewPager.setCurrentItem(2);
                break;
        }
        return true;
    }

    private static class ViewPagerAdapter extends FragmentPagerAdapter {

        ViewPagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;

            switch (position) {
                case 0:
                    fragment = HomeFragment.newInstance();
                    break;
                case 1:
                    fragment = StoreFragment.newInstance();
                    break;
                case 2:
                    fragment = SettingsFragment.newInstance();
                    break;
            }

            return fragment;
        }
    }
}
