package P645_SetMismatch;

import org.junit.Test;

import java.util.*;

/**
 * Title: Solution1
 * Description:
 * 原数组元素个数为n，元素为1-n随机排列，因某些原因导致有数组元素消失，变成另一个重复数。
 * 找数组当中重复的数和消失的数。
 *
 * @author Lin Hui
 * Created on 2019-2-8 14:57
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];

        Set<Integer> set = new HashSet<>();

        int total = 0;
        int ans = 0;
        int duplicate = 0;
        for (int i = 0; i < nums.length; i++) {
            if (duplicate == 0 && !set.add(nums[i])) {
                duplicate = nums[i];
            }
            total += (i + 1);
            ans += nums[i];
        }
        result[0] = duplicate;
        result[1] = duplicate + (total - ans);

        return result;
    }
}
