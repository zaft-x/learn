package com.zaft.learn.shape;

import java.util.Random;

/**
 * Created by zaft_x on 2019/1/3 0003.
 */
public class RandomShapeGenerator {
    private Random rand = new Random(47);
    public Shape next(){
        switch (rand.nextInt(3)){
            default:
            case 0:return new Circle();
            case 1:return new Square();
            case 2:return new Triangle();
        }
    }
}
