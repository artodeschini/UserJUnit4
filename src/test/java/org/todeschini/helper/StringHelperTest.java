package org.todeschini.helper;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringHelperTest {

    StringHelper helper = new StringHelper();

    @Test
    public void testToBeginJUnit() {
        //fail("Not yet implement");

        //expected , actual
        //assertEquals( "ABC","ABCD");
        //org.junit.ComparisonFailure:
        //Expected :ABC
        //Actual   :ABCD

        assertEquals( "ABC","ABC");


    }

    //'AACD' -> 'CD' or 'ACD' -> 'CD' or 'CDEF' -> ÇDEF' or 'CDAA' -> 'CDAA'
    @Test
    //Best pratice use the same name method that I use add prefix test
    public void testTruncateAInFirst2Positions_AinFrist2Possition() {
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD") );
    }

    @Test
    //Best pratice use the same name method that I use add prefix test
    public void testTruncateAInFirst2Positions_AinFristPossition() {
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD") );
    }

    @Test
    public void testTruncateAInFirst2Positions_AnotInFrist2Possition() {
        assertEquals( "CDEF", helper.truncateAInFirst2Positions("CDEF") );
    }

    //ABCD -> false, ABAB -> true, AB -> true, A -> false
    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicaNegativeScenario() {
//        boolean actual = helper.areFirstAndLastTwoCharactersTheSame("ABCD");
//        boolean expected = false;
//
//        assertEquals( expected , actual );

        assertFalse( helper.areFirstAndLastTwoCharactersTheSame( "ABCD"));
        //this is a overload than method assertFalse
        //assertFalse("The test pass ", helper.areFirstAndLastTwoCharactersTheSame( "ABCD"));
    }

    //ABCD -> false, ABAB -> true, AB -> true, A -> false
    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicaPositiveScenario() {
        assertTrue( helper.areFirstAndLastTwoCharactersTheSame( "ABAB"));
    }
}
