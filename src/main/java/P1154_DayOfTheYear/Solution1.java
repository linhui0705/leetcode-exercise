package P1154_DayOfTheYear;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 某年某月某一天，是当年的第几天。
 *
 * @author Lin Hui
 * Created on 2019-12-28 22:49
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(9, dayOfYear("2019-01-09"));
        Assert.assertEquals(41, dayOfYear("2019-02-10"));
        Assert.assertEquals(60, dayOfYear("2003-03-01"));
        Assert.assertEquals(61, dayOfYear("2004-03-01"));
    }

    public int dayOfYear(String date) {
        String[] ymd = date.split("-");
        int year = Integer.valueOf(ymd[0]);
        int month = Integer.valueOf(ymd[1]);
        int day = Integer.valueOf(ymd[2]);

        int[] dayInMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int ans = day;
        for (int i = 0; i < month - 1; i++) {
            ans += dayInMonth[i];
        }
        if (isLeapYear(year) && month > 2) {
            ans++;
        }
        return ans;
    }

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
