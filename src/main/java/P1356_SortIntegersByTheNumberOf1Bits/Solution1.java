package P1356_SortIntegersByTheNumberOf1Bits;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * Title: Solution1
 * Description:
 * 给定一个数组，对数组重新排序。排序规则为：1.数字的二进制位中1少的排前面，1多的排后面；2.两数字的二进制1数量相等的情况下，按照数字本身的大小排序。
 * 本题解是重写数组的排序方法，但毕竟这种方法不够巧妙。题解中最优解，有考虑用快排思想的，也有按照二进制1的数量赋予权重后排序的，都是比较巧妙的。
 *
 * @author Lin Hui
 * Created on 2020/3/8 10:36 下午
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertArrayEquals(new int[]{0, 1, 2, 4, 8, 3, 5, 6, 7}, sortByBits(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}));
        Assert.assertArrayEquals(new int[]{1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024}, sortByBits(new int[]{1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1}));
        Assert.assertArrayEquals(new int[]{10000, 10000}, sortByBits(new int[]{10000, 10000}));
        Assert.assertArrayEquals(new int[]{2, 3, 5, 17, 7, 11, 13, 19}, sortByBits(new int[]{2, 3, 5, 7, 11, 13, 17, 19}));
        Assert.assertArrayEquals(new int[]{10, 100, 10000, 1000}, sortByBits(new int[]{10, 100, 1000, 10000}));
    }

    public int[] sortByBits(int[] arr) {
        int[] ans = new int[arr.length];
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        list.sort((o1, o2) -> {
            int a = Integer.bitCount(o1);
            int b = Integer.bitCount(o2);
            if (a == b) {
                return o1 - o2;
            }
            return a - b;
        });
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
