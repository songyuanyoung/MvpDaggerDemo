package com.veoride.mvpdaggerdemo.login;

import com.veoride.mvpdaggerdemo.base.BasePresenter;
import com.veoride.mvpdaggerdemo.base.BaseView;

public interface LoginContract {
    interface View extends BaseView<Presenter> {
        void loginSuccess();
        void loginFailed();
    }

    interface Presenter extends BasePresenter<View> {
        void login();
    }
}
