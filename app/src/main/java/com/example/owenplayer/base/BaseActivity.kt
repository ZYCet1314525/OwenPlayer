package com.example.owenplayer.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.owenplayer.MainActivity
import com.example.owenplayer.R
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.debug
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

abstract class BaseActivity:AppCompatActivity(), AnkoLogger {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initListener()
        initData()
        debug{ "haha"}
        //获取布局ID
    }

    open protected fun initData() {

    }
    //adapter和listener相关的方法
    open protected fun initListener() {

    }
    //获取布局Id 抽象方法
    abstract fun getLayoutId(): Int

    protected fun myToast(msg:String){
        runOnUiThread{ toast(msg) }
    }


    //封装跳转界面和结束界面的方法
    //anko库中 限制只能传Activity和Activity的子类
    //reified T:BaseActivity 标砖写法
    //前面需要加上inline 内联关键字
    inline fun <reified T:BaseActivity> startActivityAndFinish(){
        //开启一个Activity，并且Finish当前界面
        startActivity<T>()
        finish()
    }
}


