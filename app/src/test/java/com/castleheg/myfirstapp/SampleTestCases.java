package com.castleheg.myfirstapp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kieran on 21/05/16.
 */
public class SampleTestCases {
    @Test
    public void testName() throws Exception {
        Hello hello = new Hello();
        assertEquals(hello.getGreeting(), "Hello");
    }
}
