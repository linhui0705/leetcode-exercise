package P0014_LongestCommonPrefix;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 找一系列字符串中的共同前缀，若无共同前缀，返回空字符串
 * e.g.:flower, flow, flight的共同前缀为fl，他们前两个字符都是fl开头
 *
 * @author Lin Hui
 * Created on 2019-1-27 11:59
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals("fl", longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        Assert.assertEquals("", longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        Assert.assertEquals("HelloWorld", longestCommonPrefix(new String[]{"HelloWorld"}));
    }

    public String longestCommonPrefix(String[] strs) {
        if (null == strs || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String str = strs[0];
        int count = Integer.MAX_VALUE;
        for (int i = 1; i < strs.length; i++) {
            int k = 0;
            for (int j = 0; j < Math.min(str.length(), strs[i].length()); j++) {
                if (str.charAt(j) == strs[i].charAt(j)) {
                    k++;
                } else {
                    break;
                }
            }
            count = Math.min(count, k);
        }
        return str.substring(0, count);
    }
}