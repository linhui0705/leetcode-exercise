package P500_KeyboardRow;

import java.util.LinkedList;
import java.util.List;

/**
 * Title: Solution
 * Description:
 *
 * @author Lin Hui
 * Created on 2018/3/30 9:20
 */
public class Solution2 {
    public static void main(String[] args) {
        for(String str: findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"})){
            System.out.println(str);
        }
    }

    public static String[] findWords(String[] words) {
        //0-9, 10-18 19-25
        String dict = "qwertyuiopasdfghjklzxcvbnm";
        List<String> list = new LinkedList<>();

        for (String s : words) {
            int line = 0;
            int current = 0;
            boolean flag = true;
            for (char c : s.toLowerCase().toCharArray()) {
                int index = dict.indexOf(c);
                //0-9
                if (index >= 0 && index < 10) {
                    current = 1;
                }
                //10-18
                else if (index >= 10 && index < 19) {
                    current = 2;
                }
                //19-25
                else if (index >= 19 && index <= 25) {
                    current = 3;
                } else {
                    flag = false;
                    break;
                }

                if (line == 0) {
                    line = current;
                } else {
                    if (line != current) {
                        flag = false;
                        break;
                    }
                }
            }

            if (flag) {
                list.add(s);
            }

        }

        //list转array
        String[] arrays = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arrays[i] = list.get(i);
        }

        return arrays;
    }
}
