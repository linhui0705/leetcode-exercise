package P0693_BinaryNumberWithAlternatingBits;

import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 *
 * @author Lin Hui
 * Created on 2018/4/8 12:56
 */
public class Solution2 {
    @Test
    public void testCase() {
        System.out.println(hasAlternatingBits(0));
        System.out.println(hasAlternatingBits(1));
        System.out.println(hasAlternatingBits(2));
        System.out.println(hasAlternatingBits(3));
        System.out.println(hasAlternatingBits(4));
        System.out.println(hasAlternatingBits(5));
        System.out.println(hasAlternatingBits(7));
        System.out.println(hasAlternatingBits(11));
        System.out.println(hasAlternatingBits(10));
    }

    public boolean hasAlternatingBits(int n) {
        while (n > 0) {
            if (n % 2 == (n >> 1) % 2) {
                return false;
            }
            n >>= 1;
        }
        return true;
    }

}
