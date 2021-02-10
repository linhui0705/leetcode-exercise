package P1528_ShuffleString;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Title: Solution1
 * Description:
 * 给定一个字符串和int数组索引，根据索引对字符串重排序。
 * 用了个比较low的方法，构造一个对象来存储字符和索引，然后根据索引给对象排序后再输出。
 * 到时再看看人家对最优解……
 *
 * @author Lin Hui
 * Created on 2021/2/10 14:39:45
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals("leetcode", restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}));
        Assert.assertEquals("abc", restoreString("abc", new int[]{0, 1, 2}));
        Assert.assertEquals("nihao", restoreString("aiohn", new int[]{3, 1, 4, 2, 0}));
        Assert.assertEquals("arigatou", restoreString("aaiougrt", new int[]{4, 0, 2, 6, 7, 3, 1, 5}));
        Assert.assertEquals("rat", restoreString("art", new int[]{1, 0, 2}));
    }

    public String restoreString(String s, int[] indices) {
        List<Element> list = new ArrayList<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            list.add(new Element(indices[i], s.charAt(i)));
        }
        list = list.stream().sorted(Comparator.comparingInt(item -> item.id)).collect(Collectors.toList());
        StringBuilder builder = new StringBuilder();
        list.forEach(element -> builder.append(element.c));
        return builder.toString();
    }

    class Element {
        Element(int id, char c) {
            this.id = id;
            this.c = c;
        }

        int id;
        char c;
    }
}
