package com.bdvisual.singleliner.ui.main;

import android.arch.lifecycle.LifecycleFragment;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bdvisual.singleliner.R;
import com.bdvisual.singleliner.databinding.FragmentMainBinding;

import javax.inject.Inject;

import dagger.android.support.AndroidSupportInjection;

public class MainFragment extends LifecycleFragment {

    @Inject
    ViewModelProvider.Factory viewModelFactory;

    private MainFragmentViewModel vm;
    private FragmentMainBinding binding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);
       return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        MainFragmentViewModel vm = ViewModelProviders.of(this, viewModelFactory).get(MainFragmentViewModel.class);
        binding.setVm(vm);
        binding.executePendingBindings();
    }

    @Override
    public void onAttach(Context context) {
        AndroidSupportInjection.inject(this);
        super.onAttach(context);
    }

}
