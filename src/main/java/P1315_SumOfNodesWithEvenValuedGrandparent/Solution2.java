package P1315_SumOfNodesWithEvenValuedGrandparent;

/**
 * Title: Solution2
 * Description:
 * 0ms题解，代码简洁，思路清晰，一层一层地套娃……
 *
 * @author Lin Hui
 * Created on 2020/2/11 11:38
 */
public class Solution2 {
    int ans = 0;

    public int sumEvenGrandparent(TreeNode root) {
        traverse(root, null, null);
        return ans;
    }

    public void traverse(TreeNode node, TreeNode parent, TreeNode grandParent) {
        if (null == node) {
            return;
        }
        if (null != grandParent && (grandParent.val & 1) == 0) {
            ans += node.val;
        }
        traverse(node.left, node, parent);
        traverse(node.right, node, parent);
    }
}
