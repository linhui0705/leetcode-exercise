package P1512_NumberOfGoodPairs;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: Solution1
 * Description:
 * 题目本身不难，map里面有的方法没怎么用倒有点忘了，拿出来验证下花了点时间。
 * 题目大意是：给定一个数组nums，当nums[i]==nums[j]且i<j时，为一个Good Pair。问数组nums内有多少个这样的Good Pair？
 * 题目本质就是先算出元素出现的次数，若出现n次，则表示有n*(n-1)/2对Good Pair。
 *
 * @author Lin Hui
 * Created on 2021/2/10 13:51:57
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(4, numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
        Assert.assertEquals(6, numIdenticalPairs(new int[]{1, 1, 1, 1}));
        Assert.assertEquals(0, numIdenticalPairs(new int[]{1, 2, 3}));
    }

    public int numIdenticalPairs(int[] nums) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            // map.merge(num, 1, Integer::sum);
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (int val : map.values()) {
            ans += (val * (val - 1) / 2);
        }
        return ans;
    }
}
