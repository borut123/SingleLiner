package com.bdvisual.singleliner.di;

import com.bdvisual.singleliner.ui.main.MainFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentBuildersModule {

    @ContributesAndroidInjector
    abstract MainFragment contributeMainFragment();
}
