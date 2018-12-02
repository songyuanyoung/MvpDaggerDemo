package com.veoride.mvpdaggerdemo.login;

import javax.inject.Inject;

public class LoginPresenter implements LoginContract.Presenter {

    private LoginContract.View view;

    @Override
    public void login() {
        view.loginSuccess();
    }

    @Inject
    public LoginPresenter(LoginContract.View view) {
        this.view = view;
    }

    @Override
    public void takeView(LoginContract.View view) {

        this.view = view;
    }

    @Override
    public void dropView() {
        this.view = null;
    }
}
