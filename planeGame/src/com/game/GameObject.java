package com.game;

import java.awt.*;

public class GameObject {
    Image img;
    double x,y;
    int speed;
    int width,height;

    public void drawSelf(Graphics g){
        g.drawImage(img, (int)x,(int)y,null);
    }

    public GameObject(Image img, double x, double y, int speed, int width, int height) {
        this.img = img;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.width = width;
        this.height = height;
    }

    public GameObject(Image img, double x, double y) {
        this.img = img;
        this.x = x;
        this.y = y;
    }

    public GameObject() {
    }

    /**
    *返回物体所在矩形 ， 用以后期碰撞检测
    * @Author zaft_x
    * @Description TODO 
    * @Date 2019/11/28 22:51
    * @Param 
    * @return 
    */
    public Rectangle rectangle(){
        return new Rectangle((int) x, (int)y, width, height);
    }

}
