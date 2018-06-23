package P496_NextGreaterElementI;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2018/4/8 9:39
 */
public class Solution1 {
    @Test
    public void testCase() {
        int[] nums11 = new int[]{4, 1, 2};
        int[] nums12 = new int[]{1, 3, 4, 2};
        for (int i : nextGreaterElement(nums11, nums12)) {
            System.out.println(i);
        }

        System.out.println("----------");

        int[] nums21 = new int[]{2, 4};
        int[] nums22 = new int[]{1, 2, 3, 4};
        for (int i : nextGreaterElement(nums21, nums22)) {
            System.out.println(i);
        }
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            //find the element of nums1
            int index = -1;
            result[i] = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    index = j;
                    break;
                }
            }
            for (int j = index; j < nums2.length; j++) {
                if (nums1[i] < nums2[j]) {
                    result[i] = nums2[j];
                    break;
                }
            }
        }
        return result;
    }

}
