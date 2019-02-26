package P0083_RemoveDuplicatesFromSortedList;

import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 * 看到的题解，代码简洁明了。
 *
 * @author Lin Hui
 * Created on 2019/2/26 16:12
 */
public class Solution2 {
    @Test
    public void testCase() {

    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            if (prev != null && prev.val == curr.val) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }

        return head;
    }
}
