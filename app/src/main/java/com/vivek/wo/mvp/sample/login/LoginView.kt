package com.vivek.wo.mvp.sample.login

import com.vivek.wo.mvp.basemvp.BaseView

interface LoginView : BaseView<LoginPresenter> {

    fun loginErrorText()
}