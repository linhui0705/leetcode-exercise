package P0905_SortArrayByParity;

import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 *
 * @author Lin Hui
 * Created on 2018/12/24 9:50
 */
public class Solution2 {
    @Test
    public void testCase() {
        int[] a = new int[]{1, 2, 3, 4};
        int[] b = sortArrayByParity(a);
        for (int i : b) {
            System.out.println(i);
        }
    }

    public int[] sortArrayByParity(int[] A) {
        int i = 0;
        int j = A.length - 1;
        int temp = 0;
        while (i < j) {
            if ((A[i] & 1) == 0) {
                i++;
                continue;
            }
            if ((A[j] & 1) == 1) {
                j--;
                continue;
            }
            temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
        return A;
    }
}
