import java.util.Arrays;

public class ArrayPartition_561 {
    public static int arrayPairSum(int[] nums){
        Arrays.sort(nums);
        int res = 0;
        for(int i = 0;i<nums.length;i+=2){
            res+=nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,4,3,2};
        arrayPairSum(nums);
    }
}
