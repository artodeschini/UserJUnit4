package org.todeschini.helper;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArraysCompareTest {

    //Arrays.sort

    @Test
    public void testArraySort_RandomArray() {
        int[] actual = { 12 , 3, 4, 1 };
        int[] expected = { 1, 3, 4, 12 };

        Arrays.sort( actual );

        assertArrayEquals( expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void testArraySort_NullArray() {
        int[] actual = null;
        Arrays.sort( actual );
//
//        try {
//            Arrays.sort( actual );
//        } catch (NullPointerException e ) {
//            //Success
//        }
        assertArrayEquals(new int[]{ 1, 3, 4, 12 }, actual);
    }

    @Test(timeout = 1000L)
    public void testSort_Performace() {
        int array[] = { 12, 23, 4};
        for (int i = 1; i < 1000000; i++) {
            array[ 0 ] = i;
            Arrays.sort( array );
        }
    }

}
