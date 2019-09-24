package com.sunway.formation

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route

/**
 * @author BuMingYang
 * @des Activity的普通跳转
 */
@Route(path = Constance.NO_PARAM_ACT)
class NoParamActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
    }
}
