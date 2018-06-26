package com.example.fancx.day02_animation_demo.demo01;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.fancx.day02_animation_demo.R;

/**
 *  帧动画   --- 创建方式2中: 1, 资源文件创建   2, 代码创建
 *  资源文件创建帧动画
 * 1,   在res/drawable 文件夹中 , 创建一个xml 文件
 * 2,   写入根标签   <animation-list>
 *                         <item  />
 *                  </animation-list>
 *  3,  在代码或者布局页面中设置到控件上 ImageView--- >  TODO  背景资源
 *  4,  在Activity 代码中, 控制 启动和停止  --- TODO 动画管理器 -- AnimationDrawable
 */
public class FrameActivity01 extends AppCompatActivity {

    //TODO 1, 得到动画管理器 -- AnimationDrawable
   private  AnimationDrawable animationDrawable;
    private ImageView mIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame01);

        mIv = (ImageView) findViewById(R.id.iv_id);
        //得到动画管理器
        animationDrawable = (AnimationDrawable) mIv.getBackground();
    }

    //点击按钮, 播放动画
    public void start(View view) {
        //TODO 2, 判断当前的动画是否正在播放
        if(!animationDrawable.isRunning()) animationDrawable.start();
    }

    //点击按钮, 停止播放
    public void stop(View view) {
        animationDrawable.stop();
    }
}
