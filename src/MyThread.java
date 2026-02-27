import java.io.*;
//public class MyThread extends Thread{}
public class MyThread{
    public static void main(String[] args) {
        Runnable r = ()->{
            for(int i=0;i<10;i++) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t1 = new Thread(r,"Martin");
        Thread t2 = new Thread(r,"Ram");
        t1.start();
        t2.start();
//        Thread t2 = new Thread(t1);
//        t2.start();
//        t1.setName("First Thread");
//        t1.start();
//        t1.start(); // When you run your thread multiple times then it throws error, they want only one run for any thread
//        MyThread t2 = new MyThread();
//        t2.start();
    }

}
