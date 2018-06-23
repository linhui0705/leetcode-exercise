package P448_FindAllNumbersDisappearedInAnArray;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2018/4/9 13:06
 */
public class Solution1 {
    @Test
    public void testCase() {
        int[] nums = new int[]{2, 2};
        //int[] nums = new int[]{1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 5};
        for (int i : findDisappearedNumbers(nums)) {
            System.out.print(i);
            System.out.print(" ");
        }
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        if (nums.length == 0) {
            return new LinkedList<>();
        }
        //4, 3, 2, 7, 8, 2, 3, 1
        Arrays.sort(nums);
        //1, 2, 2, 3, 3, 4, 7, 8
        //1, 2, 3, 4, 5, 6, 7, 8
        //0, 0, 1, 1, 2, 2, 0, 0
        List<Integer> list = new LinkedList();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] > 1) {
                for (int j = nums[i] + 1; j < nums[i + 1]; j++) {
                    list.add(j);
                }
            }
        }
        for (int i = nums[nums.length - 1] + 1; i <= nums.length; i++) {
            list.add(i);
        }
        return list;
    }
}
