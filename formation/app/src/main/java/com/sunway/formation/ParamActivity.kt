package com.sunway.formation

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import kotlinx.android.synthetic.main.activity_result.*

/**
 *  @author BuMingYang
 *  @des 带参数跳转
 */
@Route(path = Constance.PARAM_ACT)
class ParamActivity : BaseActivity() {


    @Autowired(name = ParamKeys.NAME)
    @JvmField
    var name: String? = null

    @Autowired(name = ParamKeys.AGE)
    @JvmField
    var age: Int? = 0
    //注意

    private val tip =
        """
            只有当@Autowired(name = "key")，也就是key标签一致的情况下，才可以获取到对象的值,所以为了规避每一个可能会遇到的风险，建议在@Autowired里面 都写上与之对应具体的key名""".trimIndent()

    private val question = """

      var age: Int? = 0
      Int类型参数当var age: Int? = null 接收参数为null 当为0 -1 时可正常接收？
      具体原因未查找:初步判断 遵循Java 基础数据类型 和Kotlin 有一点区别
    """.trimIndent()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        //字符串模版
        tv_result.text = "name=$name , age=$age \n $tip \n $question "


    }
}