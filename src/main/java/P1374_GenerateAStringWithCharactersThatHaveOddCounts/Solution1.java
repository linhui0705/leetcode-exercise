package P1374_GenerateAStringWithCharactersThatHaveOddCounts;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给定一个数n，返回一个字符串，使得字符在字符串中的出现的次数为奇数次。
 * 字符串只要符合上述的规则，可返回任意一种即可。
 * 大水题哇哇哇……
 *
 * @author Lin Hui
 * Created on 2020/3/8 22:24
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public String generateTheString(int n) {
        StringBuilder builder = new StringBuilder();
        if ((n & 1) == 1) {
            for (int i = 0; i < n; i++) {
                builder.append('a');
            }
        } else {
            builder.append('a');
            for (int i = 1; i < n; i++) {
                builder.append('b');
            }
        }
        return builder.toString();
    }
}
