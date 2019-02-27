package com.vivek.wo.mvp.sample.login

import com.vivek.wo.mvp.basemvp.BasePresenter

class LoginPresenter : BasePresenter<LoginView> {
    private var loginView: LoginView? = null

    override fun takeView(view: LoginView) {
        loginView = view
    }

    override fun dropView() {
        loginView = null
    }

    fun login(account: String, password: String) {

    }

}