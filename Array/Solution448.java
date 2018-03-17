import java.util.*;

//Find All Numbers Disappeared in an Array   my solution
class Solution448 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<Integer>();
        int n = 0;
        int k = 1;
        if(nums.length == 0) {
            return res;
        }
        int a = nums[0];
        if(a > 1) {
            while(a > 1) {
                res.add(a - 1);
                a--;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            n = 0;
            k = 1;

            if (i < nums.length - 1){
                n = nums[i + 1] - nums[i];
            }

            if (n > 1) {
                while(k < n){
                    res.add(nums[i] + k);
                    k++;

                }
            }
        }
        n = nums.length - nums[nums.length - 1];
        k = 1;
        if(n >= 1) {
            while (k <= n) {
                res.add(nums[nums.length - 1] + k);
                k++;

            }
        }
        return res;
    }


    public static void main(String[] args) {
        int[] a = new int[]{5,4,6,7,9,3,10,9,5,6};
        List<Integer> res1 = new ArrayList<Integer>();
        res1 = findDisappearedNumbers(a);
    }
}