package com.priti;

/**
 * Created by prguleri on 9/7/2017.
 */
public class StopThread extends Thread {
    boolean flag;

    public void run() {
        while(!flag){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("I am running");
        }

    }

    public void stopThread(){
        System.out.println("Stop!!!!!!!!!!!!!!!!!!!!!!!!!");
        flag=true;
    }

    public static void main(String[] args) throws InterruptedException {
        StopThread t1 = new StopThread();
        t1.start();
        sleep(5000);
        t1.stopThread();

    }


}
