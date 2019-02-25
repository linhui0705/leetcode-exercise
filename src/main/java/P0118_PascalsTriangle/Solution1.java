package P0118_PascalsTriangle;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Solution1
 * Description:
 * 杨辉三角
 *
 * @author Lin Hui
 * Created on 2019-1-6 14:06
 */
public class Solution1 {
    @Test
    public void testCase() {
        List<List<Integer>> list1 = generate(5);
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    list.add(1);
                } else {
                    List<Integer> lastList = result.get(i - 1 - 1);
                    list.add(lastList.get(j - 1 - 1) + lastList.get(j - 1));
                }
            }
            result.add(list);
        }
        return result;
    }
}
