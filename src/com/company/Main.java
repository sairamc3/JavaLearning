package com.company;

public class Main {

    public static void main(String[] args) {

        // Starting and running multiple Threads
        // 1. Threads might not run in the order in which they were started
        // 2. There is no guarantee that a thread once starts executing, it will keep executing until it's done.
        //    Or that loop will complete before another thread completes.

        Runnable r = () -> {
            for (int i = 0; i < 100; i++) {

                if (i % 10 == 0) {
                    System.out.println("Run by " + Thread.currentThread().getName() + ", i is " + i);

                }
                try {
                    // This command will make the thread to sleep and wakes it to runnable state when the
                    // specified time is up.
                    // The decision to make it to Run state depends on the scheduler.

                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

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
