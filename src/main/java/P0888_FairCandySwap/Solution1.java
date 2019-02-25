package P0888_FairCandySwap;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * O(n²), 122ms
 * 可以考虑用HashSet，将嵌套的两个for循环化解为一个for循环，时间复杂度降为O(n)
 *
 * @author Lin Hui
 * Created on 2018-12-30 19:55
 */
public class Solution1 {
    @Test
    public void testCase() {
        int[] A = new int[]{1, 2};
        int[] B = new int[]{2, 3};
        int[] ans1 = fairCandySwap(B, A);
        System.out.println(ans1[0] + "," + ans1[1]);

        int[] C = new int[]{2};
        int[] D = new int[]{1, 3};
        int[] ans2 = fairCandySwap(D, C);
        System.out.println(ans2[0] + "," + ans2[1]);

        int[] E = new int[]{1, 2, 5};
        int[] F = new int[]{2, 4};
        int[] ans3 = fairCandySwap(F, E);
        System.out.println(ans3[0] + "," + ans3[1]);
    }

    public int[] fairCandySwap(int[] A, int[] B) {
        int diff = 0;
        for (int i : A) {
            diff += i;
        }
        for (int i : B) {
            diff -= i;
        }
        diff = diff >> 1;

        for (int aA : A) {
            if (aA > diff) {
                for (int aB : B) {
                    if (aA - diff == aB) {
                        return new int[]{aA, aB};
                    }
                }
            }
        }

        return new int[]{0, 0};
    }
}
