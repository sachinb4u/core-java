package com.sachin.threads.test;

import java.util.concurrent.CountDownLatch;

/**
 * Created with IntelliJ IDEA.
 * User: sbhosale
 * Date: 11/27/13
 * Time: 2:24 PM
 * To change this template use File | Settings | File Templates.
 *
 * Write a program to demonstrate a deadlock
 *
 */
public class DeadLockDemo1 {

    public static void main(String[] args){
        Object lock1 = new Object();
        Object lock2 = new Object();
        CountDownLatch latch = new CountDownLatch(2);

        Locker locker1 = new Locker(lock1, lock2, latch);
        Locker locker2 = new Locker(lock2, lock1, latch);

        Thread t1 = new Thread(locker1, "First");
        Thread t2 = new Thread(locker2, "Second");

        t1.start();
        t2.start();

    }

    private static class Locker implements Runnable{
        private Object lock1;
        private Object lock2;
        private CountDownLatch latch;

        public Locker(Object lock1In, Object lock2In, CountDownLatch latchIn){
            lock1 = lock1In;
            lock2 = lock2In;
            latch = latchIn;
        }

        public void run(){
            synchronized (lock1){
                latch.countDown();
                System.out.println("Acquired lock on: " + lock1 + " by " + Thread.currentThread());
                try {
                    latch.await();
                    System.out.println(Thread.currentThread() + " : waiting for latch :");
                } catch (InterruptedException e) {
                    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                }
                System.out.println("Acquiring lock on " + lock2);
                synchronized (lock2){

                }
                System.out.println("Never executed" + Thread.currentThread());
            }
        }
    }
}


