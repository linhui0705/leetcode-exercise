package P0019_RemoveNthNodeFromEndOfList;

/**
 * Title: Solution1
 * Description:
 * 删除链表倒数第N个节点
 * 土方法，先while循环统计出链表长度size，然后通过size-n找到要删除的目标节点target
 *
 * @author Lin Hui
 * Created on 2022/2/14 14:24:27
 */
public class Solution1 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = head;
        int size = 0;
        while (null != node) {
            size++;
            node = node.next;
        }
        // System.out.println("size=" + size);
        node = head;
        int target = size - n;
        // System.out.println("target=" + target);
        for (int i = 0; i < target - 1; i++) {
            node = node.next;
        }
        // System.out.println("node=" + node.val);
        if (target == 0) {
            head = head.next;
            return head;
        }
        ListNode tmp = node.next;
        if (null != tmp) {
            node.next = tmp.next;
        } else {
            // 链表只有一个节点
            if (size == 1) {
                return null;
            }
            // 删除的节点为最后一个节点
            else {
                node.next = null;
            }
        }
        return head;
    }
}
