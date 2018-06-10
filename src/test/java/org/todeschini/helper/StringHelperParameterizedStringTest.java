package org.todeschini.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class StringHelperParameterizedStringTest {

    StringHelper helper = new StringHelper();

    private String actual;
    private String expected;

    public StringHelperParameterizedStringTest(String actual, String expected) {
        this.actual = actual;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<String[]> testConditionsStrings() {
        String[][] expectedOutputs = {
                {"AACD", "CD"},
                {"ACD", "CD"}
        };
        return Arrays.asList(expectedOutputs);
    }

    @Test
    public void testTrucateAInFist() {
        assertEquals(expected, helper.truncateAInFirst2Positions(actual));
    }

}