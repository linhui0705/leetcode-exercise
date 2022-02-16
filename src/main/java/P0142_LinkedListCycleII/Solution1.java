package P0142_LinkedListCycleII;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Title: Solution1
 * Description:
 * 环形链表变形题。找到并返回链表开始入环的第一个节点，如果没有则返回null。
 * 用HashSet去重判断。但是牺牲了空间。
 *
 * @author Lin Hui
 * Created on 2022/2/16 10:55:39
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode p = head;
        while (null != p) {
            if (set.contains(p)) {
                return p;
            } else {
                set.add(p);
                p = p.next;
            }
        }
        return null;
    }
}
