package P1013_PairsOfSongsWithTotalDurationsDivisibleBy60;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定一个数组，数组元素表示一首歌的时长。数组中有多少对歌曲，相加后能被60整除。
 * 第一次提交，尝试用两个for循环暴力，但题目的数组最大长度为60000，如此循环最大需要执行3600000000，显然会TLE。
 * 看了排名前十的大佬们的题解，方法都很巧妙，都是将每个元素求模60，缩小了问题规模。而剩下的也就是排列组合的问题了。
 * 时间复杂度也只需O(n)。
 *
 * @author Lin Hui
 * Created on 2019-3-17 15:55
 */
public class Solution1 {
    @Test
    public void testCase() {
        System.out.println(numPairsDivisibleBy60(new int[]{30, 20, 150, 100, 40}));
        System.out.println(numPairsDivisibleBy60(new int[]{60, 60, 60}));
    }

    public int numPairsDivisibleBy60(int[] time) {
        int ans = 0;
        int[] count = new int[60];
        for (int i = 0; i < time.length; i++) {
            count[time[i] % 60]++;
        }
        for (int i = 1; i < 30; i++) {
            ans += count[i] * count[60 - i];
        }
        ans += count[0] * (count[0] - 1) / 2;
        ans += count[30] * (count[30] - 1) / 2;

        return ans;
    }
}
