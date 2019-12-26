package P1122_RelativeSortArray;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定两个数组，按照arr2的顺序对arr1进行排序，arr2中没出现的元素，则按照从小到大的顺序排在最后面。
 *
 * @author Lin Hui
 * Created on 2019-12-26 18:33
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] num = new int[1001];
        int[] ans = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            num[arr1[i]]++;
        }
        int k = 0;
        for (int i = 0; i < arr2.length; i++) {
            while (num[arr2[i]] > 0) {
                ans[k++] = arr2[i];
                num[arr2[i]]--;
            }
        }
        for (int i = 0; i < num.length; i++) {
            while (num[i] > 0) {
                ans[k++] = i;
                num[i]--;
            }
        }
        return ans;
    }
}
