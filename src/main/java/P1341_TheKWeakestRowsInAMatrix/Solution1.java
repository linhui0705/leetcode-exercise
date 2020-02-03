package P1341_TheKWeakestRowsInAMatrix;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Title: Solution1
 * Description:
 * 给定一个二维数组mat和数值k，统计二维数组每行元素的和，返回元素和前k个小的行号。
 *
 * @author Lin Hui
 * Created on 2020-2-3 11:12
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertArrayEquals(
                new int[]{2, 0, 3},
                kWeakestRows(new int[][]{{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}}, 3));
        Assert.assertArrayEquals(
                new int[]{0, 2},
                kWeakestRows(new int[][]{{1, 0, 0, 0}, {1, 1, 1, 1}, {1, 0, 0, 0}, {1, 0, 0, 0}}, 2));
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        int[] ans = new int[k];
        List<Obj> list = new ArrayList<>(k);
        int m = mat.length;
        int n = mat[0].length;
        for (int i = 0; i < m; i++) {
            int total = 0;
            for (int j = 0; j < n; j++) {
                total += mat[i][j];
            }
            list.add(new Obj(i, total));
        }
        list.sort(Comparator.comparingInt(o -> o.c));
        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i).i;
        }
        return ans;
    }

    class Obj {
        int i;
        int c;

        Obj(int i, int c) {
            this.i = i;
            this.c = c;
        }
    }
}
