/**
 * Version Iteration Prob.
 * Given n=5 versions; API isBadVersion()
 */
public class FindBadVersion_278 {

    public static int firstBadVersion(int n){
        //Binary Search
        int l = 1;
        int r = n-1;

        while(l<r){
            //Here, OJ有bug -->当l,r足够大，l+r会溢出，所以改成l+(r-l)/2 【T.T试了好久】
            //int mid = l+r >>1;
            int mid = l+(r-l)/2;
            if(isBadVersion(mid)) r=mid;
            else l=mid+1;
        }
        return l;
    }
}
