package P1491_AverageSalaryExcludingTheMinimumAndMaximumSalary;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Title: Solution1
 * Description:
 * 给定一个数组salary，数组元素为每名员工工资，其中数组元素是唯一的。现要计算出去掉最高工资和最低工资后的员工平均工资。
 * 水题，排序后摘去头尾，算出剩余元素的平均值即可。
 *
 * @author Lin Hui
 * Created on 2021/2/21 13:13:37
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(2500.0000, average(new int[]{4000, 3000, 1000, 2000}), 0.0000);
        Assert.assertEquals(2000.0000, average(new int[]{1000, 2000, 3000}), 0.0000);
        Assert.assertEquals(3500.0000, average(new int[]{6000, 5000, 4000, 3000, 2000, 1000}), 0.0000);
        Assert.assertEquals(4750.0000, average(new int[]{8000, 9000, 2000, 3000, 6000, 1000}), 0.0000);
    }

    public double average(int[] salary) {
        Arrays.sort(salary);
        int total = 0;
        for (int i = 1; i < salary.length - 1; i++) {
            total += salary[i];
        }
        return (double) total / (salary.length - 2);
    }
}
