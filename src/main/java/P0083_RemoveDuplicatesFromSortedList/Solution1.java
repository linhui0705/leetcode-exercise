package P0083_RemoveDuplicatesFromSortedList;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 给出一个有序链表，删除所有重复结点，使得结点在链表只出现一次。
 *
 * @author Lin Hui
 * Created on 2019/2/26 16:09
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode header = new ListNode(0);
        header.next = head;
        ListNode pre = header.next;
        ListNode post = pre == null ? null : pre.next;

        while (post != null) {
            if (pre.val == post.val) {
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
