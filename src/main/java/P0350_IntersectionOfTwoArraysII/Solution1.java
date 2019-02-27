package P0350_IntersectionOfTwoArraysII;

import org.junit.Test;

import java.util.Arrays;

/**
 * Title: Solution1
 * Description:
 * 求两个数组的交集
 * 和349题有点不同，举个例子，倘若nums1中元素2出现了2次，nums2中元素2也出现两次，那么输出结果就要返回有两个元素2。
 *
 * 可以用Map，也可以先排序，后用Two Pointers遍历找交集元素。毕竟输出结果顺序可以不考虑。
 *
 * @author Lin Hui
 * Created on 2019/2/27 10:05
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public int[] intersect(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int i = 0;
        int j = 0;
        int k = 0;
        int[] ans = new int[Math.min(m, n)];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while (i < m && j < n) {
            if (nums1[i] == nums2[j]) {
                ans[k++] = nums1[i];
                i++;
                j++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            }
        }
        return Arrays.copyOf(ans, k);
    }
}
