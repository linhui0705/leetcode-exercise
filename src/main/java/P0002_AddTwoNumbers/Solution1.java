package P0002_AddTwoNumbers;

/**
 * Title: Solution1
 * Description:
 * 给定两条链表l1和l2，链表顺序表示该数的逆序。如l1: (2->4->3)，表示342，l2: (5->6->4)，表示465，两数和为342+465=807，返回的链表为7->0->8
 * 将l2上的数加到l1链表上，最后的结果返回l1链表即可。需要小心的地方就是要处理好两条链表的末尾的情况。
 *
 * @author Lin Hui
 * Created on 2020/2/21 22:33
 */
public class Solution1 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (null == l1 && null == l2) {
            return null;
        }
        if (null == l1) {
            return l2;
        }
        if (null == l2) {
            return l1;
        }
        ListNode p = l1;
        //pb为p的上一个结点
        ListNode pb = null;
        ListNode q = l2;
        while (null != p && null != q) {
            p.val += q.val;
            //逢10进位
            if (p.val >= 10) {
                p.val %= 10;
                if (null != p.next) {
                    p.next.val++;
                } else {
                    p.next = new ListNode(1);
                }
            }
            pb = p;
            p = p.next;
            q = q.next;
        }
        //对链表结点中已进位的数字进行处理
        while (null != p) {
            if (p.val >= 10) {
                p.val %= 10;
                if (null != p.next) {
                    p.next.val++;
                } else {
                    p.next = new ListNode(1);
                }
            }
            p = p.next;
        }
        //若l2链表还有剩余结点，直接接到l1结点的后面
        if (null != q) {
            pb.next = q;
        }
        return l1;
    }
}
