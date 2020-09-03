package com.geek.concurrency1;

/**
 * @program: java-concurrency
 * @description:
 * @author: ytw
 * @create: 2020-08-31 22:33
 **/
public class MyObject {

    private int counter;
    /**
        两个线程操作一个int变量，最终输出结果10101010...
     */
    public synchronized void increace(){
        if(counter != 0){
            try {
                wait();//释放锁，让减少counter的线程减去1，在调用notifyAll唤醒此线程
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        counter++;
        System.out.print("\t"+counter);
        notify();
    }

    public synchronized void decrease(){
        if (counter == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        counter--;
        System.out.print("\t"+counter);
        notify();
    }
}
