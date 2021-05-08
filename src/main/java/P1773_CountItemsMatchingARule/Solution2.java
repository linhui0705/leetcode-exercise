package P1773_CountItemsMatchingARule;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Title: Solution2
 * Description:
 * Solution1跑了7ms，效率不高，归结于循环内跑了不必要的代码逻辑。
 *
 * @author Lin Hui
 * Created on 2021/5/8 22:27:08
 */
public class Solution2 {
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
        int index = 0;
        switch (ruleKey) {
            case "type":
                index = 0;
                break;
            case "color":
                index = 1;
                break;
            case "name":
                index = 2;
                break;
            default:
                break;
        }
        for (List<String> list : items) {
            if (Objects.equals(ruleValue, list.get(index))) {
                ans++;
            }
        }
        return ans;
    }
}
