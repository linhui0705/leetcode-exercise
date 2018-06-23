package P344_ReverseString;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2018-3-10 21:57
 */
public class Solution1 {
    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }
    public static String reverseString(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}
