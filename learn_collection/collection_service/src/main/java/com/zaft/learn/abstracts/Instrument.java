package com.zaft.learn.abstracts;

import com.zaft.learn.polymorphic.Note;

/**
 * Created by zaft_x on 2019/1/3 0003.
 */
public abstract class Instrument {
   private int i;
   public abstract void play(Note n);
   public String what(){
       return "Instrument";
   }
   public abstract void adjust();
}
