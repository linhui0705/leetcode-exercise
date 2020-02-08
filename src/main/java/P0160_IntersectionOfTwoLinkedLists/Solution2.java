package P0160_IntersectionOfTwoLinkedLists;

import org.junit.Test;

/**
 * Title: Solution2
 * Description:
 * 一个很巧妙的双指针解法，有点慢慢理解和消化。
 * e.g:
 * A: 4->1->8->4->5
 * B: 5->0->1->8->4->5
 * A+B链和B+A链的结点长度是相等的。
 * A+B: 4->1->8->4->5->5->0->1->8->4->5
 * B+A: 5->0->1->8->4->5->4->1->8->4->5
 * 因为是找交汇结点，即结点对应的内存地址应相等，而不是结点的数值相等。
 * while循环处，p==q时，两个结点为交汇结点；若p==null&&q==null，则两链表无交汇结点。
 * 双指针p,q遍历分别遍历一次链表A+B和链表B+A，长度相等，若无交汇结点，则p,q必定最终指向null
 *
 * @author Lin Hui
 * Created on 2020-2-8 16:04
 */
public class Solution2 {
    @Test
    public void testCase() {

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (null == headA || null == headB) {
            return null;
        }
        ListNode p = headA;
        ListNode q = headB;
        while (p != q) {
            p = (null == p) ? headB : p.next;
            q = (null == q) ? headA : q.next;
        }
        return p;
    }
}
