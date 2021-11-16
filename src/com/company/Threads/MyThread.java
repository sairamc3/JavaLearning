package com.company.Threads;

public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("important job running in my thread -> " + Thread.currentThread().getName());
    }
}
