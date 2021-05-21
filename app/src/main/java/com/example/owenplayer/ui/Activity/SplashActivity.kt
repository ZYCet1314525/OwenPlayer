package com.example.owenplayer.ui.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.ViewCompat
import androidx.core.view.ViewPropertyAnimatorListener
import com.example.owenplayer.MainActivity
import org.jetbrains.anko.*
import com.example.owenplayer.R
import com.example.owenplayer.base.BaseActivity

class SplashActivity : BaseActivity(), ViewPropertyAnimatorListener {
    override fun getLayoutId(): Int {
        return R.layout.activity_splash
    }
    override fun initData() {
        //对界面做1.5到1倍缩小的处理
        ViewCompat.animate(findViewById(R.id.imageView)).scaleX(1.0f).scaleY(1.0f).setListener(this)
    }

    override fun onAnimationStart(view: View?) {

    }

    override fun onAnimationEnd(view: View?) {
        //动画结束 进入主界面
        startActivityAndFinish<MainActivity>()
    }

    override fun onAnimationCancel(view: View?) {

    }
}