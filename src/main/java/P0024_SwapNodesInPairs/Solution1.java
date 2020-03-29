package P0024_SwapNodesInPairs;

/**
 * Title: Solution1
 * Description:
 * 逐对交换结点。
 * e.g.: 1->2->3->4->，交换后：2->1-4->3
 *
 * @author Lin Hui
 * Created on 2020/3/29 8:20 下午
 */
public class Solution1 {
    public ListNode swapPairs(ListNode head) {
        if (null == head || null == head.next) {
            return head;
        }
        ListNode pre = null;
        ListNode p = head;
        ListNode q = head.next;
        head = q;
        while (null != p && null != q) {
            //p, q两结点交换顺序
            p.next = q.next;
            q.next = p;

            //移动p的前置结点
            if (null != pre) {
                pre.next = q;
            }
            pre = p;

            //将p, q两结点移至下一需要调换的结点处
            p = p.next;
            if (null == p) {
                break;
            }
            q = p.next;
        }
        return head;
    }
}
