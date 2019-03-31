package P1018_BinaryPrefixDivisibleBy5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Solution1
 * Description:
 * 判断A[0]到A[i]的子数组组成的二进制数，能否被5整除
 * 输入用例的最大数组长度为30000，我们不可能特意算出30000位的二进制数所对应的十进制数。
 * 我们只需判断二进制数对应的十进制能否被5整除，因此可以缩小规模，求余判断个位数即可。
 *
 * @author Lin Hui
 * Created on 2019-3-31 20:42
 */
public class Solution1 {
    @Test
    public void testCase() {
        for (Boolean b : prefixesDivBy5(new int[]{0, 1, 1})) {
            System.out.print(b + " ");
        }
        System.out.println();
        for (Boolean b : prefixesDivBy5(new int[]{1, 1, 1})) {
            System.out.print(b + " ");
        }
        System.out.println();
        for (Boolean b : prefixesDivBy5(new int[]{0, 1, 1, 1, 1, 1})) {
            System.out.print(b + " ");
        }
        System.out.println();
        for (Boolean b : prefixesDivBy5(new int[]{1, 1, 1, 0, 1})) {
            System.out.print(b + " ");
        }
        System.out.println();
    }

    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> ans = new ArrayList<>();
        int total = 0;
        for (int i = 0; i < A.length; i++) {
            total = ((total << 1) + A[i]) % 10;
            ans.add(total % 5 == 0);
        }
        return ans;
    }
}
