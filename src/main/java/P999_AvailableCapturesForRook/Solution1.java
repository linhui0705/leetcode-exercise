package P999_AvailableCapturesForRook;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * Weekly Contest 125
 * 很长的题……
 * 但仔细看了，是很水的题目
 * 就是计算国际象棋的白车的攻击范围内能吃多少个黑棋
 * 直接暴力吧，没啥说的……
 *
 * @author Lin Hui
 * Created on 2019/2/25 10:59
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public int numRookCaptures(char[][] board) {
        int x = -1;
        int y = -1;
        //Find R
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'R') {
                    x = i;
                    y = j;
                    break;
                }
                if (x != -1 && y != -1) {
                    break;
                }
            }
        }
        int ans = 0;
        //left
        for (int i = x - 1; i >= 0; i--) {
            if (board[i][y] == 'B') {
                break;
            }
            if (board[i][y] == 'p') {
                ans++;
                break;
            }
        }
        //right
        for (int i = x + 1; i < board.length; i++) {
            if (board[i][y] == 'B') {
                break;
            }
            if (board[i][y] == 'p') {
                ans++;
                break;
            }
        }
        //up
        for (int j = y - 1; j >= 0; j--) {
            if (board[x][j] == 'B') {
                break;
            }
            if (board[x][j] == 'p') {
                ans++;
                break;
            }
        }
        //down
        for (int j = y + 1; j < board[0].length; j++) {
            if (board[x][j] == 'B') {
                break;
            }
            if (board[x][j] == 'p') {
                ans++;
                break;
            }
        }

        return ans;
    }
}
