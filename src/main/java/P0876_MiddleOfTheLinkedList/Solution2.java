package P0876_MiddleOfTheLinkedList;

import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 * 找到链表中间结点，不必开辟数组空间。设置快指针和慢指针，快指针每次走两步，慢指针每次走一步，可以保证循环后慢指针所指结点就是链表的中间结点。
 *
 * @author Lin Hui
 * Created on 2020-2-6 11:02
 */
public class Solution2 {
    @Test
    public void testCase() {

    }

    public ListNode middleNode(ListNode head) {
        ListNode p = head;
        ListNode q = head;
        while (null != q && null != q.next) {
            p = p.next;
            q = q.next.next;
        }
        return p;
    }
}
