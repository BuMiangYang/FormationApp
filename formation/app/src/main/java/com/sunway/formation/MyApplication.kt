package com.sunway.formation

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter

/**
 *  @author BuMingYang
 *  @des
 */
class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        // 这两行必须写在init之前，否则这些配置在init过程中将无效
        if (BuildConfig.DEBUG) {
            // 打印日志
            ARouter.openLog()
            // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
            ARouter.openDebug()
        }

        ARouter.init(this)
    }
}