package P1089_DuplicateZeros;

import org.junit.Test;

import java.util.Arrays;

/**
 * Title: Solution1
 * Description:
 * 给定一个数组，每遇到元素0就往后添加一个零，其余元素往后移动。
 *
 * @author Lin Hui
 * Created on 2019-12-26 19:51
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public void duplicateZeros(int[] arr) {
        int[] arrcpy = Arrays.copyOf(arr, arr.length);
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            if (arrcpy[j] != 0) {
                arr[i++] = arrcpy[j++];
            } else {
                arr[i++] = arrcpy[j];
                if (i + 1 < arr.length) {
                    arr[i++] = arrcpy[j++];
                }
            }
        }
    }
}
