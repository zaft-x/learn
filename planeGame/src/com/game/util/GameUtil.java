package com.game.util;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class GameUtil {

    //构造器私有
    private GameUtil(){}

    public static Image getImage(String path){
        BufferedImage bi = null;
        URL url = GameUtil.class.getClassLoader().getResource(path);
        try {
            bi = ImageIO.read(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bi;
    }

}
