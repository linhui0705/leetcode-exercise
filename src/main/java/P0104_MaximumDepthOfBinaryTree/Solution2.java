package P0104_MaximumDepthOfBinaryTree;

import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 * 最快题解，比较简洁
 *
 * @author Lin Hui
 * Created on 2019/2/20 9:39
 */
public class Solution2 {
    @Test
    public void testCase() {

    }

    public int maxDepth(TreeNode root) {
        if (null == root) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
