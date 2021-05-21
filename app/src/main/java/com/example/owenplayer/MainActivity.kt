package com.example.owenplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import com.example.owenplayer.base.BaseActivity
import com.example.owenplayer.util.ToolBarManager
import org.jetbrains.anko.find

class MainActivity : BaseActivity(),ToolBarManager {
    // by lazy { findViewById<Toolbar>(R.id.toolbar) }
    //延迟初始化toolbar
    override lateinit var  toolbar: androidx.appcompat.widget.Toolbar
    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initData() {
        toolbar=  findViewById(R.id.toolbar)
        initMainToolBar()
    }
}