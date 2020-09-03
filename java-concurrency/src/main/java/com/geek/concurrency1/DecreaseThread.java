package com.geek.concurrency1;

/**
 * @program: java-concurrency
 * @description:
 * @author: ytw
 * @create: 2020-08-31 22:43
 **/
public class DecreaseThread extends Thread {

    private MyObject myObject;
    public DecreaseThread (MyObject myObject){
        this.myObject = myObject;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            try {
                Thread.sleep((long)Math.random() * 1000);
            }catch (Exception e){
                e.printStackTrace();
            }
            myObject.decrease();
        }
    }
}
