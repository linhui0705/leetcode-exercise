package P1030_MatrixCellsInDistanceOrder;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Title: Solution1
 * Description:
 * 给定矩阵坐标的大小，以及中心坐标(r,c)。计算范围内的所有坐标和中心坐标的距离值(|r1-r2|+|c1-c2|)，然后根据距离值从小到大对坐标排序。
 *
 * @author Lin Hui
 * Created on 2019-4-21 20:31
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        List<Point> list = new ArrayList<>();
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                Point p = new Point();
                p.r = i;
                p.c = j;
                p.d = Math.abs(r0 - i) + Math.abs(c0 - j);
                list.add(p);
            }
        }
        Collections.sort(list, Comparator.comparingInt(o -> o.d));
        int[][] ans = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            ans[i][0] = list.get(i).r;
            ans[i][1] = list.get(i).c;
        }
        return ans;
    }

    class Point {
        int r;
        int c;
        int d;
    }
}
