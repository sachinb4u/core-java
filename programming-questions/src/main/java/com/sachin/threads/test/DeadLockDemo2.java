package com.sachin.threads.test;

/**
 * Created with IntelliJ IDEA.
 * User: sbhosale
 * Date: 11/27/13
 * Time: 12:33 PM
 * To change this template use File | Settings | File Templates.
 *
 * Write a program to demonstrate a deadlock
 *
 */
public class DeadLockDemo2 {

    private static String str1  = "One";
    private static String str2 = "Two";

    public static void main(String[] args){
        Thread t1 = new Thread("One"){
           @Override
           public void run(){
               synchronized (str1){
                   try {
                       Thread.sleep(100);
                   } catch (InterruptedException e) {
                       e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                   }
                   synchronized (str2){
                       System.out.println("Inside T1 - " + Thread.currentThread());
                   }
               }
           }
        };

        Thread t2 = new Thread("Two"){
            @Override
            public void run(){
                synchronized (str2){
                    /*try {
                        str2.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                    }*/
                    synchronized (str1){
                        System.out.println("Inside T2 - " + Thread.currentThread());
                    }
                }
            }
        };

        t1.start();
        t2.start();

        for(;;){
            System.out.println("T1 State : " + t1.getState());
            System.out.println("T2 State : " + t2.getState());
        }
    }
}
