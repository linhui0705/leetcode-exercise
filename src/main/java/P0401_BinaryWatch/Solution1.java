package P0401_BinaryWatch;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Solution1
 * Description:
 * 给定一个非负整数n代表当前LED亮着的数量，返回所有可能的时间。返回的顺序没有要求。
 * 排列组合的问题，用回溯法解决即可。
 *
 * @author Lin Hui
 * Created on 2019/2/28 10:48
 */
public class Solution1 {
    @Test
    public void testCase() {
        List<String> ans = readBinaryWatch(1);
    }

    public List<String> readBinaryWatch(int num) {
        List<String> ans = new ArrayList<>();
        int[] bt = new int[10];
        permute(bt, 0, num, ans);
        return ans;
    }

    public void permute(int[] bt, int index, int num, List<String> ans) {
        if (num <= 0) {
            int hour = bt[0] * 8 + bt[1] * 4 + bt[2] * 2 + bt[3];
            if (hour > 11) {
                return;
            }
            int minute = bt[4] * 32 + bt[5] * 16 + bt[6] * 8 + bt[7] * 4 + bt[8] * 2 + bt[9];
            if (minute > 59) {
                return;
            }
            ans.add(hour + ":" + (minute >= 10 ? minute : "0" + minute));
            return;
        }

        if (index >= bt.length) {
            return;
        }
        bt[index] = 1;
        permute(bt, index + 1, num - 1, ans);
        bt[index] = 0;
        permute(bt, index + 1, num, ans);
    }
}