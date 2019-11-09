import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Leetcode 912: Sort an Array (QuickSort)
 * <p>
 * Input: nums = [5,2,3,1]
 * Output: [1,2,3,5]
 */
public class SortAnArray912 {
    public static List<Integer> sortArrayQS(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            res.add(nums[i]);
        }
        sortArrayHelper(res,0,res.size()-1);
        return res;

    }
    public static List<Integer> sortArrayHelper(List<Integer> res,int l,int r){

        if (l >= r) return res;

        //Define critical point
        int x = res.get(l + r >> 1);
        //two pointers
        int i = l - 1;
        int j = r + 1;

        while (i < j) {
            do i++; while (res.get(i) < x);
            do j--; while (res.get(j) > x);
            //Do Swap
            if (i < j) {
                Collections.swap(res,i,j);
            }
        }

        sortArrayHelper(res, l, j);
        sortArrayHelper(res, j + 1, r);
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 1};
        //List<Integer> ob = new ArrayList<Integer>();
        List<Integer> x  = sortArrayQS(arr);
        System.out.println(x);



    }

}
