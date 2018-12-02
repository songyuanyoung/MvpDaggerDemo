package com.veoride.mvpdaggerdemo.login;

import com.veoride.mvpdaggerdemo.di.ActivityScoped;
import com.veoride.mvpdaggerdemo.di.FragmentScoped;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

@Module
public class LoginModule {

    private LoginContract.View view;



    @FragmentScoped
    @Provides
    LoginFragment providesLoginFragment() {
        return new LoginFragment();
    };


    @ActivityScoped
    @Provides
    LoginPresenter providesLoginPresenter() {
        return new LoginPresenter(view);
    }

}
