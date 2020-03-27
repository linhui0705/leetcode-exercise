package P1389_CreateTargetArrayInTheGivenOrder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Solution1
 * Description:
 * 给定两个数组：数组元素和插入序号，其中插入序号保证不会越界。将元素按照序号依次插入，返回插入后的数组结果。
 * 借用ArrayList，算是偷懒吧……
 *
 * @author Lin Hui
 * Created on 2020/3/27 13:20
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertArrayEquals(new int[]{0, 4, 1, 3, 2}, createTargetArray(new int[]{0, 1, 2, 3, 4}, new int[]{0, 1, 2, 2, 1}));
        Assert.assertArrayEquals(new int[]{0, 1, 2, 3, 4}, createTargetArray(new int[]{1, 2, 3, 4, 0}, new int[]{0, 1, 2, 3, 0}));
        Assert.assertArrayEquals(new int[]{1}, createTargetArray(new int[]{1}, new int[]{0}));
    }

    public int[] createTargetArray(int[] nums, int[] index) {
        int len = nums.length;
        int[] ans = new int[len];
        List<Integer> list = new ArrayList<>(len);
        for (int i = 0; i < len; i++) {
            list.add(index[i], nums[i]);
        }
        for (int i = 0; i < len; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
