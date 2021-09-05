package com.ss.sessions;

public class Session1 {

    public static void main(String[] args) {
        printNumbers(20000);
    }

    static void printNumbers(int n) {
        if (n == 1000) {
            //user thread
            Runnable runnable = () -> {
                if (n < 2000) {
                    System.out.println(Thread.currentThread().getName() + " " + n);
                    printNumbers(n + 1);
                }
            };
            runnable.run();
        }
        System.out.println(Thread.currentThread().getName() + " " + n);
        printNumbers(n + 1);
    }

    public void print(int n) {


        if (n == 10000) {
            Thread t = new Thread(() -> {
                print(n);

            });
            t.start();
            return;
        }

        print(n - 1);

        System.out.println(n);

    }

}
