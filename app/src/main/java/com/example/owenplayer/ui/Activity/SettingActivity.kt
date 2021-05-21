package com.example.owenplayer.ui.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.example.owenplayer.R
import com.example.owenplayer.base.BaseActivity
import com.example.owenplayer.util.ToolBarManager

class SettingActivity :BaseActivity(),ToolBarManager {
    override lateinit var  toolbar: androidx.appcompat.widget.Toolbar
    override fun getLayoutId(): Int {
        return R.layout.activity_setting
    }
    override fun initData() {
        toolbar=  findViewById(R.id.toolbar)
        initSettingToolbar()
    }
}