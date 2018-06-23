package P657_JudgeRouteCircle;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2018/3/1 10:53
 */
public class Solution1 {
    public static void main(String[] args) {
        System.out.println(judgeCircle("UD"));
        System.out.println(judgeCircle("LL"));
    }

    public static boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                default:
                    break;
            }
        }
        return x == 0 && y == 0;
    }
}
