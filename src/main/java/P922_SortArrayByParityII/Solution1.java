package P922_SortArrayByParityII;

import org.junit.Test;

import java.util.Stack;

/**
 * Title: Solution1
 * Description:
 * 用两个栈分别存奇数序号和偶数序号。
 * 23ms，比较慢，想得有些复杂了……
 *
 * @author Lin Hui
 * Created on 2018/12/24 14:28
 */
public class Solution1 {
    @Test
    public void testCase() {
        int[] a = new int[]{4,2,5,7};
        int[] b = sortArrayByParityII(a);
        for (int i : b) {
            System.out.println(i);
        }
    }

    public int[] sortArrayByParityII(int[] A) {
        int l = 0;
        int r = A.length - 1;
        int temp = 0;
        Stack<Integer> oddStack = new Stack<>();
        Stack<Integer> evenStack = new Stack<>();
        for (int i = l; i <= r; i++) {
            if ((i & 1) != (A[i] & 1)) {
                if ((i & 1) == 0) {
                    evenStack.push(i);
                }
                else{
                    oddStack.push(i);
                }
            }
        }

        while(!oddStack.isEmpty() && !evenStack.isEmpty()){
            int i=oddStack.pop();
            int j=evenStack.pop();
            int tmp = A[i];
            A[i] = A[j];
            A[j] = tmp;
        }

        return A;
    }
}
