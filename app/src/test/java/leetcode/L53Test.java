package leetcode;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class L53Test {
    @Test
    void testMaxSubArray() {
        L53 l53 = new L53();
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int res = l53.maxSubArray(nums1);
        assertThat(res, equalTo(6));
    }
}
