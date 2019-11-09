/**
 * Leecode 27 Type: Array operation
 *
 * @parameter nums[] & val
 * @return length
 * O(n)
 *
 * Example:
 * Given nums = [3,2,2,3], val = 3
 * Return length =2
 */
public class RemoveElement27 {
    public static int remove(int[] nums,int val){
        int n = nums.length;
        //Define an pointer
        int i=0;
        while(i<n){
          if(nums[i] == val){
              nums[i] = nums[n-1];
              n--;
          }else{
              i++;
          }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        int res = remove(nums,val);
        System.out.println(res);
    }
}
