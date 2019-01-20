package P167_TwoSumII_InputArrayIsSorted;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2019-1-20 9:34
 */
public class Solution1 {
    @Test
    public void testCase() {
        int[] numbers = new int[]{2, 7, 11, 15};
        int[] result = twoSum(numbers, 9);
        System.out.println(result[0] + "," + result[1]);

        int[] numbers1 = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] result1 = twoSum(numbers1, 12);
        System.out.println(result1[0] + "," + result1[1]);

        int[] numbers2 = new int[]{-1,0};
        int[] result2 = twoSum(numbers2, -1);
        System.out.println(result2[0] + "," + result2[1]);
    }

    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        for (int i = 0; i < numbers.length && numbers[i] <= target; i++) {
            result[0] = i + 1;
            for (int j = i + 1; j < numbers.length && numbers[result[0] - 1] + numbers[j] <= target; j++) {
                if (numbers[result[0] - 1] + numbers[j] == target) {
                    result[1] = j + 1;
                    return result;
                }
            }
        }
        return result;
    }
}
