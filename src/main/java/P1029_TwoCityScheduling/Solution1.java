package P1029_TwoCityScheduling;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Title: Solution1
 * Description:
 * 公司计划面试2N人，去A城花费costs[i][0]，去B城话费costs[i][1]，要求两座城市均要有N人参加
 * 典型的贪心算法，将数组的绝对值进行排序。先从绝对值最大的进行选取，挑去最小的花费，当一座城市挑够N人，剩余的人则取另一座城市。
 *
 * @author Lin Hui
 * Created on 2019-4-21 20:13
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(110, twoCitySchedCost(new int[][]{{10, 20}, {30, 200}, {400, 50}, {30, 20}}));
        Assert.assertEquals(1859, twoCitySchedCost(new int[][]{{259, 770}, {448, 54}, {926, 667}, {184, 139}, {840, 118}, {577, 469}}));
    }

    public int twoCitySchedCost(int[][] costs) {
        List<PersonCost> list = new ArrayList<>();
        for (int i = 0; i < costs.length; i++) {
            PersonCost p = new PersonCost();
            p.a = costs[i][0];
            p.b = costs[i][1];
            p.abs = Math.abs(costs[i][0] - costs[i][1]);
            list.add(p);
        }
        Collections.sort(list, Comparator.comparingInt(o -> o.abs));

        int a = 0;
        int b = 0;
        int ans = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (a >= list.size() / 2) {
                ans += list.get(i).b;
                continue;
            }
            if (b >= list.size() / 2) {
                ans += list.get(i).a;
                continue;
            }
            if (list.get(i).a < list.get(i).b) {
                ans += list.get(i).a;
                a++;
            } else {
                ans += list.get(i).b;
                b++;
            }
        }
        return ans;
    }

    class PersonCost {
        int a;
        int b;
        int abs;
    }
}
