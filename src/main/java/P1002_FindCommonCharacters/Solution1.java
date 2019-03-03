package P1002_FindCommonCharacters;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Solution1
 * Description:
 * 给定一个字符串数组，字符串的字符均为小写字母。找出这些字符串中共有的字符，包括重复出现的字符。
 * 题目是比较水，但是为了先AC，就干脆用二维数组了。估计还有效率更高的题解。
 *
 * @author Lin Hui
 * Created on 2019-3-3 11:48
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public List<String> commonChars(String[] A) {
        int[][] a = new int[A.length][26];
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            String s = A[i];
            for (int j = 0; j < s.length(); j++) {
                a[i][s.charAt(j) - 'a']++;
            }
        }

        for (int j = 0; j < a[0].length; j++) {
            int min = Integer.MAX_VALUE;
            boolean isCommon = true;
            for (int i = 0; i < a.length && isCommon; i++) {
                if (a[i][j] == 0) {
                    isCommon = false;
                } else {
                    min = Math.min(min, a[i][j]);
                }
            }
            if (isCommon) {
                for (int k = 0; k < min; k++) {
                    ans.add(String.valueOf((char) (j + 'a')));
                }
            }
        }
        return ans;
    }
}
