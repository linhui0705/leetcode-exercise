package P1022_SmallestIntegerDivisibleByK;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 被除数每位都是1，返回被除数能被K整除的最小位数长度。若无则返回-1。
 * 这个题目可以从两方面入手：
 * 1.被除数由若干个1组成，是奇数，则必定不能被偶数整除；能被5整除的被除数，个位数只能是0或5。
 * 因此，K求余得2或5，被除数必定不能被整除，可直接返回-1。
 * 2.判断一个数是否能被整除，只要求余得0即可，不必特意遍历出被除数，且被除数的长度可能会超过long，没有必要。
 *
 * @author Lin Hui
 * Created on 2019/3/26 10:06
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(1, smallestRepunitDivByK(1));
        Assert.assertEquals(-1, smallestRepunitDivByK(2));
        Assert.assertEquals(3, smallestRepunitDivByK(3));
    }

    public int smallestRepunitDivByK(int K) {
        if ((K & 1) == 0 || K % 5 == 0) {
            return -1;
        }
        int value = 0;
        int count = 0;
        for (int i = 1; i < 100000; i++) {
            value = (value * 10 + 1) % K;
            count++;
            if (value == 0) {
                return count;
            }
        }
        return -1;
    }
}
