package P0105_ConstructBinaryTreeFromPreorderAndInorderTraversal;

/**
 * Title: Solution1
 * Description:
 * 给定两个数组，一个是二叉树的先序遍历，一个是二叉树的中序遍历，把这个二叉树还原出来。
 *
 * @author Lin Hui
 * Created on 2022/2/17 14:43:55
 */
public class Solution1 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private int findIndex(int[] nums, int val) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                return i;
            }
        }
        return -1;
    }

    private TreeNode build(int[] preorder, int pl, int pr, int[] inorder, int il, int ir) {
        if (pl > pr || pl >= preorder.length) {
            return null;
        }
        int rootVal = preorder[pl];
        TreeNode node = new TreeNode(rootVal);

        int inorderIndex = findIndex(inorder, rootVal);
        int leftSize = inorderIndex - il;
        int rightSize = ir - inorderIndex;

        node.left = build(preorder, pl + 1, pl + leftSize, inorder, il, inorderIndex - 1);
        node.right = build(preorder, pl + 1 + leftSize, pr, inorder, inorderIndex + 1, ir);
        // System.out.println("rootVal="+rootVal+", pl="+pl+", pr="+pr+", il="+il+", ir="+ir);
        return node;
    }
}
