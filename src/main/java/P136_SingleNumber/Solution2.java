package P136_SingleNumber;

import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 *
 * @author Lin Hui
 * Created on 2018/4/9 15:55
 */
public class Solution2 {
    @Test
    public void testCase() {
        int[] nums = new int[]{9, 1, 2, 2, 3, 3, 4, 4, 5, 5, 1, 7, 7, 13, 13, 36, 36};
        System.out.println(singleNumber(nums));
    }

    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(ans);
            ans ^= nums[i];
        }
        System.out.println("----------");
        return ans;
    }
}
