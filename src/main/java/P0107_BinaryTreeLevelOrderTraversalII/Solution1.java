package P0107_BinaryTreeLevelOrderTraversalII;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Title: Solution1
 * Description:
 * 给定一棵二叉树，按照层序遍历，输出树中的元素，其中同一层元素放在一个List，List的顺序依次从叶子到根的排序依次先后排列。
 *
 * @author Lin Hui
 * Created on 2020/1/25 9:23
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        levelTreversal(root, 0, ans);
        Collections.reverse(ans);
        return ans;
    }

    public void levelTreversal(TreeNode node, int level, List<List<Integer>> ans) {
        if (node == null) {
            return;
        }
        if (level >= ans.size()) {
            ans.add(new ArrayList<>());
        }
        ans.get(level).add(node.val);
        levelTreversal(node.left, level + 1, ans);
        levelTreversal(node.right, level + 1, ans);
    }


}
