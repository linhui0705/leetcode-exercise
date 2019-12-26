package P1200_MinimumAbsoluteDifference;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Title: Solution1
 * Description:
 * 给定整数数组arr，找到所有具有最小绝对差的元素对，并且按升序的顺序返回。
 *
 * @author Lin Hui
 * Created on 2019-12-26 17:59
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i] - arr[i - 1]);
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == min) {
                List<Integer> list = new ArrayList<>();
                list.add(arr[i - 1]);
                list.add(arr[i]);
                ans.add(list);
            }
        }
        return ans;
    }
}
