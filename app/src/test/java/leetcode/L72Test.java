package leetcode;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class L72Test {
    @Test
    void testMinDistance() {
        L72 l72 = new L72();

        // Test case 1: General case
        String word1 = "horse";
        String word2 = "ros";
        int result = l72.minDistance(word1, word2);
        assertThat(result, equalTo(3));

        // Test case 2: Both strings are empty
        word1 = "";
        word2 = "";
        result = l72.minDistance(word1, word2);
        assertThat(result, equalTo(0));

        // Test case 3: One string is empty
        word1 = "intention";
        word2 = "";
        result = l72.minDistance(word1, word2);
        assertThat(result, equalTo(9));

        // Test case 4: Both strings are the same
        word1 = "abc";
        word2 = "abc";
        result = l72.minDistance(word1, word2);
        assertThat(result, equalTo(0));

        // Test case 5: Completely different strings
        word1 = "abc";
        word2 = "def";
        result = l72.minDistance(word1, word2);
        assertThat(result, equalTo(3));

        // Test case 6: One character difference
        word1 = "kitten";
        word2 = "sitting";
        result = l72.minDistance(word1, word2);
        assertThat(result, equalTo(3));
    }
}