package P1360_NumberOfDaysBetweenTwoDates;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定两个日期，计算日期之间的天数。
 * 从1971年1月1日起计算间隔天数，然后将两个天数相减，得到结果。
 * 类似题目，可参考1154和1185。
 *
 * @author Lin Hui
 * Created on 2020/3/27 14:48
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(1, daysBetweenDates("2019-06-29", "2019-06-30"));
        Assert.assertEquals(15, daysBetweenDates("2020-01-15", "2019-12-31"));
    }

    public int daysBetweenDates(String date1, String date2) {
        String[] d1 = date1.split("-");
        String[] d2 = date2.split("-");
        return Math.abs(day(Integer.parseInt(d2[0]), Integer.parseInt(d2[1]), Integer.parseInt(d2[2]) -
                day(Integer.parseInt(d1[0]), Integer.parseInt(d1[1]), Integer.parseInt(d1[2]))));
    }

    private int day(int y, int m, int d) {
        int result = 0;
        int[] month = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 1971; i < y; i++) {
            result += isLeapYear(i) ? 366 : 365;
        }
        result += isLeapYear(y) && m >= 3 ? 1 : 0;
        for (int i = 1; i < m; i++) {
            result += month[i];
        }
        return result + d - 1;
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
