package P0606_ConstructStringFromBinaryTree;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 用前序遍历的方式，将一个二叉树转换成一个由括号和整数组成的字符串。
 * 空节点则用一对空括号 "()" 表示。且需要省略所有不影响字符串与原始二叉树之间的一对一映射关系的空括号对。
 *
 * @author Lin Hui
 * Created on 2020/2/11 12:56
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    StringBuilder builder = new StringBuilder();

    public String tree2str(TreeNode t) {
        traverse(t);
        return builder.toString();
    }

    public void traverse(TreeNode node) {
        if (null == node) {
            return;
        }
        builder.append(node.val);
        if (null == node.left && null == node.right) {
            return;
        }
        //left
        builder.append("(");
        if (null != node.left) {
            traverse(node.left);
        }
        builder.append(")");
        //right
        if (null != node.right) {
            builder.append("(");
            traverse(node.right);
            builder.append(")");
        }
    }
}
