package P0821_ShortestDistanceToACharacter;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 求到达特定字母的最短距离
 * e.g.:字符串"loveleetcode"，各个字母距离字母e最近的距离为：[3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
 *
 *   l  o  v  e  l  e  e  t  c  o  d  e
 * → 12 13 14 0  1  0  0  1  2  2  1  0
 *   3  2  1  0  1  0  0  4  3  2  1  0 ←
 *   取最小值。
 *
 * @author Lin Hui
 * Created on 2019-1-19 21:45
 */
public class Solution1 {
    @Test
    public void testCase() {
        int[] array = shortestToChar("loveleetcode", 'e');
        for (int a : array) {
            System.out.print(a);
            System.out.print(" ");
        }
    }

    public int[] shortestToChar(String S, char C) {
        int n = S.length();
        int[] arrays = new int[n];
        int prev = -n;
        for (int i = 0; i < n; i++) {
            if (C == S.charAt(i)) {
                prev = i;
            }
            arrays[i] = i - prev;
        }
        for (int i = n - 1; i >= 0; i--) {
            if (C == S.charAt(i)) {
                prev = i;
            }
            arrays[i] = Math.min(arrays[i], Math.abs(prev - i));
        }
        return arrays;
    }
}
