package P1450_NumberOfStudentsDoingHomeworkAtAGivenTime;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 水题。
 * 给定两个数组startTime和endTime，学生i做作业的起止时间为startTime[i]到endTime[i]。
 * 先给定queryTime，算出有多少个学生是在做作业的。
 *
 * @author Lin Hui
 * Created on 2021/2/19 20:23:48
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(1, busyStudent(new int[]{1, 2, 3}, new int[]{3, 2, 7}, 4));
        Assert.assertEquals(1, busyStudent(new int[]{4}, new int[]{4}, 4));
        Assert.assertEquals(0, busyStudent(new int[]{4}, new int[]{4}, 5));
        Assert.assertEquals(0, busyStudent(new int[]{1, 1, 1, 1}, new int[]{1, 3, 2, 4}, 7));
        Assert.assertEquals(5, busyStudent(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1}, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10}, 5));
    }

    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int ans = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && queryTime <= endTime[i]) {
                ans++;
            }
        }
        return ans;
    }
}
