import java.util.HashMap;
import java.util.Map;

public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int complement = 0;
        int targetNum = 0;
        for (int i = 0; i < nums.length; i++) {
            complement = target - nums[i];
            if (map.containsKey(complement)) {
                targetNum = i;
                break;
            }
            map.put(nums[i], i);
        }
        return new int[]{ map.get(complement), targetNum};
    }
}
