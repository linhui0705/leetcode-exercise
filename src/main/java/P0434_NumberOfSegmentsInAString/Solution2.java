package P0434_NumberOfSegmentsInAString;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 *
 * @author Lin Hui
 * Created on 2019/2/28 15:14
 */
public class Solution2 {
    @Test
    public void testCase() {
        Assert.assertEquals(5, countSegments("Hello, my name is John"));
    }

    public int countSegments(String s) {
        String trimmed = s.trim();
        if (trimmed.equals("")) {
            return 0;
        }
        return trimmed.split("\\s+").length;
    }
}
