package com.example.fancx.day02_animation_demo.demo02;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.fancx.day02_animation_demo.R;

/**
 * 代码创建帧动画
 * 1, 初始化动画管理器对象
 * 2, 向动画管理器中添加资源
 * 3, 将动画资源设置到图片上  -- ImageView
 * 4, 调用start() 启动动画
 * 5, 调用stop() 停止播放动画
 */
public class FrameActivity02 extends AppCompatActivity {


    private AnimationDrawable animationDrawable;
    private ImageView mIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame02);
        mIv = (ImageView) findViewById(R.id.iv_id);

        //TODO 1,  初始化动画管理器对象
        animationDrawable = new AnimationDrawable();

        //TODO 2,  向动画管理器中添加资源
        //参数:  资源图片的Drawable对象, 持续时间
        animationDrawable.addFrame(getResources().getDrawable(R.mipmap.anim1),100);
        animationDrawable.addFrame(getResources().getDrawable(R.mipmap.anim2),100);
        animationDrawable.addFrame(getResources().getDrawable(R.mipmap.anim3),100);
        animationDrawable.addFrame(getResources().getDrawable(R.mipmap.anim4),100);
        animationDrawable.addFrame(getResources().getDrawable(R.mipmap.anim5),100);
        animationDrawable.addFrame(getResources().getDrawable(R.mipmap.anim6),100);
        animationDrawable.addFrame(getResources().getDrawable(R.mipmap.anim7),100);
        animationDrawable.addFrame(getResources().getDrawable(R.mipmap.anim8),100);
        animationDrawable.addFrame(getResources().getDrawable(R.mipmap.anim9),100);
        animationDrawable.addFrame(getResources().getDrawable(R.mipmap.anim10),100);
        animationDrawable.addFrame(getResources().getDrawable(R.mipmap.anim11),100);
        animationDrawable.addFrame(getResources().getDrawable(R.mipmap.anim12),100);

        animationDrawable.setOneShot(false);//设置是否执行一次:  true 执行一次, false 执行多次

        //TODO 3, 将动画资源设置到图片上  -- ImageView
        mIv.setImageDrawable(animationDrawable);
    }

    public void start(View view) {
        //TODO 4,  调用start() 启动动画
        if (!animationDrawable.isRunning()) animationDrawable.start();
    }

    public void stop(View view) {
        //TODO 5, 调用stop() 停止播放动画
        animationDrawable.stop();
    }
}
