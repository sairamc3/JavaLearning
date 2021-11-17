package com.company;

public class Main {

    public static void main(String[] args) {

        // Opening two threads
        // 1. Main Thread
        // 2. Thread-0
        // Both run for loop, with sleep time 1 sec, until 100

        Runnable r = () -> {
            for (int i = 0; i < 100; i++) {
                    System.out.println("Run by " + Thread.currentThread().getName() + ", i is " + i );

                try {

                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

            }
        };

        Thread thread2 = new Thread(r);
        thread2.start();

        for(int i=0; i<40; i++){
            System.out.println("Running Main Thread "+ Thread.currentThread().getName() + ", i is "+i);

            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
        // Until here both run in parallel or in time sliced way


        try {

            // The below command will make the main thread dependent on thread-0.
            // So thread-0 will run first and when it completes only then main thread
            // will resume to running state
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i=0; i<40; i++){
            System.out.println("Running Main Thread "+ Thread.currentThread().getName() + ", i is "+i);

            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }



    }


}
