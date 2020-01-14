package P0530_MinimumAbsoluteDifferenceInBST;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Title: Solution1
 * Description:
 * 求二叉树中两个节点的最小差
 * 解法一是将所有的节点遍历出来存到list，再排序，最后遍历list找最小差。
 * 方法简单粗暴，但是效率很低，用TreeSet的话就更低效了……
 *
 * @author Lin Hui
 * Created on 2020-1-14 10:50
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public int getMinimumDifference(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        reverse(root, list);
        Collections.sort(list);
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            ans = Math.min(ans, list.get(i) - list.get(i - 1));
        }
        return ans;
    }

    public void reverse(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        list.add(node.val);
        reverse(node.left, list);
        reverse(node.right, list);
    }
}
