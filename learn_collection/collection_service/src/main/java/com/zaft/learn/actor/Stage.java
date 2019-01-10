package com.zaft.learn.actor;

/**
 * Created by zaft_x on 2019/1/3 0003.
 */
public class Stage {
    private Actor actor = new HappyActor();
    public void chage(){
        actor = new SadActor();
    }
    public void performPlay(){
        actor.act();
    }
}
