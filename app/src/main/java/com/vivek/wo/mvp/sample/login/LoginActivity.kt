package com.vivek.wo.mvp.sample.login

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class LoginActivity : AppCompatActivity(), LoginView {
    lateinit var loginPresenter: LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginPresenter = LoginPresenter()
        loginPresenter.takeView(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        loginPresenter.dropView()
    }

    override fun setPresenter(presenter: LoginPresenter?) {
    }

    override fun loginErrorText() {
    }
}