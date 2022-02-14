package P0019_RemoveNthNodeFromEndOfList;

/**
 * Title: Solution2
 * Description:
 * 官方题解，很巧妙的一种解法。
 * 使用快慢双指针遍历，也无需过分考虑边界情况
 *
 * @author Lin Hui
 * Created on 2022/2/14 14:43:24
 */
public class Solution2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode();
        start.next = head;
        ListNode fast = start;
        ListNode slow = start;

        for (int i = 1; i <= n; ++i) {
            fast = fast.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return start.next;
    }
}
