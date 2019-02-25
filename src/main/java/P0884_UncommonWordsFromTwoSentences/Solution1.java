package P0884_UncommonWordsFromTwoSentences;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2019-1-20 23:33
 */
public class Solution1 {
    @Test
    public void testCase() {
        String[] s1 = uncommonFromSentences("this apple is sweet", "this apple is sour");
        for (String s : s1) {
            System.out.println(s);
        }

        System.out.println("----------");

        String[] s2 = uncommonFromSentences("apple apple", "banana");
        for (String s : s2) {
            System.out.println(s);
        }
    }

    public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        for (String a : A.split(" ")) {
            if (!map.containsKey(a)) {
                map.put(a, 1);
            } else {
                map.put(a, map.get(a) + 1);
            }
        }
        for (String b : B.split(" ")) {
            if (!map.containsKey(b)) {
                map.put(b, 1);
            } else {
                map.put(b, map.get(b) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                list.add(entry.getKey());
            }
        }

        String[] arrays = new String[list.size()];
        return list.toArray(arrays);
    }
}
