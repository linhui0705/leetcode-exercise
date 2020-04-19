package P1410_HTMLEntityParser;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * HTML实体转换。字符转义变换。
 * 要是在Contest，短时间内解决，可以这样骚操作。但是性能不高。
 *
 * @author Lin Hui
 * Created on 2020/4/19 12:47:51
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals("& is an HTML entity but &ambassador; is not.",
                entityParser("&amp; is an HTML entity but &ambassador; is not."));
        Assert.assertEquals("and I quote: \"...\"",
                entityParser("and I quote: &quot;...&quot;"));
        Assert.assertEquals("Stay home! Practice on Leetcode :)",
                entityParser("Stay home! Practice on Leetcode :)"));
        Assert.assertEquals("x > y && x < y is always false",
                entityParser("x &gt; y &amp;&amp; x &lt; y is always false"));
        Assert.assertEquals("leetcode.com/problemset/all",
                entityParser("leetcode.com&frasl;problemset&frasl;all"));
    }

    public String entityParser(String text) {
        return text.replaceAll("&quot;", "\"")
                .replaceAll("&apos;", "'")
                .replaceAll("&gt;", ">")
                .replaceAll("&lt;", "<")
                .replaceAll("&frasl;", "/")
                .replaceAll("&amp;", "&");
    }
}
