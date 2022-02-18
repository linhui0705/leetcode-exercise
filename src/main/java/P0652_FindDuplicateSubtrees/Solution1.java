package P0652_FindDuplicateSubtrees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Title: Solution1
 * Description:
 * 给定一个二叉树，找出有重复的子树。
 * 用一个map记录子树重复次数，list返回结果。
 * 定义字符串trace，为当前节点val+左子树trace+右子树trace，以trace来判断重复次数。发现重复list就add节点，多次重复则无需重复add。
 *
 * @author Lin Hui
 * Created on 2022/2/18 17:55:37
 */
public class Solution1 {
    Map<String, Integer> map = new HashMap<>();
    List<TreeNode> ans = new ArrayList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        traverse(root);
        return ans;
    }

    private String traverse(TreeNode node) {
        if (null == node) {
            return "#";
        }
        String left = traverse(node.left);
        String right = traverse(node.right);
        String trace = node.val + "_" + left + "_" + right;
        if (!map.containsKey(trace)) {
            map.put(trace, 1);
        } else if (map.containsKey(trace) && map.get(trace) == 1) {
            ans.add(node);
            map.put(trace, map.get(trace) + 1);
        }
        // System.out.println(trace);
        return trace;
    }
}
