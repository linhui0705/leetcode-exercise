package P1103_DistributeCandiesToPeople;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给n个人分糖果，从第一个人开始，分糖果的数量每次递增1颗，以此往复分糖。到第k次分糖时，若剩余的糖果小于等于k，则分给最后一个人。
 *
 * @author Lin Hui
 * Created on 2019-12-26 20:00
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public int[] distributeCandies(int candies, int num_people) {
        int[] ans = new int[num_people];
        int i = 0;
        while (candies > 0) {
            int count = i + 1 > candies ? candies : i + 1;
            ans[(i++) % num_people] += count;
            candies -= count;
        }
        return ans;
    }
}
