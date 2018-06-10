package org.todeschini.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class StringHelperParameterizedBooleanTest {

    StringHelper helper = new StringHelper();

    private String actual;
    private boolean expected;

    private int count = 1;

    public StringHelperParameterizedBooleanTest(String actual, boolean expected) {
        this.actual = actual;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection testConditions() {
        Object[][]  expectedOutputs = {
                { "ABCD", false },
                { "ABAB", true }
        };
        return Arrays.asList( expectedOutputs );
    }

    //ABCD -> false, ABAB -> true, AB -> true, A -> false
//    @Test
//    public void testAreFirstAndLastTwoCharactersTheSame_BasicaNegativeScenario() {
//        assertFalse( helper.areFirstAndLastTwoCharactersTheSame( "ABCD"));
//    }
//
//    //ABCD -> false, ABAB -> true, AB -> true, A -> false
//    @Test
//    public void testAreFirstAndLastTwoCharactersTheSame_BasicaPositiveScenario() {
//        assertTrue( helper.areFirstAndLastTwoCharactersTheSame( "ABAB"));
//    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_Parameterize() {
        assertEquals(expected, helper.areFirstAndLastTwoCharactersTheSame( actual ) );
    }
}
