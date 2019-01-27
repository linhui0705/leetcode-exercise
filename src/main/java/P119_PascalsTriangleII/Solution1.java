package P119_PascalsTriangleII;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Solution1
 * Description:
 * 递归
 * P.S.:感觉写的有点累赘了……
 *
 * @author Lin Hui
 * Created on 2019-1-27 14:29
 */
public class Solution1 {
    @Test
    public void testCase() {
        List<Integer> list0 = getRow(0);
        List<Integer> list1 = getRow(1);
        List<Integer> list2 = getRow(2);
        List<Integer> list3 = getRow(3);
        List<Integer> list4 = getRow(4);
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        if (rowIndex == 0) {
            list.add(1);
            return list;
        }
        if (rowIndex == 1) {
            list.add(1);
            list.add(1);
            return list;
        }
        List<Integer> lastRow = getRow(rowIndex - 1);
        for (int i = 0; i <= rowIndex; i++) {
            if (i == 0 || i == rowIndex) {
                list.add(1);
            } else {
                list.add(lastRow.get(i - 1) + lastRow.get(i));
            }
        }
        return list;
    }
}
