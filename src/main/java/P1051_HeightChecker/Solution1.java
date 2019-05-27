package P1051_HeightChecker;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Title: Solution1
 * Description:
 * 水题，排队问题，就是问多少人没按顺序排错队了……
 *
 * @author Lin Hui
 * Created on 2019/5/27 10:18
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(3, heightChecker(new int[]{1, 1, 4, 2, 1, 3}));
    }

    public int heightChecker(int[] heights) {
        int[] arr = heights.clone();
        Arrays.sort(arr);
        int ans = 0;
        for (int i = 0; i < heights.length; i++) {
            if (arr[i] != heights[i]) {
                ans++;
            }
        }
        return ans;
    }
}
