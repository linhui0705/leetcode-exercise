package P0661_ImageSmoother;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2019-1-30 20:54
 */
public class Solution1 {
    @Test
    public void testCase() {
        int[][] M1 = new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        int[][] M2 = new int[][]{{2, 3, 4}, {5, 6, 7}, {8, 9, 10}, {11, 12, 13}, {14, 15, 16}};
        int[][] M3 = new int[][]{{1}, {3}, {5}};
        int[][] N = imageSmoother(M1);
    }

    public int[][] imageSmoother(int[][] M) {
        int r = M.length;
        int c = M[0].length;
        int[][] N = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int count = 0;
                for (int x = i - 1; x <= i + 1; x++) {
                    for (int y = j - 1; y <= j + 1; y++) {
                        if (x >= 0 && x < r && y >= 0 && y < c) {
                            N[i][j] += M[x][y];
                            count++;
                        }
                    }
                }
                N[i][j] /= count;
            }
        }

        return N;
    }
}
