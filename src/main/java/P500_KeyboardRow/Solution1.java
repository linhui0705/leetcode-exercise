package P500_KeyboardRow;

import java.util.Arrays;
import java.util.List;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2018-3-10 22:05
 */
public class Solution1 {
    public static void main(String[] args) {
        for (String str : findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"})) {
            System.out.println(str);
        }
    }

    public static String[] findWords(String[] words) {
        String a = "qwertyuiop";
        String b = "asdfghjkl";
        String c = "zxcvbnm";

        List<String> list = Arrays.asList(words);
        for (String s : list) {

        }

        return null;
    }
}
