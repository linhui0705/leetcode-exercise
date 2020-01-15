package P1313_DecompressRunLengthEncodedList;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 编码解压缩，每两个元素为一对[a,b]，表示有a个元素b，以此类推，返回一个数组，表示其解压缩后的结果。
 * e.g.: [1,2,3,4]表示有1个2，3个4，所以结果返回数组[2,4,4,4]
 *
 * @author Lin Hui
 * Created on 2020-1-15 16:24
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertArrayEquals(new int[]{2, 4, 4, 4}, decompressRLElist(new int[]{1, 2, 3, 4}));
        Assert.assertArrayEquals(new int[]{5, 5, 5, 8, 8, 8, 8, 6, 6, 6, 6, 6}, decompressRLElist(new int[]{3, 5, 4, 8, 5, 6}));
    }

    public int[] decompressRLElist(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length; i += 2) {
            n += nums[i];
        }
        int[] ans = new int[n];
        int k = 0;
        for (int i = 1; i < nums.length; i += 2) {
            int a = nums[i - 1];
            int b = nums[i];
            for (int j = 0; j < a; j++) {
                ans[k++] = b;
            }
        }
        return ans;
    }
}
