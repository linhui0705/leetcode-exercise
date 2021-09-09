package P0071_SimplifyPath;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

/**
 * 给定一个字符串path，它是Unix样式文件系统中文件或目录的绝对路径（以斜杠开头'/'），将其转换为简化的规范路径。
 * 最基本的想法，借助Stack，进行入栈出栈操作。最后遍历集合输出路径。
 * Result: Runtime: 5 ms, faster than 54.52%; Memory Usage: 39.3 MB, less than 48.40%
 * 运行结果不太行……
 *
 * @author Lin Hui
 * @date 2021/9/6 16:04
 */
public class Solution1 {
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
            if (null == str || str.length() == 0 || ".".equals(str) || ("..".equals(str) && stack.empty())) {
                continue;
            }
            if ("..".equals(str)) {
                stack.pop();
            } else {
                stack.push(str);
            }
        }
        StringBuilder builder = new StringBuilder();
        stack.forEach(str -> builder.append("/").append(str));
        return builder.length() == 0 ? builder.append("/").toString() : builder.toString();
    }
}
