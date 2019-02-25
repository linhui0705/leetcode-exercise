package P997_FindTheTownJudge;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * Weekly Contest 125
 * 题意：找出镇上的传言的法官
 * 规则：
 * 1.法官不信任何人；
 * 2.除法官外，任何人都相信法官；
 * 3.只有一个人满足以上两个条件。
 *
 * 刚开始写比较赶，循环写的有些多了。感觉效率不算高。
 *
 * @author Lin Hui
 * Created on 2019/2/25 10:43
 */
public class Solution1 {
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
        }

        //Find the person that trusts nobody.
        int index = -1;
        for (int i = 0; i < vote.length; i++) {
            if (vote[i] == 0) {
                if (index == -1) {
                    index = i;
                } else {
                    return -1;
                }
            }
        }
        if (index == -1) {
            return index;
        }

        count[index] = 1;
        for (int i = 0; i < trust.length; i++) {
            if (trust[i][1] - 1 == index) {
                count[trust[i][0] - 1]++;
            }
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] == 0) {
                return -1;
            }
        }

        return index + 1;
    }
}
