package com.company;

public class Main {

    public static void main(String[] args) {

        // Starting and running multiple Threads
        // 1. Threads might not run in the order in which they were started
        // 2. There is no guarantee that a thread once starts executing, it will keep executing until it's done.
        //    Or that loop will complete before another thread completes.

        Runnable r = () -> {
            for (int i = 0; i < 400; i++) {
                System.out.println("Run by " + Thread.currentThread().getName() + ", i is " + i);
            }
        };

        // Define Multiple threads
        Thread bunny = new Thread(r, "Bunny");
        Thread ntr = new Thread(r, "Jr.Ntr");
        Thread mahesh = new Thread(r, "Mahesh");

        // Start the threads
        bunny.start();
        ntr.start();
        mahesh.start();

        // Run this method and you will see the difference in the order in which they execute.


    }


}
