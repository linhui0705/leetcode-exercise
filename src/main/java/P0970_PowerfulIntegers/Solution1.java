package P0970_PowerfulIntegers;

import org.junit.Test;

import java.util.*;

/**
 * Title: Solution1
 * Description:
 * 初步是考虑暴力，两个for循环直接扫，但是超时了。原因是：如果x或y为1，会导致1的n次方永远是1，跳不出循环。
 * <p>
 * If x^i>bound the sum x^i+y^j can't be less than or equal to the bound. Similarly for y^j.
 * Thus, we only have to check for 0<=i,j<=logx(bound)<18.
 * We can use a HashSet to store all the different values.
 * 至于Solution里的小于18，不太明白是怎么推出来的……
 *
 * @author Lin Hui
 * Created on 2019/1/31 15:11
 */
public class Solution1 {
    @Test
    public void testCase() {
        powerfulIntegers(2, 3, 10);
        powerfulIntegers(3, 5, 15);
        powerfulIntegers(1, 2, 15);
        powerfulIntegers(1, 2, 100);
    }

    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> result = new HashSet<>();
        for (int i = 0; Math.pow(x, i) <= bound; i++) {
            for (int j = 0; Math.pow(y, j) <= bound; j++) {
                int k = (int) (Math.pow(x, i) + Math.pow(y, j));
                if (k <= bound) {
                    result.add(k);
                }
                if (y == 1) {
                    break;
                }
            }
            if (x == 1) {
                break;
            }
        }
        return new ArrayList<>(result);
    }
}
