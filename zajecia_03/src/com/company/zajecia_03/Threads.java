package com.company.zajecia_03;

public class Threads implements Runnable {
    public void run(){
        for (int i = 0; i < 10; i++)
        {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}

class main {

    public static void main(String[] args) throws InterruptedException {

        Thread th1 = new Thread(new Threads());
        Thread th2 = new Thread(new Threads());
        Thread th3 = new Thread(new Threads());
        Thread th4 = new Thread(new Threads());
        Thread th5 = new Thread(new Threads());
        Thread th6 = new Thread(new Threads());
        Thread th7 = new Thread(new Threads());
        Thread th8 = new Thread(new Threads());
        Thread th9 = new Thread(new Threads());
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
        th6.start();
        th7.start();
        th8.start();
        th9.start();

    }
}
