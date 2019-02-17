package P993_CousinsInBinaryTree;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: Solution2
 * Description:
 * 一个很不错的题解
 * 直接用Map存储结点的深度，以及结点对应的父级结点，只要做一次树的遍历，就可以得到答案。
 *
 * @author Lin Hui
 * Created on 2019-2-17 12:15
 */
public class Solution2 {
    Map<Integer, Integer> depthMap = new HashMap<>();
    Map<Integer, Integer> parentMap = new HashMap<>();

    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root, null);
        return depthMap.get(x) == depthMap.get(y) && parentMap.get(x) != parentMap.get(y);
    }

    public void dfs(TreeNode node, TreeNode parent) {
        if (node != null) {
            depthMap.put(node.val, parent != null ? depthMap.get(parent.val) + 1 : 0);
            parentMap.put(node.val, parent != null ? parent.val : -1);
            dfs(node.left, node);
            dfs(node.right, node);
        }
    }

}