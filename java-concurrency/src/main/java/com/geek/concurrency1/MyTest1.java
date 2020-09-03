package com.geek.concurrency1;

/**
 * @program: java-concurrency
 * Thread.sleep:
 *  The thread  does not lose ownership of any monitors.
 * Object.wait:
 *  The current thread must own this object's monitor,调用wait()后会释放锁
 *  wait与notify和notifyall的总结
 *      1.当调用wait时，首先要确认调用了wait方法的线程已经持有对象的锁
 *      2.当调用了wait后，该线程会释放掉当前对象的锁，然后进入等待状态
 *      3.当线程进入了wait状态后，它就可以等待其他线程调用当前对象的notify或者notifyAll方法使自己唤醒
 *      4.一旦这个线程被其他线程唤醒后，该线程则会与其他线程一起竞争该对象的锁（公平竞争），只有当该线程获取到了这个对象的锁，
 *          线程才会继续执行
 *      5.调用wait方法的代码片段需要放在synchronized代码块中，这样才可以确认线程在调用wait方法前已经获取了对象的锁
 *      6.当调用notify方法后，会唤醒任意一个线程（在等待集合中<wait set>）
 *      7.当调用notifyAll方法后，会唤醒所有线程（在等待集合中<wait set>）
 *      8.在某一时刻只有唯一一个线程可以获取对象的锁
 **/
public class MyTest1 {
    public static void main(String[] args) throws InterruptedException {
        Object o = new Object();
        synchronized (o){
            o.wait();//进入等待，并且释放锁
        }
    }

}
