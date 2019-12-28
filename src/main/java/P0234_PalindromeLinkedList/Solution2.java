package P0234_PalindromeLinkedList;

import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 * 时间复杂度：O(n)
 * 空间复杂度：O(1)
 *
 * @author Lin Hui
 * Created on 2019-12-28 21:18
 */
public class Solution2 {
    @Test
    public void testCase() {

    }

    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        slow = reverse(slow);
        fast = head;
        while (slow != null) {
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
