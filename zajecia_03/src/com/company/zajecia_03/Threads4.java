package com.company.zajecia_03;

public class Threads4 implements Runnable {
    public void run(){
        for (int i = 0; i < 10; i++)
        {
            System.out.println("☁".repeat(i) + "✈" + "☁".repeat(9-i));
            try {
                double random = 1000 + Math.random() * 3000;
                Thread.sleep((long) random);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

 class main4 {
     public static void main(String[] args) {
         Thread th1 = new Thread(new Threads4());
         Thread th2 = new Thread(new Threads4());
         Thread th3 = new Thread(new Threads4());
         Thread th4 = new Thread(new Threads4());
         Thread th5 = new Thread(new Threads4());
         Thread th6 = new Thread(new Threads4());
         Thread th7 = new Thread(new Threads4());
         Thread th8 = new Thread(new Threads4());
         Thread th9 = new Thread(new Threads4());
         Thread th10 = new Thread(new Threads4());

        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
        th6.start();
        th7.start();
        th8.start();
        th9.start();
        th10.start();

     }
 }
