package com.example.zhengyixing.myfinal;

/**
 * Created by zhengyixing on 4/30/17.
 */

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaPlayer;

import java.io.IOException;


public class Source {

    private static Bitmap background;
    private static int speed;
    private static int eclapseTime;
    private static MediaPlayer explosionSound, helicopter,backMusic1,backMusic2,backMusic3;

    public static void setExplosionSound(Context context){
        explosionSound = MediaPlayer.create(context,R.raw.explosion);
        helicopter = MediaPlayer.create(context,R.raw.helicopter1);
        helicopter.setLooping(true);
    }

    public static void setBackMusic(Context context){

        backMusic1 = MediaPlayer.create(context, R.raw.wang);
        backMusic2 = MediaPlayer.create(context, R.raw.darkwinter);
        backMusic3 = MediaPlayer.create(context, R.raw.sunny);

        backMusic1.setLooping(true);
        backMusic2.setLooping(true);
        backMusic3.setLooping(true);

    }

    public static void playBackMusic1() {backMusic1.start();}

    public static void stopBackMusic1(){backMusic1.pause();}

    public static boolean isMusic1Playing(){return backMusic1.isPlaying();}

    public static boolean isMusic2Playing(){
        return backMusic2.isPlaying();
    }

    public static boolean isMusic3Playing(){
        return backMusic3.isPlaying();
    }

    public static void playBackMusic2() {backMusic2.start();}

    public static void stopBackMusic2(){backMusic2.pause();}

    public static void playBackMusic3()  {backMusic3.start();}

    public static void stopBackMusic3(){
        backMusic3.pause();
    }


    public static void playExplosionSound(){
        explosionSound.start();
    }

    public static void stopHelicopter(){
        helicopter.pause();
    }

    public static void playHelicopter(){
        helicopter.start();
    }


    public static void setBackground(Bitmap b){
        background = b;
    }

    public static Bitmap getBackground(){
        return background;
    }

    public static void setSpeed(int i){
        speed = i;
    }

    public static void setEclapseTime(int i){
        eclapseTime = i;
    }

    public static int getSpeed(){
        return speed;
    }

    public static int getEclapseTime(){
        return eclapseTime;
    }

}
