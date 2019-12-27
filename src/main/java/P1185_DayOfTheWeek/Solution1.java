package P1185_DayOfTheWeek;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 某年某月某一天是星期几
 *
 * @author Lin Hui
 * Created on 2019/12/27 10:22
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals("Friday", dayOfTheWeek(1, 1, 1971));
        Assert.assertEquals("Saturday", dayOfTheWeek(31, 8, 2019));
        Assert.assertEquals("Sunday", dayOfTheWeek(18, 7, 1999));
        Assert.assertEquals("Sunday", dayOfTheWeek(15, 8, 1993));
        Assert.assertEquals("Monday", dayOfTheWeek(29, 2, 2016));
    }

    public String dayOfTheWeek(int day, int month, int year) {
        int[] dayInMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayOfWeek = new String[]{"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};
        int dayCount = day;
        for (int i = 1971; i < year; i++) {
            if (isLeapYear(i)) {
                dayCount += 366;
            } else {
                dayCount += 365;
            }
        }
        if (isLeapYear(year) && month >= 3) {
            dayCount++;
        }
        int monthCount = (month - 1);
        for (int i = 0; i < monthCount; i++) {
            dayCount += dayInMonth[i];
        }
        return dayOfWeek[dayCount % 7];
    }

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
