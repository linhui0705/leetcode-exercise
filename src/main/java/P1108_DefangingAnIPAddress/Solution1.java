package P1108_DefangingAnIPAddress;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 热身水题
 *
 * @author Lin Hui
 * Created on 2019/12/25 11:03
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals("1[.]1[.]1[.]1", defangIPaddr("1.1.1.1"));
        Assert.assertEquals("255[.]100[.]50[.]0", defangIPaddr("255.100.50.0"));
    }

    public String defangIPaddr(String address) {
        StringBuilder builder = new StringBuilder();
        for (char c : address.toCharArray()) {
            if (c == '.') {
                builder.append("[.]");
            } else {
                builder.append(c);
            }
        }
        return builder.toString();
    }
}
