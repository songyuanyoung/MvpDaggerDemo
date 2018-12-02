package com.veoride.mvpdaggerdemo.di;

import com.veoride.mvpdaggerdemo.login.LoginActivity;
import com.veoride.mvpdaggerdemo.login.LoginModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = LoginModule.class)
    abstract LoginActivity loginActivity();

}
