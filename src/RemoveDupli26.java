import java.util.Collections;

/**
 * Leetcode 26 Remove duplicates from sorted array
 *
 * @return new length
 * Requirement: not allocate extra space --> O(1)
 */
public class RemoveDupli26 {
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;

        while(j<n) {
            if (nums[j] == nums[i]) {
                j++;
            } else {
                nums[++i] = nums[j++];
            }
        }
        return nums.length == 0 ? 0:i+1;

    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int res = removeDuplicates(arr);
        System.out.println(res);
    }
}
