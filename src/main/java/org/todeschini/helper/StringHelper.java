package org.todeschini.helper;

/**
 * @author Artur
 */
public class StringHelper {

    /**
     * This method cut the String and
     * Samples if you use that 'AACD' -> 'CD' or 'ACD' -> 'CD' or 'CDEF' -> ÇDEF' or 'CDAA' -> 'CDAA'
     * @param str
     * @return String
     */
    public String truncateAInFirst2Positions(String str) {
        if (str.length() <= 2)
            return str.replaceAll("A", "");

        String first2Chars = str.substring(0, 2);
        String stringMinusFirst2Chars = str.substring(2);

        return first2Chars.replaceAll("A", "") + stringMinusFirst2Chars;
    }

    //ABCD -> false, ABAB -> true, AB -> true, A -> false
    public boolean areFirstAndLastTwoCharactersTheSame(String str) {

        if (str.length() <= 1)
            return false;
        if (str.length() == 2)
            return true;

        String first2Chars = str.substring(0, 2);

        String last2Chars = str.substring(str.length() - 2);

        return first2Chars.equals(last2Chars);
    }
}