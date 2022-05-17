package com.luv2code.junitdemo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DemoUtilsTest {


    @Test
    void testEqualsAndNotEquals(){

        DemoUtils demoUtils = new DemoUtils();

        assertEquals(6, demoUtils.add(2, 4), "2+4 must be 6");
        assertNotEquals(6, demoUtils.add(1, 9), "2+4 must not be 6");
    }

    @Test
    void testNullAndNotNull(){

        DemoUtils demoUtils = new DemoUtils();

        String obj1 = "word";
        String obj2 = null;


        assertNull(demoUtils.checkNull(obj2), "must not be null");
        assertNotNull(demoUtils.checkNull(obj1), "must be null");
    }

}
