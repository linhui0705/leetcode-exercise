package P0448_FindAllNumbersDisappearedInAnArray;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Solution1
 * Description:
 * 实在没想出来，看到一个很牛逼的解题思路。赞一个！
 * 详见：https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/discuss/92956/Java-accepted-simple-solution
 *
 * @author Lin Hui
 * Created on 2018/4/9 13:06
 */
public class Solution1 {
    @Test
    public void testCase() {
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        findDisappearedNumbers(nums);

        for (int i : findDisappearedNumbers(nums)) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ret = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if (nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ret.add(i + 1);
            }
        }

        return ret;
    }
}
