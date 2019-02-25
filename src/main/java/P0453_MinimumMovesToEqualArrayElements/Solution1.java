package P0453_MinimumMovesToEqualArrayElements;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 题目大意：每次可以给n-1个数加1，总共需要多少次操作，才使得数组元素一致
 * 转换下思维，可以看作是每次对一个元素进行减1操作，需要若干次操作后能使得数组所有元素一致。
 *
 * @author Lin Hui
 * Created on 2019-2-7 13:41
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(3, minMoves(new int[]{1, 2, 3}));
    }

    public int minMoves(int[] nums) {
        int result = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            result += nums[i] - min;
        }
        return result;
    }
}
