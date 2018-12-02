package com.veoride.mvpdaggerdemo.login;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.veoride.mvpdaggerdemo.R;

import javax.inject.Inject;

import dagger.android.support.AndroidSupportInjection;
import dagger.android.support.DaggerFragment;

public class LoginFragment extends DaggerFragment implements LoginContract.View{

    @Inject
    LoginContract.Presenter presenter;



    @Inject
    public LoginFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        presenter.login();
        return view;
    }

    @Override
    public void loginSuccess() {

    }

    @Override
    public void loginFailed() {

    }
}
