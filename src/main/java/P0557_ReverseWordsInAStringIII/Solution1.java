package P0557_ReverseWordsInAStringIII;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2018-3-10 21:32
 */
public class Solution1 {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));

    }

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] reverse = s.split(" ");
        for (int i = 0; i < reverse.length; i++) {
            for (int j = reverse[i].length() - 1; j >= 0; j--) {
                sb.append(reverse[i].charAt(j));
            }
            sb.append(i == reverse.length - 1 ? "" : " ");
        }
        return sb.toString();
    }
}
