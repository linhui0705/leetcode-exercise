package P1275_FindWinnerOnATicTacToeGame;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 题目就是就井字游戏的判定，判定谁赢谁输，还是平局，还是游戏没结束。
 * 感觉这种题真没什么营养……
 *
 * @author Lin Hui
 * Created on 2019-12-26 15:55
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals("A", tictactoe(new int[][]{{0, 0}, {2, 0}, {1, 1}, {2, 1}, {2, 2}}));
        Assert.assertEquals("B", tictactoe(new int[][]{{0, 0}, {1, 1}, {0, 1}, {0, 2}, {1, 0}, {2, 0}}));
        Assert.assertEquals("Draw", tictactoe(new int[][]{{0, 0}, {1, 1}, {2, 0}, {1, 0}, {1, 2}, {2, 1}, {0, 1}, {0, 2}, {2, 2}}));
        Assert.assertEquals("Pending", tictactoe(new int[][]{{0, 0}, {1, 1}}));
    }

    public String tictactoe(int[][] moves) {
        char[][] grid = new char[3][3];
        for (int i = 0; i < moves.length; i++) {
            if (i % 2 == 0) {
                grid[moves[i][0]][moves[i][1]] = 'X';
            } else {
                grid[moves[i][0]][moves[i][1]] = 'O';
            }
        }
        if (grid[1][1] == 'X' || grid[1][1] == 'O') {
            if ((grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2]) ||
                    (grid[2][0] == grid[1][1] && grid[1][1] == grid[0][2]) ||
                    (grid[1][0] == grid[1][1] && grid[1][1] == grid[1][2]) ||
                    (grid[0][1] == grid[1][1] && grid[1][1] == grid[2][1])) {
                switch (grid[1][1]) {
                    case 'X':
                        return "A";
                    case 'O':
                        return "B";
                    default:
                        break;
                }
            }
        }
        if (grid[0][0] == grid[0][1] && grid[0][1] == grid[0][2]) {
            switch (grid[0][2]) {
                case 'X':
                    return "A";
                case 'O':
                    return "B";
                default:
                    break;
            }
        }
        if (grid[2][0] == grid[2][1] && grid[2][1] == grid[2][2]) {
            switch (grid[2][2]) {
                case 'X':
                    return "A";
                case 'O':
                    return "B";
                default:
                    break;
            }
        }
        if (grid[0][0] == grid[1][0] && grid[1][0] == grid[2][0]) {
            switch (grid[2][0]) {
                case 'X':
                    return "A";
                case 'O':
                    return "B";
                default:
                    break;
            }
        }
        if (grid[0][2] == grid[1][2] && grid[1][2] == grid[2][2]) {
            switch (grid[2][2]) {
                case 'X':
                    return "A";
                case 'O':
                    return "B";
                default:
                    break;
            }
        }
        if (moves.length == 9) {
            return "Draw";
        }
        return "Pending";
    }
}
