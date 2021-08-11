package com.sxt;

import java.applet.AudioClip;
import java.io.*;
import java.applet.Applet;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class Music {
    String name="林俊杰 - 可惜没如果.wav";//可以用来选择你想要播放的音乐
    File f = new File("D:\\BaiduNetdiskDownload\\"+name); //放音乐文件的路劲，注意一定要是WAV格式的音乐不然不可以播放
    URL url;
    URI uri;
    AudioClip clip;
    void setMusic(String name)//修改播放的音乐文件
    {
        this.name=name;
    }
    public Music(){
        try
        {
            uri=f.toURI();
            url = uri.toURL();
            clip = Applet.newAudioClip(url);
            clip.loop();//循环播放
            //clip.play();//播放
            //clip.stop();//停止播放
            System.out.println("音乐文件已经打开!");
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
            System.out.println("播放错误！");
        }
    }
    public void stopMusic()//停止播放
    {
        clip.stop();
    }
    public void playMusic()//播放
    {
        clip.play();
    }
    public void loopMusic()//循环播放
    {
        clip.loop();
    }
}

