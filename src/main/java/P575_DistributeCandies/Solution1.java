package P575_DistributeCandies;

import java.util.*;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2018-3-11 11:57
 */
public class Solution1 {
    public static void main(String[] args) {
        int[] candies = new int[]{1, 1, 1, 1, 2, 2, 2, 3, 3, 3};//half=5 size()=3
        System.out.println(distributeCandies(candies));
    }

    public static int distributeCandies(int[] candies) {
        int all = candies.length;
        int half = all / 2;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < candies.length; i++) {
            set.add(candies[i]);
        }
        if (half <= set.size()) {
            return half;
        }
        return set.size();
    }
}
