package com.company;

import com.company.Threads.MyThread;

public class Main {

    public static void main(String[] args) {

        System.out.println("The main method is running in -> "+ Thread.currentThread().getName());
        MyThread myThread = new MyThread();
        myThread.start(); // This will create a new thread - Thread-0
        myThread.run(); // This part will trigger from main method, since you are calling it directly.

        Runnable r = () -> System.out.println("Important Job running in My runnable -> "+ Thread.currentThread().getName());

        Thread thread1 = new Thread(r);
        thread1.start(); // this will create a new thread - Thread-1


        // Multiple Threads from single runnable

        Thread thread2 = new Thread(r);
        Thread thread3 = new Thread(r);
        Thread thread4 = new Thread(r);

        thread2.start();
        thread3.start();
        thread4.start();

        // The same job will be done in multiple threads ( and the same job will be done multiple times)





    }
}
