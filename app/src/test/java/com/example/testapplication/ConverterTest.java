package com.example.testapplication;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {


    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void addNumbers() {
        Converter converter=new Converter();
        int a=10;
        int b=20;
        int o=converter.addNumbers(a,b);
        assertEquals(30,o);
    }

    @Test
    public void subNumbers() {
        Converter converter=new Converter();
        int a=10;
        int b=20;
        int o=converter.subNumbers(a,b);
        assertEquals(-10,o);
    }

    @Test
    public void mulNumbers() {
        Converter converter=new Converter();
        int a=10;
        int b=20;
        int o=converter.mulNumbers(a,b);
        assertEquals(200,o);
    }

    @Test
    public void divNumbers() {
        Converter converter=new Converter();
        float a=500;
        float b=25;
        float o=converter.divNumbers(a,b);
        assertEquals(20,o,.0);
    }
}