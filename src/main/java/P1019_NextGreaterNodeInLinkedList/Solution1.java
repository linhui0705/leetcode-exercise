package P1019_NextGreaterNodeInLinkedList;

import org.junit.Test;

/**
 * Title: Solution1
 * Description:
 * 求链表中下一个更大的结点
 * 暴力破解，时间复杂度O(n²)
 *
 * @author Lin Hui
 * Created on 2019-3-31 20:51
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public int[] nextLargerNodes(ListNode head) {
        int n = 0;
        ListNode p = head;
        while (p != null) {
            n++;
            p = p.next;
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            p = head;
            int target = p.val;
            boolean set = false;
            while (p.next != null) {
                p = p.next;
                if (target < p.val) {
                    ans[i] = p.val;
                    set = true;
                    break;
                }
            }
            if (!set) {
                ans[i] = 0;
            }
            head = head.next;
        }
        return ans;
    }
}
