package P0830_PositionsOfLargeGroups;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Solution1
 * Description:
 * 思路是想出来了，但感觉编码逻辑有点乱，没有那么巧妙……
 *
 * @author Lin Hui
 * Created on 2018-12-31 14:19
 */
public class Solution1 {
    @Test
    public void testCase() {
        List<List<Integer>> result1 = largeGroupPositions("abbxxxxzzy");
        List<List<Integer>> result2 = largeGroupPositions("abc");
        List<List<Integer>> result3 = largeGroupPositions("abcdddeeeeaabbbcd");
        List<List<Integer>> result4 = largeGroupPositions("aaa");
    }

    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> result = new ArrayList<>();
        if (null == S || S.length() == 0) {
            return result;
        }
        char c = S.charAt(0);
        int count = 1;
        for (int i = 1; i < S.length(); i++) {
            char cc = S.charAt(i);
            if (c == cc) {
                count++;
            } else {
                if (count >= 3) {
                    List<Integer> list = new ArrayList<>();
                    list.add(i - count);
                    list.add(i - 1);
                    result.add(list);
                }
                c = cc;
                count = 1;
            }
        }
        if (count >= 3) {
            List<Integer> list = new ArrayList<>();
            list.add(S.length() - count);
            list.add(S.length() - 1);
            result.add(list);
        }

        return result;
    }
}
