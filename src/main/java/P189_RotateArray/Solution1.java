package P189_RotateArray;

import org.junit.Test;

import java.util.Arrays;

/**
 * Title: Solution1
 * Description:
 * 这个方法比较笨……
 *
 * P.S.:在Discuss看到个很好的答案。先对整个数组反转，然后根据步数，切分成两个子数组，分别对子数组反转。
 * e.g.:
 * 1 2 3 4 5 6 7
 * 7 6 5 4 3 2 1
 * 5 6 7 4 3 2 1
 * 5 6 7 1 2 3 4
 *
 * @author Lin Hui
 * Created on 2019-1-20 14:58
 */
public class Solution1 {
    @Test
    public void testCase() {
        int[] a1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotate(a1, 3);

        int[] a2 = new int[]{-1, -100, 3, 99};
        rotate(a2, 2);

    }

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        int len = nums.length;
        int[] a = Arrays.copyOfRange(nums, len - k, len);
        int[] b = Arrays.copyOfRange(nums, 0, len - k);

        for (int i = 0; i < a.length; i++) {
            nums[i] = a[i];
        }
        for (int i = a.length; i < a.length + b.length; i++) {
            nums[i] = b[i - a.length];
        }
    }
}
