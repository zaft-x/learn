package com.zaft.learn.abstracts;

import com.zaft.learn.polymorphic.Note;

/**
 * Created by zaft_x on 2019/1/3 0003.
 */
public class Wind extends Instrument {
    public void play(Note n) {
        System.out.println("Wind.play");
    }
    public String what(){
        return "Wind";
    }
    public void adjust() {
    }
}
