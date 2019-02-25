package P0836_RectangleOverlap;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 只要一个矩形的任意一边不再另一个矩形两边范围内，则必定不会重合，依此据编码即可。
 *
 * @author Lin Hui
 * Created on 2019-1-21 21:25
 */
public class Solution1 {
    @Test
    public void testCase() {
        System.out.println(isRectangleOverlap(new int[]{0, 0, 2, 2}, new int[]{1, 1, 3, 3}));
        System.out.println(isRectangleOverlap(new int[]{0, 0, 1, 1}, new int[]{1, 0, 2, 1}));
        System.out.println(isRectangleOverlap(new int[]{0, 0, 4, 4}, new int[]{1, 1, 3, 3}));
        System.out.println(isRectangleOverlap(new int[]{7, 8, 13, 15}, new int[]{10, 8, 12, 20}));
    }

    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return !(rec1[2] <= rec2[0] || rec2[2] <= rec1[0] || rec1[3] <= rec2[1] || rec2[3] <= rec1[1]);
    }
}
