package P1030_MatrixCellsInDistanceOrder;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Title: Solution2
 * Description:
 * 参考，来自uwi的题解
 *
 * @author Lin Hui
 * Created on 2019-4-21 20:44
 */
public class Solution2 {
    @Test
    public void testCase() {

    }

    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] ret = new int[R * C][];
        int p = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                ret[p++] = new int[]{i, j, Math.abs(r0 - i) + Math.abs(c0 - j)};
            }
        }
        Arrays.sort(ret, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[2] - b[2];
            }
        });
        for (int i = 0; i < R * C; i++) {
            ret[i] = Arrays.copyOf(ret[i], 2);
        }
        return ret;
    }
}
