package P278_FirstBadVersion;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 找出首个坏的版本，用二分法
 *
 * @author Lin Hui
 * Created on 2019-2-10 10:20
 */
public class Solution1 extends VersionControl {
    @Test
    public void testCase() {
        System.out.println(firstBadVersion(16));
    }

    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int i = 0;
        while (start < end) {
            i = start + (end - start) / 2;
            System.out.println("i=" + i + ",isBadVersion(" + (i - 1) + ")=" + isBadVersion(i - 1) + ",isBadVersion(" + i + ")=" + isBadVersion(i));
            if (!isBadVersion(i - 1) && isBadVersion(i) && i > 0) {
                return i;
            } else if (!isBadVersion(i - 1) && !isBadVersion(i)) {
                start = i + 1;
            } else {
                end = i - 1;
            }
        }
        i = start + (end - start) / 2;
        return isBadVersion(i) ? i : -1;
    }
}
