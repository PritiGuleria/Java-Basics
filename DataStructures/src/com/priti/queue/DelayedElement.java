package com.priti.queue;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * Created by prguleri on 9/12/2017.
 */
public class DelayedElement implements Delayed {

    private String name;
    private long expiryTime;

    public DelayedElement(String name, long expiryTime) {
        this.name = name;
        this.expiryTime = System.currentTimeMillis()+expiryTime;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = expiryTime - System.currentTimeMillis();
        return unit.convert(diff,TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return 0;
    }
}
