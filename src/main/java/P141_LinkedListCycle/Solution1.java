package P141_LinkedListCycle;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Title: Solution1
 * Description:
 * 利用HashSet，记录对象Set入是否重复
 *
 * @author Lin Hui
 * Created on 2019/2/26 10:42
 */
public class Solution1 {
    @Test
    public void testCase() {

    }

    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode node = head;
        while (node != null) {
            if (!set.add(node)) {
                return true;
            }
            node = node.next;
        }
        return false;
    }
}
