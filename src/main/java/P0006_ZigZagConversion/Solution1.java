package P0006_ZigZagConversion;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给定一个字符串s和行数numRows，将字符串s改写成numRows行的锯齿形样式。最后逐行拼凑输出。
 * 实际上就是要numRows个集合，然后将字符串的每个字符按0,1,2,...,numRows-1,numRows-2,...,2,1,0,1,2...的顺序去写入。
 * 思路是有了，但运行结果不算好。可能有不必要的条件重复执行影响了时间。可进一步优化。
 * Result: Runtime: 10 ms, faster than 45.08%; Memory Usage: 39.6 MB, less than 60.36%
 *
 * @author Lin Hui
 * @date 2021/9/6 17:54
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals("PAHNAPLSIIGYIR", convert("PAYPALISHIRING", 3));
        Assert.assertEquals("PINALSIGYAHRPI", convert("PAYPALISHIRING", 4));
        Assert.assertEquals("A", convert("A", 1));
        Assert.assertEquals("AB", convert("AB", 1));
    }

    public String convert(String s, int numRows) {
        Map<Integer, List<Character>> map = new HashMap<>(numRows);
        for (int j = 0; j < numRows; j++) {
            map.put(j, new ArrayList<>());
        }
        boolean flag = true;
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.get(k).add(c);
            if (numRows > 1) {
                if (flag) {
                    if (k < numRows - 1) {
                        k++;
                    } else {
                        flag = false;
                        k--;
                    }
                } else {
                    if (k > 0) {
                        k--;
                    } else {
                        flag = true;
                        k++;
                    }
                }
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int j = 0; j < numRows; j++) {
            List<Character> list = map.get(j);
            for (Character c : list) {
                builder.append(c);
            }
        }
        return builder.toString();
    }
}
