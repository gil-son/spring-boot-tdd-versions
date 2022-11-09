package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
//@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
//@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
//@TestMethodOrder(MethodOrderer.MethodName.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
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

    @DisplayName("Equals and Not Equals")
    @Test
    void testMultiply(){
        assertEquals(12, demoUtils.multiply(4, 3));
    }



    @DisplayName("Equals and Not Equals")
    @Test
    void testEqualsAndNotEquals(){

        System.out.println("Running test: testEqualsAndNotEquals");


        assertEquals(6, demoUtils.add(2, 4), "2+4 must be 6");
        assertNotEquals(6, demoUtils.add(1, 9), "2+4 must not be 6");
    }

    @DisplayName("Null and Not Null")
    @Test
    void testNullAndNotNull(){

        System.out.println("Running test: testNullAndNotNull");

        String obj1 = "word";
        String obj2 = null;


        assertNull(demoUtils.checkNull(obj2), "must not be null");
        assertNotNull(demoUtils.checkNull(obj1), "must be null");
    }


    @DisplayName("Same and Not Same")
    @Test
    void testSameAndNotSame(){

        String str = "luv2code";

        assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate(), " Objects should refer to same object");
        assertNotSame(str, demoUtils.getAcademy(), "Objects should not refer to same object");

    }

    @DisplayName("True and False")
    @Test
    void testTrueFalse(){

        int gradeOne = 10;
        int gradeTwo = 5;

        assertTrue(demoUtils.isGreater(gradeOne, gradeTwo), "This should return true");
        assertFalse(demoUtils.isGreater(gradeTwo, gradeOne), "This should return false");
    }

    @DisplayName("Array Equals")
    @Test
    void testArrayEquals(){
        String[] stringArray = {"A", "B", "C"};
        assertArrayEquals(stringArray, demoUtils.getFirstThreeLettersOfAlphabet(), "Array should be the same");
    }

    @DisplayName("Iterable equals") // An "iterable" is an instance of a class that implements the java.lang.Iterable interface: ArrayList, LinkedList, HashSet, TreeSet
    @Test
    void testIterableEquals(){

        List<String> theList = List.of("luv", "2", "code");

        assertIterableEquals(theList, demoUtils.getAcademyInList(), "Expected list should be same as actual list");

    }

    @DisplayName("Lines match") // An "iterable" is an instance of a class that implements the java.lang.Iterable interface: ArrayList, LinkedList, HashSet, TreeSet
    @Order(2)
    @Test
    void testLinesMatch(){

        List<String> theList = List.of("luv", "2", "code");

        assertLinesMatch(theList, demoUtils.getAcademyInList(), "Lines should match");

    }

    @DisplayName("Throws and Does Not Throws")
    @Order(1)
    @Test
    void testThrowsAndDoesNotThrow(){

        assertThrows(Exception.class, () -> { demoUtils.throwException(-1);},"Should throw exception" );
        assertDoesNotThrow( () -> { demoUtils.throwException(9);},"Should not throw exception");

    }


    @DisplayName("Timeout")
    @Order(0)
    @Test
    void testTimeout(){
        assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {demoUtils.checkTimeout();}, "Method should execute in 3 seconds");
    }

}
