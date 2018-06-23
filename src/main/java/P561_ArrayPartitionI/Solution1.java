package P561_ArrayPartitionI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2018-3-10 17:08
 */
public class Solution1 {
    public static void main(String[] args) {
        int[] a = {-10000,10000,1,3};
        System.out.println(arrayPairSum(a));
    }

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i += 2) {
            result += nums[i];
        }
        return result;
    }
}
