package P872_LeafSimilarTrees;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Solution1
 * Description:
 * 给定两棵二叉树，判断两棵树的叶子结点序列是否一致
 *
 * @author Lin Hui
 * Created on 2019/2/22 9:47
 */
public class Solution1 {
    List<Integer> list = new ArrayList<>();
    int count = 0;

    @Test
    public void testCase() {

    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        traversal(root1);
        checkTree(root2);
        return list.size() == count;
    }

    public void traversal(TreeNode root) {
        if (null == root) {
            return;
        }
        if (null == root.left && null == root.right) {
            list.add(root.val);
            return;
        }
        traversal(root.left);
        traversal(root.right);
    }

    public void checkTree(TreeNode root) {
        if (null == root) {
            return;
        }
        if (null == root.left && null == root.right && list.get(count) == root.val) {
            if (list.get(count) == root.val) {
                count++;
            } else {
                return;
            }
        }
        checkTree(root.left);
        checkTree(root.right);
    }
}
