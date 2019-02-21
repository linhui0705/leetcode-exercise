package P257_BinaryTreePaths;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Solution1
 * Description:
 * 给出一棵树，输出所有从根结点到叶子结点的所有路径
 * 装个逼，看了最快的解，都好像没我的简洁……
 *
 * @author Lin Hui
 * Created on 2019/2/21 16:06
 */
public class Solution1 {
    List<String> ans = new ArrayList<>();

    @Test
    public void testCase() {

    }

    public List<String> binaryTreePaths(TreeNode root) {
        if (null == root) {
            return ans;
        }
        traversal(root, String.valueOf(root.val));
        return ans;
    }

    public void traversal(TreeNode root, String path) {
        if (null == root) {
            return;
        }
        if (null == root.left && null == root.right) {
            ans.add(path);
        }
        if (null != root.left) {
            traversal(root.left, path + "->" + root.left.val);
        }
        if (null != root.right) {
            traversal(root.right, path + "->" + root.right.val);
        }
    }
}
