package ru.netology;

import org.junit.jupiter.api.*;

public class AppTest {

    private static long suiteStartTime;
    private static long testStartTime;

    @BeforeAll
    public static void started() {
        System.out.println("Tests started");
        suiteStartTime = System.nanoTime();
    }

    @AfterAll
    public static void finished() {
        System.out.println("Tests finished: " + (System.nanoTime() - suiteStartTime));
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("Started new test");
        testStartTime = System.nanoTime();
    }
    @AfterEach
    public void afterEach(){
        System.out.println("Finish new test: " + (System.nanoTime() - testStartTime));
    }

    @Test
    public void testConcat_validArgument_success() {
        System.out.println("Test-1");
        // given:
        int a = 100;
        int b = 10;
        double c = 10;
        int expected = 11;

        // when:
        int actual = Calc.calc(a, b, c);

        // then:
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testConcat_validArgument_success_2() {
        System.out.println("Test-2");
        // given:
        int a = 110;
        double b = 10;
        int c = 10;
        double d = 10;
        int expected = 11;

        // when:
        int actual = Calc.mult(a, b, c, d);

        // then:
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testConcat_validArgument_success_3() {
        System.out.println("Test-3");
        // given
        int a = 10;
                int b = 20;
                int c = 20;
                int expected = 50;
        // when
        int actual = Calc.itog(a, b, c);
        // then
        Assertions.assertEquals(expected, actual);
    }

}
