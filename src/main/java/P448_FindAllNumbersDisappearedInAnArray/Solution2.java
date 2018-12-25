package P448_FindAllNumbersDisappearedInAnArray;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Solution2
 * Description:
 * 这个方法此前也考虑过，但需要开辟一个同长度的数组
 *
 * @author Lin Hui
 * Created on 2018/12/25 9:55
 */
public class Solution2 {
    @Test
    public void testCase() {
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};

        for (int i : findDisappearedNumbers(nums)) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ret = new ArrayList<>();
        int[] arrays = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arrays[nums[i] - 1] = 1;
        }

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == 0) {
                ret.add(i + 1);
            }
        }

        return ret;
    }
}
