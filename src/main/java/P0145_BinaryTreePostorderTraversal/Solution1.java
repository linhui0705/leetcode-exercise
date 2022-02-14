package P0145_BinaryTreePostorderTraversal;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Solution1
 * Description:
 * 后续遍历，按照左->右->中节点顺序遍历。
 *
 * @author Lin Hui
 * Created on 2022/2/14 10:17:11
 */
public class Solution1 {
    List<Integer> ans = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        traversal(root);
        return ans;
    }

    private void traversal(TreeNode node) {
        if (null == node) {
            return;
        }
        traversal(node.left);
        traversal(node.right);
        ans.add(node.val);
    }
}
