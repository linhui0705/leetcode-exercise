package P989_AddToArrayFormOfInteger;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Title: Solution1
 * Description:
 * 主要是想快点解决，但实际性能并不算咋地
 * 用了多一个List去存储，有点浪费空间了。而且代码判断有些冗长，不够巧妙。
 * 题目有个坑，没有在输入用例展示出来。就是当数组A长度小于整数K的位数，这种情况要考虑。
 * 所以，极端状况也要考虑，还是要仔细想想题目的坑……
 *
 * public void add(int index, E element)
 * 用ArrayList的如上方法插入，可以省去反转的步骤……
 * 或者使用Collections.reverse(List<?> list)，也可以反转List
 * Get it......
 *
 * @author Lin Hui
 * Created on 2019-2-10 12:50
 */
public class Solution1 {
    @Test
    public void testCase() {
        List<Integer> list1 = addToArrayForm(new int[]{1, 2, 0, 0}, 34);
        for (int i : list1) {
            System.out.print(i);
        }
        System.out.println();

        List<Integer> list2 = addToArrayForm(new int[]{2, 7, 4}, 181);
        for (int i : list2) {
            System.out.print(i);
        }
        System.out.println();

        List<Integer> list3 = addToArrayForm(new int[]{2, 1, 5}, 806);
        for (int i : list3) {
            System.out.print(i);
        }
        System.out.println();

        List<Integer> list4 = addToArrayForm(new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9}, 1);
        for (int i : list4) {
            System.out.print(i);
        }
        System.out.println();

        List<Integer> list5 = addToArrayForm(new int[]{0}, 23);
        for (int i : list5) {
            System.out.print(i);
        }
        System.out.println();

        List<Integer> list6 = addToArrayForm(new int[]{6}, 809);
        for (int i : list6) {
            System.out.print(i);
        }
        System.out.println();

        List<Integer> list7 = addToArrayForm(new int[]{7}, 993);
        for (int i : list7) {
            System.out.print(i);
        }
        System.out.println();
    }

    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int plusOne = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            int result = K % 10 + A[i] + plusOne;
            if (result >= 10) {
                plusOne = 1;
                result %= 10;
            } else {
                plusOne = 0;
            }
            K /= 10;
            list.add(result);
        }
        while (K > 0) {
            int result = plusOne + K % 10;
            if (result >= 10) {
                plusOne = 1;
                result %= 10;
            } else {
                plusOne = 0;
            }
            K /= 10;
            list.add(result);
        }
        if (plusOne > 0) {
            list.add(plusOne);
        }

        Collections.reverse(list);
        return list;
    }
}
