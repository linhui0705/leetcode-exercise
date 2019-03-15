package P0219_ContainsDuplicateII;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: Solution1
 * Description:
 * 判断数组内重复元素的最小距离是否不超过k。
 *
 * @author Lin Hui
 * Created on 2019/3/15 16:17
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertTrue(containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
        Assert.assertTrue(containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
        Assert.assertFalse(containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //若key没有重复，put成功，则返回null；否则返回上一次put进去的value
            Integer x = map.put(nums[i], i);
            if (x != null && i - x <= k) {
                return true;
            }
        }
        return false;
    }
}
