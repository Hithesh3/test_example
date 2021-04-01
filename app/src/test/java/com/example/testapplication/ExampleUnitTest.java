package com.example.testapplication;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {

        String str1 = "hello";
        String str2 = "hello";
        String str3 = null;
        String str4 = "lion";
        String str5 = "lion";

        boolean c;

        int val1 = 5;
        int val2 = 6;

        String[] a = {"one", "two", "three"};
        String[] b =  {"one", "two", "three"};

        assertEquals(11, val1 + val2);
        assertEquals(-1, val1 - val2);
        assertEquals(30, val1 * val2);
        assertEquals(0, val1 / val2);

        assertEquals(str1, str2);

        assertTrue(val1 < val2);

        assertFalse(val1 > val2);

        assertNotNull(str1);

        assertNull(str3);

        assertSame(str4,str5);

        assertNotSame(str1,str3);

        assertArrayEquals(a, b);
    }
}