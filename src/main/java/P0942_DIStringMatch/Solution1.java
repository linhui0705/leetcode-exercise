package P0942_DIStringMatch;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 没想到思路
 * 看了Solution，感觉题解还是挺巧妙的
 * 如果是I，就按顺序从小到大放数；反之，如果是D，则从大到小放
 * 时间复杂度O(n)
 *
 * @author Lin Hui
 * Created on 2019-1-22 20:05
 */
public class Solution1 {
    @Test
    public void testCase() {
        for (int i : diStringMatch("IDID")) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
        for (int i : diStringMatch("III")) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
        for (int i : diStringMatch("")) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
    }

    public int[] diStringMatch(String S) {
        int n = S.length();
        int[] arrays = new int[n + 1];
        int left = 0;
        int right = n;
        for (int i = 0; i < n; i++) {
            if (S.charAt(i) == 'I') {
                arrays[i] = left++;
            } else {
                arrays[i] = right--;
            }
        }
        arrays[n] = left;
        return arrays;
    }
}
