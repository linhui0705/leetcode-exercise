package P0046_Permutations;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * 全排列。回溯法经典题目。
 * 本题解用Set解决。
 *
 * @author Lin Hui
 * @date 2021/9/30 14:24
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> set = new LinkedHashSet<>();
        backtrack(nums, ans, set);
        return ans;
    }

    public void backtrack(int[] nums, List<List<Integer>> ans, Set<Integer> set) {
        if (nums.length == set.size()) {
            ans.add(new ArrayList<>(set));
            return;
        }
        for (int num : nums) {
            if (!set.add(num)) {
                continue;
            }
            backtrack(nums, ans, set);
            set.remove(num);
        }
    }
}
