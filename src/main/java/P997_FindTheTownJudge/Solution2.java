package P997_FindTheTownJudge;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 * 先记录每个人的投票票数和获得票数。
 * 只要找到没投票的人，获得的票数是N-1票，那这个人就是法官。
 * 题目其实很水，就是想复杂了……
 *
 * @author Lin Hui
 * Created on 2019/2/25 10:50
 */
public class Solution2 {
    @Test
    public void testCase() {
        Assert.assertEquals(2, findJudge(2, new int[][]{{1, 2}}));
        Assert.assertEquals(3, findJudge(3, new int[][]{{1, 3}, {2, 3}}));
        Assert.assertEquals(-1, findJudge(3, new int[][]{{1, 3}, {2, 3}, {3, 1}}));
        Assert.assertEquals(-1, findJudge(3, new int[][]{{1, 2}, {2, 3}}));
        Assert.assertEquals(3, findJudge(4, new int[][]{{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}}));
    }

    public int findJudge(int N, int[][] trust) {
        int[] vote = new int[N];
        int[] count = new int[N];
        for (int i = 0; i < trust.length; i++) {
            vote[trust[i][0] - 1]++;
            count[trust[i][1] - 1]++;
        }

        for (int i = 0; i < N; i++) {
            if (vote[i] == 0 && count[i] == N - 1) {
                return i + 1;
            }
        }
        return -1;
    }
}
