package P0071_SimplifyPath;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

/**
 * 仅优化if条件
 * Result: Runtime: 4 ms, faster than 77.39%; Memory Usage: 39.1 MB, less than 58.67%
 *
 * @author Lin Hui
 * @date 2021/9/6 16:04
 */
public class Solution2 {
    @Test
    public void testCase() {
        Assert.assertEquals("/home", simplifyPath("/home/"));
        Assert.assertEquals("/", simplifyPath("/../"));
        Assert.assertEquals("/home/foo", simplifyPath("/home//foo/"));
        Assert.assertEquals("/c", simplifyPath("/a/./b/../../c/"));
    }

    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] arr = path.split("/");
        for (String str : arr) {
            if (null == str || str.isEmpty() || ".".equals(str)) {
                continue;
            }
            if ("..".equals(str)) {
                if (!stack.empty()) {
                    stack.pop();
                }
            } else {
                stack.push(str);
            }
        }
        StringBuilder builder = new StringBuilder();
        stack.forEach(str -> builder.append("/").append(str));
        return builder.length() == 0 ? "/" : builder.toString();
    }
}
