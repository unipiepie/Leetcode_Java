import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            Integer compliment = target - nums[i];
            if (map.containsKey(compliment) && map.get(compliment) != i) {
                return new int[]{i, map.get(compliment)};
            }
        }
        throw new IllegalArgumentException("No two sum solution.");
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 1};
        int target = 6;
        int[] res = twoSum(nums, target);
        for (int i : res) {
            System.out.print(i);
        }
    }
}
