package P1431_KidsWithTheGreatestNumberOfCandies;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Solution1
 * Description:
 * 给定一个数组candies和额外的糖果数量extraCandies，假定将额外的糖果都给其中的一个小朋友，判断其数量能否成为当中数量最多的。
 * 返回数组List<Boolean>
 *
 * @author Lin Hui
 * Created on 2021/2/10 10:06:10
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertArrayEquals(new boolean[]{true, true, true, false, true},
                convertArray(kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3)));
        Assert.assertArrayEquals(new boolean[]{true, false, false, false, false},
                convertArray(kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1)));
        Assert.assertArrayEquals(new boolean[]{true, false, true},
                convertArray(kidsWithCandies(new int[]{12, 1, 12}, 10)));
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>(candies.length);
        int max = Integer.MIN_VALUE;
        for (int c : candies) {
            max = Math.max(c, max);
        }
        for (int candy : candies) {
            ans.add(candy + extraCandies >= max);
        }
        return ans;
    }

    private boolean[] convertArray(List<Boolean> list) {
        boolean[] arr = new boolean[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

}
