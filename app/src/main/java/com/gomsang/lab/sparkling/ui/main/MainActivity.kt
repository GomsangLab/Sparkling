package com.gomsang.lab.sparkling.ui.main

import com.gomsang.lab.sparkling.R
import org.koin.androidx.viewmodel.ext.android.viewModel
import com.gomsang.lab.sparkling.libs.base.BaseActivity
import com.gomsang.lab.sparkling.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {
    override val layoutResourceId: Int get() = R.layout.activity_main
    override val viewModel: MainViewModel by viewModel()

    override fun initStartView() {
    }

    override fun initDataBinding() {
    }

    override fun initAfterBinding() {
    }
}