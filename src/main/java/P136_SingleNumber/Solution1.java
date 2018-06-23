package P136_SingleNumber;

import java.util.*;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2018/3/12 18:58
 */
public class Solution1 {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1,1,2,2,3,3,4,4,5,5,7,7,9,13,13,36,36}));
    }

    public static int singleNumber(int[] nums) {
        int total = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            total += nums[i];
        }
        for (int i : set) {
            total -= i * 2;
        }
        return -total;
    }
}
