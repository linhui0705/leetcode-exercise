package P771_JewelsAndStones;

import java.util.HashSet;
import java.util.Set;

/**
 * Title: Solution
 * Description:
 *
 * @author Lin Hui
 * Created on 2018/2/28 13:25
 */
public class Solution1 {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aAA", "aAAbbbb"));
        System.out.println(numJewelsInStones("z", "ZZ"));
    }

    public static int numJewelsInStones(String J, String S) {
        Set<Character> set = new HashSet();
        for (int i = 0; i < J.length(); i++) {
            set.add(J.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for(Character c: set){
            sb.append(c);
        }
        J = sb.toString();

        int count = 0;
        for (int i = 0; i < J.length(); i++) {
            for (int j = 0; j < S.length(); j++) {
                if (J.charAt(i) == S.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }
}
