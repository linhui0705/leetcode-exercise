package P1046_LastStoneWeight;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定一个数组，每次选最大的两个两个数抵消，如此往复，返回数组元素全部抵消后剩余的最后一个元素。
 * 这个题写最大堆花了点时间，用堆排序的思想，每趟获取两次最大堆，找到数组中最大的两个数以进行抵消，效率最高。不必对数组所有元素进行排序。
 *
 * @author Lin Hui
 * Created on 2020-1-12 0:01
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(1, lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
    }

    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        while (n > 1) {
            stones = maxHeap(stones, n);

            //swap(stones[0],stones[1]);
            int tmp = stones[0];
            stones[0] = stones[1];
            stones[1] = tmp;

            stones = maxHeap(stones, n);
            stones[0] = Math.abs(stones[0] - stones[1]);
            //swap(stones[n - 1], stones[1]);
            tmp = stones[n - 1];
            stones[n - 1] = stones[1];
            stones[1] = tmp;
            n--;
        }
        return stones[0];
    }

    public int[] maxHeap(int[] arr, int n) {
        for (int i = (n - 1) / 2; i >= 1; i--) {
            int left = i * 2;
            int right = i * 2 + 1;
            int maxLeaf;
            if (right <= n - 1 && arr[left] < arr[right]) {
                maxLeaf = right;
            } else {
                maxLeaf = left;
            }
            if (arr[i] < arr[maxLeaf]) {
                int temp = arr[i];
                arr[i] = arr[maxLeaf];
                arr[maxLeaf] = temp;
            }
        }
        // for(int i: arr){
        //     System.out.print(i+" ");
        // }
        // System.out.println();
        return arr;
    }

    public void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }
}
