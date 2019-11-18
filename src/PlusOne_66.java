/**
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 */
public class PlusOne_66 {
    public static int[] plusOne(int[] digits){
        int n = digits.length;
        //初始化t：不进位为0||进位为1
        int t = 1;
        //类似高精度加减法
        for(int i=n-1;i>=0;--i){
            if(t == 0) return digits;
            int sum = digits[i]+t;
            digits[i] = sum%10;
            t=sum/10;
        }
        //check the first position
        int[] res = new int[n+1];
        res[0] =1;
        return t == 0 ? digits:res;
    }

    public static void main(String[] args) {
        int[] arr ={0};
        int[] result = plusOne(arr);
        for(int i =0;i<result.length;i++)
        System.out.print(arr[i]);
    }
}
