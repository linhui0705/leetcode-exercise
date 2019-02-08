package P812_LargestTriangleArea;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 拆分成三个三角形进行计算
 *
 * @author Lin Hui
 * Created on 2019-2-8 14:22
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(2, largestTriangleArea(new int[][]{{0, 0}, {0, 1}, {1, 0}, {0, 2}, {2, 0}}), 0);
    }

    public double largestTriangleArea(int[][] points) {
        double area = 0;
        for (int[] a : points) {
            for (int[] b : points) {
                for (int[] c : points) {
                    area = Math.max(area, 0.5 * (a[0] * b[1] + b[0] * c[1] + c[0] * a[1] - a[0] * c[1] - c[0] * b[1] - b[0] * a[1]));
                }
            }
        }
        return area;
    }
}
