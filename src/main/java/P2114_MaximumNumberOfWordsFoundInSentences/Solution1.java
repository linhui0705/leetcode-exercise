package P2114_MaximumNumberOfWordsFoundInSentences;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定一个字符串数组sentences，数组每个元素为一个句子。返回单个句子里单词的最多数目。
 * 因为题目里面已经限定的很死了，输入用例头尾没有空格，单词间隔最多只有一个空格，且整句只包含26个小写字母和空格。
 * 所以我们只要统计单词间的分隔空格的个数就可以了。
 *
 * @author Lin Hui
 * Created on 2022/2/18 14:31:43
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(6, mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
        Assert.assertEquals(3, mostWordsFound(new String[]{"please wait", "continue to fight", "continue to win"}));
    }

    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String s : sentences) {
            int count = 1;
            for (char c : s.toCharArray()) {
                if (c == ' ') {
                    count++;
                }
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
