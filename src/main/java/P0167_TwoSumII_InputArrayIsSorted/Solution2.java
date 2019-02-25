package P0167_TwoSumII_InputArrayIsSorted;

import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 *
 * @author Lin Hui
 * Created on 2019-1-20 10:03
 */
public class Solution2 {
    @Test
    public void testCase() {
        int[] numbers = new int[]{2, 7, 11, 15};
        int[] result = twoSum(numbers, 9);
        System.out.println(result[0] + "," + result[1]);

        int[] numbers1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result1 = twoSum(numbers1, 12);
        System.out.println(result1[0] + "," + result1[1]);

        int[] numbers2 = new int[]{-1, 0};
        int[] result2 = twoSum(numbers2, -1);
        System.out.println(result2[0] + "," + result2[1]);
    }

    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        int sum = 0;
        while (i < j) {
            sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[]{i + 1, j + 1};
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[0];
    }
}
