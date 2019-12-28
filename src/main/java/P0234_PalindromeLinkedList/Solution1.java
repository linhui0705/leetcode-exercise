package P0234_PalindromeLinkedList;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Solution1
 * Description:
 * 判断链表是否为回文
 * 时间复杂度：O(n)
 * 空间复杂度：O(n)
 * 题目说尝试时间复杂度O(n)，空间复杂度O(n)。待优化……
 *
 * @author Lin Hui
 * Created on 2019-12-28 18:00
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();

        ListNode p = head;
        while (p != null) {
            list.add(p.val);
            p = p.next;
        }

        int i = 0;
        int j = list.size() - 1;
        while (i < j) {
            if (list.get(i++).intValue() != list.get(j--).intValue()) {
                return false;
            }
        }
        return true;
    }
}
