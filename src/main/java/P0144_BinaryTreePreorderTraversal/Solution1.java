package P0144_BinaryTreePreorderTraversal;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Solution1
 * Description:
 * 先序遍历，按照中->左->右节点顺序遍历。
 *
 * @author Lin Hui
 * Created on 2022/2/14 10:17:11
 */
public class Solution1 {
    List<Integer> ans = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        traversal(root);
        return ans;
    }

    private void traversal(TreeNode node) {
        if (null == node) {
            return;
        }
        ans.add(node.val);
        traversal(node.left);
        traversal(node.right);
    }
}
