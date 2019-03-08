package P0599_MinimumIndexSumOfTwoLists;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Title: Solution1
 * Description:
 * 找出两个字符串数组中的共同字符串，并且对应字符串数组的索引和最小
 *
 * @author Lin Hui
 * Created on 2018-12-31 15:29
 */
public class Solution1 {
    @Test
    public void testCase() {
        String[] a = new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] b = new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        System.out.println(findRestaurant(a, b)[0]);

        String[] c = new String[]{"KFC", "Tapioca Express", "Burger King", "Shogun"};
        String[] d = new String[]{"KFC", "Shogun", "Burger King"};
        System.out.println(findRestaurant(c, d)[0]);

        String[] e = new String[]{"KFC"};
        String[] f = new String[]{"KFC"};

        String[] g = new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] h = new String[]{"KFC", "Burger King", "Tapioca Express", "Shogun"};
        System.out.println(findRestaurant(g, h));
    }

    public String[] findRestaurant(String[] list1, String[] list2) {
        int min = Integer.MAX_VALUE;
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            if (null != map.get(list2[i])) {
                if (min > i + map.get(list2[i])) {
                    min = i + map.get(list2[i]);
                    list.clear();
                    list.add(list2[i]);
                } else if (min == i + map.get(list2[i])) {
                    list.add(list2[i]);
                }
            }
        }
        return list.toArray(new String[list.size()]);
    }
}
