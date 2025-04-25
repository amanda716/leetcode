
package leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class L1143Test {

    @Test
    void testLongestCommonSubsequence_BothStringsNonEmpty() {
        L1143 solution = new L1143();
        assertEquals(3, solution.longestCommonSubsequence("abcde", "ace"));
        assertEquals(2, solution.longestCommonSubsequence("abc", "ac"));
    }

    @Test
    void testLongestCommonSubsequence_OneStringEmpty() {
        L1143 solution = new L1143();
        assertEquals(0, solution.longestCommonSubsequence("", "abc"));
        assertEquals(0, solution.longestCommonSubsequence("abc", ""));
    }

    @Test
    void testLongestCommonSubsequence_BothStringsEmpty() {
        L1143 solution = new L1143();
        assertEquals(0, solution.longestCommonSubsequence("", ""));
    }

    @Test
    void testLongestCommonSubsequence_NoCommonSubsequence() {
        L1143 solution = new L1143();
        assertEquals(0, solution.longestCommonSubsequence("abc", "def"));
    }

    @Test
    void testLongestCommonSubsequence_IdenticalStrings() {
        L1143 solution = new L1143();
        assertEquals(5, solution.longestCommonSubsequence("abcde", "abcde"));
    }
}