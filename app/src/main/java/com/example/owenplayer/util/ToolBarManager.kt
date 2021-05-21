package com.example.owenplayer.util

import android.content.Intent
import android.graphics.Color
import android.util.Log
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat.startActivity
import com.example.owenplayer.MainActivity
import com.example.owenplayer.R
import com.example.owenplayer.ui.Activity.SettingActivity

//interface ToolBarManager
//所有界面toolbar的管理类
interface ToolBarManager {
    val toolbar:Toolbar
    //初始化主界面MainActivity的ToolBar
    fun initMainToolBar(){
        toolbar.title = "Owen Player";
        toolbar.setTitleTextColor(Color.WHITE)
        toolbar.inflateMenu(R.menu.main)
        //toolbar中的设置按钮，设定点击事件
        toolbar.setOnMenuItemClickListener(object :Toolbar.OnMenuItemClickListener{
            override fun onMenuItemClick(item: MenuItem?): Boolean {
                when(item?.itemId){
                    R.id.setting ->{
//                        Toast.makeText(toolbar.context, "点击了设置按钮", Toast.LENGTH_SHORT).show()
                        //跳转到设置界面
                        val intent = Intent(toolbar.context, SettingActivity::class.java)
                        toolbar.context.startActivity(intent)
//                        val intent = toolbar.context.startActivity(Intent(toolbar.context, SettingActivity::class.java))
                        /**
                         * 上面是合写的方法
                         *   val intent = Intent(context, SomeActivity::class名.java)
                         *   context.startActivity(intent)
                         *
                         * */
                    }
                }
                return true
            }
        })
    }
    //处理设置界面的toolbar
    fun initSettingToolbar(){
        toolbar.title = "设置"
        toolbar.setTitleTextColor(Color.WHITE)
    }
}