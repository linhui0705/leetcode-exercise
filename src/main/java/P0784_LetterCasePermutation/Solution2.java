package P0784_LetterCasePermutation;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Solution2
 * Description:
 * 看了题解，然后自己尝试再写一遍。相比自己写的答案，好处是少实例化字符串对象。
 *
 * @author Lin Hui
 * Created on 2019/2/28 10:03
 */
public class Solution2 {
    @Test
    public void testCase() {

    }

    public List<String> letterCasePermutation(String S) {
        List<String> result = new ArrayList<>();
        permute(S.toCharArray(), 0, result);
        return result;
    }

    public void permute(char[] array, int index, List<String> result) {
        if (index >= array.length) {
            result.add(String.valueOf(array));
            return;
        }
        char c = array[index];
        permute(array, index + 1, result);
        if (c >= 'a' && c <= 'z') {
            array[index] = (char) (c - 'a' + 'A');
            permute(array, index + 1, result);
        } else if (c >= 'A' && c <= 'Z') {
            array[index] = (char) (c - 'A' + 'a');
            permute(array, index + 1, result);
        }
    }
}
