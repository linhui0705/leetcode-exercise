package P1128_NumberOfEquivalentDominoPairs;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定一组domino，设其中一个为[a,b]，另一个为[c,d]，若a=c且b=d，或者a=d且b=c，则算是符合题意的一对
 * 算出符合题意的共有多少对
 * <p>
 * 刚开始，用for循环匹配，时间复杂度O(n^2)，显然TLE了。
 * 后面想到了这个解法，就是各个domino存到二维数组当中，用二维数组计数，再去根据计数和来算符合题意的配对数量就OK了。
 *
 * @author Lin Hui
 * Created on 2019/12/27 12:19
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(1, numEquivDominoPairs(new int[][]{{1, 2}, {2, 1}, {3, 4}, {5, 6}}));
        Assert.assertEquals(3, numEquivDominoPairs(new int[][]{{1, 2}, {1, 2}, {1, 1}, {1, 2}, {2, 2}}));
    }

    public int numEquivDominoPairs(int[][] dominoes) {
        if (dominoes.length <= 1) {
            return 0;
        }

        int ans = 0;
        int[][] grid = new int[10][10];
        for (int[] domino : dominoes) {
            grid[domino[0]][domino[1]]++;
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                int n = i == j ? grid[i][j] : grid[i][j] + grid[j][i];
                if (n > 1) {
                    ans += n * (n - 1) / 2;
                }
            }
        }

        return ans;
    }
}
