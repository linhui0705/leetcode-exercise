package P0665_NonDecreasingArray;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 1  3 [5] 4  6  7 → 1  3  4  4  6  7
 * 1  4  5 [3] 6  7 → 1  4  5  5  6  7
 *
 * @author Lin Hui
 * Created on 2019-1-23 20:53
 */
public class Solution1 {
    @Test
    public void testCase() {
        System.out.println(checkPossibility(new int[]{4, 2, 3}));
        System.out.println(checkPossibility(new int[]{4, 2, 1}));
        System.out.println(checkPossibility(new int[]{3, 4, 2, 3}));
    }

    public boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                count++;
                //这个if-else才是关键，有点不太容易理解
                if (i - 2 < 0 || nums[i - 2] <= nums[i]) {
                    nums[i - 1] = nums[i];
                } else {
                    nums[i] = nums[i - 1];
                }
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }
}
