package P1352_ProductOfTheLastKNumbers;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: ProductOfNumbers
 * Description:
 * add方法不断加入数字，getProduct(k)方法为求后k个加入元素的乘积。
 * 前面用了暴力解决，直接开辟题意最大数组空间40000，虽然插入的时间复杂度为O(1)，但是getProduct取值的时间复杂度却用了O(n)，若是求所有加入元素的乘积，不断累乘肯定是很慢的。
 * 看了最优解，加入list的值都是已经算好的乘积，getProduct获取的就不用再累乘了，add方法和getProduct方法时间复杂度都是O(1)。
 *
 * @author Lin Hui
 * Created on 2020/2/16 17:08
 */
public class ProductOfNumbers {
    int last;
    int lastZero;
    List<Integer> list;

    public ProductOfNumbers() {
        last = 0;
        lastZero = -1;
        list = new ArrayList<>();
        list.add(1);
    }

    public void add(int num) {
        if (num == 0) {
            list.add(1);
            lastZero = last;
        } else {
            list.add(list.get(last) * num);
        }
        last++;
    }

    public int getProduct(int k) {
        if (last - k <= lastZero) {
            return 0;
        }
        return list.get(last) / list.get(last - k);
    }
}