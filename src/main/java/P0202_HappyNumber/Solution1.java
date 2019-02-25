package P0202_HappyNumber;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Title: Solution1
 * Description:
 * 曾考虑递归，但若非快乐数，则算得的结果必不为1，但不为1的数也不一定不是快乐数
 * 查看攻略，有两种思路：
 * 1. 1和7是快乐数，当算得的数小于10，只要该数是1或7，则必定是快乐数，反之则不是
 * 2. 利用HashSet的add方法的特性，若add返回false，则计算已经过一次循环，给的数不是快乐数
 * e.g.: n=9, 81→65→61→37→58→89→145→42→20→4→16→37
 *
 * @author Lin Hui
 * Created on 2018/6/25 15:36
 */
public class Solution1 {
    @Test
    public void testCase() {
        System.out.println(isHappy(0));
        System.out.println(isHappy(1));
        System.out.println(isHappy(2));
        System.out.println(isHappy(3));
        System.out.println(isHappy(4));
        System.out.println(isHappy(5));
        System.out.println(isHappy(6));
        System.out.println(isHappy(7));
        System.out.println(isHappy(8));
        System.out.println(isHappy(9));
    }

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (set.add(n)) {
            int result = 0;

            while (n > 0) {
                int k = n % 10;
                result += k * k;
                n /= 10;
            }
            if (result == 1) {
                return true;
            }
            n = result;
        }
        return false;
    }
}
