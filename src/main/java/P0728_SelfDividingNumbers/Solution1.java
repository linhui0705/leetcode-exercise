package P0728_SelfDividingNumbers;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2018-3-10 15:57
 */
public class Solution1 {
    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1,22));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>(right);

        for (int i = left; i <= right; i++) {
            String str = Integer.toString(i);
            if (str.contains("0")) {
                continue;
            }
            boolean flag = true;
            for (int j = 0; j < str.length(); j++) {
                if (i %  ((str.charAt(j))-'0') != 0) {
                    flag = false;
                    continue;
                }
            }
            if(flag){
                list.add(i);
            }
        }

        return list;
    }
}
