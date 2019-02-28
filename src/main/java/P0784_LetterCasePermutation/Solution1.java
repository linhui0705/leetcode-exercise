package P0784_LetterCasePermutation;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Solution1
 * Description:
 * 字母数字的排列组合
 * 显然题目是要用回溯法解决。想象成一棵二叉树，对字母进行分叉，递归解决。
 *
 * @author Lin Hui
 * Created on 2019/2/28 9:55
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public List<String> letterCasePermutation(String S) {
        List<String> ans = new ArrayList<>();
        traversal(S, "", ans);
        return ans;
    }

    public void traversal(String str, String sb, List<String> list) {
        if (null == str || str.length() == 0) {
            list.add(sb);
            return;
        }
        char c = str.charAt(0);
        if (c >= 'a' && c <= 'z') {
            traversal(str.substring(1), sb + (char) (c - 'a' + 'A'), list);
        } else if (c >= 'A' && c <= 'Z') {
            traversal(str.substring(1), sb + (char) (c - 'A' + 'a'), list);
        }
        traversal(str.substring(1), sb + c, list);
    }
}
