package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
//@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
//@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
class DemoUtilsTest {

    DemoUtils demoUtils;

    @BeforeEach
    void setupBeforeEach(){
        demoUtils = new DemoUtils();
        System.out.println("@BeforeEach executes before the execution of each test method");
    }

    @AfterEach
    void tear_Down_After_Each(){
        System.out.println("Running @AfterEach \n");
    } // with Underscores

    @BeforeAll
    static void setupBeforeEachClass(){
        System.out.println("@BeforeAll executes only once before all test methods execution in the class");
    }

    @AfterAll
    static void tearDownAfterAll(){
        System.out.println("@AfterAll executes only once after all test methods execution in the class");
    }


    @Test
//    @DisplayName("Equals and Not Equals")
    void testEqualsAndNotEquals(){

        System.out.println("Running test: testEqualsAndNotEquals");


        assertEquals(6, demoUtils.add(2, 4), "2+4 must be 6");
        assertNotEquals(6, demoUtils.add(1, 9), "2+4 must not be 6");
    }

    @Test
//    @DisplayName("Null and Not Null")
    void testNullAndNotNull(){

        System.out.println("Running test: testNullAndNotNull");

        String obj1 = "word";
        String obj2 = null;


        assertNull(demoUtils.checkNull(obj2), "must not be null");
        assertNotNull(demoUtils.checkNull(obj1), "must be null");
    }

}
