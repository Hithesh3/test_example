package com.example.testapplication;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {
    @Test
    public void addNumbersTest() {
        MainActivity.Calculator mainActivity=new MainActivity.Calculator();
        int a=10;
        int b=30;
        int c=mainActivity.addNumbers(a,b);
        assertEquals(40,c);
    }
}