package com.company.zajecia_03;

class Test {
    int x = 0;
    public synchronized int doIt() {
        for (int i = 0; i < 1000; i++)
        {
            x++;
            if (i % 2 == 0){
                x--;
            }
        }
        return x;
    }
}
class ThreadTest extends Thread {
    Test t;
    ThreadTest(Test t) {
        this.t = t;
    }
    public void run() {
        System.out.println(t.doIt());
    }
}
public class Threads2{
    public static void main(String[] args) {
        Test t = new Test();
        ThreadTest tab[] = new ThreadTest[10];
        for (int i = 0; i < tab.length; i++)
        {
            tab[i] = new ThreadTest(t);
            tab[i].start();
        }
    }
}