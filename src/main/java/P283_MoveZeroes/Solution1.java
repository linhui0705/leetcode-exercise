package P283_MoveZeroes;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 移动0元素，将非零数整体向前移动，0向后移动
 *
 * @author Lin Hui
 * Created on 2019-1-30 22:00
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public void moveZeroes(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k++] = nums[i];
            }
        }
        for (int i = k; i < nums.length; i++) {
            nums[k] = 0;
        }
    }
}
