package P0101_SymmetricTree;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Title: Solution2
 * Description:
 * 题解：递推解法
 *
 * @author Lin Hui
 * Created on 2019/2/27 14:39
 */
public class Solution2 {
    @Test
    public void testCase() {

    }

    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode t1 = q.poll();
            TreeNode t2 = q.poll();
            if (t1 == null && t2 == null) {
                continue;
            }
            if (t1 == null || t2 == null) {
                return false;
            }
            if (t1.val != t2.val) {
                return false;
            }
            q.add(t1.left);
            q.add(t2.right);
            q.add(t1.right);
            q.add(t2.left);
        }
        return true;
    }
}
