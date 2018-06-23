package P520_DetectCapital;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2018/4/9 17:23
 */
public class Solution1 {
    @Test
    public void testCase() {
        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("Test"));
        System.out.println(detectCapitalUse("FlaG"));
        System.out.println(detectCapitalUse("a"));
    }

    public boolean detectCapitalUse(String word) {
        if (word.toUpperCase().equals(word) || word.toLowerCase().equals(word)) {
            return true;
        }
        if ((word.toUpperCase().equals(word) || word.toLowerCase().equals(word)) || (word.toUpperCase().charAt(0) == word.charAt(0) && word.toLowerCase().substring(1).equals(word.substring(1)))) {
            return true;
        }
        return false;
    }
}
