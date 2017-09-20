package com.bdvisual.singleliner.ui.main;

import android.app.Application;

import com.bdvisual.singleliner.R;
import com.bdvisual.singleliner.di.BaseViewModel;

import javax.inject.Inject;

public class MainFragmentViewModel extends BaseViewModel {

    @Inject
    public MainFragmentViewModel(Application application) {
        super(application);
    }

    public String getText() {
        return getApplication().getString(R.string.app_name);
    }
}
