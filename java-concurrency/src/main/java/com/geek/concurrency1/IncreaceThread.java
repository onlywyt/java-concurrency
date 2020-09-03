package com.geek.concurrency1;

/**
 * @program: java-concurrency
 * @description:
 * @author: ytw
 * @create: 2020-08-31 22:40
 **/
public class IncreaceThread extends Thread  {

    private MyObject myObject;
    public IncreaceThread (MyObject myObject){
        this.myObject = myObject;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            try {
                Thread.sleep((long) Math.random() * 100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myObject.increace();//counter ＋ 1 的操作
        }
    }
}
