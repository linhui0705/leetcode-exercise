package P1170_CompareStringsByFrequencyOfTheSmallestCharacter;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Title: Solution1
 * Description:
 * 比较字符串最小字母出现频次，就是用queryies内的单词最小字母频次和words数组内的每个单词作比较。
 * 8ms，最后比较的过程效率不高。待优化……
 *
 * @author Lin Hui
 * Created on 2019/12/27 11:26
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertArrayEquals(new int[]{1}, numSmallerByFrequency(new String[]{"cbd"}, new String[]{"zaaaz"}));
        Assert.assertArrayEquals(new int[]{1, 2}, numSmallerByFrequency(new String[]{"bbb", "cc"}, new String[]{"a", "aa", "aaa", "aaaa"}));
    }

    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] ans = new int[queries.length];
        int[] fq = new int[queries.length];
        int[] fw = new int[words.length];
        for (int i = 0; i < queries.length; i++) {
            char[] chs = queries[i].toCharArray();
            Arrays.sort(chs);
            int count = 1;
            for (int j = 1; j < chs.length && chs[j] == chs[j - 1]; j++) {
                count++;
            }
            fq[i] = count;
        }
        for (int i = 0; i < words.length; i++) {
            char[] chs = words[i].toCharArray();
            Arrays.sort(chs);
            int count = 1;
            for (int j = 1; j < chs.length && chs[j] == chs[j - 1]; j++) {
                count++;
            }
            fw[i] = count;
        }

        int k = 0;
        for (int i = 0; i < fq.length; i++) {
            int count = 0;
            for (int j = 0; j < fw.length; j++) {
                if (fq[i] < fw[j]) {
                    count++;
                }
            }
            ans[k++] = count;
        }
        return ans;
    }
}
