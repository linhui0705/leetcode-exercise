package P0258_AddDigits;


import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2018/4/9 11:18
 */
public class Solution1 {
    @Test
    public void testCase() {
        System.out.println(addDigits(1));
    }

    public int addDigits(int num) {
        while (num / 10 > 0) {
            int total = 0;
            while (num > 0) {
                total += num % 10;
                num /= 10;
            }
            num = total;
        }

        return num;
    }
}
