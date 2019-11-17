/**
 * Return largest sum which find the contiguous sub array
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * O(n)
 */
public class MaxSubArray_53 {
    //O(n)
    public static int maxSubArray(int[] nums){

        int curSum = 0;
        int sum = Integer.MIN_VALUE;

        for(int i:nums){
            curSum = Math.max(curSum+i,i);
            sum=Math.max(sum,curSum);
        }
        return sum;
    }

    //O(nlogn) 类似Binary Search Solution
    public static int maxSub(int[] nums){
        if(nums.length == 0) return 0;
        return bsHelper(nums,0,nums.length-1);
    }

    public static int bsHelper(int[] arr, int l,int r){
        if(l>=r) return arr[l];
        int mid = l+(r-l)/2;
        //知道左右sub array对比找最大值
        int lmax = bsHelper(arr,l,mid-1);
        int rmax = bsHelper(arr,mid+1,r);
        //拿来和中间值做对比？？
        int mmax = arr[mid];
        int res = mmax;
        /**
         * Explanation: 分治分为穿过Mid && 没穿过mid
         * 没穿过Mid: MaxSubarr要么在左边要么在右边，计算较大值
         * 穿过Mid: 向左找区间和最大的区间，向右找区间和最大的区间，拼接区间
         */
        for(int i = mid-1;i>=l;--i){
            res+=arr[i];
            mmax=Math.max(mmax,res);
        }

        for(int j = mid+1;j<=r;++j){
            res+=arr[j];
            mmax=Math.max(mmax,res);
        }
        return Math.max(mmax,Math.max(lmax,rmax));

    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int res = maxSubArray(nums);
        System.out.println(res);
    }
}
