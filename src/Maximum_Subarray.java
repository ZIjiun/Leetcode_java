public class Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int curr = nums[0];
        for(int i = 1; i < nums.length; i++) {
            curr += nums[i];
            if (curr < 0 || nums[i] > curr)
                curr = nums[i];
            if (res < curr)
                res = curr;
        }
        return res;
    }
}
