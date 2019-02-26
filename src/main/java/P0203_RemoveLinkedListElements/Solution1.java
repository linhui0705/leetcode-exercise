package P0203_RemoveLinkedListElements;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 移除链表中值为val的结点
 *
 * author Lin Hui
 * Created on 2019/2/26 11:20
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode header = new ListNode(-1);
        header.next = head;
        ListNode pre = header;
        ListNode post = pre.next;

        while (post != null) {
            if (post.val == val) {
                pre.next = post.next;
                post = pre.next;
            } else {
                pre = pre.next;
                post = post.next;
            }
        }

        return header.next;
    }
}