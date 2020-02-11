package P0653_TwoSumIVInputIsABST;

import java.util.HashSet;
import java.util.Set;

/**
 * Title: Solution1
 * Description:
 * 给定一棵二叉树和目标值k，能否在二叉树中找到两个结点，使得这两个结点的和等于目标值k
 * HashSet解法
 *
 * @author Lin Hui
 * Created on 2020/2/11 12:07
 */
public class Solution1 {
    Set<Integer> set = new HashSet<>();
    boolean ans = false;

    public boolean findTarget(TreeNode root, int k) {
        if (null == root) {
            return false;
        }
        if (set.contains(k - root.val)) {
            return true;
        }
        set.add(root.val);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}
