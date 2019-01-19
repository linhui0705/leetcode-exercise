package P917_ReverseOnlyLetters;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2019-1-19 22:10
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals("ab-cd", reverseOnlyLetters("dc-ba"));
        Assert.assertEquals("a-bC-dEf-ghIj", reverseOnlyLetters("j-Ih-gfE-dCba"));
        Assert.assertEquals("Qedo1ct-eeLg=ntse-T!", reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }

    public String reverseOnlyLetters(String S) {
        StringBuilder sb = new StringBuilder();
        int left = 0;
        int right = S.length() - 1;
        while (left <= S.length() - 1 || right >= 0) {
            //左非字母
            if (left <= S.length() - 1 && !(('a' <= S.charAt(left) && 'z' >= S.charAt(left)) || ('A' <= S.charAt(left) && 'Z' >= S.charAt(left)))) {
                sb.append(S.charAt(left++));
            }
            //右字母
            else if (right >= 0 && ('a' <= S.charAt(right) && 'z' >= S.charAt(right)) || ('A' <= S.charAt(right) && 'Z' >= S.charAt(right))) {
                sb.append(S.charAt(right));
                left++;
                right--;
            }
            //右非字母
            else {
                right--;
            }
        }
        return sb.toString();
    }
}
