package P0985_SumOfEvenNumbersAfterQueries;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 题目大意是：给出一个一维数组A和二位数组queries，queries[i][0]作为值(val)，queries[i][1]作为索引(index)。
 * 现将val加到A[index]，然后计算出数组A的偶数和。返回经过queries.length次数操作后，每次得到的偶数和。
 *
 * @author Lin Hui
 * Created on 2019-2-7 9:59
 */
public class Solution1 {
    @Test
    public void testCase() {
        int[] A = new int[]{1, 2, 3, 4};
        int[][] queries = new int[][]{{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};
        int[] result = sumEvenAfterQueries(A, queries);
    }

    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] result = new int[A.length];

        int total = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                total += A[i];
            }
        }

        for (int i = 0; i < queries.length; i++) {
            int val = queries[i][0];
            int index = queries[i][1];
            if (A[index] % 2 == 0) {
                if ((A[index] + val) % 2 == 0) {
                    total += val;
                } else {
                    total -= A[index];
                }
            } else {
                if ((A[index] + val) % 2 == 0) {
                    total += A[index] + val;
                }
            }

            A[index] += val;
            result[i] = total;
        }
        return result;
    }
}
