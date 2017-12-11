package com.priti.lock;

/**
 * Created by prguleri on 9/7/2017.
 */
public class CustomLockExample {

    private boolean isLocked ;
    private Thread lockedBy;
    private int lockCount;

    public synchronized void lock() throws InterruptedException {
        Thread current = Thread.currentThread();
        while(isLocked && lockedBy !=current ){
            wait();
        }
        isLocked=true;
        lockCount++;
        lockedBy = current;

    }

    public synchronized  void unlock(){
        if(lockedBy ==Thread.currentThread()){
            lockCount--;
        }
        if(lockCount==0) {
            isLocked = false;
            notify();
        }
    }
}
