package com.zaft.learn.abstracts;

import com.zaft.learn.polymorphic.Note;

/**
 * Created by zaft_x on 2019/1/3 0003.
 */
public class Stringed extends  Instrument {
    public void play(Note n) {
        System.out.println("Stringed.play");
    }
    public String what(){
        return "Stringed";
    }
    public void adjust() {

    }
}
