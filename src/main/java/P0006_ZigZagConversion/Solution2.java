package P0006_ZigZagConversion;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Result: Runtime: 8 ms, faster than 51.50%; Memory Usage: 39.5 MB, less than 67.73%
 *
 * @author Lin Hui
 * @date 2021/9/7 9:44
 */
public class Solution2 {
    @Test
    public void testCase() {
        Assert.assertEquals("PAHNAPLSIIGYIR", convert("PAYPALISHIRING", 3));
        Assert.assertEquals("PINALSIGYAHRPI", convert("PAYPALISHIRING", 4));
        Assert.assertEquals("A", convert("A", 1));
        Assert.assertEquals("AB", convert("AB", 1));
    }

    public String convert(String s, int numRows) {
        Map<Integer, StringBuilder> map = new HashMap<>(numRows);
        boolean flag = true;
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.computeIfAbsent(k, v -> new StringBuilder()).append(c);
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
        map.values().forEach(b -> builder.append(b.toString()));
        return builder.toString();
    }
}
