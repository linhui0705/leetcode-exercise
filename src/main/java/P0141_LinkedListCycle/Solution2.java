package P0141_LinkedListCycle;

import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 * Two Pointers，使用快慢指针。
 * 若链表成环，快指针必然会比慢指针快一圈，终究会追上慢指针。
 *
 * @author Lin Hui
 * Created on 2019/2/26 10:44
 */
public class Solution2 {
    @Test
    public void testCase() {

    }

    public boolean hasCycle(ListNode head) {
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (slowPointer == fastPointer) {
                return true;
            }
        }
        return false;
    }
}
