package com.priti.junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



/**
 * Created by prguleri on 11/24/2017.
 */
public class SpeedTest {
    Speed speed;

    @Before
    public void setup(){
        this.speed = new Speed();

    }

    @Test
    public void speedTest(){


        int val =speed.speed(10,5);
        Assert.assertEquals(2,val);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testException(){

        int val = speed.speed(10,2);

    }
}
