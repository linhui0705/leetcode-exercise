package P0485_MaxConsecutiveOnes;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2018/4/8 18:13
 */
public class Solution1 {
    @Test
    public void testCase() {
        int[] nums = new int[]{1, 1, 1, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                max = count > max ? count : max;
            } else {
                count = 0;
            }
        }
        return max;
    }
}
