package com.game;

import com.game.util.GameUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @ClassName: MyGameFrame
 * @Description:
 * @Auther: zaft_x
 * @Date: 22:16
 * @version : V1.0
 */
public class MyGameFrame extends JFrame {

//    Image cat = GameUtil.getImage("images/little_cat.png");
    Image ball = GameUtil.getImage("images/little_ball.png");
    Image bg = GameUtil.getImage("images/500_500.png");
//    int x=250,y=250;
    Plane plane = new Plane(ball, 250,250);
    /**
     *自动被调用
     * @Author zaft_x
     * @Description TODO
     * @Date 2019/11/27 22:35x
     * @Param [g]画笔
     * @return void
     */
    @Override
    public void paint(Graphics g) {

//        Color color = g.getColor();

        super.paint(g);
        //线
       /* g.drawLine(100,100,300,300);
        //矩形
        g.drawRect(100,100,300,300);
        //椭圆
        g.drawOval(100,100,300,300);
        //实心矩形
        g.fillRect(100,100,40,40);
        //写串
        g.setColor(Color.red);
        g.setFont(new Font("宋体", Font.BOLD,40));
        g.drawString("this is first draw", 200,200);

//        g.drawImage(ball,250,250,null);
        g.setColor(color);*/

       g.drawImage(bg,0,0,null);
//       g.drawImage(ball,x,y,null);
        plane.drawSelf(g);
//       x++;
    }


    class PaintThread extends Thread{
        @Override
        public void run() {

            while (true){
                repaint();
                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     *获取键盘事件
     * @ClassName: MyGameFrame
     * @Description:
     * @Auther: zaft_x
     * @Date: 22:55
     * @version : V1.0
     */
    class KeyMonitor extends KeyAdapter{
        /**
        *按下
        * @Author zaft_x
        * @Description TODO
        * @Date 2019/11/28 22:56
        * @Param
        * @return
        */
        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);
            System.out.println("pressed:"+e.getKeyCode());
        }

        /**
        *释放
        * @Author zaft_x
        * @Description TODO
        * @Date 2019/11/28 22:56
        * @Param
        * @return
        */
        @Override
        public void keyReleased(KeyEvent e) {
            super.keyReleased(e);
            System.out.println("released:"+e.getKeyCode());
        }
    }

    /**
    *初始化窗口
    * @Author zaft_x
    * @Description TODO
    * @Date 2019/11/27 22:49
    * @Param
    * @return
    */
    public void launchFrame(){
        this.setTitle("打灰机");
        this.setVisible(true);//默认不可见
        //设置大小
        this.setSize(500, 500);
        //位置
        this.setLocation(300,300);
        //关闭事件   窗口关闭  程序关闭
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
//                super.windowClosing(e);
                System.exit(0);
            }

        });

        new PaintThread().start();
        addKeyListener(new KeyMonitor());
    }

    public static void main(String[] args) {
        MyGameFrame f = new MyGameFrame();
        f.launchFrame();
    }
} 
