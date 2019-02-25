package P0088_MergeSortedArray;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 题解的思路
 * 比较巧妙，先比较最大的，从后往前进行插入排序，然后较小的元素就覆盖数组num1的前部。尽可能少地挪动数组元素。
 *
 * @author Lin Hui
 * Created on 2019-2-12 9:46
 */
public class Solution1 {
    @Test
    public void testCase() {
        merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
        merge(new int[]{4, 5, 6, 0, 0, 0}, 3, new int[]{1, 2, 3}, 3);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}