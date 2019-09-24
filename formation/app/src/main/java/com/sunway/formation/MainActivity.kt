package com.sunway.formation

import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.ActivityOptionsCompat
import com.alibaba.android.arouter.launcher.ARouter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test_btn.setOnClickListener {
            ARouter.getInstance()
                .build(Constance.NO_PARAM_ACT)
                .navigation()
        }

        test_btn2.setOnClickListener {
            if (Build.VERSION.SDK_INT >= 16) {
                val compat = ActivityOptionsCompat.makeScaleUpAnimation(it, it.width / 2, it.height / 2, 0, 0)
                val uri = Uri.parse(Constance.URI_PARAM_ACT)
                ARouter.getInstance()
                    .build(uri)
                    .withOptionsCompat(compat)
                    .navigation(this)
            } else {
                Toast.makeText(this, "API < 16,不支持新版本动画", Toast.LENGTH_SHORT).show()
            }
        }

        test_btn3.setOnClickListener {

            ARouter.getInstance()
                .build(Constance.PARAM_ACT)
                .withInt(ParamKeys.AGE, 27)
                .withString(ParamKeys.NAME, "BuMingYang")
                .navigation()

        }


    }
}
