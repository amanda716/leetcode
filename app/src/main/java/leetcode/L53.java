package leetcode;

public class L53 {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int preSum = nums[0];
        int curSum = 0;
        int res = preSum;
        for (int i = 1; i < n; i++) {
            curSum = Math.max(nums[i], preSum + nums[i]);
            res = Math.max(res, curSum);
            preSum = curSum;
        }
        return res;
    }
}
