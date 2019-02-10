package P278_FirstBadVersion;

import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 * 最快的Solution，代码简洁，没多余的判断
 *
 * @author Lin Hui
 * Created on 2019-2-10 11:02
 */
public class Solution2 extends VersionControl {
    @Test
    public void testCase() {
        System.out.println(firstBadVersion(16));
    }

    public int firstBadVersion(int n) {
        int l = 1, h = n;
        while (l < h) {
            int m = l + (h - l) / 2;
            if (isBadVersion(m)) {
                h = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }
}
