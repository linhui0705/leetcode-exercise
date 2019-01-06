package P066_PlusOne;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2019-1-6 14:50
 */
public class Solution1 {
    @Test
    public void testCase() {
        int[] digits1 = new int[]{1, 2, 3};
        for (int i : plusOne(digits1)) {
            System.out.print(i);
        }
        System.out.println();

        int[] digits2 = new int[]{4, 9, 9, 9};
        for (int i : plusOne(digits2)) {
            System.out.print(i);
        }
        System.out.println();

        int[] digits3 = new int[]{5, 8, 7, 8, 8};
        for (int i : plusOne(digits3)) {
            System.out.print(i);
        }
        System.out.println();
    }

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] < 10) {
                break;
            } else {
                digits[i] %= 10;
            }
        }
        if (digits[0] == 0) {
            int[] newInt = new int[digits.length + 1];
            newInt[0] = 1;
            return newInt;
        }
        return digits;
    }
}
