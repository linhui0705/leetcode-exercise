package P804_UniqueMorseCodeWords;

import java.util.HashSet;
import java.util.Set;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2018/3/29 17:51
 */
public class Solution1 {
    public static void main(String[] args) {
        String[] words = new String[]{"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }
    public static int uniqueMorseRepresentations(String[] words) {
        String[] dict = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for(String s: words){
            StringBuilder sb = new StringBuilder();
            for(char c: s.toCharArray()){
                int index = c-'a';
                sb.append(dict[index]);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
