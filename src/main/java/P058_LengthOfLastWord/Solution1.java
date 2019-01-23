package P058_LengthOfLastWord;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 求最后一个单词的长度
 * 从后往前推即可
 *
 * @author Lin Hui
 * Created on 2019-1-23 22:49
 */
public class Solution1 {
    @Test
    public void testCase() {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("Do you love me"));
        System.out.println(lengthOfLastWord("Test"));
        System.out.println(lengthOfLastWord("a "));
    }

    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int count = 0;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }
        return count;
    }
}
