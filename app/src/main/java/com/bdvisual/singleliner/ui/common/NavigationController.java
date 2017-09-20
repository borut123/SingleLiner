package com.bdvisual.singleliner.ui.common;

import android.support.v4.app.FragmentManager;

import com.bdvisual.singleliner.R;
import com.bdvisual.singleliner.ui.main.MainActivity;
import com.bdvisual.singleliner.ui.main.MainFragment;

import javax.inject.Inject;

public class NavigationController {
    private final int containerId;
    private final FragmentManager fragmentManager;

    @Inject
    public NavigationController(MainActivity mainActivity) {
        this.containerId = R.id.container;
        this.fragmentManager = mainActivity.getSupportFragmentManager();
    }

    public void navigateToMain() {
        MainFragment fragment = new MainFragment();
        fragmentManager.beginTransaction()
                .replace(containerId, fragment)
                .commitAllowingStateLoss();
    }

}