package com.zaft.learn.chapter_2.small_2_4_2;

public class Small242 {

    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello word");
            }
        });

        Thread t1 = new Thread(() -> System.out.println(""));

        System.out.println();

    }


    /*private static int sum(){
        return (int a, int b) -> (a+b);
    }*/
}
