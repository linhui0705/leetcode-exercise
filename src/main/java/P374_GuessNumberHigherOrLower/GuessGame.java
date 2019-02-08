package P374_GuessNumberHigherOrLower;

/**
 * Title: GuessGame
 * Description:
 *
 * @author Lin Hui
 * Created on 2019-2-8 17:09
 */
public class GuessGame {
    public int guess(int num) {
        if (num == 6) {
            return 0;
        } else if (num > 6) {
            return -1;
        } else {
            return 1;
        }
    }
}
