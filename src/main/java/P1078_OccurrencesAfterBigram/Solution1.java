package P1078_OccurrencesAfterBigram;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Solution1
 * Description:
 * 给定一句话，两个单词first,second，返回first,second两个单词后面的那个单词。
 *
 * @author Lin Hui
 * Created on 2019-12-26 20:51
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertArrayEquals(new String[]{"girl", "student"}, findOcurrences("alice is a good girl she is a good student", "a", "good"));
        Assert.assertArrayEquals(new String[]{"we", "rock"}, findOcurrences("we will we will rock you", "we", "will"));
    }

    public String[] findOcurrences(String text, String first, String second) {
        List<String> list = new ArrayList<>();
        String[] words = text.split(" ");
        if (words.length < 3) {
            return new String[]{};
        }
        for (int i = 2; i < words.length; i++) {
            if (words[i - 2].equals(first) && words[i - 1].equals(second)) {
                list.add(words[i]);
            }
        }
        return list.toArray(new String[0]);
    }
}
