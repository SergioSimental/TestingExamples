package com.example.testingexamples;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit1 {
    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    //@Ignore
    @Test
    public void testPrintMessage(){
        System.out.println("Inside testPrintMessage()");
        assertEquals(message, messageUtil.printMessage());
    }
}
