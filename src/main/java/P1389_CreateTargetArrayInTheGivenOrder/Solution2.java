package P1389_CreateTargetArrayInTheGivenOrder;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 * 第二种解法，直接干，插入的位置若已有元素，将元素往后挪动后再插入。
 *
 * @author Lin Hui
 * Created on 2020/3/27 13:47
 */
public class Solution2 {
    @Test
    public void testCase() {
        Assert.assertArrayEquals(new int[]{0, 4, 1, 3, 2}, createTargetArray(new int[]{0, 1, 2, 3, 4}, new int[]{0, 1, 2, 2, 1}));
        Assert.assertArrayEquals(new int[]{0, 1, 2, 3, 4}, createTargetArray(new int[]{1, 2, 3, 4, 0}, new int[]{0, 1, 2, 3, 0}));
        Assert.assertArrayEquals(new int[]{1}, createTargetArray(new int[]{1}, new int[]{0}));
    }

    public int[] createTargetArray(int[] nums, int[] index) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (index[i] < i) {
                for (int j = i; j > index[i]; j--) {
                    ans[j] = ans[j - 1];
                }
            }
            ans[index[i]] = nums[i];
        }
        return ans;
    }
}
