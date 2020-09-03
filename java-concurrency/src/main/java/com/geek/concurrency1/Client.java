package com.geek.concurrency1;

/**
 * @program: java-concurrency
 * @description:
 * @author: ytw
 * @create: 2020-08-31 22:45
 **/
public class Client {


    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        Thread increaceThread = new IncreaceThread(myObject);
        Thread decreaseThread = new DecreaseThread(myObject);
        increaceThread.start();
        decreaseThread.start();

    }
}
