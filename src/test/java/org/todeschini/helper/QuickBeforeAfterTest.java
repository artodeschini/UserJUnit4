package org.todeschini.helper;

import org.junit.*;

/**
 * @author Artur
 */
public class QuickBeforeAfterTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before all Test");
    }

    @Before
    public void setUp() {
        System.out.println("Before than test");
    }

    @Test
    public void test1() {
        System.out.println("teste 1 executed");
    }

    @Test
    public void test12() {
        System.out.println("teste 2 executed");
    }

    @After
    public void tearDown() {
        System.out.println("After test");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After class");
    }
}
