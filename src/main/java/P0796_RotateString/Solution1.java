package P0796_RotateString;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2018/4/4 15:25
 */
public class Solution1 {
    @Test
    public void testCase() {
        System.out.println(rotateString("kifcqeiqoh", "ayyrddojpq"));
        System.out.println(rotateString("abcde", "abced"));
        System.out.println(rotateString("bqqutquvbtgouklsayfvzewpnrbwfcdmwctusunasdbpbmhnvy", "wpnrbwfcdmwctusunasdbpbmhnvybqqutquvbtgouklsayfvze"));
    }

    public boolean rotateString(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        if(A.length() == 0 && B.length() == 0){
            return true;
        }
        int len = A.length();
        for (int i = 0; i < len; i++) {
            StringBuilder sb = new StringBuilder(A.substring(i, len)).append(A.substring(0, i));
            if(sb.toString().equals(B)){
                return true;
            }
        }
        return false;
    }
}
