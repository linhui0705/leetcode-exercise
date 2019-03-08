package P0532_KDiffPairsInAnArray;

import org.junit.Test;

import java.util.Arrays;

/**
 * Title: Solution2
 * Description:
 * 在第一次AC代码的基础上优化，指针元素差值大于k，跳出内层循环。
 * 运行时间从116ms减少至18ms，但也只快过43.49%
 * 后面发现，既然数组已经排序了，又何必用abs方法。结果从18ms减至13ms，击败86.31%
 * 再剩下的，就是细节的优化了。就酱……
 *
 * @author Lin Hui
 * Created on 2019-3-8 21:17
 */
public class Solution2 {
    @Test
    public void testCase() {

    }

    public int findPairs(int[] nums, int k) {
        int ans = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            while (i - 1 >= 0 && i < nums.length && nums[i - 1] == nums[i]) {
                i++;
            }
            for (int j = i + 1; j < nums.length && nums[j] - nums[i] <= k; j++) {
                if (nums[j] - nums[i] == k) {
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}
