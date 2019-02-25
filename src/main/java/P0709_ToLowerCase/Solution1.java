package P0709_ToLowerCase;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 *
 * @author Lin Hui
 * Created on 2018-12-13 22:32
 */
public class Solution1 {
    @Test
    public void testCase(){
        Assert.assertEquals("hello", toLowerCase("Hello"));
        Assert.assertEquals("here", toLowerCase("here"));
        Assert.assertEquals("lovely", toLowerCase("LOVELY"));
    }

    public String toLowerCase(String str) {
        return str.toLowerCase();
    }
}
