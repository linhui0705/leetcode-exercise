package P0237_DeleteNodeInALinkedList;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 删除单链表的节点，只提供删除的节点的位置。
 * 题目有以下条件：
 * 1.单链表至少有两个节点
 * 2.所有节点的元素唯一
 * 3.要删除的节点不会是尾节点，并且在单链表中是个有效存在的节点
 * 4.题目提供的函数（方法）不需要返回任何类型的值
 *
 * @author Lin Hui
 * Created on 2019-12-28 23:57
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public void deleteNode(ListNode node) {
        ListNode next = node.next;
        node.val = next.val;
        node.next = next.next;
    }
}
