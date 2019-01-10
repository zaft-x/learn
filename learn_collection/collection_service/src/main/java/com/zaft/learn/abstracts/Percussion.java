package com.zaft.learn.abstracts;

import com.zaft.learn.polymorphic.Note;

/**
 * Created by zaft_x on 2019/1/3 0003.
 */
public class Percussion extends Instrument{
    public void play(Note n) {
        System.out.println("Percussion.play");
    }
    public String what(){
        return "Percussion";
    }
    public void adjust() {

    }
}
