/**
 * Same requirement as lc 26 --> SC IS O(1)
 * element aprears at most twice
 *
 * @return new length
 */
public class RemoveDupli_80 {

    public static int removeDuplicates(int[] nums) {
        //Still Two pointers
        int n = nums.length;
        int i = 0;
        int j = i + 1;
        int count = 1;
        while (j < n) {
            if (nums[i] == nums[j] && count == 0) {
                j++;
            } else {
                if (nums[i] == nums[j]) count--;
                else count = 1;
                nums[++i] = nums[j++];
            }
        }
        return n == 0 ? 0 : i + 1;
    }

    public static void main(String[] args) {
        //Test case
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int res = removeDuplicates(arr);
        System.out.println(res);
    }
}
