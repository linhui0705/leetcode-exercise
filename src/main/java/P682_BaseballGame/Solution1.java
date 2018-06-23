package P682_BaseballGame;

import java.util.Stack;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2018-4-3 21:51
 */
public class Solution1 {
    public static void main(String[] args) {
        String[] ops = new String[]{"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(ops));
    }

    public static int calPoints(String[] ops) {
        Stack<String> stack = new Stack<>();
        int sum = 0;
        for (String s : ops) {
            switch (s) {
                case "C":
                    stack.pop();
                    break;
                case "D":
                    Integer d = Integer.valueOf(stack.peek()) * 2;
                    stack.push(d.toString());
                    break;
                case "+":
                    Integer t = Integer.valueOf(stack.get(stack.size() - 1)) + Integer.valueOf(stack.get(stack.size() - 2));
                    stack.push(t.toString());
                    break;
                default:
                    stack.push(s);
                    break;
            }
        }
        for (String s : stack) {
            sum += Integer.valueOf(s);
        }

        return sum;
    }
}
