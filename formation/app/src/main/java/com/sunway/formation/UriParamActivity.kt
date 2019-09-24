package com.sunway.formation

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route

/**
 *  @author BuMingYang
 *  @des Activity通过Uri的跳转
 */

@Route(path = Constance.URI_PARAM_ACT)
class UriParamActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
    }
}