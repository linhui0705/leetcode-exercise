package P1299_ReplaceElementsWithGreatestElementOnRightSide;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定数组arr，用每个元素右侧最大的元素来替换，若该元素为数组最后一个元素，则用-1替代。
 *
 * @author Lin Hui
 * Created on 2020-1-11 21:58
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertArrayEquals(new int[]{18, 6, 6, 6, 1, -1}, replaceElements(new int[]{17, 18, 5, 4, 6, 1}));
    }

    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        ans[n - 1] = -1;
        for (int i = n - 2; i >= 0; i--) {
            ans[i] = Math.max(arr[i + 1], ans[i + 1]);
        }
        return ans;
    }
}
