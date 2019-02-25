package P0551_StudentAttendanceRecordI;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 学生考勤记录。
 * 超过1次缺勤（A）或连续3次迟到（L），不能获奖
 *
 * @author Lin Hui
 * Created on 2019/2/13 16:00
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertTrue(checkRecord("PPALLP"));
        Assert.assertFalse(checkRecord("PPALLL"));
        Assert.assertTrue(checkRecord("LALL"));
    }

    public boolean checkRecord(String s) {
        int a = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (chars[i] == 'A') {
                a++;
            }
            if (chars[i] == 'L' && i + 2 < s.length() && chars[i + 1] == 'L' && chars[i + 2] == 'L') {
                return false;
            }
        }
        return a <= 1;
    }
}
