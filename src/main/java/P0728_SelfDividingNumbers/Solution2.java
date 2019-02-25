package P0728_SelfDividingNumbers;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Solution2
 * Description:
 *
 * @author Lin Hui
 * Created on 2018-3-10 16:42
 */
public class Solution2 {
    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1, 22));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left, j = 0; i <= right; i++) {
            for (j = i; j > 0; j /= 10) {
                if (j % 10 == 0 || i % (j % 10) != 0) {
                    break;
                }
            }
            if (j == 0) {
                list.add(i);
            }
        }
        return list;
    }
}
