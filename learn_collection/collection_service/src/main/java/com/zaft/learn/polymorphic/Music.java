package com.zaft.learn.polymorphic;

/**
 * Created by zaft_x on 2019/1/3 0003.
 */
public class Music {
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
    }
}
