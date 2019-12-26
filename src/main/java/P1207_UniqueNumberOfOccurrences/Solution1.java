package P1207_UniqueNumberOfOccurrences;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Title: Solution1
 * Description:
 * 给定一个数组，看一个元素出现的次数是不是唯一的。
 *
 * @author Lin Hui
 * Created on 2019-12-26 11:41
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertTrue(uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
        Assert.assertFalse(uniqueOccurrences(new int[]{1, 2}));
        Assert.assertTrue(uniqueOccurrences(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0}));
    }

    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
//        if (arr.length <= 1) {
//            return true;
//        }
        HashSet<Integer> set = new HashSet<>();
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {
                count++;
            } else if (arr[i - 1] != arr[i]) {
                if (!set.add(count)) {
                    return false;
                }
                count = 1;
                if (i == arr.length - 1) {
                    if (!set.add(count)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
