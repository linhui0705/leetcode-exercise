package P766_ToeplitzMatrix;

/**
 * Title: Solution1
 * Description:
 * 呃……起初想复杂了，就这么简单就OK了
 *
 * @author Lin Hui
 * Created on 2018-4-3 23:01
 */
public class Solution1 {
    public static void main(String[] args) {
        int[][] a = new int[][]{{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}};
        System.out.println(isToeplitzMatrix(a));
    }

    public static boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i - 1][j - 1] != matrix[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
