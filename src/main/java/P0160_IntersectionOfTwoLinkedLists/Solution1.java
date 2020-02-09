package P0160_IntersectionOfTwoLinkedLists;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Title: Solution1
 * Description:
 * 给定两条链表的头结点headA和headB，找到两条链表的交汇结点。
 * 最笨的方法，放到Set里面比较，先比较到有相同的对象，就是两链表交汇的结点。
 * 当然性能就不行的啦……
 *
 * @author Lin Hui
 * Created on 2020-2-8 15:57
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode p = headA;
        ListNode q = headB;
        while (null != p || null != q) {
            if (null != p) {
                if (set.contains(p)) {
                    return p;
                } else {
                    set.add(p);
                    p = p.next;
                }
            }
            if (null != q) {
                if (set.contains(q)) {
                    return q;
                } else {
                    set.add(q);
                    q = q.next;
                }
            }
        }
        return null;
    }
}
