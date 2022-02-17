package P0106_ConstructBinaryTreefromInorderAndPostorderTraversal;

/**
 * Title: Solution1
 * Description:
 * 给定两个数组，一个是二叉树的中序遍历，一个是二叉树的后序遍历，把这个二叉树还原出来。
 *
 * @author Lin Hui
 * Created on 2022/2/17 16:23:27
 */
public class Solution1 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    private int findIndex(int[] nums, int val) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                return i;
            }
        }
        return -1;
    }

    private TreeNode build(int[] inorder, int il, int ir, int[] postorder, int pl, int pr) {
        if (pl > pr) {
            return null;
        }
        // 根节点值
        int rootVal = postorder[pr];
        // 中序遍历根节点索引
        int inorderIndex = findIndex(inorder, rootVal);

        TreeNode node = new TreeNode(rootVal);
        int leftSize = inorderIndex - il;
        node.left = build(inorder, il, inorderIndex - 1, postorder, pl, pl + leftSize - 1);
        node.right = build(inorder, inorderIndex + 1, ir, postorder, pl + leftSize, pr - 1);
        return node;
    }
}
