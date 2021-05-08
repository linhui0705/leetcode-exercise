package P1773_CountItemsMatchingARule;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Title: Solution1
 * Description:
 * 给定一个集合items，集合元素为List<String>数组，数组内有三个元素，分别为type,color,name。
 * 现给出ruleKey(type, color or name)和ruleValue，算出符合规则的集合元素数量。
 *
 * @author Lin Hui
 * Created on 2021/5/8 22:14:25
 */
public class Solution1 {
    @Test
    public void testCase() {
        Assert.assertEquals(1, countMatches(Arrays.asList(
                Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "lenovo"),
                Arrays.asList("phone", "gold", "iphone")
        ), "color", "silver"));
        Assert.assertEquals(2, countMatches(Arrays.asList(
                Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "lenovo"),
                Arrays.asList("phone", "gold", "iphone")
        ), "type", "phone"));
    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;
        String str = null;
        for (List<String> list : items) {
            switch (ruleKey) {
                case "type":
                    str = list.get(0);
                    break;
                case "color":
                    str = list.get(1);
                    break;
                case "name":
                    str = list.get(2);
                    break;
                default:
                    break;
            }
            if (Objects.equals(ruleValue, str)) {
                ans++;
            }
        }
        return ans;
    }
}
