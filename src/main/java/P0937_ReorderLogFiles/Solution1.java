package P0937_ReorderLogFiles;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 * Title: Solution1
 * Description:
 * 懵逼了……读了好多遍才读懂letter-logs的排序规则。
 * 误入歧途好多次
 * letter-logs的排序规则是：对字母数字标识符后面的字符串，进行字典序排序
 *
 * 用了lambda表达式，性能很慢，在46ms-70ms之间
 * 不用lambda表达式，运行时间可以缩短到7ms
 *
 * @author Lin Hui
 * Created on 2019-1-27 10:50
 */
public class Solution1 {
    @Test
    public void testCase() {
        for (String s : reorderLogFiles(new String[]{"a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo"})) {
            System.out.println(s);
        }
    }

    public String[] reorderLogFiles(String[] logs) {
        List<String> letterLogs = new ArrayList<>();
        List<String> digitLogs = new ArrayList<>();

        for (String log : logs) {
            char c = log.charAt(log.indexOf(" ") + 1);
            if (c >= 'a' && c <= 'z') {
                letterLogs.add(log);
            } else {
                digitLogs.add(log);
            }
        }

        Collections.sort(letterLogs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.substring(o1.indexOf(" "), o1.length()).compareTo(o2.substring(o2.indexOf(" "), o2.length()));
            }
        });

        int k = 0;
        for (String log : letterLogs) {
            logs[k++] = log;
        }
        for (String digit : digitLogs) {
            logs[k++] = digit;
        }
        return logs;
    }
}
