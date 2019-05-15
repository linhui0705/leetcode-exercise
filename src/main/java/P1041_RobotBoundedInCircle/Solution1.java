package P1041_RobotBoundedInCircle;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 题意就是：给定一串指令，在无限循环执行的情况下，能不能保持在一个限定的圆圈范围。
 * 题目很简单，就是码错浪费了不少时间……
 * 这个答案比较冗余，有待优化……
 *
 * @author Lin Hui
 * Created on 2019/5/15 16:38
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertTrue(isRobotBounded("GGLLGG"));
        Assert.assertFalse(isRobotBounded("GG"));
        Assert.assertTrue(isRobotBounded("GL"));
    }

    public boolean isRobotBounded(String instructions) {
        int direction = 0;
        int left = 0;
        int right = 0;
        int up = 0;
        int down = 0;
        for (char c : instructions.toCharArray()) {
            switch (c) {
                case 'G':
                    if (direction % 4 == 0) {
                        up++;
                    }
                    if (direction % 4 == 1 || direction % 4 == -3) {
                        right++;
                    }
                    if (direction % 4 == 2 || direction % 4 == -2) {
                        down++;
                    }
                    if (direction % 4 == 3 || direction % 4 == -1) {
                        left++;
                    }
                    break;
                case 'L':
                    --direction;
                    break;
                case 'R':
                    ++direction;
                    break;
                default:
                    break;
            }
        }
        return (Math.abs(up - down) + Math.abs(left - right)) == 0 || direction % 4 != 0;
    }
}
