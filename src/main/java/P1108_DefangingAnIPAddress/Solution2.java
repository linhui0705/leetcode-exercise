package P1108_DefangingAnIPAddress;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 * 字符串替换，2ms
 *
 * @author Lin Hui
 * Created on 2019/12/25 11:07 上午
 */
public class Solution2 {
    @Test
    public void testCase() {
        Assert.assertEquals("1[.]1[.]1[.]1", defangIPaddr("1.1.1.1"));
        Assert.assertEquals("255[.]100[.]50[.]0", defangIPaddr("255.100.50.0"));
    }

    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
