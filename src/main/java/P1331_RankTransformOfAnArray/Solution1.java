package P1331_RankTransformOfAnArray;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Title: Solution1
 * Description:
 * 给定一个数组arr，将数组中的元素替换为它们排序后的序号
 *
 * @author Lin Hui
 * Created on 2020/2/10 12:45 下午
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertArrayEquals(new int[]{4, 1, 2, 3}, arrayRankTransform(new int[]{40, 10, 20, 30}));
        Assert.assertArrayEquals(new int[]{1, 1, 1}, arrayRankTransform(new int[]{100, 100, 100}));
        Assert.assertArrayEquals(new int[]{5, 3, 4, 2, 8, 6, 7, 1, 3}, arrayRankTransform(new int[]{37, 12, 28, 9, 100, 56, 80, 5, 12}));
    }

    public int[] arrayRankTransform(int[] arr) {
        int[] copyarr = arr.clone();
        Arrays.sort(copyarr);
        Map<Integer, Integer> map = new HashMap<>();
        int k = 1;
        for (int value : copyarr) {
            if (!map.containsKey(value)) {
                map.put(value, k++);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}
