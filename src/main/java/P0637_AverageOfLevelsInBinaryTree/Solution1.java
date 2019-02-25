package P0637_AverageOfLevelsInBinaryTree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Solution1
 * Description:
 * 计算每个层级结点的平均值
 * 先遍历计算层级和，以及层级结点数量，然后遍历数组计算每个层级的平均值
 *
 * @author Lin Hui
 * Created on 2019/2/22 15:39
 */
public class Solution1 {
    List<Double> ans = new ArrayList<>();
    List<Integer> levels = new ArrayList<>();

    @Test
    public void testCase() {

    }

    public List<Double> averageOfLevels(TreeNode root) {
        traversal(root, 0);
        for (int i = 0; i < ans.size(); i++) {
            ans.set(i, ans.get(i) / levels.get(i));
        }
        return ans;
    }

    public void traversal(TreeNode root, int depth) {
        if (null == root) {
            return;
        }
        if (ans.size() < depth + 1) {
            ans.add((double) root.val);
            levels.add(1);
        } else {
            double result = ans.get(depth) + root.val;
            ans.set(depth, result);
            levels.set(depth, levels.get(depth) + 1);
        }
        traversal(root.left, depth + 1);
        traversal(root.right, depth + 1);
    }
}
